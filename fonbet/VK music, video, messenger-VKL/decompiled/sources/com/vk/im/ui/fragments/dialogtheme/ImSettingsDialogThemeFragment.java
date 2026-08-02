package com.vk.im.ui.fragments.dialogtheme;

import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.appcompat.app.AlertController;
import androidx.appcompat.app.d;
import androidx.appcompat.widget.Toolbar;
import com.vk.core.ui.themes.VKTheme;
import com.vk.core.view.fresco.VKEnhancedImageView;
import com.vk.dto.common.DialogBackground;
import com.vk.dto.common.Peer;
import com.vk.dto.common.id.UserId;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.dialogs.Dialog;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.im.engine.models.dialogs.DialogTheme;
import com.vk.im.engine.models.dialogs.DialogThemeImpl;
import com.vk.im.engine.models.dialogs.c;
import com.vk.im.ui.components.theme_chooser.ThemeChooserState;
import com.vk.im.ui.components.theme_chooser.b;
import com.vk.im.ui.fragments.ImFragment;
import com.vk.log.L;
import com.vk.movika.tools.controls.seekbar.k;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.completable.w;
import io.reactivex.rxjava3.internal.operators.observable.e;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.internal.operators.observable.l0;
import io.reactivex.rxjava3.internal.operators.observable.y;
import io.reactivex.rxjava3.internal.operators.single.s;
import io.reactivex.rxjava3.subjects.f;
import java.lang.ref.WeakReference;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Map;
import kotlin.LazyThreadSafetyMode;
import kotlin.jvm.internal.AdaptedFunctionReference;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.a1w;
import xsna.aa6;
import xsna.acc0;
import xsna.asu0;
import xsna.azt;
import xsna.b8v;
import xsna.baf0;
import xsna.bpn0;
import xsna.btm;
import xsna.bwt0;
import xsna.bzb0;
import xsna.cew;
import xsna.cwb0;
import xsna.cz;
import xsna.dhr0;
import xsna.dyb0;
import xsna.epx;
import xsna.g2v;
import xsna.g4;
import xsna.gzs;
import xsna.gzv;
import xsna.hc1;
import xsna.hg1;
import xsna.ho1;
import xsna.hzb0;
import xsna.i7o0;
import xsna.ies;
import xsna.izs;
import xsna.jbs;
import xsna.jjq;
import xsna.kbl0;
import xsna.kkm;
import xsna.leq;
import xsna.lh3;
import xsna.lzv;
import xsna.msy;
import xsna.mxv;
import xsna.n0v0;
import xsna.n34;
import xsna.oz50;
import xsna.p9m;
import xsna.q1w;
import xsna.qcw;
import xsna.rcw;
import xsna.s3q0;
import xsna.scw;
import xsna.t6g0;
import xsna.t7;
import xsna.tcw;
import xsna.too0;
import xsna.uy2;
import xsna.vg;
import xsna.wcw;
import xsna.x84;
import xsna.xcw;
import xsna.yi2;
import xsna.zcl;
import xsna.zdw;

/* compiled from: ImSettingsDialogThemeFragment.kt */
/* loaded from: classes2.dex */
public final class ImSettingsDialogThemeFragment extends ImFragment implements ies, too0 {
    public static final /* synthetic */ int c0 = 0;
    public final cew P = cew.b;
    public final a1w Q;
    public final bpn0 R;
    public jjq S;
    public com.vk.im.ui.components.theme_chooser.b T;
    public dyb0 U;
    public VKEnhancedImageView V;
    public View W;
    public TextView X;
    public bzb0 Y;
    public final kkm Z;
    public final Object a0;
    public final io.reactivex.rxjava3.disposables.b b0;

