package com.vk.auth.verification.base;

import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.view.View;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.app.AlertController;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.fragment.app.FragmentActivity;
import androidx.fragment.app.FragmentManager;
import com.vk.auth.ui.VkAuthErrorStatedEditText;
import com.vk.auth.ui.VkLoadingButton;
import com.vk.auth.verification.base.states.CodeState;
import com.vk.auth.verification.base.ui.VkCheckEditText;
import com.vk.movika.sdk.base.observable.k;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import xsna.bs8;
import xsna.e3m;
import xsna.eeu0;
import xsna.f4m;
import xsna.fzf;
import xsna.gzs;
import xsna.hnj;
import xsna.ja6;
import xsna.jjc;
import xsna.ka6;
import xsna.l0c;
import xsna.mz;
import xsna.o6k0;
import xsna.oa6;
import xsna.pc3;
import xsna.pno0;
import xsna.qno0;
import xsna.s3q0;
import xsna.uhv0;
import xsna.utj;
import xsna.w1p;
import xsna.wbu0;
import xsna.x65;

/* compiled from: BaseCheckBottomSheetFragment.kt */
/* loaded from: classes15.dex */
public abstract class a<P extends l0c<?>> extends uhv0 implements c, x65 {
    public static final /* synthetic */ int z = 0;
    public boolean h;
    public String i;
    public CheckPresenterInfo j;
    public CodeState k;
    public String l;
    public String m;
    public boolean n;
    public VkLoadingButton o;
    public P p;
    public TextView q;
    public VkAuthErrorStatedEditText r;
    public TextView s;
    public fzf t;
    public bs8 u;
    public w1p v;
    public final pc3 w = new pc3(this, 1);
    public final oa6 x = new oa6(this, 0);
    public final mz y = new mz(this, 8);

    @Override // com.vk.auth.verification.base.c
    public final void E1(String str, boolean z2, boolean z3) {
        if (z2) {
            Context mo2getContext = mo2getContext();
            if (mo2getContext != null) {
                Context a = hnj.a(mo2getContext);
                utj.a aVar = new utj.a(a);
                aVar.n = str;
                aVar.g(R.drawable.vk_icon_error_circle_24);
                aVar.l = Integer.valueOf(e3m.f(R.attr.vk_ui_icon_negative, a));
                aVar.i = true;
                aVar.m();
                return;
            }
            return;
        }
        if (!z3) {
            fzf fzfVar = this.t;
            if ((fzfVar != null ? fzfVar : null).e) {
                (fzfVar != null ? fzfVar : null).c.h(str);
                return;
            } else {
                wa(str, null, null);
                return;
            }
        }
        TextView textView = this.q;
        if (textView == null) {
            textView = null;
        }
        textView.setVisibility(0);
        fzf fzfVar2 = this.t;
        if (fzfVar2 == null) {
            fzfVar2 = null;
        }
        fzfVar2.c();
        bs8 bs8Var = this.u;
        (bs8Var != null ? bs8Var : null).c(true);
    }

    @Override // com.vk.auth.verification.base.c
    public final void O1() {
        fzf fzfVar = this.t;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.d();
    }

    @Override // com.vk.auth.verification.base.c
    public final void O2(String str) {
        fzf fzfVar = this.t;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.a(str);
    }

    @Override // com.vk.auth.verification.base.c
    public final q<pno0> Pb() {
        fzf fzfVar = this.t;
        if (fzfVar == null) {
            fzfVar = null;
        }
        return q.X(new qno0(fzfVar.a), new qno0(fzfVar.c.c));
    }

    @Override // xsna.x65
    public final void S(boolean z2) {
        VkLoadingButton vkLoadingButton = this.o;
        if (vkLoadingButton != null) {
            vkLoadingButton.setLoading(z2);
        }
    }

