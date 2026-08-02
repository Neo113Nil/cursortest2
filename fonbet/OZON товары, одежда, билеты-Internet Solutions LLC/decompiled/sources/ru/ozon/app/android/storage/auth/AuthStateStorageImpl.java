package ru.ozon.app.android.storage.auth;

import Nc.C3667a;
import OJ.a;
import OJ.b;
import Sc.InterfaceC4008j;
import Sc.k;
import android.content.Context;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.limb.OzonIdStorageDependencies;
import zb0.f;
import zb0.j;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\b2\u0006\u0010\u0003\u001a\u00020\u0002H\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0013\u0010\r\u001a\u00020\t*\u00020\fH\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0016¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\tH\u0016¢\u0006\u0004\b\u0011\u0010\u0012R!\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\t0\b8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0013\u0010\u0014\u001a\u0004\b\u0015\u0010\u0010R\u001b\u0010\u001b\u001a\u00020\u00178BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u0018\u0010\u0014\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/storage/auth/AuthStateStorageImpl;", "Lru/ozon/app/android/storage/auth/AuthStateStorage;", "Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;", "ozonIdCookieEvents", "Landroid/content/Context;", "context", "<init>", "(Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;Landroid/content/Context;)V", "LNc/a;", "", "createSubject", "(Lru/ozon/app/android/storage/auth/OzonIdCookieEvents;)LNc/a;", "Lzb0/f;", "toAuthState", "(Lzb0/f;)Z", "getAuthState", "()LNc/a;", "isAuthenticated", "()Z", "authStateSubject$delegate", "LSc/j;", "getAuthStateSubject", "authStateSubject", "Lru/ozon/app/android/limb/OzonIdStorageDependencies;", "ozonIdStorageDependencies$delegate", "getOzonIdStorageDependencies", "()Lru/ozon/app/android/limb/OzonIdStorageDependencies;", "ozonIdStorageDependencies", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AuthStateStorageImpl implements AuthStateStorage {

    /* renamed from: authStateSubject$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j authStateSubject;

    /* renamed from: ozonIdStorageDependencies$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j ozonIdStorageDependencies;

    public AuthStateStorageImpl(@NotNull OzonIdCookieEvents ozonIdCookieEvents, @NotNull Context context) {
        Intrinsics.checkNotNullParameter(ozonIdCookieEvents, "ozonIdCookieEvents");
        Intrinsics.checkNotNullParameter(context, "context");
        this.authStateSubject = k.b(new AuthStateStorageImpl$authStateSubject$2(this, ozonIdCookieEvents));
        this.ozonIdStorageDependencies = k.b(new AuthStateStorageImpl$ozonIdStorageDependencies$2(context));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final C3667a<Boolean> createSubject(OzonIdCookieEvents ozonIdCookieEvents) {
        C3667a<Boolean> d11 = C3667a.d();
        Intrinsics.checkNotNullExpressionValue(d11, "create(...)");
        ozonIdCookieEvents.getObservable().filter(new a(AuthStateStorageImpl$createSubject$1.INSTANCE, 0)).map(new b(new AuthStateStorageImpl$createSubject$2(this))).subscribe(d11);
        return d11;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final boolean createSubject$lambda$0(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return ((Boolean) function1.invoke(p02)).booleanValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean createSubject$lambda$1(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    private final C3667a<Boolean> getAuthStateSubject() {
        return (C3667a) this.authStateSubject.getValue();
    }

    private final OzonIdStorageDependencies getOzonIdStorageDependencies() {
        return (OzonIdStorageDependencies) this.ozonIdStorageDependencies.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean toAuthState(f fVar) {
        j b11 = fVar.a().b();
        return b11 != null && b11.b() > 0;
    }

    @Override // ru.ozon.app.android.storage.auth.AuthStateStorage
    public boolean isAuthenticated() {
        return getOzonIdStorageDependencies().getOzonIdAppApi().I();
    }

    @Override // ru.ozon.app.android.storage.auth.AuthStateStorage
    @NotNull
    public C3667a<Boolean> getAuthState() {
        return getAuthStateSubject();
    }
}
