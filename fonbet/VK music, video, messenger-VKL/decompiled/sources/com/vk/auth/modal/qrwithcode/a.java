package com.vk.auth.modal.qrwithcode;

import android.content.Context;
import android.graphics.drawable.ColorDrawable;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal;
import com.vk.auth.modal.qrwithcode.b;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$RegistrationFieldItem;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeRegistrationItem;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.observable.q2;
import java.util.ArrayList;
import java.util.concurrent.TimeUnit;
import kotlin.NoWhenBranchMatchedException;
import xsna.amt;
import xsna.arf0;
import xsna.awt0;
import xsna.b8g;
import xsna.coe0;
import xsna.dnp0;
import xsna.drm0;
import xsna.e3m;
import xsna.eko;
import xsna.erm0;
import xsna.f1s;
import xsna.f4m;
import xsna.fe60;
import xsna.frf0;
import xsna.h53;
import xsna.i13;
import xsna.iah0;
import xsna.iv20;
import xsna.j5g;
import xsna.jgp;
import xsna.ksb0;
import xsna.lpj;
import xsna.oq;
import xsna.p350;
import xsna.qkd0;
import xsna.qr0;
import xsna.qro0;
import xsna.qu50;
import xsna.rl3;
import xsna.tlo0;
import xsna.vw4;
import xsna.wmd0;
import xsna.wv20;
import xsna.y510;
import xsna.yka0;
import xsna.zmp0;

/* compiled from: QrWithCodeAuthPresenter.kt */
/* loaded from: classes15.dex */
public final class a<V extends arf0> extends wv20<V> {
    public final QrWithCodeAuthModal h;
    public Object i;
    public int j;
    public b k;
    public io.reactivex.rxjava3.disposables.c l;
    public io.reactivex.rxjava3.disposables.c m;
    public io.reactivex.rxjava3.disposables.c n;

    public a(Context context, QrWithCodeAuthModal qrWithCodeAuthModal) {
        super(context, qrWithCodeAuthModal);
        this.h = qrWithCodeAuthModal;
        this.i = jgp.b;
        this.k = b.d.a;
    }

