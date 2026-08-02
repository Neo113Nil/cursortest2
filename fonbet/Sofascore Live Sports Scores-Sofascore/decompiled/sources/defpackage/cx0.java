package defpackage;

import com.blaze.blazesdk.closed_captions.models.ui.e;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class cx0 extends hoi implements Function1 {
    public pc2 r;
    public int s;

    public cx0(rq3 rq3Var) {
        super(1, rq3Var);
    }

    @Override // defpackage.h21
    public final rq3 create(rq3 rq3Var) {
        return new cx0(rq3Var);
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        return new cx0((rq3) obj).invokeSuspend(Unit.a);
    }

    /* JADX WARN: Code restructure failed: missing block: B:23:0x007e, code lost:
    
        if (r1 == r0) goto L29;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x0054, code lost:
    
        if (r11 == r0) goto L29;
     */
    @Override // defpackage.h21
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(Object obj) {
        pc2 pc2Var;
        pc2 pc2Var2;
        Object a;
        pc2 pc2Var3;
        lu3 lu3Var = lu3.a;
        int i = this.s;
        if (i == 0) {
            y6a.M(obj);
            pc2 pc2Var4 = pc2.a;
            this.r = pc2Var4;
            this.s = 1;
            Object b = pc2Var4.b(this);
            if (b != lu3Var) {
                pc2Var = pc2Var4;
                obj = b;
            }
            return lu3Var;
        }
        if (i == 1) {
            pc2Var = this.r;
            y6a.M(obj);
        } else {
            if (i != 2) {
                if (i != 3) {
                    if (i != 4) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    pc2Var3 = this.r;
                    y6a.M(obj);
                    pc2Var3.getClass();
                    evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new dum("blaze_data_store_recently_selected_language_model_key", (e) obj, null), 1, null);
                    return Unit.a;
                }
                pc2 pc2Var5 = this.r;
                y6a.M(obj);
                a = obj;
                pc2Var2 = pc2Var5;
                this.r = pc2Var2;
                this.s = 4;
                Object y = rd0.y((z88) a, this);
                if (y != lu3Var) {
                    pc2 pc2Var6 = pc2Var2;
                    obj = y;
                    pc2Var3 = pc2Var6;
                    pc2Var3.getClass();
                    evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new dum("blaze_data_store_recently_selected_language_model_key", (e) obj, null), 1, null);
                    return Unit.a;
                }
                return lu3Var;
            }
            pc2Var = this.r;
            y6a.M(obj);
            e eVar = (e) obj;
            pc2Var.getClass();
            pc2.b = eVar;
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            evl.dispatchOnIO$default(blazeSDK, null, new dum("blaze_data_store_selected_language_model_key", eVar, null), 1, null);
            if (eVar != null) {
                evl.dispatchOnIO$default(blazeSDK, null, new dum("blaze_data_store_recently_selected_language_model_key", eVar, null), 1, null);
            }
            pc2Var2 = pc2.a;
            this.r = pc2Var2;
            this.s = 3;
            a = pc2Var2.a(this);
        }
        this.r = pc2Var;
        this.s = 2;
        obj = rd0.y((z88) obj, this);
    }
}
