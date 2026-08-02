package ru.ozon.app.android.fresh.navigation.tab;

import EZ.e;
import NZ.f;
import NZ.j;
import PZ.a;
import android.net.Uri;
import androidx.fragment.app.ComponentCallbacksC5392m;
import java.util.Collection;
import java.util.List;
import java.util.Set;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import sZ.c;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\n\u0018\u0000 \u001e2\u00020\u0001:\u0001\u001eB)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ!\u0010\u0010\u001a\u00020\u000f2\u0006\u0010\f\u001a\u00020\u000b2\b\u0010\u000e\u001a\u0004\u0018\u00010\rH\u0002¢\u0006\u0004\b\u0010\u0010\u0011J#\u0010\u0016\u001a\u00020\u00152\n\u0010\u0013\u001a\u0006\u0012\u0002\b\u00030\u00122\u0006\u0010\u0014\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u001f\u0010\u0019\u001a\u00020\u000b2\u0006\u0010\u0018\u001a\u00020\u00042\u0006\u0010\f\u001a\u00020\u000bH\u0014¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0006\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u001bR\u0016\u0010\u001c\u001a\u00020\u000f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001c\u0010\u001d¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/fresh/navigation/tab/FreshTabFragmentNavigator;", "LNZ/f;", "Landroidx/fragment/app/m;", "fragment", "", "containerId", "hostId", "LNZ/j;", "pathConfigOwner", "<init>", "(Landroidx/fragment/app/m;IILNZ/j;)V", "LpZ/f;", "destination", "Landroid/net/Uri;", "originLink", "", "shouldSkipNavigation", "(LpZ/f;Landroid/net/Uri;)Z", "LEZ/e;", "response", "requestCode", "", "navigate", "(LEZ/e;I)V", "tabId", "wrapDestination", "(ILpZ/f;)LpZ/f;", "I", "isFirstNavigation", "Z", "Companion", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class FreshTabFragmentNavigator extends f {

    @NotNull
    private static final Companion Companion = new Companion(null);
    private final int hostId;
    private boolean isFirstNavigation;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/fresh/navigation/tab/FreshTabFragmentNavigator$Companion;", "", "<init>", "()V", "FORCE_REFRESH_QUERY_PARAM", "", "navigation_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public FreshTabFragmentNavigator(@NotNull ComponentCallbacksC5392m fragment, int i11, int i12, j jVar) {
        super(fragment, i11, i12, jVar);
        Intrinsics.checkNotNullParameter(fragment, "fragment");
        this.hostId = i12;
        this.isFirstNavigation = true;
    }

    /* JADX WARN: Removed duplicated region for block: B:31:0x0071 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:33:? A[LOOP:0: B:19:0x003d->B:33:?, LOOP_END, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final boolean shouldSkipNavigation(pZ.f destination, Uri originLink) {
        boolean z11;
        boolean z12;
        Set<String> queryParameterNames;
        if (destination instanceof c) {
            if (!((originLink == null || (queryParameterNames = originLink.getQueryParameterNames()) == null) ? false : queryParameterNames.contains("force_refresh"))) {
                List<ComponentCallbacksC5392m> r02 = getFragmentManager().r0();
                Intrinsics.checkNotNullExpressionValue(r02, "getFragments(...)");
                List<ComponentCallbacksC5392m> list = r02;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    for (ComponentCallbacksC5392m componentCallbacksC5392m : list) {
                        if (componentCallbacksC5392m.isAdded()) {
                            String tag = componentCallbacksC5392m.getTag();
                            if (Intrinsics.d(tag != null ? a.b(tag, false) : null, a.b(((c) destination).getTag(), false))) {
                                z11 = true;
                                if (!z11) {
                                    z12 = true;
                                    break;
                                }
                            }
                        }
                        z11 = false;
                        if (!z11) {
                        }
                    }
                }
                z12 = false;
                if (this.isFirstNavigation && z12) {
                    return true;
                }
            }
        }
        return false;
    }

    @Override // NZ.f, EZ.g
    public void navigate(@NotNull e<?> response, int requestCode) {
        Intrinsics.checkNotNullParameter(response, "response");
        pZ.f b11 = response.b();
        GZ.j c11 = response.c();
        if (shouldSkipNavigation(b11, c11 != null ? c11.d() : null)) {
            return;
        }
        this.isFirstNavigation = false;
        super.navigate(response, requestCode);
    }

    @Override // NZ.f
    @NotNull
    protected pZ.f wrapDestination(int tabId, @NotNull pZ.f destination) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        return tabId != this.hostId ? new OZ.e(tabId, destination) : destination;
    }
}
