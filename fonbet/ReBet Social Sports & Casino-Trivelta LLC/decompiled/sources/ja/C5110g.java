package ja;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import z.r;

/* renamed from: ja.g, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public class C5110g {

    /* renamed from: a, reason: collision with root package name */
    public final r f53867a = new r();

    /* renamed from: b, reason: collision with root package name */
    public final r f53868b = new r();

    public static void a(C5110g c5110g, Animator animator) {
        if (animator instanceof ObjectAnimator) {
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c5110g.g(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c5110g.h(objectAnimator.getPropertyName(), C5111h.b(objectAnimator));
        } else {
            throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
        }
    }

    public static C5110g b(Context context, TypedArray typedArray, int i10) {
        int resourceId;
        if (!typedArray.hasValue(i10) || (resourceId = typedArray.getResourceId(i10, 0)) == 0) {
            return null;
        }
        return c(context, resourceId);
    }

    public static C5110g c(Context context, int i10) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i10);
            if (loadAnimator instanceof AnimatorSet) {
                return d(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return d(arrayList);
        } catch (Exception e10) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i10), e10);
            return null;
        }
    }

    public static C5110g d(List list) {
        C5110g c5110g = new C5110g();
        int size = list.size();
        for (int i10 = 0; i10 < size; i10++) {
            a(c5110g, (Animator) list.get(i10));
        }
        return c5110g;
    }

    public C5111h e(String str) {
        if (f(str)) {
            return (C5111h) this.f53867a.get(str);
        }
        throw new IllegalArgumentException();
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C5110g) {
            return this.f53867a.equals(((C5110g) obj).f53867a);
        }
        return false;
    }

    public boolean f(String str) {
        return this.f53867a.get(str) != null;
    }

    public void g(String str, PropertyValuesHolder[] propertyValuesHolderArr) {
        this.f53868b.put(str, propertyValuesHolderArr);
    }

    public void h(String str, C5111h c5111h) {
        this.f53867a.put(str, c5111h);
    }

    public int hashCode() {
        return this.f53867a.hashCode();
    }

    public String toString() {
        return '\n' + getClass().getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f53867a + "}\n";
    }
}
