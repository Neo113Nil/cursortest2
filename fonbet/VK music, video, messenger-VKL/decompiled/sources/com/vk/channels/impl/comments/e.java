package com.vk.channels.impl.comments;

import android.content.Context;
import android.os.Handler;
import android.os.Looper;
import android.text.SpannableStringBuilder;
import android.text.style.ForegroundColorSpan;
import android.util.Size;
import android.view.View;
import android.view.ViewGroup;
import android.widget.TextView;
import androidx.recyclerview.widget.RecyclerView;
import com.vk.channels.api.CommentsHistory;
import com.vk.channels.impl.comments.a;
import com.vk.channels.impl.comments.e;
import com.vk.channels.impl.comments.f;
import com.vk.channels.impl.comments.g;
import com.vk.core.sticky_header.StickyHeadersLinearLayoutManager;
import com.vk.core.ui.refresh.BottomSwipeRefreshLayout;
import com.vk.dto.common.id.UserId;
import com.vk.im.mvicomponent.MviComponentFragment;
import com.vk.im.popup.Popup;
import com.vk.im.ui.views.RichEditText;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.io.IOException;
import java.util.Iterator;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a4j;
import xsna.ao50;
import xsna.bpn0;
import xsna.cn70;
import xsna.dhr0;
import xsna.drm0;
import xsna.dv2;
import xsna.e3m;
import xsna.e43;
import xsna.enj;
import xsna.epx;
import xsna.f1y0;
import xsna.f4m;
import xsna.fi6;
import xsna.hfp;
import xsna.hfz;
import xsna.htz;
import xsna.ikv0;
import xsna.iro0;
import xsna.iut0;
import xsna.jro0;
import xsna.lag;
import xsna.lwb0;
import xsna.m7;
import xsna.mhy;
import xsna.msy;
import xsna.n060;
import xsna.ner0;
import xsna.p060;
import xsna.p7;
import xsna.peg;
import xsna.qeg;
import xsna.qwa;
import xsna.reg;
import xsna.s1y0;
import xsna.tpz;
import xsna.ubg;
import xsna.usz;
import xsna.vk9;
import xsna.wag;
import xsna.wdg;
import xsna.xag;
import xsna.ya;
import xsna.yag;
import xsna.yn50;
import xsna.z3j;
import xsna.zag;
import xsna.zk70;

/* compiled from: ChannelCommentsViewController.kt */
/* loaded from: classes16.dex */
public final class e extends fi6<g, com.vk.channels.impl.comments.a> {
    public final MviComponentFragment f;
    public final Handler g;
    public final Context h;
    public ner0 i;
    public final com.vk.im.popup.b j;
    public b k;
    public wdg l;
    public ikv0 m;
    public final Object n;

    /* compiled from: ChannelCommentsViewController.kt */
    public final class a implements jro0.a, ubg.a, a4j.a, qeg.a, zag.a, p060.a {
        public a() {
        }

        @Override // xsna.ubg.a
        public final void a(int i) {
            e.this.O(new a.n(i));
        }

        @Override // xsna.ubg.a
        public final void b(int i) {
            e.this.O(new a.e(i));
        }

        @Override // xsna.ubg.a
        public final void c(UserId userId) {
            e.this.O(new a.C0531a(userId));
        }

        @Override // xsna.ubg.a
        public final void d(int i) {
            e.this.O(new a.g(i));
        }

        @Override // xsna.ubg.a
        public final void e(int i) {
            e.this.O(new a.o(i));
        }

        @Override // xsna.zag.a
        public final void f(int i) {
            e.this.O(new a.p(i));
        }

        @Override // xsna.qeg.a
        public final void g(CommentsHistory.Order order) {
            e.this.O(new a.i(order));
        }

        @Override // xsna.p060.a
        public final void h() {
            e.this.O(a.l.b);
        }

        @Override // xsna.ubg.a
        public final void i(UserId userId) {
            e.this.O(new a.b(userId));
        }

        @Override // xsna.jro0.a
        public final void j(int i) {
            e.this.O(new a.q(i));
        }

        @Override // xsna.a4j.a
        public final void k() {
            e.this.O(a.j.b);
        }
    }

    /* compiled from: ChannelCommentsViewController.kt */
    public static final class b {
        public final BottomSwipeRefreshLayout a;
        public final RecyclerView b;
        public final WriteBar c;
        public final ViewGroup d;

