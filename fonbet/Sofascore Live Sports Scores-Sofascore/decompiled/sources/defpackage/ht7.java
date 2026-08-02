package defpackage;

import android.content.Context;
import com.sofascore.results.event.EventActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class ht7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ ux6 c;

    public /* synthetic */ ht7(Context context, ux6 ux6Var, int i) {
        this.a = i;
        this.b = context;
        this.c = ux6Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ux6 ux6Var = this.c;
        switch (i) {
            case 0:
                wxf wxfVar = EventActivity.h0;
                wxf.B(this.b, ux6Var.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 1:
                wxf wxfVar2 = EventActivity.h0;
                wxf.B(this.b, ux6Var.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
            case 2:
                wxf wxfVar3 = EventActivity.h0;
                Integer valueOf = ux6Var != null ? Integer.valueOf(ux6Var.a) : null;
                if (valueOf != null) {
                    wxf.B(this.b, valueOf.intValue(), null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                    return Unit.a;
                }
                a70.r("Required value was null.");
                return null;
            default:
                wxf wxfVar4 = EventActivity.h0;
                wxf.B(this.b, ux6Var.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                return Unit.a;
        }
    }
}
