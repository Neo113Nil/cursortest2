package defpackage;

import android.content.Context;
import com.sofascore.results.event.EventActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class px6 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ wn1 c;

    public /* synthetic */ px6(Context context, wn1 wn1Var, int i) {
        this.a = i;
        this.b = context;
        this.c = wn1Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        wn1 wn1Var = this.c;
        switch (i) {
            case 0:
                Context context = this.b;
                nv.A(context, "open_event", null);
                wxf wxfVar = EventActivity.h0;
                wxf.B(context, wn1Var.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            case 1:
                Context context2 = this.b;
                nv.A(context2, "open_event", null);
                wxf wxfVar2 = EventActivity.h0;
                wxf.B(context2, wn1Var.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            default:
                Context context3 = this.b;
                nv.A(context3, "open_event", null);
                wxf wxfVar3 = EventActivity.h0;
                wxf.B(context3, wn1Var.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
        }
        return Unit.a;
    }
}