        public b(View view) {
            this.a = (BottomSwipeRefreshLayout) view.findViewById(R.id.im_comments_swipe_refresh_layout);
            this.b = (RecyclerView) view.findViewById(R.id.im_comments_list);
            this.c = (WriteBar) view.findViewById(R.id.im_comments_write_bar);
            this.d = (ViewGroup) view.findViewById(R.id.im_comments_snackbar_container);
        }
    }

    /* compiled from: ChannelCommentsViewController.kt */
    public final class c implements s1y0 {
        public c() {
        }

        /* JADX WARN: Type inference failed for: r1v0, types: [java.lang.Object, kotlin.Lazy] */
        @Override // xsna.s1y0
        public final void a(f1y0 f1y0Var) {
            e eVar = e.this;
            ?? r1 = eVar.n;
            if (drm0.N(((h) r1.getValue()).a())) {
                return;
            }
            eVar.O(new a.h(((h) r1.getValue()).a(), f1y0Var.b));
        }

        @Override // xsna.s1y0
        public final void b(f1y0 f1y0Var) {
            a(f1y0Var);
        }

        @Override // xsna.s1y0
        public final boolean c() {
            return false;
        }
    }

    public e(ChannelCommentsFragment channelCommentsFragment) {
        super(R.layout.im_channel_comments, null);
        this.f = channelCommentsFragment;
        this.g = new Handler(Looper.getMainLooper());
        Context requireContext = channelCommentsFragment.requireContext();
        this.h = requireContext;
        this.j = new com.vk.im.popup.b(requireContext);
        this.n = msy.a(LazyThreadSafetyMode.NONE, new com.vk.movika.sdk.base.logic.processor.actions.g(this, 11));
    }

    @Override // xsna.fi6
    public final void Q(View view) {
        b bVar = new b(view);
        StickyHeadersLinearLayoutManager stickyHeadersLinearLayoutManager = new StickyHeadersLinearLayoutManager(this.f);
        RecyclerView recyclerView = bVar.b;
        recyclerView.setLayoutManager(stickyHeadersLinearLayoutManager);
        a aVar = new a();
        wdg wdgVar = new wdg();
        wdgVar.y0(new usz());
        wdgVar.y0(new hfp());
        wdgVar.y0(new peg(aVar));
        wdgVar.y0(new lag(aVar));
        wdgVar.y0(new iro0(aVar));
        wdgVar.y0(new htz());
        wdgVar.y0(new yag(aVar));
        wdgVar.y0(new z3j(aVar));
        wdgVar.y0(new n060(aVar));
        this.l = wdgVar;
        recyclerView.setAdapter(wdgVar);
        wdg wdgVar2 = this.l;
        if (wdgVar2 == null) {
            wdgVar2 = null;
        }
        recyclerView.addOnScrollListener(new tpz(wdgVar2, new com.vk.movika.sdk.base.logic.processor.actions.h(this, 13)));
        bVar.a.setOnRefreshListener(new p7(this, 11));
        WriteBar writeBar = bVar.c;
        writeBar.setAudioMsgRecordingAllowed(false);
        writeBar.setVideoMsgRecordingAllowed(false);
        writeBar.setEmojiAllowed(false);
        writeBar.setPollAllowed(true);
        writeBar.setPlaceholderHint(R.string.vkim_channel_comments_writebar_placeholder_hint);
        Context context = writeBar.getContext();
        bpn0 bpn0Var = enj.a;
        writeBar.S(e3m.h(context), null);
        writeBar.setWriteBarSendListener(new c());
        f4m.j(writeBar.findViewById(R.id.writebar_left_button_container));
        f4m.s(cn70.b(12), writeBar.findViewById(R.id.writebar_text_area));
        RichEditText richEditText = (RichEditText) writeBar.findViewById(R.id.writebar_edit);
        iut0.s(richEditText, new String[]{"image/*"}, new qwa());
        richEditText.setPrivateImeOptions(richEditText.getPrivateImeOptions() + ";disableSticker=true;disableGifKeyboard=true");
        this.k = bVar;
    }

    public final ikv0.a R(String str) {
        ikv0.a aVar = new ikv0.a(this.h);
        aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_error_circle_outline_24, Integer.valueOf(R.attr.vk_ui_icon_negative), (Size) null, 12);
        aVar.u = new ikv0.d(new ikv0.d.c(str), (ikv0.d.b) null, (ikv0.d.a) null, 6);
        aVar.o = Integer.valueOf(cn70.b(8));
        return aVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:58:0x00dd, code lost:
    
