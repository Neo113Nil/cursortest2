package com.vk.core.view.components.formitem;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.drawable.Drawable;
import android.os.Parcel;
import android.os.Parcelable;
import android.text.Editable;
import android.text.InputFilter;
import android.text.Layout;
import android.text.TextWatcher;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.MotionEvent;
import android.view.View;
import android.view.inputmethod.InputMethodManager;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatEditText;
import androidx.customview.view.AbsSavedState;
import com.vk.core.view.components.R$styleable;
import com.vk.core.view.components.formitem.VkInputSelect;
import com.vk.typography.FontFamily;
import com.vkontakte.android.R;
import java.util.ArrayList;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.bpn0;
import xsna.e3m;
import xsna.ei50;
import xsna.epx;
import xsna.fo10;
import xsna.fxp;
import xsna.g0s0;
import xsna.gzs;
import xsna.izs;
import xsna.j5g;
import xsna.jir0;
import xsna.m1p;
import xsna.q1p;
import xsna.q80;
import xsna.rl3;
import xsna.s3q0;
import xsna.waf0;
import xsna.wzs;
import xsna.y8p0;
import xsna.zrp;

/* compiled from: VkInputSelect.kt */
/* loaded from: classes17.dex */
public final class VkInputSelect extends LinearLayout implements fxp, jir0, ei50, q80, m1p {
    public static final /* synthetic */ int m = 0;
    public boolean b;
    public boolean c;
    public InputSize d;
    public boolean e;
    public a f;
    public final VkInputSelectEditText g;
    public final ImageView h;
    public final bpn0 i;
    public final bpn0 j;
    public com.vk.core.view.components.formitem.a k;
    public gzs<s3q0> l;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkInputSelect.kt */
    public static final class InputSize {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ InputSize[] $VALUES;
        public static final InputSize SingleLine;
        public static final InputSize TextArea;
        public static final InputSize Undefined;

        static {
            InputSize inputSize = new InputSize("SingleLine", 0);
            SingleLine = inputSize;
            InputSize inputSize2 = new InputSize("TextArea", 1);
            TextArea = inputSize2;
            InputSize inputSize3 = new InputSize("Undefined", 2);
            Undefined = inputSize3;
            InputSize[] inputSizeArr = {inputSize, inputSize2, inputSize3};
            $VALUES = inputSizeArr;
            $ENTRIES = new asp(inputSizeArr);
        }

        public InputSize() {
            throw null;
        }

        public static zrp<InputSize> h() {
            return $ENTRIES;
        }

        public static InputSize valueOf(String str) {
            return (InputSize) Enum.valueOf(InputSize.class, str);
        }

        public static InputSize[] values() {
            return (InputSize[]) $VALUES.clone();
        }
    }

    /* compiled from: VkInputSelect.kt */
    public interface a {

        /* compiled from: VkInputSelect.kt */
        /* renamed from: com.vk.core.view.components.formitem.VkInputSelect$a$a, reason: collision with other inner class name */
        public static final class C0837a implements a {
            public final boolean equals(Object obj) {
                if (this == obj) {
                    return true;
                }
                if (!(obj instanceof C0837a)) {
                    return false;
                }
                ((C0837a) obj).getClass();
                return true;
            }

            public final int hashCode() {
                throw null;
            }

            public final String toString() {
                return "Icon(icon=null, onClick=null, iconTint=null, iconDescription=null)";
            }
        }
    }

