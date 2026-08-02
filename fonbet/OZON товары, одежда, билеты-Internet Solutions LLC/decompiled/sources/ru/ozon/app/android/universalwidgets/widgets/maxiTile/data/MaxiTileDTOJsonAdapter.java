package ru.ozon.app.android.universalwidgets.widgets.maxiTile.data;

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
import ru.ozon.app.android.universalwidgets.widgets.maxiTile.data.MaxiTileDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Gallery;", "galleryAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MainState;", "mainStateAdapter", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$MultiButton;", "multiButtonAdapter", "Lru/ozon/app/android/universalwidgets/widgets/maxiTile/data/MaxiTileDTO$Options;", "nullableOptionsAdapter", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class MaxiTileDTOJsonAdapter extends JsonAdapter<MaxiTileDTO> {

    @NotNull
    private final JsonAdapter<MaxiTileDTO.Gallery> galleryAdapter;

    @NotNull
    private final JsonAdapter<MaxiTileDTO.MainState> mainStateAdapter;

    @NotNull
    private final JsonAdapter<MaxiTileDTO.MultiButton> multiButtonAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<MaxiTileDTO.Options> nullableOptionsAdapter;

    @NotNull
    private final n.a options;

    public MaxiTileDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("gallery", "common", "mainState", "multiButton", "options");
        M m11 = M.f71699a;
        this.galleryAdapter = moshi.f(MaxiTileDTO.Gallery.class, m11, "gallery");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.mainStateAdapter = moshi.f(MaxiTileDTO.MainState.class, m11, "mainState");
        this.multiButtonAdapter = moshi.f(MaxiTileDTO.MultiButton.class, m11, "multiButton");
        this.nullableOptionsAdapter = moshi.f(MaxiTileDTO.Options.class, m11, "options");
    }

    @NotNull
    public String toString() {
        return b.c(33, "GeneratedJsonAdapter(MaxiTileDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MaxiTileDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        MaxiTileDTO.Gallery gallery = null;
        CommonControlSettings commonControlSettings = null;
        MaxiTileDTO.MainState mainState = null;
        MaxiTileDTO.MultiButton multiButton = null;
        MaxiTileDTO.Options options = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                gallery = this.galleryAdapter.fromJson(reader);
                if (gallery == null) {
                    throw c.q("gallery", "gallery", reader);
                }
            } else if (v11 == 1) {
                commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
            } else if (v11 == 2) {
                mainState = this.mainStateAdapter.fromJson(reader);
                if (mainState == null) {
                    throw c.q("mainState", "mainState", reader);
                }
            } else if (v11 == 3) {
                multiButton = this.multiButtonAdapter.fromJson(reader);
                if (multiButton == null) {
                    throw c.q("multiButton", "multiButton", reader);
                }
            } else if (v11 == 4) {
                options = this.nullableOptionsAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (gallery == null) {
            throw c.j("gallery", "gallery", reader);
        }
        if (mainState == null) {
            throw c.j("mainState", "mainState", reader);
        }
        if (multiButton != null) {
            return new MaxiTileDTO(gallery, commonControlSettings, mainState, multiButton, options);
        }
        throw c.j("multiButton", "multiButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MaxiTileDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("gallery");
        this.galleryAdapter.mo44toJson(writer, (x) value.getGallery());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("mainState");
        this.mainStateAdapter.mo44toJson(writer, (x) value.getMainState());
        writer.w("multiButton");
        this.multiButtonAdapter.mo44toJson(writer, (x) value.getMultiButton());
        writer.w("options");
        this.nullableOptionsAdapter.mo44toJson(writer, (x) value.getOptions());
        writer.p();
    }
}
