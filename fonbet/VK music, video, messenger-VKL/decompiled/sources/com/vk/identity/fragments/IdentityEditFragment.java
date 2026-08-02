package com.vk.identity.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.core.ui.tracking.UiTrackingScreen;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.identity.WebCity;
import com.vk.superapp.api.dto.identity.WebCountry;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.api.dto.identity.WebIdentityLabel;
import com.vkontakte.android.R;
import com.vkontakte.android.fragments.cities.CitySelectFragment;
import java.io.Serializable;
import java.util.List;
import kotlin.jvm.internal.FunctionReferenceImpl;
import xsna.c0v0;
import xsna.h3p0;
import xsna.hvv;
import xsna.ies;
import xsna.izs;
import xsna.oz50;
import xsna.s3q0;
import xsna.t9e;
import xsna.u1u0;
import xsna.zzu0;

/* compiled from: IdentityEditFragment.kt */
/* loaded from: classes2.dex */
public final class IdentityEditFragment extends BaseMvpFragment<hvv> implements zzu0, ies {
    public static final /* synthetic */ int U = 0;
    public final c0v0 T;

    /* compiled from: IdentityEditFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Integer, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Integer num) {
            int intValue = num.intValue();
            IdentityEditFragment identityEditFragment = (IdentityEditFragment) this.receiver;
            int i = IdentityEditFragment.U;
            identityEditFragment.getClass();
            CitySelectFragment.b bVar = new CitySelectFragment.b(CitySelectFragment.class, null, null);
            bVar.w(R.style.WhiteTheme);
            Bundle bundle = bVar.j;
            bundle.putBoolean("from_builder", true);
            bundle.putInt("country", intValue);
            bVar.g(747, identityEditFragment);
            return s3q0.a;
        }
    }

    /* compiled from: IdentityEditFragment.kt */
    public static final class b extends oz50 {
        public b(String str, WebIdentityCardData webIdentityCardData) {
            super(IdentityEditFragment.class, null, null);
            this.j.putString("arg_type", str);
            this.j.putParcelable("arg_identity_card", webIdentityCardData);
        }
    }

    public IdentityEditFragment() {
        hvv hvvVar = new hvv(this);
        this.S = hvvVar;
        this.T = new c0v0(this, hvvVar, new a(1, this, IdentityEditFragment.class, "openCityChooser", "openCityChooser(I)V", 0), new t9e(this, 29));
    }

    @Override // xsna.zzu0
    public final void Ce(WebIdentityCard webIdentityCard) {
        this.T.Ce(webIdentityCard);
    }

    @Override // xsna.zzu0
    public final void E() {
        this.T.E();
    }

    @Override // xsna.zzu0
    public final void R0(VKApiException vKApiException) {
        this.T.R0(vKApiException);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        this.T.a();
        return true;
    }

    @Override // xsna.zzu0
    public final void fa(WebIdentityCard webIdentityCard) {
        this.T.fa(webIdentityCard);
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [kotlin.jvm.internal.FunctionReferenceImpl, xsna.izs] */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        WebCity webCity;
        super.onActivityResult(i, i2, intent);
        if (i == 747 && i2 == -1) {
            c0v0 c0v0Var = this.T;
            if (intent != null) {
                c0v0Var.getClass();
                webCity = (WebCity) intent.getParcelableExtra("city");
            } else {
                webCity = null;
            }
            c0v0Var.o = webCity;
            c0v0Var.j.notifyDataSetChanged();
            if (c0v0Var.u) {
                WebCountry webCountry = c0v0Var.n;
                if (webCountry == null) {
                    c0v0Var.u = true;
                    c0v0Var.i();
                } else {
                    c0v0Var.u = false;
                    c0v0Var.d.invoke(Integer.valueOf(webCountry.b));
                }
            }
        }
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.T.d(getArguments());
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        View e = this.T.e(layoutInflater, viewGroup, bundle);
        Toolbar toolbar = (Toolbar) e.findViewById(R.id.toolbar);
        if (toolbar != null) {
            u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
            h3p0.c(this, toolbar);
        }
        return e;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.T.f();
        super.onDestroyView();
    }

    @Override // xsna.zzu0
    public final void reset() {
        this.T.reset();
    }

    @Override // xsna.zzu0
    public final void vd(List<WebIdentityLabel> list) {
        this.T.vd(list);
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.m0q0
    public final void y(UiTrackingScreen uiTrackingScreen) {
        Bundle arguments = getArguments();
        Serializable serializable = arguments != null ? arguments.getSerializable("screen") : null;
        MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen = serializable instanceof MobileOfficialAppsCoreNavStat$EventScreen ? (MobileOfficialAppsCoreNavStat$EventScreen) serializable : null;
        if (mobileOfficialAppsCoreNavStat$EventScreen != null) {
            uiTrackingScreen.a = mobileOfficialAppsCoreNavStat$EventScreen;
        }
    }
}
