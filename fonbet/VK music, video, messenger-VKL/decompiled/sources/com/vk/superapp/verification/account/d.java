package com.vk.superapp.verification.account;

import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.graphics.PorterDuff;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.os.Looper;
import android.os.Parcelable;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.widget.Button;
import android.widget.ImageView;
import android.widget.TextView;
import android.widget.Toast;
import androidx.appcompat.widget.Toolbar;
import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.bottomsheet.BottomSheetBehavior;
import com.vk.auth.oauth.VkOAuthService;
import com.vk.auth.oauth.di.OAuthComponent;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.stat.sak.scheme.SchemeStatSak$TypeVkConnectNavigationItem;
import com.vk.superapp.verification.account.VerificationFlow;
import com.vk.superapp.verification.account.b;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collection;
import kotlin.Pair;
import kotlin.collections.EmptyList;
import xsna.bpn0;
import xsna.bzv0;
import xsna.czv0;
import xsna.dd6;
import xsna.dzv0;
import xsna.e370;
import xsna.eoy;
import xsna.ey2;
import xsna.f4m;
import xsna.fpf0;
import xsna.gnr0;
import xsna.hnj;
import xsna.krv0;
import xsna.lyv0;
import xsna.m7m;
import xsna.n8g;
import xsna.o2l;
import xsna.p01;
import xsna.par0;
import xsna.prw;
import xsna.q0o0;
import xsna.q55;
import xsna.q9i0;
import xsna.qd0;
import xsna.r55;
import xsna.rex0;
import xsna.ryv0;
import xsna.sjo;
import xsna.sp;
import xsna.syv0;
import xsna.t65;
import xsna.tyv0;
import xsna.umu0;
import xsna.uyv0;
import xsna.v6d;
import xsna.wyv0;
import xsna.x9l0;
import xsna.xyv0;
import xsna.yfb;
import xsna.yv6;
import xsna.yyv0;
import xsna.zyv0;

/* compiled from: VkVerificationAccountFragmentImpl.kt */
/* loaded from: classes6.dex */
public final class d extends lyv0 {
    public TextView A;
    public TextView B;
    public RecyclerView C;
    public Button D;
    public Button E;
    public View F;
    public VkOAuthService G;
    public boolean I;
    public tyv0 M;
    public Context N;
    public BottomSheetBehavior<View> O;
    public Toolbar y;
    public ImageView z;
    public final a H = new a();
    public boolean J = true;
    public VerificationFlow K = VerificationFlow.Web.b;
    public final bpn0 L = new bpn0(new x9l0(this, 24));

    public final void Fn() {
        BottomSheetBehavior<View> bottomSheetBehavior = this.O;
        if (bottomSheetBehavior != null) {
            bottomSheetBehavior.X(3);
        }
        View view = getView();
        if (view != null) {
            view.post(new qd0(this, 19));
        }
    }

    public final void Gn() {
        View view = this.F;
        if (view == null) {
            view = null;
        }
        f4m.j(view);
        Button button = this.D;
        if (button == null) {
            button = null;
        }
        button.setVisibility(0);
        Button button2 = this.E;
        (button2 != null ? button2 : null).setVisibility(0);
    }

    public final void Hn() {
        if (this.J) {
            BottomSheetBehavior<View> bottomSheetBehavior = this.O;
            if (bottomSheetBehavior != null) {
                bottomSheetBehavior.X(4);
            }
            View view = getView();
            if (view != null) {
                f4m.j(view);
            }
        }
        try {
            gnr0 gnr0Var = (gnr0) this.L.getValue();
            Pair pair = new Pair("verificationFlow", this.K);
            r55 r55Var = r55.a;
            umu0 umu0Var = r55.g;
            if (umu0Var == null) {
                umu0Var = null;
            }
            umu0Var.s.getClass();
            o2l.a.getClass();
            gnr0Var.c(this, yfb.b(pair, new Pair("arg_vtb_test_config", Boolean.valueOf(o2l.b("__dbg_use_vtb_id_test_domain", false)))));
        } catch (Throwable th) {
            par0 par0Var = par0.a;
            StringBuilder sb = new StringBuilder("OAuth provider ");
            VkOAuthService vkOAuthService = this.G;
            if (vkOAuthService == null) {
                vkOAuthService = null;
            }
            sb.append(vkOAuthService.name());
            sb.append(" is not available. Error: ");
            sb.append(th.getClass().getSimpleName());
            sb.append(": ");
            sb.append(th.getMessage());
            String sb2 = sb.toString();
            par0Var.getClass();
            par0.c(sb2, th);
            Context requireContext = requireContext();
            VkOAuthService vkOAuthService2 = this.G;
            Toast.makeText(requireContext, getString(R.string.vk_oauth_provider_error_toast, (vkOAuthService2 != null ? vkOAuthService2 : null).name()), 1).show();
            close();
        }
    }

