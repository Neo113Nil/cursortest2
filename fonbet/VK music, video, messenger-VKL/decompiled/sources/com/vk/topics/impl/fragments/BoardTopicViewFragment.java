package com.vk.topics.impl.fragments;

import android.content.BroadcastReceiver;
import android.content.ClipboardManager;
import android.content.Context;
import android.content.DialogInterface;
import android.content.Intent;
import android.content.IntentFilter;
import android.content.res.Resources;
import android.graphics.drawable.ColorDrawable;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.Parcelable;
import android.text.TextUtils;
import android.view.GestureDetector;
import android.view.KeyEvent;
import android.view.LayoutInflater;
import android.view.MenuItem;
import android.view.MotionEvent;
import android.view.View;
import android.view.ViewGroup;
import android.widget.EditText;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.PopupMenu;
import android.widget.RelativeLayout;
import android.widget.TextView;
import androidx.fragment.app.FragmentActivity;
import androidx.recyclerview.widget.LinearLayoutManager;
import androidx.recyclerview.widget.RecyclerView;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.comments.core.BoardComment;
import com.vk.core.view.components.topbar.VkTopBar;
import com.vk.dto.common.Attachment;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.stickers.StickerItem;
import com.vk.dto.stickers.popup.PopupStickerAnimation;
import com.vk.newsfeed.api.data.TypeReply;
import com.vk.stat.scheme.MobileOfficialAppsCoreNavStat$EventScreen;
import com.vk.stat.scheme.t0;
import com.vk.stickers.keyboard.StickersView;
import com.vk.stickers.keyboard.b;
import com.vk.stickers.popup.PopupStickerView;
import com.vk.topics.impl.api.BoardGetComments;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.topics.impl.view.PaginationView;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import com.vkontakte.android.attachments.PollAttachment;
import com.vkontakte.android.attachments.StickerAttachment;
import com.vkontakte.android.attachments.VideoAttachment;
import java.lang.ref.WeakReference;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.WeakHashMap;
import java.util.function.Function;
import java.util.regex.Pattern;
import java.util.stream.Collectors;
import java.util.stream.Stream;
import kotlin.LazyThreadSafetyMode;
import kotlin.collections.EmptyList;
import kotlin.text.Regex;
import me.grishka.appkit.fragments.VKToolbarFragment;
import me.grishka.appkit.views.UsableRecyclerView;
import ru.ok.android.webrtc.signaling.api.SignalingProtocol;
import xsna.a0a;
import xsna.a920;
import xsna.aa;
import xsna.anj;
import xsna.av20;
import xsna.awt0;
import xsna.b25;
import xsna.bj7;
import xsna.brm0;
import xsna.cb;
import xsna.cbg;
import xsna.cj7;
import xsna.cvk;
import xsna.dhr0;
import xsna.e4;
import xsna.e43;
import xsna.epx;
import xsna.f1y0;
import xsna.fkq0;
import xsna.fnj;
import xsna.fvr;
import xsna.g3f0;
import xsna.gko;
import xsna.gqb0;
import xsna.gs2;
import xsna.gzs;
import xsna.h7u0;
import xsna.hf8;
import xsna.hi7;
import xsna.his0;
import xsna.hx2;
import xsna.iag;
import xsna.iah0;
import xsna.ies;
import xsna.izs;
import xsna.j5g;
import xsna.j6r0;
import xsna.jno0;
import xsna.jpj0;
import xsna.jx2;
import xsna.l420;
import xsna.m3a;
import xsna.mhy;
import xsna.mi7;
import xsna.mrz;
import xsna.msy;
import xsna.n6j;
import xsna.ner0;
import xsna.o4l0;
import xsna.ol;
import xsna.om3;
import xsna.oq;
import xsna.oz50;
import xsna.p0e0;
import xsna.pi7;
import xsna.q420;
import xsna.qt;
import xsna.rdg;
import xsna.s1y0;
import xsna.s3q0;
import xsna.sdg;
import xsna.seg;
import xsna.sh7;
import xsna.tdg;
import xsna.tfw;
import xsna.tlo0;
import xsna.tq;
import xsna.u1u0;
import xsna.utj;
import xsna.vh7;
import xsna.wh7;
import xsna.wi7;
import xsna.wmg;
import xsna.wn4;
import xsna.x50;
import xsna.xgy;
import xsna.xi7;
import xsna.yfb;
import xsna.yh7;
import xsna.yrn;
import xsna.z1y0;
import xsna.z23;
import xsna.z2f0;

