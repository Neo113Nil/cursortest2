package defpackage;

import android.content.Context;
import com.sofascore.results.team.TeamActivity;
import com.vungle.ads.internal.protos.Sdk;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vva implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Context b;
    public final /* synthetic */ v75 c;

    public /* synthetic */ vva(Context context, v75 v75Var, int i) {
        this.a = i;
        this.b = context;
        this.c = v75Var;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        v75 v75Var = this.c;
        switch (i) {
            case 0:
                int i2 = TeamActivity.Z;
                jle.r(this.b, v75Var.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
            default:
                int i3 = TeamActivity.Z;
                jle.r(this.b, v75Var.a, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                break;
        }
        return Unit.a;
    }
}
