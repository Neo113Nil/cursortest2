package com.vk.auth.ui.consent;

import android.content.Context;
import android.text.Html;
import android.text.SpannableStringBuilder;
import android.text.Spanned;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.main.TermsLink;
import com.vk.auth.ui.WrapRelativeLayout;
import com.vk.auth.ui.consent.h;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.themes.VKReplacerView;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.adu0;
import xsna.alj0;
import xsna.bnu0;
import xsna.c5g;
import xsna.dnu0;
import xsna.drm0;
import xsna.e370;
import xsna.e3m;
import xsna.e43;
import xsna.eah0;
import xsna.enj;
import xsna.ey2;
import xsna.gzs;
import xsna.hnj;
import xsna.i1f;
import xsna.ifx0;
import xsna.izs;
import xsna.krv0;
import xsna.nh;
import xsna.oao0;
import xsna.pao0;
import xsna.q1z;
import xsna.s3q0;
import xsna.vqf0;
import xsna.wi3;
import xsna.xd8;

/* compiled from: VkConsentView.kt */
/* loaded from: classes15.dex */
public final class VkConsentView extends FrameLayout implements dnu0 {
    public final View b;
    public final View c;
    public final RecyclerView d;
    public final RecyclerView e;
    public final TextView f;
    public final eah0 g;
    public final a h;
    public final VKImageController<View> i;
    public final i j;
    public final View k;
    public final View l;
    public final oao0 m;
    public final VkConsentTermsContainer n;
    public final TextView o;
    public final WrapRelativeLayout p;
    public final VKImageController<View> q;
    public final VKImageController<View> r;
    public gzs<s3q0> s;

