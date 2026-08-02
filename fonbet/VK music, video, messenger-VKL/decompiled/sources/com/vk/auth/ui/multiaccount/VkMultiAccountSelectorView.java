package com.vk.auth.ui.multiaccount;

import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.util.AttributeSet;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.widget.AppCompatImageView;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.core.ui.image.a;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.dto.common.ImageSizeKey;
import com.vk.dto.common.id.UserId;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherActionCallback;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.api.d;
import com.vk.superapp.multiaccount.api.e;
import com.vk.superapp.multiaccount.api.f;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import kotlin.LazyThreadSafetyMode;
import xsna.adu0;
import xsna.awt0;
import xsna.b8j0;
import xsna.bpn0;
import xsna.clt0;
import xsna.coe0;
import xsna.dck0;
import xsna.e370;
import xsna.fv20;
import xsna.hg1;
import xsna.hnj;
import xsna.ifx0;
import xsna.j5g;
import xsna.lgr0;
import xsna.msy;
import xsna.o5v0;
import xsna.p5v0;
import xsna.pwi;
import xsna.sa30;
import xsna.w8i;

/* compiled from: VkMultiAccountSelectorView.kt */
/* loaded from: classes15.dex */
public final class VkMultiAccountSelectorView extends ConstraintLayout implements p5v0, w8i {
    public static final /* synthetic */ int B = 0;
    public final pwi A;
    public final TextView t;
    public final TextView u;
    public final View v;
    public final a w;
    public final VkMultiAccountSelectorMode x;
    public final bpn0 y;
    public final Object z;

    public VkMultiAccountSelectorView(Context context, AttributeSet attributeSet) {
        super(hnj.a(context), attributeSet, 0);
        VkMultiAccountSelectorMode vkMultiAccountSelectorMode = VkMultiAccountSelectorMode.DEFAULT;
        this.x = vkMultiAccountSelectorMode;
        this.y = new bpn0(new dck0(this, 22));
        this.z = msy.a(LazyThreadSafetyMode.NONE, new clt0(this, 5));
        d multiAccountRepository = getMultiAccountRepository();
        pwi pwiVar = new pwi();
        pwiVar.b = multiAccountRepository;
        pwiVar.c = new b();
        this.A = pwiVar;
        LayoutInflater.from(getContext()).inflate(R.layout.vk_multi_account_selector_layout, (ViewGroup) this, true);
        this.t = (TextView) findViewById(R.id.user_name);
        this.u = (TextView) findViewById(R.id.user_info);
        VKReplacerView vKReplacerView = (VKReplacerView) findViewById(R.id.user_avatar);
        AppCompatImageView appCompatImageView = (AppCompatImageView) findViewById(R.id.chevron);
        ifx0 ifx0Var = e370.c;
        lgr0 create = (ifx0Var == null ? null : ifx0Var).a().create(getContext());
        this.w = create;
        View view = create.getView();
        this.v = view;
        vKReplacerView.a(view);
        coe0 coe0Var = coe0.b;
        boolean a = coe0.a();
        this.x = a ? vkMultiAccountSelectorMode : VkMultiAccountSelectorMode.SELECTION_DISABLED_MODE;
        awt0.v(appCompatImageView, a);
    }

    private final d getMultiAccountRepository() {
        return (d) this.y.getValue();
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    private final e getRouter() {
        return (e) this.z.getValue();
    }

    public final void P4(UserId userId, final fv20.a aVar) {
        boolean z;
        FragmentManager supportFragmentManager;
        if (this.x == VkMultiAccountSelectorMode.SELECTION_DISABLED_MODE) {
            return;
        }
        SwitcherActionCallback switcherActionCallback = new SwitcherActionCallback() { // from class: com.vk.auth.ui.multiaccount.VkMultiAccountSelectorView$openSwitcher$switcherActionCallback$1
            @Override // com.vk.superapp.multiaccount.api.SwitcherActionCallback
            public final void a(f fVar) {
                int i = VkMultiAccountSelectorView.B;
                VkMultiAccountSelectorView.this.Q4(fVar);
                aVar.invoke(fVar);
            }
        };
        Context context = getContext();
        while (true) {
            z = context instanceof FragmentActivity;
            if (z || !(context instanceof ContextWrapper)) {
                break;
            } else {
                context = ((ContextWrapper) context).getBaseContext();
            }
        }
        FragmentActivity fragmentActivity = (FragmentActivity) (z ? (Activity) context : null);
        if (fragmentActivity == null || (supportFragmentManager = fragmentActivity.getSupportFragmentManager()) == null) {
            return;
        }
        getRouter().j(supportFragmentManager, MultiAccountEntryPoint.Unknown.d, new SwitcherLaunchMode.SwitcherCallbackMode(switcherActionCallback, userId), SwitcherUiMode.EcoplateRestricted.b);
    }

    public final void Q4(f fVar) {
        this.w.f(fVar.a().d, adu0.a(6, getContext()));
        this.t.setText(fVar.a().c);
        String str = fVar.a().e;
        if (str == null) {
            str = "";
        }
        if (str.length() == 0) {
            str = fVar.a().f;
        }
        this.u.setText(str != null ? str.replace(ImageSizeKey.SIZE_KEY_BASE, (char) 183) : null);
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onAttachedToWindow() {
        super.onAttachedToWindow();
        pwi pwiVar = this.A;
        pwiVar.getClass();
        d dVar = (d) pwiVar.b;
        if (!dVar.d().isEmpty()) {
            setState(new o5v0((f) j5g.Y(dVar.d())));
        } else {
            ((b) pwiVar.c).b(hg1.h(sa30.b(q.T(dVar.f())), new b8j0(this, 21)));
        }
    }

    @Override // android.view.ViewGroup, android.view.View
    public final void onDetachedFromWindow() {
        super.onDetachedFromWindow();
        ((b) this.A.c).dispose();
    }

    @Override // xsna.p5v0
    public void setState(o5v0 o5v0Var) {
        Q4(o5v0Var.a);
    }
}
