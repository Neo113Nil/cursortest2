package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.e;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class pc2 {
    public static final pc2 a = new pc2();
    public static e b;

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:9)(2:22|23))(2:24|(1:26)(1:27))|10|11|(1:13)(2:17|18)|14|15))|28|6|(0)(0)|10|11|(0)(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r4, null);
        r5 = new defpackage.pog(new defpackage.nnm(null));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:11:0x0048, B:13:0x0053, B:17:0x0060), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:11:0x0048, B:13:0x0053, B:17:0x0060), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(sq3 sq3Var) {
        tsm tsmVar;
        int i;
        vnm vnmVar;
        String str;
        if (sq3Var instanceof tsm) {
            tsmVar = (tsm) sq3Var;
            int i2 = tsmVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                tsmVar.v = i2 - Integer.MIN_VALUE;
                Object obj = tsmVar.t;
                lu3 lu3Var = lu3.a;
                i = tsmVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    vnm vnmVar2 = vnm.a;
                    tsmVar.r = vnmVar2;
                    tsmVar.s = "blaze_data_store_recently_selected_language_model_key";
                    tsmVar.v = 1;
                    if (vnmVar2.c(tsmVar) == lu3Var) {
                        return lu3Var;
                    }
                    vnmVar = vnmVar2;
                    str = "blaze_data_store_recently_selected_language_model_key";
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = tsmVar.s;
                    vnmVar = tsmVar.r;
                    y6a.M(obj);
                }
                vnm vnmVar3 = vnm.a;
                vnmVar.getClass();
                ye4 a2 = vnm.a();
                z88 pogVar = a2 != null ? new pog(new sdm(null)) : new t98(hkg.H(new bkm(a2.getData(), str)), new ylm(null), 1);
                return new jrm(pogVar);
            }
        }
        tsmVar = new tsm(this, sq3Var);
        Object obj2 = tsmVar.t;
        lu3 lu3Var2 = lu3.a;
        i = tsmVar.v;
        if (i != 0) {
        }
        vnm vnmVar32 = vnm.a;
        vnmVar.getClass();
        ye4 a22 = vnm.a();
        if (a22 != null) {
        }
        return new jrm(pogVar);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(8:5|6|(1:(1:9)(2:22|23))(2:24|(1:26)(1:27))|10|11|(1:13)(2:17|18)|14|15))|28|6|(0)(0)|10|11|(0)(0)|14|15) */
    /* JADX WARN: Code restructure failed: missing block: B:19:0x005e, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:21:0x0079, code lost:
    
        com.blaze.blazesdk.shared.BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(r4, null);
        r5 = new defpackage.pog(new defpackage.fzm(null));
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x0053 A[Catch: Exception -> 0x005e, TryCatch #0 {Exception -> 0x005e, blocks: (B:11:0x0048, B:13:0x0053, B:17:0x0060), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0060 A[Catch: Exception -> 0x005e, TRY_LEAVE, TryCatch #0 {Exception -> 0x005e, blocks: (B:11:0x0048, B:13:0x0053, B:17:0x0060), top: B:10:0x0048 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(sq3 sq3Var) {
        o oVar;
        int i;
        vnm vnmVar;
        String str;
        if (sq3Var instanceof o) {
            oVar = (o) sq3Var;
            int i2 = oVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                oVar.v = i2 - Integer.MIN_VALUE;
                Object obj = oVar.t;
                lu3 lu3Var = lu3.a;
                i = oVar.v;
                if (i != 0) {
                    y6a.M(obj);
                    vnm vnmVar2 = vnm.a;
                    oVar.r = vnmVar2;
                    oVar.s = "blaze_data_store_selected_language_model_key";
                    oVar.v = 1;
                    if (vnmVar2.c(oVar) == lu3Var) {
                        return lu3Var;
                    }
                    vnmVar = vnmVar2;
                    str = "blaze_data_store_selected_language_model_key";
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str = oVar.s;
                    vnmVar = oVar.r;
                    y6a.M(obj);
                }
                vnm vnmVar3 = vnm.a;
                vnmVar.getClass();
                ye4 a2 = vnm.a();
                z88 pogVar = a2 != null ? new pog(new wum(null)) : new t98(hkg.H(new txm(a2.getData(), str)), new mym(null), 1);
                return new g1n(pogVar);
            }
        }
        oVar = new o(this, sq3Var);
        Object obj2 = oVar.t;
        lu3 lu3Var2 = lu3.a;
        i = oVar.v;
        if (i != 0) {
        }
        vnm vnmVar32 = vnm.a;
        vnmVar.getClass();
        ye4 a22 = vnm.a();
        if (a22 != null) {
        }
        return new g1n(pogVar);
    }
}
