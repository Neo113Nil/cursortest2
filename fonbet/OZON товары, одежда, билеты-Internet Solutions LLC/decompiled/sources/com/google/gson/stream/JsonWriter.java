package com.google.gson.stream;

import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.gson.e;
import com.google.gson.q;
import java.io.Closeable;
import java.io.Flushable;
import java.io.IOException;
import java.io.Writer;
import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.Arrays;
import java.util.Objects;
import java.util.concurrent.atomic.AtomicInteger;
import java.util.concurrent.atomic.AtomicLong;
import java.util.regex.Pattern;
import ru.ozon.app.android.sellerproducts.sellerProducts.data.model.ProductContainerDTO;

/* loaded from: classes.dex */
public class JsonWriter implements Closeable, Flushable {
    private static final String[] HTML_SAFE_REPLACEMENT_CHARS;
    private String deferredName;
    private String formattedColon;
    private String formattedComma;
    private e formattingStyle;
    private boolean htmlSafe;
    private final Writer out;
    private boolean serializeNulls;
    private int[] stack = new int[32];
    private int stackSize = 0;
    private q strictness;
    private boolean usesEmptyNewlineAndIndent;
    private static final Pattern VALID_JSON_NUMBER_PATTERN = Pattern.compile("-?(?:0|[1-9][0-9]*)(?:\\.[0-9]+)?(?:[eE][-+]?[0-9]+)?");
    private static final String[] REPLACEMENT_CHARS = new String[UserVerificationMethods.USER_VERIFY_PATTERN];

    static {
        for (int i11 = 0; i11 <= 31; i11++) {
            REPLACEMENT_CHARS[i11] = String.format("\\u%04x", Integer.valueOf(i11));
        }
        String[] strArr = REPLACEMENT_CHARS;
        strArr[34] = "\\\"";
        strArr[92] = "\\\\";
        strArr[9] = "\\t";
        strArr[8] = "\\b";
        strArr[10] = "\\n";
        strArr[13] = "\\r";
        strArr[12] = "\\f";
        String[] strArr2 = (String[]) strArr.clone();
        HTML_SAFE_REPLACEMENT_CHARS = strArr2;
        strArr2[60] = "\\u003c";
        strArr2[62] = "\\u003e";
        strArr2[38] = "\\u0026";
        strArr2[61] = "\\u003d";
        strArr2[39] = "\\u0027";
    }

    public JsonWriter(Writer writer) {
        push(6);
        this.strictness = q.LEGACY_STRICT;
        this.serializeNulls = true;
        Objects.requireNonNull(writer, "out == null");
        this.out = writer;
        setFormattingStyle(e.f59798d);
    }

    private static boolean alwaysCreatesValidJsonNumber(Class<? extends Number> cls) {
        return cls == Integer.class || cls == Long.class || cls == Byte.class || cls == Short.class || cls == BigDecimal.class || cls == BigInteger.class || cls == AtomicInteger.class || cls == AtomicLong.class;
    }

    private void beforeName() throws IOException {
        int peek = peek();
        if (peek == 5) {
            this.out.write(this.formattedComma);
        } else if (peek != 3) {
            throw new IllegalStateException("Nesting problem.");
        }
        newline();
        replaceTop(4);
    }

    private void beforeValue() throws IOException {
        int peek = peek();
        if (peek == 1) {
            replaceTop(2);
            newline();
            return;
        }
        if (peek == 2) {
            this.out.append((CharSequence) this.formattedComma);
            newline();
        } else {
            if (peek == 4) {
                this.out.append((CharSequence) this.formattedColon);
                replaceTop(5);
                return;
            }
            if (peek != 6) {
                if (peek != 7) {
                    throw new IllegalStateException("Nesting problem.");
                }
                if (this.strictness != q.LENIENT) {
                    throw new IllegalStateException("JSON must have only one top-level value.");
                }
            }
            replaceTop(7);
        }
    }

