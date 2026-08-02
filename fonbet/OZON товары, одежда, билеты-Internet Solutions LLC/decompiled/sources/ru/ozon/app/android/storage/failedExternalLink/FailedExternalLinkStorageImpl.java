package ru.ozon.app.android.storage.failedExternalLink;

import android.content.SharedPreferences;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0003\b\u0000\u0018\u0000 \u000f2\u00020\u0001:\u0001\u000fB\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\u0012\u0010\u0006\u001a\u00020\u00072\b\u0010\b\u001a\u0004\u0018\u00010\tH\u0016J\n\u0010\n\u001a\u0004\u0018\u00010\tH\u0016J\u0010\u0010\u000b\u001a\u00020\u00072\u0006\u0010\f\u001a\u00020\rH\u0016J\b\u0010\u000e\u001a\u00020\rH\u0016R\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storage/failedExternalLink/FailedExternalLinkStorageImpl;", "Lru/ozon/app/android/storage/failedExternalLink/FailedExternalLinkStorage;", "sharedPreferences", "Landroid/content/SharedPreferences;", "<init>", "(Landroid/content/SharedPreferences;)V", "setLink", "", ImagesContract.URL, "", "getLink", "setLinkSavedTime", "timeMillis", "", "getLinkSavedTime", "Companion", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class FailedExternalLinkStorageImpl implements FailedExternalLinkStorage {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @NotNull
    private final SharedPreferences sharedPreferences;

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/storage/failedExternalLink/FailedExternalLinkStorageImpl$Companion;", "", "<init>", "()V", "LINK_KEY", "", "LINK_SAVED_TIME_KEY", "storage_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public FailedExternalLinkStorageImpl(@NotNull SharedPreferences sharedPreferences) {
        Intrinsics.checkNotNullParameter(sharedPreferences, "sharedPreferences");
        this.sharedPreferences = sharedPreferences;
    }

    @Override // ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorage
    public String getLink() {
        return this.sharedPreferences.getString("LAST_PAGE_KEY", null);
    }

    @Override // ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorage
    public long getLinkSavedTime() {
        return this.sharedPreferences.getLong("LAST_PAGE_TIME_KEY", 0L);
    }

    @Override // ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorage
    public void setLink(String url) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putString("LAST_PAGE_KEY", url);
        edit.apply();
    }

    @Override // ru.ozon.app.android.storage.failedExternalLink.FailedExternalLinkStorage
    public void setLinkSavedTime(long timeMillis) {
        SharedPreferences.Editor edit = this.sharedPreferences.edit();
        edit.putLong("LAST_PAGE_TIME_KEY", timeMillis);
        edit.apply();
    }
}
