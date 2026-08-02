package androidx.fragment.app;

import android.util.Log;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewParent;
import kotlin.jvm.internal.Intrinsics;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class i2 {

    /* renamed from: a, reason: collision with root package name */
    public static final i2 f1957a;

    /* renamed from: b, reason: collision with root package name */
    public static final i2 f1958b;

    /* renamed from: c, reason: collision with root package name */
    public static final i2 f1959c;

    /* renamed from: d, reason: collision with root package name */
    public static final i2 f1960d;

    /* renamed from: e, reason: collision with root package name */
    public static final /* synthetic */ i2[] f1961e;

    static {
        i2 i2Var = new i2("REMOVED", 0);
        f1957a = i2Var;
        i2 i2Var2 = new i2("VISIBLE", 1);
        f1958b = i2Var2;
        i2 i2Var3 = new i2("GONE", 2);
        f1959c = i2Var3;
        i2 i2Var4 = new i2("INVISIBLE", 3);
        f1960d = i2Var4;
        f1961e = new i2[]{i2Var, i2Var2, i2Var3, i2Var4};
    }

    public static i2 valueOf(String str) {
        return (i2) Enum.valueOf(i2.class, str);
    }

    public static i2[] values() {
        return (i2[]) f1961e.clone();
    }

    public final void a(View view, ViewGroup container) {
        Intrinsics.checkNotNullParameter(view, "view");
        Intrinsics.checkNotNullParameter(container, "container");
        if (j1.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Calling apply state");
        }
        int i5 = h2.$EnumSwitchMapping$0[ordinal()];
        if (i5 == 1) {
            ViewParent parent = view.getParent();
            ViewGroup viewGroup = parent instanceof ViewGroup ? (ViewGroup) parent : null;
            if (viewGroup != null) {
                if (j1.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Removing view " + view + " from container " + viewGroup);
                }
                viewGroup.removeView(view);
                return;
            }
            return;
        }
        if (i5 == 2) {
            if (j1.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to VISIBLE");
            }
            ViewParent parent2 = view.getParent();
            if ((parent2 instanceof ViewGroup ? (ViewGroup) parent2 : null) == null) {
                if (j1.L(2)) {
                    Log.v("FragmentManager", "SpecialEffectsController: Adding view " + view + " to Container " + container);
                }
                container.addView(view);
            }
            view.setVisibility(0);
            return;
        }
        if (i5 == 3) {
            if (j1.L(2)) {
                Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to GONE");
            }
            view.setVisibility(8);
            return;
        }
        if (i5 != 4) {
            return;
        }
        if (j1.L(2)) {
            Log.v("FragmentManager", "SpecialEffectsController: Setting view " + view + " to INVISIBLE");
        }
        view.setVisibility(4);
    }
}
