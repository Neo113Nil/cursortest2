package ru.ozon.uni.android.cell.label;

import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.text.TextUtils;
import android.text.method.LinkMovementMethod;
import android.text.method.MovementMethod;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
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
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPreset;
import ru.ozon.uni.android.cell.label.data.TitleSubtitleWrapperPresets;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.android.wrappers.mainaddon.data.Alignment;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;
import ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$color;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u0098\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0007\n\u0002\b\u000e\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u001a\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\r\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\b\u0007\u0018\u0000 ~2\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00020\u00012\u00020\u00032\u00020\u00042\u00020\u0005:\u0001~BE\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012JE\u0010\u001b\u001a\u00020\u001a2\"\u0010\u0016\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u00140\u0013j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020\u0014`\u00152\u0006\u0010\u0018\u001a\u00020\u00172\b\u0010\u0019\u001a\u0004\u0018\u00010\u0014H\u0014¢\u0006\u0004\b\u001b\u0010\u001cJ+\u0010!\u001a\u00020\u001a2\b\u0010\u001d\u001a\u0004\u0018\u00010\n2\u0006\u0010\u001f\u001a\u00020\u001e2\b\u0010 \u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b!\u0010\"J+\u0010&\u001a\u00020\u001a2\b\u0010#\u001a\u0004\u0018\u00010\n2\u0006\u0010$\u001a\u00020\u001e2\b\u0010%\u001a\u0004\u0018\u00010\nH\u0016¢\u0006\u0004\b&\u0010\"J!\u0010*\u001a\u00020\u001a2\b\b\u0001\u0010'\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b*\u0010+J!\u0010,\u001a\u00020\u001a2\b\b\u0001\u0010'\u001a\u00020\n2\u0006\u0010)\u001a\u00020(H\u0016¢\u0006\u0004\b,\u0010+J\u0019\u0010/\u001a\u00020\u001a2\b\b\u0001\u0010'\u001a\u00020\nH\u0000¢\u0006\u0004\b-\u0010.J\u0019\u00101\u001a\u00020\u001a2\b\b\u0001\u0010'\u001a\u00020\nH\u0000¢\u0006\u0004\b0\u0010.J\u000f\u00104\u001a\u00020\u001aH\u0010¢\u0006\u0004\b2\u00103R\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u00105\u001a\u0004\b\u0010\u00106R,\u0010:\u001a\u001a\u0012\u0004\u0012\u00020\n\u0012\u0010\u0012\u000e\u0012\u0004\u0012\u000209\u0012\u0004\u0012\u00020\u001a08078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b:\u0010;R*\u0010>\u001a\u00020<2\u0006\u0010=\u001a\u00020<8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b>\u0010?\u001a\u0004\b@\u0010A\"\u0004\bB\u0010CR*\u0010D\u001a\u00020\r2\u0006\u0010=\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010E\u001a\u0004\bF\u0010G\"\u0004\bH\u0010IR\"\u0010J\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bJ\u0010K\u001a\u0004\bL\u0010M\"\u0004\bN\u0010OR\"\u0010P\u001a\u00020\u00028\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\bP\u0010K\u001a\u0004\bQ\u0010M\"\u0004\bR\u0010OR\u0017\u0010S\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\bS\u0010T\u001a\u0004\bU\u0010VR\u001c\u0010Y\u001a\n X*\u0004\u0018\u00010W0W8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR*\u0010\\\u001a\u00020[2\u0006\u0010=\u001a\u00020[8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b\\\u0010]\u001a\u0004\b^\u0010_\"\u0004\b`\u0010aR*\u0010b\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bb\u0010T\u001a\u0004\bc\u0010V\"\u0004\bd\u0010.R*\u0010e\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\be\u00105\u001a\u0004\bf\u00106\"\u0004\bg\u0010hR.\u0010j\u001a\u0004\u0018\u00010i2\b\u0010=\u001a\u0004\u0018\u00010i8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR.\u0010p\u001a\u0004\u0018\u00010[2\b\u0010=\u001a\u0004\u0018\u00010[8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bp\u0010]\u001a\u0004\bq\u0010_\"\u0004\br\u0010aR*\u0010s\u001a\u00020\n2\u0006\u0010=\u001a\u00020\n8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bs\u0010T\u001a\u0004\bt\u0010V\"\u0004\bu\u0010.R.\u0010v\u001a\u0004\u0018\u00010i2\b\u0010=\u001a\u0004\u0018\u00010i8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bv\u0010k\u001a\u0004\bw\u0010m\"\u0004\bx\u0010oR*\u0010y\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\by\u00105\u001a\u0004\bz\u00106\"\u0004\b{\u0010hR*\u0010|\u001a\u00020\u000f2\u0006\u0010=\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b|\u00105\u001a\u0004\b|\u00106\"\u0004\b}\u0010h¨\u0006\u007f"}, d2 = {"Lru/ozon/uni/android/cell/label/TitleSubtitleCellView;", "Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Lru/ozon/uni/android/cell/label/SmartLabel;", "Lru/ozon/uni/android/cell/label/TitleSubtitleCellApi;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "defPreset", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;Z)V", "Ljava/util/LinkedHashMap;", "Landroidx/constraintlayout/helper/widget/Flow;", "Lkotlin/collections/LinkedHashMap;", "flows", "Landroidx/constraintlayout/widget/d;", "constraintSet", "wrappingFlow", "", "collectFlow", "(Ljava/util/LinkedHashMap;Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/helper/widget/Flow;)V", "titleIcon", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "titleIconPosition", "titleIconColor", "setTitleIcon", "(Ljava/lang/Integer;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Ljava/lang/Integer;)V", "subtitleIcon", "subtitleIconPosition", "subtitleIconColor", "setSubtitleIcon", "color", "", "alpha", "setTitleColor", "(IF)V", "setSubtitleColor", "setTitleIconColorInt$uni_release", "(I)V", "setTitleIconColorInt", "setSubtitleIconColorInt$uni_release", "setSubtitleIconColorInt", "setAddonVisibility$uni_release", "()V", "setAddonVisibility", "Z", "()Z", "", "Lkotlin/Function1;", "Landroid/view/View;", "locatorInitializers", "Ljava/util/Map;", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "preset", "Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "getPreset", "()Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;", "setPreset", "(Lru/ozon/uni/android/cell/label/data/TitleSubtitleWrapperPreset;)V", "addonView", "Lru/ozon/uni/android/cell/label/SmartLabel;", "getAddonView", "()Lru/ozon/uni/android/cell/label/SmartLabel;", "setAddonView", "(Lru/ozon/uni/android/cell/label/SmartLabel;)V", "mainView", "getMainView", "setMainView", "defaultIconColor", "I", "getDefaultIconColor", "()I", "Landroid/text/method/MovementMethod;", "kotlin.jvm.PlatformType", "moveMethod", "Landroid/text/method/MovementMethod;", "", "titleText", "Ljava/lang/CharSequence;", "getTitleText", "()Ljava/lang/CharSequence;", "setTitleText", "(Ljava/lang/CharSequence;)V", "titleNumberOfLines", "getTitleNumberOfLines", "setTitleNumberOfLines", "titleTagSupported", "getTitleTagSupported", "setTitleTagSupported", "(Z)V", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "titleTruncatingMode", "Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "getTitleTruncatingMode", "()Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;", "setTitleTruncatingMode", "(Lru/ozon/uni/atoms/data/common/CommonAtomLabelDTO$TruncatingMode;)V", "subtitleText", "getSubtitleText", "setSubtitleText", "subtitleNumberOfLines", "getSubtitleNumberOfLines", "setSubtitleNumberOfLines", "subtitleTruncatingMode", "getSubtitleTruncatingMode", "setSubtitleTruncatingMode", "subtitleTagSupported", "getSubtitleTagSupported", "setSubtitleTagSupported", "isSubtitleVisible", "setSubtitleVisible", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TitleSubtitleCellView extends MainAddonWrapperV3<SmartLabel, SmartLabel> implements TitleSubtitleCellApi, AtomView, AtomLocatableView {

    @NotNull
    private SmartLabel addonView;
    private final int defaultIconColor;
    private final boolean isRootWrapper;
    private boolean isSubtitleVisible;

    @NotNull
    private final Map<Integer, Function1<View, Unit>> locatorInitializers;

    @NotNull
    private String locatorTag;

    @NotNull
    private SmartLabel mainView;
    private final MovementMethod moveMethod;

    @NotNull
    private TitleSubtitleWrapperPreset preset;
    private int subtitleNumberOfLines;
    private boolean subtitleTagSupported;
    private CharSequence subtitleText;
    private CommonAtomLabelDTO.TruncatingMode subtitleTruncatingMode;
    private int titleNumberOfLines;
    private boolean titleTagSupported;

    @NotNull
    private CharSequence titleText;
    private CommonAtomLabelDTO.TruncatingMode titleTruncatingMode;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/cell/label/TitleSubtitleCellView$Companion;", "", "<init>", "()V", "TITLE_LOCATOR_TAG", "", "SUBTITLE_LOCATOR_TAG", "TITLE_SUBTITLE_LOCATOR_TAG", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;
        public static final /* synthetic */ int[] $EnumSwitchMapping$3;

        static {
            int[] iArr = new int[Axis.values().length];
            try {
                iArr[Axis.VERTICAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Axis.HORIZONTAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Alignment.values().length];
            try {
                iArr2[Alignment.LEADING.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Alignment.NONE.ordinal()] = 2;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[Alignment.FIRST_BASELINE.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Alignment.LAST_BASELINE.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Alignment.TRAILING.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Alignment.CENTER.ordinal()] = 6;
            } catch (NoSuchFieldError unused8) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[AddonSide.values().length];
            try {
                iArr3[AddonSide.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[AddonSide.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
            int[] iArr4 = new int[CommonAtomLabelDTO.TruncatingMode.values().length];
            try {
                iArr4[CommonAtomLabelDTO.TruncatingMode.TAIL.ordinal()] = 1;
            } catch (NoSuchFieldError unused11) {
            }
            try {
                iArr4[CommonAtomLabelDTO.TruncatingMode.MIDDLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused12) {
            }
            try {
                iArr4[CommonAtomLabelDTO.TruncatingMode.HEAD.ordinal()] = 3;
            } catch (NoSuchFieldError unused13) {
            }
            $EnumSwitchMapping$3 = iArr4;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, null, false, 60, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    protected void collectFlow(@NotNull LinkedHashMap<Integer, Flow> flows, @NotNull d constraintSet, Flow wrappingFlow) {
        Flow flow;
        int i11;
        float f7;
        int[] iArr;
        int i12;
        Intrinsics.checkNotNullParameter(flows, "flows");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        if (wrappingFlow == null) {
            flow = new Flow(getContext());
            if (flow.getId() == -1) {
                flow.setId(View.generateViewId());
            }
        } else {
            flow = wrappingFlow;
        }
        if (wrappingFlow == null) {
            ConstraintSetExtKt.layoutConstraintTopToTopOfParent(constraintSet, flow);
            ConstraintSetExtKt.layoutConstraintStartToStartOfParent(constraintSet, flow);
            ConstraintSetExtKt.layoutConstraintEndToEndOfParent(constraintSet, flow);
            ConstraintSetExtKt.layoutConstraintBottomToBottomOfParent(constraintSet, flow);
        }
        Axis axis = getAxis();
        int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
        int i13 = iArr2[axis.ordinal()];
        if (i13 == 1) {
            i11 = 1;
        } else {
            if (i13 != 2) {
                throw new o();
            }
            i11 = 0;
        }
        flow.setOrientation(i11);
        constraintSet.A(flow.getId(), 0);
        constraintSet.w(flow.getId(), -2);
        if (getIsRootWrapper()) {
            constraintSet.x(flow.getId(), UiExtKt.toPx(getMinWrapperHeight()));
        }
        flow.setPaddingLeft(UiExtKt.toPx(getLayoutPaddingStart()));
        flow.setPaddingTop(UiExtKt.toPx(getLayoutPaddingTop()));
        flow.setPaddingRight(UiExtKt.toPx(getLayoutPaddingEnd()));
        flow.setPaddingBottom(UiExtKt.toPx(getLayoutPaddingBottom()));
        SmartLabel addonView = getAddonView();
        LayoutPadding.padding layoutPadding = getAddonPaddings().toLayoutPadding(getAxis());
        addonView.setPadding(UiExtKt.toPx(layoutPadding.getStart()), UiExtKt.toPx(layoutPadding.getTop()), UiExtKt.toPx(layoutPadding.getEnd()), UiExtKt.toPx(layoutPadding.getBottom()));
        Function1<View, Unit> function1 = this.locatorInitializers.get(Integer.valueOf(addonView.getId()));
        if (function1 != null) {
            function1.invoke(addonView);
        }
        SmartLabel mainView = getMainView();
        LayoutPadding.padding layoutPadding2 = getMainPaddings().toLayoutPadding(getAxis());
        mainView.setPadding(UiExtKt.toPx(layoutPadding2.getStart()) + mainView.getPaddingLeft(), UiExtKt.toPx(layoutPadding2.getTop()) + mainView.getPaddingTop(), UiExtKt.toPx(layoutPadding2.getEnd()) + mainView.getPaddingRight(), UiExtKt.toPx(layoutPadding2.getBottom()) + mainView.getPaddingBottom());
        Function1<View, Unit> function12 = this.locatorInitializers.get(Integer.valueOf(mainView.getId()));
        if (function12 != null) {
            function12.invoke(mainView);
        }
        int i14 = iArr2[getAxis().ordinal()];
        if (i14 == 1) {
            switch (WhenMappings.$EnumSwitchMapping$1[getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    f7 = 0.0f;
                    break;
                case 5:
                    f7 = 1.0f;
                    break;
                case 6:
                    f7 = 0.5f;
                    break;
                default:
                    throw new o();
            }
            constraintSet.c0(f7, getAddonView().getId());
            constraintSet.c0(f7, getMainView().getId());
            flow.setVerticalGap(UiExtKt.toPx(getGap()));
        } else {
            if (i14 != 2) {
                throw new o();
            }
            switch (WhenMappings.$EnumSwitchMapping$1[getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 3:
                case 4:
                    i12 = 0;
                    break;
                case 5:
                    i12 = 1;
                    break;
                case 6:
                    i12 = 2;
                    break;
                default:
                    throw new o();
            }
            flow.setVerticalAlign(i12);
            flow.setHorizontalGap(UiExtKt.toPx(getGap()));
        }
        flow.setVerticalStyle(2);
        constraintSet.A(getMainView().getId(), -2);
        constraintSet.w(getMainView().getId(), -2);
        constraintSet.C(getMainView().getId(), true);
        constraintSet.A(getAddonView().getId(), -2);
        constraintSet.w(getAddonView().getId(), -2);
        constraintSet.C(getAddonView().getId(), true);
        int i15 = WhenMappings.$EnumSwitchMapping$2[getAddonSide().ordinal()];
        if (i15 == 1) {
            iArr = new int[]{getAddonView().getId(), getMainView().getId()};
        } else {
            if (i15 != 2) {
                throw new o();
            }
            iArr = new int[]{getMainView().getId(), getAddonView().getId()};
        }
        flow.setReferencedIds(iArr);
        flows.put(Integer.valueOf(getAddonView().getId()), flow);
        flows.put(Integer.valueOf(getMainView().getId()), flow);
    }

    public final int getDefaultIconColor() {
        return this.defaultIconColor;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    public int getSubtitleNumberOfLines() {
        return this.subtitleNumberOfLines;
    }

    public boolean getSubtitleTagSupported() {
        return this.subtitleTagSupported;
    }

    public CharSequence getSubtitleText() {
        return this.subtitleText;
    }

    public CommonAtomLabelDTO.TruncatingMode getSubtitleTruncatingMode() {
        return this.subtitleTruncatingMode;
    }

    public int getTitleNumberOfLines() {
        return this.titleNumberOfLines;
    }

    public boolean getTitleTagSupported() {
        return this.titleTagSupported;
    }

    @NotNull
    public CharSequence getTitleText() {
        return this.titleText;
    }

    public CommonAtomLabelDTO.TruncatingMode getTitleTruncatingMode() {
        return this.titleTruncatingMode;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    /* renamed from: isSubtitleVisible, reason: from getter */
    public boolean getIsSubtitleVisible() {
        return this.isSubtitleVisible;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    public void setAddonVisibility$uni_release() {
        Flow flowByViewId;
        Flow flowByViewId2;
        CharSequence subtitleText;
        super.setAddonVisibility$uni_release();
        if (!getIsSubtitleVisible() || (subtitleText = getSubtitleText()) == null || subtitleText.length() == 0) {
            ViewExtKt.gone(getAddonView());
        } else {
            ViewExtKt.show(getAddonView());
        }
        if (getAxis() != Axis.HORIZONTAL || (flowByViewId = getFlowByViewId(getMainView().getId())) == null || (flowByViewId2 = getFlowByViewId(flowByViewId.getId())) == null) {
            return;
        }
        int i11 = 2;
        if (UiExtKt.toPx(getMainAddonSettings().getGap()) + getMainView().getHeight() < UiExtKt.toPx(getMainAddonSettings().getMinWrapperHeight())) {
            flowByViewId2.setVerticalAlign(2);
            return;
        }
        switch (WhenMappings.$EnumSwitchMapping$1[getAlignment().ordinal()]) {
            case 1:
            case 2:
            case 3:
            case 4:
                i11 = 0;
                break;
            case 5:
                i11 = 1;
                break;
            case 6:
                break;
            default:
                throw new o();
        }
        flowByViewId2.setVerticalAlign(i11);
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

    public final void setPreset(@NotNull TitleSubtitleWrapperPreset value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.preset = value;
        getMainView().withSmartLabelPreset(this.preset.getMainPreset());
        getAddonView().withSmartLabelPreset(this.preset.getAddonPreset().getSmartLabelPreset());
        setMainAddonSettings(this.preset.getAddonPreset().getMainAddonSettings());
    }

    @Override // ru.ozon.uni.android.cell.label.TitleSubtitleCellApi
    public void setSubtitleColor(int color, float alpha) {
        getAddonView().setTextColor(color);
        getAddonView().setAlpha(alpha);
    }

    public void setSubtitleIcon(Integer subtitleIcon, @NotNull AddonSide subtitleIconPosition, Integer subtitleIconColor) {
        Intrinsics.checkNotNullParameter(subtitleIconPosition, "subtitleIconPosition");
        if (subtitleIcon != null) {
            getAddonView().setIcon(subtitleIconPosition, Integer.valueOf(subtitleIcon.intValue()), subtitleIconColor);
        }
    }

    public final void setSubtitleIconColorInt$uni_release(int color) {
        getAddonView().setIconColorInt(color);
    }

    public void setSubtitleNumberOfLines(int i11) {
        this.subtitleNumberOfLines = i11;
        getAddonView().setMaxLines(i11);
    }

    public void setSubtitleTagSupported(boolean z11) {
        this.subtitleTagSupported = z11;
        if (z11) {
            getAddonView().setMovementMethod(this.moveMethod);
            return;
        }
        SmartLabel addonView = getAddonView();
        CharSequence text = getAddonView().getText();
        addonView.setText(text != null ? text.toString() : null);
    }

    public void setSubtitleText(CharSequence charSequence) {
        CharSequence charSequence2 = this.subtitleText;
        boolean z11 = true;
        if (charSequence2 != null) {
            if ((charSequence2 == null || charSequence2.length() == 0) == (charSequence == null || charSequence.length() == 0)) {
                z11 = false;
            }
        }
        this.subtitleText = charSequence;
        if (getSubtitleTagSupported()) {
            getAddonView().setText(this.subtitleText);
            getAddonView().setMovementMethod(this.moveMethod);
        } else {
            SmartLabel addonView = getAddonView();
            CharSequence charSequence3 = this.subtitleText;
            addonView.setText(charSequence3 != null ? charSequence3.toString() : null);
        }
        if (z11) {
            changeAddonVisibilityIfNeeded();
        }
    }

    public void setSubtitleTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.subtitleTruncatingMode = truncatingMode;
        int i11 = truncatingMode == null ? -1 : WhenMappings.$EnumSwitchMapping$3[truncatingMode.ordinal()];
        if (i11 == 1) {
            getAddonView().setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        if (i11 == 2) {
            getAddonView().setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i11 != 3) {
            getAddonView().setEllipsize(TextUtils.TruncateAt.END);
        } else {
            getAddonView().setEllipsize(TextUtils.TruncateAt.START);
        }
    }

    public void setSubtitleVisible(boolean z11) {
        this.isSubtitleVisible = z11;
        changeAddonVisibilityIfNeeded();
    }

    @Override // ru.ozon.uni.android.cell.label.TitleSubtitleCellApi
    public void setTitleColor(int color, float alpha) {
        getMainView().setTextColor(color);
        getMainView().setAlpha(alpha);
    }

    public void setTitleIcon(Integer titleIcon, @NotNull AddonSide titleIconPosition, Integer titleIconColor) {
        Intrinsics.checkNotNullParameter(titleIconPosition, "titleIconPosition");
        if (titleIcon != null) {
            getMainView().setIcon(titleIconPosition, Integer.valueOf(titleIcon.intValue()), titleIconColor);
        }
    }

    public final void setTitleIconColorInt$uni_release(int color) {
        getMainView().setIconColorInt(color);
    }

    public void setTitleNumberOfLines(int i11) {
        this.titleNumberOfLines = i11;
        getMainView().setMaxLines(this.titleNumberOfLines);
    }

    public void setTitleTagSupported(boolean z11) {
        this.titleTagSupported = z11;
        if (z11) {
            getMainView().setMovementMethod(this.moveMethod);
            return;
        }
        SmartLabel mainView = getMainView();
        CharSequence text = getMainView().getText();
        mainView.setText(text != null ? text.toString() : null);
    }

    public void setTitleText(@NotNull CharSequence value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.titleText = value;
        if (!getTitleTagSupported()) {
            getMainView().setText(this.titleText.toString());
        } else {
            getMainView().setText(this.titleText);
            getAddonView().setMovementMethod(this.moveMethod);
        }
    }

    public void setTitleTruncatingMode(CommonAtomLabelDTO.TruncatingMode truncatingMode) {
        this.titleTruncatingMode = truncatingMode;
        int i11 = truncatingMode == null ? -1 : WhenMappings.$EnumSwitchMapping$3[truncatingMode.ordinal()];
        if (i11 == 1) {
            getMainView().setEllipsize(TextUtils.TruncateAt.END);
            return;
        }
        if (i11 == 2) {
            getMainView().setEllipsize(TextUtils.TruncateAt.MIDDLE);
        } else if (i11 != 3) {
            getMainView().setEllipsize(TextUtils.TruncateAt.END);
        } else {
            getMainView().setEllipsize(TextUtils.TruncateAt.START);
        }
    }

    public /* synthetic */ TitleSubtitleCellView(Context context, AttributeSet attributeSet, int i11, int i12, TitleSubtitleWrapperPreset titleSubtitleWrapperPreset, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? 0 : i12, (i13 & 16) != 0 ? TitleSubtitleWrapperPresets.INSTANCE.getDefault500() : titleSubtitleWrapperPreset, (i13 & 32) != 0 ? true : z11);
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public SmartLabel getAddonView() {
        return this.addonView;
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3
    @NotNull
    public SmartLabel getMainView() {
        return this.mainView;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TitleSubtitleCellView(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull TitleSubtitleWrapperPreset defPreset, boolean z11) {
        super(context, attributeSet, i11, i12, defPreset.getAddonPreset().getMainAddonSettings(), z11);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defPreset, "defPreset");
        this.isRootWrapper = z11;
        this.locatorInitializers = U.j(new Pair(Integer.valueOf(R$id.mainViewId), new TitleSubtitleCellView$locatorInitializers$1(this)), new Pair(Integer.valueOf(R$id.addonViewId), new TitleSubtitleCellView$locatorInitializers$2(this)));
        this.locatorTag = "titleSubtitleCell";
        this.preset = defPreset;
        int i13 = 6;
        DefaultConstructorMarker defaultConstructorMarker = null;
        int i14 = 0;
        SmartLabel withSmartLabelPreset = new SmartLabel(context, null, i14, i13, defaultConstructorMarker).withSmartLabelPreset(this.preset.getAddonPreset().getSmartLabelPreset());
        withSmartLabelPreset.setId(R$id.addonViewId);
        this.addonView = withSmartLabelPreset;
        SmartLabel withSmartLabelPreset2 = new SmartLabel(context, null, i14, i13, defaultConstructorMarker).withSmartLabelPreset(this.preset.getMainPreset());
        withSmartLabelPreset2.setId(R$id.mainViewId);
        this.mainView = withSmartLabelPreset2;
        this.defaultIconColor = a.getColor(context, R$color.graphic_neutral);
        this.moveMethod = LinkMovementMethod.getInstance();
        this.titleText = "";
        this.titleNumberOfLines = Integer.MAX_VALUE;
        CommonAtomLabelDTO.TruncatingMode truncatingMode = CommonAtomLabelDTO.TruncatingMode.TAIL;
        this.titleTruncatingMode = truncatingMode;
        this.subtitleNumberOfLines = Integer.MAX_VALUE;
        this.subtitleTruncatingMode = truncatingMode;
        this.isSubtitleVisible = true;
        setViews();
        if (getIsRootWrapper()) {
            TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.TitleSubtitleCellView, i11, i12);
            Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
            String string = obtainStyledAttributes.getString(R$styleable.TitleSubtitleCellView_mainText);
            setTitleText(string != null ? string : "");
            int color = obtainStyledAttributes.getColor(R$styleable.TitleSubtitleCellView_mainTextColor, -1);
            if (color != -1) {
                getAddonView().setTextColor(color);
            }
            setSubtitleText(obtainStyledAttributes.getString(R$styleable.TitleSubtitleCellView_addonText));
            int color2 = obtainStyledAttributes.getColor(R$styleable.TitleSubtitleCellView_addonTextColor, -1);
            if (color2 != -1) {
                getMainView().setTextColor(color2);
            }
            setTitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.TitleSubtitleCellView_mainTruncatingMode, truncatingMode.ordinal())]);
            setSubtitleTruncatingMode(((CommonAtomLabelDTO.TruncatingMode[]) CommonAtomLabelDTO.TruncatingMode.getEntries().toArray(new CommonAtomLabelDTO.TruncatingMode[0]))[obtainStyledAttributes.getInt(R$styleable.TitleSubtitleCellView_addonTruncatingMode, truncatingMode.ordinal())]);
            obtainStyledAttributes.recycle();
        }
    }
}
