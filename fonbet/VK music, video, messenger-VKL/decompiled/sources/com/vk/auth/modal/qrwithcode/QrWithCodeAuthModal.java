package com.vk.auth.modal.qrwithcode;

import android.content.Context;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.drawable.ColorDrawable;
import android.graphics.drawable.Drawable;
import android.text.SpannableStringBuilder;
import android.text.style.ReplacementSpan;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.ImageView;
import android.widget.TextView;
import com.vk.api.generated.auth.dto.AuthIndexedCodeDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.auth.modal.base.ModalAuthHostActivity;
import com.vk.auth.modal.base.ModalAuthInfo;
import com.vk.auth.modal.qrwithcode.b;
import com.vk.core.ui.modal.VkModal;
import com.vk.core.ui.modal.b;
import com.vk.core.ui.themes.VKReplacerView;
import com.vk.core.view.components.button.VkButton;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.id.UserId;
import com.vk.registration.funnels.RegistrationFunnelScreenStack;
import com.vk.stat.sak.scheme.SchemeStatSak$EventScreen;
import com.vk.superapp.multiaccount.api.MultiAccountEntryPoint;
import com.vk.superapp.multiaccount.api.SwitcherActionCallback;
import com.vk.superapp.multiaccount.api.SwitcherLaunchMode;
import com.vk.superapp.multiaccount.api.SwitcherUiMode;
import com.vk.superapp.multiaccount.api.d;
import com.vk.superapp.multiaccount.api.e;
import com.vk.superapp.multiaccount.api.f;
import com.vk.superapp.multiaccount.api.g;
import com.vkontakte.android.R;
import defpackage.j0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import kotlin.Pair;
import xsna.adu0;
import xsna.arf0;
import xsna.awt0;
import xsna.b8g;
import xsna.c5g;
import xsna.ci0;
import xsna.dw20;
import xsna.e370;
import xsna.e3m;
import xsna.ehg;
import xsna.eko;
import xsna.enj;
import xsna.epx;
import xsna.f4m;
import xsna.frf0;
import xsna.gwd0;
import xsna.iah0;
import xsna.ifx0;
import xsna.iia0;
import xsna.iv20;
import xsna.j5g;
import xsna.jjc;
import xsna.jv20;
import xsna.kv20;
import xsna.lbc0;
import xsna.lpj;
import xsna.m33;
import xsna.msy;
import xsna.mui0;
import xsna.on00;
import xsna.px30;
import xsna.qoy;
import xsna.r55;
import xsna.rka0;
import xsna.roe0;
import xsna.s6y;
import xsna.shy;
import xsna.tlo0;
import xsna.uqi;
import xsna.ux40;
import xsna.wcl;
import xsna.wq20;

/* compiled from: QrWithCodeAuthModal.kt */
/* loaded from: classes15.dex */
public final class QrWithCodeAuthModal implements jv20, arf0, kv20 {
    public boolean A;
    public final Object B;
    public final Object C;
    public final Object D;
    public final Object E;
    public com.vk.auth.modal.qrwithcode.b F;
    public UserId G;
    public int H;
    public final ModalAuthInfo b;
    public final List<AuthIndexedCodeDto> c;
    public lpj d;
    public ModalAuthHostActivity e;
    public dw20 f;
    public com.vk.auth.modal.qrwithcode.a g;
    public VkTopBar h;
    public ViewGroup i;
    public View j;
    public View k;
    public View l;
    public View m;
    public View n;
    public com.vk.core.ui.image.a o;
    public TextView p;
    public ImageView q;
    public VkButton r;
    public TextView s;
    public TextView t;
    public TextView u;
    public ImageView v;
    public View w;
    public TextView x;
    public TextView y;
    public TextView z;

    /* compiled from: QrWithCodeAuthModal.kt */
    public static final class a {
        public final int a;
        public final int b;
        public final boolean c;
        public final Integer d;

        public /* synthetic */ a(int i, int i2) {
            this(i, i2, null, false);
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return this.a == aVar.a && this.b == aVar.b && this.c == aVar.c && epx.f(this.d, aVar.d);
        }

        public final int hashCode() {
            int b = qoy.b(shy.a(this.b, Integer.hashCode(this.a) * 31, 31), 31, this.c);
            Integer num = this.d;
            return b + (num == null ? 0 : num.hashCode());
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("ErrorUi(titleRes=");
            sb.append(this.a);
            sb.append(", subtitleRes=");
            sb.append(this.b);
            sb.append(", retryVisible=");
            sb.append(this.c);
            sb.append(", iconRes=");
            return uqi.b(sb, this.d, ')');
        }

