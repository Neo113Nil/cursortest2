package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class p7k implements Comparable {

    @NotNull
    public static final o7k b = new o7k(null);
    public final byte a;

    public /* synthetic */ p7k(byte b2) {
        this.a = b2;
    }

    @Override // java.lang.Comparable
    public final /* synthetic */ int compareTo(Object obj) {
        return Intrinsics.d(this.a & AdConfig.NETWORK_LOAD_LIMIT_DISABLED, ((p7k) obj).a & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }

    public final boolean equals(Object obj) {
        if (obj instanceof p7k) {
            return this.a == ((p7k) obj).a;
        }
        return false;
    }

    public final int hashCode() {
        return Byte.hashCode(this.a);
    }

    public final String toString() {
        return String.valueOf(this.a & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
    }
}
