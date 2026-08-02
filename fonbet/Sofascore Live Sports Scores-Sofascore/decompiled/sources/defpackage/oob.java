package defpackage;

import com.sofascore.results.main.MainActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class oob implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MainActivity b;

    public /* synthetic */ oob(MainActivity mainActivity, int i) {
        this.a = i;
        this.b = mainActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MainActivity mainActivity = this.b;
        switch (i) {
            case 0:
                return mainActivity.getDefaultViewModelProviderFactory();
            case 1:
                return mainActivity.getViewModelStore();
            case 2:
                return mainActivity.getDefaultViewModelCreationExtras();
            case 3:
                return mainActivity.getDefaultViewModelProviderFactory();
            case 4:
                return mainActivity.getViewModelStore();
            case 5:
                return mainActivity.getDefaultViewModelCreationExtras();
            case 6:
                return mainActivity.getDefaultViewModelProviderFactory();
            case 7:
                return mainActivity.getViewModelStore();
            default:
                return mainActivity.getDefaultViewModelCreationExtras();
        }
    }
}
