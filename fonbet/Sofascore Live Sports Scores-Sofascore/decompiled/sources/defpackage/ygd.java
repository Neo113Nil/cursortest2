package defpackage;

import com.sofascore.results.notifications.NotificationSettingsActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ygd implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ NotificationSettingsActivity b;

    public /* synthetic */ ygd(NotificationSettingsActivity notificationSettingsActivity, int i) {
        this.a = i;
        this.b = notificationSettingsActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        NotificationSettingsActivity notificationSettingsActivity = this.b;
        switch (i) {
            case 0:
                return notificationSettingsActivity.getDefaultViewModelProviderFactory();
            case 1:
                return notificationSettingsActivity.getViewModelStore();
            default:
                return notificationSettingsActivity.getDefaultViewModelCreationExtras();
        }
    }
}
