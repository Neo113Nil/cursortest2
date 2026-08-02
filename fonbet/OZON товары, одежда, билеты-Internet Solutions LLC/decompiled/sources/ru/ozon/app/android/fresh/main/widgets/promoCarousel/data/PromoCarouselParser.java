package ru.ozon.app.android.fresh.main.widgets.promoCarousel.data;

import Xc.a;
import com.squareup.moshi.JsonAdapter;
import com.squareup.moshi.Moshi;
import com.squareup.moshi.n;
import com.squareup.moshi.p;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.composer.widgets.base.config.ParseException;
import ru.ozon.app.android.fresh.main.widgets.promoCarousel.data.PromoCarouselDTO;
import sf.C9681g;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0000\u0018\u00002\u00020\u0001B\u0011\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J$\u0010\n\u001a\u00020\t2\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\b\u0010\b\u001a\u0004\u0018\u00010\u0006H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bR\u0014\u0010\r\u001a\u00020\f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\r\u0010\u000eR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00100\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R\u001a\u0010\u0014\u001a\b\u0012\u0004\u0012\u00020\u00130\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0014\u0010\u0012R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u000f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010\u0012¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselParser;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselWidgetParser;", "Lcom/squareup/moshi/Moshi;", "moshi", "<init>", "(Lcom/squareup/moshi/Moshi;)V", "", "params", "state", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "invoke", "(Ljava/lang/String;Ljava/lang/String;)Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO;", "Lcom/squareup/moshi/n$a;", "jsonDTONames", "Lcom/squareup/moshi/n$a;", "Lcom/squareup/moshi/JsonAdapter;", "", "booleanJsonAdapter", "Lcom/squareup/moshi/JsonAdapter;", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselTrackingInfoDto;", "trackingJsonAdapter", "Lru/ozon/app/android/fresh/main/widgets/promoCarousel/data/PromoCarouselDTO$SectionDTO;", "sectionDTOJsonAdapter", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class PromoCarouselParser implements PromoCarouselWidgetParser {

    @NotNull
    private final JsonAdapter<Boolean> booleanJsonAdapter;

    @NotNull
    private final n.a jsonDTONames;

    @NotNull
    private final JsonAdapter<PromoCarouselDTO.SectionDTO> sectionDTOJsonAdapter;

    @NotNull
    private final JsonAdapter<PromoCarouselTrackingInfoDto> trackingJsonAdapter;

    public PromoCarouselParser(@NotNull Moshi moshi) {
        Intrinsics.checkNotNullParameter(moshi, "moshi");
        a<PromoCarouselDTO.DtoFieldName> entries = PromoCarouselDTO.DtoFieldName.getEntries();
        ArrayList arrayList = new ArrayList(C7714v.z(entries, 10));
        Iterator<E> it = entries.iterator();
        while (it.hasNext()) {
            arrayList.add(((PromoCarouselDTO.DtoFieldName) it.next()).getJsonName());
        }
        String[] strArr = (String[]) arrayList.toArray(new String[0]);
        this.jsonDTONames = n.a.C0918a.a((String[]) Arrays.copyOf(strArr, strArr.length));
        this.booleanJsonAdapter = moshi.c(Boolean.TYPE);
        this.trackingJsonAdapter = moshi.c(PromoCarouselTrackingInfoDto.class);
        this.sectionDTOJsonAdapter = moshi.c(PromoCarouselDTO.SectionDTO.class);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public PromoCarouselDTO invoke(String params, String state) {
        C9681g source = new C9681g();
        if (state == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        source.H0(state);
        Intrinsics.checkNotNullParameter(source, "source");
        p pVar = new p(source);
        pVar.beginObject();
        Object obj = null;
        Boolean bool = null;
        Boolean bool2 = null;
        Map<String, TokenizedTrackingInfo> map = null;
        while (pVar.hasNext()) {
            int v11 = pVar.v(this.jsonDTONames);
            if (v11 == PromoCarouselDTO.DtoFieldName.SECTIONS.ordinal()) {
                obj = C10727i.d(C10720e0.a(), new PromoCarouselParser$invoke$1$1(pVar, this, null));
            } else if (v11 == PromoCarouselDTO.DtoFieldName.HAS_ANIMATION.ordinal()) {
                bool = this.booleanJsonAdapter.fromJson(pVar);
            } else if (v11 == PromoCarouselDTO.DtoFieldName.IS_SMALL_CAROUSEL.ordinal()) {
                bool2 = this.booleanJsonAdapter.fromJson(pVar);
            } else if (v11 == PromoCarouselDTO.DtoFieldName.TRACKING_INFO.ordinal()) {
                PromoCarouselTrackingInfoDto fromJson = this.trackingJsonAdapter.fromJson(pVar);
                map = fromJson != null ? fromJson.getTrackingInfo() : null;
            } else {
                pVar.skipValue();
            }
        }
        pVar.endObject();
        List list = (List) obj;
        if (list != null) {
            return new PromoCarouselDTO(list, bool, bool2, map);
        }
        throw new ParseException("SectionDTO must not be null");
    }
}
