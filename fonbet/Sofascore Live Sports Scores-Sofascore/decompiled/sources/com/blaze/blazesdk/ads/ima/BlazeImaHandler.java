package com.blaze.blazesdk.ads.ima;

import android.content.Context;
import androidx.annotation.Keep;
import com.blaze.blazesdk.ads.ima.models.BlazeIMAAdRequestData;
import com.blaze.blazesdk.ads.models.ui.BlazeContentExtraInfo;
import defpackage.ale;
import defpackage.bh;
import defpackage.rq3;
import defpackage.xdh;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\bg\u0018\u00002\u00020\u0001J>\u0010\r\u001a\u0004\u0018\u00010\f2\u0006\u0010\u0003\u001a\u00020\u00022\u0006\u0010\u0005\u001a\u00020\u00042\b\u0010\u0007\u001a\u0004\u0018\u00010\u00062\u0006\u0010\t\u001a\u00020\b2\b\u0010\u000b\u001a\u0004\u0018\u00010\nH¦@¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u0010\u001a\u00020\u000fH&¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u000fH&¢\u0006\u0004\b\u0012\u0010\u0011R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00140\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0015\u0010\u0016R\u001a\u0010\u001a\u001a\b\u0012\u0004\u0012\u00020\u00180\u00138&X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0019\u0010\u0016ø\u0001\u0000\u0082\u0002\u0006\n\u0004\b!0\u0001¨\u0006\u001bÀ\u0006\u0001"}, d2 = {"Lcom/blaze/blazesdk/ads/ima/BlazeImaHandler;", "", "Landroid/content/Context;", "context", "Lbh;", "adViewProvider", "Lcom/blaze/blazesdk/ads/ima/models/BlazeIMAAdRequestData;", "requestData", "", "isMuted", "Lcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;", "contentExtraInfo", "Lale;", "createPlayer", "(Landroid/content/Context;Lbh;Lcom/blaze/blazesdk/ads/ima/models/BlazeIMAAdRequestData;ZLcom/blaze/blazesdk/ads/models/ui/BlazeContentExtraInfo;Lrq3;)Ljava/lang/Object;", "", "release", "()V", "clearImaAdEventBuffer", "Lxdh;", "Lcom/blaze/blazesdk/ads/ima/models/BlazeImaAdEvent;", "getImaAdEvent", "()Lxdh;", "imaAdEvent", "", "getAdErrorEvent", "adErrorEvent", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public interface BlazeImaHandler {
    void clearImaAdEventBuffer();

    @Nullable
    Object createPlayer(@NotNull Context context, @NotNull bh bhVar, @Nullable BlazeIMAAdRequestData blazeIMAAdRequestData, boolean z, @Nullable BlazeContentExtraInfo blazeContentExtraInfo, @NotNull rq3<? super ale> rq3Var);

    @NotNull
    xdh getAdErrorEvent();

    @NotNull
    xdh getImaAdEvent();

    void release();
}
