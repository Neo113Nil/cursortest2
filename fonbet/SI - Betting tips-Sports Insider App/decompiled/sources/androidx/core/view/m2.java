package androidx.core.view;

import android.view.Window;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class m2 extends l2 {
    @Override // com.google.android.gms.internal.measurement.y3
    public final void w(boolean z5) {
        if (!z5) {
            H(16);
            return;
        }
        Window window = this.f1354b;
        window.clearFlags(134217728);
        window.addFlags(Integer.MIN_VALUE);
        G(16);
    }
}
