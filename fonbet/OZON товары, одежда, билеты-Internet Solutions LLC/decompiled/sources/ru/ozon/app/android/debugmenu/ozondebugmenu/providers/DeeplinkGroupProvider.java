package ru.ozon.app.android.debugmenu.ozondebugmenu.providers;

import GZ.g;
import U20.a;
import U20.b;
import android.net.Uri;
import java.util.Collection;
import java.util.Iterator;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.C7705l;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import r20.AbstractC9166c;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u000e2\u00020\u0001:\u0001\u000eB\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\b\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\b\u0010\tJ\u000f\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\u000b\u0010\fR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/DeeplinkGroupProvider;", "Lr20/c;", "LGZ/g;", "ozonRouter", "<init>", "(LGZ/g;)V", "", "deeplink", "modifyTechDeeplink", "(Ljava/lang/String;)Ljava/lang/String;", "LU20/a;", "provide", "()LU20/a;", "LGZ/g;", "Companion", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class DeeplinkGroupProvider extends AbstractC9166c {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final g ozonRouter;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0007\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0007\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\t\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\n\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u000b\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\f"}, d2 = {"Lru/ozon/app/android/debugmenu/ozondebugmenu/providers/DeeplinkGroupProvider$Companion;", "", "<init>", "()V", "DEEPLINK", "", "GROUP", "INPUT", "MAIN_OZON_TECH_SCHEME", "SELECT_TECH_DEEPLINK_SCHEME", "TRAVEL_TECH_DEEPLINK_SCHEME", "FRESH_TECH_DEEPLINK_SCHEME", "debugmenu_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public DeeplinkGroupProvider(@NotNull g ozonRouter) {
        Intrinsics.checkNotNullParameter(ozonRouter, "ozonRouter");
        this.ozonRouter = ozonRouter;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final String modifyTechDeeplink(String deeplink) {
        Uri parse = Uri.parse(deeplink);
        String[] elements = {"ozonselecttech", "ozontraveltech", "ozonfreshtech"};
        Intrinsics.checkNotNullParameter(elements, "elements");
        Set j02 = C7705l.j0(elements);
        if ((j02 instanceof Collection) && j02.isEmpty()) {
            return deeplink;
        }
        Iterator it = j02.iterator();
        while (it.hasNext()) {
            if (Intrinsics.d((String) it.next(), parse.getScheme())) {
                String uri = parse.buildUpon().scheme("ozontech").build().toString();
                Intrinsics.f(uri);
                return uri;
            }
        }
        return deeplink;
    }

    @Override // r20.AbstractC9166c
    @NotNull
    public a provide() {
        return new a("deeplinkGroup", "Deeplinks", C7714v.a0(new b.g("deeplinkInput", "", "Enter Deeplink URL", new DeeplinkGroupProvider$provide$1(this))));
    }
}
