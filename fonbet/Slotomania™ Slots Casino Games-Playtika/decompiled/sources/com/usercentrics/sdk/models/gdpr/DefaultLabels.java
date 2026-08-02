package com.usercentrics.sdk.models.gdpr;

import androidx.core.app.NotificationCompat;
import com.usercentrics.sdk.models.settings.PredefinedUIAriaLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIGeneralLabels;
import com.usercentrics.sdk.models.settings.PredefinedUIServiceLabels;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: UIData.kt */
@Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\b\b\u0000\u0018\u00002\u00020\u0001B\u001d\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0007¢\u0006\u0002\u0010\bR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lcom/usercentrics/sdk/models/gdpr/DefaultLabels;", "", "general", "Lcom/usercentrics/sdk/models/settings/PredefinedUIGeneralLabels;", NotificationCompat.CATEGORY_SERVICE, "Lcom/usercentrics/sdk/models/settings/PredefinedUIServiceLabels;", "ariaLabels", "Lcom/usercentrics/sdk/models/settings/PredefinedUIAriaLabels;", "(Lcom/usercentrics/sdk/models/settings/PredefinedUIGeneralLabels;Lcom/usercentrics/sdk/models/settings/PredefinedUIServiceLabels;Lcom/usercentrics/sdk/models/settings/PredefinedUIAriaLabels;)V", "getAriaLabels", "()Lcom/usercentrics/sdk/models/settings/PredefinedUIAriaLabels;", "getGeneral", "()Lcom/usercentrics/sdk/models/settings/PredefinedUIGeneralLabels;", "getService", "()Lcom/usercentrics/sdk/models/settings/PredefinedUIServiceLabels;", "usercentrics_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes8.dex */
public final class DefaultLabels {
    private final PredefinedUIAriaLabels ariaLabels;
    private final PredefinedUIGeneralLabels general;
    private final PredefinedUIServiceLabels service;

    public DefaultLabels(PredefinedUIGeneralLabels general, PredefinedUIServiceLabels service, PredefinedUIAriaLabels ariaLabels) {
        Intrinsics.checkNotNullParameter(general, "general");
        Intrinsics.checkNotNullParameter(service, "service");
        Intrinsics.checkNotNullParameter(ariaLabels, "ariaLabels");
        this.general = general;
        this.service = service;
        this.ariaLabels = ariaLabels;
    }

    public final PredefinedUIGeneralLabels getGeneral() {
        return this.general;
    }

    public final PredefinedUIServiceLabels getService() {
        return this.service;
    }

    public final PredefinedUIAriaLabels getAriaLabels() {
        return this.ariaLabels;
    }
}
