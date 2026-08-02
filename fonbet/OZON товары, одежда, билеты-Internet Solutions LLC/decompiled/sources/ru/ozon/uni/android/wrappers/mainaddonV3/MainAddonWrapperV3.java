package ru.ozon.uni.android.wrappers.mainaddonV3;

import Sc.InterfaceC3999a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.wrappers.mainaddon.data.AddonSide;
import ru.ozon.uni.android.wrappers.mainaddon.data.Alignment;
import ru.ozon.uni.android.wrappers.mainaddon.data.Axis;
import ru.ozon.uni.android.wrappers.mainaddon.data.ContentAxisRelatedPadding;
import ru.ozon.uni.android.wrappers.mainaddon.data.LayoutPadding;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonSettings;
import ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonViewApi;
import ru.ozon.uni.core.R$color;

@InterfaceC3999a
@Metadata(d1 = {"\u0000\u008c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010!\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b:\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u000b\b'\u0018\u0000 ¨\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u00042\u00020\u0005:\u0002¨\u0001BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\"\u001a\u00020\u00152\u0006\u0010\u0019\u001a\u00020\u001fH\u0016¢\u0006\u0004\b \u0010!J\u0017\u0010$\u001a\u00020\u00152\u0006\u0010\u001b\u001a\u00020\u001fH\u0016¢\u0006\u0004\b#\u0010!J\u000f\u0010%\u001a\u00020\u0015H\u0004¢\u0006\u0004\b%\u0010&J\u000f\u0010'\u001a\u00020\u0015H\u0004¢\u0006\u0004\b'\u0010&J\r\u0010(\u001a\u00020\u0015¢\u0006\u0004\b(\u0010&JE\u00100\u001a\u00020\u00152\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*`+2\u0006\u0010.\u001a\u00020-2\b\u0010/\u001a\u0004\u0018\u00010*H\u0014¢\u0006\u0004\b0\u00101JC\u00108\u001a\u00020-2\u0006\u0010.\u001a\u00020-2\u0006\u00102\u001a\u00020\u00012\b\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u000204H\u0014¢\u0006\u0004\b8\u00109J\u0017\u0010<\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-H\u0010¢\u0006\u0004\b:\u0010;J\u000f\u0010>\u001a\u00020\u0015H\u0010¢\u0006\u0004\b=\u0010&J\u0019\u0010@\u001a\u0004\u0018\u00010*2\u0006\u0010?\u001a\u00020\nH\u0004¢\u0006\u0004\b@\u0010AJ\u000f\u0010B\u001a\u00020\u0015H\u0002¢\u0006\u0004\bB\u0010&J\u000f\u0010C\u001a\u00020\u0015H\u0002¢\u0006\u0004\bC\u0010&J\u001d\u0010F\u001a\u00020\u00152\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010DH\u0002¢\u0006\u0004\bF\u0010GJ%\u0010I\u001a\u00020\u00152\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010D2\u0006\u0010H\u001a\u00020\u0001H\u0002¢\u0006\u0004\bI\u0010JJ\u000f\u0010K\u001a\u00020\u0015H\u0002¢\u0006\u0004\bK\u0010&JC\u0010L\u001a\u00020\u00152\u0006\u0010.\u001a\u00020-2\u0006\u00102\u001a\u00020\u00012\b\u00103\u001a\u0004\u0018\u00010\u00012\u0006\u00105\u001a\u0002042\b\u00106\u001a\u0004\u0018\u00010\u00012\u0006\u00107\u001a\u000204H\u0002¢\u0006\u0004\bL\u0010MJ\u000f\u0010N\u001a\u00020\u0015H\u0002¢\u0006\u0004\bN\u0010&JA\u0010P\u001a\u00020\u00152\"\u0010,\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*`+2\f\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010OH\u0002¢\u0006\u0004\bP\u0010QJ\u000f\u0010R\u001a\u00020\u0015H\u0002¢\u0006\u0004\bR\u0010&J\u000f\u0010S\u001a\u00020\u0015H\u0002¢\u0006\u0004\bS\u0010&J\u000f\u0010T\u001a\u00020\u0015H\u0002¢\u0006\u0004\bT\u0010&J\u000f\u0010U\u001a\u00020\u0015H\u0002¢\u0006\u0004\bU\u0010&J\u000f\u0010V\u001a\u00020\u0015H\u0002¢\u0006\u0004\bV\u0010&R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010W\u001a\u0004\bX\u0010YR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010Z\u001a\u0004\b\u0010\u0010[R\u0016\u0010\\\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\\\u0010]R\u0016\u0010^\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b^\u0010]R0\u0010_\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u001a\u0010E\u001a\b\u0012\u0004\u0012\u00020\u00010O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bE\u0010aR0\u0010b\u001a\u001e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)j\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*`+8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bb\u0010`R\u001a\u0010c\u001a\b\u0012\u0004\u0012\u00020\u00010O8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010aR*\u0010e\u001a\u00020\r2\u0006\u0010d\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010W\u001a\u0004\bf\u0010Y\"\u0004\bg\u0010hR\u001b\u0010m\u001a\u00020\u00018BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bi\u0010j\u001a\u0004\bk\u0010lR\u0014\u0010n\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bn\u0010]R\u0014\u0010.\u001a\u00020-8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b.\u0010oR\"\u0010p\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\bp\u0010]\u001a\u0004\bq\u0010r\"\u0004\bs\u0010!R\u0016\u0010t\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bt\u0010]R\u001c\u0010u\u001a\u0004\u0018\u00010\u00018\u0014X\u0094\u0004¢\u0006\f\n\u0004\bu\u0010v\u001a\u0004\bw\u0010lR\u001a\u0010x\u001a\u0002048\u0014X\u0094\u0004¢\u0006\f\n\u0004\bx\u0010y\u001a\u0004\bz\u0010{R\u001c\u0010|\u001a\u0004\u0018\u00010\u00018\u0014X\u0094\u0004¢\u0006\f\n\u0004\b|\u0010v\u001a\u0004\b}\u0010lR\u001a\u0010~\u001a\u0002048\u0014X\u0094\u0004¢\u0006\f\n\u0004\b~\u0010y\u001a\u0004\b\u007f\u0010{R/\u0010\u0080\u0001\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0016\n\u0005\b\u0080\u0001\u0010Z\u001a\u0005\b\u0081\u0001\u0010[\"\u0006\b\u0082\u0001\u0010\u0083\u0001R5\u0010\u0084\u0001\u001a\u0004\u0018\u00010\n2\b\u0010d\u001a\u0004\u0018\u00010\n8\u0016@VX\u0097\u000e¢\u0006\u0018\n\u0006\b\u0084\u0001\u0010\u0085\u0001\u001a\u0006\b\u0086\u0001\u0010\u0087\u0001\"\u0006\b\u0088\u0001\u0010\u0089\u0001R\u0018\u0010\u008d\u0001\u001a\u00030\u008a\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008f\u0001\u001a\u0002048DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u008e\u0001\u0010{R\u0018\u0010\u0093\u0001\u001a\u00030\u0090\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u0091\u0001\u0010\u0092\u0001R\u0016\u0010\u0095\u0001\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u0094\u0001\u0010rR\u0016\u0010\u0097\u0001\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u0096\u0001\u0010rR\u0016\u0010\u0099\u0001\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u0098\u0001\u0010rR\u0016\u0010\u009b\u0001\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u009a\u0001\u0010rR\u0016\u0010\u009d\u0001\u001a\u00020\n8DX\u0084\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010rR\u0018\u0010¡\u0001\u001a\u00030\u009e\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b\u009f\u0001\u0010 \u0001R\u0018\u0010£\u0001\u001a\u00030\u009e\u00018DX\u0084\u0004¢\u0006\b\u001a\u0006\b¢\u0001\u0010 \u0001R\u0016\u0010¥\u0001\u001a\u00028\u00008$X¤\u0004¢\u0006\u0007\u001a\u0005\b¤\u0001\u0010lR\u0016\u0010§\u0001\u001a\u00028\u00018$X¤\u0004¢\u0006\u0007\u001a\u0005\b¦\u0001\u0010l¨\u0006©\u0001"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddonV3/MainAddonWrapperV3;", "Landroid/view/View;", "MV", "AV", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonViewApi;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "defMainAddonSettings", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;Z)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "Lru/ozon/uni/atoms/data/cell/CellLayoutPadding;", "setCellPaddingLeft-nOKZfEA", "(I)V", "setCellPaddingLeft", "setCellPaddingRight-nOKZfEA", "setCellPaddingRight", "setViews", "()V", "resetViews", "changeAddonVisibilityIfNeeded", "Ljava/util/LinkedHashMap;", "Landroidx/constraintlayout/helper/widget/Flow;", "Lkotlin/collections/LinkedHashMap;", "flows", "Landroidx/constraintlayout/widget/d;", "constraintSet", "wrappingFlow", "collectFlow", "(Ljava/util/LinkedHashMap;Landroidx/constraintlayout/widget/d;Landroidx/constraintlayout/helper/widget/Flow;)V", "separatorView", "startAnchorView", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "startAnchorViewSide", "endAnchorView", "endAnchorViewSide", "addHorizontalSeparatorConstraints", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;Landroid/view/View;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Landroid/view/View;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;)Landroidx/constraintlayout/widget/d;", "onConstraintsCollected$uni_release", "(Landroidx/constraintlayout/widget/d;)V", "onConstraintsCollected", "setAddonVisibility$uni_release", "setAddonVisibility", "viewId", "getFlowByViewId", "(I)Landroidx/constraintlayout/helper/widget/Flow;", "initViewParams", "collectViews", "", "views", "addViewsVirtual", "(Ljava/util/List;)V", "view", "addViewVirtual", "(Ljava/util/List;Landroid/view/View;)V", "collectConstraints", "collectSeparatorConstraints", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;Landroid/view/View;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Landroid/view/View;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;)V", "collectRootWrapperViewsAndFlows", "Ljava/util/LinkedList;", "setRootWrapperViewsAndFlows", "(Ljava/util/LinkedHashMap;Ljava/util/LinkedList;)V", "callOnConstraintsAndViewsAndFlowsCollectedCallback", "addViews", "addFlows", "applyConstraints", "clearConstraints", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "getDefMainAddonSettings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "Z", "()Z", "onMeasureCounter", "I", "onLayoutCounter", "viewIdsFlows", "Ljava/util/LinkedHashMap;", "Ljava/util/LinkedList;", "rootWrapperViewIdsFlows", "rootWrapperViews", AppMeasurementSdk.ConditionalUserProperty.VALUE, "mainAddonSettings", "getMainAddonSettings", "setMainAddonSettings", "(Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;)V", "horizontalSeparatorView$delegate", "LSc/j;", "getHorizontalSeparatorView", "()Landroid/view/View;", "horizontalSeparatorView", "defaultSeparatorColor", "Landroidx/constraintlayout/widget/d;", "minWrapperHeight", "getMinWrapperHeight", "()I", "setMinWrapperHeight", "layoutWidth", "startSeparatorAnchorView", "Landroid/view/View;", "getStartSeparatorAnchorView", "startSeparatorAnchorViewSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "getStartSeparatorAnchorViewSide", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "endSeparatorAnchorView", "getEndSeparatorAnchorView", "endSeparatorAnchorViewSide", "getEndSeparatorAnchorViewSide", "hasSeparator", "getHasSeparator", "setHasSeparator", "(Z)V", "separatorColor", "Ljava/lang/Integer;", "getSeparatorColor", "()Ljava/lang/Integer;", "setSeparatorColor", "(Ljava/lang/Integer;)V", "Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "getAxis", "()Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "axis", "getAddonSide", "addonSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;", "getAlignment", "()Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;", "alignment", "getGap", "gap", "getLayoutPaddingTop", "layoutPaddingTop", "getLayoutPaddingBottom", "layoutPaddingBottom", "getLayoutPaddingStart", "layoutPaddingStart", "getLayoutPaddingEnd", "layoutPaddingEnd", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "getMainPaddings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "mainPaddings", "getAddonPaddings", "addonPaddings", "getMainView", "mainView", "getAddonView", "addonView", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MainAddonWrapperV3<MV extends View, AV extends View> extends ConstraintLayout implements MainAddonViewApi {

    @NotNull
    private final d constraintSet;

    @NotNull
    private final MainAddonSettings defMainAddonSettings;
    private final int defaultSeparatorColor;
    private final View endSeparatorAnchorView;

    @NotNull
    private final AddonSide endSeparatorAnchorViewSide;
    private boolean hasSeparator;

    /* renamed from: horizontalSeparatorView$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j horizontalSeparatorView;
    private final boolean isRootWrapper;
    private int layoutWidth;

    @NotNull
    private MainAddonSettings mainAddonSettings;
    private int minWrapperHeight;
    private int onLayoutCounter;
    private int onMeasureCounter;

    @NotNull
    private final LinkedHashMap<Integer, Flow> rootWrapperViewIdsFlows;

    @NotNull
    private final LinkedList<View> rootWrapperViews;
    private Integer separatorColor;
    private final View startSeparatorAnchorView;

    @NotNull
    private final AddonSide startSeparatorAnchorViewSide;

    @NotNull
    private final LinkedHashMap<Integer, Flow> viewIdsFlows;

    @NotNull
    private final LinkedList<View> views;
    public static final int $stable = 8;
    private static final float BIAS_MAX = 1.0f;
    private static final int SEPARATOR_HEIGHT = UiExtKt.toPx(1);

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

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
                iArr2[Alignment.TRAILING.ordinal()] = 3;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[Alignment.CENTER.ordinal()] = 4;
            } catch (NoSuchFieldError unused6) {
            }
            try {
                iArr2[Alignment.FIRST_BASELINE.ordinal()] = 5;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr2[Alignment.LAST_BASELINE.ordinal()] = 6;
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
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainAddonWrapperV3(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull MainAddonSettings defMainAddonSettings, boolean z11) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defMainAddonSettings, "defMainAddonSettings");
        this.defMainAddonSettings = defMainAddonSettings;
        this.isRootWrapper = z11;
        this.viewIdsFlows = new LinkedHashMap<>();
        this.views = new LinkedList<>();
        this.rootWrapperViewIdsFlows = new LinkedHashMap<>();
        this.rootWrapperViews = new LinkedList<>();
        this.mainAddonSettings = defMainAddonSettings;
        this.horizontalSeparatorView = k.b(new MainAddonWrapperV3$horizontalSeparatorView$2(context));
        int color = a.getColor(context, R$color.graphic_neutral);
        this.defaultSeparatorColor = color;
        this.constraintSet = new d();
        this.startSeparatorAnchorViewSide = AddonSide.START;
        this.endSeparatorAnchorViewSide = AddonSide.END;
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MainAddonWrapperV3);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.layoutWidth = obtainStyledAttributes.getLayoutDimension(R$styleable.MainAddonWrapperV3_android_layout_width, -2);
        setLayoutTransition(null);
        obtainStyledAttributes.recycle();
        this.separatorColor = Integer.valueOf(color);
    }

    private final void addFlows() {
        Collection<Flow> values = this.viewIdsFlows.values();
        Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
        Iterator it = C7714v.z0(C7714v.Y0(values)).iterator();
        while (it.hasNext()) {
            addView((Flow) it.next());
        }
    }

    private final void addViewVirtual(List<View> views, View view) {
        views.add(view);
    }

    private final void addViews() {
        if (getIsRootWrapper()) {
            int i11 = 0;
            for (Object obj : this.views) {
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                addView((View) obj);
                i11 = i12;
            }
        }
    }

    private final void addViewsVirtual(List<View> views) {
        addViewVirtual(views, getAddonView());
        if (!(getMainView() instanceof MainAddonWrapperV3)) {
            addViewVirtual(views, getMainView());
            return;
        }
        MV mainView = getMainView();
        Intrinsics.g(mainView, "null cannot be cast to non-null type ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3<out android.view.View, out android.view.View>");
        ((MainAddonWrapperV3) mainView).addViewsVirtual(views);
    }

    private final void applyConstraints() {
        this.constraintSet.f(this);
    }

    private final void callOnConstraintsAndViewsAndFlowsCollectedCallback() {
        if (getIsRootWrapper()) {
            onConstraintsCollected$uni_release(this.constraintSet);
        }
    }

    private final void clearConstraints() {
        if (getIsRootWrapper()) {
            Iterator<View> it = C5316f0.b(this).iterator();
            while (true) {
                C5314e0 c5314e0 = (C5314e0) it;
                if (!c5314e0.hasNext()) {
                    break;
                }
                this.constraintSet.n(((View) c5314e0.next()).getId());
            }
            Collection<Flow> values = this.viewIdsFlows.values();
            Intrinsics.checkNotNullExpressionValue(values, "<get-values>(...)");
            for (Flow flow : values) {
                this.constraintSet.n(flow.getId());
                removeView(flow);
            }
            this.constraintSet.n(getId());
            this.viewIdsFlows.clear();
        }
    }

    private final void collectConstraints() {
        if (getIsRootWrapper()) {
            collectFlow(this.viewIdsFlows, this.constraintSet, null);
            collectSeparatorConstraints(this.constraintSet, getHorizontalSeparatorView(), getStartSeparatorAnchorView(), getStartSeparatorAnchorViewSide(), getEndSeparatorAnchorView(), getEndSeparatorAnchorViewSide());
        }
    }

    private final void collectRootWrapperViewsAndFlows() {
        if (getIsRootWrapper()) {
            setRootWrapperViewsAndFlows(this.viewIdsFlows, this.views);
        }
    }

    private final void collectSeparatorConstraints(d constraintSet, View separatorView, View startAnchorView, AddonSide startAnchorViewSide, View endAnchorView, AddonSide endAnchorViewSide) {
        addHorizontalSeparatorConstraints(constraintSet, separatorView, startAnchorView, startAnchorViewSide, endAnchorView, endAnchorViewSide);
    }

    private final void collectViews() {
        if (getIsRootWrapper()) {
            addViewsVirtual(this.views);
            addViewVirtual(this.views, getHorizontalSeparatorView());
        }
    }

    private final View getHorizontalSeparatorView() {
        return (View) this.horizontalSeparatorView.getValue();
    }

    private final void initViewParams() {
        AV addonView = getAddonView();
        if (addonView.getId() == -1) {
            addonView.setId(View.generateViewId());
        }
        MV mainView = getMainView();
        if (mainView.getId() == -1) {
            mainView.setId(View.generateViewId());
        }
        View horizontalSeparatorView = getHorizontalSeparatorView();
        if (horizontalSeparatorView.getId() == -1) {
            horizontalSeparatorView.setId(View.generateViewId());
        }
    }

    private final void setRootWrapperViewsAndFlows(LinkedHashMap<Integer, Flow> flows, LinkedList<View> views) {
        this.rootWrapperViewIdsFlows.clear();
        this.rootWrapperViewIdsFlows.putAll(flows);
        this.rootWrapperViews.clear();
        this.rootWrapperViews.addAll(views);
        if (getMainView() instanceof MainAddonWrapperV3) {
            MV mainView = getMainView();
            Intrinsics.g(mainView, "null cannot be cast to non-null type ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3<out android.view.View, out android.view.View>");
            ((MainAddonWrapperV3) mainView).setRootWrapperViewsAndFlows(flows, views);
        }
    }

    @NotNull
    protected d addHorizontalSeparatorConstraints(@NotNull d constraintSet, @NotNull View separatorView, View startAnchorView, @NotNull AddonSide startAnchorViewSide, View endAnchorView, @NotNull AddonSide endAnchorViewSide) {
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(separatorView, "separatorView");
        Intrinsics.checkNotNullParameter(startAnchorViewSide, "startAnchorViewSide");
        Intrinsics.checkNotNullParameter(endAnchorViewSide, "endAnchorViewSide");
        constraintSet.A(separatorView.getId(), 0);
        constraintSet.w(separatorView.getId(), SEPARATOR_HEIGHT);
        int[] iArr = WhenMappings.$EnumSwitchMapping$2;
        int i11 = iArr[startAnchorViewSide.ordinal()];
        if (i11 == 1) {
            if (startAnchorView == null) {
                startAnchorView = this;
            }
            ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, separatorView, startAnchorView);
        } else {
            if (i11 != 2) {
                throw new o();
            }
            if (startAnchorView == null) {
                startAnchorView = this;
            }
            ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, separatorView, startAnchorView);
        }
        constraintSet.e0(separatorView.getId(), 6, UiExtKt.toPx(getLayoutPaddingStart()));
        int i12 = iArr[endAnchorViewSide.ordinal()];
        if (i12 == 1) {
            if (endAnchorView == null) {
                endAnchorView = this;
            }
            ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, separatorView, endAnchorView);
        } else {
            if (i12 != 2) {
                throw new o();
            }
            if (endAnchorView == null) {
                endAnchorView = this;
            }
            ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, separatorView, endAnchorView);
        }
        constraintSet.e0(separatorView.getId(), 7, UiExtKt.toPx(getLayoutPaddingEnd()));
        ConstraintSetExtKt.layoutConstraintTopToTopOf(constraintSet, separatorView, this);
        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(constraintSet, separatorView, this);
        constraintSet.f0(BIAS_MAX, separatorView.getId());
        return constraintSet;
    }

    public final void changeAddonVisibilityIfNeeded() {
        setAddonVisibility$uni_release();
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    protected void collectFlow(@NotNull LinkedHashMap<Integer, Flow> flows, @NotNull d constraintSet, Flow wrappingFlow) {
        Flow flow;
        int i11;
        int[] iArr;
        int i12;
        int[] iArr2;
        int i13;
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
        int[] iArr3 = WhenMappings.$EnumSwitchMapping$0;
        int i14 = iArr3[axis.ordinal()];
        if (i14 == 1) {
            i11 = 1;
        } else {
            if (i14 != 2) {
                throw new o();
            }
            i11 = 0;
        }
        flow.setOrientation(i11);
        constraintSet.A(flow.getId(), 0);
        constraintSet.w(flow.getId(), -2);
        if (getIsRootWrapper()) {
            constraintSet.x(flow.getId(), UiExtKt.toPx(this.minWrapperHeight));
        }
        flow.setPaddingLeft(UiExtKt.toPx(getLayoutPaddingStart()));
        flow.setPaddingTop(UiExtKt.toPx(getLayoutPaddingTop()));
        flow.setPaddingRight(UiExtKt.toPx(getLayoutPaddingEnd()));
        flow.setPaddingBottom(UiExtKt.toPx(getLayoutPaddingBottom()));
        Flow flow2 = new Flow(getContext());
        if (flow2.getId() == -1) {
            flow2.setId(View.generateViewId());
        }
        LayoutPadding.padding layoutPadding = getAddonPaddings().toLayoutPadding(getAxis());
        flow2.setPaddingLeft(UiExtKt.toPx(layoutPadding.getStart()));
        flow2.setPaddingTop(UiExtKt.toPx(layoutPadding.getTop()));
        flow2.setPaddingRight(UiExtKt.toPx(layoutPadding.getEnd()));
        flow2.setPaddingBottom(UiExtKt.toPx(layoutPadding.getBottom()));
        flow2.setReferencedIds(new int[]{getAddonView().getId()});
        float f7 = 0.0f;
        if (getMainView() instanceof MainAddonWrapperV3) {
            int i15 = iArr3[getAxis().ordinal()];
            if (i15 == 1) {
                switch (WhenMappings.$EnumSwitchMapping$1[getAlignment().ordinal()]) {
                    case 1:
                    case 2:
                    case 5:
                    case 6:
                        flow2.setHorizontalBias(f7);
                        flow.setVerticalGap(UiExtKt.toPx(getGap()));
                        break;
                    case 3:
                        f7 = 1.0f;
                        flow2.setHorizontalBias(f7);
                        flow.setVerticalGap(UiExtKt.toPx(getGap()));
                        break;
                    case 4:
                        f7 = 0.5f;
                        flow2.setHorizontalBias(f7);
                        flow.setVerticalGap(UiExtKt.toPx(getGap()));
                        break;
                    default:
                        throw new o();
                }
            } else {
                if (i15 != 2) {
                    throw new o();
                }
                switch (WhenMappings.$EnumSwitchMapping$1[getAlignment().ordinal()]) {
                    case 1:
                    case 2:
                        i13 = 0;
                        break;
                    case 3:
                        i13 = 1;
                        break;
                    case 4:
                        i13 = 2;
                        break;
                    case 5:
                    case 6:
                        i13 = 3;
                        break;
                    default:
                        throw new o();
                }
                flow.setVerticalAlign(i13);
                flow.setHorizontalGap(UiExtKt.toPx(getGap()));
            }
            constraintSet.A(getAddonView().getId(), -2);
            constraintSet.w(getAddonView().getId(), -2);
            int i16 = iArr3[getAxis().ordinal()];
            if (i16 == 1) {
                constraintSet.A(flow2.getId(), 0);
                constraintSet.w(flow2.getId(), -2);
            } else {
                if (i16 != 2) {
                    throw new o();
                }
                constraintSet.A(flow2.getId(), -2);
                constraintSet.w(flow2.getId(), -2);
            }
            Flow flow3 = new Flow(getContext());
            if (flow3.getId() == -1) {
                flow3.setId(View.generateViewId());
            }
            int i17 = WhenMappings.$EnumSwitchMapping$2[getAddonSide().ordinal()];
            if (i17 == 1) {
                iArr2 = new int[]{flow2.getId(), flow3.getId()};
            } else {
                if (i17 != 2) {
                    throw new o();
                }
                iArr2 = new int[]{flow3.getId(), flow2.getId()};
            }
            flow.setReferencedIds(iArr2);
            flows.put(Integer.valueOf(getAddonView().getId()), flow2);
            flows.put(Integer.valueOf(flow2.getId()), flow);
            flows.put(Integer.valueOf(flow3.getId()), flow);
            MV mainView = getMainView();
            Intrinsics.g(mainView, "null cannot be cast to non-null type ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3<out android.view.View, out android.view.View>");
            ((MainAddonWrapperV3) mainView).collectFlow(flows, constraintSet, flow3);
            LayoutPadding.padding layoutPadding2 = getMainPaddings().toLayoutPadding(getAxis());
            MV mainView2 = getMainView();
            Intrinsics.g(mainView2, "null cannot be cast to non-null type ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3<out android.view.View, out android.view.View>");
            LayoutPadding padding = ((MainAddonWrapperV3) mainView2).mainAddonSettings.getPadding();
            flow3.setPaddingLeft(UiExtKt.toPx(layoutPadding2.getStart() + padding.getStart()));
            flow3.setPaddingTop(UiExtKt.toPx(layoutPadding2.getTop() + padding.getTop()));
            flow3.setPaddingRight(UiExtKt.toPx(layoutPadding2.getEnd() + padding.getEnd()));
            flow3.setPaddingBottom(UiExtKt.toPx(layoutPadding2.getBottom() + padding.getBottom()));
            return;
        }
        Flow flow4 = new Flow(getContext());
        if (flow4.getId() == -1) {
            flow4.setId(View.generateViewId());
        }
        LayoutPadding.padding layoutPadding3 = getMainPaddings().toLayoutPadding(getAxis());
        flow4.setPaddingLeft(UiExtKt.toPx(layoutPadding3.getStart()));
        flow4.setPaddingTop(UiExtKt.toPx(layoutPadding3.getTop()));
        flow4.setPaddingRight(UiExtKt.toPx(layoutPadding3.getEnd()));
        flow4.setPaddingBottom(UiExtKt.toPx(layoutPadding3.getBottom()));
        flow4.setReferencedIds(new int[]{getMainView().getId()});
        flow4.setWrapMode(1);
        int i18 = iArr3[getAxis().ordinal()];
        if (i18 == 1) {
            switch (WhenMappings.$EnumSwitchMapping$1[getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 6:
                    flow2.setHorizontalBias(f7);
                    flow4.setHorizontalBias(f7);
                    flow.setVerticalGap(UiExtKt.toPx(getGap()));
                    break;
                case 3:
                    f7 = 1.0f;
                    flow2.setHorizontalBias(f7);
                    flow4.setHorizontalBias(f7);
                    flow.setVerticalGap(UiExtKt.toPx(getGap()));
                    break;
                case 4:
                    f7 = 0.5f;
                    flow2.setHorizontalBias(f7);
                    flow4.setHorizontalBias(f7);
                    flow.setVerticalGap(UiExtKt.toPx(getGap()));
                    break;
                default:
                    throw new o();
            }
        } else {
            if (i18 != 2) {
                throw new o();
            }
            switch (WhenMappings.$EnumSwitchMapping$1[getAlignment().ordinal()]) {
                case 1:
                case 2:
                case 5:
                case 6:
                    i12 = 0;
                    break;
                case 3:
                    i12 = 1;
                    break;
                case 4:
                    i12 = 2;
                    break;
                default:
                    throw new o();
            }
            flow.setVerticalAlign(i12);
            flow.setHorizontalGap(UiExtKt.toPx(getGap()));
        }
        flow.setVerticalStyle(2);
        flow2.setWrapMode(1);
        constraintSet.v(getMainView().getId(), 1);
        constraintSet.w(getMainView().getId(), -2);
        constraintSet.C(getMainView().getId(), true);
        constraintSet.B(getMainView().getId());
        constraintSet.v(getAddonView().getId(), 1);
        constraintSet.w(getAddonView().getId(), -2);
        constraintSet.C(getAddonView().getId(), true);
        constraintSet.B(getAddonView().getId());
        constraintSet.A(flow2.getId(), 0);
        constraintSet.w(flow2.getId(), -2);
        constraintSet.A(flow4.getId(), 0);
        constraintSet.w(flow4.getId(), -2);
        int i19 = WhenMappings.$EnumSwitchMapping$2[getAddonSide().ordinal()];
        if (i19 == 1) {
            iArr = new int[]{flow2.getId(), flow4.getId()};
        } else {
            if (i19 != 2) {
                throw new o();
            }
            iArr = new int[]{flow4.getId(), flow2.getId()};
        }
        flow.setReferencedIds(iArr);
        flows.put(Integer.valueOf(getAddonView().getId()), flow2);
        flows.put(Integer.valueOf(getMainView().getId()), flow4);
        flows.put(Integer.valueOf(flow2.getId()), flow);
        flows.put(Integer.valueOf(flow4.getId()), flow);
    }

    @NotNull
    protected final ContentAxisRelatedPadding getAddonPaddings() {
        return this.mainAddonSettings.getAddonPadding();
    }

    @NotNull
    protected final AddonSide getAddonSide() {
        return this.mainAddonSettings.getAddonSide();
    }

    @NotNull
    protected abstract AV getAddonView();

    @NotNull
    protected final Alignment getAlignment() {
        return this.mainAddonSettings.getAlignment();
    }

    @NotNull
    protected final Axis getAxis() {
        return this.mainAddonSettings.getAxis();
    }

    protected View getEndSeparatorAnchorView() {
        return this.endSeparatorAnchorView;
    }

    @NotNull
    protected AddonSide getEndSeparatorAnchorViewSide() {
        return this.endSeparatorAnchorViewSide;
    }

    protected final Flow getFlowByViewId(int viewId) {
        return this.rootWrapperViewIdsFlows.get(Integer.valueOf(viewId));
    }

    protected final int getGap() {
        return this.mainAddonSettings.getGap();
    }

    public boolean getHasSeparator() {
        return this.hasSeparator;
    }

    protected final int getLayoutPaddingBottom() {
        return this.mainAddonSettings.getPadding().getBottom();
    }

    protected final int getLayoutPaddingEnd() {
        return this.mainAddonSettings.getPadding().getEnd();
    }

    protected final int getLayoutPaddingStart() {
        return this.mainAddonSettings.getPadding().getStart();
    }

    protected final int getLayoutPaddingTop() {
        return this.mainAddonSettings.getPadding().getTop();
    }

    @NotNull
    public final MainAddonSettings getMainAddonSettings() {
        return this.mainAddonSettings;
    }

    @NotNull
    protected final ContentAxisRelatedPadding getMainPaddings() {
        return this.mainAddonSettings.getMainPadding();
    }

    @NotNull
    protected abstract MV getMainView();

    protected final int getMinWrapperHeight() {
        return this.minWrapperHeight;
    }

    public Integer getSeparatorColor() {
        return this.separatorColor;
    }

    protected View getStartSeparatorAnchorView() {
        return this.startSeparatorAnchorView;
    }

    @NotNull
    protected AddonSide getStartSeparatorAnchorViewSide() {
        return this.startSeparatorAnchorViewSide;
    }

    /* renamed from: isRootWrapper, reason: from getter */
    public boolean getIsRootWrapper() {
        return this.isRootWrapper;
    }

    public void onConstraintsCollected$uni_release(@NotNull d constraintSet) {
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        if (getMainView() instanceof MainAddonWrapperV3) {
            MV mainView = getMainView();
            Intrinsics.g(mainView, "null cannot be cast to non-null type ru.ozon.uni.android.wrappers.mainaddonV3.MainAddonWrapperV3<out android.view.View, out android.view.View>");
            ((MainAddonWrapperV3) mainView).onConstraintsCollected$uni_release(constraintSet);
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.ViewGroup, android.view.View
    protected void onLayout(boolean changed, int left, int top, int right, int bottom) {
        super.onLayout(changed, left, top, right, bottom);
        this.onLayoutCounter++;
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        super.onMeasure(widthMeasureSpec, heightMeasureSpec);
        this.onMeasureCounter++;
    }

    protected final void resetViews() {
        clearConstraints();
        collectConstraints();
        collectRootWrapperViewsAndFlows();
        callOnConstraintsAndViewsAndFlowsCollectedCallback();
        addFlows();
        applyConstraints();
    }

    public void setAddonVisibility$uni_release() {
    }

    /* renamed from: setCellPaddingLeft-nOKZfEA, reason: not valid java name */
    public void m1862setCellPaddingLeftnOKZfEA(int left) {
        if (getIsRootWrapper()) {
            setPadding(getResources().getDimensionPixelSize(left), getPaddingTop(), getPaddingRight(), getPaddingBottom());
        }
    }

    /* renamed from: setCellPaddingRight-nOKZfEA, reason: not valid java name */
    public void m1863setCellPaddingRightnOKZfEA(int right) {
        if (getIsRootWrapper()) {
            setPadding(getPaddingLeft(), getPaddingTop(), getResources().getDimensionPixelSize(right), getPaddingBottom());
        }
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonViewApi
    public void setHasSeparator(boolean z11) {
        this.hasSeparator = z11;
        if (!z11) {
            this.constraintSet.h0(getHorizontalSeparatorView().getId(), 4);
            getHorizontalSeparatorView().setVisibility(4);
        } else {
            this.constraintSet.h0(getHorizontalSeparatorView().getId(), 0);
            getHorizontalSeparatorView().setVisibility(0);
            setSeparatorColor(getSeparatorColor());
        }
    }

    public final void setMainAddonSettings(@NotNull MainAddonSettings value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mainAddonSettings = value;
        resetViews();
    }

    protected final void setMinWrapperHeight(int i11) {
        this.minWrapperHeight = i11;
    }

    public void setSeparatorColor(Integer num) {
        this.separatorColor = num;
        if (getHasSeparator()) {
            View horizontalSeparatorView = getHorizontalSeparatorView();
            Integer num2 = this.separatorColor;
            horizontalSeparatorView.setBackgroundColor(num2 != null ? num2.intValue() : this.defaultSeparatorColor);
        }
    }

    protected final void setViews() {
        initViewParams();
        collectViews();
        collectConstraints();
        collectRootWrapperViewsAndFlows();
        callOnConstraintsAndViewsAndFlowsCollectedCallback();
        addViews();
        addFlows();
        applyConstraints();
    }
}
