package defpackage;

import android.content.Context;
import android.net.Uri;
import com.blaze.blazesdk.delegates.models.BlazePlaybackModificationRequest;
import com.blaze.blazesdk.delegates.models.BlazePlaybackModificationResponse;
import com.ironsource.Ua;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class m0n extends hoi implements Function2 {
    public int r;
    public final /* synthetic */ String s;
    public final /* synthetic */ yom t;
    public final /* synthetic */ String u;
    public final /* synthetic */ he2 v;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m0n(String str, yom yomVar, String str2, he2 he2Var, rq3 rq3Var) {
        super(2, rq3Var);
        this.s = str;
        this.t = yomVar;
        this.u = str2;
        this.v = he2Var;
    }

    @Override // defpackage.h21
    public final rq3 create(Object obj, rq3 rq3Var) {
        return new m0n(this.s, this.t, this.u, this.v, rq3Var);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Object obj, Object obj2) {
        return ((m0n) create((ku3) obj, (rq3) obj2)).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0083, code lost:
    
        if (r13 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00ac, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00aa, code lost:
    
        if (r13 == r0) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:56:0x0047, code lost:
    
        if (r14 == r0) goto L51;
     */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0062  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00b0  */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        uul uulVar;
        String str;
        int ordinal;
        String modifiedURL;
        lu3 lu3Var = lu3.a;
        int i = this.r;
        String str2 = this.s;
        if (i == 0) {
            y6a.M(obj);
            tul tulVar = jdm.d;
            if (tulVar != null && (uulVar = tulVar.a) != null && uulVar.q) {
                dzm dzmVar = new dzm(new BlazePlaybackModificationRequest(str2), null);
                this.r = 1;
                obj = wba.U(Ua.s, dzmVar, this);
            }
            str = str2;
            yom yomVar = this.t;
            ordinal = yomVar.d.ordinal();
            if (ordinal == 0) {
                bpm bpmVar = pf5.g;
                if (bpmVar != null) {
                    str.getClass();
                    String str3 = this.u;
                    str3.getClass();
                    he2 he2Var = this.v;
                    he2Var.getClass();
                    if (yomVar.b != null) {
                        long floatValue = (long) ((((int) (r14.floatValue() * 1000.0f)) * 3.0f) / 8.0f);
                        Context context = bpmVar.a;
                        context.getClass();
                        etl.b.getClass();
                        up4 up4Var = new up4();
                        up4Var.c = true;
                        eo4 eo4Var = new eo4(context, up4Var);
                        pe2 pe2Var = new pe2();
                        pe2Var.a = he2Var;
                        pe2Var.f = eo4Var;
                        pe2Var.d = new mtl();
                        pe2Var.g = 2;
                        hqm.b(Uri.parse(str), pe2Var, 0L, Long.valueOf(floatValue), str3);
                    }
                    return Unit.a;
                }
            } else if (ordinal == 1) {
                jgm jgmVar = pf5.h;
                if (jgmVar != null) {
                    this.r = 2;
                    hs4 hs4Var = z45.a;
                    Object R = xw3.R(hq4.c, new lim(jgmVar, this.v, str, this.u, null), this);
                    if (R != lu3Var) {
                        R = Unit.a;
                    }
                }
            } else {
                if (ordinal != 2) {
                    zzl.b();
                    return null;
                }
                s4m s4mVar = pf5.i;
                if (s4mVar != null) {
                    this.r = 3;
                    hs4 hs4Var2 = z45.a;
                    Object R2 = xw3.R(hq4.c, new adm(s4mVar, this.v, str, this.u, null), this);
                    if (R2 != lu3Var) {
                        R2 = Unit.a;
                    }
                }
            }
            return null;
        }
        if (i != 1) {
            if (i == 2) {
                y6a.M(obj);
                return Unit.a;
            }
            if (i == 3) {
                y6a.M(obj);
                return Unit.a;
            }
            a70.r("call to 'resume' before 'invoke' with coroutine");
            return null;
        }
        y6a.M(obj);
        BlazePlaybackModificationResponse blazePlaybackModificationResponse = (BlazePlaybackModificationResponse) obj;
        if (blazePlaybackModificationResponse != null && (modifiedURL = blazePlaybackModificationResponse.getModifiedURL()) != null) {
            str = modifiedURL;
            yom yomVar2 = this.t;
            ordinal = yomVar2.d.ordinal();
            if (ordinal == 0) {
            }
            return null;
        }
        str = str2;
        yom yomVar22 = this.t;
        ordinal = yomVar22.d.ordinal();
        if (ordinal == 0) {
        }
        return null;
    }
}