    /* compiled from: VkInputSelect.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[InputSize.values().length];
            try {
                iArr[InputSize.Undefined.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[InputSize.TextArea.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[InputSize.SingleLine.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VkInputSelect(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 4);
    }

    private final int[] getErrorState() {
        return (int[]) this.i.getValue();
    }

    private final int[] getValidState() {
        return (int[]) this.j.getValue();
    }

    @Override // xsna.q80
    public final boolean a() {
        return this.d == InputSize.SingleLine;
    }

    public final void b(TextWatcher textWatcher) {
        this.g.addTextChangedListener(textWatcher);
    }

    public final void c(izs<? super Editable, s3q0> izsVar) {
        this.g.addTextChangedListener(new d(izsVar));
    }

    public final void d() {
        this.h.setVisibility(this.f != null ? 0 : 8);
        a aVar = this.f;
        if (aVar != null) {
            if (!(aVar instanceof a.C0837a)) {
                throw new NoWhenBranchMatchedException();
            }
            getContext();
            throw null;
        }
    }

    public final void e(TextWatcher textWatcher) {
        this.g.removeTextChangedListener(textWatcher);
    }

    public final a getAfter() {
        return this.f;
    }

    public final ActionMode.Callback getCustomInsertionActionModeCallback() {
        return this.g.getCustomInsertionActionModeCallback();
    }

    public final ActionMode.Callback getCustomSelectionActionModeCallback() {
        return this.g.getCustomSelectionActionModeCallback();
    }

    public final boolean getDisableSaveInstanceState() {
        return this.e;
    }

    public final Editable getEditableText() {
        return this.g.getEditableText();
    }

    public final boolean getFillByHeight() {
        return this.g.getFillByHeight();
    }

    public final InputFilter[] getFilters() {
        return this.g.getFilters();
    }

    public final CharSequence getHint() {
        return this.g.getHint();
    }

    public final int getImeOptions() {
        return this.g.getImeOptions();
    }

    public final InputSize getInputSize() {
        return this.d;
    }

    public final int getInputType() {
        return this.g.getInputType();
    }

    public final Layout getLayout() {
        return this.g.getLayout();
    }

    public final int getLineCount() {
        return this.g.getLineCount();
    }

    public final int getMaxLines() {
        return this.g.getMaxLines();
    }

    @Override // android.view.View
    public int getPaddingBottom() {
        int paddingBottom = super.getPaddingBottom();
        return paddingBottom == 0 ? this.g.getPaddingBottom() : paddingBottom;
    }

    @Override // android.view.View
    public int getPaddingLeft() {
        int paddingLeft = super.getPaddingLeft();
        return paddingLeft == 0 ? this.g.getPaddingLeft() : paddingLeft;
    }

    @Override // android.view.View
    public int getPaddingStart() {
        int paddingStart = super.getPaddingStart();
        return paddingStart == 0 ? this.g.getPaddingStart() : paddingStart;
    }

    @Override // android.view.View
    public int getPaddingTop() {
        int paddingTop = super.getPaddingTop();
        return paddingTop == 0 ? this.g.getPaddingTop() : paddingTop;
    }

    public final int getSelectionEnd() {
        return this.g.getSelectionEnd();
    }

    public final int getSelectionStart() {
        return this.g.getSelectionStart();
    }

    public final Editable getText() {
        return this.g.getText();
    }

    public final Drawable getTextCursorDrawable() {
        Drawable textCursorDrawable;
        textCursorDrawable = this.g.getTextCursorDrawable();
        return textCursorDrawable;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final int[] onCreateDrawableState(int i) {
        int[] onCreateDrawableState = super.onCreateDrawableState(i + 2);
        if (this.b) {
            View.mergeDrawableStates(onCreateDrawableState, getErrorState());
        }
        if (this.c) {
            View.mergeDrawableStates(onCreateDrawableState, getValidState());
        }
        return onCreateDrawableState;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        if (parcelable instanceof State) {
            State state = (State) parcelable;
            super.onRestoreInstanceState(!epx.f(state.b, AbsSavedState.c) ? state.b : null);
            setInputSize(state.d);
            this.e = state.e;
            setFillByHeight(state.f);
        }
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        Parcelable onSaveInstanceState = super.onSaveInstanceState();
        if (onSaveInstanceState == null) {
            return null;
        }
        if (this.e) {
            onSaveInstanceState = AbsSavedState.c;
        }
        State state = new State(onSaveInstanceState);
        state.d = this.d;
        state.e = this.e;
        state.f = getFillByHeight();
        return state;
    }

    @Override // android.view.View
    public final boolean onTouchEvent(MotionEvent motionEvent) {
        if (this.d == InputSize.TextArea && this.g.getLineCount() > 9) {
            getParent().requestDisallowInterceptTouchEvent(true);
            Integer valueOf = motionEvent != null ? Integer.valueOf(motionEvent.getAction() & 255) : null;
            if (valueOf != null && valueOf.intValue() == 1) {
                getParent().requestDisallowInterceptTouchEvent(false);
            }
        }
        return super.onTouchEvent(motionEvent);
    }

    @Override // android.view.View
    public void setActivated(boolean z) {
        super.setActivated(z);
        this.g.setActivated(z);
    }

    public final void setAfter(a aVar) {
        this.f = aVar;
        d();
    }

    public final void setCursorColor(int i) {
        q1p.a(this.g, i);
    }

    public final void setCustomInsertionActionModeCallback(ActionMode.Callback callback) {
        this.g.setCustomInsertionActionModeCallback(callback);
    }

    public final void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        this.g.setCustomSelectionActionModeCallback(callback);
    }

    public final void setDisableSaveInstanceState(boolean z) {
        this.e = z;
    }

    public final void setEmojiCompatEnabled(boolean z) {
        this.g.setEmojiCompatEnabled(z);
    }

    @Override // android.view.View
    public void setEnabled(boolean z) {
        super.setEnabled(z);
        this.g.setEnabled(z);
    }

    @Override // xsna.fxp
    public void setError(boolean z) {
        if (this.b == z) {
            return;
        }
        this.b = z;
        refreshDrawableState();
    }

    public final void setFillByHeight(boolean z) {
        this.g.setFillByHeight(z);
    }

    public final void setFilters(InputFilter[] inputFilterArr) {
        this.g.setFilters(inputFilterArr);
    }

    public final void setFont(FontFamily fontFamily) {
        com.vk.typography.b.k(this.g, fontFamily, null, 6);
    }

    @Override // android.widget.LinearLayout
    public void setGravity(int i) {
        if (getChildCount() == 0) {
            super.setGravity(i);
        } else {
            super.setGravity(16);
            this.g.setGravity(i);
        }
    }

    public final void setHint(CharSequence charSequence) {
        this.g.setHint(charSequence);
    }

    public final void setHintTextColor(int i) {
        this.g.setHintTextColor(i);
    }

    public final void setImeOptions(int i) {
        this.g.setImeOptions(i);
    }

    public final void setInputSize(InputSize inputSize) {
        if (this.d == inputSize) {
            return;
        }
        this.d = inputSize;
        int i = c.$EnumSwitchMapping$0[inputSize.ordinal()];
        if (i == 1) {
            setVerticalScrollBarEnabled(false);
            getEditText().setMinLines(0);
            getEditText().setMaxLines(Integer.MAX_VALUE);
        } else if (i == 2) {
            setVerticalScrollBarEnabled(true);
            getEditText().setInputType(131073);
            getEditText().setMinLines(2);
            getEditText().setMaxLines(9);
        } else {
            if (i != 3) {
                throw new NoWhenBranchMatchedException();
            }
            setVerticalScrollBarEnabled(false);
            getEditText().setInputType(1);
            getEditText().setMinLines(1);
            getEditText().setMaxLines(1);
        }
        requestLayout();
    }

    public final void setInputType(int i) {
        this.g.setInputType(i);
    }

    public final void setLinkTextColor(int i) {
        this.g.setLinkTextColor(i);
    }

    public final void setMaxLines(int i) {
        this.g.setMaxLines(i);
    }

    public final void setMaxLinesNumber(int i) {
        VkInputSelectEditText vkInputSelectEditText = this.g;
        ArrayList w0 = rl3.w0(vkInputSelectEditText.getFilters());
        w0.add(new fo10(i));
        vkInputSelectEditText.setFilters((InputFilter[]) w0.toArray(new InputFilter[0]));
    }

    @Override // xsna.q80
    public void setOnActiveStateChangeListener(gzs<s3q0> gzsVar) {
        this.l = gzsVar;
    }

    @Override // android.view.View
    public void setOnClickListener(View.OnClickListener onClickListener) {
        this.g.setOnClickListener(onClickListener);
    }

    @Override // xsna.ei50
    public void setOnContentChangedListener(gzs<s3q0> gzsVar) {
        this.g.removeTextChangedListener(this.k);
        com.vk.core.view.components.formitem.a aVar = new com.vk.core.view.components.formitem.a(new waf0(gzsVar, 26));
        getEditText().addTextChangedListener(aVar);
        this.k = aVar;
    }

    public final void setOnEditorActionListener(TextView.OnEditorActionListener onEditorActionListener) {
        this.g.setOnEditorActionListener(onEditorActionListener);
    }

    public void setOnSelectionChangedListener(wzs<? super Integer, ? super Integer, s3q0> wzsVar) {
        this.g.setSelectionChangeListener(wzsVar);
    }

    @Override // android.view.View
    public final void setPadding(int i, int i2, int i3, int i4) {
        if (getChildCount() == 0) {
            super.setPadding(i, i2, i3, i4);
        } else {
            super.setPadding(0, 0, i3, 0);
            this.g.setPadding(i, i2, 0, i4);
        }
    }

    @Override // android.view.View
    public final void setPaddingRelative(int i, int i2, int i3, int i4) {
        if (getChildCount() == 0) {
            super.setPaddingRelative(i, i2, i3, i4);
        } else {
            super.setPaddingRelative(0, 0, i3, 0);
            this.g.setPaddingRelative(i, i2, 0, i4);
        }
    }

    public final void setSelection(int i) {
        this.g.setSelection(i);
    }

    public final void setText(Editable editable) {
        this.g.setText(editable);
    }

    public final void setTextColor(int i) {
        this.g.setTextColor(i);
    }

    @Override // xsna.jir0
    public void setValid(boolean z) {
        if (this.c == z) {
            return;
        }
        this.c = z;
        refreshDrawableState();
    }

    @Override // xsna.ei50
    public final boolean y0() {
        Editable text = getText();
        return !(text == null || text.length() == 0);
    }

    /* compiled from: VkInputSelect.kt */
    public static final class State extends AbsSavedState {
        public static final Parcelable.ClassLoaderCreator<State> CREATOR = new a();
        public InputSize d;
        public boolean e;
        public boolean f;

