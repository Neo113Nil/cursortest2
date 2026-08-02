package ru.ozon.app.android.action.v2;

import AW.d;
import Bc.j;
import Bc.o;
import Bc.w;
import GH.b;
import Mc.a;
import Qj0.B;
import Qj0.U;
import Sc.r;
import Sc.s;
import W10.c;
import androidx.recyclerview.widget.LinearLayoutManager;
import com.squareup.moshi.D;
import io.reactivex.y;
import java.util.Map;
import java.util.concurrent.Callable;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.parsing.JsonParser;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.action.sheet.ActionSheetVO;
import ru.ozon.app.android.action.sheet.AnalyticsInfo;
import ru.ozon.app.android.action.sheet.data.ActionSheetDTO;
import ru.ozon.app.android.action.sheet.data.ActionSheetMapper;
import ru.ozon.app.android.action.v2.ActionV2RepositoryImpl;
import ru.ozon.app.android.action.v2.analytic.ActionAnalyticDelegate;
import ru.ozon.app.android.action.v2.models.ActionV2Request;
import ru.ozon.app.android.action.v2.models.ActionV2Response;
import ru.ozon.app.android.metrics.client.MetricsClient;
import ru.ozon.app.android.metrics.client.MetricsRequestData;
import ru.ozon.app.android.metrics.client.MetricsResponse;
import ru.ozon.app.android.metrics.client.MetricsResponseParser;
import ru.ozon.app.android.network.serialize.JsonSerializer;
import ru.ozon.tracker.performance.ObjectTypes;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0015\b\u0001\u0018\u0000 >2\u00020\u0001:\u0001>B5\b\u0007\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\n\u0010\f\u001a\u00060\nj\u0002`\u000b¢\u0006\u0004\b\r\u0010\u000eJ7\u0010\u0018\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0002¢\u0006\u0004\b\u0016\u0010\u0017J7\u0010 \u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00150\u00142\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ3\u0010&\u001a\u00020%\"\u0004\b\u0000\u0010\u000f2\f\u0010!\u001a\b\u0012\u0004\u0012\u00028\u00000\u00152\u000e\u0010$\u001a\n\u0018\u00010\"j\u0004\u0018\u0001`#H\u0002¢\u0006\u0004\b&\u0010'J+\u0010(\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u000f*\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014H\u0002¢\u0006\u0004\b(\u0010)J7\u0010+\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150*\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b+\u0010,JC\u0010-\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150*\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010$\u001a\u00060\"j\u0002`#2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0016¢\u0006\u0004\b-\u0010.J7\u0010/\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u001d0\u00150*2\u0006\u0010\u0011\u001a\u00020\u00102\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001c\u001a\u0004\u0018\u00010\u001bH\u0016¢\u0006\u0004\b/\u00100J2\u00101\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@¢\u0006\u0004\b1\u00102J>\u00103\u001a\b\u0012\u0004\u0012\u00028\u00000\u0015\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010$\u001a\u00060\"j\u0002`#2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@¢\u0006\u0004\b3\u00104J8\u00106\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@¢\u0006\u0004\b5\u00102JD\u00108\u001a\u000e\u0012\n\u0012\b\u0012\u0004\u0012\u00028\u00000\u00150\u0014\"\u0004\b\u0000\u0010\u000f2\u0006\u0010\u0011\u001a\u00020\u00102\n\u0010$\u001a\u00060\"j\u0002`#2\f\u0010\u0013\u001a\b\u0012\u0004\u0012\u00028\u00000\u0012H\u0096@¢\u0006\u0004\b7\u00104R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u00109R\u0014\u0010\u0005\u001a\u00020\u00048\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0005\u0010:R\u0014\u0010\u0007\u001a\u00020\u00068\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0007\u0010;R\u0014\u0010\t\u001a\u00020\b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\t\u0010<R\u0018\u0010\f\u001a\u00060\nj\u0002`\u000b8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\f\u0010=¨\u0006?"}, d2 = {"Lru/ozon/app/android/action/v2/ActionV2RepositoryImpl;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Lru/ozon/app/android/metrics/client/MetricsClient;", "client", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "analyticDelegate", "Lru/ozon/app/android/action/sheet/data/ActionSheetMapper;", "actionSheetMapper", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "jsonSerializer", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Lru/ozon/app/android/network/serialize/JsonDeserializer;", "jsonDeserializer", "<init>", "(Lru/ozon/app/android/metrics/client/MetricsClient;Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;Lru/ozon/app/android/action/sheet/data/ActionSheetMapper;Lru/ozon/app/android/network/serialize/JsonSerializer;Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;)V", "D", "Lru/ozon/app/android/action/v2/models/ActionV2Request;", "request", "Ljava/lang/Class;", "type", "LSc/r;", "Lru/ozon/app/android/action/v2/models/ActionV2Response;", "callActionInternal-gIAlu-s", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Ljava/lang/Class;)Ljava/lang/Object;", "callActionInternal", "", "refer", "Lru/ozon/app/android/action/sheet/AnalyticsInfo;", "analyticsInfo", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "requestActionSheetInternal-0E7RQCE", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Ljava/lang/String;Lru/ozon/app/android/action/sheet/AnalyticsInfo;)Ljava/lang/Object;", "requestActionSheetInternal", "response", "LW10/c;", "Lru/ozon/app/android/composer/widgets/base/TrackingData;", "widgetTrackingData", "", "sendAnalytics", "(Lru/ozon/app/android/action/v2/models/ActionV2Response;LW10/c;)V", "catchException", "(Ljava/lang/Object;)Lru/ozon/app/android/action/v2/models/ActionV2Response;", "Lio/reactivex/y;", "callAction", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Ljava/lang/Class;)Lio/reactivex/y;", "callActionWithTracking", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;LW10/c;Ljava/lang/Class;)Lio/reactivex/y;", "requestActionSheet", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Ljava/lang/String;Lru/ozon/app/android/action/sheet/AnalyticsInfo;)Lio/reactivex/y;", "callActionSuspend", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;Ljava/lang/Class;Lkotlin/coroutines/d;)Ljava/lang/Object;", "callActionWithTrackingSuspend", "(Lru/ozon/app/android/action/v2/models/ActionV2Request;LW10/c;Ljava/lang/Class;Lkotlin/coroutines/d;)Ljava/lang/Object;", "requestActionResult-0E7RQCE", "requestActionResult", "requestActionResultWithTracking-BWLJW6A", "requestActionResultWithTracking", "Lru/ozon/app/android/metrics/client/MetricsClient;", "Lru/ozon/app/android/action/v2/analytic/ActionAnalyticDelegate;", "Lru/ozon/app/android/action/sheet/data/ActionSheetMapper;", "Lru/ozon/app/android/network/serialize/JsonSerializer;", "Lru/ozon/android/composerCommonViewKit/parsing/JsonParser;", "Companion", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ActionV2RepositoryImpl implements ActionV2Repository {

    @NotNull
    private final ActionSheetMapper actionSheetMapper;

    @NotNull
    private final ActionAnalyticDelegate analyticDelegate;

    @NotNull
    private final MetricsClient client;

    @NotNull
    private final JsonParser jsonDeserializer;

    @NotNull
    private final JsonSerializer jsonSerializer;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/action/v2/ActionV2RepositoryImpl$Companion;", "", "<init>", "()V", "COMPOSER_ACTION_API", "", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public ActionV2RepositoryImpl(@NotNull MetricsClient client, @NotNull ActionAnalyticDelegate analyticDelegate, @NotNull ActionSheetMapper actionSheetMapper, @NotNull JsonSerializer jsonSerializer, @NotNull JsonParser jsonDeserializer) {
        Intrinsics.checkNotNullParameter(client, "client");
        Intrinsics.checkNotNullParameter(analyticDelegate, "analyticDelegate");
        Intrinsics.checkNotNullParameter(actionSheetMapper, "actionSheetMapper");
        Intrinsics.checkNotNullParameter(jsonSerializer, "jsonSerializer");
        Intrinsics.checkNotNullParameter(jsonDeserializer, "jsonDeserializer");
        this.client = client;
        this.analyticDelegate = analyticDelegate;
        this.actionSheetMapper = actionSheetMapper;
        this.jsonSerializer = jsonSerializer;
        this.jsonDeserializer = jsonDeserializer;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionV2Response callAction$lambda$0(ActionV2RepositoryImpl actionV2RepositoryImpl, ActionV2Request actionV2Request, Class cls) {
        return actionV2RepositoryImpl.catchException(actionV2RepositoryImpl.m482callActionInternalgIAlus(actionV2Request, cls));
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* JADX WARN: Removed duplicated region for block: B:12:0x0051 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:24:? A[RETURN, SYNTHETIC] */
    /* renamed from: callActionInternal-gIAlu-s, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final <D> Object m482callActionInternalgIAlus(ActionV2Request request, final Class<D> type) {
        Object a11;
        MetricsClient metricsClient;
        String str;
        MetricsRequestData.RequestType requestType;
        Object request2;
        String str2;
        try {
            r.Companion companion = r.INSTANCE;
            metricsClient = this.client;
            str = "composer-api.bx/_action/v2/" + request.getActionName();
            requestType = MetricsRequestData.RequestType.POST;
            request2 = request.getRequest();
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (request2 != null) {
            str2 = this.jsonSerializer.toJson((JsonSerializer) request2, (Class<JsonSerializer>) Object.class);
            if (str2 == null) {
            }
            a11 = metricsClient.call(new MetricsRequestData(str, requestType, null, str2, 4, null), request.getIsLongPolling(), new MetricsResponseParser() { // from class: rl.a
                @Override // ru.ozon.app.android.metrics.client.MetricsResponseParser
                public final Object parse(String str3) {
                    ActionV2Response callActionInternal_gIAlu_s$lambda$6$lambda$5;
                    callActionInternal_gIAlu_s$lambda$6$lambda$5 = ActionV2RepositoryImpl.callActionInternal_gIAlu_s$lambda$6$lambda$5(ActionV2RepositoryImpl.this, type, str3);
                    return callActionInternal_gIAlu_s$lambda$6$lambda$5;
                }
            });
            if (!(a11 instanceof r.b)) {
                return a11;
            }
            try {
                MetricsResponse metricsResponse = (MetricsResponse) a11;
                ActionV2Response actionV2Response = (ActionV2Response) metricsResponse.component1();
                MetricsResponse.Metrics metrics = metricsResponse.getMetrics();
                U trace = metrics.getTrace();
                if (trace != null) {
                    B b11 = new B(ObjectTypes.ACTION);
                    int i11 = U.f23535i;
                    trace.n(b11, true);
                }
                Unit unit = Unit.f71690a;
                return ActionV2Response.copy$default(actionV2Response, null, null, null, null, metrics, 15, null);
            } catch (Throwable th3) {
                r.Companion companion3 = r.INSTANCE;
                return s.a(th3);
            }
        }
        str2 = "";
        a11 = metricsClient.call(new MetricsRequestData(str, requestType, null, str2, 4, null), request.getIsLongPolling(), new MetricsResponseParser() { // from class: rl.a
            @Override // ru.ozon.app.android.metrics.client.MetricsResponseParser
            public final Object parse(String str3) {
                ActionV2Response callActionInternal_gIAlu_s$lambda$6$lambda$5;
                callActionInternal_gIAlu_s$lambda$6$lambda$5 = ActionV2RepositoryImpl.callActionInternal_gIAlu_s$lambda$6$lambda$5(ActionV2RepositoryImpl.this, type, str3);
                return callActionInternal_gIAlu_s$lambda$6$lambda$5;
            }
        });
        if (!(a11 instanceof r.b)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionV2Response callActionInternal_gIAlu_s$lambda$6$lambda$5(ActionV2RepositoryImpl actionV2RepositoryImpl, Class cls, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (ActionV2Response) actionV2RepositoryImpl.jsonDeserializer.fromJson(it, D.e(ActionV2Response.class, cls));
    }

    private final <D> ActionV2Response<D> catchException(Object obj) {
        Throwable b11 = r.b(obj);
        if (b11 != null) {
            obj = new ActionV2Response(b11.getMessage(), null, null, null, null, 30, null);
        }
        return (ActionV2Response) obj;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionV2Response requestActionSheet$lambda$2(ActionV2RepositoryImpl actionV2RepositoryImpl, ActionV2Request actionV2Request, String str, AnalyticsInfo analyticsInfo) {
        return actionV2RepositoryImpl.catchException(actionV2RepositoryImpl.m483requestActionSheetInternal0E7RQCE(actionV2Request, str, analyticsInfo));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0052 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:? A[RETURN, SYNTHETIC] */
    /* renamed from: requestActionSheetInternal-0E7RQCE, reason: not valid java name */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private final Object m483requestActionSheetInternal0E7RQCE(ActionV2Request request, String refer, AnalyticsInfo analyticsInfo) {
        Object a11;
        MetricsClient metricsClient;
        String str;
        MetricsRequestData.RequestType requestType;
        Map c11;
        try {
            r.Companion companion = r.INSTANCE;
            metricsClient = this.client;
            str = "composer-api.bx/_action/v2/" + request.getActionName();
            requestType = MetricsRequestData.RequestType.GET;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (refer != null) {
            c11 = kotlin.collections.U.i(new Pair("referer", refer));
            if (c11 == null) {
            }
            a11 = MetricsClient.DefaultImpls.call$default(metricsClient, new MetricsRequestData(str, requestType, c11, null, 8, null), false, new d(this), 2, null);
            if (!(a11 instanceof r.b)) {
                return a11;
            }
            try {
                MetricsResponse metricsResponse = (MetricsResponse) a11;
                ActionV2Response actionV2Response = (ActionV2Response) metricsResponse.component1();
                MetricsResponse.Metrics metrics = metricsResponse.getMetrics();
                if (actionV2Response.getData() == null) {
                    throw new IllegalStateException("empty data");
                }
                ActionSheetVO map = this.actionSheetMapper.map(analyticsInfo != null ? analyticsInfo.getWidgetId() : null, (ActionSheetDTO) actionV2Response.getData());
                Map<String, String> trackingPayloads = actionV2Response.getTrackingPayloads();
                Map<String, TokenizedTrackingInfo> trackingInfo = actionV2Response.getTrackingInfo();
                U trace = metrics.getTrace();
                if (trace != null) {
                    B b11 = new B(ObjectTypes.ACTION);
                    int i11 = U.f23535i;
                    trace.n(b11, true);
                }
                return new ActionV2Response(null, map, trackingInfo, trackingPayloads, metrics, 1, null);
            } catch (Throwable th3) {
                r.Companion companion3 = r.INSTANCE;
                return s.a(th3);
            }
        }
        c11 = kotlin.collections.U.c();
        a11 = MetricsClient.DefaultImpls.call$default(metricsClient, new MetricsRequestData(str, requestType, c11, null, 8, null), false, new d(this), 2, null);
        if (!(a11 instanceof r.b)) {
        }
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final ActionV2Response requestActionSheetInternal_0E7RQCE$lambda$11$lambda$10(ActionV2RepositoryImpl actionV2RepositoryImpl, String it) {
        Intrinsics.checkNotNullParameter(it, "it");
        return (ActionV2Response) actionV2RepositoryImpl.jsonDeserializer.fromJson(it, D.e(ActionV2Response.class, ActionSheetDTO.class));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final <D> void sendAnalytics(ActionV2Response<D> response, c widgetTrackingData) {
        this.analyticDelegate.sendAnalytics(response.getTrackingInfo(), response.getTrackingPayloads(), widgetTrackingData);
    }

    @Override // ru.ozon.app.android.action.v2.ActionV2Repository
    @NotNull
    public <D> y<ActionV2Response<D>> callAction(@NotNull final ActionV2Request request, @NotNull final Class<D> type) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(type, "type");
        w j11 = new o(new Callable() { // from class: rl.b
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ActionV2Response callAction$lambda$0;
                callAction$lambda$0 = ActionV2RepositoryImpl.callAction$lambda$0(ActionV2RepositoryImpl.this, request, type);
                return callAction$lambda$0;
            }
        }).j(a.b());
        Intrinsics.checkNotNullExpressionValue(j11, "subscribeOn(...)");
        return j11;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.action.v2.ActionV2Repository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <D> Object callActionSuspend(@NotNull ActionV2Request actionV2Request, @NotNull Class<D> cls, @NotNull kotlin.coroutines.d<? super ActionV2Response<D>> dVar) {
        ActionV2RepositoryImpl$callActionSuspend$1 actionV2RepositoryImpl$callActionSuspend$1;
        int i11;
        Object mo479requestActionResult0E7RQCE;
        ActionV2RepositoryImpl actionV2RepositoryImpl;
        if (dVar instanceof ActionV2RepositoryImpl$callActionSuspend$1) {
            actionV2RepositoryImpl$callActionSuspend$1 = (ActionV2RepositoryImpl$callActionSuspend$1) dVar;
            int i12 = actionV2RepositoryImpl$callActionSuspend$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                actionV2RepositoryImpl$callActionSuspend$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = actionV2RepositoryImpl$callActionSuspend$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = actionV2RepositoryImpl$callActionSuspend$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    actionV2RepositoryImpl$callActionSuspend$1.L$0 = this;
                    actionV2RepositoryImpl$callActionSuspend$1.label = 1;
                    mo479requestActionResult0E7RQCE = mo479requestActionResult0E7RQCE(actionV2Request, cls, actionV2RepositoryImpl$callActionSuspend$1);
                    if (mo479requestActionResult0E7RQCE == aVar) {
                        return aVar;
                    }
                    actionV2RepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    actionV2RepositoryImpl = (ActionV2RepositoryImpl) actionV2RepositoryImpl$callActionSuspend$1.L$0;
                    s.b(obj);
                    mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                }
                return actionV2RepositoryImpl.catchException(mo479requestActionResult0E7RQCE);
            }
        }
        actionV2RepositoryImpl$callActionSuspend$1 = new ActionV2RepositoryImpl$callActionSuspend$1(this, dVar);
        Object obj2 = actionV2RepositoryImpl$callActionSuspend$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = actionV2RepositoryImpl$callActionSuspend$1.label;
        if (i11 != 0) {
        }
        return actionV2RepositoryImpl.catchException(mo479requestActionResult0E7RQCE);
    }

    @Override // ru.ozon.app.android.action.v2.ActionV2Repository
    @NotNull
    public <D> y<ActionV2Response<D>> callActionWithTracking(@NotNull ActionV2Request request, @NotNull c widgetTrackingData, @NotNull Class<D> type) {
        Intrinsics.checkNotNullParameter(request, "request");
        Intrinsics.checkNotNullParameter(widgetTrackingData, "widgetTrackingData");
        Intrinsics.checkNotNullParameter(type, "type");
        y<ActionV2Response<D>> callAction = callAction(request, type);
        b bVar = new b(new ActionV2RepositoryImpl$callActionWithTracking$1(this, widgetTrackingData), 10);
        callAction.getClass();
        j jVar = new j(callAction, bVar);
        Intrinsics.checkNotNullExpressionValue(jVar, "doOnSuccess(...)");
        return jVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.action.v2.ActionV2Repository
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <D> Object callActionWithTrackingSuspend(@NotNull ActionV2Request actionV2Request, @NotNull c cVar, @NotNull Class<D> cls, @NotNull kotlin.coroutines.d<? super ActionV2Response<D>> dVar) {
        ActionV2RepositoryImpl$callActionWithTrackingSuspend$1 actionV2RepositoryImpl$callActionWithTrackingSuspend$1;
        int i11;
        Object mo480requestActionResultWithTrackingBWLJW6A;
        ActionV2RepositoryImpl actionV2RepositoryImpl;
        if (dVar instanceof ActionV2RepositoryImpl$callActionWithTrackingSuspend$1) {
            actionV2RepositoryImpl$callActionWithTrackingSuspend$1 = (ActionV2RepositoryImpl$callActionWithTrackingSuspend$1) dVar;
            int i12 = actionV2RepositoryImpl$callActionWithTrackingSuspend$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                actionV2RepositoryImpl$callActionWithTrackingSuspend$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = actionV2RepositoryImpl$callActionWithTrackingSuspend$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = actionV2RepositoryImpl$callActionWithTrackingSuspend$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    actionV2RepositoryImpl$callActionWithTrackingSuspend$1.L$0 = this;
                    actionV2RepositoryImpl$callActionWithTrackingSuspend$1.label = 1;
                    mo480requestActionResultWithTrackingBWLJW6A = mo480requestActionResultWithTrackingBWLJW6A(actionV2Request, cVar, cls, actionV2RepositoryImpl$callActionWithTrackingSuspend$1);
                    if (mo480requestActionResultWithTrackingBWLJW6A == aVar) {
                        return aVar;
                    }
                    actionV2RepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    actionV2RepositoryImpl = (ActionV2RepositoryImpl) actionV2RepositoryImpl$callActionWithTrackingSuspend$1.L$0;
                    s.b(obj);
                    mo480requestActionResultWithTrackingBWLJW6A = ((r) obj).getF26106a();
                }
                return actionV2RepositoryImpl.catchException(mo480requestActionResultWithTrackingBWLJW6A);
            }
        }
        actionV2RepositoryImpl$callActionWithTrackingSuspend$1 = new ActionV2RepositoryImpl$callActionWithTrackingSuspend$1(this, dVar);
        Object obj2 = actionV2RepositoryImpl$callActionWithTrackingSuspend$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = actionV2RepositoryImpl$callActionWithTrackingSuspend$1.label;
        if (i11 != 0) {
        }
        return actionV2RepositoryImpl.catchException(mo480requestActionResultWithTrackingBWLJW6A);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.action.v2.ActionV2Repository
    /* renamed from: requestActionResult-0E7RQCE */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <D> Object mo479requestActionResult0E7RQCE(@NotNull ActionV2Request actionV2Request, @NotNull Class<D> cls, @NotNull kotlin.coroutines.d<? super r<ActionV2Response<D>>> dVar) {
        ActionV2RepositoryImpl$requestActionResult$1 actionV2RepositoryImpl$requestActionResult$1;
        int i11;
        if (dVar instanceof ActionV2RepositoryImpl$requestActionResult$1) {
            actionV2RepositoryImpl$requestActionResult$1 = (ActionV2RepositoryImpl$requestActionResult$1) dVar;
            int i12 = actionV2RepositoryImpl$requestActionResult$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                actionV2RepositoryImpl$requestActionResult$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = actionV2RepositoryImpl$requestActionResult$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = actionV2RepositoryImpl$requestActionResult$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    C10720e0 c10720e0 = C10720e0.f105451a;
                    He.b bVar = He.b.f10879b;
                    ActionV2RepositoryImpl$requestActionResult$2 actionV2RepositoryImpl$requestActionResult$2 = new ActionV2RepositoryImpl$requestActionResult$2(this, actionV2Request, cls, null);
                    actionV2RepositoryImpl$requestActionResult$1.label = 1;
                    obj = C10727i.f(bVar, actionV2RepositoryImpl$requestActionResult$2, actionV2RepositoryImpl$requestActionResult$1);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    s.b(obj);
                }
                return ((r) obj).getF26106a();
            }
        }
        actionV2RepositoryImpl$requestActionResult$1 = new ActionV2RepositoryImpl$requestActionResult$1(this, dVar);
        Object obj2 = actionV2RepositoryImpl$requestActionResult$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = actionV2RepositoryImpl$requestActionResult$1.label;
        if (i11 != 0) {
        }
        return ((r) obj2).getF26106a();
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // ru.ozon.app.android.action.v2.ActionV2Repository
    /* renamed from: requestActionResultWithTracking-BWLJW6A */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public <D> Object mo480requestActionResultWithTrackingBWLJW6A(@NotNull ActionV2Request actionV2Request, @NotNull c cVar, @NotNull Class<D> cls, @NotNull kotlin.coroutines.d<? super r<ActionV2Response<D>>> dVar) {
        ActionV2RepositoryImpl$requestActionResultWithTracking$1 actionV2RepositoryImpl$requestActionResultWithTracking$1;
        int i11;
        Object mo479requestActionResult0E7RQCE;
        ActionV2RepositoryImpl actionV2RepositoryImpl;
        if (dVar instanceof ActionV2RepositoryImpl$requestActionResultWithTracking$1) {
            actionV2RepositoryImpl$requestActionResultWithTracking$1 = (ActionV2RepositoryImpl$requestActionResultWithTracking$1) dVar;
            int i12 = actionV2RepositoryImpl$requestActionResultWithTracking$1.label;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                actionV2RepositoryImpl$requestActionResultWithTracking$1.label = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = actionV2RepositoryImpl$requestActionResultWithTracking$1.result;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = actionV2RepositoryImpl$requestActionResultWithTracking$1.label;
                if (i11 != 0) {
                    s.b(obj);
                    actionV2RepositoryImpl$requestActionResultWithTracking$1.L$0 = this;
                    actionV2RepositoryImpl$requestActionResultWithTracking$1.L$1 = cVar;
                    actionV2RepositoryImpl$requestActionResultWithTracking$1.label = 1;
                    mo479requestActionResult0E7RQCE = mo479requestActionResult0E7RQCE(actionV2Request, cls, actionV2RepositoryImpl$requestActionResultWithTracking$1);
                    if (mo479requestActionResult0E7RQCE == aVar) {
                        return aVar;
                    }
                    actionV2RepositoryImpl = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    cVar = (c) actionV2RepositoryImpl$requestActionResultWithTracking$1.L$1;
                    actionV2RepositoryImpl = (ActionV2RepositoryImpl) actionV2RepositoryImpl$requestActionResultWithTracking$1.L$0;
                    s.b(obj);
                    mo479requestActionResult0E7RQCE = ((r) obj).getF26106a();
                }
                r.Companion companion = r.INSTANCE;
                if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
                    actionV2RepositoryImpl.sendAnalytics((ActionV2Response) mo479requestActionResult0E7RQCE, cVar);
                }
                return mo479requestActionResult0E7RQCE;
            }
        }
        actionV2RepositoryImpl$requestActionResultWithTracking$1 = new ActionV2RepositoryImpl$requestActionResultWithTracking$1(this, dVar);
        Object obj2 = actionV2RepositoryImpl$requestActionResultWithTracking$1.result;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = actionV2RepositoryImpl$requestActionResultWithTracking$1.label;
        if (i11 != 0) {
        }
        r.Companion companion2 = r.INSTANCE;
        if (!(mo479requestActionResult0E7RQCE instanceof r.b)) {
        }
        return mo479requestActionResult0E7RQCE;
    }

    @Override // ru.ozon.app.android.action.v2.ActionV2Repository
    @NotNull
    public y<ActionV2Response<ActionSheetVO>> requestActionSheet(@NotNull final ActionV2Request request, final String refer, final AnalyticsInfo analyticsInfo) {
        Intrinsics.checkNotNullParameter(request, "request");
        w j11 = new o(new Callable() { // from class: rl.c
            @Override // java.util.concurrent.Callable
            public final Object call() {
                ActionV2Response requestActionSheet$lambda$2;
                requestActionSheet$lambda$2 = ActionV2RepositoryImpl.requestActionSheet$lambda$2(ActionV2RepositoryImpl.this, request, refer, analyticsInfo);
                return requestActionSheet$lambda$2;
            }
        }).j(a.b());
        Intrinsics.checkNotNullExpressionValue(j11, "subscribeOn(...)");
        return j11;
    }
}
