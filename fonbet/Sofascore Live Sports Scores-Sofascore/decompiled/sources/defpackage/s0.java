package defpackage;

import android.app.Dialog;
import android.content.Context;
import android.os.Handler;
import android.text.Editable;
import android.view.View;
import android.widget.EditText;
import androidx.appcompat.app.AppCompatActivity;
import androidx.constraintlayout.widget.ConstraintLayout;
import com.blaze.blazesdk.follow.BlazeFollowEntityView;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.textfield.TextInputEditText;
import com.ironsource.Ua;
import com.mbridge.msdk.config.dynamic.baseview.ComponentButton;
import com.mbridge.msdk.config.dynamic.baseview.ComponentFrameLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentGridView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentHorizontalScrollView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentImageView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentInduceClickView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentLinearLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentListView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentRelativeLayout;
import com.mbridge.msdk.config.dynamic.baseview.ComponentScrollView;
import com.mbridge.msdk.config.dynamic.baseview.ComponentTextView;
import com.mbridge.msdk.config.dynamic.baseview.webview.ComponentWebView;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.chat.ChatActivity;
import com.sofascore.results.chat.ChatTranslateActivity;
import com.sofascore.results.chat.fragment.ExcludeLanguageDialog;
import com.sofascore.results.chat.fragment.RiskyChatsDialog;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.mvvm.base.AbstractActivity;
import com.sofascore.results.view.header.CollapsibleProfileHeaderView;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.reflect.KProperty;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final /* synthetic */ class s0 implements View.OnClickListener {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ s0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.view.View.OnClickListener
    public final void onClick(View view) {
        int i = this.a;
        int i2 = 3;
        rq3 rq3Var = null;
        Object obj = this.b;
        switch (i) {
            case 0:
                int i3 = AbstractActivity.I;
                ((hob) obj).invoke();
                break;
            case 1:
                ((Dialog) obj).dismiss();
                break;
            case 2:
                es1 es1Var = (es1) obj;
                jy4 jy4Var = es1Var.d;
                jy4Var.s.b.clearAnimation();
                Handler handler = es1Var.getHandler();
                y2 y2Var = es1Var.m;
                handler.removeCallbacks(y2Var);
                Event event = es1Var.e;
                if (event != null) {
                    drc drcVar = jy4Var.s;
                    ConstraintLayout constraintLayout = drcVar.b;
                    as9.o(drcVar.c, Event.getHomeTeam$default(event, null, 1, null).getId());
                    as9.o(drcVar.d, Event.getAwayTeam$default(event, null, 1, null).getId());
                    if (constraintLayout.getVisibility() != 0) {
                        tgj.p(constraintLayout, 300L, 2);
                        tgj.q(jy4Var.n, null, 14);
                        es1Var.getHandler().postDelayed(y2Var, Ua.C);
                        break;
                    } else {
                        es1Var.getHandler().post(y2Var);
                        break;
                    }
                }
                break;
            case 3:
                ((b71) obj).invoke();
                break;
            case 4:
                ((yk) obj).dismiss();
                break;
            case 5:
                BaseActivity baseActivity = (BaseActivity) obj;
                KProperty[] kPropertyArr = BaseActivity.H;
                baseActivity.A().edit().putBoolean("no_connection_empty_state", false).apply();
                baseActivity.K();
                break;
            case 6:
                u61 u61Var = (u61) obj;
                boolean z = u61Var.d;
                snl snlVar = u61Var.b;
                if (!z) {
                    xnl xnlVar = (xnl) snlVar;
                    xnlVar.b(xnlVar.a, "playVideo", new Object[0]);
                    break;
                } else {
                    ((xnl) snlVar).c();
                    break;
                }
            case 7:
                Function0 function0 = ((cu1) obj).f;
                if (function0 != null) {
                    function0.invoke();
                    break;
                }
                break;
            case 8:
                Context context = ((ku1) obj).b;
                nv.z0(context, kv.CLICK, "claim_button", "bet_boost_tab");
                String j = rld.j(context);
                if (j != null) {
                    bea.G(context, j);
                    break;
                }
                break;
            case 9:
                BlazeFollowEntityView blazeFollowEntityView = (BlazeFollowEntityView) obj;
                glm glmVar = blazeFollowEntityView.c;
                if (glmVar != null) {
                    boolean z2 = !blazeFollowEntityView.f();
                    Function2 function2 = blazeFollowEntityView.d;
                    if (function2 != null) {
                        function2.invoke(Boolean.valueOf(z2), glmVar);
                        break;
                    }
                }
                break;
            case 10:
                ChatActivity chatActivity = (ChatActivity) obj;
                int i4 = ChatActivity.Z;
                RiskyChatsDialog riskyChatsDialog = new RiskyChatsDialog();
                ChatActivity chatActivity2 = chatActivity instanceof AppCompatActivity ? chatActivity : null;
                if (chatActivity2 != null) {
                    wca.x(chatActivity2.getLifecycle()).b(new r1(riskyChatsDialog, chatActivity2, rq3Var, i2));
                    break;
                }
                break;
            case 11:
                int i5 = ChatMessageInputView.x;
                ((ChatMessageInputView) obj).q();
                break;
            case 12:
                mr2 mr2Var = (mr2) obj;
                ct8 ct8Var = mr2Var.l;
                if (ct8Var != null) {
                    ct8Var.invoke((ShapeableImageView) mr2Var.g.d, Integer.valueOf(mr2Var.getAbsoluteAdapterPosition()), mr2Var.d());
                    break;
                }
                break;
            case 13:
                ChatTranslateActivity chatTranslateActivity = (ChatTranslateActivity) obj;
                int i6 = ChatTranslateActivity.M;
                ExcludeLanguageDialog excludeLanguageDialog = new ExcludeLanguageDialog();
                ChatTranslateActivity chatTranslateActivity2 = chatTranslateActivity instanceof AppCompatActivity ? chatTranslateActivity : null;
                if (chatTranslateActivity2 != null) {
                    wca.x(chatTranslateActivity2.getLifecycle()).b(new r1(excludeLanguageDialog, chatTranslateActivity2, rq3Var, i2));
                    break;
                }
                break;
            case 14:
                jw2 jw2Var = (jw2) obj;
                EditText editText = jw2Var.i;
                if (editText != null) {
                    Editable text = editText.getText();
                    if (view.hasFocus()) {
                        jw2Var.i.requestFocus();
                    }
                    if (text != null) {
                        text.clear();
                    }
                    jw2Var.p();
                    break;
                }
                break;
            case 15:
                int i7 = CollapsibleProfileHeaderView.c;
                ((pfk) obj).invoke();
                break;
            case 16:
                ((TextInputEditText) ((dd) obj).d).setText((CharSequence) null);
                break;
            case 17:
                ((ComponentButton) obj).a(view);
                break;
            case 18:
                ((ComponentFrameLayout) obj).a(view);
                break;
            case 19:
                ((ComponentGridView) obj).a(view);
                break;
            case 20:
                ((ComponentHorizontalScrollView) obj).a(view);
                break;
            case 21:
                ((ComponentImageView) obj).a(view);
                break;
            case 22:
                ((ComponentInduceClickView) obj).a(view);
                break;
            case 23:
                ((ComponentLinearLayout) obj).a(view);
                break;
            case 24:
                ((ComponentListView) obj).a(view);
                break;
            case 25:
                ((ComponentRelativeLayout) obj).a(view);
                break;
            case 26:
                ((ComponentScrollView) obj).a(view);
                break;
            case 27:
                ((ComponentTextView) obj).a(view);
                break;
            case 28:
                ((ComponentWebView) obj).a(view);
                break;
            default:
                c90.d((xdi) obj);
                break;
        }
    }
}