/* compiled from: BoardTopicViewFragment.kt */
/* loaded from: classes6.dex */
public final class BoardTopicViewFragment extends VKToolbarFragment implements PaginationView.a, tdg, ies {
    public static final Pattern H0 = Pattern.compile("(^|\\s)@[\\p{L}\\p{N}_.-]+");
    public static WeakReference<androidx.appcompat.app.d> I0;
    public boolean A0;
    public boolean B0;
    public int C0;
    public boolean D0;
    public q420 E0;
    public final GestureDetector F0;
    public final BoardTopicViewFragment$receiver$1 G0;
    public final LinkedHashSet b0 = new LinkedHashSet();
    public final g c0 = new g();
    public final av20<mi7> d0;
    public final m3a e0;
    public final Object f0;
    public final Object g0;
    public final Object h0;
    public final om3 i0;
    public RelativeLayout j0;
    public WriteBar k0;
    public PaginationView l0;
    public PopupStickerView m0;
    public VkTopBar n0;
    public final b o0;
    public final c p0;
    public LinearLayoutManager q0;
    public yh7 r0;
    public xgy s0;
    public StickersView t0;
    public View u0;
    public View v0;
    public int w0;
    public int x0;
    public UserId y0;
    public String z0;

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class a extends oz50 {
        public a(int i, UserId userId, String str) {
            super(BoardTopicViewFragment.class, null, null);
            this.j.putInt("id", i);
            this.j.putParcelable("group_id", userId);
            this.j.putString("title", str);
        }

        public final void A(int i, boolean z) {
            Bundle bundle = this.j;
            bundle.putBoolean("show_last_comment", z);
            bundle.putInt("comments_count", i);
        }

        public final void y(boolean z) {
            this.j.putBoolean("is_admin", z);
        }

        public final void z(boolean z) {
            this.j.putBoolean("is_closed", z);
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public final class b extends UsableRecyclerView.c<UsableRecyclerView.x> {
        public final g3f0 c;
        public List<? extends cbg> d = EmptyList.b;
        public final ArrayList<WeakReference<UsableRecyclerView.x>> e = new ArrayList<>(50);

        public b(g3f0 g3f0Var) {
            this.c = g3f0Var;
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final String B(int i, int i2) {
            if (i < 0 || i >= this.d.size()) {
                return "";
            }
            if (i2 == 0) {
                return ((BoardComment) this.d.get(i).a).i;
            }
            Iterator<Attachment> it = ((BoardComment) this.d.get(i).a).f.iterator();
            int i3 = 0;
            while (it.hasNext()) {
                Parcelable parcelable = (Attachment) it.next();
                if ((parcelable instanceof tfw) && (i3 = i3 + 1) == i2) {
                    return ((tfw) parcelable).h9();
                }
            }
            return "";
        }

        @Override // me.grishka.appkit.views.UsableRecyclerView.c, xsna.zzc0
        public final int G(int i) {
            if (i < 0 || i >= this.d.size()) {
                return 0;
            }
            Iterator<Attachment> it = ((BoardComment) this.d.get(i).a).f.iterator();
            int i2 = 1;
            while (it.hasNext()) {
                if (it.next() instanceof tfw) {
                    i2++;
                }
            }
            return i2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            int size = this.d.size();
            int i = 0;
            if (!this.d.isEmpty()) {
                yh7 yh7Var = BoardTopicViewFragment.this.r0;
                if (!(yh7Var != null ? yh7Var.h : false)) {
                    i = 1;
                }
            }
            return i + size;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            boolean z;
            if (!this.d.isEmpty()) {
                yh7 yh7Var = BoardTopicViewFragment.this.r0;
                if (!(yh7Var != null ? yh7Var.h : false)) {
                    z = true;
                    return (z || i != getItemCount() - 1) ? 0 : 1;
                }
            }
            z = false;
            if (z) {
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(RecyclerView.e0 e0Var, int i) {
            Object obj = (UsableRecyclerView.x) e0Var;
            if (obj instanceof seg) {
                ((seg) obj).Q4(BoardTopicViewFragment.this.e0);
            }
            if (i >= this.d.size() || i < 0 || !(obj instanceof aa)) {
                return;
            }
            ((aa) obj).q6(this.d.get(i));
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final RecyclerView.e0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            if (i == 1) {
                return new mrz(viewGroup, R.layout.apps_loader, 0);
            }
            g3f0 g3f0Var = this.c;
            sdg sdgVar = new sdg(viewGroup, BoardTopicViewFragment.this, g3f0Var, null);
            sdgVar.P3(!r2.D0);
            this.e.add(new WeakReference<>(sdgVar));
            return sdgVar;
        }

        public final void x0(ArrayList arrayList, boolean z) {
            Stream stream = arrayList.stream();
            final qt qtVar = new qt(9);
            this.d = (List) stream.map(new Function() { // from class: xsna.vi7
                @Override // java.util.function.Function
                public final Object apply(Object obj) {
                    return (cbg) qt.this.invoke(obj);
                }
            }).collect(Collectors.toList());
            if (z) {
                notifyDataSetChanged();
            }
        }

        public final void y0() {
            Iterator<WeakReference<UsableRecyclerView.x>> it = this.e.iterator();
            while (it.hasNext()) {
                UsableRecyclerView.x xVar = it.next().get();
                if (xVar instanceof aa) {
                    ((aa) xVar).t6();
                }
            }
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class c extends RecyclerView.Adapter<gqb0> {
        public PollAttachment c;

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemCount() {
            return this.c == null ? 0 : 1;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final int getItemViewType(int i) {
            return 2;
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final void onBindViewHolder(gqb0 gqb0Var, int i) {
            gqb0 gqb0Var2 = gqb0Var;
            PollAttachment pollAttachment = this.c;
            if (pollAttachment != null) {
                gqb0Var2.R6(pollAttachment);
            }
        }

        @Override // androidx.recyclerview.widget.RecyclerView.Adapter
        public final gqb0 onCreateViewHolder(ViewGroup viewGroup, int i) {
            return new gqb0(viewGroup, t0.a(MobileOfficialAppsCoreNavStat$EventScreen.BOARD));
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class d implements hx2<BoardGetComments.b> {
        public final /* synthetic */ izs<BoardComment, s3q0> b;
        public final /* synthetic */ gzs<s3q0> c;
        public final /* synthetic */ int d;

        public d(int i, gzs gzsVar, izs izsVar) {
            this.b = izsVar;
            this.c = gzsVar;
            this.d = i;
        }

        @Override // xsna.hx2
        public final void b(BoardGetComments.b bVar) {
            BoardComment boardComment;
            Iterator<BoardComment> it = bVar.a.iterator();
            while (true) {
                if (!it.hasNext()) {
                    boardComment = null;
                    break;
                } else {
                    boardComment = it.next();
                    if (boardComment.b == this.d) {
                        break;
                    }
                }
            }
            BoardComment boardComment2 = boardComment;
            if (boardComment2 != null) {
                this.b.invoke(boardComment2);
            } else {
                this.c.invoke();
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            this.c.invoke();
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class e extends GestureDetector.SimpleOnGestureListener {
        public e() {
        }

        @Override // android.view.GestureDetector.SimpleOnGestureListener, android.view.GestureDetector.OnGestureListener
        public final boolean onSingleTapUp(MotionEvent motionEvent) {
            BoardTopicViewFragment boardTopicViewFragment = BoardTopicViewFragment.this;
            if (boardTopicViewFragment.C0 <= 0) {
                return true;
            }
            boardTopicViewFragment.vo();
            return true;
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class f implements hx2<wh7.a> {
        public final /* synthetic */ iag b;
        public final /* synthetic */ BoardTopicViewFragment c;

        public f(iag iagVar, BoardTopicViewFragment boardTopicViewFragment) {
            this.b = iagVar;
            this.c = boardTopicViewFragment;
        }

        @Override // xsna.hx2
        public final void b(wh7.a aVar) {
            wh7.a aVar2 = aVar;
            if (aVar2 != null) {
                boolean z = aVar2.a;
                iag iagVar = this.b;
                iagVar.f0(z);
                iagVar.f(aVar2.b);
                this.c.o0.notifyDataSetChanged();
            }
        }

        @Override // xsna.hx2
        public final void e(VKApiExecutionException vKApiExecutionException) {
            cvk.u(R.string.error, false);
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class g extends StickersView.c {
        public g() {
        }

        @Override // com.vk.stickers.keyboard.StickersView.c, xsna.sdp
        public final void b(String str) {
            WriteBar writeBar = BoardTopicViewFragment.this.k0;
            if (writeBar == null) {
                return;
            }
            EditText editText = (EditText) writeBar.findViewById(R.id.writebar_edit);
            int selectionEnd = editText.getSelectionEnd();
            editText.getText().insert(selectionEnd, str);
            int length = str.length() + selectionEnd;
            editText.setSelection(length, length);
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final Long d() {
            Pattern pattern = BoardTopicViewFragment.H0;
            return Long.valueOf(BoardTopicViewFragment.this.ro().b);
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final boolean i() {
            WriteBar writeBar = BoardTopicViewFragment.this.k0;
            return his0.s(writeBar != null ? (EditText) writeBar.findViewById(R.id.writebar_edit) : null);
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void j() {
            View findViewById;
            WriteBar writeBar = BoardTopicViewFragment.this.k0;
            if (writeBar == null || (findViewById = writeBar.findViewById(R.id.writebar_edit)) == null) {
                return;
            }
            findViewById.dispatchKeyEvent(new KeyEvent(0, 67));
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void n(int i) {
            BoardTopicViewFragment boardTopicViewFragment = BoardTopicViewFragment.this;
            xgy xgyVar = boardTopicViewFragment.s0;
            if (xgyVar != null) {
                int i2 = xgy.F;
                xgyVar.h(null);
            }
            StickersView stickersView = boardTopicViewFragment.t0;
            if (stickersView != null) {
                stickersView.g(i);
            }
        }

        @Override // com.vk.stickers.keyboard.StickersView.c
        public final void p(StickerItem stickerItem, int i, String str) {
            StickerAttachment stickerAttachment = new StickerAttachment(stickerItem, i, str);
            Pattern pattern = BoardTopicViewFragment.H0;
            List<? extends Attachment> singletonList = Collections.singletonList(stickerAttachment);
            BoardTopicViewFragment boardTopicViewFragment = BoardTopicViewFragment.this;
            boardTopicViewFragment.Co("", singletonList, false, false);
            StickerAttachment.a aVar = StickerAttachment.k;
            int i2 = stickerItem.b;
            aVar.getClass();
            StickerAttachment.m = i2;
            WriteBar writeBar = boardTopicViewFragment.k0;
            if (writeBar != null) {
                writeBar.t();
            }
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class h implements av20.b<mi7> {
        public h() {
        }

        @Override // xsna.av20.b
        public final void a(View view, Object obj, int i, wmg wmgVar) {
            ((mi7) obj).getClass();
            BoardTopicViewFragment boardTopicViewFragment = BoardTopicViewFragment.this;
            Pattern pattern = BoardTopicViewFragment.H0;
            FragmentActivity activity = boardTopicViewFragment.getActivity();
            Object systemService = activity != null ? activity.getSystemService("clipboard") : null;
            ClipboardManager clipboardManager = systemService instanceof ClipboardManager ? (ClipboardManager) systemService : null;
            if (clipboardManager != null) {
                clipboardManager.setText("https://" + a0a.d + "/topic" + (-boardTopicViewFragment.ro().b) + '_' + boardTopicViewFragment.so());
            }
            cvk.u(R.string.link_copied, false);
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class i extends RecyclerView.y {
        public i() {
        }

        @Override // androidx.recyclerview.widget.RecyclerView.s
        public final boolean j(RecyclerView recyclerView, MotionEvent motionEvent) {
            View findChildViewUnder = recyclerView.findChildViewUnder(motionEvent.getX(), motionEvent.getY());
            return findChildViewUnder != null && findChildViewUnder.getAlpha() < 1.0f && BoardTopicViewFragment.this.F0.onTouchEvent(motionEvent);
        }
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class j implements s1y0 {
        public final /* synthetic */ WriteBar b;
        public final /* synthetic */ BoardTopicViewFragment c;

        public j(BoardTopicViewFragment boardTopicViewFragment, WriteBar writeBar) {
            this.b = writeBar;
            this.c = boardTopicViewFragment;
        }

        @Override // xsna.s1y0
        public final void a(f1y0 f1y0Var) {
            boolean e = this.b.e();
            BoardTopicViewFragment boardTopicViewFragment = this.c;
            if (e) {
                Pattern pattern = BoardTopicViewFragment.H0;
                boardTopicViewFragment.Fo();
            } else {
                Pattern pattern2 = BoardTopicViewFragment.H0;
                boardTopicViewFragment.Bo();
            }
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

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class l {
        public final /* synthetic */ iag a;
        public final /* synthetic */ BoardTopicViewFragment b;
        public final /* synthetic */ FragmentActivity c;

        public l(iag iagVar, BoardTopicViewFragment boardTopicViewFragment, FragmentActivity fragmentActivity) {
            this.a = iagVar;
            this.b = boardTopicViewFragment;
            this.c = fragmentActivity;
        }
    }

    /* JADX WARN: Type inference failed for: r0v18, types: [com.vk.topics.impl.fragments.BoardTopicViewFragment$receiver$1] */
    public BoardTopicViewFragment() {
        av20.a aVar = new av20.a();
        dhr0.a.getClass();
        aVar.d(R.layout.actions_popup_item, LayoutInflater.from(dhr0.E()));
        aVar.d = new jpj0();
        aVar.e = new h();
        this.d0 = aVar.b();
        this.e0 = new m3a(3);
        com.vk.movika.sdk.base.logic.processor.h hVar = new com.vk.movika.sdk.base.logic.processor.h(this, 8);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.f0 = msy.a(lazyThreadSafetyMode, hVar);
        this.g0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.b(this, 11));
        this.h0 = msy.a(lazyThreadSafetyMode, new com.vk.movika.sdk.base.model.e(this, 6));
        this.i0 = new om3(new hi7());
        this.o0 = new b(new g3f0((z2f0) null, 3));
        this.p0 = new c();
        this.w0 = 8;
        this.x0 = -1;
        this.y0 = UserId.d;
        this.F0 = new GestureDetector(getActivity(), new e());
        this.G0 = new BroadcastReceiver() { // from class: com.vk.topics.impl.fragments.BoardTopicViewFragment$receiver$1
            @Override // android.content.BroadcastReceiver
            public final void onReceive(Context context, Intent intent) {
                BoardTopicViewFragment.b bVar;
                BoardTopicViewFragment boardTopicViewFragment = BoardTopicViewFragment.this;
                if (boardTopicViewFragment.getActivity() == null) {
                    return;
                }
                if (!epx.f(intent.getAction() == null ? "" : intent.getAction(), "com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED") || (bVar = boardTopicViewFragment.o0) == null) {
                    return;
                }
                bVar.notifyDataSetChanged();
            }
        };
    }

    public final void Ao(int i2, boolean z) {
        LinearLayoutManager linearLayoutManager = this.q0;
        if (linearLayoutManager != null) {
            linearLayoutManager.K(this.p0.getItemCount() + i2, 0);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0049, code lost:
    
        if (r1 == null) goto L27;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Bo() {
        String obj;
        String str;
        boolean z;
        q420 q420Var;
        String b2;
        if (this.B0) {
            return;
        }
        this.B0 = true;
        q420 q420Var2 = this.E0;
        if (q420Var2 != null && (b2 = q420Var2.b()) != null) {
            int length = b2.length() - 1;
            int i2 = 0;
            boolean z2 = false;
            while (i2 <= length) {
                boolean z3 = epx.g(b2.charAt(!z2 ? i2 : length), 32) <= 0;
                if (z2) {
                    if (!z3) {
                        break;
                    } else {
                        length--;
                    }
                } else if (z3) {
                    i2++;
                } else {
                    z2 = true;
                }
            }
            obj = b2.subSequence(i2, length + 1).toString();
        }
        WriteBar writeBar = this.k0;
        String valueOf = String.valueOf(writeBar != null ? writeBar.getText() : null);
        int length2 = valueOf.length() - 1;
        int i3 = 0;
        boolean z4 = false;
        while (i3 <= length2) {
            boolean z5 = epx.g(valueOf.charAt(!z4 ? i3 : length2), 32) <= 0;
            if (z4) {
                if (!z5) {
                    break;
                } else {
                    length2--;
                }
            } else if (z5) {
                i3++;
            } else {
                z4 = true;
            }
        }
        obj = valueOf.subSequence(i3, length2 + 1).toString();
        WriteBar writeBar2 = this.k0;
        List<? extends Attachment> attachments = writeBar2 != null ? writeBar2.getAttachments() : null;
        if (attachments == null) {
            attachments = EmptyList.b;
        }
        if (obj == null || !H0.matcher(obj).find()) {
            str = obj;
            z = false;
        } else {
            str = obj;
            z = true;
        }
        if (TextUtils.isEmpty(str) && attachments.isEmpty()) {
            this.B0 = false;
            return;
        }
        if (this.C0 <= 0 || (q420Var = this.E0) == null) {
            Co(str, attachments, true, z);
            return;
        }
        String b3 = q420Var.b();
        if (b3 == null) {
            b3 = "";
        }
        String str2 = b3;
        int i4 = this.C0;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            this.B0 = false;
            return;
        }
        jx2 jx2Var = new jx2(yfb.x(((hi7) this.i0.b).e(so(), i4, ro(), str2, (List) attachments.stream().map(new pi7(new x50(3), 0)).collect(Collectors.toList()))), new bj7(z, this, i4, str2, attachments));
        jx2Var.g = activity;
        jx2Var.a();
    }

    /* JADX WARN: Removed duplicated region for block: B:16:0x0069  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0090  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009e  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x00ba  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0096  */
    /* JADX WARN: Removed duplicated region for block: B:52:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:53:0x006e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void Co(String str, List<? extends Attachment> list, boolean z, boolean z2) {
        String str2;
        sh7 sh7Var;
        int so;
        if (getActivity() == null) {
            this.B0 = false;
            return;
        }
        boolean z3 = this.A0;
        if (z && this.x0 > 0 && str != null) {
            if (brm0.B(str, this.z0 + ',', false)) {
                str2 = new Regex(Pattern.quote(this.z0)).i(str, "[post" + this.x0 + '|' + this.z0 + ']');
                Bundle arguments = getArguments();
                String string = arguments == null ? arguments.getString("title") : null;
                UserId ro = ro();
                so = so();
                sh7Var = new sh7(so != -1 ? "board.addTopic" : "board.addComment");
                sh7Var.F(ro, "group_id");
                sh7Var.C(so, "topic_id");
                if (so != -1) {
                    sh7Var.K("text", str2);
                } else {
                    sh7Var.K("message", str2);
                }
                boolean z4 = true;
                if (z3) {
                    sh7Var.C(1, "from_group");
                }
                if (list != null && !list.isEmpty()) {
                    StringBuilder sb = new StringBuilder();
                    for (Attachment attachment : list) {
                        if (attachment instanceof StickerAttachment) {
                            StickerAttachment stickerAttachment = (StickerAttachment) attachment;
                            StickerItem stickerItem = stickerAttachment.f;
                            String str3 = stickerAttachment.h;
                            sh7Var.C(stickerItem.b, "sticker_id");
                            if (!TextUtils.isEmpty(str3)) {
                                sh7Var.K("sticker_referrer", str3);
                            }
                        } else {
                            if (z4) {
                                z4 = false;
                            } else {
                                sb.append(',');
                            }
                            sb.append(attachment);
                        }
                    }
                    sh7Var.K("attachments", sb.toString());
                }
                if (so == -1) {
                    sh7Var.K("title", string);
                }
                jx2 jx2Var = new jx2(sh7Var, new cj7(str2, z, this, str, z2, list, z3));
                jx2Var.g = getActivity();
                jx2Var.a();
            }
        }
        str2 = str;
        Bundle arguments2 = getArguments();
        if (arguments2 == null) {
        }
        UserId ro2 = ro();
        so = so();
        sh7Var = new sh7(so != -1 ? "board.addTopic" : "board.addComment");
        sh7Var.F(ro2, "group_id");
        sh7Var.C(so, "topic_id");
        if (so != -1) {
        }
        boolean z42 = true;
        if (z3) {
        }
        if (list != null) {
            StringBuilder sb2 = new StringBuilder();
            while (r13.hasNext()) {
            }
            sh7Var.K("attachments", sb2.toString());
        }
        if (so == -1) {
        }
        jx2 jx2Var2 = new jx2(sh7Var, new cj7(str2, z, this, str, z2, list, z3));
        jx2Var2.g = getActivity();
        jx2Var2.a();
    }

    public final void Do(int i2, String str, List<? extends Attachment> list) {
        Object obj;
        Iterator it = ((List) this.o0.d.stream().map(new wi7(new ol(4), 0)).collect(Collectors.toList())).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            } else {
                obj = it.next();
                if (((BoardComment) obj).b == i2) {
                    break;
                }
            }
        }
        BoardComment boardComment = (BoardComment) obj;
        if (boardComment == null) {
            return;
        }
        oo(i2, boardComment, str, list);
    }

    public final void Eo() {
        WriteBar writeBar = this.k0;
        if (writeBar != null) {
            awt0.v(writeBar, (this.D0 && this.C0 == 0) ? false : true);
        }
    }

    public final void Fo() {
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        ner0 ner0Var = new ner0(activity);
        ner0Var.setMessage(getString(R.string.loading));
        ner0Var.setCancelable(true);
        ner0Var.setCanceledOnTouchOutside(false);
        ner0Var.show();
        xsna.i iVar = new xsna.i(4, ner0Var, this);
        gs2 gs2Var = new gs2(ner0Var, 2);
        WriteBar writeBar = this.k0;
        if (writeBar != null) {
            writeBar.f(iVar, gs2Var);
        }
    }

    @Override // xsna.tdg
    public final void N3(iag iagVar, aa aaVar, ReactionMeta reactionMeta, boolean z) {
        boolean J = iagVar.J();
        UserId e2 = fkq0.e(ro());
        int id = iagVar.getId();
        wh7 wh7Var = new wh7(J ? "likes.delete" : "likes.add");
        wh7Var.K("type", "topic_comment");
        wh7Var.F(e2, "owner_id");
        wh7Var.C(id, "item_id");
        wh7.a aVar = new wh7.a();
        UserId.b bVar = UserId.c;
        aVar.a = !J;
        wh7Var.s = aVar;
        new jx2(wh7Var, new f(iagVar, this)).a();
        iagVar.f(iagVar.T9() + (iagVar.J() ? -1 : 1));
        iagVar.f0(!iagVar.J());
        this.o0.notifyDataSetChanged();
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final void Rn() {
        xgy xgyVar;
        WriteBar writeBar = this.k0;
        if (writeBar != null) {
            writeBar.n(false);
        }
        xgy xgyVar2 = this.s0;
        if (xgyVar2 == null || !xgyVar2.e() || (xgyVar = this.s0) == null) {
            return;
        }
        xgyVar.d();
    }

    @Override // xsna.tdg
    public final boolean X3(VideoAttachment videoAttachment) {
        return false;
    }

    @Override // com.vk.core.fragments.FragmentImpl
    public final boolean a0() {
        xgy xgyVar;
        xgy xgyVar2 = this.s0;
        if (xgyVar2 == null || !xgyVar2.e()) {
            if (this.C0 <= 0) {
                return false;
            }
            vo();
            return true;
        }
        xgy xgyVar3 = this.s0;
        if (xgyVar3 != null && xgyVar3.e() && (xgyVar = this.s0) != null) {
            xgyVar.d();
        }
        return true;
    }

    @Override // xsna.tdg
    public final boolean a4(cbg cbgVar) {
        return this.C0 <= 0 || cbgVar == null || cbgVar.a.getId() == this.C0;
    }

    @Override // xsna.tdg
    public final void ei(iag iagVar, TypeReply typeReply) {
        String str;
        Collection collection;
        this.x0 = iagVar.getId();
        this.y0 = iagVar.getUid();
        String y1 = iagVar.y1();
        if (y1 != null) {
            List a2 = n6j.a(0, " ", y1);
            if (!a2.isEmpty()) {
                ListIterator listIterator = a2.listIterator(a2.size());
                while (listIterator.hasPrevious()) {
                    if (((String) listIterator.previous()).length() != 0) {
                        collection = j5g.H0(a2, listIterator.nextIndex() + 1);
                        break;
                    }
                }
            }
            collection = EmptyList.b;
            str = ((String[]) collection.toArray(new String[0]))[0];
        } else {
            str = "";
        }
        this.z0 = str;
        this.A0 = false;
        WriteBar writeBar = this.k0;
        if (writeBar == null || this.D0) {
            return;
        }
        if (writeBar.getText().length() == 0) {
            writeBar.setText(this.z0 + ", ");
        }
        writeBar.B();
    }

    @Override // xsna.tdg
    public final void fd(StickerAttachment stickerAttachment, o4l0 o4l0Var) {
        RelativeLayout relativeLayout;
        PopupStickerView popupStickerView = this.m0;
        if (popupStickerView != null && popupStickerView.getParent() != null && (relativeLayout = this.j0) != null) {
            relativeLayout.removeView(popupStickerView);
        }
        FragmentActivity activity = getActivity();
        PopupStickerAnimation popupStickerAnimation = stickerAttachment.f.k;
        if (activity == null || this.j0 == null || popupStickerAnimation == null) {
            return;
        }
        PopupStickerView popupStickerView2 = new PopupStickerView(activity, null, 0, 14, 0);
        this.m0 = popupStickerView2;
        popupStickerView2.setLoadingCallback(o4l0Var);
        PopupStickerView popupStickerView3 = this.m0;
        if (popupStickerView3 != null) {
            popupStickerView3.c(popupStickerAnimation, false, null, null);
        }
        RelativeLayout.LayoutParams layoutParams = new RelativeLayout.LayoutParams(-1, -1);
        layoutParams.addRule(2, R.id.commentBar);
        PopupStickerView popupStickerView4 = this.m0;
        if (popupStickerView4 != null) {
            popupStickerView4.setLayoutParams(layoutParams);
        }
        RelativeLayout relativeLayout2 = this.j0;
        if (relativeLayout2 != null) {
            relativeLayout2.setVisibility(0);
        }
        RelativeLayout relativeLayout3 = this.j0;
        if (relativeLayout3 != null) {
            relativeLayout3.addView(this.m0, layoutParams);
        }
    }

    /* JADX WARN: Type inference failed for: r4v0, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.tdg
    public final void gm(iag iagVar, aa aaVar) {
        androidx.appcompat.app.d dVar;
        FragmentActivity activity = getActivity();
        if (activity != null && (iagVar instanceof BoardComment)) {
            Bundle arguments = getArguments();
            boolean z = arguments != null ? arguments.getBoolean("is_admin", false) : false;
            BoardComment boardComment = (BoardComment) iagVar;
            final vh7 vh7Var = new vh7(boardComment);
            vh7Var.b = z;
            vh7Var.c = epx.f(boardComment.j, ((b25) this.g0.getValue()).c());
            vh7Var.d = !this.D0;
            final l lVar = new l(iagVar, this, activity);
            ArrayList arrayList = new ArrayList(boardComment.l);
            final ArrayList arrayList2 = new ArrayList();
            String str = boardComment.c;
            if (str != null && str.length() != 0) {
                arrayList.add(activity.getString(R.string.copy_text));
                arrayList2.add("actionCopy");
            }
            if ((vh7Var.b || (vh7Var.c && vh7Var.d)) && !boardComment.D4() && !boardComment.V8()) {
                arrayList.add(activity.getString(R.string.edit));
                arrayList2.add("actionEdit");
            }
            if ((vh7Var.b || vh7Var.c) && boardComment.n != 0) {
                arrayList.add(activity.getString(R.string.delete));
                arrayList2.add("actionDelete");
            }
            if (arrayList.isEmpty()) {
                dVar = null;
            } else {
                h7u0.a aVar = new h7u0.a(activity);
                aVar.T((CharSequence[]) arrayList.toArray(new String[0]), new DialogInterface.OnClickListener() { // from class: xsna.uh7
                    @Override // android.content.DialogInterface.OnClickListener
                    public final void onClick(DialogInterface dialogInterface, int i2) {
                        String str2;
                        BoardComment boardComment2 = vh7.this.a;
                        if (i2 >= boardComment2.m.size()) {
                            str2 = (String) arrayList2.get(i2 - boardComment2.m.size());
                        } else {
                            str2 = null;
                        }
                        BoardTopicViewFragment.l lVar2 = lVar;
                        BoardTopicViewFragment boardTopicViewFragment = lVar2.b;
                        iag iagVar2 = lVar2.a;
                        BoardComment boardComment3 = (BoardComment) iagVar2;
                        if (i2 < boardComment3.m.size()) {
                            boardTopicViewFragment.startActivity(new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(boardComment3.m.get(i2))));
                            return;
                        }
                        if ("actionCopy".equals(str2)) {
                            mhy.a(lVar2.c, boardComment3.c);
                            cvk.u(R.string.text_copied, false);
                            return;
                        }
                        if (!"actionEdit".equals(str2)) {
                            if ("actionDelete".equals(str2)) {
                                Pattern pattern = BoardTopicViewFragment.H0;
                                if (boardTopicViewFragment.getActivity() != null) {
                                    UserId ro = boardTopicViewFragment.ro();
                                    int so = boardTopicViewFragment.so();
                                    int i3 = boardComment3.b;
                                    czk0 czk0Var = new czk0("board.deleteComment", 2);
                                    czk0Var.F(ro, "group_id");
                                    czk0Var.C(so, "topic_id");
                                    czk0Var.C(i3, "comment_id");
                                    jx2 jx2Var = new jx2(czk0Var, new yi7(boardTopicViewFragment, boardComment3));
                                    jx2Var.g = boardTopicViewFragment.getActivity();
                                    jx2Var.a();
                                    return;
                                }
                                return;
                            }
                            return;
                        }
                        Pattern pattern2 = BoardTopicViewFragment.H0;
                        boardTopicViewFragment.C0 = iagVar2.getId();
                        String text = iagVar2.getText();
                        ArrayList<Attachment> u = iagVar2.u();
                        WriteBar writeBar = boardTopicViewFragment.k0;
                        if (writeBar != null) {
                            writeBar.setStickersSuggestEnabled(false);
                            writeBar.setEmojiAllowed(false);
                            writeBar.setText(text);
                            writeBar.F();
                            Iterator<Attachment> it = u.iterator();
                            while (it.hasNext()) {
                                writeBar.A1(it.next());
                            }
                            EditText input = writeBar.getInput();
                            input.requestFocus();
                            input.setSelection(input.getText().length());
                            boardTopicViewFragment.Eo();
                            writeBar.postDelayed(new r44(input, 3), 300L);
                        }
                        boardTopicViewFragment.o0.y0();
                    }
                });
                dVar = aVar.m();
            }
            if (dVar != null) {
                I0 = new WeakReference<>(dVar);
            }
        }
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment
    public final View no(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle) {
        xgy xgyVar;
        View inflate = layoutInflater.inflate(R.layout.fr_discussion_view, viewGroup, false);
        if (inflate instanceof RelativeLayout) {
            this.j0 = (RelativeLayout) inflate;
        }
        View findViewById = inflate.findViewById(R.id.bigProgress);
        this.v0 = findViewById;
        if (findViewById != null) {
            findViewById.setVisibility(this.w0);
        }
        this.u0 = inflate.findViewById(R.id.createHint);
        UsableRecyclerView usableRecyclerView = (UsableRecyclerView) inflate.findViewById(R.id.list);
        usableRecyclerView.setLayoutManager(this.q0);
        ColorDrawable colorDrawable = new ColorDrawable(637534208);
        WeakHashMap weakHashMap = j6r0.a;
        usableRecyclerView.addItemDecoration(new yrn(colorDrawable, iah0.a(0.5f)));
        usableRecyclerView.addOnItemTouchListener(new i());
        a920 a920Var = new a920();
        a920Var.K0(this.p0);
        a920Var.K0(this.o0);
        usableRecyclerView.setAdapter(a920Var);
        usableRecyclerView.setListener(new com.vk.topics.impl.fragments.a(this));
        final WriteBar writeBar = (WriteBar) inflate.findViewById(R.id.commentBar);
        this.k0 = writeBar;
        if (writeBar == null) {
            throw new IllegalArgumentException("Required value was null.");
        }
        writeBar.setBottomSheetContainer((ViewGroup) inflate.findViewById(R.id.bottom_sheet_container));
        writeBar.setHidePopup(true);
        Eo();
        Context requireContext = requireContext();
        g gVar = this.c0;
        StickersView stickersView = new StickersView(requireContext, gVar, 4);
        this.t0 = stickersView;
        stickersView.setStickersKeyboardContext(b.a.a);
        wn4 wn4Var = null;
        if (viewGroup == null || getActivity() == null) {
            xgyVar = null;
        } else {
            FragmentActivity kn = kn();
            StickersView stickersView2 = this.t0;
            if (stickersView2 == null) {
                throw new IllegalArgumentException("Required value was null.");
            }
            xgyVar = new xgy(kn, viewGroup, stickersView2, null, null, 120);
        }
        this.s0 = xgyVar;
        if (xgyVar != null) {
            View emojiAnchor = writeBar.getEmojiAnchor();
            int i2 = xgy.F;
            xgyVar.a(emojiAnchor, null);
        }
        xgy xgyVar2 = this.s0;
        if (xgyVar2 != null) {
            xgyVar2.o = writeBar;
        }
        writeBar.setAutoSuggestPopupListener(gVar);
        writeBar.setGraffitiAllowed(true);
        writeBar.setLocationAllowed(false);
        writeBar.setWriteBarSendListener(new j(this, writeBar));
        writeBar.setWriteBarAttachesListener(new xi7(this));
        writeBar.setWriteBarStickersListener(new k());
        writeBar.P.add(new View.OnKeyListener() { // from class: xsna.ui7
            @Override // android.view.View.OnKeyListener
            public final boolean onKey(View view, int i3, KeyEvent keyEvent) {
                xgy xgyVar3;
                if (i3 != 4) {
                    Pattern pattern = BoardTopicViewFragment.H0;
                    return false;
                }
                BoardTopicViewFragment boardTopicViewFragment = BoardTopicViewFragment.this;
                xgy xgyVar4 = boardTopicViewFragment.s0;
                if (xgyVar4 == null || !xgyVar4.e()) {
                    return false;
                }
                if (keyEvent.getAction() == 1 && (xgyVar3 = boardTopicViewFragment.s0) != null) {
                    xgyVar3.g();
                    xgy.b bVar = xgyVar3.o;
                    if (bVar != null) {
                        bVar.D();
                    }
                }
                return true;
            }
        });
        writeBar.findViewById(R.id.writebar_send).setOnLongClickListener(new View.OnLongClickListener() { // from class: xsna.oi7
            @Override // android.view.View.OnLongClickListener
            public final boolean onLongClick(View view) {
                Pattern pattern = BoardTopicViewFragment.H0;
                t6g0 t6g0Var = t6g0.b;
                gxh b2 = t6g0.b();
                final BoardTopicViewFragment boardTopicViewFragment = BoardTopicViewFragment.this;
                Group C0 = b2.C0(boardTopicViewFragment.ro());
                if (C0 != null && C0.s < 2) {
                    return false;
                }
                final WriteBar writeBar2 = writeBar;
                PopupMenu popupMenu = new PopupMenu(boardTopicViewFragment.requireContext(), (ImageView) writeBar2.findViewById(R.id.writebar_send));
                popupMenu.getMenu().add(R.string.reply_from_group);
                popupMenu.setOnMenuItemClickListener(new PopupMenu.OnMenuItemClickListener() { // from class: xsna.ri7
                    @Override // android.widget.PopupMenu.OnMenuItemClickListener
                    public final boolean onMenuItemClick(MenuItem menuItem) {
                        BoardTopicViewFragment boardTopicViewFragment2 = BoardTopicViewFragment.this;
                        boardTopicViewFragment2.A0 = true;
                        if (writeBar2.e()) {
                            boardTopicViewFragment2.Fo();
                        } else {
                            boardTopicViewFragment2.Bo();
                        }
                        return true;
                    }
                });
                popupMenu.show();
                return true;
            }
        });
        writeBar.setResultFragment(this);
        writeBar.b(fkq0.e(ro()), true);
        writeBar.setAttachLimits(10);
        FragmentActivity activity = getActivity();
        if (activity != null) {
            writeBar.S(activity, null);
        }
        writeBar.setTopicId(so());
        EditText input = writeBar.getInput();
        l420.w7.getClass();
        q420 q420Var = new q420(input, l420.a.b, wn4Var, 28);
        this.E0 = q420Var;
        q420Var.g = new fvr();
        q420Var.e(true);
        writeBar.getInput().addTextChangedListener(this.E0);
        PaginationView paginationView = (PaginationView) inflate.findViewById(R.id.paginationView);
        this.l0 = paginationView;
        if (paginationView != null) {
            paginationView.setListener(this);
        }
        qo();
        return inflate;
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onActivityResult(int i2, int i3, Intent intent) {
        WriteBar writeBar;
        Parcelable parcelable;
        Object parcelableExtra;
        super.onActivityResult(i2, i3, intent);
        if (i2 != 4329 || i3 != -1 || intent == null) {
            if (i2 <= 10000 || (writeBar = this.k0) == null) {
                return;
            }
            writeBar.onActivityResult(i2, i3, intent);
            return;
        }
        if (Build.VERSION.SDK_INT >= 33) {
            parcelableExtra = intent.getParcelableExtra("comment", BoardComment.class);
            parcelable = (Parcelable) parcelableExtra;
        } else {
            Parcelable parcelableExtra2 = intent.getParcelableExtra("comment");
            if (!(parcelableExtra2 instanceof BoardComment)) {
                parcelableExtra2 = null;
            }
            parcelable = (BoardComment) parcelableExtra2;
        }
        BoardComment boardComment = (BoardComment) parcelable;
        if (boardComment != null) {
            Do(boardComment.b, boardComment.c, boardComment.f);
        }
    }

    @Override // me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onAttach(Context context) {
        super.onAttach(context);
        p0e0.b(fkq0.e(ro()), "topic_group");
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onCreate(Bundle bundle) {
        boolean z;
        super.onCreate(bundle);
        int i2 = 0;
        if (bundle != null) {
            z = bundle.getBoolean("is_closed");
        } else {
            Bundle arguments = getArguments();
            z = arguments != null ? arguments.getBoolean("is_closed", false) : false;
        }
        this.D0 = z;
        getActivity();
        this.q0 = new LinearLayoutManager();
        UserId ro = ro();
        int so = so();
        Bundle arguments2 = getArguments();
        yh7 yh7Var = new yh7(ro, so, this, arguments2 != null ? arguments2.getBoolean("show_last_comment", false) : false);
        Bundle arguments3 = getArguments();
        if (arguments3 != null ? arguments3.getBoolean("show_last_comment", false) : false) {
            Bundle arguments4 = getArguments();
            int i3 = (arguments4 != null ? arguments4.getInt("comments_count", 0) : 0) - 20;
            if (i3 >= 0) {
                i2 = i3;
            }
        } else {
            Bundle arguments5 = getArguments();
            if (arguments5 != null) {
                i2 = arguments5.getInt(SignalingProtocol.KEY_OFFSET, 0);
            }
        }
        yh7Var.h(i2, getActivity());
        this.r0 = yh7Var;
        IntentFilter a2 = z23.a("com.vkontakte.android.STICKERS_ANIMATION_ENABLED_CHANGED");
        Context context = e43.a;
        if (context == null) {
            context = null;
        }
        anj.d(context, this.G0, a2, hf8.a, 4);
        if (so() != -1) {
            this.b0.add(new mi7(getString(R.string.copy_link)));
        }
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onDestroy() {
        androidx.appcompat.app.d dVar;
        WeakReference<androidx.appcompat.app.d> weakReference = I0;
        if (weakReference != null && (dVar = weakReference.get()) != null) {
            dVar.dismiss();
        }
        super.onDestroy();
        try {
            Context context = e43.a;
            if (context == null) {
                context = null;
            }
            context.unregisterReceiver(this.G0);
        } catch (Exception unused) {
        }
        yh7 yh7Var = this.r0;
        if (yh7Var == null || yh7Var.f == null) {
            return;
        }
        yh7Var.f.dispose();
        yh7Var.f = null;
    }

    @Override // me.grishka.appkit.fragments.ToolbarFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onDestroyView() {
        EditText input;
        super.onDestroyView();
        WriteBar writeBar = this.k0;
        if (writeBar != null && (input = writeBar.getInput()) != null) {
            input.removeTextChangedListener(this.E0);
        }
        this.E0 = null;
        this.k0 = null;
        this.l0 = null;
        this.s0 = null;
        this.t0 = null;
        this.v0 = null;
        this.u0 = null;
    }

    @Override // com.vk.topics.impl.view.PaginationView.a
    public final void onPageSelected(int i2) {
        yh7 yh7Var;
        FragmentActivity activity = getActivity();
        if (activity == null) {
            return;
        }
        if (i2 > 0) {
            PaginationView paginationView = this.l0;
            if (paginationView != null) {
                paginationView.setCurrentPage(i2);
            }
            int i3 = (i2 - 1) * 20;
            FragmentActivity activity2 = getActivity();
            if (activity2 == null || (yh7Var = this.r0) == null) {
                return;
            }
            yh7Var.h(i3, activity2);
            return;
        }
        TextView textView = new TextView(activity);
        Resources resources = getResources();
        PaginationView paginationView2 = this.l0;
        textView.setText(resources.getString(R.string.page_explain, Integer.valueOf(paginationView2 != null ? paginationView2.getPageCount() : 0)));
        jno0.c(textView, R.attr.vk_ui_text_primary);
        final EditText editText = new EditText(activity);
        editText.setInputType(8192);
        editText.setWidth(iah0.a(200.0f));
        PaginationView paginationView3 = this.l0;
        editText.setText(String.valueOf(paginationView3 != null ? Integer.valueOf(paginationView3.getCurrentPage()) : null));
        editText.setInputType(2);
        editText.setSelection(editText.getText().length());
        jno0.c(editText, R.attr.vk_ui_text_primary);
        LinearLayout linearLayout = new LinearLayout(activity);
        linearLayout.setOrientation(1);
        linearLayout.addView(textView);
        linearLayout.addView(editText);
        int a2 = iah0.a(10);
        float f2 = 24;
        linearLayout.setPadding(iah0.a(f2), a2, iah0.a(f2), a2);
        h7u0.a aVar = new h7u0.a(activity);
        aVar.g0(R.string.jump_to_page);
        aVar.f = linearLayout;
        aVar.c0(R.string.ok, new DialogInterface.OnClickListener() { // from class: xsna.ti7
            @Override // android.content.DialogInterface.OnClickListener
            public final void onClick(DialogInterface dialogInterface, int i4) {
                EditText editText2 = editText;
                BoardTopicViewFragment boardTopicViewFragment = this;
                Pattern pattern = BoardTopicViewFragment.H0;
                try {
                    int parseInt = Integer.parseInt(editText2.getText().toString());
                    if (parseInt > 0) {
                        PaginationView paginationView4 = boardTopicViewFragment.l0;
                        if (parseInt <= (paginationView4 != null ? paginationView4.getPageCount() : 0)) {
                            boardTopicViewFragment.onPageSelected(parseInt);
                        }
                    }
                } catch (Exception unused) {
                }
            }
        });
        aVar.W(R.string.cancel, null);
        aVar.m();
        mhy.j(editText);
    }

    @Override // com.vk.core.fragments.FragmentImpl, androidx.fragment.app.d, androidx.fragment.app.Fragment
    public final void onSaveInstanceState(Bundle bundle) {
        super.onSaveInstanceState(bundle);
        bundle.putBoolean("is_closed", this.D0);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // me.grishka.appkit.fragments.VKToolbarFragment, me.grishka.appkit.fragments.AppKitFragment, com.vk.core.fragments.FragmentImpl, androidx.fragment.app.Fragment
    public final void onViewCreated(View view, Bundle bundle) {
        super.onViewCreated(view, bundle);
        VkTopBar vkTopBar = new VkTopBar(requireContext(), 0 == true ? 1 : 0, 6, 0);
        this.n0 = vkTopBar;
        Context requireContext = requireContext();
        HashSet hashSet = iah0.a;
        if (!fnj.d(requireContext)) {
            vkTopBar.setBack(new VkTopBar.b(new cb(this, 9), tq.h(tlo0.Companion, R.string.talkback_ic_back), null, null, null, 28));
        }
        Bundle arguments = getArguments();
        if (arguments != null && arguments.containsKey("title")) {
            tlo0.a aVar = tlo0.Companion;
            Bundle arguments2 = getArguments();
            String string = arguments2 != null ? arguments2.getString("title") : null;
            if (string == null) {
                string = "";
            }
            vkTopBar.setMiddle(new VkTopBar.Middle.Text(new VkTopBar.Middle.Text.Title(oq.d(aVar, string), null, null, null, null, 30), null, 0 == true ? 1 : 0, 0 == true ? 1 : 0, 14));
        }
        to();
        jo(vkTopBar);
    }

    public final void oo(int i2, BoardComment boardComment, String str, List<? extends Attachment> list) {
        int i3 = boardComment.b;
        ArrayList<Attachment> arrayList = boardComment.f;
        if (i3 != i2) {
            return;
        }
        boardComment.c = str;
        arrayList.clear();
        arrayList.addAll(list);
        boardComment.m.clear();
        boardComment.l.clear();
        boardComment.Ab();
        this.o0.notifyDataSetChanged();
    }

    @Override // xsna.tdg
    public final UserId p() {
        return new UserId(getArguments() != null ? r1.getInt("owner_id", 0) : 0L);
    }

    public final void po(int i2, gzs gzsVar, izs izsVar) {
        if (so() <= 0) {
            gzsVar.invoke();
        } else {
            new jx2(new BoardGetComments(ro(), so(), 1, BoardGetComments.PagingKey.startCommentId, i2), new d(i2, gzsVar, izsVar)).a();
        }
    }

    public final void qo() {
        yh7 yh7Var = this.r0;
        int i2 = yh7Var != null ? yh7Var.c : 0;
        PaginationView paginationView = this.l0;
        if (paginationView == null || i2 < 0) {
            u1u0.m(8, paginationView);
            return;
        }
        int i3 = (i2 / 20) + (i2 % 20 > 0 ? 1 : 0);
        paginationView.setPageCount(i3);
        if (i3 <= 1) {
            paginationView.setVisibility(8);
        } else if (paginationView.getVisibility() != 0) {
            j6r0.c(0, paginationView);
        }
    }

    public final UserId ro() {
        Parcelable parcelable;
        Object parcelable2;
        Bundle arguments = getArguments();
        if (arguments != null) {
            if (Build.VERSION.SDK_INT >= 33) {
                parcelable2 = arguments.getParcelable("group_id", UserId.class);
                parcelable = (Parcelable) parcelable2;
            } else {
                Parcelable parcelable3 = arguments.getParcelable("group_id");
                if (!(parcelable3 instanceof UserId)) {
                    parcelable3 = null;
                }
                parcelable = (UserId) parcelable3;
            }
            UserId userId = (UserId) parcelable;
            if (userId != null) {
                return userId;
            }
        }
        return UserId.d;
    }

    public final int so() {
        Bundle arguments = getArguments();
        if (arguments != null) {
            return arguments.getInt("id");
        }
        return 0;
    }

    @Override // xsna.tdg
    public final boolean t2() {
        return true;
    }

    public final void to() {
        VkTopBar vkTopBar;
        if (this.b0.isEmpty() || (vkTopBar = this.n0) == null) {
            return;
        }
        vkTopBar.setAfter(VkTopBar.a.C0875a.a(new VkTopBar.a.c.f(new gko(R.drawable.vk_icon_more_vertical_28), tq.h(tlo0.Companion, R.string.accessibility_actions), new e4(this, 5), null, null, null, 56), null, 6));
    }

    public final void uo(ArrayList arrayList, int i2, boolean z) {
        b bVar = this.o0;
        if (!z) {
            bVar.x0(arrayList, true);
            return;
        }
        LinearLayoutManager linearLayoutManager = this.q0;
        if (linearLayoutManager == null) {
            return;
        }
        int v = linearLayoutManager.v();
        View findViewByPosition = linearLayoutManager.findViewByPosition(v);
        int top = findViewByPosition != null ? findViewByPosition.getTop() : 0;
        bVar.x0(arrayList, true);
        linearLayoutManager.K(v + i2, top);
    }

    public final void vo() {
        this.C0 = 0;
        WriteBar writeBar = this.k0;
        if (writeBar != null) {
            Eo();
            writeBar.setStickersSuggestEnabled(true);
            writeBar.setEmojiAllowed(true);
            writeBar.setText("");
            writeBar.F();
            EditText input = writeBar.getInput();
            input.clearFocus();
            mhy.d(input);
        }
        this.o0.y0();
    }

    public final void wo() {
        FragmentActivity activity;
        if (this.o0.getItemCount() != 0 || (activity = getActivity()) == null) {
            return;
        }
        utj.a aVar = new utj.a(activity);
        aVar.j(R.string.common_network_error);
        aVar.m();
    }

    @Override // xsna.tdg
    public final void x(int i2) {
        if (this.D0) {
            return;
        }
        xgy xgyVar = this.s0;
        if (xgyVar != null) {
            int i3 = xgy.F;
            xgyVar.h(null);
        }
        StickersView stickersView = this.t0;
        if (stickersView != null) {
            stickersView.g(i2);
        }
    }

    public final void xo() {
        View view = this.v0;
        this.w0 = 8;
        u1u0.m(8, view);
        u1u0.m(so() == -1 ? 0 : 8, this.u0);
    }

    public final void yo(int i2) {
        View view = this.v0;
        int i3 = i2 == 0 ? 0 : 8;
        this.w0 = i3;
        u1u0.m(i3, view);
    }

    @Override // xsna.tdg
    public final boolean z(rdg rdgVar) {
        return false;
    }

    public final void zo() {
        this.o0.x0(new ArrayList(), true);
    }

    /* compiled from: BoardTopicViewFragment.kt */
    public static final class k implements z1y0 {
        public k() {
        }

        @Override // xsna.z1y0
        public final void i() {
            xgy xgyVar = BoardTopicViewFragment.this.s0;
            if (xgyVar != null) {
                xgyVar.k();
            }
        }

        @Override // xsna.z1y0
        public final void f() {
        }

        @Override // xsna.z1y0
        public final void g() {
        }
    }

    @Override // xsna.tdg
    public final void nc() {
    }

    @Override // xsna.tdg
    public final CharSequence mb(int i2, CharSequence charSequence) {
        return charSequence;
    }
}
