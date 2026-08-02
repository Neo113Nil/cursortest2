package defpackage;

import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonToken;
import com.google.gson.stream.MalformedJsonException;
import java.io.Serializable;
import java.util.Arrays;
import java.util.Iterator;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class iha extends JsonReader {
    public static final eha e = new eha();
    public static final Object f = new Object();
    public Object[] a;
    public int b;
    public String[] c;
    public int[] d;

    @Override // com.google.gson.stream.JsonReader
    public final void beginArray() {
        e(JsonToken.BEGIN_ARRAY);
        n(((bfa) k()).a.iterator());
        this.d[this.b - 1] = 0;
    }

    @Override // com.google.gson.stream.JsonReader
    public final void beginObject() {
        e(JsonToken.BEGIN_OBJECT);
        n(((kbb) ((iga) k()).a.entrySet()).iterator());
    }

    @Override // com.google.gson.stream.JsonReader, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        this.a = new Object[]{f};
        this.b = 1;
    }

    public final void e(JsonToken jsonToken) {
        if (peek() == jsonToken) {
            return;
        }
        StringBuilder sb = new StringBuilder("Expected ");
        sb.append(jsonToken);
        sb.append(" but was ");
        sb.append(peek());
        zzl.m(sb, h());
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endArray() {
        e(JsonToken.END_ARRAY);
        m();
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final void endObject() {
        e(JsonToken.END_OBJECT);
        this.c[this.b - 1] = null;
        m();
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    public final String getPath(boolean z) {
        StringBuilder sb = new StringBuilder("$");
        int i = 0;
        while (true) {
            int i2 = this.b;
            if (i >= i2) {
                return sb.toString();
            }
            Object[] objArr = this.a;
            Object obj = objArr[i];
            if (obj instanceof bfa) {
                i++;
                if (i < i2 && (objArr[i] instanceof Iterator)) {
                    int i3 = this.d[i];
                    if (z && i3 > 0 && (i == i2 - 1 || i == i2 - 2)) {
                        i3--;
                    }
                    sb.append('[');
                    sb.append(i3);
                    sb.append(']');
                }
            } else if ((obj instanceof iga) && (i = i + 1) < i2 && (objArr[i] instanceof Iterator)) {
                sb.append('.');
                String str = this.c[i];
                if (str != null) {
                    sb.append(str);
                }
            }
            i++;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPreviousPath() {
        return getPath(true);
    }

    public final String h() {
        return " at path ".concat(getPath(false));
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean hasNext() {
        JsonToken peek = peek();
        return (peek == JsonToken.END_OBJECT || peek == JsonToken.END_ARRAY || peek == JsonToken.END_DOCUMENT) ? false : true;
    }

    public final String i(boolean z) {
        e(JsonToken.NAME);
        Map.Entry entry = (Map.Entry) ((Iterator) k()).next();
        String str = (String) entry.getKey();
        this.c[this.b - 1] = z ? "<skipped>" : str;
        n(entry.getValue());
        return str;
    }

    public final Object k() {
        return this.a[this.b - 1];
    }

    public final Object m() {
        Object[] objArr = this.a;
        int i = this.b - 1;
        this.b = i;
        Object obj = objArr[i];
        objArr[i] = null;
        return obj;
    }

    public final void n(Object obj) {
        int i = this.b;
        Object[] objArr = this.a;
        if (i == objArr.length) {
            int i2 = i * 2;
            this.a = Arrays.copyOf(objArr, i2);
            this.d = Arrays.copyOf(this.d, i2);
            this.c = (String[]) Arrays.copyOf(this.c, i2);
        }
        Object[] objArr2 = this.a;
        int i3 = this.b;
        this.b = i3 + 1;
        objArr2[i3] = obj;
    }

    @Override // com.google.gson.stream.JsonReader
    public final boolean nextBoolean() {
        e(JsonToken.BOOLEAN);
        boolean c = ((rga) m()).c();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return c;
    }

    @Override // com.google.gson.stream.JsonReader
    public final double nextDouble() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(peek);
            zzl.m(sb, h());
            return 0.0d;
        }
        rga rgaVar = (rga) k();
        double doubleValue = rgaVar.a instanceof Number ? rgaVar.d().doubleValue() : Double.parseDouble(rgaVar.e());
        if (!isLenient() && (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue))) {
            throw new MalformedJsonException("JSON forbids NaN and infinities: " + doubleValue);
        }
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return doubleValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final int nextInt() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(peek);
            zzl.m(sb, h());
            return 0;
        }
        rga rgaVar = (rga) k();
        int intValue = rgaVar.a instanceof Number ? rgaVar.d().intValue() : Integer.parseInt(rgaVar.e());
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return intValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final long nextLong() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.NUMBER;
        if (peek != jsonToken && peek != JsonToken.STRING) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(peek);
            zzl.m(sb, h());
            return 0L;
        }
        rga rgaVar = (rga) k();
        long longValue = rgaVar.a instanceof Number ? rgaVar.d().longValue() : Long.parseLong(rgaVar.e());
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return longValue;
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextName() {
        return i(false);
    }

    @Override // com.google.gson.stream.JsonReader
    public final void nextNull() {
        e(JsonToken.NULL);
        m();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String nextString() {
        JsonToken peek = peek();
        JsonToken jsonToken = JsonToken.STRING;
        if (peek != jsonToken && peek != JsonToken.NUMBER) {
            StringBuilder sb = new StringBuilder("Expected ");
            sb.append(jsonToken);
            sb.append(" but was ");
            sb.append(peek);
            zzl.m(sb, h());
            return null;
        }
        String e2 = ((rga) m()).e();
        int i = this.b;
        if (i > 0) {
            int[] iArr = this.d;
            int i2 = i - 1;
            iArr[i2] = iArr[i2] + 1;
        }
        return e2;
    }

    @Override // com.google.gson.stream.JsonReader
    public final JsonToken peek() {
        if (this.b == 0) {
            return JsonToken.END_DOCUMENT;
        }
        Object k = k();
        if (k instanceof Iterator) {
            boolean z = this.a[this.b - 2] instanceof iga;
            Iterator it = (Iterator) k;
            if (!it.hasNext()) {
                return z ? JsonToken.END_OBJECT : JsonToken.END_ARRAY;
            }
            if (z) {
                return JsonToken.NAME;
            }
            n(it.next());
            return peek();
        }
        if (k instanceof iga) {
            return JsonToken.BEGIN_OBJECT;
        }
        if (k instanceof bfa) {
            return JsonToken.BEGIN_ARRAY;
        }
        if (k instanceof rga) {
            Serializable serializable = ((rga) k).a;
            if (serializable instanceof String) {
                return JsonToken.STRING;
            }
            if (serializable instanceof Boolean) {
                return JsonToken.BOOLEAN;
            }
            if (serializable instanceof Number) {
                return JsonToken.NUMBER;
            }
            ogj.b();
            return null;
        }
        if (k instanceof gga) {
            return JsonToken.NULL;
        }
        if (k == f) {
            a70.r("JsonReader is closed");
            return null;
        }
        throw new MalformedJsonException("Custom JsonElement subclass " + k.getClass().getName() + " is not supported");
    }

    @Override // com.google.gson.stream.JsonReader
    public final void skipValue() {
        int i = fha.a[peek().ordinal()];
        if (i == 1) {
            i(true);
            return;
        }
        if (i == 2) {
            endArray();
            return;
        }
        if (i == 3) {
            endObject();
            return;
        }
        if (i != 4) {
            m();
            int i2 = this.b;
            if (i2 > 0) {
                int[] iArr = this.d;
                int i3 = i2 - 1;
                iArr[i3] = iArr[i3] + 1;
            }
        }
    }

    @Override // com.google.gson.stream.JsonReader
    public final String toString() {
        return iha.class.getSimpleName().concat(h());
    }

    @Override // com.google.gson.stream.JsonReader
    public final String getPath() {
        return getPath(false);
    }
}
