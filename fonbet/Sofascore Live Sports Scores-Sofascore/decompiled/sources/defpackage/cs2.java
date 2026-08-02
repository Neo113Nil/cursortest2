package defpackage;

import com.sofascore.model.GoogleTranslate;
import com.sofascore.model.chat.DbChatMessage;
import com.sofascore.network.api.NetworkCoroutineAPI;
import kotlin.Unit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class cs2 {
    public final fr2 a;
    public final NetworkCoroutineAPI b;
    public final NetworkCoroutineAPI c;

    public cs2(fr2 fr2Var, NetworkCoroutineAPI networkCoroutineAPI, NetworkCoroutineAPI networkCoroutineAPI2) {
        networkCoroutineAPI.getClass();
        networkCoroutineAPI2.getClass();
        this.a = fr2Var;
        this.b = networkCoroutineAPI;
        this.c = networkCoroutineAPI2;
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r5 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(DbChatMessage dbChatMessage, sq3 sq3Var) {
        vr2 vr2Var;
        int i;
        DbChatMessage dbChatMessage2;
        Object U;
        fr2 fr2Var = this.a;
        k6g k6gVar = fr2Var.a;
        if (sq3Var instanceof vr2) {
            vr2Var = (vr2) sq3Var;
            int i2 = vr2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                vr2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = vr2Var.s;
                lu3 lu3Var = lu3.a;
                i = vr2Var.u;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    int eventId = dbChatMessage.getEventId();
                    long messageTimestamp = dbChatMessage.getMessageTimestamp();
                    long reportTimestamp = dbChatMessage.getReportTimestamp();
                    dbChatMessage2 = dbChatMessage;
                    vr2Var.r = dbChatMessage2;
                    vr2Var.u = 1;
                    U = gz8.U(vr2Var, k6gVar, false, true, new er2(eventId, 1, reportTimestamp, messageTimestamp));
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    DbChatMessage dbChatMessage3 = vr2Var.r;
                    y6a.M(obj);
                    U = obj;
                    dbChatMessage2 = dbChatMessage3;
                }
                if (((Number) U).intValue() == 0) {
                    return Unit.a;
                }
                vr2Var.r = null;
                vr2Var.u = 2;
                Object U2 = gz8.U(vr2Var, k6gVar, false, true, new r82(i3, fr2Var, dbChatMessage2));
                if (U2 != lu3Var) {
                    U2 = Unit.a;
                }
            }
        }
        vr2Var = new vr2(this, sq3Var);
        Object obj2 = vr2Var.s;
        lu3 lu3Var2 = lu3.a;
        i = vr2Var.u;
        int i32 = 1;
        if (i != 0) {
        }
        if (((Number) U).intValue() == 0) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:22:0x0081, code lost:
    
        if (r0 == r1) goto L26;
     */
    /* JADX WARN: Code restructure failed: missing block: B:23:0x0083, code lost:
    
        return r1;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0064, code lost:
    
        if (r5 == r1) goto L26;
     */
    /* JADX WARN: Removed duplicated region for block: B:19:0x006f  */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002c  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(DbChatMessage dbChatMessage, sq3 sq3Var) {
        wr2 wr2Var;
        int i;
        DbChatMessage dbChatMessage2;
        Object U;
        fr2 fr2Var = this.a;
        k6g k6gVar = fr2Var.a;
        if (sq3Var instanceof wr2) {
            wr2Var = (wr2) sq3Var;
            int i2 = wr2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                wr2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = wr2Var.s;
                lu3 lu3Var = lu3.a;
                i = wr2Var.u;
                int i3 = 1;
                if (i != 0) {
                    y6a.M(obj);
                    int eventId = dbChatMessage.getEventId();
                    long messageTimestamp = dbChatMessage.getMessageTimestamp();
                    long voteTimestamp = dbChatMessage.getVoteTimestamp();
                    dbChatMessage2 = dbChatMessage;
                    wr2Var.r = dbChatMessage2;
                    wr2Var.u = 1;
                    U = gz8.U(wr2Var, k6gVar, false, true, new er2(eventId, 0, voteTimestamp, messageTimestamp));
                } else {
                    if (i != 1) {
                        if (i == 2) {
                            y6a.M(obj);
                            return Unit.a;
                        }
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    DbChatMessage dbChatMessage3 = wr2Var.r;
                    y6a.M(obj);
                    U = obj;
                    dbChatMessage2 = dbChatMessage3;
                }
                if (((Number) U).intValue() == 0) {
                    return Unit.a;
                }
                wr2Var.r = null;
                wr2Var.u = 2;
                Object U2 = gz8.U(wr2Var, k6gVar, false, true, new r82(i3, fr2Var, dbChatMessage2));
                if (U2 != lu3Var) {
                    U2 = Unit.a;
                }
            }
        }
        wr2Var = new wr2(this, sq3Var);
        Object obj2 = wr2Var.s;
        lu3 lu3Var2 = lu3.a;
        i = wr2Var.u;
        int i32 = 1;
        if (i != 0) {
        }
        if (((Number) U).intValue() == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0053  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0057 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:18:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(String str, String str2, sq3 sq3Var) {
        zr2 zr2Var;
        int i;
        String str3;
        GoogleTranslate googleTranslate;
        if (sq3Var instanceof zr2) {
            zr2Var = (zr2) sq3Var;
            int i2 = zr2Var.u;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                zr2Var.u = i2 - Integer.MIN_VALUE;
                Object obj = zr2Var.s;
                lu3 lu3Var = lu3.a;
                i = zr2Var.u;
                rq3 rq3Var = null;
                if (i != 0) {
                    y6a.M(obj);
                    yw ywVar = new yw(this, str, str2, rq3Var, 2);
                    zr2Var.r = str;
                    zr2Var.u = 1;
                    obj = yaa.P(ywVar, zr2Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                    str3 = str;
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    str3 = zr2Var.r;
                    y6a.M(obj);
                }
                googleTranslate = (GoogleTranslate) yaa.x((x2g) obj);
                if (googleTranslate != null) {
                    return null;
                }
                googleTranslate.setSrc(str3);
                return googleTranslate;
            }
        }
        zr2Var = new zr2(this, sq3Var);
        Object obj2 = zr2Var.s;
        lu3 lu3Var2 = lu3.a;
        i = zr2Var.u;
        rq3 rq3Var2 = null;
        if (i != 0) {
        }
        googleTranslate = (GoogleTranslate) yaa.x((x2g) obj2);
        if (googleTranslate != null) {
        }
    }
}
