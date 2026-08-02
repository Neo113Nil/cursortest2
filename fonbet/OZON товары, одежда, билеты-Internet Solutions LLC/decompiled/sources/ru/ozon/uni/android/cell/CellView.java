package ru.ozon.uni.android.cell;

import Xc.a;
import Xc.b;
import android.R;
import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.drawable.GradientDrawable;
import android.text.Layout;
import android.text.StaticLayout;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Guideline;
import androidx.constraintlayout.widget.d;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.badge.BadgeView;
import ru.ozon.uni.android.atom.icon.IconView;
import ru.ozon.uni.android.atom.image.Image;
import ru.ozon.uni.android.atom.indicator.ui.IndicatorView;
import ru.ozon.uni.android.atom.price.ui.PriceAtomView;
import ru.ozon.uni.android.atom.selectionControls.CheckBoxView;
import ru.ozon.uni.android.atom.selectionControls.RadioButtonView;
import ru.ozon.uni.android.atom.selectionControls.ToggleView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.cell.CommonCellSettingsKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;

@Metadata(d1 = {"\u0000¤\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0014\n\u0002\b\r\b\u0007\u0018\u0000 m2\u00020\u00012\u00020\u00022\u00020\u0003:\u0007mnopqrsBC\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b\u0012\u0010\b\u0002\u0010\f\u001a\n\u0012\u0004\u0012\u00020\b\u0018\u00010\u000b¢\u0006\u0004\b\r\u0010\u000eJ\u0019\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0019\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fH\u0016¢\u0006\u0004\b\u0014\u0010\u0013J\u0017\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0016\u001a\u00020\u0015H\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u00172\b\b\u0001\u0010\u001a\u001a\u00020\b¢\u0006\u0004\b\u001d\u0010\u001cJ#\u0010!\u001a\u00020 2\b\b\u0002\u0010\u001e\u001a\u00020\b2\b\b\u0002\u0010\u001f\u001a\u00020\bH\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0017H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010%\u001a\u00020\u0017*\u00020\u0015H\u0002¢\u0006\u0004\b%\u0010\u0019R\u0014\u0010&\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b&\u0010'R\u0014\u0010(\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b(\u0010'R\u0014\u0010)\u001a\u00020\b8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b)\u0010'R\u0014\u0010+\u001a\u00020*8\u0002X\u0082D¢\u0006\u0006\n\u0004\b+\u0010,R\u0014\u0010-\u001a\u00020\u00118\u0002X\u0082D¢\u0006\u0006\n\u0004\b-\u0010.R\u0014\u00100\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u00101R\u0014\u00102\u001a\u00020/8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00101R\u0014\u00104\u001a\u0002038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u00105R\u0014\u00106\u001a\u00020*8\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b6\u0010,R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R\u0014\u0010:\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u00109R\u0014\u0010;\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b;\u0010'R\u0014\u0010<\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010'R\u0014\u0010=\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b=\u0010'R\u0017\u0010?\u001a\u00020>8\u0006¢\u0006\f\n\u0004\b?\u0010@\u001a\u0004\bA\u0010BR\u0017\u0010D\u001a\u00020C8\u0006¢\u0006\f\n\u0004\bD\u0010E\u001a\u0004\bF\u0010GR\u0017\u0010I\u001a\u00020H8\u0006¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR*\u0010N\u001a\u00020\u00112\u0006\u0010M\u001a\u00020\u00118\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bN\u0010.\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR*\u0010S\u001a\u00020\b2\u0006\u0010M\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bS\u0010'\u001a\u0004\bT\u0010U\"\u0004\bV\u0010\u001cR*\u0010X\u001a\u00020W2\u0006\u0010M\u001a\u00020W8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\u001a\u0010`\u001a\b\u0012\u0004\u0012\u00020_0^8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b`\u0010aR$\u0010f\u001a\u00020*2\u0006\u0010M\u001a\u00020*8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR(\u0010l\u001a\u0004\u0018\u00010g2\b\u0010M\u001a\u0004\u0018\u00010g8F@FX\u0086\u000e¢\u0006\f\u001a\u0004\bh\u0010i\"\u0004\bj\u0010k¨\u0006t"}, d2 = {"Lru/ozon/uni/android/cell/CellView;", "Landroid/widget/LinearLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "initViewIds", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/Set;)V", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "onTouchEvent", "Landroid/graphics/Canvas;", "canvas", "", "dispatchDraw", "(Landroid/graphics/Canvas;)V", "color", "setCellBackgroundColor", "(I)V", "setCellHoverColor", "width", "height", "Landroid/widget/LinearLayout$LayoutParams;", "createLayoutParams", "(II)Landroid/widget/LinearLayout$LayoutParams;", "updateInnerViewsLocators", "()V", "drawSeparator", "defaultSeparatorColor", "I", "defaultCellBackgroundColor", "defaultHoverColor", "", "defaultCellCornerRadius", "F", "defaultHasSeparator", "Z", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "leftBlockDefaultAlignment", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "rightBlockDefaultAlignment", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "separatorWidth", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "leftBlockId", "centerBlockId", "rightBlockId", "Lru/ozon/uni/android/cell/CellView$LeftBlock;", "leftBlock", "Lru/ozon/uni/android/cell/CellView$LeftBlock;", "getLeftBlock", "()Lru/ozon/uni/android/cell/CellView$LeftBlock;", "Lru/ozon/uni/android/cell/CellView$CenterBlock;", "centerBlock", "Lru/ozon/uni/android/cell/CellView$CenterBlock;", "getCenterBlock", "()Lru/ozon/uni/android/cell/CellView$CenterBlock;", "Lru/ozon/uni/android/cell/CellView$RightBlock;", "rightBlock", "Lru/ozon/uni/android/cell/CellView$RightBlock;", "getRightBlock", "()Lru/ozon/uni/android/cell/CellView$RightBlock;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "hasSeparator", "getHasSeparator", "()Z", "setHasSeparator", "(Z)V", "separatorColor", "getSeparatorColor", "()I", "setSeparatorColor", "", "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "", "Landroid/view/View;", "views", "Ljava/util/List;", "getCellCornerRadius", "()F", "setCellCornerRadius", "(F)V", "cellCornerRadius", "", "getCellCornerRadii", "()[F", "setCellCornerRadii", "([F)V", "cellCornerRadii", "Companion", "AddonBlock", "LeftBlock", "CenterBlock", "RightBlock", "FlowBadgeListView", "TextView", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class CellView extends LinearLayout implements AtomView, AtomLocatableView {

    @NotNull
    private final GradientDrawable backgroundDrawable;

    @NotNull
    private final CenterBlock centerBlock;
    private final int centerBlockId;
    private final int defaultCellBackgroundColor;
    private final float defaultCellCornerRadius;
    private final boolean defaultHasSeparator;
    private final int defaultHoverColor;
    private final int defaultSeparatorColor;

    @NotNull
    private final GradientDrawable foregroundDrawable;
    private boolean hasSeparator;

    @NotNull
    private final LeftBlock leftBlock;

    @NotNull
    private final AddonBlock.Alignment leftBlockDefaultAlignment;
    private final int leftBlockId;

    @NotNull
    private String locatorTag;

    @NotNull
    private final Paint paint;

    @NotNull
    private final RightBlock rightBlock;

    @NotNull
    private final AddonBlock.Alignment rightBlockDefaultAlignment;
    private final int rightBlockId;
    private int separatorColor;
    private final float separatorWidth;

    @NotNull
    private final List<View> views;
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0007\bf\u0018\u00002\u00020\u0001:\u0001\u000eR\u001c\u0010\u0007\u001a\u00020\u00028&@&X¦\u000e¢\u0006\f\u001a\u0004\b\u0003\u0010\u0004\"\u0004\b\u0005\u0010\u0006R\u001c\u0010\r\u001a\u00020\b8&@&X¦\u000e¢\u0006\f\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\f¨\u0006\u000f"}, d2 = {"Lru/ozon/uni/android/cell/CellView$AddonBlock;", "", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "getAlignment", "()Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "setAlignment", "(Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;)V", "alignment", "", "getHorizontalGap", "()I", "setHorizontalGap", "(I)V", "horizontalGap", "Alignment", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AddonBlock {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "", "<init>", "(Ljava/lang/String;I)V", "ALIGNMENT_TOP", "ALIGNMENT_CENTER", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        /* loaded from: classes7.dex */
        public static final class Alignment {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Alignment[] $VALUES;
            public static final Alignment ALIGNMENT_TOP = new Alignment("ALIGNMENT_TOP", 0);
            public static final Alignment ALIGNMENT_CENTER = new Alignment("ALIGNMENT_CENTER", 1);

            private static final /* synthetic */ Alignment[] $values() {
                return new Alignment[]{ALIGNMENT_TOP, ALIGNMENT_CENTER};
            }

            static {
                Alignment[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Alignment(String str, int i11) {
            }

            @NotNull
            public static a<Alignment> getEntries() {
                return $ENTRIES;
            }

            public static Alignment valueOf(String str) {
                return (Alignment) Enum.valueOf(Alignment.class, str);
            }

            public static Alignment[] values() {
                return (Alignment[]) $VALUES.clone();
            }
        }

        void setAlignment(@NotNull Alignment alignment);

        void setHorizontalGap(int i11);
    }

    @Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u001e\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 |2\u00020\u00012\u00020\u0002:\u0001|BC\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u001f\u0010\u0011\u001a\u00020\u00102\u0006\u0010\u000e\u001a\u00020\u00072\u0006\u0010\u000f\u001a\u00020\u0007H\u0014¢\u0006\u0004\b\u0011\u0010\u0012J\u0019\u0010\u0016\u001a\u00020\u00152\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u001b\u001a\u00020\u00102\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u001f\u0010\u001eR\u001a\u0010 \u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b \u0010!\u001a\u0004\b\"\u0010#R\u001a\u0010$\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b$\u0010!\u001a\u0004\b%\u0010#R\u001a\u0010&\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b&\u0010!\u001a\u0004\b'\u0010#R\u001a\u0010(\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b(\u0010!\u001a\u0004\b)\u0010#R\u001a\u0010*\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b*\u0010!\u001a\u0004\b+\u0010#R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b,\u0010!R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b-\u0010!R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0083\u0004¢\u0006\u0006\n\u0004\b.\u0010!R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010!R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010!R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010!R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010!R\u0014\u00103\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b3\u0010!R\u0014\u00104\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b4\u0010!R\u0016\u00105\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u001c\u00108\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u0018078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R \u0010<\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020;0:8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b<\u0010=R\u001a\u0010>\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b>\u0010?\u001a\u0004\b@\u0010AR$\u0010C\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR$\u0010I\u001a\u0004\u0018\u00010B8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010D\u001a\u0004\bJ\u0010F\"\u0004\bK\u0010HR$\u0010M\u001a\u0004\u0018\u00010L8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bM\u0010N\u001a\u0004\bO\u0010P\"\u0004\bQ\u0010RR\u001a\u0010T\u001a\u00020S8\u0000X\u0080\u0004¢\u0006\f\n\u0004\bT\u0010U\u001a\u0004\bV\u0010WR$\u0010Y\u001a\u0004\u0018\u00010X8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bY\u0010Z\u001a\u0004\b[\u0010\\\"\u0004\b]\u0010^R$\u0010`\u001a\u0004\u0018\u00010_8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b`\u0010a\u001a\u0004\bb\u0010c\"\u0004\bd\u0010eR*\u0010g\u001a\u00020\u00072\u0006\u0010f\u001a\u00020\u00078\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bg\u0010!\u001a\u0004\bh\u0010#\"\u0004\bi\u0010jR*\u0010l\u001a\u00020k2\u0006\u0010f\u001a\u00020k8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010FR\u0014\u0010u\u001a\u00020B8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010FR\u0014\u0010w\u001a\u00020L8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010PR\u0014\u0010y\u001a\u00020X8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010\\R\u0014\u0010{\u001a\u00020_8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010c¨\u0006}"}, d2 = {"Lru/ozon/uni/android/cell/CellView$CenterBlock;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "initViewIds", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/Set;)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "Landroid/view/View;", "view", "position", "addSubview", "(Landroid/view/View;I)V", "reconstructLayout", "()V", "updateInnerViewsLocators", "defaultTitleTextColor", "I", "getDefaultTitleTextColor$uni_release", "()I", "defaultTitleTextAppearance", "getDefaultTitleTextAppearance$uni_release", "defaultSubtitleTextColor", "getDefaultSubtitleTextColor$uni_release", "defaultSubtitleTextAppearance", "getDefaultSubtitleTextAppearance$uni_release", "defaultTitleSubtitleGap", "getDefaultTitleSubtitleGap$uni_release", "titleAddonViewLeftMargin", "badgeListViewTopMargin", "verticalPadding", "titleViewId", "titleGuidelineViewId", "subtitleViewId", "titleBadgeViewId", "titleIconViewId", "badgeListViewId", "shouldUpdateConstraints", "Z", "", "allocatedViews", "[Landroid/view/View;", "", "Lru/ozon/uni/android/cell/SubviewMetadata;", "subviewsMetadata", "Ljava/util/Map;", "containerView", "Lru/ozon/uni/android/cell/CellView$CenterBlock;", "getContainerView", "()Lru/ozon/uni/android/cell/CellView$CenterBlock;", "Lru/ozon/uni/android/cell/CellView$TextView;", "_titleView", "Lru/ozon/uni/android/cell/CellView$TextView;", "get_titleView$uni_release", "()Lru/ozon/uni/android/cell/CellView$TextView;", "set_titleView$uni_release", "(Lru/ozon/uni/android/cell/CellView$TextView;)V", "_subtitleView", "get_subtitleView$uni_release", "set_subtitleView$uni_release", "Lru/ozon/uni/android/atom/badge/BadgeView;", "_titleBadgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "get_titleBadgeView$uni_release", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "set_titleBadgeView$uni_release", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Landroidx/constraintlayout/widget/Guideline;", "titleGuidelineView", "Landroidx/constraintlayout/widget/Guideline;", "getTitleGuidelineView$uni_release", "()Landroidx/constraintlayout/widget/Guideline;", "Lru/ozon/uni/android/atom/icon/IconView;", "_titleIconView", "Lru/ozon/uni/android/atom/icon/IconView;", "get_titleIconView$uni_release", "()Lru/ozon/uni/android/atom/icon/IconView;", "set_titleIconView$uni_release", "(Lru/ozon/uni/android/atom/icon/IconView;)V", "Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;", "_badgeListView", "Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;", "get_badgeListView$uni_release", "()Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;", "set_badgeListView$uni_release", "(Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;)V", AppMeasurementSdk.ConditionalUserProperty.VALUE, "titleSubtitleGap", "getTitleSubtitleGap", "setTitleSubtitleGap", "(I)V", "", "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "getTitleView", "titleView", "getSubtitleView", "subtitleView", "getTitleBadgeView", "titleBadgeView", "getTitleIconView", "titleIconView", "getBadgeListView", "badgeListView", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class CenterBlock extends ConstraintLayout implements AtomLocatableView {
        private FlowBadgeListView _badgeListView;
        private TextView _subtitleView;
        private BadgeView _titleBadgeView;
        private IconView _titleIconView;
        private TextView _titleView;

        @NotNull
        private final View[] allocatedViews;
        private final int badgeListViewId;
        private final int badgeListViewTopMargin;

        @NotNull
        private final CenterBlock containerView;
        private final int defaultSubtitleTextAppearance;
        private final int defaultSubtitleTextColor;
        private final int defaultTitleSubtitleGap;
        private final int defaultTitleTextAppearance;
        private final int defaultTitleTextColor;

        @NotNull
        private String locatorTag;
        private boolean shouldUpdateConstraints;
        private final int subtitleViewId;

        @NotNull
        private final Map<Integer, SubviewMetadata> subviewsMetadata;
        private final int titleAddonViewLeftMargin;
        private final int titleBadgeViewId;

        @NotNull
        private final Guideline titleGuidelineView;
        private final int titleGuidelineViewId;
        private final int titleIconViewId;
        private int titleSubtitleGap;
        private final int titleViewId;
        private final int verticalPadding;
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public CenterBlock(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, Set<Integer> set) {
            super(context, attributeSet, i11, i12);
            TextView textView;
            TextView textView2;
            BadgeView badgeView;
            View initSubview;
            View initSubview2;
            View initSubview3;
            View initSubview4;
            View initSubview5;
            Intrinsics.checkNotNullParameter(context, "context");
            this.defaultTitleTextColor = ThemeExtKt.themeColor(context, R$attr.textPrimary);
            this.defaultTitleTextAppearance = UniTextStyles.COMPACT_500_MEDIUM.getResId();
            this.defaultSubtitleTextColor = ThemeExtKt.themeColor(context, R$attr.textSecondary);
            this.defaultSubtitleTextAppearance = UniTextStyles.BODY_400_SMALL.getResId();
            int px = UiExtKt.toPx(2, context);
            this.defaultTitleSubtitleGap = px;
            this.titleAddonViewLeftMargin = UiExtKt.toPx(4, context);
            this.badgeListViewTopMargin = UiExtKt.toPx(6, context);
            int px2 = UiExtKt.toPx(2, context);
            this.verticalPadding = px2;
            int i13 = R$id.cell_center_title;
            this.titleViewId = i13;
            int i14 = R$id.cell_center_title_guideline;
            this.titleGuidelineViewId = i14;
            int i15 = R$id.cell_center_subtitle;
            this.subtitleViewId = i15;
            int i16 = R$id.cell_center_title_badge;
            this.titleBadgeViewId = i16;
            int i17 = R$id.cell_center_title_icon;
            this.titleIconViewId = i17;
            int i18 = R$id.cell_center_title_badgelist;
            this.badgeListViewId = i18;
            this.allocatedViews = new View[6];
            Map<Integer, SubviewMetadata> j11 = U.j(new Pair(Integer.valueOf(i13), new SubviewMetadata(new CellView$CenterBlock$subviewsMetadata$1(context, this), 0, SelectionItemDescriptionDTO.TITLE)), new Pair(Integer.valueOf(i14), new SubviewMetadata(new CellView$CenterBlock$subviewsMetadata$2(context, this), 1, "")), new Pair(Integer.valueOf(i15), new SubviewMetadata(new CellView$CenterBlock$subviewsMetadata$3(context, this), 2, "SUBTITLE")), new Pair(Integer.valueOf(i16), new SubviewMetadata(new CellView$CenterBlock$subviewsMetadata$4(context, this), 3, "TITLE_BADGE")), new Pair(Integer.valueOf(i17), new SubviewMetadata(new CellView$CenterBlock$subviewsMetadata$5(context, this), 4, "TITLE_ICON")), new Pair(Integer.valueOf(i18), new SubviewMetadata(new CellView$CenterBlock$subviewsMetadata$6(context, this), 5, "BADGE_LIST")));
            this.subviewsMetadata = j11;
            this.containerView = this;
            IconView iconView = null;
            if (set == null || !set.contains(Integer.valueOf(i13))) {
                textView = null;
            } else {
                SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(j11, Integer.valueOf(i13));
                initSubview5 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
                addSubview(initSubview5, subviewMetadata.getPosition());
                textView = (TextView) initSubview5;
            }
            this._titleView = textView;
            if (set == null || !set.contains(Integer.valueOf(i15))) {
                textView2 = null;
            } else {
                SubviewMetadata subviewMetadata2 = (SubviewMetadata) U.e(j11, Integer.valueOf(i15));
                initSubview4 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata2);
                addSubview(initSubview4, subviewMetadata2.getPosition());
                textView2 = (TextView) initSubview4;
            }
            this._subtitleView = textView2;
            if (set == null || !set.contains(Integer.valueOf(i16))) {
                badgeView = null;
            } else {
                SubviewMetadata subviewMetadata3 = (SubviewMetadata) U.e(j11, Integer.valueOf(i16));
                initSubview3 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata3);
                addSubview(initSubview3, subviewMetadata3.getPosition());
                badgeView = (BadgeView) initSubview3;
            }
            this._titleBadgeView = badgeView;
            SubviewMetadata subviewMetadata4 = (SubviewMetadata) U.e(j11, Integer.valueOf(i14));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata4);
            addSubview(initSubview, subviewMetadata4.getPosition());
            this.titleGuidelineView = (Guideline) initSubview;
            if (set != null && set.contains(Integer.valueOf(i17))) {
                SubviewMetadata subviewMetadata5 = (SubviewMetadata) U.e(j11, Integer.valueOf(i17));
                initSubview2 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata5);
                addSubview(initSubview2, subviewMetadata5.getPosition());
                iconView = (IconView) initSubview2;
            }
            this._titleIconView = iconView;
            this.titleSubtitleGap = px;
            this.locatorTag = "CENTER_BLOCK";
            setPadding(0, px2, 0, px2);
            this.shouldUpdateConstraints = true;
        }

        private final void addSubview(View view, int position) {
            getContainerView().addView(view);
            this.allocatedViews[position] = view;
            this.shouldUpdateConstraints = true;
        }

        private final void reconstructLayout() {
            CenterBlock containerView = getContainerView();
            d dVar = new d();
            dVar.p(containerView);
            Iterator<View> it = C5316f0.b(getContainerView()).iterator();
            while (true) {
                C5314e0 c5314e0 = (C5314e0) it;
                if (!c5314e0.hasNext()) {
                    break;
                } else {
                    dVar.n(((View) c5314e0.next()).getId());
                }
            }
            dVar.n(getContainerView().getId());
            TextView textView = this._titleView;
            BadgeView badgeView = this._titleBadgeView;
            if (badgeView == null || badgeView.getVisibility() != 0) {
                badgeView = null;
            }
            View[] elements = {textView, badgeView, this._titleIconView};
            Intrinsics.checkNotNullParameter(elements, "elements");
            ArrayList B11 = C7705l.B(elements);
            if (!B11.isEmpty()) {
                View view = (View) C7714v.K(B11);
                if (B11.size() > 1) {
                    ArrayList arrayList = new ArrayList(C7714v.z(B11, 10));
                    Iterator it2 = B11.iterator();
                    while (it2.hasNext()) {
                        arrayList.add(Integer.valueOf(((View) it2.next()).getId()));
                    }
                    dVar.E(C7714v.T0(arrayList), null, 2);
                } else {
                    ConstraintSetExtKt.layoutConstraintStartToStartOfParent(dVar, view);
                    ConstraintSetExtKt.layoutConstraintEndToEndOfParent(dVar, view);
                }
                dVar.c0(0.0f, view.getId());
            }
            TextView textView2 = this._titleView;
            TextView textView3 = this._subtitleView;
            if (textView3 == null || textView3.getVisibility() != 0) {
                textView3 = null;
            }
            FlowBadgeListView flowBadgeListView = this._badgeListView;
            if (flowBadgeListView == null || flowBadgeListView.getVisibility() != 0) {
                flowBadgeListView = null;
            }
            View[] elements2 = {textView2, textView3, flowBadgeListView};
            Intrinsics.checkNotNullParameter(elements2, "elements");
            ArrayList B12 = C7705l.B(elements2);
            if (!B12.isEmpty()) {
                View view2 = (View) C7714v.K(B12);
                if (B12.size() > 1) {
                    ArrayList arrayList2 = new ArrayList(C7714v.z(B12, 10));
                    Iterator it3 = B12.iterator();
                    while (it3.hasNext()) {
                        arrayList2.add(Integer.valueOf(((View) it3.next()).getId()));
                    }
                    dVar.F(0, 0, C7714v.T0(arrayList2), null);
                    FlowBadgeListView flowBadgeListView2 = this._badgeListView;
                    if (flowBadgeListView2 != null) {
                        dVar.e0(flowBadgeListView2.getId(), 3, this.badgeListViewTopMargin);
                    }
                } else {
                    ConstraintSetExtKt.layoutConstraintTopToTopOfParent(dVar, view2);
                    ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(dVar, view2);
                }
                dVar.f0(0.0f, view2.getId());
            }
            TextView textView4 = this._titleView;
            if (textView4 != null) {
                dVar.C(textView4.getId(), true);
                dVar.A(textView4.getId(), -2);
                dVar.w(textView4.getId(), -2);
                this.titleGuidelineView.a(textView4.getLineHeight() / 2);
            }
            BadgeView badgeView2 = this._titleBadgeView;
            if (badgeView2 != null) {
                dVar.A(badgeView2.getId(), -2);
                dVar.w(badgeView2.getId(), -2);
                dVar.e0(badgeView2.getId(), 1, this.titleAddonViewLeftMargin);
                ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, badgeView2.getId(), this.titleGuidelineViewId);
                ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, badgeView2.getId(), this.titleGuidelineViewId);
                dVar.h0(badgeView2.getId(), badgeView2.getVisibility());
            }
            IconView iconView = this._titleIconView;
            if (iconView != null) {
                dVar.A(iconView.getId(), -2);
                dVar.w(iconView.getId(), -2);
                dVar.e0(iconView.getId(), 1, this.titleAddonViewLeftMargin);
                ConstraintSetExtKt.layoutConstraintTopToTopOf(dVar, iconView.getId(), this.titleGuidelineViewId);
                ConstraintSetExtKt.layoutConstraintBottomToBottomOf(dVar, iconView.getId(), this.titleGuidelineViewId);
                dVar.h0(iconView.getId(), iconView.getVisibility());
            }
            TextView textView5 = this._subtitleView;
            if (textView5 != null) {
                dVar.A(textView5.getId(), 0);
                dVar.w(textView5.getId(), -2);
                dVar.e0(textView5.getId(), 3, getTitleSubtitleGap());
                dVar.h0(textView5.getId(), textView5.getVisibility());
            }
            FlowBadgeListView flowBadgeListView3 = this._badgeListView;
            if (flowBadgeListView3 != null) {
                dVar.A(flowBadgeListView3.getId(), 0);
                dVar.w(flowBadgeListView3.getId(), -2);
                dVar.h0(flowBadgeListView3.getId(), flowBadgeListView3.getVisibility());
            }
            dVar.f(containerView);
            this.shouldUpdateConstraints = false;
        }

        private final void updateInnerViewsLocators() {
            for (View view : this.allocatedViews) {
                if (view == null) {
                    return;
                }
                CellViewKt.setSubviewLocator(view, getLocatorTag(), (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(view.getId())));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent event) {
            View findChildViewUnder;
            if (event == null) {
                return false;
            }
            findChildViewUnder = CellViewKt.findChildViewUnder(this, event.getX(), event.getY());
            ViewParent parent = getParent();
            CellView cellView = parent instanceof CellView ? (CellView) parent : null;
            if ((findChildViewUnder instanceof BadgeView) && cellView != null && cellView.isEnabled() && cellView.isClickable()) {
                int action = event.getAction();
                if (action == 0) {
                    ((BadgeView) findChildViewUnder).onBadgeTouch$uni_release();
                } else if (action == 1 || action == 3) {
                    ((BadgeView) findChildViewUnder).onBadgeTouchEnd$uni_release();
                    performClick();
                    return true;
                }
            }
            return super.dispatchTouchEvent(event);
        }

        @NotNull
        public FlowBadgeListView getBadgeListView() {
            View initSubview;
            FlowBadgeListView flowBadgeListView = this._badgeListView;
            if (flowBadgeListView != null) {
                return flowBadgeListView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.badgeListViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            return (FlowBadgeListView) initSubview;
        }

        @NotNull
        public CenterBlock getContainerView() {
            return this.containerView;
        }

        /* renamed from: getDefaultSubtitleTextAppearance$uni_release, reason: from getter */
        public final int getDefaultSubtitleTextAppearance() {
            return this.defaultSubtitleTextAppearance;
        }

        /* renamed from: getDefaultSubtitleTextColor$uni_release, reason: from getter */
        public final int getDefaultSubtitleTextColor() {
            return this.defaultSubtitleTextColor;
        }

        /* renamed from: getDefaultTitleSubtitleGap$uni_release, reason: from getter */
        public final int getDefaultTitleSubtitleGap() {
            return this.defaultTitleSubtitleGap;
        }

        /* renamed from: getDefaultTitleTextAppearance$uni_release, reason: from getter */
        public final int getDefaultTitleTextAppearance() {
            return this.defaultTitleTextAppearance;
        }

        /* renamed from: getDefaultTitleTextColor$uni_release, reason: from getter */
        public final int getDefaultTitleTextColor() {
            return this.defaultTitleTextColor;
        }

        @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
        @NotNull
        public String getLocatorTag() {
            return this.locatorTag;
        }

        @NotNull
        public TextView getSubtitleView() {
            View initSubview;
            TextView textView = this._subtitleView;
            if (textView != null) {
                return textView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.subtitleViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            return (TextView) initSubview;
        }

        @NotNull
        public BadgeView getTitleBadgeView() {
            View initSubview;
            BadgeView badgeView = this._titleBadgeView;
            if (badgeView != null) {
                return badgeView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.titleBadgeViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            return (BadgeView) initSubview;
        }

        @NotNull
        public IconView getTitleIconView() {
            View initSubview;
            IconView iconView = this._titleIconView;
            if (iconView != null) {
                return iconView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.titleIconViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            return (IconView) initSubview;
        }

        public int getTitleSubtitleGap() {
            return this.titleSubtitleGap;
        }

        @NotNull
        public TextView getTitleView() {
            View initSubview;
            TextView textView = this._titleView;
            if (textView != null) {
                return textView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.titleViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            return (TextView) initSubview;
        }

        /* renamed from: get_badgeListView$uni_release, reason: from getter */
        public final FlowBadgeListView get_badgeListView() {
            return this._badgeListView;
        }

        /* renamed from: get_subtitleView$uni_release, reason: from getter */
        public final TextView get_subtitleView() {
            return this._subtitleView;
        }

        /* renamed from: get_titleBadgeView$uni_release, reason: from getter */
        public final BadgeView get_titleBadgeView() {
            return this._titleBadgeView;
        }

        /* renamed from: get_titleIconView$uni_release, reason: from getter */
        public final IconView get_titleIconView() {
            return this._titleIconView;
        }

        @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            if (this.shouldUpdateConstraints) {
                reconstructLayout();
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }

        @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
        public void setLocatorTag(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String str = value + "_CENTER_BLOCK";
            this.locatorTag = str;
            setContentDescription(str);
            updateInnerViewsLocators();
        }

        public void setTitleSubtitleGap(int i11) {
            this.titleSubtitleGap = i11;
            this.shouldUpdateConstraints = true;
        }

        public final void set_badgeListView$uni_release(FlowBadgeListView flowBadgeListView) {
            this._badgeListView = flowBadgeListView;
        }

        public final void set_subtitleView$uni_release(TextView textView) {
            this._subtitleView = textView;
        }

        public final void set_titleBadgeView$uni_release(BadgeView badgeView) {
            this._titleBadgeView = badgeView;
        }

        public final void set_titleIconView$uni_release(IconView iconView) {
            this._titleIconView = iconView;
        }

        public final void set_titleView$uni_release(TextView textView) {
            this._titleView = textView;
        }
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tR\u000e\u0010\n\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0007X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/uni/android/cell/CellView$FlowBadgeListView;", "Landroidx/constraintlayout/helper/widget/Flow;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "badgeHorizontalGap", "badgeVerticalGap", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class FlowBadgeListView extends Flow {
        private final int badgeHorizontalGap;
        private final int badgeVerticalGap;

        public /* synthetic */ FlowBadgeListView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public FlowBadgeListView(@NotNull Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            Intrinsics.checkNotNullParameter(context, "context");
            int px = UiExtKt.toPx(4, context);
            this.badgeHorizontalGap = px;
            this.badgeVerticalGap = px;
            setHorizontalBias(0.0f);
            setHorizontalGap(px);
            setVerticalGap(px);
            setWrapMode(1);
            setHorizontalStyle(2);
        }
    }

    @Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u001d\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0012\b\u0007\u0018\u0000 |2\u00020\u00012\u00020\u0002:\u0001|BC\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ!\u0010\u001f\u001a\u00028\u0000\"\b\b\u0000\u0010\u001d*\u00020\u00182\u0006\u0010\u001e\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0013H\u0002¢\u0006\u0004\b!\u0010\u0015J\u000f\u0010\"\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\"\u0010\u0015R\u0014\u0010$\u001a\u00020#8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b&\u0010'\u001a\u0004\b(\u0010)R\u001a\u0010*\u001a\u00020\u00078\u0000X\u0081D¢\u0006\f\n\u0004\b*\u0010'\u001a\u0004\b+\u0010)R\u001a\u0010,\u001a\u00020\u00078\u0000X\u0081D¢\u0006\f\n\u0004\b,\u0010'\u001a\u0004\b-\u0010)R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010'R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010'R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010'R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010'R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010'R\u001a\u00103\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R*\u00108\u001a\u00020#2\u0006\u00107\u001a\u00020#8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u0010%\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010'\u001a\u0004\b>\u0010)\"\u0004\b?\u0010@R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR\u001c\u0010F\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180E8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bF\u0010GR$\u0010I\u001a\u0004\u0018\u00010H8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bI\u0010J\u001a\u0004\bK\u0010L\"\u0004\bM\u0010NR$\u0010P\u001a\u0004\u0018\u00010O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010e\u001a\u0004\u0018\u00010d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR*\u0010l\u001a\u00020k2\u0006\u00107\u001a\u00020k8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR\u0014\u0010s\u001a\u00020H8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\br\u0010LR\u0014\u0010u\u001a\u00020O8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bt\u0010SR\u0014\u0010w\u001a\u00020V8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bv\u0010ZR\u0014\u0010y\u001a\u00020]8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bx\u0010aR\u0014\u0010{\u001a\u00020d8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bz\u0010h¨\u0006}"}, d2 = {"Lru/ozon/uni/android/cell/CellView$LeftBlock;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "initViewIds", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/Set;)V", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "toggle", "()V", "ev", "onInterceptTouchEvent", "Landroid/view/View;", "view", "position", "addSubview", "(Landroid/view/View;I)V", "T", "viewId", "initSubview", "(I)Landroid/view/View;", "updateInnerViewsLocators", "updateHorizontalGap", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "defaultAlignment", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "defaultHorizontalGap", "I", "getDefaultHorizontalGap$uni_release", "()I", "defaultTopPadding", "getDefaultTopPadding$uni_release", "defaultRightPadding", "getDefaultRightPadding$uni_release", "iconViewId", "imageViewId", "checkBoxViewId", "toggleViewId", "radioButtonViewId", "containerView", "Lru/ozon/uni/android/cell/CellView$LeftBlock;", "getContainerView", "()Lru/ozon/uni/android/cell/CellView$LeftBlock;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "alignment", "getAlignment", "()Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "setAlignment", "(Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;)V", "horizontalGap", "getHorizontalGap", "setHorizontalGap", "(I)V", "", "Lru/ozon/uni/android/cell/SubviewMetadata;", "subviewsMetadata", "Ljava/util/Map;", "", "allocatedViews", "[Landroid/view/View;", "Lru/ozon/uni/android/atom/icon/IconView;", "_iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "get_iconView$uni_release", "()Lru/ozon/uni/android/atom/icon/IconView;", "set_iconView$uni_release", "(Lru/ozon/uni/android/atom/icon/IconView;)V", "Lru/ozon/uni/android/atom/image/Image;", "_imageView", "Lru/ozon/uni/android/atom/image/Image;", "get_imageView$uni_release", "()Lru/ozon/uni/android/atom/image/Image;", "set_imageView$uni_release", "(Lru/ozon/uni/android/atom/image/Image;)V", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "_checkBoxView", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "get_checkBoxView$uni_release", "()Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "set_checkBoxView$uni_release", "(Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;)V", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "_toggleView", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "get_toggleView$uni_release", "()Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "set_toggleView$uni_release", "(Lru/ozon/uni/android/atom/selectionControls/ToggleView;)V", "Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "_radioButtonView", "Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "get_radioButtonView$uni_release", "()Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "set_radioButtonView$uni_release", "(Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;)V", "", "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "getIconView", "iconView", "getImageView", "imageView", "getCheckBoxView", "checkBoxView", "getToggleView", "toggleView", "getRadioButtonView", "radioButtonView", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class LeftBlock extends LinearLayout implements AtomLocatableView, AddonBlock {
        private CheckBoxView _checkBoxView;
        private IconView _iconView;
        private Image _imageView;
        private RadioButtonView _radioButtonView;
        private ToggleView _toggleView;

        @NotNull
        private AddonBlock.Alignment alignment;

        @NotNull
        private final View[] allocatedViews;
        private final int checkBoxViewId;

        @NotNull
        private final LeftBlock containerView;

        @NotNull
        private final AddonBlock.Alignment defaultAlignment;
        private final int defaultHorizontalGap;
        private final int defaultRightPadding;
        private final int defaultTopPadding;
        private int horizontalGap;
        private final int iconViewId;
        private final int imageViewId;

        @NotNull
        private String locatorTag;
        private final int radioButtonViewId;

        @NotNull
        private final Map<Integer, SubviewMetadata> subviewsMetadata;
        private final int toggleViewId;
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public LeftBlock(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, Set<Integer> set) {
            super(context, attributeSet, i11, i12);
            boolean z11;
            IconView iconView;
            Intrinsics.checkNotNullParameter(context, "context");
            AddonBlock.Alignment alignment = AddonBlock.Alignment.ALIGNMENT_CENTER;
            this.defaultAlignment = alignment;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(CommonCellSettingsKt.getPadding300());
            this.defaultHorizontalGap = dimensionPixelSize;
            int i13 = R$id.cell_left_icon;
            this.iconViewId = i13;
            int i14 = R$id.cell_left_image;
            this.imageViewId = i14;
            int i15 = R$id.cell_left_checkbox;
            this.checkBoxViewId = i15;
            int i16 = R$id.cell_left_toggle;
            this.toggleViewId = i16;
            int i17 = R$id.cell_left_radio;
            this.radioButtonViewId = i17;
            this.containerView = this;
            this.alignment = alignment;
            this.horizontalGap = dimensionPixelSize;
            this.subviewsMetadata = U.j(new Pair(Integer.valueOf(i15), new SubviewMetadata(new CellView$LeftBlock$subviewsMetadata$1(context, this), 0, "CHECKBOX")), new Pair(Integer.valueOf(i13), new SubviewMetadata(new CellView$LeftBlock$subviewsMetadata$2(context, this), 3, "ICON")), new Pair(Integer.valueOf(i14), new SubviewMetadata(new CellView$LeftBlock$subviewsMetadata$3(context, this), 4, "IMAGE")), new Pair(Integer.valueOf(i16), new SubviewMetadata(new CellView$LeftBlock$subviewsMetadata$4(context, this), 1, "TOGGLE")), new Pair(Integer.valueOf(i17), new SubviewMetadata(new CellView$LeftBlock$subviewsMetadata$5(context, this), 2, "RADIO")));
            this.allocatedViews = new View[5];
            RadioButtonView radioButtonView = null;
            if (set != null) {
                z11 = true;
                if (set.contains(Integer.valueOf(i13))) {
                    iconView = (IconView) initSubview(i13);
                    this._iconView = iconView;
                    this._imageView = (set == null && set.contains(Integer.valueOf(i14)) == z11) ? (Image) initSubview(i14) : null;
                    this._checkBoxView = (set == null && set.contains(Integer.valueOf(i15)) == z11) ? (CheckBoxView) initSubview(i15) : null;
                    this._toggleView = (set == null && set.contains(Integer.valueOf(i16)) == z11) ? (ToggleView) initSubview(i16) : null;
                    if (set != null && set.contains(Integer.valueOf(i17)) == z11) {
                        radioButtonView = (RadioButtonView) initSubview(i17);
                    }
                    this._radioButtonView = radioButtonView;
                    this.locatorTag = "LEFT_BLOCK";
                    setGravity(16);
                }
            } else {
                z11 = true;
            }
            iconView = null;
            this._iconView = iconView;
            this._imageView = (set == null && set.contains(Integer.valueOf(i14)) == z11) ? (Image) initSubview(i14) : null;
            this._checkBoxView = (set == null && set.contains(Integer.valueOf(i15)) == z11) ? (CheckBoxView) initSubview(i15) : null;
            this._toggleView = (set == null && set.contains(Integer.valueOf(i16)) == z11) ? (ToggleView) initSubview(i16) : null;
            if (set != null) {
                radioButtonView = (RadioButtonView) initSubview(i17);
            }
            this._radioButtonView = radioButtonView;
            this.locatorTag = "LEFT_BLOCK";
            setGravity(16);
        }

        private final void addSubview(View view, int position) {
            View view2 = null;
            for (int i11 = position - 1; -1 < i11 && (view2 = this.allocatedViews[i11]) == null; i11--) {
            }
            addView(view, indexOfChild(view2) + 1);
            this.allocatedViews[position] = view;
        }

        private final <T extends View> T initSubview(int viewId) {
            View initSubview;
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(viewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            T t2 = (T) initSubview;
            addSubview(t2, subviewMetadata.getPosition());
            updateHorizontalGap();
            return t2;
        }

        private final void updateHorizontalGap() {
            View view = null;
            for (View view2 : this.allocatedViews) {
                if (view2 != null && view2.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginEnd(getHorizontalGap());
                    view2.setLayoutParams(layoutParams2);
                    view = view2;
                }
            }
            if (view != null) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginEnd(0);
                view.setLayoutParams(layoutParams4);
            }
        }

        private final void updateInnerViewsLocators() {
            for (View view : this.allocatedViews) {
                if (view == null) {
                    return;
                }
                CellViewKt.setSubviewLocator(view, getLocatorTag(), (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(view.getId())));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent event) {
            boolean z11 = false;
            if (event == null) {
                return false;
            }
            ViewParent parent = getParent();
            CellView cellView = parent instanceof CellView ? (CellView) parent : null;
            if (cellView != null && cellView.isEnabled() && cellView.isClickable()) {
                z11 = true;
                if (event.getAction() == 1) {
                    performClick();
                }
            }
            return z11;
        }

        @NotNull
        public AddonBlock.Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public CheckBoxView getCheckBoxView() {
            CheckBoxView checkBoxView = this._checkBoxView;
            return checkBoxView == null ? (CheckBoxView) initSubview(this.checkBoxViewId) : checkBoxView;
        }

        /* renamed from: getDefaultHorizontalGap$uni_release, reason: from getter */
        public final int getDefaultHorizontalGap() {
            return this.defaultHorizontalGap;
        }

        /* renamed from: getDefaultRightPadding$uni_release, reason: from getter */
        public final int getDefaultRightPadding() {
            return this.defaultRightPadding;
        }

        /* renamed from: getDefaultTopPadding$uni_release, reason: from getter */
        public final int getDefaultTopPadding() {
            return this.defaultTopPadding;
        }

        public int getHorizontalGap() {
            return this.horizontalGap;
        }

        @NotNull
        public IconView getIconView() {
            IconView iconView = this._iconView;
            return iconView == null ? (IconView) initSubview(this.iconViewId) : iconView;
        }

        @NotNull
        public Image getImageView() {
            Image image = this._imageView;
            return image == null ? (Image) initSubview(this.imageViewId) : image;
        }

        @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
        @NotNull
        public String getLocatorTag() {
            return this.locatorTag;
        }

        @NotNull
        public RadioButtonView getRadioButtonView() {
            RadioButtonView radioButtonView = this._radioButtonView;
            return radioButtonView == null ? (RadioButtonView) initSubview(this.radioButtonViewId) : radioButtonView;
        }

        @NotNull
        public ToggleView getToggleView() {
            ToggleView toggleView = this._toggleView;
            return toggleView == null ? (ToggleView) initSubview(this.toggleViewId) : toggleView;
        }

        /* renamed from: get_checkBoxView$uni_release, reason: from getter */
        public final CheckBoxView get_checkBoxView() {
            return this._checkBoxView;
        }

        /* renamed from: get_iconView$uni_release, reason: from getter */
        public final IconView get_iconView() {
            return this._iconView;
        }

        /* renamed from: get_imageView$uni_release, reason: from getter */
        public final Image get_imageView() {
            return this._imageView;
        }

        /* renamed from: get_radioButtonView$uni_release, reason: from getter */
        public final RadioButtonView get_radioButtonView() {
            return this._radioButtonView;
        }

        /* renamed from: get_toggleView$uni_release, reason: from getter */
        public final ToggleView get_toggleView() {
            return this._toggleView;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            return true;
        }

        @Override // ru.ozon.uni.android.cell.CellView.AddonBlock
        public void setAlignment(@NotNull AddonBlock.Alignment value) {
            int gravity;
            Intrinsics.checkNotNullParameter(value, "value");
            this.alignment = value;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            gravity = CellViewKt.toGravity(getAlignment());
            layoutParams2.gravity = gravity;
            setLayoutParams(layoutParams2);
        }

        @Override // ru.ozon.uni.android.cell.CellView.AddonBlock
        public void setHorizontalGap(int i11) {
            this.horizontalGap = i11;
        }

        @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
        public void setLocatorTag(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String str = value + "_LEFT_BLOCK";
            this.locatorTag = str;
            setContentDescription(str);
            updateInnerViewsLocators();
        }

        public final void set_checkBoxView$uni_release(CheckBoxView checkBoxView) {
            this._checkBoxView = checkBoxView;
        }

        public final void set_iconView$uni_release(IconView iconView) {
            this._iconView = iconView;
        }

        public final void set_imageView$uni_release(Image image) {
            this._imageView = image;
        }

        public final void set_radioButtonView$uni_release(RadioButtonView radioButtonView) {
            this._radioButtonView = radioButtonView;
        }

        public final void set_toggleView$uni_release(ToggleView toggleView) {
            this._toggleView = toggleView;
        }

        public void toggle() {
            if (this._checkBoxView != null) {
                getCheckBoxView().toggle();
            }
            if (this._radioButtonView != null) {
                getRadioButtonView().toggle();
            }
            if (this._toggleView != null) {
                getToggleView().toggle();
            }
        }
    }

    @Metadata(d1 = {"\u0000²\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b!\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\u0011\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u001a\b\u0007\u0018\u0000  \u00012\u00020\u00012\u00020\u0002:\u0002 \u0001BC\b\u0007\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\t\u001a\u00020\u0007\u0012\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\n¢\u0006\u0004\b\f\u0010\rJ\u0019\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0019\u0010\u0017\u001a\u00020\u00102\b\u0010\u0016\u001a\u0004\u0018\u00010\u000eH\u0016¢\u0006\u0004\b\u0017\u0010\u0012J\u001f\u0010\u001b\u001a\u00020\u00132\u0006\u0010\u0019\u001a\u00020\u00182\u0006\u0010\u001a\u001a\u00020\u0007H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001d\u0010\u0015J\u000f\u0010\u001e\u001a\u00020\u0013H\u0002¢\u0006\u0004\b\u001e\u0010\u0015R\u0014\u0010 \u001a\u00020\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001a\u0010\"\u001a\u00020\u00078\u0000X\u0081\u0004¢\u0006\f\n\u0004\b\"\u0010#\u001a\u0004\b$\u0010%R\u001a\u0010&\u001a\u00020\u00078\u0000X\u0081D¢\u0006\f\n\u0004\b&\u0010#\u001a\u0004\b'\u0010%R\u001a\u0010(\u001a\u00020\u00078\u0000X\u0081D¢\u0006\f\n\u0004\b(\u0010#\u001a\u0004\b)\u0010%R\u0014\u0010*\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010#R\u0014\u0010+\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010#R\u0014\u0010,\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010#R\u0014\u0010-\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010#R\u0014\u0010.\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010#R\u0014\u0010/\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b/\u0010#R\u0014\u00100\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b0\u0010#R\u0014\u00101\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u0010#R\u0014\u00102\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u0010#R\u001a\u00103\u001a\u00020\u00008\u0016X\u0096\u0004¢\u0006\f\n\u0004\b3\u00104\u001a\u0004\b5\u00106R*\u00108\u001a\u00020\u001f2\u0006\u00107\u001a\u00020\u001f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b8\u0010!\u001a\u0004\b9\u0010:\"\u0004\b;\u0010<R\"\u0010=\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b=\u0010#\u001a\u0004\b>\u0010%\"\u0004\b?\u0010@R \u0010C\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020B0A8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bC\u0010DR*\u0010F\u001a\u00020E2\u0006\u00107\u001a\u00020E8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bF\u0010G\u001a\u0004\bH\u0010I\"\u0004\bJ\u0010KR\u001c\u0010M\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00180L8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010NR$\u0010P\u001a\u0004\u0018\u00010O8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010UR$\u0010W\u001a\u0004\u0018\u00010V8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bW\u0010X\u001a\u0004\bY\u0010Z\"\u0004\b[\u0010\\R$\u0010^\u001a\u0004\u0018\u00010]8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR$\u0010e\u001a\u0004\u0018\u00010d8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\be\u0010f\u001a\u0004\bg\u0010h\"\u0004\bi\u0010jR$\u0010l\u001a\u0004\u0018\u00010k8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bl\u0010m\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010s\u001a\u0004\u0018\u00010r8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bs\u0010t\u001a\u0004\bu\u0010v\"\u0004\bw\u0010xR$\u0010z\u001a\u0004\u0018\u00010y8\u0000@\u0000X\u0080\u000e¢\u0006\u0012\n\u0004\bz\u0010{\u001a\u0004\b|\u0010}\"\u0004\b~\u0010\u007fR,\u0010\u0081\u0001\u001a\u0005\u0018\u00010\u0080\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0081\u0001\u0010\u0082\u0001\u001a\u0006\b\u0083\u0001\u0010\u0084\u0001\"\u0006\b\u0085\u0001\u0010\u0086\u0001R,\u0010\u0088\u0001\u001a\u0005\u0018\u00010\u0087\u00018\u0000@\u0000X\u0080\u000e¢\u0006\u0018\n\u0006\b\u0088\u0001\u0010\u0089\u0001\u001a\u0006\b\u008a\u0001\u0010\u008b\u0001\"\u0006\b\u008c\u0001\u0010\u008d\u0001R\u0016\u0010\u008f\u0001\u001a\u00020O8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010SR\u0016\u0010\u0091\u0001\u001a\u00020V8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0090\u0001\u0010ZR\u0016\u0010\u0093\u0001\u001a\u00020]8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0092\u0001\u0010aR\u0016\u0010\u0095\u0001\u001a\u00020d8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010hR\u0016\u0010\u0097\u0001\u001a\u00020k8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010oR\u0016\u0010\u0099\u0001\u001a\u00020r8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010vR\u0016\u0010\u009b\u0001\u001a\u00020y8VX\u0096\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010}R\u0018\u0010\u009d\u0001\u001a\u00030\u0080\u00018VX\u0096\u0004¢\u0006\b\u001a\u0006\b\u009c\u0001\u0010\u0084\u0001R\u0015\u0010\u009f\u0001\u001a\u00030\u0087\u00018F¢\u0006\b\u001a\u0006\b\u009e\u0001\u0010\u008b\u0001¨\u0006¡\u0001"}, d2 = {"Lru/ozon/uni/android/cell/CellView$RightBlock;", "Landroid/widget/LinearLayout;", "", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "", "initViewIds", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILjava/util/Set;)V", "Landroid/view/MotionEvent;", "event", "", "dispatchTouchEvent", "(Landroid/view/MotionEvent;)Z", "", "toggle", "()V", "ev", "onInterceptTouchEvent", "Landroid/view/View;", "view", "position", "addSubview", "(Landroid/view/View;I)V", "updateHorizontalGap", "updateInnerViewsLocators", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "defaultAlignment", "Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "defaultHorizontalGap", "I", "getDefaultHorizontalGap$uni_release", "()I", "defaultTopPadding", "getDefaultTopPadding$uni_release", "defaultLeftPadding", "getDefaultLeftPadding$uni_release", "badgeViewId", "indicatorViewId", "iconViewId", "buttonViewId", "imageViewId", "checkBoxViewId", "toggleViewId", "radioButtonViewId", "priceViewId", "containerView", "Lru/ozon/uni/android/cell/CellView$RightBlock;", "getContainerView", "()Lru/ozon/uni/android/cell/CellView$RightBlock;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "alignment", "getAlignment", "()Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;", "setAlignment", "(Lru/ozon/uni/android/cell/CellView$AddonBlock$Alignment;)V", "horizontalGap", "getHorizontalGap", "setHorizontalGap", "(I)V", "", "Lru/ozon/uni/android/cell/SubviewMetadata;", "subviewsMetadata", "Ljava/util/Map;", "", "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "", "allocatedViews", "[Landroid/view/View;", "Lru/ozon/uni/android/atom/badge/BadgeView;", "_badgeView", "Lru/ozon/uni/android/atom/badge/BadgeView;", "get_badgeView$uni_release", "()Lru/ozon/uni/android/atom/badge/BadgeView;", "set_badgeView$uni_release", "(Lru/ozon/uni/android/atom/badge/BadgeView;)V", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "_indicatorView", "Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "get_indicatorView$uni_release", "()Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;", "set_indicatorView$uni_release", "(Lru/ozon/uni/android/atom/indicator/ui/IndicatorView;)V", "Lru/ozon/uni/android/atom/icon/IconView;", "_iconView", "Lru/ozon/uni/android/atom/icon/IconView;", "get_iconView$uni_release", "()Lru/ozon/uni/android/atom/icon/IconView;", "set_iconView$uni_release", "(Lru/ozon/uni/android/atom/icon/IconView;)V", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "_buttonView", "Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "get_buttonView$uni_release", "()Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "set_buttonView$uni_release", "(Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;)V", "Lru/ozon/uni/android/atom/image/Image;", "_imageView", "Lru/ozon/uni/android/atom/image/Image;", "get_imageView$uni_release", "()Lru/ozon/uni/android/atom/image/Image;", "set_imageView$uni_release", "(Lru/ozon/uni/android/atom/image/Image;)V", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "_checkBoxView", "Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "get_checkBoxView$uni_release", "()Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;", "set_checkBoxView$uni_release", "(Lru/ozon/uni/android/atom/selectionControls/CheckBoxView;)V", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "_toggleView", "Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "get_toggleView$uni_release", "()Lru/ozon/uni/android/atom/selectionControls/ToggleView;", "set_toggleView$uni_release", "(Lru/ozon/uni/android/atom/selectionControls/ToggleView;)V", "Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "_radioButtonView", "Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "get_radioButtonView$uni_release", "()Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;", "set_radioButtonView$uni_release", "(Lru/ozon/uni/android/atom/selectionControls/RadioButtonView;)V", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "_priceView", "Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "get_priceView$uni_release", "()Lru/ozon/uni/android/atom/price/ui/PriceAtomView;", "set_priceView$uni_release", "(Lru/ozon/uni/android/atom/price/ui/PriceAtomView;)V", "getBadgeView", "badgeView", "getIndicatorView", "indicatorView", "getIconView", "iconView", "getButtonView", "buttonView", "getImageView", "imageView", "getCheckBoxView", "checkBoxView", "getToggleView", "toggleView", "getRadioButtonView", "radioButtonView", "getPriceView", "priceView", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class RightBlock extends LinearLayout implements AtomLocatableView, AddonBlock {
        private BadgeView _badgeView;
        private ButtonV3View _buttonView;
        private CheckBoxView _checkBoxView;
        private IconView _iconView;
        private Image _imageView;
        private IndicatorView _indicatorView;
        private PriceAtomView _priceView;
        private RadioButtonView _radioButtonView;
        private ToggleView _toggleView;

        @NotNull
        private AddonBlock.Alignment alignment;

        @NotNull
        private final View[] allocatedViews;
        private final int badgeViewId;
        private final int buttonViewId;
        private final int checkBoxViewId;

        @NotNull
        private final RightBlock containerView;

        @NotNull
        private final AddonBlock.Alignment defaultAlignment;
        private final int defaultHorizontalGap;
        private final int defaultLeftPadding;
        private final int defaultTopPadding;
        private int horizontalGap;
        private final int iconViewId;
        private final int imageViewId;
        private final int indicatorViewId;

        @NotNull
        private String locatorTag;
        private final int priceViewId;
        private final int radioButtonViewId;

        @NotNull
        private final Map<Integer, SubviewMetadata> subviewsMetadata;
        private final int toggleViewId;
        public static final int $stable = 8;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public RightBlock(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, Set<Integer> set) {
            super(context, attributeSet, i11, i12);
            BadgeView badgeView;
            IndicatorView indicatorView;
            IconView iconView;
            ButtonV3View buttonV3View;
            Image image;
            CheckBoxView checkBoxView;
            ToggleView toggleView;
            View initSubview;
            View initSubview2;
            View initSubview3;
            View initSubview4;
            View initSubview5;
            View initSubview6;
            View initSubview7;
            View initSubview8;
            Intrinsics.checkNotNullParameter(context, "context");
            AddonBlock.Alignment alignment = AddonBlock.Alignment.ALIGNMENT_CENTER;
            this.defaultAlignment = alignment;
            int dimensionPixelSize = context.getResources().getDimensionPixelSize(CommonCellSettingsKt.getPadding300());
            this.defaultHorizontalGap = dimensionPixelSize;
            int i13 = R$id.cell_right_badge;
            this.badgeViewId = i13;
            int i14 = R$id.cell_right_indicator;
            this.indicatorViewId = i14;
            int i15 = R$id.cell_right_icon;
            this.iconViewId = i15;
            int i16 = R$id.cell_right_button;
            this.buttonViewId = i16;
            int i17 = R$id.cell_right_image;
            this.imageViewId = i17;
            int i18 = R$id.cell_right_checkBox;
            this.checkBoxViewId = i18;
            int i19 = R$id.cell_right_toggle;
            this.toggleViewId = i19;
            int i21 = R$id.cell_right_radio;
            this.radioButtonViewId = i21;
            int i22 = R$id.cell_right_price;
            this.priceViewId = i22;
            this.containerView = this;
            this.alignment = alignment;
            this.horizontalGap = dimensionPixelSize;
            Map<Integer, SubviewMetadata> j11 = U.j(new Pair(Integer.valueOf(i13), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$1(context, this), 0, "BADGE")), new Pair(Integer.valueOf(i14), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$2(context, this), 1, "INDICATOR")), new Pair(Integer.valueOf(i15), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$3(context, this), 2, "ICON")), new Pair(Integer.valueOf(i16), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$4(context, this), 3, "BUTTON")), new Pair(Integer.valueOf(i17), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$5(context, this), 4, "IMAGE")), new Pair(Integer.valueOf(i18), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$6(context, this), 5, "CHECKBOX")), new Pair(Integer.valueOf(i19), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$7(context, this), 6, "TOGGLE")), new Pair(Integer.valueOf(i21), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$8(context, this), 7, "RADIO")), new Pair(Integer.valueOf(i22), new SubviewMetadata(new CellView$RightBlock$subviewsMetadata$9(context, this), 8, "PRICE")));
            this.subviewsMetadata = j11;
            this.locatorTag = "RIGHT_BLOCK";
            this.allocatedViews = new View[j11.size()];
            RadioButtonView radioButtonView = null;
            if (set == null || !set.contains(Integer.valueOf(i13))) {
                badgeView = null;
            } else {
                SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(j11, Integer.valueOf(i13));
                initSubview8 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
                addSubview(initSubview8, subviewMetadata.getPosition());
                updateHorizontalGap();
                badgeView = (BadgeView) initSubview8;
            }
            this._badgeView = badgeView;
            if (set == null || !set.contains(Integer.valueOf(i14))) {
                indicatorView = null;
            } else {
                SubviewMetadata subviewMetadata2 = (SubviewMetadata) U.e(j11, Integer.valueOf(i14));
                initSubview7 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata2);
                addSubview(initSubview7, subviewMetadata2.getPosition());
                updateHorizontalGap();
                indicatorView = (IndicatorView) initSubview7;
            }
            this._indicatorView = indicatorView;
            if (set == null || !set.contains(Integer.valueOf(i15))) {
                iconView = null;
            } else {
                SubviewMetadata subviewMetadata3 = (SubviewMetadata) U.e(j11, Integer.valueOf(i15));
                initSubview6 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata3);
                addSubview(initSubview6, subviewMetadata3.getPosition());
                updateHorizontalGap();
                iconView = (IconView) initSubview6;
            }
            this._iconView = iconView;
            if (set == null || !set.contains(Integer.valueOf(i16))) {
                buttonV3View = null;
            } else {
                SubviewMetadata subviewMetadata4 = (SubviewMetadata) U.e(j11, Integer.valueOf(i16));
                initSubview5 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata4);
                addSubview(initSubview5, subviewMetadata4.getPosition());
                updateHorizontalGap();
                buttonV3View = (ButtonV3View) initSubview5;
            }
            this._buttonView = buttonV3View;
            if (set == null || !set.contains(Integer.valueOf(i17))) {
                image = null;
            } else {
                SubviewMetadata subviewMetadata5 = (SubviewMetadata) U.e(j11, Integer.valueOf(i17));
                initSubview4 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata5);
                addSubview(initSubview4, subviewMetadata5.getPosition());
                updateHorizontalGap();
                image = (Image) initSubview4;
            }
            this._imageView = image;
            if (set == null || !set.contains(Integer.valueOf(i18))) {
                checkBoxView = null;
            } else {
                SubviewMetadata subviewMetadata6 = (SubviewMetadata) U.e(j11, Integer.valueOf(i18));
                initSubview3 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata6);
                addSubview(initSubview3, subviewMetadata6.getPosition());
                updateHorizontalGap();
                checkBoxView = (CheckBoxView) initSubview3;
            }
            this._checkBoxView = checkBoxView;
            if (set == null || !set.contains(Integer.valueOf(i19))) {
                toggleView = null;
            } else {
                SubviewMetadata subviewMetadata7 = (SubviewMetadata) U.e(j11, Integer.valueOf(i19));
                initSubview2 = CellViewKt.initSubview(getLocatorTag(), subviewMetadata7);
                addSubview(initSubview2, subviewMetadata7.getPosition());
                updateHorizontalGap();
                toggleView = (ToggleView) initSubview2;
            }
            this._toggleView = toggleView;
            if (set != null && set.contains(Integer.valueOf(i21))) {
                SubviewMetadata subviewMetadata8 = (SubviewMetadata) U.e(j11, Integer.valueOf(i21));
                initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata8);
                addSubview(initSubview, subviewMetadata8.getPosition());
                updateHorizontalGap();
                radioButtonView = (RadioButtonView) initSubview;
            }
            this._radioButtonView = radioButtonView;
            setGravity(16);
            updateInnerViewsLocators();
        }

        private final void addSubview(View view, int position) {
            View view2 = null;
            for (int i11 = position - 1; -1 < i11 && (view2 = this.allocatedViews[i11]) == null; i11--) {
            }
            addView(view, indexOfChild(view2) + 1);
            this.allocatedViews[position] = view;
        }

        private final void updateHorizontalGap() {
            View view = null;
            for (View view2 : this.allocatedViews) {
                if (view2 != null && view2.getVisibility() == 0) {
                    ViewGroup.LayoutParams layoutParams = view2.getLayoutParams();
                    if (layoutParams == null) {
                        throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                    }
                    LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
                    layoutParams2.setMarginEnd(getHorizontalGap());
                    view2.setLayoutParams(layoutParams2);
                    view = view2;
                }
            }
            if (view != null) {
                ViewGroup.LayoutParams layoutParams3 = view.getLayoutParams();
                if (layoutParams3 == null) {
                    throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
                }
                LinearLayout.LayoutParams layoutParams4 = (LinearLayout.LayoutParams) layoutParams3;
                layoutParams4.setMarginEnd(0);
                view.setLayoutParams(layoutParams4);
            }
        }

        private final void updateInnerViewsLocators() {
            for (View view : this.allocatedViews) {
                if (view == null) {
                    return;
                }
                CellViewKt.setSubviewLocator(view, getLocatorTag(), (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(view.getId())));
            }
        }

        @Override // android.view.ViewGroup, android.view.View
        public boolean dispatchTouchEvent(MotionEvent event) {
            View findChildViewUnder;
            boolean z11 = false;
            if (event == null) {
                return false;
            }
            findChildViewUnder = CellViewKt.findChildViewUnder(this, event.getX(), event.getY());
            ViewParent parent = getParent();
            CellView cellView = parent instanceof CellView ? (CellView) parent : null;
            if (cellView != null && cellView.isEnabled() && cellView.isClickable()) {
                int action = event.getAction();
                z11 = true;
                if (action != 0) {
                    if (action == 1) {
                        if (findChildViewUnder instanceof BadgeView) {
                            ((BadgeView) findChildViewUnder).onBadgeTouchEnd$uni_release();
                        }
                        performClick();
                    }
                } else if (findChildViewUnder instanceof BadgeView) {
                    ((BadgeView) findChildViewUnder).onBadgeTouch$uni_release();
                }
            }
            return z11;
        }

        @NotNull
        public AddonBlock.Alignment getAlignment() {
            return this.alignment;
        }

        @NotNull
        public BadgeView getBadgeView() {
            View initSubview;
            BadgeView badgeView = this._badgeView;
            if (badgeView != null) {
                return badgeView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.badgeViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (BadgeView) initSubview;
        }

        @NotNull
        public ButtonV3View getButtonView() {
            View initSubview;
            ButtonV3View buttonV3View = this._buttonView;
            if (buttonV3View != null) {
                return buttonV3View;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.buttonViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (ButtonV3View) initSubview;
        }

        @NotNull
        public CheckBoxView getCheckBoxView() {
            View initSubview;
            CheckBoxView checkBoxView = this._checkBoxView;
            if (checkBoxView != null) {
                return checkBoxView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.checkBoxViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (CheckBoxView) initSubview;
        }

        /* renamed from: getDefaultHorizontalGap$uni_release, reason: from getter */
        public final int getDefaultHorizontalGap() {
            return this.defaultHorizontalGap;
        }

        /* renamed from: getDefaultLeftPadding$uni_release, reason: from getter */
        public final int getDefaultLeftPadding() {
            return this.defaultLeftPadding;
        }

        /* renamed from: getDefaultTopPadding$uni_release, reason: from getter */
        public final int getDefaultTopPadding() {
            return this.defaultTopPadding;
        }

        public int getHorizontalGap() {
            return this.horizontalGap;
        }

        @NotNull
        public IconView getIconView() {
            View initSubview;
            IconView iconView = this._iconView;
            if (iconView != null) {
                return iconView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.iconViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (IconView) initSubview;
        }

        @NotNull
        public Image getImageView() {
            View initSubview;
            Image image = this._imageView;
            if (image != null) {
                return image;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.imageViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (Image) initSubview;
        }

        @NotNull
        public IndicatorView getIndicatorView() {
            View initSubview;
            IndicatorView indicatorView = this._indicatorView;
            if (indicatorView != null) {
                return indicatorView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.indicatorViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (IndicatorView) initSubview;
        }

        @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
        @NotNull
        public String getLocatorTag() {
            return this.locatorTag;
        }

        @NotNull
        public final PriceAtomView getPriceView() {
            View initSubview;
            PriceAtomView priceAtomView = this._priceView;
            if (priceAtomView != null) {
                return priceAtomView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.priceViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (PriceAtomView) initSubview;
        }

        @NotNull
        public RadioButtonView getRadioButtonView() {
            View initSubview;
            RadioButtonView radioButtonView = this._radioButtonView;
            if (radioButtonView != null) {
                return radioButtonView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.radioButtonViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (RadioButtonView) initSubview;
        }

        @NotNull
        public ToggleView getToggleView() {
            View initSubview;
            ToggleView toggleView = this._toggleView;
            if (toggleView != null) {
                return toggleView;
            }
            SubviewMetadata subviewMetadata = (SubviewMetadata) U.e(this.subviewsMetadata, Integer.valueOf(this.toggleViewId));
            initSubview = CellViewKt.initSubview(getLocatorTag(), subviewMetadata);
            addSubview(initSubview, subviewMetadata.getPosition());
            updateHorizontalGap();
            return (ToggleView) initSubview;
        }

        /* renamed from: get_badgeView$uni_release, reason: from getter */
        public final BadgeView get_badgeView() {
            return this._badgeView;
        }

        /* renamed from: get_buttonView$uni_release, reason: from getter */
        public final ButtonV3View get_buttonView() {
            return this._buttonView;
        }

        /* renamed from: get_checkBoxView$uni_release, reason: from getter */
        public final CheckBoxView get_checkBoxView() {
            return this._checkBoxView;
        }

        /* renamed from: get_iconView$uni_release, reason: from getter */
        public final IconView get_iconView() {
            return this._iconView;
        }

        /* renamed from: get_imageView$uni_release, reason: from getter */
        public final Image get_imageView() {
            return this._imageView;
        }

        /* renamed from: get_indicatorView$uni_release, reason: from getter */
        public final IndicatorView get_indicatorView() {
            return this._indicatorView;
        }

        /* renamed from: get_priceView$uni_release, reason: from getter */
        public final PriceAtomView get_priceView() {
            return this._priceView;
        }

        /* renamed from: get_radioButtonView$uni_release, reason: from getter */
        public final RadioButtonView get_radioButtonView() {
            return this._radioButtonView;
        }

        /* renamed from: get_toggleView$uni_release, reason: from getter */
        public final ToggleView get_toggleView() {
            return this._toggleView;
        }

        @Override // android.view.ViewGroup
        public boolean onInterceptTouchEvent(MotionEvent ev) {
            return true;
        }

        @Override // ru.ozon.uni.android.cell.CellView.AddonBlock
        public void setAlignment(@NotNull AddonBlock.Alignment value) {
            int gravity;
            Intrinsics.checkNotNullParameter(value, "value");
            this.alignment = value;
            ViewGroup.LayoutParams layoutParams = getLayoutParams();
            if (layoutParams == null) {
                throw new NullPointerException("null cannot be cast to non-null type android.widget.LinearLayout.LayoutParams");
            }
            LinearLayout.LayoutParams layoutParams2 = (LinearLayout.LayoutParams) layoutParams;
            gravity = CellViewKt.toGravity(getAlignment());
            layoutParams2.gravity = gravity;
            setLayoutParams(layoutParams2);
        }

        @Override // ru.ozon.uni.android.cell.CellView.AddonBlock
        public void setHorizontalGap(int i11) {
            this.horizontalGap = i11;
        }

        @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
        public void setLocatorTag(@NotNull String value) {
            Intrinsics.checkNotNullParameter(value, "value");
            String str = value + "_RIGHT_BLOCK";
            this.locatorTag = str;
            setContentDescription(str);
            updateInnerViewsLocators();
        }

        public final void set_badgeView$uni_release(BadgeView badgeView) {
            this._badgeView = badgeView;
        }

        public final void set_buttonView$uni_release(ButtonV3View buttonV3View) {
            this._buttonView = buttonV3View;
        }

        public final void set_checkBoxView$uni_release(CheckBoxView checkBoxView) {
            this._checkBoxView = checkBoxView;
        }

        public final void set_iconView$uni_release(IconView iconView) {
            this._iconView = iconView;
        }

        public final void set_imageView$uni_release(Image image) {
            this._imageView = image;
        }

        public final void set_indicatorView$uni_release(IndicatorView indicatorView) {
            this._indicatorView = indicatorView;
        }

        public final void set_priceView$uni_release(PriceAtomView priceAtomView) {
            this._priceView = priceAtomView;
        }

        public final void set_radioButtonView$uni_release(RadioButtonView radioButtonView) {
            this._radioButtonView = radioButtonView;
        }

        public final void set_toggleView$uni_release(ToggleView toggleView) {
            this._toggleView = toggleView;
        }

        public void toggle() {
            if (this._checkBoxView != null) {
                getCheckBoxView().toggle();
            }
            if (this._radioButtonView != null) {
                getRadioButtonView().toggle();
            }
            if (this._toggleView != null) {
                getToggleView().toggle();
            }
        }
    }

    @Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\r\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B'\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0007¢\u0006\u0004\b\b\u0010\tJ\u001c\u0010\u0013\u001a\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\r2\b\u0010\u0016\u001a\u0004\u0018\u00010\u0017H\u0016J\u0012\u0010\u0018\u001a\u00020\u00142\b\u0010\u0019\u001a\u0004\u0018\u00010\u000bH\u0016J\u0018\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00072\u0006\u0010\u001c\u001a\u00020\u0007H\u0014J\u0010\u0010\u001d\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\rH\u0002J\u0018\u0010\u001e\u001a\u00020\u00142\u0006\u0010\u0015\u001a\u00020\r2\u0006\u0010\u001f\u001a\u00020\u0007H\u0002R\u000e\u0010\n\u001a\u00020\u000bX\u0082\u000e¢\u0006\u0002\n\u0000R\u001e\u0010\u000e\u001a\u00020\r2\u0006\u0010\f\u001a\u00020\r@BX\u0082\u000e¢\u0006\b\n\u0000\"\u0004\b\u000f\u0010\u0010R\u000e\u0010\u0011\u001a\u00020\u0012X\u0082\u000e¢\u0006\u0002\n\u0000¨\u0006 "}, d2 = {"Lru/ozon/uni/android/cell/CellView$TextView;", "Landroidx/appcompat/widget/AppCompatTextView;", "context", "Landroid/content/Context;", "attrs", "Landroid/util/AttributeSet;", "defStyleAttr", "", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "truncateAt", "Landroid/text/TextUtils$TruncateAt;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "unellipsizedText", "setUnellipsizedText", "(Ljava/lang/CharSequence;)V", "isTextSetInternal", "", "setText", "", "text", "type", "Landroid/widget/TextView$BufferType;", "setEllipsize", "where", "onMeasure", "widthMeasureSpec", "heightMeasureSpec", "setTextInternal", "updateOnEllipsedText", "maximumWidth", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class TextView extends AppCompatTextView {
        private boolean isTextSetInternal;

        @NotNull
        private TextUtils.TruncateAt truncateAt;

        @NotNull
        private CharSequence unellipsizedText;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        public /* synthetic */ class WhenMappings {
            public static final /* synthetic */ int[] $EnumSwitchMapping$0;

            static {
                int[] iArr = new int[TextUtils.TruncateAt.values().length];
                try {
                    iArr[TextUtils.TruncateAt.MIDDLE.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[TextUtils.TruncateAt.END.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                try {
                    iArr[TextUtils.TruncateAt.START.ordinal()] = 3;
                } catch (NoSuchFieldError unused3) {
                }
                $EnumSwitchMapping$0 = iArr;
            }
        }

        public /* synthetic */ TextView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
        }

        private final void setTextInternal(CharSequence text) {
            this.isTextSetInternal = true;
            try {
                setText(text);
            } finally {
                this.isTextSetInternal = false;
            }
        }

        private final void setUnellipsizedText(CharSequence charSequence) {
            this.unellipsizedText = charSequence;
            setTextInternal(charSequence);
        }

        private final void updateOnEllipsedText(CharSequence text, int maximumWidth) {
            if (getMaxLines() <= 1) {
                CharSequence ellipsize = TextUtils.ellipsize(text, getPaint(), maximumWidth, this.truncateAt);
                Intrinsics.checkNotNullExpressionValue(ellipsize, "ellipsize(...)");
                setTextInternal(ellipsize);
                return;
            }
            StaticLayout build = StaticLayout.Builder.obtain(text, 0, text.length(), getPaint(), maximumWidth).setBreakStrategy(getBreakStrategy()).setHyphenationFrequency(getHyphenationFrequency()).build();
            Intrinsics.checkNotNullExpressionValue(build, "build(...)");
            if (build.getLineCount() > getMaxLines()) {
                int i11 = WhenMappings.$EnumSwitchMapping$0[this.truncateAt.ordinal()];
                if (i11 == 1 || i11 == 2) {
                    int lineStart = build.getLineStart(getMaxLines() - 1);
                    CharSequence concat = TextUtils.concat(text.subSequence(0, lineStart), TextUtils.ellipsize(text.subSequence(lineStart, text.length()), getPaint(), maximumWidth, this.truncateAt));
                    Intrinsics.checkNotNullExpressionValue(concat, "concat(...)");
                    setTextInternal(concat);
                    return;
                }
                if (i11 != 3) {
                    return;
                }
                int lineStart2 = build.getLineStart((build.getLineCount() + 1) - getMaxLines());
                CharSequence concat2 = TextUtils.concat(TextUtils.ellipsize(text.subSequence(0, lineStart2), getPaint(), maximumWidth, this.truncateAt), System.lineSeparator(), text.subSequence(lineStart2, text.length()));
                Intrinsics.checkNotNullExpressionValue(concat2, "concat(...)");
                setTextInternal(concat2);
            }
        }

        @Override // androidx.appcompat.widget.AppCompatTextView, android.widget.TextView, android.view.View
        protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
            int mode = View.MeasureSpec.getMode(widthMeasureSpec);
            int min = Integer.min((getMaxWidth() - getPaddingLeft()) - getPaddingRight(), (mode == Integer.MIN_VALUE || mode == 1073741824) ? (View.MeasureSpec.getSize(widthMeasureSpec) - getPaddingLeft()) - getPaddingRight() : Integer.MAX_VALUE);
            float desiredWidth = Layout.getDesiredWidth(this.unellipsizedText, getPaint());
            if (getMaxLines() <= 0 || min <= 0 || desiredWidth <= min) {
                setTextInternal(this.unellipsizedText);
            } else {
                updateOnEllipsedText(this.unellipsizedText, min);
            }
            super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        }

        @Override // android.widget.TextView
        public void setEllipsize(TextUtils.TruncateAt where) {
            if (where == null) {
                where = TextUtils.TruncateAt.END;
            }
            this.truncateAt = where;
            super.setEllipsize(null);
        }

        @Override // android.widget.TextView
        public void setText(CharSequence text, TextView.BufferType type) {
            if (!this.isTextSetInternal) {
                setUnellipsizedText(text == null ? "" : text);
            }
            super.setText(text, type);
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public TextView(@NotNull Context context, AttributeSet attributeSet, int i11) {
            super(context, attributeSet, i11);
            Intrinsics.checkNotNullParameter(context, "context");
            this.truncateAt = TextUtils.TruncateAt.END;
            this.unellipsizedText = "";
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public CellView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, 28, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final LinearLayout.LayoutParams createLayoutParams(int width, int height) {
        return new LinearLayout.LayoutParams(width, height);
    }

    static /* synthetic */ LinearLayout.LayoutParams createLayoutParams$default(CellView cellView, int i11, int i12, int i13, Object obj) {
        if ((i13 & 1) != 0) {
            i11 = -2;
        }
        if ((i13 & 2) != 0) {
            i12 = -2;
        }
        return cellView.createLayoutParams(i11, i12);
    }

    private final void drawSeparator(Canvas canvas) {
        float left = this.centerBlock.getLeft();
        float height = canvas.getHeight();
        float width = canvas.getWidth();
        float height2 = canvas.getHeight();
        Paint paint = this.paint;
        paint.setStyle(Paint.Style.STROKE);
        paint.setColor(this.separatorColor);
        paint.setStrokeWidth(this.separatorWidth);
        Unit unit = Unit.f71690a;
        canvas.drawLine(left, height, width, height2, paint);
    }

    private final void updateInnerViewsLocators() {
        this.leftBlock.setLocatorTag(getLocatorTag());
        this.centerBlock.setLocatorTag(getLocatorTag());
        this.rightBlock.setLocatorTag(getLocatorTag());
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void dispatchDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        super.dispatchDraw(canvas);
        if (this.hasSeparator) {
            drawSeparator(canvas);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:12:0x001b, code lost:
    
        if (r0 != 3) goto L17;
     */
    @Override // android.view.ViewGroup, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean dispatchTouchEvent(MotionEvent event) {
        boolean z11;
        boolean z12 = true;
        if (isEnabled() && isClickable() && event != null) {
            int action = event.getAction();
            if (action != 0) {
                if (action != 1) {
                    if (action != 2) {
                    }
                }
                setForeground(null);
            }
            setForeground(this.foregroundDrawable);
        }
        boolean z13 = false;
        if (event != null) {
            Rect rect = new Rect();
            Point point = new Point((int) event.getX(), (int) event.getY());
            List<View> list = this.views;
            ArrayList<View> arrayList = new ArrayList();
            for (Object obj : list) {
                if (((View) obj).getVisibility() == 0) {
                    arrayList.add(obj);
                }
            }
            if (!arrayList.isEmpty()) {
                for (View view : arrayList) {
                    view.getHitRect(rect);
                    rect.top = 0;
                    rect.bottom = getHeight();
                    if (view.equals(C7714v.K(arrayList))) {
                        rect.left = 0;
                    }
                    if (view.equals(C7714v.X(arrayList))) {
                        rect.right = getWidth();
                    }
                    if (rect.contains(point.x, point.y)) {
                        event.offsetLocation(-view.getLeft(), -view.getTop());
                        z11 = view.dispatchTouchEvent(event);
                    } else {
                        z11 = false;
                    }
                    if (z11) {
                        break;
                    }
                }
            }
            z12 = false;
            z13 = z12;
        }
        return !z13 ? super.dispatchTouchEvent(event) : z13;
    }

    public final float getCellCornerRadius() {
        return this.backgroundDrawable.getCornerRadius();
    }

    @NotNull
    public final CenterBlock getCenterBlock() {
        return this.centerBlock;
    }

    @NotNull
    public final LeftBlock getLeftBlock() {
        return this.leftBlock;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @NotNull
    public final RightBlock getRightBlock() {
        return this.rightBlock;
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        return super.onTouchEvent(event);
    }

    public final void setCellBackgroundColor(int color) {
        this.backgroundDrawable.setColor(color);
    }

    public final void setCellCornerRadii(float[] fArr) {
        this.backgroundDrawable.setCornerRadii(fArr);
        this.foregroundDrawable.setCornerRadii(fArr);
    }

    public final void setCellCornerRadius(float f7) {
        this.backgroundDrawable.setCornerRadius(f7);
        this.foregroundDrawable.setCornerRadius(f7);
    }

    public final void setCellHoverColor(int color) {
        GradientDrawable gradientDrawable = this.foregroundDrawable;
        gradientDrawable.setColor(color);
        gradientDrawable.setAlpha(color == this.defaultHoverColor ? 255 : 26);
    }

    public final void setHasSeparator(boolean z11) {
        this.hasSeparator = z11;
        invalidate();
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        setContentDescription(value);
        updateInnerViewsLocators();
    }

    public final void setSeparatorColor(int i11) {
        this.separatorColor = i11;
        invalidate();
    }

    public /* synthetic */ CellView(Context context, AttributeSet attributeSet, int i11, int i12, Set set, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? null : set);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public CellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, Set<Integer> set) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        int color = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_NEUTRAL.getResId());
        this.defaultSeparatorColor = color;
        int color2 = androidx.core.content.a.getColor(context, R.color.transparent);
        this.defaultCellBackgroundColor = color2;
        int color3 = androidx.core.content.a.getColor(context, UniColors.LAYER_OVERLAY_PARANJA.getResId());
        this.defaultHoverColor = color3;
        this.defaultHasSeparator = true;
        AddonBlock.Alignment alignment = AddonBlock.Alignment.ALIGNMENT_CENTER;
        this.leftBlockDefaultAlignment = alignment;
        this.rightBlockDefaultAlignment = alignment;
        this.paint = new Paint(1);
        this.separatorWidth = ResourceExtKt.toPxF(1, context);
        this.backgroundDrawable = new GradientDrawable();
        this.foregroundDrawable = new GradientDrawable();
        int i13 = R$id.cell_left_block;
        this.leftBlockId = i13;
        int i14 = R$id.cell_center_block;
        this.centerBlockId = i14;
        int i15 = R$id.cell_right_block;
        this.rightBlockId = i15;
        LeftBlock leftBlock = new LeftBlock(context, attributeSet, i11, i12, set);
        leftBlock.setId(i13);
        leftBlock.setVisibility(8);
        this.leftBlock = leftBlock;
        CenterBlock centerBlock = new CenterBlock(context, attributeSet, i11, i12, set);
        centerBlock.setId(i14);
        this.centerBlock = centerBlock;
        RightBlock rightBlock = new RightBlock(context, attributeSet, i11, i12, set);
        rightBlock.setId(i15);
        rightBlock.setVisibility(8);
        this.rightBlock = rightBlock;
        this.hasSeparator = true;
        this.separatorColor = color;
        this.locatorTag = "CELL";
        this.views = C7714v.b0(leftBlock, centerBlock, rightBlock);
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        addView(leftBlock, createLayoutParams$default(this, 0, 0, 3, null));
        LinearLayout.LayoutParams createLayoutParams$default = createLayoutParams$default(this, 0, 0, 2, null);
        createLayoutParams$default.weight = 1.0f;
        createLayoutParams$default.gravity = 16;
        Unit unit = Unit.f71690a;
        addView(centerBlock, createLayoutParams$default);
        addView(rightBlock, createLayoutParams$default(this, 0, 0, 3, null));
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.CellView, i11, i12);
        setCellBackgroundColor(obtainStyledAttributes.getColor(R$styleable.CellView_cellBackgroundColor, color2));
        setCellHoverColor(obtainStyledAttributes.getColor(R$styleable.CellView_cellHoverColor, color3));
        setCellCornerRadius(obtainStyledAttributes.getDimension(R$styleable.CellView_cellCornerRadius, this.defaultCellCornerRadius));
        setHasSeparator(obtainStyledAttributes.getBoolean(R$styleable.CellView_hasSeparator, true));
        setSeparatorColor(obtainStyledAttributes.getColor(R$styleable.CellView_separatorColor, color));
        int dimensionPixelSize = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CellView_leftBlock_topPadding, leftBlock.getDefaultTopPadding());
        int dimensionPixelSize2 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CellView_leftBlock_rightPadding, leftBlock.getDefaultRightPadding());
        leftBlock.setHorizontalGap(obtainStyledAttributes.getDimensionPixelSize(R$styleable.CellView_leftBlock_horizontalGap, leftBlock.getDefaultHorizontalGap()));
        leftBlock.setPadding(leftBlock.getPaddingLeft(), dimensionPixelSize, dimensionPixelSize2, leftBlock.getPaddingBottom());
        leftBlock.setAlignment((AddonBlock.Alignment) AddonBlock.Alignment.getEntries().get(obtainStyledAttributes.getInt(R$styleable.CellView_leftBlock_alignment, alignment.ordinal())));
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i16 = 0; i16 < indexCount; i16++) {
            int index = obtainStyledAttributes.getIndex(i16);
            if (index == R$styleable.CellView_titleText) {
                this.centerBlock.getTitleView().setText(obtainStyledAttributes.getText(index));
            } else if (index == R$styleable.CellView_titleTextColor) {
                this.centerBlock.getTitleView().setTextColor(obtainStyledAttributes.getColor(index, this.centerBlock.getDefaultTitleTextColor()));
            } else {
                int i17 = R$styleable.CellView_titleTextAppearance;
                if (index == i17) {
                    this.centerBlock.getTitleView().setTextAppearance(obtainStyledAttributes.getResourceId(index, this.centerBlock.getDefaultTitleTextAppearance()));
                } else if (index == R$styleable.CellView_subtitleText) {
                    TextView subtitleView = this.centerBlock.getSubtitleView();
                    subtitleView.setText(obtainStyledAttributes.getText(index));
                    CharSequence text = subtitleView.getText();
                    if (text != null && !h.K(text)) {
                        subtitleView.setVisibility(0);
                    }
                } else if (index == R$styleable.CellView_subtitleTextColor) {
                    this.centerBlock.getSubtitleView().setTextColor(obtainStyledAttributes.getColor(index, this.centerBlock.getDefaultSubtitleTextColor()));
                } else if (index == i17) {
                    this.centerBlock.getSubtitleView().setTextAppearance(obtainStyledAttributes.getResourceId(index, this.centerBlock.getDefaultSubtitleTextAppearance()));
                }
            }
        }
        CenterBlock centerBlock2 = this.centerBlock;
        centerBlock2.setTitleSubtitleGap(obtainStyledAttributes.getDimensionPixelSize(R$styleable.CellView_titleSubtitleGap, centerBlock2.getDefaultTitleSubtitleGap()));
        int dimensionPixelSize3 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CellView_rightBlock_topPadding, this.rightBlock.getDefaultTopPadding());
        int dimensionPixelSize4 = obtainStyledAttributes.getDimensionPixelSize(R$styleable.CellView_rightBlock_leftPadding, this.rightBlock.getDefaultLeftPadding());
        RightBlock rightBlock2 = this.rightBlock;
        rightBlock2.setHorizontalGap(obtainStyledAttributes.getDimensionPixelSize(R$styleable.CellView_rightBlock_horizontalGap, rightBlock2.getDefaultHorizontalGap()));
        RightBlock rightBlock3 = this.rightBlock;
        rightBlock3.setPadding(rightBlock3.getPaddingLeft(), dimensionPixelSize3, dimensionPixelSize4, rightBlock3.getPaddingBottom());
        this.rightBlock.setAlignment((AddonBlock.Alignment) AddonBlock.Alignment.getEntries().get(obtainStyledAttributes.getInt(R$styleable.CellView_rightBlock_alignment, this.rightBlockDefaultAlignment.ordinal())));
        obtainStyledAttributes.recycle();
        setBackground(this.backgroundDrawable);
        setClipToOutline(true);
        updateInnerViewsLocators();
    }
}
