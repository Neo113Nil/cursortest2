package defpackage;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.view.View;
import androidx.compose.runtime.e;
import com.google.android.gms.common.internal.Preconditions;
import com.google.android.gms.common.util.Clock;
import com.google.android.gms.measurement.internal.zzae;
import com.google.android.gms.measurement.internal.zzgu;
import com.google.android.gms.measurement.internal.zzhz;
import com.google.android.gms.measurement.internal.zzic;
import java.lang.ref.WeakReference;
import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.IdentityHashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.CancellationException;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class t01 implements z50, yhi, eg9, iso {
    public final /* synthetic */ int a;
    public final Object b;

    public t01(int i) {
        this.a = i;
        switch (i) {
            case 2:
                this.b = new ArrayList();
                break;
            case 3:
            case 9:
            case 10:
            default:
                this.b = new ArrayDeque(20);
                break;
            case 4:
                this.b = m8h.a;
                break;
            case 5:
                this.b = Collections.newSetFromMap(new IdentityHashMap());
                break;
            case 6:
                uzc uzcVar = q6a.a;
                this.b = new uzc();
                break;
            case 7:
                this.b = new Object();
                break;
            case 8:
                this.b = new rl2();
                break;
            case 11:
                this.b = e.f(Boolean.FALSE);
                break;
        }
    }

    public static Object M(t01 t01Var, Context context, int i, sq3 sq3Var) {
        t01Var.getClass();
        AtomicBoolean atomicBoolean = gsj.a;
        if (Build.VERSION.SDK_INT >= 29 && gsj.a.get()) {
            hsj.a.a("GlanceAppWidget::update", 0);
        }
        Object a = ((l8h) t01Var.b).a(new df0(context, new re0(i), t01Var, (rq3) null), sq3Var);
        return a == lu3.a ? a : Unit.a;
    }

    public abstract Object A();

    public abstract void B();

    public abstract void C();

    public void D(h0f h0fVar) {
        ArrayDeque arrayDeque = (ArrayDeque) this.b;
        if (arrayDeque.size() < 20) {
            arrayDeque.offer(h0fVar);
        }
    }

    public void E(int i, Object obj, cv8 cv8Var, Object obj2) {
        if (Intrinsics.c(obj, nf3.a)) {
            l(i, cv8Var, null);
        }
    }

    public abstract void F(Context context, re0 re0Var, sq3 sq3Var);

    public abstract Function1 G(l4h l4hVar);

    public abstract void H(ln2 ln2Var);

    public abstract void I(Object obj);

    public abstract void J(axj axjVar);

    public abstract void K();

    public Object L(Context context, re0 re0Var, sq3 sq3Var) {
        int i;
        if (re0Var == null || (Integer.MIN_VALUE <= (i = re0Var.a) && i < -1)) {
            a70.p("Invalid Glance ID");
            return null;
        }
        Object M = M(this, context, i, sq3Var);
        return M == lu3.a ? M : Unit.a;
    }

    public void N(Object obj, boolean z) {
        Set set = (Set) this.b;
        int size = set.size();
        if (z) {
            set.add(obj);
            if (size == 0) {
                B();
                return;
            }
            return;
        }
        if (set.remove(obj) && size == 1) {
            C();
        }
    }

    public void O(String str) {
        str.getClass();
    }

    public void P(String str) {
        str.getClass();
    }

    public void Q() {
        zzhz zzhzVar = ((zzic) this.b).g;
        zzic.m(zzhzVar);
        zzhzVar.Q();
    }

    @Override // defpackage.iso
    public zzae a() {
        throw null;
    }

    @Override // defpackage.iso
    public zzgu b() {
        throw null;
    }

    @Override // defpackage.yhi
    public Set c() {
        Set entrySet = ((Map) this.b).entrySet();
        entrySet.getClass();
        Set unmodifiableSet = Collections.unmodifiableSet(entrySet);
        unmodifiableSet.getClass();
        return unmodifiableSet;
    }

    @Override // defpackage.iso
    public zzhz d() {
        throw null;
    }

    @Override // defpackage.iso
    public Context e() {
        throw null;
    }

    @Override // defpackage.iso
    public Clock f() {
        throw null;
    }

    @Override // defpackage.z50
    public List h() {
        return (List) this.b;
    }

    public void i(String str, String str2) {
        str.getClass();
        str2.getClass();
        P(str2);
        s(str).add(str2);
    }

    @Override // defpackage.z50
    public boolean isStatic() {
        List list = (List) this.b;
        return list.isEmpty() || (list.size() == 1 && ((nja) list.get(0)).c());
    }

    public void j(xhi xhiVar) {
        xhiVar.getClass();
        xhiVar.d(new q8i(this, 2));
    }

    /* JADX WARN: Code restructure failed: missing block: B:26:0x003a, code lost:
    
        return false;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean k(int i, cv8 cv8Var, Object obj) {
        ArrayList arrayList = cv8Var.a;
        if (arrayList != null) {
            int size = arrayList.size();
            int i2 = 0;
            while (true) {
                if (i2 >= size) {
                    break;
                }
                Object obj2 = arrayList.get(i2);
                if (!(obj2 instanceof vu8)) {
                    if (!(obj2 instanceof cv8)) {
                        cp4.g(obj2, "Unexpected child source info ");
                        break;
                    }
                    if (k(i, (cv8) obj2, obj)) {
                        l(0, cv8Var, obj2);
                        return true;
                    }
                } else if (obj2 == obj) {
                    l(0, cv8Var, obj2);
                    return true;
                }
                i2++;
            }
        } else {
            l(i, cv8Var, null);
            return true;
        }
    }

    public void l(int i, cv8 cv8Var, Object obj) {
        ((ArrayList) this.b).add(new ef3(i, null, null));
    }

    public void m() {
        ((Map) this.b).clear();
    }

    public abstract void n(l4h l4hVar);

    public abstract void o();

    public void onDismissed(Bundle bundle) {
        ((eg9) this.b).onDismissed(bundle);
    }

    public void onError(Bundle bundle) {
        ((eg9) this.b).onError(bundle);
    }

    public void onShown(Bundle bundle) {
        ((eg9) this.b).onShown(bundle);
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0098, code lost:
    
        if (r10.a(r8, r9, r7, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00d4, code lost:
    
        if (r10.a(r8, r9, r7, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00ba, code lost:
    
        if (r10.a(r8, r9, r7, r0) == r1) goto L42;
     */
    /* JADX WARN: Code restructure failed: missing block: B:44:0x0069, code lost:
    
        if (r2.a(r4, r0) == r1) goto L42;
     */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0028  */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x00a9  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x0049  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object p(Context context, int i, sq3 sq3Var) {
        jy8 jy8Var;
        t01 t01Var;
        int i2;
        doa z;
        doa z2;
        doa z3;
        if (sq3Var instanceof jy8) {
            jy8Var = (jy8) sq3Var;
            int i3 = jy8Var.w;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                jy8Var.w = i3 - Integer.MIN_VALUE;
                Object obj = jy8Var.u;
                lu3 lu3Var = lu3.a;
                rq3 rq3Var = null;
                switch (jy8Var.w) {
                    case 0:
                        y6a.M(obj);
                        re0 re0Var = new re0(i);
                        l8h l8hVar = (l8h) this.b;
                        yp7 yp7Var = new yp7(re0Var, rq3Var, 14);
                        jy8Var.r = this;
                        jy8Var.s = context;
                        jy8Var.t = i;
                        jy8Var.w = 1;
                        break;
                    case 1:
                        i = jy8Var.t;
                        context = jy8Var.s;
                        this = jy8Var.r;
                        y6a.M(obj);
                        try {
                            jy8Var.r = this;
                            jy8Var.s = context;
                            jy8Var.t = i;
                            jy8Var.w = 2;
                            this.getClass();
                        } catch (CancellationException unused) {
                            int i4 = i;
                            t01Var = this;
                            i2 = i4;
                            z2 = t01Var.z();
                            if (z2 != null) {
                                dz8 dz8Var = dz8.a;
                                String M = l98.M(i2);
                                jy8Var.r = null;
                                jy8Var.s = null;
                                jy8Var.w = 4;
                                break;
                            }
                            return Unit.a;
                        } catch (Throwable unused2) {
                            int i5 = i;
                            t01Var = this;
                            i2 = i5;
                            z = t01Var.z();
                            if (z != null) {
                                dz8 dz8Var2 = dz8.a;
                                String M2 = l98.M(i2);
                                jy8Var.r = null;
                                jy8Var.s = null;
                                jy8Var.w = 5;
                                break;
                            }
                            return Unit.a;
                        }
                        if (Unit.a != lu3Var) {
                            int i6 = i;
                            t01Var = this;
                            i2 = i6;
                            z3 = t01Var.z();
                            if (z3 != null) {
                                dz8 dz8Var3 = dz8.a;
                                String M3 = l98.M(i2);
                                jy8Var.r = null;
                                jy8Var.s = null;
                                jy8Var.w = 3;
                                break;
                            }
                            return Unit.a;
                        }
                        return lu3Var;
                    case 2:
                        i2 = jy8Var.t;
                        context = jy8Var.s;
                        t01Var = jy8Var.r;
                        try {
                            y6a.M(obj);
                            z3 = t01Var.z();
                            if (z3 != null) {
                            }
                        } catch (CancellationException unused3) {
                            z2 = t01Var.z();
                            if (z2 != null) {
                            }
                            return Unit.a;
                        } catch (Throwable unused4) {
                            z = t01Var.z();
                            if (z != null) {
                            }
                            return Unit.a;
                        }
                        return Unit.a;
                    case 3:
                    case 4:
                    case 5:
                        y6a.M(obj);
                        return Unit.a;
                    case 6:
                        Throwable th = (Throwable) jy8Var.r;
                        y6a.M(obj);
                        throw th;
                    default:
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                }
            }
        }
        jy8Var = new jy8(this, sq3Var);
        Object obj2 = jy8Var.u;
        lu3 lu3Var2 = lu3.a;
        rq3 rq3Var2 = null;
        switch (jy8Var.w) {
        }
    }

    public abstract void q();

    @Override // defpackage.yhi
    public void r(String str, List list) {
        str.getClass();
        list.getClass();
        List s = s(str);
        Iterator it = list.iterator();
        while (it.hasNext()) {
            P((String) it.next());
        }
        o13.v(list, s);
    }

    public List s(String str) {
        Map map = (Map) this.b;
        List list = (List) map.get(str);
        if (list != null) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        O(str);
        map.put(str, arrayList);
        return arrayList;
    }

    public String t(String str) {
        List u = u(str);
        if (u != null) {
            return (String) CollectionsKt.firstOrNull(u);
        }
        return null;
    }

    public String toString() {
        switch (this.a) {
            case 0:
                StringBuilder sb = new StringBuilder();
                List list = (List) this.b;
                if (!list.isEmpty()) {
                    sb.append("values=");
                    sb.append(Arrays.toString(list.toArray()));
                }
                return sb.toString();
            default:
                return super.toString();
        }
    }

    public List u(String str) {
        str.getClass();
        return (List) ((Map) this.b).get(str);
    }

    public abstract xqa v(int i, int i2, int i3, long j);

    public abstract Object w();

    public List x(wqa wqaVar, int i, long j) {
        uzc uzcVar = (uzc) this.b;
        List list = (List) uzcVar.b(i);
        if (list != null) {
            return list;
        }
        List a = wqaVar.a(i);
        int size = a.size();
        ArrayList arrayList = new ArrayList(size);
        for (int i2 = 0; i2 < size; i2++) {
            arrayList.add(((g1c) a.get(i2)).J(j));
        }
        uzcVar.i(i, arrayList);
        return arrayList;
    }

    public dkh y() {
        return dkh.a;
    }

    public doa z() {
        return doa.c;
    }

    public t01(View view) {
        this.a = 14;
        this.b = new WeakReference(view);
    }

    public t01(zzic zzicVar) {
        this.a = 15;
        Preconditions.i(zzicVar);
        this.b = zzicVar;
    }

    public /* synthetic */ t01(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    public t01(Bundle bundle, String str) {
        this.a = 3;
        str.getClass();
        bundle.getClass();
        this.b = bundle;
    }
}
