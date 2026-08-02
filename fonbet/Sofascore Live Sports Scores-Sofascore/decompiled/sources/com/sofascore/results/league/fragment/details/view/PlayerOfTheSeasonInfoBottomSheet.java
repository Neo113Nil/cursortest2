package com.sofascore.results.league.fragment.details.view;

import android.content.Context;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.results.R;
import com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog;
import com.sofascore.results.league.fragment.details.view.PlayerOfTheSeasonInfoBottomSheet;
import defpackage.hkg;
import defpackage.joa;
import defpackage.t1d;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lcom/sofascore/results/league/fragment/details/view/PlayerOfTheSeasonInfoBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class PlayerOfTheSeasonInfoBottomSheet extends ComposeModalBottomSheetDialog {
    public final joa x;
    public final joa y;

    public PlayerOfTheSeasonInfoBottomSheet() {
        final int i = 0;
        Function0 function0 = new Function0(this) { // from class: bue
            public final /* synthetic */ PlayerOfTheSeasonInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i2 = i;
                PlayerOfTheSeasonInfoBottomSheet playerOfTheSeasonInfoBottomSheet = this.b;
                switch (i2) {
                    case 0:
                        String string = playerOfTheSeasonInfoBottomSheet.requireArguments().getString("ARG_GENDER");
                        if (string == null) {
                            return null;
                        }
                        if (string.length() <= 0) {
                            string = null;
                        }
                        if (string != null) {
                            return Gender.INSTANCE.getFromValue(string);
                        }
                        return null;
                    default:
                        return playerOfTheSeasonInfoBottomSheet.requireArguments().getString("ARG_SPORT_SLUG", "");
                }
            }
        };
        ysa ysaVar = ysa.c;
        this.x = ypa.a(ysaVar, function0);
        final int i2 = 1;
        this.y = ypa.a(ysaVar, new Function0(this) { // from class: bue
            public final /* synthetic */ PlayerOfTheSeasonInfoBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                int i22 = i2;
                PlayerOfTheSeasonInfoBottomSheet playerOfTheSeasonInfoBottomSheet = this.b;
                switch (i22) {
                    case 0:
                        String string = playerOfTheSeasonInfoBottomSheet.requireArguments().getString("ARG_GENDER");
                        if (string == null) {
                            return null;
                        }
                        if (string.length() <= 0) {
                            string = null;
                        }
                        if (string != null) {
                            return Gender.INSTANCE.getFromValue(string);
                        }
                        return null;
                    default:
                        return playerOfTheSeasonInfoBottomSheet.requireArguments().getString("ARG_SPORT_SLUG", "");
                }
            }
        });
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H */
    public final tc3 getE() {
        return new tc3(-186934931, new t1d(this, 11), true);
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return "PlayerOfTheSeasonInfoModal";
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        Context requireContext = requireContext();
        requireContext.getClass();
        return hkg.Q(requireContext, R.string.player_of_the_season_award, (Gender) this.x.getValue(), new Object[0]);
    }
}
