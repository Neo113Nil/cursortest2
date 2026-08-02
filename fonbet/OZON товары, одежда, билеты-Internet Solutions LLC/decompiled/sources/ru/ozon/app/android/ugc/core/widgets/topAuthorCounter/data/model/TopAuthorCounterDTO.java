package ru.ozon.app.android.ugc.core.widgets.topAuthorCounter.data.model;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0013\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001BE\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\b\u001a\u0004\u0018\u00010\t\u0012\u0014\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000b\u0010\u001a\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\tHÆ\u0003J\u0017\u0010\u001e\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003JQ\u0010\u001f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t2\u0016\b\u0002\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001J\u0013\u0010 \u001a\u00020!2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020$HÖ\u0001J\t\u0010%\u001a\u00020\fHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013R\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0015R\u0013\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\n\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019¨\u0006&"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorCounterDTO;", "", "topContainer", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopContainerDTO;", "counter", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO;", "author", "Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO;", "date", "Lorg/joda/time/DateTime;", "tracking", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "<init>", "(Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopContainerDTO;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO;Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO;Lorg/joda/time/DateTime;Ljava/util/Map;)V", "getTopContainer", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopContainerDTO;", "getCounter", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/CounterDTO;", "getAuthor", "()Lru/ozon/app/android/ugc/core/widgets/topAuthorCounter/data/model/TopAuthorDTO;", "getDate", "()Lorg/joda/time/DateTime;", "getTracking", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class TopAuthorCounterDTO {
    public static final int $stable = 8;
    private final TopAuthorDTO author;
    private final CounterDTO counter;
    private final DateTime date;
    private final TopContainerDTO topContainer;
    private final Map<String, TokenizedTrackingInfo> tracking;

    public TopAuthorCounterDTO(TopContainerDTO topContainerDTO, CounterDTO counterDTO, TopAuthorDTO topAuthorDTO, DateTime dateTime, Map<String, TokenizedTrackingInfo> map) {
        this.topContainer = topContainerDTO;
        this.counter = counterDTO;
        this.author = topAuthorDTO;
        this.date = dateTime;
        this.tracking = map;
    }

    public static /* synthetic */ TopAuthorCounterDTO copy$default(TopAuthorCounterDTO topAuthorCounterDTO, TopContainerDTO topContainerDTO, CounterDTO counterDTO, TopAuthorDTO topAuthorDTO, DateTime dateTime, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            topContainerDTO = topAuthorCounterDTO.topContainer;
        }
        if ((i11 & 2) != 0) {
            counterDTO = topAuthorCounterDTO.counter;
        }
        if ((i11 & 4) != 0) {
            topAuthorDTO = topAuthorCounterDTO.author;
        }
        if ((i11 & 8) != 0) {
            dateTime = topAuthorCounterDTO.date;
        }
        if ((i11 & 16) != 0) {
            map = topAuthorCounterDTO.tracking;
        }
        Map map2 = map;
        TopAuthorDTO topAuthorDTO2 = topAuthorDTO;
        return topAuthorCounterDTO.copy(topContainerDTO, counterDTO, topAuthorDTO2, dateTime, map2);
    }

    /* renamed from: component1, reason: from getter */
    public final TopContainerDTO getTopContainer() {
        return this.topContainer;
    }

    /* renamed from: component2, reason: from getter */
    public final CounterDTO getCounter() {
        return this.counter;
    }

    /* renamed from: component3, reason: from getter */
    public final TopAuthorDTO getAuthor() {
        return this.author;
    }

    /* renamed from: component4, reason: from getter */
    public final DateTime getDate() {
        return this.date;
    }

    public final Map<String, TokenizedTrackingInfo> component5() {
        return this.tracking;
    }

    @NotNull
    public final TopAuthorCounterDTO copy(TopContainerDTO topContainer, CounterDTO counter, TopAuthorDTO author, DateTime date, Map<String, TokenizedTrackingInfo> tracking) {
        return new TopAuthorCounterDTO(topContainer, counter, author, date, tracking);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TopAuthorCounterDTO)) {
            return false;
        }
        TopAuthorCounterDTO topAuthorCounterDTO = (TopAuthorCounterDTO) other;
        return Intrinsics.d(this.topContainer, topAuthorCounterDTO.topContainer) && Intrinsics.d(this.counter, topAuthorCounterDTO.counter) && Intrinsics.d(this.author, topAuthorCounterDTO.author) && Intrinsics.d(this.date, topAuthorCounterDTO.date) && Intrinsics.d(this.tracking, topAuthorCounterDTO.tracking);
    }

    public final TopAuthorDTO getAuthor() {
        return this.author;
    }

    public final CounterDTO getCounter() {
        return this.counter;
    }

    public final DateTime getDate() {
        return this.date;
    }

    public final TopContainerDTO getTopContainer() {
        return this.topContainer;
    }

    public final Map<String, TokenizedTrackingInfo> getTracking() {
        return this.tracking;
    }

    public int hashCode() {
        TopContainerDTO topContainerDTO = this.topContainer;
        int hashCode = (topContainerDTO == null ? 0 : topContainerDTO.hashCode()) * 31;
        CounterDTO counterDTO = this.counter;
        int hashCode2 = (hashCode + (counterDTO == null ? 0 : counterDTO.hashCode())) * 31;
        TopAuthorDTO topAuthorDTO = this.author;
        int hashCode3 = (hashCode2 + (topAuthorDTO == null ? 0 : topAuthorDTO.hashCode())) * 31;
        DateTime dateTime = this.date;
        int hashCode4 = (hashCode3 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        return hashCode4 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        TopContainerDTO topContainerDTO = this.topContainer;
        CounterDTO counterDTO = this.counter;
        TopAuthorDTO topAuthorDTO = this.author;
        DateTime dateTime = this.date;
        Map<String, TokenizedTrackingInfo> map = this.tracking;
        StringBuilder sb2 = new StringBuilder("TopAuthorCounterDTO(topContainer=");
        sb2.append(topContainerDTO);
        sb2.append(", counter=");
        sb2.append(counterDTO);
        sb2.append(", author=");
        sb2.append(topAuthorDTO);
        sb2.append(", date=");
        sb2.append(dateTime);
        sb2.append(", tracking=");
        return P.f(sb2, map, ")");
    }
}
