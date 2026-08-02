package L2;

import android.view.View;

/* loaded from: classes.dex */
public abstract class T extends w {
    private static final String[] VISIBILITY_PROPAGATION_VALUES = {"android:visibilityPropagation:visibility", "android:visibilityPropagation:center"};

    public static int d(A a10, int i10) {
        int[] iArr;
        if (a10 == null || (iArr = (int[]) a10.f6756a.get("android:visibilityPropagation:center")) == null) {
            return -1;
        }
        return iArr[i10];
    }

    @Override // L2.w
    public void a(A a10) {
        View view = a10.f6757b;
        Integer num = (Integer) a10.f6756a.get("android:visibility:visibility");
        if (num == null) {
            num = Integer.valueOf(view.getVisibility());
        }
        a10.f6756a.put("android:visibilityPropagation:visibility", num);
        int[] iArr = {r4, 0};
        view.getLocationOnScreen(iArr);
        int round = iArr[0] + Math.round(view.getTranslationX());
        iArr[0] = round + (view.getWidth() / 2);
        int round2 = iArr[1] + Math.round(view.getTranslationY());
        iArr[1] = round2;
        iArr[1] = round2 + (view.getHeight() / 2);
        a10.f6756a.put("android:visibilityPropagation:center", iArr);
    }

    @Override // L2.w
    public String[] b() {
        return VISIBILITY_PROPAGATION_VALUES;
    }

    public int e(A a10) {
        Integer num;
        if (a10 == null || (num = (Integer) a10.f6756a.get("android:visibilityPropagation:visibility")) == null) {
            return 8;
        }
        return num.intValue();
    }

    public int f(A a10) {
        return d(a10, 0);
    }

    public int g(A a10) {
        return d(a10, 1);
    }
}
