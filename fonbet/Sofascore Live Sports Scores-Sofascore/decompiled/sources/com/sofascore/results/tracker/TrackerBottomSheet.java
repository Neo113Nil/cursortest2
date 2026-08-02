package com.sofascore.results.tracker;

import android.os.Bundle;
import android.view.View;
import com.sofascore.results.R;
import com.sofascore.results.tracker.TrackerBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import defpackage.duf;
import defpackage.fwi;
import defpackage.ilj;
import defpackage.joa;
import defpackage.muj;
import defpackage.otk;
import defpackage.s2j;
import defpackage.tc3;
import defpackage.ypa;
import defpackage.ysa;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001:\u0001\u0004B\u0007¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/tracker/TrackerBottomSheet;", "Lcom/sofascore/results/base/compose/architecture/ComposeModalBottomSheetDialog;", "<init>", "()V", "bgf", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class TrackerBottomSheet extends Hilt_TrackerBottomSheet {
    public final otk C;
    public final tc3 D;
    public final tc3 E;

    public TrackerBottomSheet() {
        joa a = ypa.a(ysa.c, new s2j(new s2j(this, 6), 7));
        final int i = 1;
        this.C = new otk(duf.a.getOrCreateKotlinClass(muj.class), new fwi(a, 21), new ilj(i, this, a), new fwi(a, 22));
        final int i2 = 0;
        this.D = new tc3(1407722988, new Function2(this) { // from class: ntj
            public final /* synthetic */ TrackerBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i2;
                TrackerBottomSheet trackerBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            muj mujVar = (muj) trackerBottomSheet.C.getValue();
                            String b = mujVar.l.b(mujVar.i());
                            xtc f0 = l98.f0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 2);
                            yf8 yf8Var = xth.a;
                            udj.c(b, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 131064);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                            av8Var2.d0(1130336994);
                            qug o0 = hkg.o0(av8Var2);
                            trackerBottomSheet.G(o0, null, av8Var2, 0);
                            av8Var2.s(false);
                            buj.b((muj) trackerBottomSheet.C.getValue(), o0, av8Var2, 0);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true);
        this.E = new tc3(10114745, new Function2(this) { // from class: ntj
            public final /* synthetic */ TrackerBottomSheet b;

            {
                this.b = this;
            }

            @Override // kotlin.jvm.functions.Function2
            public final Object invoke(Object obj, Object obj2) {
                int i3 = i;
                TrackerBottomSheet trackerBottomSheet = this.b;
                switch (i3) {
                    case 0:
                        of3 of3Var = (of3) obj;
                        int intValue = ((Integer) obj2).intValue();
                        av8 av8Var = (av8) of3Var;
                        if (av8Var.T(intValue & 1, (intValue & 3) != 2)) {
                            muj mujVar = (muj) trackerBottomSheet.C.getValue();
                            String b = mujVar.l.b(mujVar.i());
                            xtc f0 = l98.f0(utc.a, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 2);
                            yf8 yf8Var = xth.a;
                            udj.c(b, f0, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 131064);
                        } else {
                            av8Var.W();
                        }
                        break;
                    default:
                        of3 of3Var2 = (of3) obj;
                        int intValue2 = ((Integer) obj2).intValue();
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(1 & intValue2, (intValue2 & 3) != 2)) {
                            av8Var2.d0(1130336994);
                            qug o0 = hkg.o0(av8Var2);
                            trackerBottomSheet.G(o0, null, av8Var2, 0);
                            av8Var2.s(false);
                            buj.b((muj) trackerBottomSheet.C.getValue(), o0, av8Var2, 0);
                        } else {
                            av8Var2.W();
                        }
                        break;
                }
                return Unit.a;
            }
        }, true);
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    /* renamed from: H, reason: from getter */
    public final tc3 getX() {
        return this.E;
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog
    public final Function2 I() {
        return this.D;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        view.getClass();
        super.onViewCreated(view, bundle);
        this.t.a = Integer.valueOf(requireArguments().getInt("uniqueTournamentId"));
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String t() {
        return ((muj) this.C.getValue()).l.a();
    }

    @Override // com.sofascore.results.base.compose.architecture.ComposeModalBottomSheetDialog, com.sofascore.results.dialog.BaseModalBottomSheetDialog
    /* renamed from: x */
    public final boolean getB() {
        return false;
    }

    @Override // com.sofascore.results.dialog.BaseModalBottomSheetDialog
    public final String z() {
        return null;
    }
}
