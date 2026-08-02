package r00;

import android.content.Intent;
import android.net.Uri;
import j00.C7234a;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.abtool.AbToolBaseApi;
import ru.ozon.app.android.abtool.AbToolLibsApi;
import ru.ozon.composer.debug.menu.api.ui.ComposerDebugMenuActivity;

/* renamed from: r00.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9148b implements InterfaceC9147a {

    /* renamed from: a, reason: collision with root package name */
    private AbToolLibsApi f82655a;

    @Override // r00.InterfaceC9147a
    public final void a(@NotNull Uri uri, @NotNull C7234a composerDebugMenuSDK) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(composerDebugMenuSDK, "composerDebugMenuSDK");
        Intent intent = new Intent(composerDebugMenuSDK.N(), (Class<?>) ComposerDebugMenuActivity.class);
        intent.setData(uri);
        intent.addFlags(268435456);
        composerDebugMenuSDK.N().startActivity(intent);
    }

    @Override // r00.InterfaceC9147a
    public final boolean b(@NotNull Ld0.c ozonLimbDiStore, @NotNull Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        Intrinsics.checkNotNullParameter(ozonLimbDiStore, "ozonLimbDiStore");
        List<String> pathSegments = uri.getPathSegments();
        Intrinsics.checkNotNullExpressionValue(pathSegments, "getPathSegments(...)");
        if (Intrinsics.d(C7714v.M(pathSegments), "debugToken") && uri.getQueryParameter("token") != null) {
            if (this.f82655a == null) {
                Ld0.e d11 = ozonLimbDiStore.d(AbToolBaseApi.class);
                this.f82655a = d11 instanceof AbToolLibsApi ? (AbToolLibsApi) d11 : null;
            }
            if (ozonLimbDiStore.c().b() == Nd0.b.DEBUG) {
                return true;
            }
            AbToolLibsApi abToolLibsApi = this.f82655a;
            if (abToolLibsApi != null ? abToolLibsApi.isOzonEmployee() : false) {
                return true;
            }
            AbToolLibsApi abToolLibsApi2 = this.f82655a;
            if (abToolLibsApi2 != null ? abToolLibsApi2.isOzonQa() : false) {
                return true;
            }
        }
        return false;
    }
}
