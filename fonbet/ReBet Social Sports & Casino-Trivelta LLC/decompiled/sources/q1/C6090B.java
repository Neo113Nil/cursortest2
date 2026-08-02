package q1;

import android.os.Build;
import java.util.UUID;

/* renamed from: q1.B, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C6090B implements k1.b {

    /* renamed from: c, reason: collision with root package name */
    public static final boolean f63230c;

    /* renamed from: a, reason: collision with root package name */
    public final UUID f63231a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f63232b;
    public final byte[] sessionId;

    static {
        boolean z10;
        if ("Amazon".equals(Build.MANUFACTURER)) {
            String str = Build.MODEL;
            if ("AFTM".equals(str) || "AFTB".equals(str)) {
                z10 = true;
                f63230c = z10;
            }
        }
        z10 = false;
        f63230c = z10;
    }

    public C6090B(UUID uuid, byte[] bArr) {
        this(uuid, bArr, false);
    }

    public C6090B(UUID uuid, byte[] bArr, boolean z10) {
        this.f63231a = uuid;
        this.sessionId = bArr;
        this.f63232b = z10;
    }
}
