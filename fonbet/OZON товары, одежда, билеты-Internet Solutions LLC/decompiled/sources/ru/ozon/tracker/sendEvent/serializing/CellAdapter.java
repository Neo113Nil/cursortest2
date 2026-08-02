package ru.ozon.tracker.sendEvent.serializing;

import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.Cell;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J)\u0010\t\u001a\f\u0012\u0006\b\u0001\u0012\u00020\u0002\u0018\u00010\u00012\u000e\u0010\b\u001a\n\u0012\u0006\b\u0001\u0012\u00020\u00020\u0007H\u0002¢\u0006\u0004\b\t\u0010\nJ\u0019\u0010\r\u001a\u0004\u0018\u00010\u00022\u0006\u0010\f\u001a\u00020\u000bH\u0016¢\u0006\u0004\b\r\u0010\u000eJ!\u0010\u0013\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0004\u001a\u00020\u00038\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/tracker/sendEvent/serializing/CellAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/tracker/sendEvent/Cell;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "Ljava/lang/Class;", "rowType", "findSerializingType", "(Ljava/lang/Class;)Lcom/squareup/moshi/JsonAdapter;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/tracker/sendEvent/Cell;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/tracker/sendEvent/Cell;)V", "Lcom/squareup/moshi/Moshi;", "tracker-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class CellAdapter extends JsonAdapter<Cell> {

    @NotNull
    private final Moshi moshi;

    public CellAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.moshi = moshi;
    }

    private final JsonAdapter<? extends Cell> findSerializingType(Class<? extends Cell> rowType) {
        if (Intrinsics.d(rowType, Cell.CustomCell.class)) {
            return this.moshi.c(Cell.CustomCell.class);
        }
        return null;
    }

    @Override // com.squareup.moshi.JsonAdapter
    public Cell fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        return CellAdapterFactory.INSTANCE.createCustomCellAdapter$tracker_sdk_release(this.moshi).fromJson(reader);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, Cell value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            writer.x();
            return;
        }
        JsonAdapter<? extends Cell> findSerializingType = findSerializingType(value.getClass());
        if (findSerializingType == null) {
            findSerializingType = null;
        }
        if (findSerializingType == null) {
            writer.x();
        } else {
            findSerializingType.mo44toJson(writer, (x) value);
            Unit unit = Unit.f71690a;
        }
    }
}
