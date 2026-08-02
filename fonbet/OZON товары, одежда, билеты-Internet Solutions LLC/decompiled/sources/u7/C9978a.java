package u7;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.annotation.NonNull;
import androidx.appcompat.widget.C5072q;
import androidx.core.widget.c;
import i7.C7017a;
import n7.C8448a;
import s7.C9619n;

/* renamed from: u7.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C9978a extends C5072q {

    /* renamed from: g, reason: collision with root package name */
    private static final int[][] f100347g = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    private ColorStateList f100348e;

    /* renamed from: f, reason: collision with root package name */
    private boolean f100349f;

    public C9978a(@NonNull Context context, AttributeSet attributeSet) {
        super(B7.a.a(context, attributeSet, ru.ozon.app.android.R.attr.radioButtonStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_CompoundButton_RadioButton), attributeSet);
        Context context2 = getContext();
        TypedArray e11 = C9619n.e(context2, attributeSet, C7017a.f65917A, ru.ozon.app.android.R.attr.radioButtonStyle, ru.ozon.app.android.R.style.Widget_MaterialComponents_CompoundButton_RadioButton, new int[0]);
        if (e11.hasValue(0)) {
            c.c(this, v7.c.a(context2, e11, 0));
        }
        this.f100349f = e11.getBoolean(1, false);
        e11.recycle();
    }

    @Override // android.widget.TextView, android.view.View
    protected final void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f100349f && c.b(this) == null) {
            this.f100349f = true;
            if (this.f100348e == null) {
                int b11 = C8448a.b(ru.ozon.app.android.R.attr.colorControlActivated, this);
                int b12 = C8448a.b(ru.ozon.app.android.R.attr.colorOnSurface, this);
                int b13 = C8448a.b(ru.ozon.app.android.R.attr.colorSurface, this);
                this.f100348e = new ColorStateList(f100347g, new int[]{C8448a.d(1.0f, b13, b11), C8448a.d(0.54f, b13, b12), C8448a.d(0.38f, b13, b12), C8448a.d(0.38f, b13, b12)});
            }
            c.c(this, this.f100348e);
        }
    }
}
