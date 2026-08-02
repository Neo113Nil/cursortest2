package com.sofascore.results.profile.topLeaderboards;

import android.content.Context;
import android.view.LayoutInflater;
import android.view.View;
import androidx.compose.ui.platform.ComposeView;
import com.sofascore.results.R;
import com.sofascore.results.dialog.BaseModalBottomSheetDialog;
import defpackage.ate;
import defpackage.duf;
import defpackage.gta;
import defpackage.jbf;
import defpackage.mqi;
import defpackage.otk;
import defpackage.sbf;
import defpackage.t1d;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.zzl;
import kotlin.Metadata;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/profile/topLeaderboards/ProfileTopLeaderboardInfoModal;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class ProfileTopLeaderboardInfoModal extends BaseModalBottomSheetDialog {
    public final boolean w = true;
    public final otk x = new otk(duf.a.getOrCreateKotlinClass(sbf.class), new jbf(this, 0), new jbf(this, 2), new jbf(this, 1));
    public final mqi y = ypa.b(new ate(this, 18));

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final View D(LayoutInflater layoutInflater) {
        Context requireContext = requireContext();
        requireContext.getClass();
        ComposeView composeView = new ComposeView(requireContext, null, 6);
        composeView.setContent(new tc3(1346902178, new t1d(this, 20), true));
        return composeView;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        int ordinal = ((gta) this.y.getValue()).ordinal();
        if (ordinal == 0) {
            return "TopPredictorsModal";
        }
        if (ordinal == 1) {
            return "TopContributorsModal";
        }
        if (ordinal == 2) {
            return "TopEditorsModal";
        }
        zzl.b();
        return null;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getW() {
        return this.w;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        int i;
        int ordinal = ((gta) this.y.getValue()).ordinal();
        if (ordinal == 0) {
            i = R.string.top_predictors;
        } else if (ordinal == 1) {
            i = R.string.top_contributors_leaderboard;
        } else {
            if (ordinal != 2) {
                zzl.b();
                return null;
            }
            i = R.string.top_editors_leaderboard;
        }
        String string = getString(i);
        string.getClass();
        return string;
    }
}
