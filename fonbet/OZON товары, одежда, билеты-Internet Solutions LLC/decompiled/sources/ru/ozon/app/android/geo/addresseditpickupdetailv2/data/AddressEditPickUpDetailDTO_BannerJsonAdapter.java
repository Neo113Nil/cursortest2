package ru.ozon.app.android.geo.addresseditpickupdetailv2.data;

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
import ru.ozon.app.android.atoms.data.deprecated.CommonText;
import ru.ozon.app.android.geo.addresseditpickupdetailv2.data.AddressEditPickUpDetailDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO_BannerJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/geo/addresseditpickupdetailv2/data/AddressEditPickUpDetailDTO$Banner;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/atoms/data/deprecated/CommonText$TextMedium;", "textMediumAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "listOfAtomDTOAdapter", "stringAdapter", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressEditPickUpDetailDTO_BannerJsonAdapter extends JsonAdapter<AddressEditPickUpDetailDTO.Banner> {

    @NotNull
    private final JsonAdapter<List<AtomDTO>> listOfAtomDTOAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<CommonText.TextMedium> textMediumAdapter;

    public AddressEditPickUpDetailDTO_BannerJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("dueDate", "marketingInfo", "elements", "borderColor", "coverImage");
        M m11 = M.f71699a;
        this.textMediumAdapter = moshi.f(CommonText.TextMedium.class, m11, "dueDate");
        this.listOfAtomDTOAdapter = moshi.f(D.e(List.class, AtomDTO.class), m11, "elements");
        this.stringAdapter = moshi.f(String.class, m11, "borderColor");
    }

    @NotNull
    public String toString() {
        return b.c(55, "GeneratedJsonAdapter(AddressEditPickUpDetailDTO.Banner)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public AddressEditPickUpDetailDTO.Banner fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        CommonText.TextMedium textMedium = null;
        CommonText.TextMedium textMedium2 = null;
        List<AtomDTO> list = null;
        String str = null;
        String str2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                textMedium = this.textMediumAdapter.fromJson(reader);
                if (textMedium == null) {
                    throw c.q("dueDate", "dueDate", reader);
                }
            } else if (v11 == 1) {
                textMedium2 = this.textMediumAdapter.fromJson(reader);
                if (textMedium2 == null) {
                    throw c.q("marketingInfo", "marketingInfo", reader);
                }
            } else if (v11 == 2) {
                list = this.listOfAtomDTOAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("elements", "elements", reader);
                }
            } else if (v11 == 3) {
                str = this.stringAdapter.fromJson(reader);
                if (str == null) {
                    throw c.q("borderColor", "borderColor", reader);
                }
            } else if (v11 == 4 && (str2 = this.stringAdapter.fromJson(reader)) == null) {
                throw c.q("coverImage", "coverImage", reader);
            }
        }
        reader.endObject();
        if (textMedium == null) {
            throw c.j("dueDate", "dueDate", reader);
        }
        if (textMedium2 == null) {
            throw c.j("marketingInfo", "marketingInfo", reader);
        }
        if (list == null) {
            throw c.j("elements", "elements", reader);
        }
        if (str == null) {
            throw c.j("borderColor", "borderColor", reader);
        }
        if (str2 != null) {
            return new AddressEditPickUpDetailDTO.Banner(textMedium, textMedium2, list, str, str2);
        }
        throw c.j("coverImage", "coverImage", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, AddressEditPickUpDetailDTO.Banner value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("dueDate");
        this.textMediumAdapter.mo44toJson(writer, (x) value.getDueDate());
        writer.w("marketingInfo");
        this.textMediumAdapter.mo44toJson(writer, (x) value.getMarketingInfo());
        writer.w("elements");
        this.listOfAtomDTOAdapter.mo44toJson(writer, (x) value.getElements());
        writer.w("borderColor");
        this.stringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("coverImage");
        this.stringAdapter.mo44toJson(writer, (x) value.getCoverImage());
        writer.p();
    }
}
