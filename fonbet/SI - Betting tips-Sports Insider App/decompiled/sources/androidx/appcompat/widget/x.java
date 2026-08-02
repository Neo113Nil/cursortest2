package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.view.ActionMode;
import android.view.inputmethod.EditorInfo;
import android.view.inputmethod.InputConnection;
import android.widget.CheckedTextView;
import androidx.annotation.NonNull;
import com.sports.insider.R;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x extends CheckedTextView implements androidx.core.widget.m {

    /* renamed from: a, reason: collision with root package name */
    public final y f994a;

    /* renamed from: b, reason: collision with root package name */
    public final u f995b;

    /* renamed from: c, reason: collision with root package name */
    public final j1 f996c;

    /* renamed from: d, reason: collision with root package name */
    public f0 f997d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Removed duplicated region for block: B:11:0x0080 A[Catch: all -> 0x005f, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0047, B:5:0x004d, B:8:0x0053, B:9:0x0079, B:11:0x0080, B:12:0x0087, B:14:0x008e, B:21:0x0062, B:23:0x0068, B:25:0x006e), top: B:2:0x0047 }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x008e A[Catch: all -> 0x005f, TRY_LEAVE, TryCatch #1 {all -> 0x005f, blocks: (B:3:0x0047, B:5:0x004d, B:8:0x0053, B:9:0x0079, B:11:0x0080, B:12:0x0087, B:14:0x008e, B:21:0x0062, B:23:0x0068, B:25:0x006e), top: B:2:0x0047 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public x(Context context, AttributeSet attributeSet) {
        super(context, attributeSet, R.attr.checkedTextViewStyle);
        int resourceId;
        int resourceId2;
        z3.a(context);
        y3.a(this, getContext());
        j1 j1Var = new j1(this);
        this.f996c = j1Var;
        j1Var.f(attributeSet, R.attr.checkedTextViewStyle);
        j1Var.b();
        u uVar = new u(this);
        this.f995b = uVar;
        uVar.d(attributeSet, R.attr.checkedTextViewStyle);
        this.f994a = new y(this);
        Context context2 = getContext();
        int[] iArr = i.a.f10840l;
        c4 f6 = c4.f(context2, attributeSet, iArr, R.attr.checkedTextViewStyle, 0);
        TypedArray typedArray = f6.f722b;
        androidx.core.view.z0.n(this, getContext(), iArr, attributeSet, f6.f722b, R.attr.checkedTextViewStyle);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    setCheckMarkDrawable(h8.b.n(getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    setCheckMarkTintList(f6.a(2));
                }
                if (typedArray.hasValue(3)) {
                    setCheckMarkTintMode(z1.c(typedArray.getInt(3, -1), null));
                }
                f6.g();
                getEmojiTextViewHelper().c(attributeSet, R.attr.checkedTextViewStyle);
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                setCheckMarkDrawable(h8.b.n(getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            f6.g();
            getEmojiTextViewHelper().c(attributeSet, R.attr.checkedTextViewStyle);
        } catch (Throwable th2) {
            f6.g();
            throw th2;
        }
    }

    @NonNull
    private f0 getEmojiTextViewHelper() {
        if (this.f997d == null) {
            this.f997d = new f0(this);
        }
        return this.f997d;
    }

    @Override // android.widget.CheckedTextView, android.widget.TextView, android.view.View
    public final void drawableStateChanged() {
        super.drawableStateChanged();
        j1 j1Var = this.f996c;
        if (j1Var != null) {
            j1Var.b();
        }
        u uVar = this.f995b;
        if (uVar != null) {
            uVar.a();
        }
        y yVar = this.f994a;
        if (yVar != null) {
            yVar.a();
        }
    }

    @Override // android.widget.TextView
    public ActionMode.Callback getCustomSelectionActionModeCallback() {
        return com.google.android.play.core.appupdate.b.I(super.getCustomSelectionActionModeCallback());
    }

    public ColorStateList getSupportBackgroundTintList() {
        u uVar = this.f995b;
        if (uVar != null) {
            return uVar.b();
        }
        return null;
    }

    public PorterDuff.Mode getSupportBackgroundTintMode() {
        u uVar = this.f995b;
        if (uVar != null) {
            return uVar.c();
        }
        return null;
    }

    public ColorStateList getSupportCheckMarkTintList() {
        y yVar = this.f994a;
        if (yVar != null) {
            return (ColorStateList) yVar.f1009f;
        }
        return null;
    }

    public PorterDuff.Mode getSupportCheckMarkTintMode() {
        y yVar = this.f994a;
        if (yVar != null) {
            return (PorterDuff.Mode) yVar.f1010g;
        }
        return null;
    }

    public ColorStateList getSupportCompoundDrawablesTintList() {
        return this.f996c.d();
    }

    public PorterDuff.Mode getSupportCompoundDrawablesTintMode() {
        return this.f996c.e();
    }

    @Override // android.widget.TextView, android.view.View
    public final InputConnection onCreateInputConnection(EditorInfo editorInfo) {
        InputConnection onCreateInputConnection = super.onCreateInputConnection(editorInfo);
        k2.x.x(editorInfo, onCreateInputConnection, this);
        return onCreateInputConnection;
    }

    @Override // android.widget.TextView
    public void setAllCaps(boolean z5) {
        super.setAllCaps(z5);
        getEmojiTextViewHelper().d(z5);
    }

    @Override // android.view.View
    public void setBackgroundDrawable(Drawable drawable) {
        super.setBackgroundDrawable(drawable);
        u uVar = this.f995b;
        if (uVar != null) {
            uVar.e();
        }
    }

    @Override // android.view.View
    public void setBackgroundResource(int i5) {
        super.setBackgroundResource(i5);
        u uVar = this.f995b;
        if (uVar != null) {
            uVar.f(i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(Drawable drawable) {
        super.setCheckMarkDrawable(drawable);
        y yVar = this.f994a;
        if (yVar != null) {
            if (yVar.f1007d) {
                yVar.f1007d = false;
            } else {
                yVar.f1007d = true;
                yVar.a();
            }
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawables(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawables(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.f996c;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public final void setCompoundDrawablesRelative(Drawable drawable, Drawable drawable2, Drawable drawable3, Drawable drawable4) {
        super.setCompoundDrawablesRelative(drawable, drawable2, drawable3, drawable4);
        j1 j1Var = this.f996c;
        if (j1Var != null) {
            j1Var.b();
        }
    }

    @Override // android.widget.TextView
    public void setCustomSelectionActionModeCallback(ActionMode.Callback callback) {
        super.setCustomSelectionActionModeCallback(com.google.android.play.core.appupdate.b.J(callback, this));
    }

    public void setEmojiCompatEnabled(boolean z5) {
        getEmojiTextViewHelper().e(z5);
    }

    public void setSupportBackgroundTintList(ColorStateList colorStateList) {
        u uVar = this.f995b;
        if (uVar != null) {
            uVar.h(colorStateList);
        }
    }

    public void setSupportBackgroundTintMode(PorterDuff.Mode mode) {
        u uVar = this.f995b;
        if (uVar != null) {
            uVar.i(mode);
        }
    }

    public void setSupportCheckMarkTintList(ColorStateList colorStateList) {
        y yVar = this.f994a;
        if (yVar != null) {
            yVar.f1009f = colorStateList;
            yVar.f1005b = true;
            yVar.a();
        }
    }

    public void setSupportCheckMarkTintMode(PorterDuff.Mode mode) {
        y yVar = this.f994a;
        if (yVar != null) {
            yVar.f1010g = mode;
            yVar.f1006c = true;
            yVar.a();
        }
    }

    @Override // androidx.core.widget.m
    public void setSupportCompoundDrawablesTintList(ColorStateList colorStateList) {
        j1 j1Var = this.f996c;
        j1Var.l(colorStateList);
        j1Var.b();
    }

    @Override // androidx.core.widget.m
    public void setSupportCompoundDrawablesTintMode(PorterDuff.Mode mode) {
        j1 j1Var = this.f996c;
        j1Var.m(mode);
        j1Var.b();
    }

    @Override // android.widget.TextView
    public final void setTextAppearance(Context context, int i5) {
        super.setTextAppearance(context, i5);
        j1 j1Var = this.f996c;
        if (j1Var != null) {
            j1Var.g(context, i5);
        }
    }

    @Override // android.widget.CheckedTextView
    public void setCheckMarkDrawable(int i5) {
        setCheckMarkDrawable(h8.b.n(getContext(), i5));
    }
}
