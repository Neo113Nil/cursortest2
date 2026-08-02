package com.sofascore.results.chat.fragment;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Handler;
import android.text.SpannableString;
import android.text.style.ImageSpan;
import android.view.View;
import android.view.ViewGroup;
import android.view.inputmethod.InputMethodManager;
import android.widget.EditText;
import android.widget.FrameLayout;
import android.widget.ImageView;
import android.widget.TextView;
import androidx.activity.result.ActivityResult;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.material.floatingactionbutton.FloatingActionButton;
import com.google.android.material.imageview.ShapeableImageView;
import com.google.android.material.progressindicator.CircularProgressIndicator;
import com.sofascore.model.chat.ChatImage;
import com.sofascore.model.chat.ChatUser;
import com.sofascore.model.chat.Message;
import com.sofascore.results.R;
import com.sofascore.results.chat.fragment.AbstractChatFragment;
import com.sofascore.results.chat.view.ChatConnectingView;
import com.sofascore.results.chat.view.ChatMessageInputView;
import com.sofascore.results.chat.view.ChatRecyclerView;
import com.sofascore.results.chat.view.FloatingIndicationLabelView;
import com.sofascore.results.chat.view.ScoreUpdateView;
import com.sofascore.results.redesign.emptystateblocks.GraphicLarge;
import defpackage.a5f;
import defpackage.ajh;
import defpackage.ao2;
import defpackage.apf;
import defpackage.c0;
import defpackage.ce;
import defpackage.de;
import defpackage.dmi;
import defpackage.dr2;
import defpackage.duf;
import defpackage.e6b;
import defpackage.e92;
import defpackage.eca;
import defpackage.ehc;
import defpackage.fhc;
import defpackage.fn0;
import defpackage.fuf;
import defpackage.g1;
import defpackage.gca;
import defpackage.gh5;
import defpackage.h1;
import defpackage.hla;
import defpackage.ht9;
import defpackage.i1;
import defpackage.ix1;
import defpackage.j1;
import defpackage.j58;
import defpackage.joa;
import defpackage.jr2;
import defpackage.js2;
import defpackage.kr1;
import defpackage.krk;
import defpackage.lq2;
import defpackage.m35;
import defpackage.mqi;
import defpackage.n1;
import defpackage.nq8;
import defpackage.otk;
import defpackage.p4d;
import defpackage.pq2;
import defpackage.q1;
import defpackage.r1;
import defpackage.rq2;
import defpackage.rq3;
import defpackage.s0;
import defpackage.s5d;
import defpackage.sj4;
import defpackage.t3;
import defpackage.tba;
import defpackage.tol;
import defpackage.u6b;
import defpackage.uic;
import defpackage.un0;
import defpackage.us2;
import defpackage.v1;
import defpackage.va8;
import defpackage.vt9;
import defpackage.w1;
import defpackage.wca;
import defpackage.x;
import defpackage.x1;
import defpackage.xd;
import defpackage.xw3;
import defpackage.y1;
import defpackage.yea;
import defpackage.yhk;
import defpackage.yn8;
import defpackage.ypa;
import defpackage.ysa;
import defpackage.z1;
import defpackage.z8e;
import defpackage.zic;
import java.util.ArrayList;
import java.util.HashSet;
import java.util.Iterator;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b'\u0018\u00002\b\u0012\u0004\u0012\u00020\u00020\u0001B\u0007¢\u0006\u0004\b\u0003\u0010\u0004¨\u0006\u0005"}, d2 = {"Lcom/sofascore/results/chat/fragment/AbstractChatFragment;", "Lcom/sofascore/results/mvvm/base/AbstractFragment;", "Lyn8;", "<init>", "()V", "mobile_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public abstract class AbstractChatFragment extends Hilt_AbstractChatFragment<yn8> {
    public final joa A;
    public boolean B;
    public final n1 C;
    public final de D;
    public final de E;
    public final de F;
    public boolean G;
    public boolean H;
    public int I;
    public final joa J;
    public final joa K;
    public lq2 L;
    public boolean M;
    public hla N;
    public final otk r;
    public final otk s;
    public s5d t;
    public final mqi u;
    public final n1 v;
    public sj4 w;
    public boolean x;
    public final joa y;
    public final joa z;

    public AbstractChatFragment() {
        fuf fufVar = duf.a;
        final int i = 0;
        final int i2 = 1;
        final int i3 = 2;
        this.r = new otk(fufVar.getOrCreateKotlinClass(pq2.class), new v1(this, i), new v1(this, i3), new v1(this, i2));
        int i4 = 3;
        v1 v1Var = new v1(this, i4);
        ysa ysaVar = ysa.c;
        joa a = ypa.a(ysaVar, new w1(v1Var, i));
        this.s = new otk(fufVar.getOrCreateKotlinClass(us2.class), new x1(a, i), new y1(i, this, a), new x1(a, i2));
        this.u = ypa.b(new c0(4));
        this.v = new n1(this, i);
        this.y = ypa.a(ysaVar, new g1(this, 8));
        this.z = ypa.a(ysaVar, new g1(this, 9));
        this.A = ypa.a(ysaVar, new g1(this, 10));
        this.C = new n1(this, i2);
        de registerForActivityResult = registerForActivityResult(new ce(i), new xd(this) { // from class: f1
            public final /* synthetic */ AbstractChatFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Object value;
                Bundle extras;
                Bundle extras2;
                int i5 = i2;
                HashSet hashSet = null;
                AbstractChatFragment abstractChatFragment = this.b;
                switch (i5) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        String string = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("LANGUAGE", null);
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            hashSet = (HashSet) gz8.M(extras, "EXCLUDED_LIST", HashSet.class);
                        }
                        fdi fdiVar = abstractChatFragment.D().r;
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, new mq2(string, hashSet)));
                        break;
                    case 1:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            krk krkVar = abstractChatFragment.l;
                            krkVar.getClass();
                            js2 js2Var = ((yn8) krkVar).f.d;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) js2Var.o;
                            ImageView imageView = (ImageView) js2Var.c;
                            circularProgressIndicator.setVisibility(0);
                            imageView.setVisibility(8);
                            imageView.setOnClickListener(null);
                            us2 L = abstractChatFragment.L();
                            xw3.L(un0.z(L), null, null, new l0(L, uri, null, 20), 3);
                            break;
                        }
                        break;
                    default:
                        ActivityResult activityResult2 = (ActivityResult) obj;
                        activityResult2.getClass();
                        if (activityResult2.a == -1) {
                            abstractChatFragment.C();
                            break;
                        }
                        break;
                }
            }
        });
        registerForActivityResult.getClass();
        this.D = registerForActivityResult;
        de registerForActivityResult2 = registerForActivityResult(new ce(i4), new xd(this) { // from class: f1
            public final /* synthetic */ AbstractChatFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Object value;
                Bundle extras;
                Bundle extras2;
                int i5 = i3;
                HashSet hashSet = null;
                AbstractChatFragment abstractChatFragment = this.b;
                switch (i5) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        String string = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("LANGUAGE", null);
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            hashSet = (HashSet) gz8.M(extras, "EXCLUDED_LIST", HashSet.class);
                        }
                        fdi fdiVar = abstractChatFragment.D().r;
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, new mq2(string, hashSet)));
                        break;
                    case 1:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            krk krkVar = abstractChatFragment.l;
                            krkVar.getClass();
                            js2 js2Var = ((yn8) krkVar).f.d;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) js2Var.o;
                            ImageView imageView = (ImageView) js2Var.c;
                            circularProgressIndicator.setVisibility(0);
                            imageView.setVisibility(8);
                            imageView.setOnClickListener(null);
                            us2 L = abstractChatFragment.L();
                            xw3.L(un0.z(L), null, null, new l0(L, uri, null, 20), 3);
                            break;
                        }
                        break;
                    default:
                        ActivityResult activityResult2 = (ActivityResult) obj;
                        activityResult2.getClass();
                        if (activityResult2.a == -1) {
                            abstractChatFragment.C();
                            break;
                        }
                        break;
                }
            }
        });
        registerForActivityResult2.getClass();
        this.E = registerForActivityResult2;
        de registerForActivityResult3 = registerForActivityResult(new ce(i4), new xd(this) { // from class: f1
            public final /* synthetic */ AbstractChatFragment b;

            {
                this.b = this;
            }

            @Override // defpackage.xd
            public final void onActivityResult(Object obj) {
                Object value;
                Bundle extras;
                Bundle extras2;
                int i5 = i;
                HashSet hashSet = null;
                AbstractChatFragment abstractChatFragment = this.b;
                switch (i5) {
                    case 0:
                        ActivityResult activityResult = (ActivityResult) obj;
                        activityResult.getClass();
                        Intent intent = activityResult.b;
                        String string = (intent == null || (extras2 = intent.getExtras()) == null) ? null : extras2.getString("LANGUAGE", null);
                        if (intent != null && (extras = intent.getExtras()) != null) {
                            hashSet = (HashSet) gz8.M(extras, "EXCLUDED_LIST", HashSet.class);
                        }
                        fdi fdiVar = abstractChatFragment.D().r;
                        do {
                            value = fdiVar.getValue();
                        } while (!fdiVar.k(value, new mq2(string, hashSet)));
                        break;
                    case 1:
                        Uri uri = (Uri) obj;
                        if (uri != null) {
                            krk krkVar = abstractChatFragment.l;
                            krkVar.getClass();
                            js2 js2Var = ((yn8) krkVar).f.d;
                            CircularProgressIndicator circularProgressIndicator = (CircularProgressIndicator) js2Var.o;
                            ImageView imageView = (ImageView) js2Var.c;
                            circularProgressIndicator.setVisibility(0);
                            imageView.setVisibility(8);
                            imageView.setOnClickListener(null);
                            us2 L = abstractChatFragment.L();
                            xw3.L(un0.z(L), null, null, new l0(L, uri, null, 20), 3);
                            break;
                        }
                        break;
                    default:
                        ActivityResult activityResult2 = (ActivityResult) obj;
                        activityResult2.getClass();
                        if (activityResult2.a == -1) {
                            abstractChatFragment.C();
                            break;
                        }
                        break;
                }
            }
        });
        registerForActivityResult3.getClass();
        this.F = registerForActivityResult3;
        this.H = true;
        this.I = -1;
        this.J = ypa.a(ysaVar, new g1(this, i));
        this.K = ypa.a(ysaVar, new g1(this, 5));
    }

    public void C() {
        ((Handler) this.u.getValue()).post(this.v);
    }

    public final pq2 D() {
        return (pq2) this.r.getValue();
    }

    /* renamed from: E */
    public abstract dr2 getR();

    public final fhc F() {
        return (fhc) this.K.getValue();
    }

    public gca G() {
        return (gca) this.A.getValue();
    }

    public final SharedPreferences H() {
        return (SharedPreferences) this.J.getValue();
    }

    public final boolean I() {
        SharedPreferences d;
        Context requireContext = requireContext();
        requireContext.getClass();
        requireContext.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = requireContext.getApplicationContext();
            synchronized (uic.i) {
                d = a5f.d(applicationContext);
                uic.j = d;
            }
            d.getClass();
            sharedPreferences = d;
        }
        return sharedPreferences.getBoolean("SHOW_CHAT_RULES", true);
    }

    public final ChatUser K() {
        D();
        return pq2.k();
    }

    public final us2 L() {
        return (us2) this.s.getValue();
    }

    public final void M(Message message) {
        if (isResumed()) {
            SharedPreferences.Editor edit = H().edit();
            edit.getClass();
            edit.putLong(getR().b, message.getTimestamp());
            edit.apply();
            return;
        }
        this.M = true;
        hla hlaVar = this.N;
        if (hlaVar != null) {
            krk krkVar = this.l;
            krkVar.getClass();
            ((yn8) krkVar).l.removeItemDecoration(hlaVar);
        }
        Context requireContext = requireContext();
        requireContext.getClass();
        hla hlaVar2 = new hla(requireContext, H().getLong(getR().b, 0L));
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((yn8) krkVar2).l.addItemDecoration(hlaVar2);
        this.N = hlaVar2;
        lq2 lq2Var = this.L;
        if (lq2Var != null) {
            lq2Var.a();
        }
    }

    public abstract void N();

    /* JADX WARN: Multi-variable type inference failed */
    public final void O(String str, String str2, ChatImage chatImage, int i) {
        str2.getClass();
        krk krkVar = this.l;
        krkVar.getClass();
        ChatMessageInputView chatMessageInputView = ((yn8) krkVar).f;
        g1 g1Var = new g1(this, 7);
        js2 js2Var = chatMessageInputView.d;
        ((EditText) js2Var.m).requestFocus();
        Context context = chatMessageInputView.getContext();
        context.getClass();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService(InputMethodManager.class);
        int i2 = 1;
        if (inputMethodManager != null) {
            inputMethodManager.showSoftInput((EditText) js2Var.m, 1);
        }
        chatMessageInputView.p = Integer.valueOf(i);
        chatMessageInputView.g = g1Var;
        krk krkVar2 = this.l;
        krkVar2.getClass();
        if (((yn8) krkVar2).e.getVisibility() != 0) {
            krk krkVar3 = this.l;
            krkVar3.getClass();
            tba.i(((yn8) krkVar3).e, m35.FROM_BOTTOM, 0L, 6);
        }
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ((FrameLayout) ((yn8) krkVar4).d.b).setVisibility(0);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        ((ImageView) ((yn8) krkVar5).d.c).setVisibility(0);
        krk krkVar6 = this.l;
        krkVar6.getClass();
        ((TextView) ((yn8) krkVar6).d.f).setText(str);
        krk krkVar7 = this.l;
        krkVar7.getClass();
        ((ShapeableImageView) ((yn8) krkVar7).d.d).setVisibility((chatImage != null ? chatImage.getThumbnail() : null) != null ? 0 : 8);
        krk krkVar8 = this.l;
        krkVar8.getClass();
        TextView textView = (TextView) ((yn8) krkVar8).d.e;
        if ((chatImage != null ? chatImage.getThumbnail() : null) != null) {
            krk krkVar9 = this.l;
            krkVar9.getClass();
            ShapeableImageView shapeableImageView = (ShapeableImageView) ((yn8) krkVar9).d.d;
            String thumbnail = chatImage.getThumbnail();
            apf a = ajh.a(shapeableImageView.getContext());
            ht9 ht9Var = new ht9(shapeableImageView.getContext());
            ht9Var.c = thumbnail;
            vt9.f(ht9Var, shapeableImageView);
            Unit unit = Unit.a;
            a.a(ht9Var.a());
            if (str2.length() == 0) {
                str2 = requireContext().getString(R.string.chat_reply_photo);
                str2.getClass();
            }
            SpannableString spannableString = new SpannableString("*".concat(str2));
            Drawable drawable = requireContext().getDrawable(R.drawable.ic_image);
            if (drawable != null) {
                Context requireContext = requireContext();
                requireContext.getClass();
                int s = ao2.s(12, requireContext);
                Context requireContext2 = requireContext();
                requireContext2.getClass();
                drawable.setBounds(0, 0, s, ao2.s(12, requireContext2));
                spannableString.setSpan(Build.VERSION.SDK_INT >= 29 ? new ImageSpan(drawable, 2) : new ImageSpan(drawable), 0, 1, 0);
            }
            str2 = spannableString;
        }
        textView.setText(str2);
        krk krkVar10 = this.l;
        krkVar10.getClass();
        ((ImageView) ((yn8) krkVar10).d.c).setOnClickListener(new j1(this, i2));
    }

    public final void P() {
        Context requireContext = requireContext();
        requireContext.getClass();
        zic.N(requireContext, new g1(this, 6), null);
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public final krk k() {
        View inflate = getLayoutInflater().inflate(R.layout.fragment_chat, (ViewGroup) null, false);
        int i = R.id.chat_connecting_view;
        ChatConnectingView chatConnectingView = (ChatConnectingView) nq8.B(R.id.chat_connecting_view, inflate);
        if (chatConnectingView != null) {
            i = R.id.chat_flag_info;
            View B = nq8.B(R.id.chat_flag_info, inflate);
            if (B != null) {
                gh5 b = gh5.b(B);
                i = R.id.chat_reply;
                View B2 = nq8.B(R.id.chat_reply, inflate);
                if (B2 != null) {
                    e92 a = e92.a(B2);
                    i = R.id.chat_reply_frame;
                    FrameLayout frameLayout = (FrameLayout) nq8.B(R.id.chat_reply_frame, inflate);
                    if (frameLayout != null) {
                        i = R.id.chat_text_view;
                        ChatMessageInputView chatMessageInputView = (ChatMessageInputView) nq8.B(R.id.chat_text_view, inflate);
                        if (chatMessageInputView != null) {
                            i = R.id.container_pointer;
                            ImageView imageView = (ImageView) nq8.B(R.id.container_pointer, inflate);
                            if (imageView != null) {
                                i = R.id.empty_view;
                                GraphicLarge graphicLarge = (GraphicLarge) nq8.B(R.id.empty_view, inflate);
                                if (graphicLarge != null) {
                                    i = R.id.floating_label;
                                    FloatingIndicationLabelView floatingIndicationLabelView = (FloatingIndicationLabelView) nq8.B(R.id.floating_label, inflate);
                                    if (floatingIndicationLabelView != null) {
                                        i = R.id.mma_voting_recycler;
                                        RecyclerView recyclerView = (RecyclerView) nq8.B(R.id.mma_voting_recycler, inflate);
                                        if (recyclerView != null) {
                                            i = R.id.new_message_indicator;
                                            View B3 = nq8.B(R.id.new_message_indicator, inflate);
                                            if (B3 != null) {
                                                i = R.id.recycler_view_chat;
                                                ChatRecyclerView chatRecyclerView = (ChatRecyclerView) nq8.B(R.id.recycler_view_chat, inflate);
                                                if (chatRecyclerView != null) {
                                                    i = R.id.score_update_view;
                                                    ScoreUpdateView scoreUpdateView = (ScoreUpdateView) nq8.B(R.id.score_update_view, inflate);
                                                    if (scoreUpdateView != null) {
                                                        i = R.id.scroll_to_last_message_fab;
                                                        FloatingActionButton floatingActionButton = (FloatingActionButton) nq8.B(R.id.scroll_to_last_message_fab, inflate);
                                                        if (floatingActionButton != null) {
                                                            return new yn8((ConstraintLayout) inflate, chatConnectingView, b, a, frameLayout, chatMessageInputView, imageView, graphicLarge, floatingIndicationLabelView, recyclerView, B3, chatRecyclerView, scoreUpdateView, floatingActionButton);
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    }
                }
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i)));
        return null;
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        ((Handler) this.u.getValue()).removeCallbacks(this.v);
        s5d s5dVar = this.t;
        if (s5dVar == null) {
            Intrinsics.i("natsSocket");
            throw null;
        }
        ArrayList arrayList = s5dVar.c;
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            i1 i1Var = (i1) it.next();
            p4d p4dVar = s5dVar.e;
            if (p4dVar != null) {
                p4dVar.u.remove(i1Var);
            }
        }
        arrayList.clear();
        krk krkVar = this.l;
        krkVar.getClass();
        ((yn8) krkVar).l.removeOnScrollListener((q1) this.y.getValue());
        super.onDestroyView();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment, androidx.fragment.app.Fragment
    public void onResume() {
        super.onResume();
        krk krkVar = this.l;
        krkVar.getClass();
        ((ImageView) ((yn8) krkVar).f.d.h).setClickable(true);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ((yn8) krkVar2).f.n();
        gca G = G();
        ChatUser K = K();
        G.getClass();
        G.e = K;
        ArrayList arrayList = F().i;
        if (!getR().f || arrayList.isEmpty()) {
            return;
        }
        Object h0 = CollectionsKt.h0(arrayList);
        Message message = h0 instanceof Message ? (Message) h0 : null;
        if (message != null) {
            SharedPreferences.Editor edit = H().edit();
            edit.getClass();
            edit.putLong(getR().b, message.getTimestamp());
            edit.apply();
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStart() {
        super.onStart();
        us2 L = L();
        xw3.L(un0.z(L), null, null, new t3(L, getR().c, (rq3) null, 3), 3);
        krk krkVar = this.l;
        krkVar.getClass();
        ((yn8) krkVar).f.setUser(K());
        fhc F = F();
        ChatUser K = K();
        SharedPreferences sharedPreferences = F.p;
        F.t = K;
        yea yeaVar = j58.a;
        if (fn0.B("chat_translate_showDialog") || K.isAdmin()) {
            F.q = sharedPreferences.getString("LANGUAGE", null);
            F.r = sharedPreferences.getStringSet("EXCLUDED_LIST", new HashSet());
        }
    }

    @Override // androidx.fragment.app.Fragment
    public final void onStop() {
        krk krkVar = this.l;
        krkVar.getClass();
        ((yn8) krkVar).b.j();
        Context requireContext = requireContext();
        requireContext.getClass();
        tol.t(requireContext);
        super.onStop();
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public void s(View view, Bundle bundle) {
        this.L = (lq2) getActivity();
        Context requireContext = requireContext();
        getR().getClass();
        Drawable drawable = requireContext.getDrawable(R.drawable.chat);
        krk krkVar = this.l;
        krkVar.getClass();
        GraphicLarge graphicLarge = ((yn8) krkVar).h;
        String string = getString(getR().a);
        string.getClass();
        graphicLarge.setSubtitleResource(string);
        graphicLarge.setLargeDrawableResource(drawable);
        int i = 4;
        graphicLarge.setVisibility(4);
        krk krkVar2 = this.l;
        krkVar2.getClass();
        ChatMessageInputView chatMessageInputView = ((yn8) krkVar2).f;
        dr2 r = getR();
        us2 L = L();
        int i2 = 0;
        h1 h1Var = new h1(this, i2);
        int i3 = 1;
        g1 g1Var = new g1(this, i3);
        r.getClass();
        chatMessageInputView.l = r;
        chatMessageInputView.k = L;
        chatMessageInputView.m = g1Var;
        chatMessageInputView.w = r.g;
        chatMessageInputView.e = 360;
        js2 js2Var = chatMessageInputView.d;
        EditText editText = (EditText) js2Var.m;
        ImageView imageView = (ImageView) js2Var.e;
        editText.addTextChangedListener(chatMessageInputView);
        if (r.e) {
            editText.setRawInputType(147537);
        } else {
            editText.setRawInputType(147521);
        }
        editText.clearFocus();
        ImageView imageView2 = (ImageView) js2Var.c;
        ImageView imageView3 = (ImageView) js2Var.h;
        editText.setEnabled(false);
        imageView3.setEnabled(false);
        imageView2.setEnabled(false);
        imageView2.setOnClickListener(chatMessageInputView);
        ((ImageView) js2Var.b).setOnClickListener(chatMessageInputView);
        int i4 = 8;
        imageView.setVisibility(chatMessageInputView.w ? 0 : 8);
        z8e.a0(imageView, 1000L, new ix1(17, chatMessageInputView, h1Var));
        if (chatMessageInputView.f) {
            imageView.setImageDrawable(chatMessageInputView.getContext().getDrawable(R.drawable.ic_content_expand));
        }
        chatMessageInputView.j(imageView);
        imageView3.setVisibility(r.d ? 0 : 8);
        chatMessageInputView.j(imageView3);
        ((View) js2Var.l).setOnClickListener(chatMessageInputView);
        imageView3.setOnClickListener(chatMessageInputView);
        ((FrameLayout) js2Var.k).setOnClickListener(chatMessageInputView);
        ((ImageView) js2Var.g).setOnClickListener(chatMessageInputView);
        if (chatMessageInputView.w) {
            editText.setOnFocusChangeListener(new jr2(chatMessageInputView, i2));
            ((ImageView) js2Var.f).setOnClickListener(new s0(chatMessageInputView, 11));
        }
        int i5 = 6;
        imageView.post(new x(chatMessageInputView, i5));
        chatMessageInputView.setOnClickCallback(new h1(this, i3));
        krk krkVar3 = this.l;
        krkVar3.getClass();
        ChatRecyclerView chatRecyclerView = ((yn8) krkVar3).l;
        chatRecyclerView.setAdapter(F());
        chatRecyclerView.addOnScrollListener((q1) this.y.getValue());
        krk krkVar4 = this.l;
        krkVar4.getClass();
        ChatConnectingView chatConnectingView = ((yn8) krkVar4).b;
        chatConnectingView.f.postDelayed(new rq2(chatConnectingView, i2), 1000L);
        krk krkVar5 = this.l;
        krkVar5.getClass();
        int i6 = 2;
        ((yn8) krkVar5).b.setConnectCallback(new g1(this, i6));
        L().i.e(getViewLifecycleOwner(), new z1(0, new h1(this, 3)));
        L().g.e(getViewLifecycleOwner(), new z1(0, new h1(this, i)));
        int i7 = 5;
        L().B.e(getViewLifecycleOwner(), new z1(0, new h1(this, i7)));
        L().o.e(getViewLifecycleOwner(), new z1(0, new h1(this, i5)));
        int i8 = 7;
        L().k.e(getViewLifecycleOwner(), new z1(0, new h1(this, i8)));
        L().m.e(getViewLifecycleOwner(), new z1(0, new h1(this, i4)));
        z8e.v(this, D().r, new r1(this, null, i2));
        s5d s5dVar = this.t;
        if (s5dVar == null) {
            Intrinsics.i("natsSocket");
            throw null;
        }
        i1 i1Var = new i1(this, i2);
        s5dVar.c.add(i1Var);
        p4d p4dVar = s5dVar.e;
        if (p4dVar != null) {
            p4dVar.u.add(i1Var);
            i1Var.a(p4dVar, s5dVar.d);
        }
        s5d s5dVar2 = this.t;
        if (s5dVar2 == null) {
            Intrinsics.i("natsSocket");
            throw null;
        }
        u6b viewLifecycleOwner = getViewLifecycleOwner();
        viewLifecycleOwner.getClass();
        e6b e6bVar = e6b.a;
        xw3.L(wca.x(viewLifecycleOwner.getLifecycle()), null, null, new va8(s5dVar2, dmi.q("chatmessage.", L().F), viewLifecycleOwner, new h1(this, i6), (rq3) null), 3);
        krk krkVar6 = this.l;
        krkVar6.getClass();
        ((yn8) krkVar6).n.setOnClickListener(new j1(this, i2));
        fhc F = F();
        kr1 kr1Var = new kr1(this, i8);
        F.getClass();
        F.a.d = kr1Var;
        if (!H().getBoolean("SHOW_REDESIGNED_CHAT_LAYOUT", false) || !getR().g) {
            eca ecaVar = (eca) this.z.getValue();
            krk krkVar7 = this.l;
            krkVar7.getClass();
            ecaVar.f(((yn8) krkVar7).l);
        }
        fhc F2 = F();
        ehc[] ehcVarArr = ehc.a;
        krk krkVar8 = this.l;
        krkVar8.getClass();
        ChatRecyclerView chatRecyclerView2 = ((yn8) krkVar8).l;
        F2.getClass();
        this.w = new sj4(F2, i7, chatRecyclerView2, i2);
        krk krkVar9 = this.l;
        krkVar9.getClass();
        ChatRecyclerView chatRecyclerView3 = ((yn8) krkVar9).l;
        sj4 sj4Var = this.w;
        if (sj4Var != null) {
            chatRecyclerView3.addItemDecoration(sj4Var);
        } else {
            Intrinsics.i("stickyHeaderDecoration");
            throw null;
        }
    }

    @Override // com.sofascore.results.mvvm.base.AbstractFragment
    public void u() {
    }
}
