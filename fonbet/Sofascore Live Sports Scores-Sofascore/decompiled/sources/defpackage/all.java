package defpackage;

import com.sofascore.results.wc26.widget.configurationActivity.WorldCupWidgetConfigActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class all implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ WorldCupWidgetConfigActivity b;

    public /* synthetic */ all(WorldCupWidgetConfigActivity worldCupWidgetConfigActivity, int i) {
        this.a = i;
        this.b = worldCupWidgetConfigActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        WorldCupWidgetConfigActivity worldCupWidgetConfigActivity = this.b;
        switch (i) {
            case 0:
                return worldCupWidgetConfigActivity.getDefaultViewModelProviderFactory();
            case 1:
                return worldCupWidgetConfigActivity.getViewModelStore();
            default:
                return worldCupWidgetConfigActivity.getDefaultViewModelCreationExtras();
        }
    }
}
