package androidx.appcompat.widget;

import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.util.AttributeSet;
import android.widget.CompoundButton;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class z {

    /* renamed from: a, reason: collision with root package name */
    public final CompoundButton f1018a;

    /* renamed from: b, reason: collision with root package name */
    public ColorStateList f1019b = null;

    /* renamed from: c, reason: collision with root package name */
    public PorterDuff.Mode f1020c = null;

    /* renamed from: d, reason: collision with root package name */
    public boolean f1021d = false;

    /* renamed from: e, reason: collision with root package name */
    public boolean f1022e = false;

    /* renamed from: f, reason: collision with root package name */
    public boolean f1023f;

    public z(CompoundButton compoundButton) {
        this.f1018a = compoundButton;
    }

    public final void a() {
        CompoundButton compoundButton = this.f1018a;
        Drawable buttonDrawable = compoundButton.getButtonDrawable();
        if (buttonDrawable != null) {
            if (this.f1021d || this.f1022e) {
                Drawable mutate = buttonDrawable.mutate();
                if (this.f1021d) {
                    mutate.setTintList(this.f1019b);
                }
                if (this.f1022e) {
                    mutate.setTintMode(this.f1020c);
                }
                if (mutate.isStateful()) {
                    mutate.setState(compoundButton.getDrawableState());
                }
                compoundButton.setButtonDrawable(mutate);
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0054 A[Catch: all -> 0x0033, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x001b, B:5:0x0021, B:8:0x0027, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001b }] */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0062 A[Catch: all -> 0x0033, TRY_LEAVE, TryCatch #1 {all -> 0x0033, blocks: (B:3:0x001b, B:5:0x0021, B:8:0x0027, B:9:0x004d, B:11:0x0054, B:12:0x005b, B:14:0x0062, B:21:0x0036, B:23:0x003c, B:25:0x0042), top: B:2:0x001b }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(AttributeSet attributeSet, int i5) {
        int resourceId;
        int resourceId2;
        CompoundButton compoundButton = this.f1018a;
        Context context = compoundButton.getContext();
        int[] iArr = i.a.f10841m;
        c4 f6 = c4.f(context, attributeSet, iArr, i5, 0);
        TypedArray typedArray = f6.f722b;
        androidx.core.view.z0.n(compoundButton, compoundButton.getContext(), iArr, attributeSet, f6.f722b, i5);
        try {
            if (typedArray.hasValue(1) && (resourceId2 = typedArray.getResourceId(1, 0)) != 0) {
                try {
                    compoundButton.setButtonDrawable(h8.b.n(compoundButton.getContext(), resourceId2));
                } catch (Resources.NotFoundException unused) {
                }
                if (typedArray.hasValue(2)) {
                    compoundButton.setButtonTintList(f6.a(2));
                }
                if (typedArray.hasValue(3)) {
                    compoundButton.setButtonTintMode(z1.c(typedArray.getInt(3, -1), null));
                }
                f6.g();
            }
            if (typedArray.hasValue(0) && (resourceId = typedArray.getResourceId(0, 0)) != 0) {
                compoundButton.setButtonDrawable(h8.b.n(compoundButton.getContext(), resourceId));
            }
            if (typedArray.hasValue(2)) {
            }
            if (typedArray.hasValue(3)) {
            }
            f6.g();
        } catch (Throwable th2) {
            f6.g();
            throw th2;
        }
    }
}
