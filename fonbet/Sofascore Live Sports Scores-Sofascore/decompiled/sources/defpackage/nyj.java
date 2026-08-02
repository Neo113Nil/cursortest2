package defpackage;

import com.blaze.blazesdk.utils.parsing.EnumWithValue;
import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;
import java.lang.reflect.Type;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class nyj extends u5h {
    public final ppl a;
    public final Gson b;
    public final u5k c;
    public final v4k d;
    public final boolean e;
    public volatile u4k f;

    public nyj(ppl pplVar, Gson gson, u5k u5kVar, myj myjVar, boolean z) {
        this.a = pplVar;
        this.b = gson;
        this.c = u5kVar;
        this.d = myjVar;
        this.e = z;
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        u4k u4kVar = this.f;
        if (u4kVar == null) {
            u4kVar = this.b.getDelegateAdapter(this.d, this.c);
            this.f = u4kVar;
        }
        return u4kVar.a(jsonReader);
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        if (this.a == null) {
            u4k u4kVar = this.f;
            if (u4kVar == null) {
                u4kVar = this.b.getDelegateAdapter(this.d, this.c);
                this.f = u4kVar;
            }
            u4kVar.b(jsonWriter, obj);
            return;
        }
        if (this.e && obj == null) {
            jsonWriter.nullValue();
            return;
        }
        Type type = this.c.b;
        EnumWithValue enumWithValue = (EnumWithValue) obj;
        pfa rgaVar = enumWithValue != null ? new rga(enumWithValue.getValue()) : gga.a;
        x4k x4kVar = b5k.a;
        o49.e(rgaVar, jsonWriter);
    }

    @Override // defpackage.u5h
    public final u4k c() {
        if (this.a != null) {
            return this;
        }
        u4k u4kVar = this.f;
        if (u4kVar != null) {
            return u4kVar;
        }
        u4k delegateAdapter = this.b.getDelegateAdapter(this.d, this.c);
        this.f = delegateAdapter;
        return delegateAdapter;
    }
}
