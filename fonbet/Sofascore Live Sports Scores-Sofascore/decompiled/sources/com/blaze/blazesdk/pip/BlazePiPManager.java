package com.blaze.blazesdk.pip;

import androidx.annotation.Keep;
import com.blaze.blazesdk.delegates.BlazePipDelegate;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.ironsource.U3;
import kotlin.Metadata;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Keep
@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u0002\n\u0000\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0010\u001a\u00020\u0011R$\u0010\u0006\u001a\u00020\u00052\u0006\u0010\u0004\u001a\u00020\u0005@@X\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\u0006\u0010\u0007\"\u0004\b\b\u0010\tR\u001c\u0010\n\u001a\u0004\u0018\u00010\u000bX\u0086\u000e¢\u0006\u000e\n\u0000\u001a\u0004\b\f\u0010\r\"\u0004\b\u000e\u0010\u000f¨\u0006\u0012"}, d2 = {"Lcom/blaze/blazesdk/pip/BlazePiPManager;", "", "<init>", "()V", U3.i.X, "", "isActive", "()Z", "setActive$blazesdk_release", "(Z)V", "delegate", "Lcom/blaze/blazesdk/delegates/BlazePipDelegate;", "getDelegate", "()Lcom/blaze/blazesdk/delegates/BlazePipDelegate;", "setDelegate", "(Lcom/blaze/blazesdk/delegates/BlazePipDelegate;)V", "stopActivePiPSession", "", "blazesdk_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes.dex */
public final class BlazePiPManager {
    public static final int $stable = 8;

    @Nullable
    private BlazePipDelegate delegate;
    private boolean isActive;

    @Nullable
    public final BlazePipDelegate getDelegate() {
        return this.delegate;
    }

    /* renamed from: isActive, reason: from getter */
    public final boolean getIsActive() {
        return this.isActive;
    }

    public final void setActive$blazesdk_release(boolean z) {
        this.isActive = z;
    }

    public final void setDelegate(@Nullable BlazePipDelegate blazePipDelegate) {
        this.delegate = blazePipDelegate;
    }

    public final void stopActivePiPSession() {
        if (this.isActive) {
            try {
                BlazeSDK.INSTANCE.dismissCurrentPlayer();
            } catch (Exception e) {
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(e, null);
            }
        }
    }
}
