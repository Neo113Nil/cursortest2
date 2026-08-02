package androidx.core.view;

import android.view.View;
import android.view.Window;
import android.view.WindowInsetsController;
import com.google.android.gms.internal.measurement.y3;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class n2 extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public final WindowInsetsController f1367b;

    /* renamed from: c, reason: collision with root package name */
    public final h9.c f1368c;

    /* renamed from: d, reason: collision with root package name */
    public final Window f1369d;

    public n2(WindowInsetsController windowInsetsController, h9.c cVar) {
        this.f1367b = windowInsetsController;
        this.f1368c = cVar;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void r() {
        ((h9.c) this.f1368c.f10430b).w();
        this.f1367b.hide(0);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public boolean s() {
        this.f1367b.setSystemBarsAppearance(0, 0);
        return (this.f1367b.getSystemBarsAppearance() & 8) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void w(boolean z5) {
        Window window = this.f1369d;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | 16);
            }
            this.f1367b.setSystemBarsAppearance(16, 16);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-17));
        }
        this.f1367b.setSystemBarsAppearance(0, 16);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void x(boolean z5) {
        Window window = this.f1369d;
        if (z5) {
            if (window != null) {
                View decorView = window.getDecorView();
                decorView.setSystemUiVisibility(decorView.getSystemUiVisibility() | Segment.SIZE);
            }
            this.f1367b.setSystemBarsAppearance(8, 8);
            return;
        }
        if (window != null) {
            View decorView2 = window.getDecorView();
            decorView2.setSystemUiVisibility(decorView2.getSystemUiVisibility() & (-8193));
        }
        this.f1367b.setSystemBarsAppearance(0, 8);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void z() {
        ((h9.c) this.f1368c.f10430b).z();
        this.f1367b.show(0);
    }

    public n2(Window window, h9.c cVar) {
        this(window.getInsetsController(), cVar);
        this.f1369d = window;
    }
}
