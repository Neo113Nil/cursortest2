package defpackage;

import android.graphics.Matrix;
import android.view.View;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class bg2 implements ag2 {
    public final int[] a;
    public final float[] b;

    public bg2(ArrayList arrayList, ArrayList arrayList2) {
        int size = arrayList.size();
        this.a = new int[size];
        this.b = new float[size];
        for (int i = 0; i < size; i++) {
            this.a[i] = ((Integer) arrayList.get(i)).intValue();
            this.b[i] = ((Float) arrayList2.get(i)).floatValue();
        }
    }

    @Override // defpackage.ag2
    public void a(View view, float[] fArr) {
        xzb.d(fArr);
        b(view, fArr);
    }

    public void b(View view, float[] fArr) {
        Object parent = view.getParent();
        boolean z = parent instanceof View;
        float[] fArr2 = this.b;
        if (z) {
            b((View) parent, fArr);
            xzb.d(fArr2);
            xzb.g(fArr2, -view.getScrollX(), -view.getScrollY());
            lz.L(fArr, fArr2);
            float left = view.getLeft();
            float top = view.getTop();
            xzb.d(fArr2);
            xzb.g(fArr2, left, top);
            lz.L(fArr, fArr2);
        } else {
            int[] iArr = this.a;
            view.getLocationInWindow(iArr);
            xzb.d(fArr2);
            xzb.g(fArr2, -view.getScrollX(), -view.getScrollY());
            lz.L(fArr, fArr2);
            float f = iArr[0];
            float f2 = iArr[1];
            xzb.d(fArr2);
            xzb.g(fArr2, f, f2);
            lz.L(fArr, fArr2);
        }
        Matrix matrix = view.getMatrix();
        if (matrix.isIdentity()) {
            return;
        }
        pco.P(matrix, fArr2);
        lz.L(fArr, fArr2);
    }

    public bg2(int i, int i2) {
        this.a = new int[]{i, i2};
        this.b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f};
    }

    public bg2(int i, int i2, int i3) {
        this.a = new int[]{i, i2, i3};
        this.b = new float[]{UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.5f, 1.0f};
    }

    public bg2(float[] fArr) {
        this.b = fArr;
        this.a = new int[2];
    }
}
