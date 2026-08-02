package com.blaze.blazesdk.widgets.apis;

import androidx.annotation.Keep;
import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import com.blaze.blazesdk.widgets.models.WidgetRemoteConfigRemoteResponse;
import defpackage.c2g;
import defpackage.iu8;
import defpackage.qif;
import defpackage.rq3;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J \u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\b\b\u0001\u0010\u0003\u001a\u00020\u0002H§@¢\u0006\u0004\b\u0006\u0010\u0007ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\bÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/widgets/apis/WidgetsApi;", "", "", "widgetRemoteId", "Lc2g;", "Lcom/blaze/blazesdk/widgets/models/WidgetRemoteConfigRemoteResponse;", "fetchWidgetByRemoteId", "(Ljava/lang/String;Lrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface WidgetsApi {
    @Keep
    @iu8("Widgets")
    @Nullable
    @BlazeNetworkRequest(includeApiKey = true, includeClientPlatform = true, includeExperiments = true)
    Object fetchWidgetByRemoteId(@qif("widgetIdentifier") @NotNull String str, @NotNull rq3<? super c2g<WidgetRemoteConfigRemoteResponse>> rq3Var);
}
