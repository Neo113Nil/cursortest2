package com.blaze.blazesdk.analytics;

import androidx.annotation.Keep;
import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import com.blaze.blazesdk.shared.BlazeSDK;
import defpackage.a70;
import defpackage.c2g;
import defpackage.i0e;
import defpackage.iga;
import defpackage.qif;
import defpackage.rq3;
import defpackage.usl;
import defpackage.yy1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\b`\u0018\u00002\u00020\u0001J0\u0010\t\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\b0\u00072\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00022\b\b\u0003\u0010\u0006\u001a\u00020\u0005H§@¢\u0006\u0004\b\u000b\u0010\nø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\fÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/analytics/AnalyticsApi;", "", "", "Liga;", "eventBulk", "", "apiKey", "Lc2g;", "", "sendTrackEvents", "(Ljava/util/List;Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "sendDoNotTrackEvents", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface AnalyticsApi {
    static /* synthetic */ Object sendDoNotTrackEvents$default(AnalyticsApi analyticsApi, List list, String str, rq3 rq3Var, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: sendDoNotTrackEvents");
            return null;
        }
        if ((i & 2) != 0) {
            str = BlazeSDK.INSTANCE.getApiKey$blazesdk_release();
        }
        return analyticsApi.sendDoNotTrackEvents(list, str, rq3Var);
    }

    static /* synthetic */ Object sendTrackEvents$default(AnalyticsApi analyticsApi, List list, String str, rq3 rq3Var, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: sendTrackEvents");
            return null;
        }
        if ((i & 2) != 0) {
            str = BlazeSDK.INSTANCE.getApiKey$blazesdk_release();
        }
        return analyticsApi.sendTrackEvents(list, str, rq3Var);
    }

    @Keep
    @Nullable
    @usl
    @i0e("events_do_not_track")
    @BlazeNetworkRequest
    Object sendDoNotTrackEvents(@yy1 @NotNull List<iga> list, @qif("api_key") @NotNull String str, @NotNull rq3<? super c2g<Unit>> rq3Var);

    @Keep
    @Nullable
    @usl
    @i0e("events")
    @BlazeNetworkRequest
    Object sendTrackEvents(@yy1 @NotNull List<iga> list, @qif("api_key") @NotNull String str, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
