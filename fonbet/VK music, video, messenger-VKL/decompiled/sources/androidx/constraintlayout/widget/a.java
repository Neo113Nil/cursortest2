package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.util.SparseArray;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.core.widgets.ConstraintWidget;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.b;
import androidx.constraintlayout.widget.c;
import com.unity3d.services.UnityAdsConstants;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.Arrays;
import java.util.HashMap;
import xsna.a2v;
import xsna.e2v;

/* compiled from: ConstraintHelper.java */
/* loaded from: classes.dex */
public abstract class a extends View {
    public int[] b;
    public int c;
    public final Context d;
    public e2v e;
    public String f;
    public String g;
    public View[] h;
    public final HashMap<Integer, String> i;

    public a(Context context) {
        super(context);
        this.b = new int[32];
        this.h = null;
        this.i = new HashMap<>();
        this.d = context;
        n(null);
    }

    public final void d(String str) {
        if (str == null || str.length() == 0 || this.d == null) {
            return;
        }
        String trim = str.trim();
        if (getParent() instanceof ConstraintLayout) {
        }
        int l = l(trim);
        if (l != 0) {
            this.i.put(Integer.valueOf(l), trim);
            e(l);
        }
    }

    public final void e(int i) {
        if (i == getId()) {
            return;
        }
        int i2 = this.c + 1;
        int[] iArr = this.b;
        if (i2 > iArr.length) {
            this.b = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.b;
        int i3 = this.c;
        iArr2[i3] = i;
        this.c = i3 + 1;
    }

    public final void f(String str) {
        if (str == null || str.length() == 0 || this.d == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i = 0; i < childCount; i++) {
            View childAt = constraintLayout.getChildAt(i);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).Y) && childAt.getId() != -1) {
                e(childAt.getId());
            }
        }
    }

    public final void g(View view) {
        if (view == this) {
            return;
        }
        if (view.getId() == -1) {
            Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have an id");
        } else {
            if (view.getParent() == null) {
                Log.e("ConstraintHelper", "Views added to a ConstraintHelper need to have a parent");
                return;
            }
            this.f = null;
            e(view.getId());
            requestLayout();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.b, this.c);
    }

    public final void h() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        i((ConstraintLayout) parent);
    }

    public final void i(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i = 0; i < this.c; i++) {
            View G4 = constraintLayout.G4(this.b[i]);
            if (G4 != null) {
                G4.setVisibility(visibility);
                if (elevation > UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
                    G4.setTranslationZ(G4.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int k(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.d.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i = 0; i < childCount; i++) {
                View childAt = constraintLayout.getChildAt(i);
                if (childAt.getId() != -1) {
                    try {
                        str2 = resources.getResourceEntryName(childAt.getId());
                    } catch (Resources.NotFoundException unused) {
                        str2 = null;
                    }
                    if (str.equals(str2)) {
                        return childAt.getId();
                    }
                }
            }
        }
        return 0;
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0043 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final int l(String str) {
        int i;
        HashMap<String, Integer> hashMap;
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (isInEditMode() && constraintLayout != null) {
            Integer num = (str == null || (hashMap = constraintLayout.n) == null || !hashMap.containsKey(str)) ? null : constraintLayout.n.get(str);
            if (num instanceof Integer) {
                i = num.intValue();
                if (i == 0 && constraintLayout != null) {
                    i = k(constraintLayout, str);
                }
                if (i == 0) {
                    try {
                        i = R$id.class.getField(str).getInt(null);
                    } catch (Exception unused) {
                    }
                }
                if (i == 0) {
                    return i;
                }
                Context context = this.d;
                return context.getResources().getIdentifier(str, "id", context.getPackageName());
            }
        }
        i = 0;
        if (i == 0) {
            i = k(constraintLayout, str);
        }
        if (i == 0) {
        }
        if (i == 0) {
        }
    }

    public final View[] m(ConstraintLayout constraintLayout) {
        View[] viewArr = this.h;
        if (viewArr == null || viewArr.length != this.c) {
            this.h = new View[this.c];
        }
        for (int i = 0; i < this.c; i++) {
            this.h[i] = constraintLayout.G4(this.b[i]);
        }
        return this.h;
    }

    public void n(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i = 0; i < indexCount; i++) {
                int index = obtainStyledAttributes.getIndex(i);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.g = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void o(b.a aVar, e2v e2vVar, c.a aVar2, SparseArray sparseArray) {
        b.C0021b c0021b = aVar.e;
        int[] iArr = c0021b.j0;
        int i = 0;
        if (iArr != null) {
            setReferencedIds(iArr);
        } else {
            String str = c0021b.k0;
            if (str != null) {
                if (str.length() > 0) {
                    String[] split = c0021b.k0.split(StringUtils.COMMA);
                    getContext();
                    int[] iArr2 = new int[split.length];
                    int i2 = 0;
                    for (String str2 : split) {
                        int l = l(str2.trim());
                        if (l != 0) {
                            iArr2[i2] = l;
                            i2++;
                        }
                    }
                    if (i2 != split.length) {
                        iArr2 = Arrays.copyOf(iArr2, i2);
                    }
                    c0021b.j0 = iArr2;
                } else {
                    c0021b.j0 = null;
                }
            }
        }
        e2vVar.a();
        if (c0021b.j0 == null) {
            return;
        }
        while (true) {
            int[] iArr3 = c0021b.j0;
            if (i >= iArr3.length) {
                return;
            }
            ConstraintWidget constraintWidget = (ConstraintWidget) sparseArray.get(iArr3[i]);
            if (constraintWidget != null) {
                e2vVar.c(constraintWidget);
            }
            i++;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.g;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i, int i2) {
        setMeasuredDimension(0, 0);
    }

    public void s(a2v a2vVar, SparseArray sparseArray) {
        a2vVar.a();
        for (int i = 0; i < this.c; i++) {
            a2vVar.c((ConstraintWidget) sparseArray.get(this.b[i]));
        }
    }

    public void setIds(String str) {
        this.f = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                d(str.substring(i));
                return;
            } else {
                d(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.g = str;
        if (str == null) {
            return;
        }
        int i = 0;
        this.c = 0;
        while (true) {
            int indexOf = str.indexOf(44, i);
            if (indexOf == -1) {
                f(str.substring(i));
                return;
            } else {
                f(str.substring(i, indexOf));
                i = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f = null;
        this.c = 0;
        for (int i : iArr) {
            e(i);
        }
    }

    @Override // android.view.View
    public final void setTag(int i, Object obj) {
        super.setTag(i, obj);
        if (obj == null && this.f == null) {
            e(i);
        }
    }

    public final void t() {
        if (this.e == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).q0 = this.e;
        }
    }

    public a(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.b = new int[32];
        this.h = null;
        this.i = new HashMap<>();
        this.d = context;
        n(attributeSet);
    }

    public a(Context context, AttributeSet attributeSet, int i) {
        super(context, attributeSet, i);
        this.b = new int[32];
        this.h = null;
        this.i = new HashMap<>();
        this.d = context;
        n(attributeSet);
    }

    public void q() {
    }

    public void j(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }

    public void r(ConstraintLayout constraintLayout) {
    }

    public void p(ConstraintWidget constraintWidget, boolean z) {
    }
}
