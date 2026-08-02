package ru.ozon.app.android.update;

import android.app.Activity;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.update.rustore.RuStoreInAppUpdateRepository;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005J\n\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0016J\u0018\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\u0007H\u0016J\u0010\u0010\r\u001a\u00020\t2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0018\u0010\u0010\u001a\u00020\t2\u0006\u0010\u0011\u001a\u00020\u00122\u0006\u0010\u0013\u001a\u00020\u0012H\u0016¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/update/InAppUpdateRepositoryImpl;", "Lru/ozon/app/android/update/InAppUpdateRepository;", "next", "Lru/ozon/app/android/update/rustore/RuStoreInAppUpdateRepository;", "<init>", "(Lru/ozon/app/android/update/rustore/RuStoreInAppUpdateRepository;)V", "getUpdateState", "Lru/ozon/app/android/update/InAppUpdateInfo;", "startUpdate", "", "activity", "Landroid/app/Activity;", "info", "completeUpdate", "type", "Lru/ozon/app/android/update/InAppUpdateType;", "handleResult", "requestCode", "", "resultCode", "in-app-update_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class InAppUpdateRepositoryImpl extends InAppUpdateRepository {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public InAppUpdateRepositoryImpl(@NotNull RuStoreInAppUpdateRepository next) {
        super(next);
        Intrinsics.checkNotNullParameter(next, "next");
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void completeUpdate(@NotNull InAppUpdateType type) {
        Intrinsics.checkNotNullParameter(type, "type");
        InAppUpdateRepository next = getNext();
        if (next != null) {
            next.completeUpdate(type);
        }
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public InAppUpdateInfo getUpdateState() {
        InAppUpdateRepository next = getNext();
        if (next != null) {
            return next.getUpdateState();
        }
        return null;
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void handleResult(int requestCode, int resultCode) {
        InAppUpdateRepository next = getNext();
        if (next != null) {
            next.handleResult(requestCode, resultCode);
        }
    }

    @Override // ru.ozon.app.android.update.InAppUpdateRepository
    public void startUpdate(@NotNull Activity activity, @NotNull InAppUpdateInfo info) {
        Intrinsics.checkNotNullParameter(activity, "activity");
        Intrinsics.checkNotNullParameter(info, "info");
        InAppUpdateRepository next = getNext();
        if (next != null) {
            next.startUpdate(activity, info);
        }
    }
}
