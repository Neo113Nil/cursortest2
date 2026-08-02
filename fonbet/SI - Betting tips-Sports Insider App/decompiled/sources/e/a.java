package e;

import android.os.Build;
import android.window.BackEvent;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final float f8388a;

    /* renamed from: b, reason: collision with root package name */
    public final float f8389b;

    /* renamed from: c, reason: collision with root package name */
    public final float f8390c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8391d;

    /* renamed from: e, reason: collision with root package name */
    public final long f8392e;

    public a(float f6, float f10, float f11, int i5, long j) {
        this.f8388a = f6;
        this.f8389b = f10;
        this.f8390c = f11;
        this.f8391d = i5;
        this.f8392e = j;
    }

    public final String toString() {
        StringBuilder sb2 = new StringBuilder("BackEventCompat(touchX=");
        sb2.append(this.f8388a);
        sb2.append(", touchY=");
        sb2.append(this.f8389b);
        sb2.append(", progress=");
        sb2.append(this.f8390c);
        sb2.append(", swipeEdge=");
        sb2.append(this.f8391d);
        sb2.append(", frameTimeMillis=");
        return d9.e.j(sb2, this.f8392e, ')');
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(BackEvent backEvent) {
        this(backEvent.getTouchX(), backEvent.getTouchY(), backEvent.getProgress(), backEvent.getSwipeEdge(), Build.VERSION.SDK_INT >= 36 ? backEvent.getFrameTimeMillis() : 0L);
        Intrinsics.checkNotNullParameter(backEvent, "backEvent");
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(d2.b navigationEvent) {
        this(navigationEvent.f8079c, navigationEvent.f8080d, navigationEvent.f8078b, navigationEvent.f8077a, navigationEvent.f8081e);
        Intrinsics.checkNotNullParameter(navigationEvent, "navigationEvent");
    }
}
