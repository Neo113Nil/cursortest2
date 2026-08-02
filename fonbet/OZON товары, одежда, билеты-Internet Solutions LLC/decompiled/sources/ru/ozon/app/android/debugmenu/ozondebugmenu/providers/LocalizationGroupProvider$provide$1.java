package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import android.content.Context;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.account.locale.app.data.LocalizationDebugPreferences;

@Metadata(d1 = {"\u0000\u0014\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n¢\u0006\u0002\b\u0006"}, d2 = {"<anonymous>", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "<unused var>", "Landroid/content/Context;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class LocalizationGroupProvider$provide$1 extends AbstractC7737t implements Function2<Boolean, Context, Unit> {
    final /* synthetic */ LocalizationGroupProvider this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    LocalizationGroupProvider$provide$1(LocalizationGroupProvider localizationGroupProvider) {
        super(2);
        this.this$0 = localizationGroupProvider;
    }

    @Override // kotlin.jvm.functions.Function2
    public /* bridge */ /* synthetic */ Unit invoke(Boolean bool, Context context) {
        invoke(bool.booleanValue(), context);
        return Unit.f71690a;
    }

    public final void invoke(boolean z11, Context context) {
        LocalizationDebugPreferences localizationDebugPreferences;
        Intrinsics.checkNotNullParameter(context, "<unused var>");
        localizationDebugPreferences = this.this$0.localizationDebugPreferences;
        localizationDebugPreferences.setDebugLocaleEnabled(z11);
    }
}
