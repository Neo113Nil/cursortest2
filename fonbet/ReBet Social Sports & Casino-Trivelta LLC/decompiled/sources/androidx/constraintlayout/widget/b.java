package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.facebook.react.devsupport.StackTraceHelper;
import java.util.Arrays;
import java.util.HashMap;

/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    public int f18226a;

    /* renamed from: b, reason: collision with root package name */
    public Context f18227b;

    /* renamed from: c, reason: collision with root package name */
    public androidx.constraintlayout.core.widgets.i f18228c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f18229d;

    /* renamed from: e, reason: collision with root package name */
    public String f18230e;

    /* renamed from: f, reason: collision with root package name */
    public String f18231f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f18232g;
    protected int[] mIds;
    private View[] mViews;

    public b(Context context) {
        super(context);
        this.mIds = new int[32];
        this.f18229d = false;
        this.mViews = null;
        this.f18232g = new HashMap();
        this.f18227b = context;
        i(null);
    }

    public final void a(String str) {
        if (str == null || str.length() == 0 || this.f18227b == null) {
            return;
        }
        String trim = str.trim();
        int h10 = h(trim);
        if (h10 != 0) {
            this.f18232g.put(Integer.valueOf(h10), trim);
            b(h10);
            return;
        }
        Log.w("ConstraintHelper", "Could not find id of \"" + trim + "\"");
    }

    public final void b(int i10) {
        if (i10 == getId()) {
            return;
        }
        int i11 = this.f18226a + 1;
        int[] iArr = this.mIds;
        if (i11 > iArr.length) {
            this.mIds = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.mIds;
        int i12 = this.f18226a;
        iArr2[i12] = i10;
        this.f18226a = i12 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f18227b == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            Log.w("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof ConstraintLayout.b) && trim.equals(((ConstraintLayout.b) layoutParams).f18153c0)) {
                if (childAt.getId() == -1) {
                    Log.w("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public void d() {
        ViewParent parent = getParent();
        if (parent == null || !(parent instanceof ConstraintLayout)) {
            return;
        }
        e((ConstraintLayout) parent);
    }

    public void e(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i10 = 0; i10 < this.f18226a; i10++) {
            View k10 = constraintLayout.k(this.mIds[i10]);
            if (k10 != null) {
                k10.setVisibility(visibility);
                if (elevation > 0.0f) {
                    k10.setTranslationZ(k10.getTranslationZ() + elevation);
                }
            }
        }
    }

    public void f(ConstraintLayout constraintLayout) {
    }

    public final int g(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str == null || constraintLayout == null || (resources = this.f18227b.getResources()) == null) {
            return 0;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i10 = 0; i10 < childCount; i10++) {
            View childAt = constraintLayout.getChildAt(i10);
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
        return 0;
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.mIds, this.f18226a);
    }

    public final int h(String str) {
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i10 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object i11 = constraintLayout.i(0, str);
            if (i11 instanceof Integer) {
                i10 = ((Integer) i11).intValue();
            }
        }
        if (i10 == 0 && constraintLayout != null) {
            i10 = g(constraintLayout, str);
        }
        if (i10 == 0) {
            try {
                i10 = f.class.getField(str).getInt(null);
            } catch (Exception unused) {
            }
        }
        return i10 == 0 ? this.f18227b.getResources().getIdentifier(str, StackTraceHelper.ID_KEY, this.f18227b.getPackageName()) : i10;
    }

    public void i(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, g.ConstraintLayout_Layout);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i10 = 0; i10 < indexCount; i10++) {
                int index = obtainStyledAttributes.getIndex(i10);
                if (index == g.f18643l1) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f18230e = string;
                    setIds(string);
                } else if (index == g.f18651m1) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f18231f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public void j(androidx.constraintlayout.core.widgets.e eVar, boolean z10) {
    }

    public void k(ConstraintLayout constraintLayout) {
    }

    public void l(ConstraintLayout constraintLayout) {
    }

    public void m(ConstraintLayout constraintLayout) {
    }

    public void n(ConstraintLayout constraintLayout) {
        String str;
        int g10;
        if (isInEditMode()) {
            setIds(this.f18230e);
        }
        androidx.constraintlayout.core.widgets.i iVar = this.f18228c;
        if (iVar == null) {
            return;
        }
        iVar.b();
        for (int i10 = 0; i10 < this.f18226a; i10++) {
            int i11 = this.mIds[i10];
            View k10 = constraintLayout.k(i11);
            if (k10 == null && (g10 = g(constraintLayout, (str = (String) this.f18232g.get(Integer.valueOf(i11))))) != 0) {
                this.mIds[i10] = g10;
                this.f18232g.put(Integer.valueOf(g10), str);
                k10 = constraintLayout.k(g10);
            }
            if (k10 != null) {
                this.f18228c.a(constraintLayout.l(k10));
            }
        }
        this.f18228c.c(constraintLayout.f18100c);
    }

    public void o() {
        if (this.f18228c == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof ConstraintLayout.b) {
            ((ConstraintLayout.b) layoutParams).f18191v0 = (androidx.constraintlayout.core.widgets.e) this.f18228c;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f18230e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f18231f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onDraw(Canvas canvas) {
    }

    @Override // android.view.View
    public void onMeasure(int i10, int i11) {
        if (this.f18229d) {
            super.onMeasure(i10, i11);
        } else {
            setMeasuredDimension(0, 0);
        }
    }

    public void setIds(String str) {
        this.f18230e = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f18226a = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                a(str.substring(i10));
                return;
            } else {
                a(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f18231f = str;
        if (str == null) {
            return;
        }
        int i10 = 0;
        this.f18226a = 0;
        while (true) {
            int indexOf = str.indexOf(44, i10);
            if (indexOf == -1) {
                c(str.substring(i10));
                return;
            } else {
                c(str.substring(i10, indexOf));
                i10 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f18230e = null;
        this.f18226a = 0;
        for (int i10 : iArr) {
            b(i10);
        }
    }

    @Override // android.view.View
    public void setTag(int i10, Object obj) {
        super.setTag(i10, obj);
        if (obj == null && this.f18230e == null) {
            b(i10);
        }
    }

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.mIds = new int[32];
        this.f18229d = false;
        this.mViews = null;
        this.f18232g = new HashMap();
        this.f18227b = context;
        i(attributeSet);
    }
}
