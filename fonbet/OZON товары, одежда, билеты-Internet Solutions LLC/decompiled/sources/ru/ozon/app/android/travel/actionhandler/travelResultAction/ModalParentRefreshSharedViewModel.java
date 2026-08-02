package ru.ozon.app.android.travel.actionhandler.travelResultAction;

import V.e;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import com.google.android.gms.common.internal.ImagesContract;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;

@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001:\u0001\u0010B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0006\u0010\u0007J%\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\f\u0010\rR\u001a\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u000e8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010\u000f¨\u0006\u0011"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel$RefreshModel;", "refreshUrlLiveData", "()Landroidx/lifecycle/P;", "", ImagesContract.URL, "origin", "", "sendRefresh", "(Ljava/lang/String;Ljava/lang/String;)V", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "RefreshModel", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ModalParentRefreshSharedViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<RefreshModel> refreshUrlLiveData = new SingleLiveEvent<>();

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0086\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\u0007\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/actionhandler/travelResultAction/ModalParentRefreshSharedViewModel$RefreshModel;", "", "", "refreshUrl", "originUrl", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRefreshUrl", "getOriginUrl", "actionhandler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class RefreshModel {
        private final String originUrl;
        private final String refreshUrl;

        public RefreshModel(String str, String str2) {
            this.refreshUrl = str;
            this.originUrl = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof RefreshModel)) {
                return false;
            }
            RefreshModel refreshModel = (RefreshModel) other;
            return Intrinsics.d(this.refreshUrl, refreshModel.refreshUrl) && Intrinsics.d(this.originUrl, refreshModel.originUrl);
        }

        public final String getOriginUrl() {
            return this.originUrl;
        }

        public final String getRefreshUrl() {
            return this.refreshUrl;
        }

        public int hashCode() {
            String str = this.refreshUrl;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.originUrl;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("RefreshModel(refreshUrl=", this.refreshUrl, ", originUrl=", this.originUrl, ")");
        }
    }

    public static /* synthetic */ void sendRefresh$default(ModalParentRefreshSharedViewModel modalParentRefreshSharedViewModel, String str, String str2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = null;
        }
        if ((i11 & 2) != 0) {
            str2 = null;
        }
        modalParentRefreshSharedViewModel.sendRefresh(str, str2);
    }

    @NotNull
    public final P<RefreshModel> refreshUrlLiveData() {
        return this.refreshUrlLiveData;
    }

    public final void sendRefresh(String url, String origin) {
        this.refreshUrlLiveData.postValue(new RefreshModel(url, origin));
    }
}
