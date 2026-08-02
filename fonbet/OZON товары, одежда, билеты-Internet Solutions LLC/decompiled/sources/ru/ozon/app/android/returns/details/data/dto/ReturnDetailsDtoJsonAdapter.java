package ru.ozon.app.android.returns.details.data.dto;

import Ak.b;
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
import ru.ozon.app.android.returns.common.data.dto.ReturnStatusDto;
import ru.ozon.app.android.returns.common.data.dto.ReturnTotalDto;
import ru.ozon.app.android.returns.details.data.dto.ReturnDetailsDto;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\"\u0010\"\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020!\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/returns/common/data/dto/ReturnStatusDto;", "returnStatusDtoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/returns/details/data/dto/ReturnDetailsDto$Component;", "nullableListOfComponentAdapter", "Lru/ozon/app/android/returns/details/data/dto/ReturnItemsDto;", "returnItemsDtoAdapter", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "nullableReturnTotalDtoAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallButton;", "nullableListOfSmallButtonAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnDetailsDtoJsonAdapter extends JsonAdapter<ReturnDetailsDto> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<List<ReturnDetailsDto.Component>> nullableListOfComponentAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3Atom.SmallButton>> nullableListOfSmallButtonAdapter;

    @NotNull
    private final JsonAdapter<ReturnTotalDto> nullableReturnTotalDtoAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ReturnItemsDto> returnItemsDtoAdapter;

    @NotNull
    private final JsonAdapter<ReturnStatusDto> returnStatusDtoAdapter;

    public ReturnDetailsDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("status", "components", "items", "total", "availableActions");
        M m11 = M.f71699a;
        this.returnStatusDtoAdapter = moshi.f(ReturnStatusDto.class, m11, "status");
        this.nullableListOfComponentAdapter = moshi.f(D.e(List.class, ReturnDetailsDto.Component.class), m11, "components");
        this.returnItemsDtoAdapter = moshi.f(ReturnItemsDto.class, m11, "items");
        this.nullableReturnTotalDtoAdapter = moshi.f(ReturnTotalDto.class, m11, "total");
        this.nullableListOfSmallButtonAdapter = moshi.f(D.e(List.class, ButtonV3Atom.SmallButton.class), m11, "availableActions");
    }

    @NotNull
    public String toString() {
        return b.c(38, "GeneratedJsonAdapter(ReturnDetailsDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnDetailsDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ReturnStatusDto returnStatusDto = null;
        List<ReturnDetailsDto.Component> list = null;
        ReturnItemsDto returnItemsDto = null;
        ReturnTotalDto returnTotalDto = null;
        List<ButtonV3Atom.SmallButton> list2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                returnStatusDto = this.returnStatusDtoAdapter.fromJson(reader);
                if (returnStatusDto == null) {
                    throw c.q("status", "status", reader);
                }
            } else if (v11 == 1) {
                list = this.nullableListOfComponentAdapter.fromJson(reader);
            } else if (v11 == 2) {
                returnItemsDto = this.returnItemsDtoAdapter.fromJson(reader);
                if (returnItemsDto == null) {
                    throw c.q("items", "items", reader);
                }
            } else if (v11 == 3) {
                returnTotalDto = this.nullableReturnTotalDtoAdapter.fromJson(reader);
            } else if (v11 == 4) {
                list2 = this.nullableListOfSmallButtonAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (returnStatusDto == null) {
            throw c.j("status", "status", reader);
        }
        if (returnItemsDto != null) {
            return new ReturnDetailsDto(returnStatusDto, list, returnItemsDto, returnTotalDto, list2);
        }
        throw c.j("items", "items", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnDetailsDto value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("status");
        this.returnStatusDtoAdapter.mo44toJson(writer, (x) value.getStatus());
        writer.w("components");
        this.nullableListOfComponentAdapter.mo44toJson(writer, (x) value.getComponents());
        writer.w("items");
        this.returnItemsDtoAdapter.mo44toJson(writer, (x) value.getItems());
        writer.w("total");
        this.nullableReturnTotalDtoAdapter.mo44toJson(writer, (x) value.getTotal());
        writer.w("availableActions");
        this.nullableListOfSmallButtonAdapter.mo44toJson(writer, (x) value.getAvailableActions());
        writer.p();
    }
}
