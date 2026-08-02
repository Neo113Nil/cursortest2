package ru.ozon.app.android.thirdpartylibs.config;

import Bc.j;
import Bc.o;
import Bc.p;
import Bc.r;
import Bc.u;
import Ej.b;
import Jl.C3398a;
import Ml.C3639a;
import android.content.Context;
import android.content.SharedPreferences;
import cM.C5783b;
import io.reactivex.C;
import io.reactivex.h;
import io.reactivex.y;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.Set;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.collections.M;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigServiceImpl;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrary;
import sc.C9653a;
import sc.C9656b;
import wc.C10489j;
import wc.C10492m;
import wc.C10497s;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\"\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0000\u0018\u00002\u00020\u0001B\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0015\u0010\n\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u001d\u0010\u000e\u001a\u00020\r2\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\t0\bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ\u001b\u0010\u0011\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\t0\b0\u0010H\u0002¢\u0006\u0004\b\u0011\u0010\u0012J!\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u0016*\u00020\u00132\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J\u001d\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u001a2\u0006\u0010\u0019\u001a\u00020\tH\u0016¢\u0006\u0004\b\u001c\u0010\u001dR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001eR\u001c\u0010 \u001a\n \u001f*\u0004\u0018\u00010\u00130\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigServiceImpl;", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigService;", "Landroid/content/Context;", "context", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigApi;", "thirdPartyLibrariesConfigApi", "<init>", "(Landroid/content/Context;Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigApi;)V", "", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrary;", "getAllowedLibrariesLocal", "()Ljava/util/List;", "libraries", "", "saveAllowedLibraries", "(Ljava/util/List;)V", "Lio/reactivex/y;", "getAllowedLibrariesRemote", "()Lio/reactivex/y;", "Landroid/content/SharedPreferences;", "", "key", "", "getStringSetOrEmpty", "(Landroid/content/SharedPreferences;Ljava/lang/String;)Ljava/util/Set;", "library", "Lio/reactivex/h;", "", "isLibraryAvailable", "(Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrary;)Lio/reactivex/h;", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigApi;", "kotlin.jvm.PlatformType", "sharedPreferences", "Landroid/content/SharedPreferences;", "third-party-libs-config_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class ThirdPartyLibrariesConfigServiceImpl implements ThirdPartyLibrariesConfigService {
    private final SharedPreferences sharedPreferences;

    @NotNull
    private final ThirdPartyLibrariesConfigApi thirdPartyLibrariesConfigApi;

    public ThirdPartyLibrariesConfigServiceImpl(@NotNull Context context, @NotNull ThirdPartyLibrariesConfigApi thirdPartyLibrariesConfigApi) {
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(thirdPartyLibrariesConfigApi, "thirdPartyLibrariesConfigApi");
        this.thirdPartyLibrariesConfigApi = thirdPartyLibrariesConfigApi;
        this.sharedPreferences = context.getSharedPreferences("THIRD_PARTY_LIBRARIES_CONFIG", 0);
    }

    private final List<ThirdPartyLibrary> getAllowedLibrariesLocal() {
        SharedPreferences sharedPreferences = this.sharedPreferences;
        Intrinsics.checkNotNullExpressionValue(sharedPreferences, "sharedPreferences");
        Set<String> stringSetOrEmpty = getStringSetOrEmpty(sharedPreferences, "ALLOWED_LIBRARIES");
        ThirdPartyLibrary.Companion companion = ThirdPartyLibrary.INSTANCE;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = stringSetOrEmpty.iterator();
        while (it.hasNext()) {
            ThirdPartyLibrary fromString = companion.fromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }

    private final y<List<ThirdPartyLibrary>> getAllowedLibrariesRemote() {
        y<ThirdPartyLibrariesConfigResponse> thirdPartyLibrariesConfig = this.thirdPartyLibrariesConfigApi.getThirdPartyLibrariesConfig();
        C3639a c3639a = new C3639a(ThirdPartyLibrariesConfigServiceImpl$getAllowedLibrariesRemote$1.INSTANCE);
        thirdPartyLibrariesConfig.getClass();
        r rVar = new r(thirdPartyLibrariesConfig, c3639a);
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        return rVar;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List getAllowedLibrariesRemote$lambda$5(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (List) function1.invoke(p02);
    }

    private final Set<String> getStringSetOrEmpty(SharedPreferences sharedPreferences, String str) {
        M m11 = M.f71699a;
        Set<String> stringSet = sharedPreferences.getStringSet(str, m11);
        return stringSet == null ? m11 : stringSet;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isLibraryAvailable$lambda$0(ThirdPartyLibrariesConfigServiceImpl thirdPartyLibrariesConfigServiceImpl, ThirdPartyLibrary thirdPartyLibrary) {
        return Boolean.valueOf(thirdPartyLibrariesConfigServiceImpl.getAllowedLibrariesLocal().contains(thirdPartyLibrary));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final List isLibraryAvailable$lambda$1(Throwable it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return K.f71697a;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isLibraryAvailable$lambda$3(Function1 function1, Object p02) {
        Intrinsics.checkNotNullParameter(p02, "p0");
        return (Boolean) function1.invoke(p02);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final void saveAllowedLibraries(List<? extends ThirdPartyLibrary> libraries) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        LinkedHashSet linkedHashSet = new LinkedHashSet();
        Iterator<T> it = libraries.iterator();
        while (it.hasNext()) {
            linkedHashSet.add(((ThirdPartyLibrary) it.next()).toString());
        }
        edit.putStringSet("ALLOWED_LIBRARIES", linkedHashSet).apply();
    }

    @Override // ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrariesConfigService
    @NotNull
    public h<Boolean> isLibraryAvailable(@NotNull final ThirdPartyLibrary library) {
        Intrinsics.checkNotNullParameter(library, "library");
        o oVar = new o(new Callable() { // from class: cM.a
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Boolean isLibraryAvailable$lambda$0;
                isLibraryAvailable$lambda$0 = ThirdPartyLibrariesConfigServiceImpl.isLibraryAvailable$lambda$0(ThirdPartyLibrariesConfigServiceImpl.this, library);
                return isLibraryAvailable$lambda$0;
            }
        });
        Intrinsics.checkNotNullExpressionValue(oVar, "fromCallable(...)");
        y<List<ThirdPartyLibrary>> allowedLibrariesRemote = getAllowedLibrariesRemote();
        b bVar = new b();
        allowedLibrariesRemote.getClass();
        r rVar = new r(new j(new u(allowedLibrariesRemote, bVar), new C5783b(new ThirdPartyLibrariesConfigServiceImpl$isLibraryAvailable$isAvailableRemote$2(this))), new C3398a(new ThirdPartyLibrariesConfigServiceImpl$isLibraryAvailable$isAvailableRemote$3(library)));
        Intrinsics.checkNotNullExpressionValue(rVar, "map(...)");
        int i11 = h.f66520b;
        C10497s c10497s = new C10497s(new C[]{oVar, rVar});
        C9656b.d(2, "prefetch");
        C10492m c10492m = new C10492m(new C10489j(c10497s, p.a(), Gc.h.IMMEDIATE), C9653a.i(), C9656b.b());
        Intrinsics.checkNotNullExpressionValue(c10492m, "distinctUntilChanged(...)");
        return c10492m;
    }
}
