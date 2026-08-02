package ru.ozon.uni.android.textArea;

import Hk0.c;
import Sc.o;
import Xc.a;
import Xc.b;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.graphics.Paint;
import android.graphics.PorterDuff;
import android.text.Editable;
import android.text.InputFilter;
import android.text.TextUtils;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ContextThemeWrapper;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.appcompat.widget.AppCompatTextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import fd.InterfaceC6512o;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$drawable;
import ru.ozon.uni.R$id;
import ru.ozon.uni.R$style;
import ru.ozon.uni.R$styleable;
import ru.ozon.uni.android.input.textinput.ui.OzonTextInput;
import ru.ozon.uni.android.textArea.TextAreaView;
import ru.ozon.uni.android.textArea.common.CounterView;
import ru.ozon.uni.android.textArea.common.InfoIconView;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.extensions.view.ViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.TextViewExtKt;
import ru.ozon.uni.android.uikitsdk.ext.UiExtKt;
import ru.ozon.uni.atoms.html.OzonHtmlParser;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.UniColors;
import ru.ozon.uni.core.UniTextStyles;
import y7.C10856g;

@Metadata(d1 = {"\u0000\u009c\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0007\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000e\n\u0002\u0010\u000b\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0015\n\u0002\u0010\r\n\u0002\b\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000e\n\u0002\b\u0017\n\u0002\u0010\u0007\n\u0002\b\r\b\u0007\u0018\u0000 ·\u00012\u00020\u0001:\u0006·\u0001¸\u0001¹\u0001B'\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ/\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\n\u001a\u00020\u00062\u0006\u0010\u000b\u001a\u00020\u00062\u0006\u0010\f\u001a\u00020\u00062\u0006\u0010\r\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0017\u0010\u0013J\u000f\u0010\u0019\u001a\u00020\u0018H\u0002¢\u0006\u0004\b\u0019\u0010\u001aJ\u000f\u0010\u001c\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001dJ\u000f\u0010\u001f\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u001f\u0010 J\u0011\u0010!\u001a\u0004\u0018\u00010\u0011H\u0002¢\u0006\u0004\b!\u0010\u0013J\u000f\u0010\"\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\"\u0010 J\u000f\u0010#\u001a\u00020\u000eH\u0002¢\u0006\u0004\b#\u0010 J\u0011\u0010$\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b$\u0010%J\u0011\u0010&\u001a\u0004\u0018\u00010\u000eH\u0002¢\u0006\u0004\b&\u0010%J\u0017\u0010)\u001a\u00020\u000e2\u0006\u0010(\u001a\u00020'H\u0002¢\u0006\u0004\b)\u0010*J\u0017\u0010-\u001a\u00020\u000e2\u0006\u0010,\u001a\u00020+H\u0002¢\u0006\u0004\b-\u0010.J\u000f\u0010/\u001a\u00020\u000eH\u0002¢\u0006\u0004\b/\u0010 J\u000f\u00100\u001a\u00020\u000eH\u0002¢\u0006\u0004\b0\u0010 R*\u0010(\u001a\u00020'2\u0006\u00101\u001a\u00020'8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b(\u00102\u001a\u0004\b3\u00104\"\u0004\b5\u0010*R*\u0010,\u001a\u00020+2\u0006\u00101\u001a\u00020+8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b,\u00106\u001a\u0004\b7\u00108\"\u0004\b9\u0010.R*\u0010;\u001a\u00020:2\u0006\u00101\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>\"\u0004\b?\u0010@R*\u0010A\u001a\u00020:2\u0006\u00101\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bA\u0010<\u001a\u0004\bB\u0010>\"\u0004\bC\u0010@R*\u0010D\u001a\u00020:2\u0006\u00101\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bD\u0010<\u001a\u0004\bD\u0010>\"\u0004\bE\u0010@R*\u0010F\u001a\u00020:2\u0006\u00101\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bF\u0010<\u001a\u0004\bF\u0010>\"\u0004\bG\u0010@R$\u0010H\u001a\u00020:2\u0006\u00101\u001a\u00020:8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\bH\u0010<\"\u0004\bI\u0010@R(\u0010K\u001a\b\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bK\u0010L\u001a\u0004\bM\u0010N\"\u0004\bO\u0010PR*\u0010Q\u001a\u00020:2\u0006\u00101\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bQ\u0010<\u001a\u0004\bR\u0010>\"\u0004\bS\u0010@R(\u0010T\u001a\b\u0012\u0004\u0012\u00020\u000e0J8\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\bT\u0010L\u001a\u0004\bU\u0010N\"\u0004\bV\u0010PR*\u0010W\u001a\u00020:2\u0006\u00101\u001a\u00020:8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bW\u0010<\u001a\u0004\bX\u0010>\"\u0004\bY\u0010@R*\u0010Z\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bZ\u0010[\u001a\u0004\b\\\u0010]\"\u0004\b^\u0010_R.\u0010a\u001a\u0004\u0018\u00010`2\b\u00101\u001a\u0004\u0018\u00010`8\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\ba\u0010b\u001a\u0004\bc\u0010d\"\u0004\be\u0010fR*\u0010g\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068\u0006@FX\u0086\u000e¢\u0006\u0012\n\u0004\bg\u0010[\u001a\u0004\bh\u0010]\"\u0004\bi\u0010_R.\u0010j\u001a\u0004\u0018\u00010\u00062\b\u00101\u001a\u0004\u0018\u00010\u00068\u0006@FX\u0087\u000e¢\u0006\u0012\n\u0004\bj\u0010k\u001a\u0004\bl\u0010m\"\u0004\bn\u0010oR\u0014\u0010p\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010[R\u0014\u0010q\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bq\u0010[R\u0014\u0010r\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010[R\u0014\u0010s\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bs\u0010[R\u0014\u0010t\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010[R\u0014\u0010u\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bu\u0010[R\u0014\u0010v\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bv\u0010[R\u0014\u0010w\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010[R\u0014\u0010x\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bx\u0010[R\u0014\u0010y\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\by\u0010[R\u0014\u0010z\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bz\u0010[R\u0014\u0010{\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b{\u0010[R\u0014\u0010|\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b|\u0010[R\u0014\u0010}\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b}\u0010[R\u0014\u0010~\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b~\u0010[R\u0017\u0010\u0080\u0001\u001a\u00020\u007f8\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0080\u0001\u0010\u0081\u0001R\u0018\u0010\u0083\u0001\u001a\u00030\u0082\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0083\u0001\u0010\u0084\u0001R\u0018\u0010\u0086\u0001\u001a\u00030\u0085\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0086\u0001\u0010\u0087\u0001R\u0018\u0010\u0089\u0001\u001a\u00030\u0088\u00018\u0002X\u0082\u0004¢\u0006\b\n\u0006\b\u0089\u0001\u0010\u008a\u0001R\u001b\u0010\u008b\u0001\u001a\u0004\u0018\u00010\u00148\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008b\u0001\u0010\u008c\u0001R\u001b\u0010\u008d\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008d\u0001\u0010\u008e\u0001R\u001b\u0010\u008f\u0001\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u008f\u0001\u0010\u008e\u0001R\u001b\u0010\u0090\u0001\u001a\u0004\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\b\n\u0006\b\u0090\u0001\u0010\u0091\u0001R+\u0010\u0094\u0001\u001a\u0004\u0018\u00010\u00062\b\u00101\u001a\u0004\u0018\u00010\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u0092\u0001\u0010m\"\u0005\b\u0093\u0001\u0010oR/\u0010\u009a\u0001\u001a\u0005\u0018\u00010\u0095\u00012\t\u00101\u001a\u0005\u0018\u00010\u0095\u00018F@FX\u0086\u000e¢\u0006\u0010\u001a\u0006\b\u0096\u0001\u0010\u0097\u0001\"\u0006\b\u0098\u0001\u0010\u0099\u0001R\u0013\u0010\u009c\u0001\u001a\u00020\u00068F¢\u0006\u0007\u001a\u0005\b\u009b\u0001\u0010]R\u0013\u0010\u009e\u0001\u001a\u00020:8F¢\u0006\u0007\u001a\u0005\b\u009d\u0001\u0010>R'\u0010¡\u0001\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b\u009f\u0001\u0010]\"\u0005\b \u0001\u0010_R'\u0010¤\u0001\u001a\u00020\u00062\u0006\u00101\u001a\u00020\u00068F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¢\u0001\u0010]\"\u0005\b£\u0001\u0010_R'\u0010§\u0001\u001a\u00020:2\u0006\u00101\u001a\u00020:8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¥\u0001\u0010>\"\u0005\b¦\u0001\u0010@R+\u0010ª\u0001\u001a\u0004\u0018\u00010`2\b\u00101\u001a\u0004\u0018\u00010`8F@FX\u0086\u000e¢\u0006\u000e\u001a\u0005\b¨\u0001\u0010d\"\u0005\b©\u0001\u0010fR\u0016\u0010¬\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b«\u0001\u0010]R\u0018\u0010°\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b®\u0001\u0010¯\u0001R\u0018\u0010²\u0001\u001a\u00030\u00ad\u00018BX\u0082\u0004¢\u0006\b\u001a\u0006\b±\u0001\u0010¯\u0001R\u0016\u0010´\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\b³\u0001\u0010]R\u0016\u0010¶\u0001\u001a\u00020\u00068BX\u0082\u0004¢\u0006\u0007\u001a\u0005\bµ\u0001\u0010]¨\u0006º\u0001"}, d2 = {"Lru/ozon/uni/android/textArea/TextAreaView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "left", "top", "right", "bottom", "", "setPadding", "(IIII)V", "Landroidx/appcompat/widget/AppCompatTextView;", "createLabelView", "()Landroidx/appcompat/widget/AppCompatTextView;", "Landroidx/appcompat/widget/AppCompatImageView;", "createActionIcon", "()Landroidx/appcompat/widget/AppCompatImageView;", "createCaptionView", "Lru/ozon/uni/android/textArea/common/CounterView;", "createCounterView", "()Lru/ozon/uni/android/textArea/common/CounterView;", "Landroidx/constraintlayout/widget/ConstraintLayout$b;", "getCaptionLayoutParams", "()Landroidx/constraintlayout/widget/ConstraintLayout$b;", "getBackgroundViewLayoutParams", "layoutInputState", "()V", "updateLabelLayoutParams", "updateInputLayoutParams", "updateIconInfoLayoutParams", "updateIconActionLayoutParams", "()Lkotlin/Unit;", "updateCounterLayoutParams", "Lru/ozon/uni/android/textArea/TextAreaView$State;", "state", "changeState", "(Lru/ozon/uni/android/textArea/TextAreaView$State;)V", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "status", "changeStatus", "(Lru/ozon/uni/android/textArea/TextAreaView$Status;)V", "updateCaption", "copyInputText", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Lru/ozon/uni/android/textArea/TextAreaView$State;", "getState", "()Lru/ozon/uni/android/textArea/TextAreaView$State;", "setState", "Lru/ozon/uni/android/textArea/TextAreaView$Status;", "getStatus", "()Lru/ozon/uni/android/textArea/TextAreaView$Status;", "setStatus", "", "hasBottomBar", "Z", "getHasBottomBar", "()Z", "setHasBottomBar", "(Z)V", "hasInfoIcon", "getHasInfoIcon", "setHasInfoIcon", "isDeleteAllButtonAllowed", "setDeleteAllButtonAllowed", "isCaptionTagSupported", "setCaptionTagSupported", "isInfoIconVisible", "setInfoIconVisible", "Lkotlin/Function0;", "infoClickListener", "Lkotlin/jvm/functions/Function0;", "getInfoClickListener", "()Lkotlin/jvm/functions/Function0;", "setInfoClickListener", "(Lkotlin/jvm/functions/Function0;)V", "hasActionIcon", "getHasActionIcon", "setHasActionIcon", "actionClickListener", "getActionClickListener", "setActionClickListener", "hasCounter", "getHasCounter", "setHasCounter", "maxLength", "I", "getMaxLength", "()I", "setMaxLength", "(I)V", "", "caption", "Ljava/lang/CharSequence;", "getCaption", "()Ljava/lang/CharSequence;", "setCaption", "(Ljava/lang/CharSequence;)V", "captionMaxLines", "getCaptionMaxLines", "setCaptionMaxLines", "captionColor", "Ljava/lang/Integer;", "getCaptionColor", "()Ljava/lang/Integer;", "setCaptionColor", "(Ljava/lang/Integer;)V", "defaultMargin", "marginTextToInfo", "smallMargin", "gapMargin", "iconLockMargin", "captionMargin", "iconColorDefault", "successColor", "activeColor", "errorColor", "borderColor", "bgFillColor", "inputTextColor", "commonTextColor", "errorTextColor", "Ly7/g;", "borderDrawable", "Ly7/g;", "Landroid/view/View;", "inputBgView", "Landroid/view/View;", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "inputView", "Lru/ozon/uni/android/input/textinput/ui/OzonTextInput;", "Lru/ozon/uni/android/textArea/common/InfoIconView;", "infoIconView", "Lru/ozon/uni/android/textArea/common/InfoIconView;", "actionIconView", "Landroidx/appcompat/widget/AppCompatImageView;", "captionView", "Landroidx/appcompat/widget/AppCompatTextView;", "labelView", "counterView", "Lru/ozon/uni/android/textArea/common/CounterView;", "getCurrentCountColor", "setCurrentCountColor", "currentCountColor", "", "getInputText", "()Ljava/lang/String;", "setInputText", "(Ljava/lang/String;)V", "inputText", "getInputTextLenght", "inputTextLenght", "getInputHasFocus", "inputHasFocus", "getMinLines", "setMinLines", "minLines", "getMaxLines", "setMaxLines", "maxLines", "getScrollbarEnabled", "setScrollbarEnabled", "scrollbarEnabled", "getLabel", "setLabel", "label", "getTextToInfoPadding", "textToInfoPadding", "", "getCommonTextAlpha", "()F", "commonTextAlpha", "getBorderWidth", "borderWidth", "getBorderStrokeColor", "borderStrokeColor", "getLockIcon", "lockIcon", "Companion", "State", "Status", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TextAreaView extends ConstraintLayout {

    @NotNull
    private Function0<Unit> actionClickListener;
    private AppCompatImageView actionIconView;
    private final int activeColor;
    private final int bgFillColor;
    private final int borderColor;

    @NotNull
    private final C10856g borderDrawable;
    private CharSequence caption;
    private Integer captionColor;
    private final int captionMargin;
    private int captionMaxLines;
    private AppCompatTextView captionView;
    private final int commonTextColor;
    private CounterView counterView;
    private final int defaultMargin;
    private final int errorColor;
    private final int errorTextColor;
    private final int gapMargin;
    private boolean hasActionIcon;
    private boolean hasBottomBar;
    private boolean hasCounter;
    private boolean hasInfoIcon;
    private final int iconColorDefault;
    private final int iconLockMargin;

    @NotNull
    private Function0<Unit> infoClickListener;

    @NotNull
    private final InfoIconView infoIconView;

    @NotNull
    private final View inputBgView;
    private final int inputTextColor;

    @NotNull
    private final OzonTextInput inputView;
    private boolean isCaptionTagSupported;
    private boolean isDeleteAllButtonAllowed;
    private boolean isInfoIconVisible;
    private AppCompatTextView labelView;
    private final int marginTextToInfo;
    private int maxLength;
    private final int smallMargin;

    @NotNull
    private State state;

    @NotNull
    private Status status;
    private final int successColor;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\r\n\u0002\u0010\b\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0010\u0007\n\u0002\b\u0011\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J9\u0010\u000b\u001a\u00020\n*\u00020\u00042&\u0010\t\u001a\"\u0012\u0006\u0012\u0004\u0018\u00010\u0006\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b0\u0005¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\r\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u0014\u0010\u000f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u000f\u0010\u000eR\u0014\u0010\u0010\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0010\u0010\u000eR\u0014\u0010\u0011\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0011\u0010\u000eR\u0014\u0010\u0012\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0014\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0014\u0010\u0015R\u0014\u0010\u0016\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0016\u0010\u0015R\u0014\u0010\u0017\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0017\u0010\u0015R\u0014\u0010\u0018\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0018\u0010\u0015R\u0014\u0010\u0019\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u0019\u0010\u0015R\u0014\u0010\u001a\u001a\u00020\u00138\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001a\u0010\u0015R\u0014\u0010\u001b\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001b\u0010\u000eR\u0014\u0010\u001c\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001c\u0010\u000eR\u0014\u0010\u001d\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001d\u0010\u000eR\u0014\u0010\u001e\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001e\u0010\u000eR\u0014\u0010\u001f\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\u001f\u0010\u000eR\u0014\u0010 \u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b \u0010\u000eR\u0014\u0010!\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b!\u0010\u000eR\u0014\u0010\"\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b\"\u0010\u000eR\u0014\u0010#\u001a\u00020\u00078\u0002X\u0082T¢\u0006\u0006\n\u0004\b#\u0010\u000e¨\u0006$"}, d2 = {"Lru/ozon/uni/android/textArea/TextAreaView$Companion;", "", "<init>", "()V", "Lru/ozon/uni/android/textArea/TextAreaView;", "Lkotlin/Function4;", "", "", "", "action", "Landroid/text/TextWatcher;", "doOnTextChanged", "(Lru/ozon/uni/android/textArea/TextAreaView;Lfd/o;)Landroid/text/TextWatcher;", "MIN_HEIGHT", "I", "MIN_LINES_DEFAULT", "MAX_LINES_DEFAULT", "CAPTION_MAX_LINES", "CORNER_SIZE", "", "ALPHA_DISABLED", "F", "ALPHA_DEFAULT", "ALPHA_OPAQUE", "BIASS_START", "BIASS_CENTER", "BIASS_END", "MARGIN_DEFAULT", "MARGIN_SMALL", "ICON_MARGIN_TOP", "CAPTION_MARGIN_TOP", "GAP", "MARGIN_XS", "MARGIN_TEXT_TO_INFO", "BORDER_WIDTH_DEFAULT", "BORDER_WIDTH_ACTIVE", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final TextWatcher doOnTextChanged(@NotNull TextAreaView textAreaView, @NotNull final InterfaceC6512o<? super CharSequence, ? super Integer, ? super Integer, ? super Integer, Unit> action) {
            Intrinsics.checkNotNullParameter(textAreaView, "<this>");
            Intrinsics.checkNotNullParameter(action, "action");
            OzonTextInput ozonTextInput = textAreaView.inputView;
            TextWatcher textWatcher = new TextWatcher() { // from class: ru.ozon.uni.android.textArea.TextAreaView$Companion$doOnTextChanged$$inlined$doOnTextChanged$1
                @Override // android.text.TextWatcher
                public void afterTextChanged(Editable s11) {
                }

                @Override // android.text.TextWatcher
                public void beforeTextChanged(CharSequence text, int start, int count, int after) {
                }

                @Override // android.text.TextWatcher
                public void onTextChanged(CharSequence text, int start, int before, int count) {
                    InterfaceC6512o.this.invoke(text, Integer.valueOf(start), Integer.valueOf(before), Integer.valueOf(count));
                }
            };
            ozonTextInput.addTextChangedListener(textWatcher);
            return textWatcher;
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/uni/android/textArea/TextAreaView$State;", "", "<init>", "(Ljava/lang/String;I)V", "DEFAULT", "ACTIVE", "DISABLED", "READ_ONLY", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class State {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ State[] $VALUES;
        public static final State DEFAULT = new State("DEFAULT", 0);
        public static final State ACTIVE = new State("ACTIVE", 1);
        public static final State DISABLED = new State("DISABLED", 2);
        public static final State READ_ONLY = new State("READ_ONLY", 3);

        private static final /* synthetic */ State[] $values() {
            return new State[]{DEFAULT, ACTIVE, DISABLED, READ_ONLY};
        }

        static {
            State[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private State(String str, int i11) {
        }

        @NotNull
        public static a<State> getEntries() {
            return $ENTRIES;
        }

        public static State valueOf(String str) {
            return (State) Enum.valueOf(State.class, str);
        }

        public static State[] values() {
            return (State[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/uni/android/textArea/TextAreaView$Status;", "", "<init>", "(Ljava/lang/String;I)V", "NEUTRAL", "SUCCESS", "ERROR", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Status {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Status[] $VALUES;
        public static final Status NEUTRAL = new Status("NEUTRAL", 0);
        public static final Status SUCCESS = new Status("SUCCESS", 1);
        public static final Status ERROR = new Status("ERROR", 2);

        private static final /* synthetic */ Status[] $values() {
            return new Status[]{NEUTRAL, SUCCESS, ERROR};
        }

        static {
            Status[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Status(String str, int i11) {
        }

        @NotNull
        public static a<Status> getEntries() {
            return $ENTRIES;
        }

        public static Status valueOf(String str) {
            return (Status) Enum.valueOf(Status.class, str);
        }

        public static Status[] values() {
            return (Status[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;
        public static final /* synthetic */ int[] $EnumSwitchMapping$2;

        static {
            int[] iArr = new int[Status.values().length];
            try {
                iArr[Status.NEUTRAL.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Status.SUCCESS.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Status.ERROR.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[InfoIconView.Action.values().length];
            try {
                iArr2[InfoIconView.Action.COPY.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[InfoIconView.Action.CLEAR.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[InfoIconView.Action.INFO.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
            int[] iArr3 = new int[State.values().length];
            try {
                iArr3[State.DEFAULT.ordinal()] = 1;
            } catch (NoSuchFieldError unused7) {
            }
            try {
                iArr3[State.ACTIVE.ordinal()] = 2;
            } catch (NoSuchFieldError unused8) {
            }
            try {
                iArr3[State.DISABLED.ordinal()] = 3;
            } catch (NoSuchFieldError unused9) {
            }
            try {
                iArr3[State.READ_ONLY.ordinal()] = 4;
            } catch (NoSuchFieldError unused10) {
            }
            $EnumSwitchMapping$2 = iArr3;
        }
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public TextAreaView(@NotNull Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0, 4, null);
        Intrinsics.checkNotNullParameter(context, "context");
    }

    private final void changeState(State state) {
        String inputText;
        CounterView counterView;
        AppCompatTextView appCompatTextView;
        InfoIconView.Action action = InfoIconView.Action.INFO;
        int i11 = WhenMappings.$EnumSwitchMapping$2[state.ordinal()];
        if (i11 == 1) {
            Status status = this.status;
            Status status2 = Status.SUCCESS;
            if (status == status2 && (inputText = getInputText()) != null && inputText.length() != 0) {
                r2 = true;
            }
            setHasActionIcon(r2);
            if (this.status == status2 && !this.hasBottomBar) {
                action = InfoIconView.Action.SUCCESS;
            }
            if (this.hasInfoIcon) {
                setInfoIconVisible(true);
            }
            OzonTextInput ozonTextInput = this.inputView;
            ViewExtKt.enable(ozonTextInput);
            ozonTextInput.setTextColor(this.inputTextColor);
            ozonTextInput.setFocusableInTouchMode(true);
            ozonTextInput.setAlpha(1.0f);
            ozonTextInput.setLongClickable(true);
            ozonTextInput.setCursorVisible(true);
        } else if (i11 == 2) {
            OzonTextInput ozonTextInput2 = this.inputView;
            ViewExtKt.enable(ozonTextInput2);
            ozonTextInput2.setTextColor(this.inputTextColor);
            ozonTextInput2.setFocusableInTouchMode(true);
            ozonTextInput2.setAlpha(1.0f);
            ozonTextInput2.setLongClickable(true);
            ozonTextInput2.setCursorVisible(true);
            String inputText2 = getInputText();
            if (inputText2 != null && inputText2.length() != 0 && this.isDeleteAllButtonAllowed) {
                action = InfoIconView.Action.CLEAR;
            }
            setHasActionIcon(false);
        } else if (i11 == 3) {
            if (this.hasInfoIcon) {
                setInfoIconVisible(false);
            }
            setHasActionIcon(false);
            OzonTextInput ozonTextInput3 = this.inputView;
            ViewExtKt.disable(ozonTextInput3);
            ozonTextInput3.setTextColor(this.commonTextColor);
            ozonTextInput3.setLongClickable(false);
            ozonTextInput3.setCursorVisible(false);
            ozonTextInput3.setAlpha(0.4f);
        } else {
            if (i11 != 4) {
                throw new o();
            }
            OzonTextInput ozonTextInput4 = this.inputView;
            ozonTextInput4.setFocusableInTouchMode(false);
            ozonTextInput4.clearFocus();
            ozonTextInput4.setTextColor(this.inputTextColor);
            ozonTextInput4.setLongClickable(false);
            ozonTextInput4.setCursorVisible(false);
            ozonTextInput4.setAlpha(1.0f);
            if (this.hasInfoIcon) {
                String inputText3 = getInputText();
                setInfoIconVisible(!(inputText3 == null || inputText3.length() == 0));
            }
            action = InfoIconView.Action.COPY;
            setHasActionIcon(true);
            AppCompatImageView appCompatImageView = this.actionIconView;
            if (appCompatImageView != null) {
                appCompatImageView.setImageResource(getLockIcon());
                appCompatImageView.setColorFilter(this.iconColorDefault, PorterDuff.Mode.SRC_IN);
            }
        }
        if (this.infoIconView.getVisibility() == 0) {
            this.infoIconView.setAction(action);
        }
        AppCompatTextView appCompatTextView2 = this.labelView;
        if (appCompatTextView2 != null && appCompatTextView2.getVisibility() == 0 && (appCompatTextView = this.labelView) != null) {
            appCompatTextView.setAlpha(getCommonTextAlpha());
        }
        CounterView counterView2 = this.counterView;
        if (counterView2 != null && counterView2.getVisibility() == 0 && (counterView = this.counterView) != null) {
            counterView.setAlpha(getCommonTextAlpha());
        }
        this.borderDrawable.I(getBorderWidth(), getBorderStrokeColor());
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void changeStatus(Status status) {
        InfoIconView.Action action;
        AppCompatImageView appCompatImageView;
        AppCompatTextView appCompatTextView;
        String inputText;
        AppCompatImageView appCompatImageView2;
        int i11 = this.commonTextColor;
        int i12 = WhenMappings.$EnumSwitchMapping$0[status.ordinal()];
        if (i12 == 1) {
            State state = this.state;
            State state2 = State.READ_ONLY;
            setHasActionIcon(state == state2);
            if (this.hasActionIcon && (appCompatImageView = this.actionIconView) != null) {
                appCompatImageView.setColorFilter(this.iconColorDefault, PorterDuff.Mode.SRC_IN);
            }
            if (this.state == state2) {
                action = InfoIconView.Action.COPY;
            } else {
                String inputText2 = getInputText();
                action = (inputText2 == null || inputText2.length() == 0 || !this.isDeleteAllButtonAllowed) ? InfoIconView.Action.INFO : InfoIconView.Action.CLEAR;
            }
        } else if (i12 == 2) {
            if (this.hasBottomBar) {
                String inputText3 = getInputText();
                setHasActionIcon(!(inputText3 == null || inputText3.length() == 0));
                AppCompatImageView appCompatImageView3 = this.actionIconView;
                if (appCompatImageView3 != null) {
                    appCompatImageView3.setImageResource(R$drawable.ic_m_check);
                    appCompatImageView3.setColorFilter(this.successColor, PorterDuff.Mode.SRC_IN);
                }
            } else if (this.hasInfoIcon) {
                setInfoIconVisible(true);
            }
            if (this.state == State.READ_ONLY) {
                action = InfoIconView.Action.COPY;
            } else {
                String inputText4 = getInputText();
                action = (inputText4 == null || inputText4.length() == 0) ? !this.hasBottomBar ? InfoIconView.Action.SUCCESS : InfoIconView.Action.INFO : InfoIconView.Action.CLEAR;
            }
        } else {
            if (i12 != 3) {
                throw new o();
            }
            setHasActionIcon(this.state == State.READ_ONLY);
            if (this.hasActionIcon && (appCompatImageView2 = this.actionIconView) != null) {
                appCompatImageView2.setColorFilter(this.iconColorDefault, PorterDuff.Mode.SRC_IN);
            }
            i11 = this.errorTextColor;
            action = (this.state != State.ACTIVE || (inputText = getInputText()) == null || inputText.length() == 0) ? InfoIconView.Action.INFO : InfoIconView.Action.CLEAR;
        }
        this.infoIconView.setAction(action);
        AppCompatTextView appCompatTextView2 = this.captionView;
        if (appCompatTextView2 != null && appCompatTextView2.getVisibility() == 0 && (appCompatTextView = this.captionView) != null) {
            appCompatTextView.setTextColor(i11);
        }
        this.borderDrawable.I(getBorderWidth(), getBorderStrokeColor());
    }

    private final void copyInputText() {
        String inputText = getInputText();
        if (inputText == null || inputText.length() == 0) {
            return;
        }
        Object systemService = getContext().getSystemService("clipboard");
        ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
        if (clipboardManager != null) {
            clipboardManager.setPrimaryClip(ClipData.newPlainText(getInputText(), getInputText()));
        }
    }

    private final AppCompatImageView createActionIcon() {
        AppCompatImageView appCompatImageView = new AppCompatImageView(getContext());
        appCompatImageView.setId(R$id.inputActionIcon);
        appCompatImageView.setImageResource(R$drawable.ic_m_cross_compact);
        appCompatImageView.setColorFilter(this.iconColorDefault, PorterDuff.Mode.SRC_IN);
        appCompatImageView.setOnClickListener(new AD.b(this, 1));
        this.actionIconView = appCompatImageView;
        addView(appCompatImageView);
        return appCompatImageView;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void createActionIcon$lambda$15$lambda$14(TextAreaView textAreaView, View view) {
        textAreaView.actionClickListener.invoke();
    }

    private final AppCompatTextView createCaptionView() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.inputCaption);
        appCompatTextView.setMaxLines(this.captionMaxLines);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context, UniTextStyles.BODY_300_X_SMALL.getResId());
        appCompatTextView.setTextColor(this.status == Status.ERROR ? this.errorTextColor : this.commonTextColor);
        this.captionView = appCompatTextView;
        addView(appCompatTextView, getCaptionLayoutParams());
        View view = this.inputBgView;
        ViewGroup.LayoutParams layoutParams = view.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41640k = R$id.inputCaption;
        bVar.f41642l = -1;
        view.setLayoutParams(bVar);
        return appCompatTextView;
    }

    private final CounterView createCounterView() {
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        CounterView counterView = new CounterView(context, null, 0, 6, null);
        counterView.setTextColor(this.commonTextColor);
        counterView.setAlpha(0.6f);
        this.counterView = counterView;
        addView(counterView);
        return counterView;
    }

    private final AppCompatTextView createLabelView() {
        AppCompatTextView appCompatTextView = new AppCompatTextView(getContext());
        appCompatTextView.setId(R$id.inputLabel);
        appCompatTextView.setVisibility(8);
        appCompatTextView.setSingleLine(true);
        appCompatTextView.setEllipsize(TextUtils.TruncateAt.END);
        appCompatTextView.setTextColor(androidx.core.content.a.getColor(appCompatTextView.getContext(), UniColors.TEXT_TERTIARY.getResId()));
        appCompatTextView.setAlpha(getCommonTextAlpha());
        this.labelView = appCompatTextView;
        addView(appCompatTextView, new ConstraintLayout.b(0, -2));
        return appCompatTextView;
    }

    private final ConstraintLayout.b getBackgroundViewLayoutParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, 0);
        bVar.f41636i = 0;
        bVar.f41642l = 0;
        bVar.f41658v = 0;
        bVar.f41656t = 0;
        bVar.f41608O = UiExtKt.toPx(56);
        return bVar;
    }

    private final int getBorderStrokeColor() {
        int i11 = WhenMappings.$EnumSwitchMapping$0[this.status.ordinal()];
        if (i11 == 1) {
            return this.state == State.ACTIVE ? this.activeColor : this.borderColor;
        }
        if (i11 == 2) {
            return this.state == State.ACTIVE ? this.activeColor : this.successColor;
        }
        if (i11 == 3) {
            return this.errorColor;
        }
        throw new o();
    }

    private final float getBorderWidth() {
        return UiExtKt.toPxF(this.state == State.ACTIVE ? 2 : 1);
    }

    private final ConstraintLayout.b getCaptionLayoutParams() {
        ConstraintLayout.b bVar = new ConstraintLayout.b(0, -2);
        bVar.f41638j = R$id.inputBgView;
        bVar.f41642l = 0;
        bVar.f41656t = 0;
        bVar.f41658v = 0;
        bVar.setMargins(this.defaultMargin, this.captionMargin, 0, 0);
        return bVar;
    }

    private final float getCommonTextAlpha() {
        return this.state == State.DISABLED ? 0.4f : 0.6f;
    }

    private final int getLockIcon() {
        return this.hasBottomBar ? R$drawable.ic_m_lock_closed_filled_compact : R$drawable.ic_s_lock_closed_filled;
    }

    private final int getTextToInfoPadding() {
        if (this.infoIconView.getVisibility() != 0 || this.hasBottomBar) {
            return 0;
        }
        return this.marginTextToInfo;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void infoIconView$lambda$11$lambda$10(InfoIconView infoIconView, TextAreaView textAreaView, View view) {
        int i11 = WhenMappings.$EnumSwitchMapping$1[infoIconView.getAction().ordinal()];
        if (i11 == 1) {
            textAreaView.copyInputText();
        } else if (i11 == 2) {
            textAreaView.setInputText("");
        } else {
            if (i11 != 3) {
                return;
            }
            textAreaView.infoClickListener.invoke();
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final void inputView$lambda$9$lambda$7(TextAreaView textAreaView, View view, boolean z11) {
        State state;
        if (z11) {
            Intrinsics.f(view);
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.showKeyboard(view);
            state = State.ACTIVE;
        } else {
            Intrinsics.f(view);
            ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.hideKeyboard(view);
            state = State.DEFAULT;
        }
        textAreaView.setState(state);
        AppCompatTextView appCompatTextView = textAreaView.labelView;
        if (appCompatTextView == null || appCompatTextView.getVisibility() != 0) {
            return;
        }
        textAreaView.updateInputLayoutParams();
        textAreaView.updateLabelLayoutParams();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean inputView$lambda$9$lambda$8(View view, MotionEvent motionEvent) {
        view.getParent().requestDisallowInterceptTouchEvent(true);
        if ((motionEvent.getAction() & 255) == 1) {
            view.getParent().requestDisallowInterceptTouchEvent(false);
            view.performClick();
        }
        return false;
    }

    private final void layoutInputState() {
        AppCompatImageView appCompatImageView;
        String inputText = getInputText();
        boolean z11 = true;
        boolean z12 = inputText != null && inputText.length() != 0 && this.state == State.ACTIVE && this.isDeleteAllButtonAllowed;
        String inputText2 = getInputText();
        boolean z13 = (inputText2 == null || inputText2.length() == 0 || this.state != State.DEFAULT || this.status != Status.SUCCESS || this.hasBottomBar) ? false : true;
        String inputText3 = getInputText();
        this.infoIconView.setVisibility(this.state != State.DISABLED && (!(!z12 && !(inputText3 != null && inputText3.length() != 0 && this.state == State.READ_ONLY && !this.hasBottomBar) && !z13) || this.hasInfoIcon) ? 0 : 8);
        CounterView counterView = this.counterView;
        if (counterView != null) {
            counterView.setVisibility(this.hasCounter && this.hasBottomBar ? 0 : 8);
        }
        AppCompatImageView appCompatImageView2 = this.actionIconView;
        if (appCompatImageView2 != null) {
            if (!this.hasActionIcon || (!this.hasBottomBar && this.state != State.READ_ONLY)) {
                z11 = false;
            }
            appCompatImageView2.setVisibility(z11 ? 0 : 8);
        }
        AppCompatTextView appCompatTextView = this.labelView;
        if (appCompatTextView != null && appCompatTextView.getVisibility() == 0) {
            updateLabelLayoutParams();
        }
        if (this.infoIconView.getVisibility() == 0) {
            if (this.status == Status.SUCCESS && !this.hasBottomBar) {
                this.infoIconView.setAction(InfoIconView.Action.SUCCESS);
            }
            updateIconInfoLayoutParams();
        }
        AppCompatImageView appCompatImageView3 = this.actionIconView;
        if (appCompatImageView3 != null && appCompatImageView3.getVisibility() == 0) {
            if (this.state == State.READ_ONLY && (appCompatImageView = this.actionIconView) != null) {
                appCompatImageView.setImageResource(getLockIcon());
            }
            updateIconActionLayoutParams();
        }
        CounterView counterView2 = this.counterView;
        if (counterView2 != null && counterView2.getVisibility() == 0) {
            updateCounterLayoutParams();
        }
        updateInputLayoutParams();
        OzonTextInput ozonTextInput = this.inputView;
        ozonTextInput.setPadding(0, ozonTextInput.getPaddingTop(), getTextToInfoPadding(), this.inputView.getPaddingBottom());
    }

    private final void setInfoIconVisible(boolean z11) {
        this.isInfoIconVisible = z11;
        layoutInputState();
    }

    private final void updateCaption() {
        CharSequence charSequence = this.caption;
        if (charSequence == null) {
            return;
        }
        setCaption(this.isCaptionTagSupported ? OzonSpannableStringKt.toOzonSpannableString(OzonHtmlParser.Companion.parseHtml$default(OzonHtmlParser.INSTANCE, charSequence.toString(), 0, 2, null)) : new OzonSpannableString(charSequence));
    }

    private final Unit updateCounterLayoutParams() {
        CounterView counterView = this.counterView;
        if (counterView == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = counterView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        bVar.f41638j = R$id.inputEditText;
        int i11 = R$id.inputBgView;
        bVar.f41642l = i11;
        bVar.f41656t = i11;
        if (this.hasActionIcon) {
            bVar.f41657u = R$id.inputActionIcon;
            bVar.setMarginEnd(this.smallMargin);
        } else if (this.infoIconView.getVisibility() == 0) {
            bVar.f41657u = R$id.inputInfoIcon;
            bVar.setMarginEnd(this.smallMargin);
        } else {
            bVar.f41657u = -1;
            bVar.f41658v = R$id.inputBgView;
            bVar.setMarginEnd(this.defaultMargin);
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = this.smallMargin;
        }
        int i12 = this.smallMargin;
        ((ViewGroup.MarginLayoutParams) bVar).topMargin = i12;
        ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i12;
        bVar.f41604K = 2;
        bVar.f41603J = 2;
        bVar.f41598E = 1.0f;
        counterView.setLayoutParams(bVar);
        return Unit.f71690a;
    }

    private final Unit updateIconActionLayoutParams() {
        CharSequence label;
        AppCompatImageView appCompatImageView = this.actionIconView;
        if (appCompatImageView == null) {
            return null;
        }
        ViewGroup.LayoutParams layoutParams = appCompatImageView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        if (this.hasBottomBar) {
            bVar.f41603J = 2;
            bVar.f41604K = 2;
            bVar.f41636i = -1;
            bVar.f41638j = R$id.inputEditText;
            bVar.f41642l = R$id.inputBgView;
            bVar.f41598E = 1.0f;
            if (this.infoIconView.getVisibility() == 0) {
                bVar.f41657u = R$id.inputInfoIcon;
                bVar.setMarginEnd(this.smallMargin);
            } else {
                bVar.f41657u = -1;
                bVar.f41658v = R$id.inputBgView;
                bVar.setMarginEnd(this.defaultMargin);
            }
            if (this.hasCounter) {
                bVar.f41655s = R$id.inputCounter;
                bVar.f41656t = -1;
            } else {
                bVar.f41655s = -1;
                bVar.f41656t = R$id.inputBgView;
            }
            int i11 = this.smallMargin;
            ((ViewGroup.MarginLayoutParams) bVar).bottomMargin = i11;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = i11;
            bVar.f41599F = 1.0f;
            bVar.setMarginStart(0);
        } else {
            String inputText = getInputText();
            boolean z11 = ((inputText != null && inputText.length() != 0) || (label = getLabel()) == null || label.length() == 0) ? false : true;
            bVar.setMarginStart(this.defaultMargin);
            bVar.setMarginEnd(0);
            bVar.f41636i = z11 ? R$id.inputLabel : R$id.inputEditText;
            bVar.f41642l = z11 ? R$id.inputLabel : -1;
            bVar.f41599F = z11 ? 0.5f : 0.0f;
            bVar.f41638j = -1;
            bVar.f41656t = R$id.inputBgView;
            bVar.f41657u = R$id.inputEditText;
            ((ViewGroup.MarginLayoutParams) bVar).topMargin = this.iconLockMargin;
        }
        appCompatImageView.setLayoutParams(bVar);
        return Unit.f71690a;
    }

    private final void updateIconInfoLayoutParams() {
        InfoIconView infoIconView = this.infoIconView;
        ViewGroup.LayoutParams layoutParams = infoIconView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        int i11 = R$id.inputBgView;
        bVar.f41658v = i11;
        if (this.hasBottomBar) {
            bVar.f41636i = -1;
            bVar.f41638j = R$id.inputEditText;
            bVar.f41642l = i11;
            bVar.f41656t = i11;
            bVar.f41604K = 2;
            bVar.f41598E = 1.0f;
            bVar.f41599F = 0.5f;
            int i12 = this.smallMargin;
            bVar.setMargins(0, i12, this.defaultMargin, i12);
        } else {
            bVar.f41636i = i11;
            bVar.f41642l = -1;
            bVar.f41656t = -1;
            bVar.f41655s = -1;
            int i13 = this.defaultMargin;
            bVar.setMargins(0, i13, i13, 0);
        }
        infoIconView.setLayoutParams(bVar);
    }

    private final void updateInputLayoutParams() {
        OzonTextInput ozonTextInput = this.inputView;
        ViewGroup.LayoutParams layoutParams = ozonTextInput.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        AppCompatTextView appCompatTextView = this.labelView;
        boolean z11 = appCompatTextView != null && appCompatTextView.getVisibility() == 0 && (getInputTextLenght() != 0 || getInputHasFocus() || this.hasBottomBar);
        bVar.f41658v = R$id.inputBgView;
        if (this.hasBottomBar) {
            bVar.f41640k = this.infoIconView.getVisibility() == 0 ? R$id.inputInfoIcon : this.hasCounter ? R$id.inputCounter : R$id.inputActionIcon;
            bVar.f41642l = -1;
            bVar.f41656t = R$id.inputBgView;
        } else {
            AppCompatImageView appCompatImageView = this.actionIconView;
            if (appCompatImageView == null || appCompatImageView.getVisibility() != 0) {
                bVar.f41655s = -1;
                bVar.f41656t = R$id.inputBgView;
            } else {
                bVar.f41655s = R$id.inputActionIcon;
                bVar.f41656t = -1;
                bVar.f41594A = this.defaultMargin;
            }
            bVar.f41640k = -1;
            bVar.f41642l = R$id.inputBgView;
        }
        if (z11) {
            bVar.f41638j = R$id.inputLabel;
            bVar.f41636i = -1;
            bVar.f41604K = 2;
            bVar.f41599F = 0.0f;
        } else {
            bVar.f41636i = R$id.inputBgView;
            bVar.f41638j = -1;
            bVar.f41599F = 0.5f;
        }
        AppCompatTextView appCompatTextView2 = this.labelView;
        int i11 = (appCompatTextView2 != null && appCompatTextView2.getVisibility() == 0 && z11) ? 0 : this.smallMargin;
        AppCompatImageView appCompatImageView2 = this.actionIconView;
        bVar.setMargins((appCompatImageView2 == null || appCompatImageView2.getVisibility() != 0 || this.hasBottomBar) ? this.defaultMargin : this.gapMargin, i11, UiExtKt.toPx(5), this.hasBottomBar ? 0 : this.smallMargin);
        ozonTextInput.setLayoutParams(bVar);
    }

    private final AppCompatTextView updateLabelLayoutParams() {
        AppCompatTextView appCompatTextView = this.labelView;
        if (appCompatTextView == null) {
            return null;
        }
        boolean z11 = (getInputTextLenght() != 0 || getInputHasFocus() || this.hasBottomBar) ? false : true;
        ViewGroup.LayoutParams layoutParams = appCompatTextView.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type androidx.constraintlayout.widget.ConstraintLayout.LayoutParams");
        }
        ConstraintLayout.b bVar = (ConstraintLayout.b) layoutParams;
        boolean z12 = this.state == State.READ_ONLY && z11;
        bVar.f41656t = z12 ? R$id.inputEditText : R$id.inputBgView;
        int i11 = R$id.inputEditText;
        bVar.f41658v = i11;
        if (z11) {
            bVar.f41636i = i11;
            bVar.f41642l = i11;
            bVar.f41640k = -1;
            bVar.f41599F = 0.5f;
        } else {
            bVar.f41636i = R$id.inputBgView;
            bVar.f41640k = i11;
            bVar.f41604K = 2;
        }
        bVar.setMargins(z12 ? 0 : this.defaultMargin, z11 ? 0 : this.smallMargin, getTextToInfoPadding(), 0);
        appCompatTextView.setLayoutParams(bVar);
        int resId = ((!z11 || this.hasBottomBar) ? UniTextStyles.BODY_300_X_SMALL : UniTextStyles.BODY_500_MEDIUM).getResId();
        Context context = appCompatTextView.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        TextViewExtKt.applyStyle(appCompatTextView, context, resId);
        return appCompatTextView;
    }

    public final boolean getHasCounter() {
        return this.hasCounter;
    }

    public final boolean getInputHasFocus() {
        return this.inputView.hasFocus();
    }

    public final String getInputText() {
        return String.valueOf(this.inputView.getText());
    }

    public final int getInputTextLenght() {
        Editable text = this.inputView.getText();
        if (text != null) {
            return text.length();
        }
        return 0;
    }

    public final CharSequence getLabel() {
        AppCompatTextView appCompatTextView = this.labelView;
        if (appCompatTextView != null) {
            return appCompatTextView.getText();
        }
        return null;
    }

    public final int getMaxLength() {
        return this.maxLength;
    }

    public final int getMaxLines() {
        return this.inputView.getMaxLines();
    }

    public final int getMinLines() {
        return this.inputView.getMinLines();
    }

    @NotNull
    public final State getState() {
        return this.state;
    }

    @NotNull
    public final Status getStatus() {
        return this.status;
    }

    /* renamed from: isDeleteAllButtonAllowed, reason: from getter */
    public final boolean getIsDeleteAllButtonAllowed() {
        return this.isDeleteAllButtonAllowed;
    }

    public final void setCaption(CharSequence charSequence) {
        this.caption = charSequence;
        if (charSequence == null || charSequence.length() == 0) {
            AppCompatTextView appCompatTextView = this.captionView;
            if (appCompatTextView != null) {
                ru.ozon.uni.android.uikitsdk.ext.ViewExtKt.gone(appCompatTextView);
                return;
            }
            return;
        }
        AppCompatTextView appCompatTextView2 = this.captionView;
        if (appCompatTextView2 == null) {
            appCompatTextView2 = createCaptionView();
        }
        appCompatTextView2.setVisibility(0);
        appCompatTextView2.setText(this.caption);
    }

    public final void setCaptionColor(Integer num) {
        this.captionColor = num;
        if (num != null) {
            int intValue = num.intValue();
            AppCompatTextView appCompatTextView = this.captionView;
            if (appCompatTextView != null) {
                appCompatTextView.setTextColor(intValue);
            }
        }
    }

    public final void setCaptionMaxLines(int i11) {
        if (i11 == 0) {
            i11 = Integer.MAX_VALUE;
        }
        this.captionMaxLines = i11;
        AppCompatTextView appCompatTextView = this.captionView;
        if (appCompatTextView != null) {
            appCompatTextView.setMaxLines(i11);
        }
    }

    public final void setCaptionTagSupported(boolean z11) {
        this.isCaptionTagSupported = z11;
        updateCaption();
    }

    public final void setCurrentCountColor(Integer num) {
        CounterView counterView = this.counterView;
        if (counterView != null) {
            counterView.setCurrentCountColor(num);
        }
    }

    public final void setDeleteAllButtonAllowed(boolean z11) {
        this.isDeleteAllButtonAllowed = z11;
        layoutInputState();
        changeStatus(this.status);
    }

    public final void setHasActionIcon(boolean z11) {
        this.hasActionIcon = z11;
        if (z11 && this.actionIconView == null) {
            createActionIcon();
        }
        layoutInputState();
    }

    public final void setHasBottomBar(boolean z11) {
        this.hasBottomBar = z11;
        layoutInputState();
        changeStatus(this.status);
    }

    public final void setHasCounter(boolean z11) {
        this.hasCounter = z11;
        if (z11) {
            CounterView counterView = this.counterView;
            if (counterView == null) {
                counterView = createCounterView();
            }
            Editable text = this.inputView.getText();
            counterView.setCurrentCount(text != null ? Integer.valueOf(text.length()) : null);
            counterView.setMaxCount(this.maxLength);
        }
        layoutInputState();
    }

    public final void setHasInfoIcon(boolean z11) {
        this.hasInfoIcon = z11;
        setInfoIconVisible(z11);
    }

    public final void setInfoClickListener(@NotNull Function0<Unit> function0) {
        Intrinsics.checkNotNullParameter(function0, "<set-?>");
        this.infoClickListener = function0;
    }

    public final void setInputText(String str) {
        this.inputView.setText(str);
        changeState(this.state);
        updateInputLayoutParams();
        updateLabelLayoutParams();
    }

    public final void setLabel(CharSequence charSequence) {
        if (charSequence != null && charSequence.length() != 0 && this.labelView == null) {
            createLabelView();
        }
        AppCompatTextView appCompatTextView = this.labelView;
        if (appCompatTextView != null) {
            appCompatTextView.setText(charSequence);
            boolean z11 = true;
            if ((appCompatTextView.getVisibility() == 0) != (!(charSequence == null || charSequence.length() == 0))) {
                if (charSequence != null && charSequence.length() != 0) {
                    z11 = false;
                }
                appCompatTextView.setVisibility(z11 ? 8 : 0);
                layoutInputState();
            }
        }
    }

    public final void setMaxLength(int i11) {
        CounterView counterView;
        this.maxLength = i11;
        if (this.hasCounter && (counterView = this.counterView) != null) {
            counterView.setMaxCount(i11);
        }
        this.inputView.setFilters(new InputFilter[]{new InputFilter.LengthFilter(this.maxLength)});
    }

    public final void setMaxLines(int i11) {
        this.inputView.setMaxLines(i11);
    }

    public final void setMinLines(int i11) {
        this.inputView.setMinLines(i11);
    }

    @Override // android.view.View
    public void setPadding(int left, int top, int right, int bottom) {
        int i11 = this.smallMargin;
        super.setPadding(left, top + i11, right, bottom + i11);
    }

    public final void setScrollbarEnabled(boolean z11) {
        this.inputView.setVerticalScrollBarEnabled(z11);
    }

    public final void setState(@NotNull State value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.state = value;
        changeState(value);
    }

    public final void setStatus(@NotNull Status value) {
        Intrinsics.checkNotNullParameter(value, "value");
        this.status = value;
        changeStatus(value);
    }

    public /* synthetic */ TextAreaView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public TextAreaView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        State state = State.DEFAULT;
        this.state = state;
        Status status = Status.NEUTRAL;
        this.status = status;
        this.hasInfoIcon = true;
        this.isDeleteAllButtonAllowed = true;
        this.isInfoIconVisible = true;
        this.infoClickListener = TextAreaView$infoClickListener$1.INSTANCE;
        this.actionClickListener = TextAreaView$actionClickListener$1.INSTANCE;
        this.maxLength = ru.ozon.fintech.ui.input.CounterView.COUNTER_MAX_DEFAULT;
        this.captionMaxLines = 3;
        this.defaultMargin = UiExtKt.toPx(16);
        this.marginTextToInfo = UiExtKt.toPx(40);
        this.smallMargin = UiExtKt.toPx(8);
        this.gapMargin = UiExtKt.toPx(2);
        this.iconLockMargin = UiExtKt.toPx(4);
        this.captionMargin = UiExtKt.toPx(4);
        this.iconColorDefault = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_TERTIARY.getResId());
        this.successColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_POSITIVE_PRIMARY.getResId());
        this.activeColor = ThemeExtKt.themeColor(context, R$attr.graphicActionPrimary);
        this.errorColor = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_NEGATIVE_PRIMARY.getResId());
        int color = androidx.core.content.a.getColor(context, UniColors.GRAPHIC_NEUTRAL.getResId());
        this.borderColor = color;
        int color2 = androidx.core.content.a.getColor(context, UniColors.LAYER_FLOOR_1.getResId());
        this.bgFillColor = color2;
        int color3 = androidx.core.content.a.getColor(context, UniColors.TEXT_PRIMARY.getResId());
        this.inputTextColor = color3;
        this.commonTextColor = androidx.core.content.a.getColor(context, UniColors.TEXT_SECONDARY.getResId());
        this.errorTextColor = androidx.core.content.a.getColor(context, UniColors.TEXT_NEGATIVE.getResId());
        C10856g c10856g = new C10856g();
        c10856g.y(UiExtKt.toPxF(16));
        c10856g.I(getBorderWidth(), color);
        c10856g.B(ColorStateList.valueOf(color2));
        c10856g.E(Paint.Style.FILL_AND_STROKE);
        this.borderDrawable = c10856g;
        View view = new View(context);
        view.setId(R$id.inputBgView);
        view.setBackground(c10856g);
        view.setMinimumHeight(UiExtKt.toPx(56));
        this.inputBgView = view;
        OzonTextInput ozonTextInput = new OzonTextInput(new ContextThemeWrapper(context, R$style.TextArea), null, 0, 6, null);
        ozonTextInput.setId(R$id.inputEditText);
        ozonTextInput.setBackground(null);
        ozonTextInput.setTextColor(color3);
        ozonTextInput.setGravity(8388659);
        TextViewExtKt.applyStyle(ozonTextInput, context, UniTextStyles.BODY_500_MEDIUM.getResId());
        ozonTextInput.addTextChangedListener(new TextWatcher() { // from class: ru.ozon.uni.android.textArea.TextAreaView$inputView$lambda$9$$inlined$doOnTextChanged$1
            @Override // android.text.TextWatcher
            public void afterTextChanged(Editable s11) {
            }

            @Override // android.text.TextWatcher
            public void beforeTextChanged(CharSequence text, int start, int count, int after) {
            }

            /* JADX WARN: Code restructure failed: missing block: B:3:0x0008, code lost:
            
                r2 = r0.this$0.counterView;
             */
            @Override // android.text.TextWatcher
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void onTextChanged(CharSequence text, int start, int before, int count) {
                InfoIconView infoIconView;
                CounterView counterView;
                if (TextAreaView.this.getHasCounter() && counterView != null) {
                    counterView.setCurrentCount(text != null ? Integer.valueOf(text.length()) : null);
                }
                infoIconView = TextAreaView.this.infoIconView;
                String inputText = TextAreaView.this.getInputText();
                infoIconView.setAction((inputText == null || inputText.length() == 0 || !TextAreaView.this.getIsDeleteAllButtonAllowed()) ? InfoIconView.Action.INFO : InfoIconView.Action.CLEAR);
                TextAreaView textAreaView = TextAreaView.this;
                textAreaView.changeStatus(textAreaView.getStatus());
            }
        });
        ozonTextInput.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: Hk0.a
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view2, boolean z11) {
                TextAreaView.inputView$lambda$9$lambda$7(TextAreaView.this, view2, z11);
            }
        });
        ozonTextInput.setOnTouchListener(new Hk0.b());
        this.inputView = ozonTextInput;
        int i12 = 0;
        InfoIconView infoIconView = new InfoIconView(context, null, i12, 6, null);
        infoIconView.setOnClickListener(new c(i12, infoIconView, this));
        this.infoIconView = infoIconView;
        addView(view, getBackgroundViewLayoutParams());
        addView(ozonTextInput, new ConstraintLayout.b(0, -2));
        addView(infoIconView);
        int[] TextAreaView = R$styleable.TextAreaView;
        Intrinsics.checkNotNullExpressionValue(TextAreaView, "TextAreaView");
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, TextAreaView, 0, 0);
        setState(((State[]) State.getEntries().toArray(new State[0]))[obtainStyledAttributes.getInt(R$styleable.TextAreaView_textAreaState, state.ordinal())]);
        setStatus(((Status[]) Status.getEntries().toArray(new Status[0]))[obtainStyledAttributes.getInt(R$styleable.TextAreaView_textAreaStatus, status.ordinal())]);
        setHasBottomBar(obtainStyledAttributes.getBoolean(R$styleable.TextAreaView_bottomBar, false));
        setInputText(obtainStyledAttributes.getString(R$styleable.TextAreaView_inputText));
        setLabel(obtainStyledAttributes.getString(R$styleable.TextAreaView_label));
        setHasInfoIcon(obtainStyledAttributes.getBoolean(R$styleable.TextAreaView_infoIcon, true));
        setHasCounter(obtainStyledAttributes.getBoolean(R$styleable.TextAreaView_counter, false));
        setMaxLength(obtainStyledAttributes.getInt(R$styleable.TextAreaView_maxLength, ru.ozon.fintech.ui.input.CounterView.COUNTER_MAX_DEFAULT));
        setCaption(obtainStyledAttributes.getString(R$styleable.TextAreaView_caption));
        setMinLines(obtainStyledAttributes.getInt(R$styleable.TextAreaView_minLines, 1));
        setMaxLines(obtainStyledAttributes.getInt(R$styleable.TextAreaView_maxLines, 15));
        setScrollbarEnabled(obtainStyledAttributes.getBoolean(R$styleable.TextAreaView_scrollbarEnabled, false));
        setPadding(obtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAreaView_android_paddingStart, 0), obtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAreaView_android_paddingTop, 0), obtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAreaView_android_paddingEnd, 0), obtainStyledAttributes.getDimensionPixelSize(R$styleable.TextAreaView_android_paddingBottom, 0));
        obtainStyledAttributes.recycle();
        setClickable(true);
        setFocusable(true);
        setFocusableInTouchMode(true);
    }
}
