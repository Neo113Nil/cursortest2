package ru.ozon.app.android.account.orders.emptyscreen;

import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.islandSeparator.data.IslandSeparatorDTO;
import ru.ozon.app.android.account.orders.emptyscreen.internalteeth.InternalTeethDTO;
import ru.ozon.uni.core.UniColors;
import z00.e;

@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0015\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\t\u0010\nR\u001a\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/app/android/account/orders/emptyscreen/InternalTeethFactory;", "", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Lz00/e;", "builder", "", "appendTeeth", "(Lz00/e;)V", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/account/orders/emptyscreen/internalteeth/InternalTeethDTO;", "commonTeethJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "cs-orders_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class InternalTeethFactory {

    @NotNull
    private final JsonAdapter<InternalTeethDTO> commonTeethJsonAdapter;

    public InternalTeethFactory(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.commonTeethJsonAdapter = moshi.c(InternalTeethDTO.class);
    }

    public final void appendTeeth(@NotNull e builder) {
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.a(1L, "csma", "internalTeeth", this.commonTeethJsonAdapter.toJson(new InternalTeethDTO(new IslandSeparatorDTO(0, UniColors.LAYER_FLOOR_0.getToken(), IslandSeparatorDTO.Configuration.SECTION_BEGIN, Boolean.TRUE, null, Boolean.FALSE))));
    }
}
