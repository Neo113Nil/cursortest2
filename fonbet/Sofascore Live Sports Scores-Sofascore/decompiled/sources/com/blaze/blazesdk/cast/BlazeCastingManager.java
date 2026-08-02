package com.blaze.blazesdk.cast;

import android.app.Application;
import androidx.annotation.Keep;
import com.blaze.blazesdk.delegates.BlazeCastingDelegate;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.google.android.gms.cast.framework.CastContext;
import defpackage.wca;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\n\u001a\u00020\u000bR\u001c\u0010\u0004\u001a\u0004\u0018\u00010\u0005X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lcom/blaze/blazesdk/cast/BlazeCastingManager;", "", "<init>", "()V", "delegate", "Lcom/blaze/blazesdk/delegates/BlazeCastingDelegate;", "getDelegate", "()Lcom/blaze/blazesdk/delegates/BlazeCastingDelegate;", "setDelegate", "(Lcom/blaze/blazesdk/delegates/BlazeCastingDelegate;)V", "stopActiveCastingSession", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazeCastingManager {
    public static final int $stable = 8;

    @Nullable
    private BlazeCastingDelegate delegate;

    @Nullable
    public final BlazeCastingDelegate getDelegate() {
        return this.delegate;
    }

    public final void setDelegate(@Nullable BlazeCastingDelegate blazeCastingDelegate) {
        this.delegate = blazeCastingDelegate;
    }

    public final void stopActiveCastingSession() {
        try {
            Application application$blazesdk_release = BlazeSDK.INSTANCE.getApplication$blazesdk_release();
            if (application$blazesdk_release == null) {
                return;
            }
            CastContext c = CastContext.c(application$blazesdk_release);
            c.getClass();
            wca.n(c);
        } catch (Exception e) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
        }
    }
}
