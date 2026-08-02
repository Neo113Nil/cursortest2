package ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.presentation.customViews;

import B90.C2618u;
import Bi.b;
import Hx.ViewOnClickListenerC3169a;
import Kk.C3531a;
import OV.a;
import android.content.Context;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.fresh.main.R$id;
import ru.ozon.app.android.fresh.main.widgets.notificationCarousel.v2.domain.NotificationCarouselV2VO;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.v3.holders.controls.buttonV3.ButtonV3HolderKt;
import ru.ozon.uni.atoms.v3.holders.icon.IconHolderKt;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;

@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0001\u0019B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ6\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u00142\u0012\u0010\u0015\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u00162\u0012\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0017\u0012\u0004\u0012\u00020\u00120\u0016R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\u000bX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\r\u001a\u00020\u000eX\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\u0010X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/ActionButtonNotificationView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "titleIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "bind", "", "data", "Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/domain/NotificationCarouselV2VO$NotificationCarouselItemVO$ActionButtonNotification;", "onContainerClick", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "onButtonClick", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ActionButtonNotificationView extends ConstraintLayout {

    @NotNull
    private final ButtonV3View buttonView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final IconView titleIconView;

    @NotNull
    private final TextAtomV2View titleView;

    @NotNull
    private static final Companion Companion = new Companion(null);
    private static final int containerHeight = UiExtKt.toPx(70);
    private static final int containerPadding = UiExtKt.toPx(12);
    private static final int textStartMargin = UiExtKt.toPx(4);
    private static final int subtitleTopMargin = UiExtKt.toPx(2);

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/notificationCarousel/v2/presentation/customViews/ActionButtonNotificationView$Companion;", "", "<init>", "()V", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ ActionButtonNotificationView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void bind$lambda$12(NotificationCarouselV2VO.NotificationCarouselItemVO.ActionButtonNotification actionButtonNotification, Function1 function1, View view) {
        AtomAction clickAction = actionButtonNotification.getClickAction();
        if (clickAction != null) {
            function1.invoke(clickAction);
        }
    }

    public final void bind(@NotNull NotificationCarouselV2VO.NotificationCarouselItemVO.ActionButtonNotification data, @NotNull Function1<? super AtomAction, Unit> onContainerClick, @NotNull Function1<? super AtomAction, Unit> onButtonClick) {
        Intrinsics.checkNotNullParameter(data, "data");
        Intrinsics.checkNotNullParameter(onContainerClick, "onContainerClick");
        Intrinsics.checkNotNullParameter(onButtonClick, "onButtonClick");
        TextHolderKt.bind$default(this.titleView, data.getTitle(), null, 2, null);
        TextHolderKt.bind$default(this.subtitleView, data.getSubtitle(), null, 2, null);
        IconHolderKt.bind$default(this.titleIconView, data.getTitleIcon(), null, 2, null);
        ButtonV3HolderKt.bind$default(this.buttonView, data.getButton(), null, 2, null);
        this.buttonView.setOnClickListener(new ViewOnClickListenerC3169a(4, data, onButtonClick));
        AtomAction clickAction = data.getClickAction();
        if (clickAction != null) {
            Iterator it = C7714v.b0(this.titleView, this.subtitleView, this.titleIconView).iterator();
            while (it.hasNext()) {
                ((View) it.next()).setOnClickListener(new a(onContainerClick, clickAction, 1));
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ActionButtonNotificationView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        int i12 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        AttributeSet attributeSet2 = null;
        int i13 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, attributeSet2, i13, i12, defaultConstructorMarker);
        ConstraintLayout.b d11 = b.d(textAtomV2View, R$id.actionButtonTitleView, -2, -2);
        d11.f41636i = 0;
        d11.f41656t = 0;
        d11.f41640k = R$id.actionButtonSubtitleView;
        int i14 = textStartMargin;
        d11.setMarginStart(i14);
        textAtomV2View.setLayoutParams(d11);
        textAtomV2View.setTextIsSelectable(false);
        addView(textAtomV2View);
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, attributeSet2, i13, i12, defaultConstructorMarker);
        ConstraintLayout.b d12 = b.d(textAtomV2View2, R$id.actionButtonSubtitleView, 0, -2);
        d12.f41642l = 0;
        d12.f41656t = 0;
        d12.f41638j = R$id.actionButtonTitleView;
        d12.f41657u = R$id.actionButtonButtonView;
        d12.setMarginStart(i14);
        ((ViewGroup.MarginLayoutParams) d12).topMargin = subtitleTopMargin;
        d12.f41598E = 0.0f;
        textAtomV2View2.setLayoutParams(d12);
        textAtomV2View2.setTextIsSelectable(false);
        addView(textAtomV2View2);
        this.subtitleView = textAtomV2View2;
        IconView iconView = new IconView(context, attributeSet2, i13, i12, defaultConstructorMarker);
        ConstraintLayout.b a11 = C3531a.a(iconView, R$id.actionButtonTitleIconView, -2, -2);
        int i15 = R$id.actionButtonTitleView;
        a11.f41636i = i15;
        a11.f41642l = i15;
        a11.f41655s = i15;
        iconView.setLayoutParams(a11);
        addView(iconView);
        this.titleIconView = iconView;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet2, i13, 0, 14, null);
        ConstraintLayout.b e11 = C2618u.e(buttonV3View, R$id.actionButtonButtonView, -2, -2);
        e11.f41636i = 0;
        e11.f41642l = 0;
        e11.f41658v = 0;
        buttonV3View.setLayoutParams(e11);
        addView(buttonV3View);
        this.buttonView = buttonV3View;
        setLayoutParams(new ConstraintLayout.b(-1, containerHeight));
        int i16 = containerPadding;
        setPadding(i16, i16, i16, i16);
        setId(R$id.actionButtonView);
    }
}
