package ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListDTO;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListBackground;
import ru.ozon.app.android.marketing.widgets.staticCouponList.v1.presentation.StaticCouponListVO;
import ru.ozon.app.android.travel.utils.timerFlow.ElapsedTimeProvider;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000L\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0001\u0018\u0000 \u001a2\u00020\u00012\u00020\u0002:\u0001\u001aB\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0002¢\u0006\u0004\b\u0006\u0010\u0007J\"\u0010\b\u001a\u0004\u0018\u00010\t2\u0006\u0010\n\u001a\u00020\u000b2\u0006\u0010\f\u001a\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0016J\u0014\u0010\u0010\u001a\u00020\u0011*\u00020\r2\u0006\u0010\u000e\u001a\u00020\u000fH\u0002J\f\u0010\u0010\u001a\u00020\u0012*\u00020\u000fH\u0002J\u001d\u0010\u0013\u001a\u0004\u0018\u00010\u000b*\u00020\u00142\b\u0010\u0015\u001a\u0004\u0018\u00010\u000bH\u0002¢\u0006\u0002\u0010\u0016J\u0011\u0010\u0017\u001a\u00020\u00182\u0006\u0010\f\u001a\u00020\u0019H\u0096\u0001R\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListBadgeMapperImpl;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListCounterMapper;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListBackgroundMapper;", "elapsedTimeProvider", "Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProvider;", "backgroundMapper", "<init>", "(Lru/ozon/app/android/travel/utils/timerFlow/ElapsedTimeProvider;Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListBackgroundMapper;)V", "mapCounter", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge;", "widgetId", "", "dto", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Counter;", "wordDeclension", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$WordDeclension;", "map", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListVO$ContentItem$Badge$Text$Timer$WordDeclension;", "toTimestamp", "Lorg/joda/time/DateTime;", "serverTimestamp", "(Lorg/joda/time/DateTime;Ljava/lang/Long;)Ljava/lang/Long;", "mapBackground", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/presentation/StaticCouponListBackground;", "Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListDTO$Background;", "Companion", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class StaticCouponListBadgeMapperImpl implements StaticCouponListCounterMapper, StaticCouponListBackgroundMapper {
    private final /* synthetic */ StaticCouponListBackgroundMapper $$delegate_0;

    @NotNull
    private final ElapsedTimeProvider elapsedTimeProvider;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/marketing/widgets/staticCouponList/v1/data/StaticCouponListBadgeMapperImpl$Companion;", "", "<init>", "()V", "BADGE_ID", "", "marketing_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public StaticCouponListBadgeMapperImpl(@NotNull ElapsedTimeProvider elapsedTimeProvider, @NotNull StaticCouponListBackgroundMapper backgroundMapper) {
        Intrinsics.checkNotNullParameter(elapsedTimeProvider, "elapsedTimeProvider");
        Intrinsics.checkNotNullParameter(backgroundMapper, "backgroundMapper");
        this.$$delegate_0 = backgroundMapper;
        this.elapsedTimeProvider = elapsedTimeProvider;
    }

    private final StaticCouponListVO.ContentItem.Badge.Text map(StaticCouponListDTO.Counter counter, StaticCouponListDTO.WordDeclension wordDeclension) {
        Long l11;
        Long l12;
        if (!Intrinsics.d(counter.isTicker(), Boolean.TRUE)) {
            return new StaticCouponListVO.ContentItem.Badge.Text.Static(counter.getStaticText());
        }
        String tickerTextColor = counter.getTickerTextColor();
        String tickerTextStyle = counter.getTickerTextStyle();
        TextDTO beforeStartText = counter.getBeforeStartText();
        TextDTO beforeEndText = counter.getBeforeEndText();
        TextDTO onReachDateEndText = counter.getOnReachDateEndText();
        DateTime dateStart = counter.getDateStart();
        if (dateStart != null) {
            DateTime serverTimestamp = counter.getServerTimestamp();
            l11 = toTimestamp(dateStart, serverTimestamp != null ? Long.valueOf(serverTimestamp.getMillis()) : null);
        } else {
            l11 = null;
        }
        DateTime dateEnd = counter.getDateEnd();
        if (dateEnd != null) {
            DateTime serverTimestamp2 = counter.getServerTimestamp();
            l12 = toTimestamp(dateEnd, serverTimestamp2 != null ? Long.valueOf(serverTimestamp2.getMillis()) : null);
        } else {
            l12 = null;
        }
        StaticCouponListVO.ContentItem.Badge.Text.Timer.WordDeclension map = map(wordDeclension);
        DateTime dateStart2 = counter.getDateStart();
        Long valueOf = dateStart2 != null ? Long.valueOf(dateStart2.getMillis()) : null;
        DateTime dateEnd2 = counter.getDateEnd();
        Long valueOf2 = dateEnd2 != null ? Long.valueOf(dateEnd2.getMillis()) : null;
        StringBuilder sb2 = new StringBuilder();
        sb2.append(valueOf);
        sb2.append(valueOf2);
        return new StaticCouponListVO.ContentItem.Badge.Text.Timer(tickerTextColor, tickerTextStyle, beforeStartText, beforeEndText, onReachDateEndText, l11, l12, map, sb2.toString());
    }

    private final Long toTimestamp(DateTime dateTime, Long l11) {
        if (l11 == null) {
            return null;
        }
        return Long.valueOf((dateTime.getMillis() - l11.longValue()) + this.elapsedTimeProvider.provideTime());
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListBackgroundMapper
    @NotNull
    public StaticCouponListBackground mapBackground(@NotNull StaticCouponListDTO.Background dto) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        return this.$$delegate_0.mapBackground(dto);
    }

    @Override // ru.ozon.app.android.marketing.widgets.staticCouponList.v1.data.StaticCouponListCounterMapper
    public StaticCouponListVO.ContentItem.Badge mapCounter(long widgetId, @NotNull StaticCouponListDTO.Counter dto, @NotNull StaticCouponListDTO.WordDeclension wordDeclension) {
        Intrinsics.checkNotNullParameter(dto, "dto");
        Intrinsics.checkNotNullParameter(wordDeclension, "wordDeclension");
        if (!dto.isEnabled()) {
            return null;
        }
        long j11 = widgetId - 1365936297;
        StaticCouponListDTO.Background bgColor = dto.getBgColor();
        return new StaticCouponListVO.ContentItem.Badge(j11, bgColor != null ? mapBackground(bgColor) : null, dto.getLeftIcon(), map(dto, wordDeclension));
    }

    private final StaticCouponListVO.ContentItem.Badge.Text.Timer.WordDeclension map(StaticCouponListDTO.WordDeclension wordDeclension) {
        return new StaticCouponListVO.ContentItem.Badge.Text.Timer.WordDeclension(wordDeclension.getDay(), wordDeclension.getHour());
    }
}
