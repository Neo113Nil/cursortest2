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

@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \n2\u00020\u0001:\u0001\nB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\t¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/ComposerGroupProvider;", "Lr20/c;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "LU20/a;", "provide", "()LU20/a;", "LGZ/g;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ComposerGroupProvider extends AbstractC9166c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final g ozonRouter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/ComposerGroupProvider$Companion;", "", "<init>", "()V", "COMPOSER", "", "GROUP", "DEBUG_WIDGET", "OLD_PERF_LOGGER", "PERF_LOGGER", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ComposerGroupProvider(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
    }

    @Override // r20.AbstractC9166c
    @NotNull
    public a provide() {
        return new a("composerGroup", "Composer", C7714v.a0(new b.c("composerDebugWidget", "Debug Widget Tools", null, new ComposerGroupProvider$provide$1(this))));
    }
}
