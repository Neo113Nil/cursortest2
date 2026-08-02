package defpackage;

import com.ironsource.mediationsdk.logger.IronSourceError;
import java.util.Arrays;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class zkc extends yq9 {
    public final int b;
    public final int c;
    public final int d;
    public final int[] e;
    public final int[] f;

    public zkc(int i, int i2, int[] iArr, int[] iArr2, int i3) {
        super("MLLT");
        this.b = i;
        this.c = i2;
        this.d = i3;
        this.e = iArr;
        this.f = iArr2;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || zkc.class != obj.getClass()) {
            return false;
        }
        zkc zkcVar = (zkc) obj;
        return this.b == zkcVar.b && this.c == zkcVar.c && this.d == zkcVar.d && Arrays.equals(this.e, zkcVar.e) && Arrays.equals(this.f, zkcVar.f);
    }

    public final int hashCode() {
        return Arrays.hashCode(this.f) + ((Arrays.hashCode(this.e) + ((((((IronSourceError.ERROR_NON_EXISTENT_INSTANCE + this.b) * 31) + this.c) * 31) + this.d) * 31)) * 31);
    }
}
