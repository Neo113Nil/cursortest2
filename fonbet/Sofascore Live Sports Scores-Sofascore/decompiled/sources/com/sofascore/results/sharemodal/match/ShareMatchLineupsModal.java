package com.sofascore.results.sharemodal.match;

import android.content.Context;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.IShareContent;
import com.sofascore.results.R;
import com.sofascore.results.sharemodal.match.ShareMatchLineupsModal;
import defpackage.bnf;
import defpackage.c9b;
import defpackage.duf;
import defpackage.f06;
import defpackage.fdi;
import defpackage.g7;
import defpackage.kch;
import defpackage.mqi;
import defpackage.nch;
import defpackage.otk;
import defpackage.p06;
import defpackage.r8b;
import defpackage.xch;
import defpackage.ypa;
import defpackage.zch;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/sharemodal/match/ShareMatchLineupsModal;", "Lcom/sofascore/results/sharemodal/BaseSinglePageShareModal;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ShareMatchLineupsModal extends Hilt_ShareMatchLineupsModal {
    public final mqi E;
    public final mqi F;
    public final otk D = new otk(duf.a.getOrCreateKotlinClass(p06.class), new xch(this, 0), new xch(this, 2), new xch(this, 1));
    public final kch G = kch.EVENT_LINEUPS;

    public ShareMatchLineupsModal() {
        final int i = 0;
        final int i2 = 1;
        this.E = ypa.b(new Function0(this) { // from class: wch
            public final /* synthetic */ ShareMatchLineupsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i;
                ShareMatchLineupsModal shareMatchLineupsModal = this.b;
                switch (i3) {
                    case 0:
                        IShareContent data = shareMatchLineupsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchLineupsModal.requireContext();
                        requireContext.getClass();
                        return new nm5(requireContext, 0);
                }
            }
        });
        this.F = ypa.b(new Function0(this) { // from class: wch
            public final /* synthetic */ ShareMatchLineupsModal b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i3 = i2;
                ShareMatchLineupsModal shareMatchLineupsModal = this.b;
                switch (i3) {
                    case 0:
                        IShareContent data = shareMatchLineupsModal.H().getData();
                        data.getClass();
                        return (Event) data;
                    default:
                        Context requireContext = shareMatchLineupsModal.requireContext();
                        requireContext.getClass();
                        return new nm5(requireContext, 0);
                }
            }
        });
    }

    @Override // com.sofascore.results.sharemodal.BaseShareModal
    /* renamed from: F, reason: from getter */
    public final kch getG() {
        return this.G;
    }

    @Override // com.sofascore.results.sharemodal.BaseSinglePageShareModal
    public final void L() {
        g7 M = M();
        Context requireContext = requireContext();
        requireContext.getClass();
        zch zchVar = new zch(requireContext);
        zchVar.j(getViewLifecycleOwner().getLifecycle(), (Event) this.E.getValue());
        M.p(M.g.size(), zchVar);
    }

    @Override // com.sofascore.results.sharemodal.BaseSinglePageShareModal
    public final g7 M() {
        return (g7) this.F.getValue();
    }

    @Override // com.sofascore.results.sharemodal.BaseSinglePageShareModal
    public final void N() {
        c9b c9bVar;
        fdi fdiVar;
        Object value;
        fdi fdiVar2;
        Object value2;
        fdi fdiVar3;
        Object value3;
        f06 f06Var = (f06) ((p06) this.D.getValue()).l().a();
        if (f06Var == null || (c9bVar = f06Var.a) == null) {
            return;
        }
        g7 M = M();
        Context requireContext = requireContext();
        requireContext.getClass();
        nch nchVar = new nch(requireContext);
        r8b r8bVar = f06Var.d;
        bnf bnfVar = f06Var.e;
        r8bVar.getClass();
        bnfVar.getClass();
        do {
            fdiVar = nchVar.k;
            value = fdiVar.getValue();
        } while (!fdiVar.k(value, c9bVar));
        do {
            fdiVar2 = nchVar.l;
            value2 = fdiVar2.getValue();
        } while (!fdiVar2.k(value2, r8bVar));
        do {
            fdiVar3 = nchVar.m;
            value3 = fdiVar3.getValue();
        } while (!fdiVar3.k(value3, bnfVar));
        M.p(M.g.size(), nchVar);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "ShareMatchLineupsModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        String string = getString(R.string.share_match_lineups);
        string.getClass();
        return string;
    }
}
