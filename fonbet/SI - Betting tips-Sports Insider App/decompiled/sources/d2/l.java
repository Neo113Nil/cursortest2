package d2;

import android.os.Build;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.appcompat.app.c0;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract class l extends e {

    /* renamed from: c, reason: collision with root package name */
    public final OnBackInvokedDispatcher f8106c;

    /* renamed from: d, reason: collision with root package name */
    public final int f8107d;

    /* renamed from: e, reason: collision with root package name */
    public final OnBackInvokedCallback f8108e;

    /* renamed from: f, reason: collision with root package name */
    public boolean f8109f;

    public l(OnBackInvokedDispatcher onBackInvokedDispatcher, int i5) {
        this.f8106c = onBackInvokedDispatcher;
        this.f8107d = i5;
        this.f8108e = Build.VERSION.SDK_INT == 33 ? new c0(3, this) : new k(this);
    }

    @Override // d2.e
    public final void b(boolean z5) {
        if (z5 && !this.f8109f) {
            this.f8106c.registerOnBackInvokedCallback(this.f8107d, this.f8108e);
            this.f8109f = true;
        } else {
            if (z5 || !this.f8109f) {
                return;
            }
            this.f8106c.unregisterOnBackInvokedCallback(this.f8108e);
            this.f8109f = false;
        }
    }
}
