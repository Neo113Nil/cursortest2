package ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data;

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
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data.BannerWithActionDTO;
import ru.ozon.uni.atoms.data.common.CornerRadius;
import ru.ozon.uni.atoms.data.controls.CommonControlSettings;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback;

@Metadata(d1 = {"\u0000v\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R\u001c\u0010\u001d\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010\u0019R\u001a\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\u001e0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001f\u0010\u0019R\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00070\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010\u0019R\u001c\u0010\"\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010!0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\"\u0010\u0019R\u001a\u0010$\u001a\b\u0012\u0004\u0012\u00020#0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b$\u0010\u0019R(\u0010'\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020&\u0018\u00010%0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010\u0019R\u001e\u0010)\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010(8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b)\u0010*¨\u0006+"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$LeftBlockDTO;", "leftBlockDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$RightBlockDTO;", "nullableRightBlockDTOAdapter", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "nullableIconButtonV3DTOAdapter", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadiusAtEnumNullFallbackAdapter", "nullableStringAdapter", "Lru/ozon/uni/atoms/data/controls/CommonControlSettings;", "nullableCommonControlSettingsAdapter", "Lru/ozon/app/android/travel/feature/general/common/widgets/bannerWithAction/v1/data/BannerWithActionDTO$Margins;", "marginsAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class BannerWithActionDTOJsonAdapter extends JsonAdapter<BannerWithActionDTO> {
    public static final int $stable = 8;
    private volatile Constructor<BannerWithActionDTO> constructorRef;

    @NotNull
    private final JsonAdapter<CornerRadius> cornerRadiusAtEnumNullFallbackAdapter;

    @NotNull
    private final JsonAdapter<BannerWithActionDTO.LeftBlockDTO> leftBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<BannerWithActionDTO.Margins> marginsAdapter;

    @NotNull
    private final JsonAdapter<CommonControlSettings> nullableCommonControlSettingsAdapter;

    @NotNull
    private final JsonAdapter<IconButtonV3DTO> nullableIconButtonV3DTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final JsonAdapter<BannerWithActionDTO.RightBlockDTO> nullableRightBlockDTOAdapter;

    @NotNull
    private final JsonAdapter<String> nullableStringAdapter;

    @NotNull
    private final n.a options;

    public BannerWithActionDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("leftBlock", "rightBlock", "closeButton", "cornerRadius", "backgroundColor", "borderColor", "common", "margins", "viewTracking");
        M m11 = M.f71699a;
        this.leftBlockDTOAdapter = moshi.f(BannerWithActionDTO.LeftBlockDTO.class, m11, "leftBlock");
        this.nullableRightBlockDTOAdapter = moshi.f(BannerWithActionDTO.RightBlockDTO.class, m11, "rightBlock");
        this.nullableIconButtonV3DTOAdapter = moshi.f(IconButtonV3DTO.class, m11, "closeButton");
        this.cornerRadiusAtEnumNullFallbackAdapter = moshi.f(CornerRadius.class, e0.h(new EnumNullFallback() { // from class: ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data.BannerWithActionDTOJsonAdapter$annotationImpl$ru_ozon_uni_atoms_parsing_adapter_annotation_EnumNullFallback$0
            @Override // java.lang.annotation.Annotation
            public final /* synthetic */ Class annotationType() {
                return EnumNullFallback.class;
            }

            @Override // java.lang.annotation.Annotation
            public final boolean equals(Object obj) {
                return obj instanceof EnumNullFallback;
            }

            @Override // java.lang.annotation.Annotation
            public final int hashCode() {
                return 0;
            }

            @Override // java.lang.annotation.Annotation
            @NotNull
            public final String toString() {
                return "@ru.ozon.uni.atoms.parsing.adapter.annotation.EnumNullFallback()";
            }
        }), "cornerRadius");
        this.nullableStringAdapter = moshi.f(String.class, m11, "backgroundColor");
        this.nullableCommonControlSettingsAdapter = moshi.f(CommonControlSettings.class, m11, "common");
        this.marginsAdapter = moshi.f(BannerWithActionDTO.Margins.class, m11, "margins");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "viewTracking");
    }

    @NotNull
    public String toString() {
        return b.c(41, "GeneratedJsonAdapter(BannerWithActionDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public BannerWithActionDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        int i11 = -1;
        BannerWithActionDTO.LeftBlockDTO leftBlockDTO = null;
        BannerWithActionDTO.RightBlockDTO rightBlockDTO = null;
        IconButtonV3DTO iconButtonV3DTO = null;
        CornerRadius cornerRadius = null;
        String str = null;
        String str2 = null;
        CommonControlSettings commonControlSettings = null;
        BannerWithActionDTO.Margins margins = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (reader.hasNext()) {
            switch (reader.v(this.options)) {
                case -1:
                    reader.y();
                    reader.skipValue();
                    break;
                case 0:
                    leftBlockDTO = this.leftBlockDTOAdapter.fromJson(reader);
                    if (leftBlockDTO == null) {
                        throw c.q("leftBlock", "leftBlock", reader);
                    }
                    break;
                case 1:
                    rightBlockDTO = this.nullableRightBlockDTOAdapter.fromJson(reader);
                    break;
                case 2:
                    iconButtonV3DTO = this.nullableIconButtonV3DTOAdapter.fromJson(reader);
                    break;
                case 3:
                    cornerRadius = this.cornerRadiusAtEnumNullFallbackAdapter.fromJson(reader);
                    if (cornerRadius == null) {
                        throw c.q("cornerRadius", "cornerRadius", reader);
                    }
                    i11 &= -9;
                    break;
                case 4:
                    str = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 5:
                    str2 = this.nullableStringAdapter.fromJson(reader);
                    break;
                case 6:
                    commonControlSettings = this.nullableCommonControlSettingsAdapter.fromJson(reader);
                    break;
                case 7:
                    margins = this.marginsAdapter.fromJson(reader);
                    if (margins == null) {
                        throw c.q("margins", "margins", reader);
                    }
                    i11 &= -129;
                    break;
                case 8:
                    map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
                    break;
            }
        }
        reader.endObject();
        if (i11 == -137) {
            IconButtonV3DTO iconButtonV3DTO2 = iconButtonV3DTO;
            BannerWithActionDTO.RightBlockDTO rightBlockDTO2 = rightBlockDTO;
            BannerWithActionDTO.LeftBlockDTO leftBlockDTO2 = leftBlockDTO;
            if (leftBlockDTO2 == null) {
                throw c.j("leftBlock", "leftBlock", reader);
            }
            Intrinsics.g(cornerRadius, "null cannot be cast to non-null type ru.ozon.uni.atoms.data.common.CornerRadius");
            Intrinsics.g(margins, "null cannot be cast to non-null type ru.ozon.app.android.travel.feature.general.common.widgets.bannerWithAction.v1.data.BannerWithActionDTO.Margins");
            Map<String, TokenizedTrackingInfo> map2 = map;
            BannerWithActionDTO.Margins margins2 = margins;
            CommonControlSettings commonControlSettings2 = commonControlSettings;
            return new BannerWithActionDTO(leftBlockDTO2, rightBlockDTO2, iconButtonV3DTO2, cornerRadius, str, str2, commonControlSettings2, margins2, map2, null);
        }
        IconButtonV3DTO iconButtonV3DTO3 = iconButtonV3DTO;
        BannerWithActionDTO.RightBlockDTO rightBlockDTO3 = rightBlockDTO;
        BannerWithActionDTO.LeftBlockDTO leftBlockDTO3 = leftBlockDTO;
        Constructor<BannerWithActionDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = BannerWithActionDTO.class.getDeclaredConstructor(BannerWithActionDTO.LeftBlockDTO.class, BannerWithActionDTO.RightBlockDTO.class, IconButtonV3DTO.class, CornerRadius.class, String.class, String.class, CommonControlSettings.class, BannerWithActionDTO.Margins.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<BannerWithActionDTO> constructor2 = constructor;
        if (leftBlockDTO3 == null) {
            throw c.j("leftBlock", "leftBlock", reader);
        }
        BannerWithActionDTO newInstance = constructor2.newInstance(leftBlockDTO3, rightBlockDTO3, iconButtonV3DTO3, cornerRadius, str, str2, commonControlSettings, margins, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, BannerWithActionDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("leftBlock");
        this.leftBlockDTOAdapter.mo44toJson(writer, (x) value.getLeftBlock());
        writer.w("rightBlock");
        this.nullableRightBlockDTOAdapter.mo44toJson(writer, (x) value.m1187getRightBlockFuAqtFE());
        writer.w("closeButton");
        this.nullableIconButtonV3DTOAdapter.mo44toJson(writer, (x) value.getCloseButton());
        writer.w("cornerRadius");
        this.cornerRadiusAtEnumNullFallbackAdapter.mo44toJson(writer, (x) value.getCornerRadius());
        writer.w("backgroundColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBackgroundColor());
        writer.w("borderColor");
        this.nullableStringAdapter.mo44toJson(writer, (x) value.getBorderColor());
        writer.w("common");
        this.nullableCommonControlSettingsAdapter.mo44toJson(writer, (x) value.getCommon());
        writer.w("margins");
        this.marginsAdapter.mo44toJson(writer, (x) value.getMargins());
        writer.w("viewTracking");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getViewTracking());
        writer.p();
    }
}
