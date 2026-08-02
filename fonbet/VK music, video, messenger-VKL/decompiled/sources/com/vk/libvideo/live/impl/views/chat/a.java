package com.vk.libvideo.live.impl.views.chat;

import android.os.Bundle;
import android.text.Spannable;
import android.text.SpannableString;
import android.text.TextUtils;
import android.text.style.ForegroundColorSpan;
import android.text.style.TypefaceSpan;
import com.vk.api.generated.base.dto.BaseBoolIntDto;
import com.vk.api.generated.base.dto.BaseLikesInfoDto;
import com.vk.api.generated.likes.dto.LikesAddResponseDto;
import com.vk.api.generated.likes.dto.LikesDeleteResponseDto;
import com.vk.api.generated.video.dto.VideoGetCommentsExtendedResponseDto;
import com.vk.api.generated.wall.dto.WallWallCommentDto;
import com.vk.api.sdk.exceptions.VKApiExecutionException;
import com.vk.common.links.LinksParserData;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.AdminLeaveAction;
import com.vk.dto.group.Group;
import com.vk.dto.live.LiveEventModel;
import com.vk.dto.user.UserProfile;
import com.vk.dto.video.VideoOwner;
import com.vk.ecomm.moderation.api.di.ModerationComponent;
import com.vk.libvideo.live.impl.base.LiveStatNew;
import com.vk.log.L;
import com.vk.stat.scheme.CommonVideoStat$TypeLiveCommentActionsItem;
import com.vk.toggle.features.ComFeatures;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.t;
import io.reactivex.rxjava3.internal.functions.a;
import io.reactivex.rxjava3.internal.operators.observable.b0;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import java.util.HashSet;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.function.Predicate;
import xsna.anz;
import xsna.ao;
import xsna.beg;
import xsna.bpu;
import xsna.cvk;
import xsna.d370;
import xsna.e43;
import xsna.eos;
import xsna.fkq0;
import xsna.fub;
import xsna.fxc0;
import xsna.gqu;
import xsna.gub;
import xsna.h2w;
import xsna.he3;
import xsna.hqu;
import xsna.hub;
import xsna.izs;
import xsna.j03;
import xsna.j6i;
import xsna.jmz;
import xsna.jn;
import xsna.jub;
import xsna.l2y0;
import xsna.ljs;
import xsna.m7m;
import xsna.mhy;
import xsna.o0r0;
import xsna.oyb;
import xsna.q9k;
import xsna.qpb;
import xsna.qyk0;
import xsna.rl2;
import xsna.rpb;
import xsna.rsg0;
import xsna.s3q0;
import xsna.saz;
import xsna.taz;
import xsna.ucp;
import xsna.w00;
import xsna.w8i;
import xsna.xn;
import xsna.xwk;
import xsna.yfb;
import xsna.yjs;
import xsna.ymz;
import xsna.yqu;
import xsna.zqu;

/* compiled from: ChatPresenter.java */
/* loaded from: classes3.dex */
public final class a implements qpb, w8i {
    public final anz b;
    public final ymz c;
    public final rpb d;
    public final oyb e;
    public UserProfile f;
    public final Group g;
    public final boolean h;
    public io.reactivex.rxjava3.observers.a i;
    public int j;
    public final VideoOwner k;
    public long l;
    public LiveStatNew m;
    public final boolean n;
    public boolean o;
    public beg p;
    public l2y0 q;
    public io.reactivex.rxjava3.disposables.c r;
    public final e s;
    public final HashSet t;

    /* compiled from: ChatPresenter.java */
    /* renamed from: com.vk.libvideo.live.impl.views.chat.a$a, reason: collision with other inner class name */
    public class C1237a extends io.reactivex.rxjava3.observers.a<Boolean> {
        public final /* synthetic */ UserId c;

