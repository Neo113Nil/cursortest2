package ru.ozon.app.android.bank.widgets.adBanner.presentation;

import android.content.Context;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.bank.widgets.adBanner.data.AnalyticEventType;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.IconButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.image.ImageHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\b\u0000\u0018\u00002\u00020\u0001B=\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0018\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0004\u0012\u0012\u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000f\u001a\u00020\u00072\u0006\u0010\u000e\u001a\u00020\u0005¢\u0006\u0004\b\u000f\u0010\u0010R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0011R&\u0010\b\u001a\u0014\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0012R \u0010\u000b\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u0010\u0013R\u0018\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R \u0010\u0016\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0013R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0013¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemView;", "bannerItemView", "Lkotlin/Function2;", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;", "Lru/ozon/app/android/bank/widgets/adBanner/data/AnalyticEventType;", "", "trackAnalyticEvent", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "<init>", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemView;Lkotlin/jvm/functions/Function2;Lkotlin/jvm/functions/Function1;)V", "item", "bind", "(Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;)V", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemView;", "Lkotlin/jvm/functions/Function2;", "Lkotlin/jvm/functions/Function1;", "adBannerItemVO", "Lru/ozon/app/android/bank/widgets/adBanner/presentation/AdBannerItemVO;", "closeActionHandler", "buttonActionHandler", "ozonbank_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class AdBannerItemViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private AdBannerItemVO adBannerItemVO;

    @NotNull
    private final AdBannerItemView bannerItemView;

    @NotNull
    private final Function1<AtomAction, Unit> buttonActionHandler;

    @NotNull
    private final Function1<AtomAction, Unit> closeActionHandler;

    @NotNull
    private final Function2<AdBannerItemVO, AnalyticEventType, Unit> trackAnalyticEvent;

    @Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u0003H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "it", "Landroid/view/View;", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
    /* renamed from: ru.ozon.app.android.bank.widgets.adBanner.presentation.AdBannerItemViewHolder$1, reason: invalid class name */
    static final class AnonymousClass1 extends AbstractC7737t implements Function1<View, Unit> {
        AnonymousClass1() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        public /* bridge */ /* synthetic */ Unit invoke(View view) {
            invoke2(view);
            return Unit.f71690a;
        }

        /* renamed from: invoke, reason: avoid collision after fix types in other method */
        public final void invoke2(View it) {
            Intrinsics.checkNotNullParameter(it, "it");
            AdBannerItemVO adBannerItemVO = AdBannerItemViewHolder.this.adBannerItemVO;
            if (adBannerItemVO != null) {
                AdBannerItemViewHolder adBannerItemViewHolder = AdBannerItemViewHolder.this;
                adBannerItemViewHolder.trackAnalyticEvent.invoke(adBannerItemVO, AnalyticEventType.IMAGE_CLICK);
                AtomAction action = adBannerItemVO.getAction();
                if (action != null) {
                    adBannerItemViewHolder.actionHandler.invoke(action);
                }
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdBannerItemViewHolder(@NotNull AdBannerItemView bannerItemView, @NotNull Function2<? super AdBannerItemVO, ? super AnalyticEventType, Unit> trackAnalyticEvent, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        super(bannerItemView);
        Intrinsics.checkNotNullParameter(bannerItemView, "bannerItemView");
        Intrinsics.checkNotNullParameter(trackAnalyticEvent, "trackAnalyticEvent");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.bannerItemView = bannerItemView;
        this.trackAnalyticEvent = trackAnalyticEvent;
        this.actionHandler = actionHandler;
        this.closeActionHandler = new AdBannerItemViewHolder$closeActionHandler$1(this);
        this.buttonActionHandler = new AdBannerItemViewHolder$buttonActionHandler$1(this);
        ViewExtKt.setOnClickListenerThrottle$default(bannerItemView.getImage(), 0L, new AnonymousClass1(), 1, null);
        bannerItemView.getTitle().setTextIsSelectable(false);
        bannerItemView.getSubtitle().setTextIsSelectable(false);
    }

    public final void bind(@NotNull AdBannerItemVO item) {
        ImageDTO image;
        Intrinsics.checkNotNullParameter(item, "item");
        this.adBannerItemVO = item;
        Context context = this.bannerItemView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        if (ThemeExtKt.isDarkThemeActive(context)) {
            image = item.getImageDark();
            if (image == null) {
                image = item.getImage();
            }
        } else {
            image = item.getImage();
        }
        ImageHolderKt.bind$default(this.bannerItemView.getImage(), image, null, 2, null);
        TextHolderKt.bind$default(this.bannerItemView.getTitle(), item.getTitle(), null, 2, null);
        TextHolderKt.bindOrGone$default(this.bannerItemView.getSubtitle(), item.getSubtitle(), null, 2, null);
        IconButtonV3HolderKt.bindOrGone(this.bannerItemView.getCloseButton(), item.getCloseButton(), this.closeActionHandler);
        ButtonV3HolderKt.bindOrGone(this.bannerItemView.getButton(), item.getButton(), this.buttonActionHandler);
    }
}
