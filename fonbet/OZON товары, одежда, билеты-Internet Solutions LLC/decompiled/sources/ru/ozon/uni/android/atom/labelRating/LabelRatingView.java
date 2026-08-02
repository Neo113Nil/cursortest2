package ru.ozon.uni.android.atom.labelRating;

import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.U;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.labelRating.LabelRatingApi;
import ru.ozon.uni.android.atom.labelRating.data.LabelRatingPreset;
import ru.ozon.uni.android.atom.labelRating.data.LabelRatingPresets;
import ru.ozon.uni.android.atom.rating.RatingView;
import ru.ozon.uni.android.cell.label.SmartLabel;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddon2.MainAddonWrapper2;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;

@Metadata(d1 = {"\u0000¬\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0013\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\r\n\u0002\b\u0007\b\u0007\u0018\u0000 y2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u00012\u00020\u00042\u00020\u00052\u00020\u0006:\u0001yBE\b\u0007\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t\u0012\b\b\u0002\u0010\f\u001a\u00020\u000b\u0012\b\b\u0002\u0010\r\u001a\u00020\u000b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0018\u001a\u00020\u00172\u0006\u0010\u0014\u001a\u00020\u000b2\u0006\u0010\u0016\u001a\u00020\u0015H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0017\u0010\u001b\u001a\u00020\u00172\u0006\u0010\u001a\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\u00172\b\u0010\u001d\u001a\u0004\u0018\u00010\u000b2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\u000bH\u0016¢\u0006\u0004\b!\u0010\"J}\u00106\u001a\u00020%2\u0006\u0010$\u001a\u00020#2\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020*0)2\b\u0010-\u001a\u0004\u0018\u00010,2\u0006\u0010.\u001a\u00020\u000b2\u0006\u0010/\u001a\u00020\u001e2\u0006\u00101\u001a\u0002002\u0006\u00102\u001a\u00020,2\u0006\u00103\u001a\u00020\u000b2\u0006\u00104\u001a\u00020\u001e2\u0006\u00105\u001a\u000200H\u0014¢\u0006\u0004\b6\u00107J\u0017\u00109\u001a\u00020\u00172\u0006\u00108\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u0010:R\u001a\u0010\u0011\u001a\u00020\u00108\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010;\u001a\u0004\b\u0011\u0010<R,\u0010?\u001a\u001a\u0012\u0004\u0012\u00020\u000b\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u00020,\u0012\u0004\u0012\u00020\u00170>0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b?\u0010@R*\u0010C\u001a\u00020A2\u0006\u0010B\u001a\u00020A8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bC\u0010D\u001a\u0004\bE\u0010F\"\u0004\bG\u0010HR\u001a\u0010I\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\bI\u0010J\u001a\u0004\bK\u0010LR\u001a\u00102\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b2\u0010M\u001a\u0004\bN\u0010OR*\u0010P\u001a\u00020\u000e2\u0006\u0010B\u001a\u00020\u000e8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bP\u0010Q\u001a\u0004\bR\u0010S\"\u0004\bT\u0010:R\u001c\u0010W\u001a\n V*\u0004\u0018\u00010U0U8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010XR*\u0010Y\u001a\u00020\u00102\u0006\u0010B\u001a\u00020\u00108\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bY\u0010;\u001a\u0004\bZ\u0010<\"\u0004\b[\u0010\\R.\u0010^\u001a\u0004\u0018\u00010]2\b\u0010B\u001a\u0004\u0018\u00010]8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b^\u0010_\u001a\u0004\b`\u0010a\"\u0004\bb\u0010cR*\u0010d\u001a\u00020\u000b2\u0006\u0010B\u001a\u00020\u000b8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bd\u0010e\u001a\u0004\bf\u0010g\"\u0004\bh\u0010\u001cR@\u0010m\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010>2\u0014\u0010B\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\u0017\u0018\u00010>8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bi\u0010j\"\u0004\bk\u0010lR$\u0010r\u001a\u00020\u00152\u0006\u0010B\u001a\u00020\u00158V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bn\u0010o\"\u0004\bp\u0010qR$\u0010x\u001a\u00020s2\u0006\u0010B\u001a\u00020s8V@VX\u0096\u000e¢\u0006\f\u001a\u0004\bt\u0010u\"\u0004\bv\u0010w¨\u0006z"}, d2 = {"Lru/ozon/uni/android/atom/labelRating/LabelRatingView;", "Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2;", "Lru/ozon/uni/android/atom/rating/RatingView;", "Lru/ozon/uni/android/cell/label/SmartLabel;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/android/atom/labelRating/LabelRatingApi;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/atom/labelRating/data/LabelRatingPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/atom/labelRating/data/LabelRatingPreset;Z)V", "color", "", "alpha", "", "setLabelColor", "(IF)V", "resId", "applyStyle", "(I)V", "labelIcon", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "labelIconPosition", "labelIconColor", "setLabelIcon", "(Ljava/lang/Integer;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Integer;)V", "Landroidx/constraintlayout/widget/ConstraintLayout;", "parent", "Landroidx/constraintlayout/widget/d;", "constraintSet", "Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints;", "constraints", "", "Landroidx/constraintlayout/helper/widget/Flow;", "flows", "Landroid/view/View;", "anchorAddonView", "anchorAddonViewGap", "anchorAddonSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "anchorAddonAxis", "addonView", "addonGap", "addonSide", "addonAxis", "addMainConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/d;Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints;Ljava/util/Map;Landroid/view/View;ILru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;Landroid/view/View;ILru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;)Landroidx/constraintlayout/widget/d;", "preset", "setupMinHeight", "(Lru/ozon/uni/android/atom/labelRating/data/LabelRatingPreset;)V", "Z", "()Z", "", "Lkotlin/Function1;", "locatorInitializers", "Ljava/util/Map;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "mainView", "Lru/ozon/uni/android/atom/rating/RatingView;", "getMainView", "()Lru/ozon/uni/android/atom/rating/RatingView;", "Lru/ozon/uni/android/cell/label/SmartLabel;", "getAddonView", "()Lru/ozon/uni/android/cell/label/SmartLabel;", "labelRatingPreset", "Lru/ozon/uni/android/atom/labelRating/data/LabelRatingPreset;", "getLabelRatingPreset", "()Lru/ozon/uni/android/atom/labelRating/data/LabelRatingPreset;", "setLabelRatingPreset", "Landroid/text/method/MovementMethod;", "kotlin.jvm.PlatformType", "moveMethod", "Landroid/text/method/MovementMethod;", "labelTagSupported", "getLabelTagSupported", "setLabelTagSupported", "(Z)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "labelTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getLabelTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setLabelTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "labelNumberOfLines", "I", "getLabelNumberOfLines", "()I", "setLabelNumberOfLines", "getRatingClickCallback", "()Lkotlin/jvm/functions/Function1;", "setRatingClickCallback", "(Lkotlin/jvm/functions/Function1;)V", "ratingClickCallback", "getTotalRating", "()F", "setTotalRating", "(F)V", "totalRating", "", "getLabelText", "()Ljava/lang/CharSequence;", "setLabelText", "(Ljava/lang/CharSequence;)V", "labelText", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class LabelRatingView extends MainAddonWrapper2<RatingView, SmartLabel> implements AtomView, LabelRatingApi, AtomLocatableView {

    @NotNull
    private final SmartLabel addonView;
    private final boolean isRootWrapper;
    private int labelNumberOfLines;

    @NotNull
    private LabelRatingPreset labelRatingPreset;
    private boolean labelTagSupported;
    private CommonAtomLabelDTO.TruncatingMode labelTruncatingMode;

    @NotNull
    private final Map<Integer, Function1<View, Unit>> locatorInitializers;

    @NotNull
    private String locatorTag;

    @NotNull
    private final RatingView mainView;
    private final MovementMethod moveMethod;
    public static final int $stable = 8;

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[CommonAtomLabelDTO.TruncatingMode.values().length];
            try {
                iArr[CommonAtomLabelDTO.TruncatingMode.MIDDLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[CommonAtomLabelDTO.TruncatingMode.HEAD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public LabelRatingView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, false, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void setupMinHeight(LabelRatingPreset preset) {
        setMinHeight(UiExtKt.toPx(preset.getAddonPreset().getMainAddonSettings().getMinWrapperHeight()));
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddon2.MainAddonWrapper2
    @NotNull
    protected d addMainConstraints(@NotNull ConstraintLayout parent, @NotNull d constraintSet, @NotNull MainAddonWrapper2.Constraints constraints, @NotNull Map<Integer, Flow> flows, View anchorAddonView, int anchorAddonViewGap, @NotNull AddonSide anchorAddonSide, @NotNull Axis anchorAddonAxis, @NotNull View addonView, int addonGap, @NotNull AddonSide addonSide, @NotNull Axis addonAxis) {
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(flows, "flows");
        Intrinsics.checkNotNullParameter(anchorAddonSide, "anchorAddonSide");
        Intrinsics.checkNotNullParameter(anchorAddonAxis, "anchorAddonAxis");
        Intrinsics.checkNotNullParameter(addonView, "addonView");
        Intrinsics.checkNotNullParameter(addonSide, "addonSide");
        Intrinsics.checkNotNullParameter(addonAxis, "addonAxis");
        d addMainConstraints = super.addMainConstraints(parent, constraintSet, constraints, flows, anchorAddonView, anchorAddonViewGap, anchorAddonSide, anchorAddonAxis, addonView, addonGap, addonSide, addonAxis);
        constraintSet.A(getId(), -2);
        constraintSet.A(addonView.getId(), -2);
        constraintSet.A(getMainView().getId(), -2);
        return addMainConstraints;
    }

    public void applyStyle(int resId) {
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(resId, R$styleable.LabelRatingView);
        int color = obtainStyledAttributes.getColor(R$styleable.LabelRatingView_ratingTextColor, -1);
        obtainStyledAttributes.recycle();
        if (color != -1) {
            LabelRatingApi.DefaultImpls.setLabelColor$default(this, color, 0.0f, 2, null);
        }
    }

    @NotNull
    public final LabelRatingPreset getLabelRatingPreset() {
        return this.labelRatingPreset;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddon2.MainAddonWrapper2
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    @Override // ru.ozon.uni.android.atom.labelRating.LabelRatingApi
    public void setLabelColor(int color, float alpha) {
        getAddonView().setTextColor(color);
        getAddonView().setAlpha(alpha);
    }

    public void setLabelIcon(Integer labelIcon, @NotNull AddonSide labelIconPosition, Integer labelIconColor) {
        Intrinsics.checkNotNullParameter(labelIconPosition, "labelIconPosition");
        getAddonView().setIcon(labelIconPosition, labelIcon, labelIconColor);
    }

    public void setLabelNumberOfLines(int i11) {
        this.labelNumberOfLines = i11;
        getAddonView().setMaxLines(this.labelNumberOfLines);
    }

    public final void setLabelRatingPreset(@NotNull LabelRatingPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.labelRatingPreset = value;
        getMainView().setRatingSize(this.labelRatingPreset.getMainPreset());
        getAddonView().withSmartLabelPreset(this.labelRatingPreset.getAddonPreset().getSmartLabelPreset());
        setMainAddonSettings(this.labelRatingPreset.getAddonPreset().getMainAddonSettings());
        setupMinHeight(this.labelRatingPreset);
    }

    public void setLabelTagSupported(boolean z11) {
        this.labelTagSupported = z11;
        if (z11) {
            getAddonView().setMovementMethod(this.moveMethod);
            return;
        }
        SmartLabel addonView = getAddonView();
        CharSequence text = getAddonView().getText();
        addonView.setText(text != null ? text.toString() : null);
    }

    public void setLabelText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        getAddonView().setText(value);
    }

    public void setLabelTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.labelTruncatingMode = truncatingMode;
        SmartLabel addonView = getAddonView();
        CommonAtomLabelDTO.TruncatingMode truncatingMode2 = this.labelTruncatingMode;
        int i11 = truncatingMode2 == null ? -1 : WhenMappings.$EnumSwitchMapping$0[truncatingMode2.ordinal()];
        addonView.setEllipsize(i11 != 1 ? i11 != 2 ? TextUtils.TruncateAt.END : TextUtils.TruncateAt.START : TextUtils.TruncateAt.MIDDLE);
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

    public void setRatingClickCallback(Function1<? super Integer, Unit> function1) {
        getMainView().setRatingClickCallback(function1);
    }

    public void setTotalRating(float f7) {
        getMainView().setTotalRating(f7);
    }

    public /* synthetic */ LabelRatingView(Context context, AttributeSet attributeSet, int i11, int i12, LabelRatingPreset labelRatingPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? R$style.LabelRating_Default : i12, (i13 & 16) != 0 ? LabelRatingPresets.INSTANCE.getHorizontalEnd200() : labelRatingPreset, (i13 & 32) != 0 ? true : z11);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddon2.MainAddonWrapper2
    @NotNull
    public SmartLabel getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddon2.MainAddonWrapper2
    @NotNull
    public RatingView getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public LabelRatingView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull LabelRatingPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getAddonPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        Map<Integer, Function1<View, Unit>> j11 = U.j(new Pair(Integer.valueOf(R$id.mainViewId), new LabelRatingView$locatorInitializers$1(this)), new Pair(Integer.valueOf(R$id.addonViewId), new LabelRatingView$locatorInitializers$2(this)));
        this.locatorInitializers = j11;
        this.locatorTag = "labelRating";
        RatingView ratingView = new RatingView(context, null, 0, 0, 14, null);
        ratingView.setId(R$id.mainViewId);
        Function1<View, Unit> function1 = j11.get(Integer.valueOf(ratingView.getId()));
        if (function1 != null) {
            function1.invoke(ratingView);
        }
        this.mainView = ratingView;
        SmartLabel smartLabel = new SmartLabel(context, null, 0, 6, null);
        smartLabel.setId(R$id.addonViewId);
        Function1<View, Unit> function12 = j11.get(Integer.valueOf(smartLabel.getId()));
        if (function12 != null) {
            function12.invoke(smartLabel);
        }
        this.addonView = smartLabel;
        this.labelRatingPreset = defPreset;
        this.moveMethod = LinkMovementMethod.getInstance();
        this.labelTruncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.labelNumberOfLines = 1;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.LabelRatingView, i11, i12);
        String string = obtainStyledAttributes.getString(R$styleable.LabelRatingView_ratingText);
        setLabelText(string == null ? "" : string);
        int color = obtainStyledAttributes.getColor(R$styleable.LabelRatingView_ratingTextColor, -1);
        if (color != -1) {
            LabelRatingApi.DefaultImpls.setLabelColor$default(this, color, 0.0f, 2, null);
        }
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.LabelRatingView_ratingStyle, 0);
        if (resourceId != 0) {
            getMainView().applyStyle(resourceId);
        }
        obtainStyledAttributes.recycle();
        setContentDescription(getLocatorTag());
        setViews();
    }
}
