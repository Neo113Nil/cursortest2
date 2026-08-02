package androidx.core.view;

import android.view.View;
import android.view.Window;
import com.google.android.gms.internal.measurement.y3;
import okio.Segment;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public class l2 extends y3 {

    /* renamed from: b, reason: collision with root package name */
    public final Window f1354b;

    /* renamed from: c, reason: collision with root package name */
    public final h9.c f1355c;

    public l2(Window window, h9.c cVar) {
        this.f1354b = window;
        this.f1355c = cVar;
    }

    public final void G(int i5) {
        View decorView = this.f1354b.getDecorView();
        decorView.setSystemUiVisibility(i5 | decorView.getSystemUiVisibility());
    }

    public final void H(int i5) {
        View decorView = this.f1354b.getDecorView();
        decorView.setSystemUiVisibility((~i5) & decorView.getSystemUiVisibility());
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void r() {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((8 & i5) != 0) {
                if (i5 == 1) {
                    G(4);
                } else if (i5 == 2) {
                    G(2);
                } else if (i5 == 8) {
                    ((h9.c) this.f1355c.f10430b).w();
                }
            }
        }
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final boolean s() {
        return (this.f1354b.getDecorView().getSystemUiVisibility() & Segment.SIZE) != 0;
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void x(boolean z5) {
        if (!z5) {
            H(Segment.SIZE);
            return;
        }
        Window window = this.f1354b;
        window.clearFlags(67108864);
        window.addFlags(Integer.MIN_VALUE);
        G(Segment.SIZE);
    }

    @Override // com.google.android.gms.internal.measurement.y3
    public final void z() {
        for (int i5 = 1; i5 <= 512; i5 <<= 1) {
            if ((8 & i5) != 0) {
                if (i5 == 1) {
                    H(4);
                    this.f1354b.clearFlags(Segment.SHARE_MINIMUM);
                } else if (i5 == 2) {
                    H(2);
                } else if (i5 == 8) {
                    ((h9.c) this.f1355c.f10430b).z();
                }
            }
        }
    }
}
