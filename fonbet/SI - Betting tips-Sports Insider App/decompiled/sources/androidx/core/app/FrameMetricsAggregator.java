package androidx.core.app;

import android.os.Build;
import c0.h;
import m3.f;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class FrameMetricsAggregator {

    /* renamed from: a, reason: collision with root package name */
    public final f f1255a;

    public FrameMetricsAggregator() {
        this(1);
    }

    public FrameMetricsAggregator(int i5) {
        if (Build.VERSION.SDK_INT >= 24) {
            this.f1255a = new h(i5);
        } else {
            this.f1255a = new f(5);
        }
    }
}
