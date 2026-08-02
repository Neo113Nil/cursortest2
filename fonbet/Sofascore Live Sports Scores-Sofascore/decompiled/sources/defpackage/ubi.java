package defpackage;

import com.sofascore.results.main.start.StartActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ubi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ StartActivity b;

    public /* synthetic */ ubi(StartActivity startActivity, int i) {
        this.a = i;
        this.b = startActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        StartActivity startActivity = this.b;
        switch (i) {
            case 0:
                return startActivity.getDefaultViewModelProviderFactory();
            case 1:
                return startActivity.getViewModelStore();
            case 2:
                return startActivity.getDefaultViewModelCreationExtras();
            case 3:
                return startActivity.getDefaultViewModelProviderFactory();
            case 4:
                return startActivity.getViewModelStore();
            default:
                return startActivity.getDefaultViewModelCreationExtras();
        }
    }
}
