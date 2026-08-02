package defpackage;

import com.sofascore.results.profile.edit.ProfileEditActivity;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class v8f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditActivity b;

    public /* synthetic */ v8f(ProfileEditActivity profileEditActivity, int i) {
        this.a = i;
        this.b = profileEditActivity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ProfileEditActivity profileEditActivity = this.b;
        switch (i) {
            case 0:
                return profileEditActivity.getDefaultViewModelProviderFactory();
            case 1:
                return profileEditActivity.getViewModelStore();
            default:
                return profileEditActivity.getDefaultViewModelCreationExtras();
        }
    }
}
