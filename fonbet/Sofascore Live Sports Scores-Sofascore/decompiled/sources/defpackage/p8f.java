package defpackage;

import com.sofascore.results.profile.ProfileActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class p8f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileActivity b;

    public /* synthetic */ p8f(ProfileActivity profileActivity, int i) {
        this.a = i;
        this.b = profileActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ProfileActivity profileActivity = this.b;
        switch (i) {
            case 0:
                return profileActivity.getDefaultViewModelProviderFactory();
            case 1:
                return profileActivity.getViewModelStore();
            default:
                return profileActivity.getDefaultViewModelCreationExtras();
        }
    }
}
