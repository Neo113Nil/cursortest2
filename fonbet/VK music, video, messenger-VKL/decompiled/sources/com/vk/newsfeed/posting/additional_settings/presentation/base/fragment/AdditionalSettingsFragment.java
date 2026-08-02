package com.vk.newsfeed.posting.additional_settings.presentation.base.fragment;

import android.content.Context;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.util.Size;
import android.view.View;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.dto.common.id.UserId;
import com.vk.metrics.eventtracking.b;
import com.vk.mvi.androidx.MviImplFragment;
import com.vk.newsfeed.posting.additional_settings.data.AdditionalSettingsConfiguration;
import com.vk.newsfeed.posting.additional_settings.domain.model.AdditionalSettingsState;
import com.vk.newsfeed.posting.additional_settings.domain.model.author.WallOwner;
import com.vk.newsfeed.posting.api.di.Posting2Component;
import com.vk.newsfeed.posting.impl.domain.model.UserType;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import defpackage.r;
import java.util.UUID;
import kotlin.jvm.internal.MutablePropertyReference1Impl;
import xsna.ao50;
import xsna.bpn0;
import xsna.cn70;
import xsna.fpf0;
import xsna.hr0;
import xsna.hs0;
import xsna.ibc0;
import xsna.ies;
import xsna.ikv0;
import xsna.jr0;
import xsna.km50;
import xsna.kq0;
import xsna.ls0;
import xsna.m7m;
import xsna.mk50;
import xsna.nf3;
import xsna.oz50;
import xsna.pr0;
import xsna.qcy;
import xsna.qr0;
import xsna.rr0;
import xsna.sz;
import xsna.vk50;
import xsna.xn50;
import xsna.zlc0;

/* compiled from: AdditionalSettingsFragment.kt */
/* loaded from: classes4.dex */
public final class AdditionalSettingsFragment extends MviImplFragment<jr0, ls0, kq0> implements ies {
    public static final /* synthetic */ qcy<Object>[] U;
    public AdditionalSettingsState R;
    public final bpn0 Q = new bpn0(new r(this, 3));
    public final bpn0 S = new bpn0(new pr0(0));
    public final nf3 T = new nf3();

    /* compiled from: AdditionalSettingsFragment.kt */
    public static final class a extends oz50 {
    }

    static {
        MutablePropertyReference1Impl mutablePropertyReference1Impl = new MutablePropertyReference1Impl(AdditionalSettingsFragment.class, "contentView", "getContentView()Lcom/vk/newsfeed/posting/additional_settings/presentation/base/view/AdditionalSettingsContentView;", 0);
        fpf0.a.getClass();
        U = new qcy[]{mutablePropertyReference1Impl};
    }

    @Override // xsna.xn50
    public final mk50 Fl() {
        hr0 hr0Var = new hr0(requireContext(), this);
        qcy<Object> qcyVar = U[0];
        nf3 nf3Var = this.T;
        nf3Var.c = hr0Var;
        return new mk50.c(((hr0) nf3Var.getValue(this, qcyVar)).c());
    }

    @Override // xsna.xn50
    public final void Jh(ao50 ao50Var, View view) {
        ((hr0) this.T.getValue(this, U[0])).f((ls0) ao50Var, new qr0(1, this, AdditionalSettingsFragment.class, "sendAction", "sendAction(Lcom/vk/mvi/core/data/MviAction;)V", 0, 0));
    }

    @Override // com.vk.mvi.androidx.MviImplFragment, xsna.xn50
    public final void R4(vk50 vk50Var) {
        ((jr0) vk50Var).j.a(new sz(this, 1), this);
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xn50.a.c(this, kq0.h.b);
        return true;
    }

    public final void fo(int i, int i2, int i3) {
        Context requireContext = requireContext();
        ikv0.a aVar = new ikv0.a(requireContext);
        aVar.t = new ikv0.c.C3058c(i2, Integer.valueOf(i3), (Size) null, 12);
        aVar.u = new ikv0.d(requireContext.getString(i), (String) null, (ikv0.d.a) null, 6);
        aVar.e = 2000L;
        aVar.o = Integer.valueOf(cn70.b(24));
        aVar.n();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v2, types: [android.os.Parcelable] */
    @Override // com.vk.mvi.androidx.MviImplFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        AdditionalSettingsState additionalSettingsState;
        Object parcelable;
        if (bundle != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable = bundle.getParcelable("saved_mvi_state", AdditionalSettingsState.class);
                additionalSettingsState = (Parcelable) parcelable;
            } else {
                ?? parcelable2 = bundle.getParcelable("saved_mvi_state");
                additionalSettingsState = parcelable2 instanceof AdditionalSettingsState ? parcelable2 : null;
            }
            r0 = (AdditionalSettingsState) additionalSettingsState;
        }
        this.R = r0;
        super.onCreate(bundle);
        xn50.a.c(this, kq0.l.a.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        xn50.a.c(this, kq0.l.b.b);
        super.onDestroy();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putParcelable("saved_mvi_state", (Parcelable) getFeature().h.c);
    }