    @Override // xsna.x65
    public final void U2(String str, String str2, String str3, gzs<s3q0> gzsVar, String str4, final gzs<s3q0> gzsVar2, boolean z2, final gzs<s3q0> gzsVar3, final gzs<s3q0> gzsVar4) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            eeu0.a aVar = new eeu0.a(activity);
            aVar.c = z2;
            aVar.setTitle(str);
            AlertController.b bVar = aVar.a;
            bVar.f = str2;
            aVar.j(str3, new ka6(gzsVar, 0));
            bVar.n = new DialogInterface.OnCancelListener() { // from class: xsna.la6
                @Override // android.content.DialogInterface.OnCancelListener
                public final void onCancel(DialogInterface dialogInterface) {
                    gzs gzsVar5 = gzs.this;
                    if (gzsVar5 != null) {
                        gzsVar5.invoke();
                    }
                }
            };
            aVar.i(new DialogInterface.OnDismissListener() { // from class: xsna.ma6
                @Override // android.content.DialogInterface.OnDismissListener
                public final void onDismiss(DialogInterface dialogInterface) {
                    gzs gzsVar5 = gzs.this;
                    if (gzsVar5 != null) {
                        gzsVar5.invoke();
                    }
                }
            });
            if (str4 != null) {
                aVar.f(str4, new DialogInterface.OnClickListener() { // from class: xsna.na6
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i) {
                        gzs gzsVar5 = gzs.this;
                        if (gzsVar5 != null) {
                            gzsVar5.invoke();
                        }
                    }
                });
            }
            aVar.m();
        }
    }

    @Override // com.vk.auth.verification.base.c
    public final void Ud(CodeState codeState, int i) {
        bs8 bs8Var = this.u;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.d(codeState);
        w1p w1pVar = this.v;
        (w1pVar != null ? w1pVar : null).a(codeState, i);
    }

    @Override // com.vk.auth.verification.base.c
    public final void aj() {
        fzf fzfVar = this.t;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.a.setErrorState(false);
        f4m.j(fzfVar.b);
        bs8 bs8Var = this.u;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.c(false);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.r;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        vkAuthErrorStatedEditText.setErrorState(false);
        TextView textView = this.q;
        f4m.j(textView != null ? textView : null);
    }

    public final void b(boolean z2) {
        FragmentManager parentFragmentManager = getParentFragmentManager();
        Bundle bundle = new Bundle();
        bundle.putBoolean("dismiss", z2);
        s3q0 s3q0Var = s3q0.a;
        parentFragmentManager.k0(bundle, "key_check_access_result");
    }

    @Override // com.vk.auth.verification.base.c
    public final void d2() {
        bs8 bs8Var = this.u;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.b(bs8.a.a(bs8Var.m, null, false, false, null, false, false, false, 251));
    }

    @Override // com.vk.auth.verification.base.c
    public final void e() {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            activity.onBackPressed();
        }
    }

    @Override // com.vk.auth.verification.base.c
    public final void id() {
        bs8 bs8Var = this.u;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.b(bs8.a.a(bs8Var.m, null, false, false, null, false, false, false, 239));
    }

    @Override // xsna.uhv0, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        CheckPresenterInfo checkPresenterInfo;
        CodeState codeState;
        Parcelable parcelable;
        Object parcelable2;
        Parcelable parcelable3;
        Object parcelable4;
        Bundle arguments = getArguments();
        this.i = arguments != null ? arguments.getString("phoneMask") : null;
        Bundle arguments2 = getArguments();
        if (arguments2 != null) {
            arguments2.getString("validationSid");
        }
        Bundle arguments3 = getArguments();
        if (arguments3 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable4 = arguments3.getParcelable("presenterInfo", CheckPresenterInfo.class);
                parcelable3 = (Parcelable) parcelable4;
            } else {
                Parcelable parcelable5 = arguments3.getParcelable("presenterInfo");
                if (!(parcelable5 instanceof CheckPresenterInfo)) {
                    parcelable5 = null;
                }
                parcelable3 = (CheckPresenterInfo) parcelable5;
            }
            checkPresenterInfo = (CheckPresenterInfo) parcelable3;
        } else {
            checkPresenterInfo = null;
        }
        this.j = checkPresenterInfo;
        Bundle arguments4 = getArguments();
        if (arguments4 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments4.getParcelable("initialCodeState", CodeState.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable6 = arguments4.getParcelable("initialCodeState");
                if (!(parcelable6 instanceof CodeState)) {
                    parcelable6 = null;
                }
                parcelable = (CodeState) parcelable6;
            }
            codeState = (CodeState) parcelable;
        } else {
            codeState = null;
        }
        if (codeState == null) {
            codeState = null;
        }
        this.k = codeState;
        Bundle arguments5 = getArguments();
        this.l = arguments5 != null ? arguments5.getString("login") : null;
        Bundle arguments6 = getArguments();
        if (arguments6 != null) {
            arguments6.getBoolean("anotherPhone");
        }
        Bundle arguments7 = getArguments();
        this.m = arguments7 != null ? arguments7.getString("satToken") : null;
        Bundle arguments8 = getArguments();
        this.n = arguments8 != null ? arguments8.getBoolean("requestAccessFactor") : false;
        super.onAttach(context);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        super.onCreate(bundle);
        this.p = un(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroy() {
        super.onDestroy();
        P p = this.p;
        if (p == null) {
            p = null;
        }
        p.onDestroy();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onDestroyView() {
        P p = this.p;
        if (p == null) {
            p = null;
        }
        p.e();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onPause() {
        super.onPause();
        P p = this.p;
        if (p == null) {
            p = null;
        }
        p.onPause();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        super.onResume();
        P p = this.p;
        if (p == null) {
            p = null;
        }
        p.onResume();
    }

    @Override // androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        P p = this.p;
        if (p == null) {
            p = null;
        }
        p.x(bundle);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        P p = this.p;
        if (p == null) {
            p = null;
        }
        p.onStart();
        if (this.h) {
            View view = getView();
            if (view != null) {
                view.post(new ja6(this, 0));
            }
            this.h = false;
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        this.h = true;
        P p = this.p;
        if (p == null) {
            p = null;
        }
        p.onStop();
        super.onStop();
    }

    @Override // androidx.fragment.app.Fragment
    public void onViewCreated(View view, Bundle bundle) {
        String string;
        this.r = (VkAuthErrorStatedEditText) view.findViewById(R.id.code_edit_text);
        this.q = (TextView) view.findViewById(R.id.error_subtitle);
        this.o = (VkLoadingButton) view.findViewById(R.id.continue_btn);
        this.s = (TextView) view.findViewById(R.id.first_subtitle);
        VkCheckEditText vkCheckEditText = (VkCheckEditText) view.findViewById(R.id.new_code_edit_text);
        VkAuthErrorStatedEditText vkAuthErrorStatedEditText = this.r;
        if (vkAuthErrorStatedEditText == null) {
            vkAuthErrorStatedEditText = null;
        }
        TextView textView = this.q;
        if (textView == null) {
            textView = null;
        }
        fzf fzfVar = new fzf(vkAuthErrorStatedEditText, textView, vkCheckEditText, null);
        this.t = fzfVar;
        this.v = new w1p(fzfVar);
        TextView textView2 = this.s;
        if (textView2 == null) {
            textView2 = null;
        }
        String str = this.i;
        if (str == null) {
            str = null;
        }
        if (str.length() > 0) {
            Resources resources = getResources();
            String str2 = this.i;
            string = resources.getString(R.string.vk_auth_enter_sms_code, str2 != null ? str2 : null);
        } else {
            string = getResources().getString(R.string.vk_auth_sms_was_sent_no_phone);
        }
        textView2.setText(string);
        this.u = new bs8((ConstraintLayout) view.findViewById(R.id.base_check_container), this.w, this.y, this.x, this.l, null);
        VkLoadingButton vkLoadingButton = this.o;
        if (vkLoadingButton != null) {
            jjc.g(vkLoadingButton, new k(this, 10));
        }
        tn();
        super.onViewCreated(view, bundle);
    }

    @Override // xsna.x65
    public final void qi(String str) {
        FragmentActivity activity = getActivity();
        if (activity != null) {
            Toast.makeText(activity, str, 1).show();
        }
    }

    @Override // com.vk.auth.verification.base.c
    public final void s0() {
        bs8 bs8Var = this.u;
        if (bs8Var == null) {
            bs8Var = null;
        }
        bs8Var.b(bs8.a.a(bs8Var.m, null, false, true, null, false, false, false, 251));
    }

    public abstract void tn();

    public abstract o6k0 un(Bundle bundle);

    @Override // xsna.x65
    public final void vf(wbu0.a aVar) {
        x65.a.b(this, aVar);
    }

    @Override // xsna.x65
    public final void wa(String str, gzs<s3q0> gzsVar, gzs<s3q0> gzsVar2) {
        x65.a.a(this, getString(R.string.vk_auth_error), str, getString(R.string.vk_ok), gzsVar, null, null, true, gzsVar2, null, 256);
    }

    @Override // xsna.x65
    public final void wm(boolean z2) {
        fzf fzfVar = this.t;
        if (fzfVar == null) {
            fzfVar = null;
        }
        fzfVar.b(!z2);
    }

    @Override // com.vk.auth.verification.base.c
    public final void da(boolean z2) {
    }
}
