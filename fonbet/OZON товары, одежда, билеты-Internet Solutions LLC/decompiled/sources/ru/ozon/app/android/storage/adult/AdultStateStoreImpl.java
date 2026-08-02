package ru.ozon.app.android.storage.adult;

import android.content.SharedPreferences;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\u0018\u0000 \u00122\u00020\u0001:\u0001\u0012B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0018\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000bH\u0016J\b\u0010\f\u001a\u00020\u0007H\u0016J\n\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\n\u0010\u000f\u001a\u0004\u0018\u00010\u000eH\u0002J\u000f\u0010\u0010\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0011R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/storage/adult/AdultStateStoreImpl;", "Lru/ozon/app/android/storage/adult/AdultStateStore;", "adultPrefs", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "saveAdultState", "", "adultState", "", "expiredDateInMills", "", "clearAdultState", "getAdultSavedCookie", "Lru/ozon/app/android/storage/adult/AdultStateModel;", "readCookieModelFromPrefs", "getCookieExpireDate", "()Ljava/lang/Long;", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class AdultStateStoreImpl implements AdultStateStore {

    @NotNull
    private final SharedPreferences adultPrefs;

    public AdultStateStoreImpl(@NotNull SharedPreferences adultPrefs) {
        Intrinsics.checkNotNullParameter(adultPrefs, "adultPrefs");
        this.adultPrefs = adultPrefs;
    }

    private final Long getCookieExpireDate() {
        Long y02;
        String string = this.adultPrefs.getString("STORAGE_ADULT_STATE_EXPIRE_DATE_ID", null);
        if (string != null && (y02 = h.y0(string)) != null) {
            if (y02.longValue() > System.currentTimeMillis()) {
                return y02;
            }
            clearAdultState();
        }
        return null;
    }

    private final AdultStateModel readCookieModelFromPrefs() {
        String string = this.adultPrefs.getString("STORAGE_ADULT_STATE_ID", null);
        if (string != null) {
            boolean parseBoolean = Boolean.parseBoolean(string);
            Boolean valueOf = Boolean.valueOf(parseBoolean);
            if (!parseBoolean) {
                valueOf = null;
            }
            if (valueOf != null) {
                boolean booleanValue = valueOf.booleanValue();
                Long cookieExpireDate = getCookieExpireDate();
                if (cookieExpireDate != null) {
                    return new AdultStateModel("is_adult_confirmed", String.valueOf(booleanValue), cookieExpireDate.longValue());
                }
            }
        }
        return null;
    }

    @Override // ru.ozon.app.android.storage.adult.AdultStateStore
    public void clearAdultState() {
        this.adultPrefs.edit().remove("STORAGE_ADULT_STATE_ID").remove("STORAGE_ADULT_STATE_EXPIRE_DATE_ID").apply();
    }

    @Override // ru.ozon.app.android.storage.adult.AdultStateStore
    public AdultStateModel getAdultSavedCookie() {
        return readCookieModelFromPrefs();
    }

    @Override // ru.ozon.app.android.storage.adult.AdultStateStore
    public void saveAdultState(@NotNull String adultState, long expiredDateInMills) {
        Intrinsics.checkNotNullParameter(adultState, "adultState");
        this.adultPrefs.edit().putString("STORAGE_ADULT_STATE_ID", adultState).putString("STORAGE_ADULT_STATE_EXPIRE_DATE_ID", String.valueOf(expiredDateInMills)).apply();
    }
}
