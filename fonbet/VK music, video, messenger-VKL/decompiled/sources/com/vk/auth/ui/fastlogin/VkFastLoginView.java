package com.vk.auth.ui.fastlogin;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.DialogInterface;
import android.content.res.TypedArray;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Parcel;
import android.os.Parcelable;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.RegistrationTrackingElement;
import com.vk.auth.client.R$styleable;
import com.vk.auth.main.VkAuthMetaInfo;
import com.vk.auth.main.f;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.auth.ui.VkAuthPhoneView;
import com.vk.auth.ui.VkAuthTextView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.ui.VkOAuthServiceInfo;
import com.vk.auth.ui.fastlogin.StickyRecyclerView;
import com.vk.auth.ui.fastlogin.VkFastLoginView;
import com.vk.auth.ui.tertiarybutton.TertiaryButtonConfig;
import com.vk.phoneactualization.api.di.PhoneActualizationComponent;
import com.vk.registration.funnels.TrackingElement;
import com.vk.registration.funnels.d;
import com.vk.silentauthbylogin.di.SilentAuthByLoginComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.trustedhash.di.TrustedHashComponent;
import com.vkontakte.android.R;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.ListIterator;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import xsna.ac5;
import xsna.awt0;
import xsna.bpn0;
import xsna.dhg;
import xsna.drm0;
import xsna.e3m;
import xsna.e43;
import xsna.eeu0;
import xsna.ehg;
import xsna.epx;
import xsna.f4m;
import xsna.fd90;
import xsna.fpf0;
import xsna.gnj;
import xsna.gzs;
import xsna.hnj;
import xsna.i2a0;
import xsna.iah0;
import xsna.k7m;
import xsna.krv0;
import xsna.m33;
import xsna.m7m;
import xsna.mcd;
import xsna.oou0;
import xsna.otu0;
import xsna.pao0;
import xsna.par0;
import xsna.prw;
import xsna.q0o0;
import xsna.qcv0;
import xsna.qtu0;
import xsna.r55;
import xsna.rtu0;
import xsna.rzp;
import xsna.s3q0;
import xsna.sjm;
import xsna.sjo;
import xsna.srq0;
import xsna.ttu0;
import xsna.w0o0;
import xsna.y4g0;
import xsna.yb5;
import xsna.z1h0;

/* compiled from: VkFastLoginView.kt */
/* loaded from: classes15.dex */
public final class VkFastLoginView extends LinearLayout implements dhg, sjm {
    public static final int v = iah0.a(20);
    public final View b;
    public final VkConnectInfoHeader c;
    public final StickyRecyclerView d;
    public final View e;
    public final VkAuthPhoneView f;
    public final VkAuthErrorStatedEditText g;
    public final VkLoadingButton h;
    public final TextView i;
    public final VkAuthTextView j;
    public final View k;
    public final View l;
    public int m;
    public int n;
    public boolean o;
    public boolean p;
    public final ttu0 q;
    public final bpn0 r;
    public final bpn0 s;
    public String t;
    public boolean u;

    /* compiled from: VkFastLoginView.kt */
    public static final class CustomState extends View.BaseSavedState {
        public static final Parcelable.Creator<CustomState> CREATOR = new a();
        public int b;
        public final VkFastLoginPresenter$SavedState c;

        /* compiled from: VkFastLoginView.kt */
        public static final class a implements Parcelable.Creator<CustomState> {
            @Override // android.os.Parcelable.Creator
            public final CustomState createFromParcel(Parcel parcel) {
                return new CustomState(parcel);
            }

            @Override // android.os.Parcelable.Creator
            public final CustomState[] newArray(int i) {
                return new CustomState[i];
            }
        }

        public CustomState(Parcelable parcelable) {
            super(parcelable);
        }

        @Override // android.view.View.BaseSavedState, android.view.AbsSavedState, android.os.Parcelable
        public final void writeToParcel(Parcel parcel, int i) {
            super.writeToParcel(parcel, i);
            parcel.writeInt(this.b);
            parcel.writeParcelable(this.c, 0);
        }

        public CustomState(Parcel parcel) {
            super(parcel);
            this.b = parcel.readInt();
            this.c = (VkFastLoginPresenter$SavedState) parcel.readParcelable(VkFastLoginPresenter$SavedState.class.getClassLoader());
        }
    }

    /* compiled from: VkFastLoginView.kt */
    public interface a {
    }

