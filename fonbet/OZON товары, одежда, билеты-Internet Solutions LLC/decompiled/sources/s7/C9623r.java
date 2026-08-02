package s7;

import android.annotation.SuppressLint;
import android.content.Context;
import android.util.AttributeSet;
import android.widget.ImageButton;

@SuppressLint({"AppCompatCustomView"})
/* renamed from: s7.r, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public class C9623r extends ImageButton {

    /* renamed from: a, reason: collision with root package name */
    private int f98351a;

    public C9623r(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public final int b() {
        return this.f98351a;
    }

    public final void c(int i11, boolean z11) {
        super.setVisibility(i11);
        if (z11) {
            this.f98351a = i11;
        }
    }

    @Override // android.widget.ImageView, android.view.View
    public void setVisibility(int i11) {
        c(i11, true);
    }

    public C9623r(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.f98351a = getVisibility();
    }
}
