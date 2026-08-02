package defpackage;

import com.blaze.blazesdk.shared.results.j;
import defpackage.i4m;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class drm {
    public final fdi a;
    public dim b;
    public n2m c;
    public s2m d;
    public o2m e;
    public o2m f;

    public drm(boolean z) {
        this.a = gdi.a(z ? vom.a : ulm.a);
    }

    public static /* synthetic */ bqm onEvent$default(drm drmVar, i4m i4mVar, boolean z, int i, Object obj) {
        if ((i & 2) != 0) {
            z = false;
        }
        return drmVar.a(i4mVar, z);
    }

    public static void reset$default(drm drmVar, boolean z, int i, Object obj) {
        Object value;
        if ((i & 1) != 0) {
            bqm bqmVar = (bqm) drmVar.a.getValue();
            bqmVar.getClass();
            z = !(bqmVar instanceof ulm);
        }
        drmVar.b = null;
        fdi fdiVar = drmVar.a;
        do {
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, z ? vom.a : ulm.a));
    }

    public final bqm a(i4m i4mVar, boolean z) {
        Object value;
        bqm bqmVar;
        bqm bqmVar2;
        o2m o2mVar;
        i4mVar.getClass();
        fdi fdiVar = this.a;
        fdiVar.getValue();
        fdiVar.getValue();
        do {
            value = fdiVar.getValue();
            bqmVar = (bqm) value;
            if (i4mVar instanceof i4m.a) {
                if (((i4m.a) i4mVar).a) {
                    if (bqmVar instanceof ulm) {
                        bqmVar2 = vom.a;
                    }
                    bqmVar2 = bqmVar;
                } else {
                    bqmVar2 = ulm.a;
                }
            } else if (i4mVar instanceof rcm) {
                if (bqmVar instanceof vom) {
                    bqmVar2 = inm.a;
                }
                bqmVar2 = bqmVar;
            } else if (!(i4mVar instanceof bgm)) {
                if (i4mVar instanceof i4m.b) {
                    if (bqmVar instanceof vjm) {
                        bqmVar2 = vom.a;
                    } else if (bqmVar instanceof inm) {
                        bqmVar2 = vom.a;
                    }
                } else if (!(i4mVar instanceof dam) && !(i4mVar instanceof l7m)) {
                    zzl.b();
                    return null;
                }
                bqmVar2 = bqmVar;
            } else if (bqmVar instanceof inm) {
                bqmVar2 = vjm.a;
            } else {
                if (bqmVar instanceof vom) {
                    bqmVar2 = vjm.a;
                }
                bqmVar2 = bqmVar;
            }
        } while (!fdiVar.k(value, bqmVar2));
        if (Intrinsics.c(bqmVar2, bqmVar)) {
            if (bqmVar instanceof vjm) {
                if (i4mVar instanceof dam) {
                    o2m o2mVar2 = this.e;
                    if (o2mVar2 != null) {
                        o2mVar2.invoke();
                        return bqmVar2;
                    }
                } else if ((i4mVar instanceof l7m) && (o2mVar = this.f) != null) {
                    o2mVar.invoke();
                }
            }
        } else if (bqmVar2 instanceof inm) {
            n2m n2mVar = this.c;
            if (n2mVar != null) {
                n2mVar.invoke(Boolean.valueOf(z));
                return bqmVar2;
            }
        } else if ((bqmVar instanceof vjm) && (bqmVar2 instanceof vom) && (i4mVar instanceof i4m.b)) {
            s2m s2mVar = this.d;
            if (s2mVar != null) {
                s2mVar.invoke(Integer.valueOf(((i4m.b) i4mVar).a), Boolean.valueOf(z));
                return bqmVar2;
            }
        } else if ((bqmVar instanceof inm) && (bqmVar2 instanceof vom) && (i4mVar instanceof i4m.b)) {
            i4m.b bVar = (i4m.b) i4mVar;
            String str = bVar.b;
            if (str == null) {
                str = "Unknown reason";
            }
            j jVar = new j();
            jVar.g = i9a.p("failureReason", str);
            jVar.b("Failed to enter PIP mode: ".concat(str));
            j1m.a(jVar);
            s2m s2mVar2 = this.d;
            if (s2mVar2 != null) {
                s2mVar2.invoke(Integer.valueOf(bVar.a), Boolean.valueOf(z));
                return bqmVar2;
            }
        }
        return bqmVar2;
    }

    public drm() {
        this(false, 1, null);
    }

    public /* synthetic */ drm(boolean z, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? false : z);
    }
}
