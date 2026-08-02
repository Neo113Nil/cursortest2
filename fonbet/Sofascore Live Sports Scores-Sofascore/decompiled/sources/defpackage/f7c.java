package defpackage;

import androidx.fragment.app.Fragment;
import com.sofascore.results.feed.MediaPostFeedbackBottomSheet;
import java.util.Set;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class f7c implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ MediaPostFeedbackBottomSheet b;

    public /* synthetic */ f7c(MediaPostFeedbackBottomSheet mediaPostFeedbackBottomSheet, int i) {
        this.a = i;
        this.b = mediaPostFeedbackBottomSheet;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        MediaPostFeedbackBottomSheet mediaPostFeedbackBottomSheet = this.b;
        switch (i) {
            case 0:
                Fragment requireParentFragment = mediaPostFeedbackBottomSheet.requireParentFragment();
                requireParentFragment.getClass();
                return requireParentFragment;
            default:
                my7 my7Var = (my7) mediaPostFeedbackBottomSheet.C.getValue();
                xw3.L(un0.z(my7Var), null, null, new z23(my7Var, (Set) my7Var.h.a.getValue(), null), 3);
                mediaPostFeedbackBottomSheet.j();
                return Unit.a;
        }
    }
}
