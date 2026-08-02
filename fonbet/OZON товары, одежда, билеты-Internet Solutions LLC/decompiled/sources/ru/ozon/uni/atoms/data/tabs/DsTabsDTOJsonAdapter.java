package ru.ozon.uni.atoms.data.tabs;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.k;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 \u00112\b\u0012\u0004\u0012\u00020\u00020\u0001:\u0001\u0011B\u0015\u0012\f\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u0001¢\u0006\u0004\b\u0004\u0010\u0005J\u0019\u0010\b\u001a\u0004\u0018\u00010\u00022\u0006\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\b\u0010\tJ!\u0010\u000e\u001a\u00020\r2\u0006\u0010\u000b\u001a\u00020\n2\b\u0010\f\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\b\u0012\u0004\u0012\u00020\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/uni/atoms/data/tabs/DsTabsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "delegate", "<init>", "(Lcom/squareup/moshi/JsonAdapter;)V", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/uni/atoms/data/tabs/TabsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/uni/atoms/data/tabs/TabsDTO;)V", "Lcom/squareup/moshi/JsonAdapter;", "Companion", "uni_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class DsTabsDTOJsonAdapter extends JsonAdapter<TabsDTO> {
    private static final int MAX_TABS = 3;
    private static final int MIN_TABS = 2;

    @NotNull
    private final JsonAdapter<TabsDTO> delegate;
    public static final int $stable = 8;

    public DsTabsDTOJsonAdapter(@NotNull JsonAdapter<TabsDTO> delegate) {
        Intrinsics.checkNotNullParameter(delegate, "delegate");
        this.delegate = delegate;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public TabsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        TabsDTO fromJson = this.delegate.fromJson(reader);
        if (fromJson == null) {
            return null;
        }
        int size = fromJson.getTabs().size();
        if (2 > size || size >= 4) {
            throw new k("Tabs atom must contain 2 or 3 tabs");
        }
        if (fromJson.getSelectedTabIndex() < 0 || fromJson.getSelectedTabIndex() >= size) {
            throw new k("Tabs selectedTabIndex must be greater than 0 and less than tabs size ");
        }
        return fromJson;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TabsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.delegate.mo44toJson(writer, (x) value);
    }
}
