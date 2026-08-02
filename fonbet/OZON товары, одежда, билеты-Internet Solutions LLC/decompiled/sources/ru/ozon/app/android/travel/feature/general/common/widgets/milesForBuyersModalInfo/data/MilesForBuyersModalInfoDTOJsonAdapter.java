package ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data;

import Ak.b;
import Y9.c;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import com.squareup.moshi.D;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.x;
import java.lang.reflect.Constructor;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.M;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoDTO;

@Metadata(d1 = {"\u0000f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0001\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u000f\u0012\u0006\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\b\u001a\u00020\u0007H\u0016¢\u0006\u0004\b\b\u0010\tJ\u0017\u0010\f\u001a\u00020\u00022\u0006\u0010\u000b\u001a\u00020\nH\u0016¢\u0006\u0004\b\f\u0010\rJ!\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u000f\u001a\u00020\u000e2\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013R\u0014\u0010\u0015\u001a\u00020\u00148\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001c\u0010\u001b\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u001a0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010\u0019R \u0010\u001e\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u001c0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010\u0019R(\u0010!\u001a\u0016\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020 \u0018\u00010\u001f0\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b!\u0010\u0019R\u001e\u0010#\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\"8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b#\u0010$¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTOJsonAdapter;", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "toString", "()Ljava/lang/String;", "Lcom/squareup/moshi/n;", "reader", "fromJson", "(Lcom/squareup/moshi/n;)Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO;", "Lcom/squareup/moshi/x;", "writer", AppMeasurementSdk.ConditionalUserProperty.VALUE, "", "toJson", "(Lcom/squareup/moshi/x;Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO;)V", "Lcom/squareup/moshi/n$a;", "options", "Lcom/squareup/moshi/n$a;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ContentContainerDTO;", "contentContainerDTOAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$HeaderImageDTO;", "nullableHeaderImageDTOAdapter", "", "Lru/ozon/app/android/travel/feature/general/common/widgets/milesForBuyersModalInfo/data/MilesForBuyersModalInfoDTO$ButtonWrapper;", "listOfButtonWrapperAdapter", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "nullableMapOfStringTokenizedTrackingInfoAdapter", "Ljava/lang/reflect/Constructor;", "constructorRef", "Ljava/lang/reflect/Constructor;", "common_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class MilesForBuyersModalInfoDTOJsonAdapter extends JsonAdapter<MilesForBuyersModalInfoDTO> {
    public static final int $stable = 8;
    private volatile Constructor<MilesForBuyersModalInfoDTO> constructorRef;

    @NotNull
    private final JsonAdapter<MilesForBuyersModalInfoDTO.ContentContainerDTO> contentContainerDTOAdapter;

    @NotNull
    private final JsonAdapter<List<MilesForBuyersModalInfoDTO.ButtonWrapper>> listOfButtonWrapperAdapter;

    @NotNull
    private final JsonAdapter<MilesForBuyersModalInfoDTO.HeaderImageDTO> nullableHeaderImageDTOAdapter;

    @NotNull
    private final JsonAdapter<Map<String, TokenizedTrackingInfo>> nullableMapOfStringTokenizedTrackingInfoAdapter;

    @NotNull
    private final n.a options;

    public MilesForBuyersModalInfoDTOJsonAdapter(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        this.options = n.a.C0918a.a("headerContainer", "image", "bodyContainer", "stickyButtons", "trackingInfo");
        M m11 = M.f71699a;
        this.contentContainerDTOAdapter = moshi.f(MilesForBuyersModalInfoDTO.ContentContainerDTO.class, m11, "headerContainer");
        this.nullableHeaderImageDTOAdapter = moshi.f(MilesForBuyersModalInfoDTO.HeaderImageDTO.class, m11, "image");
        this.listOfButtonWrapperAdapter = moshi.f(D.e(List.class, MilesForBuyersModalInfoDTO.ButtonWrapper.class), m11, "stickyButtons");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter = moshi.f(D.e(Map.class, String.class, TokenizedTrackingInfo.class), m11, "trackingInfo");
    }

    @NotNull
    public String toString() {
        return b.c(48, "GeneratedJsonAdapter(MilesForBuyersModalInfoDTO)", "toString(...)");
    }

    @Override // com.squareup.moshi.JsonAdapter
    @NotNull
    public MilesForBuyersModalInfoDTO fromJson(@NotNull n reader) {
        Intrinsics.checkNotNullParameter(reader, "reader");
        reader.beginObject();
        MilesForBuyersModalInfoDTO.ContentContainerDTO contentContainerDTO = null;
        MilesForBuyersModalInfoDTO.HeaderImageDTO headerImageDTO = null;
        MilesForBuyersModalInfoDTO.ContentContainerDTO contentContainerDTO2 = null;
        List<MilesForBuyersModalInfoDTO.ButtonWrapper> list = null;
        Map<String, TokenizedTrackingInfo> map = null;
        int i11 = -1;
        while (reader.hasNext()) {
            int v11 = reader.v(this.options);
            if (v11 == -1) {
                reader.y();
                reader.skipValue();
            } else if (v11 == 0) {
                contentContainerDTO = this.contentContainerDTOAdapter.fromJson(reader);
                if (contentContainerDTO == null) {
                    throw c.q("headerContainer", "headerContainer", reader);
                }
            } else if (v11 == 1) {
                headerImageDTO = this.nullableHeaderImageDTOAdapter.fromJson(reader);
            } else if (v11 == 2) {
                contentContainerDTO2 = this.contentContainerDTOAdapter.fromJson(reader);
                if (contentContainerDTO2 == null) {
                    throw c.q("bodyContainer", "bodyContainer", reader);
                }
            } else if (v11 == 3) {
                list = this.listOfButtonWrapperAdapter.fromJson(reader);
                if (list == null) {
                    throw c.q("stickyButtons", "stickyButtons", reader);
                }
                i11 = -9;
            } else if (v11 == 4) {
                map = this.nullableMapOfStringTokenizedTrackingInfoAdapter.fromJson(reader);
            }
        }
        reader.endObject();
        if (i11 == -9) {
            MilesForBuyersModalInfoDTO.ContentContainerDTO contentContainerDTO3 = contentContainerDTO2;
            MilesForBuyersModalInfoDTO.HeaderImageDTO headerImageDTO2 = headerImageDTO;
            MilesForBuyersModalInfoDTO.ContentContainerDTO contentContainerDTO4 = contentContainerDTO;
            if (contentContainerDTO4 == null) {
                throw c.j("headerContainer", "headerContainer", reader);
            }
            if (contentContainerDTO3 == null) {
                throw c.j("bodyContainer", "bodyContainer", reader);
            }
            Intrinsics.g(list, "null cannot be cast to non-null type kotlin.collections.List<ru.ozon.app.android.travel.feature.general.common.widgets.milesForBuyersModalInfo.data.MilesForBuyersModalInfoDTO.ButtonWrapper>");
            return new MilesForBuyersModalInfoDTO(contentContainerDTO4, headerImageDTO2, contentContainerDTO3, list, map);
        }
        MilesForBuyersModalInfoDTO.ContentContainerDTO contentContainerDTO5 = contentContainerDTO2;
        MilesForBuyersModalInfoDTO.HeaderImageDTO headerImageDTO3 = headerImageDTO;
        MilesForBuyersModalInfoDTO.ContentContainerDTO contentContainerDTO6 = contentContainerDTO;
        Constructor<MilesForBuyersModalInfoDTO> constructor = this.constructorRef;
        if (constructor == null) {
            constructor = MilesForBuyersModalInfoDTO.class.getDeclaredConstructor(MilesForBuyersModalInfoDTO.ContentContainerDTO.class, MilesForBuyersModalInfoDTO.HeaderImageDTO.class, MilesForBuyersModalInfoDTO.ContentContainerDTO.class, List.class, Map.class, Integer.TYPE, c.f34864d);
            this.constructorRef = constructor;
            Intrinsics.checkNotNullExpressionValue(constructor, "also(...)");
        }
        Constructor<MilesForBuyersModalInfoDTO> constructor2 = constructor;
        if (contentContainerDTO6 == null) {
            throw c.j("headerContainer", "headerContainer", reader);
        }
        if (contentContainerDTO5 == null) {
            throw c.j("bodyContainer", "bodyContainer", reader);
        }
        MilesForBuyersModalInfoDTO newInstance = constructor2.newInstance(contentContainerDTO6, headerImageDTO3, contentContainerDTO5, list, map, Integer.valueOf(i11), null);
        Intrinsics.checkNotNullExpressionValue(newInstance, "newInstance(...)");
        return newInstance;
    }

    @Override // com.squareup.moshi.JsonAdapter
    /* renamed from: toJson, reason: avoid collision after fix types in other method and merged with bridge method [inline-methods] */
    public void mo44toJson(@NotNull x writer, MilesForBuyersModalInfoDTO value) {
        Intrinsics.checkNotNullParameter(writer, "writer");
        if (value == null) {
            throw new NullPointerException("value was null! Wrap in .nullSafe() to write nullable values.");
        }
        writer.j();
        writer.w("headerContainer");
        this.contentContainerDTOAdapter.mo44toJson(writer, (x) value.getHeaderContainer());
        writer.w("image");
        this.nullableHeaderImageDTOAdapter.mo44toJson(writer, (x) value.getImage());
        writer.w("bodyContainer");
        this.contentContainerDTOAdapter.mo44toJson(writer, (x) value.getBodyContainer());
        writer.w("stickyButtons");
        this.listOfButtonWrapperAdapter.mo44toJson(writer, (x) value.getStickyButtons());
        writer.w("trackingInfo");
        this.nullableMapOfStringTokenizedTrackingInfoAdapter.mo44toJson(writer, (x) value.getTrackingInfo());
        writer.p();
    }
}
