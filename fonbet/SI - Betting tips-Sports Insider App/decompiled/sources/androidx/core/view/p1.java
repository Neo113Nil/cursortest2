package androidx.core.view;

import android.os.Build;
import android.view.WindowInsets;
import android.view.WindowInsetsAnimation;
import android.view.WindowInsetsAnimation$Callback;
import j$.util.DesugarCollections;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class p1 extends WindowInsetsAnimation$Callback {

    /* renamed from: a, reason: collision with root package name */
    public final j1 f1378a;

    /* renamed from: b, reason: collision with root package name */
    public List f1379b;

    /* renamed from: c, reason: collision with root package name */
    public ArrayList f1380c;

    /* renamed from: d, reason: collision with root package name */
    public final HashMap f1381d;

    public p1(j1 j1Var) {
        super(j1Var.getDispatchMode());
        this.f1381d = new HashMap();
        this.f1378a = j1Var;
    }

    public final s1 a(WindowInsetsAnimation windowInsetsAnimation) {
        s1 s1Var = (s1) this.f1381d.get(windowInsetsAnimation);
        if (s1Var == null) {
            s1Var = new s1(0, null, 0L);
            if (Build.VERSION.SDK_INT >= 30) {
                s1Var.f1391a = new q1(windowInsetsAnimation);
            }
            this.f1381d.put(windowInsetsAnimation, s1Var);
        }
        return s1Var;
    }

    public final void onEnd(WindowInsetsAnimation windowInsetsAnimation) {
        this.f1378a.onEnd(a(windowInsetsAnimation));
        this.f1381d.remove(windowInsetsAnimation);
    }

    public final void onPrepare(WindowInsetsAnimation windowInsetsAnimation) {
        this.f1378a.onPrepare(a(windowInsetsAnimation));
    }

    public final WindowInsets onProgress(WindowInsets windowInsets, List list) {
        ArrayList arrayList = this.f1380c;
        if (arrayList == null) {
            ArrayList arrayList2 = new ArrayList(list.size());
            this.f1380c = arrayList2;
            this.f1379b = DesugarCollections.unmodifiableList(arrayList2);
        } else {
            arrayList.clear();
        }
        for (int size = list.size() - 1; size >= 0; size--) {
            WindowInsetsAnimation windowInsetsAnimation = (WindowInsetsAnimation) list.get(size);
            s1 a7 = a(windowInsetsAnimation);
            a7.f1391a.e(windowInsetsAnimation.getFraction());
            this.f1380c.add(a7);
        }
        return this.f1378a.onProgress(k2.h(null, windowInsets), this.f1379b).g();
    }

    public final WindowInsetsAnimation.Bounds onStart(WindowInsetsAnimation windowInsetsAnimation, WindowInsetsAnimation.Bounds bounds) {
        i1 onStart = this.f1378a.onStart(a(windowInsetsAnimation), new i1(bounds));
        onStart.getClass();
        o1.c();
        return o1.a(onStart.f1336a.e(), onStart.f1337b.e());
    }
}
