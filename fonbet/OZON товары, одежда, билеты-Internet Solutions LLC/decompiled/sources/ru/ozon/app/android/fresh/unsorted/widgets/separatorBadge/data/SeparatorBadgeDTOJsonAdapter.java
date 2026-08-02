package ru.ozon.app.android.fresh.unsorted.widgets.separatorBadge.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.uni.atoms.data.cell.CommonCellSettings;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;

@Metadata(d1 = {"\u0000\\\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001a\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001a\u0010\u0019R\u001a\u0010\u001c\u001a\b\u0012\u0004\u0012\u00020\u001b0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001c\u0010\u0019R(\u0010\u001f\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u001e\u0018\u00010\u001d0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001e\u0010!\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010 8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b!\u0010\"¨\u0006#"}, d2 = {"Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/data/SeparatorBadgeDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/data/SeparatorBadgeDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/data/SeparatorBadgeDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/fresh/unsorted/widgets/separatorBadge/data/SeparatorBadgeDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "badgeDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/cell/CommonCellSettings$LayoutPadding;", "layoutPaddingAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "widgets-unsorted_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class SeparatorBadgeDTOJsonAdapter extends JsonAdapter<SeparatorBadgeDTO> {
    public static final int $stable = 8;

    @NotNull
    private final JsonAdapter<BadgeDTO> badgeDTOAdapter;
    private volatile Constructor<SeparatorBadgeDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CommonCellSettings.LayoutPadding> layoutPaddingAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public SeparatorBadgeDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("badge", "backgroundColor", "horizontalPadding", "topPadding", "bottomPadding", "trackingInfo");
        M m11 = M.f71699a;
        this.badgeDTOAdapter = moshi.f(BadgeDTO.class, m11, "badge");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.layoutPaddingAdapter = moshi.f(CommonCellSettings.LayoutPadding.class, m11, "horizontalPadding");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(39, "GeneratedJsonAdapter(SeparatorBadgeDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public SeparatorBadgeDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        BadgeDTO badgeDTO = null;
        String str = null;
        CommonCellSettings.LayoutPadding layoutPadding = null;
        CommonCellSettings.LayoutPadding layoutPadding2 = null;
        CommonCellSettings.LayoutPadding layoutPadding3 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    badgeDTO = this.badgeDTOAdapter.fromJson(reader);
                    if (badgeDTO == null) {
                        throw c.q("badge", "badge", reader);
                    }
                    break;
                case 1:
                    str = this.nullableStringAdapter.fromJson(reader);
                    i11 &= -3;
                    break;
                case 2:
                    layoutPadding = this.layoutPaddingAdapter.fromJson(reader);
                    if (layoutPadding == null) {
                        throw c.q("horizontalPadding", "horizontalPadding", reader);
                    }
                    i11 &= -5;
                    break;
                case 3:
                    layoutPadding2 = this.layoutPaddingAdapter.fromJson(reader);
                    if (layoutPadding2 == null) {
                        throw c.q("topPadding", "topPadding", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    layoutPadding3 = this.layoutPaddingAdapter.fromJson(reader);
                    if (layoutPadding3 == null) {
                        throw c.q("bottomPadding", "bottomPadding", reader);
                    }
                    i11 &= -17;
                    break;
                case 5:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    i11 &= -33;
                    break;
            }
        }
        reader.endObject();
        if (i11 == -63) {
            String str2 = str;
            BadgeDTO badgeDTO2 = badgeDTO;
            if (badgeDTO2 == null) {
                throw c.j("badge", "badge", reader);
            }
            Intrinsics.g(layoutPadding, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding");
            Intrinsics.g(layoutPadding2, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding");
            Intrinsics.g(layoutPadding3, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.cell.CommonCellSettings.LayoutPadding");
            Map<String, TokenizedTrackingInfo> map2 = map;
            return new SeparatorBadgeDTO(badgeDTO2, str2, layoutPadding, layoutPadding2, layoutPadding3, map2);
        }
        String str3 = str;
        BadgeDTO badgeDTO3 = badgeDTO;
        Constructor<SeparatorBadgeDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = SeparatorBadgeDTO.class.getDeclaredConstructor(BadgeDTO.class, String.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, CommonCellSettings.LayoutPadding.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<SeparatorBadgeDTO> constructor2 = constructor;
        if (badgeDTO3 == null) {
            throw c.j("badge", "badge", reader);
        }
        SeparatorBadgeDTO newInstance = constructor2.newInstance(badgeDTO3, str3, layoutPadding, layoutPadding2, layoutPadding3, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, SeparatorBadgeDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("badge");
        this.badgeDTOAdapter.mo44toJson(writer, (x) value.getBadge());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("horizontalPadding");
        this.layoutPaddingAdapter.mo44toJson(writer, (x) value.getHorizontalPadding());
        writer.w("topPadding");
        this.layoutPaddingAdapter.mo44toJson(writer, (x) value.getTopPadding());
        writer.w("bottomPadding");
        this.layoutPaddingAdapter.mo44toJson(writer, (x) value.getBottomPadding());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
