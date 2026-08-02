package ru.ozon.app.android.commonwidgets.widgets.curtain.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import ru.ozon.app.android.commonwidgets.widgets.curtain.data.CurtainDTO;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO_ShowConditionJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Type;", "typeAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$ViewPort;", "nullableViewPortAdapter", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$PageLoaded;", "nullablePageLoadedAdapter", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Timer;", "nullableTimerAdapter", "Lru/ozon/app/android/commonwidgets/widgets/curtain/data/CurtainDTO$ShowCondition$Condition$Offset;", "nullableOffsetAdapter", "commonwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CurtainDTO_ShowConditionJsonAdapter extends JsonAdapter<CurtainDTO.ShowCondition> {

    @NotNull
    private final JsonAdapter<CurtainDTO.ShowCondition.Condition.Offset> nullableOffsetAdapter;

    @NotNull
    private final JsonAdapter<CurtainDTO.ShowCondition.Condition.PageLoaded> nullablePageLoadedAdapter;

    @NotNull
    private final JsonAdapter<CurtainDTO.ShowCondition.Condition.Timer> nullableTimerAdapter;

    @NotNull
    private final JsonAdapter<CurtainDTO.ShowCondition.Condition.ViewPort> nullableViewPortAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<CurtainDTO.ShowCondition.Type> typeAdapter;

    public CurtainDTO_ShowConditionJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("type", "viewport", "pageLoaded", DynamicElementDTO.TIMER, "offset");
        M m11 = M.f71699a;
        this.typeAdapter = moshi.f(CurtainDTO.ShowCondition.Type.class, m11, "type");
        this.nullableViewPortAdapter = moshi.f(CurtainDTO.ShowCondition.Condition.ViewPort.class, m11, "viewport");
        this.nullablePageLoadedAdapter = moshi.f(CurtainDTO.ShowCondition.Condition.PageLoaded.class, m11, "pageLoaded");
        this.nullableTimerAdapter = moshi.f(CurtainDTO.ShowCondition.Condition.Timer.class, m11, DynamicElementDTO.TIMER);
        this.nullableOffsetAdapter = moshi.f(CurtainDTO.ShowCondition.Condition.Offset.class, m11, "offset");
    }

    @NotNull
    public String toString() {
        return b.c(46, "GeneratedJsonAdapter(CurtainDTO.ShowCondition)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CurtainDTO.ShowCondition fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CurtainDTO.ShowCondition.Type type = null;
        CurtainDTO.ShowCondition.Condition.ViewPort viewPort = null;
        CurtainDTO.ShowCondition.Condition.PageLoaded pageLoaded = null;
        CurtainDTO.ShowCondition.Condition.Timer timer = null;
        CurtainDTO.ShowCondition.Condition.Offset offset = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                type = this.typeAdapter.fromJson(reader);
                if (type == null) {
                    throw c.q("type", "type", reader);
                }
            } else if (v11 == 1) {
                viewPort = this.nullableViewPortAdapter.fromJson(reader);
            } else if (v11 == 2) {
                pageLoaded = this.nullablePageLoadedAdapter.fromJson(reader);
            } else if (v11 == 3) {
                timer = this.nullableTimerAdapter.fromJson(reader);
            } else if (v11 == 4) {
                offset = this.nullableOffsetAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (type != null) {
            return new CurtainDTO.ShowCondition(type, viewPort, pageLoaded, timer, offset);
        }
        throw c.j("type", "type", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CurtainDTO.ShowCondition value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("type");
        this.typeAdapter.mo44toJson(writer, (x) value.getType());
        writer.w("viewport");
        this.nullableViewPortAdapter.mo44toJson(writer, (x) value.getViewport());
        writer.w("pageLoaded");
        this.nullablePageLoadedAdapter.mo44toJson(writer, (x) value.getPageLoaded());
        writer.w(DynamicElementDTO.TIMER);
        this.nullableTimerAdapter.mo44toJson(writer, (x) value.getTimer());
        writer.w("offset");
        this.nullableOffsetAdapter.mo44toJson(writer, (x) value.getOffset());
        writer.p();
    }
}
