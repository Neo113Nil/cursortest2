package defpackage;

import com.google.android.gms.internal.fido.zzbl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class rkn extends zzbl {
    public static final rkn a = new rkn();

    @Override // com.google.android.gms.internal.fido.zzbl
    public final Object d() {
        throw new IllegalStateException("Optional.get() cannot be called on an absent value");
    }

    public final boolean equals(Object obj) {
        return obj == this;
    }

    @Override // com.google.android.gms.internal.fido.zzbl
    public final boolean g() {
        return false;
    }

    public final int hashCode() {
        return 2040732332;
    }

    public final String toString() {
        return "Optional.absent()";
    }
}