        if (r2 != (-1)) goto L67;
     */
    /* JADX WARN: Code restructure failed: missing block: B:59:0x00df, code lost:
    
        r1 = null;
     */
    /* JADX WARN: Code restructure failed: missing block: B:60:0x00e5, code lost:
    
        if (r1 == null) goto L86;
     */
    /* JADX WARN: Code restructure failed: missing block: B:61:0x00e7, code lost:
    
        r1 = r1.intValue();
        r2 = r22.k;
     */
    /* JADX WARN: Code restructure failed: missing block: B:62:0x00ed, code lost:
    
        if (r2 != null) goto L72;
     */
    /* JADX WARN: Code restructure failed: missing block: B:63:0x00f0, code lost:
    
        r3 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f1, code lost:
    
        r3.b.scrollToPosition(r1);
     */
    /* JADX WARN: Code restructure failed: missing block: B:65:0x00f6, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:66:?, code lost:
    
        return;
     */
    /* JADX WARN: Code restructure failed: missing block: B:67:0x00e1, code lost:
    
        r1 = java.lang.Integer.valueOf(r2);
     */
    @Override // xsna.ei6, xsna.wn50
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(yn50 yn50Var) {
        if (yn50Var instanceof f.i) {
            ikv0.a R = R(zk70.b(((f.i) yn50Var).a));
            b bVar = this.k;
            R.o((bVar != null ? bVar : null).d);
            return;
        }
        if (yn50Var instanceof f.h) {
            if (this.m != null) {
                return;
            }
            ikv0.a R2 = R(zk70.b(new IOException()));
            R2.h = new m7(this, 21);
            R2.e = -1L;
            b bVar2 = this.k;
            this.m = R2.o((bVar2 != null ? bVar2 : null).d);
            return;
        }
        if (yn50Var instanceof f.c) {
            ikv0 ikv0Var = this.m;
            if (ikv0Var != null) {
                ikv0Var.a();
            }
            this.m = null;
            return;
        }
        if (yn50Var.equals(f.a.a)) {
            b bVar3 = this.k;
            WriteBar writeBar = (bVar3 != null ? bVar3 : null).c;
            writeBar.F();
            writeBar.setText("");
            return;
        }
        if (yn50Var.equals(f.b.a)) {
            b bVar4 = this.k;
            (bVar4 != null ? bVar4 : null).c.B();
            return;
        }
        if (yn50Var instanceof f.e) {
            final int i = ((f.e) yn50Var).a;
            this.g.postDelayed(new Runnable() { // from class: xsna.pwa
                @Override // java.lang.Runnable
                public final void run() {
                    com.vk.channels.impl.comments.e eVar = com.vk.channels.impl.comments.e.this;
                    wdg wdgVar = eVar.l;
                    if (wdgVar == null) {
                        wdgVar = null;
                    }
                    Integer g = i7o0.g(wdgVar.h, new owa(i, 0));
                    if (g != null) {
                        int intValue = g.intValue();
                        e.b bVar5 = eVar.k;
                        (bVar5 != null ? bVar5 : null).b.smoothScrollToPosition(intValue);
                    }
                }
            }, 1, 300L);
            return;
        }
        if (!yn50Var.equals(f.C0533f.a)) {
            if (yn50Var instanceof f.d) {
                mhy.b(this.h);
                return;
            } else {
                if (yn50Var instanceof f.g) {
                    f.g gVar = (f.g) yn50Var;
                    this.j.c(new xag(e43.l(new lwb0(null, R.string.vkim_channel_comments_reply, null, null, R.drawable.vk_icon_reply_outline_28, wag.e.a, false, null, false, false, 1933), new lwb0(null, R.string.vkim_channel_comments_edit, null, null, R.drawable.vk_icon_edit_outline_28, wag.c.a, false, null, false, false, 1933), new lwb0(null, R.string.vkim_channel_comments_add_reaction, null, null, R.drawable.vk_icon_like_outline_28, wag.a.a, false, null, false, false, 1933), new lwb0(null, R.string.vkim_channel_comments_remove_reaction, null, null, R.drawable.vk_icon_like_outline_28, wag.d.a, false, null, false, false, 1933), new lwb0(null, R.string.vkim_channels_profile_complain, null, null, R.drawable.vk_icon_report_outline_28, wag.f.a, true, null, false, false, 1933), new lwb0(null, R.string.vkim_channel_comments_delete_comment, null, null, R.drawable.vk_icon_delete_outline_28, wag.b.a, true, null, false, false, 1933)), gVar.b, Popup.g.b.a, 2431), new ya(7, this, gVar), new dv2(2));
                    return;
                }
                return;
            }
        }
        wdg wdgVar = this.l;
        if (wdgVar == null) {
            wdgVar = null;
        }
        Iterator<T> it = wdgVar.h.iterator();
        int i2 = 0;
        while (true) {
            if (!it.hasNext()) {
                i2 = -1;
                break;
            }
            Object next = it.next();
            if (i2 < 0) {
                e43.t();
                throw null;
            }
            if (((hfz) next) instanceof reg) {
                break;
            } else {
                i2++;
            }
        }
    }

