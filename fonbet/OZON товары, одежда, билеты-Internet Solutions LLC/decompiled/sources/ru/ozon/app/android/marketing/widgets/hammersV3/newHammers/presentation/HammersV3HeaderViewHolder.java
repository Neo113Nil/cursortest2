package ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation;

import Cz.ViewOnClickListenerC2788a;
import W10.c;
import WZ.t;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.atoms.v3.holders.buttons.WrappedIconButtonHolderKt;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.model.HammersV3HeaderVO;
import ru.ozon.app.android.marketing.widgets.hammersV3.newHammers.presentation.view.HammersV3HeaderView;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.BaseSwitchingButtonDelegate;
import ru.ozon.app.android.ui.switchingbutton.switchingbuttondelegate.SwitchingButtonDelegate;
import ru.ozon.composer.ui.widget.f;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.TextViewExtKt;
import ru.ozon.uni.atoms.af.AtomAction;

@Metadata(d1 = {"\u0000n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0001\u0018\u00002\u0012\u0012\u0004\u0012\u00020\u00020\u0001j\b\u0012\u0004\u0012\u00020\u0002`\u00032\u00020\u0004B\u001f\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u0019\u0010\u0012\u001a\u00020\r2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J#\u0010\u0018\u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u0017\u001a\u00060\u0015j\u0002`\u0016H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J3\u0010 \u001a\u00020\r2\u0006\u0010\u0014\u001a\u00020\u00022\n\u0010\u001c\u001a\u00060\u001aj\u0002`\u001b2\u000e\u0010\u001f\u001a\n\u0018\u00010\u001dj\u0004\u0018\u0001`\u001eH\u0016¢\u0006\u0004\b \u0010!J\u000f\u0010\"\u001a\u00020\rH\u0016¢\u0006\u0004\b\"\u0010\u000fJ\u000f\u0010#\u001a\u00020\rH\u0016¢\u0006\u0004\b#\u0010\u000fR\u001a\u0010\u0006\u001a\u00020\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010$\u001a\u0004\b%\u0010&R\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010'R\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010(R \u0010+\u001a\u000e\u0012\u0004\u0012\u00020*\u0012\u0004\u0012\u00020\r0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010/¨\u00060"}, d2 = {"Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/HammersV3HeaderViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3HeaderVO;", "Lru/ozon/app/android/composer/widgets/base/WidgetViewHolder;", "", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderView;", "containerView", "Lru/ozon/app/android/composer/ComposerReferences;", "refs", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "switchingButtonDelegate", "<init>", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderView;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;)V", "", "configureSubtitleStyle", "()V", "", "subtitle", "bindSubtitle", "(Ljava/lang/String;)V", "item", "Ll20/d;", "Lru/ozon/app/android/composer/view/WidgetInfo;", "info", "bind", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3HeaderVO;Ll20/d;)V", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "trackingData", "Lru/ozon/composer/ui/widget/f;", "Lru/ozon/app/android/tools/ViewedPond;", "viewedPond", "trackView", "(Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/model/HammersV3HeaderVO;LW10/c;Lru/ozon/composer/ui/widget/f;)V", "onAttach", "onDetach", "Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderView;", "getContainerView", "()Lru/ozon/app/android/marketing/widgets/hammersV3/newHammers/presentation/view/HammersV3HeaderView;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lru/ozon/app/android/ui/switchingbutton/switchingbuttondelegate/SwitchingButtonDelegate;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "", "subtitleColor", "I", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class HammersV3HeaderViewHolder extends k<HammersV3HeaderVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final HammersV3HeaderView containerView;

    @NotNull
    private final ComposerReferences refs;
    private final int subtitleColor;

    @NotNull
    private final SwitchingButtonDelegate switchingButtonDelegate;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public HammersV3HeaderViewHolder(@NotNull HammersV3HeaderView containerView, @NotNull ComposerReferences refs, @NotNull SwitchingButtonDelegate switchingButtonDelegate) {
        super(containerView);
        Intrinsics.checkNotNullParameter(containerView, "containerView");
        Intrinsics.checkNotNullParameter(refs, "refs");
        Intrinsics.checkNotNullParameter(switchingButtonDelegate, "switchingButtonDelegate");
        this.containerView = containerView;
        this.refs = refs;
        this.switchingButtonDelegate = switchingButtonDelegate;
        this.actionHandler = new ActionHandler.Builder(refs, this).buildHandler();
        this.subtitleColor = ThemeExtKt.themeColor(getContext(), R$attr.textSecondary);
        getContainerView().getLogoIv().setOnClickListener(new ViewOnClickListenerC2788a(this, 0));
        configureSubtitleStyle();
        switchingButtonDelegate.init(refs, this);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$0(HammersV3HeaderViewHolder hammersV3HeaderViewHolder, View view) {
        HammersV3HeaderVO.ImageVO image;
        AtomAction action;
        HammersV3HeaderVO boundedData = hammersV3HeaderViewHolder.getBoundedData();
        if (boundedData == null || (image = boundedData.getImage()) == null || (action = image.getAction()) == null) {
            return;
        }
        hammersV3HeaderViewHolder.actionHandler.invoke(action);
    }

    private final void bindSubtitle(String subtitle) {
        TextViewExtKt.setTextOrGone(getContainerView().getSubtitleTv(), subtitle);
    }

    private final void configureSubtitleStyle() {
        int i11 = R$style.TextStyle_Body_M;
        AppCompatTextView subtitleTv = getContainerView().getSubtitleTv();
        subtitleTv.setTextAppearance(i11);
        subtitleTv.setTextColor(this.subtitleColor);
    }

    @NotNull
    public HammersV3HeaderView getContainerView() {
        return this.containerView;
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onAttach() {
        super.onAttach();
        this.switchingButtonDelegate.attach(getContainerView().getNotifyBtn());
    }

    @Override // ru.ozon.composer.ui.widget.k, jk0.j
    public void onDetach() {
        super.onDetach();
        this.switchingButtonDelegate.detach();
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull HammersV3HeaderVO item, @NotNull d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        AppCompatImageView logoIv = getContainerView().getLogoIv();
        HammersV3HeaderVO.ImageVO image = item.getImage();
        ImageViewExtKt.loadImageOrGone(logoIv, image != null ? image.getLink() : null);
        bindSubtitle(item.getSubtitle());
        BaseSwitchingButtonDelegate.bind$default(this.switchingButtonDelegate, item.getNotifyButton(), getContainerView().getNotifyBtn(), false, 4, null);
        WrappedIconButtonHolderKt.bindOrGone(getContainerView().getInfoBtn(), item.getInfoButton(), this.actionHandler);
    }

    @Override // ru.ozon.composer.ui.widget.k
    public void trackView(@NotNull HammersV3HeaderVO item, @NotNull c trackingData, f viewedPond) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(trackingData, "trackingData");
        super.trackView((HammersV3HeaderViewHolder) item, trackingData, viewedPond);
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.refs.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }
}
