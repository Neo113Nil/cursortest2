package ru.ozon.app.android.web.webview;

import android.net.Uri;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010%\n\u0002\b\u0005\b\u0000\u0018\u0000 \u00192\u00020\u0001:\u0002\u0019\u001aB=\u0012\u0016\b\u0002\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0002\u0012\u001c\b\u0002\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u0006¢\u0006\u0004\b\t\u0010\nJ\u0017\u0010\r\u001a\u00020\f2\u0006\u0010\u000b\u001a\u00020\u0003H\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0015\u0010\u000f\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0015\u0010\u0011\u001a\u00020\u00042\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0011\u0010\u0010J\u0017\u0010\u0012\u001a\u0004\u0018\u00010\u00072\u0006\u0010\u000b\u001a\u00020\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010\u0014R(\u0010\b\u001a\u0016\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u0004\u0018\u00010\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\b\u0010\u0015R \u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\f0\u00168\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010\u0018¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/web/webview/WebViewMetrics;", "", "Lkotlin/Function1;", "", "", "onMetricStarted", "Lkotlin/Function2;", "", "onMetricCalculated", "<init>", "(Lkotlin/jvm/functions/Function1;Lkotlin/jvm/functions/Function2;)V", "pageUrl", "Lru/ozon/app/android/web/webview/WebViewMetrics$PageMetric;", "getPageMetric", "(Ljava/lang/String;)Lru/ozon/app/android/web/webview/WebViewMetrics$PageMetric;", "onStarted", "(Ljava/lang/String;)V", "onFinished", "getResultFor", "(Ljava/lang/String;)Ljava/lang/Long;", "Lkotlin/jvm/functions/Function1;", "Lkotlin/jvm/functions/Function2;", "", "metrics", "Ljava/util/Map;", "Companion", "PageMetric", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class WebViewMetrics {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);

    @NotNull
    private final Map<String, PageMetric> metrics = new LinkedHashMap();
    private final Function2<String, Long, Unit> onMetricCalculated;
    private final Function1<String, Unit> onMetricStarted;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u000e\u0010\b\u001a\u00020\t2\u0006\u0010\n\u001a\u00020\tR\u000e\u0010\u0004\u001a\u00020\u0005X\u0082T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0082T¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lru/ozon/app/android/web/webview/WebViewMetrics$Companion;", "", "<init>", "()V", "MAIN_LOADING_ORDER_NUMBER", "", "UNDEFINED_VALUE", "", "clearQuery", "", "pageUrl", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final String clearQuery(@NotNull String pageUrl) {
            Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
            String uri = Uri.parse(pageUrl).buildUpon().clearQuery().build().toString();
            Intrinsics.checkNotNullExpressionValue(uri, "toString(...)");
            return uri;
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\t\n\u0002\b\u000e\u0018\u00002\u00020\u0001B%\u0012\b\b\u0002\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0004\u001a\u00020\u0005\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u00020\u0003X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\t\u0010\n\"\u0004\b\u000b\u0010\fR\u001a\u0010\u0004\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\r\u0010\u000e\"\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0006\u001a\u00020\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0011\u0010\u000e\"\u0004\b\u0012\u0010\u0010¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/web/webview/WebViewMetrics$PageMetric;", "", "finishedCount", "", "startedTime", "", "finishedTime", "<init>", "(IJJ)V", "getFinishedCount", "()I", "setFinishedCount", "(I)V", "getStartedTime", "()J", "setStartedTime", "(J)V", "getFinishedTime", "setFinishedTime", "web_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PageMetric {
        private int finishedCount;
        private long finishedTime;
        private long startedTime;

        public PageMetric() {
            this(0, 0L, 0L, 7, null);
        }

        public final int getFinishedCount() {
            return this.finishedCount;
        }

        public final long getFinishedTime() {
            return this.finishedTime;
        }

        public final long getStartedTime() {
            return this.startedTime;
        }

        public final void setFinishedCount(int i11) {
            this.finishedCount = i11;
        }

        public final void setFinishedTime(long j11) {
            this.finishedTime = j11;
        }

        public final void setStartedTime(long j11) {
            this.startedTime = j11;
        }

        public PageMetric(int i11, long j11, long j12) {
            this.finishedCount = i11;
            this.startedTime = j11;
            this.finishedTime = j12;
        }

        public /* synthetic */ PageMetric(int i11, long j11, long j12, int i12, DefaultConstructorMarker defaultConstructorMarker) {
            this((i12 & 1) != 0 ? 0 : i11, (i12 & 2) != 0 ? -1L : j11, (i12 & 4) != 0 ? -1L : j12);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public WebViewMetrics(Function1<? super String, Unit> function1, Function2<? super String, ? super Long, Unit> function2) {
        this.onMetricStarted = function1;
        this.onMetricCalculated = function2;
    }

    private final PageMetric getPageMetric(String pageUrl) {
        Map<String, PageMetric> map = this.metrics;
        PageMetric pageMetric = map.get(pageUrl);
        if (pageMetric == null) {
            PageMetric pageMetric2 = new PageMetric(0, 0L, 0L, 7, null);
            map.put(pageUrl, pageMetric2);
            pageMetric = pageMetric2;
        }
        return pageMetric;
    }

    public final Long getResultFor(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        PageMetric pageMetric = this.metrics.get(pageUrl);
        if (pageMetric != null) {
            if (pageMetric.getFinishedCount() != 2 || pageMetric.getStartedTime() == -1 || pageMetric.getFinishedTime() == -1) {
                pageMetric = null;
            }
            if (pageMetric != null) {
                return Long.valueOf(pageMetric.getFinishedTime() - pageMetric.getStartedTime());
            }
        }
        return null;
    }

    public final void onFinished(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        PageMetric pageMetric = getPageMetric(pageUrl);
        if (pageMetric.getFinishedCount() == 2) {
            return;
        }
        pageMetric.setFinishedCount(pageMetric.getFinishedCount() + 1);
        if (pageMetric.getFinishedCount() == 2) {
            pageMetric.setFinishedTime(System.currentTimeMillis());
            Long resultFor = getResultFor(pageUrl);
            if (resultFor != null) {
                long longValue = resultFor.longValue();
                Function2<String, Long, Unit> function2 = this.onMetricCalculated;
                if (function2 != null) {
                    function2.invoke(pageUrl, Long.valueOf(longValue));
                }
            }
        }
    }

    public final void onStarted(@NotNull String pageUrl) {
        Intrinsics.checkNotNullParameter(pageUrl, "pageUrl");
        PageMetric pageMetric = getPageMetric(pageUrl);
        if (pageMetric.getFinishedCount() == 0) {
            pageMetric.setStartedTime(System.currentTimeMillis());
            Function1<String, Unit> function1 = this.onMetricStarted;
            if (function1 != null) {
                function1.invoke(pageUrl);
            }
        }
    }
}
