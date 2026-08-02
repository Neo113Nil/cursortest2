package defpackage;

import android.content.Context;
import android.os.Bundle;
import com.facebook.login.i;
import com.moloco.sdk.internal.MolocoLogger;
import com.moloco.sdk.internal.error.a;
import com.moloco.sdk.internal.error.b;
import com.moloco.sdk.internal.services.b0;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.f;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.g;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.l;
import com.moloco.sdk.xenoss.sdkdevkit.android.adrenderer.internal.media.m;
import com.moloco.sdk.xenoss.sdkdevkit.android.persistenttransport.h;
import java.io.File;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import org.xmlpull.v1.XmlPullParser;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class mj5 extends hoi implements Function2 {
    public final /* synthetic */ int r;
    public int s;
    public int t;
    public Object u;
    public Object v;
    public Object w;
    public final /* synthetic */ Object x;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj5(int i, Function0 function0, e1d e1dVar, boh bohVar, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 15;
        this.t = i;
        this.v = function0;
        this.w = e1dVar;
        this.x = bohVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:38:0x0147, code lost:
    
        if (r0 == r6) goto L57;
     */
    /* JADX WARN: Code restructure failed: missing block: B:7:0x0087, code lost:
    
        if (r1 == r6) goto L57;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0136  */
    /* JADX WARN: Removed duplicated region for block: B:47:0x01a9  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x01b3  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x01c6  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x01ac  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object e(Object obj) {
        int i;
        Object obj2;
        Object obj3;
        aq4 aq4Var;
        Object obj4;
        Object obj5;
        int i2;
        int i3;
        File file = (File) this.x;
        String str = (String) this.w;
        i iVar = (i) this.v;
        lu3 lu3Var = lu3.a;
        int i4 = this.t;
        int i5 = 1;
        int i6 = 1;
        try {
            try {
                try {
                    if (i4 != 0) {
                        try {
                            if (i4 == 1) {
                                int i7 = this.s;
                                y6a.M(obj);
                                i = i7;
                                obj2 = obj;
                            } else if (i4 == 2) {
                                int i8 = this.s;
                                y6a.M(obj);
                                obj3 = obj;
                                aq4Var = (aq4) obj3;
                                i2 = aq4Var.d().a;
                                if (400 > i2 && i2 < 500) {
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Failed to fetch media from url: " + str + ", status: " + aq4Var.d(), null, false, 12, null);
                                    return f.e;
                                }
                                i3 = aq4Var.d().a;
                                if (500 > i3 && i3 < 600) {
                                    MolocoLogger.error$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Failed to fetch media from url: " + str + ", status: " + aq4Var.d(), null, false, 12, null);
                                    return f.h;
                                }
                                this.u = aq4Var;
                                this.s = 1;
                                this.t = 3;
                                obj4 = ml4.K(aq4Var, this);
                                if (obj4 == lu3Var) {
                                    return lu3Var;
                                }
                                ez2 P = n9e.P(file);
                                this.u = aq4Var;
                                this.s = i6;
                                this.t = 4;
                                obj5 = l6g.A((db2) obj4, P, this);
                            } else {
                                if (i4 != 3) {
                                    if (i4 != 4) {
                                        a70.r("call to 'resume' before 'invoke' with coroutine");
                                        return null;
                                    }
                                    int i9 = this.s;
                                    aq4 aq4Var2 = (aq4) this.u;
                                    try {
                                        y6a.M(obj);
                                        i6 = i9;
                                        aq4Var = aq4Var2;
                                        obj5 = obj;
                                        try {
                                            long longValue = ((Number) obj5).longValue();
                                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Downloaded full response: " + xw3.B(aq4Var) + " and saved to disk: " + longValue + " bytes, file size: " + file.length(), null, false, 12, null);
                                            return new g(file);
                                        } catch (qij unused) {
                                            i9 = i6;
                                            i = i9;
                                            ((b) iVar.c).a(i != 0 ? "HTTP_REQUEST_COMPLETE_TIMEOUT" : "HTTP_REQUEST_NOT_COMPLETE_TIMEOUT", new a(null));
                                            if (i != 0) {
                                            }
                                            throw new m();
                                        }
                                    } catch (qij unused2) {
                                        i = i9;
                                        ((b) iVar.c).a(i != 0 ? "HTTP_REQUEST_COMPLETE_TIMEOUT" : "HTTP_REQUEST_NOT_COMPLETE_TIMEOUT", new a(null));
                                        if (i != 0) {
                                        }
                                        throw new m();
                                    }
                                }
                                i6 = this.s;
                                aq4Var = (aq4) this.u;
                                y6a.M(obj);
                                obj4 = obj;
                                ez2 P2 = n9e.P(file);
                                this.u = aq4Var;
                                this.s = i6;
                                this.t = 4;
                                obj5 = l6g.A((db2) obj4, P2, this);
                            }
                        } catch (qij unused3) {
                            i5 = "Fetching asset from network: ";
                            i = i5;
                            ((b) iVar.c).a(i != 0 ? "HTTP_REQUEST_COMPLETE_TIMEOUT" : "HTTP_REQUEST_NOT_COMPLETE_TIMEOUT", new a(null));
                            if (i != 0) {
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Timeout occurred after request had completed: ".concat(str), null, false, 12, null);
                            } else {
                                MolocoLogger.error$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Timeout occurred when still waiting for request to complete: ".concat(str), null, false, 12, null);
                            }
                            throw new m();
                        }
                    } else {
                        y6a.M(obj);
                        i = 0;
                        try {
                            MolocoLogger.info$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Fetching asset from network: ".concat(str), null, false, 12, null);
                            b0 b0Var = (b0) iVar.b;
                            this.s = 0;
                            this.t = 1;
                            obj2 = b0Var.a(5000L, this);
                        } catch (qij unused4) {
                            ((b) iVar.c).a(i != 0 ? "HTTP_REQUEST_COMPLETE_TIMEOUT" : "HTTP_REQUEST_NOT_COMPLETE_TIMEOUT", new a(null));
                            if (i != 0) {
                            }
                            throw new m();
                        }
                    }
                    if (!((Boolean) obj2).booleanValue()) {
                        return f.n;
                    }
                    if (file.exists()) {
                        MolocoLogger.info$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Deleting existing file and re-downloading it", null, false, 12, null);
                        file.delete();
                    }
                    this.s = i;
                    this.t = 2;
                    obj3 = iVar.g(str, this);
                    if (obj3 == lu3Var) {
                        return lu3Var;
                    }
                    aq4Var = (aq4) obj3;
                    i2 = aq4Var.d().a;
                    if (400 > i2) {
                    }
                    i3 = aq4Var.d().a;
                    if (500 > i3) {
                    }
                    this.u = aq4Var;
                    this.s = 1;
                    this.t = 3;
                    obj4 = ml4.K(aq4Var, this);
                    if (obj4 == lu3Var) {
                    }
                    ez2 P22 = n9e.P(file);
                    this.u = aq4Var;
                    this.s = i6;
                    this.t = 4;
                    obj5 = l6g.A((db2) obj4, P22, this);
                } catch (qij unused5) {
                    i5 = i;
                    i = i5;
                    ((b) iVar.c).a(i != 0 ? "HTTP_REQUEST_COMPLETE_TIMEOUT" : "HTTP_REQUEST_NOT_COMPLETE_TIMEOUT", new a(null));
                    if (i != 0) {
                    }
                    throw new m();
                }
            } catch (qij unused6) {
            }
        } catch (Exception e) {
            MolocoLogger.error$default(MolocoLogger.INSTANCE, "LegacyMediaDownloader", "Failed to fetch media from url: ".concat(str), e, false, 8, null);
            return l.a(e);
        }
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        int i = this.r;
        Object obj2 = this.x;
        switch (i) {
            case 0:
                return new mj5((ksa) this.u, this.t, (kx4) this.v, (pj5) this.w, (cdi) obj2, rq3Var, 0);
            case 1:
                mj5 mj5Var = new mj5((dw6) this.v, this.t, (String) this.w, (String) obj2, rq3Var, 1);
                mj5Var.u = obj;
                return mj5Var;
            case 2:
                return new mj5((bt7) this.v, this.t, (asf) this.w, (AtomicReference) obj2, rq3Var, 2);
            case 3:
                mj5 mj5Var2 = new mj5((sy8) this.v, (Context) this.w, this.t, (Bundle) obj2, rq3Var, 3);
                mj5Var2.u = obj;
                return mj5Var2;
            case 4:
                mj5 mj5Var3 = new mj5((sy8) this.v, (Context) this.w, this.t, (String) obj2, rq3Var, 4);
                mj5Var3.u = obj;
                return mj5Var3;
            case 5:
                mj5 mj5Var4 = new mj5((Integer) this.w, (w3b) obj2, this.t, rq3Var, 5);
                mj5Var4.v = obj;
                return mj5Var4;
            case 6:
                mj5 mj5Var5 = new mj5((esb) obj2, this.t, rq3Var, 6);
                mj5Var5.w = obj;
                return mj5Var5;
            case 7:
                mj5 mj5Var6 = new mj5((znc) obj2, this.t, rq3Var, 7);
                mj5Var6.w = obj;
                return mj5Var6;
            case 8:
                mj5 mj5Var7 = new mj5((s5d) obj2, rq3Var, 8);
                mj5Var7.w = obj;
                return mj5Var7;
            case 9:
                return new mj5((ome) this.v, this.t, (vk2) this.w, (String) obj2, rq3Var, 9);
            case 10:
                mj5 mj5Var8 = new mj5((zsf) obj2, this.t, rq3Var, 10);
                mj5Var8.w = obj;
                return mj5Var8;
            case 11:
                return new mj5((scj) this.u, (Function1) this.v, this.t, (e1d) this.w, (e1d) obj2, rq3Var, 11);
            case 12:
                mj5 mj5Var9 = new mj5((String) this.w, (j0j) obj2, this.t, rq3Var, 12);
                mj5Var9.v = obj;
                return mj5Var9;
            case 13:
                return new mj5((ksa) this.u, this.t, (List) this.v, (oge) this.w, (Function1) obj2, rq3Var, 13);
            case 14:
                return new mj5((agk) obj2, rq3Var, 14);
            case 15:
                mj5 mj5Var10 = new mj5(this.t, (Function0) this.v, (e1d) this.w, (boh) obj2, rq3Var);
                mj5Var10.u = obj;
                return mj5Var10;
            case 16:
                return new mj5((u6b) this.u, (e1d) this.v, this.t, (Function0) this.w, (boh) obj2, rq3Var, 16);
            case 17:
                return new mj5((i) this.v, (String) this.w, (File) obj2, rq3Var);
            case 18:
                mj5 mj5Var11 = new mj5((XmlPullParser) this.v, rq3Var, (fsf) this.w, (ArrayList) obj2);
                mj5Var11.u = obj;
                return mj5Var11;
            default:
                return new mj5((h) this.u, (String) this.v, (byte[]) this.w, (up3) obj2, rq3Var);
        }
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        ku3 ku3Var = (ku3) obj;
        rq3 rq3Var = (rq3) obj2;
        switch (this.r) {
        }
        return ((mj5) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
    }

    /*  JADX ERROR: JadxOverflowException in pass: RegionMakerVisitor
        jadx.core.utils.exceptions.JadxOverflowException: Regions count limit reached
        	at jadx.core.utils.ErrorsCounter.addError(ErrorsCounter.java:59)
        	at jadx.core.utils.ErrorsCounter.error(ErrorsCounter.java:31)
        	at jadx.core.dex.attributes.nodes.NotificationAttrNode.addError(NotificationAttrNode.java:19)
        */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:140:0x0294  */
    /* JADX WARN: Removed duplicated region for block: B:142:0x02ad  */
    /* JADX WARN: Removed duplicated region for block: B:167:0x037f  */
    /* JADX WARN: Removed duplicated region for block: B:177:0x0364  */
    /* JADX WARN: Removed duplicated region for block: B:247:0x053d A[Catch: all -> 0x04d6, TryCatch #2 {all -> 0x04d6, blocks: (B:243:0x04cf, B:245:0x0539, B:247:0x053d, B:251:0x0545, B:252:0x054b), top: B:242:0x04cf }] */
    /* JADX WARN: Removed duplicated region for block: B:256:0x0563 A[Catch: all -> 0x0574, TryCatch #1 {all -> 0x0574, blocks: (B:254:0x055d, B:256:0x0563, B:258:0x0567, B:259:0x0576, B:260:0x0577, B:263:0x057c, B:282:0x0508, B:284:0x050c), top: B:281:0x0508 }] */
    /* JADX WARN: Removed duplicated region for block: B:262:0x057b  */
    /* JADX WARN: Type inference failed for: r10v23, types: [com.sofascore.model.newNetwork.statistics.season.player.PlayerCareerStatistics] */
    /* JADX WARN: Type inference failed for: r2v45 */
    /* JADX WARN: Type inference failed for: r2v46 */
    /* JADX WARN: Type inference failed for: r2v47 */
    /* JADX WARN: Type inference failed for: r2v48 */
    /* JADX WARN: Type inference failed for: r2v54 */
    /* JADX WARN: Type inference failed for: r2v56, types: [h2d] */
    /* JADX WARN: Type inference failed for: r2v59, types: [h2d] */
    /* JADX WARN: Type inference failed for: r2v94 */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:108:0x024a -> B:109:0x01f7). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:125:0x0292 -> B:122:0x0296). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:21:0x0090 -> B:8:0x0091). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:41:0x00f3 -> B:36:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:43:0x00fd -> B:36:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:52:0x0125 -> B:36:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:54:0x0131 -> B:33:0x0135). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:56:0x0147 -> B:36:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:63:0x015d -> B:36:0x0175). Please report as a decompilation issue!!! */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:65:0x0170 -> B:36:0x0175). Please report as a decompilation issue!!! */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final java.lang.Object invokeSuspend(java.lang.Object r22) {
        /*
            Method dump skipped, instructions count: 2676
            To view this dump add '--comments-level debug' option
        */
        throw new UnsupportedOperationException("Method not decompiled: defpackage.mj5.invokeSuspend(java.lang.Object):java.lang.Object");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj5(q8 q8Var, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.x = q8Var;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj5(sy8 sy8Var, Context context, int i, Object obj, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.v = sy8Var;
        this.w = context;
        this.t = i;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj5(ksa ksaVar, int i, Object obj, Object obj2, Object obj3, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = ksaVar;
        this.t = i;
        this.v = obj;
        this.w = obj2;
        this.x = obj3;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj5(i iVar, String str, File file, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 17;
        this.v = iVar;
        this.w = str;
        this.x = file;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj5(h hVar, String str, byte[] bArr, up3 up3Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.r = 19;
        this.u = hVar;
        this.v = str;
        this.w = bArr;
        this.x = up3Var;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj5(Object obj, int i, Serializable serializable, Serializable serializable2, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.v = obj;
        this.t = i;
        this.w = serializable;
        this.x = serializable2;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj5(Object obj, rq3 rq3Var, int i) {
        super(2, rq3Var);
        this.r = i;
        this.x = obj;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj5(Object obj, Object obj2, int i, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.w = obj;
        this.x = obj2;
        this.t = i;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ mj5(Object obj, Object obj2, int i, Object obj3, e1d e1dVar, rq3 rq3Var, int i2) {
        super(2, rq3Var);
        this.r = i2;
        this.u = obj;
        this.v = obj2;
        this.t = i;
        this.w = obj3;
        this.x = e1dVar;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public mj5(XmlPullParser xmlPullParser, rq3 rq3Var, fsf fsfVar, ArrayList arrayList) {
        super(2, rq3Var);
        this.r = 18;
        this.v = xmlPullParser;
        this.w = fsfVar;
        this.x = arrayList;
    }
}
