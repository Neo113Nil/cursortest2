package ru.ozon.uni.android.controls.buttonV3;

import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.R;
import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.GradientDrawable;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.AttributeSet;
import android.view.MotionEvent;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.d;
import androidx.core.content.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.atom.loader.data.LoaderSize;
import ru.ozon.uni.android.atom.loader.ui.LoaderView;
import ru.ozon.uni.android.controls.buttonV3.ButtonV3View;
import ru.ozon.uni.android.controls.common.ButtonImageView;
import ru.ozon.uni.android.controls.common.ButtonTextView;
import ru.ozon.uni.android.ds.UniGlobalConfig;
import ru.ozon.uni.android.ds.UniGlobalConfigKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.android.uikitsdk.Color;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintLayoutExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ConstraintSetExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TVExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TypedArrayExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.android.uikitsdk.ext.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.resources.DrawableResource;
import ru.ozon.uni.android.util.FocusableStrokeConfigurator;
import ru.ozon.uni.android.util.FontSizeUtils;
import ru.ozon.uni.android.util.locator.StaticLocatorInitializer;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTOKt;
import ru.ozon.uni.atoms.utils.AtomLocatableView;
import ru.ozon.uni.core.R$style;

@Metadata(d1 = {"\u0000º\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\r\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0012\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0014\n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0007\u0018\u0000 É\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0002É\u0001B1\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\n\u001a\u00020\b¢\u0006\u0004\b\u000b\u0010\fJ\u001f\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\r\u001a\u00020\b2\u0006\u0010\u000e\u001a\u00020\bH\u0014¢\u0006\u0004\b\u0010\u0010\u0011J\u0019\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\r\u0010\u0018\u001a\u00020\u0017¢\u0006\u0004\b\u0018\u0010\u0019J\r\u0010\u001a\u001a\u00020\u000f¢\u0006\u0004\b\u001a\u0010\u001bJ\u0019\u0010\u001e\u001a\u00020\u000f2\b\u0010\u001d\u001a\u0004\u0018\u00010\u001cH\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u000f\u0010 \u001a\u00020\u0017H\u0002¢\u0006\u0004\b \u0010\u0019J\u000f\u0010!\u001a\u00020\u000fH\u0002¢\u0006\u0004\b!\u0010\u001bJ\u000f\u0010\"\u001a\u00020\u000fH\u0002¢\u0006\u0004\b\"\u0010\u001bJ\u000f\u0010#\u001a\u00020\u000fH\u0002¢\u0006\u0004\b#\u0010\u001bJ\u0017\u0010%\u001a\u00020\u000f2\u0006\u0010$\u001a\u00020\bH\u0002¢\u0006\u0004\b%\u0010&J\u000f\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b(\u0010)J\u000f\u0010*\u001a\u00020\bH\u0002¢\u0006\u0004\b*\u0010+J\u0011\u0010,\u001a\u0004\u0018\u00010'H\u0002¢\u0006\u0004\b,\u0010)J\u000f\u0010.\u001a\u00020-H\u0002¢\u0006\u0004\b.\u0010/J!\u00102\u001a\u00020\u000f2\u0006\u00100\u001a\u00020\b2\b\b\u0002\u00101\u001a\u00020\u0014H\u0002¢\u0006\u0004\b2\u00103J\u0017\u00105\u001a\u00020\u000f2\u0006\u00104\u001a\u00020\bH\u0002¢\u0006\u0004\b5\u0010&J\u000f\u00106\u001a\u00020'H\u0002¢\u0006\u0004\b6\u0010)J\u0017\u00108\u001a\u00020\u000f2\u0006\u00107\u001a\u00020\bH\u0002¢\u0006\u0004\b8\u0010&J\u000f\u00109\u001a\u00020\u000fH\u0002¢\u0006\u0004\b9\u0010\u001bJ-\u0010>\u001a\u00020\u000f2\b\u0010;\u001a\u0004\u0018\u00010:2\b\u0010<\u001a\u0004\u0018\u00010:2\b\u0010=\u001a\u0004\u0018\u00010:H\u0002¢\u0006\u0004\b>\u0010?R*\u0010B\u001a\u00020@2\u0006\u0010A\u001a\u00020@8\u0016@VX\u0096\u000e¢\u0006\u0012\n\u0004\bB\u0010C\u001a\u0004\bD\u0010E\"\u0004\bF\u0010GR\u0014\u0010H\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bH\u0010IR*\u0010K\u001a\u00020J2\u0006\u0010A\u001a\u00020J8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010R\u001a\u00020Q2\u0006\u0010A\u001a\u00020Q8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bR\u0010S\u001a\u0004\bT\u0010U\"\u0004\bV\u0010WR*\u0010X\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u00148\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bX\u0010Y\u001a\u0004\bZ\u0010[\"\u0004\b\\\u0010]R\"\u0010^\u001a\u00020\u00148\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b^\u0010Y\u001a\u0004\b_\u0010[\"\u0004\b`\u0010]R*\u0010b\u001a\u00020a2\u0006\u0010A\u001a\u00020a8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bb\u0010c\u001a\u0004\bd\u0010e\"\u0004\bf\u0010gR\u001b\u0010k\u001a\u00020\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\bh\u0010i\u001a\u0004\bj\u0010+R.\u0010;\u001a\u0004\u0018\u00010:2\b\u0010A\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010l\u001a\u0004\bm\u0010n\"\u0004\bo\u0010pR*\u0010q\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bq\u0010I\u001a\u0004\br\u0010+\"\u0004\bs\u0010&R.\u0010u\u001a\u0004\u0018\u00010t2\b\u0010A\u001a\u0004\u0018\u00010t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bu\u0010v\u001a\u0004\bw\u0010x\"\u0004\by\u0010zR.\u0010{\u001a\u0004\u0018\u00010t2\b\u0010A\u001a\u0004\u0018\u00010t8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b{\u0010v\u001a\u0004\b|\u0010x\"\u0004\b}\u0010zR/\u0010~\u001a\u0004\u0018\u00010t2\b\u0010A\u001a\u0004\u0018\u00010t8\u0006@FX\u0086\u000e¢\u0006\u0013\n\u0004\b~\u0010v\u001a\u0004\b\u007f\u0010x\"\u0005\b\u0080\u0001\u0010zR7\u0010\u0082\u0001\u001a\u0005\u0018\u00010\u0081\u00012\t\u0010A\u001a\u0005\u0018\u00010\u0081\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0082\u0001\u0010\u0083\u0001\u001a\u0006\b\u0084\u0001\u0010\u0085\u0001\"\u0006\b\u0086\u0001\u0010\u0087\u0001R0\u0010<\u001a\u0004\u0018\u00010:2\b\u0010A\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0014\n\u0004\b<\u0010l\u001a\u0005\b\u0088\u0001\u0010n\"\u0005\b\u0089\u0001\u0010pR.\u0010\u008a\u0001\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u008a\u0001\u0010I\u001a\u0005\b\u008b\u0001\u0010+\"\u0005\b\u008c\u0001\u0010&R2\u0010\u008d\u0001\u001a\u0004\u0018\u00010:2\b\u0010A\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b\u008d\u0001\u0010l\u001a\u0005\b\u008e\u0001\u0010n\"\u0005\b\u008f\u0001\u0010pR.\u0010\u0090\u0001\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u0090\u0001\u0010I\u001a\u0005\b\u0091\u0001\u0010+\"\u0005\b\u0092\u0001\u0010&R&\u0010\u0093\u0001\u001a\u00020\b8\u0006@\u0006X\u0086\u000e¢\u0006\u0015\n\u0005\b\u0093\u0001\u0010I\u001a\u0005\b\u0094\u0001\u0010+\"\u0005\b\u0095\u0001\u0010&R7\u0010\u0097\u0001\u001a\u0005\u0018\u00010\u0096\u00012\t\u0010A\u001a\u0005\u0018\u00010\u0096\u00018\u0006@FX\u0086\u000e¢\u0006\u0018\n\u0006\b\u0097\u0001\u0010\u0098\u0001\u001a\u0006\b\u0099\u0001\u0010\u009a\u0001\"\u0006\b\u009b\u0001\u0010\u009c\u0001R.\u0010\u009d\u0001\u001a\u00020\b2\u0006\u0010A\u001a\u00020\b8\u0006@FX\u0087\u000e¢\u0006\u0015\n\u0005\b\u009d\u0001\u0010I\u001a\u0005\b\u009e\u0001\u0010+\"\u0005\b\u009f\u0001\u0010&R2\u0010 \u0001\u001a\u0004\u0018\u00010t2\b\u0010A\u001a\u0004\u0018\u00010t8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b \u0001\u0010v\u001a\u0005\b¡\u0001\u0010x\"\u0005\b¢\u0001\u0010zR2\u0010£\u0001\u001a\u0004\u0018\u00010:2\b\u0010A\u001a\u0004\u0018\u00010:8\u0006@FX\u0086\u000e¢\u0006\u0015\n\u0005\b£\u0001\u0010l\u001a\u0005\b¤\u0001\u0010n\"\u0005\b¥\u0001\u0010pR&\u0010¦\u0001\u001a\u00020\u00148\u0000@\u0000X\u0080\u000e¢\u0006\u0015\n\u0005\b¦\u0001\u0010Y\u001a\u0005\b§\u0001\u0010[\"\u0005\b¨\u0001\u0010]R'\u0010©\u0001\u001a\u00020\u00142\u0006\u0010A\u001a\u00020\u00148\u0002@BX\u0082\u000e¢\u0006\u000e\n\u0005\b©\u0001\u0010Y\"\u0005\bª\u0001\u0010]R\u0017\u0010«\u0001\u001a\u00020'8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b«\u0001\u0010¬\u0001R\u001b\u0010\u00ad\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u00ad\u0001\u0010¬\u0001R\u001b\u0010®\u0001\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b®\u0001\u0010¯\u0001R\u001b\u0010°\u0001\u001a\u0004\u0018\u00010'8\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b°\u0001\u0010¬\u0001R\u001b\u0010±\u0001\u001a\u0004\u0018\u00010\u00178\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b±\u0001\u0010²\u0001R\u0018\u0010´\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b´\u0001\u0010µ\u0001R\u0018\u0010¶\u0001\u001a\u00030³\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b¶\u0001\u0010µ\u0001R\u0018\u0010º\u0001\u001a\u00030·\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¸\u0001\u0010¹\u0001R\u0018\u0010¾\u0001\u001a\u00030»\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b¼\u0001\u0010½\u0001R\u0018\u0010Â\u0001\u001a\u00030¿\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\bÀ\u0001\u0010Á\u0001R\u0016\u0010Ä\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÃ\u0001\u0010+R\u0016\u0010Æ\u0001\u001a\u00020\b8BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÅ\u0001\u0010+R\u0016\u0010È\u0001\u001a\u00020\u00148BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bÇ\u0001\u0010[¨\u0006Ê\u0001"}, d2 = {"Lru/ozon/uni/android/controls/buttonV3/ButtonV3View;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/uni/atoms/utils/AtomLocatableView;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "defStyleRes", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;II)V", "widthMeasureSpec", "heightMeasureSpec", "", "onMeasure", "(II)V", "Landroid/view/MotionEvent;", "event", "", "onTouchEvent", "(Landroid/view/MotionEvent;)Z", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "showLoader", "()Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "hideLoader", "()V", "Landroid/view/accessibility/AccessibilityNodeInfo;", "info", "onInitializeAccessibilityNodeInfo", "(Landroid/view/accessibility/AccessibilityNodeInfo;)V", "createLoader", "showHoverIfEnabled", "hideHover", "layoutTitle", "dataViewId", "layoutData", "(I)V", "Lru/ozon/uni/android/controls/common/ButtonTextView;", "createDataView", "()Lru/ozon/uni/android/controls/common/ButtonTextView;", "getDataMinWidth", "()I", "updateDataBackground", "Lru/ozon/uni/android/controls/common/ButtonImageView;", "createIconView", "()Lru/ozon/uni/android/controls/common/ButtonImageView;", "iconViewId", "titleIsGone", "layoutIconWithTitle", "(IZ)V", "subtitleViewId", "layoutSubtitle", "createSubtitleView", "styleRes", "applyStyle", "applyTextStyle", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "data", "setContentDescriptionForAccessibility", "(Ljava/lang/CharSequence;Ljava/lang/CharSequence;Ljava/lang/CharSequence;)V", "", AppMeasurementSdk.ConditionalUserProperty.VALUE, "locatorTag", "Ljava/lang/String;", "getLocatorTag", "()Ljava/lang/String;", "setLocatorTag", "(Ljava/lang/String;)V", "transparentColor", "I", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "size", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "getSize", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;", "setSize", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$Sizes;)V", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "style", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "getStyle", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;", "setStyle", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO$StyleTypes;)V", "disabled", "Z", "getDisabled", "()Z", "setDisabled", "(Z)V", "hoverDisabled", "getHoverDisabled", "setHoverDisabled", "Lru/ozon/uni/android/uikitsdk/Color;", "backColor", "Lru/ozon/uni/android/uikitsdk/Color;", "getBackColor", "()Lru/ozon/uni/android/uikitsdk/Color;", "setBackColor", "(Lru/ozon/uni/android/uikitsdk/Color;)V", "backgroundDrawableStrokeColor$delegate", "LSc/j;", "getBackgroundDrawableStrokeColor", "backgroundDrawableStrokeColor", "Ljava/lang/CharSequence;", "getTitle", "()Ljava/lang/CharSequence;", "setTitle", "(Ljava/lang/CharSequence;)V", "titleColor", "getTitleColor", "setTitleColor", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "titleGradient", "Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "getTitleGradient", "()Lru/ozon/uni/android/uikitsdk/Color$Gradient;", "setTitleGradient", "(Lru/ozon/uni/android/uikitsdk/Color$Gradient;)V", "subtitleGradient", "getSubtitleGradient", "setSubtitleGradient", "dataTextGradient", "getDataTextGradient", "setDataTextGradient", "Lru/ozon/uni/android/uikitsdk/Color$Solid;", "hoverColor", "Lru/ozon/uni/android/uikitsdk/Color$Solid;", "getHoverColor", "()Lru/ozon/uni/android/uikitsdk/Color$Solid;", "setHoverColor", "(Lru/ozon/uni/android/uikitsdk/Color$Solid;)V", "getSubtitle", "setSubtitle", "subtitleColor", "getSubtitleColor", "setSubtitleColor", "dataText", "getDataText", "setDataText", "dataTextColor", "getDataTextColor", "setDataTextColor", "dataBackColor", "getDataBackColor", "setDataBackColor", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "iconResource", "Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "getIconResource", "()Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;", "setIconResource", "(Lru/ozon/uni/android/uikitsdk/resources/DrawableResource;)V", "iconColor", "getIconColor", "setIconColor", "iconGradient", "getIconGradient", "setIconGradient", "accessibilityContentDescription", "getAccessibilityContentDescription", "setAccessibilityContentDescription", "rounded", "getRounded$uni_release", "setRounded$uni_release", "goneTitle", "setGoneTitle", "titleView", "Lru/ozon/uni/android/controls/common/ButtonTextView;", "dataView", "iconView", "Lru/ozon/uni/android/controls/common/ButtonImageView;", "subtitleView", "loaderView", "Lru/ozon/uni/android/atom/loader/ui/LoaderView;", "Landroid/graphics/drawable/GradientDrawable;", "backgroundDrawable", "Landroid/graphics/drawable/GradientDrawable;", "foregroundDrawable", "", "getViewsOpacity", "()F", "viewsOpacity", "Landroid/text/TextUtils$TruncateAt;", "getTextEllipsize", "()Landroid/text/TextUtils$TruncateAt;", "textEllipsize", "Lru/ozon/uni/android/atom/loader/data/LoaderSize;", "getLoaderSize", "()Lru/ozon/uni/android/atom/loader/data/LoaderSize;", "loaderSize", "getMainTextStyle", "mainTextStyle", "getDataTextStyle", "dataTextStyle", "getCanLayoutSubtitle", "canLayoutSubtitle", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ButtonV3View extends ConstraintLayout implements AtomView, AtomLocatableView {
    private CharSequence accessibilityContentDescription;

    @NotNull
    private Color backColor;

    @NotNull
    private final GradientDrawable backgroundDrawable;

    /* renamed from: backgroundDrawableStrokeColor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j backgroundDrawableStrokeColor;
    private int dataBackColor;
    private CharSequence dataText;
    private int dataTextColor;
    private Color.Gradient dataTextGradient;
    private ButtonTextView dataView;
    private boolean disabled;

    @NotNull
    private final GradientDrawable foregroundDrawable;
    private boolean goneTitle;
    private Color.Solid hoverColor;
    private boolean hoverDisabled;
    private int iconColor;
    private Color.Gradient iconGradient;
    private DrawableResource iconResource;
    private ButtonImageView iconView;
    private LoaderView loaderView;

    @NotNull
    private String locatorTag;
    private boolean rounded;

    @NotNull
    private ButtonV3DTO.Sizes size;

    @NotNull
    private ButtonV3DTO.StyleTypes style;
    private CharSequence subtitle;
    private int subtitleColor;
    private Color.Gradient subtitleGradient;
    private ButtonTextView subtitleView;
    private CharSequence title;
    private int titleColor;
    private Color.Gradient titleGradient;

    @NotNull
    private final ButtonTextView titleView;
    private final int transparentColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\bX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000e\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u000f\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0010\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0011\u001a\u00020\rX\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0012\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/uni/android/controls/buttonV3/ButtonV3View$Companion;", "", "<init>", "()V", "GAP", "", "FOREGROUND_OPACITY", "DISABLED_OPACITY", "", "ENABLED_OPACITY", "ICON_MIN_WIDTH", "SUBTITLE_BOTTOM_PADDING_PX", "ELLPSIS", "", "TITLE_LOCATOR_TAG", "DATA_TEXT_LOCATOR_TAG", "SUBTITLE_LOCATOR_TAG", "ICON_LOCATOR_TAG", "CORNER_RADIUS_ROUNDED", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
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
            int[] iArr = new int[ButtonV3DTO.Sizes.values().length];
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_400.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_500.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_600.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[ButtonV3DTO.Sizes.SIZE_700.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public ButtonV3View(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 0, 12, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void _init_$lambda$9(ButtonV3View buttonV3View, View view, boolean z11) {
        FocusableStrokeConfigurator.INSTANCE.configureFocusableStroke$uni_release(buttonV3View.backgroundDrawable, buttonV3View.getBackgroundDrawableStrokeColor(), z11);
    }

    private final void applyStyle(int styleRes) {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        int[] ButtonV3View = R$styleable.ButtonV3View;
        Intrinsics.checkNotNullExpressionValue(ButtonV3View, "ButtonV3View");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(styleRes, ButtonV3View);
        Context context2 = getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        setBackColor(TypedArrayExtKt.getGradientOrColor(obtainStyledAttributes, context2, R$styleable.ButtonV3View_backgroundGradient, R$styleable.ButtonV3View_backgroundColor, this.transparentColor));
        setIconColor(obtainStyledAttributes.getColor(R$styleable.ButtonV3View_iconColor, this.transparentColor));
        setTitleColor(obtainStyledAttributes.getColor(R$styleable.ButtonV3View_titleTextColor, this.transparentColor));
        setSubtitleColor(obtainStyledAttributes.getColor(R$styleable.ButtonV3View_subtitleTextColor, this.transparentColor));
        this.dataBackColor = obtainStyledAttributes.getColor(R$styleable.ButtonV3View_dataBackgroundColor, this.transparentColor);
        setDataTextColor(obtainStyledAttributes.getColor(R$styleable.ButtonV3View_dataTextColor, this.transparentColor));
        obtainStyledAttributes.recycle();
    }

    private final void applyTextStyle() {
        ButtonTextView buttonTextView = this.titleView;
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(buttonTextView, context, getMainTextStyle());
        ButtonTextView buttonTextView2 = this.dataView;
        if (buttonTextView2 != null) {
            Context context2 = getContext();
            Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
            TextViewExtKt.applyStyle(buttonTextView2, context2, getDataTextStyle());
        }
    }

    private final ButtonTextView createDataView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        Context context2 = buttonTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(buttonTextView, context2, getDataTextStyle());
        buttonTextView.setTextColor(this.dataTextColor);
        this.dataView = buttonTextView;
        buttonTextView.setEllipsize(getTextEllipsize());
        StaticLocatorInitializer.INSTANCE.setStaticLocator$uni_release(this.dataView, "dataText", getLocatorTag());
        addView(this.dataView);
        return buttonTextView;
    }

    private final ButtonImageView createIconView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonImageView buttonImageView = new ButtonImageView(context, null, 0, 6, null);
        this.iconView = buttonImageView;
        StaticLocatorInitializer.INSTANCE.setStaticLocator$uni_release(buttonImageView, "icon", getLocatorTag());
        addView(this.iconView);
        return buttonImageView;
    }

    private final LoaderView createLoader() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        LoaderView loaderView = new LoaderView(context, null, 0, 6, null);
        if (loaderView.getId() == -1) {
            loaderView.setId(View.generateViewId());
        }
        loaderView.setLayoutParams(new ConstraintLayout.b(-2, -2));
        this.loaderView = loaderView;
        addView(loaderView);
        d dVar = new d();
        dVar.p(this);
        ConstraintSetExtKt.centerInParent(dVar, loaderView);
        dVar.f(this);
        return loaderView;
    }

    private final ButtonTextView createSubtitleView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        Context context2 = buttonTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context2, "getContext(...)");
        TextViewExtKt.applyStyle(buttonTextView, context2, R$style.OzonTextAppearance_Compact_400small);
        buttonTextView.setTextColor(this.subtitleColor);
        this.subtitleView = buttonTextView;
        buttonTextView.setEllipsize(getTextEllipsize());
        StaticLocatorInitializer.INSTANCE.setStaticLocator$uni_release(this.subtitleView, "subtitle", getLocatorTag());
        addView(this.subtitleView);
        return buttonTextView;
    }

    private final int getBackgroundDrawableStrokeColor() {
        return ((Number) this.backgroundDrawableStrokeColor.getValue()).intValue();
    }

    private final boolean getCanLayoutSubtitle() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()];
        if (i11 == 1 || i11 == 2) {
            return false;
        }
        if (i11 != 3 && i11 != 4) {
            throw new o();
        }
        CharSequence charSequence = this.dataText;
        return charSequence == null || charSequence.length() == 0;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final int getDataMinWidth() {
        TextPaint paint;
        ButtonTextView buttonTextView = this.dataView;
        return UiExtKt.toPx(this.size.getDataHorizontalPadding() * 2) + ((int) ((buttonTextView == null || (paint = buttonTextView.getPaint()) == null) ? 0.0f : paint.measureText("...")));
    }

    private final int getDataTextStyle() {
        return WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()] == 1 ? R$style.OzonTextAppearance_Body_400small : R$style.OzonTextAppearance_Body_500medium;
    }

    private final LoaderSize getLoaderSize() {
        return this.size == ButtonV3DTO.Sizes.SIZE_400 ? LoaderSize.LOADER_200 : LoaderSize.LOADER_300;
    }

    private final int getMainTextStyle() {
        return WhenMappings.$EnumSwitchMapping$0[this.size.ordinal()] == 1 ? R$style.OzonTextAppearance_BodyControl_400small : R$style.OzonTextAppearance_BodyControl_500medium;
    }

    private final TextUtils.TruncateAt getTextEllipsize() {
        FontSizeUtils fontSizeUtils = FontSizeUtils.INSTANCE;
        Resources resources = getResources();
        Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
        return fontSizeUtils.isFontScalingIncreased$uni_release(resources) ? TextUtils.TruncateAt.MIDDLE : TextUtils.TruncateAt.END;
    }

    private final float getViewsOpacity() {
        return this.disabled ? 0.4f : 1.0f;
    }

    private final void hideHover() {
        setForeground(null);
    }

    private final void layoutData(int dataViewId) {
        ConstraintLayoutExtKt.updateConstraints(this, new ButtonV3View$layoutData$1(dataViewId, this));
    }

    private final void layoutIconWithTitle(int iconViewId, boolean titleIsGone) {
        ConstraintLayoutExtKt.updateConstraints(this, new ButtonV3View$layoutIconWithTitle$1(this, titleIsGone, iconViewId));
    }

    private final void layoutSubtitle(int subtitleViewId) {
        ConstraintLayoutExtKt.updateConstraints(this, new ButtonV3View$layoutSubtitle$1(this, subtitleViewId));
    }

    private final void layoutTitle() {
        ConstraintLayoutExtKt.updateConstraints(this, new ButtonV3View$layoutTitle$1(this));
    }

    private final void setContentDescriptionForAccessibility(CharSequence title, CharSequence subtitle, CharSequence data) {
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            return;
        }
        CharSequence charSequence = this.accessibilityContentDescription;
        if (charSequence == null) {
            StringBuilder sb2 = new StringBuilder();
            if (title != null) {
                sb2.append(title);
            }
            if (subtitle != null) {
                sb2.append(", ");
                sb2.append(subtitle);
            }
            if (data != null) {
                sb2.append(", ");
                sb2.append(data);
            }
            charSequence = sb2.toString();
            Intrinsics.checkNotNullExpressionValue(charSequence, "toString(...)");
        }
        setContentDescription(charSequence);
    }

    private final void setGoneTitle(boolean z11) {
        if (this.goneTitle != z11) {
            this.goneTitle = z11;
            ButtonImageView buttonImageView = this.iconView;
            if (buttonImageView != null) {
                layoutIconWithTitle(buttonImageView.getId(), this.goneTitle);
            }
        }
    }

    private final void showHoverIfEnabled() {
        if (this.hoverDisabled) {
            return;
        }
        setForeground(this.foregroundDrawable);
    }

    private final ButtonTextView updateDataBackground() {
        ButtonTextView buttonTextView = this.dataView;
        if (buttonTextView == null) {
            return null;
        }
        ButtonV3DTO.Sizes sizes = this.size;
        if (sizes != ButtonV3DTO.Sizes.SIZE_600 && sizes != ButtonV3DTO.Sizes.SIZE_700) {
            buttonTextView.setBackground(null);
            return buttonTextView;
        }
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setColor(this.dataBackColor);
        gradientDrawable.setCornerRadius(UiExtKt.toPxF(this.rounded ? 99 : this.size.getDataCornerRadius()));
        buttonTextView.setBackground(gradientDrawable);
        int px = UiExtKt.toPx(this.size.getDataHorizontalPadding());
        int px2 = UiExtKt.toPx(this.size.getDataVerticalPadding());
        buttonTextView.setPadding(px, px2, px, px2);
        return buttonTextView;
    }

    public final boolean getDisabled() {
        return this.disabled;
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    @NotNull
    public String getLocatorTag() {
        return this.locatorTag;
    }

    @NotNull
    public final ButtonV3DTO.Sizes getSize() {
        return this.size;
    }

    @NotNull
    public final ButtonV3DTO.StyleTypes getStyle() {
        return this.style;
    }

    public final CharSequence getTitle() {
        return this.title;
    }

    public final int getTitleColor() {
        return this.titleColor;
    }

    public final void hideLoader() {
        ButtonTextView buttonTextView;
        ButtonTextView buttonTextView2;
        CharSequence charSequence;
        ButtonImageView buttonImageView;
        LoaderView loaderView = this.loaderView;
        if (loaderView != null) {
            ViewExtKt.gone(loaderView);
        }
        if (this.iconResource != null && (((charSequence = this.dataText) == null || charSequence.length() == 0) && (buttonImageView = this.iconView) != null)) {
            ViewExtKt.show(buttonImageView);
        }
        CharSequence charSequence2 = this.title;
        if (charSequence2 != null && charSequence2.length() != 0) {
            ViewExtKt.show(this.titleView);
        }
        CharSequence charSequence3 = this.subtitle;
        if (charSequence3 != null && charSequence3.length() != 0 && getCanLayoutSubtitle() && (buttonTextView2 = this.subtitleView) != null) {
            ViewExtKt.show(buttonTextView2);
        }
        CharSequence charSequence4 = this.dataText;
        if (charSequence4 == null || charSequence4.length() == 0 || (buttonTextView = this.dataView) == null) {
            return;
        }
        ViewExtKt.show(buttonTextView);
    }

    @Override // android.view.View
    public void onInitializeAccessibilityNodeInfo(AccessibilityNodeInfo info) {
        super.onInitializeAccessibilityNodeInfo(info);
        if (info != null) {
            info.setClassName("android.widget.Button");
        }
    }

    @Override // androidx.constraintlayout.widget.ConstraintLayout, android.view.View
    protected void onMeasure(int widthMeasureSpec, int heightMeasureSpec) {
        ButtonImageView buttonImageView;
        Drawable drawable;
        int px = UiExtKt.toPx(this.size.getHeight());
        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(px, 1073741824);
        int size = View.MeasureSpec.getSize(widthMeasureSpec);
        if (size != 0 && size <= px) {
            widthMeasureSpec = View.MeasureSpec.makeMeasureSpec(px, 1073741824);
        }
        if (size != 0 && (buttonImageView = this.iconView) != null && buttonImageView.getVisibility() == 0) {
            ButtonImageView buttonImageView2 = this.iconView;
            setGoneTitle(size <= UiExtKt.toPx(this.size.getHorizontalMargin() * 2) + ((buttonImageView2 == null || (drawable = buttonImageView2.getDrawable()) == null) ? UiExtKt.toPx(16) : drawable.getMinimumWidth()));
        }
        super.onMeasure(widthMeasureSpec, makeMeasureSpec);
    }

    @Override // android.view.View
    public boolean onTouchEvent(MotionEvent event) {
        if (this.disabled) {
            return super.onTouchEvent(event);
        }
        Integer valueOf = event != null ? Integer.valueOf(event.getAction()) : null;
        if ((valueOf != null && valueOf.intValue() == 0) || (valueOf != null && valueOf.intValue() == 2)) {
            showHoverIfEnabled();
        } else if (valueOf != null && valueOf.intValue() == 1) {
            hideHover();
            performClick();
        } else if (valueOf != null && valueOf.intValue() == 3) {
            hideHover();
        }
        return true;
    }

    public final void setAccessibilityContentDescription(CharSequence charSequence) {
        this.accessibilityContentDescription = charSequence;
        setContentDescriptionForAccessibility(this.title, this.subtitle, this.dataText);
    }

    public final void setBackColor(@NotNull Color value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.backColor = value;
        value.applyTo(this.backgroundDrawable);
    }

    public final void setDataBackColor(int i11) {
        this.dataBackColor = i11;
    }

    public final void setDataText(CharSequence charSequence) {
        this.dataText = charSequence;
        if (charSequence == null || charSequence.length() == 0) {
            ButtonTextView buttonTextView = this.dataView;
            if (buttonTextView != null) {
                ViewExtKt.gone(buttonTextView);
            }
            ConstraintLayoutExtKt.updateConstraints(this, new ButtonV3View$dataText$2(this));
            setContentDescriptionForAccessibility(this.title, this.subtitle, null);
            return;
        }
        ButtonTextView buttonTextView2 = this.dataView;
        if (buttonTextView2 == null) {
            buttonTextView2 = createDataView();
        }
        buttonTextView2.setVisibility(0);
        buttonTextView2.setText(this.dataText);
        buttonTextView2.setAlpha(getViewsOpacity());
        Color.Gradient gradient = this.dataTextGradient;
        if (gradient != null) {
            setDataTextGradient(gradient);
        } else {
            setDataTextColor(this.dataTextColor);
        }
        updateDataBackground();
        layoutData(buttonTextView2.getId());
        setContentDescriptionForAccessibility(this.title, this.subtitle, charSequence);
    }

    public final void setDataTextColor(int i11) {
        this.dataTextColor = i11;
        setDataTextGradient(null);
        ButtonTextView buttonTextView = this.dataView;
        if (buttonTextView != null) {
            buttonTextView.setTextColor(this.dataTextColor);
        }
    }

    public final void setDataTextGradient(Color.Gradient gradient) {
        this.dataTextGradient = gradient;
        ButtonTextView buttonTextView = this.dataView;
        if (buttonTextView != null) {
            buttonTextView.setTextGradient(gradient);
        }
        invalidate();
    }

    public final void setDisabled(boolean z11) {
        this.disabled = z11;
        if (!z11) {
            this.titleView.setAlpha(1.0f);
        } else {
            applyStyle(ru.ozon.uni.R$style.ButtonV3View_Disabled);
            this.titleView.setAlpha(0.4f);
        }
    }

    public final void setHoverColor(Color.Solid solid) {
        this.hoverColor = solid;
        if (solid != null) {
            solid.applyTo(this.foregroundDrawable);
            this.foregroundDrawable.setAlpha(26);
        }
        invalidate();
    }

    public final void setHoverDisabled(boolean z11) {
        this.hoverDisabled = z11;
    }

    public final void setIconColor(int i11) {
        this.iconColor = i11;
        setIconGradient(null);
        ButtonImageView buttonImageView = this.iconView;
        if (buttonImageView != null) {
            buttonImageView.setIconColor(this.iconColor);
        }
    }

    public final void setIconGradient(Color.Gradient gradient) {
        this.iconGradient = gradient;
        ButtonImageView buttonImageView = this.iconView;
        if (buttonImageView != null) {
            buttonImageView.setGraphicGradient(gradient);
        }
    }

    public final void setIconResource(DrawableResource drawableResource) {
        this.iconResource = drawableResource;
        CharSequence charSequence = this.dataText;
        if ((charSequence != null && charSequence.length() != 0) || this.iconResource == null) {
            ButtonImageView buttonImageView = this.iconView;
            if (buttonImageView != null) {
                ViewExtKt.gone(buttonImageView);
            }
            ConstraintLayoutExtKt.updateConstraints(this, new ButtonV3View$iconResource$2(this));
            return;
        }
        ButtonImageView buttonImageView2 = this.iconView;
        if (buttonImageView2 == null) {
            buttonImageView2 = createIconView();
        }
        buttonImageView2.setVisibility(0);
        buttonImageView2.setAlpha(getViewsOpacity());
        buttonImageView2.setDrawableResource(this.iconResource);
        Color.Gradient gradient = this.iconGradient;
        if (gradient == null) {
            buttonImageView2.setIconColor(this.iconColor);
        } else {
            setIconGradient(gradient);
        }
        layoutIconWithTitle(buttonImageView2.getId(), this.goneTitle);
    }

    @Override // ru.ozon.uni.atoms.utils.AtomLocatableView
    public void setLocatorTag(@NotNull String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.locatorTag = value;
        if (UniGlobalConfig.INSTANCE.getTestTagsAsContentDescription()) {
            setContentDescription(this.locatorTag);
        }
        StaticLocatorInitializer.INSTANCE.setStaticLocators$uni_release(U.j(new Pair(this.titleView, SelectionItemFormDTO.TITLE_FIELD_NAME), new Pair(this.subtitleView, "subtitle"), new Pair(this.iconView, "icon"), new Pair(this.dataView, "dataText")), this.locatorTag);
    }

    public final void setRounded$uni_release(boolean z11) {
        this.rounded = z11;
    }

    public final void setSize(@NotNull ButtonV3DTO.Sizes value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.size = value;
        float pxF = UiExtKt.toPxF(this.rounded ? 99 : value.getCornerRadius());
        this.foregroundDrawable.setCornerRadius(pxF);
        GradientDrawable gradientDrawable = this.backgroundDrawable;
        gradientDrawable.setCornerRadius(pxF);
        setBackground(gradientDrawable);
        applyTextStyle();
    }

    public final void setStyle(@NotNull ButtonV3DTO.StyleTypes value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.style = value;
        if (this.disabled) {
            return;
        }
        try {
            applyStyle(ButtonV3DTOKt.getStyleTypesResource(value));
        } catch (UnsupportedOperationException unused) {
            applyStyle(ru.ozon.uni.R$style.ButtonV3View_ActionPrimary);
        }
    }

    public final void setSubtitle(CharSequence charSequence) {
        this.subtitle = charSequence;
        if (charSequence == null || charSequence.length() == 0 || !getCanLayoutSubtitle()) {
            ButtonTextView buttonTextView = this.subtitleView;
            if (buttonTextView != null) {
                ViewExtKt.gone(buttonTextView);
            }
            setContentDescriptionForAccessibility(this.title, null, this.dataText);
            return;
        }
        ButtonTextView buttonTextView2 = this.subtitleView;
        if (buttonTextView2 == null) {
            buttonTextView2 = createSubtitleView();
        }
        buttonTextView2.setText(this.subtitle);
        buttonTextView2.setVisibility(0);
        buttonTextView2.setAlpha(getViewsOpacity());
        setSubtitleGradient(this.subtitleGradient);
        layoutSubtitle(buttonTextView2.getId());
        setContentDescriptionForAccessibility(this.title, charSequence, this.dataText);
    }

    public final void setSubtitleColor(int i11) {
        this.subtitleColor = i11;
        setSubtitleGradient(null);
        ButtonTextView buttonTextView = this.subtitleView;
        if (buttonTextView != null) {
            buttonTextView.setTextColor(this.subtitleColor);
        }
    }

    public final void setSubtitleGradient(Color.Gradient gradient) {
        this.subtitleGradient = gradient;
        ButtonTextView buttonTextView = this.subtitleView;
        if (buttonTextView != null) {
            buttonTextView.setTextGradient(gradient);
        }
        invalidate();
    }

    public final void setTitle(CharSequence charSequence) {
        this.title = charSequence;
        this.titleView.setText(charSequence);
        setContentDescriptionForAccessibility(charSequence, this.subtitle, this.dataText);
    }

    public final void setTitleColor(int i11) {
        this.titleColor = i11;
        setTitleGradient(null);
        this.titleView.setTextColor(this.titleColor);
        this.foregroundDrawable.setColor(this.titleColor);
    }

    public final void setTitleGradient(Color.Gradient gradient) {
        this.titleGradient = gradient;
        this.titleView.setTextGradient(gradient);
        invalidate();
    }

    @NotNull
    public final LoaderView showLoader() {
        ButtonTextView buttonTextView;
        ButtonTextView buttonTextView2;
        ButtonImageView buttonImageView;
        LoaderView loaderView = this.loaderView;
        if (loaderView == null) {
            loaderView = createLoader();
        }
        loaderView.setLoaderSize(getLoaderSize());
        loaderView.setColor(this.titleColor);
        ButtonImageView buttonImageView2 = this.iconView;
        if (buttonImageView2 != null && buttonImageView2.getVisibility() == 0 && (buttonImageView = this.iconView) != null) {
            ViewExtKt.hide(buttonImageView);
        }
        if (this.titleView.getVisibility() == 0) {
            ViewExtKt.hide(this.titleView);
        }
        ButtonTextView buttonTextView3 = this.subtitleView;
        if (buttonTextView3 != null && buttonTextView3.getVisibility() == 0 && (buttonTextView2 = this.subtitleView) != null) {
            ViewExtKt.hide(buttonTextView2);
        }
        ButtonTextView buttonTextView4 = this.dataView;
        if (buttonTextView4 != null && buttonTextView4.getVisibility() == 0 && (buttonTextView = this.dataView) != null) {
            ViewExtKt.hide(buttonTextView);
        }
        ViewExtKt.show(loaderView);
        return loaderView;
    }

    public /* synthetic */ ButtonV3View(Context context, AttributeSet attributeSet, int i11, int i12, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i13 & 2) != 0 ? null : attributeSet, (i13 & 4) != 0 ? 0 : i11, (i13 & 8) != 0 ? ru.ozon.uni.R$style.ButtonV3View_ActionPrimary_Dynamic : i12);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ButtonV3View(@NotNull Context context, AttributeSet attributeSet, int i11, int i12) {
        super(context, attributeSet, i11, i12);
        Intrinsics.checkNotNullParameter(context, "context");
        this.locatorTag = "buttonV3";
        int color = a.getColor(context, R.color.transparent);
        this.transparentColor = color;
        ButtonV3DTO.Sizes sizes = ButtonV3DTO.Sizes.SIZE_500;
        this.size = sizes;
        this.style = ButtonV3DTO.StyleTypes.ACTION_PRIMARY;
        this.backColor = new Color.Solid(color);
        this.backgroundDrawableStrokeColor = k.b(new ButtonV3View$backgroundDrawableStrokeColor$2(context));
        this.titleColor = color;
        this.subtitleColor = color;
        this.dataTextColor = color;
        this.dataBackColor = color;
        this.iconColor = color;
        this.rounded = UniGlobalConfigKt.getRoundCornersFlag(context);
        ButtonTextView buttonTextView = new ButtonTextView(context, null, 0, 6, null);
        buttonTextView.setEllipsize(getTextEllipsize());
        addView(buttonTextView);
        StaticLocatorInitializer.INSTANCE.setStaticLocator$uni_release(buttonTextView, SelectionItemFormDTO.TITLE_FIELD_NAME, getLocatorTag());
        this.titleView = buttonTextView;
        this.backgroundDrawable = new GradientDrawable();
        GradientDrawable gradientDrawable = new GradientDrawable();
        gradientDrawable.setAlpha(26);
        this.foregroundDrawable = gradientDrawable;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.ButtonV3View, i11, i12);
        setSize(((ButtonV3DTO.Sizes[]) ButtonV3DTO.Sizes.getEntries().toArray(new ButtonV3DTO.Sizes[0]))[obtainStyledAttributes.getInt(R$styleable.ButtonV3View_size, sizes.ordinal())]);
        setTitle(obtainStyledAttributes.getText(R$styleable.ButtonV3View_titleText));
        CharSequence text = obtainStyledAttributes.getText(R$styleable.ButtonV3View_dataText);
        CharSequence text2 = obtainStyledAttributes.getText(R$styleable.ButtonV3View_subtitleText);
        int resourceId = obtainStyledAttributes.getResourceId(R$styleable.ButtonV3View_android_src, 0);
        layoutTitle();
        setDataText(text);
        if (resourceId != 0) {
            DrawableResource.Companion companion = DrawableResource.INSTANCE;
            Resources resources = obtainStyledAttributes.getResources();
            Intrinsics.checkNotNullExpressionValue(resources, "getResources(...)");
            setIconResource(companion.fromResources(resources, resourceId));
        }
        setSubtitle(text2);
        obtainStyledAttributes.recycle();
        try {
            applyStyle(i12);
        } catch (UnsupportedOperationException unused) {
            applyStyle(ru.ozon.uni.R$style.ButtonV3View_ActionPrimary);
        }
        if (TVExtKt.isAppOpenOnTV(context)) {
            ViewExtKt.enableFocusable(this);
            setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: zk0.a
                @Override // android.view.View.OnFocusChangeListener
                public final void onFocusChange(View view, boolean z11) {
                    ButtonV3View._init_$lambda$9(ButtonV3View.this, view, z11);
                }
            });
        }
        if (getId() == -1) {
            setId(View.generateViewId());
        }
        setBackground(this.backgroundDrawable);
    }
}
