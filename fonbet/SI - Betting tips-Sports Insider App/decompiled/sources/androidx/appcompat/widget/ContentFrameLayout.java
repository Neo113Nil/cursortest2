package androidx.appcompat.widget;

import android.content.Context;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.util.DisplayMetrics;
import android.util.TypedValue;
import android.view.View;
import android.widget.FrameLayout;
import androidx.annotation.NonNull;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class ContentFrameLayout extends FrameLayout {

    /* renamed from: a, reason: collision with root package name */
    public TypedValue f630a;

    /* renamed from: b, reason: collision with root package name */
    public TypedValue f631b;

    /* renamed from: c, reason: collision with root package name */
    public TypedValue f632c;

    /* renamed from: d, reason: collision with root package name */
    public TypedValue f633d;

    /* renamed from: e, reason: collision with root package name */
    public TypedValue f634e;

    /* renamed from: f, reason: collision with root package name */
    public TypedValue f635f;

    /* renamed from: g, reason: collision with root package name */
    public final Rect f636g;

    /* renamed from: h, reason: collision with root package name */
    public u1 f637h;

    public ContentFrameLayout(@NonNull Context context, AttributeSet attributeSet) {
        super(context, attributeSet, 0);
        this.f636g = new Rect();
    }

    public TypedValue getFixedHeightMajor() {
        if (this.f634e == null) {
            this.f634e = new TypedValue();
        }
        return this.f634e;
    }

    public TypedValue getFixedHeightMinor() {
        if (this.f635f == null) {
            this.f635f = new TypedValue();
        }
        return this.f635f;
    }

    public TypedValue getFixedWidthMajor() {
        if (this.f632c == null) {
            this.f632c = new TypedValue();
        }
        return this.f632c;
    }

    public TypedValue getFixedWidthMinor() {
        if (this.f633d == null) {
            this.f633d = new TypedValue();
        }
        return this.f633d;
    }

    public TypedValue getMinWidthMajor() {
        if (this.f630a == null) {
            this.f630a = new TypedValue();
        }
        return this.f630a;
    }

    public TypedValue getMinWidthMinor() {
        if (this.f631b == null) {
            this.f631b = new TypedValue();
        }
        return this.f631b;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        u1 u1Var = this.f637h;
        if (u1Var != null) {
            u1Var.getClass();
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        u1 u1Var = this.f637h;
        if (u1Var != null) {
            androidx.appcompat.app.l0 l0Var = ((androidx.appcompat.app.x) u1Var).f372b;
            v1 v1Var = l0Var.f316r;
            if (v1Var != null) {
                ActionBarOverlayLayout actionBarOverlayLayout = (ActionBarOverlayLayout) v1Var;
                actionBarOverlayLayout.e();
                ((m4) actionBarOverlayLayout.f593e).f821a.dismissPopupMenus();
            }
            if (l0Var.f326w != null) {
                l0Var.f305l.getDecorView().removeCallbacks(l0Var.f328x);
                if (l0Var.f326w.isShowing()) {
                    try {
                        l0Var.f326w.dismiss();
                    } catch (IllegalArgumentException unused) {
                    }
                }
                l0Var.f326w = null;
            }
            androidx.core.view.g1 g1Var = l0Var.f329y;
            if (g1Var != null) {
                g1Var.b();
            }
            androidx.appcompat.view.menu.n nVar = l0Var.x(0).f291h;
            if (nVar != null) {
                nVar.close();
            }
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x008a  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x00ac A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x00bd  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00d1  */
    /* JADX WARN: Removed duplicated region for block: B:41:0x00d9  */
    /* JADX WARN: Removed duplicated region for block: B:43:0x00e1  */
    /* JADX WARN: Removed duplicated region for block: B:46:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:47:0x00c3  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x00b3  */
    @Override // android.widget.FrameLayout, android.view.View
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onMeasure(int i5, int i10) {
        int i11;
        boolean z5;
        int i12;
        int measuredWidth;
        TypedValue typedValue;
        int i13;
        int i14;
        float fraction;
        int i15;
        int i16;
        float fraction2;
        int i17;
        int i18;
        float fraction3;
        DisplayMetrics displayMetrics = getContext().getResources().getDisplayMetrics();
        boolean z7 = true;
        boolean z10 = displayMetrics.widthPixels < displayMetrics.heightPixels;
        int mode = View.MeasureSpec.getMode(i5);
        int mode2 = View.MeasureSpec.getMode(i10);
        Rect rect = this.f636g;
        if (mode == Integer.MIN_VALUE) {
            TypedValue typedValue2 = z10 ? this.f633d : this.f632c;
            if (typedValue2 != null && (i17 = typedValue2.type) != 0) {
                if (i17 == 5) {
                    fraction3 = typedValue2.getDimension(displayMetrics);
                } else if (i17 == 6) {
                    int i19 = displayMetrics.widthPixels;
                    fraction3 = typedValue2.getFraction(i19, i19);
                } else {
                    i18 = 0;
                    if (i18 > 0) {
                        i11 = View.MeasureSpec.makeMeasureSpec(Math.min(i18 - (rect.left + rect.right), View.MeasureSpec.getSize(i5)), 1073741824);
                        z5 = true;
                        if (mode2 == Integer.MIN_VALUE) {
                            TypedValue typedValue3 = z10 ? this.f634e : this.f635f;
                            if (typedValue3 != null && (i15 = typedValue3.type) != 0) {
                                if (i15 == 5) {
                                    fraction2 = typedValue3.getDimension(displayMetrics);
                                } else if (i15 == 6) {
                                    int i20 = displayMetrics.heightPixels;
                                    fraction2 = typedValue3.getFraction(i20, i20);
                                } else {
                                    i16 = 0;
                                    if (i16 > 0) {
                                        i12 = View.MeasureSpec.makeMeasureSpec(Math.min(i16 - (rect.top + rect.bottom), View.MeasureSpec.getSize(i10)), 1073741824);
                                        super.onMeasure(i11, i12);
                                        measuredWidth = getMeasuredWidth();
                                        int makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                                        if (!z5 && mode == Integer.MIN_VALUE) {
                                            typedValue = !z10 ? this.f631b : this.f630a;
                                            if (typedValue != null && (i13 = typedValue.type) != 0) {
                                                if (i13 != 5) {
                                                    fraction = typedValue.getDimension(displayMetrics);
                                                } else if (i13 == 6) {
                                                    int i21 = displayMetrics.widthPixels;
                                                    fraction = typedValue.getFraction(i21, i21);
                                                } else {
                                                    i14 = 0;
                                                    if (i14 > 0) {
                                                        i14 -= rect.left + rect.right;
                                                    }
                                                    if (measuredWidth < i14) {
                                                        makeMeasureSpec = View.MeasureSpec.makeMeasureSpec(i14, 1073741824);
                                                        if (z7) {
                                                            return;
                                                        }
                                                        super.onMeasure(makeMeasureSpec, i12);
                                                        return;
                                                    }
                                                }
                                                i14 = (int) fraction;
                                                if (i14 > 0) {
                                                }
                                                if (measuredWidth < i14) {
                                                }
                                            }
                                        }
                                        z7 = false;
                                        if (z7) {
                                        }
                                    }
                                }
                                i16 = (int) fraction2;
                                if (i16 > 0) {
                                }
                            }
                        }
                        i12 = i10;
                        super.onMeasure(i11, i12);
                        measuredWidth = getMeasuredWidth();
                        int makeMeasureSpec2 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
                        if (!z5) {
                            if (!z10) {
                            }
                            if (typedValue != null) {
                                if (i13 != 5) {
                                }
                                i14 = (int) fraction;
                                if (i14 > 0) {
                                }
                                if (measuredWidth < i14) {
                                }
                            }
                        }
                        z7 = false;
                        if (z7) {
                        }
                    }
                }
                i18 = (int) fraction3;
                if (i18 > 0) {
                }
            }
        }
        i11 = i5;
        z5 = false;
        if (mode2 == Integer.MIN_VALUE) {
        }
        i12 = i10;
        super.onMeasure(i11, i12);
        measuredWidth = getMeasuredWidth();
        int makeMeasureSpec22 = View.MeasureSpec.makeMeasureSpec(measuredWidth, 1073741824);
        if (!z5) {
        }
        z7 = false;
        if (z7) {
        }
    }

    public void setAttachListener(u1 u1Var) {
        this.f637h = u1Var;
    }
}
