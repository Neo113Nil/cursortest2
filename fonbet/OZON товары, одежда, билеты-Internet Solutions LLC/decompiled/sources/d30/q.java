package d30;

import androidx.annotation.NonNull;
import e30.C6291d;

/* loaded from: classes3.dex */
final class q extends J4.l<C6291d> {
    @Override // J4.l
    protected final void bind(@NonNull O4.f fVar, @NonNull C6291d c6291d) {
        c6291d.getClass();
        fVar.m0(1, 0);
        fVar.e0(2, null);
    }

    @Override // J4.A
    @NonNull
    protected final String createQuery() {
        return "INSERT OR REPLACE INTO `user_id` (`id`,`userId`) VALUES (nullif(?, 0),?)";
    }
}