    public final void In(Uri uri) {
        rex0 rex0Var = e370.j;
        if (rex0Var == null) {
            rex0Var = null;
        }
        rex0Var.b(kn(), uri);
    }

    public final void Jn(b bVar) {
        String string;
        Collection collection;
        if (bVar instanceof b.j) {
            tyv0 tyv0Var = this.M;
            (tyv0Var != null ? tyv0Var : null).e();
            return;
        }
        Fn();
        Context requireContext = requireContext();
        if (bVar instanceof b.a) {
            b.a aVar = (b.a) bVar;
            string = getString(R.string.vk_verification_account_connect_request_title, aVar.h, aVar.i);
        } else {
            string = getString(bVar.a);
        }
        Integer num = bVar.e;
        String string2 = num != null ? getString(num.intValue()) : null;
        Integer num2 = bVar.f;
        String string3 = num2 != null ? getString(num2.intValue()) : null;
        TextView textView = this.A;
        if (textView == null) {
            textView = null;
        }
        ey2.i(textView, string);
        TextView textView2 = this.B;
        if (textView2 == null) {
            textView2 = null;
        }
        textView2.setText(bVar.b);
        Button button = this.D;
        if (button == null) {
            button = null;
        }
        ey2.i(button, string2);
        Button button2 = this.E;
        if (button2 == null) {
            button2 = null;
        }
        ey2.i(button2, string3);
        Integer num3 = bVar.c;
        Integer num4 = bVar.d;
        Drawable e = (num3 == null || num4 == null) ? num3 != null ? krv0.e(num3.intValue(), requireContext) : null : krv0.f(num3.intValue(), num4.intValue(), requireContext);
        if (e != null) {
            ImageView imageView = this.z;
            if (imageView == null) {
                imageView = null;
            }
            imageView.setImageDrawable(e);
            ImageView imageView2 = this.z;
            if (imageView2 == null) {
                imageView2 = null;
            }
            imageView2.setVisibility(0);
        } else {
            ImageView imageView3 = this.z;
            if (imageView3 == null) {
                imageView3 = null;
            }
            f4m.j(imageView3);
        }
        b.C1911b c1911b = bVar instanceof b.C1911b ? (b.C1911b) bVar : null;
        if (c1911b == null || (collection = c1911b.h) == null) {
            b.c cVar = bVar instanceof b.c ? (b.c) bVar : null;
            collection = cVar != null ? cVar.h : EmptyList.b;
        }
        a aVar2 = this.H;
        ArrayList arrayList = aVar2.c;
        arrayList.clear();
        arrayList.addAll(collection);
        aVar2.notifyDataSetChanged();
    }

    public final void close() {
        if (isStateSaved()) {
            tn();
        } else {
            dismiss();
        }
    }

    public final void e0() {
        View view = this.F;
        if (view == null) {
            view = null;
        }
        view.setVisibility(0);
        Button button = this.D;
        if (button == null) {
            button = null;
        }
        f4m.j(button);
        Button button2 = this.E;
        f4m.j(button2 != null ? button2 : null);
    }

    @Override // androidx.fragment.app.Fragment
    /* renamed from: getContext */
    public final Context mo2getContext() {
        return this.N;
    }

