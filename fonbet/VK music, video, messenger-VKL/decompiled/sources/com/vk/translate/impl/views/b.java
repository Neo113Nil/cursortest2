package com.vk.translate.impl.views;

import android.transition.AutoTransition;
import android.transition.Transition;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import androidx.appcompat.widget.AppCompatTextView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.ui.CircularProgressView;
import com.vk.superapp.ui.shimmer.ShimmerFrameLayout;
import com.vkontakte.android.R;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import xsna.bwt0;
import xsna.c3v;
import xsna.cn70;
import xsna.dop0;
import xsna.ekh;
import xsna.ez80;
import xsna.fz80;
import xsna.h57;
import xsna.hfr;
import xsna.jjc;
import xsna.jxt0;
import xsna.kb20;
import xsna.ko00;
import xsna.lb20;
import xsna.mb20;
import xsna.ob20;
import xsna.onp0;
import xsna.oyr;
import xsna.p0w0;
import xsna.p7x;
import xsna.qb20;
import xsna.r9c0;
import xsna.rli0;
import xsna.sb20;
import xsna.t0w0;
import xsna.tb20;
import xsna.tp1;
import xsna.unp0;
import xsna.xg6;
import xsna.xus;

/* compiled from: MessageTranslateScreenOldVc.kt */
/* loaded from: classes6.dex */
public final class b implements xg6 {
    public final qb20 a;
    public final View b;
    public final View c;
    public final LinearLayout d;
    public final MessageTranslationUnitViewGroup e;
    public final MessageTranslateActionsLayout f;
    public final TranslateFailedView g;
    public final CircularProgressView h;
    public tb20 i;
    public boolean j;

    public b(LayoutInflater layoutInflater, ViewGroup viewGroup, qb20 qb20Var) {
        this.a = qb20Var;
        View inflate = layoutInflater.inflate(R.layout.vkim_message_translate_old, viewGroup, false);
        inflate.setClipToOutline(true);
        inflate.setOutlineProvider(new t0w0(4, cn70.b(12), false, false));
        this.b = inflate;
        View findViewById = inflate.findViewById(R.id.message_translate_close_button);
        findViewById.setClipToOutline(true);
        findViewById.setOutlineProvider(p0w0.a);
        findViewById.setBackground(xus.a(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, 254));
        jjc.g(findViewById, new ekh(this, 19));
        this.c = findViewById;
        LinearLayout linearLayout = (LinearLayout) inflate.findViewById(R.id.message_translate_content);
        this.d = linearLayout;
        MessageTranslationUnitViewGroup messageTranslationUnitViewGroup = (MessageTranslationUnitViewGroup) linearLayout.findViewById(R.id.message_translate_translation_unit);
        messageTranslationUnitViewGroup.setMaxLinesForCollapsedOriginalText(3);
        messageTranslationUnitViewGroup.setOriginalExpandText(messageTranslationUnitViewGroup.getContext().getString(R.string.vkim_translate_show_full_translate));
        messageTranslationUnitViewGroup.setOnExpandListener(new ko00(this, 5));
        messageTranslationUnitViewGroup.setListener(new a(this));
        this.e = messageTranslationUnitViewGroup;
        MessageTranslateActionsLayout messageTranslateActionsLayout = (MessageTranslateActionsLayout) linearLayout.findViewById(R.id.message_translate_actions);
        messageTranslateActionsLayout.setListener(new oyr(this, 6));
        this.f = messageTranslateActionsLayout;
        TranslateFailedView translateFailedView = (TranslateFailedView) inflate.findViewById(R.id.message_translate_language_not_recognized);
        translateFailedView.setListener(new tp1(this, 16));
        this.g = translateFailedView;
        this.h = (CircularProgressView) inflate.findViewById(R.id.message_translate_progress_bar);
    }

