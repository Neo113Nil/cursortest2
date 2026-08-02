package k;

import android.content.res.ColorStateList;
import android.content.res.Resources;
import android.graphics.ColorFilter;
import android.graphics.PorterDuff;
import android.graphics.Rect;
import android.graphics.drawable.Drawable;
import android.util.SparseArray;
import android.util.StateSet;
import kotlin.jvm.internal.Intrinsics;
import s.j;
import s.k;
import s.o;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class b extends Drawable.ConstantState {
    public boolean A;
    public ColorFilter B;
    public boolean C;
    public ColorStateList D;
    public PorterDuff.Mode E;
    public boolean F;
    public boolean G;
    public int[][] H;
    public j I;
    public o J;

    /* renamed from: a, reason: collision with root package name */
    public final e f18567a;

    /* renamed from: b, reason: collision with root package name */
    public Resources f18568b;

    /* renamed from: c, reason: collision with root package name */
    public int f18569c;

    /* renamed from: d, reason: collision with root package name */
    public int f18570d;

    /* renamed from: e, reason: collision with root package name */
    public int f18571e;

    /* renamed from: f, reason: collision with root package name */
    public SparseArray f18572f;

    /* renamed from: g, reason: collision with root package name */
    public Drawable[] f18573g;

    /* renamed from: h, reason: collision with root package name */
    public int f18574h;

    /* renamed from: i, reason: collision with root package name */
    public boolean f18575i;
    public boolean j;

    /* renamed from: k, reason: collision with root package name */
    public Rect f18576k;

    /* renamed from: l, reason: collision with root package name */
    public boolean f18577l;

    /* renamed from: m, reason: collision with root package name */
    public boolean f18578m;

    /* renamed from: n, reason: collision with root package name */
    public int f18579n;

    /* renamed from: o, reason: collision with root package name */
    public int f18580o;

    /* renamed from: p, reason: collision with root package name */
    public int f18581p;
    public int q;

    /* renamed from: r, reason: collision with root package name */
    public boolean f18582r;

    /* renamed from: s, reason: collision with root package name */
    public int f18583s;

    /* renamed from: t, reason: collision with root package name */
    public boolean f18584t;

    /* renamed from: u, reason: collision with root package name */
    public boolean f18585u;

    /* renamed from: v, reason: collision with root package name */
    public boolean f18586v;

    /* renamed from: w, reason: collision with root package name */
    public boolean f18587w;

    /* renamed from: x, reason: collision with root package name */
    public int f18588x;

    /* renamed from: y, reason: collision with root package name */
    public int f18589y;

    /* renamed from: z, reason: collision with root package name */
    public int f18590z;

    public b(b bVar, e eVar, Resources resources) {
        this.f18575i = false;
        this.f18577l = false;
        this.f18587w = true;
        this.f18589y = 0;
        this.f18590z = 0;
        this.f18567a = eVar;
        this.f18568b = resources != null ? resources : bVar != null ? bVar.f18568b : null;
        int i5 = bVar != null ? bVar.f18569c : 0;
        int i10 = e.f18596t;
        i5 = resources != null ? resources.getDisplayMetrics().densityDpi : i5;
        i5 = i5 == 0 ? 160 : i5;
        this.f18569c = i5;
        if (bVar != null) {
            this.f18570d = bVar.f18570d;
            this.f18571e = bVar.f18571e;
            this.f18585u = true;
            this.f18586v = true;
            this.f18575i = bVar.f18575i;
            this.f18577l = bVar.f18577l;
            this.f18587w = bVar.f18587w;
            this.f18588x = bVar.f18588x;
            this.f18589y = bVar.f18589y;
            this.f18590z = bVar.f18590z;
            this.A = bVar.A;
            this.B = bVar.B;
            this.C = bVar.C;
            this.D = bVar.D;
            this.E = bVar.E;
            this.F = bVar.F;
            this.G = bVar.G;
            if (bVar.f18569c == i5) {
                if (bVar.j) {
                    this.f18576k = bVar.f18576k != null ? new Rect(bVar.f18576k) : null;
                    this.j = true;
                }
                if (bVar.f18578m) {
                    this.f18579n = bVar.f18579n;
                    this.f18580o = bVar.f18580o;
                    this.f18581p = bVar.f18581p;
                    this.q = bVar.q;
                    this.f18578m = true;
                }
            }
            if (bVar.f18582r) {
                this.f18583s = bVar.f18583s;
                this.f18582r = true;
            }
            if (bVar.f18584t) {
                this.f18584t = true;
            }
            Drawable[] drawableArr = bVar.f18573g;
            this.f18573g = new Drawable[drawableArr.length];
            this.f18574h = bVar.f18574h;
            SparseArray sparseArray = bVar.f18572f;
            if (sparseArray != null) {
                this.f18572f = sparseArray.clone();
            } else {
                this.f18572f = new SparseArray(this.f18574h);
            }
            int i11 = this.f18574h;
            for (int i12 = 0; i12 < i11; i12++) {
                Drawable drawable = drawableArr[i12];
                if (drawable != null) {
                    Drawable.ConstantState constantState = drawable.getConstantState();
                    if (constantState != null) {
                        this.f18572f.put(i12, constantState);
                    } else {
                        this.f18573g[i12] = drawableArr[i12];
                    }
                }
            }
        } else {
            this.f18573g = new Drawable[10];
            this.f18574h = 0;
        }
        if (bVar != null) {
            this.H = bVar.H;
        } else {
            this.H = new int[this.f18573g.length][];
        }
        if (bVar != null) {
            this.I = bVar.I;
            this.J = bVar.J;
        } else {
            this.I = new j();
            this.J = new o(0);
        }
    }

    public final int a(Drawable drawable) {
        int i5 = this.f18574h;
        if (i5 >= this.f18573g.length) {
            int i10 = i5 + 10;
            Drawable[] drawableArr = new Drawable[i10];
            Drawable[] drawableArr2 = this.f18573g;
            if (drawableArr2 != null) {
                System.arraycopy(drawableArr2, 0, drawableArr, 0, i5);
            }
            this.f18573g = drawableArr;
            int[][] iArr = new int[i10][];
            System.arraycopy(this.H, 0, iArr, 0, i5);
            this.H = iArr;
        }
        drawable.mutate();
        drawable.setVisible(false, true);
        drawable.setCallback(this.f18567a);
        this.f18573g[i5] = drawable;
        this.f18574h++;
        this.f18571e = drawable.getChangingConfigurations() | this.f18571e;
        this.f18582r = false;
        this.f18584t = false;
        this.f18576k = null;
        this.j = false;
        this.f18578m = false;
        this.f18585u = false;
        return i5;
    }

    public final void b() {
        this.f18578m = true;
        c();
        int i5 = this.f18574h;
        Drawable[] drawableArr = this.f18573g;
        this.f18580o = -1;
        this.f18579n = -1;
        this.q = 0;
        this.f18581p = 0;
        for (int i10 = 0; i10 < i5; i10++) {
            Drawable drawable = drawableArr[i10];
            int intrinsicWidth = drawable.getIntrinsicWidth();
            if (intrinsicWidth > this.f18579n) {
                this.f18579n = intrinsicWidth;
            }
            int intrinsicHeight = drawable.getIntrinsicHeight();
            if (intrinsicHeight > this.f18580o) {
                this.f18580o = intrinsicHeight;
            }
            int minimumWidth = drawable.getMinimumWidth();
            if (minimumWidth > this.f18581p) {
                this.f18581p = minimumWidth;
            }
            int minimumHeight = drawable.getMinimumHeight();
            if (minimumHeight > this.q) {
                this.q = minimumHeight;
            }
        }
    }

    public final void c() {
        SparseArray sparseArray = this.f18572f;
        if (sparseArray != null) {
            int size = sparseArray.size();
            for (int i5 = 0; i5 < size; i5++) {
                int keyAt = this.f18572f.keyAt(i5);
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f18572f.valueAt(i5);
                Drawable[] drawableArr = this.f18573g;
                Drawable newDrawable = constantState.newDrawable(this.f18568b);
                newDrawable.setLayoutDirection(this.f18588x);
                Drawable mutate = newDrawable.mutate();
                mutate.setCallback(this.f18567a);
                drawableArr[keyAt] = mutate;
            }
            this.f18572f = null;
        }
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final boolean canApplyTheme() {
        int i5 = this.f18574h;
        Drawable[] drawableArr = this.f18573g;
        for (int i10 = 0; i10 < i5; i10++) {
            Drawable drawable = drawableArr[i10];
            if (drawable == null) {
                Drawable.ConstantState constantState = (Drawable.ConstantState) this.f18572f.get(i10);
                if (constantState != null && constantState.canApplyTheme()) {
                    return true;
                }
            } else if (drawable.canApplyTheme()) {
                return true;
            }
        }
        return false;
    }

    public final Drawable d(int i5) {
        int indexOfKey;
        Drawable drawable = this.f18573g[i5];
        if (drawable != null) {
            return drawable;
        }
        SparseArray sparseArray = this.f18572f;
        if (sparseArray == null || (indexOfKey = sparseArray.indexOfKey(i5)) < 0) {
            return null;
        }
        Drawable newDrawable = ((Drawable.ConstantState) this.f18572f.valueAt(indexOfKey)).newDrawable(this.f18568b);
        newDrawable.setLayoutDirection(this.f18588x);
        Drawable mutate = newDrawable.mutate();
        mutate.setCallback(this.f18567a);
        this.f18573g[i5] = mutate;
        this.f18572f.removeAt(indexOfKey);
        if (this.f18572f.size() == 0) {
            this.f18572f = null;
        }
        return mutate;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1, types: [java.lang.Object[]] */
    /* JADX WARN: Type inference failed for: r5v3 */
    public final int e(int i5) {
        ?? r5;
        if (i5 < 0) {
            return 0;
        }
        o oVar = this.J;
        int i10 = 0;
        oVar.getClass();
        Intrinsics.checkNotNullParameter(oVar, "<this>");
        int a7 = t.a.a(oVar.f22579d, i5, oVar.f22577b);
        if (a7 >= 0 && (r5 = oVar.f22578c[a7]) != k.f22566c) {
            i10 = r5;
        }
        return i10.intValue();
    }

    public final int f(int[] iArr) {
        int[][] iArr2 = this.H;
        int i5 = this.f18574h;
        for (int i10 = 0; i10 < i5; i10++) {
            if (StateSet.stateSetMatches(iArr2[i10], iArr)) {
                return i10;
            }
        }
        return -1;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final int getChangingConfigurations() {
        return this.f18570d | this.f18571e;
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable() {
        return new e(this, null);
    }

    @Override // android.graphics.drawable.Drawable.ConstantState
    public final Drawable newDrawable(Resources resources) {
        return new e(this, resources);
    }
}
