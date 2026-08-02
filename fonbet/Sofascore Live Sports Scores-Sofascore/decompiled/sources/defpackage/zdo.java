package defpackage;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.Comparator;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class zdo implements Comparator {
    public static final zdo a;
    public static final /* synthetic */ zdo[] b;

    static {
        zdo zdoVar = new zdo("INSTANCE", 0);
        a = zdoVar;
        b = new zdo[]{zdoVar};
    }

    public static zdo[] values() {
        return (zdo[]) b.clone();
    }

    @Override // java.util.Comparator
    public final /* bridge */ /* synthetic */ int compare(Object obj, Object obj2) {
        byte[] bArr = (byte[]) obj;
        byte[] bArr2 = (byte[]) obj2;
        int min = Math.min(bArr.length, bArr2.length);
        for (int i = 0; i < min; i++) {
            int i2 = (bArr[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) - (bArr2[i] & AdConfig.NETWORK_LOAD_LIMIT_DISABLED);
            if (i2 != 0) {
                return i2;
            }
        }
        return bArr.length - bArr2.length;
    }

    @Override // java.lang.Enum
    public final String toString() {
        return "UnsignedBytes.lexicographicalComparator() (pure Java version)";
    }
}
