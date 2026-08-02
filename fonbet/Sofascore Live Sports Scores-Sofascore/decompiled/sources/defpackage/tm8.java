package defpackage;

import com.vungle.ads.internal.protos.Sdk;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@r5h
/* loaded from: classes.dex */
public final class tm8 {

    @NotNull
    public static final rm8 Companion = new rm8();
    public static final tm8 c = new tm8(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 480);
    public static final tm8 d = new tm8(480, Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE);
    public static final tm8 e = new tm8(Sdk.SDKError.Reason.WEBVIEW_ERROR_VALUE, 50);
    public static final tm8 f = new tm8(300, 250);
    public static final tm8 g = new tm8(300, 600);
    public static final tm8 h = new tm8(728, 90);
    public final int a;
    public final int b;

    public /* synthetic */ tm8(int i, int i2, int i3) {
        if (3 != (i & 3)) {
            oea.z(i, 3, om8.a.getDescriptor());
            throw null;
        }
        this.a = i2;
        this.b = i3;
    }

    public tm8(int i, int i2) {
        this.a = i;
        this.b = i2;
    }
}
