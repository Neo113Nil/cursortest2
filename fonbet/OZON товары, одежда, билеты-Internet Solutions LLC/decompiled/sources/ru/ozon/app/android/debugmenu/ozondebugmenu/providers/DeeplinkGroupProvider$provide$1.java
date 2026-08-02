package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import GZ.g;
import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import r20.C9164a;
import ru.ozon.debugMenu.internal.presentation.OzonDebugMenuActivity;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "context", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class DeeplinkGroupProvider$provide$1 extends AbstractC7737t implements Function2<String, Context, Unit> {
    final /* synthetic */ DeeplinkGroupProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    DeeplinkGroupProvider$provide$1(DeeplinkGroupProvider deeplinkGroupProvider) {
        super(2);
        this.this$0 = deeplinkGroupProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(String str, Context context) {
        invoke2(str, context);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(String value, Context context) {
        g gVar;
        String modifyTechDeeplink;
        Intrinsics.checkNotNullParameter(value, "value");
        Intrinsics.checkNotNullParameter(context, "context");
        C9164a c9164a = C9164a.f82858a;
        Intrinsics.checkNotNullParameter(context, "context");
        OzonDebugMenuActivity ozonDebugMenuActivity = context instanceof OzonDebugMenuActivity ? (OzonDebugMenuActivity) context : null;
        if (ozonDebugMenuActivity != null) {
            ozonDebugMenuActivity.finish();
        }
        gVar = this.this$0.ozonRouter;
        modifyTechDeeplink = this.this$0.modifyTechDeeplink(value);
        g.a.a(gVar, modifyTechDeeplink, null, null, 6);
    }
}
