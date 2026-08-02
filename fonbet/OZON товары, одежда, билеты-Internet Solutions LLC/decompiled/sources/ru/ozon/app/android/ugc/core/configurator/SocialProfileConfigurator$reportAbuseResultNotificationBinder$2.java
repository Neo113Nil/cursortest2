package ru.ozon.app.android.ugc.core.configurator;

import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.pdp.ui.configurators.ugc.ReportAbuseResultNotificationBinder;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "Lru/ozon/app/android/pdp/ui/configurators/ugc/ReportAbuseResultNotificationBinder;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class SocialProfileConfigurator$reportAbuseResultNotificationBinder$2 extends AbstractC7737t implements Function0<ReportAbuseResultNotificationBinder> {
    final /* synthetic */ SocialProfileConfigurator this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SocialProfileConfigurator$reportAbuseResultNotificationBinder$2(SocialProfileConfigurator socialProfileConfigurator) {
        super(0);
        this.this$0 = socialProfileConfigurator;
    }

    @Override // kotlin.jvm.functions.Function0
    public final ReportAbuseResultNotificationBinder invoke() {
        return new ReportAbuseResultNotificationBinder(this.this$0.getReferences(), this.this$0.getOwner());
    }
}
