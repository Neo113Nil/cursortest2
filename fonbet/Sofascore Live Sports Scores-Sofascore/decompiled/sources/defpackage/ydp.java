package defpackage;

import java.util.concurrent.ConcurrentHashMap;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class ydp implements nap {
    public static final wdp d = new wdp();
    public static final wdp e = new wdp();
    public final /* synthetic */ int a;
    public final Object b;
    public final Object c;

    public ydp(gvo gvoVar) {
        this.a = 0;
        this.b = gvoVar;
        this.c = new ConcurrentHashMap();
    }

    @Override // defpackage.nap
    public final map a(h9p h9pVar, z6n z6nVar) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                oap oapVar = (oap) z6nVar.a.getAnnotation(oap.class);
                if (oapVar == null) {
                    return null;
                }
                return b((gvo) obj, h9pVar, z6nVar, oapVar, true);
            default:
                if (z6nVar.equals((z6n) obj)) {
                    return (map) this.c;
                }
                return null;
        }
    }

    public map b(gvo gvoVar, h9p h9pVar, z6n z6nVar, oap oapVar, boolean z) {
        map mapVar;
        Object zza = gvoVar.e(new z6n(oapVar.zza()), true).zza();
        boolean z2 = zza instanceof map;
        boolean zzb = oapVar.zzb();
        if (z2) {
            mapVar = (map) zza;
        } else if (zza instanceof nap) {
            nap napVar = (nap) zza;
            if (z) {
                nap napVar2 = (nap) ((ConcurrentHashMap) this.c).putIfAbsent(z6nVar.a, napVar);
                if (napVar2 != null) {
                    napVar = napVar2;
                }
            }
            mapVar = napVar.a(h9pVar, z6nVar);
        } else {
            if (!(zza instanceof p7o)) {
                String name = zza.getClass().getName();
                String P = ktm.P(z6nVar.b);
                StringBuilder sb = new StringBuilder(String.valueOf(P).length() + name.length() + 62 + 99);
                bf3.v(sb, "Invalid attempt to bind an instance of ", name, " as a @JsonAdapter for ", P);
                vp2.f(sb, ". @JsonAdapter value must be a TypeAdapter, TypeAdapterFactory, JsonSerializer or JsonDeserializer.");
                return null;
            }
            hfp hfpVar = new hfp((p7o) zza, h9pVar, z6nVar, z ? d : e, zzb);
            zzb = false;
            mapVar = hfpVar;
        }
        return (mapVar == null || !zzb) ? mapVar : mapVar.nullSafe();
    }

    public ydp(z6n z6nVar, map mapVar) {
        this.a = 1;
        this.b = z6nVar;
        this.c = mapVar;
    }
}
