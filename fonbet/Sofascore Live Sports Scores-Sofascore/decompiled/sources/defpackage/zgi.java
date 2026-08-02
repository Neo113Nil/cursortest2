package defpackage;

import androidx.fragment.app.FragmentActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class zgi implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ FragmentActivity b;

    public /* synthetic */ zgi(FragmentActivity fragmentActivity, int i) {
        this.a = i;
        this.b = fragmentActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        FragmentActivity fragmentActivity = this.b;
        switch (i) {
            case 0:
                return fragmentActivity.getDefaultViewModelProviderFactory();
            case 1:
                return fragmentActivity.getViewModelStore();
            default:
                return fragmentActivity.getDefaultViewModelCreationExtras();
        }
    }
}
