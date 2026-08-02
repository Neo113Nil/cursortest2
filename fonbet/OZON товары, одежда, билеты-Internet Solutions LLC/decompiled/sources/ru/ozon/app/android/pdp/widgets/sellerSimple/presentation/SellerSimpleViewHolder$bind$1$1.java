package ru.ozon.app.android.pdp.widgets.sellerSimple.presentation;

import WZ.t;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pdp.databinding.PdpWidgetSellerSimpleBinding;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.avatar.AvatarView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.avatar.Avatar;
import ru.ozon.uni.atoms.v3.holders.avatar.AvatarHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerSimpleBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
final class SellerSimpleViewHolder$bind$1$1 extends AbstractC7737t implements Function1<PdpWidgetSellerSimpleBinding, Unit> {
    final /* synthetic */ SellerSimpleVo $item;
    final /* synthetic */ SellerSimpleVo $this_with;
    final /* synthetic */ SellerSimpleViewHolder this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    SellerSimpleViewHolder$bind$1$1(SellerSimpleVo sellerSimpleVo, SellerSimpleViewHolder sellerSimpleViewHolder, SellerSimpleVo sellerSimpleVo2) {
        super(1);
        this.$this_with = sellerSimpleVo;
        this.this$0 = sellerSimpleViewHolder;
        this.$item = sellerSimpleVo2;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void invoke$lambda$1(SellerSimpleVo sellerSimpleVo, SellerSimpleViewHolder sellerSimpleViewHolder, View view) {
        ComposerReferences composerReferences;
        Function1 function1;
        AtomAction action = sellerSimpleVo.getAction();
        if (action != null) {
            function1 = sellerSimpleViewHolder.actionHandler;
            function1.invoke(action);
        }
        t tokenizedEvent = sellerSimpleVo.getTokenizedEvent();
        if (tokenizedEvent != null) {
            composerReferences = sellerSimpleViewHolder.refs;
            TokenizedAnalyticsExtensionsKt.processClickEvents$default(composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetSellerSimpleBinding pdpWidgetSellerSimpleBinding) {
        invoke2(pdpWidgetSellerSimpleBinding);
        return Unit.f71690a;
    }

    /* renamed from: invoke, reason: avoid collision after fix types in other method */
    public final void invoke2(PdpWidgetSellerSimpleBinding binding) {
        Avatar orEmpty;
        Intrinsics.checkNotNullParameter(binding, "$this$binding");
        TextAtomV2View sellerTypeTav = binding.sellerTypeTav;
        Intrinsics.checkNotNullExpressionValue(sellerTypeTav, "sellerTypeTav");
        TextHolderKt.bindOrGone$default(sellerTypeTav, this.$this_with.getPersonType(), null, 2, null);
        TextAtomV2View sellerNameTav = binding.sellerNameTav;
        Intrinsics.checkNotNullExpressionValue(sellerNameTav, "sellerNameTav");
        TextHolderKt.bindOrGone$default(sellerNameTav, this.$this_with.getSellerName(), null, 2, null);
        TextAtomV2View dateTav = binding.dateTav;
        Intrinsics.checkNotNullExpressionValue(dateTav, "dateTav");
        TextHolderKt.bindOrGone$default(dateTav, this.$this_with.getDateText(), null, 2, null);
        AvatarView userAv = binding.userAv;
        Intrinsics.checkNotNullExpressionValue(userAv, "userAv");
        orEmpty = this.this$0.orEmpty(this.$this_with.getAvatar());
        AvatarHolderKt.bind$default(userAv, orEmpty, null, 2, null);
        ConstraintLayout constraintLayout = binding.rootCl;
        final SellerSimpleVo sellerSimpleVo = this.$item;
        final SellerSimpleViewHolder sellerSimpleViewHolder = this.this$0;
        constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdp.widgets.sellerSimple.presentation.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                SellerSimpleViewHolder$bind$1$1.invoke$lambda$1(SellerSimpleVo.this, sellerSimpleViewHolder, view);
            }
        });
    }
}
