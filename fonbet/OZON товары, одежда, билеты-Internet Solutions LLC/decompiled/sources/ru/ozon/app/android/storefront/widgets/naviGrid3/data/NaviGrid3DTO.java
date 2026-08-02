package ru.ozon.app.android.storefront.widgets.naviGrid3.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid3/data/NaviGrid3DTO;", "", "items", "", "Lru/ozon/app/android/storefront/widgets/naviGrid3/data/ItemDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NaviGrid3DTO {
    public static final int $stable = 8;

    @NotNull
    private final List<ItemDTO> items;

    public NaviGrid3DTO(@NotNull List<ItemDTO> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.items = items;
    }

    @NotNull
    public final List<ItemDTO> getItems() {
        return this.items;
    }
}
