package defpackage;

import com.google.gson.Gson;
import com.google.gson.stream.JsonReader;
import com.google.gson.stream.JsonWriter;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class me6 extends u4k {
    public u4k a;
    public final /* synthetic */ boolean b;
    public final /* synthetic */ boolean c;
    public final /* synthetic */ Gson d;
    public final /* synthetic */ u5k e;
    public final /* synthetic */ ne6 f;

    public me6(ne6 ne6Var, boolean z, boolean z2, Gson gson, u5k u5kVar) {
        this.f = ne6Var;
        this.b = z;
        this.c = z2;
        this.d = gson;
        this.e = u5kVar;
    }

    @Override // defpackage.u4k
    public final Object a(JsonReader jsonReader) {
        if (this.b) {
            jsonReader.skipValue();
            return null;
        }
        u4k u4kVar = this.a;
        if (u4kVar == null) {
            u4kVar = this.d.getDelegateAdapter(this.f, this.e);
            this.a = u4kVar;
        }
        return u4kVar.a(jsonReader);
    }

    @Override // defpackage.u4k
    public final void b(JsonWriter jsonWriter, Object obj) {
        if (this.c) {
            jsonWriter.nullValue();
            return;
        }
        u4k u4kVar = this.a;
        if (u4kVar == null) {
            u4kVar = this.d.getDelegateAdapter(this.f, this.e);
            this.a = u4kVar;
        }
        u4kVar.b(jsonWriter, obj);
    }
}
