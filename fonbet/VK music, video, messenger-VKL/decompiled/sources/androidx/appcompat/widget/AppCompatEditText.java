package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.vkontakte.android.R;
import xsna.chj;
import xsna.e33;
import xsna.f23;
import xsna.hno0;
import xsna.iut0;
import xsna.k4p;
import xsna.l33;
import xsna.lno0;
import xsna.m1x;
import xsna.o33;
import xsna.p33;
import xsna.pa80;
import xsna.qpo0;
import xsna.uyo0;
import xsna.y6l;

/* loaded from: classes.dex */
public class AppCompatEditText extends EditText implements pa80 {

    @NonNull
    private final e33 mAppCompatEmojiEditTextHelper;
    private final f23 mBackgroundTintHelper;
    private final lno0 mDefaultOnReceiveContentListener;

    @Nullable
    private a mSuperCaller;
    private final o33 mTextClassifierHelper;
    private final p33 mTextHelper;

    /* loaded from: classes11.dex */
    public class a {
        public a() {
        }

        @Nullable
        public final TextClassifier a() {
            return AppCompatEditText.super.getTextClassifier();
        }

        public final void b(TextClassifier textClassifier) {
            AppCompatEditText.super.setTextClassifier(textClassifier);
        }
    }

    public AppCompatEditText(@NonNull Context context) {
        this(context, null);
    }

    @NonNull
    private a getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new a();
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.a();
        }
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return hno0.d(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            return f23Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            return f23Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        return getSuperCaller().a();
    }

    public void initEmojiKeyListener(e33 e33Var) {
        KeyListener keyListener = getKeyListener();
        e33Var.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a2 = e33Var.a(keyListener);
        if (a2 == keyListener) {
            return;
        }
        super.setKeyListener(a2);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @Override // android.widget.TextView, android.view.View
    @Nullable
    public InputConnection onCreateInputConnection(@NonNull EditorInfo editorInfo) {
        String[] h;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 && onCreateInputConnection != null) {
            k4p.b(editorInfo, getText());
        }
        y6l.b(onCreateInputConnection, editorInfo, this);
        if (onCreateInputConnection != null && i <= 30 && (h = iut0.h(this)) != null) {
            k4p.a(editorInfo, h);
            onCreateInputConnection = m1x.a(this, onCreateInputConnection, editorInfo);
        }
        return this.mAppCompatEmojiEditTextHelper.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        if (l33.a(this, dragEvent)) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // xsna.pa80
    @Nullable
    public chj onReceiveContent(@NonNull chj chjVar) {
        return this.mDefaultOnReceiveContentListener.a(this, chjVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i) {
        if (l33.b(this, i)) {
            return true;
        }
        return super.onTextContextMenuItem(i);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(@Nullable Drawable drawable, @Nullable Drawable drawable2, @Nullable Drawable drawable3, @Nullable Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(callback);
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.mAppCompatEmojiEditTextHelper.d(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        f23 f23Var = this.mBackgroundTintHelper;
        if (f23Var != null) {
            f23Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        this.mTextHelper.h(colorStateList);
        this.mTextHelper.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        this.mTextHelper.i(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        p33 p33Var = this.mTextHelper;
        if (p33Var != null) {
            p33Var.g(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        getSuperCaller().b(textClassifier);
    }

    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet) {
        this(context, attributeSet, R.attr.editTextStyle);
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return super.getText();
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AppCompatEditText(@NonNull Context context, @Nullable AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        uyo0.a(context);
        qpo0.a(getContext(), this);
        f23 f23Var = new f23(this);
        this.mBackgroundTintHelper = f23Var;
        f23Var.d(attributeSet, i);
        p33 p33Var = new p33(this);
        this.mTextHelper = p33Var;
        p33Var.f(attributeSet, i);
        p33Var.b();
        this.mTextClassifierHelper = new o33();
        this.mDefaultOnReceiveContentListener = new lno0();
        e33 e33Var = new e33(this);
        this.mAppCompatEmojiEditTextHelper = e33Var;
        e33Var.b(attributeSet, i);
        initEmojiKeyListener(e33Var);
    }
}
