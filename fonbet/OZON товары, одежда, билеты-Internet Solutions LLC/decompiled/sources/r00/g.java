package r00;

import android.net.Uri;
import j00.C7234a;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import p00.C8827c;

/* loaded from: classes7.dex */
public final class g implements InterfaceC9147a {
    @Override // r00.InterfaceC9147a
    public final void a(@NotNull Uri uri, @NotNull C7234a composerDebugMenuSDK) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(composerDebugMenuSDK, "composerDebugMenuSDK");
        C8827c c8827c = C8827c.f80007b;
        c8827c.getClass();
        boolean booleanQueryParameter = uri.getBooleanQueryParameter("enabled", false);
        composerDebugMenuSDK.Q(c8827c, booleanQueryParameter);
        C9149c.a(c8827c, Boolean.valueOf(booleanQueryParameter));
    }

    @Override // r00.InterfaceC9147a
    public final boolean b(@NotNull Ld0.c ozonLimbDiStore, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        if (ozonLimbDiStore.c().b() != Nd0.b.DEBUG) {
            return false;
        }
        return C9150d.a(uri, "parsingErrorsNotification");
    }
}