    /* compiled from: ImSettingsDialogThemeFragment.kt */
    public static final /* synthetic */ class b extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    /* compiled from: ImSettingsDialogThemeFragment.kt */
    public static final /* synthetic */ class c extends FunctionReferenceImpl implements izs<ThemeChooserState, s3q0> {
        /* JADX WARN: Removed duplicated region for block: B:52:0x00e2  */
        /* JADX WARN: Removed duplicated region for block: B:64:0x00fb  */
        @Override // xsna.izs
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final s3q0 invoke(ThemeChooserState themeChooserState) {
            Object obj;
            Object obj2;
            Object obj3;
            com.vk.im.engine.models.dialogs.c cVar;
            DialogTheme a;
            Map<VKTheme, DialogThemeImpl> map;
            ThemeChooserState themeChooserState2 = themeChooserState;
            ImSettingsDialogThemeFragment imSettingsDialogThemeFragment = (ImSettingsDialogThemeFragment) this.receiver;
            int i = ImSettingsDialogThemeFragment.c0;
            View view = imSettingsDialogThemeFragment.getView();
            Toolbar toolbar = view != null ? (Toolbar) view.findViewById(R.id.vk_im_toolbar) : null;
            if (toolbar != null) {
                boolean b = themeChooserState2.b();
                toolbar.setTitle(!b ? R.string.vkim_settings_create_theme : R.string.vkim_settings_theme);
                MenuItem findItem = toolbar.getMenu().findItem(R.id.vkim_done);
                if (findItem != null) {
                    findItem.setVisible(((b && imSettingsDialogThemeFragment.go()) || themeChooserState2.e) ? false : true);
                }
            }
            kkm kkmVar = imSettingsDialogThemeFragment.Z;
            Iterator<T> it = themeChooserState2.h.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((p9m) obj).a, themeChooserState2.c)) {
                    break;
                }
            }
            p9m p9mVar = (p9m) obj;
            Iterator<T> it2 = themeChooserState2.g.iterator();
            while (true) {
                if (!it2.hasNext()) {
                    obj2 = null;
                    break;
                }
                obj2 = it2.next();
                DialogBackground dialogBackground = (DialogBackground) obj2;
                if (epx.f(dialogBackground.b, themeChooserState2.d.b) && !dialogBackground.equals(DialogBackground.e)) {
                    break;
                }
            }
            DialogBackground dialogBackground2 = (DialogBackground) obj2;
            Iterator<T> it3 = themeChooserState2.f.iterator();
            while (true) {
                if (!it3.hasNext()) {
                    obj3 = null;
                    break;
                }
                obj3 = it3.next();
                if (epx.f(((DialogTheme) obj3).b.a, themeChooserState2.b)) {
                    break;
                }
            }
            DialogTheme dialogTheme = (DialogTheme) obj3;
            if (dialogTheme != null && epx.f(dialogTheme.c, dialogBackground2)) {
                if (epx.f(dialogTheme.d, p9mVar != null ? p9mVar.b : null)) {
                    cVar = dialogTheme.b;
                    com.vk.im.engine.models.dialogs.c cVar2 = cVar;
                    if (dialogTheme == null) {
                        if (dialogBackground2 == null) {
                            dialogBackground2 = dialogTheme.c;
                        }
                        DialogBackground dialogBackground3 = dialogBackground2;
                        if (p9mVar == null || (map = p9mVar.b) == null) {
                            map = dialogTheme.d;
                        }
                        a = DialogTheme.zb(dialogTheme, cVar2, dialogBackground3, map, null, 8);
                    } else {
                        uy2 uy2Var = DialogTheme.f;
                        a = DialogTheme.a.a();
                    }
                    kkmVar.i(a);
                    return s3q0.a;
                }
            }
            cVar = c.h.c;
            com.vk.im.engine.models.dialogs.c cVar22 = cVar;
            if (dialogTheme == null) {
            }
            kkmVar.i(a);
            return s3q0.a;
        }
    }

    /* compiled from: ImSettingsDialogThemeFragment.kt */
    public static final /* synthetic */ class d extends AdaptedFunctionReference implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.E(th, new Object[0]);
            return s3q0.a;
        }
    }

    public ImSettingsDialogThemeFragment() {
        a1w a1wVar = q1w.a;
        this.Q = a1wVar == null ? null : a1wVar;
        this.R = new bpn0(new gzv(this, 1));
        this.Z = new kkm(0);
        this.a0 = msy.a(LazyThreadSafetyMode.NONE, new x84(11));
        this.b0 = new io.reactivex.rxjava3.disposables.b();
    }

    @Override // com.vk.core.fragments.FragmentImpl, xsna.too0
    public final void Ng() {
        View view = this.W;
        if (view != null) {
            view.setBackgroundColor(dhr0.t.c(R.attr.colorPrimary));
        }
        TextView textView = this.X;
        if (textView != null) {
            textView.setTextColor(dhr0.t.c(R.attr.vk_ui_text_primary));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        com.vk.im.ui.components.theme_chooser.b bVar = this.T;
        boolean z = bVar != null && bVar.Z0().e;
        boolean z2 = (bVar == null || bVar.Z0().b()) ? false : true;
        if (bVar != null) {
            if (z2 && z) {
                if (bVar.Z0().a == ThemeChooserState.ListKind.THEME) {
                    return false;
                }
                bVar.b1(new acc0(15));
                return true;
            }
            if (z2 && !z) {
                d.a aVar = new d.a(requireContext());
                AlertController.b bVar2 = aVar.a;
                bVar2.d = bVar2.a.getText(R.string.vkim_confirm_theme_alert_title);
                aVar.c(R.string.vkim_confirm_custom_theme_alert_body);
                aVar.setPositiveButton(R.string.vkim_confirm_theme_alert_set, new scw(this)).setNegativeButton(R.string.vkim_confirm_theme_alert_ignore, new tcw(this)).m();
                return true;
            }
            if (z2 || !z) {
                if (!z2 && !z && go()) {
                    bVar.a1();
                    return false;
                }
                if (z2 || z || go()) {
                    throw new IllegalStateException("Unreachable case");
                }
                d.a aVar2 = new d.a(requireContext());
                AlertController.b bVar3 = aVar2.a;
                bVar3.d = bVar3.a.getText(R.string.vkim_confirm_theme_alert_title);
                aVar2.c(R.string.vkim_confirm_theme_alert_body);
                aVar2.setPositiveButton(R.string.vkim_confirm_theme_alert_set, new wcw(this)).setNegativeButton(R.string.vkim_confirm_theme_alert_ignore, new xcw(this)).m();
                return true;
            }
        }
        return false;
    }

    public final DialogExt eo() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (!arguments.containsKey("dialog_ext_state")) {
                arguments = null;
            }
            if (arguments != null) {
                Bundle bundle = arguments.getBundle("dialog_ext_state");
                Peer peer = (Peer) bundle.getParcelable("dialog_id");
                long j = peer != null ? peer.b : 0L;
                DialogExt dialogExt = (DialogExt) com.vk.core.util.state.a.b(DialogExt.class, bundle, bundle.getString("dialog_ext_state_key"));
                return dialogExt == null ? new DialogExt(j, (ProfilesInfo) null, 2, (zcl) null) : dialogExt;
            }
        }
        return null;
    }

    public final void fo(com.vk.im.ui.components.theme_chooser.b bVar, gzs<s3q0> gzsVar) {
        bzb0 bzb0Var = this.Y;
        if (bzb0Var == null) {
            return;
        }
        io.reactivex.rxjava3.subjects.d<ThemeChooserState> dVar = bVar.t;
        dVar.getClass();
        s sVar = new s(new e(new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(bVar.m), new lh3(new azt(6), 22)), new t7(new qcw(0), 18));
        f<Object> fVar = bVar.q;
        hg1.c2 c2Var = new hg1.c2();
        fVar.getClass();
        io.reactivex.rxjava3.internal.operators.completable.a aVar = new io.reactivex.rxjava3.internal.operators.completable.a(new io.reactivex.rxjava3.core.e[]{sVar, new l0(new i0(fVar, c2Var).U(new hg1.b2()), new aa6(new leq(11), 26))}, null);
        b8v b8vVar = new b8v(new rcw(0, gzsVar), 2);
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        this.N.b(io.reactivex.rxjava3.kotlin.c.d(hzb0.a(new w(aVar, b8vVar, lVar, kVar, kVar, kVar, kVar), bzb0Var, cwb0.j0.e), new hc1(14, bVar, this), new b(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0)));
    }

    public final boolean go() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return Boolean.valueOf(arguments.containsKey("dialog_ext_state")).equals(Boolean.FALSE);
        }
        return true;
    }

    public final void ho() {
        if (!go()) {
            this.P.getClass();
            if (cew.d()) {
                baf0 b2 = dhr0.t.b(R.drawable.vk_icon_palette_outline_56, R.attr.vk_ui_icon_accent);
                WeakReference weakReference = new WeakReference(getView());
                bzb0 bzb0Var = this.Y;
                if (bzb0Var != null) {
                    bzb0.d(bzb0Var, new cwb0.a1(R.string.vkim_theme_popup_disable_override_title, null, R.string.vkim_theme_popup_disable_override_body, null, R.string.enable, null, R.string.cancel, null, b2, cwb0.c1.b.a, 170), new g4(13, this, weakReference), null, null, 28);
                    return;
                }
                return;
            }
        }
        com.vk.im.ui.components.theme_chooser.b bVar = this.T;
        if (bVar != null) {
            fo(bVar, new btm(bVar, 13));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0036, code lost:
    
        if (r0 == null) goto L17;
     */
    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void onCreate(Bundle bundle) {
        String string;
        b.c.a c1157a;
        Dialog Cb;
        DialogTheme hc;
        com.vk.im.engine.models.dialogs.c cVar;
        super.onCreate(bundle);
        asu0 asu0Var = asu0.a;
        io.reactivex.rxjava3.core.w c2 = asu0Var.c();
        io.reactivex.rxjava3.core.w d2 = asu0Var.d();
        DialogExt eo = eo();
        if (eo != null && (Cb = eo.Cb()) != null && (hc = Cb.hc()) != null && (cVar = hc.b) != null && (string = cVar.a) != null) {
            if (string.equals(c.C1124c.c.a)) {
                string = null;
            }
        }
        this.P.getClass();
        string = cew.h().getString("pref_cfg_chat_overriden_theme", c.g.c.a);
        if (!go()) {
            string = null;
        }
        jjq jjqVar = new jjq(new jbs(this), this.Q, (lzv) this.R.getValue(), this.Z);
        this.S = jjqVar;
        LinkedHashSet linkedHashSet = this.O;
        linkedHashSet.add(jjqVar);
        if (go()) {
            c1157a = b.c.a.C1158b.a;
        } else {
            DialogExt eo2 = eo();
            if (eo2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            c1157a = new b.c.a.C1157a(eo2.e);
        }
        mxv c3 = g2v.c();
        zdw zdwVar = i7o0.b;
        zdw zdwVar2 = zdwVar != null ? zdwVar : null;
        g2v.c().getClass();
        if (string == null) {
            string = "";
        }
        com.vk.im.ui.components.theme_chooser.b bVar = new com.vk.im.ui.components.theme_chooser.b(this.Q, zdwVar2, n0v0.a, c3, new b.c(string, c1157a), c2, d2);
        io.reactivex.rxjava3.subjects.d<ThemeChooserState> dVar = bVar.t;
        dVar.getClass();
        this.N.b(new y(dVar, io.reactivex.rxjava3.internal.functions.a.a, io.reactivex.rxjava3.internal.functions.b.a).a0(bVar.m).subscribe(new ho1(new c(1, this, ImSettingsDialogThemeFragment.class, "onThemeChooserStateChange", "onThemeChooserStateChange(Lcom/vk/im/ui/components/theme_chooser/ThemeChooserState;)V", 0), 29), new cz(new d(1, L.a, L.class, Logger.METHOD_W, "w(Ljava/lang/Throwable;[Ljava/lang/Object;)V", 0), 27)));
        linkedHashSet.add(bVar);
        this.T = bVar;
        t6g0 t6g0Var = t6g0.b;
        t6g0.d().I0().getClass();
        HashMap<UserId, kbl0> hashMap = kbl0.b;
        if (kbl0.a.b().c().Ab()) {
            dyb0 dyb0Var = new dyb0(eo());
            this.U = dyb0Var;
            linkedHashSet.add(dyb0Var);
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final View onCreateView(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        return layoutInflater.inflate(R.layout.im_settings_chat_theme_fragment, viewGroup, false);
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        this.b0.e();
        bzb0 bzb0Var = this.Y;
        if (bzb0Var != null) {
            bzb0Var.a();
        }
        this.Y = null;
        super.onDestroyView();
        VKEnhancedImageView vKEnhancedImageView = this.V;
        if (vKEnhancedImageView != null) {
            this.Z.h(vKEnhancedImageView);
            this.V = null;
        }
    }

    @Override // com.vk.im.ui.fragments.ImFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onPause() {
        com.vk.im.ui.components.theme_chooser.b bVar;
        com.vk.im.ui.components.theme_chooser.b bVar2;
        super.onPause();
        if (!go() || (bVar = this.T) == null || !bVar.Z0().b() || (bVar2 = this.T) == null) {
            return;
        }
        bVar2.a1();
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        com.vk.im.ui.components.theme_chooser.b bVar = this.T;
        if (bVar != null) {
            bVar.P0(bundle);
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        View F0;
        View F02;
        View F03;
        super.onViewCreated(view, bundle);
        this.Y = new bzb0(view.getContext());
        this.W = view.findViewById(R.id.vkim_theme_global_set_warning);
        this.X = (TextView) view.findViewById(R.id.vkim_theme_warning_text);
        ViewGroup viewGroup = (ViewGroup) view.findViewById(R.id.vkim_chat_preview_container);
        jjq jjqVar = this.S;
        if (jjqVar != null && (F03 = jjqVar.F0(viewGroup, bundle)) != null) {
            viewGroup.addView(F03);
        }
        ViewGroup viewGroup2 = (ViewGroup) view.findViewById(R.id.vkim_background_chooser_container);
        com.vk.im.ui.components.theme_chooser.b bVar = this.T;
        if (bVar != null && (F02 = bVar.F0(viewGroup2, bundle)) != null) {
            viewGroup2.addView(F02);
        }
        ViewGroup viewGroup3 = (ViewGroup) view.findViewById(R.id.vkim_stickers_popup_animation_autoplay_container);
        boolean z = false;
        viewGroup3.setVisibility(0);
        dyb0 dyb0Var = this.U;
        if (dyb0Var != null && (F0 = dyb0Var.F0(viewGroup3, bundle)) != null) {
            viewGroup3.addView(F0);
        }
        VKEnhancedImageView vKEnhancedImageView = (VKEnhancedImageView) view.findViewById(R.id.dialog_background);
        this.V = vKEnhancedImageView;
        if (vKEnhancedImageView == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        this.Z.e(vKEnhancedImageView, new k(this, 5));
        View view2 = getView();
        Toolbar toolbar = view2 != null ? (Toolbar) view2.findViewById(R.id.vk_im_toolbar) : null;
        if (toolbar != null) {
            toolbar.setNavigationOnClickListener(new vg(this, 2));
            toolbar.l(R.menu.vkim_menu_done);
            MenuItem findItem = toolbar.getMenu().findItem(R.id.vkim_done);
            if (findItem != null) {
                findItem.setVisible(false);
            }
            toolbar.setOnMenuItemClickListener(new yi2(this, 23));
        }
        View findViewById = view.findViewById(R.id.vkim_theme_global_set_warning);
        if (findViewById != null) {
            if (!go()) {
                this.P.getClass();
                if (!cew.h().getBoolean("cfg_is_theme_warning_dismissed", false)) {
                    z = true;
                }
            }
            bwt0.p0(findViewById, z);
            findViewById.setOnClickListener(new com.vk.im.video.d(this, 7));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onViewStateRestored(Bundle bundle) {
        super.onViewStateRestored(bundle);
        com.vk.im.ui.components.theme_chooser.b bVar = this.T;
        if (bVar != null) {
            bVar.O0(bundle);
        }
    }

    /* compiled from: ImSettingsDialogThemeFragment.kt */
    public static final class a extends oz50 {
        public a() {
            super(ImSettingsDialogThemeFragment.class, null, null);
        }

        public a(DialogExt dialogExt) {
            this();
            n34.w(this.j, dialogExt, null);
        }
    }
}
