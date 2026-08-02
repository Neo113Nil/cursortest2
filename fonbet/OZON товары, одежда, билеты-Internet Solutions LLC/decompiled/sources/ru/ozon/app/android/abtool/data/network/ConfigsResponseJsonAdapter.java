package ru.ozon.app.android.abtool.data.network;

import Y9.b;
import Y9.c;
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
import ru.ozon.app.android.abtool.data.network.ConfigsResponse;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R \u0010\u0019\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00180\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/abtool/data/network/ConfigsResponseJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/abtool/data/network/ConfigsResponse;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/abtool/data/network/ConfigsResponse;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Config;", "listOfConfigAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/abtool/data/network/ConfigsResponse$Experiment;", "nullableListOfExperimentAdapter", "abzone_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ConfigsResponseJsonAdapter extends JsonAdapter<ConfigsResponse> {

    @NotNull
    private final JsonAdapter<List<ConfigsResponse.Config>> listOfConfigAdapter;

    @NotNull
    private final JsonAdapter<List<ConfigsResponse.Experiment>> nullableListOfExperimentAdapter;

    @NotNull
    private final n.a options;

    public ConfigsResponseJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("configs", "experiment");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        b e11 = D.e(List.class, ConfigsResponse.Config.class);
        M m11 = M.f71699a;
        JsonAdapter<List<ConfigsResponse.Config>> f7 = moshi.f(e11, m11, "configs");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.listOfConfigAdapter = f7;
        JsonAdapter<List<ConfigsResponse.Experiment>> f11 = moshi.f(D.e(List.class, ConfigsResponse.Experiment.class), m11, "experiment");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.nullableListOfExperimentAdapter = f11;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(37, "GeneratedJsonAdapter(ConfigsResponse)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ConfigsResponse fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ConfigsResponse.Config> list = null;
        List<ConfigsResponse.Experiment> list2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.listOfConfigAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("configs", "configs", reader);
                }
            } else if (v11 == 1) {
                list2 = this.nullableListOfExperimentAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (list != null) {
            return new ConfigsResponse(list, list2);
        }
        throw c.j("configs", "configs", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ConfigsResponse value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("configs");
        this.listOfConfigAdapter.mo44toJson(writer, (x) value_.getConfigs());
        writer.w("experiment");
        this.nullableListOfExperimentAdapter.mo44toJson(writer, (x) value_.getExperiment());
        writer.p();
    }
}
