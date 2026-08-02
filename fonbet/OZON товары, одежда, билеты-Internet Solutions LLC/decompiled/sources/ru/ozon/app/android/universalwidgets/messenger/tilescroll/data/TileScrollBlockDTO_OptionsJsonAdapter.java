package ru.ozon.app.android.universalwidgets.messenger.tilescroll.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.universalwidgets.messenger.tilescroll.data.TileScrollBlockDTO;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001e\u0010 \u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u001f8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO_OptionsJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$VisibleCellsCount;", "nullableVisibleCellsCountAdapter", "Lru/ozon/app/android/universalwidgets/messenger/tilescroll/data/TileScrollBlockDTO$Options$TileOptions;", "nullableTileOptionsAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class TileScrollBlockDTO_OptionsJsonAdapter extends JsonAdapter<TileScrollBlockDTO.Options> {
    private volatile Constructor<TileScrollBlockDTO.Options> constructorRef;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final JsonAdapter<TileScrollBlockDTO.Options.TileOptions> nullableTileOptionsAdapter;

    @NotNull
    private final JsonAdapter<TileScrollBlockDTO.Options.VisibleCellsCount> nullableVisibleCellsCountAdapter;

    @NotNull
    private final n.a options;

    public TileScrollBlockDTO_OptionsJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("backgroundColor", "visibleCellsCount", "smallTileOptions", "testInfo");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableVisibleCellsCountAdapter = moshi.f(TileScrollBlockDTO.Options.VisibleCellsCount.class, m11, "visibleCellsCount");
        this.nullableTileOptionsAdapter = moshi.f(TileScrollBlockDTO.Options.TileOptions.class, m11, "smallTileOptions");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(TileScrollBlockDTO.Options)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public TileScrollBlockDTO.Options fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        TileScrollBlockDTO.Options.VisibleCellsCount visibleCellsCount = null;
        TileScrollBlockDTO.Options.TileOptions tileOptions = null;
        TestInfo testInfo = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                visibleCellsCount = this.nullableVisibleCellsCountAdapter.fromJson(reader);
                i11 = -3;
            } else if (v11 == 2) {
                tileOptions = this.nullableTileOptionsAdapter.fromJson(reader);
            } else if (v11 == 3) {
                testInfo = this.nullableTestInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -3) {
            return new TileScrollBlockDTO.Options(str, visibleCellsCount, tileOptions, testInfo);
        }
        Constructor<TileScrollBlockDTO.Options> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = TileScrollBlockDTO.Options.class.getDeclaredConstructor(String.class, TileScrollBlockDTO.Options.VisibleCellsCount.class, TileScrollBlockDTO.Options.TileOptions.class, TestInfo.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        TileScrollBlockDTO.Options newInstance = constructor.newInstance(str, visibleCellsCount, tileOptions, testInfo, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, TileScrollBlockDTO.Options value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("visibleCellsCount");
        this.nullableVisibleCellsCountAdapter.mo44toJson(writer, (x) value.getVisibleCellsCount());
        writer.w("smallTileOptions");
        this.nullableTileOptionsAdapter.mo44toJson(writer, (x) value.getSmallTileOptions());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
