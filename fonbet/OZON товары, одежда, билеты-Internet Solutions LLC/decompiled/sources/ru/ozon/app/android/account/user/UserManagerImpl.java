package ru.ozon.app.android.account.user;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import BT.c;
import De.C2862e;
import He.b;
import Ob0.a;
import Sc.InterfaceC4003e;
import Sc.InterfaceC4008j;
import Sc.k;
import Sc.o;
import Sc.r;
import Sc.s;
import io.reactivex.AbstractC7094b;
import io.reactivex.p;
import io.reactivex.y;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.C7719a;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.InterfaceC7732n;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.user.model.composer.GetUserRequest;
import ru.ozon.app.android.account.user.model.composer.patch.PatchUserModel;
import ru.ozon.app.android.account.user.model.composer.patch.PatchUserProfileResponse;
import ru.ozon.app.android.logger.BxLogger;
import ru.ozon.app.android.storage.auth.AuthStateStorage;
import ru.ozon.app.android.storage.auth.OzonIdCookieEvents;
import ru.ozon.app.android.storage.user.UserStatusStorage;
import ru.ozon.app.android.storage.user.model.User;
import uc.g;
import xe.C10720e0;
import xe.C10727i;
import xe.M;
import xe.N;
import zb0.f;

@Metadata(d1 = {"\u0000z\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\b\u0000\u0018\u0000 H2\u00020\u0001:\u0001HB9\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u0006\u0010\r\u001a\u00020\f¢\u0006\u0004\b\u000e\u0010\u000fJ\u0015\u0010\u0012\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J3\u0010\u0018\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 \u0017*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00150\u0010*\b\u0012\u0004\u0012\u00020\u00140\u0010H\u0002¢\u0006\u0004\b\u0018\u0010\u0019JA\u0010\u001b\u001a\u001c\u0012\u0018\u0012\u0016\u0012\u0004\u0012\u00020\u0016 \u0017*\n\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00150\u00150\u0010*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00102\u0006\u0010\u001a\u001a\u00020\u0011H\u0002¢\u0006\u0004\b\u001b\u0010\u001cJ\u0017\u0010\u001f\u001a\u00020\u00162\u0006\u0010\u001e\u001a\u00020\u001dH\u0002¢\u0006\u0004\b\u001f\u0010 J\u000f\u0010!\u001a\u00020\u0016H\u0002¢\u0006\u0004\b!\u0010\"J\u000f\u0010#\u001a\u00020\u0016H\u0002¢\u0006\u0004\b#\u0010\"J\u000f\u0010%\u001a\u00020$H\u0016¢\u0006\u0004\b%\u0010&J\u0015\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00110'H\u0016¢\u0006\u0004\b(\u0010)J\u000f\u0010+\u001a\u00020*H\u0016¢\u0006\u0004\b+\u0010,J#\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00102\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b-\u0010.J#\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00160\u00150\u00102\u0006\u0010\u001a\u001a\u00020\u0011H\u0016¢\u0006\u0004\b/\u0010.J\u0015\u00100\u001a\b\u0012\u0004\u0012\u00020\u00110\u0010H\u0016¢\u0006\u0004\b0\u0010\u0013R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00101R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u00102R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u00103R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u00104R\u0014\u0010\u000b\u001a\u00020\n8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u000b\u00105R\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u00106R\u0014\u00108\u001a\u0002078\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b8\u00109R!\u0010?\u001a\b\u0012\u0004\u0012\u00020$0:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b;\u0010<\u001a\u0004\b=\u0010>R!\u0010B\u001a\b\u0012\u0004\u0012\u00020$0:8VX\u0096\u0084\u0002¢\u0006\f\n\u0004\b@\u0010<\u001a\u0004\bA\u0010>R\u001d\u0010G\u001a\u0004\u0018\u00010\u00118VX\u0096\u0084\u0002¢\u0006\f\u001a\u0004\bC\u0010D*\u0004\bE\u0010F¨\u0006I"}, d2 = {"Lru/ozon/app/android/account/user/UserManagerImpl;", "Lru/ozon/app/android/account/user/UserManager;", "Lru/ozon/app/android/account/user/NetworkUserDataStore;", "networkDataStore", "Lru/ozon/app/android/account/user/UserLocalDataStore;", "userLocalDataStore", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "authStateStorage", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "userStatusStorage", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "cookieEvents", "LOb0/a;", "ozonIdAppApi", "<init>", "(Lru/ozon/app/android/account/user/NetworkUserDataStore;Lru/ozon/app/android/account/user/UserLocalDataStore;Lru/ozon/app/android/storage/auth/AuthStateStorage;Lru/ozon/app/android/storage/user/UserStatusStorage;Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;LOb0/a;)V", "Lio/reactivex/y;", "Lru/ozon/app/android/storage/user/model/User;", "requestUserInfo", "()Lio/reactivex/y;", "Lru/ozon/app/android/account/user/model/composer/patch/PatchUserProfileResponse;", "LSc/r;", "", "kotlin.jvm.PlatformType", "mapToResult", "(Lio/reactivex/y;)Lio/reactivex/y;", "userValue", "doOnSuccess", "(Lio/reactivex/y;Lru/ozon/app/android/storage/user/model/User;)Lio/reactivex/y;", "Lzb0/f;", "event", "onCookieEvent", "(Lzb0/f;)V", "fetchUserBlocking", "()V", "restoreAnonymousUser", "", "getUserId", "()J", "Lio/reactivex/p;", "observeUser", "()Lio/reactivex/p;", "Lio/reactivex/b;", "fetchUser", "()Lio/reactivex/b;", "updateUserBirthday", "(Lru/ozon/app/android/storage/user/model/User;)Lio/reactivex/y;", "updateUserSex", "updateProfileInfo", "Lru/ozon/app/android/account/user/NetworkUserDataStore;", "Lru/ozon/app/android/account/user/UserLocalDataStore;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/storage/user/UserStatusStorage;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "LOb0/a;", "Lxe/M;", "coroutineScope", "Lxe/M;", "LAe/h;", "userIdFlow$delegate", "LSc/j;", "getUserIdFlow", "()LAe/h;", "userIdFlow", "userIdChangedFlow$delegate", "getUserIdChangedFlow", "userIdChangedFlow", "getUser", "()Lru/ozon/app/android/storage/user/model/User;", "getUser$delegate", "(Lru/ozon/app/android/account/user/UserManagerImpl;)Ljava/lang/Object;", "user", "Companion", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class UserManagerImpl implements UserManager {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final AuthStateStorage authStateStorage;

    @NotNull
    private final OzonIdCookieEvents cookieEvents;

    @NotNull
    private final M coroutineScope;

    @NotNull
    private final NetworkUserDataStore networkDataStore;

    @NotNull
    private final a ozonIdAppApi;

    /* renamed from: userIdChangedFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userIdChangedFlow;

    /* renamed from: userIdFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j userIdFlow;

    @NotNull
    private final UserLocalDataStore userLocalDataStore;

    @NotNull
    private final UserStatusStorage userStatusStorage;

    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lxe/M;", "", "<anonymous>", "(Lxe/M;)V"}, k = 3, mv = {2, 0, 0})
    @e(c = "ru.ozon.app.android.account.user.UserManagerImpl$1", f = "UserManagerImpl.kt", l = {72}, m = "invokeSuspend")
    /* renamed from: ru.ozon.app.android.account.user.UserManagerImpl$1, reason: invalid class name */
    static final class AnonymousClass1 extends j implements Function2<M, d<? super Unit>, Object> {
        int label;

        @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
        /* renamed from: ru.ozon.app.android.account.user.UserManagerImpl$1$1, reason: invalid class name and collision with other inner class name */
        /* synthetic */ class C17311 implements InterfaceC2397i, InterfaceC7732n {
            final /* synthetic */ UserManagerImpl $tmp0;

            C17311(UserManagerImpl userManagerImpl) {
                this.$tmp0 = userManagerImpl;
            }

            @Override // Ae.InterfaceC2397i
            public /* bridge */ /* synthetic */ Object emit(Object obj, d dVar) {
                return emit((f) obj, (d<? super Unit>) dVar);
            }

            public final boolean equals(Object obj) {
                if ((obj instanceof InterfaceC2397i) && (obj instanceof InterfaceC7732n)) {
                    return Intrinsics.d(getFunctionDelegate(), ((InterfaceC7732n) obj).getFunctionDelegate());
                }
                return false;
            }

            @Override // kotlin.jvm.internal.InterfaceC7732n
            public final InterfaceC4003e<?> getFunctionDelegate() {
                return new C7719a(2, this.$tmp0, UserManagerImpl.class, "onCookieEvent", "onCookieEvent(Lru/ozon/id/api/clientCookies/OzonIdCookieEvent;)V", 4);
            }

            public final int hashCode() {
                return getFunctionDelegate().hashCode();
            }

            public final Object emit(f fVar, d<? super Unit> dVar) {
                Object invokeSuspend$onCookieEvent = AnonymousClass1.invokeSuspend$onCookieEvent(this.$tmp0, fVar, dVar);
                return invokeSuspend$onCookieEvent == Wc.a.COROUTINE_SUSPENDED ? invokeSuspend$onCookieEvent : Unit.f71690a;
            }
        }

        AnonymousClass1(d<? super AnonymousClass1> dVar) {
            super(2, dVar);
        }

        /* JADX INFO: Access modifiers changed from: private */
        public static final /* synthetic */ Object invokeSuspend$onCookieEvent(UserManagerImpl userManagerImpl, f fVar, d dVar) {
            userManagerImpl.onCookieEvent(fVar);
            return Unit.f71690a;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final d<Unit> create(Object obj, d<?> dVar) {
            return UserManagerImpl.this.new AnonymousClass1(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.label;
            if (i11 == 0) {
                s.b(obj);
                InterfaceC2395h<f> flow = UserManagerImpl.this.cookieEvents.getFlow();
                C17311 c17311 = new C17311(UserManagerImpl.this);
                this.label = 1;
                if (flow.collect(c17311, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            return Unit.f71690a;
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, d<? super Unit> dVar) {
            return ((AnonymousClass1) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/account/user/UserManagerImpl$Companion;", "", "<init>", "()V", "ANON_USER_ID", "", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    /* loaded from: classes11.dex */
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[f.b.values().length];
            try {
                iArr[f.b.Login.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[f.b.SwitchUser.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[f.b.Logout.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            try {
                iArr[f.b.TokenUpdate.ordinal()] = 4;
            } catch (NoSuchFieldError unused4) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public UserManagerImpl(@NotNull NetworkUserDataStore networkDataStore, @NotNull UserLocalDataStore userLocalDataStore, @NotNull AuthStateStorage authStateStorage, @NotNull UserStatusStorage userStatusStorage, @NotNull OzonIdCookieEvents cookieEvents, @NotNull a ozonIdAppApi) {
        Intrinsics.checkNotNullParameter(networkDataStore, "networkDataStore");
        Intrinsics.checkNotNullParameter(userLocalDataStore, "userLocalDataStore");
        Intrinsics.checkNotNullParameter(authStateStorage, "authStateStorage");
        Intrinsics.checkNotNullParameter(userStatusStorage, "userStatusStorage");
        Intrinsics.checkNotNullParameter(cookieEvents, "cookieEvents");
        Intrinsics.checkNotNullParameter(ozonIdAppApi, "ozonIdAppApi");
        this.networkDataStore = networkDataStore;
        this.userLocalDataStore = userLocalDataStore;
        this.authStateStorage = authStateStorage;
        this.userStatusStorage = userStatusStorage;
        this.cookieEvents = cookieEvents;
        this.ozonIdAppApi = ozonIdAppApi;
        C10720e0 c10720e0 = C10720e0.f105451a;
        C2862e a11 = N.a(b.f10879b);
        this.coroutineScope = a11;
        this.userIdFlow = k.b(new UserManagerImpl$userIdFlow$2(this));
        this.userIdChangedFlow = k.b(new UserManagerImpl$userIdChangedFlow$2(this));
        C10727i.c(a11, null, null, new AnonymousClass1(null), 3);
    }

    private final y<r<Unit>> doOnSuccess(y<r<Unit>> yVar, User user) {
        c cVar = new c(new UserManagerImpl$doOnSuccess$1(this, user), 6);
        yVar.getClass();
        Bc.j jVar = new Bc.j(yVar, cVar);
        Intrinsics.checkNotNullExpressionValue(jVar, "doOnSuccess(...)");
        return jVar;
    }

    private final void fetchUserBlocking() {
        try {
            y<User> updateProfileInfo = updateProfileInfo();
            updateProfileInfo.getClass();
            vc.j jVar = new vc.j(updateProfileInfo);
            g gVar = new g();
            jVar.a(gVar);
            gVar.a();
        } catch (Exception e11) {
            BxLogger.INSTANCE.logException(new IllegalStateException("Auth user loading fail", e11));
        }
    }

    private final y<r<Unit>> mapToResult(y<PatchUserProfileResponse> yVar) {
        BT.b bVar = new BT.b(UserManagerImpl$mapToResult$1.INSTANCE, 11);
        yVar.getClass();
        Bc.r rVar = new Bc.r(yVar, bVar);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final r mapToResult$lambda$2(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (r) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void onCookieEvent(f event) {
        int i11 = WhenMappings.$EnumSwitchMapping$0[event.a().a().ordinal()];
        if (i11 == 1 || i11 == 2) {
            fetchUserBlocking();
        } else if (i11 == 3) {
            restoreAnonymousUser();
        } else if (i11 != 4) {
            throw new o();
        }
    }

    private final y<User> requestUserInfo() {
        return this.networkDataStore.getUserInfoV2(new GetUserRequest(true, true, false, true, false, 20, null));
    }

    private final void restoreAnonymousUser() {
        this.userLocalDataStore.saveUser(new User(0L, null, null, null, 0, null, null, null, 255, null));
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    @NotNull
    public AbstractC7094b fetchUser() {
        y<User> j11;
        if (this.authStateStorage.isAuthenticated()) {
            j11 = requestUserInfo();
        } else {
            j11 = y.f(new User(0L, null, null, null, 0, null, null, null, 255, null)).j(Mc.a.b());
        }
        hC.c cVar = new hC.c(new UserManagerImpl$fetchUser$1(this.userLocalDataStore));
        j11.getClass();
        vc.j jVar = new vc.j(new Bc.j(j11, cVar));
        Intrinsics.checkNotNullExpressionValue(jVar, "ignoreElement(...)");
        return jVar;
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    public User getUser() {
        return this.userLocalDataStore.getUser();
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    public long getUserId() {
        return this.ozonIdAppApi.getUserId();
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    @NotNull
    public InterfaceC2395h<Long> getUserIdChangedFlow() {
        return (InterfaceC2395h) this.userIdChangedFlow.getValue();
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    @NotNull
    public InterfaceC2395h<Long> getUserIdFlow() {
        return (InterfaceC2395h) this.userIdFlow.getValue();
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    @NotNull
    public p<User> observeUser() {
        return this.userLocalDataStore.observeUser();
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    @NotNull
    public y<User> updateProfileInfo() {
        y<User> requestUserInfo = requestUserInfo();
        Lz.d dVar = new Lz.d(new UserManagerImpl$updateProfileInfo$1(this.userLocalDataStore), 8);
        requestUserInfo.getClass();
        Bc.j jVar = new Bc.j(requestUserInfo, dVar);
        Intrinsics.checkNotNullExpressionValue(jVar, "doOnSuccess(...)");
        return jVar;
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    @NotNull
    public y<r<Unit>> updateUserBirthday(@NotNull User userValue) {
        Intrinsics.checkNotNullParameter(userValue, "userValue");
        return doOnSuccess(mapToResult(this.networkDataStore.patchUserInfo(new PatchUserModel(null, null, null, userValue.getDateOfBirth(), 7, null))), userValue);
    }

    @Override // ru.ozon.app.android.account.user.UserManager
    @NotNull
    public y<r<Unit>> updateUserSex(@NotNull User userValue) {
        Intrinsics.checkNotNullParameter(userValue, "userValue");
        return doOnSuccess(mapToResult(this.networkDataStore.patchUserInfo(new PatchUserModel(null, null, Integer.valueOf(userValue.getSex()), null, 11, null))), userValue);
    }
}
