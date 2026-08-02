package defpackage;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.XmlResourceParser;
import androidx.preference.PreferenceGroup;
import androidx.preference.PreferenceScreen;
import com.sofascore.results.R;
import java.util.Arrays;
import java.util.List;
import java.util.Set;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class a5f {
    public boolean a;
    public long b;
    public final Object c;
    public Object d;
    public Object e;
    public Object f;
    public Object g;
    public Object h;
    public Object i;
    public Object j;

    public a5f(Function1 function1) {
        this.c = function1;
        this.d = new AtomicReference(null);
        this.e = new fvg(this, 12);
        this.f = new qfg(this, 20);
        this.g = new i1d(new loh[16], 0);
        this.h = new Object();
        this.b = -1L;
    }

    public static SharedPreferences d(Context context) {
        return context.getSharedPreferences(e(context), 0);
    }

    public static String e(Context context) {
        return context.getPackageName() + "_preferences";
    }

    public void a() {
        synchronized (this.h) {
            try {
                i1d i1dVar = (i1d) this.g;
                Object[] objArr = i1dVar.a;
                int i = i1dVar.c;
                for (int i2 = 0; i2 < i; i2++) {
                    loh lohVar = (loh) objArr[i2];
                    lohVar.e.a();
                    lohVar.f.a();
                    lohVar.l.a();
                    lohVar.m.clear();
                }
                Unit unit = Unit.a;
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0082 A[Catch: all -> 0x0090, TryCatch #0 {all -> 0x0090, blocks: (B:4:0x0007, B:8:0x0013, B:11:0x007a, B:13:0x0082, B:15:0x0092, B:17:0x0087, B:20:0x0023, B:23:0x002f, B:25:0x0043, B:27:0x0051, B:29:0x005b, B:31:0x006b, B:39:0x0076, B:42:0x0096), top: B:3:0x0007 }] */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0085  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void b(Object obj) {
        int i;
        int i2;
        synchronized (this.h) {
            try {
                i1d i1dVar = (i1d) this.g;
                int i3 = i1dVar.c;
                int i4 = 0;
                int i5 = 0;
                while (true) {
                    Object[] objArr = i1dVar.a;
                    if (i4 < i3) {
                        loh lohVar = (loh) objArr[i4];
                        h0d h0dVar = (h0d) lohVar.f.k(obj);
                        if (h0dVar != null) {
                            Object[] objArr2 = h0dVar.b;
                            int[] iArr = h0dVar.c;
                            long[] jArr = h0dVar.a;
                            int length = jArr.length - 2;
                            if (length >= 0) {
                                int i6 = 0;
                                while (true) {
                                    long j = jArr[i6];
                                    i = i4;
                                    if ((((~j) << 7) & j & (-9187201950435737472L)) != -9187201950435737472L) {
                                        int i7 = 8 - ((~(i6 - length)) >>> 31);
                                        int i8 = 0;
                                        while (i8 < i7) {
                                            if ((j & 255) < 128) {
                                                int i9 = (i6 << 3) + i8;
                                                i2 = i8;
                                                Object obj2 = objArr2[i9];
                                                int i10 = iArr[i9];
                                                lohVar.c(obj, obj2);
                                            } else {
                                                i2 = i8;
                                            }
                                            j >>= 8;
                                            i8 = i2 + 1;
                                        }
                                        if (i7 != 8) {
                                            break;
                                        }
                                    }
                                    if (i6 == length) {
                                        break;
                                    }
                                    i6++;
                                    i4 = i;
                                }
                                if (lohVar.f.j()) {
                                    i5++;
                                } else if (i5 > 0) {
                                    Object[] objArr3 = i1dVar.a;
                                    objArr3[i - i5] = objArr3[i];
                                }
                                i4 = i + 1;
                            }
                        }
                        i = i4;
                        if (lohVar.f.j()) {
                        }
                        i4 = i + 1;
                    } else {
                        int i11 = i3 - i5;
                        Arrays.fill(objArr, i11, i3, (Object) null);
                        i1dVar.c = i11;
                        Unit unit = Unit.a;
                    }
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public boolean c() {
        boolean z;
        Set set;
        Set set2;
        synchronized (this.h) {
            z = this.a;
        }
        if (z) {
            return false;
        }
        boolean z2 = false;
        while (true) {
            AtomicReference atomicReference = (AtomicReference) this.d;
            while (true) {
                Object obj = atomicReference.get();
                set = null;
                List list = null;
                List list2 = null;
                if (obj == null) {
                    break;
                }
                if (obj instanceof Set) {
                    set2 = (Set) obj;
                } else {
                    if (!(obj instanceof List)) {
                        sf3.b("Unexpected notification");
                        pvd.x();
                        return false;
                    }
                    List list3 = (List) obj;
                    Set set3 = (Set) list3.get(0);
                    if (list3.size() == 2) {
                        list2 = list3.get(1);
                    } else if (list3.size() > 2) {
                        list2 = list3.subList(1, list3.size());
                    }
                    set2 = set3;
                    list = list2;
                }
                while (!atomicReference.compareAndSet(obj, list)) {
                    if (atomicReference.get() != obj) {
                        break;
                    }
                }
                set = set2;
                break;
            }
            if (set == null) {
                return z2;
            }
            synchronized (this.h) {
                try {
                    i1d i1dVar = (i1d) this.g;
                    Object[] objArr = i1dVar.a;
                    int i = i1dVar.c;
                    for (int i2 = 0; i2 < i; i2++) {
                        if (!((loh) objArr[i2]).a(set) && !z2) {
                            z2 = false;
                        }
                        z2 = true;
                    }
                    Unit unit = Unit.a;
                } catch (Throwable th) {
                    throw th;
                }
            }
        }
    }

    public SharedPreferences.Editor f() {
        if (!this.a) {
            return g().edit();
        }
        SharedPreferences.Editor editor = (SharedPreferences.Editor) this.e;
        if (editor != null) {
            return editor;
        }
        SharedPreferences.Editor edit = g().edit();
        this.e = edit;
        return edit;
    }

    public SharedPreferences g() {
        SharedPreferences sharedPreferences = (SharedPreferences) this.d;
        if (sharedPreferences != null) {
            return sharedPreferences;
        }
        SharedPreferences sharedPreferences2 = ((Context) this.c).getSharedPreferences((String) this.f, 0);
        this.d = sharedPreferences2;
        return sharedPreferences2;
    }

    public PreferenceScreen h(Context context) {
        this.a = true;
        z4f z4fVar = new z4f(context, this);
        XmlResourceParser xml = context.getResources().getXml(R.xml.preference);
        try {
            PreferenceGroup c = z4fVar.c(xml);
            xml.close();
            PreferenceScreen preferenceScreen = (PreferenceScreen) c;
            preferenceScreen.j(this);
            SharedPreferences.Editor editor = (SharedPreferences.Editor) this.e;
            if (editor != null) {
                editor.apply();
            }
            this.a = false;
            return preferenceScreen;
        } catch (Throwable th) {
            xml.close();
            throw th;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:41:0x01f2 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0227 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r6v17, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r6v2, types: [kotlin.Unit] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public void i(Object obj, Function1 function1, Function0 function0) {
        Object obj2;
        loh lohVar;
        boolean z;
        loh lohVar2;
        long j;
        ?? r6;
        long j2;
        loh lohVar3;
        nnh rxjVar;
        long j3;
        h0d h0dVar;
        int i;
        long j4;
        h0d h0dVar2;
        long v = waa.v();
        synchronized (this.h) {
            i1d i1dVar = (i1d) this.g;
            Object[] objArr = i1dVar.a;
            int i2 = i1dVar.c;
            int i3 = 0;
            while (true) {
                if (i3 >= i2) {
                    obj2 = null;
                    break;
                }
                obj2 = objArr[i3];
                if (((loh) obj2).a == function1) {
                    break;
                } else {
                    i3++;
                }
            }
            lohVar = (loh) obj2;
            z = true;
            if (lohVar == null) {
                function1.getClass();
                i5k.e(1, function1);
                lohVar = new loh(function1);
                i1dVar.b(lohVar);
            }
            lohVar2 = (loh) this.j;
            j = this.b;
            r6 = Unit.a;
        }
        long j5 = r6;
        if (j != -1) {
            j5 = r6;
            if (j != v) {
                StringBuilder o = ljg.o("Detected multithreaded access to SnapshotStateObserver: previousThreadId=", j, "), currentThread={id=");
                o.append(v);
                o.append(", name=");
                o.append(Thread.currentThread().getName());
                o.append("}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.");
                h3f.a(o.toString());
                j5 = "}. Note that observation on multiple threads in layout/draw is not supported. Make sure your measure/layout/draw for each Owner (AndroidComposeView) is executed on the same thread.";
            }
        }
        try {
            synchronized (this.h) {
                try {
                    this.j = lohVar;
                    this.b = v;
                } catch (Throwable th) {
                    th = th;
                    j2 = j5;
                }
            }
            qfg qfgVar = (qfg) this.f;
            Object obj3 = lohVar.b;
            h0d h0dVar3 = lohVar.c;
            int i4 = lohVar.d;
            lohVar.b = obj;
            lohVar.c = (h0d) lohVar.f.g(obj);
            if (lohVar.d == -1) {
                lohVar.d = Long.hashCode(snh.h().g());
            }
            zu8 zu8Var = lohVar.i;
            i1d a = goh.a();
            try {
                a.b(zu8Var);
                if (qfgVar == null) {
                    function0.invoke();
                    lohVar3 = lohVar;
                } else {
                    nnh nnhVar = (nnh) snh.b.l();
                    if (nnhVar instanceof rxj) {
                        lohVar3 = lohVar;
                        if (((rxj) nnhVar).t == waa.v()) {
                            Function1 function12 = ((rxj) nnhVar).r;
                            Function1 function13 = ((rxj) nnhVar).s;
                            try {
                                ((rxj) nnhVar).r = snh.i(qfgVar, function12, true);
                                ((rxj) nnhVar).s = function13;
                                function0.invoke();
                                ((rxj) nnhVar).r = function12;
                                ((rxj) nnhVar).s = function13;
                            } catch (Throwable th2) {
                                ((rxj) nnhVar).r = function12;
                                ((rxj) nnhVar).s = function13;
                                throw th2;
                            }
                        }
                    } else {
                        lohVar3 = lohVar;
                    }
                    if (nnhVar == null || (nnhVar instanceof c1d)) {
                        rxjVar = new rxj(nnhVar instanceof c1d ? (c1d) nnhVar : null, qfgVar, null, true, false);
                    } else {
                        rxjVar = nnhVar.u(qfgVar);
                    }
                    try {
                        nnh j6 = rxjVar.j();
                        try {
                            function0.invoke();
                            nnh.q(j6);
                            rxjVar.c();
                        } catch (Throwable th3) {
                            try {
                                nnh.q(j6);
                                throw th3;
                            } catch (Throwable th4) {
                                th = th4;
                                try {
                                    rxjVar.c();
                                    throw th;
                                } catch (Throwable th5) {
                                    th = th5;
                                    a.r(a.c - 1);
                                    throw th;
                                }
                            }
                        }
                    } catch (Throwable th6) {
                        th = th6;
                    }
                }
                a.r(a.c - 1);
                loh lohVar4 = lohVar3;
                Object obj4 = lohVar4.b;
                obj4.getClass();
                int i5 = lohVar4.d;
                h0d h0dVar4 = lohVar4.c;
                if (h0dVar4 != null) {
                    try {
                        long[] jArr = h0dVar4.a;
                        int length = jArr.length - 2;
                        if (length >= 0) {
                            int i6 = 0;
                            while (true) {
                                long j7 = jArr[i6];
                                boolean z2 = z;
                                h0d h0dVar5 = h0dVar4;
                                if ((((~j7) << 7) & j7 & (-9187201950435737472L)) != -9187201950435737472L) {
                                    int i7 = 8 - ((~(i6 - length)) >>> 31);
                                    int i8 = 0;
                                    while (i8 < i7) {
                                        if ((j7 & 255) < 128) {
                                            i = i8;
                                            int i9 = (i6 << 3) + i;
                                            j4 = j7;
                                            h0dVar2 = h0dVar5;
                                            Object obj5 = h0dVar2.b[i9];
                                            j3 = j;
                                            try {
                                                boolean z3 = h0dVar2.c[i9] != i5 ? z2 : false;
                                                if (z3) {
                                                    lohVar4.c(obj4, obj5);
                                                }
                                                if (z3) {
                                                    h0dVar2.f(i9);
                                                }
                                            } catch (Throwable th7) {
                                                th = th7;
                                                j2 = j3;
                                                synchronized (this.h) {
                                                }
                                            }
                                        } else {
                                            i = i8;
                                            j4 = j7;
                                            h0dVar2 = h0dVar5;
                                            j3 = j;
                                        }
                                        i8 = i + 1;
                                        long j8 = j3;
                                        h0dVar5 = h0dVar2;
                                        j7 = j4 >> 8;
                                        j = j8;
                                    }
                                    h0dVar = h0dVar5;
                                    j3 = j;
                                    if (i7 != 8) {
                                        break;
                                    }
                                } else {
                                    h0dVar = h0dVar5;
                                    j3 = j;
                                }
                                if (i6 == length) {
                                    break;
                                }
                                i6++;
                                h0dVar4 = h0dVar;
                                z = z2;
                                j = j3;
                            }
                            lohVar4.b = obj3;
                            lohVar4.c = h0dVar3;
                            lohVar4.d = i4;
                            synchronized (this.h) {
                                this.j = lohVar2;
                                this.b = j3;
                                Unit unit = Unit.a;
                            }
                            return;
                        }
                    } catch (Throwable th8) {
                        th = th8;
                        j3 = j;
                        j2 = j3;
                        synchronized (this.h) {
                            this.j = lohVar2;
                            this.b = j2;
                            Unit unit2 = Unit.a;
                        }
                        throw th;
                    }
                }
                j3 = j;
                lohVar4.b = obj3;
                lohVar4.c = h0dVar3;
                lohVar4.d = i4;
                synchronized (this.h) {
                }
            } catch (Throwable th9) {
                th = th9;
                a.r(a.c - 1);
                throw th;
            }
        } catch (Throwable th10) {
            th = th10;
            j2 = j;
        }
    }

    public void j() {
        fvg fvgVar = (fvg) this.e;
        snh.b(snh.a);
        synchronized (snh.c) {
            snh.h = CollectionsKt.x0(snh.h, fvgVar);
            Unit unit = Unit.a;
        }
        this.i = new imf(fvgVar, 11);
    }

    public a5f(Context context) {
        this.b = 0L;
        this.c = context;
        this.f = e(context);
        this.d = null;
    }
}
