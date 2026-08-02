package ru.ozon.app.android.travel.feature.hotels.map.widgets.hotelsMapCard.v1.data;

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
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;
import ru.ozon.uni.atoms.data.button.Icon;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0018\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1DTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1DTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1DTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/hotels/map/widgets/hotelsMapCard/v1/data/HotelsMapCardV1DTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/button/Icon;", "nullableIconAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "textAtomAdapter", "nullableTextAtomAdapter", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$LargeButton;", "largeButtonAdapter", "map_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class HotelsMapCardV1DTOJsonAdapter extends JsonAdapter<HotelsMapCardV1DTO> {

    @NotNull
    private final JsonAdapter<ButtonV3Atom.LargeButton> largeButtonAdapter;

    @NotNull
    private final JsonAdapter<Icon> nullableIconAdapter;

    @NotNull
    private final JsonAdapter<TextAtom> nullableTextAtomAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<TextAtom> textAtomAdapter;

    public HotelsMapCardV1DTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("icon", AppMeasurementSdk.ConditionalUserProperty.NAME, FormPageDTO.Field.FIELD_TYPE_ADDRESS, "price", "priceDescription", "actionButton");
        M m11 = M.f71699a;
        this.nullableIconAdapter = moshi.f(Icon.class, m11, "icon");
        this.textAtomAdapter = moshi.f(TextAtom.class, m11, AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.nullableTextAtomAdapter = moshi.f(TextAtom.class, m11, "price");
        this.largeButtonAdapter = moshi.f(ButtonV3Atom.LargeButton.class, m11, "actionButton");
    }

    @NotNull
    public String toString() {
        return b.c(40, "GeneratedJsonAdapter(HotelsMapCardV1DTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public HotelsMapCardV1DTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        Icon icon = null;
        TextAtom textAtom = null;
        TextAtom textAtom2 = null;
        TextAtom textAtom3 = null;
        TextAtom textAtom4 = null;
        ButtonV3Atom.LargeButton largeButton = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    icon = this.nullableIconAdapter.fromJson(reader);
                    break;
                case 1:
                    textAtom = this.textAtomAdapter.fromJson(reader);
                    if (textAtom == null) {
                        throw c.q(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
                    }
                    break;
                case 2:
                    textAtom2 = this.textAtomAdapter.fromJson(reader);
                    if (textAtom2 == null) {
                        throw c.q(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
                    }
                    break;
                case 3:
                    textAtom3 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 4:
                    textAtom4 = this.nullableTextAtomAdapter.fromJson(reader);
                    break;
                case 5:
                    largeButton = this.largeButtonAdapter.fromJson(reader);
                    if (largeButton == null) {
                        throw c.q("actionButton", "actionButton", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (textAtom == null) {
            throw c.j(AppMeasurementSdk.ConditionalUserProperty.NAME, AppMeasurementSdk.ConditionalUserProperty.NAME, reader);
        }
        if (textAtom2 == null) {
            throw c.j(FormPageDTO.Field.FIELD_TYPE_ADDRESS, FormPageDTO.Field.FIELD_TYPE_ADDRESS, reader);
        }
        if (largeButton != null) {
            return new HotelsMapCardV1DTO(icon, textAtom, textAtom2, textAtom3, textAtom4, largeButton);
        }
        throw c.j("actionButton", "actionButton", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, HotelsMapCardV1DTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("icon");
        this.nullableIconAdapter.mo44toJson(writer, (x) value.getIcon());
        writer.w(AppMeasurementSdk.ConditionalUserProperty.NAME);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getName());
        writer.w(FormPageDTO.Field.FIELD_TYPE_ADDRESS);
        this.textAtomAdapter.mo44toJson(writer, (x) value.getAddress());
        writer.w("price");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("priceDescription");
        this.nullableTextAtomAdapter.mo44toJson(writer, (x) value.getPriceDescription());
        writer.w("actionButton");
        this.largeButtonAdapter.mo44toJson(writer, (x) value.getActionButton());
        writer.p();
    }
}
