package androidx.appcompat.widget;

import android.app.Activity;
import android.content.ClipData;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.res.ColorStateList;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.text.Editable;
import android.text.method.KeyListener;
import android.text.method.NumberKeyListener;
import android.util.AttributeSet;
import android.util.Log;
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class d0 extends EditText implements androidx.core.view.y, androidx.core.widget.m {

    @NonNull
    private final e0 mAppCompatEmojiEditTextHelper;
    private final u mBackgroundTintHelper;
    private final androidx.core.widget.k mDefaultOnReceiveContentListener;
    private c0 mSuperCaller;
    private final b1 mTextClassifierHelper;
    private final j1 mTextHelper;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public d0(Context context, AttributeSet attributeSet, int i5) {
        super(context, attributeSet, i5);
        z3.a(context);
        y3.a(this, getContext());
        u uVar = new u(this);
        this.mBackgroundTintHelper = uVar;
        uVar.d(attributeSet, i5);
        j1 j1Var = new j1(this);
        this.mTextHelper = j1Var;
        j1Var.f(attributeSet, i5);
        j1Var.b();
        b1 b1Var = new b1();
        b1Var.f704a = this;
        this.mTextClassifierHelper = b1Var;
        this.mDefaultOnReceiveContentListener = new androidx.core.widget.k();
        e0 e0Var = new e0(this);
        this.mAppCompatEmojiEditTextHelper = e0Var;
        e0Var.b(attributeSet, i5);
        initEmojiKeyListener(e0Var);
    }

    @NonNull
    private c0 getSuperCaller() {
        if (this.mSuperCaller == null) {
            this.mSuperCaller = new c0(this);
        }
        return this.mSuperCaller;
    }

    @Override // android.widget.TextView, android.view.View
    public void drawableStateChanged() {
        super.drawableStateChanged();
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.a();
        }
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.google.android.play.core.appupdate.b.I(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.mTextHelper.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.mTextHelper.e();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        b1 b1Var;
        if (Build.VERSION.SDK_INT >= 28 || (b1Var = this.mTextClassifierHelper) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = b1Var.f705b;
        return textClassifier == null ? a1.a(b1Var.f704a) : textClassifier;
    }

    public void initEmojiKeyListener(e0 e0Var) {
        KeyListener keyListener = getKeyListener();
        e0Var.getClass();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener a7 = e0Var.a(keyListener);
        if (a7 == keyListener) {
            return;
        }
        super.setKeyListener(a7);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    public boolean isEmojiCompatEnabled() {
        return ((l1.j) ((l1.a) this.mAppCompatEmojiEditTextHelper.f736b.f10882b).f19315c).f19334c;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        int i5;
        String[] g10;
        InputConnection dVar;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.mTextHelper.getClass();
        j1.h(editorInfo, onCreateInputConnection, this);
        k2.x.x(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && (i5 = Build.VERSION.SDK_INT) <= 30 && (g10 = androidx.core.view.z0.g(this)) != null) {
            r0.b.b(editorInfo, g10);
            io.sentry.android.core.internal.gestures.c cVar = new io.sentry.android.core.internal.gestures.c(20, this);
            if (i5 >= 25) {
                dVar = new r0.c(onCreateInputConnection, cVar);
            } else if (r0.b.a(editorInfo).length != 0) {
                dVar = new r0.d(onCreateInputConnection, cVar);
            }
            onCreateInputConnection = dVar;
        }
        return this.mAppCompatEmojiEditTextHelper.c(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 < 30 || i5 >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        int i5 = Build.VERSION.SDK_INT;
        boolean z5 = false;
        if (i5 < 31 && i5 >= 24 && dragEvent.getLocalState() == null && androidx.core.view.z0.g(this) != null) {
            Context context = getContext();
            while (true) {
                if (!(context instanceof ContextWrapper)) {
                    activity = null;
                    break;
                }
                if (context instanceof Activity) {
                    activity = (Activity) context;
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            if (activity == null) {
                Log.i("ReceiveContent", "Can't handle drop: no activity: view=" + this);
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z5 = n0.a(dragEvent, this, activity);
            }
        }
        if (z5) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // androidx.core.view.y
    public androidx.core.view.h onReceiveContent(@NonNull androidx.core.view.h hVar) {
        this.mDefaultOnReceiveContentListener.getClass();
        return androidx.core.widget.k.a(this, hVar);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public boolean onTextContextMenuItem(int i5) {
        androidx.core.view.e eVar;
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31 || androidx.core.view.z0.g(this) == null || !(i5 == 16908322 || i5 == 16908337)) {
            return super.onTextContextMenuItem(i5);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i10 >= 31) {
                eVar = new androidx.core.view.d(primaryClip, 1);
            } else {
                androidx.core.view.f fVar = new androidx.core.view.f();
                fVar.f1310b = primaryClip;
                fVar.f1311c = 1;
                eVar = fVar;
            }
            eVar.c(i5 == 16908322 ? 0 : 1);
            androidx.core.view.z0.k(this, eVar.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.f(i5);
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.play.core.appupdate.b.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        this.mAppCompatEmojiEditTextHelper.d(z5);
    }

    @Override // android.widget.TextView
    public void setKeyListener(KeyListener keyListener) {
        super.setKeyListener(this.mAppCompatEmojiEditTextHelper.a(keyListener));
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        u uVar = this.mBackgroundTintHelper;
        if (uVar != null) {
            uVar.i(mode);
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        this.mTextHelper.l(colorStateList);
        this.mTextHelper.b();
    }

    @Override // androidx.core.widget.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        this.mTextHelper.m(mode);
        this.mTextHelper.b();
    }

    @Override // android.widget.TextView
    public void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        j1 j1Var = this.mTextHelper;
        if (j1Var != null) {
            j1Var.g(context, i5);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(TextClassifier textClassifier) {
        b1 b1Var;
        if (Build.VERSION.SDK_INT >= 28 || (b1Var = this.mTextClassifierHelper) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            b1Var.f705b = textClassifier;
        }
    }

    @Override // android.widget.EditText, android.widget.TextView
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }
}
