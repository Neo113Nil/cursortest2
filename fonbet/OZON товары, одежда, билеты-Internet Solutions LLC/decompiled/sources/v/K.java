package v;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
final class K implements I.c<Void> {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ W0 f100954a;

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ L f100955b;

    K(L l11, W0 w02) {
        this.f100955b = l11;
        this.f100954a = w02;
    }

    @Override // I.c
    public final void onFailure(@NonNull Throwable th2) {
    }

    @Override // I.c
    public final void onSuccess(Void r22) {
        this.f100955b.f100994n.remove(this.f100954a);
        int ordinal = this.f100955b.f100985e.ordinal();
        if (ordinal != 1 && ordinal != 4) {
            if (ordinal != 5 && (ordinal != 6 || this.f100955b.f100992l == 0)) {
                return;
            } else {
                this.f100955b.M("Camera reopen required. Checking if the current camera can be closed safely.");
            }
        }
        if (this.f100955b.f100994n.isEmpty()) {
            L l11 = this.f100955b;
            if (l11.f100991k != null) {
                l11.M("closing camera");
                this.f100955b.f100991k.close();
                this.f100955b.f100991k = null;
            }
        }
    }
}
