package com.vk.newsfeed.impl.recycler.decorations.components.on_media_like;

import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Rect;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.id.UserId;
import com.vk.dto.newsfeed.Owner;
import com.vk.dto.newsfeed.entries.Post;
import com.vk.dto.newsfeed.entries.Videos;
import com.vk.dto.reactions.ReactionAsset;
import com.vk.dto.reactions.ReactionMeta;
import com.vk.dto.reactions.ReactionSet;
import com.vk.dto.user.UserSex;
import com.vk.feed.core.models.news.NewsEntry;
import com.vk.feed.design.view.newsfeed.list.FeedRecyclerView;
import com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.OnMediaUiComponentAnimationDelegate;
import com.vk.newsfeed.presentation.model.actions.NewsfeedExternalAction;
import com.vk.rlottie.RLottieDrawable;
import com.vk.stat.scheme.MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeView;
import com.vkontakte.android.R;
import com.vkontakte.android.VKApplication;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.disposables.b;
import io.reactivex.rxjava3.internal.operators.observable.m1;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.Iterator;
import java.util.Map;
import java.util.concurrent.Callable;
import java.util.concurrent.TimeUnit;
import kotlin.LazyThreadSafetyMode;
import kotlin.NoWhenBranchMatchedException;
import xsna.a5u0;
import xsna.an10;
import xsna.asu0;
import xsna.b2r;
import xsna.bvt0;
import xsna.c2f0;
import xsna.c7r0;
import xsna.ccr0;
import xsna.cn70;
import xsna.cqv;
import xsna.cr20;
import xsna.cww;
import xsna.di60;
import xsna.e880;
import xsna.epx;
import xsna.g13;
import xsna.g880;
import xsna.gc;
import xsna.h880;
import xsna.hi60;
import xsna.i880;
import xsna.io60;
import xsna.k9q0;
import xsna.l8g;
import xsna.lz;
import xsna.m960;
import xsna.msy;
import xsna.n880;
import xsna.nl30;
import xsna.nly;
import xsna.o99;
import xsna.os30;
import xsna.p4r;
import xsna.p880;
import xsna.pi0;
import xsna.px30;
import xsna.pyp0;
import xsna.qi6;
import xsna.qr80;
import xsna.qyp0;
import xsna.rqi;
import xsna.wnt;
import xsna.x0;
import xsna.xj50;
import xsna.y8g0;

/* compiled from: OnMediaLikeUiComponent.kt */
/* loaded from: classes4.dex */
public final class a implements pyp0 {
    public final Object A;
    public final Object B;
    public RLottieDrawable C;
    public final h880 D;
    public final nl30 E;
    public final int a = cn70.b(40);
    public final int b = cn70.b(40);
    public int c = -1;
    public boolean d;
    public final a5u0.a e;
    public final int f;
    public int g;
    public b2r h;
    public View i;
    public i880 j;
    public boolean k;
    public hi60 l;
    public String m;
    public NewsEntry n;
    public n880 o;
    public boolean p;
    public boolean q;
    public int r;
    public int s;
    public int t;
    public final Paint u;
    public final Paint v;
    public final Rect w;
    public final b x;
    public final OnMediaUiComponentAnimationDelegate y;
    public final Object z;

    /* compiled from: OnMediaLikeUiComponent.kt */
    /* renamed from: com.vk.newsfeed.impl.recycler.decorations.components.on_media_like.a$a, reason: collision with other inner class name */
    public static final /* synthetic */ class C1404a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;
        public static final /* synthetic */ int[] $EnumSwitchMapping$1;

