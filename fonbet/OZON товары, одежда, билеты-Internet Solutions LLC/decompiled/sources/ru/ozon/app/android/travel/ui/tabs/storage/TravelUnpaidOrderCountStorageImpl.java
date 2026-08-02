package ru.ozon.app.android.travel.ui.tabs.storage;

import Ae.O0;
import Ae.x0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR \u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00040\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/travel/ui/tabs/storage/TravelUnpaidOrderCountStorageImpl;", "Lru/ozon/app/android/travel/ui/tabs/storage/TravelUnpaidOrderCountStorage;", "<init>", "()V", "", "newCount", "", "updateCount", "(I)V", "LAe/x0;", "count", "LAe/x0;", "getCount", "()LAe/x0;", "tabs_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TravelUnpaidOrderCountStorageImpl implements TravelUnpaidOrderCountStorage {

    @NotNull
    private final x0<Integer> count = O0.a(0);

    @Override // ru.ozon.app.android.travel.ui.tabs.storage.TravelUnpaidOrderCountStorage
    public void updateCount(int newCount) {
        Integer value;
        x0<Integer> count = getCount();
        do {
            value = count.getValue();
            value.intValue();
        } while (!count.b(value, Integer.valueOf(newCount)));
    }

    @Override // ru.ozon.app.android.travel.ui.tabs.storage.TravelUnpaidOrderCountStorage
    @NotNull
    public x0<Integer> getCount() {
        return this.count;
    }
}
