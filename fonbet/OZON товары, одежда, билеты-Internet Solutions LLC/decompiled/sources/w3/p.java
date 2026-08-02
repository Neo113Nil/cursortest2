package w3;

import android.os.Build;
import java.util.UUID;
import s3.InterfaceC9588b;

/* loaded from: classes8.dex */
public final class p implements InterfaceC9588b {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f103488c;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f103489a;

    /* renamed from: b, reason: collision with root package name */
    public final byte[] f103490b;

    static {
        boolean z11;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z11 = true;
                f103488c = z11;
            }
        }
        z11 = false;
        f103488c = z11;
    }

    public p(UUID uuid, byte[] bArr) {
        this.f103489a = uuid;
        this.f103490b = bArr;
    }
}
