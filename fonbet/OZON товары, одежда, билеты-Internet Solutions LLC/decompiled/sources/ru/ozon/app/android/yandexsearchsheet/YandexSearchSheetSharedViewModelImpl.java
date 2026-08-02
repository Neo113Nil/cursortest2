package ru.ozon.app.android.yandexsearchsheet;

import Ae.E0;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004J\u0017\u0010\b\u001a\u00020\u00072\u0006\u0010\u0006\u001a\u00020\u0005H\u0016¢\u0006\u0004\b\b\u0010\tR \u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\n8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u000b\u0010\f\u001a\u0004\b\r\u0010\u000eR\"\u0010\u000f\u001a\u00020\u00078\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u000f\u0010\u0010\u001a\u0004\b\u000f\u0010\u0011\"\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModelImpl;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/yandexsearchsheet/YandexSearchSheetSharedViewModel;", "<init>", "()V", "Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;", "showYandexSearchSheetAction", "", "showYandexSearchSheet", "(Lru/ozon/app/android/yandexsearchsheet/ShowYandexSearchSheetAction;)Z", "LAe/w0;", "action", "LAe/w0;", "getAction", "()LAe/w0;", "isMapViewCreated", "Z", "()Z", "setMapViewCreated", "(Z)V", "suggestions-search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class YandexSearchSheetSharedViewModelImpl extends w0 implements YandexSearchSheetSharedViewModel {

    @NotNull
    private final Ae.w0<ShowYandexSearchSheetAction> action = E0.b(0, 0, null, 7);
    private boolean isMapViewCreated;

    /* renamed from: isMapViewCreated, reason: from getter */
    public boolean getIsMapViewCreated() {
        return this.isMapViewCreated;
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel
    public void setMapViewCreated(boolean z11) {
        this.isMapViewCreated = z11;
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel
    public boolean showYandexSearchSheet(@NotNull ShowYandexSearchSheetAction showYandexSearchSheetAction) {
        Intrinsics.checkNotNullParameter(showYandexSearchSheetAction, "showYandexSearchSheetAction");
        if (!getIsMapViewCreated()) {
            return false;
        }
        C10727i.c(x0.a(this), null, null, new YandexSearchSheetSharedViewModelImpl$showYandexSearchSheet$1(this, showYandexSearchSheetAction, null), 3);
        return true;
    }

    @Override // ru.ozon.app.android.yandexsearchsheet.YandexSearchSheetSharedViewModel
    @NotNull
    public Ae.w0<ShowYandexSearchSheetAction> getAction() {
        return this.action;
    }
}
