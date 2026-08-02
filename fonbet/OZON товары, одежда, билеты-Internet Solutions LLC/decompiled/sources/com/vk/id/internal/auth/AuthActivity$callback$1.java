package com.vk.id.internal.auth;

import android.os.Bundle;
import com.vk.id.VKID;
import kotlin.Metadata;
import s.C9554b;

@Metadata(d1 = {"\u0000\u001d\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003*\u0001\u0000\b\n\u0018\u00002\u00020\u0001J!\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0003\u001a\u00020\u00022\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\b¨\u0006\t"}, d2 = {"com/vk/id/internal/auth/AuthActivity$callback$1", "Ls/b;", "", "navigationEvent", "Landroid/os/Bundle;", "extras", "", "onNavigationEvent", "(ILandroid/os/Bundle;)V", "vkid_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes9.dex */
public final class AuthActivity$callback$1 extends C9554b {
    final /* synthetic */ AuthActivity this$0;

    AuthActivity$callback$1(AuthActivity authActivity) {
        this.this$0 = authActivity;
    }

    @Override // s.C9554b
    public void onNavigationEvent(int navigationEvent, Bundle extras) {
        boolean z11;
        super.onNavigationEvent(navigationEvent, extras);
        if (navigationEvent == 2) {
            z11 = this.this$0.shouldReportCustomTabsPerformance;
            if (z11) {
                VKID.INSTANCE.getInstance().getPerformanceTracker().endTracking("CustomTabsAuth");
                this.this$0.shouldReportCustomTabsPerformance = false;
            }
        }
    }
}
