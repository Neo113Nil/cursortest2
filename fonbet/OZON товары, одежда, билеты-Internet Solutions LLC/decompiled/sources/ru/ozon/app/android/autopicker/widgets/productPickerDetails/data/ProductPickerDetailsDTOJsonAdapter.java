package ru.ozon.app.android.autopicker.widgets.productPickerDetails.data;

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
import ru.ozon.app.android.atoms.data.deprecated.CommonButton;
import ru.ozon.app.android.autopicker.widgets.productPickerDetails.data.ProductPickerDetailsDTO;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001a\u0010\"\u001a\b\u0012\u0004\u0012\u00020!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019¨\u0006#"}, d2 = {"Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$SelectorDTO;", "nullableSelectorDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$SectionDTO;", "listOfSectionDTOAdapter", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$StickyBlockDTO;", "stickyBlockDTOAdapter", "Lru/ozon/app/android/atoms/data/deprecated/CommonButton$ButtonBorderless;", "nullableButtonBorderlessAdapter", "Lru/ozon/app/android/autopicker/widgets/productPickerDetails/data/ProductPickerDetailsDTO$CurrentState;", "currentStateAdapter", "autopicker_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ProductPickerDetailsDTOJsonAdapter extends JsonAdapter<ProductPickerDetailsDTO> {

    @NotNull
    private final JsonAdapter<ProductPickerDetailsDTO.CurrentState> currentStateAdapter;

    @NotNull
    private final JsonAdapter<List<ProductPickerDetailsDTO.SectionDTO>> listOfSectionDTOAdapter;

    @NotNull
    private final JsonAdapter<CommonButton.ButtonBorderless> nullableButtonBorderlessAdapter;

    @NotNull
    private final JsonAdapter<ProductPickerDetailsDTO.SelectorDTO> nullableSelectorDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<ProductPickerDetailsDTO.StickyBlockDTO> stickyBlockDTOAdapter;

    public ProductPickerDetailsDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("selector", "sections", "stickyBlock", "resetButton", "currentState");
        M m11 = M.f71699a;
        this.nullableSelectorDTOAdapter = moshi.f(ProductPickerDetailsDTO.SelectorDTO.class, m11, "selector");
        this.listOfSectionDTOAdapter = moshi.f(D.e(List.class, ProductPickerDetailsDTO.SectionDTO.class), m11, "sections");
        this.stickyBlockDTOAdapter = moshi.f(ProductPickerDetailsDTO.StickyBlockDTO.class, m11, "stickyBlock");
        this.nullableButtonBorderlessAdapter = moshi.f(CommonButton.ButtonBorderless.class, m11, "resetButton");
        this.currentStateAdapter = moshi.f(ProductPickerDetailsDTO.CurrentState.class, m11, "currentState");
    }

    @NotNull
    public String toString() {
        return b.c(45, "GeneratedJsonAdapter(ProductPickerDetailsDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ProductPickerDetailsDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        ProductPickerDetailsDTO.SelectorDTO selectorDTO = null;
        List<ProductPickerDetailsDTO.SectionDTO> list = null;
        ProductPickerDetailsDTO.StickyBlockDTO stickyBlockDTO = null;
        CommonButton.ButtonBorderless buttonBorderless = null;
        ProductPickerDetailsDTO.CurrentState currentState = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                selectorDTO = this.nullableSelectorDTOAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list = this.listOfSectionDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("sections", "sections", reader);
                }
            } else if (v11 == 2) {
                stickyBlockDTO = this.stickyBlockDTOAdapter.fromJson(reader);
                if (stickyBlockDTO == null) {
                    throw c.q("stickyBlock", "stickyBlock", reader);
                }
            } else if (v11 == 3) {
                buttonBorderless = this.nullableButtonBorderlessAdapter.fromJson(reader);
            } else if (v11 == 4 && (currentState = this.currentStateAdapter.fromJson(reader)) == null) {
                throw c.q("currentState", "currentState", reader);
            }
        }
        reader.endObject();
        if (list == null) {
            throw c.j("sections", "sections", reader);
        }
        if (stickyBlockDTO == null) {
            throw c.j("stickyBlock", "stickyBlock", reader);
        }
        if (currentState != null) {
            return new ProductPickerDetailsDTO(selectorDTO, list, stickyBlockDTO, buttonBorderless, currentState);
        }
        throw c.j("currentState", "currentState", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ProductPickerDetailsDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("selector");
        this.nullableSelectorDTOAdapter.mo44toJson(writer, (x) value.getSelector());
        writer.w("sections");
        this.listOfSectionDTOAdapter.mo44toJson(writer, (x) value.getSections());
        writer.w("stickyBlock");
        this.stickyBlockDTOAdapter.mo44toJson(writer, (x) value.getStickyBlock());
        writer.w("resetButton");
        this.nullableButtonBorderlessAdapter.mo44toJson(writer, (x) value.getResetButton());
        writer.w("currentState");
        this.currentStateAdapter.mo44toJson(writer, (x) value.getCurrentState());
        writer.p();
    }
}
