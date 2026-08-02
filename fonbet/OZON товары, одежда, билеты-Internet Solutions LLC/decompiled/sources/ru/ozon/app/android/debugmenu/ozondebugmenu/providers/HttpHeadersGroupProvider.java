package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import GZ.g;
import U20.a;
import U20.b;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;
import ru.ozon.app.android.storage.debug.DebugToolsService;

@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 \r2\u00020\u0001:\u0001\rB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u000f\u0010\t\u001a\u00020\bH\u0016¢\u0006\u0004\b\t\u0010\nR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u000bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/HttpHeadersGroupProvider;", "Lr20/c;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "debugToolsService", "LGZ/g;", "ozonRouter", "<init>", "(Lru/ozon/app/android/storage/debug/DebugToolsService;LGZ/g;)V", "LU20/a;", "provide", "()LU20/a;", "Lru/ozon/app/android/storage/debug/DebugToolsService;", "LGZ/g;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class HttpHeadersGroupProvider extends AbstractC9166c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final DebugToolsService debugToolsService;

    @NotNull
    private final g ozonRouter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0006\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/HttpHeadersGroupProvider$Companion;", "", "<init>", "()V", "HTTP_HEADERS", "", "GROUP", "INTERNAL", "COMPOSER", "MESH", "AB_VARIANTS", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public HttpHeadersGroupProvider(@NotNull DebugToolsService debugToolsService, @NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(debugToolsService, "debugToolsService");
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.debugToolsService = debugToolsService;
        this.ozonRouter = ozonRouter;
    }

    @Override // r20.AbstractC9166c
    @NotNull
    public a provide() {
        String internalHeadersToken = this.debugToolsService.getInternalHeadersToken();
        if (internalHeadersToken == null) {
            internalHeadersToken = "";
        }
        b.g gVar = new b.g("httpHeadersInternal", internalHeadersToken, "X-o3-internal-headers-token", new HttpHeadersGroupProvider$provide$1(this));
        String meshValue = this.debugToolsService.getMeshValue();
        if (meshValue == null) {
            meshValue = "";
        }
        b.g gVar2 = new b.g("httpHeadersMesh", meshValue, "Mesh Service", new HttpHeadersGroupProvider$provide$2(this));
        String abVariant = this.debugToolsService.getAbVariant();
        return new a("httpHeadersGroup", "HTTP Заголовки", C7714v.b0(gVar, gVar2, new b.g("httpHeadersAbVariants", abVariant != null ? abVariant : "", "Ab Variants", new HttpHeadersGroupProvider$provide$3(this))));
    }
}
