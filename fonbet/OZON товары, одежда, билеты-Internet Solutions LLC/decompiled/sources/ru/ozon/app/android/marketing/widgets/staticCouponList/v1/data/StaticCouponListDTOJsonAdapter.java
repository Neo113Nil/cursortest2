package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data;

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
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListDTO;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;

@Metadata(d1 = {"\u0000V\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00190\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0018R\u001c\u0010\u001c\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0018R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0018R\u001a\u0010 \u001a\b\u0012\u0004\u0012\u00020\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0018¨\u0006!"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "stringAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "counterAdapter", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Coupon;", "nullableCouponAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "commonControlSettingsAdapter", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$WordDeclension;", "wordDeclensionAdapter", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListDTOJsonAdapter extends JsonAdapter<StaticCouponListDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<CommonControlSettings> commonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<StaticCouponListDTO.Counter> counterAdapter;

    @NotNull
    private final JsonAdapter<StaticCouponListDTO.Coupon> nullableCouponAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<String> stringAdapter;

    @NotNull
    private final JsonAdapter<StaticCouponListDTO.WordDeclension> wordDeclensionAdapter;

    public StaticCouponListDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("bgImage", "fgImage", "counter", "coupon1", "coupon2", "common", "wordDeclension");
        M m11 = M.f71699a;
        this.stringAdapter = moshi.f(String.class, m11, "bgImage");
        this.counterAdapter = moshi.f(StaticCouponListDTO.Counter.class, m11, "counter");
        this.nullableCouponAdapter = moshi.f(StaticCouponListDTO.Coupon.class, m11, "coupon1");
        this.commonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.wordDeclensionAdapter = moshi.f(StaticCouponListDTO.WordDeclension.class, m11, "wordDeclension");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(StaticCouponListDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public StaticCouponListDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        String str = null;
        String str2 = null;
        StaticCouponListDTO.Counter counter = null;
        StaticCouponListDTO.Coupon coupon = null;
        StaticCouponListDTO.Coupon coupon2 = null;
        CommonControlSettings commonControlSettings = null;
        StaticCouponListDTO.WordDeclension wordDeclension = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    str = this.stringAdapter.fromJson(reader);
                    if (str == null) {
                        throw c.q("bgImage", "bgImage", reader);
                    }
                    break;
                case 1:
                    str2 = this.stringAdapter.fromJson(reader);
                    if (str2 == null) {
                        throw c.q("fgImage", "fgImage", reader);
                    }
                    break;
                case 2:
                    counter = this.counterAdapter.fromJson(reader);
                    if (counter == null) {
                        throw c.q("counter", "counter", reader);
                    }
                    break;
                case 3:
                    coupon = this.nullableCouponAdapter.fromJson(reader);
                    break;
                case 4:
                    coupon2 = this.nullableCouponAdapter.fromJson(reader);
                    break;
                case 5:
                    commonControlSettings = this.commonControlSettingsAdapter.fromJson(reader);
                    if (commonControlSettings == null) {
                        throw c.q("common", "common", reader);
                    }
                    break;
                case 6:
                    wordDeclension = this.wordDeclensionAdapter.fromJson(reader);
                    if (wordDeclension == null) {
                        throw c.q("wordDeclension", "wordDeclension", reader);
                    }
                    break;
            }
        }
        reader.endObject();
        if (str == null) {
            throw c.j("bgImage", "bgImage", reader);
        }
        if (str2 == null) {
            throw c.j("fgImage", "fgImage", reader);
        }
        if (counter == null) {
            throw c.j("counter", "counter", reader);
        }
        if (commonControlSettings == null) {
            throw c.j("common", "common", reader);
        }
        if (wordDeclension != null) {
            return new StaticCouponListDTO(str, str2, counter, coupon, coupon2, commonControlSettings, wordDeclension);
        }
        throw c.j("wordDeclension", "wordDeclension", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, StaticCouponListDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("bgImage");
        this.stringAdapter.mo44toJson(writer, (x) value.getBgImage());
        writer.w("fgImage");
        this.stringAdapter.mo44toJson(writer, (x) value.getFgImage());
        writer.w("counter");
        this.counterAdapter.mo44toJson(writer, (x) value.getCounter());
        writer.w("coupon1");
        this.nullableCouponAdapter.mo44toJson(writer, (x) value.getCoupon1());
        writer.w("coupon2");
        this.nullableCouponAdapter.mo44toJson(writer, (x) value.getCoupon2());
        writer.w("common");
        this.commonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("wordDeclension");
        this.wordDeclensionAdapter.mo44toJson(writer, (x) value.getWordDeclension());
        writer.p();
    }
}
