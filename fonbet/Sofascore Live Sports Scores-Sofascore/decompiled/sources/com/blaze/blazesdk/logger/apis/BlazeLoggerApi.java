package com.blaze.blazesdk.logger.apis;

import androidx.annotation.Keep;
import com.blaze.blazesdk.networking.annotations.BlazeNetworkRequest;
import defpackage.c2g;
import defpackage.i0e;
import defpackage.iga;
import defpackage.rq3;
import defpackage.usl;
import defpackage.yy1;
import java.util.List;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\b`\u0018\u00002\u00020\u0001J&\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\u000e\b\u0001\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002H§@¢\u0006\u0004\b\u0007\u0010\bø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\tÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/logger/apis/BlazeLoggerApi;", "", "", "Liga;", "eventBulk", "Lc2g;", "", "sendLogs", "(Ljava/util/List;Lrq3;)Ljava/lang/Object;", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public interface BlazeLoggerApi {
    @Keep
    @Nullable
    @usl
    @i0e("logs")
    @BlazeNetworkRequest(includeApiKey = true)
    Object sendLogs(@yy1 @NotNull List<iga> list, @NotNull rq3<? super c2g<Unit>> rq3Var);
}