    @Override // androidx.fragment.app.Fragment
    public final void onActivityResult(int i, int i2, Intent intent) {
        Gn();
        if (!((gnr0) this.L.getValue()).a(i, i2, intent, new q9i0(this, 11)) && !f4m.h(getView())) {
            close();
        }
        super.onActivityResult(i, i2, intent);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        this.N = hnj.a(context);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0037, code lost:
    
        if (r5 == null) goto L17;
     */
    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        VerificationFlow verificationFlow;
        String str;
        tyv0 wyv0Var;
        String string;
        Parcelable parcelable;
        Object parcelable2;
        super.onCreate(bundle);
        Bundle arguments = getArguments();
        this.J = arguments != null ? arguments.getBoolean("isVkIdFlow", true) : true;
        Bundle arguments2 = getArguments();
        VkOAuthService vkOAuthService = null;
        if (arguments2 != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments2.getParcelable("verificationFlow", VerificationFlow.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments2.getParcelable("verificationFlow");
                if (!(parcelable3 instanceof VerificationFlow)) {
                    parcelable3 = null;
                }
                parcelable = (VerificationFlow) parcelable3;
            }
            verificationFlow = (VerificationFlow) parcelable;
        }
        verificationFlow = VerificationFlow.Web.b;
        this.K = verificationFlow;
        Bundle arguments3 = getArguments();
        if (arguments3 != null && (string = arguments3.getString("service")) != null) {
            vkOAuthService = VkOAuthService.valueOf(string);
        }
        if (vkOAuthService == null || !((OAuthComponent) m7m.d(this).a(fpf0.a(OAuthComponent.class))).p1().c(vkOAuthService)) {
            par0 par0Var = par0.a;
            StringBuilder sb = new StringBuilder("OAuth provider ");
            if (vkOAuthService == null || (str = vkOAuthService.name()) == null) {
                str = "unknown";
            }
            sb.append(str);
            sb.append(" is not available. Dependency not found. Closing verification flow.");
            String sb2 = sb.toString();
            par0Var.getClass();
            par0.b(sb2);
            close();
            return;
        }
        this.G = vkOAuthService;
        boolean z = this.J;
        VerificationFlow verificationFlow2 = this.K;
        int i = syv0.$EnumSwitchMapping$0[vkOAuthService.ordinal()];
        if (i == 1) {
            wyv0Var = new wyv0(z);
        } else if (i == 2) {
            wyv0Var = new yyv0(VkOAuthService.TINKOFF, new czv0(), verificationFlow2);
        } else if (i == 3) {
            wyv0Var = new xyv0(VkOAuthService.SBER, new bzv0(), verificationFlow2);
        } else if (i == 4) {
            wyv0Var = new uyv0(VkOAuthService.ALFA, new ryv0(), verificationFlow2);
        } else {
            if (i != 5) {
                throw new IllegalStateException();
            }
            wyv0Var = new zyv0(VkOAuthService.VTB, new dzv0(), verificationFlow2);
        }
        this.M = wyv0Var;
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        Window window;
        Dialog dialog = this.s;
        if (dialog != null && (window = dialog.getWindow()) != null) {
            window.setBackgroundDrawable(null);
        }
        return eoy.a(layoutInflater).inflate(R.layout.vk_confirmation_account_layout, viewGroup, false);
    }

