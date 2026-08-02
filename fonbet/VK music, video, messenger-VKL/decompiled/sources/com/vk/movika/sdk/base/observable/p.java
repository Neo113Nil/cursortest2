package com.vk.movika.sdk.base.observable;

import android.graphics.PointF;
import android.graphics.RectF;
import android.widget.FrameLayout;
import android.widget.Toast;
import com.unity3d.services.UnityAdsConstants;
import com.vk.api.generated.auth.dto.AuthExchangeTokenInfoDto;
import com.vk.api.generated.users.dto.UsersExchangeUserDto;
import com.vk.api.sdk.auth.AccountProfileType;
import com.vk.channels.api.Channel;
import com.vk.channels.api.ChannelFilter;
import com.vk.clips.design.view.feed.item.owner.ClipSubscribeBtnView;
import com.vk.clips.sdk.shared.feed.model.FeedItem;
import com.vk.clips.sdk.shared.item.ads.events.AdsItemViewEvent;
import com.vk.clips.sdk.shared.item.common.restriction.RestrictionOverlayRenderDelegate;
import com.vk.clips.sdk.stats.pixels.models.AdStatPixel;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.fragments.FragmentImpl;
import com.vk.dto.common.id.UserId;
import com.vk.dto.group.Group;
import com.vk.ecomm.cart.impl.cart.CartFragment;
import com.vk.ecomm.cart.impl.cart.a;
import com.vk.editor.timeline.entity.Edge;
import com.vk.im.channelcreation.impl.j;
import com.vk.im.engine.internal.merge.messages.MessagesMergerInput;
import com.vk.im.engine.models.channels.ChannelNotificationsSettings;
import com.vk.im.engine.models.events.channels.OnChannelsCacheInvalidateEvent;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.engine.models.reporters.ReporterType;
import com.vk.notifications.settings.CommunitiesManageNotificationsFragment;
import com.vk.notifications.settings.CommunityNotificationSettingsFragment;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.superapp.api.dto.auth.UserItem;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import io.reactivex.rxjava3.internal.operators.observable.g0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import java.util.UUID;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import xsna.a3i;
import xsna.aeb;
import xsna.al6;
import xsna.ao8;
import xsna.bdb;
import xsna.byc;
import xsna.c2r0;
import xsna.c5g;
import xsna.cau0;
import xsna.ckt0;
import xsna.dcf0;
import xsna.e43;
import xsna.epx;
import xsna.ey0;
import xsna.f4m;
import xsna.fh8;
import xsna.fkq0;
import xsna.fm50;
import xsna.gg1;
import xsna.gm50;
import xsna.gp6;
import xsna.gz9;
import xsna.h9;
import xsna.hg;
import xsna.i280;
import xsna.i2b;
import xsna.i9b;
import xsna.ij5;
import xsna.isa;
import xsna.it80;
import xsna.izs;
import xsna.j5g;
import xsna.j7h;
import xsna.jd0;
import xsna.jr0;
import xsna.ka0;
import xsna.kd0;
import xsna.ld0;
import xsna.m8v;
import xsna.mhy;
import xsna.mwo0;
import xsna.n280;
import xsna.o280;
import xsna.o9b;
import xsna.ot1;
import xsna.p4g;
import xsna.par0;
import xsna.pj4;
import xsna.pn00;
import xsna.qcy;
import xsna.qfb;
import xsna.qhk;
import xsna.qi0;
import xsna.qq1;
import xsna.qw4;
import xsna.rd1;
import xsna.rew0;
import xsna.rfb;
import xsna.ri0;
import xsna.rq1;
import xsna.s3q0;
import xsna.s4a0;
import xsna.s8;
import xsna.scf0;
import xsna.sfb;
import xsna.shh0;
import xsna.sk;
import xsna.sr0;
import xsna.sxp;
import xsna.t9b;
import xsna.ti0;
import xsna.tj50;
import xsna.tx;
import xsna.ucd;
import xsna.ux0;
import xsna.uy0;
import xsna.v5d;
import xsna.v8;
import xsna.va9;
import xsna.vf0;
import xsna.w280;
import xsna.w2w;
import xsna.w5w0;
import xsna.w6d;
import xsna.wgb;
import xsna.wh50;
import xsna.wpp;
import xsna.x24;
import xsna.x2i;
import xsna.xm1;
import xsna.xwr;
import xsna.y080;
import xsna.yh;
import xsna.yp80;
import xsna.ypg;
import xsna.ysg0;
import xsna.ywo0;
import xsna.zjw0;
import xsna.zld;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Code restructure failed: missing block: B:252:0x06ab, code lost:
    
        if (r2.getDuration() > (r3.b + r3.d)) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:253:0x06f2, code lost:
    
        r4.a(new xsna.shh0(r5, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new android.graphics.PointF(r1, com.unity3d.services.UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
     */
    /* JADX WARN: Code restructure failed: missing block: B:259:0x06c3, code lost:
    
        if (r11.f == com.vk.editor.timeline.entity.Edge.Left) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:265:0x06e1, code lost:
    
        if (r11.f == com.vk.editor.timeline.entity.Edge.Right) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:270:0x06f0, code lost:
    
        if (r11.f == com.vk.editor.timeline.entity.Edge.Left) goto L273;
     */
    /* JADX WARN: Code restructure failed: missing block: B:279:0x0756, code lost:
    
        if (r2.getDuration() > (r3.b + r3.d)) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:288:0x0772, code lost:
    
        if (r2 == com.vk.editor.timeline.entity.Edge.Left) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:294:0x0790, code lost:
    
        if (r11.f == com.vk.editor.timeline.entity.Edge.Left) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:299:0x07a6, code lost:
    
        if (r11.f == com.vk.editor.timeline.entity.Edge.Right) goto L304;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x010c, code lost:
    
        if (r11.Go(r2) == false) goto L39;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r12v2, types: [com.vk.superapp.api.dto.auth.UserItem] */
    /* JADX WARN: Type inference failed for: r1v76, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r2v79, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.izs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj) {
        UserId f;
        Object obj2;
        String e;
        String str;
        aeb aebVar;
        int i = this.b;
        int i2 = 14;
        int i3 = 2;
        boolean z = true;
        int i4 = 0;
        Object obj3 = this.c;
        switch (i) {
            case 0:
                ((com.vk.movika.sdk.base.listener.h) obj).h((com.vk.movika.sdk.base.model.l) obj3);
                return s3q0.a;
            case 1:
                jd0 jd0Var = (jd0) obj;
                kd0.a aVar = ((ld0) obj3).b;
                if (aVar != null) {
                    aVar.a(jd0Var);
                }
                return s3q0.a;
            case 2:
                ti0 ti0Var = (ti0) obj3;
                List<AdStatPixel> list = (List) obj;
                ArrayList arrayList = new ArrayList(c5g.u(list, 10));
                for (AdStatPixel adStatPixel : list) {
                    int i5 = 0;
                    arrayList.add(new io.reactivex.rxjava3.internal.operators.completable.v(new io.reactivex.rxjava3.internal.operators.completable.m(new qi0(i5, ti0Var, adStatPixel)).i(new v8(new ri0(i5, ti0Var, adStatPixel), i3)), io.reactivex.rxjava3.internal.functions.a.g).q(io.reactivex.rxjava3.schedulers.a.b()));
                }
                return io.reactivex.rxjava3.core.a.m(arrayList);
            case 3:
                ((jr0) obj3).T(new sr0.g());
                return s3q0.a;
            case 4:
                ux0 ux0Var = (ux0) obj3;
                if (uy0.a.$EnumSwitchMapping$1[((RestrictionOverlayRenderDelegate.RestrictionOverlayAction) obj).ordinal()] != 1) {
                    throw new NoWhenBranchMatchedException();
                }
                ux0Var.a(AdsItemViewEvent.m.b);
                return s3q0.a;
            case 5:
                return Boolean.valueOf(((s4a0) obj).a == ((gg1) obj3).o);
            case 6:
                com.vk.photos.root.albumdetails.presentation.h hVar = (com.vk.photos.root.albumdetails.presentation.h) obj3;
                tj50.a aVar2 = (tj50.a) obj;
                com.vk.photos.root.albumdetails.presentation.g gVar = new com.vk.photos.root.albumdetails.presentation.g(1, hVar, com.vk.photos.root.albumdetails.presentation.h.class, "composeHeaderState", "composeHeaderState(Lcom/vk/photos/root/albumdetails/presentation/AlbumDetailsState;)Lcom/vk/photos/root/albumdetails/presentation/AlbumDetailsViewState$HeaderState;", 0);
                ao8 ao8Var = ao8.d;
                return new k.d(aVar2.a(gVar, ao8Var), aVar2.a(new s8(hVar, 1), ao8Var));
            case 7:
                qq1 qq1Var = (qq1) obj3;
                qq1Var.c.setIsShow(false);
                qq1Var.d.setVisibility(0);
                gm50.a.a(qq1Var, ((rq1.a) obj).a, new q(qq1Var, 4));
                return s3q0.a;
            case 8:
                yp80 yp80Var = (yp80) obj3;
                Throwable th = (Throwable) obj;
                if (yp80Var != null) {
                    yp80Var.onError(th);
                }
                return s3q0.a;
            case 9:
                x24 x24Var = (x24) obj3;
                if (!((Boolean) obj).booleanValue()) {
                    mhy.d(x24Var.b);
                }
                return s3q0.a;
            case 10:
                return ((qw4) obj3).d();
            case 11:
                ij5 ij5Var = (ij5) obj3;
                shh0 shh0Var = (shh0) obj;
                float f2 = shh0Var.b;
                gp6 gp6Var = shh0Var.a;
                if (f2 != UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT || (gp6Var instanceof ckt0)) {
                    float f3 = shh0Var.c.x;
                    ysg0<shh0> ysg0Var = ij5Var.c;
                    qhk.b bVar = ij5Var.b;
                    int i6 = ij5.j;
                    int i7 = ij5.k;
                    mwo0 mwo0Var = ij5Var.a;
                    int i8 = ij5.a.$EnumSwitchMapping$0[ij5Var.f.ordinal()];
                    float f4 = i8 != 1 ? i8 != 2 ? 0.0f : gp6Var.u().left : gp6Var.u().right;
                    ywo0 ywo0Var = mwo0Var.d;
                    RectF rectF = ywo0Var.o;
                    float f5 = rectF.left;
                    float f6 = ij5.h;
                    if (f3 < f5 + f6) {
                        int min = Math.min(i7, Math.max(((int) Math.abs(f5 - f3)) / 50, i6));
                        ij5Var.e = min;
                        bVar.invoke(ij5Var.f, gp6Var, Float.valueOf(min), Float.valueOf(f4));
                        ywo0Var.k(-min, 0);
                        if (gp6Var instanceof ckt0) {
                            if (gp6Var != null) {
                                ckt0 ckt0Var = (ckt0) gp6Var;
                                long duration = ckt0Var.getDuration();
                                ckt0 ckt0Var2 = (ckt0) gp6Var;
                                long j = ckt0Var2.g;
                                RectF rectF2 = ckt0Var2.l;
                                if (duration < j) {
                                    break;
                                }
                                if (ywo0Var.f.indexOf(gp6Var) == 0) {
                                    if (rectF2.left <= rectF.centerX()) {
                                        break;
                                    }
                                }
                                if (ywo0Var.f.indexOf(gp6Var) == e43.h(ywo0Var.f)) {
                                    if (rectF2.left <= rectF.centerX()) {
                                        break;
                                    }
                                }
                            }
                            mwo0Var.a();
                        } else {
                            if (gp6Var.H() == 0) {
                                break;
                            }
                            mwo0Var.a();
                        }
                    } else {
                        float f7 = rectF.right;
                        if (f3 > f7 - f6) {
                            int min2 = Math.min(i7, Math.max(((int) (f3 - f7)) / 50, i6));
                            ij5Var.e = min2;
                            bVar.invoke(ij5Var.f, gp6Var, Float.valueOf(-min2), Float.valueOf(f4));
                            ywo0Var.k(min2, 0);
                            if (gp6Var instanceof ckt0) {
                                if (gp6Var != null) {
                                    ckt0 ckt0Var3 = (ckt0) gp6Var;
                                    long duration2 = ckt0Var3.getDuration();
                                    ckt0 ckt0Var4 = (ckt0) gp6Var;
                                    long j2 = ckt0Var4.g;
                                    RectF rectF3 = ckt0Var4.l;
                                    if (duration2 < j2) {
                                        break;
                                    }
                                    if (ywo0Var.f.indexOf(gp6Var) == 0) {
                                        if (rectF3.right >= rectF.centerX()) {
                                            Edge edge = ij5Var.f;
                                            if (edge != Edge.Right) {
                                                break;
                                            }
                                            ysg0Var.a(new shh0(gp6Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new PointF(f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)));
                                        }
                                    }
                                    if (ywo0Var.f.indexOf(gp6Var) == e43.h(ywo0Var.f)) {
                                        if (rectF3.right >= rectF.centerX()) {
                                            break;
                                        }
                                    }
                                }
                                mwo0Var.a();
                            } else {
                                if (gp6Var.getDuration() + gp6Var.H() >= ywo0Var.e) {
                                    break;
                                }
                                mwo0Var.a();
                            }
                        }
                    }
                } else {
                    mwo0 mwo0Var2 = ij5Var.a;
                    ywo0 ywo0Var2 = mwo0Var2.d;
                    int i9 = ywo0Var2.a;
                    if (i9 > 0 && i9 < ywo0Var2.c) {
                        int i10 = ij5Var.e;
                        if (i10 == 0) {
                            i10 = ij5.i;
                        }
                        int i11 = ij5.a.$EnumSwitchMapping$0[ij5Var.f.ordinal()];
                        if (i11 == 1) {
                            ywo0Var2.k(i10, 0);
                        } else if (i11 == 2) {
                            ywo0Var2.k(-i10, 0);
                        }
                        mwo0Var2.a();
                        int i12 = ywo0Var2.a;
                        if (i12 != 0 && i12 != ywo0Var2.c) {
                            ij5Var.c.a(new shh0(gp6Var, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new PointF(gp6Var.u().centerX(), gp6Var.u().centerY())));
                        }
                    }
                }
                return s3q0.a;
            case 12:
                al6 al6Var = (al6) obj3;
                AuthExchangeTokenInfoDto authExchangeTokenInfoDto = (AuthExchangeTokenInfoDto) obj;
                UsersExchangeUserDto e2 = authExchangeTokenInfoDto.e();
                if (e2 != null && (f = e2.f()) != null && fkq0.c(f)) {
                    Iterator it = al6Var.x.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            obj2 = it.next();
                            if (epx.f(((UserItem) obj2).b, f)) {
                            }
                        } else {
                            obj2 = null;
                        }
                    }
                    UserItem userItem = (UserItem) obj2;
                    long j3 = userItem != null ? userItem.k : 0L;
                    String str2 = (userItem == null || (str = userItem.c) == null) ? "" : str;
                    if (str2.length() == 0) {
                        par0.a.getClass();
                        par0.b("Exchange token is empty in Carousel!");
                    } else {
                        if (userItem == null) {
                            throw new IllegalArgumentException("Required value was null.");
                        }
                        AccountProfileType accountProfileType = userItem.j;
                        UsersExchangeUserDto e3 = authExchangeTokenInfoDto.e();
                        String str3 = (e3 == null || (e = e3.e()) == null) ? "" : e;
                        UsersExchangeUserDto e4 = authExchangeTokenInfoDto.e();
                        String g = e4 != null ? e4.g() : null;
                        UsersExchangeUserDto e5 = authExchangeTokenInfoDto.e();
                        String i13 = e5 != null ? e5.i() : null;
                        UsersExchangeUserDto e6 = authExchangeTokenInfoDto.e();
                        String d = e6 != null ? e6.d() : null;
                        UsersExchangeUserDto e7 = authExchangeTokenInfoDto.e();
                        String j4 = e7 != null ? e7.j() : null;
                        String str4 = str2;
                        String str5 = str3;
                        String str6 = g;
                        String str7 = i13;
                        String str8 = d;
                        al6Var.f.j(al6Var.b, new c2r0.b(f, str5, str6, str7, str8, j4, str4, false, j3, accountProfileType));
                        int d2 = authExchangeTokenInfoDto.d();
                        AccountProfileType accountProfileType2 = userItem.j;
                        if (accountProfileType2 == null) {
                            accountProfileType2 = AccountProfileType.NORMAL;
                        }
                        r4 = new UserItem(f, str4, str5, str6, str7, str8, j4, d2, accountProfileType2, 0L, 512, null);
                    }
                }
                return r4 == null ? g0.b : io.reactivex.rxjava3.core.q.T(r4);
            case 13:
                ((zjw0) obj3).b.a((fh8) ((it80) obj).a);
                return s3q0.a;
            case 14:
                va9 va9Var = (va9) obj3;
                w5w0 d3 = va9Var.d(((rew0) va9Var.f.getValue()).f());
                return d3 == null ? va9.r : d3;
            case 15:
                CartFragment cartFragment = (CartFragment) obj3;
                ?? r1 = cartFragment.S;
                qcy<Object>[] qcyVarArr = CartFragment.Y;
                if (((fm50) obj) instanceof a.b) {
                    ((FrameLayout) r1.getValue()).setVisibility(0);
                    if (cartFragment.In().f(R.id.cart_empty_cart_container) == null) {
                        cartFragment.In().q().a(R.id.cart_empty_cart_container, (FragmentImpl) cartFragment.U.getValue());
                    }
                } else {
                    f4m.j((FrameLayout) r1.getValue());
                    FragmentImpl f8 = cartFragment.In().f(R.id.cart_empty_cart_container);
                    if (f8 != null) {
                        cartFragment.In().q().b(f8);
                    }
                }
                return s3q0.a;
            case 16:
                return com.vk.im.channelcreation.impl.j.a((com.vk.im.channelcreation.impl.j) obj, j.a.a(((com.vk.im.channelcreation.impl.b) obj3).g().b, "", null, false, 14), null, 5);
            case 17:
                i2b i2bVar = (i2b) obj3;
                sxp sxpVar = (sxp) obj;
                i2bVar.getClass();
                if (sxpVar instanceof i280) {
                    return new m8v.c(((i280) sxpVar).d);
                }
                if (sxpVar instanceof o280) {
                    return new m8v.e((Collection) pn00.h(Long.valueOf(i2bVar.b), ((o280) sxpVar).c));
                }
                if (sxpVar instanceof y080) {
                    return new m8v.a(((y080) sxpVar).b);
                }
                if (sxpVar instanceof n280) {
                    return new m8v.d(((n280) sxpVar).d);
                }
                if ((sxpVar instanceof OnChannelsCacheInvalidateEvent) || (sxpVar instanceof w280)) {
                    return m8v.b.a;
                }
                throw new IllegalArgumentException("event = " + sxpVar + " not history event");
            case 18:
                return ((w2w) obj3).K().n().e(UUID.randomUUID().toString(), ReporterType.CHANNEL, ((MessagesMergerInput) obj).c.size());
            case 19:
                i9b i9bVar = (i9b) obj3;
                cau0 cau0Var = i9bVar.q;
                o9b o9bVar = i9bVar.d;
                cau0Var.getClass();
                return o9bVar.a().U(new pj4(new rd1(5), 11));
            case 20:
                wgb wgbVar = (wgb) obj3;
                io.reactivex.rxjava3.subjects.d<io.reactivex.rxjava3.functions.a> dVar = wgbVar.r;
                wgb.b bVar2 = (wgb.b) obj;
                ChannelFilter channelFilter = wgbVar.a;
                rfb rfbVar = wgbVar.f;
                gz9 gz9Var = wgbVar.b;
                qfb qfbVar = bVar2.a;
                boolean z2 = qfbVar.b;
                ArrayList arrayList2 = qfbVar.f;
                int i14 = 17;
                if (z2 || bVar2.c != null) {
                    int i15 = 9;
                    if (z2) {
                        int i16 = 13;
                        if (z2 && !qfbVar.c && bVar2.f) {
                            gz9Var.d(new defpackage.j(wgbVar, i16));
                            wgbVar.d();
                        } else if (z2 && !qfbVar.c && bVar2.g) {
                            gz9Var.b(new defpackage.k(wgbVar, i15));
                            wgbVar.d();
                        } else if (bVar2.e) {
                            gz9Var.a(new xm1(wgbVar, i16));
                            boolean z3 = qfbVar.c;
                            int i17 = 12;
                            if (z3) {
                                aeb aebVar2 = arrayList2.isEmpty() ? aeb.d : ((Channel) j5g.i0(arrayList2)).s;
                                gz9Var.a(new sk(8, wgbVar, aebVar2));
                                wgbVar.c(bVar2, rfbVar.a(new rfb.a.b(aebVar2, channelFilter, 30)), aebVar2, false);
                            } else if (!qfbVar.b || z3) {
                                gz9Var.d(new hg(wgbVar, i17));
                                wgbVar.d();
                            } else {
                                wgbVar.e(wgb.b.a(bVar2, null, null, null, 0, true, false, false, Sdk.SDKError.Reason.STALE_CACHED_RESPONSE_VALUE));
                                int size = arrayList2.size() - 1;
                                if (size >= 0) {
                                    while (true) {
                                        int i18 = size - 1;
                                        Channel channel = (Channel) arrayList2.get(size);
                                        Msg msg = (Msg) qfbVar.g.get(Long.valueOf(channel.b));
                                        if (msg != null && msg.Mb()) {
                                            aebVar = channel.s;
                                        } else if (i18 >= 0) {
                                            size = i18;
                                        }
                                    }
                                }
                                aebVar = aeb.e;
                                gz9Var.a(new tx(5, wgbVar, aebVar));
                                dVar.onNext(new isa(r9 ? 1 : 0, aebVar, wgbVar));
                            }
                            gz9Var.a(new ey0(wgbVar, i17));
                        } else {
                            gz9Var.a(new com.vk.movika.sdk.android.defaultplayer.view.timeline.a(wgbVar, 18));
                            sfb a = rfbVar.a(new rfb.a.C3607a(channelFilter));
                            if (!a.a.isEmpty()) {
                                gz9Var.a(new h9(wgbVar, i2));
                            } else if (a.a.b) {
                                gz9Var.a(new vf0(wgbVar, i2));
                                a = wgbVar.g.a(new rfb.a.C3607a(channelFilter));
                            } else {
                                gz9Var.a(new ka0(wgbVar, i14));
                            }
                            wgbVar.d();
                            wgbVar.e(wgb.b.a(bVar2, a.a, a.b, null, 0, false, false, false, 236));
                            gz9Var.a(new t9b(r9 ? 1 : 0, wgbVar, a));
                            if (a.a.isEmpty()) {
                                wgbVar.b(new p(wgbVar, 20));
                            }
                        }
                    } else {
                        gz9Var.b(new defpackage.i(wgbVar, 15));
                        wgbVar.d();
                    }
                } else if (bVar2.h) {
                    gz9Var.b(new defpackage.g(wgbVar, i14));
                } else {
                    gz9Var.a(new defpackage.r(wgbVar, 19));
                    scf0 b = wgbVar.h.b();
                    wpp<Long, dcf0> wppVar = b.b;
                    if (wppVar.i() || wppVar.f()) {
                        gz9Var.a(new yh(wgbVar, i14));
                        wgbVar.e(wgb.b.a(bVar2, null, null, null, 0, false, false, true, 127));
                        dVar.onNext(new ot1(wgbVar, i3));
                    } else {
                        List O0 = j5g.O0(wppVar.c.values());
                        wgbVar.e(wgb.b.a(bVar2, null, null, O0, b.a, false, false, false, 243));
                        wgbVar.d();
                        gz9Var.a(new com.vk.newsfeed.common.recycler.holders.attachments.a(9, wgbVar, O0));
                    }
                }
                return s3q0.a;
            case 21:
                return bdb.a((bdb) obj, 0, 0, 0, 0, 0, 0, null, null, null, false, false, null, (ChannelNotificationsSettings) obj3, 0, null, null, null, null, null, null, null, null, null, false, false, -32769, 7);
            case 22:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj3;
                int i19 = ClipFeedListFragment.a2;
                Pair i20 = p4g.i(clipFeedListFragment.ro(), new byc((String) obj, i4));
                if (i20 != null) {
                    FeedItem feedItem = (FeedItem) j5g.b0(((Number) i20.i()).intValue() - 1, clipFeedListFragment.ro());
                    if (!clipFeedListFragment.Go((FeedItem) j5g.b0(((Number) i20.i()).intValue() + 1, clipFeedListFragment.ro()))) {
                        break;
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 23:
                ((w6d) obj3).e.a(v5d.b);
                return s3q0.a;
            case 24:
                ucd ucdVar = ((ClipSubscribeBtnView) obj3).b;
                if (ucdVar != null) {
                    ucdVar.V();
                }
                return s3q0.a;
            case 25:
                zld zldVar = (zld) obj3;
                zldVar.f.a().d().a("ClipsChoosePreviewPresenter", (Throwable) obj);
                Toast.makeText(zldVar.b, R.string.vk_error, 0).show();
                return s3q0.a;
            case 26:
                wh50 wh50Var = (wh50) obj3;
                if (((xwr) obj).h()) {
                    wh50Var.setValue(((Boolean) wh50Var.getValue()) != null ? Boolean.valueOf(!r1.booleanValue()) : Boolean.TRUE);
                }
                return s3q0.a;
            case 27:
                Group group = (Group) obj;
                CommunityNotificationSettingsFragment.a aVar3 = new CommunityNotificationSettingsFragment.a(group.c.b, group.d);
                aVar3.y();
                aVar3.g(2, (CommunitiesManageNotificationsFragment) obj3);
                return s3q0.a;
            case 28:
                ypg ypgVar = (ypg) obj3;
                ypgVar.m.invoke(ypgVar.h, ypgVar.i, ypgVar.j, ypgVar.k, ypgVar.l);
                return s3q0.a;
            default:
                x2i x2iVar = ((j7h) obj3).g;
                if (x2iVar != null) {
                    x2iVar.mn(a3i.a.a);
                }
                return s3q0.a;
        }
    }
}
