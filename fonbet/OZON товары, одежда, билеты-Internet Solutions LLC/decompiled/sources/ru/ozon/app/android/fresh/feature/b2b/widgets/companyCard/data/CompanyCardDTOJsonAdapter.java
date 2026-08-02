package ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.common.Scopes;
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
import ru.ozon.app.android.fresh.feature.b2b.widgets.companyCard.data.CompanyCardDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;
import ru.ozon.uni.atoms.data.controls.button.UncontainedButtonDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000h\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001c\u0010$\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/controls/button/UncontainedButtonDTO;", "nullableUncontainedButtonDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "nullableTextDTOAdapter", "", "Lru/ozon/app/android/fresh/feature/b2b/widgets/companyCard/data/CompanyCardDTO$CompanyCardOption;", "listOfCompanyCardOptionAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "nullableButtonDTOAdapter", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "nullableBadgeDTOAdapter", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "nullableCellDTOAdapter", "nullableStringAdapter", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class CompanyCardDTOJsonAdapter extends JsonAdapter<CompanyCardDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<CompanyCardDTO.CompanyCardOption>> listOfCompanyCardOptionAdapter;

    @NotNull
    private final JsonAdapter<BadgeDTO> nullableBadgeDTOAdapter;

    @NotNull
    private final JsonAdapter<ButtonDTO> nullableButtonDTOAdapter;

    @NotNull
    private final JsonAdapter<CellDTO> nullableCellDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final JsonAdapter<TextDTO> nullableTextDTOAdapter;

    @NotNull
    private final JsonAdapter<UncontainedButtonDTO> nullableUncontainedButtonDTOAdapter;

    @NotNull
    private final n.a options;

    public CompanyCardDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("link", "companyName", "companyOptions", "button", "badge", Scopes.EMAIL, "backgroundColor");
        M m11 = M.f71699a;
        this.nullableUncontainedButtonDTOAdapter = moshi.f(UncontainedButtonDTO.class, m11, "link");
        this.nullableTextDTOAdapter = moshi.f(TextDTO.class, m11, "companyName");
        this.listOfCompanyCardOptionAdapter = moshi.f(D.e(List.class, CompanyCardDTO.CompanyCardOption.class), m11, "companyOptions");
        this.nullableButtonDTOAdapter = moshi.f(ButtonDTO.class, m11, "button");
        this.nullableBadgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableCellDTOAdapter = moshi.f(CellDTO.class, m11, Scopes.EMAIL);
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
    }

    @NotNull
    public String toString() {
        return b.c(36, "GeneratedJsonAdapter(CompanyCardDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CompanyCardDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        UncontainedButtonDTO uncontainedButtonDTO = null;
        TextDTO textDTO = null;
        List<CompanyCardDTO.CompanyCardOption> list = null;
        ButtonDTO buttonDTO = null;
        BadgeDTO badgeDTO = null;
        CellDTO cellDTO = null;
        String str = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    uncontainedButtonDTO = this.nullableUncontainedButtonDTOAdapter.fromJson(reader);
                    break;
                case 1:
                    textDTO = this.nullableTextDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    list = this.listOfCompanyCardOptionAdapter.fromJson(reader);
                    if (list == null) {
                        throw c.q("companyOptions", "companyOptions", reader);
                    }
                    break;
                case 3:
                    buttonDTO = this.nullableButtonDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    badgeDTO = this.nullableBadgeDTOAdapter.fromJson(reader);
                    break;
                case 5:
                    cellDTO = this.nullableCellDTOAdapter.fromJson(reader);
                    break;
                case 6:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (list != null) {
            return new CompanyCardDTO(uncontainedButtonDTO, textDTO, list, buttonDTO, badgeDTO, cellDTO, str);
        }
        throw c.j("companyOptions", "companyOptions", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CompanyCardDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("link");
        this.nullableUncontainedButtonDTOAdapter.mo44toJson(writer, (x) value.getLink());
        writer.w("companyName");
        this.nullableTextDTOAdapter.mo44toJson(writer, (x) value.getCompanyName());
        writer.w("companyOptions");
        this.listOfCompanyCardOptionAdapter.mo44toJson(writer, (x) value.getCompanyOptions());
        writer.w("button");
        this.nullableButtonDTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("badge");
        this.nullableBadgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w(Scopes.EMAIL);
        this.nullableCellDTOAdapter.mo44toJson(writer, (x) value.getEmail());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.p();
    }
}