    /* JADX WARN: Type inference failed for: r1v6, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v5, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.wn50
    public final void l(ao50 ao50Var) {
        g gVar = (g) ao50Var;
        g.b bVar = gVar.c;
        g.a aVar = gVar.b;
        wdg wdgVar = this.l;
        if (wdgVar == null) {
            wdgVar = null;
        }
        wdgVar.setItems(gVar.a);
        if (aVar == null) {
            b bVar2 = this.k;
            if (bVar2 == null) {
                bVar2 = null;
            }
            bVar2.a.setEnabled(false);
        } else {
            b bVar3 = this.k;
            if (bVar3 == null) {
                bVar3 = null;
            }
            bVar3.a.setEnabled(true);
            b bVar4 = this.k;
            if (bVar4 == null) {
                bVar4 = null;
            }
            bVar4.a.setRefreshing(aVar.a);
        }
        if (bVar == null) {
            b bVar5 = this.k;
            if (bVar5 == null) {
                bVar5 = null;
            }
            f4m.j(bVar5.c);
        } else {
            b bVar6 = this.k;
            if (bVar6 == null) {
                bVar6 = null;
            }
            bVar6.c.setVisibility(0);
        }
        h hVar = (h) this.n.getValue();
        WriteBar writeBar = hVar.a;
        WriteBar writeBar2 = hVar.a;
        if (!epx.f(bVar, hVar.f)) {
            g.b bVar7 = hVar.f;
            hVar.f = bVar;
            writeBar.setVisibility(bVar != null ? 0 : 8);
            if (bVar != null) {
                g.b.a aVar2 = bVar.a;
                if (aVar2 instanceof g.b.a.C0534a) {
                    writeBar.W();
                    hVar.b().setVisibility(8);
                    writeBar.setText(((g.b.a.C0534a) aVar2).b);
                } else if (epx.f(aVar2, g.b.a.C0535b.a)) {
                    if ((bVar7 != null ? bVar7.a : null) instanceof g.b.a.C0534a) {
                        writeBar2.setText("");
                    }
                    writeBar.Z();
                    hVar.b().setVisibility(8);
                    if ((bVar7 != null ? bVar7.a : null) instanceof g.b.a.c) {
                        hVar.c(null);
                    }
                } else {
                    if (!(aVar2 instanceof g.b.a.c)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    if ((bVar7 != null ? bVar7.a : null) instanceof g.b.a.C0534a) {
                        writeBar2.setText("");
                    }
                    writeBar.Z();
                    if (hVar.b().getParent() == null) {
                        writeBar.M(hVar.b());
                    }
                    hVar.b().setVisibility(0);
                    g.b.a.c cVar = (g.b.a.c) aVar2;
                    String string = hVar.c.getString(R.string.vkim_channel_comments_reply_to, cVar.b);
                    int K = drm0.K(0, 6, string, cVar.b, false);
                    SpannableStringBuilder spannableStringBuilder = new SpannableStringBuilder(string);
                    spannableStringBuilder.setSpan(new ForegroundColorSpan(dhr0.t.c(R.attr.vk_ui_text_link)), K, spannableStringBuilder.length(), 0);
                    ((TextView) hVar.e.getValue()).setText(spannableStringBuilder);
                    hVar.c(cVar);
                }
                writeBar.getInput().setSelection(writeBar.getText().length());
            }
        }
        boolean z = gVar.d;
        Handler handler = this.g;
        if (z) {
            handler.postDelayed(new vk9(this, 1), 2, 400L);
            return;
        }
        handler.removeCallbacksAndMessages(2);
        ner0 ner0Var = this.i;
        if (ner0Var != null) {
            ner0Var.dismiss();
        }
    }

    @Override // xsna.fi6, xsna.wn50
    public final void onDestroyView() {
        ner0 ner0Var = this.i;
        if (ner0Var != null) {
            ner0Var.dismiss();
        }
        this.j.dismiss();
        this.g.removeCallbacksAndMessages(null);
        super.onDestroyView();
    }
}
