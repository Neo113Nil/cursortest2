package defpackage;

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
import android.view.ActionMode;
import android.view.DragEvent;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.view.inputmethod.InputMethodManager;
import android.view.textclassifier.TextClassifier;
import android.widget.EditText;
import android.widget.TextView;
import androidx.annotation.NonNull;
import androidx.annotation.Nullable;
import com.sofascore.results.R;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public class zb0 extends EditText implements mqd {
    public final cb0 a;
    public final xc0 b;
    public final f4a c;
    public final ofj d;
    public final f4a e;
    public yb0 f;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public zb0(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.editTextStyle);
        gjj.a(context);
        wfj.a(getContext(), this);
        cb0 cb0Var = new cb0(this);
        this.a = cb0Var;
        cb0Var.d(attributeSet, R.attr.editTextStyle);
        xc0 xc0Var = new xc0(this);
        this.b = xc0Var;
        xc0Var.f(attributeSet, R.attr.editTextStyle);
        xc0Var.b();
        f4a f4aVar = new f4a((char) 0, 20);
        f4aVar.b = this;
        this.c = f4aVar;
        this.d = new ofj();
        f4a f4aVar2 = new f4a((EditText) this);
        this.e = f4aVar2;
        f4aVar2.o(attributeSet, R.attr.editTextStyle);
        KeyListener keyListener = getKeyListener();
        if (keyListener instanceof NumberKeyListener) {
            return;
        }
        boolean isFocusable = super.isFocusable();
        boolean isClickable = super.isClickable();
        boolean isLongClickable = super.isLongClickable();
        int inputType = super.getInputType();
        KeyListener k = f4aVar2.k(keyListener);
        if (k == keyListener) {
            return;
        }
        super.setKeyListener(k);
        super.setRawInputType(inputType);
        super.setFocusable(isFocusable);
        super.setClickable(isClickable);
        super.setLongClickable(isLongClickable);
    }

    @NonNull
    private yb0 getSuperCaller() {
        yb0 yb0Var = this.f;
        if (yb0Var != null) {
            return yb0Var;
        }
        yb0 yb0Var2 = new yb0(this);
        this.f = yb0Var2;
        return yb0Var2;
    }

    @Override // defpackage.mqd
    public final bp3 a(bp3 bp3Var) {
        this.d.getClass();
        return ofj.a(this, bp3Var);
    }

    @Override // android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.a();
        }
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    @Nullable
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return i9a.N(super.getCustomSelectionActionModeCallback());
    }

    @Nullable
    public ColorStateList getSupportBackgroundTintList() {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            return cb0Var.b();
        }
        return null;
    }

    @Nullable
    public PorterDuff.Mode getSupportBackgroundTintMode() {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            return cb0Var.c();
        }
        return null;
    }

    @Nullable
    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.b.d();
    }

    @Nullable
    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.b.e();
    }

    @Override // android.widget.EditText, android.widget.TextView
    @Nullable
    public Editable getText() {
        return Build.VERSION.SDK_INT >= 28 ? super.getText() : super.getEditableText();
    }

    @Override // android.widget.TextView
    @NonNull
    public TextClassifier getTextClassifier() {
        f4a f4aVar;
        if (Build.VERSION.SDK_INT >= 28 || (f4aVar = this.c) == null) {
            return super.getTextClassifier();
        }
        TextClassifier textClassifier = (TextClassifier) f4aVar.c;
        return textClassifier == null ? rc0.a((TextView) f4aVar.b) : textClassifier;
    }

    @Override // android.widget.TextView, android.view.View
    public InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        String[] i;
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        this.b.getClass();
        int i2 = Build.VERSION.SDK_INT;
        if (i2 < 30 && onCreateInputConnection != null) {
            lz.M(editorInfo, getText());
        }
        xw3.N(editorInfo, onCreateInputConnection, this);
        if (onCreateInputConnection != null && i2 <= 30 && (i = bsk.i(this)) != null) {
            editorInfo.contentMimeTypes = i;
            onCreateInputConnection = new b4a(onCreateInputConnection, new kr9(this, 3));
        }
        return this.e.p(onCreateInputConnection, editorInfo);
    }

    @Override // android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        int i = Build.VERSION.SDK_INT;
        if (i < 30 || i >= 33) {
            return;
        }
        ((InputMethodManager) getContext().getSystemService("input_method")).isActive(this);
    }

    @Override // android.widget.TextView, android.view.View
    public final boolean onDragEvent(DragEvent dragEvent) {
        Activity activity;
        boolean z = false;
        if (Build.VERSION.SDK_INT < 31 && dragEvent.getLocalState() == null && bsk.i(this) != null) {
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
                toString();
            } else if (dragEvent.getAction() != 1 && dragEvent.getAction() == 3) {
                z = fc0.a(dragEvent, this, activity);
            }
        }
        if (z) {
            return true;
        }
        return super.onDragEvent(dragEvent);
    }

    @Override // android.widget.EditText, android.widget.TextView
    public final boolean onTextContextMenuItem(int i) {
        yo3 yo3Var;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 31 || bsk.i(this) == null || !(i == 16908322 || i == 16908337)) {
            return super.onTextContextMenuItem(i);
        }
        ClipboardManager clipboardManager = (ClipboardManager) getContext().getSystemService("clipboard");
        ClipData primaryClip = clipboardManager == null ? null : clipboardManager.getPrimaryClip();
        if (primaryClip != null && primaryClip.getItemCount() > 0) {
            if (i2 >= 31) {
                yo3Var = new xo3(primaryClip, 1);
            } else {
                zo3 zo3Var = new zo3();
                zo3Var.b = primaryClip;
                zo3Var.c = 1;
                yo3Var = zo3Var;
            }
            yo3Var.d(i == 16908322 ? 0 : 1);
            bsk.m(this, yo3Var.build());
        }
        return true;
    }

    @Override // android.view.View
    public void setBackgroundDrawable(@Nullable Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i) {
        super.setBackgroundResource(i);
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.f(i);
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(@Nullable ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(i9a.O(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z) {
        this.e.y(z);
    }

    @Override // android.widget.TextView
    public void setKeyListener(@Nullable KeyListener keyListener) {
        super.setKeyListener(this.e.k(keyListener));
    }

    public void setSupportBackgroundTintList(@Nullable ColorStateList colorStateList) {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(@Nullable PorterDuff.Mode mode) {
        cb0 cb0Var = this.a;
        if (cb0Var != null) {
            cb0Var.i(mode);
        }
    }

    public void setSupportCompoundDrawablesTintList(@Nullable ColorStateList colorStateList) {
        xc0 xc0Var = this.b;
        xc0Var.k(colorStateList);
        xc0Var.b();
    }

    public void setSupportCompoundDrawablesTintMode(@Nullable PorterDuff.Mode mode) {
        xc0 xc0Var = this.b;
        xc0Var.l(mode);
        xc0Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i) {
        super.setTextAppearance(context, i);
        xc0 xc0Var = this.b;
        if (xc0Var != null) {
            xc0Var.g(i, context);
        }
    }

    @Override // android.widget.TextView
    public void setTextClassifier(@Nullable TextClassifier textClassifier) {
        f4a f4aVar;
        if (Build.VERSION.SDK_INT >= 28 || (f4aVar = this.c) == null) {
            super.setTextClassifier(textClassifier);
        } else {
            f4aVar.c = textClassifier;
        }
    }
}
