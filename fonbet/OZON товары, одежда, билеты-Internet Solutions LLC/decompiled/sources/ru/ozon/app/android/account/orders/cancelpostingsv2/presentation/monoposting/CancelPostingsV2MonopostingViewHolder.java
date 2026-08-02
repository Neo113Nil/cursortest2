package ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting;

import AS.a;
import Ey.ViewOnClickListenerC2975b;
import W10.c;
import WZ.l;
import WZ.m;
import WZ.t;
import android.content.Context;
import android.view.View;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.RefreshWithSelectedIdsHandler;
import ru.ozon.app.android.account.orders.cancelpostingsv2.presentation.monoposting.MonopostingVO;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.cs_orders.databinding.WidgetCancelPostingsV2MonopostingBinding;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.af.AtomsAdapter;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u0011\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ)\u0010\u0015\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0012\u001a\u00020\u00112\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u001f\u0010\u0019\u001a\u00020\r2\u0006\u0010\u0010\u001a\u00020\u00022\u0006\u0010\u0018\u001a\u00020\u0017H\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001bR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001cR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010\u001dR \u0010 \u001a\u000e\u0012\u0004\u0012\u00020\u001f\u0012\u0004\u0012\u00020\r0\u001e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u0014\u0010#\u001a\u00020\"8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/CancelPostingsV2MonopostingViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/MonopostingVO;", "Lru/ozon/app/android/cs_orders/databinding/WidgetCancelPostingsV2MonopostingBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;", "refreshWithSelectedIdsHandler", "LWZ/l;", "tokenizedAnalytics", "<init>", "(Lru/ozon/app/android/cs_orders/databinding/WidgetCancelPostingsV2MonopostingBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;LWZ/l;)V", "", "clickToPriceUpView", "()Lkotlin/Unit;", "item", "LW10/c;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "viewedPond", "trackView", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/MonopostingVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/monoposting/MonopostingVO;Ll20/d;)V", "Lru/ozon/app/android/cs_orders/databinding/WidgetCancelPostingsV2MonopostingBinding;", "Lru/ozon/app/android/account/orders/cancelpostingsv2/presentation/RefreshWithSelectedIdsHandler;", "LWZ/l;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "titleRowAdapter", "Lru/ozon/uni/atoms/af/AtomsAdapter;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class CancelPostingsV2MonopostingViewHolder extends k<MonopostingVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetCancelPostingsV2MonopostingBinding binding;

    @NotNull
    private final RefreshWithSelectedIdsHandler refreshWithSelectedIdsHandler;

    @NotNull
    private final AtomsAdapter titleRowAdapter;

    @NotNull
    private final l tokenizedAnalytics;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public CancelPostingsV2MonopostingViewHolder(@NotNull WidgetCancelPostingsV2MonopostingBinding binding, @NotNull ComposerReferences refs, @NotNull RefreshWithSelectedIdsHandler refreshWithSelectedIdsHandler, @NotNull l tokenizedAnalytics) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(refreshWithSelectedIdsHandler, "refreshWithSelectedIdsHandler");
        Intrinsics.checkNotNullParameter(tokenizedAnalytics, "tokenizedAnalytics");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.refreshWithSelectedIdsHandler = refreshWithSelectedIdsHandler;
        this.tokenizedAnalytics = tokenizedAnalytics;
        Function1<AtomAction, Unit> buildHandler = new ActionHandler.Builder(refs, this).onClick(new CancelPostingsV2MonopostingViewHolder$actionHandler$1(this)).buildHandler();
        this.actionHandler = buildHandler;
        AtomsAdapter atomsAdapter = new AtomsAdapter(null, null, null, null, 15, null);
        atomsAdapter.setOnAction(buildHandler);
        this.titleRowAdapter = atomsAdapter;
        binding.getConstraintLayout().setOnClickListener(new a(this, 13));
        binding.priceUpIcon.setOnClickListener(new ViewOnClickListenerC2975b(this, 12));
        binding.priceUpTv.setOnClickListener(new AU.a(this, 10));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(CancelPostingsV2MonopostingViewHolder cancelPostingsV2MonopostingViewHolder, View view) {
        AtomAction action;
        MonopostingVO boundData = cancelPostingsV2MonopostingViewHolder.getBoundData();
        if (boundData == null || (action = boundData.getAction()) == null) {
            return;
        }
        cancelPostingsV2MonopostingViewHolder.actionHandler.invoke(action);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Unit clickToPriceUpView() {
        MonopostingVO.PriceIncreaseInfoVO priceIncreaseInfo;
        AtomAction action;
        MonopostingVO boundData = getBoundData();
        if (boundData == null || (priceIncreaseInfo = boundData.getPriceIncreaseInfo()) == null || (action = priceIncreaseInfo.getAction()) == null) {
            return null;
        }
        this.actionHandler.invoke(action);
        return Unit.f71690a;
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull MonopostingVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        this.binding.checkboxV.setSelected(item.getIsSelected());
        this.binding.titleRowFlexAL.setAdapter(this.titleRowAdapter);
        AtomsAdapter atomsAdapter = this.titleRowAdapter;
        Context context = getContext();
        AtomDTO[] elements = {item.getTitleAtom(), item.getTitleBadge()};
        Intrinsics.checkNotNullParameter(elements, "elements");
        atomsAdapter.bind(context, C7705l.B(elements));
        AppCompatTextView infoTv = this.binding.infoTv;
        Intrinsics.checkNotNullExpressionValue(infoTv, "infoTv");
        TextViewExtKt.setTextOrGone(infoTv, item.getInfo());
        this.binding.subtitleTv.setText(item.getSubtitle());
        Image imageIv = this.binding.imageIv;
        Intrinsics.checkNotNullExpressionValue(imageIv, "imageIv");
        ImageHolderKt.bind$default(imageIv, item.getImage(), null, 2, null);
        BadgeView imageBadgeBv = this.binding.imageBadgeBv;
        Intrinsics.checkNotNullExpressionValue(imageBadgeBv, "imageBadgeBv");
        BadgeHolderKt.bindOrGone(imageBadgeBv, item.getImageBadge(), this.actionHandler);
        TextAtomV2View priceUpTv = this.binding.priceUpTv;
        Intrinsics.checkNotNullExpressionValue(priceUpTv, "priceUpTv");
        MonopostingVO.PriceIncreaseInfoVO priceIncreaseInfo = item.getPriceIncreaseInfo();
        TextHolderKt.bindOrGone$default(priceUpTv, priceIncreaseInfo != null ? priceIncreaseInfo.getTitle() : null, null, 2, null);
        IconView priceUpIcon = this.binding.priceUpIcon;
        Intrinsics.checkNotNullExpressionValue(priceUpIcon, "priceUpIcon");
        MonopostingVO.PriceIncreaseInfoVO priceIncreaseInfo2 = item.getPriceIncreaseInfo();
        IconHolderKt.bindOrGone$default(priceUpIcon, priceIncreaseInfo2 != null ? priceIncreaseInfo2.getIcon() : null, null, 2, null);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull MonopostingVO item, @NotNull c trackingData, f viewedPond) {
        t trackingEvent;
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((CancelPostingsV2MonopostingViewHolder) item, trackingData, viewedPond);
        MonopostingVO.PriceIncreaseInfoVO priceIncreaseInfo = item.getPriceIncreaseInfo();
        if (priceIncreaseInfo == null || (trackingEvent = priceIncreaseInfo.getTrackingEvent()) == null) {
            return;
        }
        m.c(this.tokenizedAnalytics, trackingEvent, null);
    }
}
