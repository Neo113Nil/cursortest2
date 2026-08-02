package ru.ozon.app.android.geo.map.presentation;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.viewmodel.AddressEditMapState;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/geo/map/presentation/AddressEditMapVOWithPayloads;", "", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "page", "", "Lru/ozon/app/android/geo/map/presentation/viewmodel/AddressEditMapState;", "payloads", "<init>", "(Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "getPage", "()Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO;", "Ljava/util/List;", "getPayloads", "()Ljava/util/List;", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class AddressEditMapVOWithPayloads {

    @NotNull
    private final AddressEditMapVO page;

    @NotNull
    private final List<AddressEditMapState> payloads;

    /* JADX WARN: Multi-variable type inference failed */
    public AddressEditMapVOWithPayloads(@NotNull AddressEditMapVO page, @NotNull List<? extends AddressEditMapState> payloads) {
        Intrinsics.checkNotNullParameter(page, "page");
        Intrinsics.checkNotNullParameter(payloads, "payloads");
        this.page = page;
        this.payloads = payloads;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddressEditMapVOWithPayloads)) {
            return false;
        }
        AddressEditMapVOWithPayloads addressEditMapVOWithPayloads = (AddressEditMapVOWithPayloads) other;
        return Intrinsics.d(this.page, addressEditMapVOWithPayloads.page) && Intrinsics.d(this.payloads, addressEditMapVOWithPayloads.payloads);
    }

    @NotNull
    public final AddressEditMapVO getPage() {
        return this.page;
    }

    @NotNull
    public final List<AddressEditMapState> getPayloads() {
        return this.payloads;
    }

    public int hashCode() {
        return this.payloads.hashCode() + (this.page.hashCode() * 31);
    }

    @NotNull
    public String toString() {
        return "AddressEditMapVOWithPayloads(page=" + this.page + ", payloads=" + this.payloads + ")";
    }
}
