package r;

import androidx.lifecycle.W;
import ru.ozon.app.android.R;

/* renamed from: r.j, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C9097j implements W<Boolean> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ C9091d f82320a;

    C9097j(C9091d c9091d) {
        this.f82320a = c9091d;
    }

    @Override // androidx.lifecycle.W
    public final void onChanged(Boolean bool) {
        if (bool.booleanValue()) {
            C9091d c9091d = this.f82320a;
            if (c9091d.w()) {
                c9091d.D();
            } else {
                CharSequence s02 = c9091d.f82304b.s0();
                if (s02 == null) {
                    s02 = c9091d.getString(R.string.default_error_msg);
                }
                c9091d.E(13, s02);
                c9091d.u(2);
            }
            c9091d.f82304b.X0(false);
        }
    }
}
