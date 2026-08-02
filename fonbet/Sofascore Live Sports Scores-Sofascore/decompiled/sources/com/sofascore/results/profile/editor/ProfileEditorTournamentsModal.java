package com.sofascore.results.profile.editor;

import com.sofascore.results.R;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import defpackage.duf;
import defpackage.m9f;
import defpackage.otk;
import defpackage.q9f;
import defpackage.t1d;
import defpackage.tc3;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0007²\u0006\u0012\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\nX\u008a\u0084\u0002"}, d2 = {"Lcom/sofascore/results/profile/editor/ProfileEditorTournamentsModal;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "Lvnb;", "Lpi5;", "state", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileEditorTournamentsModal extends ComposeModalBottomSheetDialog {
    public final otk x = new otk(duf.a.getOrCreateKotlinClass(q9f.class), new m9f(this, 0), new m9f(this, 2), new m9f(this, 1));

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getI() {
        return new tc3(106456657, new t1d(this, 17), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "EditorLeaguesModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.profile_edited_competitions);
        string.getClass();
        return string;
    }
}
