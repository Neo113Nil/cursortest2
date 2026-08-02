package ru.ozon.uni.android.wrappers.mainaddon2;

import B0.C2454a;
import Sc.InterfaceC3999a;
import Sc.o;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import androidx.constraintlayout.helper.widget.Flow;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import androidx.core.view.C5314e0;
import androidx.core.view.C5316f0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
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
@Metadata(d1 = {"\u0000\u008a\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010!\n\u0002\b=\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0018\u0002\n\u0002\b\b\b'\u0018\u0000 ±\u0001*\b\b\u0000\u0010\u0002*\u00020\u0001*\b\b\u0001\u0010\u0003*\u00020\u00012\u00020\u00042\u00020\u0005:\u0004±\u0001²\u0001BC\b\u0007\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\u001f\u0010\u0016\u001a\u00020\u00152\u0006\u0010\u0013\u001a\u00020\n2\u0006\u0010\u0014\u001a\u00020\nH\u0014¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010\u001d\u001a\u00020\u00152\u0006\u0010\u0018\u001a\u00020\u000f2\u0006\u0010\u0019\u001a\u00020\n2\u0006\u0010\u001a\u001a\u00020\n2\u0006\u0010\u001b\u001a\u00020\n2\u0006\u0010\u001c\u001a\u00020\nH\u0014¢\u0006\u0004\b\u001d\u0010\u001eJ\u000f\u0010\u001f\u001a\u00020\u0015H\u0004¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0015H\u0014¢\u0006\u0004\b!\u0010 J\u000f\u0010#\u001a\u00020\u0015H\u0000¢\u0006\u0004\b\"\u0010 J\u0081\u0001\u00107\u001a\u00020%2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010-\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u000202H\u0014¢\u0006\u0004\b7\u00108J\u0083\u0001\u0010;\u001a\u00020%2\u0006\u0010$\u001a\u00020\u00042\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)2\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010-\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00109\u001a\u00020\u00012\b\b\u0002\u0010:\u001a\u00020\n2\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u000200H\u0014¢\u0006\u0004\b;\u0010<JC\u0010B\u001a\u00020%2\u0006\u0010&\u001a\u00020%2\u0006\u0010=\u001a\u00020\u00012\b\u0010>\u001a\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020.2\b\u0010@\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020.H\u0014¢\u0006\u0004\bB\u0010CJ\u000f\u0010D\u001a\u00020\u0015H\u0002¢\u0006\u0004\bD\u0010 J\u000f\u0010E\u001a\u00020\u0015H\u0002¢\u0006\u0004\bE\u0010 J\u000f\u0010F\u001a\u00020\u0015H\u0002¢\u0006\u0004\bF\u0010 J\u000f\u0010G\u001a\u00020\u0015H\u0002¢\u0006\u0004\bG\u0010 J\u001d\u0010J\u001a\u00020\u00152\f\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00010HH\u0002¢\u0006\u0004\bJ\u0010KJ%\u0010N\u001a\u00020\u00152\f\u0010L\u001a\b\u0012\u0004\u0012\u00020\u00010H2\u0006\u0010M\u001a\u00020\u0001H\u0002¢\u0006\u0004\bN\u0010OJ\u000f\u0010P\u001a\u00020\u0015H\u0002¢\u0006\u0004\bP\u0010 J\u0081\u0001\u0010Q\u001a\u00020\u00152\u0006\u0010$\u001a\u00020\u00042\n\b\u0002\u0010,\u001a\u0004\u0018\u00010\u00012\b\b\u0002\u0010-\u001a\u00020\n2\u0006\u0010/\u001a\u00020.2\u0006\u00101\u001a\u0002002\u0006\u00103\u001a\u0002022\u0006\u00104\u001a\u00020.2\u0006\u00105\u001a\u0002002\u0006\u00106\u001a\u0002022\u0006\u0010&\u001a\u00020%2\u0006\u0010(\u001a\u00020'2\u0012\u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)H\u0002¢\u0006\u0004\bQ\u0010RJC\u0010S\u001a\u00020\u00152\u0006\u0010&\u001a\u00020%2\u0006\u0010=\u001a\u00020\u00012\b\u0010>\u001a\u0004\u0018\u00010\u00012\u0006\u0010?\u001a\u00020.2\b\u0010@\u001a\u0004\u0018\u00010\u00012\u0006\u0010A\u001a\u00020.H\u0002¢\u0006\u0004\bS\u0010TJ\u000f\u0010U\u001a\u00020\u0015H\u0002¢\u0006\u0004\bU\u0010 R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010V\u001a\u0004\bW\u0010XR\u001a\u0010\u0010\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0010\u0010Y\u001a\u0004\b\u0010\u0010ZR\"\u0010[\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\b[\u0010\\\u001a\u0004\b]\u0010^\"\u0004\b_\u0010`R\"\u0010a\u001a\u00020\n8\u0004@\u0004X\u0084\u000e¢\u0006\u0012\n\u0004\ba\u0010\\\u001a\u0004\bb\u0010^\"\u0004\bc\u0010`R*\u0010e\u001a\u00020\r2\u0006\u0010d\u001a\u00020\r8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\be\u0010V\u001a\u0004\bf\u0010X\"\u0004\bg\u0010hR\u0014\u0010i\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bi\u0010\\R\u0014\u0010j\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bj\u0010kR\u0014\u0010&\u001a\u00020%8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b&\u0010lR\u0014\u0010(\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010mR\u001a\u0010I\u001a\b\u0012\u0004\u0012\u00020\u00010H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010nR \u0010+\u001a\u000e\u0012\u0004\u0012\u00020\n\u0012\u0004\u0012\u00020*0)8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b+\u0010oR\u0016\u0010p\u001a\u00020\n8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bp\u0010\\R\u001c\u0010q\u001a\u0004\u0018\u00010\u00018\u0014X\u0094\u0004¢\u0006\f\n\u0004\bq\u0010k\u001a\u0004\br\u0010sR\u001a\u0010t\u001a\u00020.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bt\u0010u\u001a\u0004\bv\u0010wR\u001c\u0010x\u001a\u0004\u0018\u00010\u00018\u0014X\u0094\u0004¢\u0006\f\n\u0004\bx\u0010k\u001a\u0004\by\u0010sR\u001a\u0010z\u001a\u00020.8\u0014X\u0094\u0004¢\u0006\f\n\u0004\bz\u0010u\u001a\u0004\b{\u0010wR*\u0010|\u001a\u00020\u000f2\u0006\u0010d\u001a\u00020\u000f8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\b|\u0010Y\u001a\u0004\b}\u0010Z\"\u0004\b~\u0010\u007fR5\u0010\u0080\u0001\u001a\u0004\u0018\u00010\n2\b\u0010d\u001a\u0004\u0018\u00010\n8\u0016@VX\u0097\u000e¢\u0006\u0018\n\u0006\b\u0080\u0001\u0010\u0081\u0001\u001a\u0006\b\u0082\u0001\u0010\u0083\u0001\"\u0006\b\u0084\u0001\u0010\u0085\u0001R2\u0010\u0087\u0001\u001a\u000b\u0012\u0004\u0012\u00020\u0015\u0018\u00010\u0086\u00018\u0010@\u0010X\u0090\u000e¢\u0006\u0018\n\u0006\b\u0087\u0001\u0010\u0088\u0001\u001a\u0006\b\u0089\u0001\u0010\u008a\u0001\"\u0006\b\u008b\u0001\u0010\u008c\u0001R\u0016\u0010\u008e\u0001\u001a\u00028\u00008$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u008d\u0001\u0010sR\u0015\u00109\u001a\u00028\u00018$X¤\u0004¢\u0006\u0007\u001a\u0005\b\u008f\u0001\u0010sR\u0017\u0010\u0092\u0001\u001a\u0002008BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0090\u0001\u0010\u0091\u0001R\u0015\u00104\u001a\u00020.8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u0093\u0001\u0010wR\u0018\u0010\u0097\u0001\u001a\u00030\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0095\u0001\u0010\u0096\u0001R\u001a\u0010\u0099\u0001\u001a\u0005\u0018\u00010\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u0098\u0001\u0010\u0096\u0001R\u001a\u0010\u009b\u0001\u001a\u0005\u0018\u00010\u0094\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b\u009a\u0001\u0010\u0096\u0001R\u0016\u0010\u009d\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009c\u0001\u0010^R\u0016\u0010\u009f\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b\u009e\u0001\u0010^R\u0017\u0010¢\u0001\u001a\u0002028BX\u0082\u0004¢\u0006\b\u001a\u0006\b \u0001\u0010¡\u0001R\u0016\u0010¤\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b£\u0001\u0010^R\u0016\u0010¦\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b¥\u0001\u0010^R\u0016\u0010¨\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b§\u0001\u0010^R\u0016\u0010ª\u0001\u001a\u00020\n8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b©\u0001\u0010^R\u0018\u0010®\u0001\u001a\u00030«\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¬\u0001\u0010\u00ad\u0001R\u0018\u0010°\u0001\u001a\u00030«\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¯\u0001\u0010\u00ad\u0001¨\u0006³\u0001"}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2;", "Landroid/view/View;", "MV", "AV", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonViewApi;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "defMainAddonSettings", "", "isRootWrapper", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;IILru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;Z)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "changed", "left", "top", "right", "bottom", "onLayout", "(ZIIII)V", "setViews", "()V", "onViewConstraintsCollected", "applyConstraints$uni_release", "applyConstraints", "parent", "Landroidx/constraintlayout/widget/d;", "constraintSet", "Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints;", "constraints", "", "Landroidx/constraintlayout/helper/widget/Flow;", "flows", "anchorAddonView", "anchorAddonViewGap", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "anchorAddonSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "anchorAddonAxis", "Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "anchorAddonLayoutPaddings", "addonSide", "addonAxis", "addonLayoutPaddings", "addAddonConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/d;Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints;Ljava/util/Map;Landroid/view/View;ILru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;)Landroidx/constraintlayout/widget/d;", "addonView", "addonGap", "addMainConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroidx/constraintlayout/widget/d;Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints;Ljava/util/Map;Landroid/view/View;ILru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;Landroid/view/View;ILru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;)Landroidx/constraintlayout/widget/d;", "separatorView", "startAnchorView", "startAnchorViewSide", "endAnchorView", "endAnchorViewSide", "addHorizontalSeparatorConstraints", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;Landroid/view/View;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Landroid/view/View;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;)Landroidx/constraintlayout/widget/d;", "resetViews", "clearConstraints", "initViewParams", "collectViews", "", "views", "addViewsVirtual", "(Ljava/util/List;)V", "vies", "view", "addViewVirtual", "(Ljava/util/List;Landroid/view/View;)V", "collectConstraints", "collectViewConstraints", "(Landroidx/constraintlayout/widget/ConstraintLayout;Landroid/view/View;ILru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;Landroidx/constraintlayout/widget/d;Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints;Ljava/util/Map;)V", "collectSeparatorConstraints", "(Landroidx/constraintlayout/widget/d;Landroid/view/View;Landroid/view/View;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;Landroid/view/View;Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;)V", "addViews", "Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "getDefMainAddonSettings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;", "Z", "()Z", "onMeasureCounter", "I", "getOnMeasureCounter", "()I", "setOnMeasureCounter", "(I)V", "onLayoutCounter", "getOnLayoutCounter", "setOnLayoutCounter", AppMeasurementSdk.ConditionalUserProperty.VALUE, "mainAddonSettings", "getMainAddonSettings", "setMainAddonSettings", "(Lru/ozon/uni/android/wrappers/mainaddon/data/MainAddonSettings;)V", "defaultSeparatorColor", "horizontalSeparatorView", "Landroid/view/View;", "Landroidx/constraintlayout/widget/d;", "Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints;", "Ljava/util/List;", "Ljava/util/Map;", "layoutWidth", "startSeparatorAnchorView", "getStartSeparatorAnchorView", "()Landroid/view/View;", "startSeparatorAnchorViewSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "getStartSeparatorAnchorViewSide", "()Lru/ozon/uni/android/wrappers/mainaddon/data/AddonSide;", "endSeparatorAnchorView", "getEndSeparatorAnchorView", "endSeparatorAnchorViewSide", "getEndSeparatorAnchorViewSide", "hasSeparator", "getHasSeparator", "setHasSeparator", "(Z)V", "separatorColor", "Ljava/lang/Integer;", "getSeparatorColor", "()Ljava/lang/Integer;", "setSeparatorColor", "(Ljava/lang/Integer;)V", "Lkotlin/Function0;", "onViewCollectedCallback", "Lkotlin/jvm/functions/Function0;", "getOnViewCollectedCallback$uni_release", "()Lkotlin/jvm/functions/Function0;", "setOnViewCollectedCallback$uni_release", "(Lkotlin/jvm/functions/Function0;)V", "getMainView", "mainView", "getAddonView", "getAxis", "()Lru/ozon/uni/android/wrappers/mainaddon/data/Axis;", "axis", "getAddonSide", "Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;", "getAlignment", "()Lru/ozon/uni/android/wrappers/mainaddon/data/Alignment;", "alignment", "getMainAlignment", "mainAlignment", "getAddonAlignment", "addonAlignment", "getGap", "gap", "getMinWrapperHeight", "minWrapperHeight", "getLayoutPaddings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/LayoutPadding;", "layoutPaddings", "getLayoutPaddingTop", "layoutPaddingTop", "getLayoutPaddingBottom", "layoutPaddingBottom", "getLayoutPaddingStart", "layoutPaddingStart", "getLayoutPaddingEnd", "layoutPaddingEnd", "Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "getMainPaddings", "()Lru/ozon/uni/android/wrappers/mainaddon/data/ContentAxisRelatedPadding;", "mainPaddings", "getAddonPaddings", "addonPaddings", "Companion", "Constraints", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public abstract class MainAddonWrapper2<MV extends View, AV extends View> extends ConstraintLayout implements MainAddonViewApi {
    private static final float BIAS_MIN = 0.0f;

    @NotNull
    private final d constraintSet;

    @NotNull
    private final Constraints constraints;

    @NotNull
    private final MainAddonSettings defMainAddonSettings;
    private final int defaultSeparatorColor;
    private final View endSeparatorAnchorView;

    @NotNull
    private final AddonSide endSeparatorAnchorViewSide;

    @NotNull
    private final Map<Integer, Flow> flows;
    private boolean hasSeparator;

    @NotNull
    private final View horizontalSeparatorView;
    private final boolean isRootWrapper;
    private int layoutWidth;

    @NotNull
    private MainAddonSettings mainAddonSettings;
    private int onLayoutCounter;
    private int onMeasureCounter;
    private Function0<Unit> onViewCollectedCallback;
    private Integer separatorColor;
    private final View startSeparatorAnchorView;

    @NotNull
    private final AddonSide startSeparatorAnchorViewSide;

    @NotNull
    private final List<View> views;
    public static final int $stable = 8;
    private static final float BIAS_HALF = 0.5f;
    private static final float BIAS_MAX = 1.0f;
    private static final int SEPARATOR_HEIGHT = UiExtKt.toPx(1);

    @Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0084\b\u0018\u00002\u00020\u0001:\u0001!B/\u0012\b\b\u0002\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\r\u0010\n\u001a\u00020\t¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\"\u0010\u0003\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018\"\u0004\b\u0019\u0010\u001aR\"\u0010\u0004\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u001b\u0010\u0018\"\u0004\b\u001c\u0010\u001aR\"\u0010\u0005\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u001d\u0010\u0018\"\u0004\b\u001e\u0010\u001aR\"\u0010\u0006\u001a\u00020\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u001f\u0010\u0018\"\u0004\b \u0010\u001a¨\u0006\""}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints;", "", "Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;", "start", "top", "end", "bottom", "<init>", "(Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;)V", "", "clear", "()V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;", "getStart", "()Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;", "setStart", "(Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;)V", "getTop", "setTop", "getEnd", "setEnd", "getBottom", "setBottom", "Constraint", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    protected static final /* data */ class Constraints {

        @NotNull
        private Constraint bottom;

        @NotNull
        private Constraint end;

        @NotNull
        private Constraint start;

        @NotNull
        private Constraint top;

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0000¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014\"\u0004\b\u0015\u0010\u0016R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\r\"\u0004\b\u0019\u0010\u001aR$\u0010\u0006\u001a\u0004\u0018\u00010\u00008\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d\"\u0004\b\u001e\u0010\u001f¨\u0006 "}, d2 = {"Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;", "", "Landroid/view/View;", "view", "", "margin", "prev", "<init>", "(Landroid/view/View;ILru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Landroid/view/View;", "getView", "()Landroid/view/View;", "setView", "(Landroid/view/View;)V", "I", "getMargin", "setMargin", "(I)V", "Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;", "getPrev", "()Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;", "setPrev", "(Lru/ozon/uni/android/wrappers/mainaddon2/MainAddonWrapper2$Constraints$Constraint;)V", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Constraint {
            private int margin;
            private Constraint prev;
            private View view;

            public Constraint() {
                this(null, 0, null, 7, null);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Constraint)) {
                    return false;
                }
                Constraint constraint = (Constraint) other;
                return Intrinsics.d(this.view, constraint.view) && this.margin == constraint.margin && Intrinsics.d(this.prev, constraint.prev);
            }

            public final int getMargin() {
                return this.margin;
            }

            public final View getView() {
                return this.view;
            }

            public int hashCode() {
                View view = this.view;
                int a11 = C2454a.a(this.margin, (view == null ? 0 : view.hashCode()) * 31, 31);
                Constraint constraint = this.prev;
                return a11 + (constraint != null ? constraint.hashCode() : 0);
            }

            public final void setMargin(int i11) {
                this.margin = i11;
            }

            public final void setPrev(Constraint constraint) {
                this.prev = constraint;
            }

            public final void setView(View view) {
                this.view = view;
            }

            @NotNull
            public String toString() {
                return "Constraint(view=" + this.view + ", margin=" + this.margin + ", prev=" + this.prev + ")";
            }

            public Constraint(View view, int i11, Constraint constraint) {
                this.view = view;
                this.margin = i11;
                this.prev = constraint;
            }

            public /* synthetic */ Constraint(View view, int i11, Constraint constraint, int i12, DefaultConstructorMarker defaultConstructorMarker) {
                this((i12 & 1) != 0 ? null : view, (i12 & 2) != 0 ? 0 : i11, (i12 & 4) != 0 ? null : constraint);
            }
        }

        public Constraints() {
            this(null, null, null, null, 15, null);
        }

        public final void clear() {
            this.start = new Constraint(null, 0, null, 7, null);
            this.top = new Constraint(null, 0, null, 7, null);
            this.end = new Constraint(null, 0, null, 7, null);
            this.bottom = new Constraint(null, 0, null, 7, null);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Constraints)) {
                return false;
            }
            Constraints constraints = (Constraints) other;
            return Intrinsics.d(this.start, constraints.start) && Intrinsics.d(this.top, constraints.top) && Intrinsics.d(this.end, constraints.end) && Intrinsics.d(this.bottom, constraints.bottom);
        }

        @NotNull
        public final Constraint getBottom() {
            return this.bottom;
        }

        @NotNull
        public final Constraint getEnd() {
            return this.end;
        }

        @NotNull
        public final Constraint getStart() {
            return this.start;
        }

        @NotNull
        public final Constraint getTop() {
            return this.top;
        }

        public int hashCode() {
            return this.bottom.hashCode() + ((this.end.hashCode() + ((this.top.hashCode() + (this.start.hashCode() * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "Constraints(start=" + this.start + ", top=" + this.top + ", end=" + this.end + ", bottom=" + this.bottom + ")";
        }

        public Constraints(@NotNull Constraint start, @NotNull Constraint top, @NotNull Constraint end, @NotNull Constraint bottom) {
            Intrinsics.checkNotNullParameter(start, "start");
            Intrinsics.checkNotNullParameter(top, "top");
            Intrinsics.checkNotNullParameter(end, "end");
            Intrinsics.checkNotNullParameter(bottom, "bottom");
            this.start = start;
            this.top = top;
            this.end = end;
            this.bottom = bottom;
        }

        /* JADX WARN: Illegal instructions before constructor call */
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public /* synthetic */ Constraints(Constraint constraint, Constraint constraint2, Constraint constraint3, Constraint constraint4, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this(constraint, constraint2, constraint3, constraint4);
            if ((i11 & 1) != 0) {
                constraint = new Constraint(null, 0, null, 7, null);
            }
            if ((i11 & 2) != 0) {
                constraint2 = new Constraint(null, 0, null, 7, null);
            }
            if ((i11 & 4) != 0) {
                constraint3 = new Constraint(null, 0, null, 7, null);
            }
            if ((i11 & 8) != 0) {
                constraint4 = new Constraint(null, 0, null, 7, null);
            }
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[AddonSide.values().length];
            try {
                iArr[AddonSide.START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AddonSide.END.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[Alignment.values().length];
            try {
                iArr2[Alignment.NONE.ordinal()] = 1;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr2[Alignment.LEADING.ordinal()] = 2;
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
            int[] iArr3 = new int[Axis.values().length];
            try {
                iArr3[Axis.HORIZONTAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[Axis.VERTICAL.ordinal()] = 2;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public MainAddonWrapper2(@NotNull Context context, AttributeSet attributeSet, int i11, int i12, @NotNull MainAddonSettings defMainAddonSettings, boolean z11) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(defMainAddonSettings, "defMainAddonSettings");
        this.defMainAddonSettings = defMainAddonSettings;
        this.isRootWrapper = z11;
        this.mainAddonSettings = defMainAddonSettings;
        int color = a.getColor(context, R$color.graphic_neutral);
        this.defaultSeparatorColor = color;
        this.horizontalSeparatorView = new View(context);
        this.constraintSet = new d();
        this.constraints = new Constraints(null, null, null, null, 15, null);
        this.views = new ArrayList();
        this.flows = new LinkedHashMap();
        this.startSeparatorAnchorViewSide = AddonSide.START;
        this.endSeparatorAnchorViewSide = AddonSide.END;
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.MainAddonWrapperV3);
        Intrinsics.checkNotNullExpressionValue(obtainStyledAttributes, "obtainStyledAttributes(...)");
        this.layoutWidth = obtainStyledAttributes.getLayoutDimension(R$styleable.MainAddonWrapperV3_android_layout_width, -2);
        setMinHeight(UiExtKt.toPx(this.mainAddonSettings.getMinWrapperHeight()));
        obtainStyledAttributes.recycle();
        this.separatorColor = Integer.valueOf(color);
    }

    private final void addViewVirtual(List<View> vies, View view) {
        vies.add(view);
    }

    private final void addViews() {
        if (getIsRootWrapper()) {
            Iterator<Map.Entry<Integer, Flow>> it = this.flows.entrySet().iterator();
            while (it.hasNext()) {
                addView(it.next().getValue());
            }
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
            applyConstraints$uni_release();
        }
    }

    private final void addViewsVirtual(List<View> views) {
        addViewVirtual(views, getAddonView());
        if (!(getMainView() instanceof MainAddonWrapper2)) {
            addViewVirtual(views, getMainView());
            return;
        }
        MV mainView = getMainView();
        Intrinsics.g(mainView, "null cannot be cast to non-null type ru.ozon.uni.android.wrappers.mainaddon2.MainAddonWrapper2<out android.view.View, out android.view.View>");
        ((MainAddonWrapper2) mainView).addViewsVirtual(views);
    }

    private final void clearConstraints() {
        this.constraints.clear();
        if (getIsRootWrapper()) {
            Iterator<View> it = C5316f0.b(this).iterator();
            while (true) {
                C5314e0 c5314e0 = (C5314e0) it;
                if (!c5314e0.hasNext()) {
                    break;
                }
                this.constraintSet.n(((View) c5314e0.next()).getId());
            }
            Iterator<Map.Entry<Integer, Flow>> it2 = this.flows.entrySet().iterator();
            while (it2.hasNext()) {
                this.constraintSet.n(it2.next().getValue().getId());
            }
            this.constraintSet.n(getId());
        }
    }

    private final void collectConstraints() {
        if (getIsRootWrapper()) {
            collectViewConstraints(this, null, 0, getAddonSide(), getAxis(), new LayoutPadding.zero(), getAddonSide(), getAxis(), getLayoutPaddings(), this.constraintSet, this.constraints, this.flows);
            collectSeparatorConstraints(this.constraintSet, this.horizontalSeparatorView, getStartSeparatorAnchorView(), getStartSeparatorAnchorViewSide(), getEndSeparatorAnchorView(), getEndSeparatorAnchorViewSide());
            onViewConstraintsCollected();
        }
    }

    private final void collectSeparatorConstraints(d constraintSet, View separatorView, View startAnchorView, AddonSide startAnchorViewSide, View endAnchorView, AddonSide endAnchorViewSide) {
        addHorizontalSeparatorConstraints(constraintSet, separatorView, startAnchorView, startAnchorViewSide, endAnchorView, endAnchorViewSide);
    }

    private final void collectViewConstraints(ConstraintLayout parent, View anchorAddonView, int anchorAddonViewGap, AddonSide anchorAddonSide, Axis anchorAddonAxis, LayoutPadding anchorAddonLayoutPaddings, AddonSide addonSide, Axis addonAxis, LayoutPadding addonLayoutPaddings, d constraintSet, Constraints constraints, Map<Integer, Flow> flows) {
        addAddonConstraints(parent, constraintSet, constraints, flows, anchorAddonView, anchorAddonViewGap, anchorAddonSide, anchorAddonAxis, anchorAddonLayoutPaddings, addonSide, addonAxis, addonLayoutPaddings);
        if (!(getMainView() instanceof MainAddonWrapper2)) {
            addMainConstraints(parent, constraintSet, constraints, flows, anchorAddonView, anchorAddonViewGap, anchorAddonSide, anchorAddonAxis, getAddonView(), getGap(), getAddonSide(), getAxis());
            return;
        }
        MV mainView = getMainView();
        Intrinsics.g(mainView, "null cannot be cast to non-null type ru.ozon.uni.android.wrappers.mainaddon2.MainAddonWrapper2<out android.view.View, out android.view.View>");
        MainAddonWrapper2 mainAddonWrapper2 = (MainAddonWrapper2) mainView;
        mainAddonWrapper2.collectViewConstraints(parent, getAddonView(), getGap(), getAddonSide(), getAxis(), getLayoutPaddings(), mainAddonWrapper2.getAddonSide(), mainAddonWrapper2.getAxis(), mainAddonWrapper2.getLayoutPaddings(), constraintSet, constraints, flows);
    }

    private final void collectViews() {
        if (getIsRootWrapper()) {
            addViewsVirtual(this.views);
            addViewVirtual(this.views, this.horizontalSeparatorView);
        }
    }

    private final Alignment getAddonAlignment() {
        return this.mainAddonSettings.getAddonAlignment();
    }

    private final ContentAxisRelatedPadding getAddonPaddings() {
        return this.mainAddonSettings.getAddonPadding();
    }

    private final AddonSide getAddonSide() {
        return this.mainAddonSettings.getAddonSide();
    }

    private final Alignment getAlignment() {
        return this.mainAddonSettings.getAlignment();
    }

    private final Axis getAxis() {
        return this.mainAddonSettings.getAxis();
    }

    private final int getGap() {
        return this.mainAddonSettings.getGap();
    }

    private final int getLayoutPaddingBottom() {
        return this.mainAddonSettings.getPadding().getBottom();
    }

    private final int getLayoutPaddingEnd() {
        return this.mainAddonSettings.getPadding().getEnd();
    }

    private final int getLayoutPaddingStart() {
        return this.mainAddonSettings.getPadding().getStart();
    }

    private final int getLayoutPaddingTop() {
        return this.mainAddonSettings.getPadding().getTop();
    }

    private final LayoutPadding getLayoutPaddings() {
        return this.mainAddonSettings.getPadding();
    }

    private final Alignment getMainAlignment() {
        return this.mainAddonSettings.getMainAlignment();
    }

    private final ContentAxisRelatedPadding getMainPaddings() {
        return this.mainAddonSettings.getMainPadding();
    }

    private final int getMinWrapperHeight() {
        return this.mainAddonSettings.getMinWrapperHeight();
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
        View view = this.horizontalSeparatorView;
        if (view.getId() == -1) {
            view.setId(View.generateViewId());
        }
    }

    private final void resetViews() {
        clearConstraints();
        initViewParams();
        collectConstraints();
        applyConstraints$uni_release();
    }

    @NotNull
    protected d addAddonConstraints(@NotNull ConstraintLayout parent, @NotNull d constraintSet, @NotNull Constraints constraints, @NotNull Map<Integer, Flow> flows, View anchorAddonView, int anchorAddonViewGap, @NotNull AddonSide anchorAddonSide, @NotNull Axis anchorAddonAxis, @NotNull LayoutPadding anchorAddonLayoutPaddings, @NotNull AddonSide addonSide, @NotNull Axis addonAxis, @NotNull LayoutPadding addonLayoutPaddings) {
        Alignment alignment;
        float f7;
        Alignment alignment2;
        float f11;
        Alignment alignment3;
        float f12;
        Alignment alignment4;
        float f13;
        Alignment alignment5;
        float f14;
        Alignment alignment6;
        float f15;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(flows, "flows");
        Intrinsics.checkNotNullParameter(anchorAddonSide, "anchorAddonSide");
        Intrinsics.checkNotNullParameter(anchorAddonAxis, "anchorAddonAxis");
        Intrinsics.checkNotNullParameter(anchorAddonLayoutPaddings, "anchorAddonLayoutPaddings");
        Intrinsics.checkNotNullParameter(addonSide, "addonSide");
        Intrinsics.checkNotNullParameter(addonAxis, "addonAxis");
        Intrinsics.checkNotNullParameter(addonLayoutPaddings, "addonLayoutPaddings");
        constraints.getStart().setMargin(getAddonPaddings().toLayoutPadding(getAxis()).getStart() + constraints.getStart().getMargin() + getLayoutPaddingStart());
        constraints.getTop().setMargin(getAddonPaddings().toLayoutPadding(getAxis()).getTop() + constraints.getTop().getMargin() + getLayoutPaddingTop());
        constraints.getBottom().setMargin(getAddonPaddings().toLayoutPadding(getAxis()).getBottom() + constraints.getBottom().getMargin() + getLayoutPaddingBottom());
        constraints.getEnd().setMargin(getAddonPaddings().toLayoutPadding(getAxis()).getEnd() + constraints.getEnd().getMargin() + getLayoutPaddingEnd());
        int i11 = WhenMappings.$EnumSwitchMapping$2[anchorAddonAxis.ordinal()];
        if (i11 == 1) {
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i12 = iArr[anchorAddonSide.ordinal()];
            if (i12 == 1) {
                View view = constraints.getTop().getView();
                if (view != null) {
                    ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getAddonView(), view);
                    Unit unit = Unit.f71690a;
                } else {
                    ConstraintSetExtKt.layoutConstraintTopToTopOf(constraintSet, getAddonView(), parent);
                    Unit unit2 = Unit.f71690a;
                }
                constraintSet.e0(getAddonView().getId(), 3, (int) Math.ceil(UiExtKt.toPxF(constraints.getTop().getMargin())));
                View view2 = constraints.getBottom().getView();
                if (view2 != null) {
                    ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getAddonView(), view2);
                } else {
                    ConstraintSetExtKt.layoutConstraintBottomToBottomOf(constraintSet, getAddonView(), parent);
                }
                constraintSet.e0(getAddonView().getId(), 4, (int) Math.ceil(UiExtKt.toPxF(constraints.getBottom().getMargin())));
                if (anchorAddonAxis == addonAxis) {
                    constraints.getTop().setMargin(getMainPaddings().toLayoutPadding(getAxis()).getTop() + getLayoutPaddingTop());
                    constraints.getBottom().setMargin(getMainPaddings().toLayoutPadding(getAxis()).getBottom() + getLayoutPaddingBottom());
                }
                View view3 = constraints.getEnd().getView();
                if (view3 != null) {
                    ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getAddonView(), view3);
                } else {
                    ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getAddonView(), parent);
                }
                constraintSet.e0(getAddonView().getId(), 7, UiExtKt.toPx(constraints.getEnd().getMargin()));
                if (anchorAddonView != null) {
                    ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getAddonView(), anchorAddonView);
                } else {
                    View view4 = constraints.getStart().getView();
                    if (view4 != null) {
                        ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getAddonView(), view4);
                    } else {
                        ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getAddonView(), parent);
                    }
                }
                if (anchorAddonAxis != addonAxis) {
                    int i13 = iArr[addonSide.ordinal()];
                    if (i13 == 1) {
                        constraintSet.f0(BIAS_MIN, getAddonView().getId());
                    } else {
                        if (i13 != 2) {
                            throw new o();
                        }
                        constraintSet.f0(BIAS_MAX, getAddonView().getId());
                    }
                    Alignment addonAlignment = getAddonAlignment();
                    int i14 = addonAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$1[addonAlignment.ordinal()];
                    if (i14 == -1 || i14 == 1) {
                        alignment2 = getAlignment();
                    } else {
                        alignment2 = getAddonAlignment();
                        Intrinsics.f(alignment2);
                    }
                    int id2 = getAddonView().getId();
                    switch (WhenMappings.$EnumSwitchMapping$1[alignment2.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            f11 = BIAS_MIN;
                            break;
                        case 5:
                            f11 = BIAS_MAX;
                            break;
                        case 6:
                            f11 = BIAS_HALF;
                            break;
                        default:
                            throw new o();
                    }
                    constraintSet.c0(f11, id2);
                    constraintSet.e0(getAddonView().getId(), 6, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getStart().getMargin()));
                    constraints.getStart().setPrev(constraints.getStart());
                    constraints.getStart().setView(getAddonView());
                    constraints.getStart().setMargin(0);
                } else {
                    Alignment addonAlignment2 = getAddonAlignment();
                    int i15 = addonAlignment2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[addonAlignment2.ordinal()];
                    if (i15 == -1 || i15 == 1) {
                        alignment = getAlignment();
                    } else {
                        alignment = getAddonAlignment();
                        Intrinsics.f(alignment);
                    }
                    int id3 = getAddonView().getId();
                    switch (WhenMappings.$EnumSwitchMapping$1[alignment.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            f7 = BIAS_MIN;
                            break;
                        case 5:
                            f7 = BIAS_MAX;
                            break;
                        case 6:
                            f7 = BIAS_HALF;
                            break;
                        default:
                            throw new o();
                    }
                    constraintSet.f0(f7, id3);
                    int i16 = iArr[addonSide.ordinal()];
                    if (i16 == 1) {
                        constraintSet.c0(BIAS_MIN, getAddonView().getId());
                        constraintSet.e0(getAddonView().getId(), 6, UiExtKt.toPx(anchorAddonViewGap) + constraints.getStart().getMargin());
                        constraints.getStart().setPrev(constraints.getStart());
                        constraints.getStart().setView(getAddonView());
                        constraints.getStart().setMargin(0);
                    } else {
                        if (i16 != 2) {
                            throw new o();
                        }
                        constraintSet.c0(BIAS_MAX, getAddonView().getId());
                        constraintSet.e0(getAddonView().getId(), 7, UiExtKt.toPx(anchorAddonViewGap) + constraints.getEnd().getMargin());
                        constraints.getEnd().setPrev(constraints.getEnd());
                        constraints.getEnd().setView(getAddonView());
                        constraints.getEnd().setMargin(0);
                    }
                }
            } else {
                if (i12 != 2) {
                    throw new o();
                }
                View view5 = constraints.getTop().getView();
                if (view5 != null) {
                    ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getAddonView(), view5);
                    Unit unit3 = Unit.f71690a;
                } else {
                    ConstraintSetExtKt.layoutConstraintTopToTopOf(constraintSet, getAddonView(), parent);
                    Unit unit4 = Unit.f71690a;
                }
                constraintSet.e0(getAddonView().getId(), 3, (int) Math.ceil(UiExtKt.toPxF(constraints.getTop().getMargin())));
                View view6 = constraints.getBottom().getView();
                if (view6 != null) {
                    ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getAddonView(), view6);
                } else {
                    ConstraintSetExtKt.layoutConstraintBottomToBottomOf(constraintSet, getAddonView(), parent);
                }
                constraintSet.e0(getAddonView().getId(), 4, (int) Math.ceil(UiExtKt.toPxF(constraints.getBottom().getMargin())));
                if (anchorAddonAxis == addonAxis) {
                    constraints.getTop().setMargin(getMainPaddings().toLayoutPadding(getAxis()).getTop() + getLayoutPaddingTop());
                    constraints.getBottom().setMargin(getMainPaddings().toLayoutPadding(getAxis()).getBottom() + getLayoutPaddingBottom());
                }
                View view7 = constraints.getStart().getView();
                if (view7 != null) {
                    ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getAddonView(), view7);
                } else {
                    ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getAddonView(), parent);
                }
                constraintSet.e0(getAddonView().getId(), 6, UiExtKt.toPx(getLayoutPaddingStart()) + constraints.getStart().getMargin());
                if (anchorAddonView != null) {
                    ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getAddonView(), anchorAddonView);
                } else {
                    View view8 = constraints.getEnd().getView();
                    if (view8 != null) {
                        ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getAddonView(), view8);
                    } else {
                        ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getAddonView(), parent);
                    }
                }
                if (anchorAddonAxis != addonAxis) {
                    int i17 = iArr[addonSide.ordinal()];
                    if (i17 == 1) {
                        constraintSet.f0(BIAS_MIN, getAddonView().getId());
                    } else {
                        if (i17 != 2) {
                            throw new o();
                        }
                        constraintSet.f0(BIAS_MAX, getAddonView().getId());
                    }
                    Alignment addonAlignment3 = getAddonAlignment();
                    int i18 = addonAlignment3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[addonAlignment3.ordinal()];
                    if (i18 == -1 || i18 == 1) {
                        alignment4 = getAlignment();
                    } else {
                        alignment4 = getAddonAlignment();
                        Intrinsics.f(alignment4);
                    }
                    int id4 = getAddonView().getId();
                    switch (WhenMappings.$EnumSwitchMapping$1[alignment4.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            f13 = BIAS_MIN;
                            break;
                        case 5:
                            f13 = BIAS_MAX;
                            break;
                        case 6:
                            f13 = BIAS_HALF;
                            break;
                        default:
                            throw new o();
                    }
                    constraintSet.c0(f13, id4);
                    constraintSet.e0(getAddonView().getId(), 7, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(getLayoutPaddingEnd()));
                    constraints.getEnd().setPrev(constraints.getEnd());
                    constraints.getEnd().setView(getAddonView());
                    constraints.getEnd().setMargin(0);
                } else {
                    Alignment addonAlignment4 = getAddonAlignment();
                    int i19 = addonAlignment4 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[addonAlignment4.ordinal()];
                    if (i19 == -1 || i19 == 1) {
                        alignment3 = getAlignment();
                    } else {
                        alignment3 = getAddonAlignment();
                        Intrinsics.f(alignment3);
                    }
                    int id5 = getAddonView().getId();
                    switch (WhenMappings.$EnumSwitchMapping$1[alignment3.ordinal()]) {
                        case 1:
                        case 2:
                        case 3:
                        case 4:
                            f12 = BIAS_MIN;
                            break;
                        case 5:
                            f12 = BIAS_MAX;
                            break;
                        case 6:
                            f12 = BIAS_HALF;
                            break;
                        default:
                            throw new o();
                    }
                    constraintSet.f0(f12, id5);
                    int i21 = iArr[addonSide.ordinal()];
                    if (i21 == 1) {
                        constraintSet.c0(BIAS_MIN, getAddonView().getId());
                        constraintSet.e0(getAddonView().getId(), 6, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(getLayoutPaddingStart()));
                        constraints.getStart().setPrev(constraints.getStart());
                        constraints.getStart().setView(getAddonView());
                        constraints.getStart().setMargin(0);
                    } else {
                        if (i21 != 2) {
                            throw new o();
                        }
                        constraintSet.c0(BIAS_MAX, getAddonView().getId());
                        constraintSet.e0(getAddonView().getId(), 7, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(getLayoutPaddingEnd()));
                        constraints.getEnd().setPrev(constraints.getEnd());
                        constraints.getEnd().setView(getAddonView());
                        constraints.getEnd().setMargin(0);
                    }
                }
            }
        } else {
            if (i11 != 2) {
                throw new o();
            }
            int[] iArr2 = WhenMappings.$EnumSwitchMapping$0;
            int i22 = iArr2[anchorAddonSide.ordinal()];
            if (i22 == 1) {
                View view9 = constraints.getStart().getView();
                if (view9 != null) {
                    ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getAddonView(), view9);
                    Unit unit5 = Unit.f71690a;
                } else {
                    ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getAddonView(), parent);
                    Unit unit6 = Unit.f71690a;
                }
                constraintSet.e0(getAddonView().getId(), 6, UiExtKt.toPx(getLayoutPaddingStart()) + constraints.getStart().getMargin());
                View view10 = constraints.getEnd().getView();
                if (view10 != null) {
                    ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getAddonView(), view10);
                } else {
                    ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getAddonView(), parent);
                }
                constraintSet.e0(getAddonView().getId(), 7, UiExtKt.toPx(getLayoutPaddingEnd()) + constraints.getEnd().getMargin());
                Alignment addonAlignment5 = getAddonAlignment();
                int i23 = addonAlignment5 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[addonAlignment5.ordinal()];
                if (i23 == -1 || i23 == 1) {
                    alignment5 = getAlignment();
                } else {
                    alignment5 = getAddonAlignment();
                    Intrinsics.f(alignment5);
                }
                int id6 = getAddonView().getId();
                switch (WhenMappings.$EnumSwitchMapping$1[alignment5.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        f14 = BIAS_MIN;
                        break;
                    case 5:
                        f14 = BIAS_MAX;
                        break;
                    case 6:
                        f14 = BIAS_HALF;
                        break;
                    default:
                        throw new o();
                }
                constraintSet.c0(f14, id6);
                View view11 = constraints.getBottom().getView();
                if (view11 != null) {
                    ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getAddonView(), view11);
                } else {
                    ConstraintSetExtKt.layoutConstraintBottomToBottomOf(constraintSet, getAddonView(), parent);
                }
                constraintSet.e0(getAddonView().getId(), 4, UiExtKt.toPx(constraints.getBottom().getMargin()));
                if (anchorAddonView != null) {
                    ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getAddonView(), anchorAddonView);
                } else {
                    View view12 = constraints.getTop().getView();
                    if (view12 != null) {
                        ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getAddonView(), view12);
                    } else {
                        ConstraintSetExtKt.layoutConstraintTopToTopOf(constraintSet, getAddonView(), parent);
                    }
                }
                if (anchorAddonAxis != addonAxis) {
                    constraintSet.c0(BIAS_MIN, getAddonView().getId());
                    constraintSet.e0(getAddonView().getId(), 3, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getTop().getMargin()));
                    constraints.getTop().setPrev(constraints.getTop());
                    constraints.getTop().setView(getAddonView());
                    constraints.getTop().setMargin(0);
                } else {
                    int i24 = iArr2[addonSide.ordinal()];
                    if (i24 == 1) {
                        constraintSet.f0(BIAS_MIN, getAddonView().getId());
                        constraintSet.e0(getAddonView().getId(), 3, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getTop().getMargin()));
                        constraints.getTop().setPrev(constraints.getTop());
                        constraints.getTop().setView(getAddonView());
                        constraints.getTop().setMargin(0);
                    } else {
                        if (i24 != 2) {
                            throw new o();
                        }
                        constraintSet.f0(BIAS_MAX, getAddonView().getId());
                        constraintSet.e0(getAddonView().getId(), 4, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getBottom().getMargin()));
                        constraints.getBottom().setPrev(constraints.getBottom());
                        constraints.getBottom().setView(getAddonView());
                        constraints.getBottom().setMargin(0);
                    }
                }
            } else {
                if (i22 != 2) {
                    throw new o();
                }
                View view13 = constraints.getStart().getView();
                if (view13 != null) {
                    ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getAddonView(), view13);
                    Unit unit7 = Unit.f71690a;
                } else {
                    ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getAddonView(), parent);
                    Unit unit8 = Unit.f71690a;
                }
                constraintSet.e0(getAddonView().getId(), 4, UiExtKt.toPx(constraints.getBottom().getMargin()));
                View view14 = constraints.getEnd().getView();
                if (view14 != null) {
                    ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getAddonView(), view14);
                } else {
                    ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getAddonView(), parent);
                }
                constraintSet.e0(getAddonView().getId(), 7, UiExtKt.toPx(constraints.getEnd().getMargin()));
                Alignment addonAlignment6 = getAddonAlignment();
                int i25 = addonAlignment6 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[addonAlignment6.ordinal()];
                if (i25 == -1 || i25 == 1) {
                    alignment6 = getAlignment();
                } else {
                    alignment6 = getAddonAlignment();
                    Intrinsics.f(alignment6);
                }
                int id7 = getAddonView().getId();
                switch (WhenMappings.$EnumSwitchMapping$1[alignment6.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        f15 = BIAS_MIN;
                        break;
                    case 5:
                        f15 = BIAS_MAX;
                        break;
                    case 6:
                        f15 = BIAS_HALF;
                        break;
                    default:
                        throw new o();
                }
                constraintSet.c0(f15, id7);
                View view15 = constraints.getTop().getView();
                if (view15 != null) {
                    ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getAddonView(), view15);
                } else {
                    ConstraintSetExtKt.layoutConstraintTopToTopOf(constraintSet, getAddonView(), parent);
                }
                constraintSet.e0(getAddonView().getId(), 3, UiExtKt.toPx(constraints.getTop().getMargin()));
                if (anchorAddonView != null) {
                    ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getAddonView(), anchorAddonView);
                } else {
                    View view16 = constraints.getBottom().getView();
                    if (view16 != null) {
                        ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getAddonView(), view16);
                    } else {
                        ConstraintSetExtKt.layoutConstraintBottomToBottomOf(constraintSet, getAddonView(), parent);
                    }
                }
                if (anchorAddonAxis != addonAxis) {
                    constraintSet.c0(BIAS_MIN, getAddonView().getId());
                    constraintSet.e0(getAddonView().getId(), 3, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getTop().getMargin()));
                    constraints.getTop().setPrev(constraints.getTop());
                    constraints.getTop().setView(getAddonView());
                    constraints.getTop().setMargin(0);
                } else {
                    int i26 = iArr2[addonSide.ordinal()];
                    if (i26 == 1) {
                        constraintSet.f0(BIAS_MIN, getAddonView().getId());
                        constraintSet.e0(getAddonView().getId(), 3, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getTop().getMargin()));
                        constraints.getTop().setPrev(constraints.getTop());
                        constraints.getTop().setView(getAddonView());
                        constraints.getTop().setMargin(0);
                    } else {
                        if (i26 != 2) {
                            throw new o();
                        }
                        constraintSet.f0(BIAS_MAX, getAddonView().getId());
                        constraintSet.e0(getAddonView().getId(), 4, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getBottom().getMargin()));
                        constraints.getBottom().setPrev(constraints.getBottom());
                        constraints.getBottom().setView(getAddonView());
                        constraints.getBottom().setMargin(0);
                    }
                }
            }
        }
        ViewGroup.LayoutParams layoutParams = getAddonView().getLayoutParams();
        int i27 = layoutParams != null ? layoutParams.width : -2;
        ViewGroup.LayoutParams layoutParams2 = getAddonView().getLayoutParams();
        int i28 = layoutParams2 != null ? layoutParams2.height : -2;
        constraintSet.A(getAddonView().getId(), i27);
        constraintSet.w(getAddonView().getId(), i28);
        return constraintSet;
    }

    @NotNull
    protected d addHorizontalSeparatorConstraints(@NotNull d constraintSet, @NotNull View separatorView, View startAnchorView, @NotNull AddonSide startAnchorViewSide, View endAnchorView, @NotNull AddonSide endAnchorViewSide) {
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(separatorView, "separatorView");
        Intrinsics.checkNotNullParameter(startAnchorViewSide, "startAnchorViewSide");
        Intrinsics.checkNotNullParameter(endAnchorViewSide, "endAnchorViewSide");
        constraintSet.A(separatorView.getId(), 0);
        constraintSet.w(separatorView.getId(), SEPARATOR_HEIGHT);
        int[] iArr = WhenMappings.$EnumSwitchMapping$0;
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

    @NotNull
    protected d addMainConstraints(@NotNull ConstraintLayout parent, @NotNull d constraintSet, @NotNull Constraints constraints, @NotNull Map<Integer, Flow> flows, View anchorAddonView, int anchorAddonViewGap, @NotNull AddonSide anchorAddonSide, @NotNull Axis anchorAddonAxis, @NotNull View addonView, int addonGap, @NotNull AddonSide addonSide, @NotNull Axis addonAxis) {
        Alignment alignment;
        float f7;
        Alignment alignment2;
        float f11;
        Alignment alignment3;
        float f12;
        Alignment alignment4;
        float f13;
        Intrinsics.checkNotNullParameter(parent, "parent");
        Intrinsics.checkNotNullParameter(constraintSet, "constraintSet");
        Intrinsics.checkNotNullParameter(constraints, "constraints");
        Intrinsics.checkNotNullParameter(flows, "flows");
        Intrinsics.checkNotNullParameter(anchorAddonSide, "anchorAddonSide");
        Intrinsics.checkNotNullParameter(anchorAddonAxis, "anchorAddonAxis");
        Intrinsics.checkNotNullParameter(addonView, "addonView");
        Intrinsics.checkNotNullParameter(addonSide, "addonSide");
        Intrinsics.checkNotNullParameter(addonAxis, "addonAxis");
        constraints.getStart().setMargin(getMainPaddings().toLayoutPadding(getAxis()).getStart() + constraints.getStart().getMargin());
        constraints.getTop().setMargin(getMainPaddings().toLayoutPadding(getAxis()).getTop() + constraints.getTop().getMargin());
        constraints.getBottom().setMargin(getMainPaddings().toLayoutPadding(getAxis()).getBottom() + constraints.getBottom().getMargin());
        constraints.getEnd().setMargin(getMainPaddings().toLayoutPadding(getAxis()).getEnd() + constraints.getEnd().getMargin());
        int i11 = WhenMappings.$EnumSwitchMapping$2[addonAxis.ordinal()];
        if (i11 == 1) {
            int i12 = WhenMappings.$EnumSwitchMapping$0[addonSide.ordinal()];
            if (i12 == 1) {
                View view = constraints.getTop().getView();
                if (view != null) {
                    ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getMainView(), view);
                } else {
                    ConstraintSetExtKt.layoutConstraintTopToTopOf(constraintSet, getMainView(), parent);
                }
                View view2 = constraints.getBottom().getView();
                if (view2 != null) {
                    ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getMainView(), view2);
                } else {
                    ConstraintSetExtKt.layoutConstraintBottomToBottomOf(constraintSet, getMainView(), parent);
                }
                Alignment mainAlignment = getMainAlignment();
                int i13 = mainAlignment == null ? -1 : WhenMappings.$EnumSwitchMapping$1[mainAlignment.ordinal()];
                if (i13 == -1 || i13 == 1) {
                    alignment = getAlignment();
                } else {
                    alignment = getMainAlignment();
                    Intrinsics.f(alignment);
                }
                int id2 = getMainView().getId();
                switch (WhenMappings.$EnumSwitchMapping$1[alignment.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        f7 = BIAS_MIN;
                        break;
                    case 5:
                        f7 = BIAS_MAX;
                        break;
                    case 6:
                        f7 = BIAS_HALF;
                        break;
                    default:
                        throw new o();
                }
                constraintSet.f0(f7, id2);
                ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getMainView(), addonView);
                constraintSet.e0(getMainView().getId(), 6, UiExtKt.toPx(addonGap));
                View view3 = constraints.getEnd().getView();
                if (view3 != null) {
                    ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getMainView(), view3);
                } else {
                    ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getMainView(), parent);
                }
                constraintSet.c0(BIAS_MIN, getMainView().getId());
            } else {
                if (i12 != 2) {
                    throw new o();
                }
                View view4 = constraints.getTop().getView();
                if (view4 != null) {
                    ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getMainView(), view4);
                } else {
                    ConstraintSetExtKt.layoutConstraintTopToTopOf(constraintSet, getMainView(), parent);
                }
                View view5 = constraints.getBottom().getView();
                if (view5 != null) {
                    ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getMainView(), view5);
                } else {
                    ConstraintSetExtKt.layoutConstraintBottomToBottomOf(constraintSet, getMainView(), parent);
                }
                Alignment mainAlignment2 = getMainAlignment();
                int i14 = mainAlignment2 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[mainAlignment2.ordinal()];
                if (i14 == -1 || i14 == 1) {
                    alignment2 = getAlignment();
                } else {
                    alignment2 = getMainAlignment();
                    Intrinsics.f(alignment2);
                }
                int id3 = getMainView().getId();
                switch (WhenMappings.$EnumSwitchMapping$1[alignment2.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        f11 = BIAS_MIN;
                        break;
                    case 5:
                        f11 = BIAS_MAX;
                        break;
                    case 6:
                        f11 = BIAS_HALF;
                        break;
                    default:
                        throw new o();
                }
                constraintSet.f0(f11, id3);
                ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getMainView(), addonView);
                constraintSet.e0(getMainView().getId(), 7, UiExtKt.toPx(addonGap));
                View view6 = constraints.getStart().getView();
                if (view6 != null) {
                    ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getMainView(), view6);
                } else {
                    ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getMainView(), parent);
                }
            }
        } else {
            if (i11 != 2) {
                throw new o();
            }
            int[] iArr = WhenMappings.$EnumSwitchMapping$0;
            int i15 = iArr[addonSide.ordinal()];
            if (i15 == 1) {
                int i16 = iArr[anchorAddonSide.ordinal()];
                if (i16 == 1) {
                    if (anchorAddonView != null) {
                        ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getMainView(), anchorAddonView);
                    } else {
                        View view7 = constraints.getStart().getView();
                        if (view7 != null) {
                            ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getMainView(), view7);
                        } else {
                            ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getMainView(), parent);
                        }
                    }
                    constraintSet.e0(getMainView().getId(), 6, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getStart().getMargin()));
                    View view8 = constraints.getEnd().getView();
                    if (view8 != null) {
                        ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getMainView(), view8);
                    } else {
                        ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getMainView(), parent);
                    }
                    constraintSet.e0(getMainView().getId(), 7, UiExtKt.toPx(constraints.getEnd().getMargin()));
                } else {
                    if (i16 != 2) {
                        throw new o();
                    }
                    if (anchorAddonView != null) {
                        ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getMainView(), anchorAddonView);
                    } else {
                        View view9 = constraints.getEnd().getView();
                        if (view9 != null) {
                            ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getMainView(), view9);
                        } else {
                            ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getMainView(), parent);
                        }
                    }
                    constraintSet.e0(getMainView().getId(), 7, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getEnd().getMargin()));
                    View view10 = constraints.getStart().getView();
                    if (view10 != null) {
                        ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getMainView(), view10);
                    } else {
                        ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getMainView(), parent);
                    }
                    constraintSet.e0(getMainView().getId(), 6, UiExtKt.toPx(constraints.getStart().getMargin()));
                }
                Alignment mainAlignment3 = getMainAlignment();
                int i17 = mainAlignment3 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[mainAlignment3.ordinal()];
                if (i17 == -1 || i17 == 1) {
                    alignment3 = getAlignment();
                } else {
                    alignment3 = getMainAlignment();
                    Intrinsics.f(alignment3);
                }
                int id4 = getMainView().getId();
                switch (WhenMappings.$EnumSwitchMapping$1[alignment3.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        f12 = BIAS_MIN;
                        break;
                    case 5:
                        f12 = BIAS_MAX;
                        break;
                    case 6:
                        f12 = BIAS_HALF;
                        break;
                    default:
                        throw new o();
                }
                constraintSet.c0(f12, id4);
                ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getMainView(), addonView);
                constraintSet.e0(getMainView().getId(), 3, UiExtKt.toPx(addonGap));
                constraintSet.Z(getMainView().getId(), 3, 0);
                View view11 = constraints.getBottom().getView();
                if (view11 != null) {
                    ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getMainView(), view11);
                } else {
                    ConstraintSetExtKt.layoutConstraintBottomToBottomOf(constraintSet, getMainView(), parent);
                }
                constraintSet.e0(getMainView().getId(), 4, (int) Math.ceil(UiExtKt.toPxF(constraints.getBottom().getMargin())));
                constraintSet.f0(BIAS_MIN, getMainView().getId());
            } else {
                if (i15 != 2) {
                    throw new o();
                }
                int i18 = iArr[anchorAddonSide.ordinal()];
                if (i18 == 1) {
                    if (anchorAddonView != null) {
                        ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getMainView(), anchorAddonView);
                    } else {
                        View view12 = constraints.getStart().getView();
                        if (view12 != null) {
                            ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getMainView(), view12);
                        } else {
                            ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getMainView(), parent);
                        }
                    }
                    constraintSet.e0(getMainView().getId(), 6, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getStart().getMargin()));
                    View view13 = constraints.getEnd().getView();
                    if (view13 != null) {
                        ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getMainView(), view13);
                    } else {
                        ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getMainView(), parent);
                    }
                } else {
                    if (i18 != 2) {
                        throw new o();
                    }
                    if (anchorAddonView != null) {
                        ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getMainView(), anchorAddonView);
                    } else {
                        View view14 = constraints.getStart().getView();
                        if (view14 != null) {
                            ConstraintSetExtKt.layoutConstraintEndToStartOf(constraintSet, getMainView(), view14);
                        } else {
                            ConstraintSetExtKt.layoutConstraintEndToEndOf(constraintSet, getMainView(), parent);
                        }
                    }
                    constraintSet.e0(getMainView().getId(), 7, UiExtKt.toPx(anchorAddonViewGap) + UiExtKt.toPx(constraints.getEnd().getMargin()));
                    View view15 = constraints.getStart().getView();
                    if (view15 != null) {
                        ConstraintSetExtKt.layoutConstraintStartToEndOf(constraintSet, getMainView(), view15);
                    } else {
                        ConstraintSetExtKt.layoutConstraintStartToStartOf(constraintSet, getMainView(), parent);
                    }
                }
                Alignment mainAlignment4 = getMainAlignment();
                int i19 = mainAlignment4 == null ? -1 : WhenMappings.$EnumSwitchMapping$1[mainAlignment4.ordinal()];
                if (i19 == -1 || i19 == 1) {
                    alignment4 = getAlignment();
                } else {
                    alignment4 = getMainAlignment();
                    Intrinsics.f(alignment4);
                }
                int id5 = getMainView().getId();
                switch (WhenMappings.$EnumSwitchMapping$1[alignment4.ordinal()]) {
                    case 1:
                    case 2:
                    case 3:
                    case 4:
                        f13 = BIAS_MIN;
                        break;
                    case 5:
                        f13 = BIAS_MAX;
                        break;
                    case 6:
                        f13 = BIAS_HALF;
                        break;
                    default:
                        throw new o();
                }
                constraintSet.c0(f13, id5);
                View view16 = constraints.getTop().getView();
                if (view16 != null) {
                    ConstraintSetExtKt.layoutConstraintTopToBottomOf(constraintSet, getMainView(), view16);
                } else {
                    ConstraintSetExtKt.layoutConstraintTopToTopOf(constraintSet, getMainView(), parent);
                }
                constraintSet.e0(getMainView().getId(), 3, UiExtKt.toPx(constraints.getTop().getMargin()));
                ConstraintSetExtKt.layoutConstraintBottomToTopOf(constraintSet, getMainView(), addonView);
                constraintSet.e0(getMainView().getId(), 4, (int) Math.ceil(UiExtKt.toPxF(addonGap)));
                constraintSet.Z(getMainView().getId(), 4, 0);
                constraintSet.f0(BIAS_MAX, getMainView().getId());
            }
        }
        constraintSet.A(getMainView().getId(), 0);
        constraintSet.w(getMainView().getId(), -2);
        return constraintSet;
    }

    public final void applyConstraints$uni_release() {
        this.constraintSet.f(this);
    }

    @NotNull
    protected abstract AV getAddonView();

    protected View getEndSeparatorAnchorView() {
        return this.endSeparatorAnchorView;
    }

    @NotNull
    protected AddonSide getEndSeparatorAnchorViewSide() {
        return this.endSeparatorAnchorViewSide;
    }

    public boolean getHasSeparator() {
        return this.hasSeparator;
    }

    @NotNull
    protected abstract MV getMainView();

    public Function0<Unit> getOnViewCollectedCallback$uni_release() {
        return this.onViewCollectedCallback;
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

    protected void onViewConstraintsCollected() {
        Function0<Unit> onViewCollectedCallback$uni_release = getOnViewCollectedCallback$uni_release();
        if (onViewCollectedCallback$uni_release != null) {
            onViewCollectedCallback$uni_release.invoke();
        }
    }

    @Override // ru.ozon.uni.android.wrappers.mainaddon.data.MainAddonViewApi
    public void setHasSeparator(boolean z11) {
        this.hasSeparator = z11;
        if (!z11) {
            this.constraintSet.h0(this.horizontalSeparatorView.getId(), 4);
            this.horizontalSeparatorView.setVisibility(4);
        } else {
            this.constraintSet.h0(this.horizontalSeparatorView.getId(), 0);
            this.horizontalSeparatorView.setVisibility(0);
            setSeparatorColor(getSeparatorColor());
        }
    }

    public final void setMainAddonSettings(@NotNull MainAddonSettings value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.mainAddonSettings = value;
        setMinHeight(getMinWrapperHeight());
        resetViews();
    }

    public void setSeparatorColor(Integer num) {
        this.separatorColor = num;
        if (getHasSeparator()) {
            View view = this.horizontalSeparatorView;
            Integer num2 = this.separatorColor;
            view.setBackgroundColor(num2 != null ? num2.intValue() : this.defaultSeparatorColor);
        }
    }

    protected final void setViews() {
        initViewParams();
        collectViews();
        collectConstraints();
        addViews();
    }
}
