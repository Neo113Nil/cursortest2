package com.vk.voip.ui.scheduled.creation.ui.settings;

import android.os.Bundle;
import android.view.View;
import androidx.appcompat.widget.Toolbar;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.mvi.androidx.MviImplFragment;
import com.vkontakte.android.R;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.aj6;
import xsna.ao50;
import xsna.cyw0;
import xsna.ddv;
import xsna.dyw0;
import xsna.eyw0;
import xsna.gm50;
import xsna.gz80;
import xsna.hyw0;
import xsna.iah0;
import xsna.iyw0;
import xsna.kj50;
import xsna.km50;
import xsna.kyw0;
import xsna.mk50;
import xsna.msy;
import xsna.myw0;
import xsna.n6h0;
import xsna.o6h0;
import xsna.o8u0;
import xsna.oz50;
import xsna.qjg0;
import xsna.rxw0;
import xsna.sxm;
import xsna.vgs0;
import xsna.vk50;
import xsna.xn50;
import xsna.zxw0;

/* compiled from: VoipScheduledCallSettingsFragment.kt */
/* loaded from: classes7.dex */
public final class VoipScheduledCallSettingsFragment extends MviImplFragment<cyw0, myw0, zxw0> {
    public static final /* synthetic */ int T = 0;
    public b R;
    public final Object Q = msy.a(LazyThreadSafetyMode.NONE, new o8u0(this, 6));
    public final c S = new c();

    /* compiled from: VoipScheduledCallSettingsFragment.kt */
    public static class a extends oz50 {
    }

    /* compiled from: VoipScheduledCallSettingsFragment.kt */
    public static final class b {
        public final Toolbar a;

        public b(RecyclerView recyclerView, Toolbar toolbar) {
            this.a = toolbar;
        }
    }

    /* compiled from: VoipScheduledCallSettingsFragment.kt */
    public static final class c implements rxw0<kyw0> {
        public c() {
        }

        @Override // xsna.rxw0
        public final void a(kyw0.a aVar) {
            kj50 kj50Var;
            if (aVar.equals(kyw0.a.C3219a.a)) {
                kj50Var = zxw0.c.b;
            } else if (aVar.equals(kyw0.a.b.a)) {
                kj50Var = zxw0.g.b;
            } else if (aVar.equals(kyw0.a.c.a)) {
                kj50Var = zxw0.f.b;
            } else if (aVar.equals(kyw0.a.g.a)) {
                kj50Var = zxw0.d.b;
            } else if (aVar.equals(kyw0.a.h.a)) {
                kj50Var = zxw0.j.b;
            } else if (aVar.equals(kyw0.a.i.a)) {
                kj50Var = zxw0.k.b;
            } else if (aVar.equals(kyw0.a.d.a)) {
                kj50Var = zxw0.h.b;
            } else if (aVar.equals(kyw0.a.e.a)) {
                kj50Var = zxw0.i.b;
            } else {
                if (!aVar.equals(kyw0.a.f.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                kj50Var = zxw0.e.b;
            }
            xn50.a.c(VoipScheduledCallSettingsFragment.this, kj50Var);
        }
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        return new mk50.b(R.layout.scheduled_call_settings);
    }

    /* JADX WARN: Type inference failed for: r13v4, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        myw0 myw0Var = (myw0) ao50Var;
        RecyclerView recyclerView = (RecyclerView) view.findViewById(R.id.voip_scheduled_call_settings_recycler);
        this.R = new b(recyclerView, (Toolbar) view.findViewById(R.id.toolbar));
        mo2getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager());
        recyclerView.setAdapter((sxm) this.Q.getValue());
        float f = 16;
        recyclerView.addItemDecoration(new ddv(R.attr.vk_ui_separator_primary, iah0.a(0.5f), iah0.a(f), iah0.a(8), iah0.a(f), 0, new dyw0(this), new eyw0()));
        b bVar = this.R;
        if (bVar == null) {
            bVar = null;
        }
        bVar.a.setNavigationOnClickListener(new aj6(this, 13));
        gm50.a.b(this, myw0Var.a, new vgs0(this, 16));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        getFeature().h.a(new qjg0(this, 27), this);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Object parcelable;
        VoipScheduledCallSettingsConfig voipScheduledCallSettingsConfig = null;
        if (gz80.a(33)) {
            Bundle arguments = getArguments();
            if (arguments != null) {
                parcelable = arguments.getParcelable("KEY_SCHEDULED_CALL_SETTINGS_CONFIG", VoipScheduledCallSettingsConfig.class);
                voipScheduledCallSettingsConfig = (VoipScheduledCallSettingsConfig) parcelable;
            }
        } else {
            Bundle arguments2 = getArguments();
            if (arguments2 != null) {
                voipScheduledCallSettingsConfig = (VoipScheduledCallSettingsConfig) arguments2.getParcelable("KEY_SCHEDULED_CALL_SETTINGS_CONFIG");
            }
        }
        if (voipScheduledCallSettingsConfig == null) {
            throw new IllegalStateException("config not passed");
        }
        return new cyw0(voipScheduledCallSettingsConfig, (n6h0) o6h0.a.getValue(), new hyw0(iyw0.b.b));
    }
}
