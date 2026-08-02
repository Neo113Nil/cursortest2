package ru.ozon.app.android.checkoutcomposer.premiumbannerdetails;

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
import ru.ozon.app.android.atoms.data.deprecated.BulletElements;
import ru.ozon.app.android.checkoutcomposer.premiumbannerdetails.PremiumBannerDetailsDTO;
import ru.ozon.app.android.ugc.core.widgets.commentsListV3.data.CommentV3DTO;
import ru.ozon.uni.atoms.data.deprecated.Button;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001c\u0010\u0017\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO_TariffJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "nullableStringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Header;", "headerAdapter", "Lru/ozon/app/android/checkoutcomposer/premiumbannerdetails/PremiumBannerDetailsDTO$Tariff$Prices;", "pricesAdapter", "Lru/ozon/app/android/atoms/data/deprecated/BulletElements;", "bulletElementsAdapter", "Lru/ozon/uni/atoms/data/deprecated/Button;", "buttonAdapter", "checkout_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class PremiumBannerDetailsDTO_TariffJsonAdapter extends JsonAdapter<PremiumBannerDetailsDTO.Tariff> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BulletElements> bulletElementsAdapter;

    @NotNull
    private final JsonAdapter<Button> buttonAdapter;

    @NotNull
    private final JsonAdapter<PremiumBannerDetailsDTO.Tariff.Header> headerAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<PremiumBannerDetailsDTO.Tariff.Prices> pricesAdapter;

    public PremiumBannerDetailsDTO_TariffJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badge", CommentV3DTO.HEADER_FIELD_NAME, "price", "benefits", "button");
        M m11 = M.f71699a;
        this.nullableStringAdapter = moshi.f(String.class, m11, "badge");
        this.headerAdapter = moshi.f(PremiumBannerDetailsDTO.Tariff.Header.class, m11, CommentV3DTO.HEADER_FIELD_NAME);
        this.pricesAdapter = moshi.f(PremiumBannerDetailsDTO.Tariff.Prices.class, m11, "price");
        this.bulletElementsAdapter = moshi.f(BulletElements.class, m11, "benefits");
        this.buttonAdapter = moshi.f(Button.class, m11, "button");
    }

    @NotNull
    public String toString() {
        return b.c(52, "GeneratedJsonAdapter(PremiumBannerDetailsDTO.Tariff)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public PremiumBannerDetailsDTO.Tariff fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        PremiumBannerDetailsDTO.Tariff.Header header = null;
        PremiumBannerDetailsDTO.Tariff.Prices prices = null;
        BulletElements bulletElements = null;
        Button button = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                str = this.nullableStringAdapter.fromJson(reader);
            } else if (v11 == 1) {
                header = this.headerAdapter.fromJson(reader);
                if (header == null) {
                    throw c.q("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
                }
            } else if (v11 == 2) {
                prices = this.pricesAdapter.fromJson(reader);
                if (prices == null) {
                    throw c.q("price", "price", reader);
                }
            } else if (v11 == 3) {
                bulletElements = this.bulletElementsAdapter.fromJson(reader);
                if (bulletElements == null) {
                    throw c.q("benefits", "benefits", reader);
                }
            } else if (v11 == 4 && (button = this.buttonAdapter.fromJson(reader)) == null) {
                throw c.q("button", "button", reader);
            }
        }
        reader.endObject();
        if (header == null) {
            throw c.j("header_", CommentV3DTO.HEADER_FIELD_NAME, reader);
        }
        if (prices == null) {
            throw c.j("price", "price", reader);
        }
        if (bulletElements == null) {
            throw c.j("benefits", "benefits", reader);
        }
        if (button != null) {
            return new PremiumBannerDetailsDTO.Tariff(str, header, prices, bulletElements, button);
        }
        throw c.j("button", "button", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, PremiumBannerDetailsDTO.Tariff value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badge");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w(CommentV3DTO.HEADER_FIELD_NAME);
        this.headerAdapter.mo44toJson(writer, (x) value.getHeader());
        writer.w("price");
        this.pricesAdapter.mo44toJson(writer, (x) value.getPrice());
        writer.w("benefits");
        this.bulletElementsAdapter.mo44toJson(writer, (x) value.getBenefits());
        writer.w("button");
        this.buttonAdapter.mo44toJson(writer, (x) value.getButton());
        writer.p();
    }
}
