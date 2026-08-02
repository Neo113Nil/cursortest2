package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data;

import Ak.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data.BannerWithActionDTO;
import ru.ozon.app.android.travel.molecules.dto.themeImage.v2.ThemeImageV2DTO;

@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\u000e\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0015\u001a\u00020\u00122\u0006\u0010\u0010\u001a\u00020\u000f2\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014R\u0014\u0010\u0017\u001a\u00020\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO_RightBlockDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$RightBlockDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson-dHVALV8", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", "fromJson", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson--KcpupE", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$RightBlockDTO;)V", "toJson", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/molecules/dto/themeImage/v2/ThemeImageV2DTO;", "nullableThemeImageV2DTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerWithActionDTO_RightBlockDTOJsonAdapter extends JsonAdapter<BannerWithActionDTO.RightBlockDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ThemeImageV2DTO> nullableThemeImageV2DTOAdapter;

    @NotNull
    private final n.a options;

    public BannerWithActionDTO_RightBlockDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("image");
        this.nullableThemeImageV2DTOAdapter = moshi.f(ThemeImageV2DTO.class, M.f71699a, "image");
    }

    @Override // com.squareup.moshi.JsonAdapter
    public /* bridge */ /* synthetic */ BannerWithActionDTO.RightBlockDTO fromJson(n nVar) {
        return BannerWithActionDTO.RightBlockDTO.m1188boximpl(m1195fromJsondHVALV8(nVar));
    }

    @NotNull
    /* renamed from: fromJson-dHVALV8, reason: not valid java name */
    public ThemeImageV2DTO m1195fromJsondHVALV8(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ThemeImageV2DTO themeImageV2DTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                themeImageV2DTO = this.nullableThemeImageV2DTOAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return BannerWithActionDTO.RightBlockDTO.m1189constructorimpl(themeImageV2DTO);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson--KcpupE, reason: not valid java name and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BannerWithActionDTO.RightBlockDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("image");
        this.nullableThemeImageV2DTOAdapter.mo44toJson(writer, (x) value.m1194unboximpl());
        writer.p();
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(BannerWithActionDTO.RightBlockDTO)", "toString(...)");
    }
}