    public VkConsentView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        LayoutInflater.from(getContext()).inflate(R.layout.vk_consent_view_layout, (ViewGroup) this, true);
        setBackgroundColor(e3m.f(R.attr.vk_ui_background_content, getContext()));
        this.b = findViewById(R.id.progress);
        this.c = findViewById(R.id.content);
        RecyclerView recyclerView = (RecyclerView) findViewById(R.id.consent_items);
        this.d = recyclerView;
        RecyclerView recyclerView2 = (RecyclerView) findViewById(R.id.consent_apps);
        this.e = recyclerView2;
        this.f = (TextView) findViewById(R.id.consent_sub_app_description);
        eah0 eah0Var = new eah0();
        this.g = eah0Var;
        getContext();
        recyclerView.setLayoutManager(new LinearLayoutManager(1, false));
        getContext();
        recyclerView2.setLayoutManager(new LinearLayoutManager(0, false));
        recyclerView.setAdapter(eah0Var);
        this.k = findViewById(R.id.retry_container);
        View findViewById = findViewById(R.id.retry_button);
        this.l = findViewById;
        ImageView imageView = (ImageView) findViewById(R.id.load_error_icon);
        Context context2 = getContext();
        imageView.setImageDrawable(context2 != null ? enj.e(R.drawable.vk_icon_info_outline_56, R.attr.vk_ui_accent_blue, context2) : null);
        i iVar = new i(getContext(), this);
        this.j = iVar;
        a aVar = new a(new alj0(this, 29));
        this.h = aVar;
        recyclerView2.setAdapter(aVar);
        int i = 0;
        int i2 = 1;
        this.m = new oao0(e3m.f(R.attr.vk_ui_text_subhead, getContext()), krv0.m(R.attr.vk_ui_transparent_hover, getContext()), new xd8(i2, iVar, bnu0.class, "onLinkClicked", "onLinkClicked(Ljava/lang/String;)V", i, 11), false);
        VkConsentTermsContainer vkConsentTermsContainer = (VkConsentTermsContainer) findViewById(R.id.client_terms_container);
        this.n = vkConsentTermsContainer;
        vkConsentTermsContainer.setUrlClickListener$common_release(new wi3(i2, iVar, bnu0.class, "onLinkClicked", "onLinkClicked(Ljava/lang/String;)V", i, 13));
        this.o = (TextView) findViewById(R.id.vkc_terms);
        this.p = (WrapRelativeLayout) findViewById(R.id.terms_container);
        findViewById.setOnClickListener(new i1f(this, 12));
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var == null ? null : ifx0Var).b().create(getContext());
        this.i = create;
        ((VKReplacerView) findViewById(R.id.consent_view_avatar)).a(((com.vk.core.ui.image.c) create).getView());
        VKReplacerView vKReplacerView = (VKReplacerView) findViewById(R.id.app_icon);
        VKReplacerView vKReplacerView2 = (VKReplacerView) findViewById(R.id.app_icon_terms);
        ifx0 ifx0Var2 = e370.c;
        VKImageController<View> create2 = (ifx0Var2 == null ? null : ifx0Var2).b().create(getContext());
        this.q = create2;
        ifx0 ifx0Var3 = e370.c;
        VKImageController<View> create3 = (ifx0Var3 != null ? ifx0Var3 : null).b().create(getContext());
        this.r = create3;
        vKReplacerView.a(((com.vk.core.ui.image.c) create2).getView());
        vKReplacerView2.a(((com.vk.core.ui.image.c) create3).getView());
    }

    public static void a(VKImageController vKImageController, h hVar, int i, float f) {
        VKImageController.b bVar = new VKImageController.b(hVar.a ? f : 0.0f, null, false, i, null, null, null, null, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, null, null, null, 65518);
        if (hVar instanceof h.a) {
            vKImageController.a(null, bVar);
        } else {
            if (!(hVar instanceof h.b)) {
                throw new NoWhenBranchMatchedException();
            }
            vKImageController.f(((h.b) hVar).c, bVar);
        }
    }

    private final void setAppIconHeader(h hVar) {
        a(this.q, hVar, R.drawable.vk_default_placeholder_10, 10.0f);
    }

    public final void b(ArrayList arrayList) {
        a aVar = this.h;
        ArrayList arrayList2 = aVar.d;
        arrayList2.clear();
        arrayList2.addAll(arrayList);
        aVar.notifyDataSetChanged();
    }

    public final void c(String str, h hVar, boolean z, gzs<? extends List<TermsLink>> gzsVar) {
        VkConsentTermsContainer vkConsentTermsContainer = this.n;
        vkConsentTermsContainer.setCustomLinkProvider(gzsVar);
        TextView textView = (TextView) findViewById(R.id.consent_description);
        Spanned fromHtml = Html.fromHtml(textView.getContext().getString(R.string.vk_connect_consent_description, str));
        ForegroundColorSpan foregroundColorSpan = new ForegroundColorSpan(krv0.m(R.attr.vk_ui_text_primary, textView.getContext()));
        SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(fromHtml);
        int K = drm0.K(0, 6, spannableStringBuilder, str, false);
        spannableStringBuilder.setSpan(foregroundColorSpan, K, str.length() + K, 33);
        textView.setText(spannableStringBuilder);
        setAppIconHeader(hVar);
        String string = getContext().getString(R.string.vk_connect_vkc_terms_vkid, str);
        a(this.r, hVar, R.drawable.vk_default_placeholder_4, 4.0f);
        pao0 pao0Var = vkConsentTermsContainer.c;
        if (pao0Var.d.invoke().isEmpty() || z) {
            vkConsentTermsContainer.a(e43.l(vkConsentTermsContainer.getContext().getString(R.string.vk_connect_service_terms_agreement), vkConsentTermsContainer.getContext().getString(R.string.vk_connect_service_terms_privacy)));
        } else {
            List<TermsLink> invoke = pao0Var.d.invoke();
            ArrayList arrayList = new ArrayList(c5g.u(invoke, 10));
            for (TermsLink termsLink : invoke) {
                arrayList.add(String.format("<a href=%s>%s</a>", Arrays.copyOf(new Object[]{termsLink.d, termsLink.b}, 2)));
            }
            vkConsentTermsContainer.a(arrayList);
        }
        TextView textView2 = this.o;
        oao0 oao0Var = this.m;
        oao0Var.a(textView2);
        oao0Var.d(string);
    }

    public final void g0() {
        this.d.setVisibility(8);
        this.b.setVisibility(8);
        this.k.setVisibility(0);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        i iVar = this.j;
        if (!iVar.b.g) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            vqf0 vqf0Var = new vqf0(0);
            bVar.getClass();
            com.vk.registration.funnels.b.a(vqf0Var);
        }
        iVar.f = true;
        VkConsentView vkConsentView = iVar.a;
        g gVar = iVar.b;
        vkConsentView.c(gVar.a, gVar.b, gVar.g, gVar.f);
        iVar.d();
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        i iVar = this.j;
        iVar.f = false;
        io.reactivex.rxjava3.disposables.c cVar = iVar.c;
        if (cVar != null) {
            cVar.dispose();
        }
        iVar.c = null;
        if (!iVar.b.g) {
            com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
            nh nhVar = new nh(25);
            bVar.getClass();
            com.vk.registration.funnels.b.a(nhVar);
        }
        this.m.b();
        super.onDetachedFromWindow();
    }

    public final void setAvatarUrl(String str) {
        this.i.f(str, adu0.a(6, getContext()));
    }

    public final void setConsentData(g gVar) {
        i iVar = this.j;
        iVar.b = gVar;
        q1z q1zVar = iVar.d;
        izs<String, String> izsVar = gVar.d;
        izs<String, String> izsVar2 = gVar.e;
        gzs<List<TermsLink>> gzsVar = gVar.f;
        q1zVar.b = izsVar;
        q1zVar.c = izsVar2;
        if (gzsVar != null) {
            q1zVar.d = gzsVar;
        }
        if (iVar.f) {
            iVar.a.c(gVar.a, gVar.b, gVar.g, gzsVar);
            iVar.d();
        }
        iVar.d();
    }

    @Override // xsna.dnu0
    public void setConsentDescription(String str) {
        ey2.i(this.f, str);
    }

    public final void setLegalInfoOpenerDelegate(q1z q1zVar) {
        this.j.d = q1zVar;
    }

    public final void setOnScopesUpdatedCallback(gzs<s3q0> gzsVar) {
        this.s = gzsVar;
    }
}