        /* compiled from: VkInputSelect.kt */
        public static final class a implements Parcelable.ClassLoaderCreator<State> {
            @Override // android.os.Parcelable.Creator
            public final Object createFromParcel(Parcel parcel) {
                return new State(parcel, null);
            }

            @Override // android.os.Parcelable.Creator
            public final Object[] newArray(int i) {
                return new State[i];
            }

            @Override // android.os.Parcelable.ClassLoaderCreator
            public final State createFromParcel(Parcel parcel, ClassLoader classLoader) {
                return new State(parcel, classLoader);
            }
        }

        public State(Parcelable parcelable) {
            super(parcelable);
            this.d = InputSize.Undefined;
        }

        @Override // androidx.customview.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            parcel.writeParcelable(this.b, i);
            parcel.writeInt(this.d.ordinal());
            parcel.writeInt(this.e ? 1 : 0);
            parcel.writeInt(this.f ? 1 : 0);
        }

        public State(Parcel parcel, ClassLoader classLoader) {
            super(parcel, classLoader);
            InputSize inputSize = InputSize.Undefined;
            this.d = inputSize;
            InputSize inputSize2 = (InputSize) j5g.b0(parcel.readInt(), InputSize.h());
            this.d = inputSize2 != null ? inputSize2 : inputSize;
            this.e = parcel.readInt() == 1;
            this.f = parcel.readInt() == 1;
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v3, types: [java.lang.Enum] */
    /* JADX WARN: Type inference failed for: r9v0, types: [android.view.View, android.view.ViewGroup, android.widget.LinearLayout, com.vk.core.view.components.formitem.VkInputSelect] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public VkInputSelect(final Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, 0);
        attributeSet = (i & 2) != 0 ? null : attributeSet;
        InputSize inputSize = InputSize.Undefined;
        this.d = inputSize;
        VkInputSelectEditText vkInputSelectEditText = new VkInputSelectEditText(context, attributeSet);
        this.g = vkInputSelectEditText;
        ImageView imageView = new ImageView(context);
        this.h = imageView;
        this.i = new bpn0(new g0s0(3));
        this.j = new bpn0(new y8p0(4));
        vkInputSelectEditText.setId(-1);
        addView(vkInputSelectEditText, new LinearLayout.LayoutParams(0, -2, 1.0f));
        LinearLayout.LayoutParams layoutParams = new LinearLayout.LayoutParams(-2, -2);
        layoutParams.setMarginStart(e3m.a(R.dimen.vk_ui_spacing_size_m, context));
        s3q0 s3q0Var = s3q0.a;
        addView(imageView, layoutParams);
        vkInputSelectEditText.setBackground(null);
        setGravity(getGravity());
        setOrientation(0);
        setMinimumHeight(0);
        setNextFocusDownId(-1);
        setPaddingRelative(getPaddingStart(), getPaddingTop(), getPaddingEnd(), getPaddingBottom());
        d();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.s);
        ?? r0 = (Enum) rl3.S(obtainStyledAttributes.getInt(2, inputSize.ordinal()), InputSize.values());
        setInputSize(r0 != 0 ? r0 : inputSize);
        this.e = obtainStyledAttributes.getBoolean(0, false);
        setFillByHeight(obtainStyledAttributes.getBoolean(1, false));
        obtainStyledAttributes.recycle();
        vkInputSelectEditText.setOnFocusChangeListener(new View.OnFocusChangeListener() { // from class: xsna.v0v0
            @Override // android.view.View.OnFocusChangeListener
            public final void onFocusChange(View view, boolean z) {
                InputMethodManager inputMethodManager;
                int i2 = VkInputSelect.m;
                VkInputSelect vkInputSelect = VkInputSelect.this;
                View.OnFocusChangeListener onFocusChangeListener = vkInputSelect.getOnFocusChangeListener();
                if (onFocusChangeListener != null) {
                    onFocusChangeListener.onFocusChange(view, z);
                }
                gzs<s3q0> gzsVar = vkInputSelect.l;
                if (gzsVar != null) {
                    gzsVar.invoke();
                }
                if (!vkInputSelect.hasFocus() || (inputMethodManager = (InputMethodManager) context.getSystemService("input_method")) == null) {
                    return;
                }
                inputMethodManager.showSoftInput(vkInputSelect.getEditText(), 0);
            }
        });
    }

    @Override // xsna.m1p
    public AppCompatEditText getEditText() {
        return this.g;
    }

    public final void setHint(int i) {
        this.g.setHint(i);
    }

    public final void setText(CharSequence charSequence) {
        this.g.setText(charSequence);
    }

    /* compiled from: VkInputSelect.kt */
    public static abstract class b implements TextWatcher {
        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }

    /* compiled from: TextView.kt */
    public static final class d implements TextWatcher {
        public final /* synthetic */ izs b;

        public d(izs izsVar) {
            this.b = izsVar;
        }

        @Override // android.text.TextWatcher
        public final void afterTextChanged(Editable editable) {
            this.b.invoke(editable);
        }

        @Override // android.text.TextWatcher
        public final void beforeTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }

        @Override // android.text.TextWatcher
        public final void onTextChanged(CharSequence charSequence, int i, int i2, int i3) {
        }
    }
}
