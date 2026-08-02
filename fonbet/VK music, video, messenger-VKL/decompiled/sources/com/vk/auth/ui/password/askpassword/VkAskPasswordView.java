package com.vk.auth.ui.password.askpassword;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.text.SpannableString;
import android.text.style.ForegroundColorSpan;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.constraintlayout.widget.Group;
import androidx.fragment.app.FragmentActivity;
import com.vk.auth.main.f;
import com.vk.auth.ui.VkAuthPasswordView;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.ui.password.askpassword.VkAskPasswordData;
import com.vk.core.ui.image.VKImageController;
import com.vk.core.ui.image.c;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.dto.common.ImageSizeKey;
import com.vk.registration.funnels.b;
import com.vkontakte.android.R;
import xsna.adu0;
import xsna.ai0;
import xsna.ajr0;
import xsna.bjr0;
import xsna.bpn0;
import xsna.cbu0;
import xsna.czi;
import xsna.dhg;
import xsna.drm0;
import xsna.du3;
import xsna.e370;
import xsna.e3m;
import xsna.efr0;
import xsna.ehg;
import xsna.f4m;
import xsna.gjr0;
import xsna.hjr0;
import xsna.hnj;
import xsna.i21;
import xsna.ifx0;
import xsna.iut0;
import xsna.jjc;
import xsna.mg;
import xsna.pj8;
import xsna.q55;
import xsna.qj8;
import xsna.qqf0;
import xsna.sqf0;
import xsna.vmk;
import xsna.wcl;
import xsna.x1c0;
import xsna.xk70;
import xsna.zqf0;

/* compiled from: VkAskPasswordView.kt */
/* loaded from: classes15.dex */
public class VkAskPasswordView extends ConstraintLayout implements dhg {
    public static final /* synthetic */ int D = 0;
    public final Group A;
    public final View B;
    public final VKImageController<View> C;
    public final TextView t;
    public final TextView u;
    public final TextView v;
    public final VkAuthPasswordView w;
    public final TextView x;
    public final a y;
    public final VkLoadingButton z;