        static {
            int[] iArr = new int[OnMediaLikeUiComponent$Companion$Position.values().length];
            try {
                iArr[OnMediaLikeUiComponent$Companion$Position.FIRST.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[OnMediaLikeUiComponent$Companion$Position.SINGLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[OnMediaLikeUiComponent$Companion$Position.SECOND.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
            int[] iArr2 = new int[UserSex.values().length];
            try {
                iArr2[UserSex.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused4) {
            }
            try {
                iArr2[UserSex.FEMALE.ordinal()] = 2;
            } catch (NoSuchFieldError unused5) {
            }
            try {
                iArr2[UserSex.MALE.ordinal()] = 3;
            } catch (NoSuchFieldError unused6) {
            }
            $EnumSwitchMapping$1 = iArr2;
        }
    }

    public a() {
        View.generateViewId();
        this.d = true;
        this.e = new a5u0.a(new io60(this, 5), new g13(18));
        this.f = 8388691;
        this.g = cn70.b(12);
        this.t = cn70.b(20);
        Paint b = rqi.b(1, 0);
        b.setShadowLayer(cn70.a() * 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, l8g.f(0.12f, -16777216));
        this.u = b;
        Paint b2 = rqi.b(1, 0);
        b2.setShadowLayer(cn70.a() * 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, cn70.a() * 16.0f, l8g.f(0.16f, -16777216));
        this.v = b2;
        this.w = new Rect();
        this.x = new b();
        this.y = new OnMediaUiComponentAnimationDelegate(new g880(this, 0), new m960(this, 5), new cr20(this, 14));
        gc gcVar = new gc(23);
        LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.NONE;
        this.z = msy.a(lazyThreadSafetyMode, gcVar);
        this.A = msy.a(lazyThreadSafetyMode, new os30(this, 9));
        this.B = msy.a(lazyThreadSafetyMode, new x0(28));
        this.D = new h880(this);
        this.E = new nl30(this, 10);
    }

    @Override // xsna.pyp0
    public final boolean a(float f, float f2) {
        FeedRecyclerView feedRecyclerView;
        if (!this.p) {
            return false;
        }
        float f3 = this.r - f;
        this.r = an10.b(f3);
        this.s = an10.b(this.s - f2);
        if (!this.q && p()) {
            this.q = true;
            b2r b2rVar = this.h;
            if (b2rVar != null && (feedRecyclerView = b2rVar.b) != null) {
                feedRecyclerView.performHapticFeedback(0);
            }
        }
        return true;
    }

    @Override // xsna.pyp0
    public final int b() {
        return this.c;
    }

    @Override // xsna.pyp0
    public final int c() {
        return this.f;
    }

    @Override // xsna.pyp0
    public final void d(b2r b2rVar) {
        this.h = b2rVar;
    }

    /* JADX WARN: Type inference failed for: r0v5, types: [java.lang.Object, java.util.Map] */
    @Override // xsna.pyp0
    public final void detach() {
        if (this.k) {
            n880 n880Var = this.o;
            if (n880Var != null) {
                n880Var.Y0(this.E);
            }
            RLottieDrawable rLottieDrawable = this.C;
            if (rLottieDrawable != null) {
                rLottieDrawable.i();
            }
            RLottieDrawable rLottieDrawable2 = this.C;
            if (rLottieDrawable2 != null) {
                rLottieDrawable2.k();
            }
            Iterator it = this.y.i.entrySet().iterator();
            while (it.hasNext()) {
                ((OnMediaUiComponentAnimationDelegate.b) ((Map.Entry) it.next()).getValue()).c();
            }
            ccr0 o = o();
            if (o != null) {
                o.t();
            }
            this.x.e();
            this.C = null;
            this.l = null;
            this.h = null;
            this.i = null;
            this.k = false;
            this.q = false;
            this.p = false;
            this.s = 0;
            this.r = 0;
        }
    }

    /* JADX WARN: Type inference failed for: r5v7, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pyp0
    public final void draw(Canvas canvas) {
        Paint paint = this.v;
        Paint paint2 = this.u;
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.y;
        Rect rect = this.w;
        if (this.d) {
            int save = canvas.save();
            try {
                View view = this.i;
                if (view != null) {
                    canvas.clipRect(view.getLeft(), view.getTop(), view.getRight(), view.getBottom());
                }
                OnMediaUiComponentAnimationDelegate.e eVar = onMediaUiComponentAnimationDelegate.f;
                OnMediaUiComponentAnimationDelegate.e eVar2 = onMediaUiComponentAnimationDelegate.f;
                canvas.translate(eVar.a, eVar.b);
                canvas.scale(onMediaUiComponentAnimationDelegate.a(), onMediaUiComponentAnimationDelegate.a(), rect.exactCenterX() + eVar2.a, rect.exactCenterY() + eVar2.b);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), cn70.a() * 19.0f, paint2);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), cn70.a() * 19.0f, paint);
                canvas.drawCircle(rect.exactCenterX(), rect.exactCenterY(), cn70.a() * 19.0f, (Paint) this.B.getValue());
                ccr0 o = o();
                if (o != null) {
                    o.setBounds(rect);
                }
                ccr0 o2 = o();
                if (o2 != null) {
                    o2.draw(canvas);
                }
                float a = cn70.a() * 22.0f;
                float a2 = cn70.a() * 21.0f;
                save = canvas.save();
                canvas.translate(a, a2);
                try {
                    RLottieDrawable rLottieDrawable = this.C;
                    if (rLottieDrawable != null) {
                        rLottieDrawable.setBounds(rect);
                    }
                    RLottieDrawable rLottieDrawable2 = this.C;
                    if (rLottieDrawable2 != null) {
                        rLottieDrawable2.draw(canvas);
                    }
                    canvas.restoreToCount(save);
                    canvas.restoreToCount(save);
                } finally {
                    canvas.restoreToCount(save);
                }
            } catch (Throwable th) {
                throw th;
            }
        }
    }

    @Override // xsna.pyp0
    public final void e() {
        if (p()) {
            b2r b2rVar = this.h;
            if (b2rVar != null) {
                b2rVar.m(new px30(this, 11));
                return;
            }
            return;
        }
        int i = this.r;
        int i2 = this.s;
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.y;
        OnMediaUiComponentAnimationDelegate.f fVar = onMediaUiComponentAnimationDelegate.g;
        fVar.a = i;
        fVar.b = i2;
        OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.RETURN, null, 6);
        this.q = false;
        this.p = false;
        this.s = 0;
        this.r = 0;
    }

    @Override // xsna.pyp0
    public final void f(View view) {
        this.i = view;
    }

    @Override // xsna.pyp0
    public final void g(int i) {
        this.c = i;
    }

    @Override // xsna.pyp0
    public final int getHeight() {
        return this.b;
    }

    @Override // xsna.pyp0
    public final int getPaddingBottom() {
        p880 state;
        if (this.k) {
            return this.t + this.y.h.a;
        }
        int i = this.t;
        n880 n880Var = this.o;
        return i + ((n880Var == null || (state = n880Var.getState()) == null) ? 0 : state.b);
    }

    @Override // xsna.pyp0
    public final int getPaddingStart() {
        return this.g;
    }

    @Override // xsna.pyp0
    public final int getWidth() {
        return this.a;
    }

    @Override // xsna.pyp0
    public final void h() {
        this.p = true;
    }

    @Override // xsna.pyp0
    public final void hide() {
        OnMediaUiComponentAnimationDelegate.c(this.y, OnMediaUiComponentAnimationDelegate.AnimationType.DISAPPEAR, new nly(this, 20), 2);
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.pyp0
    public final boolean i(qyp0 qyp0Var, RecyclerView.e0 e0Var) {
        NewsEntry H0;
        i880 i880Var = qyp0Var instanceof i880 ? (i880) qyp0Var : null;
        if (i880Var == null) {
            return false;
        }
        n880 n880Var = e0Var instanceof n880 ? (n880) e0Var : null;
        return n880Var != null && (H0 = n880Var.H0()) != null && epx.f(k9q0.o(H0), i880Var.b) && di60.n(H0) == i880Var.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0193  */
    /* JADX WARN: Removed duplicated region for block: B:61:0x01b4  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0297  */
    /* JADX WARN: Type inference failed for: r2v11, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.pyp0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final void j(qyp0 qyp0Var, RecyclerView.e0 e0Var) {
        int i;
        int i2;
        int i3;
        i880 i880Var;
        b2r b2rVar;
        ccr0 o;
        FeedRecyclerView feedRecyclerView;
        ccr0 o2;
        OnMediaLikeUiComponent$Companion$Position onMediaLikeUiComponent$Companion$Position;
        NewsEntry.TrackData Cb;
        NewsEntry newsEntry;
        Post R;
        ReactionSet reactionSet;
        ReactionMeta d;
        ReactionAsset d2;
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.y;
        if (this.k) {
            return;
        }
        i880 i880Var2 = qyp0Var instanceof i880 ? (i880) qyp0Var : null;
        if (i880Var2 == null) {
            return;
        }
        Owner owner = i880Var2.e;
        n880 n880Var = e0Var instanceof n880 ? (n880) e0Var : null;
        if (n880Var == null) {
            return;
        }
        this.n = n880Var.H0();
        p880 state = n880Var.getState();
        this.d = !state.a;
        this.o = n880Var;
        qi6 qi6Var = n880Var instanceof qi6 ? (qi6) n880Var : null;
        this.l = qi6Var != null ? qi6Var.i6() : null;
        onMediaUiComponentAnimationDelegate.b(state.b, false);
        OnMediaUiComponentAnimationDelegate.e eVar = onMediaUiComponentAnimationDelegate.f;
        OnMediaUiComponentAnimationDelegate.a aVar = onMediaUiComponentAnimationDelegate.d;
        n880Var.i2(this.E);
        this.j = i880Var2;
        String str = i880Var2.g;
        if (str == null) {
            NewsEntry newsEntry2 = this.n;
            str = ((newsEntry2 != null ? di60.R(newsEntry2) : null) == null || (newsEntry = this.n) == null || (R = di60.R(newsEntry)) == null || (reactionSet = R.V) == null || (d = c2f0.d(reactionSet, 0)) == null || (d2 = d.d()) == null) ? null : d2.b;
        }
        OnMediaLikeUiComponent$Companion$Position onMediaLikeUiComponent$Companion$Position2 = i880Var2.d;
        String str2 = owner.e;
        ccr0 o3 = o();
        if (o3 != null) {
            o3.r(str2);
        }
        int i4 = 16;
        int i5 = 2;
        if (str != null) {
            b bVar = this.x;
            if (this.C == null) {
                final String str3 = this.m;
                final int b = cn70.b(24);
                if (str3 != null) {
                    v vVar = new v(new Callable() { // from class: xsna.d880
                        @Override // java.util.concurrent.Callable
                        public final Object call() {
                            String str4 = str3;
                            int i6 = b;
                            RLottieDrawable rLottieDrawable = new RLottieDrawable(str4, "animated_reaction_like_on_photo", i6, i6, null, false, false, null, 496);
                            rLottieDrawable.i();
                            rLottieDrawable.k.q = 2;
                            rLottieDrawable.setCallback(this.D);
                            return rLottieDrawable;
                        }
                    });
                    asu0 asu0Var = asu0.a;
                    i = 16;
                    bVar.b(vVar.q(asu0Var.c()).m(asu0Var.d()).subscribe(new wnt(new cqv(this, 26), i4), new xj50(new o99(com.vk.metrics.eventtracking.b.a, 9), i5)));
                } else {
                    i = 16;
                    q h = c7r0.h(str);
                    asu0 asu0Var2 = asu0.a;
                    m1 a0 = h.a0(asu0Var2.c());
                    e880 e880Var = new e880(b);
                    int i6 = 28;
                    bVar.b(a0.U(new pi0(e880Var, i6)).a0(asu0Var2.d()).subscribe(new lz(new cww(this, 22), i6)));
                }
                int[] iArr = C1404a.$EnumSwitchMapping$0;
                i2 = iArr[onMediaLikeUiComponent$Companion$Position2.ordinal()];
                if (i2 != 1 || i2 == 2) {
                    this.g = cn70.b(i);
                    this.t = cn70.b(20);
                    aVar.c.setStartDelay(250L);
                    eVar.i.setStartDelay(0L);
                } else {
                    if (i2 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                    this.g = cn70.b(56);
                    this.t = cn70.b(44);
                    aVar.c.setStartDelay(417L);
                    eVar.i.setStartDelay(167L);
                }
                BuildInfo.Client client = BuildInfo.a;
                VKApplication vKApplication = com.vk.core.apps.a.a;
                BuildInfo.h();
                i3 = C1404a.$EnumSwitchMapping$1[owner.l.ordinal()];
                int i7 = R.string.accessibility_on_media_like_m;
                if (i3 != 1) {
                    if (i3 == 2) {
                        i7 = R.string.accessibility_on_media_like_f;
                    } else if (i3 != 3) {
                        throw new NoWhenBranchMatchedException();
                    }
                }
                n880Var.s4(y8g0.f(i7, owner.c));
                i880Var = this.j;
                if (i880Var != null) {
                    if (i880Var.f) {
                        OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.APPEAR, null, 6);
                        b2r b2rVar2 = this.h;
                        if (b2rVar2 != null) {
                            b2rVar2.q(i880Var, new i880(i880Var.b, i880Var.c, i880Var.d, i880Var.e, false, i880Var.g));
                        }
                        i880 i880Var3 = this.j;
                        if (i880Var3 != null && (onMediaLikeUiComponent$Companion$Position = i880Var3.d) != OnMediaLikeUiComponent$Companion$Position.SECOND) {
                            int i8 = iArr[onMediaLikeUiComponent$Companion$Position.ordinal()];
                            int i9 = i8 != 1 ? i8 != 2 ? 0 : 1 : 2;
                            p4r p4rVar = (p4r) this.z.getValue();
                            long j = i880Var3.c;
                            UserId userId = i880Var3.b;
                            long j2 = i9;
                            NewsEntry newsEntry3 = this.n;
                            String str4 = (newsEntry3 == null || (Cb = newsEntry3.Cb()) == null) ? null : Cb.b;
                            boolean z = this.n instanceof Videos;
                            p4rVar.getClass();
                            String valueOf = String.valueOf(TimeUnit.MILLISECONDS.toMicros(System.currentTimeMillis()));
                            UiTracker uiTracker = UiTracker.a;
                            new bvt0(UiTracker.c(), SchemeStat$TypeView.a.b(new SchemeStat$EventItem(z ? SchemeStat$EventItem.Type.CLIP : SchemeStat$EventItem.Type.POST, Long.valueOf(j), Long.valueOf(userId.b), null, str4, null, 40, null), valueOf, valueOf, null, new MobileOfficialAppsFeedStat$TypeFeedShowFriendsLikesIcon(j2), 8)).q();
                        }
                    } else {
                        OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.APPEAR, null, 4);
                    }
                    OnMediaUiComponentAnimationDelegate.c(onMediaUiComponentAnimationDelegate, OnMediaUiComponentAnimationDelegate.AnimationType.MOVEMENT, null, 6);
                }
                b2rVar = this.h;
                if (b2rVar != null && (feedRecyclerView = b2rVar.b) != null && (o2 = o()) != null) {
                    o2.q(feedRecyclerView);
                }
                o = o();
                if (o != null) {
                    o.s();
                }
                this.k = true;
            }
        }
        i = 16;
        int[] iArr2 = C1404a.$EnumSwitchMapping$0;
        i2 = iArr2[onMediaLikeUiComponent$Companion$Position2.ordinal()];
        if (i2 != 1) {
        }
        this.g = cn70.b(i);
        this.t = cn70.b(20);
        aVar.c.setStartDelay(250L);
        eVar.i.setStartDelay(0L);
        BuildInfo.Client client2 = BuildInfo.a;
        VKApplication vKApplication2 = com.vk.core.apps.a.a;
        BuildInfo.h();
        i3 = C1404a.$EnumSwitchMapping$1[owner.l.ordinal()];
        int i72 = R.string.accessibility_on_media_like_m;
        if (i3 != 1) {
        }
        n880Var.s4(y8g0.f(i72, owner.c));
        i880Var = this.j;
        if (i880Var != null) {
        }
        b2rVar = this.h;
        if (b2rVar != null) {
            o2.q(feedRecyclerView);
        }
        o = o();
        if (o != null) {
        }
        this.k = true;
    }

    @Override // xsna.pyp0
    public final a5u0 k() {
        return this.e;
    }

    @Override // xsna.pyp0
    public final boolean l(float f, float f2) {
        if (this.d) {
            return this.w.contains((int) f, (int) f2);
        }
        return false;
    }

    @Override // xsna.pyp0
    public final boolean m(float f, float f2) {
        if (!this.d) {
            return false;
        }
        if (!this.w.contains((int) f, (int) f2)) {
            return false;
        }
        NewsEntry newsEntry = this.n;
        if (newsEntry != null) {
            qr80.g gVar = qr80.g.a;
            hi60 hi60Var = this.l;
            if (hi60Var != null) {
                hi60Var.sa(new NewsfeedExternalAction.Navigation.b.c(newsEntry, gVar));
            }
        }
        return true;
    }

    @Override // xsna.pyp0
    public final void n(int i, int i2, int i3, int i4) {
        Rect rect = this.w;
        rect.set(i, i3, i2, i4);
        boolean z = this.p;
        OnMediaUiComponentAnimationDelegate onMediaUiComponentAnimationDelegate = this.y;
        rect.offset(z ? this.r : an10.b(onMediaUiComponentAnimationDelegate.g.a), this.p ? this.s : an10.b(onMediaUiComponentAnimationDelegate.g.b));
    }

    /* JADX WARN: Type inference failed for: r0v0, types: [java.lang.Object, kotlin.Lazy] */
    public final ccr0 o() {
        return (ccr0) this.A.getValue();
    }

    public final boolean p() {
        float f = this.r;
        float f2 = this.s;
        float f3 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f;
        float f4 = UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT - f2;
        return ((float) Math.sqrt((double) ((f4 * f4) + (f3 * f3)))) > ((float) ((this.a * 2) / 3));
    }
}
