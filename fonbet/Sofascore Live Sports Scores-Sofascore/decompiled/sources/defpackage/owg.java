package defpackage;

import com.unity3d.ads.BuildConfig;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.collections.a;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class owg extends a7e {
    public final uwg b;
    public final s96 c;
    public final List d;
    public final String e;
    public final hwg f;
    public final String g;
    public final String h;

    public owg(uwg uwgVar, s96 s96Var, List list, String str, hwg hwgVar, String str2, String str3) {
        uwgVar.getClass();
        s96Var.getClass();
        list.getClass();
        str.getClass();
        hwgVar.getClass();
        str3.getClass();
        this.b = uwgVar;
        this.c = s96Var;
        this.d = list;
        this.e = str;
        this.f = hwgVar;
        this.g = str2;
        this.h = str3;
    }

    @Override // defpackage.a7e
    public final Object a(c7e c7eVar) {
        c7eVar.getClass();
        return null;
    }

    @Override // defpackage.a7e
    public final Object c(y6e y6eVar, sq3 sq3Var) {
        if (this.e.length() >= 2) {
            return e(y6eVar, sq3Var);
        }
        Object f = f(this.f, false, sq3Var);
        return f == lu3.a ? f : (z6e) f;
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x006d  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0081  */
    /* JADX WARN: Removed duplicated region for block: B:26:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x0030  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Serializable d(List list, hwg hwgVar, sq3 sq3Var) {
        lwg lwgVar;
        int i;
        if (sq3Var instanceof lwg) {
            lwgVar = (lwg) sq3Var;
            int i2 = lwgVar.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lwgVar.u = i2 - Integer.MIN_VALUE;
                Object obj = lwgVar.s;
                lu3 lu3Var = lu3.a;
                i = lwgVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    rq3 rq3Var = null;
                    if (hwgVar == hwg.c) {
                        hwgVar = null;
                    }
                    String str = hwgVar != null ? hwgVar.a : BuildConfig.FLAVOR;
                    lwgVar.r = list;
                    lwgVar.u = 1;
                    uwg uwgVar = this.b;
                    uwgVar.getClass();
                    obj = uwgVar.d(new yw(uwgVar, str, this.g, rq3Var, 13), lwgVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    list = lwgVar.r;
                    y6a.M(obj);
                }
                ArrayList arrayList = new ArrayList();
                for (Object obj2 : (Iterable) obj) {
                    if (!list.contains(obj2)) {
                        arrayList.add(obj2);
                    }
                }
                return arrayList.isEmpty() ? CollectionsKt.w0(arrayList, a.c("suggestion")) : arrayList;
            }
        }
        lwgVar = new lwg(this, sq3Var);
        Object obj3 = lwgVar.s;
        lu3 lu3Var2 = lu3.a;
        i = lwgVar.u;
        if (i != 0) {
        }
        ArrayList arrayList2 = new ArrayList();
        while (r12.hasNext()) {
        }
        if (arrayList2.isEmpty()) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x0076  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x003b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0027  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object e(y6e y6eVar, sq3 sq3Var) {
        mwg mwgVar;
        int i;
        int i2;
        List list;
        Integer num;
        if (sq3Var instanceof mwg) {
            mwgVar = (mwg) sq3Var;
            int i3 = mwgVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                mwgVar.u = i3 - Integer.MIN_VALUE;
                Object obj = mwgVar.s;
                Object obj2 = lu3.a;
                i = mwgVar.u;
                if (i != 0) {
                    y6a.M(obj);
                    Integer num2 = (Integer) y6eVar.a();
                    int intValue = num2 != null ? num2.intValue() : 0;
                    mwgVar.r = intValue;
                    mwgVar.u = 1;
                    uwg uwgVar = this.b;
                    uwgVar.getClass();
                    obj = uwgVar.d(new fg7(uwgVar, this.h, this.e, this.g, intValue, (rq3) null, 2), mwgVar);
                    if (obj != obj2) {
                        i2 = intValue;
                    }
                }
                if (i != 1) {
                    if (i == 2) {
                        y6a.M(obj);
                        return obj;
                    }
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                i2 = mwgVar.r;
                y6a.M(obj);
                list = (List) obj;
                num = list.isEmpty() ? null : new Integer(i2 + 1);
                if (list.isEmpty() || i2 != 0) {
                    return new z6e(list, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                mwgVar.r = i2;
                mwgVar.u = 2;
                Object f = f(this.f, true, mwgVar);
                return f == obj2 ? obj2 : f;
            }
        }
        mwgVar = new mwg(this, sq3Var);
        Object obj3 = mwgVar.s;
        Object obj22 = lu3.a;
        i = mwgVar.u;
        if (i != 0) {
        }
        list = (List) obj3;
        if (list.isEmpty()) {
        }
        if (list.isEmpty()) {
        }
        return new z6e(list, num, Integer.MIN_VALUE, Integer.MIN_VALUE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x005f, code lost:
    
        if (r13 == r2) goto L37;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x007e  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(hwg hwgVar, boolean z, sq3 sq3Var) {
        nwg nwgVar;
        int i;
        List list;
        List c;
        List list2;
        List list3;
        ArrayList arrayList;
        Collection w0;
        if (sq3Var instanceof nwg) {
            nwgVar = (nwg) sq3Var;
            int i2 = nwgVar.x;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                nwgVar.x = i2 - Integer.MIN_VALUE;
                Object obj = nwgVar.v;
                Object obj2 = lu3.a;
                i = nwgVar.x;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    hs4 hs4Var = z45.a;
                    hq4 hq4Var = hq4.c;
                    v1f v1fVar = new v1f(this, hwgVar, rq3Var, 17);
                    nwgVar.r = hwgVar;
                    nwgVar.u = z;
                    nwgVar.x = 1;
                    obj = xw3.R(hq4Var, v1fVar, nwgVar);
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            arrayList = nwgVar.t;
                            list3 = nwgVar.s;
                            y6a.M(obj);
                            w0 = CollectionsKt.w0((Iterable) obj, arrayList);
                            c = list3;
                            return new z6e(CollectionsKt.w0(w0, c), null, Integer.MIN_VALUE, Integer.MIN_VALUE);
                        }
                        if (i != 3) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        list2 = nwgVar.s;
                        y6a.M(obj);
                        c = list2;
                        w0 = (List) obj;
                        return new z6e(CollectionsKt.w0(w0, c), null, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                    z = nwgVar.u;
                    hwgVar = nwgVar.r;
                    y6a.M(obj);
                }
                list = (List) obj;
                c = !z ? a.c(new Integer(13)) : km5.a;
                if (list.size() < 10) {
                    w0 = CollectionsKt.w0(list, a.c("recent"));
                    return new z6e(CollectionsKt.w0(w0, c), null, Integer.MIN_VALUE, Integer.MIN_VALUE);
                }
                if (list.isEmpty()) {
                    nwgVar.r = null;
                    nwgVar.s = c;
                    nwgVar.u = z;
                    nwgVar.x = 3;
                    obj = d(km5.a, hwgVar, nwgVar);
                    if (obj != obj2) {
                        list2 = c;
                        c = list2;
                        w0 = (List) obj;
                        return new z6e(CollectionsKt.w0(w0, c), null, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                } else {
                    ArrayList w02 = CollectionsKt.w0(list, a.c("recent"));
                    nwgVar.r = null;
                    nwgVar.s = c;
                    nwgVar.t = w02;
                    nwgVar.u = z;
                    nwgVar.x = 2;
                    obj = d(list, hwgVar, nwgVar);
                    if (obj != obj2) {
                        list3 = c;
                        arrayList = w02;
                        w0 = CollectionsKt.w0((Iterable) obj, arrayList);
                        c = list3;
                        return new z6e(CollectionsKt.w0(w0, c), null, Integer.MIN_VALUE, Integer.MIN_VALUE);
                    }
                }
                return obj2;
            }
        }
        nwgVar = new nwg(this, sq3Var);
        Object obj3 = nwgVar.v;
        Object obj22 = lu3.a;
        i = nwgVar.x;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        list = (List) obj3;
        if (!z) {
        }
        if (list.size() < 10) {
        }
    }
}
