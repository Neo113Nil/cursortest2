package ru.ozon.id.nativeauth.credentials.countryCode;

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
import ru.ozon.id.nativeauth.credentials.countryCode.PhoneCodeCountrySelectDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R \u0010\u001c\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001b0\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019¨\u0006\u001d"}, d2 = {"Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO$NavBar;", "navBarAdapter", "Lcom/squareup/moshi/JsonAdapter;", "", "Lru/ozon/id/nativeauth/credentials/countryCode/PhoneCodeCountrySelectDTO$CountrySelect;", "listOfCountrySelectAdapter", "ozon-id-sdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class PhoneCodeCountrySelectDTOJsonAdapter extends JsonAdapter<PhoneCodeCountrySelectDTO> {

    @NotNull
    private final JsonAdapter<List<PhoneCodeCountrySelectDTO.CountrySelect>> listOfCountrySelectAdapter;

    @NotNull
    private final JsonAdapter<PhoneCodeCountrySelectDTO.NavBar> navBarAdapter;

    @NotNull
    private final n.a options;

    public PhoneCodeCountrySelectDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("navBar", "countrySelect");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<PhoneCodeCountrySelectDTO.NavBar> f7 = moshi.f(PhoneCodeCountrySelectDTO.NavBar.class, m11, "navBar");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.navBarAdapter = f7;
        JsonAdapter<List<PhoneCodeCountrySelectDTO.CountrySelect>> f11 = moshi.f(D.e(List.class, PhoneCodeCountrySelectDTO.CountrySelect.class), m11, "countrySelect");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.listOfCountrySelectAdapter = f11;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(47, "GeneratedJsonAdapter(PhoneCodeCountrySelectDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PhoneCodeCountrySelectDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        PhoneCodeCountrySelectDTO.NavBar navBar = null;
        List<PhoneCodeCountrySelectDTO.CountrySelect> list = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                navBar = this.navBarAdapter.fromJson(reader);
                if (navBar == null) {
                    throw Y9.c.q("navBar", "navBar", reader);
                }
            } else if (v11 == 1 && (list = this.listOfCountrySelectAdapter.fromJson(reader)) == null) {
                throw Y9.c.q("countrySelect", "countrySelect", reader);
            }
        }
        reader.endObject();
        if (navBar == null) {
            throw Y9.c.j("navBar", "navBar", reader);
        }
        if (list != null) {
            return new PhoneCodeCountrySelectDTO(navBar, list);
        }
        throw Y9.c.j("countrySelect", "countrySelect", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PhoneCodeCountrySelectDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("navBar");
        this.navBarAdapter.mo44toJson(writer, (x) value_.getNavBar());
        writer.w("countrySelect");
        this.listOfCountrySelectAdapter.mo44toJson(writer, (x) value_.getCountrySelect());
        writer.p();
    }
}
