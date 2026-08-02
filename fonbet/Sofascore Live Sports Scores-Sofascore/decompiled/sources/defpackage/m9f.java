package defpackage;

import com.sofascore.results.profile.editor.ProfileEditorTournamentsModal;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class m9f extends xka implements Function0 {
    public final /* synthetic */ int i;
    public final /* synthetic */ ProfileEditorTournamentsModal j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ m9f(ProfileEditorTournamentsModal profileEditorTournamentsModal, int i) {
        super(0);
        this.i = i;
        this.j = profileEditorTournamentsModal;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.i;
        ProfileEditorTournamentsModal profileEditorTournamentsModal = this.j;
        switch (i) {
            case 0:
                return profileEditorTournamentsModal.requireActivity().getViewModelStore();
            case 1:
                return profileEditorTournamentsModal.requireActivity().getDefaultViewModelCreationExtras();
            default:
                return profileEditorTournamentsModal.requireActivity().getDefaultViewModelProviderFactory();
        }
    }
}
