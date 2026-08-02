package defpackage;

import com.google.gson.Gson;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class afa implements v4k {
    public final ln3 a;

    public afa(ln3 ln3Var) {
        this.a = ln3Var;
    }

    public static u4k b(ln3 ln3Var, Gson gson, u5k u5kVar, zea zeaVar) {
        u4k u4kVar;
        Object n = ln3Var.b(new u5k(zeaVar.value())).n();
        boolean nullSafe = zeaVar.nullSafe();
        if (n instanceof u4k) {
            u4kVar = (u4k) n;
        } else if (n instanceof v4k) {
            u4kVar = ((v4k) n).a(gson, u5kVar);
        } else {
            boolean z = n instanceof ppl;
            if (!z) {
                vp2.d("Invalid attempt to bind an instance of ", n.getClass().getName(), " as a @JsonAdapter for ", k53.A0(u5kVar.b), ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                return null;
            }
            nyj nyjVar = new nyj(z ? (ppl) n : null, gson, u5kVar, null, nullSafe);
            nullSafe = false;
            u4kVar = nyjVar;
        }
        return (u4kVar == null || !nullSafe) ? u4kVar : new k0i(u4kVar, 3);
    }

    @Override // defpackage.v4k
    public final u4k a(Gson gson, u5k u5kVar) {
        zea zeaVar = (zea) u5kVar.a.getAnnotation(zea.class);
        if (zeaVar == null) {
            return null;
        }
        return b(this.a, gson, u5kVar, zeaVar);
    }
}
