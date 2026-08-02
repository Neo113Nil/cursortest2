package defpackage;

import android.app.Activity;
import androidx.appcompat.app.AppCompatActivity;
import com.sofascore.results.fantasy.onboarding.components.bottomSheet.FantasySectionedInfoType;
import com.sofascore.results.main.fantasy.bottomsheet.FantasySectionedBottomSheetFragment;
import com.sofascore.results.main.fantasy.center.reorder.FantasyReorderUserCompetitionsBottomSheet;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class iq7 implements Function0 {
    public final /* synthetic */ int a;
    public final /* synthetic */ Activity b;

    public /* synthetic */ iq7(Activity activity, int i) {
        this.a = i;
        this.b = activity;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Activity activity = this.b;
        switch (i) {
            case 0:
                if (activity != null) {
                    activity.finish();
                }
                break;
            case 1:
                if (activity != null) {
                    FantasySectionedBottomSheetFragment fantasySectionedBottomSheetFragment = new FantasySectionedBottomSheetFragment();
                    fantasySectionedBottomSheetFragment.setArguments(fz8.C(fz8.F("FANTASY_SECTIONED_INFO_TYPE", FantasySectionedInfoType.WhatIsFantasy.a)));
                    AppCompatActivity appCompatActivity = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                    if (appCompatActivity != null) {
                        wca.x(appCompatActivity.getLifecycle()).b(new r1(fantasySectionedBottomSheetFragment, appCompatActivity, rq3Var, i2));
                    }
                }
                break;
            case 2:
                if (activity != null) {
                    FantasyReorderUserCompetitionsBottomSheet fantasyReorderUserCompetitionsBottomSheet = new FantasyReorderUserCompetitionsBottomSheet();
                    AppCompatActivity appCompatActivity2 = activity instanceof AppCompatActivity ? (AppCompatActivity) activity : null;
                    if (appCompatActivity2 != null) {
                        wca.x(appCompatActivity2.getLifecycle()).b(new r1(fantasyReorderUserCompetitionsBottomSheet, appCompatActivity2, rq3Var, i2));
                    }
                }
                break;
            default:
                if (activity != null) {
                    activity.finish();
                }
                break;
        }
        return Unit.a;
    }
}
