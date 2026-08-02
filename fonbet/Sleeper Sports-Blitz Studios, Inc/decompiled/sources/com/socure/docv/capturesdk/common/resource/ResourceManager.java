package com.socure.docv.capturesdk.common.resource;

import android.content.Context;
import com.socure.docv.capturesdk.common.config.model.SupportedFeatures;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: ResourceManager.kt */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0000\u0018\u00002\u00020\u0001B\u0005¢\u0006\u0002\u0010\u0002J\u0015\u0010\u0005\u001a\u00020\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0000¢\u0006\u0002\b\tJ\r\u0010\u0003\u001a\u00020\u0004H\u0000¢\u0006\u0002\b\nR\u000e\u0010\u0003\u001a\u00020\u0004X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/socure/docv/capturesdk/common/resource/ResourceManager;", "", "()V", "supportedFeatures", "Lcom/socure/docv/capturesdk/common/config/model/SupportedFeatures;", "readMemory", "", "context", "Landroid/content/Context;", "readMemory$capturesdk_productionRelease", "supportedFeatures$capturesdk_productionRelease", "capturesdk_productionRelease"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class ResourceManager {
    private final SupportedFeatures supportedFeatures = new SupportedFeatures();

    /* renamed from: supportedFeatures$capturesdk_productionRelease, reason: from getter */
    public final SupportedFeatures getSupportedFeatures() {
        return this.supportedFeatures;
    }

    public final void readMemory$capturesdk_productionRelease(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.supportedFeatures.readMemory$capturesdk_productionRelease(context);
    }
}
