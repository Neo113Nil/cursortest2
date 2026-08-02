package com.vk.identity.fragments;

import android.content.Intent;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import androidx.appcompat.widget.Toolbar;
import com.vk.api.sdk.exceptions.VKApiException;
import com.vk.core.fragments.BaseMvpFragment;
import com.vk.identity.fragments.IdentityEditFragment;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.superapp.api.dto.identity.WebIdentityCard;
import com.vk.superapp.api.dto.identity.WebIdentityCardData;
import com.vk.superapp.browser.internal.ui.identity.WebIdentityContext;
import com.vkontakte.android.R;
import com.vkontakte.android.data.b;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.webrtc.stat.listener.mapper.RTCStatsConstants;
import xsna.e0v0;
import xsna.g0v0;
import xsna.h3p0;
import xsna.ies;
import xsna.izs;
import xsna.kvv;
import xsna.lvv;
import xsna.oz50;
import xsna.s3q0;
import xsna.u1u0;
import xsna.u6k;

/* compiled from: IdentityListFragment.kt */
/* loaded from: classes2.dex */
public final class IdentityListFragment extends BaseMvpFragment<lvv> implements e0v0, ies {
    public static final /* synthetic */ int U = 0;
    public final g0v0 T;

    /* compiled from: IdentityListFragment.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<String, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(String str) {
            int i;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
            String str2 = str;
            IdentityListFragment identityListFragment = (IdentityListFragment) this.receiver;
            g0v0 g0v0Var = identityListFragment.T;
            WebIdentityCardData webIdentityCardData = g0v0Var.i;
            if (webIdentityCardData != null) {
                IdentityEditFragment.b bVar = new IdentityEditFragment.b(str2, webIdentityCardData);
                WebIdentityContext webIdentityContext = g0v0Var.h;
                Bundle bundle = bVar.j;
                if (webIdentityContext == null) {
                    i = 110;
                } else {
                    bundle.putParcelable("arg_identity_context", webIdentityContext);
                    i = 109;
                }
                int hashCode = str2.hashCode();
                if (hashCode == -1147692044) {
                    if (str2.equals(RTCStatsConstants.KEY_ADDRESS)) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CONTACTS_APPS_ADD_ADDRESS;
                        bundle.putSerializable("screen", mobileOfficialAppsCoreNavStat$EventScreen);
                        bVar.g(i, identityListFragment);
                    }
                    throw new IllegalArgumentException();
                }
                if (hashCode == 96619420) {
                    if (str2.equals("email")) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CONTACTS_APPS_ADD_EMAIL;
                        bundle.putSerializable("screen", mobileOfficialAppsCoreNavStat$EventScreen);
                        bVar.g(i, identityListFragment);
                    }
                    throw new IllegalArgumentException();
                }
                if (hashCode == 106642798 && str2.equals("phone")) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CONTACTS_APPS_ADD_PHONE;
                    bundle.putSerializable("screen", mobileOfficialAppsCoreNavStat$EventScreen);
                    bVar.g(i, identityListFragment);
                }
                throw new IllegalArgumentException();
            }
            return s3q0.a;
        }
    }

    /* compiled from: IdentityListFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<WebIdentityCard, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(WebIdentityCard webIdentityCard) {
            int i;
            MobileOfficialAppsCoreNavStat$EventScreen mobileOfficialAppsCoreNavStat$EventScreen;
            WebIdentityCard webIdentityCard2 = webIdentityCard;
            IdentityListFragment identityListFragment = (IdentityListFragment) this.receiver;
            g0v0 g0v0Var = identityListFragment.T;
            WebIdentityCardData webIdentityCardData = g0v0Var.i;
            if (webIdentityCardData != null) {
                IdentityEditFragment.b bVar = new IdentityEditFragment.b(webIdentityCard2.getType(), webIdentityCardData);
                int zb = webIdentityCard2.zb();
                Bundle bundle = bVar.j;
                bundle.putInt("arg_identity_id", zb);
                WebIdentityContext webIdentityContext = g0v0Var.h;
                if (webIdentityContext == null) {
                    i = 110;
                } else {
                    bundle.putParcelable("arg_identity_context", webIdentityContext);
                    i = 109;
                }
                String type = webIdentityCard2.getType();
                int hashCode = type.hashCode();
                if (hashCode == -1147692044) {
                    if (type.equals(RTCStatsConstants.KEY_ADDRESS)) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CONTACTS_APPS_EDIT_ADDRESS;
                        bundle.putSerializable("screen", mobileOfficialAppsCoreNavStat$EventScreen);
                        bVar.g(i, identityListFragment);
                    }
                    throw new IllegalArgumentException();
                }
                if (hashCode == 96619420) {
                    if (type.equals("email")) {
                        mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CONTACTS_APPS_EDIT_EMAIL;
                        bundle.putSerializable("screen", mobileOfficialAppsCoreNavStat$EventScreen);
                        bVar.g(i, identityListFragment);
                    }
                    throw new IllegalArgumentException();
                }
                if (hashCode == 106642798 && type.equals("phone")) {
                    mobileOfficialAppsCoreNavStat$EventScreen = MobileOfficialAppsCoreNavStat$EventScreen.CONTACTS_APPS_EDIT_PHONE;
                    bundle.putSerializable("screen", mobileOfficialAppsCoreNavStat$EventScreen);
                    bVar.g(i, identityListFragment);
                }
                throw new IllegalArgumentException();
            }
            return s3q0.a;
        }
    }

    /* compiled from: IdentityListFragment.kt */
    public static final class c extends oz50 {
    }

    public IdentityListFragment() {
        lvv lvvVar = new lvv(this);
        this.S = lvvVar;
        this.T = new g0v0(this, lvvVar, new kvv(new a(1, this, IdentityListFragment.class, "addIdentity", "addIdentity(Ljava/lang/String;)V", 0), new b(1, this, IdentityListFragment.class, "editIdentity", "editIdentity(Lcom/vk/superapp/api/dto/identity/WebIdentityCard;)V", 0)), new u6k(this, 13));
    }

    @Override // xsna.e0v0
    public final void I6(WebIdentityCardData webIdentityCardData) {
        this.T.c(webIdentityCardData);
    }

    @Override // xsna.e0v0
    public final void R0(VKApiException vKApiException) {
        this.T.R0(vKApiException);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        this.T.d();
        return true;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        super.onActivityResult(i, i2, intent);
        this.T.a(i, i2, intent);
    }

    @Override // com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        g0v0 g0v0Var = this.T;
        g0v0Var.getClass();
        if (arguments != null && arguments.containsKey("arg_identity_context")) {
            g0v0Var.h = (WebIdentityContext) arguments.getParcelable("arg_identity_context");
        }
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            b.d dVar = new b.d("identity_card_show_edit_form");
            dVar.b(arguments2.getString("arg_source"), "source");
            dVar.e();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        this.T.getClass();
        return layoutInflater.inflate(R.layout.vk_layout_list_fragment, viewGroup, false);
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.BaseFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        super.onDestroyView();
        g0v0 g0v0Var = this.T;
        g0v0Var.g = null;
        g0v0Var.h = null;
    }

    @Override // com.vk.core.fragments.BaseMvpFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.T.b(view, bundle);
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        if (toolbar != null) {
            u1u0.j(toolbar, R.drawable.vk_icon_arrow_left_outline_28);
            h3p0.c(this, toolbar);
        }
    }
}