    private JsonWriter closeScope(int i11, int i12, char c11) throws IOException {
        int peek = peek();
        if (peek != i12 && peek != i11) {
            throw new IllegalStateException("Nesting problem.");
        }
        if (this.deferredName != null) {
            throw new IllegalStateException("Dangling name: " + this.deferredName);
        }
        this.stackSize--;
        if (peek == i12) {
            newline();
        }
        this.out.write(c11);
        return this;
    }

    private void newline() throws IOException {
        if (this.usesEmptyNewlineAndIndent) {
            return;
        }
        this.out.write(this.formattingStyle.b());
        int i11 = this.stackSize;
        for (int i12 = 1; i12 < i11; i12++) {
            this.out.write(this.formattingStyle.a());
        }
    }

    private JsonWriter openScope(int i11, char c11) throws IOException {
        beforeValue();
        push(i11);
        this.out.write(c11);
        return this;
    }

    private int peek() {
        int i11 = this.stackSize;
        if (i11 != 0) {
            return this.stack[i11 - 1];
        }
        throw new IllegalStateException("JsonWriter is closed.");
    }

    private void push(int i11) {
        int i12 = this.stackSize;
        int[] iArr = this.stack;
        if (i12 == iArr.length) {
            this.stack = Arrays.copyOf(iArr, i12 * 2);
        }
        int[] iArr2 = this.stack;
        int i13 = this.stackSize;
        this.stackSize = i13 + 1;
        iArr2[i13] = i11;
    }

    private void replaceTop(int i11) {
        this.stack[this.stackSize - 1] = i11;
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0034  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private void string(String str) throws IOException {
        int i11;
        String str2;
        String[] strArr = this.htmlSafe ? HTML_SAFE_REPLACEMENT_CHARS : REPLACEMENT_CHARS;
        this.out.write(34);
        int length = str.length();
        int i12 = 0;
        while (i11 < length) {
            char charAt = str.charAt(i11);
            if (charAt < 128) {
                str2 = strArr[charAt];
                i11 = str2 == null ? i11 + 1 : 0;
                if (i12 < i11) {
                    this.out.write(str, i12, i11 - i12);
                }
                this.out.write(str2);
                i12 = i11 + 1;
            } else {
                if (charAt == 8232) {
                    str2 = "\\u2028";
                } else if (charAt == 8233) {
                    str2 = "\\u2029";
                }
                if (i12 < i11) {
                }
                this.out.write(str2);
                i12 = i11 + 1;
            }
        }
        if (i12 < length) {
            this.out.write(str, i12, length - i12);
        }
        this.out.write(34);
    }

    private void writeDeferredName() throws IOException {
        if (this.deferredName != null) {
            beforeName();
            string(this.deferredName);
            this.deferredName = null;
        }
    }

    public JsonWriter beginArray() throws IOException {
        writeDeferredName();
        return openScope(1, '[');
    }

    public JsonWriter beginObject() throws IOException {
        writeDeferredName();
        return openScope(3, '{');
    }

    @Override // java.io.Closeable, java.lang.AutoCloseable
    public void close() throws IOException {
        this.out.close();
        int i11 = this.stackSize;
        if (i11 > 1 || (i11 == 1 && this.stack[i11 - 1] != 7)) {
            throw new IOException("Incomplete document");
        }
        this.stackSize = 0;
    }

    public JsonWriter endArray() throws IOException {
        return closeScope(1, 2, ']');
    }

    public JsonWriter endObject() throws IOException {
        return closeScope(3, 5, '}');
    }

    public void flush() throws IOException {
        if (this.stackSize == 0) {
            throw new IllegalStateException("JsonWriter is closed.");
        }
        this.out.flush();
    }

    public final e getFormattingStyle() {
        return this.formattingStyle;
    }

    public final boolean getSerializeNulls() {
        return this.serializeNulls;
    }

    public final q getStrictness() {
        return this.strictness;
    }

    public final boolean isHtmlSafe() {
        return this.htmlSafe;
    }

    public boolean isLenient() {
        return this.strictness == q.LENIENT;
    }

    public JsonWriter jsonValue(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.append((CharSequence) str);
        return this;
    }

    public JsonWriter name(String str) throws IOException {
        Objects.requireNonNull(str, "name == null");
        if (this.deferredName != null) {
            throw new IllegalStateException("Already wrote a name, expecting a value.");
        }
        int peek = peek();
        if (peek != 3 && peek != 5) {
            throw new IllegalStateException("Please begin an object before writing a name.");
        }
        this.deferredName = str;
        return this;
    }

    public JsonWriter nullValue() throws IOException {
        if (this.deferredName != null) {
            if (!this.serializeNulls) {
                this.deferredName = null;
                return this;
            }
            writeDeferredName();
        }
        beforeValue();
        this.out.write("null");
        return this;
    }

    public final void setFormattingStyle(e eVar) {
        Objects.requireNonNull(eVar);
        this.formattingStyle = eVar;
        this.formattedComma = ",";
        if (eVar.c()) {
            this.formattedColon = ": ";
            if (this.formattingStyle.b().isEmpty()) {
                this.formattedComma = ", ";
            }
        } else {
            this.formattedColon = ProductContainerDTO.RATIO_DELIMITER;
        }
        this.usesEmptyNewlineAndIndent = this.formattingStyle.b().isEmpty() && this.formattingStyle.a().isEmpty();
    }

    public final void setHtmlSafe(boolean z11) {
        this.htmlSafe = z11;
    }

    public final void setIndent(String str) {
        if (str.isEmpty()) {
            setFormattingStyle(e.f59798d);
        } else {
            setFormattingStyle(e.f59799e.d(str));
        }
    }

    @Deprecated
    public final void setLenient(boolean z11) {
        setStrictness(z11 ? q.LENIENT : q.LEGACY_STRICT);
    }

    public final void setSerializeNulls(boolean z11) {
        this.serializeNulls = z11;
    }

    public final void setStrictness(q qVar) {
        Objects.requireNonNull(qVar);
        this.strictness = qVar;
    }

    public JsonWriter value(String str) throws IOException {
        if (str == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        string(str);
        return this;
    }

    public JsonWriter value(boolean z11) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(z11 ? "true" : "false");
        return this;
    }

    public JsonWriter value(Boolean bool) throws IOException {
        if (bool == null) {
            return nullValue();
        }
        writeDeferredName();
        beforeValue();
        this.out.write(bool.booleanValue() ? "true" : "false");
        return this;
    }

    public JsonWriter value(float f7) throws IOException {
        writeDeferredName();
        if (this.strictness != q.LENIENT && (Float.isNaN(f7) || Float.isInfinite(f7))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + f7);
        }
        beforeValue();
        this.out.append((CharSequence) Float.toString(f7));
        return this;
    }

