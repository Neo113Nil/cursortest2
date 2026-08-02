package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.data;

import Y9.b;
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
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.data.MorkovskTabbarDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$Tab;", "listOfTabAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/data/MorkovskTabbarDTO$Behavior;", "nullableBehaviorAdapter", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class MorkovskTabbarDTOJsonAdapter extends JsonAdapter<MorkovskTabbarDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<MorkovskTabbarDTO.Tab>> listOfTabAdapter;

    @NotNull
    private final JsonAdapter<MorkovskTabbarDTO.Behavior> nullableBehaviorAdapter;

    @NotNull
    private final n.a options;

    public MorkovskTabbarDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a(DynamicElementDTO.TABS, "behavior");
        b e11 = D.e(List.class, MorkovskTabbarDTO.Tab.class);
        M m11 = M.f71699a;
        this.listOfTabAdapter = moshi.f(e11, m11, DynamicElementDTO.TABS);
        this.nullableBehaviorAdapter = moshi.f(MorkovskTabbarDTO.Behavior.class, m11, "behavior");
    }

    @NotNull
    public String toString() {
        return Ak.b.c(39, "GeneratedJsonAdapter(MorkovskTabbarDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MorkovskTabbarDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<MorkovskTabbarDTO.Tab> list = null;
        MorkovskTabbarDTO.Behavior behavior = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfTabAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
                }
            } else if (v11 == 1) {
                behavior = this.nullableBehaviorAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new MorkovskTabbarDTO(list, behavior);
        }
        throw c.j(DynamicElementDTO.TABS, DynamicElementDTO.TABS, reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MorkovskTabbarDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w(DynamicElementDTO.TABS);
        this.listOfTabAdapter.mo44toJson(writer, (x) value.getTabs());
        writer.w("behavior");
        this.nullableBehaviorAdapter.mo44toJson(writer, (x) value.getBehavior());
        writer.p();
    }
}
