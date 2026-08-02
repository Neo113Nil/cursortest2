package defpackage;

import com.google.gson.stream.JsonWriter;
import java.util.ArrayList;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class kha extends JsonWriter {
    public static final jha d = new jha();
    public static final rga e = new rga("closed");
    public final ArrayList a;
    public String b;
    public pfa c;

    public kha() {
        super(d);
        this.a = new ArrayList();
        this.c = gga.a;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginArray() {
        bfa bfaVar = new bfa();
        m(bfaVar);
        this.a.add(bfaVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter beginObject() {
        iga igaVar = new iga();
        m(igaVar);
        this.a.add(igaVar);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Closeable, java.lang.AutoCloseable
    public final void close() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            arrayList.add(e);
        } else {
            is8.e("Incomplete document");
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endArray() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || this.b != null) {
            zzl.s();
            return null;
        }
        if (k() instanceof bfa) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        zzl.s();
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter endObject() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty() || this.b != null) {
            zzl.s();
            return null;
        }
        if (k() instanceof iga) {
            arrayList.remove(arrayList.size() - 1);
            return this;
        }
        zzl.s();
        return null;
    }

    public final pfa h() {
        ArrayList arrayList = this.a;
        if (arrayList.isEmpty()) {
            return this.c;
        }
        yhk.r(arrayList, "Expected one JSON element but was ");
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter jsonValue(String str) {
        throw new UnsupportedOperationException();
    }

    public final pfa k() {
        return (pfa) mz1.h(this.a, 1);
    }

    public final void m(pfa pfaVar) {
        if (this.b != null) {
            if (!(pfaVar instanceof gga) || getSerializeNulls()) {
                iga igaVar = (iga) k();
                igaVar.a.put(this.b, pfaVar);
            }
            this.b = null;
            return;
        }
        if (this.a.isEmpty()) {
            this.c = pfaVar;
            return;
        }
        pfa k = k();
        if (k instanceof bfa) {
            ((bfa) k).a.add(pfaVar);
        } else {
            zzl.s();
        }
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter name(String str) {
        Objects.requireNonNull(str, "name == null");
        if (this.a.isEmpty() || this.b != null) {
            zzl.s();
            return null;
        }
        if (k() instanceof iga) {
            this.b = str;
            return this;
        }
        zzl.s();
        return null;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter nullValue() {
        m(gga.a);
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Number number) {
        if (number == null) {
            m(gga.a);
            return this;
        }
        if (!isLenient()) {
            double doubleValue = number.doubleValue();
            if (Double.isNaN(doubleValue) || Double.isInfinite(doubleValue)) {
                is8.c(number, "JSON forbids NaN and infinities: ");
                return null;
            }
        }
        m(new rga(number));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter, java.io.Flushable
    public final void flush() {
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(Boolean bool) {
        if (bool == null) {
            m(gga.a);
            return this;
        }
        m(new rga(bool));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(String str) {
        if (str == null) {
            m(gga.a);
            return this;
        }
        m(new rga(str));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(boolean z) {
        m(new rga(Boolean.valueOf(z)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(float f) {
        if (!isLenient() && (Float.isNaN(f) || Float.isInfinite(f))) {
            sw9.k("JSON forbids NaN and infinities: ", f);
            return null;
        }
        m(new rga(Float.valueOf(f)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(double d2) {
        if (!isLenient() && (Double.isNaN(d2) || Double.isInfinite(d2))) {
            is8.f("JSON forbids NaN and infinities: ", d2);
            return null;
        }
        m(new rga(Double.valueOf(d2)));
        return this;
    }

    @Override // com.google.gson.stream.JsonWriter
    public final JsonWriter value(long j) {
        m(new rga(Long.valueOf(j)));
        return this;
    }
}