    @Override // xsna.wv20, xsna.hv20
    public final void M2(ModalAuthInfo modalAuthInfo) {
        super.M2(modalAuthInfo);
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        iv20.b bVar2 = this.d;
        String str = (bVar2 != null ? bVar2 : null).f;
        Integer num = (bVar2 != null ? bVar2 : null).i;
        if (bVar2 == null) {
            bVar2 = null;
        }
        boolean z = bVar2.j;
        this.e.getClass();
        boolean a = coe0.a();
        bVar.getClass();
        String str2 = z ? "external_camera" : "internal_camera";
        SchemeStatSak$RegistrationFieldItem d = com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID, str);
        SchemeStatSak$RegistrationFieldItem d2 = com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_SOURCE, str2);
        SchemeStatSak$RegistrationFieldItem d3 = com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.APP_ID, String.valueOf(num));
        SchemeStatSak$RegistrationFieldItem d4 = a ? com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.AVAILABLE_MULTIACC_SELECTOR, "") : null;
        ArrayList arrayList = new ArrayList();
        arrayList.add(d);
        arrayList.add(d2);
        arrayList.add(d3);
        if (d4 != null) {
            arrayList.add(d4);
        }
        qro0.c(new wmd0(arrayList, 4));
        ArrayList arrayList2 = new ArrayList();
        arrayList2.add(d2);
        arrayList2.add(d3);
        if (d4 != null) {
            arrayList2.add(d4);
        }
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.k(arrayList2);
        iv20.b bVar3 = this.d;
        com.vk.registration.funnels.b.q((bVar3 != null ? bVar3 : null).f, (bVar3 != null ? bVar3 : null).j);
    }

    @Override // xsna.wv20
    public final void c() {
        this.h.e();
    }

    public final void d(int i) {
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        iv20.b bVar2 = this.d;
        String str = (bVar2 != null ? bVar2 : null).f;
        if (bVar2 == null) {
            bVar2 = null;
        }
        Integer num = bVar2.i;
        QrWithCodeAuthModal qrWithCodeAuthModal = this.h;
        SchemeStatSak$EventScreen u5 = qrWithCodeAuthModal.u5();
        bVar.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.a(SchemeStatSak$TypeRegistrationItem.EventType.SWITCH_ACCOUNT_TAP, com.vk.registration.funnels.b.h(str, com.vk.registration.funnels.b.g(u5), String.valueOf(num), true), null, null, null, null, null, 252);
        iv20.b bVar3 = this.d;
        String str2 = (bVar3 != null ? bVar3 : null).f;
        Integer num2 = (bVar3 != null ? bVar3 : null).i;
        SchemeStatSak$EventScreen u52 = qrWithCodeAuthModal.u5();
        frf0.f(SchemeStatSak$EventScreen.MULTI_ACC_SWITCHER, u52, com.vk.registration.funnels.b.b(str2, u52, String.valueOf(num2), true), false, null, null, 56);
        this.j = i;
        b bVar4 = this.k;
        if ((bVar4 instanceof b.a) || (bVar4 instanceof b.c)) {
            e(f(), true);
        }
    }

    /* JADX WARN: Type inference failed for: r7v16, types: [java.lang.Object, kotlin.Lazy] */
    public final void e(b bVar, boolean z) {
        QrWithCodeAuthModal.a aVar;
        this.k = bVar;
        QrWithCodeAuthModal qrWithCodeAuthModal = this.h;
        qrWithCodeAuthModal.F = bVar;
        boolean z2 = bVar instanceof b.C0406b;
        if (z2) {
            VkTopBar vkTopBar = qrWithCodeAuthModal.h;
            if (vkTopBar == null) {
                vkTopBar = null;
            }
            qkd0 qkd0Var = new qkd0(qrWithCodeAuthModal, 3);
            tlo0.a aVar2 = tlo0.Companion;
            lpj lpjVar = qrWithCodeAuthModal.d;
            if (lpjVar == null) {
                lpjVar = null;
            }
            tlo0.h d = oq.d(aVar2, lpjVar.getString(R.string.vk_auth_accessibility_back));
            lpj lpjVar2 = qrWithCodeAuthModal.d;
            if (lpjVar2 == null) {
                lpjVar2 = null;
            }
            vkTopBar.setBack(new VkTopBar.b(qkd0Var, d, null, new b8g(e3m.f(R.attr.vk_ui_icon_accent_themed, lpjVar2)), null, 20));
            VkTopBar vkTopBar2 = qrWithCodeAuthModal.h;
            if (vkTopBar2 == null) {
                vkTopBar2 = null;
            }
            vkTopBar2.setBefore(null);
        } else {
            VkTopBar vkTopBar3 = qrWithCodeAuthModal.h;
            if (vkTopBar3 == null) {
                vkTopBar3 = null;
            }
            vkTopBar3.setBack(null);
            VkTopBar vkTopBar4 = qrWithCodeAuthModal.h;
            if (vkTopBar4 == null) {
                vkTopBar4 = null;
            }
            vkTopBar4.setBefore(new VkTopBar.c.f(new eko(new ColorDrawable(0)), null, null, null, null, 58));
        }
        ModalAuthInfo modalAuthInfo = qrWithCodeAuthModal.b;
        String str = modalAuthInfo.f;
        String str2 = modalAuthInfo.h;
        String str3 = modalAuthInfo.g;
        if (str == null) {
            str = "";
        }
        TextView textView = qrWithCodeAuthModal.y;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        TextView textView2 = qrWithCodeAuthModal.y;
        if (textView2 == null) {
            textView2 = null;
        }
        lpj lpjVar3 = qrWithCodeAuthModal.d;
        if (lpjVar3 == null) {
            lpjVar3 = null;
        }
        textView2.setContentDescription(lpjVar3.getString(R.string.vk_qr_code_auth_device_info_service_accessibility, str));
        TextView textView3 = qrWithCodeAuthModal.x;
        if (textView3 == null) {
            textView3 = null;
        }
        textView3.setText(str3);
        TextView textView4 = qrWithCodeAuthModal.x;
        if (textView4 == null) {
            textView4 = null;
        }
        lpj lpjVar4 = qrWithCodeAuthModal.d;
        if (lpjVar4 == null) {
            lpjVar4 = null;
        }
        textView4.setContentDescription(lpjVar4.getString(R.string.vk_qr_code_auth_device_info_device_accessibility, str3));
        TextView textView5 = qrWithCodeAuthModal.z;
        if (textView5 == null) {
            textView5 = null;
        }
        textView5.setText(str2);
        TextView textView6 = qrWithCodeAuthModal.z;
        if (textView6 == null) {
            textView6 = null;
        }
        lpj lpjVar5 = qrWithCodeAuthModal.d;
        if (lpjVar5 == null) {
            lpjVar5 = null;
        }
        textView6.setContentDescription(lpjVar5.getString(R.string.vk_qr_code_auth_device_info_location_accessibility, str2));
        if (z) {
            ViewGroup viewGroup = qrWithCodeAuthModal.i;
            if (viewGroup == null) {
                viewGroup = null;
            }
            zmp0.a(viewGroup, (dnp0) qrWithCodeAuthModal.E.getValue());
        }
        View view = qrWithCodeAuthModal.j;
        if (view == null) {
            view = null;
        }
        f4m.j(view);
        View view2 = qrWithCodeAuthModal.k;
        if (view2 == null) {
            view2 = null;
        }
        f4m.j(view2);
        View view3 = qrWithCodeAuthModal.l;
        if (view3 == null) {
            view3 = null;
        }
        f4m.j(view3);
        View view4 = qrWithCodeAuthModal.m;
        if (view4 == null) {
            view4 = null;
        }
        f4m.j(view4);
        if (bVar.equals(b.d.a)) {
            View view5 = qrWithCodeAuthModal.j;
            if (view5 == null) {
                view5 = null;
            }
            view5.setVisibility(0);
        } else if (bVar instanceof b.a) {
            View view6 = qrWithCodeAuthModal.k;
            if (view6 == null) {
                view6 = null;
            }
            view6.setVisibility(0);
            TextView textView7 = qrWithCodeAuthModal.s;
            if (textView7 == null) {
                textView7 = null;
            }
            String str4 = ((b.a) bVar).a;
            textView7.setText(j5g.g0(erm0.u0(3, str4), " ", null, null, 0, null, 62));
            TextView textView8 = qrWithCodeAuthModal.s;
            if (textView8 == null) {
                textView8 = null;
            }
            lpj lpjVar6 = qrWithCodeAuthModal.d;
            if (lpjVar6 == null) {
                lpjVar6 = null;
            }
            textView8.setContentDescription(lpjVar6.getString(R.string.vk_qr_code_auth_code_accessibility_template, rl3.W(", ", str4.toCharArray())));
        } else if (bVar.equals(b.C0406b.a)) {
            View view7 = qrWithCodeAuthModal.m;
            if (view7 == null) {
                view7 = null;
            }
            view7.setVisibility(0);
        } else {
            if (!(bVar instanceof b.c)) {
                throw new NoWhenBranchMatchedException();
            }
            View view8 = qrWithCodeAuthModal.l;
            if (view8 == null) {
                view8 = null;
            }
            view8.setVisibility(0);
            int i = QrWithCodeAuthModal.c.$EnumSwitchMapping$0[((b.c) bVar).a.ordinal()];
            if (i == 1) {
                aVar = new QrWithCodeAuthModal.a(R.string.vk_qr_code_auth_error_title, R.string.vk_qr_code_auth_error_subtitle);
            } else if (i == 2) {
                aVar = new QrWithCodeAuthModal.a(R.string.vk_qr_code_auth_no_internet_title, R.string.vk_qr_code_auth_no_internet_subtitle, Integer.valueOf(R.drawable.vk_icon_illustration_antenna_120), true);
            } else {
                if (i != 3) {
                    throw new NoWhenBranchMatchedException();
                }
                aVar = new QrWithCodeAuthModal.a(R.string.vk_qr_code_auth_expired_title, R.string.vk_qr_code_auth_expired_subtitle);
            }
            TextView textView9 = qrWithCodeAuthModal.t;
            if (textView9 == null) {
                textView9 = null;
            }
            lpj lpjVar7 = qrWithCodeAuthModal.d;
            if (lpjVar7 == null) {
                lpjVar7 = null;
            }
            textView9.setText(lpjVar7.getString(aVar.a));
            TextView textView10 = qrWithCodeAuthModal.u;
            if (textView10 == null) {
                textView10 = null;
            }
            lpj lpjVar8 = qrWithCodeAuthModal.d;
            if (lpjVar8 == null) {
                lpjVar8 = null;
            }
            textView10.setText(lpjVar8.getString(aVar.b));
            View view9 = qrWithCodeAuthModal.w;
            if (view9 == null) {
                view9 = null;
            }
            awt0.v(view9, aVar.c);
            Integer num = aVar.d;
            if (num != null) {
                ImageView imageView = qrWithCodeAuthModal.v;
                if (imageView == null) {
                    imageView = null;
                }
                imageView.setVisibility(0);
                ImageView imageView2 = qrWithCodeAuthModal.v;
                if (imageView2 == null) {
                    imageView2 = null;
                }
                imageView2.setImageResource(num.intValue());
                TextView textView11 = qrWithCodeAuthModal.t;
                if (textView11 == null) {
                    textView11 = null;
                }
                f4m.t(iah0.a(12), textView11);
            } else {
                ImageView imageView3 = qrWithCodeAuthModal.v;
                if (imageView3 == null) {
                    imageView3 = null;
                }
                f4m.j(imageView3);
                TextView textView12 = qrWithCodeAuthModal.t;
                if (textView12 == null) {
                    textView12 = null;
                }
                f4m.t(iah0.a(48), textView12);
            }
        }
        VkButton vkButton = qrWithCodeAuthModal.r;
        if (vkButton != null) {
            awt0.v(vkButton, (bVar instanceof b.a) || z2);
        }
        if (bVar instanceof b.d) {
            io.reactivex.rxjava3.disposables.c cVar = this.l;
            if (cVar != null) {
                cVar.dispose();
            }
            this.l = null;
            this.l = io.reactivex.rxjava3.core.a.r(600L, TimeUnit.MILLISECONDS).o(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new h53(this, 3), new p350(new y510(18), 12));
        } else {
            io.reactivex.rxjava3.disposables.c cVar2 = this.l;
            if (cVar2 != null) {
                cVar2.dispose();
            }
            this.l = null;
        }
        if (this.n != null) {
            io.reactivex.rxjava3.disposables.c cVar3 = this.m;
            if (cVar3 != null) {
                cVar3.dispose();
            }
            this.m = null;
            return;
        }
        if (!(bVar instanceof b.c)) {
            if (this.m != null) {
                return;
            }
            this.m = new q2(q.P(0L, 1L, TimeUnit.SECONDS).x(new fe60(new yka0(this, 5), 7)), new qu50(new f1s(24), 7)).a0(io.reactivex.rxjava3.android.schedulers.a.b()).subscribe(new ksb0(new vw4(1, this, a.class, "handleValidationResult", "handleValidationResult(Lcom/vk/auth/modal/qrwithcode/QrWithCodeAuthValidationResult;)V", 0, 13), 5), new amt(new qr0(1, this, a.class, "handleUnexpectedPollingError", "handleUnexpectedPollingError(Ljava/lang/Throwable;)V", 0, 10), 26));
        } else {
            io.reactivex.rxjava3.disposables.c cVar4 = this.m;
            if (cVar4 != null) {
                cVar4.dispose();
            }
            this.m = null;
        }
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, java.util.Map] */
    public final b f() {
        String str = (String) this.i.get(Integer.valueOf(this.j));
        return (str == null || drm0.N(str)) ? new b.c(QrWithCodeAuthErrorType.Generic) : new b.a(str);
    }

    @Override // xsna.wv20, xsna.hv20
    public final void onDestroy() {
        io.reactivex.rxjava3.disposables.c cVar = this.l;
        if (cVar != null) {
            cVar.dispose();
        }
        this.l = null;
        io.reactivex.rxjava3.disposables.c cVar2 = this.m;
        if (cVar2 != null) {
            cVar2.dispose();
        }
        this.m = null;
        io.reactivex.rxjava3.disposables.c cVar3 = this.n;
        if (cVar3 != null) {
            cVar3.dispose();
        }
        this.n = null;
        QrWithCodeAuthModal qrWithCodeAuthModal = this.h;
        qrWithCodeAuthModal.f(false);
        super.onDestroy();
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        SchemeStatSak$EventScreen u5 = qrWithCodeAuthModal.u5();
        iv20.b bVar2 = this.d;
        if (bVar2 == null) {
            bVar2 = null;
        }
        String str = bVar2.f;
        bVar.getClass();
        ArrayList arrayList = new ArrayList();
        arrayList.add(com.vk.registration.funnels.b.d(SchemeStatSak$RegistrationFieldItem.Name.QR_CODE_ID, str));
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.g(u5, SchemeStatSak$EventScreen.OTHER, arrayList, null, 8);
        frf0.h();
        qro0.a(new i13(25));
    }
}
