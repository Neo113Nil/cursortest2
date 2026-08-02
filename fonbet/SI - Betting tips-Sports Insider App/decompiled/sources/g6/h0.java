package g6;

import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class h0 {

    /* renamed from: a, reason: collision with root package name */
    public final boolean f9847a;

    /* renamed from: b, reason: collision with root package name */
    public final String f9848b;

    public h0(String str, boolean z5) {
        this.f9848b = str;
        this.f9847a = z5;
    }

    public /* synthetic */ h0(boolean z5, String str) {
        this.f9847a = z5;
        this.f9848b = str;
    }

    public h0(androidx.appcompat.widget.y configuration) {
        Intrinsics.checkNotNullParameter(configuration, "configuration");
        this.f9848b = (String) configuration.f1009f;
        this.f9847a = ((tg.a) configuration.f1010g) != tg.a.f23931a;
    }
}
