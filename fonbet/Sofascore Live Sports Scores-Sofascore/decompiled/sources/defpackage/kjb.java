package defpackage;

import com.sofascore.results.profile.LoginScreenActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class kjb implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ LoginScreenActivity b;

    public /* synthetic */ kjb(LoginScreenActivity loginScreenActivity, int i) {
        this.a = i;
        this.b = loginScreenActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        LoginScreenActivity loginScreenActivity = this.b;
        switch (i) {
            case 0:
                return loginScreenActivity.getDefaultViewModelProviderFactory();
            case 1:
                return loginScreenActivity.getViewModelStore();
            default:
                return loginScreenActivity.getDefaultViewModelCreationExtras();
        }
    }
}
