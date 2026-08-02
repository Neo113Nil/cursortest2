package u8;

import androidx.annotation.NonNull;
import java.io.IOException;

/* loaded from: classes9.dex */
final class i implements r8.g {

    /* renamed from: a, reason: collision with root package name */
    private boolean f100389a = false;

    /* renamed from: b, reason: collision with root package name */
    private boolean f100390b = false;

    /* renamed from: c, reason: collision with root package name */
    private r8.c f100391c;

    /* renamed from: d, reason: collision with root package name */
    private final f f100392d;

    i(f fVar) {
        this.f100392d = fVar;
    }

    final void a(r8.c cVar, boolean z11) {
        this.f100389a = false;
        this.f100391c = cVar;
        this.f100390b = z11;
    }

    @Override // r8.g
    @NonNull
    public final r8.g add(String str) throws IOException {
        if (this.f100389a) {
            throw new r8.b("Cannot encode a second value in the ValueEncoderContext");
        }
        this.f100389a = true;
        this.f100392d.d(this.f100391c, str, this.f100390b);
        return this;
    }

    @Override // r8.g
    @NonNull
    public final r8.g add(boolean z11) throws IOException {
        if (!this.f100389a) {
            this.f100389a = true;
            this.f100392d.b(this.f100391c, z11 ? 1 : 0, this.f100390b);
            return this;
        }
        throw new r8.b("Cannot encode a second value in the ValueEncoderContext");
    }
}
