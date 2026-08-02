package j7;

import android.animation.Animator;
import android.animation.AnimatorInflater;
import android.animation.AnimatorSet;
import android.animation.ObjectAnimator;
import android.animation.PropertyValuesHolder;
import android.content.Context;
import android.content.res.TypedArray;
import android.util.Log;
import androidx.annotation.NonNull;
import androidx.collection.Z;
import java.util.ArrayList;

/* renamed from: j7.h, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7299h {

    /* renamed from: a, reason: collision with root package name */
    private final Z<String, C7300i> f69475a = new Z<>();

    /* renamed from: b, reason: collision with root package name */
    private final Z<String, PropertyValuesHolder[]> f69476b = new Z<>();

    public static C7299h a(@NonNull Context context, @NonNull TypedArray typedArray, int i11) {
        int resourceId;
        if (!typedArray.hasValue(i11) || (resourceId = typedArray.getResourceId(i11, 0)) == 0) {
            return null;
        }
        return b(resourceId, context);
    }

    public static C7299h b(int i11, @NonNull Context context) {
        try {
            Animator loadAnimator = AnimatorInflater.loadAnimator(context, i11);
            if (loadAnimator instanceof AnimatorSet) {
                return c(((AnimatorSet) loadAnimator).getChildAnimations());
            }
            if (loadAnimator == null) {
                return null;
            }
            ArrayList arrayList = new ArrayList();
            arrayList.add(loadAnimator);
            return c(arrayList);
        } catch (Exception e11) {
            Log.w("MotionSpec", "Can't load animation resource ID #0x" + Integer.toHexString(i11), e11);
            return null;
        }
    }

    @NonNull
    private static C7299h c(@NonNull ArrayList arrayList) {
        C7299h c7299h = new C7299h();
        int size = arrayList.size();
        for (int i11 = 0; i11 < size; i11++) {
            Animator animator = (Animator) arrayList.get(i11);
            if (!(animator instanceof ObjectAnimator)) {
                throw new IllegalArgumentException("Animator must be an ObjectAnimator: " + animator);
            }
            ObjectAnimator objectAnimator = (ObjectAnimator) animator;
            c7299h.f69476b.put(objectAnimator.getPropertyName(), objectAnimator.getValues());
            c7299h.f69475a.put(objectAnimator.getPropertyName(), C7300i.b(objectAnimator));
        }
        return c7299h;
    }

    public final C7300i d(String str) {
        Z<String, C7300i> z11 = this.f69475a;
        if (z11.get(str) != null) {
            return z11.get(str);
        }
        throw new IllegalArgumentException();
    }

    public final long e() {
        Z<String, C7300i> z11 = this.f69475a;
        int size = z11.size();
        long j11 = 0;
        for (int i11 = 0; i11 < size; i11++) {
            C7300i n11 = z11.n(i11);
            j11 = Math.max(j11, n11.d() + n11.c());
        }
        return j11;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof C7299h) {
            return this.f69475a.equals(((C7299h) obj).f69475a);
        }
        return false;
    }

    public final int hashCode() {
        return this.f69475a.hashCode();
    }

    @NonNull
    public final String toString() {
        return "\n" + C7299h.class.getName() + '{' + Integer.toHexString(System.identityHashCode(this)) + " timings: " + this.f69475a + "}\n";
    }
}
