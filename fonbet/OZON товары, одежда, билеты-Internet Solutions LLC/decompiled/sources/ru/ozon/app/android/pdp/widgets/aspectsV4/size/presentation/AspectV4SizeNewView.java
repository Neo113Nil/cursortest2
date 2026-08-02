package ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation;

import D90.c;
import Gl.C3124a;
import Sc.InterfaceC4008j;
import android.annotation.SuppressLint;
import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.RectF;
import android.view.View;
import android.view.ViewGroup;
import androidx.core.content.a;
import gk0.q;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.N;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pdp.R$id;
import ru.ozon.app.android.pdp.utils.DelegatesKt;
import ru.ozon.app.android.pdp.utils.Dimens;
import ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeVO;
import ru.ozon.uni.android.atom.text.TextAtomV2View;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.view.MeasureExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.v3.holders.text.TextHolderKt;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000p\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u0007\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 ]2\u00020\u00012\u00020\u0002:\u0001]B'\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0005¢\u0006\u0004\b\t\u0010\nJ\u000f\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\f\u0010\rJ%\u0010\u0012\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u000e2\f\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u000b0\u0010H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u001f\u0010\u0017\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u00142\u0006\u0010\u0016\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u0017\u0010\u0018J7\u0010\u001e\u001a\u00020\u000b2\u0006\u0010\u0019\u001a\u00020\u00052\u0006\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u001b\u001a\u00020\u00142\u0006\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u001d\u001a\u00020\u0014H\u0014¢\u0006\u0004\b\u001e\u0010\u001fJ\u0017\u0010\"\u001a\u00020\u000b2\u0006\u0010!\u001a\u00020 H\u0014¢\u0006\u0004\b\"\u0010#J\u0015\u0010&\u001a\u00020\u000b2\u0006\u0010%\u001a\u00020$¢\u0006\u0004\b&\u0010'R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010(\u001a\u0004\b\u0006\u0010)R\u0014\u0010\u0007\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010(R\u0014\u0010\b\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010(R\u0014\u0010*\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010+R\u0014\u0010,\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010+R\u0014\u0010-\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b-\u0010+R\u0014\u0010.\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010+R\u0016\u0010/\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b/\u0010(R\u0016\u00100\u001a\u00020\u00058\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b0\u0010(R\u0014\u00102\u001a\u0002018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b2\u00103R\u001b\u00108\u001a\u0002018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b4\u00105\u001a\u0004\b6\u00107R\u0016\u0010:\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b:\u0010;R\u001b\u0010?\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b<\u00105\u001a\u0004\b=\u0010>R\u0014\u0010@\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b@\u0010+R\u001b\u0010C\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bA\u00105\u001a\u0004\bB\u0010>R\u001b\u0010F\u001a\u00020\u00148BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bD\u00105\u001a\u0004\bE\u0010>R\u0014\u0010H\u001a\u00020G8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR\u0014\u0010K\u001a\u00020J8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020$8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0016\u0010O\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bO\u0010;R\u0016\u0010P\u001a\u0002098\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010;R\u0016\u0010Q\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bQ\u0010+R\u0016\u0010R\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bR\u0010+R\u0016\u0010S\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bS\u0010+R\u0016\u0010T\u001a\u00020\u00148\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bT\u0010+R\u0018\u0010U\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bU\u0010VR\u0016\u0010W\u001a\u00020\u00148\u0002@\u0002X\u0083\u000e¢\u0006\u0006\n\u0004\bW\u0010+R\u001e\u0010\u0011\u001a\n\u0012\u0004\u0012\u00020\u000b\u0018\u00010\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010XR\u0014\u0010\\\u001a\u00020Y8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\bZ\u0010[¨\u0006^"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectV4SizeNewView;", "Landroid/view/ViewGroup;", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeViewItem;", "Landroid/content/Context;", "context", "", "isSubtext", "isSelect", "isMultiline", "<init>", "(Landroid/content/Context;ZZZ)V", "", "updateStateCache", "()V", "Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO$Size;", "item", "Lkotlin/Function0;", "onClick", "bind", "(Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectsV4SizeVO$Size;Lkotlin/jvm/functions/Function0;)V", "", "widthMeasureSpec", "heightMeasureSpec", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Landroid/graphics/Canvas;", "canvas", "onDraw", "(Landroid/graphics/Canvas;)V", "Lru/ozon/uni/atoms/data/aspect/AspectDTO$AspectState;", "state", "setState", "(Lru/ozon/uni/atoms/data/aspect/AspectDTO$AspectState;)V", "Z", "()Z", "horizontalPadding", "I", "verticalPadding", "extraPadding", "maxTextWidth", "isDoubleItems", "canRequestLayout", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "titleView", "Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtextView$delegate", "LSc/j;", "getSubtextView", "()Lru/ozon/uni/android/atom/text/TextAtomV2View;", "subtextView", "", "cornerRadiusPx", "F", "colorBgSecondary$delegate", "getColorBgSecondary", "()I", "colorBgSecondary", "unselectedStrokeColor", "selectedStrokeColor$delegate", "getSelectedStrokeColor", "selectedStrokeColor", "unselectedSelectStrokeColor$delegate", "getUnselectedSelectStrokeColor", "unselectedSelectStrokeColor", "Landroid/graphics/Paint;", "paint", "Landroid/graphics/Paint;", "Landroid/graphics/RectF;", "rectF", "Landroid/graphics/RectF;", "currentState", "Lru/ozon/uni/atoms/data/aspect/AspectDTO$AspectState;", "cachedAlpha", "cachedStrokeWidth", "titleWidth", "titleHeight", "subtitleWidth", "subtitleHeigh", "cachedBgColor", "Ljava/lang/Integer;", "cachedStrokeColor", "Lkotlin/jvm/functions/Function0;", "Landroid/view/View;", "getRoot", "()Landroid/view/View;", "root", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@SuppressLint({"ViewConstructor"})
/* loaded from: classes13.dex */
public final class AspectV4SizeNewView extends ViewGroup implements AspectsV4SizeViewItem {
    private float cachedAlpha;
    private Integer cachedBgColor;
    private int cachedStrokeColor;
    private float cachedStrokeWidth;
    private boolean canRequestLayout;

    /* renamed from: colorBgSecondary$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j colorBgSecondary;
    private float cornerRadiusPx;

    @NotNull
    private AspectDTO.AspectState currentState;
    private final int extraPadding;
    private final int horizontalPadding;
    private boolean isDoubleItems;
    private final boolean isMultiline;
    private final boolean isSelect;
    private final boolean isSubtext;
    private final int maxTextWidth;
    private Function0<Unit> onClick;

    @NotNull
    private final Paint paint;

    @NotNull
    private final RectF rectF;

    /* renamed from: selectedStrokeColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j selectedStrokeColor;

    /* renamed from: subtextView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j subtextView;
    private int subtitleHeigh;
    private int subtitleWidth;
    private int titleHeight;

    @NotNull
    private final TextAtomV2View titleView;
    private int titleWidth;

    /* renamed from: unselectedSelectStrokeColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j unselectedSelectStrokeColor;
    private final int unselectedStrokeColor;
    private final int verticalPadding;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;
    private static final int MAX_SINGLE_TEXT_WIDTH = UiExtKt.toPx(218);
    private static final int MAX_SUBTEXT_WIDTH = UiExtKt.toPx(164);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u0014\u0010\u0005\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0005\u0010\u0006R\u0014\u0010\u0007\u001a\u00020\u00048\u0006X\u0086T¢\u0006\u0006\n\u0004\b\u0007\u0010\u0006¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdp/widgets/aspectsV4/size/presentation/AspectV4SizeNewView$Companion;", "", "<init>", "()V", "", "CONTENT_OPACITY_100", "F", "CONTENT_OPACITY_40", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        static {
            int[] iArr = new int[AspectDTO.AspectState.values().length];
            try {
                iArr[AspectDTO.AspectState.UNAVAILABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AspectDTO.AspectState.SELECTED_UNAVAILABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[AspectDTO.AspectState.ENABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[AspectDTO.AspectState.PARTIALLY_AVAILABLE.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr[AspectDTO.AspectState.SELECTED.ordinal()] = 5;
            } catch (NoSuchFieldError unused5) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AspectV4SizeNewView(@NotNull Context context, boolean z11, boolean z12, boolean z13) {
        super(context);
        Context context2;
        Intrinsics.checkNotNullParameter(context, "context");
        this.isSubtext = z11;
        this.isSelect = z12;
        this.isMultiline = z13;
        Dimens dimens = Dimens.INSTANCE;
        int dp_10 = z12 ? dimens.getDP_10() : dimens.getDP_8();
        this.horizontalPadding = dp_10;
        int dp_4 = z12 ? Dimens.INSTANCE.getDP_4() : Dimens.INSTANCE.getDP_2();
        this.verticalPadding = dp_4;
        Dimens dimens2 = Dimens.INSTANCE;
        int dp_6 = dimens2.getDP_6();
        this.extraPadding = dp_6;
        this.maxTextWidth = z11 ? MAX_SUBTEXT_WIDTH : MAX_SINGLE_TEXT_WIDTH;
        this.isDoubleItems = z11;
        this.canRequestLayout = true;
        TextAtomV2View textAtomV2View = (TextAtomV2View) q.f64554a.i(N.b(TextAtomV2View.class), context);
        if (textAtomV2View == null) {
            context2 = context;
            textAtomV2View = new TextAtomV2View(context2, null, 0, 6, null);
        } else {
            context2 = context;
        }
        textAtomV2View.setId(R$id.aspectSizeText);
        textAtomV2View.setTextIsSelectable(false);
        this.titleView = textAtomV2View;
        this.subtextView = DelegatesKt.lazyUnsafe(new AspectV4SizeNewView$subtextView$2(context2, this));
        this.cornerRadiusPx = ResourceExtKt.toPxF(CornerRadius.RADIUS_400.getPx());
        this.colorBgSecondary = DelegatesKt.lazyUnsafe(new AspectV4SizeNewView$colorBgSecondary$2(context2));
        int color = a.getColor(context2, UniColors.GRAPHIC_NEUTRAL.getResId());
        this.unselectedStrokeColor = color;
        this.selectedStrokeColor = DelegatesKt.lazyUnsafe(new AspectV4SizeNewView$selectedStrokeColor$2(context2));
        this.unselectedSelectStrokeColor = DelegatesKt.lazyUnsafe(new AspectV4SizeNewView$unselectedSelectStrokeColor$2(context2));
        this.paint = new Paint(1);
        this.rectF = new RectF();
        this.currentState = AspectDTO.AspectState.ENABLED;
        this.cachedAlpha = 1.0f;
        this.cachedStrokeWidth = dimens2.getDPF_1();
        this.cachedStrokeColor = color;
        setId(R$id.aspectSizeContainer);
        addView(textAtomV2View);
        if (z11) {
            getSubtextView();
            int i11 = dp_10 + dp_6;
            int i12 = dp_4 + dp_6;
            setPadding(i11, i12, i11, i12);
        } else {
            setPadding(dp_6, dp_6, dp_6, dp_6);
        }
        setWillNotDraw(false);
        updateStateCache();
        setOnClickListener(new c(this, 8));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$1(AspectV4SizeNewView aspectV4SizeNewView, View view) {
        Function0<Unit> function0 = aspectV4SizeNewView.onClick;
        if (function0 != null) {
            function0.invoke();
        }
    }

    private final int getColorBgSecondary() {
        return ((Number) this.colorBgSecondary.getValue()).intValue();
    }

    private final int getSelectedStrokeColor() {
        return ((Number) this.selectedStrokeColor.getValue()).intValue();
    }

    private final TextAtomV2View getSubtextView() {
        return (TextAtomV2View) this.subtextView.getValue();
    }

    private final int getUnselectedSelectStrokeColor() {
        return ((Number) this.unselectedSelectStrokeColor.getValue()).intValue();
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0051  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0078 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0087  */
    /* JADX WARN: Removed duplicated region for block: B:30:0x00a5 A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:39:0x0065  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x006a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final void updateStateCache() {
        float dpf_1;
        int i11;
        int unselectedSelectStrokeColor;
        float f7;
        int i12;
        AspectDTO.AspectState aspectState = this.currentState;
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
        int i13 = iArr[aspectState.ordinal()];
        boolean z11 = true;
        this.cachedBgColor = (i13 == 1 || i13 == 2) ? Integer.valueOf(getColorBgSecondary()) : null;
        int i14 = iArr[this.currentState.ordinal()];
        if (i14 != 1) {
            if (i14 != 2) {
                if (i14 != 3 && i14 != 4) {
                    if (i14 != 5) {
                        dpf_1 = Dimens.INSTANCE.getDPF_1();
                        this.cachedStrokeWidth = dpf_1;
                        i11 = iArr[this.currentState.ordinal()];
                        if (i11 != 1) {
                            if (i11 != 2) {
                                if (i11 != 3 && i11 != 4) {
                                    if (i11 != 5) {
                                        unselectedSelectStrokeColor = this.unselectedStrokeColor;
                                        this.cachedStrokeColor = unselectedSelectStrokeColor;
                                        int i15 = iArr[this.currentState.ordinal()];
                                        f7 = (i15 != 1 || i15 == 2) ? 0.4f : 1.0f;
                                        if (f7 != this.cachedAlpha) {
                                            this.cachedAlpha = f7;
                                            this.titleView.setAlpha(f7);
                                            if (this.isDoubleItems) {
                                                getSubtextView().setAlpha(this.cachedAlpha);
                                            }
                                        }
                                        i12 = iArr[this.currentState.ordinal()];
                                        if (i12 != 2 && i12 != 5) {
                                            z11 = false;
                                        }
                                        setSelected(z11);
                                    }
                                }
                            }
                            unselectedSelectStrokeColor = getSelectedStrokeColor();
                            this.cachedStrokeColor = unselectedSelectStrokeColor;
                            int i152 = iArr[this.currentState.ordinal()];
                            if (i152 != 1) {
                            }
                            if (f7 != this.cachedAlpha) {
                            }
                            i12 = iArr[this.currentState.ordinal()];
                            if (i12 != 2) {
                                z11 = false;
                            }
                            setSelected(z11);
                        }
                        unselectedSelectStrokeColor = this.isSelect ? getUnselectedSelectStrokeColor() : this.unselectedStrokeColor;
                        this.cachedStrokeColor = unselectedSelectStrokeColor;
                        int i1522 = iArr[this.currentState.ordinal()];
                        if (i1522 != 1) {
                        }
                        if (f7 != this.cachedAlpha) {
                        }
                        i12 = iArr[this.currentState.ordinal()];
                        if (i12 != 2) {
                        }
                        setSelected(z11);
                    }
                }
            }
            dpf_1 = Dimens.INSTANCE.getDPF_2();
            this.cachedStrokeWidth = dpf_1;
            i11 = iArr[this.currentState.ordinal()];
            if (i11 != 1) {
            }
            if (this.isSelect) {
            }
            this.cachedStrokeColor = unselectedSelectStrokeColor;
            int i15222 = iArr[this.currentState.ordinal()];
            if (i15222 != 1) {
            }
            if (f7 != this.cachedAlpha) {
            }
            i12 = iArr[this.currentState.ordinal()];
            if (i12 != 2) {
            }
            setSelected(z11);
        }
        dpf_1 = Dimens.INSTANCE.getDPF_1();
        this.cachedStrokeWidth = dpf_1;
        i11 = iArr[this.currentState.ordinal()];
        if (i11 != 1) {
        }
        if (this.isSelect) {
        }
        this.cachedStrokeColor = unselectedSelectStrokeColor;
        int i152222 = iArr[this.currentState.ordinal()];
        if (i152222 != 1) {
        }
        if (f7 != this.cachedAlpha) {
        }
        i12 = iArr[this.currentState.ordinal()];
        if (i12 != 2) {
        }
        setSelected(z11);
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeViewItem
    public void bind(@NotNull AspectsV4SizeVO.Size item, @NotNull Function0<Unit> onClick) {
        Intrinsics.checkNotNullParameter(item, "item");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.canRequestLayout = true;
        this.isDoubleItems = item.getSubtext() != null;
        this.onClick = onClick;
        CornerRadius radius = item.getAspect().getRadius();
        if (radius != null) {
            this.cornerRadiusPx = ResourceExtKt.toPxF(radius.getPx());
        }
        AspectDTO.AspectState state = item.getAspect().getState();
        if (state != null) {
            setState(state);
        }
        TextHolderKt.bind$default(this.titleView, item.getText(), null, 2, null);
        if (this.isDoubleItems) {
            TextHolderKt.bindOrGone$default(getSubtextView(), item.getSubtext(), null, 2, null);
        }
    }

    @Override // ru.ozon.app.android.pdp.widgets.aspectsV4.size.presentation.AspectsV4SizeViewItem
    @NotNull
    public View getRoot() {
        return this;
    }

    @Override // android.view.View
    protected void onDraw(@NotNull Canvas canvas) {
        Intrinsics.checkNotNullParameter(canvas, "canvas");
        float f7 = this.cachedStrokeWidth / 2;
        this.rectF.set(f7, f7, getWidth() - f7, getHeight() - f7);
        Integer num = this.cachedBgColor;
        if (num != null) {
            int intValue = num.intValue();
            this.paint.setStyle(Paint.Style.FILL);
            this.paint.setColor(intValue);
            RectF rectF = this.rectF;
            float f11 = this.cornerRadiusPx;
            canvas.drawRoundRect(rectF, f11, f11, this.paint);
        }
        this.paint.setStyle(Paint.Style.STROKE);
        this.paint.setColor(this.cachedStrokeColor);
        this.paint.setStrokeWidth(this.cachedStrokeWidth);
        RectF rectF2 = this.rectF;
        float f12 = this.cornerRadiusPx;
        canvas.drawRoundRect(rectF2, f12, f12, this.paint);
        this.canRequestLayout = false;
    }

    @Override // android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        int a11;
        if (this.canRequestLayout) {
            int paddingLeft = getPaddingLeft();
            int paddingTop = getPaddingTop();
            int width = (getWidth() - paddingLeft) - getPaddingRight();
            int height = (getHeight() - paddingTop) - getPaddingBottom();
            int a12 = C3124a.a(width, this.titleWidth, 2, paddingLeft);
            if (this.isDoubleItems) {
                a11 = ((height - ((this.titleHeight + this.subtitleHeigh) + (this.isSelect ? 0 : Dimens.INSTANCE.getDP_2()))) / 2) + paddingTop;
            } else {
                a11 = C3124a.a(height, this.titleHeight, 2, paddingTop);
            }
            this.titleView.layout(a12, a11, this.titleWidth + a12, this.titleHeight + a11);
            if (this.isDoubleItems) {
                int a13 = C3124a.a(width, this.subtitleWidth, 2, paddingLeft);
                int dp_2 = a11 + this.titleHeight + (this.isSelect ? 0 : Dimens.INSTANCE.getDP_2());
                getSubtextView().layout(a13, dp_2, this.subtitleWidth + a13, this.subtitleHeigh + dp_2);
            }
        }
    }

    @Override // android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        int i11;
        int paddingRight = this.titleView.getPaddingRight() + this.titleView.getPaddingLeft();
        int paddingRight2 = getPaddingRight() + getPaddingLeft();
        int i12 = this.maxTextWidth - paddingRight2;
        int measureText = (int) this.titleView.getPaint().measureText(this.titleView.getText().toString());
        Paint.FontMetricsInt fontMetricsInt = this.titleView.getPaint().getFontMetricsInt();
        int i13 = (fontMetricsInt.descent - fontMetricsInt.ascent) + fontMetricsInt.leading;
        this.titleHeight = i13;
        if (this.isMultiline || measureText - this.horizontalPadding <= i12) {
            i11 = paddingRight + measureText;
        } else {
            MeasureExtKt.measure(this.titleView, i12, 1073741824, i13, 1073741824);
            i11 = this.titleView.getMeasuredWidth();
        }
        this.titleWidth = i11;
        if (this.isDoubleItems) {
            int measureText2 = (int) getSubtextView().getPaint().measureText(getSubtextView().getText().toString());
            Paint.FontMetricsInt fontMetricsInt2 = getSubtextView().getPaint().getFontMetricsInt();
            this.subtitleHeigh = (fontMetricsInt2.descent - fontMetricsInt2.ascent) + fontMetricsInt2.leading;
            if (!this.isMultiline && measureText2 - this.horizontalPadding > i12) {
                MeasureExtKt.measure(getSubtextView(), i12, 1073741824, this.subtitleHeigh, 1073741824);
                measureText2 = getSubtextView().getMeasuredWidth();
            }
            this.subtitleWidth = measureText2;
            i11 = Math.max(this.titleWidth, measureText2);
            i13 += this.subtitleHeigh + (this.isSelect ? 0 : Dimens.INSTANCE.getDP_2());
        }
        setMeasuredDimension(i11 + paddingRight2, getPaddingBottom() + getPaddingTop() + i13);
    }

    public final void setState(@NotNull AspectDTO.AspectState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        if (this.currentState != state) {
            this.currentState = state;
            updateStateCache();
        }
    }
}
