package ru.ozon.app.android.ui.session.routing;

import GZ.g;
import a00.C4911f;
import android.net.Uri;
import i10.h;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.ComposerExtKt;
import ru.ozon.app.android.composer.ComposerNavigator;
import ru.ozon.app.android.composer.universalscreen.view.ComposerScreenConfig;
import ru.ozon.app.android.network.serialize.JsonSerializer;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0002\b\u000e\u0018\u0000 !2\u00020\u0001:\u0001!B+\u0012\n\u0010\u0004\u001a\u00060\u0002j\u0002`\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t¢\u0006\u0004\b\u000b\u0010\fJ+\u0010\u0011\u001a\u00020\u000e2\u0012\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u00010\r2\u0006\u0010\u0010\u001a\u00020\u000eH\u0002¢\u0006\u0004\b\u0011\u0010\u0012J%\u0010\u0015\u001a\u00020\u00142\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u000e¢\u0006\u0004\b\u0015\u0010\u0016J-\u0010\u0018\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000e2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0001\u0018\u00010\r¢\u0006\u0004\b\u0018\u0010\u0019J\u0015\u0010\u001a\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u001a\u0010\u001bJ\u0015\u0010\u001c\u001a\u00020\u00142\u0006\u0010\u0010\u001a\u00020\u000e¢\u0006\u0004\b\u001c\u0010\u001bR\u0018\u0010\u0004\u001a\u00060\u0002j\u0002`\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u001dR\u0014\u0010\u0006\u001a\u00020\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001eR\u0014\u0010\b\u001a\u00020\u00078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u001fR\u0014\u0010\n\u001a\u00020\t8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\n\u0010 ¨\u0006\""}, d2 = {"Lru/ozon/app/android/ui/session/routing/AuthRouter;", "", "La00/f;", "Lru/ozon/app/android/composer/OwnerContainer;", "container", "Lru/ozon/app/android/composer/ComposerNavigator;", "navigator", "LGZ/g;", "ozonRouter", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "<init>", "(La00/f;Lru/ozon/app/android/composer/ComposerNavigator;LGZ/g;Lru/ozon/app/android/network/serialize/JsonSerializer;)V", "", "", "it", "deeplink", "appendPostParams", "(Ljava/util/Map;Ljava/lang/String;)Ljava/lang/String;", "message", "", "completeFlow", "(Ljava/lang/String;Ljava/lang/String;)V", "postData", "openFlowDeeplink", "(Ljava/lang/String;Ljava/util/Map;)V", "openExternalDeeplink", "(Ljava/lang/String;)V", "completeFlowAndOpenBottomsheet", "La00/f;", "Lru/ozon/app/android/composer/ComposerNavigator;", "LGZ/g;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Companion", "session_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class AuthRouter {

    @NotNull
    private final C4911f container;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private final ComposerNavigator navigator;

    @NotNull
    private final g ozonRouter;

    public AuthRouter(@NotNull C4911f container, @NotNull ComposerNavigator navigator, @NotNull g ozonRouter, @NotNull JsonSerializer jsonSerializer) {
        Intrinsics.checkNotNullParameter(container, "container");
        Intrinsics.checkNotNullParameter(navigator, "navigator");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        this.container = container;
        this.navigator = navigator;
        this.ozonRouter = ozonRouter;
        this.jsonSerializer = jsonSerializer;
    }

    private final String appendPostParams(Map<String, ? extends Object> it, String deeplink) {
        String uri = Uri.parse(deeplink).buildUpon().appendQueryParameter("_INTERNAL_POST_DATA_PARAM", this.jsonSerializer.toJson((JsonSerializer) new PostDataDTO(it), (Class<JsonSerializer>) PostDataDTO.class)).build().toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        return uri;
    }

    public static /* synthetic */ void completeFlow$default(AuthRouter authRouter, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        authRouter.completeFlow(str, str2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void openFlowDeeplink$default(AuthRouter authRouter, String str, Map map, int i11, Object obj) {
        if ((i11 & 2) != 0) {
            map = null;
        }
        authRouter.openFlowDeeplink(str, map);
    }

    public final void completeFlow(String deeplink, String message) {
        ComposerExtKt.setResult$default(this.container, null, 0, new AuthRouter$completeFlow$1(message), 3, null);
        ComposerExtKt.closeFlow(this.container);
        if (deeplink != null) {
            g.a.a(this.ozonRouter, deeplink, null, null, 6);
        }
    }

    public final void completeFlowAndOpenBottomsheet(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        ComposerNavigator.DefaultImpls.openBottomSheet$default(this.navigator, deeplink, new ComposerScreenConfig(new h.c.a(deeplink, (String) null, (String) null, 14), null, false, null, false, false, false, false, null, false, false, false, null, null, null, null, false, null, null, null, false, false, null, null, 16777150, null), Integer.valueOf(deeplink.hashCode()), null, null, 24, null);
    }

    public final void openExternalDeeplink(@NotNull String deeplink) {
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        g.a.a(this.ozonRouter, deeplink, null, null, 6);
    }

    public final void openFlowDeeplink(@NotNull String deeplink, Map<String, ? extends Object> postData) {
        String appendPostParams;
        Intrinsics.checkNotNullParameter(deeplink, "deeplink");
        if (postData != null && (appendPostParams = appendPostParams(postData, deeplink)) != null) {
            deeplink = appendPostParams;
        }
        ComposerNavigator.DefaultImpls.openDeeplink$default(this.navigator, deeplink, null, 2, null);
    }
}
