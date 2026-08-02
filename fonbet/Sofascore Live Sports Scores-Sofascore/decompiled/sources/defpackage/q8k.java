package defpackage;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class q8k implements Comparable {

    @NotNull
    public static final p8k b = new p8k(null);
    public final short a;

    public /* synthetic */ q8k(short s) {
        this.a = s;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.d(this.a & 65535, ((q8k) obj).a & 65535);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof q8k) {
            return this.a == ((q8k) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Short.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & 65535);
    }
}
