package cc;

import com.google.android.gms.internal.measurement.d5;
import com.google.android.gms.tasks.Task;
import com.google.firebase.messaging.k;
import io.sentry.android.core.w0;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Pattern;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import org.json.JSONException;
import org.json.JSONObject;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public boolean f3751a;

    public static i9.b d() {
        i9.b c2 = ((i9.i) h8.g.c().b(i9.i.class)).c();
        Intrinsics.checkNotNullExpressionValue(c2, "getInstance(...)");
        return c2;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(mf.c cVar) {
        c cVar2;
        int i5;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i10 = cVar2.f3731c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                cVar2.f3731c = i10 - Integer.MIN_VALUE;
                Object obj = cVar2.f3729a;
                lf.a aVar = lf.a.f20034a;
                i5 = cVar2.f3731c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    i9.b d10 = d();
                    j9.h hVar = d10.f11017f;
                    long j = hVar.f18322g.f18353a.getLong("minimum_fetch_interval_in_seconds", j9.h.f18315i);
                    HashMap hashMap = new HashMap(hVar.f18323h);
                    hashMap.put("X-Firebase-RC-Fetch-Type", "BASE/1");
                    Task l6 = hVar.f18320e.b().h(hVar.f18318c, new j9.f(hVar, j, hashMap)).l(p8.i.f21553a, new k(28)).l(d10.f11013b, new i9.a(d10));
                    Intrinsics.checkNotNullExpressionValue(l6, "fetchAndActivate(...)");
                    cVar2.f3731c = 1;
                    obj = m4.g.d(l6, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    h8.b.B(obj);
                }
                Intrinsics.checkNotNullExpressionValue(obj, "asDeferred(...)");
                return obj;
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f3729a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = cVar2.f3731c;
        if (i5 != 0) {
        }
        Intrinsics.checkNotNullExpressionValue(obj2, "asDeferred(...)");
        return obj2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:27:0x0096, code lost:
    
        if (r0.matcher(r9).matches() != false) goto L27;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0056  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(String str, mf.c cVar) {
        d dVar;
        int i5;
        String c2;
        String c8;
        if (cVar instanceof d) {
            dVar = (d) cVar;
            int i10 = dVar.f3735d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                dVar.f3735d = i10 - Integer.MIN_VALUE;
                Object obj = dVar.f3733b;
                Object obj2 = lf.a.f20034a;
                i5 = dVar.f3735d;
                boolean z5 = true;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (!this.f3751a) {
                        dVar.f3732a = str;
                        dVar.f3735d = 1;
                        if (g(dVar) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = dVar.f3732a;
                    h8.b.B(obj);
                }
                j9.i iVar = d().f11018g;
                Pattern pattern = j9.i.f18325f;
                Pattern pattern2 = j9.i.f18324e;
                j9.d dVar2 = iVar.f18328c;
                c2 = j9.i.c(dVar2, str);
                if (c2 != null) {
                    if (pattern2.matcher(c2).matches()) {
                        iVar.b(str, dVar2.c());
                        return Boolean.valueOf(z5);
                    }
                    if (pattern.matcher(c2).matches()) {
                        iVar.b(str, dVar2.c());
                        z5 = false;
                        return Boolean.valueOf(z5);
                    }
                }
                c8 = j9.i.c(iVar.f18329d, str);
                if (c8 != null) {
                    if (!pattern2.matcher(c8).matches()) {
                    }
                    return Boolean.valueOf(z5);
                }
                j9.i.d(str, "Boolean");
                z5 = false;
                return Boolean.valueOf(z5);
            }
        }
        dVar = new d(this, cVar);
        Object obj3 = dVar.f3733b;
        Object obj22 = lf.a.f20034a;
        i5 = dVar.f3735d;
        boolean z52 = true;
        if (i5 != 0) {
        }
        j9.i iVar2 = d().f11018g;
        Pattern pattern3 = j9.i.f18325f;
        Pattern pattern22 = j9.i.f18324e;
        j9.d dVar22 = iVar2.f18328c;
        c2 = j9.i.c(dVar22, str);
        if (c2 != null) {
        }
        c8 = j9.i.c(iVar2.f18329d, str);
        if (c8 != null) {
        }
        j9.i.d(str, "Boolean");
        z52 = false;
        return Boolean.valueOf(z52);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, mf.c cVar) {
        e eVar;
        int i5;
        j9.e c2;
        Double valueOf;
        double d10;
        if (cVar instanceof e) {
            eVar = (e) cVar;
            int i10 = eVar.f3739d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                eVar.f3739d = i10 - Integer.MIN_VALUE;
                Object obj = eVar.f3737b;
                Object obj2 = lf.a.f20034a;
                i5 = eVar.f3739d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (!this.f3751a) {
                        eVar.f3736a = str;
                        eVar.f3739d = 1;
                        if (g(eVar) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = eVar.f3736a;
                    h8.b.B(obj);
                }
                j9.i iVar = d().f11018g;
                j9.d dVar = iVar.f18328c;
                c2 = dVar.c();
                Double d11 = null;
                if (c2 != null) {
                    try {
                        valueOf = Double.valueOf(c2.f18303b.getDouble(str));
                    } catch (JSONException unused) {
                    }
                    if (valueOf != null) {
                        iVar.b(str, dVar.c());
                        d10 = valueOf.doubleValue();
                    } else {
                        j9.e c8 = iVar.f18329d.c();
                        if (c8 != null) {
                            try {
                                d11 = Double.valueOf(c8.f18303b.getDouble(str));
                            } catch (JSONException unused2) {
                            }
                        }
                        if (d11 != null) {
                            d10 = d11.doubleValue();
                        } else {
                            j9.i.d(str, "Double");
                            d10 = 0.0d;
                        }
                    }
                    return new Double(d10);
                }
                valueOf = null;
                if (valueOf != null) {
                }
                return new Double(d10);
            }
        }
        eVar = new e(this, cVar);
        Object obj3 = eVar.f3737b;
        Object obj22 = lf.a.f20034a;
        i5 = eVar.f3739d;
        if (i5 != 0) {
        }
        j9.i iVar2 = d().f11018g;
        j9.d dVar2 = iVar2.f18328c;
        c2 = dVar2.c();
        Double d112 = null;
        if (c2 != null) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return new Double(d10);
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0060  */
    /* JADX WARN: Removed duplicated region for block: B:18:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0054 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(String str, Continuation continuation) {
        f fVar;
        int i5;
        j9.e c2;
        Long valueOf;
        long j;
        if (continuation instanceof f) {
            fVar = (f) continuation;
            int i10 = fVar.f3743d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                fVar.f3743d = i10 - Integer.MIN_VALUE;
                Object obj = fVar.f3741b;
                Object obj2 = lf.a.f20034a;
                i5 = fVar.f3743d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (!this.f3751a) {
                        fVar.f3740a = str;
                        fVar.f3743d = 1;
                        if (g(fVar) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = fVar.f3740a;
                    h8.b.B(obj);
                }
                j9.i iVar = d().f11018g;
                j9.d dVar = iVar.f18328c;
                c2 = dVar.c();
                Long l6 = null;
                if (c2 != null) {
                    try {
                        valueOf = Long.valueOf(c2.f18303b.getLong(str));
                    } catch (JSONException unused) {
                    }
                    if (valueOf != null) {
                        iVar.b(str, dVar.c());
                        j = valueOf.longValue();
                    } else {
                        j9.e c8 = iVar.f18329d.c();
                        if (c8 != null) {
                            try {
                                l6 = Long.valueOf(c8.f18303b.getLong(str));
                            } catch (JSONException unused2) {
                            }
                        }
                        if (l6 != null) {
                            j = l6.longValue();
                        } else {
                            j9.i.d(str, "Long");
                            j = 0;
                        }
                    }
                    return new Long(j);
                }
                valueOf = null;
                if (valueOf != null) {
                }
                return new Long(j);
            }
        }
        fVar = new f(this, continuation);
        Object obj3 = fVar.f3741b;
        Object obj22 = lf.a.f20034a;
        i5 = fVar.f3743d;
        if (i5 != 0) {
        }
        j9.i iVar2 = d().f11018g;
        j9.d dVar2 = iVar2.f18328c;
        c2 = dVar2.c();
        Long l62 = null;
        if (c2 != null) {
        }
        valueOf = null;
        if (valueOf != null) {
        }
        return new Long(j);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(String str, mf.c cVar) {
        g gVar;
        int i5;
        String c2;
        if (cVar instanceof g) {
            gVar = (g) cVar;
            int i10 = gVar.f3747d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                gVar.f3747d = i10 - Integer.MIN_VALUE;
                Object obj = gVar.f3745b;
                Object obj2 = lf.a.f20034a;
                i5 = gVar.f3747d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    if (!this.f3751a) {
                        gVar.f3744a = str;
                        gVar.f3747d = 1;
                        if (g(gVar) == obj2) {
                            return obj2;
                        }
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    str = gVar.f3744a;
                    h8.b.B(obj);
                }
                j9.i iVar = d().f11018g;
                j9.d dVar = iVar.f18328c;
                c2 = j9.i.c(dVar, str);
                if (c2 == null) {
                    iVar.b(str, dVar.c());
                } else {
                    c2 = j9.i.c(iVar.f18329d, str);
                    if (c2 == null) {
                        j9.i.d(str, "String");
                        c2 = "";
                    }
                }
                Intrinsics.checkNotNullExpressionValue(c2, "getString(...)");
                return c2;
            }
        }
        gVar = new g(this, cVar);
        Object obj3 = gVar.f3745b;
        Object obj22 = lf.a.f20034a;
        i5 = gVar.f3747d;
        if (i5 != 0) {
        }
        j9.i iVar2 = d().f11018g;
        j9.d dVar2 = iVar2.f18328c;
        c2 = j9.i.c(dVar2, str);
        if (c2 == null) {
        }
        Intrinsics.checkNotNullExpressionValue(c2, "getString(...)");
        return c2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x00f4, code lost:
    
        if (m4.g.d(r11, r0) != r1) goto L33;
     */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x00f6, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bf, code lost:
    
        if (m4.g.d(r11, r0) == r1) goto L32;
     */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0038  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /* JADX WARN: Type inference failed for: r2v1, types: [java.lang.Object, java.util.Map] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(mf.c cVar) {
        h hVar;
        int i5;
        Task q;
        if (cVar instanceof h) {
            hVar = (h) cVar;
            int i10 = hVar.f3750c;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                hVar.f3750c = i10 - Integer.MIN_VALUE;
                Object obj = hVar.f3748a;
                lf.a aVar = lf.a.f20034a;
                i5 = hVar.f3750c;
                if (i5 != 0) {
                    h8.b.B(obj);
                    i9.b d10 = d();
                    ?? r22 = za.g.f25900a;
                    d10.getClass();
                    HashMap hashMap = new HashMap();
                    for (Map.Entry entry : r22.entrySet()) {
                        Object value = entry.getValue();
                        if (value instanceof byte[]) {
                            hashMap.put((String) entry.getKey(), new String((byte[]) value));
                        } else {
                            hashMap.put((String) entry.getKey(), value.toString());
                        }
                    }
                    try {
                        io.sentry.instrumentation.file.b c2 = j9.e.c();
                        c2.f16495b = new JSONObject(hashMap);
                        q = d10.f11016e.e(c2.a()).l(p8.i.f21553a, new k(27));
                    } catch (JSONException e7) {
                        w0.e("FirebaseRemoteConfig", "The provided defaults map could not be processed.", e7);
                        q = d5.q(null);
                    }
                    Intrinsics.checkNotNullExpressionValue(q, "setDefaultsAsync(...)");
                    hVar.f3750c = 1;
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        h8.b.B(obj);
                        this.f3751a = true;
                        return Unit.f19194a;
                    }
                    h8.b.B(obj);
                }
                i9.b d11 = d();
                Task b10 = d11.f11014c.b();
                Task b11 = d11.f11015d.b();
                Task h10 = d5.X(b10, b11).h(d11.f11013b, new androidx.transition.i(d11, b10, b11, 3));
                Intrinsics.checkNotNullExpressionValue(h10, "activate(...)");
                hVar.f3750c = 2;
            }
        }
        hVar = new h(this, cVar);
        Object obj2 = hVar.f3748a;
        lf.a aVar2 = lf.a.f20034a;
        i5 = hVar.f3750c;
        if (i5 != 0) {
        }
        i9.b d112 = d();
        Task b102 = d112.f11014c.b();
        Task b112 = d112.f11015d.b();
        Task h102 = d5.X(b102, b112).h(d112.f11013b, new androidx.transition.i(d112, b102, b112, 3));
        Intrinsics.checkNotNullExpressionValue(h102, "activate(...)");
        hVar.f3750c = 2;
    }
}
