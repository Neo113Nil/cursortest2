package ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.storefront.widgets.navLikezoneCarousel.data.NavLikezoneCaruselDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019¨\u0006!"}, d2 = {"Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$Item;", "listOfItemAdapter", "Lru/ozon/app/android/storefront/widgets/navLikezoneCarousel/data/NavLikezoneCaruselDTO$PageControls;", "pageControlsAdapter", "", "nullableLongAdapter", "storefront_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class NavLikezoneCaruselDTOJsonAdapter extends JsonAdapter<NavLikezoneCaruselDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<NavLikezoneCaruselDTO.Item>> listOfItemAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<Long> nullableLongAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<NavLikezoneCaruselDTO.PageControls> pageControlsAdapter;

    public NavLikezoneCaruselDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("topBadge", "items", "pageControls", "scrollTime");
        M m11 = M.f71699a;
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "topBadge");
        this.listOfItemAdapter = moshi.f(D.e(List.class, NavLikezoneCaruselDTO.Item.class), m11, "items");
        this.pageControlsAdapter = moshi.f(NavLikezoneCaruselDTO.PageControls.class, m11, "pageControls");
        this.nullableLongAdapter = moshi.f(Long.class, m11, "scrollTime");
    }

    @NotNull
    public String toString() {
        return b.c(43, "GeneratedJsonAdapter(NavLikezoneCaruselDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public NavLikezoneCaruselDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        BadgeDTO badgeDTO = null;
        List<NavLikezoneCaruselDTO.Item> list = null;
        NavLikezoneCaruselDTO.PageControls pageControls = null;
        Long l11 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfItemAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("items", "items", reader);
                }
            } else if (v11 == 2) {
                pageControls = this.pageControlsAdapter.fromJson(reader);
                if (pageControls == null) {
                    throw c.q("pageControls", "pageControls", reader);
                }
            } else if (v11 == 3) {
                l11 = this.nullableLongAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("items", "items", reader);
        }
        if (pageControls != null) {
            return new NavLikezoneCaruselDTO(badgeDTO, list, pageControls, l11);
        }
        throw c.j("pageControls", "pageControls", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, NavLikezoneCaruselDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("topBadge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getTopBadge());
        writer.w("items");
        this.listOfItemAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("pageControls");
        this.pageControlsAdapter.mo44toJson(writer, (x) value.getPageControls());
        writer.w("scrollTime");
        this.nullableLongAdapter.mo44toJson(writer, (x) value.getScrollTime());
        writer.p();
    }
}