    @Override // xsna.xg6
    public final void a(tb20 tb20Var) {
        dop0 dop0Var = tb20Var.b;
        unp0 unp0Var = tb20Var.c;
        if ((dop0Var instanceof dop0.b) && (unp0Var instanceof unp0.b)) {
            boolean z = dop0Var instanceof dop0.b;
            CircularProgressView circularProgressView = this.h;
            if (z && (unp0Var instanceof unp0.b)) {
                circularProgressView.setVisibility(0);
                this.d.setVisibility(8);
                this.g.setVisibility(8);
            } else {
                circularProgressView.setVisibility(8);
            }
        } else if (dop0Var instanceof dop0.c) {
            tb20 tb20Var2 = this.i;
            if (tb20Var2 != null && (tb20Var2.b instanceof dop0.b) && !(dop0Var instanceof dop0.b) && !this.j) {
                this.j = true;
                AutoTransition autoTransition = new AutoTransition();
                autoTransition.addListener((Transition.TransitionListener) new sb20(this));
                this.a.X0(autoTransition);
            }
            dop0.c cVar = dop0Var != null ? (dop0.c) dop0Var : null;
            if (cVar != null) {
                onp0 onp0Var = cVar.a;
                if ((unp0Var instanceof unp0.b) || (unp0Var instanceof unp0.a)) {
                    c(onp0Var);
                } else {
                    if (!(unp0Var instanceof unp0.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if ((onp0Var instanceof onp0.c) || (onp0Var instanceof onp0.d)) {
                        c(onp0Var);
                    } else {
                        if (!(onp0Var instanceof onp0.b) && !(onp0Var instanceof onp0.a)) {
                            throw new NoWhenBranchMatchedException();
                        }
                        b(tb20Var);
                    }
                }
            }
        } else {
            b(tb20Var);
        }
        this.i = tb20Var;
    }

    public final void b(tb20 tb20Var) {
        String g;
        String g2;
        Object obj;
        unp0 unp0Var = tb20Var.c;
        dop0 dop0Var = tb20Var.b;
        ez80 ez80Var = tb20Var.a;
        boolean z = unp0Var instanceof unp0.b;
        if (z) {
            g = "";
        } else if (unp0Var instanceof unp0.c) {
            g = ((unp0.c) unp0Var).a.g();
        } else {
            if (!(unp0Var instanceof unp0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            g = ((unp0.a) unp0Var).a.g();
        }
        MessageTranslationUnitViewGroup messageTranslationUnitViewGroup = this.e;
        messageTranslationUnitViewGroup.setOriginalTitle(g);
        fz80 fz80Var = messageTranslationUnitViewGroup.c;
        boolean z2 = unp0Var instanceof unp0.a;
        LinearLayout linearLayout = this.d;
        messageTranslationUnitViewGroup.setOriginalSubtitle(z2 ? linearLayout.getContext().getString(R.string.vkim_translate_language_autorecognized) : "");
        messageTranslationUnitViewGroup.setOriginalText(ez80Var.a);
        if (ez80Var.b) {
            fz80Var.d.b();
        } else {
            fz80Var.d.a();
        }
        if (z) {
            g2 = "";
        } else if (unp0Var instanceof unp0.c) {
            g2 = ((unp0.c) unp0Var).b.g();
        } else {
            if (!z2) {
                throw new NoWhenBranchMatchedException();
            }
            g2 = ((unp0.a) unp0Var).b.g();
        }
        messageTranslationUnitViewGroup.setTranslatedTitle(g2);
        c cVar = messageTranslationUnitViewGroup.d;
        boolean z3 = dop0Var instanceof dop0.a;
        if (z3) {
            messageTranslationUnitViewGroup.setTranslatedText(dop0Var != null ? ((dop0.a) dop0Var).a : "");
        } else if (dop0Var instanceof dop0.c) {
            AppCompatTextView appCompatTextView = cVar.f;
            appCompatTextView.setText(R.string.vkim_translate_translating_failed);
            bwt0.p0(cVar.e, false);
            bwt0.p0(appCompatTextView, true);
            cVar.h.a();
            bwt0.p0(cVar.g, false);
            cVar.setClickable(true);
            cVar.setClickable(false);
            bwt0.p0(cVar.d, false);
        } else {
            if (!(dop0Var instanceof dop0.b)) {
                throw new NoWhenBranchMatchedException();
            }
            messageTranslationUnitViewGroup.setTranslatedText("");
        }
        if ((dop0Var instanceof dop0.b) && (unp0Var instanceof unp0.c)) {
            ShimmerFrameLayout shimmerFrameLayout = cVar.h;
            shimmerFrameLayout.d = true;
            shimmerFrameLayout.c();
            bwt0.p0(cVar.g, true);
            cVar.setClickable(false);
            bwt0.p0(cVar.d, false);
        } else {
            cVar.h.a();
            bwt0.p0(cVar.g, false);
            cVar.setClickable(true);
        }
        if (z3) {
            messageTranslationUnitViewGroup.setTranslatedAudioPlayingState(((dop0.a) dop0Var).b);
        }
        ob20 ob20Var = tb20Var.d;
        MessageTranslateActionsLayout messageTranslateActionsLayout = this.f;
        if (!ob20Var.equals(messageTranslateActionsLayout.c)) {
            messageTranslateActionsLayout.c = ob20Var;
            if (ob20Var instanceof ob20.b) {
                List<kb20> list = ((ob20.b) ob20Var).a;
                messageTranslateActionsLayout.removeAllViews();
                for (kb20 kb20Var : list) {
                    lb20 lb20Var = new lb20(messageTranslateActionsLayout.getContext());
                    lb20Var.setLayoutParams(new LinearLayout.LayoutParams(-1, -2));
                    lb20Var.b = kb20Var.a;
                    lb20Var.c.setImageResource(kb20Var.b);
                    lb20Var.d.setText(kb20Var.c);
                    lb20Var.setClickable(kb20Var.d);
                    jjc.g(lb20Var, new h57(15, messageTranslateActionsLayout, kb20Var));
                    messageTranslateActionsLayout.addView(lb20Var);
                }
            } else {
                if (!(ob20Var instanceof ob20.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                ((ob20.a) ob20Var).a.getClass();
                hfr.a aVar = new hfr.a(rli0.k(new jxt0(messageTranslateActionsLayout), lb20.class));
                while (true) {
                    if (aVar.hasNext()) {
                        obj = aVar.next();
                        if (((lb20) obj).getActionId() == 2) {
                            break;
                        }
                    } else {
                        obj = null;
                        break;
                    }
                }
                lb20 lb20Var2 = (lb20) obj;
                if (lb20Var2 != null) {
                    kb20 kb20Var2 = mb20.a;
                    lb20Var2.b = 3;
                    lb20Var2.c.setImageResource(R.drawable.vk_icon_done_outline_28);
                    lb20Var2.d.setText(R.string.vkim_translate_action_text_copy_success);
                    lb20Var2.setClickable(false);
                }
            }
        }
        this.h.setVisibility(8);
        this.g.setVisibility(8);
        tb20 tb20Var2 = this.i;
        if (tb20Var2 != null && (tb20Var2.b instanceof dop0.b) && !(dop0Var instanceof dop0.b) && !this.j) {
            this.j = true;
            AutoTransition autoTransition = new AutoTransition();
            autoTransition.addListener((Transition.TransitionListener) new sb20(this));
            this.a.X0(autoTransition);
        }
        linearLayout.setVisibility(0);
    }

    public final void c(onp0 onp0Var) {
        TranslateFailedView translateFailedView = this.g;
        AppCompatTextView appCompatTextView = translateFailedView.e;
        AppCompatTextView appCompatTextView2 = translateFailedView.d;
        AppCompatTextView appCompatTextView3 = translateFailedView.c;
        if (onp0Var.equals(onp0.b.a)) {
            appCompatTextView3.setText(R.string.vkim_language_not_autorecognized);
            appCompatTextView2.setText(R.string.vkim_language_not_autorecognized_info);
            bwt0.p0(appCompatTextView, true);
            appCompatTextView.setText(R.string.vkim_translate_select_language);
            jjc.g(appCompatTextView, new r9c0(translateFailedView, 15));
        } else if (onp0Var.equals(onp0.c.a)) {
            appCompatTextView3.setText(R.string.vkim_translate_for_msg_not_supported);
            appCompatTextView2.setText(R.string.vkim_translate_for_msg_not_supported_info);
            bwt0.p0(appCompatTextView, false);
            jjc.g(appCompatTextView, new c3v(29));
        } else {
            if (!onp0Var.equals(onp0.d.a) && !(onp0Var instanceof onp0.a)) {
                throw new NoWhenBranchMatchedException();
            }
            appCompatTextView3.setText(R.string.vkim_translate_service_not_available);
            appCompatTextView2.setText(R.string.vkim_translate_service_not_available_info);
            bwt0.p0(appCompatTextView, false);
            jjc.g(appCompatTextView, new p7x(28));
        }
        this.d.setVisibility(8);
        this.h.setVisibility(8);
        translateFailedView.setVisibility(0);
    }
}
