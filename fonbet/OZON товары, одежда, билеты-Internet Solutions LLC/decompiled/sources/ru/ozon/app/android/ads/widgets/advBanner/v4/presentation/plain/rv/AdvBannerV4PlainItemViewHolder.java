package ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv;

import android.content.Context;
import android.graphics.drawable.Drawable;
import android.view.View;
import jk0.j;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ads.flags.AdvBannerV4LoadOptimizationFlag;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.model.AdvBannerV4ItemVO;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.AdvBannerV4PlainItemViewHolder;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.view.AdvBannerV4ImageView;
import ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.view.AdvBannerV4PlainItemView;
import ru.ozon.app.android.network.abtool.FeatureChecker;
import ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.dsBadge.BadgeHolderKt;
import xe.B0;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000Q\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0003*\u0001\u0016\b\u0000\u0018\u00002\u00060\u0001j\u0002`\u0002BU\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005\u0012\f\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t\u0012\u0012\u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u0005\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u0017\u0010\u0014\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u000f\u0010\u0019\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u001f\u0010\u001d\u001a\u00020\u00072\u0006\u0010\u0013\u001a\u00020\u00062\b\b\u0001\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001fR \u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010 R\u001a\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010!R \u0010\f\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u00070\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010 R\u0014\u0010\u000e\u001a\u00020\r8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000e\u0010\"R\u0014\u0010\u0010\u001a\u00020\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0010\u0010#R\u0018\u0010$\u001a\u0004\u0018\u00010\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b$\u0010%R\u0018\u0010'\u001a\u0004\u0018\u00010&8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b'\u0010(¨\u0006)"}, d2 = {"Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemViewHolder;", "Ljk0/j;", "Lru/ozon/app/android/uikit/view/recycler/adapter/lifecycle/LifecycleViewHolder;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;", "bannerItemView", "Lkotlin/Function1;", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "", "trackClick", "Lkotlin/Function0;", "trackViewAndImpression", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lxe/M;", "loadScope", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "featureChecker", "<init>", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lxe/M;Lru/ozon/app/android/network/abtool/FeatureChecker;)V", "item", "loadBannerImage", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;)V", "ru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemViewHolder$createLoadCallback$1", "createLoadCallback", "()Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/AdvBannerV4PlainItemViewHolder$createLoadCallback$1;", "onRecycle", "()V", "", "backgroundColor", "bind", "(Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;I)V", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/plain/rv/view/AdvBannerV4PlainItemView;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function0;", "Lxe/M;", "Lru/ozon/app/android/network/abtool/FeatureChecker;", "advBannerItemVO", "Lru/ozon/app/android/ads/widgets/advBanner/v4/presentation/model/AdvBannerV4ItemVO;", "Lxe/B0;", "loadJob", "Lxe/B0;", "ads_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdvBannerV4PlainItemViewHolder extends j {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;
    private AdvBannerV4ItemVO advBannerItemVO;

    @NotNull
    private final AdvBannerV4PlainItemView bannerItemView;

    @NotNull
    private final FeatureChecker featureChecker;
    private B0 loadJob;

    @NotNull
    private final M loadScope;

    @NotNull
    private final Function1<AdvBannerV4ItemVO, Unit> trackClick;

    @NotNull
    private final Function0<Unit> trackViewAndImpression;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public AdvBannerV4PlainItemViewHolder(@NotNull AdvBannerV4PlainItemView bannerItemView, @NotNull Function1<? super AdvBannerV4ItemVO, Unit> trackClick, @NotNull Function0<Unit> trackViewAndImpression, @NotNull Function1<? super AtomAction, Unit> actionHandler, @NotNull M loadScope, @NotNull FeatureChecker featureChecker) {
        super(bannerItemView);
        Intrinsics.checkNotNullParameter(bannerItemView, "bannerItemView");
        Intrinsics.checkNotNullParameter(trackClick, "trackClick");
        Intrinsics.checkNotNullParameter(trackViewAndImpression, "trackViewAndImpression");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        Intrinsics.checkNotNullParameter(loadScope, "loadScope");
        Intrinsics.checkNotNullParameter(featureChecker, "featureChecker");
        this.bannerItemView = bannerItemView;
        this.trackClick = trackClick;
        this.trackViewAndImpression = trackViewAndImpression;
        this.actionHandler = actionHandler;
        this.loadScope = loadScope;
        this.featureChecker = featureChecker;
        bannerItemView.getAdvBannerImageView().setOnClickListener(new View.OnClickListener() { // from class: zl.a
            @Override // android.view.View.OnClickListener
            public final void onClick(View view) {
                AdvBannerV4PlainItemViewHolder._init_$lambda$1(AdvBannerV4PlainItemViewHolder.this, view);
            }
        });
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AdvBannerV4PlainItemViewHolder advBannerV4PlainItemViewHolder, View view) {
        AdvBannerV4ItemVO advBannerV4ItemVO = advBannerV4PlainItemViewHolder.advBannerItemVO;
        if (advBannerV4ItemVO != null) {
            advBannerV4PlainItemViewHolder.trackClick.invoke(advBannerV4ItemVO);
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.AdvBannerV4PlainItemViewHolder$createLoadCallback$1] */
    private final AdvBannerV4PlainItemViewHolder$createLoadCallback$1 createLoadCallback() {
        return new PikazonLoaderCallback<Drawable>() { // from class: ru.ozon.app.android.ads.widgets.advBanner.v4.presentation.plain.rv.AdvBannerV4PlainItemViewHolder$createLoadCallback$1
            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadFailed(Exception exc) {
                PikazonLoaderCallback.DefaultImpls.onLoadFailed(this, exc);
            }

            @Override // ru.ozon.app.android.pikazon.callback.PikazonLoaderCallback
            public void onLoadSuccessful(Drawable resource) {
                AdvBannerV4ItemVO advBannerV4ItemVO;
                Function0 function0;
                if (resource == null) {
                    return;
                }
                advBannerV4ItemVO = AdvBannerV4PlainItemViewHolder.this.advBannerItemVO;
                if (advBannerV4ItemVO != null) {
                    advBannerV4ItemVO.setImageWasLoaded(true);
                }
                function0 = AdvBannerV4PlainItemViewHolder.this.trackViewAndImpression;
                function0.invoke();
            }
        };
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void loadBannerImage(AdvBannerV4ItemVO item) {
        AdvBannerV4ImageView advBannerImageView = this.bannerItemView.getAdvBannerImageView();
        advBannerImageView.layout(0, 0, 0, 0);
        ImageViewExtKt.load$default(advBannerImageView, item.getImage(), null, createLoadCallback(), null, null, false, null, 122, null);
        advBannerImageView.requestLayout();
    }

    public final void bind(@NotNull AdvBannerV4ItemVO item, int backgroundColor) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.advBannerItemVO = item;
        BadgeHolderKt.bindOrGone(this.bannerItemView.getBadgeView(), item.getBadge(), this.actionHandler);
        if (!this.featureChecker.isEnabled(AdvBannerV4LoadOptimizationFlag.INSTANCE)) {
            AdvBannerV4ImageView advBannerImageView = this.bannerItemView.getAdvBannerImageView();
            advBannerImageView.setCornerColor(backgroundColor);
            advBannerImageView.layout(0, 0, 0, 0);
            Float ratio = item.getRatio();
            advBannerImageView.setRatio(ratio != null ? ratio.floatValue() : 1.0f);
            ImageViewExtKt.load$default(advBannerImageView, item.getImage(), null, createLoadCallback(), null, null, false, null, 122, null);
            int topCornerRadius = item.getDesignOptions().getTopCornerRadius();
            Context context = advBannerImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
            float pxF = ResourceExtKt.toPxF(topCornerRadius, context);
            int bottomCornerRadius = item.getDesignOptions().getBottomCornerRadius();
            Context context2 = advBannerImageView.getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            advBannerImageView.setRadius(pxF, ResourceExtKt.toPxF(bottomCornerRadius, context2));
            return;
        }
        AdvBannerV4ImageView advBannerImageView2 = this.bannerItemView.getAdvBannerImageView();
        advBannerImageView2.setCornerColor(backgroundColor);
        Float ratio2 = item.getRatio();
        advBannerImageView2.setRatio(ratio2 != null ? ratio2.floatValue() : 1.0f);
        int topCornerRadius2 = item.getDesignOptions().getTopCornerRadius();
        Context context3 = advBannerImageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context3, "getContext(...)");
        float pxF2 = ResourceExtKt.toPxF(topCornerRadius2, context3);
        int bottomCornerRadius2 = item.getDesignOptions().getBottomCornerRadius();
        Context context4 = advBannerImageView2.getContext();
        Intrinsics.checkNotNullExpressionValue(context4, "getContext(...)");
        advBannerImageView2.setRadius(pxF2, ResourceExtKt.toPxF(bottomCornerRadius2, context4));
        B0 b02 = this.loadJob;
        if (b02 != null) {
            b02.j(null);
        }
        this.loadJob = C10727i.c(this.loadScope, null, null, new AdvBannerV4PlainItemViewHolder$bind$2(this, item, null), 3);
    }

    @Override // jk0.j
    public void onRecycle() {
        B0 b02 = this.loadJob;
        if (b02 != null) {
            b02.j(null);
        }
        super.onRecycle();
    }
}
