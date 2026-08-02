package defpackage;

import com.unity3d.services.UnityAdsConstants;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class mz0 {

    @NotNull
    public static final lz0 Companion = new lz0();
    public static final joa[] i = {null, null, ypa.a(ysa.b, mz.C), null, null, null, null, null};
    public int a;
    public int b;
    public tm8[] c;
    public float d;
    public byte[] e;
    public byte f;
    public byte[] g;
    public Byte h;

    public mz0(int i2, int i3, byte b, byte[] bArr, Byte b2, int i4) {
        b = (i4 & 32) != 0 ? (byte) 0 : b;
        b2 = (i4 & 128) != 0 ? null : b2;
        this.a = i2;
        this.b = i3;
        this.c = null;
        this.d = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        this.e = null;
        this.f = b;
        this.g = bArr;
        this.h = b2;
    }
}
