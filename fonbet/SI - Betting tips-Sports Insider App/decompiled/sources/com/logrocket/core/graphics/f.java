package com.logrocket.core.graphics;

import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.graphics.drawable.VectorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.TextView;
import com.logrocket.core.LogRocketCore;
import com.logrocket.core.h0;
import com.logrocket.core.p;
import java.lang.ref.WeakReference;
import java.lang.reflect.Method;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.Map;
import java.util.Stack;
import java.util.WeakHashMap;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class f {

    /* renamed from: a, reason: collision with root package name */
    public final ArrayList f6532a;

    /* renamed from: b, reason: collision with root package name */
    public final ArrayList f6533b;

    /* renamed from: c, reason: collision with root package name */
    public final int f6534c;

    /* renamed from: g, reason: collision with root package name */
    public Bitmap f6538g;

    /* renamed from: h, reason: collision with root package name */
    public aa.a f6539h;

    /* renamed from: i, reason: collision with root package name */
    public final boolean f6540i;
    public final boolean j;

    /* renamed from: l, reason: collision with root package name */
    public final WeakReference f6542l;

    /* renamed from: m, reason: collision with root package name */
    public ShimCanvas f6543m;

    /* renamed from: o, reason: collision with root package name */
    public final n f6545o;

    /* renamed from: p, reason: collision with root package name */
    public final t9.c f6546p;
    public final l q;

    /* renamed from: r, reason: collision with root package name */
    public final Map f6547r;

    /* renamed from: s, reason: collision with root package name */
    public final int f6548s;

    /* renamed from: t, reason: collision with root package name */
    public final int f6549t;

    /* renamed from: u, reason: collision with root package name */
    public d f6550u;

    /* renamed from: d, reason: collision with root package name */
    public final WeakHashMap f6535d = new WeakHashMap();

    /* renamed from: e, reason: collision with root package name */
    public final WeakHashMap f6536e = new WeakHashMap();

    /* renamed from: f, reason: collision with root package name */
    public final ba.b f6537f = new ba.b(new ba.d("frame-processor"));

    /* renamed from: k, reason: collision with root package name */
    public final WeakHashMap f6541k = new WeakHashMap();

    /* renamed from: n, reason: collision with root package name */
    public final b f6544n = new b();

    public f(com.logrocket.core.f fVar, LogRocketCore logRocketCore, Map map) {
        this.f6532a = fVar.f6427c;
        this.f6533b = fVar.f6428d;
        this.f6540i = fVar.f6431g;
        this.j = fVar.f6432h;
        this.f6534c = fVar.f6444v;
        n nVar = new n(fVar.f6439p, fVar.f6430f);
        this.f6545o = nVar;
        aa.a e7 = aa.b.e();
        this.f6539h = e7;
        this.f6538g = Bitmap.createBitmap(e7.f86a, e7.f87b, Bitmap.Config.ARGB_8888);
        this.f6542l = new WeakReference(logRocketCore);
        this.f6546p = new t9.c(fVar, nVar);
        this.q = new l(this);
        this.f6547r = map;
        this.f6548s = fVar.f6441s;
        this.f6549t = fVar.f6442t;
    }

    public final boolean a(View view) {
        ba.b bVar = this.f6537f;
        try {
            if (view.getVisibility() != 0) {
                bVar.a("Skipping hidden view: ".concat(view.getClass().getName()));
                return false;
            }
            if (view.getWidth() != 0 && view.getHeight() != 0) {
                if (view.getAlpha() == 0.0f) {
                    bVar.a("Skipping 0 alpha view: ".concat(view.getClass().getName()));
                    return false;
                }
                int[] iArr = new int[2];
                view.getLocationOnScreen(iArr);
                int width = iArr[0] + view.getWidth();
                int height = iArr[1] + view.getHeight();
                if (width > 0) {
                    int i5 = iArr[0];
                    aa.a aVar = this.f6539h;
                    if (i5 < aVar.f86a && height > 0 && iArr[1] < aVar.f87b) {
                        return true;
                    }
                }
                bVar.a("Skipping out of bounds view: ".concat(view.getClass().getName()));
                return false;
            }
            bVar.a("Skipping tiny view: ".concat(view.getClass().getName()));
            return false;
        } catch (Throwable th2) {
            bVar.p("Error checking view visibility", th2);
            return false;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:46:0x00e5, code lost:
    
        if (r6 > 0) goto L63;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:118:0x0280  */
    /* JADX WARN: Removed duplicated region for block: B:27:0x008d A[ORIG_RETURN, RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:29:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x01de  */
    /* JADX WARN: Type inference failed for: r27v1 */
    /* JADX WARN: Type inference failed for: r27v2 */
    /* JADX WARN: Type inference failed for: r27v3 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void b(View view, LinkedList linkedList, boolean z5, boolean z7, boolean z10) {
        boolean z11;
        ?? r27;
        boolean z12;
        boolean z13;
        boolean z14;
        int i5;
        if (d()) {
            return;
        }
        String concat = "processView ".concat(view.getClass().getName());
        ba.b bVar = this.f6537f;
        bVar.getClass();
        androidx.recyclerview.widget.j jVar = new androidx.recyclerview.widget.j(concat);
        bVar.k(jVar);
        LinkedList linkedList2 = linkedList;
        linkedList2.push(view);
        boolean e7 = e(view);
        boolean z15 = false;
        boolean z16 = f(view) || (z5 && !e7);
        if (z16 || !(e7 || z7)) {
            z11 = false;
        } else {
            z11 = false;
            z15 = true;
        }
        boolean z17 = view instanceof EditText;
        WeakReference weakReference = this.f6542l;
        int i10 = this.f6534c;
        if (z17 && !z16 && !z10 && (i10 == 2 || z15)) {
            WeakHashMap weakHashMap = this.f6541k;
            if (!weakHashMap.containsKey(view) && !j.a(view) && !this.f6550u.f6527f) {
                r27 = z11;
                ((EditText) view).addTextChangedListener(new e(weakReference, io.sentry.config.a.j(linkedList2)));
                weakHashMap.put(view, null);
                if (d()) {
                    this.f6543m.c(view, i10, z16, z15);
                    if (!d()) {
                        if (!z16 && !z10) {
                            try {
                                Drawable background = view.getBackground();
                                if (background != null) {
                                    i5 = this.f6543m.save();
                                    try {
                                        if (this.f6550u.f6527f) {
                                            ShimCanvas shimCanvas = this.f6543m;
                                            shimCanvas.getClass();
                                            int i11 = ShimCanvas.f6467h;
                                            int color = background instanceof ColorDrawable ? ((ColorDrawable) background).getColor() : i11;
                                            Paint paint = ShimCanvas.f6468i;
                                            paint.setColor(color);
                                            shimCanvas.drawRect(background.getBounds(), paint);
                                            if (color != i11) {
                                                paint.setColor(i11);
                                            }
                                        } else {
                                            background.draw(this.f6543m);
                                        }
                                    } catch (Throwable th2) {
                                        th = th2;
                                        try {
                                            bVar.e("Failed to capture background drawable", th);
                                            h0.c(th);
                                        } finally {
                                            if (i5 > 0) {
                                                this.f6543m.restoreToCount(i5);
                                            }
                                        }
                                    }
                                } else {
                                    i5 = r27;
                                }
                            } catch (Throwable th3) {
                                th = th3;
                                i5 = r27;
                            }
                        }
                        int scrollX = view.getScrollX();
                        int scrollY = view.getScrollY();
                        if (scrollX != 0 || scrollY != 0) {
                            this.f6543m.translate(-scrollX, -scrollY);
                        }
                        if (z10 || d()) {
                            z12 = z16;
                            z13 = z10;
                        } else {
                            ShimCanvas shimCanvas2 = this.f6543m;
                            com.logrocket.core.g gVar = (com.logrocket.core.g) weakReference.get();
                            t9.c cVar = this.f6546p;
                            if (cVar.f23783a) {
                                Throwable th4 = t9.b.f23756a;
                                if (view.getClass().equals(t9.b.f23757b)) {
                                    try {
                                        AtomicBoolean atomicBoolean = t9.c.f23780k;
                                        if (!atomicBoolean.get() && gVar != null) {
                                            wg.b q = wg.c.q();
                                            q.d();
                                            wg.c.p((wg.c) q.f6816b, 3);
                                            wg.b q3 = wg.c.q();
                                            q3.d();
                                            wg.c.p((wg.c) q3.f6816b, 3);
                                            gVar.a(31, q3);
                                            atomicBoolean.set(true);
                                        }
                                        Object newInstance = t9.b.f23758c.newInstance();
                                        t9.b.f23762g.set(newInstance, shimCanvas2);
                                        Object obj = t9.b.f23763h.get(view);
                                        t9.e eVar = new t9.e(obj, null, z16, z15);
                                        int[] iArr = new int[2];
                                        view.getLocationOnScreen(iArr);
                                        cVar.f23791i = iArr[r27];
                                        cVar.j = iArr[1];
                                        Stack stack = new Stack();
                                        cVar.f23790h = stack;
                                        stack.push(eVar);
                                        cVar.b();
                                        Method method = t9.b.f23773t;
                                        if (t9.b.f23761f == null) {
                                            Object[] objArr = new Object[1];
                                            objArr[r27] = newInstance;
                                            method.invoke(obj, objArr);
                                            z14 = true;
                                        } else {
                                            Object[] objArr2 = new Object[2];
                                            objArr2[r27] = newInstance;
                                            z14 = true;
                                            objArr2[1] = null;
                                            method.invoke(obj, objArr2);
                                        }
                                    } catch (Throwable th5) {
                                        try {
                                            cVar.f23784b.e("Failed to capture AndroidComposeView", th5);
                                            cVar.c();
                                        } finally {
                                            cVar.c();
                                        }
                                    }
                                    if (!z14 && !z16) {
                                        if (view instanceof ImageView) {
                                            z12 = z16;
                                            if (view instanceof TextView) {
                                                d.a.a(this.f6543m, view);
                                            } else if (!this.f6550u.f6527f) {
                                                d.a.a(this.f6543m, view);
                                            }
                                        } else if (this.f6550u.f6527f) {
                                            ShimCanvas shimCanvas3 = this.f6543m;
                                            shimCanvas3.getClass();
                                            Paint paint2 = ShimCanvas.f6468i;
                                            Drawable drawable = ((ImageView) view).getDrawable();
                                            if (drawable != null) {
                                                shimCanvas3.drawRect(drawable.getBounds(), paint2);
                                            } else {
                                                shimCanvas3.drawRect(r4.getLeft(), r4.getTop(), r4.getRight(), r4.getBottom(), paint2);
                                            }
                                        } else {
                                            ImageView imageView = (ImageView) view;
                                            ShimCanvas shimCanvas4 = this.f6543m;
                                            l lVar = this.q;
                                            WeakHashMap weakHashMap2 = lVar.f6564a;
                                            Drawable drawable2 = imageView.getDrawable();
                                            if (drawable2 instanceof VectorDrawable) {
                                                VectorDrawable vectorDrawable = (VectorDrawable) drawable2;
                                                k kVar = (k) weakHashMap2.get(vectorDrawable);
                                                if (kVar != null) {
                                                    l.a(kVar, imageView, shimCanvas4);
                                                } else {
                                                    z12 = z16;
                                                    Bitmap createBitmap = Bitmap.createBitmap(vectorDrawable.getIntrinsicWidth(), vectorDrawable.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
                                                    vectorDrawable.draw(new Canvas(createBitmap));
                                                    int c2 = lVar.f6565b.c(createBitmap);
                                                    int width = createBitmap.getWidth();
                                                    int height = createBitmap.getHeight();
                                                    k kVar2 = new k();
                                                    kVar2.f6561a = c2;
                                                    kVar2.f6562b = width;
                                                    kVar2.f6563c = height;
                                                    weakHashMap2.put(vectorDrawable, kVar2);
                                                    l.a(kVar2, imageView, shimCanvas4);
                                                }
                                            } else {
                                                z12 = z16;
                                                d.a.a(shimCanvas4, imageView);
                                            }
                                        }
                                        z13 = z14;
                                    }
                                    z12 = z16;
                                    z13 = z14;
                                }
                            }
                            z14 = r27;
                            if (!z14) {
                                if (view instanceof ImageView) {
                                }
                                z13 = z14;
                            }
                            z12 = z16;
                            z13 = z14;
                        }
                        if (!d() && (view instanceof ViewGroup)) {
                            ViewGroup viewGroup = (ViewGroup) view;
                            int i12 = r27;
                            while (i12 < viewGroup.getChildCount()) {
                                View childAt = viewGroup.getChildAt(i12);
                                if (a(childAt)) {
                                    b(childAt, linkedList2, z12, z15, z13);
                                }
                                i12++;
                                linkedList2 = linkedList;
                            }
                        }
                        if (scrollX != 0 || scrollY != 0) {
                            this.f6543m.translate(scrollX, scrollY);
                        }
                    }
                    ShimCanvas shimCanvas5 = this.f6543m;
                    Integer num = (Integer) shimCanvas5.f6474f.remove(view);
                    if (num != null) {
                        shimCanvas5.restoreToCount(num.intValue());
                    } else {
                        shimCanvas5.restore();
                        if (view.getAlpha() < 1.0f) {
                            shimCanvas5.restore();
                        }
                    }
                    n nVar = shimCanvas5.f6470b;
                    nVar.getClass();
                    nVar.f(System.identityHashCode(view));
                    bVar.i(jVar);
                    linkedList.pop();
                    return;
                }
                return;
            }
        }
        r27 = z11;
        if (d()) {
        }
    }

    public final int c(Bitmap bitmap) {
        if (this.f6540i) {
            return this.f6544n.a(bitmap, this.j);
        }
        return 0;
    }

    public final boolean d() {
        int i5;
        d dVar = this.f6550u;
        if (dVar != null) {
            int i10 = dVar.f6523b;
            long currentTimeMillis = System.currentTimeMillis() - dVar.f6524c;
            int i11 = dVar.f6522a;
            if (currentTimeMillis >= i11) {
                dVar.f6527f = true;
            }
            int i12 = i11 + i10;
            if (currentTimeMillis >= i12) {
                if (!dVar.f6525d) {
                    StackTraceElement[] stackTrace = Thread.currentThread().getStackTrace();
                    String str = "";
                    for (int i13 = 0; i13 < stackTrace.length; i13++) {
                        if (stackTrace[i13].getMethodName().equals("hasTakenTooLong") && (i5 = i13 + 1) < stackTrace.length) {
                            str = stackTrace[i5].getMethodName();
                        }
                    }
                    p.a("LogRocket view capture has timed out (in " + str + ") after " + currentTimeMillis + "ms with a threshold of " + i12 + "ms. Captured view may be incomplete!");
                    dVar.f6525d = true;
                }
                return true;
            }
        }
        return false;
    }

    public final boolean e(View view) {
        if (this.f6536e.containsKey(view)) {
            return true;
        }
        Object tag = view.getTag();
        if (tag == null) {
            return false;
        }
        Iterator it = this.f6533b.iterator();
        while (it.hasNext()) {
            if (it.next().equals(tag)) {
                return true;
            }
        }
        return false;
    }

    public final boolean f(View view) {
        if (this.f6535d.containsKey(view)) {
            return true;
        }
        Object tag = view.getTag();
        if (tag == null) {
            return false;
        }
        Iterator it = this.f6532a.iterator();
        while (it.hasNext()) {
            if (it.next().equals(tag)) {
                return true;
            }
        }
        return false;
    }

    public final void g(ArrayList arrayList) {
        if (this.f6538g.isRecycled()) {
            return;
        }
        this.f6550u = new d(this.f6548s, this.f6549t);
        aa.a e7 = aa.b.e();
        this.f6539h = e7;
        this.f6538g = Bitmap.createBitmap(e7.f86a, e7.f87b, Bitmap.Config.ARGB_8888);
        this.f6543m = new ShimCanvas(this.f6538g, this, this.f6545o, this.f6547r);
        b bVar = this.f6544n;
        bVar.f6481e++;
        Iterator it = bVar.f6478b.values().iterator();
        while (it.hasNext()) {
            ((a) it.next()).f6476b++;
        }
        t9.c.f23781l.clear();
        t9.c.f23782m.set(false);
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            View view = (View) it2.next();
            if (a(view)) {
                LinkedList linkedList = new LinkedList();
                linkedList.push(view);
                b(view, linkedList, false, false, false);
            }
        }
        d dVar = this.f6550u;
        dVar.getClass();
        dVar.f6526e = System.currentTimeMillis() - dVar.f6524c;
    }
}
