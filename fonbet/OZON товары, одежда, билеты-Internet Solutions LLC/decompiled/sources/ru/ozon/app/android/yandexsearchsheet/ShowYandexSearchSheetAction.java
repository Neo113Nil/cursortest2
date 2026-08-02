package ru.ozon.app.android.yandexsearchsheet;

import B0.C2454a;
import W10.c;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetFragment;

@Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B!\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006¢\u0006\u0004\b\b\u0010\tJ0\u0010\n\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0006HÆ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u0010R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u001c¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;", "", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "searchSheetData", "", "requestCode", "LW10/c;", "trackingData", "<init>", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;ILW10/c;)V", "copy", "(Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;ILW10/c;)Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "getSearchSheetData", "()Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetFragment$Data;", "I", "getRequestCode", "LW10/c;", "getTrackingData", "()LW10/c;", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ShowYandexSearchSheetAction {
    private final int requestCode;

    @NotNull
    private final YandexSearchSheetFragment.Data searchSheetData;
    private final c trackingData;

    public ShowYandexSearchSheetAction(@NotNull YandexSearchSheetFragment.Data searchSheetData, int i11, c cVar) {
        Intrinsics.checkNotNullParameter(searchSheetData, "searchSheetData");
        this.searchSheetData = searchSheetData;
        this.requestCode = i11;
        this.trackingData = cVar;
    }

    public static /* synthetic */ ShowYandexSearchSheetAction copy$default(ShowYandexSearchSheetAction showYandexSearchSheetAction, YandexSearchSheetFragment.Data data, int i11, c cVar, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            data = showYandexSearchSheetAction.searchSheetData;
        }
        if ((i12 & 2) != 0) {
            i11 = showYandexSearchSheetAction.requestCode;
        }
        if ((i12 & 4) != 0) {
            cVar = showYandexSearchSheetAction.trackingData;
        }
        return showYandexSearchSheetAction.copy(data, i11, cVar);
    }

    @NotNull
    public final ShowYandexSearchSheetAction copy(@NotNull YandexSearchSheetFragment.Data searchSheetData, int requestCode, c trackingData) {
        Intrinsics.checkNotNullParameter(searchSheetData, "searchSheetData");
        return new ShowYandexSearchSheetAction(searchSheetData, requestCode, trackingData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ShowYandexSearchSheetAction)) {
            return false;
        }
        ShowYandexSearchSheetAction showYandexSearchSheetAction = (ShowYandexSearchSheetAction) other;
        return Intrinsics.d(this.searchSheetData, showYandexSearchSheetAction.searchSheetData) && this.requestCode == showYandexSearchSheetAction.requestCode && Intrinsics.d(this.trackingData, showYandexSearchSheetAction.trackingData);
    }

    public final int getRequestCode() {
        return this.requestCode;
    }

    @NotNull
    public final YandexSearchSheetFragment.Data getSearchSheetData() {
        return this.searchSheetData;
    }

    public final c getTrackingData() {
        return this.trackingData;
    }

    public int hashCode() {
        int a11 = C2454a.a(this.requestCode, this.searchSheetData.hashCode() * 31, 31);
        c cVar = this.trackingData;
        return a11 + (cVar == null ? 0 : cVar.hashCode());
    }

    @NotNull
    public String toString() {
        return "ShowYandexSearchSheetAction(searchSheetData=" + this.searchSheetData + ", requestCode=" + this.requestCode + ", trackingData=" + this.trackingData + ")";
    }
}
