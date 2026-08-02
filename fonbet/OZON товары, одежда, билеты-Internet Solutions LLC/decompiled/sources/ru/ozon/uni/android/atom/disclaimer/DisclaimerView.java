package ru.ozon.uni.android.atom.disclaimer;

import Cm.e;
import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.graphics.PorterDuff;
import android.graphics.drawable.GradientDrawable;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$color;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.buttonV3.IconButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000\u0086\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u001c\b\u0007\u0018\u0000 u2\u00020\u00012\u00020\u00022\u00020\u0003:\u0002uvB1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0013\u001a\u00020\u000f2\b\u0010\u0012\u001a\u0004\u0018\u00010\rH\u0016¢\u0006\u0004\b\u0013\u0010\u0011J\u001f\u0010\u0019\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u00142\u0006\u0010\u0017\u001a\u00020\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0015\u0010\u001d\u001a\u00020\u00182\u0006\u0010\u001c\u001a\u00020\u001b¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u00182\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010#\u001a\u00020\u0018H\u0000¢\u0006\u0004\b!\u0010\"J\u000f\u0010$\u001a\u00020\u0018H\u0002¢\u0006\u0004\b$\u0010\"J\u0013\u0010&\u001a\u00020\u0018*\u00020%H\u0002¢\u0006\u0004\b&\u0010'J\u0013\u0010(\u001a\u00020\u0018*\u00020%H\u0002¢\u0006\u0004\b(\u0010'J\u0013\u0010)\u001a\u00020\u0018*\u00020%H\u0002¢\u0006\u0004\b)\u0010'J\u0013\u0010*\u001a\u00020\u0018*\u00020%H\u0002¢\u0006\u0004\b*\u0010'J\u0013\u0010+\u001a\u00020\u0018*\u00020%H\u0002¢\u0006\u0004\b+\u0010'J\u0013\u0010,\u001a\u00020\u0018*\u00020%H\u0002¢\u0006\u0004\b,\u0010'J\u0013\u0010-\u001a\u00020\u0018*\u00020%H\u0002¢\u0006\u0004\b-\u0010'J\u000f\u0010.\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/R*\u00101\u001a\u00020\u00142\u0006\u00100\u001a\u00020\u00148\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b1\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010 R\u0014\u00106\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b6\u00107R\u0014\u00108\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00107R\u0014\u00109\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b9\u00107R\u0014\u0010:\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00107R\u0014\u0010;\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u00107R\u0014\u0010<\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u00107R\u0014\u0010>\u001a\u00020=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b>\u0010?R\u0014\u0010@\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u00107R\u0014\u0010A\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bA\u00107R\u0014\u0010C\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u0014\u0010E\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u00107R\u001a\u0010G\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bG\u0010H\u001a\u0004\bI\u0010JR\u001a\u0010K\u001a\u00020F8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bK\u0010H\u001a\u0004\bL\u0010JR\u001a\u0010N\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bN\u0010O\u001a\u0004\bP\u0010QR\u001a\u0010S\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001a\u0010W\u001a\u00020R8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bW\u0010T\u001a\u0004\bX\u0010VR\u001a\u0010Y\u001a\u00020M8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bY\u0010O\u001a\u0004\bZ\u0010QR\u001a\u0010\\\u001a\u00020[8\u0000X\u0080\u0004¢\u0006\f\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_R*\u0010`\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\u000f8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\b`\u0010b\"\u0004\bc\u0010dR\u0016\u0010e\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\be\u00107R\u0016\u0010f\u001a\u00020\b8\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bf\u00107R.\u0010g\u001a\u0004\u0018\u00010\b2\b\u00100\u001a\u0004\u0018\u00010\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bg\u0010h\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bm\u0010bR\u0014\u0010p\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bo\u0010bR\u0014\u0010r\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bq\u0010bR\u0014\u0010t\u001a\u00020\u000f8BX\u0082\u0004¢\u0006\u0006\u001a\u0004\bs\u0010b¨\u0006w"}, d2 = {"Lru/ozon/uni/android/atom/disclaimer/DisclaimerView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "Landroid/view/MotionEvent;", "ev", "", "onInterceptTouchEvent", "(Landroid/view/MotionEvent;)Z", "event", "onTouchEvent", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle;", "mainButtonStyle", "", "setMainButton", "(Ljava/lang/String;Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle;)V", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerStyle;", "disclaimerStyle", "setStyle", "(Lru/ozon/uni/android/atom/disclaimer/DisclaimerStyle;)V", "setAdditionalTitleButton", "(Ljava/lang/String;)V", "setConstraints$uni_release", "()V", "setConstraints", "setupLayout", "Landroidx/constraintlayout/widget/d;", "setIconViewConstraintSet", "(Landroidx/constraintlayout/widget/d;)V", "setTitleViewConstraintSet", "setSubtitleViewConstraintSet", "setChevronViewConstraintSet", "setMainButtonConstraintSet", "setAdditionalButtonConstraintSet", "setCloseIconViewConstraintSet", "getButtonTopChainViewId", "()I", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "dp2", "I", "dp4", "dp6", "dp8", "dp10", "dp12", "", "dp16", "F", "dp30", "dp42", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "defaultIconColor", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "getTitleView$uni_release", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtitleView", "getSubtitleView$uni_release", "Lru/ozon/uni/android/atom/icon/IconView;", "chevronView", "Lru/ozon/uni/android/atom/icon/IconView;", "getChevronView$uni_release", "()Lru/ozon/uni/android/atom/icon/IconView;", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "mainButtonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "getMainButtonView$uni_release", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "additionalButtonView", "getAdditionalButtonView$uni_release", "iconView", "getIconView$uni_release", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "closeIconView", "Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "getCloseIconView$uni_release", "()Lru/ozon/uni/android/controls/buttonV3/IconButtonV3View;", "isDisclaimerClickable", "Z", "()Z", "setDisclaimerClickable", "(Z)V", "backgroundColor", "hoverColor", "iconColor", "Ljava/lang/Integer;", "getIconColor", "()Ljava/lang/Integer;", "setIconColor", "(Ljava/lang/Integer;)V", "getHasIcon", "hasIcon", "getHasTitle", "hasTitle", "getHasSubtitle", "hasSubtitle", "getHasMainButton", "hasMainButton", "Companion", "ButtonsStyle", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DisclaimerView extends ConstraintLayout implements AtomView, AtomLocatableView {

    @NotNull
    private final ButtonV3View additionalButtonView;
    private int backgroundColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final IconView chevronView;

    @NotNull
    private final IconButtonV3View closeIconView;
    private final int defaultIconColor;
    private final int dp10;
    private final int dp12;
    private final float dp16;
    private final int dp2;
    private final int dp30;
    private final int dp4;
    private final int dp42;
    private final int dp6;
    private final int dp8;
    private int hoverColor;
    private Integer iconColor;

    @NotNull
    private final IconView iconView;
    private boolean isDisclaimerClickable;

    @NotNull
    private String locatorTag;

    @NotNull
    private final ButtonV3View mainButtonView;

    @NotNull
    private final TextAtomV2View subtitleView;

    @NotNull
    private final TextAtomV2View titleView;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle;", "", "Base", "Primary", "Custom", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle$Base;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle$Custom;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle$Primary;", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ButtonsStyle {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle$Base;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Base implements ButtonsStyle {

            @NotNull
            public static final Base INSTANCE = new Base();

            private Base() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Base);
            }

            public int hashCode() {
                return -1413189875;
            }

            @NotNull
            public String toString() {
                return "Base";
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle$Custom;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle;", "", "backgroundColor", "textColor", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getBackgroundColor", "getTextColor", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Custom implements ButtonsStyle {
            private final int backgroundColor;
            private final int textColor;

            public Custom(int i11, int i12) {
                this.backgroundColor = i11;
                this.textColor = i12;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Custom)) {
                    return false;
                }
                Custom custom = (Custom) other;
                return this.backgroundColor == custom.backgroundColor && this.textColor == custom.textColor;
            }

            public final int getBackgroundColor() {
                return this.backgroundColor;
            }

            public final int getTextColor() {
                return this.textColor;
            }

            public int hashCode() {
                return Integer.hashCode(this.textColor) + (Integer.hashCode(this.backgroundColor) * 31);
            }

            @NotNull
            public String toString() {
                return e.c("Custom(backgroundColor=", this.backgroundColor, ", textColor=", ")", this.textColor);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle$Primary;", "Lru/ozon/uni/android/atom/disclaimer/DisclaimerView$ButtonsStyle;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Primary implements ButtonsStyle {

            @NotNull
            public static final Primary INSTANCE = new Primary();

            private Primary() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Primary);
            }

            public int hashCode() {
                return -1052185530;
            }

            @NotNull
            public String toString() {
                return "Primary";
            }
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public DisclaimerView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final int getButtonTopChainViewId() {
        return getHasSubtitle() ? this.subtitleView.getId() : this.titleView.getId();
    }

    private final boolean getHasIcon() {
        return this.iconView.getVisibility() == 0;
    }

    private final boolean getHasMainButton() {
        return this.mainButtonView.getVisibility() == 0;
    }

    private final boolean getHasSubtitle() {
        Intrinsics.checkNotNullExpressionValue(this.subtitleView.getText(), "getText(...)");
        return !h.K(r0);
    }

    private final boolean getHasTitle() {
        Intrinsics.checkNotNullExpressionValue(this.titleView.getText(), "getText(...)");
        return !h.K(r0);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setAdditionalButtonConstraintSet(d dVar) {
        dVar.t(this.additionalButtonView.getId(), 3, getButtonTopChainViewId(), 4, this.dp8);
        dVar.t(this.additionalButtonView.getId(), 7, 0, 7, this.dp30);
        dVar.t(this.additionalButtonView.getId(), 4, 0, 4, this.dp12);
        if (getHasMainButton()) {
            dVar.t(this.additionalButtonView.getId(), 6, this.mainButtonView.getId(), 7, this.dp8);
        } else {
            dVar.t(this.additionalButtonView.getId(), 6, getButtonTopChainViewId(), 6, 0);
        }
        dVar.Z(this.additionalButtonView.getId(), 6, this.dp8);
        dVar.c0(0.0f, this.additionalButtonView.getId());
        dVar.C(this.additionalButtonView.getId(), true);
        dVar.y(this.additionalButtonView.getId(), this.dp42);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setChevronViewConstraintSet(d dVar) {
        dVar.t(this.chevronView.getId(), 6, this.titleView.getId(), 7, this.dp4);
        dVar.s(this.chevronView.getId(), 3, this.titleView.getId(), 3);
        dVar.t(this.chevronView.getId(), 7, 0, 7, this.dp12);
        dVar.s(this.chevronView.getId(), 4, this.titleView.getId(), 4);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setCloseIconViewConstraintSet(d dVar) {
        dVar.t(this.closeIconView.getId(), 7, 0, 7, this.dp6);
        dVar.t(this.closeIconView.getId(), 3, 0, 3, this.dp6);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setIconViewConstraintSet(d dVar) {
        dVar.t(this.iconView.getId(), 6, 0, 6, this.dp12);
        dVar.t(this.iconView.getId(), 3, 0, 3, this.dp10);
        dVar.t(this.iconView.getId(), 4, 0, 4, this.dp10);
        dVar.f0(0.0f, this.iconView.getId());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setMainButtonConstraintSet(d dVar) {
        dVar.t(this.mainButtonView.getId(), 3, getButtonTopChainViewId(), 4, this.dp8);
        dVar.s(this.mainButtonView.getId(), 7, this.additionalButtonView.getId(), 6);
        dVar.t(this.mainButtonView.getId(), 4, 0, 4, this.dp12);
        if (getHasTitle()) {
            dVar.s(this.mainButtonView.getId(), 6, this.titleView.getId(), 6);
        } else {
            dVar.s(this.mainButtonView.getId(), 6, this.subtitleView.getId(), 6);
        }
        dVar.Z(this.mainButtonView.getId(), 6, this.dp12 + this.dp4);
        dVar.Z(this.mainButtonView.getId(), 3, this.dp12);
        dVar.Z(this.mainButtonView.getId(), 7, this.dp30);
        dVar.d0(this.mainButtonView.getId(), 2);
        dVar.c0(0.0f, this.mainButtonView.getId());
        dVar.C(this.mainButtonView.getId(), true);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setSubtitleViewConstraintSet(d dVar) {
        d dVar2;
        if (getHasTitle()) {
            dVar.t(this.subtitleView.getId(), 3, this.titleView.getId(), 4, this.dp2);
            dVar2 = dVar;
            dVar2.t(this.subtitleView.getId(), 4, 0, 4, this.dp12);
            dVar2.f0(0.0f, this.subtitleView.getId());
        } else {
            dVar2 = dVar;
            if (getHasIcon()) {
                dVar2.t(this.subtitleView.getId(), 3, this.iconView.getId(), 3, this.dp4);
                dVar2.t(this.subtitleView.getId(), 4, 0, 4, this.dp12);
                dVar2.f0(0.0f, this.subtitleView.getId());
            } else {
                dVar2.t(this.subtitleView.getId(), 3, 0, 3, this.dp12);
                dVar2.t(this.subtitleView.getId(), 4, 0, 4, this.dp12);
                dVar2.f0(0.0f, this.subtitleView.getId());
            }
        }
        dVar2.t(this.subtitleView.getId(), 6, this.iconView.getId(), 7, this.dp8);
        dVar2.t(this.subtitleView.getId(), 7, 0, 7, this.dp30);
        dVar2.d0(this.subtitleView.getId(), 2);
        dVar2.c0(0.0f, this.subtitleView.getId());
        dVar2.C(this.subtitleView.getId(), true);
        dVar2.Z(this.subtitleView.getId(), 6, this.dp12);
        dVar2.Z(this.subtitleView.getId(), 3, this.dp12);
        dVar2.Z(this.subtitleView.getId(), 4, this.dp12);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void setTitleViewConstraintSet(d dVar) {
        dVar.t(this.titleView.getId(), 6, this.iconView.getId(), 7, this.dp8);
        if (getHasIcon()) {
            dVar.t(this.titleView.getId(), 3, this.iconView.getId(), 3, this.dp2);
            dVar.t(this.titleView.getId(), 4, 0, 4, this.dp12);
            dVar.f0(0.0f, this.titleView.getId());
        } else {
            dVar.t(this.titleView.getId(), 3, 0, 3, this.dp12);
            dVar.t(this.titleView.getId(), 4, 0, 4, this.dp12);
            dVar.f0(0.0f, this.titleView.getId());
        }
        if (this.isDisclaimerClickable) {
            dVar.t(this.titleView.getId(), 7, this.chevronView.getId(), 6, 0);
        } else {
            dVar.t(this.titleView.getId(), 7, 0, 7, this.dp30);
        }
        dVar.d0(this.titleView.getId(), 2);
        dVar.c0(0.0f, this.titleView.getId());
        dVar.C(this.titleView.getId(), true);
        dVar.Z(this.titleView.getId(), 4, this.dp6);
        dVar.Z(this.titleView.getId(), 6, this.dp12);
    }

    private final void setupLayout() {
        addView(this.iconView);
        addView(this.titleView);
        addView(this.subtitleView);
        addView(this.chevronView);
        addView(this.closeIconView);
        addView(this.mainButtonView);
        addView(this.additionalButtonView);
        setConstraints$uni_release();
    }

    @NotNull
    /* renamed from: getAdditionalButtonView$uni_release, reason: from getter */
    public final ButtonV3View getAdditionalButtonView() {
        return this.additionalButtonView;
    }

    @NotNull
    /* renamed from: getChevronView$uni_release, reason: from getter */
    public final IconView getChevronView() {
        return this.chevronView;
    }

    @NotNull
    /* renamed from: getCloseIconView$uni_release, reason: from getter */
    public final IconButtonV3View getCloseIconView() {
        return this.closeIconView;
    }

    @NotNull
    /* renamed from: getIconView$uni_release, reason: from getter */
    public final IconView getIconView() {
        return this.iconView;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @NotNull
    /* renamed from: getMainButtonView$uni_release, reason: from getter */
    public final ButtonV3View getMainButtonView() {
        return this.mainButtonView;
    }

    @NotNull
    /* renamed from: getSubtitleView$uni_release, reason: from getter */
    public final TextAtomV2View getSubtitleView() {
        return this.subtitleView;
    }

    @NotNull
    /* renamed from: getTitleView$uni_release, reason: from getter */
    public final TextAtomV2View getTitleView() {
        return this.titleView;
    }

    /* renamed from: isDisclaimerClickable, reason: from getter */
    public final boolean getIsDisclaimerClickable() {
        return this.isDisclaimerClickable;
    }

    @Override // android.view.ViewGroup
    public boolean onInterceptTouchEvent(MotionEvent ev) {
        return this.isDisclaimerClickable;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (!this.isDisclaimerClickable) {
            return false;
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            new Color.Solid(this.hoverColor).applyTo(this.backgroundDrawable);
        } else if (valueOf != null && valueOf.intValue() == 1) {
            new Color.Solid(this.backgroundColor).applyTo(this.backgroundDrawable);
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            new Color.Solid(this.backgroundColor).applyTo(this.backgroundDrawable);
        }
        return true;
    }

    public final void setAdditionalTitleButton(String title) {
        this.additionalButtonView.setVisibility(!this.isDisclaimerClickable && title != null ? 0 : 8);
        if (this.isDisclaimerClickable) {
            return;
        }
        this.additionalButtonView.setTitle(title);
    }

    public final void setConstraints$uni_release() {
        ConstraintLayoutExtKt.updateConstraints(this, new DisclaimerView$setConstraints$1(this));
    }

    public final void setDisclaimerClickable(boolean z11) {
        setFocusable(z11);
        setClickable(z11);
        this.titleView.setMaxLines(z11 ? 1 : Integer.MAX_VALUE);
        this.subtitleView.setMaxLines(z11 ? 3 : Integer.MAX_VALUE);
        this.isDisclaimerClickable = z11;
    }

    public final void setIconColor(Integer num) {
        if (num == null) {
            this.iconView.clearColorFilter();
        } else {
            this.iconView.setColorFilter(num.intValue(), PorterDuff.Mode.SRC_IN);
        }
        this.iconColor = num;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
    }

    public final void setMainButton(String title, @NotNull ButtonsStyle mainButtonStyle) {
        Intrinsics.checkNotNullParameter(mainButtonStyle, "mainButtonStyle");
        this.mainButtonView.setVisibility(!this.isDisclaimerClickable && title != null ? 0 : 8);
        if (this.isDisclaimerClickable) {
            return;
        }
        this.mainButtonView.setTitle(title);
        ButtonV3View buttonV3View = this.mainButtonView;
        if (mainButtonStyle instanceof ButtonsStyle.Base) {
            buttonV3View.setBackColor(new Color.Solid(a.getColor(buttonV3View.getContext(), R$color.bg_overlap)));
            buttonV3View.setTitleColor(a.getColor(buttonV3View.getContext(), R$color.text_primary));
        } else if (mainButtonStyle instanceof ButtonsStyle.Primary) {
            ExtensionsKt.setPrimaryStyle(buttonV3View);
        } else {
            if (!(mainButtonStyle instanceof ButtonsStyle.Custom)) {
                throw new o();
            }
            ButtonsStyle.Custom custom = (ButtonsStyle.Custom) mainButtonStyle;
            buttonV3View.setBackColor(new Color.Solid(custom.getBackgroundColor()));
            buttonV3View.setTitleColor(custom.getTextColor());
        }
    }

    public final void setStyle(@NotNull DisclaimerStyle disclaimerStyle) {
        Intrinsics.checkNotNullParameter(disclaimerStyle, "disclaimerStyle");
        this.backgroundColor = disclaimerStyle.getBackgroundColor();
        this.hoverColor = disclaimerStyle.getHoverColor();
        new Color.Solid(this.backgroundColor).applyTo(this.backgroundDrawable);
        DrawableResource.Companion companion = DrawableResource.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        setIconColor(companion.fromResources(resources, disclaimerStyle.getIcon()).getIsMulticolor() ? null : Integer.valueOf(disclaimerStyle.getIconColor()));
        this.iconView.setImageResource(disclaimerStyle.getIcon());
    }

    public /* synthetic */ DisclaimerView(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public DisclaimerView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = SelectionItemFormDTO.DISCLAIMER_FIELD_NAME;
        this.dp2 = UiExtKt.toPx(2, context);
        this.dp4 = UiExtKt.toPx(4, context);
        this.dp6 = UiExtKt.toPx(6, context);
        this.dp8 = UiExtKt.toPx(8, context);
        this.dp10 = UiExtKt.toPx(10, context);
        this.dp12 = UiExtKt.toPx(12, context);
        float pxF = ResourceExtKt.toPxF(16, context);
        this.dp16 = pxF;
        this.dp30 = UiExtKt.toPx(30, context);
        this.dp42 = UiExtKt.toPx(42, context);
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setCornerRadius(pxF);
        this.backgroundDrawable = gradientDrawable;
        int color = a.getColor(context, R$color.graphic_tertiary);
        this.defaultIconColor = color;
        int i13 = 0;
        TextAtomV2View textAtomV2View = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View.setId(View.generateViewId());
        textAtomV2View.setVisibility(8);
        TextUtils.TruncateAt truncateAt = TextUtils.TruncateAt.END;
        textAtomV2View.setEllipsize(truncateAt);
        textAtomV2View.setMaxLines(1);
        textAtomV2View.setTextAppearance(UniTextStyles.COMPACT_CONTROL_500_MEDIUM.getResId());
        textAtomV2View.setTextColor(a.getColor(context, R$color.text_primary));
        textAtomV2View.setContentDescription("disclaimer.subtitle");
        this.titleView = textAtomV2View;
        TextAtomV2View textAtomV2View2 = new TextAtomV2View(context, null, 0, 6, null);
        textAtomV2View2.setId(View.generateViewId());
        textAtomV2View2.setVisibility(8);
        textAtomV2View2.setEllipsize(truncateAt);
        textAtomV2View2.setMaxLines(3);
        textAtomV2View2.setTextAppearance(UniTextStyles.BODY_400_SMALL.getResId());
        textAtomV2View2.setTextColor(a.getColor(context, R$color.text_secondary));
        textAtomV2View2.setContentDescription("disclaimer.subtitle");
        this.subtitleView = textAtomV2View2;
        AttributeSet attributeSet2 = null;
        IconView iconView = new IconView(context, attributeSet2, i13, 6, null);
        iconView.setId(View.generateViewId());
        iconView.setVisibility(8);
        iconView.setImageResource(R$drawable.ic_m_chevron_right_filled);
        iconView.setColorFilter(color, PorterDuff.Mode.SRC_IN);
        ExtensionsKt.setDefaultSize(iconView);
        iconView.setContentDescription("disclaimer.chevron");
        this.chevronView = iconView;
        int i14 = 14;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i15 = 0;
        ButtonV3View buttonV3View = new ButtonV3View(context, attributeSet2, i13, i15, i14, defaultConstructorMarker);
        buttonV3View.setId(View.generateViewId());
        ExtensionsKt.setDefaultSize(buttonV3View);
        this.mainButtonView = buttonV3View;
        ButtonV3View buttonV3View2 = new ButtonV3View(context, attributeSet2, i13, i15, i14, defaultConstructorMarker);
        buttonV3View2.setId(View.generateViewId());
        ExtensionsKt.setDefaultSize(buttonV3View2);
        buttonV3View2.setBackColor(new Color.Solid(a.getColor(context, R$color.bg_overlap)));
        buttonV3View2.setTitleColor(a.getColor(context, R$color.text_primary));
        this.additionalButtonView = buttonV3View2;
        IconView iconView2 = new IconView(context, null, 0, 6, null);
        iconView2.setId(View.generateViewId());
        iconView2.setVisibility(8);
        ExtensionsKt.setDefaultSize(iconView2);
        iconView2.setContentDescription("disclaimer.icon");
        this.iconView = iconView2;
        IconButtonV3View iconButtonV3View = new IconButtonV3View(context, null, 0, 0, 14, null);
        iconButtonV3View.setId(View.generateViewId());
        iconButtonV3View.setVisibility(8);
        ExtensionsKt.setDefaultSize(iconButtonV3View);
        ExtensionsKt.setCustomStyle(iconButtonV3View);
        iconButtonV3View.setIconColor(color);
        iconButtonV3View.setBackColor(new Color.Solid(a.getColor(context, R.color.transparent)));
        DrawableResource.Companion companion = DrawableResource.INSTANCE;
        Resources resources = context.getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        iconButtonV3View.setIconDrawable(companion.fromResources(resources, R$drawable.ic_s_cross_filled_compact));
        iconButtonV3View.setContentDescription("disclaimer.closeButton");
        this.closeIconView = iconButtonV3View;
        this.backgroundColor = a.getColor(context, R$color.bg_secondary);
        this.hoverColor = a.getColor(context, R$color.bg_active_secondary);
        this.iconColor = Integer.valueOf(color);
        setBackground(gradientDrawable);
        setupLayout();
    }
}
