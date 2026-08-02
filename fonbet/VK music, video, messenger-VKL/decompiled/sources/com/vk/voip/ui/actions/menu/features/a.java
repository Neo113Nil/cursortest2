package com.vk.voip.ui.actions.menu.features;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import androidx.fragment.app.FragmentActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.common.id.UserId;
import com.vk.voip.ui.actions.menu.features.MainMenuBroadcastFeature;
import com.vk.voip.ui.c;
import com.vkontakte.android.R;
import kotlin.NoWhenBranchMatchedException;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.ab9;
import xsna.cn70;
import xsna.d2x0;
import xsna.dhw0;
import xsna.ghw0;
import xsna.ipm0;
import xsna.izs;
import xsna.mhf0;
import xsna.nrw0;
import xsna.s3q0;
import xsna.sw3;
import xsna.tah0;
import xsna.ts90;
import xsna.tzp0;
import xsna.ubx0;
import xsna.wj8;
import xsna.xcw0;

/* compiled from: MainMenuBroadcastFeature.kt */
/* loaded from: classes7.dex */
public final /* synthetic */ class a extends FunctionReferenceImpl implements izs<MainMenuBroadcastFeature.a, s3q0> {
    /* JADX WARN: Type inference failed for: r9v46, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    public final s3q0 invoke(MainMenuBroadcastFeature.a aVar) {
        boolean z;
        MainMenuBroadcastFeature.a aVar2 = aVar;
        MainMenuBroadcastFeature mainMenuBroadcastFeature = (MainMenuBroadcastFeature) this.receiver;
        mainMenuBroadcastFeature.getClass();
        if (!(aVar2 instanceof MainMenuBroadcastFeature.a.C2009a)) {
            throw new NoWhenBranchMatchedException();
        }
        MainMenuBroadcastFeature.Option option = ((MainMenuBroadcastFeature.a.C2009a) aVar2).a;
        Context context = mainMenuBroadcastFeature.a;
        nrw0.h hVar = mainMenuBroadcastFeature.c;
        wj8 a = mainMenuBroadcastFeature.a();
        int i = MainMenuBroadcastFeature.b.$EnumSwitchMapping$0[option.ordinal()];
        if (i == 1) {
            ipm0 ipm0Var = a.c;
            boolean z2 = ipm0Var.b;
            boolean z3 = ipm0Var.c;
            if (z2) {
                if (z3) {
                    hVar.invoke(xcw0.n.a);
                } else {
                    hVar.invoke(xcw0.h.a);
                }
            } else if (!z3 || ipm0Var.a) {
                mhf0 mhf0Var = a.b;
                if (mhf0Var.b && mhf0Var.c) {
                    mainMenuBroadcastFeature.b(R.string.voip_call_cannot_be_streamed_and_recorded_simultainously);
                } else {
                    mainMenuBroadcastFeature.b(R.string.voip_call_broadcast_not_permitted);
                }
            } else {
                mainMenuBroadcastFeature.b(R.string.voip_call_broadcast_is_not_managed_by_user);
            }
        } else if (i == 2) {
            mhf0 mhf0Var2 = a.b;
            boolean z4 = mhf0Var2.a;
            boolean z5 = mhf0Var2.b;
            if (z4) {
                if (z5) {
                    hVar.invoke(xcw0.i.a);
                } else {
                    hVar.invoke(xcw0.j0.a);
                }
            } else if (z5 && !mhf0Var2.c) {
                mainMenuBroadcastFeature.b(R.string.voip_call_record_is_not_managed_by_user);
            } else if (a.c.c) {
                mainMenuBroadcastFeature.b(R.string.voip_call_cannot_be_streamed_and_recorded_simultainously);
            } else {
                mainMenuBroadcastFeature.b(R.string.voip_call_record_not_permitted);
            }
        } else if (i != 3) {
            if (i == 4) {
                tah0 tah0Var = a.a;
                if (!tah0Var.a) {
                    mainMenuBroadcastFeature.b(R.string.voip_call_screencast_not_permitted);
                } else if (tah0Var.b) {
                    mainMenuBroadcastFeature.b.d.a(ghw0.c.a);
                    hVar.invoke(new xcw0.d(!a.a.b));
                } else {
                    d2x0.a aVar3 = new d2x0.a(context, tzp0.a(null, 3));
                    aVar3.c(new ts90(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 3));
                    aVar3.F0(true);
                    aVar3.x(0);
                    aVar3.u(0);
                    aVar3.O();
                    aVar3.B(cn70.b(12), true, true);
                    aVar3.I0(null);
                }
            } else {
                if (i != 5) {
                    throw new NoWhenBranchMatchedException();
                }
                if (a.d.c) {
                    dhw0 L = c.b.L();
                    while (true) {
                        z = context instanceof FragmentActivity;
                        if (z || !(context instanceof ContextWrapper)) {
                            break;
                        }
                        context = ((ContextWrapper) context).getBaseContext();
                    }
                    Activity activity = z ? (Activity) context : null;
                    if (L != null && activity != null) {
                        FragmentActivity fragmentActivity = (FragmentActivity) activity;
                        UserId userId = L.O ? L.M : null;
                        int i2 = ab9.q1;
                        new ab9.a(fragmentActivity, userId).I0("VoipSelectMovieDialogFragment");
                        c.b.getClass();
                        ((ubx0) c.z.getValue()).d();
                    }
                } else {
                    mainMenuBroadcastFeature.b(R.string.voip_watch_together_forbidden_for_me);
                }
            }
        } else {
            sw3 sw3Var = a.e;
            boolean z6 = sw3Var.b;
            if (!z6 || sw3Var.c) {
                boolean z7 = sw3Var.a;
                if (z7 && !z6) {
                    hVar.invoke(xcw0.i0.a);
                } else if (z7 && z6) {
                    hVar.invoke(xcw0.k0.a);
                } else {
                    mainMenuBroadcastFeature.b(R.string.voip_call_asr_record_not_permitted);
                }
            } else {
                mainMenuBroadcastFeature.b(R.string.voip_call_asr_record_is_not_managed_by_user);
            }
        }
        return s3q0.a;
    }
}
