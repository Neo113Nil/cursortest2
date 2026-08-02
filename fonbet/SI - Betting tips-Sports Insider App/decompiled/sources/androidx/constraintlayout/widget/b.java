package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.Resources;
import android.content.res.TypedArray;
import android.graphics.Canvas;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;
import io.sentry.android.core.w0;
import java.util.Arrays;
import java.util.HashMap;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class b extends View {

    /* renamed from: a, reason: collision with root package name */
    public int[] f1061a;

    /* renamed from: b, reason: collision with root package name */
    public int f1062b;

    /* renamed from: c, reason: collision with root package name */
    public Context f1063c;

    /* renamed from: d, reason: collision with root package name */
    public x.i f1064d;

    /* renamed from: e, reason: collision with root package name */
    public String f1065e;

    /* renamed from: f, reason: collision with root package name */
    public String f1066f;

    /* renamed from: g, reason: collision with root package name */
    public HashMap f1067g;

    public b(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1061a = new int[32];
        this.f1067g = new HashMap();
        this.f1063c = context;
        g(attributeSet);
    }

    public final void a(String str) {
        Context context = this.f1063c;
        if (str == null || str.length() == 0 || context == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        int i5 = 0;
        if (isInEditMode() && constraintLayout != null) {
            Object designInformation = constraintLayout.getDesignInformation(0, trim);
            if (designInformation instanceof Integer) {
                i5 = ((Integer) designInformation).intValue();
            }
        }
        if (i5 == 0 && constraintLayout != null) {
            i5 = f(constraintLayout, trim);
        }
        if (i5 == 0) {
            try {
                i5 = r.class.getField(trim).getInt(null);
            } catch (Exception unused) {
            }
        }
        if (i5 == 0) {
            i5 = context.getResources().getIdentifier(trim, "id", context.getPackageName());
        }
        if (i5 != 0) {
            this.f1067g.put(Integer.valueOf(i5), trim);
            b(i5);
        } else {
            w0.m("ConstraintHelper", "Could not find id of \"" + trim + "\"");
        }
    }

    public final void b(int i5) {
        if (i5 == getId()) {
            return;
        }
        int i10 = this.f1062b + 1;
        int[] iArr = this.f1061a;
        if (i10 > iArr.length) {
            this.f1061a = Arrays.copyOf(iArr, iArr.length * 2);
        }
        int[] iArr2 = this.f1061a;
        int i11 = this.f1062b;
        iArr2[i11] = i5;
        this.f1062b = i11 + 1;
    }

    public final void c(String str) {
        if (str == null || str.length() == 0 || this.f1063c == null) {
            return;
        }
        String trim = str.trim();
        ConstraintLayout constraintLayout = getParent() instanceof ConstraintLayout ? (ConstraintLayout) getParent() : null;
        if (constraintLayout == null) {
            w0.m("ConstraintHelper", "Parent not a ConstraintLayout");
            return;
        }
        int childCount = constraintLayout.getChildCount();
        for (int i5 = 0; i5 < childCount; i5++) {
            View childAt = constraintLayout.getChildAt(i5);
            ViewGroup.LayoutParams layoutParams = childAt.getLayoutParams();
            if ((layoutParams instanceof d) && trim.equals(((d) layoutParams).Y)) {
                if (childAt.getId() == -1) {
                    w0.m("ConstraintHelper", "to use ConstraintTag view " + childAt.getClass().getSimpleName() + " must have an ID");
                } else {
                    b(childAt.getId());
                }
            }
        }
    }

    public final void d(ConstraintLayout constraintLayout) {
        int visibility = getVisibility();
        float elevation = getElevation();
        for (int i5 = 0; i5 < this.f1062b; i5++) {
            View viewById = constraintLayout.getViewById(this.f1061a[i5]);
            if (viewById != null) {
                viewById.setVisibility(visibility);
                if (elevation > 0.0f) {
                    viewById.setTranslationZ(viewById.getTranslationZ() + elevation);
                }
            }
        }
    }

    public final int f(ConstraintLayout constraintLayout, String str) {
        Resources resources;
        String str2;
        if (str != null && (resources = this.f1063c.getResources()) != null) {
            int childCount = constraintLayout.getChildCount();
            for (int i5 = 0; i5 < childCount; i5++) {
                View childAt = constraintLayout.getChildAt(i5);
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

    public void g(AttributeSet attributeSet) {
        if (attributeSet != null) {
            TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, s.f1216b);
            int indexCount = obtainStyledAttributes.getIndexCount();
            for (int i5 = 0; i5 < indexCount; i5++) {
                int index = obtainStyledAttributes.getIndex(i5);
                if (index == 35) {
                    String string = obtainStyledAttributes.getString(index);
                    this.f1065e = string;
                    setIds(string);
                } else if (index == 36) {
                    String string2 = obtainStyledAttributes.getString(index);
                    this.f1066f = string2;
                    setReferenceTags(string2);
                }
            }
            obtainStyledAttributes.recycle();
        }
    }

    public int[] getReferencedIds() {
        return Arrays.copyOf(this.f1061a, this.f1062b);
    }

    public abstract void h(x.d dVar, boolean z5);

    public final void i() {
        if (this.f1064d == null) {
            return;
        }
        ViewGroup.LayoutParams layoutParams = getLayoutParams();
        if (layoutParams instanceof d) {
            ((d) layoutParams).f1096p0 = this.f1064d;
        }
    }

    @Override // android.view.View
    public void onAttachedToWindow() {
        super.onAttachedToWindow();
        String str = this.f1065e;
        if (str != null) {
            setIds(str);
        }
        String str2 = this.f1066f;
        if (str2 != null) {
            setReferenceTags(str2);
        }
    }

    @Override // android.view.View
    public void onMeasure(int i5, int i10) {
        setMeasuredDimension(0, 0);
    }

    public void setIds(String str) {
        this.f1065e = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f1062b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i5);
            if (indexOf == -1) {
                a(str.substring(i5));
                return;
            } else {
                a(str.substring(i5, indexOf));
                i5 = indexOf + 1;
            }
        }
    }

    public void setReferenceTags(String str) {
        this.f1066f = str;
        if (str == null) {
            return;
        }
        int i5 = 0;
        this.f1062b = 0;
        while (true) {
            int indexOf = str.indexOf(44, i5);
            if (indexOf == -1) {
                c(str.substring(i5));
                return;
            } else {
                c(str.substring(i5, indexOf));
                i5 = indexOf + 1;
            }
        }
    }

    public void setReferencedIds(int[] iArr) {
        this.f1065e = null;
        this.f1062b = 0;
        for (int i5 : iArr) {
            b(i5);
        }
    }

    @Override // android.view.View
    public final void setTag(int i5, Object obj) {
        super.setTag(i5, obj);
        if (obj == null && this.f1065e == null) {
            b(i5);
        }
    }

    public void e(ConstraintLayout constraintLayout) {
    }

    @Override // android.view.View
    public final void onDraw(Canvas canvas) {
    }
}
