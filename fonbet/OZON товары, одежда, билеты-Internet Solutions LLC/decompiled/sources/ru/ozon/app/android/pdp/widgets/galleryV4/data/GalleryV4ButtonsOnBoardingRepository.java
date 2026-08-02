package ru.ozon.app.android.pdp.widgets.galleryV4.data;

import android.content.SharedPreferences;
import java.util.concurrent.TimeUnit;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\t\n\u0002\b\u0002\b\u0007\u0018\u0000 \u00112\u00020\u0001:\u0001\u0011B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u000e\u0010\u0006\u001a\u00020\u00072\u0006\u0010\b\u001a\u00020\tJ\u0016\u0010\n\u001a\u00020\u000b2\u0006\u0010\b\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\rJ\u0018\u0010\u000e\u001a\u00020\u000b2\u0006\u0010\u000f\u001a\u00020\u00102\u0006\u0010\f\u001a\u00020\rH\u0002R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/pdp/widgets/galleryV4/data/GalleryV4ButtonsOnBoardingRepository;", "", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "saveShowData", "", "id", "", "canShown", "", "thresholdDays", "", "isMoreThanDays", "lastShowDate", "", "Companion", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class GalleryV4ButtonsOnBoardingRepository {

    @NotNull
    private final SharedPreferences sharedPreferences;
    public static final int $stable = 8;

    public GalleryV4ButtonsOnBoardingRepository(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    private final boolean isMoreThanDays(long lastShowDate, int thresholdDays) {
        if (lastShowDate == 0) {
            return true;
        }
        return TimeUnit.MILLISECONDS.toDays(System.currentTimeMillis() - lastShowDate) >= ((long) thresholdDays);
    }

    public final boolean canShown(@NotNull String id2, int thresholdDays) {
        Intrinsics.checkNotNullParameter(id2, "id");
        if (thresholdDays == 0) {
            return true;
        }
        return isMoreThanDays(this.sharedPreferences.getLong("galleryV4ButtonsOnBoardingLastShowDate_" + id2, 0L), thresholdDays);
    }

    public final void saveShowData(@NotNull String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        long currentTimeMillis = System.currentTimeMillis();
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putLong("galleryV4ButtonsOnBoardingLastShowDate_" + id2, currentTimeMillis);
        edit.apply();
    }
}
