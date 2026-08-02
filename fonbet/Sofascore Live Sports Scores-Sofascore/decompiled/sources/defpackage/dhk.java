package defpackage;

import com.sofascore.model.database.DbUserSegmentation;
import com.sofascore.model.mvvm.model.UserSegmentationType;
import com.sofascore.model.newNetwork.NetworkUserSegmentation;
import com.sofascore.model.newNetwork.NetworkUserSegmentationTag;
import com.sofascore.model.profile.ReferralShareLink;
import com.sofascore.model.profile.UserNotificationsRequest;
import com.sofascore.network.api.NetworkCoroutineAPI;
import com.sofascore.network.api.RegistrationCoroutinesAPI;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.text.Charsets;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class dhk {
    public final NetworkCoroutineAPI a;
    public final RegistrationCoroutinesAPI b;
    public final NetworkCoroutineAPI c;
    public final ghk d;

    public dhk(NetworkCoroutineAPI networkCoroutineAPI, RegistrationCoroutinesAPI registrationCoroutinesAPI, NetworkCoroutineAPI networkCoroutineAPI2, ghk ghkVar) {
        networkCoroutineAPI.getClass();
        registrationCoroutinesAPI.getClass();
        networkCoroutineAPI2.getClass();
        this.a = networkCoroutineAPI;
        this.b = registrationCoroutinesAPI;
        this.c = networkCoroutineAPI2;
        this.d = ghkVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        fgk fgkVar;
        int i;
        if (sq3Var instanceof fgk) {
            fgkVar = (fgk) sq3Var;
            int i2 = fgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                fgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = fgkVar.r;
                Object obj2 = lu3.a;
                i = fgkVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    ghk ghkVar = this.d;
                    fgkVar.t = 1;
                    Object U = gz8.U(fgkVar, ghkVar.a, false, true, new sbk(4));
                    if (U != obj2) {
                        U = Unit.a;
                    }
                    if (U == obj2) {
                        return obj2;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Set set = jhk.a;
                jhk.a = rm5.a;
                return Unit.a;
            }
        }
        fgkVar = new fgk(this, sq3Var);
        Object obj3 = fgkVar.r;
        Object obj22 = lu3.a;
        i = fgkVar.t;
        if (i != 0) {
        }
        Set set2 = jhk.a;
        jhk.a = rm5.a;
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:19:0x0139, code lost:
    
        if (r12 == null) goto L62;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0112  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x0061  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0024  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, String str, sq3 sq3Var) {
        ggk ggkVar;
        int i2;
        dhk dhkVar;
        String str2;
        int i3;
        x2g x2gVar;
        ArrayList arrayList;
        ArrayList arrayList2;
        List<NetworkUserSegmentationTag> tags;
        Set set;
        if (sq3Var instanceof ggk) {
            ggkVar = (ggk) sq3Var;
            int i4 = ggkVar.w;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                ggkVar.w = i4 - Integer.MIN_VALUE;
                Object obj = ggkVar.u;
                lu3 lu3Var = lu3.a;
                i2 = ggkVar.w;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    dhkVar = this;
                    c64 c64Var = new c64(dhkVar, str, i, rq3Var, 20);
                    ggkVar.r = str;
                    ggkVar.t = i;
                    ggkVar.w = 1;
                    obj = yaa.P(c64Var, ggkVar);
                    if (obj != lu3Var) {
                        str2 = str;
                        i3 = i;
                    }
                    return lu3Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    arrayList2 = ggkVar.s;
                    y6a.M(obj);
                    Set set2 = jhk.a;
                    if (arrayList2 != null) {
                        ArrayList arrayList3 = new ArrayList(k13.r(arrayList2, 10));
                        Iterator it = arrayList2.iterator();
                        while (it.hasNext()) {
                            arrayList3.add(((DbUserSegmentation) it.next()).getType());
                        }
                        set = CollectionsKt.W0(arrayList3);
                    }
                    set = rm5.a;
                    set.getClass();
                    jhk.a = set;
                    return Unit.a;
                }
                i3 = ggkVar.t;
                str2 = ggkVar.r;
                y6a.M(obj);
                dhkVar = this;
                x2gVar = (x2g) obj;
                if (!(x2gVar instanceof t2g)) {
                    if (!(x2gVar instanceof v2g)) {
                        zzl.b();
                        return null;
                    }
                    Map map = (Map) ((v2g) x2gVar).a;
                    byte[] bytes = str2.getBytes(Charsets.UTF_8);
                    bytes.getClass();
                    String lowerCase = t6a.x(bytes).toLowerCase(Locale.ROOT);
                    lowerCase.getClass();
                    NetworkUserSegmentation networkUserSegmentation = (NetworkUserSegmentation) map.get(lowerCase);
                    if (networkUserSegmentation == null || (tags = networkUserSegmentation.getTags()) == null) {
                        arrayList = null;
                    } else {
                        ArrayList arrayList4 = new ArrayList();
                        for (NetworkUserSegmentationTag networkUserSegmentationTag : tags) {
                            DbUserSegmentation dbUserSegmentation = (networkUserSegmentationTag.getType() != UserSegmentationType.Default ? networkUserSegmentationTag : null) != null ? new DbUserSegmentation(networkUserSegmentationTag.getType()) : null;
                            if (dbUserSegmentation != null) {
                                arrayList4.add(dbUserSegmentation);
                            }
                        }
                        HashSet hashSet = new HashSet();
                        arrayList = new ArrayList();
                        Iterator it2 = arrayList4.iterator();
                        while (it2.hasNext()) {
                            Object next = it2.next();
                            if (hashSet.add(((DbUserSegmentation) next).getType())) {
                                arrayList.add(next);
                            }
                        }
                    }
                    ghk ghkVar = dhkVar.d;
                    ggkVar.r = null;
                    ggkVar.s = arrayList;
                    ggkVar.t = i3;
                    ggkVar.w = 2;
                    Object T = gz8.T(ggkVar, ghkVar.a, new fzh(ghkVar, arrayList, rq3Var, 12));
                    if (T != lu3.a) {
                        T = Unit.a;
                    }
                    if (T != lu3Var) {
                        arrayList2 = arrayList;
                        Set set22 = jhk.a;
                        if (arrayList2 != null) {
                        }
                        set = rm5.a;
                        set.getClass();
                        jhk.a = set;
                    }
                    return lu3Var;
                }
                return Unit.a;
            }
        }
        ggkVar = new ggk(this, sq3Var);
        Object obj2 = ggkVar.u;
        lu3 lu3Var2 = lu3.a;
        i2 = ggkVar.w;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        x2gVar = (x2g) obj2;
        if (!(x2gVar instanceof t2g)) {
        }
        return Unit.a;
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0059, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x005b, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0043, code lost:
    
        if (r8 == r1) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x006b A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:23:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, sq3 sq3Var) {
        igk igkVar;
        int i;
        x2g x2gVar;
        ReferralShareLink referralShareLink;
        if (sq3Var instanceof igk) {
            igkVar = (igk) sq3Var;
            int i2 = igkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                igkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = igkVar.r;
                lu3 lu3Var = lu3.a;
                i = igkVar.t;
                int i3 = 2;
                int i4 = 1;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    hgk hgkVar = new hgk(this, str, rq3Var, i4);
                    igkVar.t = 1;
                    obj = yaa.P(hgkVar, igkVar);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        y6a.M(obj);
                        x2gVar = (x2g) obj;
                        referralShareLink = (ReferralShareLink) yaa.x(x2gVar);
                        if (referralShareLink != null) {
                            return referralShareLink.getShareLink();
                        }
                        return null;
                    }
                    y6a.M(obj);
                }
                x2gVar = (x2g) obj;
                if (yaa.x(x2gVar) == null) {
                    egk egkVar = new egk(this, rq3Var, i3);
                    igkVar.t = 2;
                    obj = yaa.P(egkVar, igkVar);
                }
                referralShareLink = (ReferralShareLink) yaa.x(x2gVar);
                if (referralShareLink != null) {
                }
            }
        }
        igkVar = new igk(this, sq3Var);
        Object obj2 = igkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = igkVar.t;
        int i32 = 2;
        int i42 = 1;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2gVar = (x2g) obj2;
        if (yaa.x(x2gVar) == null) {
        }
        referralShareLink = (ReferralShareLink) yaa.x(x2gVar);
        if (referralShareLink != null) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object d(String str, sq3 sq3Var) {
        jgk jgkVar;
        int i;
        if (sq3Var instanceof jgk) {
            jgkVar = (jgk) sq3Var;
            int i2 = jgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                jgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = jgkVar.r;
                lu3 lu3Var = lu3.a;
                i = jgkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    hgk hgkVar = new hgk(this, str, rq3Var, 3);
                    jgkVar.t = 1;
                    obj = yaa.P(hgkVar, jgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        jgkVar = new jgk(this, sq3Var);
        Object obj2 = jgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = jgkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    public final Object e(String str, sq3 sq3Var) {
        return yaa.P(new hgk(this, str, null, 6), sq3Var);
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x005c A[LOOP:0: B:11:0x0056->B:13:0x005c, LOOP_END] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object f(sq3 sq3Var) {
        kgk kgkVar;
        int i;
        Iterator it;
        if (sq3Var instanceof kgk) {
            kgkVar = (kgk) sq3Var;
            int i2 = kgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = kgkVar.r;
                lu3 lu3Var = lu3.a;
                i = kgkVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    kgkVar.t = 1;
                    obj = gz8.U(kgkVar, this.d.a, true, false, new sbk(3));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                Iterable iterable = (Iterable) obj;
                ArrayList arrayList = new ArrayList(k13.r(iterable, 10));
                it = iterable.iterator();
                while (it.hasNext()) {
                    arrayList.add(((DbUserSegmentation) it.next()).getType());
                }
                return CollectionsKt.W0(arrayList);
            }
        }
        kgkVar = new kgk(this, sq3Var);
        Object obj2 = kgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = kgkVar.t;
        if (i != 0) {
        }
        Iterable iterable2 = (Iterable) obj2;
        ArrayList arrayList2 = new ArrayList(k13.r(iterable2, 10));
        it = iterable2.iterator();
        while (it.hasNext()) {
        }
        return CollectionsKt.W0(arrayList2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object g(String str, sq3 sq3Var) {
        lgk lgkVar;
        int i;
        if (sq3Var instanceof lgk) {
            lgkVar = (lgk) sq3Var;
            int i2 = lgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                lgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = lgkVar.r;
                lu3 lu3Var = lu3.a;
                i = lgkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    hgk hgkVar = new hgk(this, str, rq3Var, 8);
                    lgkVar.t = 1;
                    obj = yaa.P(hgkVar, lgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        lgkVar = new lgk(this, sq3Var);
        Object obj2 = lgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = lgkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object h(String str, sq3 sq3Var) {
        mgk mgkVar;
        int i;
        if (sq3Var instanceof mgk) {
            mgkVar = (mgk) sq3Var;
            int i2 = mgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                mgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = mgkVar.r;
                lu3 lu3Var = lu3.a;
                i = mgkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    hgk hgkVar = new hgk(this, str, rq3Var, 9);
                    mgkVar.t = 1;
                    obj = yaa.P(hgkVar, mgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        mgkVar = new mgk(this, sq3Var);
        Object obj2 = mgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = mgkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object i(Set set, sq3 sq3Var) {
        ogk ogkVar;
        int i;
        if (sq3Var instanceof ogk) {
            ogkVar = (ogk) sq3Var;
            int i2 = ogkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ogkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = ogkVar.r;
                lu3 lu3Var = lu3.a;
                i = ogkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    pgk pgkVar = new pgk(this, set, rq3Var, 0);
                    ogkVar.t = 1;
                    obj = yaa.P(pgkVar, ogkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        ogkVar = new ogk(this, sq3Var);
        Object obj2 = ogkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = ogkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object j(HashSet hashSet, sq3 sq3Var) {
        qgk qgkVar;
        int i;
        if (sq3Var instanceof qgk) {
            qgkVar = (qgk) sq3Var;
            int i2 = qgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                qgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = qgkVar.r;
                lu3 lu3Var = lu3.a;
                i = qgkVar.t;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    pgk pgkVar = new pgk(this, hashSet, rq3Var, i3);
                    qgkVar.t = 1;
                    obj = yaa.P(pgkVar, qgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        qgkVar = new qgk(this, sq3Var);
        Object obj2 = qgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = qgkVar.t;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object k(HashSet hashSet, sq3 sq3Var) {
        rgk rgkVar;
        int i;
        if (sq3Var instanceof rgk) {
            rgkVar = (rgk) sq3Var;
            int i2 = rgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                rgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = rgkVar.r;
                lu3 lu3Var = lu3.a;
                i = rgkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    sgk sgkVar = new sgk(this, hashSet, rq3Var, 0);
                    rgkVar.t = 1;
                    obj = yaa.P(sgkVar, rgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        rgkVar = new rgk(this, sq3Var);
        Object obj2 = rgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = rgkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object l(HashSet hashSet, sq3 sq3Var) {
        tgk tgkVar;
        int i;
        if (sq3Var instanceof tgk) {
            tgkVar = (tgk) sq3Var;
            int i2 = tgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = tgkVar.r;
                lu3 lu3Var = lu3.a;
                i = tgkVar.t;
                rq3 rq3Var = null;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    sgk sgkVar = new sgk(this, hashSet, rq3Var, i3);
                    tgkVar.t = 1;
                    obj = yaa.P(sgkVar, tgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        tgkVar = new tgk(this, sq3Var);
        Object obj2 = tgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = tgkVar.t;
        rq3 rq3Var2 = null;
        int i32 = 1;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m(Set set, sq3 sq3Var) {
        ugk ugkVar;
        int i;
        if (sq3Var instanceof ugk) {
            ugkVar = (ugk) sq3Var;
            int i2 = ugkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ugkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = ugkVar.r;
                lu3 lu3Var = lu3.a;
                i = ugkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    pgk pgkVar = new pgk(this, set, rq3Var, 2);
                    ugkVar.t = 1;
                    obj = yaa.P(pgkVar, ugkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        ugkVar = new ugk(this, sq3Var);
        Object obj2 = ugkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = ugkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object n(HashSet hashSet, sq3 sq3Var) {
        vgk vgkVar;
        int i;
        if (sq3Var instanceof vgk) {
            vgkVar = (vgk) sq3Var;
            int i2 = vgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = vgkVar.r;
                lu3 lu3Var = lu3.a;
                i = vgkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    pgk pgkVar = new pgk(this, hashSet, rq3Var, 3);
                    vgkVar.t = 1;
                    obj = yaa.P(pgkVar, vgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        vgkVar = new vgk(this, sq3Var);
        Object obj2 = vgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = vgkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object o(UserNotificationsRequest userNotificationsRequest, sq3 sq3Var) {
        wgk wgkVar;
        int i;
        if (sq3Var instanceof wgk) {
            wgkVar = (wgk) sq3Var;
            int i2 = wgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = wgkVar.r;
                lu3 lu3Var = lu3.a;
                i = wgkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    fzh fzhVar = new fzh(this, userNotificationsRequest, rq3Var, 11);
                    wgkVar.t = 1;
                    obj = yaa.P(fzhVar, wgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        wgkVar = new wgk(this, sq3Var);
        Object obj2 = wgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = wgkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object p(HashSet hashSet, sq3 sq3Var) {
        xgk xgkVar;
        int i;
        if (sq3Var instanceof xgk) {
            xgkVar = (xgk) sq3Var;
            int i2 = xgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                xgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = xgkVar.r;
                lu3 lu3Var = lu3.a;
                i = xgkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    sgk sgkVar = new sgk(this, hashSet, rq3Var, 2);
                    xgkVar.t = 1;
                    obj = yaa.P(sgkVar, xgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        xgkVar = new xgk(this, sq3Var);
        Object obj2 = xgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = xgkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object q(HashSet hashSet, sq3 sq3Var) {
        ygk ygkVar;
        int i;
        if (sq3Var instanceof ygk) {
            ygkVar = (ygk) sq3Var;
            int i2 = ygkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ygkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = ygkVar.r;
                lu3 lu3Var = lu3.a;
                i = ygkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    sgk sgkVar = new sgk(this, hashSet, rq3Var, 3);
                    ygkVar.t = 1;
                    obj = yaa.P(sgkVar, ygkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        ygkVar = new ygk(this, sq3Var);
        Object obj2 = ygkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = ygkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object r(HashSet hashSet, sq3 sq3Var) {
        zgk zgkVar;
        int i;
        if (sq3Var instanceof zgk) {
            zgkVar = (zgk) sq3Var;
            int i2 = zgkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zgkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = zgkVar.r;
                lu3 lu3Var = lu3.a;
                i = zgkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    pgk pgkVar = new pgk(this, hashSet, rq3Var, 5);
                    zgkVar.t = 1;
                    obj = yaa.P(pgkVar, zgkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        zgkVar = new zgk(this, sq3Var);
        Object obj2 = zgkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = zgkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object s(HashSet hashSet, sq3 sq3Var) {
        ahk ahkVar;
        int i;
        if (sq3Var instanceof ahk) {
            ahkVar = (ahk) sq3Var;
            int i2 = ahkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                ahkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = ahkVar.r;
                lu3 lu3Var = lu3.a;
                i = ahkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    sgk sgkVar = new sgk(this, hashSet, rq3Var, 4);
                    ahkVar.t = 1;
                    obj = yaa.P(sgkVar, ahkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        ahkVar = new ahk(this, sq3Var);
        Object obj2 = ahkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = ahkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object t(HashSet hashSet, sq3 sq3Var) {
        bhk bhkVar;
        int i;
        if (sq3Var instanceof bhk) {
            bhkVar = (bhk) sq3Var;
            int i2 = bhkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                bhkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = bhkVar.r;
                lu3 lu3Var = lu3.a;
                i = bhkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    sgk sgkVar = new sgk(this, hashSet, rq3Var, 5);
                    bhkVar.t = 1;
                    obj = yaa.P(sgkVar, bhkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        bhkVar = new bhk(this, sq3Var);
        Object obj2 = bhkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = bhkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object u(HashSet hashSet, sq3 sq3Var) {
        chk chkVar;
        int i;
        if (sq3Var instanceof chk) {
            chkVar = (chk) sq3Var;
            int i2 = chkVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                chkVar.t = i2 - Integer.MIN_VALUE;
                Object obj = chkVar.r;
                lu3 lu3Var = lu3.a;
                i = chkVar.t;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    pgk pgkVar = new pgk(this, hashSet, rq3Var, 6);
                    chkVar.t = 1;
                    obj = yaa.P(pgkVar, chkVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                x2g x2gVar = (x2g) obj;
                x2gVar.getClass();
                return Boolean.valueOf(x2gVar instanceof v2g);
            }
        }
        chkVar = new chk(this, sq3Var);
        Object obj2 = chkVar.r;
        lu3 lu3Var2 = lu3.a;
        i = chkVar.t;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }
}
