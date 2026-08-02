package ru.ozon.app.android.common.filterWidgets.filters.presentation;

import B0.C2454a;
import WZ.e;
import WZ.l;
import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import l10.InterfaceC7851b;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
final class TextInputFilterRefreshHandler$invoke$1$1$1 extends AbstractC7737t implements Function0<Unit> {
    final /* synthetic */ AtomAction $action;
    final /* synthetic */ String $it;
    final /* synthetic */ String $link;
    final /* synthetic */ String $value;
    final /* synthetic */ TextInputFilterRefreshHandler this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    TextInputFilterRefreshHandler$invoke$1$1$1(TextInputFilterRefreshHandler textInputFilterRefreshHandler, String str, String str2, String str3, AtomAction atomAction) {
        super(0);
        this.this$0 = textInputFilterRefreshHandler;
        this.$link = str;
        this.$value = str2;
        this.$it = str3;
        this.$action = atomAction;
    }

    @Override // kotlin.jvm.functions.Function0
    public /* bridge */ /* synthetic */ Unit invoke() {
        invoke2();
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2() {
        ComposerReferences composerReferences;
        String modifyUrl;
        Long l11;
        ComposerReferences composerReferences2;
        e modifyAnalyticsData;
        composerReferences = this.this$0.refs;
        InterfaceC7851b controller = composerReferences.getController();
        modifyUrl = this.this$0.modifyUrl(this.$link, this.$value);
        InterfaceC7851b.a.a(controller, modifyUrl, C2454a.b("originalUrl", this.$it), null, null, 12);
        Map<String, TokenizedTrackingInfo> trackingInfo = ((AtomAction.Refresh) this.$action).getTrackingInfo();
        if (trackingInfo != null) {
            l11 = this.this$0.voId;
            t mapToTokenizedEvent$default = TrackingInfoMapperKt.mapToTokenizedEvent$default(trackingInfo, l11, null, 2, null);
            if (mapToTokenizedEvent$default != null) {
                TextInputFilterRefreshHandler textInputFilterRefreshHandler = this.this$0;
                String str = this.$value;
                composerReferences2 = textInputFilterRefreshHandler.refs;
                l tokenizedAnalytics = composerReferences2.getTokenizedAnalytics();
                modifyAnalyticsData = textInputFilterRefreshHandler.modifyAnalyticsData(str);
                TokenizedAnalyticsExtensionsKt.processNonViewEvents(tokenizedAnalytics, mapToTokenizedEvent$default, modifyAnalyticsData);
            }
        }
    }
}
