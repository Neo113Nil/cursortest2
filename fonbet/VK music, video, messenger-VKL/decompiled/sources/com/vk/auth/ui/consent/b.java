package com.vk.auth.ui.consent;

import android.content.res.Configuration;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.view.View;
import com.vk.auth.main.AuthModel;
import com.vk.auth.ui.consent.g;
import com.vk.auth.ui.consent.h;
import com.vk.superapp.api.dto.auth.VkAuthAppScope;
import com.vk.superapp.ui.toolbar.VkAuthToolbar;
import com.vkontakte.android.R;
import java.util.Collections;
import java.util.List;
import xsna.f4m;
import xsna.iah0;
import xsna.p5e;
import xsna.q2m0;
import xsna.r55;
import xsna.rme0;
import xsna.sbu0;
import xsna.wrl0;
import xsna.ym1;

/* compiled from: VkConsentScreenBottomSheetFragment.kt */
/* loaded from: classes15.dex */
public final class b extends sbu0 {
    public final int C = R.layout.vk_consent_bottom_sheet_fragment;
    public final boolean D = true;
    public VkConsentView E;
    public boolean F;
    public int G;

    @Override // xsna.oeu0
    public final int Gn() {
        return this.C;
    }

    @Override // xsna.oeu0
    public final boolean Hn() {
        return this.D;
    }

    @Override // xsna.oeu0
    public final float In() {
        return 1.8f;
    }

    @Override // xsna.oeu0, androidx.fragment.app.Fragment, android.content.ComponentCallbacks
    public final void onConfigurationChanged(Configuration configuration) {
        super.onConfigurationChanged(configuration);
        int i = configuration.uiMode & 48;
        int i2 = this.G;
        if (i2 != i && i2 != 0 && isAdded() && !isDetached() && !isRemoving()) {
            tn();
        }
        this.G = i;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        this.G = getResources().getConfiguration().uiMode & 48;
        VkAuthToolbar vkAuthToolbar = (VkAuthToolbar) view.findViewById(R.id.toolbar);
        r55 r55Var = r55.a;
        Drawable b = r55.i().b(requireContext());
        if (b != null) {
            vkAuthToolbar.setPicture(b);
        } else {
            vkAuthToolbar.setVisibility(4);
            f4m.n(iah0.a(10), vkAuthToolbar);
        }
        VkConsentView vkConsentView = (VkConsentView) view.findViewById(R.id.vk_consent_view);
        this.E = vkConsentView;
        Bundle arguments = getArguments();
        vkConsentView.setAvatarUrl(arguments != null ? arguments.getString("avatarUrl") : null);
        VkConsentView vkConsentView2 = this.E;
        if (vkConsentView2 == null) {
            vkConsentView2 = null;
        }
        vkConsentView2.setOnScopesUpdatedCallback(new wrl0(this, 22));
        Bundle arguments2 = getArguments();
        ConsentScreenInfo consentScreenInfo = arguments2 != null ? (ConsentScreenInfo) arguments2.getParcelable("consent_info") : null;
        if (consentScreenInfo != null) {
            List<VkAuthAppScope> list = consentScreenInfo.e;
            if (list == null) {
                throw new IllegalStateException("Scopes must not be null or empty");
            }
            if (consentScreenInfo.f.isEmpty()) {
                throw new IllegalStateException("Policy links must not be empty");
            }
            q2m0 q2m0Var = new q2m0(view, list);
            VkConsentView vkConsentView3 = this.E;
            if (vkConsentView3 == null) {
                vkConsentView3 = null;
            }
            String str = consentScreenInfo.c;
            vkConsentView3.setConsentData(new g(str, new h.b(consentScreenInfo.d), Collections.singletonList(new g.b(str, q2m0Var)), new p5e(1, r55.h(), AuthModel.class, "getTermsLink", "getTermsLink(Ljava/lang/String;)Ljava/lang/String;", 0, 12), new ym1(1, r55.h(), AuthModel.class, "getPrivacyLink", "getPrivacyLink(Ljava/lang/String;)Ljava/lang/String;", 0, 15), new rme0(consentScreenInfo, 21), false));
            VkConsentView vkConsentView4 = this.E;
            (vkConsentView4 != null ? vkConsentView4 : null).p.setVisibility(8);
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkIdBottomSheetTheme;
    }
}
