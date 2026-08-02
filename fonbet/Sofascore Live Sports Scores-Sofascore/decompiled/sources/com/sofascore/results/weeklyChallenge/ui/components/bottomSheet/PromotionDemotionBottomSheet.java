package com.sofascore.results.weeklyChallenge.ui.components.bottomSheet;

import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.view.LayoutInflater;
import android.view.View;
import com.sofascore.model.weeklyChallenge.WeeklyChallengeLeagueAsset;
import com.sofascore.model.weeklyChallenge.WeeklyLeagueImageUrl;
import com.sofascore.model.weeklyChallenge.WeeklyStatus;
import com.sofascore.results.R;
import defpackage.a5f;
import defpackage.bfk;
import defpackage.bv;
import defpackage.duf;
import defpackage.dv;
import defpackage.i1f;
import defpackage.kv;
import defpackage.mqi;
import defpackage.nv;
import defpackage.p4b;
import defpackage.tc3;
import defpackage.uic;
import defpackage.vz1;
import defpackage.xdf;
import defpackage.ydf;
import defpackage.ypa;
import defpackage.yso;
import defpackage.zzl;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KClass;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u00012\u00020\u0002B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/weeklyChallenge/ui/components/bottomSheet/PromotionDemotionBottomSheet;", "Lcom/sofascore/results/dialog/BaseModalBottomSheetDialog;", "Lvz1;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PromotionDemotionBottomSheet extends Hilt_PromotionDemotionBottomSheet implements vz1 {
    public bfk C;
    public final mqi B = ypa.b(new ydf(this, 0));
    public final boolean D = true;
    public final KClass E = duf.a.getOrCreateKotlinClass(i1f.class);
    public final mqi F = ypa.b(new ydf(this, 1));

    /* JADX WARN: Code restructure failed: missing block: B:6:0x0020, code lost:
    
        if (((com.sofascore.model.weeklyChallenge.WeeklyStatus.WeeklyUnchanged) r0).getStreakBroken() != false) goto L10;
     */
    /* JADX WARN: Removed duplicated region for block: B:10:0x002c  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0147  */
    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final View D(LayoutInflater layoutInflater) {
        boolean z;
        bfk bfkVar;
        Object obj;
        int i;
        WeeklyLeagueImageUrl lockedImageLightUrl;
        String png;
        WeeklyLeagueImageUrl lockedImageLightUrl2;
        String png2;
        WeeklyLeagueImageUrl imageUrl;
        String png3;
        String title;
        if (!(H() instanceof WeeklyStatus.WeeklyDemotion)) {
            if (H() instanceof WeeklyStatus.WeeklyUnchanged) {
                WeeklyStatus H = H();
                H.getClass();
            }
            z = false;
            bfkVar = this.C;
            if (bfkVar != null) {
                Intrinsics.i("userAccountManager");
                throw null;
            }
            Iterator it = bfkVar.c.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (((WeeklyChallengeLeagueAsset) obj).getLevel() == H().getNewTier()) {
                    break;
                }
            }
            WeeklyChallengeLeagueAsset weeklyChallengeLeagueAsset = (WeeklyChallengeLeagueAsset) obj;
            p4b p4bVar = new p4b(true, false, (weeklyChallengeLeagueAsset == null || (title = weeklyChallengeLeagueAsset.getTitle()) == null) ? "" : title, (weeklyChallengeLeagueAsset == null || (imageUrl = weeklyChallengeLeagueAsset.getImageUrl()) == null || (png3 = imageUrl.getPng()) == null) ? "" : png3, (weeklyChallengeLeagueAsset == null || (lockedImageLightUrl2 = weeklyChallengeLeagueAsset.getLockedImageLightUrl()) == null || (png2 = lockedImageLightUrl2.getPng()) == null) ? "" : png2, (weeklyChallengeLeagueAsset == null || (lockedImageLightUrl = weeklyChallengeLeagueAsset.getLockedImageLightUrl()) == null || (png = lockedImageLightUrl.getPng()) == null) ? "" : png, 1, 0);
            WeeklyStatus H2 = H();
            if (H2 instanceof WeeklyStatus.WeeklyDemotion) {
                i = R.string.weekly_challenge_results_relegated;
            } else if (H2 instanceof WeeklyStatus.WeeklyPromotion) {
                i = R.string.weekly_challenge_results_promoted;
            } else if (H2 instanceof WeeklyStatus.WeeklyUnchanged) {
                i = R.string.weekly_challenge_results_staying;
            } else {
                if (!(H2 instanceof WeeklyStatus.WeeklyUnchangedOnTop)) {
                    zzl.b();
                    return null;
                }
                i = R.string.weekly_challenge_results_staying_top;
            }
            this.t.b = e().a;
            String string = H() instanceof WeeklyStatus.WeeklyUnchangedOnTop ? requireContext().getString(R.string.weekly_challenge_placement_top_league, H().getPreviousLeagueName(), Integer.valueOf(H().getPreviousRanking())) : requireContext().getString(R.string.weekly_challenge_results_placement, Integer.valueOf(H().getPreviousRanking()), H().getPreviousLeagueName());
            string.getClass();
            Context requireContext = requireContext();
            requireContext.getClass();
            nv.l0(requireContext, dv.POPUP_QUEUE, e(), null);
            return yso.s(this, new tc3(-1892093554, new xdf(i, string, p4bVar, z, this, 0), true));
        }
        z = true;
        bfkVar = this.C;
        if (bfkVar != null) {
        }
    }

    public final WeeklyStatus H() {
        return (WeeklyStatus) this.B.getValue();
    }

    @Override // defpackage.vz1
    /* renamed from: b, reason: from getter */
    public final KClass getX() {
        return this.E;
    }

    @Override // defpackage.vz1
    public final bv e() {
        return (bv) this.F.getValue();
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.DialogFragment, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        SharedPreferences d;
        dialogInterface.getClass();
        Context requireContext = requireContext();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        if (sharedPreferences.getBoolean("PREF_WEEKLY_CHALLENGE_MUTED", false)) {
            Context requireContext2 = requireContext();
            requireContext2.getClass();
            nv.z0(requireContext2, kv.CLICK, "mute_wc_popup", "wc_popup");
        }
        super.onDismiss(dialogInterface);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "WeekStatusModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x, reason: from getter */
    public final boolean getD() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
