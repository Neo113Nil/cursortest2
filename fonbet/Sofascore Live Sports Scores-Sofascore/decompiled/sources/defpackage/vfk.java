package defpackage;

import com.sofascore.results.profile.UserProfileActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class vfk implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ UserProfileActivity b;

    public /* synthetic */ vfk(UserProfileActivity userProfileActivity, int i) {
        this.a = i;
        this.b = userProfileActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        UserProfileActivity userProfileActivity = this.b;
        switch (i) {
            case 0:
                return userProfileActivity.getDefaultViewModelProviderFactory();
            case 1:
                return userProfileActivity.getViewModelStore();
            case 2:
                return userProfileActivity.getDefaultViewModelCreationExtras();
            case 3:
                return userProfileActivity.getDefaultViewModelProviderFactory();
            case 4:
                return userProfileActivity.getViewModelStore();
            default:
                return userProfileActivity.getDefaultViewModelCreationExtras();
        }
    }
}
