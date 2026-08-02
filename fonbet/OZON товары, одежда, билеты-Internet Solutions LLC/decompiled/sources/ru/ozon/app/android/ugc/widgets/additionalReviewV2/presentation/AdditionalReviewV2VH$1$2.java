package ru.ozon.app.android.ugc.widgets.additionalReviewV2.presentation;

import HS.a;
import Ve.C4598rp;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import ru.ozon.app.android.ugc.databinding.WidgetAdditionalReviewV2Binding;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.AtomActionMapperKt;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.rating.RatingDTO;

@Metadata(d1 = {"\u0000\u0015\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001J\u0011\u0010\u0004\u001a\u00020\u00032\u0006\u0010\u0005\u001a\u00020\u0002H\u0096\u0002¨\u0006\u0006"}, d2 = {"ru/ozon/app/android/ugc/widgets/additionalReviewV2/presentation/AdditionalReviewV2VH$1$2", "Lkotlin/Function1;", "", "", "invoke", "rating", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AdditionalReviewV2VH$1$2 implements Function1<Integer, Unit> {
    final /* synthetic */ WidgetAdditionalReviewV2Binding $this_with;
    final /* synthetic */ AdditionalReviewV2VH this$0;

    AdditionalReviewV2VH$1$2(AdditionalReviewV2VH additionalReviewV2VH, WidgetAdditionalReviewV2Binding widgetAdditionalReviewV2Binding) {
        this.this$0 = additionalReviewV2VH;
        this.$this_with = widgetAdditionalReviewV2Binding;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$2$lambda$1$lambda$0(AdditionalReviewV2VH additionalReviewV2VH, AtomAction atomAction) {
        Function1 function1;
        function1 = additionalReviewV2VH.actionHandler;
        function1.invoke(atomAction);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(Integer num) {
        invoke(num.intValue());
        return Unit.f71690a;
    }

    public void invoke(int rating) {
        RatingDTO rating2;
        CommonControlSettings common;
        AdditionalReviewV2VO boundData = this.this$0.getBoundData();
        if (boundData == null || (rating2 = boundData.getRating()) == null || (common = rating2.getCommon()) == null) {
            return;
        }
        WidgetAdditionalReviewV2Binding widgetAdditionalReviewV2Binding = this.$this_with;
        AdditionalReviewV2VH additionalReviewV2VH = this.this$0;
        AtomActionDTO action = common.getAction();
        if (action != null) {
            widgetAdditionalReviewV2Binding.getConstraintLayout().post(new a(1, additionalReviewV2VH, AtomActionMapperKt.toAtomAction(AtomActionDTO.copy$default(action, null, C4598rp.c(rating, action.getLink(), "?selectedRating="), null, null, null, 29, null), common.getTrackingInfo())));
        }
    }
}
