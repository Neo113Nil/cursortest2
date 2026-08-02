package androidx.core.view.insets;

import android.graphics.drawable.ColorDrawable;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import xsna.h4x;
import xsna.k8e0;

/* compiled from: Protection.java */
/* loaded from: classes12.dex */
public abstract class a {
    public h4x a;
    public h4x b;
    public k8e0 c;

    /* compiled from: Protection.java */
    /* renamed from: androidx.core.view.insets.a$a, reason: collision with other inner class name */
    public static class C0024a {
        public int a;
        public int b;
        public h4x c;
        public boolean d;
        public ColorDrawable e;
        public float f;
        public float g;
        public float h;
        public InterfaceC0025a i;

        /* compiled from: Protection.java */
        /* renamed from: androidx.core.view.insets.a$a$a, reason: collision with other inner class name */
        public interface InterfaceC0025a {
        }
    }

    static {
        new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f);
        new PathInterpolator(0.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);
        new PathInterpolator(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.2f, 1.0f);
        new PathInterpolator(0.4f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f, 1.0f);
    }

    public final void b(float f) {
        throw null;
    }

    public void a(int i) {
    }

    public final void c(float f) {
    }
}
