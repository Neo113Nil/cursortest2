package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vrj {
    public final NetworkCoroutineAPI a;

    public vrj(NetworkCoroutineAPI networkCoroutineAPI) {
        networkCoroutineAPI.getClass();
        this.a = networkCoroutineAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(String str, String str2, String str3, sq3 sq3Var) {
        srj srjVar;
        int i;
        if (sq3Var instanceof srj) {
            srjVar = (srj) sq3Var;
            int i2 = srjVar.t;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                srjVar.t = i2 - Integer.MIN_VALUE;
                Object obj = srjVar.r;
                lu3 lu3Var = lu3.a;
                i = srjVar.t;
                if (i != 0) {
                    y6a.M(obj);
                    as2 as2Var = new as2(this, str, str2, str3, null, 6);
                    srjVar.t = 1;
                    obj = yaa.P(as2Var, srjVar);
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
        srjVar = new srj(this, sq3Var);
        Object obj2 = srjVar.r;
        lu3 lu3Var2 = lu3.a;
        i = srjVar.t;
        if (i != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, int i2, sq3 sq3Var) {
        urj urjVar;
        int i3;
        if (sq3Var instanceof urj) {
            urjVar = (urj) sq3Var;
            int i4 = urjVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                urjVar.t = i4 - Integer.MIN_VALUE;
                Object obj = urjVar.r;
                lu3 lu3Var = lu3.a;
                i3 = urjVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    ni5 ni5Var = new ni5(this, i, i2, null, 4);
                    urjVar.t = 1;
                    obj = yaa.P(ni5Var, urjVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i3 != 1) {
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
        urjVar = new urj(this, sq3Var);
        Object obj2 = urjVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = urjVar.t;
        if (i3 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }
}
