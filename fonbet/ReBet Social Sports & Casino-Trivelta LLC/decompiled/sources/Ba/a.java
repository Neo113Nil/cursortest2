package Ba;

import android.R;
import android.content.Context;
import android.content.res.ColorStateList;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import androidx.appcompat.widget.C2062q;
import ia.c;
import ia.l;
import ia.m;
import l.AbstractC5335a;
import sa.AbstractC6344a;

/* loaded from: classes3.dex */
public class a extends C2062q {

    /* renamed from: g, reason: collision with root package name */
    public static final int f859g = l.f48550B;

    /* renamed from: h, reason: collision with root package name */
    public static final int[][] f860h = {new int[]{R.attr.state_enabled, R.attr.state_checked}, new int[]{R.attr.state_enabled, -16842912}, new int[]{-16842910, R.attr.state_checked}, new int[]{-16842910, -16842912}};

    /* renamed from: e, reason: collision with root package name */
    public ColorStateList f861e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f862f;

    public a(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, AbstractC5335a.f54974G);
    }

    private ColorStateList getMaterialThemeColorsTintList() {
        if (this.f861e == null) {
            int d10 = AbstractC6344a.d(this, AbstractC5335a.f55004s);
            int d11 = AbstractC6344a.d(this, c.f48250o);
            int d12 = AbstractC6344a.d(this, c.f48260t);
            int[][] iArr = f860h;
            int[] iArr2 = new int[iArr.length];
            iArr2[0] = AbstractC6344a.j(d12, d10, 1.0f);
            iArr2[1] = AbstractC6344a.j(d12, d11, 0.54f);
            iArr2[2] = AbstractC6344a.j(d12, d11, 0.38f);
            iArr2[3] = AbstractC6344a.j(d12, d11, 0.38f);
            this.f861e = new ColorStateList(iArr, iArr2);
        }
        return this.f861e;
    }

    @Override // android.widget.TextView, android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        if (this.f862f && C0.c.b(this) == null) {
            setUseMaterialThemeColors(true);
        }
    }

    public void setUseMaterialThemeColors(boolean z10) {
        this.f862f = z10;
        if (z10) {
            C0.c.d(this, getMaterialThemeColorsTintList());
        } else {
            C0.c.d(this, null);
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public a(Context context, AttributeSet attributeSet, int i10) {
        super(La.a.d(context, attributeSet, i10, r4), attributeSet, i10);
        int i11 = f859g;
        Context context2 = getContext();
        TypedArray i12 = xa.l.i(context2, attributeSet, m.MaterialRadioButton, i10, i11, new int[0]);
        if (i12.hasValue(m.f48955l4)) {
            C0.c.d(this, Ca.c.a(context2, i12, m.f48955l4));
        }
        this.f862f = i12.getBoolean(m.f48965m4, false);
        i12.recycle();
    }
}
