package ru.ozon.app.android.update.rustore;

import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.update.InAppUpdateInfo;
import ru.rustore.sdk.appupdate.model.AppUpdateInfo;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/update/rustore/RuStoreInAppUpdateInfo;", "Lru/ozon/app/android/update/InAppUpdateInfo;", "Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "info", "<init>", "(Lru/rustore/sdk/appupdate/model/AppUpdateInfo;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "getInfo", "()Lru/rustore/sdk/appupdate/model/AppUpdateInfo;", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class RuStoreInAppUpdateInfo implements InAppUpdateInfo {

    @NotNull
    private final AppUpdateInfo info;

    public RuStoreInAppUpdateInfo(@NotNull AppUpdateInfo info) {
        Intrinsics.checkNotNullParameter(info, "info");
        this.info = info;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof RuStoreInAppUpdateInfo) && Intrinsics.d(this.info, ((RuStoreInAppUpdateInfo) other).info);
    }

    @NotNull
    public final AppUpdateInfo getInfo() {
        return this.info;
    }

    public int hashCode() {
        return this.info.hashCode();
    }

    @NotNull
    public String toString() {
        return "RuStoreInAppUpdateInfo(info=" + this.info + ")";
    }
}
