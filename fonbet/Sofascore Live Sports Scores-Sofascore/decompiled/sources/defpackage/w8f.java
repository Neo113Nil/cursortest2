package defpackage;

import android.content.Context;
import android.widget.ScrollView;
import com.sofascore.results.R;
import com.sofascore.results.profile.edit.ProfileEditFragment;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final /* synthetic */ class w8f implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ ProfileEditFragment b;

    public /* synthetic */ w8f(ProfileEditFragment profileEditFragment, int i) {
        this.a = i;
        this.b = profileEditFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        ProfileEditFragment profileEditFragment = this.b;
        switch (i) {
            case 0:
                profileEditFragment.H();
                return Unit.a;
            case 1:
                if (profileEditFragment.requireActivity().k().J() > 0) {
                    fp8 k = profileEditFragment.requireActivity().k();
                    k.x(new ep8(k, null, -1, 0), false);
                } else {
                    profileEditFragment.requireActivity().finish();
                }
                return Unit.a;
            case 2:
                int i2 = l94.C;
                Context requireContext = profileEditFragment.requireContext();
                requireContext.getClass();
                krk krkVar = profileEditFragment.l;
                krkVar.getClass();
                ScrollView scrollView = ((tq8) krkVar).a;
                scrollView.getClass();
                String string = profileEditFragment.getString(R.string.profile_badge_toast_message_text);
                string.getClass();
                return wxf.x(requireContext, scrollView, string, 0, 0, null, 5000, null, 1528);
            default:
                profileEditFragment.G();
                return Unit.a;
        }
    }
}