    @Override // xsna.xn50
    public final vk50 x8(Bundle bundle, km50 km50Var) {
        Parcelable parcelable;
        Parcelable parcelable2;
        Object obj;
        Object obj2;
        Object parcelable3;
        Object parcelable4;
        int i = Build.VERSION.SDK_INT;
        if (i >= 33) {
            parcelable4 = bundle.getParcelable("OWNER", WallOwner.class);
            parcelable = (Parcelable) parcelable4;
        } else {
            Parcelable parcelable5 = bundle.getParcelable("OWNER");
            if (!(parcelable5 instanceof WallOwner)) {
                parcelable5 = null;
            }
            parcelable = (WallOwner) parcelable5;
        }
        WallOwner wallOwner = (WallOwner) parcelable;
        if (wallOwner == null) {
            wallOwner = new WallOwner(UserId.d);
            b.a.a(new Exception("Owner is null"));
        }
        WallOwner wallOwner2 = wallOwner;
        boolean z = bundle.getBoolean("IS_COMMENT_CHANGE_AVAILABLE", true);
        boolean z2 = bundle.getBoolean("IS_EDIT_MODE", false);
        boolean z3 = bundle.getBoolean("IS_DRAFT", false);
        boolean z4 = bundle.getBoolean("IS_COMMUNITY");
        boolean z5 = bundle.getBoolean("HAS_COAUTHORS");
        boolean z6 = bundle.getBoolean("SHOULD_SHOW_NOTIFICATIONS_BUTTON", false);
        if (i >= 33) {
            parcelable3 = bundle.getParcelable("ADDITIONAL_SETTINGS_CONFIGURATION", AdditionalSettingsConfiguration.class);
            parcelable2 = (Parcelable) parcelable3;
        } else {
            Parcelable parcelable6 = bundle.getParcelable("ADDITIONAL_SETTINGS_CONFIGURATION");
            if (!(parcelable6 instanceof AdditionalSettingsConfiguration)) {
                parcelable6 = null;
            }
            parcelable2 = (AdditionalSettingsConfiguration) parcelable6;
        }
        AdditionalSettingsConfiguration additionalSettingsConfiguration = (AdditionalSettingsConfiguration) parcelable2;
        AdditionalSettingsConfiguration additionalSettingsConfiguration2 = additionalSettingsConfiguration == null ? new AdditionalSettingsConfiguration(false, false, false, null, false, 31, null) : additionalSettingsConfiguration;
        if (i >= 33) {
            obj = bundle.getSerializable("USER_TYPE", UserType.class);
        } else {
            Object serializable = bundle.getSerializable("USER_TYPE");
            if (!(serializable instanceof UserType)) {
                serializable = null;
            }
            obj = (UserType) serializable;
        }
        UserType userType = (UserType) obj;
        if (userType == null) {
            userType = UserType.GUEST;
        }
        UserType userType2 = userType;
        boolean z7 = bundle.getBoolean("IS_SUGGEST", false);
        boolean z8 = bundle.getBoolean("IS_COMMUNITY_ADMIN", false);
        String string = bundle.getString("AUTHOR_FIRST_NAME_GEN", "");
        String string2 = bundle.getString("AUTHOR_LAST_NAME_GEN", "");
        if (i >= 33) {
            obj2 = bundle.getSerializable("TARGET_SCREEN_UNIQUE_ID", UUID.class);
        } else {
            Object serializable2 = bundle.getSerializable("TARGET_SCREEN_UNIQUE_ID");
            obj2 = (UUID) (serializable2 instanceof UUID ? serializable2 : null);
        }
        UUID uuid = (UUID) obj2;
        if (uuid == null) {
            uuid = UUID.randomUUID();
        }
        UUID uuid2 = uuid;
        rr0 rr0Var = new rr0(additionalSettingsConfiguration2, wallOwner2, userType2, string, string2, uuid2, z, z2, z3, z4, z5, z6, z7, z8);
        ibc0 C9 = ((Posting2Component) m7m.d(this).mo408a(fpf0.a(Posting2Component.class))).C9(uuid2.toString());
        zlc0 zlc0Var = (zlc0) this.Q.getValue();
        hs0 hs0Var = new hs0(new AdditionalSettingsState.Init(wallOwner2));
        AdditionalSettingsState additionalSettingsState = this.R;
        return new jr0(rr0Var, zlc0Var, hs0Var, C9, additionalSettingsState != null ? new kq0.m(additionalSettingsState) : kq0.k.b);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        uiTrackingScreen.a = MobileOfficialAppsCoreNavStat$EventScreen.POSTING_SETTINGS;
    }
}