        public C1237a(UserId userId) {
            this.c = userId;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a.this.t.remove(this.c);
            cvk.u(R.string.live_comment_user_unbanned, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            cvk.u(R.string.live_comment_some_error, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class b extends io.reactivex.rxjava3.observers.a<Boolean> {
        public final /* synthetic */ UserId c;

        public b(UserId userId) {
            this.c = userId;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a.this.t.remove(this.c);
            cvk.u(R.string.live_comment_user_unbanned, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            cvk.u(R.string.live_comment_some_error, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class c extends io.reactivex.rxjava3.observers.a<Boolean> {
        public c() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a.this.i = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            a.this.i = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class d extends io.reactivex.rxjava3.observers.a<Boolean> {
        public d() {
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a.this.i = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            a.this.i = null;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class e extends LinkedHashMap<String, Long> {
        public e() {
        }

        @Override // java.util.LinkedHashMap
        public final boolean removeEldestEntry(Map.Entry<String, Long> entry) {
            return size() > 3;
        }
    }

    /* compiled from: ChatPresenter.java */
    public class f extends io.reactivex.rxjava3.observers.a<LikesAddResponseDto> {
        public final /* synthetic */ UserId c;
        public final /* synthetic */ int d;
        public final /* synthetic */ a e;

        public f(int i, UserId userId, a aVar) {
            this.e = aVar;
            this.c = userId;
            this.d = i;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a aVar = this.e;
            aVar.i = null;
            cvk.u(R.string.live_comment_like_ok, false);
            LiveStatNew liveStatNew = aVar.m;
            if (liveStatNew != null) {
                Bundle a = q9k.a("action_type", "like_comment");
                a.putLong("recipient_user_id", this.c.b);
                liveStatNew.b(a);
                qyk0.a().e("live_action", a);
            }
            if (aVar.n) {
                aVar.e.H0(new hub(this.d), new rl2(6));
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            a aVar = this.e;
            aVar.i = null;
            if (th instanceof VKApiExecutionException) {
                j03.i(aVar.d.getViewContext(), (VKApiExecutionException) th);
            } else {
                d370.L(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class g extends io.reactivex.rxjava3.observers.a<LikesDeleteResponseDto> {
        public final /* synthetic */ int c;

        public g(int i) {
            this.c = i;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a aVar = a.this;
            aVar.i = null;
            cvk.u(R.string.live_comment_unlike_ok, false);
            if (aVar.n) {
                aVar.e.H0(new hub(this.c), new rl2(6));
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            L.i(th);
            a aVar = a.this;
            aVar.i = null;
            if (th instanceof VKApiExecutionException) {
                j03.i(aVar.d.getViewContext(), (VKApiExecutionException) th);
            } else {
                d370.L(th);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class h extends io.reactivex.rxjava3.observers.a<Boolean> {
        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            cvk.u(R.string.live_comment_group_added, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            cvk.u(R.string.live_comment_some_error, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class i extends io.reactivex.rxjava3.observers.a<Integer> {
        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            cvk.u(R.string.live_comment_user_added, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            cvk.u(R.string.live_comment_some_error, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class j implements izs<AdminLeaveAction, s3q0> {
        public final /* synthetic */ UserId b;

        public j(UserId userId) {
            this.b = userId;
        }

        @Override // xsna.izs
        public final s3q0 invoke(AdminLeaveAction adminLeaveAction) {
            AdminLeaveAction adminLeaveAction2 = adminLeaveAction;
            a aVar = a.this;
            ymz ymzVar = aVar.c;
            UserId e = fkq0.e(this.b);
            ymzVar.getClass();
            m1 y0 = rsg0.y0(new hqu(e, (String) null, (String) null, adminLeaveAction2, (String) null), null, null, 3);
            com.vk.libvideo.live.impl.views.chat.b bVar = new com.vk.libvideo.live.impl.views.chat.b();
            y0.subscribe(bVar);
            aVar.i = bVar;
            return s3q0.a;
        }
    }

    /* compiled from: ChatPresenter.java */
    public class k extends io.reactivex.rxjava3.observers.a<Integer> {
        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            cvk.u(R.string.live_comment_user_removed, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            cvk.u(R.string.live_comment_some_error, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class l extends io.reactivex.rxjava3.observers.a<Boolean> {
        public final /* synthetic */ UserId c;

        public l(UserId userId) {
            this.c = userId;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a aVar = a.this;
            HashSet hashSet = aVar.t;
            UserId userId = this.c;
            hashSet.add(userId);
            cvk.u(R.string.live_comment_user_banned, false);
            LiveStatNew liveStatNew = aVar.m;
            if (liveStatNew != null) {
                liveStatNew.a(userId);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            cvk.u(R.string.live_comment_some_error, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    /* compiled from: ChatPresenter.java */
    public class m extends io.reactivex.rxjava3.observers.a<Boolean> {
        public final /* synthetic */ UserId c;

        public m(UserId userId) {
            this.c = userId;
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onComplete() {
            a aVar = a.this;
            HashSet hashSet = aVar.t;
            UserId userId = this.c;
            hashSet.add(userId);
            cvk.u(R.string.live_comment_user_banned, false);
            LiveStatNew liveStatNew = aVar.m;
            if (liveStatNew != null) {
                liveStatNew.a(userId);
            }
        }

        @Override // io.reactivex.rxjava3.core.v
        public final void onError(Throwable th) {
            cvk.u(R.string.live_comment_some_error, false);
        }

        @Override // io.reactivex.rxjava3.core.v
        public final /* bridge */ /* synthetic */ void onNext(Object obj) {
        }
    }

    public a(VideoOwner videoOwner, UserProfile userProfile, rpb rpbVar, boolean z) {
        this.b = fxc0.B().T();
        this.c = ymz.c();
        this.n = false;
        this.o = true;
        this.s = new e();
        this.t = new HashSet();
        this.f = userProfile;
        this.g = null;
        this.k = videoOwner;
        this.d = rpbVar;
        this.h = false;
        this.n = z;
        oyb oybVar = new oyb(this, false);
        this.e = oybVar;
        oybVar.g = z;
    }

    @Override // xsna.qpb
    public final boolean A0() {
        return this.o;
    }

    @Override // xsna.qpb
    public final void F1() {
        boolean z = !this.o;
        this.o = z;
        this.d.b1(z, true);
        this.p.n(this.o);
    }

    @Override // xsna.qpb
    public final void H0(UserId userId) {
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        if (fkq0.b(userId)) {
            rpb rpbVar = this.d;
            if (rpbVar != null) {
                rpbVar.C4(userId, new j(userId));
                return;
            }
            return;
        }
        this.c.getClass();
        m1 y0 = rsg0.y0(new eos(userId, 0), null, null, 3);
        k kVar = new k();
        y0.subscribe(kVar);
        this.i = kVar;
    }

    @Override // xsna.qpb
    public final void H1(UserId userId) {
        b0 E;
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        boolean b2 = fkq0.b(userId);
        ymz ymzVar = this.c;
        if (!b2) {
            ymzVar.getClass();
            m1 y0 = rsg0.y0(new yjs(userId, (String) null), null, null, 3);
            i iVar = new i();
            y0.subscribe(iVar);
            this.i = iVar;
            return;
        }
        UserId e2 = fkq0.e(userId);
        ymzVar.getClass();
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_JOIN;
        comFeatures.getClass();
        boolean a = com.vk.toggle.b.A.a(comFeatures);
        a.k kVar = io.reactivex.rxjava3.internal.functions.a.c;
        a.l lVar = io.reactivex.rxjava3.internal.functions.a.d;
        if (a) {
            E = rsg0.y0(yfb.y(yqu.a.b(null, null, null, null, fkq0.a(e2), null, null, null), new h2w(2)), null, null, 3).E(new xn(e2, 25), lVar, kVar, kVar);
        } else {
            boolean z = false;
            E = rsg0.y0(new gqu(e2, z, z, 120), null, null, 3).E(new ljs(e2, 4), lVar, kVar, kVar);
        }
        h hVar = new h();
        E.subscribe(hVar);
        this.i = hVar;
    }

    @Override // xsna.qpb
    public final void I0(LiveEventModel liveEventModel, boolean z) {
        boolean equals;
        rpb rpbVar = this.d;
        if (rpbVar != null) {
            UserId userId = liveEventModel.j;
            String str = liveEventModel.n;
            long j2 = liveEventModel.C;
            boolean z2 = false;
            if (this.g != null) {
                equals = this.k.f.I0().equals(userId);
            } else {
                UserProfile userProfile = this.f;
                equals = userProfile != null ? userProfile.c.equals(userId) : false;
            }
            boolean z3 = true;
            if (equals) {
                e eVar = this.s;
                if (!z) {
                    if (System.currentTimeMillis() - this.l >= 1500) {
                        for (Map.Entry<String, Long> entry : eVar.entrySet()) {
                            if (entry.getKey().equals(str) && j2 - entry.getValue().longValue() < 3000) {
                                z3 = false;
                            }
                        }
                    }
                    if (z2 || TextUtils.isEmpty(liveEventModel.n)) {
                    }
                    Q(liveEventModel);
                    this.e.x0(liveEventModel);
                    rpbVar.c4();
                    return;
                }
                this.l = System.currentTimeMillis();
                eVar.put(str, Long.valueOf(j2));
            }
            z2 = z3;
            if (z2) {
            }
        }
    }

    @Override // xsna.qpb
    public final void M1(UserId userId) {
        UserId userId2;
        t y0;
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        ymz ymzVar = this.c;
        Group group = this.g;
        if (group == null) {
            if (fkq0.d(userId)) {
                ymzVar.getClass();
                m1 y02 = rsg0.y0(new jn(userId, false), null, null, 3);
                b bVar = new b(userId);
                y02.subscribe(bVar);
                this.i = bVar;
                return;
            }
            return;
        }
        UserId userId3 = group.c;
        ymzVar.getClass();
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_BAN_USER;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            y0 = rsg0.y0(yfb.x(new zqu().t(userId3, userId)), null, null, 3).U(new ao(19));
            userId2 = userId;
        } else {
            userId2 = userId;
            y0 = rsg0.y0(new bpu(userId3, userId2, false, -1, 0, "", false), null, null, 3);
        }
        C1237a c1237a = new C1237a(userId2);
        y0.subscribe(c1237a);
        this.i = c1237a;
    }

    @Override // xsna.qpb
    public final void O0(int i2, String str) {
        int i3 = 0;
        this.e.H0(new fub(i2, i3), new gub(str, i3));
    }

    @Override // xsna.qpb
    public final void O1(LiveEventModel liveEventModel, VideoFile videoFile) {
        rpb rpbVar = this.d;
        if (rpbVar != null) {
            ucp ucpVar = ucp.a;
            Spannable spannable = (Spannable) ucp.i(liveEventModel.d() + " ");
            SpannableString spannableString = new SpannableString(rpbVar.getViewContext().getString(liveEventModel.e() ? R.string.live_announce_shared_female : R.string.live_announce_shared_male));
            SpannableString spannableString2 = new SpannableString(" " + ((Object) ucp.i(videoFile.getTitle())));
            spannable.setSpan(new ForegroundColorSpan(this.j), 0, spannable.length(), 0);
            spannable.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannable.length(), 0);
            spannableString2.setSpan(new ForegroundColorSpan(this.j), 0, spannableString2.length(), 0);
            spannableString2.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableString2.length(), 0);
            liveEventModel.q = TextUtils.concat(spannable, spannableString, spannableString2);
            this.e.x0(liveEventModel);
            rpbVar.c4();
        }
    }

    @Override // xsna.qpb
    public final void P0(LiveEventModel liveEventModel, boolean z) {
        rpb rpbVar = this.d;
        if (rpbVar == null || liveEventModel == null) {
            return;
        }
        Q(liveEventModel);
        rpbVar.N1(liveEventModel);
    }

    public final void Q(LiveEventModel liveEventModel) {
        if (this.k.f.I0().equals(liveEventModel.j)) {
            liveEventModel.s = true;
        }
        if (TextUtils.isEmpty(liveEventModel.q)) {
            ucp ucpVar = ucp.a;
            liveEventModel.q = ucp.i(xwk.d().a().d(liveEventModel.n, new LinksParserData(41739, (Bundle) null, 0, 0, (String) null, (String) null, 0, 0, LinksParserData.HashtagService.Video, (saz) null, 0, (taz) null, false, 15872)));
        }
        if (TextUtils.isEmpty(liveEventModel.r)) {
            ucp ucpVar2 = ucp.a;
            liveEventModel.r = ucp.i(liveEventModel.d().replace(" ", " "));
        }
    }

    @Override // xsna.qpb
    public final void S0(UserId userId) {
        LiveStatNew liveStatNew = this.m;
        if (liveStatNew != null) {
            Bundle a = q9k.a("action_type", "view_user_profile");
            a.putLong("recipient_user_id", userId.b);
            liveStatNew.b(a);
            qyk0.a().e("live_action", a);
        }
        xwk.e().m(this.d.getViewContext(), userId, new o0r0.a());
    }

    @Override // xsna.qpb
    public final void U1(int i2, UserId userId) {
        VideoOwner videoOwner;
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        if (this.m != null && (videoOwner = this.k) != null) {
            LiveStatNew.d(videoOwner.e, videoOwner.d, i2, CommonVideoStat$TypeLiveCommentActionsItem.Type.UNPIN_COMMENT);
        }
        q f2 = this.b.f(i2, userId);
        c cVar = new c();
        f2.subscribe(cVar);
        this.i = cVar;
    }

    public final void W(l2y0 l2y0Var) {
        this.q = l2y0Var;
    }

    @Override // xsna.qpb
    public final void W0(int i2, UserId userId, String str, boolean z) {
        LiveStatNew liveStatNew = this.m;
        if (liveStatNew != null) {
            if (z) {
                VideoOwner videoOwner = this.k;
                if (videoOwner != null) {
                    LiveStatNew.d(videoOwner.e, videoOwner.d, i2, CommonVideoStat$TypeLiveCommentActionsItem.Type.COPY_PINNED_COMMENT);
                }
            } else {
                Bundle a = q9k.a("action_type", "copy_comment");
                a.putLong("recipient_user_id", userId.b);
                liveStatNew.b(a);
                qyk0.a().e("live_action", a);
            }
        }
        mhy.a(e43.a, str);
        cvk.u(R.string.live_comment_copied, false);
    }

    @Override // xsna.qpb
    public final void Y1(LiveEventModel liveEventModel) {
        rpb rpbVar = this.d;
        if (rpbVar != null) {
            SpannableString spannableString = new SpannableString(rpbVar.getViewContext().getString(liveEventModel.e() ? R.string.live_announce_friend_enter_female1 : R.string.live_announce_friend_enter_male1));
            SpannableString spannableString2 = new SpannableString(rpbVar.getViewContext().getString(liveEventModel.e() ? R.string.live_announce_friend_enter_female2 : R.string.live_announce_friend_enter_male2));
            ucp ucpVar = ucp.a;
            Spannable spannable = (Spannable) ucp.i(" " + liveEventModel.d() + " ");
            spannable.setSpan(new ForegroundColorSpan(this.j), 0, spannable.length(), 0);
            spannable.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannable.length(), 0);
            liveEventModel.q = TextUtils.concat(spannableString, spannable, spannableString2);
            this.e.x0(liveEventModel);
            rpbVar.c4();
        }
    }

    @Override // xsna.qpb
    public final void c2(int i2, UserId userId) {
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        q v = this.b.v(i2, userId);
        jub jubVar = new jub(i2, userId, this);
        v.subscribe(jubVar);
        this.i = jubVar;
    }

    public final void d(jmz jmzVar, UserId userId, boolean z) {
        UserProfile userProfile;
        boolean z2 = this.h;
        Group group = this.g;
        if (z2) {
            VideoOwner videoOwner = this.k;
            if (userId.equals(videoOwner.e) || userId.equals(fkq0.e(videoOwner.e))) {
                jmzVar.g = false;
                jmzVar.h = false;
                jmzVar.i = true;
                jmzVar.f = false;
                jmzVar.d = false;
                jmzVar.b = false;
                jmzVar.j = false;
            } else if (group != null) {
                jmzVar.g = true;
                jmzVar.h = false;
                jmzVar.i = true;
                jmzVar.f = true;
                jmzVar.b = true;
                jmzVar.d = !this.t.contains(userId);
                jmzVar.j = false;
            } else {
                jmzVar.g = true;
                jmzVar.h = false;
                jmzVar.i = true;
                jmzVar.f = true;
                jmzVar.d = true;
                jmzVar.b = true;
                jmzVar.j = false;
            }
        } else if ((group == null || !userId.equals(fkq0.e(group.c))) && ((userProfile = this.f) == null || !userId.equals(userProfile.c))) {
            jmzVar.g = true;
            jmzVar.h = true;
            jmzVar.i = false;
            jmzVar.f = true;
            jmzVar.d = false;
            jmzVar.b = true;
            jmzVar.j = true;
        } else {
            jmzVar.g = false;
            jmzVar.h = false;
            jmzVar.i = true;
            jmzVar.f = false;
            jmzVar.d = false;
            jmzVar.b = false;
            jmzVar.j = false;
        }
        jmzVar.b = jmzVar.b && !z;
    }

    @Override // xsna.qpb
    public final void d1(int i2, UserId userId) {
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        q X = this.b.X(i2, userId);
        g gVar = new g(i2);
        X.subscribe(gVar);
        this.i = gVar;
    }

    @Override // xsna.qpb
    public final void g1(LiveEventModel liveEventModel) {
        this.e.C0(new he3(6, this, liveEventModel));
    }

    @Override // xsna.qpb
    public final boolean isStreaming() {
        return this.h;
    }

    @Override // xsna.qpb
    public final boolean l0() {
        return this.k.f.c0();
    }

    @Override // xsna.qpb
    public final boolean m0(int i2, UserId userId) {
        return this.b.m0(i2, userId);
    }

    @Override // xsna.qpb
    public final void m2(UserId userId) {
        UserId userId2;
        t y0;
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        ymz ymzVar = this.c;
        Group group = this.g;
        if (group == null) {
            if (fkq0.d(userId)) {
                ymzVar.getClass();
                m1 y02 = rsg0.y0(new jn(userId, true), null, null, 3);
                m mVar = new m(userId);
                y02.subscribe(mVar);
                this.i = mVar;
                return;
            }
            return;
        }
        UserId userId3 = group.c;
        ymzVar.getClass();
        ComFeatures comFeatures = ComFeatures.COM_CODEGEN_GROUPS_BAN_USER;
        comFeatures.getClass();
        if (com.vk.toggle.b.A.a(comFeatures)) {
            userId2 = userId;
            y0 = rsg0.y0(yfb.x(new zqu().y(fkq0.a(userId3), userId, -1, 0, "", Boolean.FALSE)), null, null, 3).U(new ao(19));
        } else {
            userId2 = userId;
            y0 = rsg0.y0(new bpu(userId3, userId2, true, -1, 0, "", false), null, null, 3);
        }
        l lVar = new l(userId2);
        y0.subscribe(lVar);
        this.i = lVar;
    }

    @Override // xsna.qpb
    public final void n0(LiveEventModel liveEventModel, Group group, UserProfile userProfile) {
        SpannableString spannableString;
        SpannableString spannableString2;
        rpb rpbVar = this.d;
        if (rpbVar != null) {
            ucp ucpVar = ucp.a;
            Spannable spannable = (Spannable) ucp.i(liveEventModel.d() + " ");
            if (fkq0.b(liveEventModel.d)) {
                spannableString2 = new SpannableString(rpbVar.getViewContext().getString(liveEventModel.e() ? R.string.live_announce_subscribed_group_female : R.string.live_announce_subscribed_group_male));
                spannableString = new SpannableString(" " + ((Object) ucp.i(group.d)));
            } else {
                SpannableString spannableString3 = new SpannableString(rpbVar.getViewContext().getString(liveEventModel.e() ? R.string.live_announce_subscribed_user_female : R.string.live_announce_subscribed_user_male));
                spannableString = new SpannableString(" " + ((Object) ucp.i(userProfile.e)));
                spannableString2 = spannableString3;
            }
            spannable.setSpan(new ForegroundColorSpan(this.j), 0, spannable.length(), 0);
            spannable.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannable.length(), 0);
            spannableString.setSpan(new ForegroundColorSpan(this.j), 0, spannableString.length(), 0);
            spannableString.setSpan(new TypefaceSpan("sans-serif-medium"), 0, spannableString.length(), 0);
            liveEventModel.q = TextUtils.concat(spannable, spannableString2, spannableString);
            this.e.x0(liveEventModel);
            rpbVar.c4();
        }
    }

    @Override // xsna.qpb
    public final void o0(LiveEventModel liveEventModel) {
        rpb rpbVar = this.d;
        if (rpbVar != null) {
            this.e.x0(liveEventModel);
            rpbVar.c4();
        }
    }

    @Override // xsna.qpb
    public final q p0(final int i2, final UserId userId, final boolean z) {
        VideoOwner videoOwner = this.k;
        q<VideoGetCommentsExtendedResponseDto> l2 = this.b.l(videoOwner.f.o0(), videoOwner.f.I0(), i2);
        this.c.getClass();
        return fkq0.b(userId) ? q.I0(l2, ymz.d(fkq0.e(userId)), new io.reactivex.rxjava3.functions.c() { // from class: xsna.cub
            @Override // io.reactivex.rxjava3.functions.c
            public final Object apply(Object obj, Object obj2) {
                VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto = (VideoGetCommentsExtendedResponseDto) obj;
                jmz jmzVar = new jmz();
                BaseLikesInfoDto l3 = videoGetCommentsExtendedResponseDto.f().get(0).l();
                com.vk.libvideo.live.impl.views.chat.a aVar = com.vk.libvideo.live.impl.views.chat.a.this;
                aVar.c.getClass();
                jmzVar.a = ymz.a((Group) obj2);
                jmzVar.e = false;
                jmzVar.c = l3 == null || l3.i() != BaseBoolIntDto.YES;
                aVar.t(jmzVar, videoGetCommentsExtendedResponseDto, i2);
                aVar.d(jmzVar, userId, z);
                return jmzVar;
            }
        }) : q.I0(l2, ymz.e(userId), new io.reactivex.rxjava3.functions.c() { // from class: xsna.dub
            @Override // io.reactivex.rxjava3.functions.c
            public final Object apply(Object obj, Object obj2) {
                VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto = (VideoGetCommentsExtendedResponseDto) obj;
                jmz jmzVar = new jmz();
                BaseLikesInfoDto l3 = videoGetCommentsExtendedResponseDto.f().get(0).l();
                com.vk.libvideo.live.impl.views.chat.a aVar = com.vk.libvideo.live.impl.views.chat.a.this;
                aVar.c.getClass();
                jmzVar.a = ymz.b((UserProfile) obj2);
                jmzVar.e = !r7.H;
                jmzVar.c = l3 == null || l3.i() != BaseBoolIntDto.YES;
                aVar.t(jmzVar, videoGetCommentsExtendedResponseDto, i2);
                aVar.d(jmzVar, userId, z);
                return jmzVar;
            }
        });
    }

    @Override // xsna.qpb
    public final void q0(UserId userId, CharSequence charSequence) {
        l2y0 l2y0Var = this.q;
        l2y0Var.u.o2(userId, charSequence);
        l2y0Var.u.k();
    }

    @Override // xsna.qpb
    public final void q2() {
        this.e.clear();
        this.d.f2();
    }

    @Override // xsna.qpb
    public final void r0(LiveEventModel liveEventModel) {
        this.e.B0(liveEventModel);
        rpb rpbVar = this.d;
        rpbVar.f2();
        rpbVar.update();
    }

    @Override // xsna.pk6
    public final void release() {
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        io.reactivex.rxjava3.disposables.c cVar = this.r;
        if (cVar != null) {
            cVar.dispose();
            this.r = null;
        }
    }

    @Override // xsna.qpb
    public final void s0(int i2, UserId userId) {
        LiveStatNew liveStatNew = this.m;
        if (liveStatNew != null) {
            Bundle a = q9k.a("action_type", "show_complain_comment_dialog");
            a.putLong("recipient_user_id", userId.b);
            liveStatNew.b(a);
            qyk0.a().e("live_action", a);
        }
        fxc0.B().y(this.d.getViewContext(), this.k.f, i2);
    }

    @Override // xsna.pk6
    public final void start() {
        rpb rpbVar = this.d;
        this.j = rpbVar.getViewContext().getColor(R.color.live_white_chat_transparent);
        rpbVar.setAdapter(this.e);
        rpbVar.d1();
        if (this.h) {
            return;
        }
        this.r = ((ModerationComponent) j6i.c(m7m.f(this), ModerationComponent.class)).uf().a().subscribe(new w00(this, 7));
    }

    public final void t(jmz jmzVar, VideoGetCommentsExtendedResponseDto videoGetCommentsExtendedResponseDto, final int i2) {
        boolean z = false;
        if (!this.h) {
            jmzVar.k = false;
            jmzVar.l = false;
            return;
        }
        List<WallWallCommentDto> j2 = videoGetCommentsExtendedResponseDto.j();
        if (j2 != null && !j2.isEmpty()) {
            z = j2.stream().anyMatch(new Predicate() { // from class: xsna.eub
                @Override // java.util.function.Predicate
                public final boolean test(Object obj) {
                    return ((WallWallCommentDto) obj).getId() == i2;
                }
            });
        }
        jmzVar.k = !z;
        jmzVar.l = z;
    }

    @Override // xsna.qpb
    public final void t0(int i2, UserId userId) {
        VideoOwner videoOwner;
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        if (this.m != null && (videoOwner = this.k) != null) {
            LiveStatNew.d(videoOwner.e, videoOwner.d, i2, CommonVideoStat$TypeLiveCommentActionsItem.Type.PIN_COMMENT);
        }
        q e2 = this.b.e(i2, userId);
        d dVar = new d();
        e2.subscribe(dVar);
        this.i = dVar;
    }

    @Override // xsna.qpb
    public final void u1(UserProfile userProfile) {
        this.f = userProfile;
    }

    @Override // xsna.qpb
    public final void y1(LiveEventModel liveEventModel) {
        rpb rpbVar = this.d;
        if (rpbVar == null || liveEventModel == null) {
            return;
        }
        rpbVar.V1();
    }

    @Override // xsna.qpb
    public final void z0(int i2, UserId userId, UserId userId2) {
        io.reactivex.rxjava3.observers.a aVar = this.i;
        if (aVar != null) {
            aVar.dispose();
            this.i = null;
        }
        q S = this.b.S(i2, userId);
        f fVar = new f(i2, userId2, this);
        S.subscribe(fVar);
        this.i = fVar;
    }

    public a(VideoOwner videoOwner, UserProfile userProfile, Group group, rpb rpbVar) {
        this.b = fxc0.B().T();
        this.c = ymz.c();
        this.n = false;
        this.o = true;
        this.s = new e();
        this.t = new HashSet();
        this.f = userProfile;
        this.g = group;
        this.k = videoOwner;
        this.d = rpbVar;
        this.h = true;
        this.e = new oyb(this, true);
    }

    @Override // xsna.pk6
    public final void pause() {
    }

    @Override // xsna.pk6
    public final void resume() {
    }
}
