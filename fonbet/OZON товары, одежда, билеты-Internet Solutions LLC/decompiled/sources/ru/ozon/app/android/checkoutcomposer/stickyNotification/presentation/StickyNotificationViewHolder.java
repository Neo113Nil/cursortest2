package ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation;

import Ae.C2399j;
import Ae.M0;
import Sc.InterfaceC4008j;
import Sc.s;
import WZ.t;
import Wc.a;
import android.view.View;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.lifecycle.K;
import fd.InterfaceC6511n;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.ActionHandler;
import ru.ozon.app.android.analytics.modules.tokenized.TokenizedAnalyticsExtensionsKt;
import ru.ozon.app.android.cart.common.presentation.TotalVisibilityViewModel;
import ru.ozon.app.android.cart.common.presentation.utils.ExtensionsKt;
import ru.ozon.app.android.checkout.databinding.WidgetStickyNotificationBinding;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.util.RoundedOutlineProvider;
import ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.vo.StickyNotificationVO;
import ru.ozon.app.android.composer.ComposerReferences;
import ru.ozon.app.android.pikazon.extensions.ImageViewExtKt;
import ru.ozon.composer.ui.widget.k;
import ru.ozon.uni.android.uikit.common.StyleParser;
import ru.ozon.uni.android.uikit.view.atoms.buttons.usual.SmallButtonView;
import ru.ozon.uni.android.uikit.view.atoms.texts.TextAtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.buttons.WrappedButtonHolderKt;
import ru.ozon.uni.atoms.v3.holders.texts.TextAtomHolderKt;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0007\b\u0001\u0018\u0000 #2\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001#B\u001f\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u001f\u0010\u0011\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u00022\u0006\u0010\u0010\u001a\u00020\u000fH\u0014¢\u0006\u0004\b\u0011\u0010\u0012R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0013R\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u0014R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\f0\u00158\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u0014\u0010\u001a\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001bR\u0014\u0010\u001c\u001a\u00020\u00198\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001bR\u001b\u0010\"\u001a\u00020\u001d8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001e\u0010\u001f\u001a\u0004\b \u0010!¨\u0006$"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/StickyNotificationViewHolder;", "Lru/ozon/composer/ui/widget/k;", "Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/vo/StickyNotificationVO;", "Lru/ozon/app/android/checkout/databinding/WidgetStickyNotificationBinding;", "binding", "Lru/ozon/app/android/composer/ComposerReferences;", "references", "Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;", "totalVisibilityViewModel", "<init>", "(Lru/ozon/app/android/checkout/databinding/WidgetStickyNotificationBinding;Lru/ozon/app/android/composer/ComposerReferences;Lru/ozon/app/android/cart/common/presentation/TotalVisibilityViewModel;)V", "item", "", "trackView", "(Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/vo/StickyNotificationVO;)V", "Ll20/d;", "info", "bind", "(Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/vo/StickyNotificationVO;Ll20/d;)V", "Lru/ozon/app/android/checkout/databinding/WidgetStickyNotificationBinding;", "Lru/ozon/app/android/composer/ComposerReferences;", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/util/RoundedOutlineProvider;", "containerOutlineProvider", "Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/util/RoundedOutlineProvider;", "iconOutlineProvider", "", "defaultBackgroundColor$delegate", "LSc/j;", "getDefaultBackgroundColor", "()I", "defaultBackgroundColor", "Companion", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class StickyNotificationViewHolder extends k<StickyNotificationVO> {

    @NotNull
    private final Function1<AtomAction, Unit> actionHandler;

    @NotNull
    private final WidgetStickyNotificationBinding binding;

    @NotNull
    private final RoundedOutlineProvider containerOutlineProvider;

    /* renamed from: defaultBackgroundColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j defaultBackgroundColor;

    @NotNull
    private final RoundedOutlineProvider iconOutlineProvider;

    @NotNull
    private final ComposerReferences references;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\u0010\u0000\u001a\u00020\u00012\u0006\u0010\u0002\u001a\u00020\u00032\u0006\u0010\u0004\u001a\u00020\u0005H\n"}, d2 = {"<anonymous>", "", "gone", "", "view", "Landroid/view/View;"}, k = 3, mv = {2, 0, 0}, xi = 48)
    @e(c = "ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.StickyNotificationViewHolder$3", f = "StickyNotificationViewHolder.kt", l = {}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.checkoutcomposer.stickyNotification.presentation.StickyNotificationViewHolder$3, reason: invalid class name */
    static final class AnonymousClass3 extends j implements InterfaceC6511n<Boolean, View, d<? super Unit>, Object> {
        /* synthetic */ Object L$0;
        /* synthetic */ boolean Z$0;
        int label;

        AnonymousClass3(d<? super AnonymousClass3> dVar) {
            super(3, dVar);
        }

        @Override // fd.InterfaceC6511n
        public /* bridge */ /* synthetic */ Object invoke(Boolean bool, View view, d<? super Unit> dVar) {
            return invoke(bool.booleanValue(), view, dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            a aVar = a.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
            ((View) this.L$0).setVisibility(this.Z$0 ? 8 : 0);
            return Unit.f71690a;
        }

        public final Object invoke(boolean z11, View view, d<? super Unit> dVar) {
            AnonymousClass3 anonymousClass3 = new AnonymousClass3(dVar);
            anonymousClass3.Z$0 = z11;
            anonymousClass3.L$0 = view;
            return anonymousClass3.invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/stickyNotification/presentation/StickyNotificationViewHolder$Companion;", "", "<init>", "()V", "CONTAINER_CORNER_RADIUS", "", "ICON_CORNER_RADIUS", "SCROLL_TO_WIDGET_OFFSET", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public StickyNotificationViewHolder(@NotNull WidgetStickyNotificationBinding binding, @NotNull ComposerReferences references, @NotNull TotalVisibilityViewModel totalVisibilityViewModel) {
        super(r0);
        Intrinsics.checkNotNullParameter(binding, "binding");
        Intrinsics.checkNotNullParameter(references, "references");
        Intrinsics.checkNotNullParameter(totalVisibilityViewModel, "totalVisibilityViewModel");
        ConstraintLayout constraintLayout = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout, "getRoot(...)");
        this.binding = binding;
        this.references = references;
        this.actionHandler = new ActionHandler.Builder(references, this).onPreProcess(new StickyNotificationViewHolder$actionHandler$1(this)).buildHandler();
        RoundedOutlineProvider roundedOutlineProvider = new RoundedOutlineProvider(12);
        this.containerOutlineProvider = roundedOutlineProvider;
        RoundedOutlineProvider roundedOutlineProvider2 = new RoundedOutlineProvider(8);
        this.iconOutlineProvider = roundedOutlineProvider2;
        this.defaultBackgroundColor = Sc.k.b(new StickyNotificationViewHolder$defaultBackgroundColor$2(this));
        ConstraintLayout constraintLayout2 = binding.getConstraintLayout();
        constraintLayout2.setOutlineProvider(roundedOutlineProvider);
        constraintLayout2.setClipToOutline(true);
        constraintLayout2.setFocusable(true);
        constraintLayout2.setClickable(true);
        AppCompatImageView appCompatImageView = binding.stickyNotificationIV;
        appCompatImageView.setOutlineProvider(roundedOutlineProvider2);
        appCompatImageView.setClipToOutline(true);
        M0<Boolean> isVisibleFlow = totalVisibilityViewModel.isVisibleFlow();
        ConstraintLayout constraintLayout3 = binding.getConstraintLayout();
        Intrinsics.checkNotNullExpressionValue(constraintLayout3, "getRoot(...)");
        C2399j.C(ExtensionsKt.onEachOutOfLayoutView$default(isVisibleFlow, constraintLayout3, null, new AnonymousClass3(null), 2, null), K.a(this));
    }

    private final int getDefaultBackgroundColor() {
        return ((Number) this.defaultBackgroundColor.getValue()).intValue();
    }

    private final void trackView(StickyNotificationVO item) {
        t tokenizedEvent = item.getTokenizedEvent();
        if (tokenizedEvent != null) {
            TokenizedAnalyticsExtensionsKt.processViewEvents$default(this.references.getTokenizedAnalytics(), tokenizedEvent, null, 2, null);
        }
    }

    /* JADX INFO: Access modifiers changed from: protected */
    @Override // ru.ozon.composer.ui.widget.k
    public void bind(@NotNull StickyNotificationVO item, @NotNull l20.d info) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(info, "info");
        WidgetStickyNotificationBinding widgetStickyNotificationBinding = this.binding;
        TextAtomView stickyNotificationTitleTAV = widgetStickyNotificationBinding.stickyNotificationTitleTAV;
        Intrinsics.checkNotNullExpressionValue(stickyNotificationTitleTAV, "stickyNotificationTitleTAV");
        TextAtomHolderKt.bindOrGone$default(stickyNotificationTitleTAV, item.getTitle(), null, 2, null);
        TextAtomView stickyNotificationSubtitleTAV = widgetStickyNotificationBinding.stickyNotificationSubtitleTAV;
        Intrinsics.checkNotNullExpressionValue(stickyNotificationSubtitleTAV, "stickyNotificationSubtitleTAV");
        TextAtomHolderKt.bindOrGone$default(stickyNotificationSubtitleTAV, item.getSubtitle(), null, 2, null);
        SmallButtonView stickyNotificationBtn = widgetStickyNotificationBinding.stickyNotificationBtn;
        Intrinsics.checkNotNullExpressionValue(stickyNotificationBtn, "stickyNotificationBtn");
        WrappedButtonHolderKt.bindOrGone(stickyNotificationBtn, item.getButton(), this.actionHandler);
        AppCompatImageView stickyNotificationIV = widgetStickyNotificationBinding.stickyNotificationIV;
        Intrinsics.checkNotNullExpressionValue(stickyNotificationIV, "stickyNotificationIV");
        ImageViewExtKt.loadImageOrGone(stickyNotificationIV, item.getIcon());
        StyleParser styleParser = StyleParser.INSTANCE;
        Integer parseColor = styleParser.parseColor(getContext(), item.getIconBackgroundColor());
        if (parseColor != null) {
            widgetStickyNotificationBinding.stickyNotificationIV.setBackgroundColor(parseColor.intValue());
        }
        trackView(item);
        ConstraintLayout constraintLayout = widgetStickyNotificationBinding.getConstraintLayout();
        Integer parseColor2 = styleParser.parseColor(getContext(), item.getBackgroundColor());
        constraintLayout.setBackgroundColor(parseColor2 != null ? parseColor2.intValue() : getDefaultBackgroundColor());
    }
}
