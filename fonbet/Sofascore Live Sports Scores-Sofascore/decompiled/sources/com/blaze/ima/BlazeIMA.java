package com.blaze.ima;

import androidx.annotation.Keep;
import com.blaze.blazesdk.shared.BlazeSDK;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0014\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007H\u0007J\b\u0010\b\u001a\u00020\u0005H\u0007¨\u0006\t"}, d2 = {"Lcom/blaze/ima/BlazeIMA;", "", "<init>", "()V", "enableAds", "", "delegate", "Lcom/blaze/ima/BlazeIMADelegate;", "disableAds", "blaze_ima_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class BlazeIMA {

    @NotNull
    public static final BlazeIMA INSTANCE = new BlazeIMA();

    private BlazeIMA() {
    }

    public static /* synthetic */ void enableAds$default(BlazeIMA blazeIMA, BlazeIMADelegate blazeIMADelegate, int i, Object obj) {
        if ((i & 1) != 0) {
            blazeIMADelegate = null;
        }
        blazeIMA.enableAds(blazeIMADelegate);
    }

    @Keep
    public final void disableAds() {
        BlazeSDK.INSTANCE.setImaHandler(null);
    }

    @Keep
    public final void enableAds(@Nullable BlazeIMADelegate delegate) {
        BlazeSDK.INSTANCE.setImaHandler(new ImaHandler(delegate));
    }

    @Keep
    public final void enableAds() {
        enableAds$default(this, null, 1, null);
    }
}
