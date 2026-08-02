package defpackage;

import com.sofascore.results.event.EventActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class br5 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ EventActivity b;

    public /* synthetic */ br5(EventActivity eventActivity, int i) {
        this.a = i;
        this.b = eventActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        EventActivity eventActivity = this.b;
        switch (i) {
            case 0:
                return eventActivity.getDefaultViewModelProviderFactory();
            case 1:
                return eventActivity.getViewModelStore();
            case 2:
                return eventActivity.getDefaultViewModelCreationExtras();
            case 3:
                return eventActivity.getDefaultViewModelProviderFactory();
            case 4:
                return eventActivity.getViewModelStore();
            case 5:
                return eventActivity.getDefaultViewModelCreationExtras();
            case 6:
                return eventActivity.getDefaultViewModelProviderFactory();
            case 7:
                return eventActivity.getViewModelStore();
            default:
                return eventActivity.getDefaultViewModelCreationExtras();
        }
    }
}
