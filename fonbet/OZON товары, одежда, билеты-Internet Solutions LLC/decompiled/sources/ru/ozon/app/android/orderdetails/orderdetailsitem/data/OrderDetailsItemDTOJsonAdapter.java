package ru.ozon.app.android.orderdetails.orderdetailsitem.data;

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
import ru.ozon.app.android.cscore.orderdetails.molecule.images.data.ImagesDTO;
import ru.ozon.uni.atoms.data.TestInfo;
import ru.ozon.uni.atoms.data.cell.ButtonTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.icon.IconDTO;

@Metadata(d1 = {"\u0000j\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001c\u0010\u001f\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010!\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010 0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\"\u0010#\u001a\u0010\u0012\f\u0012\n\u0012\u0004\u0012\u00020\u001c\u0018\u00010\"0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b#\u0010\u0019R\u001c\u0010%\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010$0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b%\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/orderdetails/orderdetailsitem/data/OrderDetailsItemDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/icon/IconDTO;", "iconDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/cell/ButtonTitleSubtitleCellDTO;", "buttonTitleSubtitleCellDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "nullableButtonV3DTOAdapter", "Lru/ozon/app/android/cscore/orderdetails/molecule/images/data/ImagesDTO;", "nullableImagesDTOAdapter", "", "nullableBooleanAdapter", "", "nullableListOfButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/TestInfo;", "nullableTestInfoAdapter", "orderdetails_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class OrderDetailsItemDTOJsonAdapter extends JsonAdapter<OrderDetailsItemDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<ButtonTitleSubtitleCellDTO> buttonTitleSubtitleCellDTOAdapter;

    @NotNull
    private final JsonAdapter<IconDTO> iconDTOAdapter;

    @NotNull
    private final JsonAdapter<Boolean> nullableBooleanAdapter;

    @NotNull
    private final JsonAdapter<ButtonV3DTO> nullableButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<ImagesDTO> nullableImagesDTOAdapter;

    @NotNull
    private final JsonAdapter<List<ButtonV3DTO>> nullableListOfButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<TestInfo> nullableTestInfoAdapter;

    @NotNull
    private final n.a options;

    public OrderDetailsItemDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", "cell", "button", "images", "hasSeparator", "buttonsInRow", "testInfo");
        M m11 = M.f71699a;
        this.iconDTOAdapter = moshi.f(IconDTO.class, m11, "icon");
        this.buttonTitleSubtitleCellDTOAdapter = moshi.f(ButtonTitleSubtitleCellDTO.class, m11, "cell");
        this.nullableButtonV3DTOAdapter = moshi.f(ButtonV3DTO.class, m11, "button");
        this.nullableImagesDTOAdapter = moshi.f(ImagesDTO.class, m11, "images");
        this.nullableBooleanAdapter = moshi.f(Boolean.class, m11, "hasSeparator");
        this.nullableListOfButtonV3DTOAdapter = moshi.f(D.e(List.class, ButtonV3DTO.class), m11, "buttonsInRow");
        this.nullableTestInfoAdapter = moshi.f(TestInfo.class, m11, "testInfo");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(OrderDetailsItemDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public OrderDetailsItemDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        IconDTO iconDTO = null;
        ButtonTitleSubtitleCellDTO buttonTitleSubtitleCellDTO = null;
        ButtonV3DTO buttonV3DTO = null;
        ImagesDTO imagesDTO = null;
        Boolean bool = null;
        List<ButtonV3DTO> list = null;
        TestInfo testInfo = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    iconDTO = this.iconDTOAdapter.fromJson(reader);
                    if (iconDTO == null) {
                        throw c.q("icon", "icon", reader);
                    }
                    break;
                case 1:
                    buttonTitleSubtitleCellDTO = this.buttonTitleSubtitleCellDTOAdapter.fromJson(reader);
                    if (buttonTitleSubtitleCellDTO == null) {
                        throw c.q("cell", "cell", reader);
                    }
                    break;
                case 2:
                    buttonV3DTO = this.nullableButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 3:
                    imagesDTO = this.nullableImagesDTOAdapter.fromJson(reader);
                    break;
                case 4:
                    bool = this.nullableBooleanAdapter.fromJson(reader);
                    break;
                case 5:
                    list = this.nullableListOfButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 6:
                    testInfo = this.nullableTestInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (iconDTO == null) {
            throw c.j("icon", "icon", reader);
        }
        if (buttonTitleSubtitleCellDTO != null) {
            return new OrderDetailsItemDTO(iconDTO, buttonTitleSubtitleCellDTO, buttonV3DTO, imagesDTO, bool, list, testInfo);
        }
        throw c.j("cell", "cell", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, OrderDetailsItemDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.iconDTOAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w("cell");
        this.buttonTitleSubtitleCellDTOAdapter.mo44toJson(writer, (x) value.getCell());
        writer.w("button");
        this.nullableButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButton());
        writer.w("images");
        this.nullableImagesDTOAdapter.mo44toJson(writer, (x) value.getImages());
        writer.w("hasSeparator");
        this.nullableBooleanAdapter.mo44toJson(writer, (x) value.getHasSeparator());
        writer.w("buttonsInRow");
        this.nullableListOfButtonV3DTOAdapter.mo44toJson(writer, (x) value.getButtonsInRow());
        writer.w("testInfo");
        this.nullableTestInfoAdapter.mo44toJson(writer, (x) value.getTestInfo());
        writer.p();
    }
}
