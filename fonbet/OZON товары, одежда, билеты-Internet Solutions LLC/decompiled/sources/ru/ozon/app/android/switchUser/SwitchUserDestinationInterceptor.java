package ru.ozon.app.android.switchUser;

import GZ.g;
import GZ.j;
import KZ.d;
import Ob0.a;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import android.content.Context;
import android.net.Uri;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.coroutines.g;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import od0.InterfaceC8695a;
import org.jetbrains.annotations.NotNull;
import pZ.C8882c;
import pZ.f;
import ru.ozon.app.android.account.authEvents.data.AuthStatusRepository;
import ru.ozon.app.android.account.user.UserManager;
import ru.ozon.app.android.navigation.interceptors.AuthDestinationInterceptor;
import ru.ozon.app.android.navigation.newrouter.destinations.flashbar.FlashbarData;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.uikit.R$string;
import ru.ozon.app.android.uikit.text.StringProvider;
import xe.C10727i;
import xe.M;

@Metadata(d1 = {"\u0000\u0088\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u0000 D2\u00020\u0001:\u0001DB\u0011\b\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0015\u0010\f\u001a\u0004\u0018\u00010\u000b*\u00020\bH\u0002¢\u0006\u0004\b\f\u0010\rJ\u0013\u0010\f\u001a\u00020\u000b*\u00020\u000eH\u0002¢\u0006\u0004\b\f\u0010\u000fJ\u001b\u0010\u0013\u001a\u00020\u0010*\u00020\u00102\u0006\u0010\u0012\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u0013\u0010\u0014J#\u0010\u001b\u001a\u00020\u001a2\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001b\u0010\u001cJ-\u0010\u001d\u001a\u0004\u0018\u00010\u00152\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0016\u001a\u00020\u00152\n\u0010\u0019\u001a\u00060\u0017j\u0002`\u0018H\u0016¢\u0006\u0004\b\u001d\u0010\u001eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001fR\u001b\u0010%\u001a\u00020 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b!\u0010\"\u001a\u0004\b#\u0010$R\u001b\u0010*\u001a\u00020&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\"\u001a\u0004\b(\u0010)R\u001b\u0010/\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\"\u001a\u0004\b-\u0010.R\u001b\u00104\u001a\u0002008BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b1\u0010\"\u001a\u0004\b2\u00103R\u001b\u00109\u001a\u0002058BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b6\u0010\"\u001a\u0004\b7\u00108R\u001b\u0010>\u001a\u00020:8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b;\u0010\"\u001a\u0004\b<\u0010=R\u001b\u0010C\u001a\u00020?8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b@\u0010\"\u001a\u0004\bA\u0010B¨\u0006E"}, d2 = {"Lru/ozon/app/android/switchUser/SwitchUserDestinationInterceptor;", "LKZ/d;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "", "targetUserId", "Lod0/a;", "blockingSwitchUser", "(J)Lod0/a;", "Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;", "toFlashbarData", "(Lod0/a;)Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;", "Lod0/a$c;", "(Lod0/a$c;)Lru/ozon/app/android/navigation/newrouter/destinations/flashbar/FlashbarData;", "Landroid/net/Uri;", "", "removeParamName", "removeParameter", "(Landroid/net/Uri;Ljava/lang/String;)Landroid/net/Uri;", "LpZ/f;", "destination", "LGZ/j;", "Lru/ozon/app/android/navigation/Route;", "route", "", "canIntercept", "(LpZ/f;LGZ/j;)Z", "intercept", "(Landroid/content/Context;LpZ/f;LGZ/j;)LpZ/f;", "Landroid/content/Context;", "LGZ/g;", "ozonRouter$delegate", "LSc/j;", "getOzonRouter", "()LGZ/g;", "ozonRouter", "Lru/ozon/app/android/account/user/UserManager;", "userManager$delegate", "getUserManager", "()Lru/ozon/app/android/account/user/UserManager;", "userManager", "Lru/ozon/app/android/account/authEvents/data/AuthStatusRepository;", "userStatusRepository$delegate", "getUserStatusRepository", "()Lru/ozon/app/android/account/authEvents/data/AuthStatusRepository;", "userStatusRepository", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage$delegate", "getAuthStateStorage", "()Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor$delegate", "getAuthDestinationInterceptor", "()Lru/ozon/app/android/navigation/interceptors/AuthDestinationInterceptor;", "authDestinationInterceptor", "LOb0/a;", "ozonIdAppApi$delegate", "getOzonIdAppApi", "()LOb0/a;", "ozonIdAppApi", "Lxe/M;", "coroutineScope$delegate", "getCoroutineScope", "()Lxe/M;", "coroutineScope", "Companion", "switch-user_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SwitchUserDestinationInterceptor implements d {

    @NotNull
    private static final Companion Companion = new Companion(null);

    /* renamed from: authDestinationInterceptor$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j authDestinationInterceptor;

    /* renamed from: authStateStorage$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j authStateStorage;

    @NotNull
    private final Context context;

    /* renamed from: coroutineScope$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j coroutineScope;

    /* renamed from: ozonIdAppApi$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonIdAppApi;

    /* renamed from: ozonRouter$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonRouter;

    /* renamed from: userManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userManager;

    /* renamed from: userStatusRepository$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userStatusRepository;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/switchUser/SwitchUserDestinationInterceptor$Companion;", "", "<init>", "()V", "TARGET_USER_ID_QUERY_PARAM_KEY", "", "switch-user_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public SwitchUserDestinationInterceptor(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.ozonRouter = k.b(new SwitchUserDestinationInterceptor$ozonRouter$2(this));
        this.userManager = k.b(new SwitchUserDestinationInterceptor$userManager$2(this));
        this.userStatusRepository = k.b(new SwitchUserDestinationInterceptor$userStatusRepository$2(this));
        this.authStateStorage = k.b(new SwitchUserDestinationInterceptor$authStateStorage$2(this));
        this.authDestinationInterceptor = k.b(new SwitchUserDestinationInterceptor$authDestinationInterceptor$2(this));
        this.ozonIdAppApi = k.b(new SwitchUserDestinationInterceptor$ozonIdAppApi$2(this));
        this.coroutineScope = k.b(SwitchUserDestinationInterceptor$coroutineScope$2.INSTANCE);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final InterfaceC8695a blockingSwitchUser(long targetUserId) {
        return (InterfaceC8695a) C10727i.d(g.f71771a, new SwitchUserDestinationInterceptor$blockingSwitchUser$1(this, targetUserId, null));
    }

    private final AuthDestinationInterceptor getAuthDestinationInterceptor() {
        return (AuthDestinationInterceptor) this.authDestinationInterceptor.getValue();
    }

    private final AuthStateStorage getAuthStateStorage() {
        return (AuthStateStorage) this.authStateStorage.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final M getCoroutineScope() {
        return (M) this.coroutineScope.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final a getOzonIdAppApi() {
        return (a) this.ozonIdAppApi.getValue();
    }

    private final GZ.g getOzonRouter() {
        return (GZ.g) this.ozonRouter.getValue();
    }

    private final UserManager getUserManager() {
        return (UserManager) this.userManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final AuthStatusRepository getUserStatusRepository() {
        return (AuthStatusRepository) this.userStatusRepository.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final f intercept$handle(SwitchUserDestinationInterceptor switchUserDestinationInterceptor, String str, j jVar) {
        g.a.a(switchUserDestinationInterceptor.getOzonRouter(), str, null, jVar.c(), 2);
        f.Companion.getClass();
        return f.b.a();
    }

    private final Uri removeParameter(Uri uri, String str) {
        Uri.Builder clearQuery = uri.buildUpon().clearQuery();
        for (String str2 : uri.getQueryParameterNames()) {
            if (!Intrinsics.d(str2, str)) {
                List<String> queryParameters = uri.getQueryParameters(str2);
                Intrinsics.checkNotNullExpressionValue(queryParameters, "getQueryParameters(...)");
                Iterator<T> it = queryParameters.iterator();
                while (it.hasNext()) {
                    clearQuery.appendQueryParameter(str2, (String) it.next());
                }
            }
        }
        Uri build = clearQuery.build();
        Intrinsics.checkNotNullExpressionValue(build, "build(...)");
        return build;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final FlashbarData toFlashbarData(InterfaceC8695a interfaceC8695a) {
        if (interfaceC8695a instanceof InterfaceC8695a.d) {
            InterfaceC8695a.c a11 = ((InterfaceC8695a.d) interfaceC8695a).a();
            if (a11 != null) {
                return toFlashbarData(a11);
            }
            return null;
        }
        if (!(interfaceC8695a instanceof InterfaceC8695a.b)) {
            if (interfaceC8695a instanceof InterfaceC8695a.C1321a) {
                return new FlashbarData(StringProvider.getString(R$string.error_common_error_technical_error_title), null, null, 6, null);
            }
            throw new o();
        }
        InterfaceC8695a.c a12 = ((InterfaceC8695a.b) interfaceC8695a).a();
        if (a12 != null) {
            return toFlashbarData(a12);
        }
        return null;
    }

    @Override // KZ.d
    public boolean canIntercept(@NotNull f destination, @NotNull j route) {
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(route, "route");
        return route.d().getQueryParameter("t_usr") != null;
    }

    @Override // KZ.b
    public f intercept(@NotNull Context context, @NotNull f destination, @NotNull j route) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(destination, "destination");
        Intrinsics.checkNotNullParameter(route, "route");
        String queryParameter = route.d().getQueryParameter("t_usr");
        Long y02 = queryParameter != null ? h.y0(queryParameter) : null;
        String uri = removeParameter(route.b(), "t_usr").toString();
        Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
        if (y02 == null) {
            return intercept$handle(this, uri, route);
        }
        return y02.longValue() == getUserManager().getUserId() ? intercept$handle(this, uri, route) : !getAuthStateStorage().isAuthenticated() ? AuthDestinationInterceptor.createAuthDestination$default(getAuthDestinationInterceptor(), context, null, route.b().toString(), uri, null, 18, null) : new C8882c(new SwitchUserDestinationInterceptor$intercept$1(this, y02, uri, route, null));
    }

    private final FlashbarData toFlashbarData(InterfaceC8695a.c cVar) {
        return new FlashbarData(cVar.b(), cVar.c(), cVar.a());
    }
}
