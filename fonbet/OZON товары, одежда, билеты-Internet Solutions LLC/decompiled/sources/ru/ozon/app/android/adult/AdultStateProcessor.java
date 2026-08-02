package ru.ozon.app.android.adult;

import We.A;
import We.C4873o;
import com.google.android.gms.common.internal.ImagesContract;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storage.adult.AdultState;
import ru.ozon.app.android.storage.adult.AdultStateModel;
import ru.ozon.app.android.storage.adult.AdultStateStore;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\b\u0007\u0018\u0000 \u001d2\u00020\u0001:\u0001\u001dB\u0019\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0019\u0010\u000b\u001a\u00020\n2\b\u0010\t\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000b\u0010\fJ\u0019\u0010\u000e\u001a\u00020\n2\b\u0010\r\u001a\u0004\u0018\u00010\bH\u0002¢\u0006\u0004\b\u000e\u0010\fJ#\u0010\u0012\u001a\u0004\u0018\u00010\b*\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J)\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000f2\u0006\u0010\u0016\u001a\u00020\u0015¢\u0006\u0004\b\u0017\u0010\u0018J\u001b\u0010\u0019\u001a\u00020\n2\f\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\b0\u000f¢\u0006\u0004\b\u0019\u0010\u001aR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u001bR\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u001c¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/adult/AdultStateProcessor;", "", "Lru/ozon/app/android/storage/adult/AdultState;", "adultState", "Lru/ozon/app/android/storage/adult/AdultStateStore;", "adultStateStore", "<init>", "(Lru/ozon/app/android/storage/adult/AdultState;Lru/ozon/app/android/storage/adult/AdultStateStore;)V", "LWe/o;", "cookie", "", "computeAdult", "(LWe/o;)V", "adultCookie", "saveAdultStateFromResponse", "", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "getByName", "(Ljava/util/List;Ljava/lang/String;)LWe/o;", "cookies", "LWe/A;", ImagesContract.URL, "changeFromRequest", "(Ljava/util/List;LWe/A;)Ljava/util/List;", "changeFromResponse", "(Ljava/util/List;)V", "Lru/ozon/app/android/storage/adult/AdultState;", "Lru/ozon/app/android/storage/adult/AdultStateStore;", "Companion", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AdultStateProcessor {

    @NotNull
    private final AdultState adultState;

    @NotNull
    private final AdultStateStore adultStateStore;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/adult/AdultStateProcessor$Companion;", "", "<init>", "()V", "POSITIVE_ADULT_COOKIE_VALUE", "", "LOWEST_EXPIRE_VALUE", "", "main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public AdultStateProcessor(@NotNull AdultState adultState, @NotNull AdultStateStore adultStateStore) {
        Intrinsics.checkNotNullParameter(adultState, "adultState");
        Intrinsics.checkNotNullParameter(adultStateStore, "adultStateStore");
        this.adultState = adultState;
        this.adultStateStore = adultStateStore;
    }

    private final void computeAdult(C4873o cookie) {
        if (Intrinsics.d(cookie != null ? cookie.i() : null, "true")) {
            this.adultState.save();
        } else {
            this.adultState.clear();
        }
    }

    private final C4873o getByName(List<C4873o> list, String str) {
        Object obj;
        Iterator<T> it = list.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (Intrinsics.d(((C4873o) obj).f(), str)) {
                break;
            }
        }
        return (C4873o) obj;
    }

    private final void saveAdultStateFromResponse(C4873o adultCookie) {
        if (Intrinsics.d(adultCookie != null ? adultCookie.i() : null, "true")) {
            this.adultStateStore.saveAdultState(adultCookie.i(), adultCookie.g() ? adultCookie.e() : 1L);
        } else {
            this.adultStateStore.clearAdultState();
        }
    }

    @NotNull
    public final List<C4873o> changeFromRequest(@NotNull List<C4873o> cookies, @NotNull A url) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        Intrinsics.checkNotNullParameter(url, "url");
        C4873o byName = getByName(cookies, "is_adult_confirmed");
        boolean z11 = false;
        if (byName == null) {
            AdultStateModel adultSavedCookie = this.adultStateStore.getAdultSavedCookie();
            byName = adultSavedCookie != null ? MapperKt.mapToCookie(adultSavedCookie, url.h()) : null;
            if (byName != null) {
                z11 = true;
            }
        }
        computeAdult(byName);
        if (!z11 || byName == null) {
            return cookies;
        }
        ArrayList W02 = C7714v.W0(cookies);
        W02.add(byName);
        return W02;
    }

    public final void changeFromResponse(@NotNull List<C4873o> cookies) {
        Intrinsics.checkNotNullParameter(cookies, "cookies");
        C4873o byName = getByName(cookies, "is_adult_confirmed");
        if (byName == null) {
            return;
        }
        saveAdultStateFromResponse(byName);
        computeAdult(byName);
    }
}