        public a(int i, int i2, Integer num, boolean z) {
            this.a = i;
            this.b = i2;
            this.c = z;
            this.d = num;
        }
    }

    /* compiled from: QrWithCodeAuthModal.kt */
    public static final class b extends ReplacementSpan {
        public final Drawable b;
        public final int c;

        public b(Drawable drawable, int i) {
            this.b = drawable;
            this.c = i;
        }

        @Override // android.text.style.ReplacementSpan
        public final void draw(Canvas canvas, CharSequence charSequence, int i, int i2, float f, int i3, int i4, int i5, Paint paint) {
            Drawable drawable = this.b;
            int a = j0.a(i5, i3, drawable.getBounds().height(), 2, i3);
            int save = canvas.save();
            canvas.translate(f + this.c, a);
            drawable.draw(canvas);
            canvas.restoreToCount(save);
        }

        @Override // android.text.style.ReplacementSpan
        public final int getSize(Paint paint, CharSequence charSequence, int i, int i2, Paint.FontMetricsInt fontMetricsInt) {
            return this.b.getBounds().width() + this.c;
        }
    }

    /* compiled from: QrWithCodeAuthModal.kt */
    public static final /* synthetic */ class c {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[QrWithCodeAuthErrorType.values().length];
            try {
                iArr[QrWithCodeAuthErrorType.Generic.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[QrWithCodeAuthErrorType.NoInternet.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[QrWithCodeAuthErrorType.CodeExpired.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public QrWithCodeAuthModal() {
        throw null;
    }

    public QrWithCodeAuthModal(ModalAuthInfo modalAuthInfo, ArrayList arrayList) {
        this.b = modalAuthInfo;
        this.c = arrayList;
        this.A = true;
        rka0 rka0Var = new rka0(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.B = msy.a(lazyThreadSafetyMode, rka0Var);
        this.C = msy.a(lazyThreadSafetyMode, new iia0(this, 13));
        this.D = msy.a(lazyThreadSafetyMode, new lbc0(this, 8));
        this.E = msy.a(lazyThreadSafetyMode, new gwd0(1));
        this.F = b.d.a;
        this.G = UserId.d;
    }

    @Override // xsna.jv20
    public final void G8() {
        e();
    }

    @Override // xsna.jv20
    public final void I2(f fVar) {
        f.a.C1892a c1892a = fVar instanceof f.a.C1892a ? (f.a.C1892a) fVar : null;
        if (c1892a == null) {
            return;
        }
        g gVar = c1892a.d;
        AccountProfileType accountProfileType = gVar.m;
        accountProfileType.getClass();
        if (accountProfileType == AccountProfileType.NORMAL) {
            this.G = gVar.b;
            h();
            int d = d();
            this.H = d;
            com.vk.auth.modal.qrwithcode.a aVar = this.g;
            (aVar != null ? aVar : null).d(d);
        }
    }

    @Override // xsna.jv20
    public final void L0() {
        b();
    }

    @Override // xsna.dhg
    public final ehg Mb() {
        lpj lpjVar = this.d;
        if (lpjVar == null) {
            lpjVar = null;
        }
        return new wcl(lpjVar);
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ArrayList a() {
        List<f> d = ((d) this.C.getValue()).d();
        ArrayList arrayList = new ArrayList();
        for (Object obj : d) {
            if (obj instanceof f.a.C1892a) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            AccountProfileType accountProfileType = ((f.a.C1892a) next).d.m;
            accountProfileType.getClass();
            if (accountProfileType == AccountProfileType.NORMAL) {
                arrayList2.add(next);
            }
        }
        return arrayList2;
    }

    /* JADX WARN: Type inference failed for: r2v3, types: [java.lang.Object, kotlin.Lazy] */
    public final void b() {
        if (a().size() <= 1) {
            return;
        }
        com.vk.auth.modal.qrwithcode.a aVar = this.g;
        if (aVar == null) {
            aVar = null;
        }
        aVar.getClass();
        com.vk.registration.funnels.b bVar = com.vk.registration.funnels.b.a;
        SchemeStatSak$EventScreen u5 = aVar.h.u5();
        SchemeStatSak$EventScreen schemeStatSak$EventScreen = SchemeStatSak$EventScreen.MULTI_ACC_SWITCHER;
        iv20.b bVar2 = aVar.d;
        String str = (bVar2 != null ? bVar2 : null).f;
        Integer num = (bVar2 != null ? bVar2 : null).i;
        bVar.getClass();
        RegistrationFunnelScreenStack registrationFunnelScreenStack = frf0.a;
        frf0.f(u5, schemeStatSak$EventScreen, com.vk.registration.funnels.b.b(str, u5, String.valueOf(num), true), false, null, null, 56);
        SwitcherActionCallback switcherActionCallback = new SwitcherActionCallback() { // from class: com.vk.auth.modal.qrwithcode.QrWithCodeAuthModal$openSwitcher$switcherActionCallback$1
            @Override // com.vk.superapp.multiaccount.api.SwitcherActionCallback
            public final void a(f fVar) {
                f.a.C1892a c1892a = fVar instanceof f.a.C1892a ? (f.a.C1892a) fVar : null;
                if (c1892a == null) {
                    return;
                }
                UserId userId = c1892a.d.b;
                QrWithCodeAuthModal qrWithCodeAuthModal = QrWithCodeAuthModal.this;
                qrWithCodeAuthModal.G = userId;
                qrWithCodeAuthModal.h();
                int d = qrWithCodeAuthModal.d();
                qrWithCodeAuthModal.H = d;
                a aVar2 = qrWithCodeAuthModal.g;
                (aVar2 != null ? aVar2 : null).d(d);
            }
        };
        ModalAuthHostActivity modalAuthHostActivity = this.e;
        if (modalAuthHostActivity == null) {
            throw new IllegalStateException("QrWithCodeAuthModal is not shown");
        }
        ((e) this.D.getValue()).j(modalAuthHostActivity.getSupportFragmentManager(), MultiAccountEntryPoint.QrWithCode.d, new SwitcherLaunchMode.SwitcherCallbackMode(switcherActionCallback, this.G), SwitcherUiMode.EcoplateRestricted.b);
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v61, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.kv20
    public final void c(ModalAuthHostActivity modalAuthHostActivity) {
        VkTopBar.Middle middle;
        Drawable mutate;
        this.e = modalAuthHostActivity;
        lpj lpjVar = new lpj(modalAuthHostActivity, R.style.VkIdBModalBottomSheetTheme);
        this.d = lpjVar;
        Object[] objArr = 0;
        int i = 0;
        View inflate = LayoutInflater.from(lpjVar).inflate(R.layout.vk_fragment_qr_code_auth, (ViewGroup) null, false);
        this.i = (ViewGroup) inflate.findViewById(R.id.qr_code_auth_state_container);
        this.j = inflate.findViewById(R.id.qr_code_auth_loading_state);
        this.k = inflate.findViewById(R.id.qr_code_auth_code_state);
        this.l = inflate.findViewById(R.id.qr_code_auth_error_state);
        this.m = inflate.findViewById(R.id.qr_code_auth_device_info_state);
        View findViewById = inflate.findViewById(R.id.qr_code_auth_account_row);
        jjc.g(findViewById, new ux40(this, 21));
        this.n = findViewById;
        ifx0 ifx0Var = e370.c;
        if (ifx0Var == null) {
            ifx0Var = null;
        }
        this.o = ifx0Var.a().create(inflate.getContext());
        VKReplacerView vKReplacerView = (VKReplacerView) inflate.findViewById(R.id.qr_code_auth_account_avatar);
        com.vk.core.ui.image.a aVar = this.o;
        if (aVar == null) {
            aVar = null;
        }
        vKReplacerView.a(aVar.getView());
        this.p = (TextView) inflate.findViewById(R.id.qr_code_auth_account_name);
        this.q = (ImageView) inflate.findViewById(R.id.qr_code_auth_account_chevron);
        this.s = (TextView) inflate.findViewById(R.id.qr_code_auth_code);
        inflate.findViewById(R.id.qr_code_auth_title).setOnClickListener(new ci0(this, 10));
        TextView textView = (TextView) inflate.findViewById(R.id.qr_code_auth_title);
        CharSequence text = textView.getText();
        Context context = inflate.getContext();
        Drawable a2 = m33.a(R.drawable.vk_icon_info_outline_16, context);
        if (a2 != null && (mutate = a2.mutate()) != null) {
            mutate.setTint(e3m.f(R.attr.vk_ui_icon_medium, context));
            int a3 = iah0.a(16);
            int a4 = iah0.a(4);
            mutate.setBounds(0, 0, a3, a3);
            textView.setText(new SpannableStringBuilder(text).append("￼", new b(mutate, a4), 33));
        }
        VkButton vkButton = (VkButton) inflate.findViewById(R.id.qr_code_auth_cancel_button);
        jjc.g(vkButton, new wq20(this, 20));
        this.r = vkButton;
        this.t = (TextView) inflate.findViewById(R.id.qr_code_auth_error_title);
        this.u = (TextView) inflate.findViewById(R.id.qr_code_auth_error_subtitle);
        this.v = (ImageView) inflate.findViewById(R.id.qr_code_auth_error_icon);
        View findViewById2 = inflate.findViewById(R.id.qr_code_auth_error_retry);
        jjc.g(findViewById2, new px30(this, 26));
        this.w = findViewById2;
        View findViewById3 = inflate.findViewById(R.id.qr_code_auth_device_info_device);
        this.x = (TextView) findViewById3.findViewById(R.id.qr_code_auth_device_info_value);
        ((ImageView) findViewById3.findViewById(R.id.qr_code_auth_device_info_icon)).setImageResource(R.drawable.vk_icon_computer_outline_24);
        View findViewById4 = inflate.findViewById(R.id.qr_code_auth_device_info_service);
        this.y = (TextView) findViewById4.findViewById(R.id.qr_code_auth_device_info_value);
        ((ImageView) findViewById4.findViewById(R.id.qr_code_auth_device_info_icon)).setImageResource(R.drawable.vk_icon_globe_outline_28);
        View findViewById5 = inflate.findViewById(R.id.qr_code_auth_device_info_location);
        this.z = (TextView) findViewById5.findViewById(R.id.qr_code_auth_device_info_value);
        ((ImageView) findViewById5.findViewById(R.id.qr_code_auth_device_info_icon)).setImageResource(R.drawable.vk_icon_place_outline_28);
        lpj lpjVar2 = this.d;
        if (lpjVar2 == null) {
            lpjVar2 = null;
        }
        VkTopBar vkTopBar = new VkTopBar(lpjVar2, objArr == true ? 1 : 0, 6, i);
        r55 r55Var = r55.a;
        Drawable b2 = r55.i().b(vkTopBar.getContext());
        if (b2 != null) {
            lpj lpjVar3 = this.d;
            if (lpjVar3 == null) {
                lpjVar3 = null;
            }
            ImageView imageView = new ImageView(lpjVar3);
            imageView.setLayoutParams(new ViewGroup.LayoutParams(-1, -2));
            imageView.setScaleType(ImageView.ScaleType.CENTER);
            imageView.setImageDrawable(b2);
            imageView.setContentDescription(imageView.getContext().getString(R.string.vk_toolbar_vkid_logo_talkback));
            middle = new VkTopBar.Middle.b(imageView);
        } else {
            middle = VkTopBar.Middle.c.a;
        }
        vkTopBar.setMiddle(middle);
        vkTopBar.setBefore(new VkTopBar.c.f(new eko(new ColorDrawable(0)), null, null, null, null, 58));
        Drawable e = enj.e(R.drawable.vk_icon_dismiss_24, R.attr.vk_ui_icon_medium, vkTopBar.getContext());
        tlo0.a aVar2 = tlo0.Companion;
        String string = vkTopBar.getContext().getString(R.string.vk_auth_accessibility_close);
        aVar2.getClass();
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new eko(e), new tlo0.h(string), new s6y(this, 28), null, new b8g(e3m.f(R.attr.vk_ui_icon_medium, vkTopBar.getContext())), null, 40), null, 6));
        this.h = vkTopBar;
        this.G = ((mui0) this.B.getValue()).a();
        h();
        this.H = d();
        lpj lpjVar4 = this.d;
        if (lpjVar4 == null) {
            lpjVar4 = null;
        }
        com.vk.auth.modal.qrwithcode.a aVar3 = new com.vk.auth.modal.qrwithcode.a(lpjVar4, this);
        this.g = aVar3;
        aVar3.M2(this.b);
        VkModal.Mode mode = VkModal.Mode.DynamicHeight;
        VkTopBar vkTopBar2 = this.h;
        if (vkTopBar2 == null) {
            vkTopBar2 = null;
        }
        VkModal vkModal = new VkModal(mode, new b.C0791b(inflate, vkTopBar2), new roe0(0, this, QrWithCodeAuthModal.class, "onDismiss", "onDismiss()V", 0), true, 4);
        lpj lpjVar5 = this.d;
        if (lpjVar5 == null) {
            lpjVar5 = null;
        }
        this.f = vkModal.b(lpjVar5, "modal_auth_fragment_tag");
        com.vk.auth.modal.qrwithcode.a aVar4 = this.g;
        com.vk.auth.modal.qrwithcode.a aVar5 = aVar4 != null ? aVar4 : null;
        int i2 = this.H;
        aVar5.getClass();
        List<AuthIndexedCodeDto> list = this.c;
        int e2 = on00.e(c5g.u(list, 10));
        LinkedHashMap linkedHashMap = new LinkedHashMap(e2 >= 16 ? e2 : 16);
        for (AuthIndexedCodeDto authIndexedCodeDto : list) {
            Pair pair = new Pair(Integer.valueOf(authIndexedCodeDto.e()), authIndexedCodeDto.d());
            linkedHashMap.put(pair.i(), pair.j());
        }
        aVar5.i = linkedHashMap;
        aVar5.j = i2;
        b.d dVar = b.d.a;
        aVar5.k = dVar;
        aVar5.e(dVar, false);
    }

    public final int d() {
        Iterator it = a().iterator();
        int i = 0;
        while (true) {
            if (!it.hasNext()) {
                i = -1;
                break;
            }
            if (epx.f(((f.a.C1892a) it.next()).d.b, this.G)) {
                break;
            }
            i++;
        }
        if (i >= 0) {
            return i;
        }
        return 0;
    }

    public final void e() {
        dw20 dw20Var = this.f;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    public final void f(boolean z) {
        VkButton vkButton = this.r;
        if (vkButton != null) {
            vkButton.setLoading(z);
        }
    }

    @Override // xsna.kv20
    public final void g() {
        this.A = false;
        dw20 dw20Var = this.f;
        if (dw20Var != null) {
            dw20Var.hide();
        }
    }

    public final void h() {
        Object obj;
        String string;
        ArrayList a2 = a();
        Iterator it = a2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (epx.f(((f.a.C1892a) obj).d.b, this.G)) {
                    break;
                }
            }
        }
        f.a.C1892a c1892a = (f.a.C1892a) obj;
        if (c1892a == null) {
            c1892a = (f.a.C1892a) j5g.a0(a2);
        }
        if (c1892a != null) {
            this.G = c1892a.d.b;
        }
        if (c1892a == null) {
            View view = this.n;
            f4m.j(view != null ? view : null);
            return;
        }
        g gVar = c1892a.d;
        String str = gVar.c;
        View view2 = this.n;
        if (view2 == null) {
            view2 = null;
        }
        view2.setVisibility(0);
        TextView textView = this.p;
        if (textView == null) {
            textView = null;
        }
        textView.setText(str);
        com.vk.core.ui.image.a aVar = this.o;
        if (aVar == null) {
            aVar = null;
        }
        String str2 = gVar.d;
        lpj lpjVar = this.d;
        if (lpjVar == null) {
            lpjVar = null;
        }
        aVar.f(str2, adu0.a(6, lpjVar));
        boolean z = a().size() > 1;
        ImageView imageView = this.q;
        if (imageView == null) {
            imageView = null;
        }
        awt0.v(imageView, z);
        View view3 = this.n;
        if (view3 == null) {
            view3 = null;
        }
        view3.setClickable(z);
        View view4 = this.n;
        if (view4 == null) {
            view4 = null;
        }
        view4.setFocusable(z);
        View view5 = this.n;
        if (view5 == null) {
            view5 = null;
        }
        if (z) {
            lpj lpjVar2 = this.d;
            string = (lpjVar2 != null ? lpjVar2 : null).getString(R.string.vk_qr_code_auth_account_switch_accessibility_template, str);
        } else {
            lpj lpjVar3 = this.d;
            string = (lpjVar3 != null ? lpjVar3 : null).getString(R.string.vk_qr_code_auth_account_accessibility_template, str);
        }
        view5.setContentDescription(string);
    }

    @Override // xsna.arf0
    public final SchemeStatSak$EventScreen u5() {
        return this.F instanceof b.C0406b ? SchemeStatSak$EventScreen.QR_CODE_DEVICE_INFO : SchemeStatSak$EventScreen.QR_CODE_DISPLAY_CODE;
    }

    @Override // xsna.jv20
    public final void W8(iv20 iv20Var) {
    }

    @Override // xsna.jv20
    public final void vc(String str, String str2, String str3, String str4, String str5) {
    }
}
