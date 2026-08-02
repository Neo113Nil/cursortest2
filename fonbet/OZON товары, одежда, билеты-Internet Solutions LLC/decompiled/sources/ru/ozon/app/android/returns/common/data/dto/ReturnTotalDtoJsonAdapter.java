package ru.ozon.app.android.returns.common.data.dto;

import Y9.b;
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
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.atoms.data.list.ListElementAtom;
import ru.ozon.app.android.returns.common.data.dto.ReturnTotalDto;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\"\u0010\u0019\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u0018\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010\u001aR\"\u0010\u001c\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001b\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u001aR\u001c\u0010\u001e\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u001a¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDtoJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "", "Lru/ozon/app/android/returns/common/data/dto/ReturnTotalDto$ItemPhoto;", "nullableListOfItemPhotoAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/atoms/data/list/ListElementAtom$TableRowListElement;", "nullableListOfTableRowListElementAdapter", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "nullableDisclaimerAtomAdapter", "details_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class ReturnTotalDtoJsonAdapter extends JsonAdapter<ReturnTotalDto> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<DisclaimerAtom> nullableDisclaimerAtomAdapter;

    @NotNull
    private final JsonAdapter<List<ReturnTotalDto.ItemPhoto>> nullableListOfItemPhotoAdapter;

    @NotNull
    private final JsonAdapter<List<ListElementAtom.TableRowListElement>> nullableListOfTableRowListElementAdapter;

    @NotNull
    private final n.a options;

    public ReturnTotalDtoJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("itemPhotos", "amountDetailing", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        b e11 = D.e(List.class, ReturnTotalDto.ItemPhoto.class);
        M m11 = M.f71699a;
        this.nullableListOfItemPhotoAdapter = moshi.f(e11, m11, "itemPhotos");
        this.nullableListOfTableRowListElementAdapter = moshi.f(D.e(List.class, ListElementAtom.TableRowListElement.class), m11, "amountDetailing");
        this.nullableDisclaimerAtomAdapter = moshi.f(DisclaimerAtom.class, m11, SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
    }

    @NotNull
    public String toString() {
        return Ak.b.c(36, "GeneratedJsonAdapter(ReturnTotalDto)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public ReturnTotalDto fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        List<ReturnTotalDto.ItemPhoto> list = null;
        List<ListElementAtom.TableRowListElement> list2 = null;
        DisclaimerAtom disclaimerAtom = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                list = this.nullableListOfItemPhotoAdapter.fromJson(reader);
            } else if (v11 == 1) {
                list2 = this.nullableListOfTableRowListElementAdapter.fromJson(reader);
            } else if (v11 == 2) {
                disclaimerAtom = this.nullableDisclaimerAtomAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        return new ReturnTotalDto(list, list2, disclaimerAtom);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, ReturnTotalDto value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("itemPhotos");
        this.nullableListOfItemPhotoAdapter.mo44toJson(writer, (x) value.getItemPhotos());
        writer.w("amountDetailing");
        this.nullableListOfTableRowListElementAdapter.mo44toJson(writer, (x) value.getAmountDetailing());
        writer.w(SelectionItemFormDTO.DISCLAIMER_FIELD_NAME);
        this.nullableDisclaimerAtomAdapter.mo44toJson(writer, (x) value.getDisclaimer());
        writer.p();
    }
}
