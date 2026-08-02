package ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter;

import Hj.C3143a;
import Xc.a;
import Xc.b;
import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.Editable;
import android.text.method.DigitsKeyListener;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.google.android.material.textfield.TextInputLayout;
import java.util.Arrays;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.R$color;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.OpenRangeFilterView;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterEditTextFormatter;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterInputListener;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterInputType;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterNumberSeparatorTextWatcher;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.RangeFilterTextInputEditText;
import ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar;
import ru.ozon.app.android.travel.utils.extensions.ConstraintLayoutExtensionsKt;
import ru.ozon.app.android.uikit.R$drawable;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.uni.R$attr;
import ru.ozon.uni.R$style;
import ru.ozon.uni.android.uikit.extensions.ResourceExtKt;
import ru.ozon.uni.android.uikit.extensions.ThemeExtKt;
import ru.ozon.uni.android.uikit.view.atoms.AtomView;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.core.UniColors;

@Metadata(d1 = {"\u0000Ô\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u000e\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0007\n\u0002\b\t\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\b\u0001\u0018\u0000 \u0081\u00012\u00020\u00012\u00020\u00022\u00020\u0003:\u0004\u0081\u0001\u0082\u0001B'\b\u0007\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0017\u0010\u000f\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u0017\u0010\u0011\u001a\u00020\u000e2\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0011\u0010\u0010J\u001f\u0010\u0014\u001a\u00020\u000e2\u0006\u0010\u0013\u001a\u00020\u00122\u0006\u0010\r\u001a\u00020\fH\u0016¢\u0006\u0004\b\u0014\u0010\u0015J)\u0010\u001b\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u00162\u0012\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e0\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001d\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001d\u0010\u001eJ\u0017\u0010\u001f\u001a\u00020\u000e2\u0006\u0010\u0017\u001a\u00020\u0016H\u0002¢\u0006\u0004\b\u001f\u0010\u001eJ\u000f\u0010 \u001a\u00020\u000eH\u0002¢\u0006\u0004\b \u0010!J#\u0010%\u001a\u0004\u0018\u00010\"2\b\u0010#\u001a\u0004\u0018\u00010\"2\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b%\u0010&J\u0017\u0010'\u001a\u00020\b2\u0006\u0010$\u001a\u00020\u0016H\u0002¢\u0006\u0004\b'\u0010(J\u0017\u0010*\u001a\u00020)2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b*\u0010+J\u001b\u0010.\u001a\u00020\b*\u00020,2\u0006\u0010-\u001a\u00020\bH\u0002¢\u0006\u0004\b.\u0010/J#\u0010.\u001a\u00020\b*\u00020,2\u0006\u0010-\u001a\u00020\b2\u0006\u00101\u001a\u000200H\u0002¢\u0006\u0004\b.\u00102J\u0017\u00104\u001a\u00020)2\u0006\u00103\u001a\u00020\u0012H\u0002¢\u0006\u0004\b4\u00105J\u000f\u00106\u001a\u00020\u000eH\u0002¢\u0006\u0004\b6\u0010!J\u000f\u00107\u001a\u00020\u000eH\u0002¢\u0006\u0004\b7\u0010!J\u000f\u00108\u001a\u00020\u000eH\u0002¢\u0006\u0004\b8\u0010!J\u000f\u00109\u001a\u00020\u000eH\u0002¢\u0006\u0004\b9\u0010!J\u001f\u0010:\u001a\u00020\u000e2\u0006\u00103\u001a\u00020,2\u0006\u0010\r\u001a\u00020\fH\u0002¢\u0006\u0004\b:\u0010;J\u000f\u0010<\u001a\u00020\u000eH\u0002¢\u0006\u0004\b<\u0010!J\u001f\u0010@\u001a\u00020?2\u0006\u0010=\u001a\u00020\b2\u0006\u0010>\u001a\u000200H\u0002¢\u0006\u0004\b@\u0010AJ\u0017\u0010C\u001a\u00020B2\u0006\u0010=\u001a\u00020\bH\u0002¢\u0006\u0004\bC\u0010DJ\u0011\u0010F\u001a\u0004\u0018\u00010EH\u0002¢\u0006\u0004\bF\u0010GJ\u0013\u0010I\u001a\u00020E*\u00020HH\u0002¢\u0006\u0004\bI\u0010JR\u0014\u0010K\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bK\u0010LR\u0014\u0010M\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bM\u0010LR\u0014\u0010O\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bO\u0010PR\u0014\u0010Q\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bQ\u0010PR\u0014\u0010R\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bR\u0010LR\u0014\u0010S\u001a\u00020N8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bS\u0010PR\u0014\u0010T\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bT\u0010LR\u0014\u0010U\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bU\u0010LR\u0014\u0010V\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bV\u0010LR\u0014\u0010W\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bW\u0010LR\u0014\u0010Y\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bY\u0010ZR\u0014\u0010[\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b[\u0010ZR\u0014\u0010\\\u001a\u00020X8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\\\u0010ZR\u0014\u0010]\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b]\u0010LR\u0014\u0010^\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b^\u0010LR\u0014\u0010_\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b_\u0010`R\u0014\u0010a\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\ba\u0010bR\u0014\u0010c\u001a\u00020?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bc\u0010`R\u0014\u0010d\u001a\u00020B8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bd\u0010bR\u0014\u0010f\u001a\u00020e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bf\u0010gR\u0018\u0010h\u001a\u0004\u0018\u00010\u00168\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bh\u0010iR$\u0010j\u001a\u0010\u0012\u0004\u0012\u00020\u0016\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bj\u0010kR$\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u0019\u0012\u0004\u0012\u00020\u000e\u0018\u00010\u00188\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001a\u0010kR\u0016\u0010m\u001a\u00020l8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bm\u0010nR\u0014\u0010p\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bp\u0010qR\u0014\u0010r\u001a\u00020o8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\br\u0010qR\u0016\u0010t\u001a\u0004\u0018\u00010s8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bt\u0010uR\u0014\u0010w\u001a\u00020v8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bw\u0010xR\u0018\u0010z\u001a\u0004\u0018\u00010y8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bz\u0010{R\u0018\u0010}\u001a\u0004\u0018\u00010|8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b}\u0010~R\u0017\u0010\u007f\u001a\u00020)8\u0002@\u0002X\u0082\u000e¢\u0006\u0007\n\u0005\b\u007f\u0010\u0080\u0001¨\u0006\u0083\u0001"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterView;", "Landroidx/constraintlayout/widget/ConstraintLayout;", "Lru/ozon/uni/android/uikit/view/atoms/AtomView;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputListener$Callback;", "Landroid/content/Context;", "context", "Landroid/util/AttributeSet;", "attrs", "", "defStyleAttr", "<init>", "(Landroid/content/Context;Landroid/util/AttributeSet;I)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;", "type", "", "onFocusGained", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;)V", "onFocusLost", "Landroid/view/View;", "view", "onDoneClicked", "(Landroid/view/View;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;)V", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;", "vo", "Lkotlin/Function1;", "Lru/ozon/uni/atoms/af/AtomAction;", "actionHandler", "bind", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;Lkotlin/jvm/functions/Function1;)V", "bindInputs", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;)V", "bindSeekbar", "notifyValueChangedListener", "()V", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "atomAction", "data", "extractAction", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;)Lru/ozon/uni/atoms/data/AtomActionDTO;", "getToValue", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;)I", "", "updateData", "(Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;)Z", "Landroid/widget/EditText;", "defaultValue", "getValue", "(Landroid/widget/EditText;I)I", "", "maxValueSign", "(Landroid/widget/EditText;ILjava/lang/String;)I", "input", "isKeyboardActive", "(Landroid/view/View;)Z", "hideKeyboard", "addViews", "setConstraints", "setInputs", "setInput", "(Landroid/widget/EditText;Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterInputType;)V", "setSeekbar", "id", "prefixText", "Lcom/google/android/material/textfield/TextInputLayout;", "createTextInputLayout", "(ILjava/lang/String;)Lcom/google/android/material/textfield/TextInputLayout;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/RangeFilterTextInputEditText;", "createTextInputEditText", "(I)Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/RangeFilterTextInputEditText;", "Landroid/graphics/Bitmap;", "createThumbBitmap", "()Landroid/graphics/Bitmap;", "Landroid/graphics/drawable/Drawable;", "toBitmap", "(Landroid/graphics/drawable/Drawable;)Landroid/graphics/Bitmap;", "dp1", "I", "dp2", "", "dp2f", "F", "dp4f", "dp8", "dp8f", "dp12", "dp16", "dp24", "mTextAppearance", "Landroid/content/res/ColorStateList;", "mPrefixTextColor", "Landroid/content/res/ColorStateList;", "mSuffixTextColor", "mColorStateList", "barColor", "barHighlightColor", "rangeFromTIL", "Lcom/google/android/material/textfield/TextInputLayout;", "rangeFromET", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/RangeFilterTextInputEditText;", "rangeToTIL", "rangeToET", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "rangeSeekbar", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar;", "boundData", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterVO;", "valuesChangeListener", "Lkotlin/jvm/functions/Function1;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterEditTextFormatter;", "editTextFormatter", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterEditTextFormatter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterNumberSeparatorTextWatcher;", "fromEtWatcher", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/input/OpenRangeFilterNumberSeparatorTextWatcher;", "toEtWatcher", "Landroid/view/inputmethod/InputMethodManager;", "inputMethodManager", "Landroid/view/inputmethod/InputMethodManager;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterValueInterpolator;", "valueInterpolator", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterValueInterpolator;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterView$UpdateType;", "updateType", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterView$UpdateType;", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Thumb;", "cachedPressedThumb", "Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/seekbar/FilterSeekbar$Thumb;", "isDoneClicked", "Z", "Companion", "UpdateType", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class OpenRangeFilterView extends ConstraintLayout implements AtomView, OpenRangeFilterInputListener.Callback {
    private Function1<? super AtomAction, Unit> actionHandler;
    private final int barColor;
    private final int barHighlightColor;
    private OpenRangeFilterVO boundData;
    private FilterSeekbar.Thumb cachedPressedThumb;
    private final int dp1;
    private final int dp12;
    private final int dp16;
    private final int dp2;
    private final int dp24;
    private final float dp2f;
    private final float dp4f;
    private final int dp8;
    private final float dp8f;

    @NotNull
    private OpenRangeFilterEditTextFormatter editTextFormatter;

    @NotNull
    private final OpenRangeFilterNumberSeparatorTextWatcher fromEtWatcher;
    private final InputMethodManager inputMethodManager;
    private boolean isDoneClicked;

    @NotNull
    private final ColorStateList mColorStateList;

    @NotNull
    private final ColorStateList mPrefixTextColor;

    @NotNull
    private final ColorStateList mSuffixTextColor;
    private final int mTextAppearance;

    @NotNull
    private final RangeFilterTextInputEditText rangeFromET;

    @NotNull
    private final TextInputLayout rangeFromTIL;

    @NotNull
    private final FilterSeekbar rangeSeekbar;

    @NotNull
    private final RangeFilterTextInputEditText rangeToET;

    @NotNull
    private final TextInputLayout rangeToTIL;

    @NotNull
    private final OpenRangeFilterNumberSeparatorTextWatcher toEtWatcher;
    private UpdateType updateType;

    @NotNull
    private final OpenRangeFilterValueInterpolator valueInterpolator;
    private Function1<? super OpenRangeFilterVO, Unit> valuesChangeListener;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0007\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\nX\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterView$Companion;", "", "<init>", "()V", "ALLOWED_DIGITS", "", "SEPARATOR", "PLACEHOLDER", "PREFIX_FORMAT", "DEFAULT_MIN_VALUE", "", "DEFAULT_MAX_VALUE", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/filters/presentation/sections/view/component/openRangeFilter/OpenRangeFilterView$UpdateType;", "", "<init>", "(Ljava/lang/String;I)V", "INPUT", "SEEKBAR", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ UpdateType[] $VALUES;
        public static final UpdateType INPUT = new UpdateType("INPUT", 0);
        public static final UpdateType SEEKBAR = new UpdateType("SEEKBAR", 1);

        private static final /* synthetic */ UpdateType[] $values() {
            return new UpdateType[]{INPUT, SEEKBAR};
        }

        static {
            UpdateType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private UpdateType(String str, int i11) {
        }

        public static UpdateType valueOf(String str) {
            return (UpdateType) Enum.valueOf(UpdateType.class, str);
        }

        public static UpdateType[] values() {
            return (UpdateType[]) $VALUES.clone();
        }
    }

    public /* synthetic */ OpenRangeFilterView(Context context, AttributeSet attributeSet, int i11, int i12, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, (i12 & 2) != 0 ? null : attributeSet, (i12 & 4) != 0 ? 0 : i11);
    }

    private final void addViews() {
        addView(this.rangeFromTIL);
        this.rangeFromTIL.addView(this.rangeFromET);
        addView(this.rangeToTIL);
        this.rangeToTIL.addView(this.rangeToET);
        addView(this.rangeSeekbar);
    }

    private final void bindInputs(OpenRangeFilterVO vo) {
        this.editTextFormatter.initWith(Float.valueOf(vo.getMinValue()), Float.valueOf(vo.getMaxValue()), vo.getMaxValueSign());
        this.rangeFromET.removeTextChangedListener(this.fromEtWatcher);
        this.rangeToET.removeTextChangedListener(this.toEtWatcher);
        this.rangeFromET.addTextChangedListener(this.fromEtWatcher);
        this.rangeToET.addTextChangedListener(this.toEtWatcher);
        this.rangeFromET.setSuffix(vo.getUnits());
        this.rangeToET.setSuffix(vo.getUnits());
    }

    private final void bindSeekbar(OpenRangeFilterVO vo) {
        this.updateType = UpdateType.INPUT;
        this.rangeSeekbar.setMinStartValue(this.valueInterpolator.calculateSeekbarValue(vo, vo.getFromValue())).setMaxStartValue(this.valueInterpolator.calculateSeekbarValue(vo, vo.getToValue())).apply();
    }

    private final RangeFilterTextInputEditText createTextInputEditText(int id2) {
        Context context = this.rangeFromTIL.getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        RangeFilterTextInputEditText rangeFilterTextInputEditText = new RangeFilterTextInputEditText(context);
        rangeFilterTextInputEditText.setId(id2);
        rangeFilterTextInputEditText.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
        rangeFilterTextInputEditText.setBackground(null);
        rangeFilterTextInputEditText.setSingleLine(true);
        rangeFilterTextInputEditText.setInputType(2);
        rangeFilterTextInputEditText.setKeyListener(DigitsKeyListener.getInstance("0123456789"));
        rangeFilterTextInputEditText.setTextAppearance(R$style.OzonTextAppearance_Body_500medium);
        int i11 = this.dp16;
        int i12 = this.dp12;
        rangeFilterTextInputEditText.setPadding(i11, i12, this.dp24, i12);
        return rangeFilterTextInputEditText;
    }

    private final TextInputLayout createTextInputLayout(int id2, String prefixText) {
        TextInputLayout textInputLayout = new TextInputLayout(getContext(), null);
        textInputLayout.setId(id2);
        String format = String.format("%s ", Arrays.copyOf(new Object[]{prefixText}, 1));
        Intrinsics.checkNotNullExpressionValue(format, "format(...)");
        textInputLayout.j0(format);
        textInputLayout.setLayoutParams(new ConstraintLayout.b(0, -2));
        textInputLayout.L(2);
        textInputLayout.O(this.dp1);
        textInputLayout.P(this.dp2);
        ColorStateList colorStateList = this.mColorStateList;
        if (colorStateList != null) {
            textInputLayout.N(colorStateList);
        }
        textInputLayout.f0();
        textInputLayout.k0(this.mTextAppearance);
        textInputLayout.l0(this.mPrefixTextColor);
        textInputLayout.m0(this.mTextAppearance);
        textInputLayout.n0(this.mSuffixTextColor);
        float f7 = this.dp8f;
        textInputLayout.M(f7, f7, f7, f7);
        TextView A11 = textInputLayout.A();
        Intrinsics.checkNotNullExpressionValue(A11, "getPrefixTextView(...)");
        ViewGroup.LayoutParams layoutParams = A11.getLayoutParams();
        if (layoutParams == null) {
            throw new NullPointerException("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
        }
        layoutParams.height = -1;
        A11.setLayoutParams(layoutParams);
        textInputLayout.A().setGravity(17);
        return textInputLayout;
    }

    private final Bitmap createThumbBitmap() {
        Drawable mutate;
        Drawable drawable = androidx.core.content.a.getDrawable(getContext(), R$drawable.ic_widget_atom_range_filters_thumb);
        if (drawable == null || (mutate = drawable.mutate()) == null) {
            return null;
        }
        Context context = getContext();
        Intrinsics.checkNotNullExpressionValue(context, "getContext(...)");
        mutate.setTint(ThemeExtKt.themeColor(context, R$attr.graphicActionOnLight));
        return toBitmap(mutate);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AtomActionDTO extractAction(AtomActionDTO atomAction, OpenRangeFilterVO data) {
        String str = null;
        if (atomAction == null) {
            return null;
        }
        String link = atomAction.getLink();
        if (link != null) {
            String encode = Uri.encode(data.getFromValue() + ";" + getToValue(data));
            Intrinsics.checkNotNullExpressionValue(encode, "encode(...)");
            str = h.X(link, "{value}", encode, false);
        }
        return AtomActionDTO.copy$default(atomAction, null, str, null, null, null, 29, null);
    }

    private final int getToValue(OpenRangeFilterVO data) {
        if (data.getShouldUpdateMaxValue()) {
            return data.getToValue();
        }
        if (data.getMaxValueSign() == null || data.getToValue() != data.getMaxValue()) {
            return data.getToValue();
        }
        return 0;
    }

    private final int getValue(EditText editText, int i11) {
        Integer w02 = h.w0(new Regex("\\s").replace(editText.getText().toString(), ""));
        return w02 != null ? w02.intValue() : i11;
    }

    private final void hideKeyboard() {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        if (inputMethodManager != null) {
            inputMethodManager.hideSoftInputFromWindow(getWindowToken(), 0);
        }
    }

    private final boolean isKeyboardActive(View input) {
        InputMethodManager inputMethodManager = this.inputMethodManager;
        return inputMethodManager != null && inputMethodManager.isActive(input);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void notifyValueChangedListener() {
        Function1<? super OpenRangeFilterVO, Unit> function1;
        OpenRangeFilterVO openRangeFilterVO = this.boundData;
        if (openRangeFilterVO == null || (function1 = this.valuesChangeListener) == null) {
            return;
        }
        function1.invoke(openRangeFilterVO);
    }

    private final void setConstraints() {
        ConstraintLayoutExtensionsKt.applyConstraint(this, new OpenRangeFilterView$setConstraints$1(this));
    }

    private final void setInput(EditText input, OpenRangeFilterInputType type) {
        OpenRangeFilterInputListener openRangeFilterInputListener = new OpenRangeFilterInputListener(this, type);
        input.setOnFocusChangeListener(openRangeFilterInputListener);
        input.setOnEditorActionListener(openRangeFilterInputListener);
    }

    private final void setInputs() {
        setInput(this.rangeFromET, OpenRangeFilterInputType.From.INSTANCE);
        setInput(this.rangeToET, OpenRangeFilterInputType.To.INSTANCE);
    }

    private final void setSeekbar() {
        FilterSeekbar filterSeekbar = this.rangeSeekbar;
        filterSeekbar.setOnRangeSeekbarChangeListener(new FilterSeekbar.OnRangeSeekbarChangeListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.OpenRangeFilterView$setSeekbar$1$1
            /* JADX WARN: Removed duplicated region for block: B:13:0x003b  */
            /* JADX WARN: Removed duplicated region for block: B:18:0x009f  */
            /* JADX WARN: Removed duplicated region for block: B:22:0x00a2  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x002e  */
            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar.OnRangeSeekbarChangeListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void valueChanged(Number minValue, Number maxValue, FilterSeekbar.Thumb thumb) {
                OpenRangeFilterVO openRangeFilterVO;
                FilterSeekbar filterSeekbar2;
                boolean z11;
                boolean z12;
                boolean z13;
                OpenRangeFilterValueInterpolator openRangeFilterValueInterpolator;
                OpenRangeFilterValueInterpolator openRangeFilterValueInterpolator2;
                OpenRangeFilterEditTextFormatter openRangeFilterEditTextFormatter;
                OpenRangeFilterEditTextFormatter openRangeFilterEditTextFormatter2;
                RangeFilterTextInputEditText rangeFilterTextInputEditText;
                RangeFilterTextInputEditText rangeFilterTextInputEditText2;
                FilterSeekbar filterSeekbar3;
                FilterSeekbar.Thumb thumb2;
                FilterSeekbar.Thumb thumb3;
                OpenRangeFilterView.UpdateType updateType;
                Intrinsics.checkNotNullParameter(minValue, "minValue");
                Intrinsics.checkNotNullParameter(maxValue, "maxValue");
                openRangeFilterVO = OpenRangeFilterView.this.boundData;
                if (openRangeFilterVO != null) {
                    OpenRangeFilterView openRangeFilterView = OpenRangeFilterView.this;
                    filterSeekbar2 = openRangeFilterView.rangeSeekbar;
                    if (!filterSeekbar2.isPressed()) {
                        updateType = openRangeFilterView.updateType;
                        if (updateType != OpenRangeFilterView.UpdateType.SEEKBAR) {
                            z11 = false;
                            if (z11) {
                                thumb3 = openRangeFilterView.cachedPressedThumb;
                                if (thumb3 == FilterSeekbar.Thumb.MIN) {
                                    z12 = true;
                                    if (z11) {
                                        thumb2 = openRangeFilterView.cachedPressedThumb;
                                        if (thumb2 == FilterSeekbar.Thumb.MAX) {
                                            z13 = true;
                                            openRangeFilterValueInterpolator = openRangeFilterView.valueInterpolator;
                                            int calculateInputValue = openRangeFilterValueInterpolator.calculateInputValue(openRangeFilterVO, minValue.floatValue(), z12);
                                            openRangeFilterValueInterpolator2 = openRangeFilterView.valueInterpolator;
                                            int calculateInputValue2 = openRangeFilterValueInterpolator2.calculateInputValue(openRangeFilterVO, maxValue.floatValue(), z13);
                                            openRangeFilterEditTextFormatter = openRangeFilterView.editTextFormatter;
                                            String numberAsFormattedString = openRangeFilterEditTextFormatter.numberAsFormattedString(Integer.valueOf(calculateInputValue), true, new OpenRangeFilterEditTextFormatter.FormattingOptions(OpenRangeFilterInputType.From.INSTANCE, false));
                                            openRangeFilterEditTextFormatter2 = openRangeFilterView.editTextFormatter;
                                            String numberAsFormattedString2 = openRangeFilterEditTextFormatter2.numberAsFormattedString(Integer.valueOf(calculateInputValue2), true, new OpenRangeFilterEditTextFormatter.FormattingOptions(OpenRangeFilterInputType.To.INSTANCE, false));
                                            rangeFilterTextInputEditText = openRangeFilterView.rangeFromET;
                                            rangeFilterTextInputEditText.setText(numberAsFormattedString);
                                            rangeFilterTextInputEditText2 = openRangeFilterView.rangeToET;
                                            rangeFilterTextInputEditText2.setText(numberAsFormattedString2);
                                            openRangeFilterView.cachedPressedThumb = thumb;
                                            filterSeekbar3 = openRangeFilterView.rangeSeekbar;
                                            openRangeFilterView.updateType = !filterSeekbar3.isPressed() ? OpenRangeFilterView.UpdateType.SEEKBAR : OpenRangeFilterView.UpdateType.INPUT;
                                        }
                                    }
                                    z13 = false;
                                    openRangeFilterValueInterpolator = openRangeFilterView.valueInterpolator;
                                    int calculateInputValue3 = openRangeFilterValueInterpolator.calculateInputValue(openRangeFilterVO, minValue.floatValue(), z12);
                                    openRangeFilterValueInterpolator2 = openRangeFilterView.valueInterpolator;
                                    int calculateInputValue22 = openRangeFilterValueInterpolator2.calculateInputValue(openRangeFilterVO, maxValue.floatValue(), z13);
                                    openRangeFilterEditTextFormatter = openRangeFilterView.editTextFormatter;
                                    String numberAsFormattedString3 = openRangeFilterEditTextFormatter.numberAsFormattedString(Integer.valueOf(calculateInputValue3), true, new OpenRangeFilterEditTextFormatter.FormattingOptions(OpenRangeFilterInputType.From.INSTANCE, false));
                                    openRangeFilterEditTextFormatter2 = openRangeFilterView.editTextFormatter;
                                    String numberAsFormattedString22 = openRangeFilterEditTextFormatter2.numberAsFormattedString(Integer.valueOf(calculateInputValue22), true, new OpenRangeFilterEditTextFormatter.FormattingOptions(OpenRangeFilterInputType.To.INSTANCE, false));
                                    rangeFilterTextInputEditText = openRangeFilterView.rangeFromET;
                                    rangeFilterTextInputEditText.setText(numberAsFormattedString3);
                                    rangeFilterTextInputEditText2 = openRangeFilterView.rangeToET;
                                    rangeFilterTextInputEditText2.setText(numberAsFormattedString22);
                                    openRangeFilterView.cachedPressedThumb = thumb;
                                    filterSeekbar3 = openRangeFilterView.rangeSeekbar;
                                    openRangeFilterView.updateType = !filterSeekbar3.isPressed() ? OpenRangeFilterView.UpdateType.SEEKBAR : OpenRangeFilterView.UpdateType.INPUT;
                                }
                            }
                            z12 = false;
                            if (z11) {
                            }
                            z13 = false;
                            openRangeFilterValueInterpolator = openRangeFilterView.valueInterpolator;
                            int calculateInputValue32 = openRangeFilterValueInterpolator.calculateInputValue(openRangeFilterVO, minValue.floatValue(), z12);
                            openRangeFilterValueInterpolator2 = openRangeFilterView.valueInterpolator;
                            int calculateInputValue222 = openRangeFilterValueInterpolator2.calculateInputValue(openRangeFilterVO, maxValue.floatValue(), z13);
                            openRangeFilterEditTextFormatter = openRangeFilterView.editTextFormatter;
                            String numberAsFormattedString32 = openRangeFilterEditTextFormatter.numberAsFormattedString(Integer.valueOf(calculateInputValue32), true, new OpenRangeFilterEditTextFormatter.FormattingOptions(OpenRangeFilterInputType.From.INSTANCE, false));
                            openRangeFilterEditTextFormatter2 = openRangeFilterView.editTextFormatter;
                            String numberAsFormattedString222 = openRangeFilterEditTextFormatter2.numberAsFormattedString(Integer.valueOf(calculateInputValue222), true, new OpenRangeFilterEditTextFormatter.FormattingOptions(OpenRangeFilterInputType.To.INSTANCE, false));
                            rangeFilterTextInputEditText = openRangeFilterView.rangeFromET;
                            rangeFilterTextInputEditText.setText(numberAsFormattedString32);
                            rangeFilterTextInputEditText2 = openRangeFilterView.rangeToET;
                            rangeFilterTextInputEditText2.setText(numberAsFormattedString222);
                            openRangeFilterView.cachedPressedThumb = thumb;
                            filterSeekbar3 = openRangeFilterView.rangeSeekbar;
                            openRangeFilterView.updateType = !filterSeekbar3.isPressed() ? OpenRangeFilterView.UpdateType.SEEKBAR : OpenRangeFilterView.UpdateType.INPUT;
                        }
                    }
                    z11 = true;
                    if (z11) {
                    }
                    z12 = false;
                    if (z11) {
                    }
                    z13 = false;
                    openRangeFilterValueInterpolator = openRangeFilterView.valueInterpolator;
                    int calculateInputValue322 = openRangeFilterValueInterpolator.calculateInputValue(openRangeFilterVO, minValue.floatValue(), z12);
                    openRangeFilterValueInterpolator2 = openRangeFilterView.valueInterpolator;
                    int calculateInputValue2222 = openRangeFilterValueInterpolator2.calculateInputValue(openRangeFilterVO, maxValue.floatValue(), z13);
                    openRangeFilterEditTextFormatter = openRangeFilterView.editTextFormatter;
                    String numberAsFormattedString322 = openRangeFilterEditTextFormatter.numberAsFormattedString(Integer.valueOf(calculateInputValue322), true, new OpenRangeFilterEditTextFormatter.FormattingOptions(OpenRangeFilterInputType.From.INSTANCE, false));
                    openRangeFilterEditTextFormatter2 = openRangeFilterView.editTextFormatter;
                    String numberAsFormattedString2222 = openRangeFilterEditTextFormatter2.numberAsFormattedString(Integer.valueOf(calculateInputValue2222), true, new OpenRangeFilterEditTextFormatter.FormattingOptions(OpenRangeFilterInputType.To.INSTANCE, false));
                    rangeFilterTextInputEditText = openRangeFilterView.rangeFromET;
                    rangeFilterTextInputEditText.setText(numberAsFormattedString322);
                    rangeFilterTextInputEditText2 = openRangeFilterView.rangeToET;
                    rangeFilterTextInputEditText2.setText(numberAsFormattedString2222);
                    openRangeFilterView.cachedPressedThumb = thumb;
                    filterSeekbar3 = openRangeFilterView.rangeSeekbar;
                    openRangeFilterView.updateType = !filterSeekbar3.isPressed() ? OpenRangeFilterView.UpdateType.SEEKBAR : OpenRangeFilterView.UpdateType.INPUT;
                }
            }
        });
        filterSeekbar.setOnRangeSeekbarFinalValueListener(new FilterSeekbar.OnRangeSeekbarFinalValueListener() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.OpenRangeFilterView$setSeekbar$1$2
            /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
            
                if (r6 == ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar.Thumb.MAX) goto L21;
             */
            /* JADX WARN: Multi-variable type inference failed */
            /* JADX WARN: Removed duplicated region for block: B:13:0x0042  */
            /* JADX WARN: Removed duplicated region for block: B:17:0x006a  */
            /* JADX WARN: Removed duplicated region for block: B:9:0x0035  */
            @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.seekbar.FilterSeekbar.OnRangeSeekbarFinalValueListener
            /*
                Code decompiled incorrectly, please refer to instructions dump.
            */
            public void finalValue(Number minValue, Number maxValue, FilterSeekbar.Thumb thumb) {
                OpenRangeFilterVO openRangeFilterVO;
                FilterSeekbar filterSeekbar2;
                Object[] objArr;
                boolean z11;
                OpenRangeFilterValueInterpolator openRangeFilterValueInterpolator;
                OpenRangeFilterValueInterpolator openRangeFilterValueInterpolator2;
                CommonControlSettings common;
                FilterSeekbar.Thumb thumb2;
                FilterSeekbar.Thumb thumb3;
                OpenRangeFilterView.UpdateType updateType;
                Intrinsics.checkNotNullParameter(minValue, "minValue");
                Intrinsics.checkNotNullParameter(maxValue, "maxValue");
                OpenRangeFilterView openRangeFilterView = OpenRangeFilterView.this;
                openRangeFilterVO = openRangeFilterView.boundData;
                OpenRangeFilterVO openRangeFilterVO2 = null;
                CommonControlSettings commonControlSettings = null;
                if (openRangeFilterVO != null) {
                    OpenRangeFilterView openRangeFilterView2 = OpenRangeFilterView.this;
                    filterSeekbar2 = openRangeFilterView2.rangeSeekbar;
                    boolean z12 = true;
                    if (!filterSeekbar2.isPressed()) {
                        updateType = openRangeFilterView2.updateType;
                        if (updateType != OpenRangeFilterView.UpdateType.SEEKBAR) {
                            objArr = false;
                            if (objArr != false) {
                                thumb3 = openRangeFilterView2.cachedPressedThumb;
                                if (thumb3 == FilterSeekbar.Thumb.MIN) {
                                    z11 = true;
                                    if (objArr != false) {
                                        thumb2 = openRangeFilterView2.cachedPressedThumb;
                                    }
                                    z12 = false;
                                    openRangeFilterValueInterpolator = openRangeFilterView2.valueInterpolator;
                                    int calculateInputValue = openRangeFilterValueInterpolator.calculateInputValue(openRangeFilterVO, minValue.floatValue(), z11);
                                    openRangeFilterValueInterpolator2 = openRangeFilterView2.valueInterpolator;
                                    int calculateInputValue2 = openRangeFilterValueInterpolator2.calculateInputValue(openRangeFilterVO, maxValue.floatValue(), z12);
                                    common = openRangeFilterVO.getCommon();
                                    if (common != null) {
                                        commonControlSettings = CommonControlSettings.copy$default(common, null, z11 ? openRangeFilterVO.getMinSliderTrackingInfo() : openRangeFilterVO.getMaxSliderTrackingInfo(), null, 5, null);
                                    }
                                    openRangeFilterVO2 = openRangeFilterVO.copy((r34 & 1) != 0 ? openRangeFilterVO.title : null, (r34 & 2) != 0 ? openRangeFilterVO.common : commonControlSettings, (r34 & 4) != 0 ? openRangeFilterVO.minValue : 0, (r34 & 8) != 0 ? openRangeFilterVO.maxValue : 0, (r34 & 16) != 0 ? openRangeFilterVO.stepPower : 0, (r34 & 32) != 0 ? openRangeFilterVO.step : 0, (r34 & 64) != 0 ? openRangeFilterVO.units : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? openRangeFilterVO.maxValueSign : null, (r34 & 256) != 0 ? openRangeFilterVO.fromValue : calculateInputValue, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? openRangeFilterVO.toValue : calculateInputValue2, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? openRangeFilterVO.hideSeparator : false, (r34 & 2048) != 0 ? openRangeFilterVO.shouldUpdateMaxValue : false, (r34 & 4096) != 0 ? openRangeFilterVO.minFieldTrackingInfo : null, (r34 & 8192) != 0 ? openRangeFilterVO.maxFieldTrackingInfo : null, (r34 & 16384) != 0 ? openRangeFilterVO.minSliderTrackingInfo : null, (r34 & 32768) != 0 ? openRangeFilterVO.maxSliderTrackingInfo : null);
                                }
                            }
                            z11 = false;
                            if (objArr != false) {
                            }
                            z12 = false;
                            openRangeFilterValueInterpolator = openRangeFilterView2.valueInterpolator;
                            int calculateInputValue3 = openRangeFilterValueInterpolator.calculateInputValue(openRangeFilterVO, minValue.floatValue(), z11);
                            openRangeFilterValueInterpolator2 = openRangeFilterView2.valueInterpolator;
                            int calculateInputValue22 = openRangeFilterValueInterpolator2.calculateInputValue(openRangeFilterVO, maxValue.floatValue(), z12);
                            common = openRangeFilterVO.getCommon();
                            if (common != null) {
                            }
                            openRangeFilterVO2 = openRangeFilterVO.copy((r34 & 1) != 0 ? openRangeFilterVO.title : null, (r34 & 2) != 0 ? openRangeFilterVO.common : commonControlSettings, (r34 & 4) != 0 ? openRangeFilterVO.minValue : 0, (r34 & 8) != 0 ? openRangeFilterVO.maxValue : 0, (r34 & 16) != 0 ? openRangeFilterVO.stepPower : 0, (r34 & 32) != 0 ? openRangeFilterVO.step : 0, (r34 & 64) != 0 ? openRangeFilterVO.units : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? openRangeFilterVO.maxValueSign : null, (r34 & 256) != 0 ? openRangeFilterVO.fromValue : calculateInputValue3, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? openRangeFilterVO.toValue : calculateInputValue22, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? openRangeFilterVO.hideSeparator : false, (r34 & 2048) != 0 ? openRangeFilterVO.shouldUpdateMaxValue : false, (r34 & 4096) != 0 ? openRangeFilterVO.minFieldTrackingInfo : null, (r34 & 8192) != 0 ? openRangeFilterVO.maxFieldTrackingInfo : null, (r34 & 16384) != 0 ? openRangeFilterVO.minSliderTrackingInfo : null, (r34 & 32768) != 0 ? openRangeFilterVO.maxSliderTrackingInfo : null);
                        }
                    }
                    objArr = true;
                    if (objArr != false) {
                    }
                    z11 = false;
                    if (objArr != false) {
                    }
                    z12 = false;
                    openRangeFilterValueInterpolator = openRangeFilterView2.valueInterpolator;
                    int calculateInputValue32 = openRangeFilterValueInterpolator.calculateInputValue(openRangeFilterVO, minValue.floatValue(), z11);
                    openRangeFilterValueInterpolator2 = openRangeFilterView2.valueInterpolator;
                    int calculateInputValue222 = openRangeFilterValueInterpolator2.calculateInputValue(openRangeFilterVO, maxValue.floatValue(), z12);
                    common = openRangeFilterVO.getCommon();
                    if (common != null) {
                    }
                    openRangeFilterVO2 = openRangeFilterVO.copy((r34 & 1) != 0 ? openRangeFilterVO.title : null, (r34 & 2) != 0 ? openRangeFilterVO.common : commonControlSettings, (r34 & 4) != 0 ? openRangeFilterVO.minValue : 0, (r34 & 8) != 0 ? openRangeFilterVO.maxValue : 0, (r34 & 16) != 0 ? openRangeFilterVO.stepPower : 0, (r34 & 32) != 0 ? openRangeFilterVO.step : 0, (r34 & 64) != 0 ? openRangeFilterVO.units : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? openRangeFilterVO.maxValueSign : null, (r34 & 256) != 0 ? openRangeFilterVO.fromValue : calculateInputValue32, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? openRangeFilterVO.toValue : calculateInputValue222, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? openRangeFilterVO.hideSeparator : false, (r34 & 2048) != 0 ? openRangeFilterVO.shouldUpdateMaxValue : false, (r34 & 4096) != 0 ? openRangeFilterVO.minFieldTrackingInfo : null, (r34 & 8192) != 0 ? openRangeFilterVO.maxFieldTrackingInfo : null, (r34 & 16384) != 0 ? openRangeFilterVO.minSliderTrackingInfo : null, (r34 & 32768) != 0 ? openRangeFilterVO.maxSliderTrackingInfo : null);
                }
                openRangeFilterView.boundData = openRangeFilterVO2;
                OpenRangeFilterView.this.notifyValueChangedListener();
            }
        });
    }

    private final Bitmap toBitmap(Drawable drawable) {
        Bitmap createBitmap = Bitmap.createBitmap(drawable.getIntrinsicWidth(), drawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        drawable.setBounds(0, 0, canvas.getWidth(), canvas.getHeight());
        drawable.draw(canvas);
        return createBitmap;
    }

    /* JADX WARN: Removed duplicated region for block: B:19:0x005e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0091  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0088  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0061  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean updateData(OpenRangeFilterInputType type) {
        int i11;
        int i12;
        CommonControlSettings common;
        CommonControlSettings commonControlSettings;
        OpenRangeFilterVO copy;
        OpenRangeFilterVO openRangeFilterVO = this.boundData;
        if (openRangeFilterVO == null) {
            return false;
        }
        int value = getValue(this.rangeFromET, openRangeFilterVO.getMinValue());
        String maxValueSign = openRangeFilterVO.getMaxValueSign();
        int value2 = maxValueSign != null ? getValue(this.rangeToET, openRangeFilterVO.getMaxValue(), maxValueSign) : getValue(this.rangeToET, openRangeFilterVO.getMaxValue());
        boolean d11 = Intrinsics.d(type, OpenRangeFilterInputType.From.INSTANCE);
        boolean d12 = Intrinsics.d(type, OpenRangeFilterInputType.To.INSTANCE);
        if (d11 && value > value2) {
            i11 = value2;
        } else {
            if (!d12 || value2 >= value) {
                i11 = value;
                i12 = value2;
                if (openRangeFilterVO.getFromValue() != i11 && openRangeFilterVO.getToValue() == i12) {
                    return false;
                }
                boolean z11 = i12 <= openRangeFilterVO.getMaxValue();
                common = openRangeFilterVO.getCommon();
                if (common == null) {
                    commonControlSettings = CommonControlSettings.copy$default(common, null, d11 ? openRangeFilterVO.getMinFieldTrackingInfo() : openRangeFilterVO.getMaxFieldTrackingInfo(), null, 5, null);
                } else {
                    commonControlSettings = null;
                }
                copy = openRangeFilterVO.copy((r34 & 1) != 0 ? openRangeFilterVO.title : null, (r34 & 2) != 0 ? openRangeFilterVO.common : commonControlSettings, (r34 & 4) != 0 ? openRangeFilterVO.minValue : 0, (r34 & 8) != 0 ? openRangeFilterVO.maxValue : !z11 ? i12 : openRangeFilterVO.getMaxValue(), (r34 & 16) != 0 ? openRangeFilterVO.stepPower : 0, (r34 & 32) != 0 ? openRangeFilterVO.step : 0, (r34 & 64) != 0 ? openRangeFilterVO.units : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? openRangeFilterVO.maxValueSign : z11 ? null : openRangeFilterVO.getMaxValueSign(), (r34 & 256) != 0 ? openRangeFilterVO.fromValue : i11, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? openRangeFilterVO.toValue : i12, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? openRangeFilterVO.hideSeparator : false, (r34 & 2048) != 0 ? openRangeFilterVO.shouldUpdateMaxValue : z11, (r34 & 4096) != 0 ? openRangeFilterVO.minFieldTrackingInfo : null, (r34 & 8192) != 0 ? openRangeFilterVO.maxFieldTrackingInfo : null, (r34 & 16384) != 0 ? openRangeFilterVO.minSliderTrackingInfo : null, (r34 & 32768) != 0 ? openRangeFilterVO.maxSliderTrackingInfo : null);
                this.boundData = copy;
                this.updateType = UpdateType.INPUT;
                this.rangeSeekbar.setMinStartValue(this.valueInterpolator.calculateSeekbarValue(openRangeFilterVO, i11)).setMaxStartValue(this.valueInterpolator.calculateSeekbarValue(openRangeFilterVO, i12)).apply();
                return true;
            }
            i11 = value;
        }
        i12 = i11;
        if (openRangeFilterVO.getFromValue() != i11) {
        }
        if (i12 <= openRangeFilterVO.getMaxValue()) {
        }
        common = openRangeFilterVO.getCommon();
        if (common == null) {
        }
        copy = openRangeFilterVO.copy((r34 & 1) != 0 ? openRangeFilterVO.title : null, (r34 & 2) != 0 ? openRangeFilterVO.common : commonControlSettings, (r34 & 4) != 0 ? openRangeFilterVO.minValue : 0, (r34 & 8) != 0 ? openRangeFilterVO.maxValue : !z11 ? i12 : openRangeFilterVO.getMaxValue(), (r34 & 16) != 0 ? openRangeFilterVO.stepPower : 0, (r34 & 32) != 0 ? openRangeFilterVO.step : 0, (r34 & 64) != 0 ? openRangeFilterVO.units : null, (r34 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? openRangeFilterVO.maxValueSign : z11 ? null : openRangeFilterVO.getMaxValueSign(), (r34 & 256) != 0 ? openRangeFilterVO.fromValue : i11, (r34 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? openRangeFilterVO.toValue : i12, (r34 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? openRangeFilterVO.hideSeparator : false, (r34 & 2048) != 0 ? openRangeFilterVO.shouldUpdateMaxValue : z11, (r34 & 4096) != 0 ? openRangeFilterVO.minFieldTrackingInfo : null, (r34 & 8192) != 0 ? openRangeFilterVO.maxFieldTrackingInfo : null, (r34 & 16384) != 0 ? openRangeFilterVO.minSliderTrackingInfo : null, (r34 & 32768) != 0 ? openRangeFilterVO.maxSliderTrackingInfo : null);
        this.boundData = copy;
        this.updateType = UpdateType.INPUT;
        this.rangeSeekbar.setMinStartValue(this.valueInterpolator.calculateSeekbarValue(openRangeFilterVO, i11)).setMaxStartValue(this.valueInterpolator.calculateSeekbarValue(openRangeFilterVO, i12)).apply();
        return true;
    }

    public final void bind(@NotNull OpenRangeFilterVO vo, @NotNull Function1<? super AtomAction, Unit> actionHandler) {
        Intrinsics.checkNotNullParameter(vo, "vo");
        Intrinsics.checkNotNullParameter(actionHandler, "actionHandler");
        this.boundData = vo;
        this.actionHandler = actionHandler;
        bindInputs(vo);
        bindSeekbar(vo);
        this.valuesChangeListener = new OpenRangeFilterView$bind$1(this, actionHandler);
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterInputListener.Callback
    public void onDoneClicked(@NotNull View view, @NotNull OpenRangeFilterInputType type) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(type, "type");
        this.isDoneClicked = true;
        if (updateData(type)) {
            notifyValueChangedListener();
        }
        if (isKeyboardActive(view)) {
            hideKeyboard();
        }
        clearFocus();
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterInputListener.Callback
    public void onFocusGained(@NotNull OpenRangeFilterInputType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        this.isDoneClicked = false;
        OpenRangeFilterVO openRangeFilterVO = this.boundData;
        if (openRangeFilterVO != null) {
            OpenRangeFilterInputType.To to = OpenRangeFilterInputType.To.INSTANCE;
            if (!Intrinsics.d(type, to) || openRangeFilterVO.getMaxValueSign() == null) {
                return;
            }
            Editable text = this.rangeToET.getText();
            if (text == null || h.B(text, openRangeFilterVO.getMaxValueSign())) {
                this.toEtWatcher.setIsFocused(true);
                this.rangeToET.setText(this.editTextFormatter.numberAsFormattedString(Integer.valueOf(openRangeFilterVO.getToValue()), false, new OpenRangeFilterEditTextFormatter.FormattingOptions(to, true)));
            }
        }
    }

    @Override // ru.ozon.app.android.travel.feature.general.common.widgets.filters.presentation.sections.view.component.openRangeFilter.input.OpenRangeFilterInputListener.Callback
    public void onFocusLost(@NotNull OpenRangeFilterInputType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        OpenRangeFilterVO openRangeFilterVO = this.boundData;
        if (openRangeFilterVO != null) {
            if (!this.isDoneClicked && updateData(type)) {
                notifyValueChangedListener();
            }
            OpenRangeFilterInputType.To to = OpenRangeFilterInputType.To.INSTANCE;
            if (!Intrinsics.d(type, to) || openRangeFilterVO.getMaxValueSign() == null) {
                return;
            }
            Editable text = this.rangeToET.getText();
            if (text != null && h.B(text, openRangeFilterVO.getMaxValueSign())) {
                return;
            }
            this.toEtWatcher.setIsFocused(false);
            this.rangeToET.setText(this.editTextFormatter.numberAsFormattedString(Integer.valueOf(openRangeFilterVO.getToValue()), false, new OpenRangeFilterEditTextFormatter.FormattingOptions(to, false)));
        }
        this.isDoneClicked = false;
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public OpenRangeFilterView(@NotNull Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        Intrinsics.checkNotNullParameter(context, "context");
        this.dp1 = ResourceExtKt.toPx(1, context);
        this.dp2 = ResourceExtKt.toPx(2, context);
        float pxF = ResourceExtKt.toPxF(2, context);
        this.dp2f = pxF;
        float pxF2 = ResourceExtKt.toPxF(4, context);
        this.dp4f = pxF2;
        this.dp8 = ResourceExtKt.toPx(8, context);
        this.dp8f = ResourceExtKt.toPxF(8, context);
        this.dp12 = ResourceExtKt.toPx(12, context);
        this.dp16 = ResourceExtKt.toPx(16, context);
        this.dp24 = ResourceExtKt.toPx(24, context);
        this.mTextAppearance = R$style.OzonTextAppearance_Body_500medium;
        ColorStateList valueOf = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.textTertiary));
        Intrinsics.checkNotNullExpressionValue(valueOf, "valueOf(...)");
        this.mPrefixTextColor = valueOf;
        ColorStateList valueOf2 = ColorStateList.valueOf(ThemeExtKt.themeColor(context, R$attr.textPrimary));
        Intrinsics.checkNotNullExpressionValue(valueOf2, "valueOf(...)");
        this.mSuffixTextColor = valueOf2;
        ColorStateList colorStateList = context.getColorStateList(R$color.selector_text_input_layout);
        Intrinsics.checkNotNullExpressionValue(colorStateList, "getColorStateList(...)");
        this.mColorStateList = colorStateList;
        int themeColor = ThemeExtKt.themeColor(context, R$attr.bgOverlap);
        this.barColor = themeColor;
        int color = context.getColor(UniColors.BG_ACTION_SECONDARY_SOLID.getResId());
        this.barHighlightColor = color;
        this.rangeFromTIL = createTextInputLayout(5747, StringProvider.getString(R$string.rangefilter_from_value_atom_range_filter));
        RangeFilterTextInputEditText createTextInputEditText = createTextInputEditText(5748);
        this.rangeFromET = createTextInputEditText;
        this.rangeToTIL = createTextInputLayout(5745, StringProvider.getString(R$string.rangefilter_to_value_atom_range_filter));
        RangeFilterTextInputEditText createTextInputEditText2 = createTextInputEditText(5746);
        this.rangeToET = createTextInputEditText2;
        FilterSeekbar filterSeekbar = new FilterSeekbar(context);
        filterSeekbar.setId(5749);
        filterSeekbar.setLayoutParams(new ConstraintLayout.b(0, -2));
        Bitmap createThumbBitmap = createThumbBitmap();
        if (createThumbBitmap != null) {
            filterSeekbar.setLeftThumbBitmap(createThumbBitmap);
            filterSeekbar.setRightThumbBitmap(createThumbBitmap);
        }
        filterSeekbar.setCornerRadius(pxF);
        filterSeekbar.m1238setBarHeight(pxF2);
        filterSeekbar.setBarColor(themeColor);
        filterSeekbar.setBarHighlightColor(color);
        filterSeekbar.setMinValue(0.0f);
        filterSeekbar.setMaxValue(1.0f);
        filterSeekbar.setDataType(3);
        this.rangeSeekbar = filterSeekbar;
        OpenRangeFilterEditTextFormatter openRangeFilterEditTextFormatter = new OpenRangeFilterEditTextFormatter();
        this.editTextFormatter = openRangeFilterEditTextFormatter;
        this.fromEtWatcher = new OpenRangeFilterNumberSeparatorTextWatcher(createTextInputEditText, openRangeFilterEditTextFormatter, OpenRangeFilterInputType.From.INSTANCE);
        this.toEtWatcher = new OpenRangeFilterNumberSeparatorTextWatcher(createTextInputEditText2, this.editTextFormatter, OpenRangeFilterInputType.To.INSTANCE);
        Object systemService = context.getSystemService("input_method");
        this.inputMethodManager = systemService instanceof InputMethodManager ? (InputMethodManager) systemService : null;
        this.valueInterpolator = new OpenRangeFilterValueInterpolator();
        addViews();
        setConstraints();
        setInputs();
        setSeekbar();
    }

    private final int getValue(EditText editText, int i11, String str) {
        Integer w02 = h.w0(h.X(C3143a.g("\\s", editText.getText().toString(), ""), str, "", false));
        return w02 != null ? w02.intValue() : i11;
    }
}
