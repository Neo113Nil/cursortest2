package k2;

import eg.h1;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class o0 {

    /* renamed from: l, reason: collision with root package name */
    public static final String[] f18736l = {"INSERT", "UPDATE", "DELETE"};

    /* renamed from: a, reason: collision with root package name */
    public final w f18737a;

    /* renamed from: b, reason: collision with root package name */
    public final LinkedHashMap f18738b;

    /* renamed from: c, reason: collision with root package name */
    public final LinkedHashMap f18739c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f18740d;

    /* renamed from: e, reason: collision with root package name */
    public final h1 f18741e;

    /* renamed from: f, reason: collision with root package name */
    public final LinkedHashMap f18742f;

    /* renamed from: g, reason: collision with root package name */
    public final String[] f18743g;

    /* renamed from: h, reason: collision with root package name */
    public final m f18744h;

    /* renamed from: i, reason: collision with root package name */
    public final c1.j0 f18745i;
    public final AtomicBoolean j;

    /* renamed from: k, reason: collision with root package name */
    public Function0 f18746k;

    public o0(w database, LinkedHashMap shadowTablesMap, LinkedHashMap viewTables, String[] tableNames, boolean z5, h1 onInvalidatedTablesIds) {
        String str;
        Intrinsics.checkNotNullParameter(database, "database");
        Intrinsics.checkNotNullParameter(shadowTablesMap, "shadowTablesMap");
        Intrinsics.checkNotNullParameter(viewTables, "viewTables");
        Intrinsics.checkNotNullParameter(tableNames, "tableNames");
        Intrinsics.checkNotNullParameter(onInvalidatedTablesIds, "onInvalidatedTablesIds");
        this.f18737a = database;
        this.f18738b = shadowTablesMap;
        this.f18739c = viewTables;
        this.f18740d = z5;
        this.f18741e = onInvalidatedTablesIds;
        this.j = new AtomicBoolean(false);
        this.f18746k = new id.a(4);
        this.f18742f = new LinkedHashMap();
        int length = tableNames.length;
        String[] strArr = new String[length];
        for (int i5 = 0; i5 < length; i5++) {
            String str2 = tableNames[i5];
            Locale locale = Locale.ROOT;
            String lowerCase = str2.toLowerCase(locale);
            Intrinsics.checkNotNullExpressionValue(lowerCase, "toLowerCase(...)");
            this.f18742f.put(lowerCase, Integer.valueOf(i5));
            String str3 = (String) this.f18738b.get(tableNames[i5]);
            if (str3 != null) {
                str = str3.toLowerCase(locale);
                Intrinsics.checkNotNullExpressionValue(str, "toLowerCase(...)");
            } else {
                str = null;
            }
            if (str != null) {
                lowerCase = str;
            }
            strArr[i5] = lowerCase;
        }
        this.f18743g = strArr;
        for (Map.Entry entry : this.f18738b.entrySet()) {
            String str4 = (String) entry.getValue();
            Locale locale2 = Locale.ROOT;
            String lowerCase2 = str4.toLowerCase(locale2);
            Intrinsics.checkNotNullExpressionValue(lowerCase2, "toLowerCase(...)");
            if (this.f18742f.containsKey(lowerCase2)) {
                String lowerCase3 = ((String) entry.getKey()).toLowerCase(locale2);
                Intrinsics.checkNotNullExpressionValue(lowerCase3, "toLowerCase(...)");
                LinkedHashMap linkedHashMap = this.f18742f;
                linkedHashMap.put(lowerCase3, kotlin.collections.n0.d(linkedHashMap, lowerCase2));
            }
        }
        this.f18744h = new m(this.f18743g.length);
        this.f18745i = new c1.j0(this.f18743g.length);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x0051, code lost:
    
        if (r4 == r6) goto L24;
     */
    /* JADX WARN: Removed duplicated region for block: B:18:0x005c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object a(o0 o0Var, p pVar, mf.c cVar) {
        e0 e0Var;
        int i5;
        Set set;
        if (cVar instanceof e0) {
            e0Var = (e0) cVar;
            int i10 = e0Var.f18658d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                e0Var.f18658d = i10 - Integer.MIN_VALUE;
                Object obj = e0Var.f18656b;
                lf.a aVar = lf.a.f20034a;
                i5 = e0Var.f18658d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    d0 d0Var = new d0(1);
                    e0Var.f18655a = pVar;
                    e0Var.f18658d = 1;
                    obj = pVar.c("SELECT * FROM room_table_modification_log WHERE invalidated = 1", d0Var, e0Var);
                } else {
                    if (i5 != 1) {
                        if (i5 != 2) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        Set set2 = (Set) e0Var.f18655a;
                        h8.b.B(obj);
                        return set2;
                    }
                    pVar = (p) e0Var.f18655a;
                    h8.b.B(obj);
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    e0Var.f18655a = set;
                    e0Var.f18658d = 2;
                    if (x.m(pVar, "UPDATE room_table_modification_log SET invalidated = 0 WHERE invalidated = 1", e0Var) == aVar) {
                        return aVar;
                    }
                }
                return set;
            }
        }
        e0Var = new e0(o0Var, cVar);
        Object obj2 = e0Var.f18656b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = e0Var.f18658d;
        if (i5 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        return set;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0083 A[Catch: all -> 0x002b, TRY_LEAVE, TryCatch #0 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x007b, B:14:0x0083), top: B:10:0x0027 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object b(o0 o0Var, mf.c cVar) {
        i0 i0Var;
        int i5;
        x5.h hVar;
        Set set;
        w wVar = o0Var.f18737a;
        if (cVar instanceof i0) {
            i0Var = (i0) cVar;
            int i10 = i0Var.f18686d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                i0Var.f18686d = i10 - Integer.MIN_VALUE;
                Object obj = i0Var.f18684b;
                lf.a aVar = lf.a.f20034a;
                i5 = i0Var.f18686d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    x5.h hVar2 = wVar.f18785g;
                    if (!hVar2.c()) {
                        return kotlin.collections.g0.f19206a;
                    }
                    try {
                        if (!o0Var.j.compareAndSet(true, false)) {
                            kotlin.collections.g0 g0Var = kotlin.collections.g0.f19206a;
                            hVar2.l();
                            return g0Var;
                        }
                        if (!((Boolean) o0Var.f18746k.invoke()).booleanValue()) {
                            kotlin.collections.g0 g0Var2 = kotlin.collections.g0.f19206a;
                            hVar2.l();
                            return g0Var2;
                        }
                        j0 j0Var = new j0(o0Var, null, 1);
                        i0Var.f18683a = hVar2;
                        i0Var.f18686d = 1;
                        Object s8 = wVar.s(false, j0Var, i0Var);
                        if (s8 == aVar) {
                            return aVar;
                        }
                        hVar = hVar2;
                        obj = s8;
                    } catch (Throwable th2) {
                        th = th2;
                        hVar = hVar2;
                        hVar.l();
                        throw th;
                    }
                } else {
                    if (i5 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    hVar = i0Var.f18683a;
                    try {
                        h8.b.B(obj);
                    } catch (Throwable th3) {
                        th = th3;
                        hVar.l();
                        throw th;
                    }
                }
                set = (Set) obj;
                if (!set.isEmpty()) {
                    o0Var.f18745i.c(set);
                    o0Var.f18741e.invoke(set);
                }
                hVar.l();
                return set;
            }
        }
        i0Var = new i0(o0Var, cVar);
        Object obj2 = i0Var.f18684b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = i0Var.f18686d;
        if (i5 != 0) {
        }
        set = (Set) obj2;
        if (!set.isEmpty()) {
        }
        hVar.l();
        return set;
    }

    /* JADX WARN: Code restructure failed: missing block: B:17:0x00d9, code lost:
    
        if (k2.x.m(r11, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Code restructure failed: missing block: B:18:0x00db, code lost:
    
        return r5;
     */
    /* JADX WARN: Code restructure failed: missing block: B:28:0x0079, code lost:
    
        if (k2.x.m(r1, r3, r4) == r5) goto L27;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:13:0x008d  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0059  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /* JADX WARN: Type inference failed for: r2v6, types: [k2.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:17:0x00d9 -> B:11:0x00dc). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object c(o0 o0Var, c0 c0Var, int i5, mf.c cVar) {
        k0 k0Var;
        int i10;
        int i11;
        int i12;
        String[] strArr;
        p pVar;
        int i13;
        String str;
        c0 c0Var2 = c0Var;
        int i14 = i5;
        o0Var.getClass();
        if (cVar instanceof k0) {
            k0Var = (k0) cVar;
            int i15 = k0Var.f18701i;
            if ((i15 & Integer.MIN_VALUE) != 0) {
                k0Var.f18701i = i15 - Integer.MIN_VALUE;
                Object obj = k0Var.f18699g;
                lf.a aVar = lf.a.f20034a;
                i10 = k0Var.f18701i;
                boolean z5 = true;
                if (i10 != 0) {
                    h8.b.B(obj);
                    String str2 = "INSERT OR IGNORE INTO room_table_modification_log VALUES(" + i14 + ", 0)";
                    k0Var.f18693a = c0Var2;
                    k0Var.f18696d = i14;
                    k0Var.f18701i = 1;
                } else if (i10 == 1) {
                    int i16 = k0Var.f18696d;
                    ?? r22 = k0Var.f18693a;
                    h8.b.B(obj);
                    i14 = i16;
                    c0Var2 = r22;
                } else {
                    if (i10 != 2) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i13 = k0Var.f18698f;
                    i12 = k0Var.f18697e;
                    i11 = k0Var.f18696d;
                    strArr = k0Var.f18695c;
                    str = k0Var.f18694b;
                    pVar = k0Var.f18693a;
                    h8.b.B(obj);
                    boolean z7 = true;
                    i12++;
                    z5 = z7;
                    if (i12 >= i13) {
                        return Unit.f19194a;
                    }
                    String str3 = strArr[i12];
                    z7 = z5;
                    StringBuilder q = r4.k.q("CREATE ", o0Var.f18740d ? "TEMP" : "", " TRIGGER IF NOT EXISTS `", "room_table_modification_trigger_" + str + '_' + str3, "` AFTER ");
                    r4.k.s(q, str3, " ON `", str, "` BEGIN UPDATE room_table_modification_log SET invalidated = 1 WHERE table_id = ");
                    String n9 = r4.k.n(q, i11, " AND invalidated = 0; END");
                    k0Var.f18693a = pVar;
                    k0Var.f18694b = str;
                    k0Var.f18695c = strArr;
                    k0Var.f18696d = i11;
                    k0Var.f18697e = i12;
                    k0Var.f18698f = i13;
                    k0Var.f18701i = 2;
                }
                String str4 = o0Var.f18743g[i14];
                i11 = i14;
                i12 = 0;
                strArr = f18736l;
                pVar = c0Var2;
                i13 = 3;
                str = str4;
                if (i12 >= i13) {
                }
            }
        }
        k0Var = new k0(o0Var, cVar);
        Object obj2 = k0Var.f18699g;
        lf.a aVar2 = lf.a.f20034a;
        i10 = k0Var.f18701i;
        boolean z52 = true;
        if (i10 != 0) {
        }
        String str42 = o0Var.f18743g[i14];
        i11 = i14;
        i12 = 0;
        strArr = f18736l;
        pVar = c0Var2;
        i13 = 3;
        str = str42;
        if (i12 >= i13) {
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0052  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /* JADX WARN: Type inference failed for: r4v4, types: [k2.p] */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:13:0x0082 -> B:10:0x0085). Please report as a decompilation issue!!! */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object d(o0 o0Var, c0 c0Var, int i5, mf.c cVar) {
        l0 l0Var;
        int i10;
        String str;
        int i11;
        c0 c0Var2;
        int i12;
        String[] strArr;
        o0Var.getClass();
        if (cVar instanceof l0) {
            l0Var = (l0) cVar;
            int i13 = l0Var.f18713h;
            if ((i13 & Integer.MIN_VALUE) != 0) {
                l0Var.f18713h = i13 - Integer.MIN_VALUE;
                Object obj = l0Var.f18711f;
                lf.a aVar = lf.a.f20034a;
                i10 = l0Var.f18713h;
                if (i10 != 0) {
                    h8.b.B(obj);
                    str = o0Var.f18743g[i5];
                    i11 = 3;
                    c0Var2 = c0Var;
                    i12 = 0;
                    strArr = f18736l;
                    if (i12 < i11) {
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    i11 = l0Var.f18710e;
                    i12 = l0Var.f18709d;
                    String[] strArr2 = l0Var.f18708c;
                    str = l0Var.f18707b;
                    ?? r42 = l0Var.f18706a;
                    h8.b.B(obj);
                    strArr = strArr2;
                    c0Var2 = r42;
                    i12++;
                    if (i12 < i11) {
                        String e7 = d9.e.e('`', "DROP TRIGGER IF EXISTS `", "room_table_modification_trigger_" + str + '_' + strArr[i12]);
                        l0Var.f18706a = c0Var2;
                        l0Var.f18707b = str;
                        l0Var.f18708c = strArr;
                        l0Var.f18709d = i12;
                        l0Var.f18710e = i11;
                        l0Var.f18713h = 1;
                        if (x.m(c0Var2, e7, l0Var) == aVar) {
                            return aVar;
                        }
                        i12++;
                        if (i12 < i11) {
                            return Unit.f19194a;
                        }
                    }
                }
            }
        }
        l0Var = new l0(o0Var, cVar);
        Object obj2 = l0Var.f18711f;
        lf.a aVar2 = lf.a.f20034a;
        i10 = l0Var.f18713h;
        if (i10 != 0) {
        }
    }

    public final void e(Function0 onRefreshScheduled, Function0 onRefreshCompleted) {
        Intrinsics.checkNotNullParameter(onRefreshScheduled, "onRefreshScheduled");
        Intrinsics.checkNotNullParameter(onRefreshCompleted, "onRefreshCompleted");
        if (this.j.compareAndSet(false, true)) {
            onRefreshScheduled.invoke();
            jg.d dVar = this.f18737a.f18779a;
            Continuation continuation = null;
            if (dVar == null) {
                Intrinsics.throwUninitializedPropertyAccessException("coroutineScope");
                dVar = null;
            }
            eg.c0.t(dVar, new eg.y("Room Invalidation Tracker Refresh"), null, new androidx.lifecycle.c(this, onRefreshCompleted, continuation, 27), 2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:22:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(mf.c cVar) {
        m0 m0Var;
        int i5;
        x5.h hVar;
        if (cVar instanceof m0) {
            m0Var = (m0) cVar;
            int i10 = m0Var.f18723d;
            if ((i10 & Integer.MIN_VALUE) != 0) {
                m0Var.f18723d = i10 - Integer.MIN_VALUE;
                Object obj = m0Var.f18721b;
                lf.a aVar = lf.a.f20034a;
                i5 = m0Var.f18723d;
                if (i5 != 0) {
                    h8.b.B(obj);
                    w wVar = this.f18737a;
                    x5.h hVar2 = wVar.f18785g;
                    if (hVar2.c()) {
                        try {
                            androidx.lifecycle.o oVar = new androidx.lifecycle.o(this, (Continuation) null, 20);
                            m0Var.f18720a = hVar2;
                            m0Var.f18723d = 1;
                            if (wVar.s(false, oVar, m0Var) == aVar) {
                                return aVar;
                            }
                            hVar = hVar2;
                        } catch (Throwable th2) {
                            th = th2;
                            hVar = hVar2;
                            hVar.l();
                            throw th;
                        }
                    }
                    return Unit.f19194a;
                }
                if (i5 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                hVar = m0Var.f18720a;
                try {
                    h8.b.B(obj);
                } catch (Throwable th3) {
                    th = th3;
                    hVar.l();
                    throw th;
                }
                hVar.l();
                return Unit.f19194a;
            }
        }
        m0Var = new m0(this, cVar);
        Object obj2 = m0Var.f18721b;
        lf.a aVar2 = lf.a.f20034a;
        i5 = m0Var.f18723d;
        if (i5 != 0) {
        }
        hVar.l();
        return Unit.f19194a;
    }
}
