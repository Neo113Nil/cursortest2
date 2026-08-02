package d30;

import androidx.annotation.NonNull;
import e30.C6289b;

/* loaded from: classes3.dex */
final class p extends J4.l<C6289b> {
    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull C6289b c6289b) {
        C6289b c6289b2 = c6289b;
        fVar.m0(1, c6289b2.c());
        fVar.e0(2, c6289b2.b());
        fVar.m0(3, c6289b2.a());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `mobile_health_events` (`id`,`event_json`,`created_at`) VALUES (nullif(?, 0),?,?)";
    }
}