    /* compiled from: VkFastLoginView.kt */
    public static final class b implements StickyRecyclerView.b {
        @Override // com.vk.auth.ui.fastlogin.StickyRecyclerView.b
        public final void a() {
            int i = VkFastLoginView.v;
            throw null;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public VkFastLoginView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        z1h0 z1h0Var;
        boolean z;
        VkOAuthServiceInfo vkOAuthServiceInfo;
        FragmentManager supportFragmentManager;
        List<Fragment> f;
        z1h0 z1h0Var2;
        new otu0();
        this.q = new ttu0(this);
        this.r = new bpn0(new w0o0(11));
        this.s = new bpn0(new fd90(23));
        new pao0(R.string.vk_connect_terms_custom, R.string.vk_connect_terms_custom_single, R.string.vk_connect_terms);
        getContext();
        new rzp(0, this, VkFastLoginView.class, "getTrackingElement", "getTrackingElement()Ljava/util/List;", 0, 2);
        getContext();
        new mcd(0, this, VkFastLoginView.class, "getTrackingElement", "getTrackingElement()Ljava/util/List;", 0, 5);
        this.u = true;
        Activity b2 = gnj.b(getContext());
        FragmentActivity fragmentActivity = b2 instanceof FragmentActivity ? (FragmentActivity) b2 : null;
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null || (f = supportFragmentManager.c.f()) == null) {
            z1h0Var = null;
        } else {
            ListIterator<Fragment> listIterator = f.listIterator(f.size());
            while (true) {
                if (listIterator.hasPrevious()) {
                    z1h0Var2 = listIterator.previous();
                    if (((Fragment) z1h0Var2).isVisible()) {
                        break;
                    }
                } else {
                    z1h0Var2 = null;
                    break;
                }
            }
            z1h0Var = (Fragment) z1h0Var2;
        }
        z1h0 z1h0Var3 = z1h0Var != null ? z1h0Var : fragmentActivity;
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        String tag = q0o0Var != null ? q0o0Var.tag() : "VkSdkView";
        String str = z1h0Var != null ? "(parent is fragment)" : fragmentActivity != null ? "(parent is activity)" : null;
        if (z1h0Var3 != null) {
            prw.h(z1h0Var3, tag, str);
        } else {
            par0 par0Var = par0.a;
            String concat = "VkSdkUiListenerImpl: null lifecycle owner of ".concat(tag);
            par0Var.getClass();
            par0.e(concat);
        }
        i2a0 entryPoint = ((PhoneActualizationComponent) ((k7m) m7m.c(this)).a(fpf0.a(PhoneActualizationComponent.class))).getEntryPoint();
        Context context2 = getContext();
        while (true) {
            z = context2 instanceof FragmentActivity;
            if (z || !(context2 instanceof ContextWrapper)) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        entryPoint.a((FragmentActivity) (z ? (Activity) context2 : null));
        setOrientation(1);
        LayoutInflater.from(getContext()).inflate(R.layout.vk_fast_login_view_layout, (ViewGroup) this, true);
        this.b = findViewById(R.id.progress);
        this.c = (VkConnectInfoHeader) findViewById(R.id.info_header);
        this.d = (StickyRecyclerView) findViewById(R.id.users_recycler);
        this.e = findViewById(R.id.titles_container);
        this.f = (VkAuthPhoneView) findViewById(R.id.enter_phone);
        this.g = (VkAuthErrorStatedEditText) findViewById(R.id.enter_email_or_phone);
        this.h = (VkLoadingButton) findViewById(R.id.login_btn);
        this.i = (TextView) findViewById(R.id.use_alternative_auth_btn);
        this.j = (VkAuthTextView) findViewById(R.id.create_account_btn);
        this.k = findViewById(R.id.vk_terms_more);
        this.l = findViewById(R.id.fast_login_sim_card_banner);
        TypedArray obtainStyledAttributes = getContext().obtainStyledAttributes(attributeSet, R$styleable.b, 0, 0);
        try {
            obtainStyledAttributes.getBoolean(4, false);
            obtainStyledAttributes.getBoolean(2, false);
            obtainStyledAttributes.getColor(1, krv0.m(R.attr.vk_ui_accent_blue, getContext()));
            obtainStyledAttributes.getBoolean(3, false);
            String string = obtainStyledAttributes.getString(5);
            obtainStyledAttributes.getBoolean(6, true);
            obtainStyledAttributes.getBoolean(0, true);
            if (string != null) {
                List<String> c0 = drm0.c0(string, new String[]{StringUtils.COMMA}, 0, 6);
                ArrayList arrayList = new ArrayList();
                for (String str2 : c0) {
                    VkOAuthServiceInfo[] values = VkOAuthServiceInfo.values();
                    int length = values.length;
                    int i = 0;
                    while (true) {
                        if (i >= length) {
                            vkOAuthServiceInfo = null;
                            break;
                        }
                        vkOAuthServiceInfo = values[i];
                        if (epx.f(vkOAuthServiceInfo.h(), str2)) {
                            break;
                        } else {
                            i++;
                        }
                    }
                    VkOAuthService j = vkOAuthServiceInfo != null ? vkOAuthServiceInfo.j() : null;
                    if (j != null) {
                        arrayList.add(j);
                    }
                }
            } else {
                EmptyList emptyList = EmptyList.b;
            }
            getContext();
            ((TrustedHashComponent) ((k7m) m7m.c(this)).a(fpf0.a(TrustedHashComponent.class))).c();
            ((SilentAuthByLoginComponent) ((k7m) m7m.c(this)).a(fpf0.a(SilentAuthByLoginComponent.class))).c();
            bpn0 bpn0Var = f.a;
            throw null;
        } finally {
            obtainStyledAttributes.recycle();
        }
    }

