package ru.ozon.uni.android.atom.notification.view;

import Aw.ViewOnClickListenerC2448a;
import Ax.ViewOnClickListenerC2451a;
import Cw.ViewOnClickListenerC2787a;
import Cw.b;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.n;
import android.content.Context;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.Barrier;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import j.C7232a;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$id;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.ColorExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u0080\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0010\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\b\u0007\u0018\u0000 b2\u00020\u00012\u00020\u00022\u00020\u0003:\u0001bB'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\fH\u0002¢\u0006\u0004\b\u000f\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0010\u0010\u000eJ\u000f\u0010\u0011\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0011\u0010\u000eJ\u000f\u0010\u0012\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0012\u0010\u000eJ\u000f\u0010\u0013\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0013\u0010\u000eJ\u000f\u0010\u0014\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0014\u0010\u000eJ\u000f\u0010\u0015\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0015\u0010\u000eJ\u000f\u0010\u0016\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0016\u0010\u000eJ\u000f\u0010\u0017\u001a\u00020\fH\u0002¢\u0006\u0004\b\u0017\u0010\u000eJ\u0013\u0010\u0019\u001a\u00020\f*\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aR,\u0010\u001d\u001a\u001a\u0012\u0004\u0012\u00020\b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\f0\u001c0\u001b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR*\u0010!\u001a\u00020\u001f2\u0006\u0010 \u001a\u00020\u001f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$\"\u0004\b%\u0010&R\u0014\u0010'\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010(R\u0014\u0010)\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b)\u0010(R\u0014\u0010*\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010(R\u0014\u0010+\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010(R\u0014\u0010,\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010(R\u0014\u0010-\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010(R\u0014\u0010.\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010(R\u0014\u0010/\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010(R(\u00101\u001a\b\u0012\u0004\u0012\u00020\f008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u00106R(\u00107\u001a\b\u0012\u0004\u0012\u00020\f008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b7\u00102\u001a\u0004\b8\u00104\"\u0004\b9\u00106R(\u0010:\u001a\b\u0012\u0004\u0012\u00020\f008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b:\u00102\u001a\u0004\b;\u00104\"\u0004\b<\u00106R\"\u0010>\u001a\u00020=8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR\u0014\u0010E\u001a\u00020D8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010FR\u001a\u0010H\u001a\u00020G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bH\u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020G8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bL\u0010I\u001a\u0004\bM\u0010KR\u001b\u0010S\u001a\u00020N8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bO\u0010P\u001a\u0004\bQ\u0010RR\u001b\u0010X\u001a\u00020T8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bU\u0010P\u001a\u0004\bV\u0010WR\u001b\u0010]\u001a\u00020Y8@X\u0080\u0084\u0002¢\u0006\f\n\u0004\bZ\u0010P\u001a\u0004\b[\u0010\\R\u001a\u0010^\u001a\u00020\u00188\u0000X\u0080\u0004¢\u0006\f\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a¨\u0006c"}, d2 = {"Lru/ozon/uni/android/atom/notification/view/NotificationBarView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "", "initRoot", "()V", "addChilds", "setupChildLayoutParams", "setupListeners", "setupIconLP", "setupTitleLP", "setupSubtitleLP", "setupIconButtonLP", "setupButtonLP", "setupRightTapableAreaLP", "Landroid/view/View;", "callOnClickIfVisible", "(Landroid/view/View;)V", "", "Lkotlin/Function1;", "locatorInitializers", "Ljava/util/Map;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "dp4", "I", "dp8", "dp10", "dp11", "dp12", "dp16", "dp44", "dp64", "Lkotlin/Function0;", "onCloseListener", "Lkotlin/jvm/functions/Function0;", "getOnCloseListener", "()Lkotlin/jvm/functions/Function0;", "setOnCloseListener", "(Lkotlin/jvm/functions/Function0;)V", "onButtonClickListener", "getOnButtonClickListener", "setOnButtonClickListener", "onCommonClickListener", "getOnCommonClickListener", "setOnCommonClickListener", "", "hasCloseBehavior", "Z", "getHasCloseBehavior", "()Z", "setHasCloseBehavior", "(Z)V", "Landroidx/constraintlayout/widget/Barrier;", "startButtonBarrier", "Landroidx/constraintlayout/widget/Barrier;", "Landroidx/appcompat/widget/AppCompatTextView;", "titleTv", "Landroidx/appcompat/widget/AppCompatTextView;", "getTitleTv$uni_release", "()Landroidx/appcompat/widget/AppCompatTextView;", "subtitleTv", "getSubtitleTv$uni_release", "Lru/ozon/uni/android/atom/icon/IconView;", "iconView$delegate", "LSc/j;", "getIconView$uni_release", "()Lru/ozon/uni/android/atom/icon/IconView;", "iconView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonView$delegate", "getIconButtonView$uni_release", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "iconButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView$delegate", "getButtonView$uni_release", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "buttonView", "rightTapableArea", "Landroid/view/View;", "getRightTapableArea$uni_release", "()Landroid/view/View;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class NotificationBarView extends ConstraintLayout implements AtomView, AtomLocatableView {

    /* renamed from: buttonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j buttonView;
    private final int dp10;
    private final int dp11;
    private final int dp12;
    private final int dp16;
    private final int dp4;
    private final int dp44;
    private final int dp64;
    private final int dp8;
    private boolean hasCloseBehavior;

    /* renamed from: iconButtonView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconButtonView;

    /* renamed from: iconView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j iconView;

    @NotNull
    private final Map<Integer, Function1<View, Unit>> locatorInitializers;

    @NotNull
    private String locatorTag;

    @NotNull
    private Function0<Unit> onButtonClickListener;

    @NotNull
    private Function0<Unit> onCloseListener;

    @NotNull
    private Function0<Unit> onCommonClickListener;

    @NotNull
    private final View rightTapableArea;

    @NotNull
    private final Barrier startButtonBarrier;

    @NotNull
    private final AppCompatTextView subtitleTv;

    @NotNull
    private final AppCompatTextView titleTv;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/uni/android/atom/notification/view/NotificationBarView$Companion;", "", "<init>", "()V", "DEFAULT_NOTIFICATION_LOCATOR", "", "TITLE_LOCATOR_TAG", "SUBTITLE_LOCATOR_TAG", "ICON_LOCATOR_TAG", "ICON_BUTTON_LOCATOR_TAG", "BUTTON_LOCATOR_TAG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public /* synthetic */ NotificationBarView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addChilds() {
        addView(this.rightTapableArea);
        addView(getIconView$uni_release());
        addView(this.titleTv);
        addView(this.subtitleTv);
        addView(this.startButtonBarrier);
        addView(getIconButtonView$uni_release());
        addView(getButtonView$uni_release());
    }

    private final void callOnClickIfVisible(View view) {
        if (view.getVisibility() == 0) {
            view.callOnClick();
        }
    }

    private final void initRoot() {
        setContentDescription("notification");
        setMinHeight(this.dp64);
        setBackground(C7232a.a(getContext(), R$drawable.bg_ds_notification));
    }

    private final void setupButtonLP() {
        ButtonV3View buttonView$uni_release = getButtonView$uni_release();
        ViewGroup.LayoutParams layoutParams = buttonView$uni_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        bVar.setMarginEnd(this.dp16);
        int i11 = this.dp8;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        buttonView$uni_release.setLayoutParams(bVar);
    }

    private final void setupChildLayoutParams() {
        setupIconLP();
        setupTitleLP();
        setupSubtitleLP();
        setupIconButtonLP();
        setupButtonLP();
        setupRightTapableAreaLP();
    }

    private final void setupIconButtonLP() {
        IconButtonV3View iconButtonView$uni_release = getIconButtonView$uni_release();
        ViewGroup.LayoutParams layoutParams = iconButtonView$uni_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = -2;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        bVar.setMarginEnd(this.dp8);
        int i11 = this.dp8;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        iconButtonView$uni_release.setLayoutParams(bVar);
    }

    private final void setupIconLP() {
        IconView iconView$uni_release = getIconView$uni_release();
        ViewGroup.LayoutParams layoutParams = iconView$uni_release.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int i11 = this.dp44;
        ((ViewGroup.MarginLayoutParams) bVar).width = i11;
        ((ViewGroup.MarginLayoutParams) bVar).height = i11;
        bVar.setMarginStart(this.dp10);
        int i12 = this.dp10;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i12;
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41657u = R$id.titleTextView;
        bVar.f41599F = 0.0f;
        iconView$uni_release.setLayoutParams(bVar);
    }

    private final void setupListeners() {
        setOnClickListener(new ViewOnClickListenerC2448a(this, 13));
        int i11 = 13;
        this.rightTapableArea.setOnClickListener(new ViewOnClickListenerC2787a(this, i11));
        getIconButtonView$uni_release().setOnClickListener(new b(this, i11));
        getButtonView$uni_release().setOnClickListener(new ViewOnClickListenerC2451a(this, 14));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$5(NotificationBarView notificationBarView, View view) {
        notificationBarView.onCommonClickListener.invoke();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$6(NotificationBarView notificationBarView, View view) {
        notificationBarView.callOnClickIfVisible(notificationBarView.getIconButtonView$uni_release());
        notificationBarView.callOnClickIfVisible(notificationBarView.getButtonView$uni_release());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$7(NotificationBarView notificationBarView, View view) {
        notificationBarView.onButtonClickListener.invoke();
        if (notificationBarView.hasCloseBehavior) {
            notificationBarView.onCloseListener.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void setupListeners$lambda$8(NotificationBarView notificationBarView, View view) {
        notificationBarView.onButtonClickListener.invoke();
    }

    private final void setupRightTapableAreaLP() {
        View view = this.rightTapableArea;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
        ((ViewGroup.MarginLayoutParams) bVar).height = 0;
        bVar.f41656t = R$id.startButtonBarrier;
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        bVar.f41636i = 0;
        view.setLayoutParams(bVar);
    }

    private final void setupSubtitleLP() {
        AppCompatTextView appCompatTextView = this.subtitleTv;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = this.dp4;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = this.dp11;
        bVar.f41642l = 0;
        bVar.f41657u = R$id.startButtonBarrier;
        int i11 = R$id.titleTextView;
        bVar.f41656t = i11;
        bVar.f41638j = i11;
        bVar.f41604K = 2;
        appCompatTextView.setLayoutParams(bVar);
    }

    private final void setupTitleLP() {
        AppCompatTextView appCompatTextView = this.titleTv;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        ((ViewGroup.MarginLayoutParams) bVar).width = 0;
        ((ViewGroup.MarginLayoutParams) bVar).height = -2;
        bVar.setMarginStart(this.dp12);
        int i11 = this.dp16;
        bVar.f41594A = i11;
        bVar.f41595B = i11;
        bVar.setMarginEnd(this.dp8);
        int i12 = this.dp11;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i12;
        bVar.f41662z = i12;
        bVar.f41636i = 0;
        bVar.f41640k = R$id.subtitleTextView;
        bVar.f41657u = R$id.startButtonBarrier;
        bVar.f41655s = R$id.iconView;
        bVar.f41599F = 0.0f;
        bVar.f41604K = 2;
        appCompatTextView.setLayoutParams(bVar);
    }

    @NotNull
    public final ButtonV3View getButtonView$uni_release() {
        return (ButtonV3View) this.buttonView.getValue();
    }

    @NotNull
    public final IconButtonV3View getIconButtonView$uni_release() {
        return (IconButtonV3View) this.iconButtonView.getValue();
    }

    @NotNull
    public final IconView getIconView$uni_release() {
        return (IconView) this.iconView.getValue();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @NotNull
    /* renamed from: getSubtitleTv$uni_release, reason: from getter */
    public final AppCompatTextView getSubtitleTv() {
        return this.subtitleTv;
    }

    @NotNull
    /* renamed from: getTitleTv$uni_release, reason: from getter */
    public final AppCompatTextView getTitleTv() {
        return this.titleTv;
    }

    public final void setHasCloseBehavior(boolean z11) {
        this.hasCloseBehavior = z11;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
        for (Map.Entry<Integer, Function1<View, Unit>> entry : this.locatorInitializers.entrySet()) {
            int intValue = entry.getKey().intValue();
            Function1<View, Unit> value2 = entry.getValue();
            View findViewById = findViewById(intValue);
            if (findViewById != null) {
                value2.invoke(findViewById);
            }
        }
    }

    public final void setOnButtonClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onButtonClickListener = function0;
    }

    public final void setOnCloseListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCloseListener = function0;
    }

    public final void setOnCommonClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.onCommonClickListener = function0;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public NotificationBarView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        Map<Integer, Function1<View, Unit>> j11 = U.j(new Pair(Integer.valueOf(R$id.titleTextView), new NotificationBarView$locatorInitializers$1(this)), new Pair(Integer.valueOf(R$id.subtitleTextView), new NotificationBarView$locatorInitializers$2(this)), new Pair(Integer.valueOf(R$id.iconView), new NotificationBarView$locatorInitializers$3(this)), new Pair(Integer.valueOf(R$id.iconButtonView), new NotificationBarView$locatorInitializers$4(this)), new Pair(Integer.valueOf(R$id.buttonView), new NotificationBarView$locatorInitializers$5(this)));
        this.locatorInitializers = j11;
        this.locatorTag = "notification";
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp10 = UiExtKt.toPx(10, context);
        this.dp11 = UiExtKt.toPx(11, context);
        this.dp12 = UiExtKt.toPx(12, context);
        this.dp16 = UiExtKt.toPx(16, context);
        this.dp44 = UiExtKt.toPx(44, context);
        this.dp64 = UiExtKt.toPx(64, context);
        this.onCloseListener = NotificationBarView$onCloseListener$1.INSTANCE;
        this.onButtonClickListener = NotificationBarView$onButtonClickListener$1.INSTANCE;
        this.onCommonClickListener = NotificationBarView$onCommonClickListener$1.INSTANCE;
        this.hasCloseBehavior = true;
        Barrier barrier = new Barrier(context);
        barrier.setId(R$id.startButtonBarrier);
        barrier.f(5);
        barrier.setReferencedIds(new int[]{R$id.iconButtonView, R$id.buttonView});
        this.startButtonBarrier = barrier;
        AppCompatTextView appCompatTextView = new AppCompatTextView(context);
        appCompatTextView.setId(R$id.titleTextView);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        appCompatTextView.setEllipsize(truncateAt);
        appCompatTextView.setTextAppearance(UniTextStyles.COMPACT_CONTROL_500_MEDIUM.getResId());
        appCompatTextView.setTextColor(ColorExtKt.toColorInt(UniColors.TEXT_PRIMARY_INVERTED.getResId(), context));
        Function1<View, Unit> function1 = j11.get(Integer.valueOf(appCompatTextView.getId()));
        if (function1 != null) {
            function1.invoke(appCompatTextView);
        }
        this.titleTv = appCompatTextView;
        AppCompatTextView appCompatTextView2 = new AppCompatTextView(context);
        appCompatTextView2.setId(R$id.subtitleTextView);
        appCompatTextView2.setEllipsize(truncateAt);
        appCompatTextView2.setTextAppearance(UniTextStyles.BODY_400_SMALL.getResId());
        appCompatTextView2.setTextColor(ColorExtKt.toColorInt(UniColors.TEXT_SECONDARY_INVERTED.getResId(), context));
        Function1<View, Unit> function12 = j11.get(Integer.valueOf(appCompatTextView2.getId()));
        if (function12 != null) {
            function12.invoke(appCompatTextView2);
        }
        this.subtitleTv = appCompatTextView2;
        n nVar = n.NONE;
        this.iconView = k.a(nVar, new NotificationBarView$iconView$2(context, this));
        this.iconButtonView = k.a(nVar, new NotificationBarView$iconButtonView$2(context, this));
        this.buttonView = k.a(nVar, new NotificationBarView$buttonView$2(context, this));
        View view = new View(context);
        view.setId(R$id.rightTapableArea);
        this.rightTapableArea = view;
        initRoot();
        addChilds();
        setupChildLayoutParams();
        setupListeners();
    }
}