    public JsonWriter value(double d11) throws IOException {
        writeDeferredName();
        if (this.strictness != q.LENIENT && (Double.isNaN(d11) || Double.isInfinite(d11))) {
            throw new IllegalArgumentException("Numeric values must be finite, but was " + d11);
        }
        beforeValue();
        this.out.append((CharSequence) Double.toString(d11));
        return this;
    }

    public JsonWriter value(long j11) throws IOException {
        writeDeferredName();
        beforeValue();
        this.out.write(Long.toString(j11));
        return this;
    }

    public JsonWriter value(Number number) throws IOException {
        if (number == null) {
            return nullValue();
        }
        writeDeferredName();
        String obj = number.toString();
        Class<?> cls = number.getClass();
        if (!alwaysCreatesValidJsonNumber(cls)) {
            if (!obj.equals("-Infinity") && !obj.equals("Infinity") && !obj.equals("NaN")) {
                if (cls != Float.class && cls != Double.class && !VALID_JSON_NUMBER_PATTERN.matcher(obj).matches()) {
                    throw new IllegalArgumentException("String created by " + cls + " is not a valid JSON number: " + obj);
                }
            } else if (this.strictness != q.LENIENT) {
                throw new IllegalArgumentException("Numeric values must be finite, but was ".concat(obj));
            }
        }
        beforeValue();
        this.out.append((CharSequence) obj);
        return this;
    }
}
