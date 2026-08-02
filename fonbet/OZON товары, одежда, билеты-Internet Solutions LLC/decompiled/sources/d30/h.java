package d30;

import androidx.annotation.NonNull;
import e30.C6290c;

/* loaded from: classes3.dex */
final class h extends J4.l<C6290c> {
    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull C6290c c6290c) {
        fVar.m0(1, r5.a());
        fVar.e0(2, c6290c.b());
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `user_id` (`id`,`userId`) VALUES (nullif(?, 0),?)";
    }
}
