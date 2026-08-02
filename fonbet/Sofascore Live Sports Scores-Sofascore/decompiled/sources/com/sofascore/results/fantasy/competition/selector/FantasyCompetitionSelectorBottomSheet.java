package com.sofascore.results.fantasy.competition.selector;

import android.content.DialogInterface;
import com.sofascore.results.R;
import defpackage.duf;
import defpackage.fdi;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.hp6;
import defpackage.jo6;
import defpackage.joa;
import defpackage.otk;
import defpackage.su6;
import defpackage.t06;
import defpackage.tc3;
import defpackage.xp6;
import defpackage.xu6;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/fantasy/competition/selector/FantasyCompetitionSelectorBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyCompetitionSelectorBottomSheet extends Hilt_FantasyCompetitionSelectorBottomSheet {
    public final otk C;
    public final otk D;

    public FantasyCompetitionSelectorBottomSheet() {
        joa a = ypa.a(ysa.c, new t06(new su6(this, 3), 20));
        fuf fufVar = duf.a;
        this.C = new otk(fufVar.getOrCreateKotlinClass(xu6.class), new xp6(a, 5), new fi5(this, a, 21), new xp6(a, 6));
        this.D = new otk(fufVar.getOrCreateKotlinClass(hp6.class), new su6(this, 0), new su6(this, 2), new su6(this, 1));
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(1800226287, new jo6(this, 6), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        Object value;
        dialogInterface.getClass();
        super.onDismiss(dialogInterface);
        fdi fdiVar = ((hp6) this.D.getValue()).j;
        do {
            value = fdiVar.getValue();
            ((Boolean) value).getClass();
        } while (!fdiVar.k(value, Boolean.FALSE));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ChangeCompetitionModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = requireContext().getString(R.string.sofascore_fantasy);
        string.getClass();
        return string;
    }
}
