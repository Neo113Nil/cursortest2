package ru.ozon.app.android.pdp.widgets.seller.presentation;

import WZ.t;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.C7735q;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.data.cells.CellAtom;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.composer.throttle.HandlersInhibitor;
import ru.ozon.app.android.pdp.databinding.PdpWidgetSellerBinding;
import ru.ozon.app.android.pdp.ui.configurators.base.BindingWidgetViewHolder;
import ru.ozon.app.android.pdp.widgets.seller.presentation.SellerViewHolder;
import ru.ozon.app.android.seller.sellerTag.presentation.SellerTagAdapter;
import ru.ozon.app.android.seller.sellerTag.presentation.SellerTagVO;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.af.layout.VerticalAtomsLayout;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0001\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\u001f\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\u0010\u001a\u00020\u000f2\u000e\u0010\u000e\u001a\n\u0012\u0004\u0012\u00020\r\u0018\u00010\fH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0014\u001a\u00020\u000f2\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J!\u0010\u0018\u001a\u00020\u000f2\b\u0010\u0016\u001a\u0004\u0018\u00010\u00122\u0006\u0010\u0017\u001a\u00020\u0012H\u0002¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\u001d\u0010\u001cJ\u0017\u0010 \u001a\u00020\u000f2\u0006\u0010\u001f\u001a\u00020\u001eH\u0002¢\u0006\u0004\b \u0010!J\u001d\u0010$\u001a\u00020\u000f2\f\u0010#\u001a\b\u0012\u0004\u0012\u00020\"0\fH\u0002¢\u0006\u0004\b$\u0010\u0011J\u0019\u0010'\u001a\u00020\u000f2\b\u0010&\u001a\u0004\u0018\u00010%H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010)\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u0002H\u0002¢\u0006\u0004\b)\u0010\u001cJ\u001f\u0010,\u001a\u00020\u000f2\u0006\u0010\u001a\u001a\u00020\u00022\u0006\u0010+\u001a\u00020*H\u0014¢\u0006\u0004\b,\u0010-R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u00100R \u00103\u001a\u000e\u0012\u0004\u0012\u000202\u0012\u0004\u0012\u00020\u000f018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u00104R\u0014\u00106\u001a\u0002058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0018\u0010\u001a\u001a\u0004\u0018\u00010\u00028\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u00108¨\u00069"}, d2 = {"Lru/ozon/app/android/pdp/widgets/seller/presentation/SellerViewHolder;", "Lru/ozon/app/android/pdp/ui/configurators/base/BindingWidgetViewHolder;", "Lru/ozon/app/android/pdp/widgets/seller/presentation/SellerVO;", "Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerBinding;", "Landroid/view/View;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/composer/throttle/HandlersInhibitor;", "inhibitor", "<init>", "(Landroid/view/View;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/composer/throttle/HandlersInhibitor;)V", "", "Lru/ozon/app/android/seller/sellerTag/presentation/SellerTagVO;", "tags", "", "bindTags", "(Ljava/util/List;)V", "", "banner", "bindBanner", "(Ljava/lang/String;)V", "logo", "logoPlaceholder", "bindLogo", "(Ljava/lang/String;Ljava/lang/String;)V", "item", "bindPremiumBadge", "(Lru/ozon/app/android/pdp/widgets/seller/presentation/SellerVO;)V", "bindTitle", "Lru/ozon/uni/atoms/data/text/TextDTO;", AppMeasurementSdk.ConditionalUserProperty.NAME, "bindName", "(Lru/ozon/uni/atoms/data/text/TextDTO;)V", "Lru/ozon/app/android/atoms/data/cells/CellAtom$CellAtomWithSubtitle$CellWithSubtitleDefault;", "cells", "bindCells", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "askQuestionButton", "bindAskQuestionButton", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;)V", "bindFavoriteButton", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/pdp/widgets/seller/presentation/SellerVO;Ll20/d;)V", "Landroid/view/View;", "getContainerView", "()Landroid/view/View;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/seller/sellerTag/presentation/SellerTagAdapter;", "tagsAdapter", "Lru/ozon/app/android/seller/sellerTag/presentation/SellerTagAdapter;", "Lru/ozon/app/android/pdp/widgets/seller/presentation/SellerVO;", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SellerViewHolder extends BindingWidgetViewHolder<SellerVO, PdpWidgetSellerBinding> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final View containerView;
    private SellerVO item;

    @NotNull
    private final SellerTagAdapter tagsAdapter;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.seller.presentation.SellerViewHolder$1, reason: invalid class name */
    /* synthetic */ class AnonymousClass1 extends C7735q implements Function1<View, PdpWidgetSellerBinding> {
        public static final AnonymousClass1 INSTANCE = new AnonymousClass1();

        AnonymousClass1() {
            super(1, PdpWidgetSellerBinding.class, "bind", "bind(Landroid/view/View;)Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerBinding;", 0);
        }

        @Override // kotlin.jvm.functions.Function1
        public final PdpWidgetSellerBinding invoke(View p02) {
            Intrinsics.checkNotNullParameter(p02, "p0");
            return PdpWidgetSellerBinding.bind(p02);
        }
    }

    @Metadata(d1 = {"\u0000\f\n\u0000\n\u0002\u0010\u0002\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u0001*\u00020\u0002H\n¢\u0006\u0002\b\u0003"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/pdp/databinding/PdpWidgetSellerBinding;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.pdp.widgets.seller.presentation.SellerViewHolder$2, reason: invalid class name */
    static final class AnonymousClass2 extends AbstractC7737t implements Function1<PdpWidgetSellerBinding, Unit> {
        final /* synthetic */ ComposerReferences $refs;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        AnonymousClass2(ComposerReferences composerReferences) {
            super(1);
            this.$refs = composerReferences;
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final void invoke$lambda$4(SellerViewHolder sellerViewHolder, ComposerReferences composerReferences, View view) {
            t tokenizedEvent;
            AtomAction action;
            SellerVO sellerVO = sellerViewHolder.item;
            if (sellerVO != null && (action = sellerVO.getAction()) != null) {
                sellerViewHolder.actionHandler.invoke(action);
            }
            SellerVO sellerVO2 = sellerViewHolder.item;
            if (sellerVO2 == null || (tokenizedEvent = sellerVO2.getTokenizedEvent()) == null) {
                return;
            }
            TokenizedAnalyticsExtensionsKt.processNonViewEvents$default(composerReferences.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(PdpWidgetSellerBinding pdpWidgetSellerBinding) {
            invoke2(pdpWidgetSellerBinding);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(PdpWidgetSellerBinding binding) {
            Intrinsics.checkNotNullParameter(binding, "$this$binding");
            RecyclerView recyclerView = binding.tagsRv;
            recyclerView.setAdapter(SellerViewHolder.this.tagsAdapter);
            recyclerView.addItemDecoration(new SellerTagDecoration());
            VerticalAtomsLayout verticalAtomsLayout = binding.cellsVAL;
            AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
            atomsAdapter.setOnAction(SellerViewHolder.this.actionHandler);
            verticalAtomsLayout.setAdapter(atomsAdapter);
            ConstraintLayout constraintLayout = binding.rootCl;
            final SellerViewHolder sellerViewHolder = SellerViewHolder.this;
            final ComposerReferences composerReferences = this.$refs;
            constraintLayout.setOnClickListener(new View.OnClickListener() { // from class: ru.ozon.app.android.pdp.widgets.seller.presentation.a
                @Override // android.view.View.OnClickListener
                public final void onClick(View view) {
                    SellerViewHolder.AnonymousClass2.invoke$lambda$4(SellerViewHolder.this, composerReferences, view);
                }
            });
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SellerViewHolder(@NotNull View containerView, @NotNull ComposerReferences refs, @NotNull HandlersInhibitor inhibitor) {
        super(containerView, AnonymousClass1.INSTANCE);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(inhibitor, "inhibitor");
        this.containerView = containerView;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).enableClickThrottling(inhibitor).buildHandler();
        this.actionHandler = buildHandler;
        this.tagsAdapter = new SellerTagAdapter(buildHandler);
        binding(new AnonymousClass2(refs));
    }

    private final void bindAskQuestionButton(ButtonV3Atom.SmallButton askQuestionButton) {
        SmallButtonView askQuestionBtn = getBinding().askQuestionBtn;
        Intrinsics.checkNotNullExpressionValue(askQuestionBtn, "askQuestionBtn");
        WrappedButtonHolderKt.bindOrGone(askQuestionBtn, askQuestionButton, this.actionHandler);
    }

    private final void bindBanner(String banner) {
        binding(new SellerViewHolder$bindBanner$1(banner));
    }

    private final void bindCells(List<CellAtom.CellAtomWithSubtitle.CellWithSubtitleDefault> cells) {
        AtomsAdapter adapter = getBinding().cellsVAL.getAdapter();
        if (adapter != null) {
            adapter.bind(getContext(), cells);
        }
    }

    private final void bindFavoriteButton(SellerVO item) {
        getBinding().favoriteButtonPfmbv.bindFavoriteOrGone(item.getFavoriteButton());
    }

    private final void bindLogo(String logo, String logoPlaceholder) {
        binding(new SellerViewHolder$bindLogo$1(logo, logoPlaceholder));
    }

    private final void bindName(TextDTO name) {
        TextAtomV2View nameTv = getBinding().nameTv;
        Intrinsics.checkNotNullExpressionValue(nameTv, "nameTv");
        TextHolderKt.bind$default(nameTv, name, null, 2, null);
    }

    private final void bindPremiumBadge(SellerVO item) {
        BadgeView premiumBadgeBv = getBinding().premiumBadgeBv;
        Intrinsics.checkNotNullExpressionValue(premiumBadgeBv, "premiumBadgeBv");
        BadgeHolderKt.bindOrGone$default(premiumBadgeBv, item.getPremiumBadge(), (Function1) null, 2, (Object) null);
    }

    private final void bindTags(List<SellerTagVO> tags) {
        binding(new SellerViewHolder$bindTags$1(tags, this));
    }

    private final void bindTitle(SellerVO item) {
        TextAtomV2View titleTav = getBinding().titleTav;
        Intrinsics.checkNotNullExpressionValue(titleTav, "titleTav");
        TextHolderKt.bindOrGone$default(titleTav, item.getTitle(), null, 2, null);
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull SellerVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.item = item;
        bindBanner(item.getBanner());
        bindLogo(item.getLogo(), item.getLogoPlaceholder());
        bindPremiumBadge(item);
        bindTitle(item);
        bindName(item.getName());
        bindTags(item.getTags());
        bindCells(item.getCells());
        bindAskQuestionButton(item.getAskQuestionButton());
        bindFavoriteButton(item);
    }
}
