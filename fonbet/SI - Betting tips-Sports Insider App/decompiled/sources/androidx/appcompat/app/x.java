package androidx.appcompat.app;

import android.content.Context;
import android.graphics.Rect;
import android.os.Build;
import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.FrameLayout;
import androidx.appcompat.widget.ActionBarContextView;
import androidx.appcompat.widget.t4;
import androidx.appcompat.widget.u1;
import androidx.appcompat.widget.u4;
import androidx.core.view.k2;
import androidx.core.view.z0;
import com.sports.insider.R;
import java.lang.reflect.Method;
import java.util.WeakHashMap;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class x implements androidx.core.view.x, u1, androidx.appcompat.view.menu.y {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f371a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ l0 f372b;

    public /* synthetic */ x(l0 l0Var, int i5) {
        this.f371a = i5;
        this.f372b = l0Var;
    }

    @Override // androidx.appcompat.view.menu.y
    public boolean c(androidx.appcompat.view.menu.n nVar) {
        Window.Callback callback;
        switch (this.f371a) {
            case 2:
                Window.Callback callback2 = this.f372b.f305l.getCallback();
                if (callback2 != null) {
                    callback2.onMenuOpened(108, nVar);
                    break;
                }
                break;
            default:
                if (nVar == nVar.getRootMenu()) {
                    l0 l0Var = this.f372b;
                    if (l0Var.F && (callback = l0Var.f305l.getCallback()) != null && !l0Var.f302h0) {
                        callback.onMenuOpened(108, nVar);
                        break;
                    }
                }
                break;
        }
        return true;
    }

    /* JADX WARN: Unreachable blocks removed: 1, instructions: 1 */
    @Override // androidx.core.view.x
    public k2 onApplyWindowInsets(View view, k2 k2Var) {
        int i5;
        int i10;
        int i11;
        int i12;
        int d10 = k2Var.d();
        l0 l0Var = this.f372b;
        Context context = l0Var.f304k;
        int d11 = k2Var.d();
        ActionBarContextView actionBarContextView = l0Var.f324v;
        if (actionBarContextView == null || !(actionBarContextView.getLayoutParams() instanceof ViewGroup.MarginLayoutParams)) {
            i5 = 0;
            i10 = 0;
        } else {
            ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) l0Var.f324v.getLayoutParams();
            if (l0Var.f324v.isShown()) {
                if (l0Var.f321t0 == null) {
                    l0Var.f321t0 = new Rect();
                    l0Var.f323u0 = new Rect();
                }
                Rect rect = l0Var.f321t0;
                Rect rect2 = l0Var.f323u0;
                rect.set(k2Var.b(), k2Var.d(), k2Var.c(), k2Var.a());
                ViewGroup viewGroup = l0Var.A;
                if (Build.VERSION.SDK_INT >= 29) {
                    boolean z5 = u4.f982a;
                    t4.a(viewGroup, rect, rect2);
                    i11 = 0;
                } else {
                    if (u4.f982a) {
                        i11 = 0;
                    } else {
                        u4.f982a = true;
                        i11 = 0;
                        try {
                            Method declaredMethod = View.class.getDeclaredMethod("computeFitSystemWindows", Rect.class, Rect.class);
                            u4.f983b = declaredMethod;
                            if (!declaredMethod.isAccessible()) {
                                u4.f983b.setAccessible(true);
                            }
                        } catch (NoSuchMethodException unused) {
                            Log.d("ViewUtils", "Could not find method computeFitSystemWindows. Oh well.");
                        }
                    }
                    Method method = u4.f983b;
                    if (method != null) {
                        try {
                            Object[] objArr = new Object[2];
                            objArr[i11] = rect;
                            objArr[1] = rect2;
                            method.invoke(viewGroup, objArr);
                        } catch (Exception e7) {
                            Log.d("ViewUtils", "Could not invoke computeFitSystemWindows", e7);
                        }
                    }
                }
                int i13 = rect.top;
                int i14 = rect.left;
                int i15 = rect.right;
                ViewGroup viewGroup2 = l0Var.A;
                WeakHashMap weakHashMap = z0.f1413a;
                k2 a7 = androidx.core.view.r0.a(viewGroup2);
                int b10 = a7 == null ? i11 : a7.b();
                int c2 = a7 == null ? i11 : a7.c();
                if (marginLayoutParams.topMargin == i13 && marginLayoutParams.leftMargin == i14 && marginLayoutParams.rightMargin == i15) {
                    i12 = i11;
                } else {
                    marginLayoutParams.topMargin = i13;
                    marginLayoutParams.leftMargin = i14;
                    marginLayoutParams.rightMargin = i15;
                    i12 = 1;
                }
                if (i13 <= 0 || l0Var.C != null) {
                    View view2 = l0Var.C;
                    if (view2 != null) {
                        ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) view2.getLayoutParams();
                        int i16 = marginLayoutParams2.height;
                        int i17 = marginLayoutParams.topMargin;
                        if (i16 != i17 || marginLayoutParams2.leftMargin != b10 || marginLayoutParams2.rightMargin != c2) {
                            marginLayoutParams2.height = i17;
                            marginLayoutParams2.leftMargin = b10;
                            marginLayoutParams2.rightMargin = c2;
                            l0Var.C.setLayoutParams(marginLayoutParams2);
                        }
                    }
                } else {
                    View view3 = new View(context);
                    l0Var.C = view3;
                    view3.setVisibility(8);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, marginLayoutParams.topMargin, 51);
                    layoutParams.leftMargin = b10;
                    layoutParams.rightMargin = c2;
                    l0Var.A.addView(l0Var.C, -1, layoutParams);
                }
                View view4 = l0Var.C;
                r9 = view4 == null ? i11 : 1;
                if (r9 != 0 && view4.getVisibility() != 0) {
                    View view5 = l0Var.C;
                    view5.setBackgroundColor((view5.getWindowSystemUiVisibility() & Segment.SIZE) != 0 ? context.getColor(R.color.abc_decor_view_status_guard_light) : context.getColor(R.color.abc_decor_view_status_guard));
                }
                if (!l0Var.H && r9 != 0) {
                    d11 = i11;
                }
                i10 = r9;
                i5 = i11;
                r9 = i12;
            } else {
                i5 = 0;
                if (marginLayoutParams.topMargin != 0) {
                    marginLayoutParams.topMargin = 0;
                    i10 = 0;
                } else {
                    i10 = 0;
                    r9 = 0;
                }
            }
            if (r9 != 0) {
                l0Var.f324v.setLayoutParams(marginLayoutParams);
            }
        }
        View view6 = l0Var.C;
        if (view6 != null) {
            view6.setVisibility(i10 != 0 ? i5 : 8);
        }
        return z0.j(view, d10 != d11 ? k2Var.f(k2Var.b(), d11, k2Var.c(), k2Var.a()) : k2Var);
    }

    @Override // androidx.appcompat.view.menu.y
    public void onCloseMenu(androidx.appcompat.view.menu.n nVar, boolean z5) {
        k0 k0Var;
        switch (this.f371a) {
            case 2:
                this.f372b.o(nVar);
                break;
            default:
                androidx.appcompat.view.menu.n rootMenu = nVar.getRootMenu();
                int i5 = 0;
                boolean z7 = rootMenu != nVar;
                if (z7) {
                    nVar = rootMenu;
                }
                l0 l0Var = this.f372b;
                k0[] k0VarArr = l0Var.L;
                int length = k0VarArr != null ? k0VarArr.length : 0;
                while (true) {
                    if (i5 >= length) {
                        k0Var = null;
                    } else {
                        k0Var = k0VarArr[i5];
                        if (k0Var == null || k0Var.f291h != nVar) {
                            i5++;
                        }
                    }
                }
                if (k0Var != null) {
                    if (!z7) {
                        l0Var.p(k0Var, z5);
                        break;
                    } else {
                        l0Var.n(k0Var.f284a, k0Var, rootMenu);
                        l0Var.p(k0Var, true);
                        break;
                    }
                }
                break;
        }
    }
}
