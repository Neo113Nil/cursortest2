package defpackage;

import android.content.Context;
import com.sofascore.results.event.EventActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class yel implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ xel c;

    public /* synthetic */ yel(Context context, xel xelVar, int i) {
        this.a = i;
        this.b = context;
        this.c = xelVar;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        xel xelVar = this.c;
        switch (i) {
            case 0:
                wxf wxfVar = EventActivity.h0;
                wxf.B(this.b, xelVar.a.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            default:
                wxf wxfVar2 = EventActivity.h0;
                wxf.B(this.b, xelVar.a.a, null, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
        }
        return Unit.a;
    }
}
