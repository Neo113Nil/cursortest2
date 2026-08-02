package androidx.coordinatorlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.graphics.Rect;
import android.util.AttributeSet;
import android.view.View;
import android.view.ViewGroup;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f extends ViewGroup.MarginLayoutParams {

    /* renamed from: a, reason: collision with root package name */
    public c f1229a;

    /* renamed from: b, reason: collision with root package name */
    public boolean f1230b;

    /* renamed from: c, reason: collision with root package name */
    public int f1231c;

    /* renamed from: d, reason: collision with root package name */
    public int f1232d;

    /* renamed from: e, reason: collision with root package name */
    public final int f1233e;

    /* renamed from: f, reason: collision with root package name */
    public final int f1234f;

    /* renamed from: g, reason: collision with root package name */
    public int f1235g;

    /* renamed from: h, reason: collision with root package name */
    public int f1236h;

    /* renamed from: i, reason: collision with root package name */
    public int f1237i;
    public int j;

    /* renamed from: k, reason: collision with root package name */
    public View f1238k;

    /* renamed from: l, reason: collision with root package name */
    public View f1239l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f1240m;

    /* renamed from: n, reason: collision with root package name */
    public boolean f1241n;

    /* renamed from: o, reason: collision with root package name */
    public boolean f1242o;

    /* renamed from: p, reason: collision with root package name */
    public boolean f1243p;
    public final Rect q;

    /* renamed from: r, reason: collision with root package name */
    public Object f1244r;

    public f() {
        super(-2, -2);
        this.f1230b = false;
        this.f1231c = 0;
        this.f1232d = 0;
        this.f1233e = -1;
        this.f1234f = -1;
        this.f1235g = 0;
        this.f1236h = 0;
        this.q = new Rect();
    }

    public final boolean a(int i5) {
        if (i5 == 0) {
            return this.f1241n;
        }
        if (i5 != 1) {
            return false;
        }
        return this.f1242o;
    }

    public final void b(c cVar) {
        c cVar2 = this.f1229a;
        if (cVar2 != cVar) {
            if (cVar2 != null) {
                cVar2.onDetachedFromLayoutParams();
            }
            this.f1229a = cVar;
            this.f1244r = null;
            this.f1230b = true;
            if (cVar != null) {
                cVar.onAttachedToLayoutParams(this);
            }
        }
    }

    public f(Context context, AttributeSet attributeSet) {
        super(context, attributeSet);
        this.f1230b = false;
        this.f1231c = 0;
        this.f1232d = 0;
        this.f1233e = -1;
        this.f1234f = -1;
        this.f1235g = 0;
        this.f1236h = 0;
        this.q = new Rect();
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, a0.a.f8b);
        this.f1231c = obtainStyledAttributes.getInteger(0, 0);
        this.f1234f = obtainStyledAttributes.getResourceId(1, -1);
        this.f1232d = obtainStyledAttributes.getInteger(2, 0);
        this.f1233e = obtainStyledAttributes.getInteger(6, -1);
        this.f1235g = obtainStyledAttributes.getInt(5, 0);
        this.f1236h = obtainStyledAttributes.getInt(4, 0);
        boolean hasValue = obtainStyledAttributes.hasValue(3);
        this.f1230b = hasValue;
        if (hasValue) {
            this.f1229a = CoordinatorLayout.parseBehavior(context, attributeSet, obtainStyledAttributes.getString(3));
        }
        obtainStyledAttributes.recycle();
        c cVar = this.f1229a;
        if (cVar != null) {
            cVar.onAttachedToLayoutParams(this);
        }
    }

    public f(f fVar) {
        super((ViewGroup.MarginLayoutParams) fVar);
        this.f1230b = false;
        this.f1231c = 0;
        this.f1232d = 0;
        this.f1233e = -1;
        this.f1234f = -1;
        this.f1235g = 0;
        this.f1236h = 0;
        this.q = new Rect();
    }

    public f(ViewGroup.MarginLayoutParams marginLayoutParams) {
        super(marginLayoutParams);
        this.f1230b = false;
        this.f1231c = 0;
        this.f1232d = 0;
        this.f1233e = -1;
        this.f1234f = -1;
        this.f1235g = 0;
        this.f1236h = 0;
        this.q = new Rect();
    }

    public f(ViewGroup.LayoutParams layoutParams) {
        super(layoutParams);
        this.f1230b = false;
        this.f1231c = 0;
        this.f1232d = 0;
        this.f1233e = -1;
        this.f1234f = -1;
        this.f1235g = 0;
        this.f1236h = 0;
        this.q = new Rect();
    }
}
