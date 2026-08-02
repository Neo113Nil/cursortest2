package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data;

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
import ru.ozon.app.android.fresh.feature.b2b.widgets.legals.checkLegalInfo.data.CheckLegalInfoDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019¨\u0006 "}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cellDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$KppCheckDTO;", "nullableKppCheckDTOAdapter", "Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/checkLegalInfo/data/CheckLegalInfoDTO$Banner;", "nullableBannerAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTOAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CheckLegalInfoDTOJsonAdapter extends JsonAdapter<CheckLegalInfoDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> buttonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> cellDTOAdapter;

    @NotNull
    private final JsonAdapter<CheckLegalInfoDTO.Banner> nullableBannerAdapter;

    @NotNull
    private final JsonAdapter<CheckLegalInfoDTO.KppCheckDTO> nullableKppCheckDTOAdapter;

    @NotNull
    private final n.a options;

    public CheckLegalInfoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("info", "kppCheck", "banner", "button");
        M m11 = M.f71699a;
        this.cellDTOAdapter = moshi.f(CellDTO.class, m11, "info");
        this.nullableKppCheckDTOAdapter = moshi.f(CheckLegalInfoDTO.KppCheckDTO.class, m11, "kppCheck");
        this.nullableBannerAdapter = moshi.f(CheckLegalInfoDTO.Banner.class, m11, "banner");
        this.buttonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "button");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(CheckLegalInfoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CheckLegalInfoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CellDTO cellDTO = null;
        CheckLegalInfoDTO.KppCheckDTO kppCheckDTO = null;
        CheckLegalInfoDTO.Banner banner = null;
        ButtonV3DTO buttonV3DTO = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                cellDTO = this.cellDTOAdapter.fromJson(reader);
                if (cellDTO == null) {
                    throw c.q("info", "info", reader);
                }
            } else if (v11 == 1) {
                kppCheckDTO = this.nullableKppCheckDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                banner = this.nullableBannerAdapter.fromJson(reader);
            } else if (v11 == 3 && (buttonV3DTO = this.buttonV3DTOAdapter.fromJson(reader)) == null) {
                throw c.q("button", "button", reader);
            }
        }
        reader.endObject();
        if (cellDTO == null) {
            throw c.j("info", "info", reader);
        }
        if (buttonV3DTO != null) {
            return new CheckLegalInfoDTO(cellDTO, kppCheckDTO, banner, buttonV3DTO);
        }
        throw c.j("button", "button", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CheckLegalInfoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("info");
        this.cellDTOAdapter.mo44toJson(writer, (x) value.getInfo());
        writer.w("kppCheck");
        this.nullableKppCheckDTOAdapter.mo44toJson(writer, (x) value.getKppCheck());
        writer.w("banner");
        this.nullableBannerAdapter.mo44toJson(writer, (x) value.getBanner());
        writer.w("button");
        this.buttonV3DTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.p();
    }
}
