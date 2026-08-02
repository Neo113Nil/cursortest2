package defpackage;

import com.sofascore.network.api.NetworkCoroutineAPI;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class pai {
    public final NetworkCoroutineAPI a;

    public pai(NetworkCoroutineAPI networkCoroutineAPI) {
        networkCoroutineAPI.getClass();
        this.a = networkCoroutineAPI;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(int i, sq3 sq3Var) {
        lai laiVar;
        int i2;
        if (sq3Var instanceof lai) {
            laiVar = (lai) sq3Var;
            int i3 = laiVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                laiVar.t = i3 - Integer.MIN_VALUE;
                Object obj = laiVar.r;
                lu3 lu3Var = lu3.a;
                i2 = laiVar.t;
                rq3 rq3Var = null;
                if (i2 != 0) {
                    y6a.M(obj);
                    mai maiVar = new mai(this, i, rq3Var, 0);
                    laiVar.t = 1;
                    obj = yaa.P(maiVar, laiVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    y6a.M(obj);
                }
                return yaa.x((x2g) obj);
            }
        }
        laiVar = new lai(this, sq3Var);
        Object obj2 = laiVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = laiVar.t;
        rq3 rq3Var2 = null;
        if (i2 != 0) {
        }
        return yaa.x((x2g) obj2);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(int i, sq3 sq3Var) {
        nai naiVar;
        int i2;
        if (sq3Var instanceof nai) {
            naiVar = (nai) sq3Var;
            int i3 = naiVar.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                naiVar.t = i3 - Integer.MIN_VALUE;
                Object obj = naiVar.r;
                lu3 lu3Var = lu3.a;
                i2 = naiVar.t;
                rq3 rq3Var = null;
                int i4 = 1;
                if (i2 != 0) {
                    y6a.M(obj);
                    mai maiVar = new mai(this, i, rq3Var, i4);
                    naiVar.t = 1;
                    obj = yaa.P(maiVar, naiVar);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
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
        naiVar = new nai(this, sq3Var);
        Object obj2 = naiVar.r;
        lu3 lu3Var2 = lu3.a;
        i2 = naiVar.t;
        rq3 rq3Var2 = null;
        int i42 = 1;
        if (i2 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(int i, int i2, sq3 sq3Var, String str) {
        oai oaiVar;
        int i3;
        if (sq3Var instanceof oai) {
            oaiVar = (oai) sq3Var;
            int i4 = oaiVar.t;
            if ((i4 & Integer.MIN_VALUE) != 0) {
                oaiVar.t = i4 - Integer.MIN_VALUE;
                Object obj = oaiVar.r;
                lu3 lu3Var = lu3.a;
                i3 = oaiVar.t;
                if (i3 != 0) {
                    y6a.M(obj);
                    lh7 lh7Var = new lh7(this, i, i2, str, (rq3) null, 6);
                    oaiVar.t = 1;
                    obj = yaa.P(lh7Var, oaiVar);
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
        oaiVar = new oai(this, sq3Var);
        Object obj2 = oaiVar.r;
        lu3 lu3Var2 = lu3.a;
        i3 = oaiVar.t;
        if (i3 != 0) {
        }
        x2g x2gVar2 = (x2g) obj2;
        x2gVar2.getClass();
        return Boolean.valueOf(x2gVar2 instanceof v2g);
    }
}