    private final d getTrackingTextWatcherEmail() {
        return (d) this.s.getValue();
    }

    private final d getTrackingTextWatcherPhone() {
        return (d) this.r.getValue();
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new qtu0(getContext(), new srq0(this, 11));
    }

    @Override // xsna.sjm
    public final void U2(String str, String str2, String str3, gzs<s3q0> gzsVar, String str4, gzs<s3q0> gzsVar2, boolean z, gzs<s3q0> gzsVar3, final gzs<s3q0> gzsVar4) {
        eeu0.a aVar = new eeu0.a(getContext());
        aVar.setTitle(str);
        AlertController.b bVar = aVar.a;
        bVar.f = str2;
        aVar.j(str3, new yb5(gzsVar, 3));
        aVar.f(str4, new y4g0(1, gzsVar2));
        aVar.c = z;
        bVar.n = new ac5(gzsVar3, 2);
        aVar.i(new DialogInterface.OnDismissListener() { // from class: xsna.stu0
            @Override // android.content.DialogInterface.OnDismissListener
            public final void onDismiss(DialogInterface dialogInterface) {
                int i = VkFastLoginView.v;
                gzs gzsVar5 = gzs.this;
                if (gzsVar5 != null) {
                    gzsVar5.invoke();
                }
            }
        });
        aVar.m();
    }

    public final VkConnectInfoHeader getInfoHeader$core_release() {
        return this.c;
    }

    public final boolean getMaxMessengerVerificationAvailable() {
        return this.u;
    }

    public final View getProgress$core_release() {
        return this.b;
    }

    public final int getProgressExtraTopMargin$core_release() {
        return this.m;
    }

    public final String getSatPromoOk() {
        return this.t;
    }

    public final View getTermsMore$core_release() {
        return this.k;
    }

    public SchemeStatSak$EventScreen getTrackedScreen() {
        throw null;
    }

    public List<RegistrationTrackingElement> getTrackingElement() {
        String obj = drm0.p0(String.valueOf(this.g.getText())).toString();
        Regex regex = new Regex("[+() \\-0-9]{7,}$");
        Regex regex2 = new Regex("[A-Za-z0-9]+@[A-Za-z0-9]+\\.[A-Za-z0-9]+");
        if (regex.b(obj) != null) {
            return Collections.singletonList(new RegistrationTrackingElement(TrackingElement.Registration.PHONE_NUMBER, obj));
        }
        if (regex2.b(obj) != null) {
            return Collections.singletonList(new RegistrationTrackingElement(TrackingElement.Registration.EMAIL, obj));
        }
        VkAuthPhoneView vkAuthPhoneView = this.f;
        if (drm0.N(vkAuthPhoneView.getPhone().c)) {
            return EmptyList.b;
        }
        return e43.l(new RegistrationTrackingElement(TrackingElement.Registration.PHONE_COUNTRY, String.valueOf(vkAuthPhoneView.getPhone().b.b)), new RegistrationTrackingElement(TrackingElement.Registration.PHONE_NUMBER, vkAuthPhoneView.getPhone().c));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        this.d.setOnSnapPositionChangeListener(new b());
        throw null;
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ttu0 ttu0Var = this.q;
        VkAuthPhoneView vkAuthPhoneView = this.f;
        vkAuthPhoneView.f.removeTextChangedListener(ttu0Var);
        vkAuthPhoneView.f.removeTextChangedListener(getTrackingTextWatcherPhone());
        d trackingTextWatcherPhone = getTrackingTextWatcherPhone();
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.g;
        vkAuthErrorStatedEditText.removeTextChangedListener(trackingTextWatcherPhone);
        vkAuthErrorStatedEditText.removeTextChangedListener(getTrackingTextWatcherEmail());
        throw null;
    }

