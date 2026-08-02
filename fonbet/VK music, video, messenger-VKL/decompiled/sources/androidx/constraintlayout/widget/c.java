package androidx.constraintlayout.widget;

import android.content.Context;
import android.content.res.TypedArray;
import android.util.AttributeSet;
import android.view.ViewGroup;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: Constraints.java */
/* loaded from: classes11.dex */
public final class c extends ViewGroup {

    /* compiled from: Constraints.java */
    public static class a extends ConstraintLayout.b {
        public float A0;
        public float B0;
        public float C0;
        public float D0;
        public float r0;
        public boolean s0;
        public float t0;
        public float u0;
        public float v0;
        public float w0;
        public float x0;
        public float y0;
        public float z0;

        public a() {
            super(-2, -2);
            this.r0 = 1.0f;
            this.s0 = false;
            this.t0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.u0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.v0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.w0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.x0 = 1.0f;
            this.y0 = 1.0f;
            this.z0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.A0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.B0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.C0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
            this.D0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateDefaultLayoutParams() {
        return new a();
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(AttributeSet attributeSet) {
        Context context = getContext();
        a aVar = new a(context, attributeSet);
        aVar.r0 = 1.0f;
        aVar.s0 = false;
        aVar.t0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.u0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.v0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.w0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.x0 = 1.0f;
        aVar.y0 = 1.0f;
        aVar.z0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.A0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.B0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.C0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        aVar.D0 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        TypedArray obtainStyledAttributes = context.obtainStyledAttributes(attributeSet, R$styleable.f);
        int indexCount = obtainStyledAttributes.getIndexCount();
        for (int i = 0; i < indexCount; i++) {
            int index = obtainStyledAttributes.getIndex(i);
            if (index == 15) {
                aVar.r0 = obtainStyledAttributes.getFloat(index, aVar.r0);
            } else if (index == 28) {
                aVar.t0 = obtainStyledAttributes.getFloat(index, aVar.t0);
                aVar.s0 = true;
            } else if (index == 23) {
                aVar.v0 = obtainStyledAttributes.getFloat(index, aVar.v0);
            } else if (index == 24) {
                aVar.w0 = obtainStyledAttributes.getFloat(index, aVar.w0);
            } else if (index == 22) {
                aVar.u0 = obtainStyledAttributes.getFloat(index, aVar.u0);
            } else if (index == 20) {
                aVar.x0 = obtainStyledAttributes.getFloat(index, aVar.x0);
            } else if (index == 21) {
                aVar.y0 = obtainStyledAttributes.getFloat(index, aVar.y0);
            } else if (index == 16) {
                aVar.z0 = obtainStyledAttributes.getFloat(index, aVar.z0);
            } else if (index == 17) {
                aVar.A0 = obtainStyledAttributes.getFloat(index, aVar.A0);
            } else if (index == 18) {
                aVar.B0 = obtainStyledAttributes.getFloat(index, aVar.B0);
            } else if (index == 19) {
                aVar.C0 = obtainStyledAttributes.getFloat(index, aVar.C0);
            } else if (index == 27) {
                aVar.D0 = obtainStyledAttributes.getFloat(index, aVar.D0);
            }
        }
        obtainStyledAttributes.recycle();
        return aVar;
    }

    public b getConstraintSet() {
        getChildCount();
        throw null;
    }

    @Override // android.view.ViewGroup
    public final ViewGroup.LayoutParams generateLayoutParams(ViewGroup.LayoutParams layoutParams) {
        return new ConstraintLayout.b(layoutParams);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onLayout(boolean z, int i, int i2, int i3, int i4) {
    }
}
