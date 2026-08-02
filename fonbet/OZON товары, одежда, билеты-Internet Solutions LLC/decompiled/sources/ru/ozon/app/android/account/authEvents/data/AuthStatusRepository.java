package ru.ozon.app.android.account.authEvents.data;

import Sc.r;
import Sc.s;
import Wc.a;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.authEvents.api.OzonIdUserStatusApi;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\f\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u001e\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0086@¢\u0006\u0004\b\n\u0010\u000bJ\u0016\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\r\u0010\u000eJ\u0016\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\u0010\u0010\u000eJ\u0016\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0086@¢\u0006\u0004\b\u0012\u0010\u000eR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/account/authEvents/data/AuthStatusRepository;", "", "Lru/ozon/app/android/account/authEvents/api/OzonIdUserStatusApi;", "api", "<init>", "(Lru/ozon/app/android/account/authEvents/api/OzonIdUserStatusApi;)V", "", "event", "LSc/r;", "", "syncAuthStatus-gIAlu-s", "(Ljava/lang/String;Lkotlin/coroutines/d;)Ljava/lang/Object;", "syncAuthStatus", "syncOnLogin-IoAF18A", "(Lkotlin/coroutines/d;)Ljava/lang/Object;", "syncOnLogin", "syncOnLogout-IoAF18A", "syncOnLogout", "syncOnSwitchUser-IoAF18A", "syncOnSwitchUser", "Lru/ozon/app/android/account/authEvents/api/OzonIdUserStatusApi;", "account_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AuthStatusRepository {

    @NotNull
    private final OzonIdUserStatusApi api;

    public AuthStatusRepository(@NotNull OzonIdUserStatusApi api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0021  */
    /* renamed from: syncAuthStatus-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m452syncAuthStatusgIAlus(@NotNull String str, @NotNull d<? super r<Unit>> dVar) {
        AuthStatusRepository$syncAuthStatus$1 authStatusRepository$syncAuthStatus$1;
        int i11;
        try {
            if (dVar instanceof AuthStatusRepository$syncAuthStatus$1) {
                authStatusRepository$syncAuthStatus$1 = (AuthStatusRepository$syncAuthStatus$1) dVar;
                int i12 = authStatusRepository$syncAuthStatus$1.label;
                if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    authStatusRepository$syncAuthStatus$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = authStatusRepository$syncAuthStatus$1.result;
                    a aVar = a.COROUTINE_SUSPENDED;
                    i11 = authStatusRepository$syncAuthStatus$1.label;
                    if (i11 != 0) {
                        s.b(obj);
                        r.Companion companion = r.INSTANCE;
                        OzonIdUserStatusApi ozonIdUserStatusApi = this.api;
                        authStatusRepository$syncAuthStatus$1.label = 1;
                        if (ozonIdUserStatusApi.fetchOzonIdUserStatus(str, authStatusRepository$syncAuthStatus$1) == aVar) {
                            return aVar;
                        }
                    } else {
                        if (i11 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        s.b(obj);
                    }
                    Unit unit = Unit.f71690a;
                    r.Companion companion2 = r.INSTANCE;
                    return unit;
                }
            }
            if (i11 != 0) {
            }
            Unit unit2 = Unit.f71690a;
            r.Companion companion22 = r.INSTANCE;
            return unit2;
        } catch (Throwable th2) {
            r.Companion companion3 = r.INSTANCE;
            return s.a(th2);
        }
        authStatusRepository$syncAuthStatus$1 = new AuthStatusRepository$syncAuthStatus$1(this, dVar);
        Object obj2 = authStatusRepository$syncAuthStatus$1.result;
        a aVar2 = a.COROUTINE_SUSPENDED;
        i11 = authStatusRepository$syncAuthStatus$1.label;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: syncOnLogin-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m453syncOnLoginIoAF18A(@NotNull d<? super r<Unit>> dVar) {
        AuthStatusRepository$syncOnLogin$1 authStatusRepository$syncOnLogin$1;
        int i11;
        if (dVar instanceof AuthStatusRepository$syncOnLogin$1) {
            authStatusRepository$syncOnLogin$1 = (AuthStatusRepository$syncOnLogin$1) dVar;
            int i12 = authStatusRepository$syncOnLogin$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                authStatusRepository$syncOnLogin$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = authStatusRepository$syncOnLogin$1.result;
                Object obj2 = a.COROUTINE_SUSPENDED;
                i11 = authStatusRepository$syncOnLogin$1.label;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((r) obj).getF26106a();
                }
                s.b(obj);
                authStatusRepository$syncOnLogin$1.label = 1;
                Object m452syncAuthStatusgIAlus = m452syncAuthStatusgIAlus("login", authStatusRepository$syncOnLogin$1);
                return m452syncAuthStatusgIAlus == obj2 ? obj2 : m452syncAuthStatusgIAlus;
            }
        }
        authStatusRepository$syncOnLogin$1 = new AuthStatusRepository$syncOnLogin$1(this, dVar);
        Object obj3 = authStatusRepository$syncOnLogin$1.result;
        Object obj22 = a.COROUTINE_SUSPENDED;
        i11 = authStatusRepository$syncOnLogin$1.label;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: syncOnLogout-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m454syncOnLogoutIoAF18A(@NotNull d<? super r<Unit>> dVar) {
        AuthStatusRepository$syncOnLogout$1 authStatusRepository$syncOnLogout$1;
        int i11;
        if (dVar instanceof AuthStatusRepository$syncOnLogout$1) {
            authStatusRepository$syncOnLogout$1 = (AuthStatusRepository$syncOnLogout$1) dVar;
            int i12 = authStatusRepository$syncOnLogout$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                authStatusRepository$syncOnLogout$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = authStatusRepository$syncOnLogout$1.result;
                Object obj2 = a.COROUTINE_SUSPENDED;
                i11 = authStatusRepository$syncOnLogout$1.label;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((r) obj).getF26106a();
                }
                s.b(obj);
                authStatusRepository$syncOnLogout$1.label = 1;
                Object m452syncAuthStatusgIAlus = m452syncAuthStatusgIAlus("logout", authStatusRepository$syncOnLogout$1);
                return m452syncAuthStatusgIAlus == obj2 ? obj2 : m452syncAuthStatusgIAlus;
            }
        }
        authStatusRepository$syncOnLogout$1 = new AuthStatusRepository$syncOnLogout$1(this, dVar);
        Object obj3 = authStatusRepository$syncOnLogout$1.result;
        Object obj22 = a.COROUTINE_SUSPENDED;
        i11 = authStatusRepository$syncOnLogout$1.label;
        if (i11 == 0) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /* renamed from: syncOnSwitchUser-IoAF18A, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object m455syncOnSwitchUserIoAF18A(@NotNull d<? super r<Unit>> dVar) {
        AuthStatusRepository$syncOnSwitchUser$1 authStatusRepository$syncOnSwitchUser$1;
        int i11;
        if (dVar instanceof AuthStatusRepository$syncOnSwitchUser$1) {
            authStatusRepository$syncOnSwitchUser$1 = (AuthStatusRepository$syncOnSwitchUser$1) dVar;
            int i12 = authStatusRepository$syncOnSwitchUser$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                authStatusRepository$syncOnSwitchUser$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = authStatusRepository$syncOnSwitchUser$1.result;
                Object obj2 = a.COROUTINE_SUSPENDED;
                i11 = authStatusRepository$syncOnSwitchUser$1.label;
                if (i11 == 0) {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                    return ((r) obj).getF26106a();
                }
                s.b(obj);
                authStatusRepository$syncOnSwitchUser$1.label = 1;
                Object m452syncAuthStatusgIAlus = m452syncAuthStatusgIAlus("switchUser", authStatusRepository$syncOnSwitchUser$1);
                return m452syncAuthStatusgIAlus == obj2 ? obj2 : m452syncAuthStatusgIAlus;
            }
        }
        authStatusRepository$syncOnSwitchUser$1 = new AuthStatusRepository$syncOnSwitchUser$1(this, dVar);
        Object obj3 = authStatusRepository$syncOnSwitchUser$1.result;
        Object obj22 = a.COROUTINE_SUSPENDED;
        i11 = authStatusRepository$syncOnSwitchUser$1.label;
        if (i11 == 0) {
        }
    }
}
