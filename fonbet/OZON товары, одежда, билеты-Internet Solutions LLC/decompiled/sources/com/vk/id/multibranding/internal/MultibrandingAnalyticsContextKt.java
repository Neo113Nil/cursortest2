package com.vk.id.multibranding.internal;

import S0.B1;
import S0.G0;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;
import ta.C9790a;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0007\"&\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00010\u00008\u0006X\u0087\u0004¢\u0006\u0012\n\u0004\b\u0002\u0010\u0003\u0012\u0004\b\u0006\u0010\u0007\u001a\u0004\b\u0004\u0010\u0005¨\u0006\b"}, d2 = {"LS0/G0;", "Lcom/vk/id/multibranding/internal/MultibrandingAnalyticsContext;", "LocalMultibrandingAnalyticsContext", "LS0/G0;", "getLocalMultibrandingAnalyticsContext", "()LS0/G0;", "getLocalMultibrandingAnalyticsContext$annotations", "()V", "multibranding-internal_release"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class MultibrandingAnalyticsContextKt {

    @NotNull
    private static final G0<MultibrandingAnalyticsContext> LocalMultibrandingAnalyticsContext = new B1(new C9790a());

    /* JADX INFO: Access modifiers changed from: private */
    public static final MultibrandingAnalyticsContext LocalMultibrandingAnalyticsContext$lambda$0() {
        return new MultibrandingAnalyticsContext("multibranding_widget", false);
    }

    @NotNull
    public static final G0<MultibrandingAnalyticsContext> getLocalMultibrandingAnalyticsContext() {
        return LocalMultibrandingAnalyticsContext;
    }
}