    public VkAskPasswordView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        boolean z;
        LayoutInflater.from(getContext()).inflate(R.layout.vk_ask_password_layout, (ViewGroup) this, true);
        Context context2 = getContext();
        while (true) {
            z = context2 instanceof FragmentActivity;
            if (z || !(context2 instanceof ContextWrapper)) {
                break;
            } else {
                context2 = ((ContextWrapper) context2).getBaseContext();
            }
        }
        this.y = new a(getContext(), this, (cbu0) ((FragmentActivity) (z ? (Activity) context2 : null)));
        this.t = (TextView) findViewById(R.id.name);
        this.u = (TextView) findViewById(R.id.phone);
        this.v = (TextView) findViewById(R.id.description);
        this.x = (TextView) findViewById(R.id.error_view);
        VkAuthPasswordView vkAuthPasswordView = (VkAuthPasswordView) findViewById(R.id.password_container);
        this.w = vkAuthPasswordView;
        jjc.g(vkAuthPasswordView.e, new efr0(new pj8(this, 13), 9));
        ifx0 ifx0Var = e370.c;
        VKImageController<View> create = (ifx0Var != null ? ifx0Var : null).b().create(getContext());
        this.C = create;
        ((VKReplacerView) findViewById(R.id.profile_avatar_view)).a(((c) create).getView());
        View findViewById = findViewById(R.id.not_my_account);
        this.B = findViewById;
        int i = 11;
        findViewById.setOnClickListener(new qj8(this, i));
        iut0.q(findViewById, new vmk());
        VkLoadingButton vkLoadingButton = (VkLoadingButton) findViewById(R.id.next);
        this.z = vkLoadingButton;
        vkLoadingButton.setOnClickListener(new ai0(this, i));
        this.A = (Group) findViewById(R.id.user_group);
    }

    public final void I() {
        this.z.setLoading(true);
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        return new wcl(getContext());
    }

    public final void hh(String str) {
        TextView textView = this.x;
        textView.setText(str);
        textView.setVisibility(0);
        this.w.setPasswordBackgroundId(Integer.valueOf(R.drawable.vk_auth_bg_edittext_error));
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        a aVar = this.y;
        aVar.getClass();
        bpn0 bpn0Var = f.a;
        q55.b.add(aVar.h);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        a aVar = this.y;
        VkAskPasswordData vkAskPasswordData = aVar.d;
        if (vkAskPasswordData == null) {
            vkAskPasswordData = null;
        }
        int i = 29;
        int i2 = 0;
        if (vkAskPasswordData instanceof VkExtendPartialTokenData) {
            czi cziVar = aVar.e;
            if (cziVar instanceof ajr0) {
                b bVar = b.a;
                zqf0 zqf0Var = new zqf0(i2);
                bVar.getClass();
                b.a(zqf0Var);
            } else if ((cziVar instanceof bjr0) || (cziVar instanceof hjr0)) {
                b.a.getClass();
                b.a(new i21(i));
            }
        } else if (vkAskPasswordData instanceof VkExtendSilentTokenData) {
            czi cziVar2 = aVar.e;
            if (cziVar2 instanceof ajr0) {
                b bVar2 = b.a;
                xk70 xk70Var = new xk70(6);
                bVar2.getClass();
                b.a(xk70Var);
            } else if (cziVar2 instanceof gjr0) {
                b.a.getClass();
                b.a(new i21(i));
            }
        } else if (vkAskPasswordData instanceof VkAskPasswordSATLoginData) {
            czi cziVar3 = aVar.e;
            if (cziVar3 instanceof ajr0) {
                b bVar3 = b.a;
                mg mgVar = new mg(27);
                bVar3.getClass();
                b.a(mgVar);
            } else if (cziVar3 instanceof hjr0) {
                b bVar4 = b.a;
                qqf0 qqf0Var = new qqf0(i2);
                bVar4.getClass();
                b.a(qqf0Var);
            }
        } else if (vkAskPasswordData instanceof VkAskPasswordEmailLoginData) {
            czi cziVar4 = aVar.e;
            if (cziVar4 instanceof ajr0) {
                b bVar5 = b.a;
                x1c0 x1c0Var = new x1c0(2);
                bVar5.getClass();
                b.a(x1c0Var);
            } else if (cziVar4 instanceof hjr0) {
                b.a.getClass();
                b.a(new sqf0(i2));
            }
        }
        bpn0 bpn0Var = f.a;
        q55.b.remove(aVar.h);
        aVar.g.dispose();
        du3.a.a(aVar.e);
        if (aVar.f) {
            aVar.c.finish();
        }
        super.onDetachedFromWindow();
    }

    public final void r() {
        this.z.setLoading(false);
    }

    public void setAskPasswordData(VkAskPasswordData vkAskPasswordData) {
        VkAskPasswordData.User user;
        a aVar = this.y;
        VkAskPasswordView vkAskPasswordView = aVar.b;
        View view = vkAskPasswordView.B;
        Group group = vkAskPasswordView.A;
        aVar.d = vkAskPasswordData;
        if (vkAskPasswordData instanceof VkExtendPartialTokenData) {
            bpn0 bpn0Var = f.a;
            throw null;
        }
        if (!(vkAskPasswordData instanceof VkAskPasswordSATLoginData) || (user = ((VkAskPasswordSATLoginData) vkAskPasswordData).e) == null) {
            f4m.j(group);
            f4m.j(view);
        } else {
            String str = user.b;
            String str2 = user.c;
            String str3 = user.d;
            vkAskPasswordView.t.setText(str);
            vkAskPasswordView.u.setText(str2 != null ? str2.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null);
            vkAskPasswordView.C.f(str3, adu0.a(6, vkAskPasswordView.getContext()));
            group.setVisibility(0);
            view.setVisibility(8);
        }
        boolean z = vkAskPasswordData instanceof VkAskPasswordForLoginData;
        TextView textView = this.v;
        if (z) {
            VkAskPasswordForLoginData vkAskPasswordForLoginData = (VkAskPasswordForLoginData) vkAskPasswordData;
            if (vkAskPasswordForLoginData.e == null) {
                String str4 = vkAskPasswordForLoginData.b;
                String string = getContext().getString(R.string.vk_connect_ask_password_by_email, str4);
                int K = drm0.K(0, 4, string, str4, false);
                SpannableString spannableString = new SpannableString(string);
                spannableString.setSpan(new ForegroundColorSpan(e3m.f(R.attr.vk_ui_text_primary, getContext())), K, str4.length() + K, 0);
                textView.setText(spannableString);
                return;
            }
        }
        textView.setText(R.string.vk_connect_ask_password_vkid);
    }
}
