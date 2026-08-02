package ru.ozon.android.messenger.blocks.coupon;

import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;

@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019¨\u0006\""}, d2 = {"Lru/ozon/android/messenger/blocks/coupon/CouponDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/coupon/CouponDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/android/messenger/blocks/coupon/CouponDTO;", "Lcom/squareup/moshi/x;", "writer", "value_", "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/android/messenger/blocks/coupon/CouponDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/android/messenger/blocks/coupon/LeftPartDTO;", "leftPartDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/android/messenger/blocks/coupon/RightPartDTO;", "rightPartDTOAdapter", "Lru/ozon/android/messenger/blocks/coupon/ImageDTO;", "nullableImageDTOAdapter", "", "nullableMapOfStringStringAdapter", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "nullableMapOfStringMessengerTrackingInfoAdapter", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class CouponDTOJsonAdapter extends JsonAdapter<CouponDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<LeftPartDTO> leftPartDTOAdapter;

    @NotNull
    private final JsonAdapter<ImageDTO> nullableImageDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, MessengerTrackingInfo>> nullableMapOfStringMessengerTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<Map<String, String>> nullableMapOfStringStringAdapter;

    @NotNull
    private final n.a options;

    @NotNull
    private final JsonAdapter<RightPartDTO> rightPartDTOAdapter;

    public CouponDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        n.a a11 = n.a.C0918a.a("leftPart", "rightPart", "image", "lexemes", "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(a11, "of(...)");
        this.options = a11;
        M m11 = M.f71699a;
        JsonAdapter<LeftPartDTO> f7 = moshi.f(LeftPartDTO.class, m11, "leftPart");
        Intrinsics.checkNotNullExpressionValue(f7, "adapter(...)");
        this.leftPartDTOAdapter = f7;
        JsonAdapter<RightPartDTO> f11 = moshi.f(RightPartDTO.class, m11, "rightPart");
        Intrinsics.checkNotNullExpressionValue(f11, "adapter(...)");
        this.rightPartDTOAdapter = f11;
        JsonAdapter<ImageDTO> f12 = moshi.f(ImageDTO.class, m11, "image");
        Intrinsics.checkNotNullExpressionValue(f12, "adapter(...)");
        this.nullableImageDTOAdapter = f12;
        JsonAdapter<Map<String, String>> f13 = moshi.f(D.e(Map.class, String.class, String.class), m11, "lexemes");
        Intrinsics.checkNotNullExpressionValue(f13, "adapter(...)");
        this.nullableMapOfStringStringAdapter = f13;
        JsonAdapter<Map<String, MessengerTrackingInfo>> f14 = moshi.f(D.e(Map.class, String.class, MessengerTrackingInfo.class), m11, "trackingInfo");
        Intrinsics.checkNotNullExpressionValue(f14, "adapter(...)");
        this.nullableMapOfStringMessengerTrackingInfoAdapter = f14;
    }

    @NotNull
    public String toString() {
        return Ak.b.c(31, "GeneratedJsonAdapter(CouponDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public CouponDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        LeftPartDTO leftPartDTO = null;
        RightPartDTO rightPartDTO = null;
        ImageDTO imageDTO = null;
        Map<String, String> map = null;
        Map<String, MessengerTrackingInfo> map2 = null;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                leftPartDTO = this.leftPartDTOAdapter.fromJson(reader);
                if (leftPartDTO == null) {
                    throw Y9.c.q("leftPart", "leftPart", reader);
                }
            } else if (v11 == 1) {
                rightPartDTO = this.rightPartDTOAdapter.fromJson(reader);
                if (rightPartDTO == null) {
                    throw Y9.c.q("rightPart", "rightPart", reader);
                }
            } else if (v11 == 2) {
                imageDTO = this.nullableImageDTOAdapter.fromJson(reader);
            } else if (v11 == 3) {
                map = this.nullableMapOfStringStringAdapter.fromJson(reader);
            } else if (v11 == 4) {
                map2 = this.nullableMapOfStringMessengerTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (leftPartDTO == null) {
            throw Y9.c.j("leftPart", "leftPart", reader);
        }
        if (rightPartDTO != null) {
            return new CouponDTO(leftPartDTO, rightPartDTO, imageDTO, map, map2);
        }
        throw Y9.c.j("rightPart", "rightPart", reader);
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, CouponDTO value_) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value_ == null) {
            throw new NullPointerException("value_ was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftPart");
        this.leftPartDTOAdapter.mo44toJson(writer, (x) value_.getLeftPart());
        writer.w("rightPart");
        this.rightPartDTOAdapter.mo44toJson(writer, (x) value_.getRightPart());
        writer.w("image");
        this.nullableImageDTOAdapter.mo44toJson(writer, (x) value_.getImage());
        writer.w("lexemes");
        this.nullableMapOfStringStringAdapter.mo44toJson(writer, (x) value_.getLexemes());
        writer.w("trackingInfo");
        this.nullableMapOfStringMessengerTrackingInfoAdapter.mo44toJson(writer, (x) value_.getTrackingInfo());
        writer.p();
    }
}
