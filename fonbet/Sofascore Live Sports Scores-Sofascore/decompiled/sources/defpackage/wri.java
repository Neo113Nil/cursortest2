package defpackage;

import com.sofascore.results.tv.TVScheduleActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class wri implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ TVScheduleActivity b;

    public /* synthetic */ wri(TVScheduleActivity tVScheduleActivity, int i) {
        this.a = i;
        this.b = tVScheduleActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        TVScheduleActivity tVScheduleActivity = this.b;
        switch (i) {
            case 0:
                return tVScheduleActivity.getDefaultViewModelProviderFactory();
            case 1:
                return tVScheduleActivity.getViewModelStore();
            default:
                return tVScheduleActivity.getDefaultViewModelCreationExtras();
        }
    }
}
