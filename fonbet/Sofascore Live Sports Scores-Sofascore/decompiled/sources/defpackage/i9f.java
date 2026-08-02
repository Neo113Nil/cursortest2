package defpackage;

import com.sofascore.results.profile.editor.ProfileEditorFragment;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class i9f extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ProfileEditorFragment j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ i9f(ProfileEditorFragment profileEditorFragment, int i) {
        super(0);
        this.i = i;
        this.j = profileEditorFragment;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        ProfileEditorFragment profileEditorFragment = this.j;
        switch (i) {
            case 0:
                return profileEditorFragment.requireActivity().getViewModelStore();
            case 1:
                return profileEditorFragment.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return profileEditorFragment.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
