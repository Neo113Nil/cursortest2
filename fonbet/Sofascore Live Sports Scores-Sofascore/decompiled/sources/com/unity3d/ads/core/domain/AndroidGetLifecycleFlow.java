package com.unity3d.ads.core.domain;

import android.app.Application;
import android.content.Context;
import defpackage.a70;
import defpackage.k53;
import defpackage.yso;
import defpackage.z88;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0016\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006H\u0086\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\n¨\u0006\u000b"}, d2 = {"Lcom/unity3d/ads/core/domain/AndroidGetLifecycleFlow;", "", "Landroid/content/Context;", "applicationContext", "<init>", "(Landroid/content/Context;)V", "Lz88;", "Lcom/unity3d/ads/core/domain/LifecycleEvent;", "invoke", "()Lz88;", "Landroid/content/Context;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class AndroidGetLifecycleFlow {

    @NotNull
    private final Context applicationContext;

    public AndroidGetLifecycleFlow(@NotNull Context context) {
        context.getClass();
        this.applicationContext = context;
    }

    @NotNull
    public final z88 invoke() {
        if (this.applicationContext instanceof Application) {
            return k53.W(yso.r(new AndroidGetLifecycleFlow$invoke$2(this, null)), Integer.MAX_VALUE);
        }
        a70.p("Application context is required");
        return null;
    }
}
