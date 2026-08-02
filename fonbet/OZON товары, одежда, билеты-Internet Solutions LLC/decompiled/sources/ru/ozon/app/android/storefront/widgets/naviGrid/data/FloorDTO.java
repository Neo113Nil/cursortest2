package ru.ozon.app.android.storefront.widgets.naviGrid.data;

import com.squareup.moshi.j;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOf;
import ru.ozon.moshi.adapters.serialize.proto.ProtoOneOfSignature;

@ProtoOneOfSignature.Container({@ProtoOneOfSignature(name = "accent", type = AccentDTO.class), @ProtoOneOfSignature(name = "pair", type = PairDTO.class)})
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO;", "", "<init>", "()V", "AccentDTO", "PairDTO", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO$AccentDTO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO$PairDTO;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
@ProtoOneOf(label = "type")
/* loaded from: classes2.dex */
public abstract class FloorDTO {
    public static final int $stable = 0;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\b\t\b\u0007\u0018\u00002\u00020\u0001B%\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\u0004\b\b\u0010\tR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0017\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00030\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u0010"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO$AccentDTO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO;", "accentItem", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "accentPosition", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;", "items", "", "<init>", "(Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;Ljava/util/List;)V", "getAccentItem", "()Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "getAccentPosition", "()Lru/ozon/app/android/storefront/widgets/naviGrid/data/AccentPosition;", "getItems", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class AccentDTO extends FloorDTO {
        public static final int $stable = 8;

        @NotNull
        private final ItemDTO accentItem;

        @NotNull
        private final AccentPosition accentPosition;

        @NotNull
        private final List<ItemDTO> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public AccentDTO(@NotNull ItemDTO accentItem, @NotNull AccentPosition accentPosition, @NotNull List<ItemDTO> items) {
            super(null);
            Intrinsics.checkNotNullParameter(accentItem, "accentItem");
            Intrinsics.checkNotNullParameter(accentPosition, "accentPosition");
            Intrinsics.checkNotNullParameter(items, "items");
            this.accentItem = accentItem;
            this.accentPosition = accentPosition;
            this.items = items;
        }

        @NotNull
        public final ItemDTO getAccentItem() {
            return this.accentItem;
        }

        @NotNull
        public final AccentPosition getAccentPosition() {
            return this.accentPosition;
        }

        @NotNull
        public final List<ItemDTO> getItems() {
            return this.items;
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO$PairDTO;", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/FloorDTO;", "items", "", "Lru/ozon/app/android/storefront/widgets/naviGrid/data/ItemDTO;", "<init>", "(Ljava/util/List;)V", "getItems", "()Ljava/util/List;", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PairDTO extends FloorDTO {
        public static final int $stable = 8;

        @NotNull
        private final List<ItemDTO> items;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public PairDTO(@NotNull List<ItemDTO> items) {
            super(null);
            Intrinsics.checkNotNullParameter(items, "items");
            this.items = items;
        }

        @NotNull
        public final List<ItemDTO> getItems() {
            return this.items;
        }
    }

    public /* synthetic */ FloorDTO(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private FloorDTO() {
    }
}
