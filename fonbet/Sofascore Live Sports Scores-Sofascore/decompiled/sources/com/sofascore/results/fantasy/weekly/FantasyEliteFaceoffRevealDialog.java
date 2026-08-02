package com.sofascore.results.fantasy.weekly;

import android.app.Dialog;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import android.view.Window;
import defpackage.ax6;
import defpackage.duf;
import defpackage.fi5;
import defpackage.fuf;
import defpackage.joa;
import defpackage.krk;
import defpackage.otk;
import defpackage.pu6;
import defpackage.t06;
import defpackage.tc3;
import defpackage.uw6;
import defpackage.wrh;
import defpackage.xp6;
import defpackage.xw6;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\b\u0007\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0007²\u0006\u000e\u0010\u0006\u001a\u00020\u00058\n@\nX\u008a\u008e\u0002"}, d2 = {"Lcom/sofascore/results/fantasy/weekly/FantasyEliteFaceoffRevealDialog;", "Lcom/sofascore/results/dialog/BaseFullScreenDialog;", "Lwrh;", "<init>", "()V", "", "showButton", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class FantasyEliteFaceoffRevealDialog extends Hilt_FantasyEliteFaceoffRevealDialog<wrh> {
    public final otk A;
    public final otk B;

    public FantasyEliteFaceoffRevealDialog() {
        joa a = ypa.a(ysa.c, new t06(new xw6(this, 3), 26));
        fuf fufVar = duf.a;
        this.A = new otk(fufVar.getOrCreateKotlinClass(ax6.class), new xp6(a, 15), new fi5(this, a, 26), new xp6(a, 16));
        this.B = new otk(fufVar.getOrCreateKotlinClass(pu6.class), new xw6(this, 0), new xw6(this, 2), new xw6(this, 1));
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog, androidx.fragment.app.DialogFragment
    public final Dialog l(Bundle bundle) {
        Dialog l = super.l(bundle);
        Window window = l.getWindow();
        if (window != null) {
            window.addFlags(67108864);
        }
        Window window2 = l.getWindow();
        if (window2 != null) {
            window2.addFlags(Integer.MIN_VALUE);
        }
        return l;
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final String q() {
        return "FaceoffRevealModal";
    }

    @Override // com.sofascore.results.dialog.BaseFullScreenDialog
    public final krk s(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        layoutInflater.getClass();
        wrh b = wrh.b(layoutInflater, viewGroup, false);
        b.b.setContent(new tc3(1838146817, new uw6(this, 0), true));
        return b;
    }

    public final ax6 v() {
        return (ax6) this.A.getValue();
    }
}
