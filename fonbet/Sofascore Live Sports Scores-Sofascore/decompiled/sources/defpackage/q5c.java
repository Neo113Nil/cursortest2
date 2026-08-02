package defpackage;

import android.net.Uri;
import java.util.Arrays;
import java.util.Objects;
import java.util.UUID;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class q5c {
    public final UUID a;
    public final Uri b;
    public final lv9 c;
    public final boolean d;
    public final hv9 e;
    public final byte[] f;

    static {
        wt3.s(0, 1, 2, 3, 4);
        nik.N(5);
        nik.N(6);
        nik.N(7);
    }

    public q5c(p5c p5cVar) {
        p5cVar.getClass();
        UUID uuid = (UUID) p5cVar.b;
        uuid.getClass();
        this.a = uuid;
        this.b = (Uri) p5cVar.c;
        this.c = (lv9) p5cVar.d;
        this.d = p5cVar.a;
        this.e = (hv9) p5cVar.e;
        byte[] bArr = (byte[]) p5cVar.f;
        this.f = bArr != null ? Arrays.copyOf(bArr, bArr.length) : null;
    }

    public final p5c a() {
        p5c p5cVar = new p5c();
        p5cVar.b = this.a;
        p5cVar.c = this.b;
        p5cVar.d = this.c;
        p5cVar.a = this.d;
        p5cVar.e = this.e;
        p5cVar.f = this.f;
        return p5cVar;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof q5c)) {
            return false;
        }
        q5c q5cVar = (q5c) obj;
        return this.a.equals(q5cVar.a) && Objects.equals(this.b, q5cVar.b) && Objects.equals(this.c, q5cVar.c) && this.d == q5cVar.d && this.e.equals(q5cVar.e) && Arrays.equals(this.f, q5cVar.f);
    }

    public final int hashCode() {
        int hashCode = this.a.hashCode() * 31;
        Uri uri = this.b;
        return Arrays.hashCode(this.f) + ((this.e.hashCode() + ((((this.c.hashCode() + ((hashCode + (uri != null ? uri.hashCode() : 0)) * 31)) * 29791) + (this.d ? 1 : 0)) * 31)) * 31);
    }
}
