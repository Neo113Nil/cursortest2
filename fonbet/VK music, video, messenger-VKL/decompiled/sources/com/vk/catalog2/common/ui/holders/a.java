package com.vk.catalog2.common.ui.holders;

import android.content.Context;
import android.os.Handler;
import android.util.Size;
import android.view.View;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.vk.catalog2.common.dto.ui.actions.UIBlockHideBlockButton;
import com.vk.catalog2.feature.music.holders.podcast.PodcastSliderCellVh;
import com.vk.core.serialize.Serializer;
import com.vk.dto.common.Image;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.ecomm.market.good.ui.holder.goodquickmessages.QuickMessageItem;
import com.vk.ecomm.market.good.ui.restriction.ProductCardRestrictionViewState;
import com.vk.im.engine.commands.contacts.ContactsSearchCmd;
import com.vk.im.engine.models.ImBgSyncState;
import com.vk.im.ui.fragments.chat.ChatFragment;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.newsfeed.impl.items.posting.item.modals.PostingType;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vk.profile.community.members.impl.domain.MembersListBanner;
import com.vk.voip.utils.timer.CountDownTimer;
import com.vkontakte.android.R;
import defpackage.d;
import io.reactivex.rxjava3.internal.operators.single.r;
import java.text.SimpleDateFormat;
import java.util.Iterator;
import java.util.List;
import one.video.player.OneVideoPlayer;
import one.video.player.j;
import xsna.a1w;
import xsna.atk0;
import xsna.b5a;
import xsna.brm0;
import xsna.cfp0;
import xsna.d3h;
import xsna.d9j;
import xsna.do3;
import xsna.etv0;
import xsna.fem;
import xsna.fnj;
import xsna.fw4;
import xsna.gk;
import xsna.go9;
import xsna.gy70;
import xsna.gzs;
import xsna.hna;
import xsna.hv10;
import xsna.hz5;
import xsna.hzf0;
import xsna.iah0;
import xsna.ikv0;
import xsna.imv;
import xsna.itg0;
import xsna.iyn;
import xsna.izs;
import xsna.je4;
import xsna.jjc;
import xsna.jz;
import xsna.kj20;
import xsna.kp5;
import xsna.l2y;
import xsna.le70;
import xsna.lw3;
import xsna.lw4;
import xsna.lwf0;
import xsna.mb90;
import xsna.mc90;
import xsna.me70;
import xsna.myc0;
import xsna.n87;
import xsna.n880;
import xsna.o420;
import xsna.p1s;
import xsna.pkv0;
import xsna.pv60;
import xsna.q3a;
import xsna.q7v0;
import xsna.qgp0;
import xsna.qkk0;
import xsna.qwi0;
import xsna.rg50;
import xsna.rj40;
import xsna.rsg0;
import xsna.s3q0;
import xsna.s55;
import xsna.shm;
import xsna.sj40;
import xsna.t1s;
import xsna.te4;
import xsna.tk30;
import xsna.uk30;
import xsna.v420;
import xsna.vx70;
import xsna.wc2;
import xsna.xyr;
import xsna.yfb;
import xsna.yvj;
import xsna.z0o;
import xsna.z780;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes16.dex */
public final /* synthetic */ class a implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ a(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v74, types: [com.vk.voip.utils.timer.a] */
    /* JADX WARN: Type inference failed for: r3v19, types: [xsna.qi6] */
    /* JADX WARN: Type inference failed for: r3v23, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r4v4, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r6v7 */
    /* JADX WARN: Type inference failed for: r6v8 */
    @Override // xsna.gzs
    public final Object invoke() {
        ContactsSearchCmd.MatchType matchType;
        ExposedFunction invoke$lambda$35;
        int i = this.b;
        int i2 = 14;
        boolean z = true;
        String str = null;
        ?? r6 = 0;
        Object obj = this.d;
        Object obj2 = this.c;
        switch (i) {
            case 0:
                ComposeHeaderVh composeHeaderVh = (ComposeHeaderVh) obj2;
                UIBlockHideBlockButton uIBlockHideBlockButton = (UIBlockHideBlockButton) obj;
                composeHeaderVh.m = itg0.m(rsg0.y0(yfb.x(composeHeaderVh.d.m(uIBlockHideBlockButton.A, null)), null, null, 3));
                Context context = composeHeaderVh.a().getContext();
                int a = iah0.a(24);
                int a2 = iah0.a(8);
                ikv0.a aVar = new ikv0.a(context);
                aVar.t = new ikv0.c.C3058c(R.drawable.vk_icon_check_circle_outline_28, Integer.valueOf(R.attr.vk_ui_icon_accent_themed), new Size(a, a), 8);
                aVar.u = new ikv0.d(context.getString(R.string.hide_block_of_videos), str, (ikv0.d.a) (r6 == true ? 1 : 0), 6);
                aVar.o = Integer.valueOf(a2);
                if (fnj.b(context)) {
                    aVar.k = 1;
                    aVar.g(1);
                }
                pkv0.f(aVar);
                b5a b5aVar = composeHeaderVh.c;
                if (b5aVar != null) {
                    b5aVar.a(new cfp0(uIBlockHideBlockButton, null));
                }
                q3a q3aVar = composeHeaderVh.b;
                if (q3aVar != null) {
                    q3aVar.b(new lwf0(uIBlockHideBlockButton.B), false);
                }
                return s3q0.a;
            case 1:
                return new SimpleDateFormat(((Context) obj2).getString(R.string.vkim_accessability_time_this_year), ((gk) obj).f);
            case 2:
                return com.vk.clips.sdk.shared.item.ads.c.s((com.vk.clips.sdk.shared.item.ads.c) obj2, (Context) obj);
            case 3:
                te4.a aVar2 = (te4.a) obj;
                ((izs) obj2).invoke(new je4.a(aVar2.b, aVar2.c));
                return s3q0.a;
            case 4:
                lw4 lw4Var = (lw4) obj;
                ((com.vk.music.notifications.restriction.a) obj2).getClass();
                fw4 fw4Var = lw4Var.e;
                String str2 = lw4Var.c;
                String str3 = lw4Var.b;
                rj40 rj40Var = new rj40(fw4Var.a, fw4Var.b, null, 4);
                Image image = lw4Var.d;
                com.vk.music.notifications.inapp.b.f(image.b.isEmpty() ? sj40.a.b(R.drawable.ic_smile_72, str3, str2, rj40Var, 112) : sj40.a.a(image, str3, str2, rj40Var), null, null, 14);
                return s3q0.a;
            case 5:
                ((hna) obj2).c.invoke();
                ((etv0) obj).b(false);
                return s3q0.a;
            case 6:
                com.vk.clips.sdk.shared.item.clip.a aVar3 = (com.vk.clips.sdk.shared.item.clip.a) obj2;
                return aVar3.O(new hz5(aVar3.h, aVar3.f, aVar3.z, aVar3.A, aVar3.C, aVar3.j, (izs) obj, aVar3.u));
            case 7:
                ((d3h) obj2).m((View) obj, null);
                return s3q0.a;
            case 8:
                ContactsSearchCmd.MatchType matchType2 = (ContactsSearchCmd.MatchType) obj;
                return (((Boolean) ((ContactsSearchCmd) obj2).d.getValue()).booleanValue() || matchType2 == (matchType = ContactsSearchCmd.MatchType.BY_NAME)) ? matchType2 : matchType;
            case 9:
                ((izs) obj2).invoke((hv10) obj);
                return s3q0.a;
            case 10:
                ((z0o) obj2).h.invoke(((iyn) obj).h);
                return s3q0.a;
            case 11:
                ((t1s) obj2).a.onNext(new p1s.b((xyr) obj));
                return s3q0.a;
            case 12:
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) obj;
                Iterator<OneVideoPlayer.c> it = ((j) obj2).b.iterator();
                while (it.hasNext()) {
                    it.next().l(oneVideoPlayer);
                }
                return s3q0.a;
            case 13:
                ((izs) obj2).invoke((QuickMessageItem) obj);
                return s3q0.a;
            case 14:
                invoke$lambda$35 = HandleInvocationsFromAdViewer.invoke$lambda$35((HandleInvocationsFromAdViewer) obj2, (AdObject) obj);
                return invoke$lambda$35;
            case 15:
                ((l2y) obj2).i.f();
                ((kp5) obj).invoke(Boolean.TRUE);
                return s3q0.a;
            case 16:
                ((izs) obj2).invoke(((MembersListBanner) obj).d.d);
                return s3q0.a;
            case 17:
                String str4 = (String) obj2;
                o420.a aVar4 = ((v420) obj).b;
                if (brm0.B(str4, "@", false) || brm0.B(str4, "*", false)) {
                    String substring = str4.substring(1);
                    o420 o420Var = o420.this;
                    imv imvVar = ChatFragment.this.J0;
                    if (imvVar == null || !imvVar.s()) {
                        shm shmVar = o420Var.h;
                        a1w a1wVar = shmVar.i;
                        if (a1wVar.u()) {
                            io.reactivex.rxjava3.disposables.b bVar = shmVar.l;
                            bVar.e();
                            atk0 a3 = atk0.a(shmVar.k, substring, null, 5);
                            shmVar.k = a3;
                            Serializer.c<Peer> cVar = Peer.CREATOR;
                            bVar.b(new r(a1wVar.F(shmVar, new fem(Peer.a.b(a3.a), a3.b, Source.CACHE, false)), new do3(new d9j(shmVar, 2), 13)).subscribe(new d(new lw3(shmVar, 2), 21), new jz(new s55(shmVar, 5), 18)));
                        } else {
                            shmVar.X0();
                        }
                        o420Var.g = true;
                        o420Var.e();
                    }
                } else {
                    aVar4.a();
                }
                return s3q0.a;
            case 18:
                kj20 kj20Var = (kj20) obj2;
                gy70 gy70Var = (gy70) obj;
                vx70.b h = kj20Var.b.h(gy70Var);
                kj20Var.c(h.b(), gy70Var);
                return h;
            case 19:
                tk30 tk30Var = ((com.vk.im.ui.components.msg_list.c) obj2).o.d;
                tk30Var.s(uk30.d(tk30Var.d, null, (ImBgSyncState) obj, null, null, null, 0, null, null, 0, 0L, null, null, false, null, null, false, false, false, false, false, false, false, false, false, false, null, false, false, false, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -3, 1073741823));
                return s3q0.a;
            case 20:
                pv60 pv60Var = (pv60) obj;
                while (true) {
                    n880 n880Var = null;
                    for (?? r3 : (List) obj2) {
                        if (r3 instanceof n880) {
                            n880Var = r3;
                        } else if ((r3 instanceof z780) && n880Var != null) {
                            if ((((Boolean) pv60Var.b.getValue()).booleanValue() ? ((z780) r3).Q0() : ((z780) r3).Z2(0L)) && !((Boolean) pv60Var.c.getValue()).booleanValue()) {
                                n880Var.i3();
                            }
                        }
                    }
                    return s3q0.a;
                }
            case 21:
                ((izs) obj2).invoke(new le70.e(((me70.d) obj).a));
                return s3q0.a;
            case 22:
                mc90 mc90Var = (mc90) obj2;
                yvj yvjVar = (yvj) obj;
                if (mc90Var.c()) {
                    myc0.h(yvjVar, null, null, new mb90(mc90Var, null), 3);
                } else {
                    z = false;
                }
                return Boolean.valueOf(z);
            case 23:
                jjc.a(new b(22, (View) obj, (PodcastSliderCellVh) obj2));
                return s3q0.a;
            case 24:
                ((izs) obj2).invoke(((ProductCardRestrictionViewState.Button) obj).b);
                return s3q0.a;
            case 25:
                ((Handler) obj2).post(new wc2((hzf0.a) obj, i2));
                return s3q0.a;
            case 26:
                CountDownTimer countDownTimer = (CountDownTimer) obj2;
                long longValue = ((qwi0.m) obj).g.longValue() - System.currentTimeMillis();
                android.os.CountDownTimer countDownTimer2 = countDownTimer.b;
                if (countDownTimer2 != null) {
                    if (countDownTimer2 != null) {
                        countDownTimer2.cancel();
                    }
                    ?? r1 = com.vk.voip.utils.timer.a.b;
                    countDownTimer.b = null;
                    CountDownTimer.State state = CountDownTimer.State.FINISHED;
                    Iterator it2 = countDownTimer.c.iterator();
                    while (it2.hasNext()) {
                        r1.invoke(it2.next());
                    }
                }
                CountDownTimer.State state2 = CountDownTimer.State.FINISHED;
                countDownTimer.b = new com.vk.voip.utils.timer.b(longValue, countDownTimer, countDownTimer.a).start();
                return s3q0.a;
            case 27:
                q7v0 q7v0Var = (q7v0) obj2;
                n87 n87Var = (n87) obj;
                VkOnboardingCampaign e = q7v0Var.e("com:profile_posting_video");
                if (e != null && q7v0Var.d(e) && q7v0Var.b(e, false)) {
                    n87Var.invoke(PostingType.UserRedesigned.Onboarding.Video, e);
                }
                return s3q0.a;
            case 28:
                rg50 rg50Var = (rg50) obj;
                int intValue = rg50Var.getIntValue();
                ((qkk0) obj2).getClass();
                rg50Var.C(intValue != 3 ? intValue + 1 : 0);
                return s3q0.a;
            default:
                qgp0 qgp0Var = (qgp0) obj2;
                String str5 = (String) obj;
                L l = L.a;
                l.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l, L.LogType.i, new Object[]{"OfflineDbConn", go9.b("mid=", str5)});
                }
                return qgp0Var.b.d(str5);
        }
    }
}