    @Override // android.view.View
    public final void onRestoreInstanceState(Parcelable parcelable) {
        CustomState customState = (CustomState) parcelable;
        super.onRestoreInstanceState(customState.getSuperState());
        this.n = customState.b;
        VkFastLoginPresenter$SavedState vkFastLoginPresenter$SavedState = customState.c;
        throw null;
    }

    @Override // android.view.View
    public final Parcelable onSaveInstanceState() {
        new CustomState(super.onSaveInstanceState()).b = this.n;
        throw null;
    }

    @Override // android.view.View
    public final void onVisibilityChanged(View view, int i) {
        super.onVisibilityChanged(view, i);
        if (i == 0) {
            throw null;
        }
    }

    public void setAlternativeAuthButtonText(String str) {
        this.i.setText(str);
    }

    public final void setAnotherWayAuth(boolean z) {
        throw null;
    }

    public final void setAuthMetaInfo(VkAuthMetaInfo vkAuthMetaInfo) {
        throw null;
    }

    public final void setAutoShowKeyboard(boolean z) {
        throw null;
    }

    public final void setCallback(a aVar) {
        throw null;
    }

    public void setChooseCountryEnable(boolean z) {
        this.f.setChooseCountryEnable(z);
    }

    public void setContinueButtonEnabled(boolean z) {
        this.h.setEnabled(z);
    }

    public final void setCredentialsLoader(oou0.a aVar) {
        throw null;
    }

    public final void setCredentialsWereChecked(boolean z) {
        throw null;
    }

    public final void setDisableAutoLoad(boolean z) {
        throw null;
    }

    public final void setEmailAvailable(String str) {
        throw null;
    }

    public final void setHideHeader(boolean z) {
        awt0.v(this.c, !z);
        throw null;
    }

    public void setLogin(String str) {
        this.g.setText(str);
    }

    public final void setLoginServices(List<? extends VkOAuthService> list) {
        throw null;
    }

    public final void setMaxMessengerVerificationAvailable(boolean z) {
        this.u = z;
        throw null;
    }

    public final void setNiceBackgroundEnabled(boolean z) {
        if (this.o == z) {
            return;
        }
        Drawable drawable = null;
        if (z) {
            f4m.y(0, this);
            Context context = getContext();
            e3m.a aVar = e3m.a;
            Drawable a2 = m33.a(R.drawable.vk_bg_card_elevation16_top, context);
            if (a2 != null) {
                sjo.b(a2, e3m.f(R.attr.vk_ui_background_modal, getContext()), PorterDuff.Mode.MULTIPLY);
                drawable = a2;
            }
            setBackground(drawable);
            f4m.y(getPaddingTop() + v, this);
        } else {
            setBackground(null);
            f4m.y(0, this);
        }
        this.o = z;
    }

    public final void setPayload(Bundle bundle) {
        throw null;
    }

    public final void setPhoneSelectorManager(qcv0 qcv0Var) {
        throw null;
    }

    public void setPhoneWithoutCode(String str) {
        VkAuthPhoneView vkAuthPhoneView = this.f;
        EditText editText = vkAuthPhoneView.f;
        if (!epx.f(vkAuthPhoneView.getPhoneWithoutCode(), str)) {
            editText.setText(str);
        }
        editText.setSelection(editText.getText().length());
    }

    public final void setProgressExtraTopMargin$core_release(int i) {
        this.m = i;
    }

    public final void setSatPromoOk(String str) {
        this.t = str;
        if (str == null) {
            return;
        }
        VkAuthTextView vkAuthTextView = this.j;
        vkAuthTextView.setText(R.string.vk_fast_login_promo_ok_registration);
        int f = e3m.f(R.attr.vk_ui_text_primary, getContext());
        this.i.setTextColor(f);
        vkAuthTextView.setTextColor(f);
        throw null;
    }

    public final void setSecondaryAuthInfo$core_release(VkSecondaryAuthInfo vkSecondaryAuthInfo) {
        Drawable b2;
        if (vkSecondaryAuthInfo != null) {
            b2 = vkSecondaryAuthInfo.i(getContext());
        } else {
            r55 r55Var = r55.a;
            b2 = r55.i().b(getContext());
        }
        this.c.getLogo$core_release().setImageDrawable(b2);
        this.d.setSticky(vkSecondaryAuthInfo == null);
        if (vkSecondaryAuthInfo != null) {
            vkSecondaryAuthInfo.h();
        }
        throw null;
    }

    public final void setServiceRegistration(boolean z) {
        throw null;
    }

    public final void setStateChangeListener(rtu0 rtu0Var) {
        throw null;
    }

    public final void setTertiaryButtonConfig(TertiaryButtonConfig tertiaryButtonConfig) {
        throw null;
    }

    public final void setValidatePhoneSid(String str) {
        throw null;
    }
}
