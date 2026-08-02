package ru.ozon.app.android.session.userAdultModalMobile.presentation;

import WZ.t;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
final class AdultConfirmationViewHolder$setupUrlSpan$1 extends AbstractC7737t implements Function1<String, Object> {
    final /* synthetic */ TextAtom $this_setupUrlSpan;
    final /* synthetic */ long $voId;
    final /* synthetic */ AdultConfirmationViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    AdultConfirmationViewHolder$setupUrlSpan$1(TextAtom textAtom, long j11, AdultConfirmationViewHolder adultConfirmationViewHolder) {
        super(1);
        this.$this_setupUrlSpan = textAtom;
        this.$voId = j11;
        this.this$0 = adultConfirmationViewHolder;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(String it) {
        t tokenizedEvent$default;
        ComposerReferences composerReferences;
        Intrinsics.checkNotNullParameter(it, "it");
        Map<String, TokenizedTrackingInfo> trackingInfo = this.$this_setupUrlSpan.getTrackingInfo();
        if (trackingInfo != null && (tokenizedEvent$default = TrackingInfoMapperKt.toTokenizedEvent$default(trackingInfo, Long.valueOf(this.$voId), null, 2, null)) != null) {
            composerReferences = this.this$0.refs;
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(composerReferences.getTokenizedAnalytics(), tokenizedEvent$default, null, 2, null);
        }
        return Boolean.FALSE;
    }
}