    @Override // androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        tyv0 tyv0Var = this.M;
        if (tyv0Var == null) {
            tyv0Var = null;
        }
        tyv0Var.getClass();
        q55 q55Var = q55.a;
        q55.e(tyv0Var.g);
        e eVar = tyv0Var.a;
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = tyv0Var.g().g;
        if (!eVar.c) {
            eVar.c = true;
            e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), schemeStatSak$EventScreen, SchemeStatSak$EventScreen.NOWHERE, null, 36);
        }
        tyv0Var.e = null;
        tyv0Var.f.e();
        super.onDestroyView();
    }

    @Override // androidx.fragment.app.d, android.content.DialogInterface.OnDismissListener
    public final void onDismiss(DialogInterface dialogInterface) {
        if (this.I) {
            Fragment targetFragment = getTargetFragment();
            if (targetFragment != null) {
                targetFragment.onActivityResult(getTargetRequestCode(), -1, null);
            }
        } else {
            Fragment targetFragment2 = getTargetFragment();
            if (targetFragment2 != null) {
                targetFragment2.onActivityResult(getTargetRequestCode(), 0, null);
            }
        }
        super.onDismiss(dialogInterface);
    }

    @Override // androidx.fragment.app.Fragment
    public final void onResume() {
        Window window;
        super.onResume();
        Dialog dialog = this.s;
        if (dialog == null || (window = dialog.getWindow()) == null) {
            return;
        }
        bpn0 bpn0Var = t65.a;
        boolean z = n8g.f(window.getNavigationBarColor()) >= 0.5d;
        View decorView = window.getDecorView();
        int systemUiVisibility = decorView.getSystemUiVisibility();
        decorView.setSystemUiVisibility(z ? systemUiVisibility | 16 : systemUiVisibility & (-17));
    }

    @Override // androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        Context requireContext = requireContext();
        Toolbar toolbar = (Toolbar) view.findViewById(R.id.toolbar);
        this.y = toolbar;
        toolbar.setNavigationOnClickListener(new dd6(this, 11));
        Toolbar toolbar2 = this.y;
        if (toolbar2 == null) {
            toolbar2 = null;
        }
        Drawable navigationIcon = toolbar2.getNavigationIcon();
        if (navigationIcon != null) {
            sjo.b(navigationIcon, krv0.m(R.attr.vk_ui_icon_accent_themed, requireContext), PorterDuff.Mode.SRC_IN);
        }
        this.z = (ImageView) view.findViewById(R.id.verification_account_icon);
        this.A = (TextView) view.findViewById(R.id.verification_account_title);
        this.B = (TextView) view.findViewById(R.id.verification_account_subtitle);
        this.C = (RecyclerView) view.findViewById(R.id.verification_account_recycler_view);
        this.D = (Button) view.findViewById(R.id.verification_account_primary_button);
        this.E = (Button) view.findViewById(R.id.verification_account_secondary_button);
        this.F = view.findViewById(R.id.verification_account_progress_bar);
        RecyclerView recyclerView = this.C;
        if (recyclerView == null) {
            recyclerView = null;
        }
        recyclerView.setAdapter(this.H);
        RecyclerView recyclerView2 = this.C;
        if (recyclerView2 == null) {
            recyclerView2 = null;
        }
        recyclerView2.setLayoutManager(new LinearLayoutManager());
        Button button = this.D;
        if (button == null) {
            button = null;
        }
        sp.t(button);
        Button button2 = this.D;
        if (button2 == null) {
            button2 = null;
        }
        button2.setOnClickListener(new p01(this, 16));
        Button button3 = this.E;
        if (button3 == null) {
            button3 = null;
        }
        sp.t(button3);
        Button button4 = this.E;
        if (button4 == null) {
            button4 = null;
        }
        button4.setOnClickListener(new v6d(this, 8));
        tyv0 tyv0Var = this.M;
        tyv0 tyv0Var2 = tyv0Var != null ? tyv0Var : null;
        tyv0Var2.e = this;
        q55 q55Var = q55.a;
        q55.a(tyv0Var2.g);
        Jn(tyv0Var2.g());
        e eVar = tyv0Var2.a;
        if (eVar.a) {
            eVar.b();
        } else {
            e.c(eVar, SchemeStatSak$TypeVkConnectNavigationItem.EventType.GO, eVar.a(), SchemeStatSak$EventScreen.NOWHERE, SchemeStatSak$EventScreen.ONBOARDING_VERIFICATION, null, 36);
        }
    }

    @Override // androidx.fragment.app.d
    public final int vn() {
        return R.style.VkIdBottomSheetTheme;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // com.google.android.material.bottomsheet.c, xsna.c33, androidx.fragment.app.d
    public final Dialog yn(Bundle bundle) {
        q0o0 q0o0Var = this instanceof q0o0 ? (q0o0) this : null;
        prw.h(this, q0o0Var != null ? q0o0Var.tag() : "VkSdkDialogFragment", null);
        Dialog yn = super.yn(bundle);
        if (bundle == null) {
            yn.setOnShowListener(new DialogInterface.OnShowListener() { // from class: xsna.qyv0
                @Override // android.content.DialogInterface.OnShowListener
                public final void onShow(DialogInterface dialogInterface) {
                    View findViewById = ((com.google.android.material.bottomsheet.b) dialogInterface).findViewById(R.id.design_bottom_sheet);
                    if (findViewById != null) {
                        ViewGroup.LayoutParams layoutParams = findViewById.getLayoutParams();
                        layoutParams.height = -1;
                        findViewById.setLayoutParams(layoutParams);
                        BottomSheetBehavior<View> L = BottomSheetBehavior.L(findViewById);
                        com.vk.superapp.verification.account.d dVar = com.vk.superapp.verification.account.d.this;
                        dVar.O = L;
                        if (L != null) {
                            L.W(0, false);
                        }
                        findViewById.post(new ov(dVar, 19));
                    }
                }
            });
            return yn;
        }
        new Handler(Looper.getMainLooper()).postDelayed(new yv6(this, 7), 100L);
        tyv0 tyv0Var = this.M;
        (tyv0Var != null ? tyv0Var : null).c();
        return yn;
    }
}
