package com.vk.movika.sdk.base.hooks;

import android.os.Bundle;
import android.view.ViewGroup;
import android.widget.FrameLayout;
import androidx.fragment.app.Fragment;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.auth.main.AuthStatSender;
import com.vk.balance.BalanceFragment;
import com.vk.catalog2.common.dto.api.CatalogExtendedData;
import com.vk.catalog2.common.dto.api.section.CatalogSection;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.catalog2.common.dto.ui.UIBlockGroup;
import com.vk.catalog2.common.dto.ui.profile.UIBlockProfile;
import com.vk.channels.api.CommentsHistory;
import com.vk.clips.editor.state.model.ClipsEditorAudioItem;
import com.vk.core.fragments.FragmentImpl;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.dto.attaches.Attach;
import com.vk.dto.clips.music.ClipsEditorMusicInfo;
import com.vk.dto.common.Peer;
import com.vk.dto.common.Source;
import com.vk.dto.common.data.Subscription;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.Playlist;
import com.vk.dto.newsfeed.entries.Digest;
import com.vk.dto.newsfeed.entries.DigestItem;
import com.vk.im.chat.clips.decoration.impl.presentation.bottom.screen.reply.ChatClipsReplyFragment;
import com.vk.im.engine.models.dialogs.DialogExt;
import com.vk.instantjobs.InstantJob;
import com.vk.photos.root.albumdetails.presentation.a;
import com.vk.photos.root.albumdetails.presentation.k;
import com.vk.voip.dto.broadcast.VoipBroadcastStatus;
import com.vk.voip.ui.broadcast.fragments.scheduled.BroadcastScheduledFragment;
import com.vungle.ads.internal.protos.Sdk;
import java.io.File;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import kotlin.NoWhenBranchMatchedException;
import kotlin.Pair;
import ru.ok.android.externcalls.sdk.feature.roles.FeatureRoles;
import xsna.af1;
import xsna.aq40;
import xsna.asu0;
import xsna.bjk;
import xsna.c5g;
import xsna.ca9;
import xsna.ci7;
import xsna.d06;
import xsna.dfw0;
import xsna.dg8;
import xsna.dt8;
import xsna.e08;
import xsna.epx;
import xsna.eqw0;
import xsna.ewp;
import xsna.f1e0;
import xsna.f29;
import xsna.f34;
import xsna.f9t;
import xsna.fh5;
import xsna.fkq0;
import xsna.ft0;
import xsna.ftx0;
import xsna.g3a;
import xsna.g47;
import xsna.gdp;
import xsna.gwc;
import xsna.h03;
import xsna.hag;
import xsna.hda;
import xsna.is5;
import xsna.it80;
import xsna.ivq;
import xsna.izs;
import xsna.j03;
import xsna.j5g;
import xsna.ji8;
import xsna.jjc;
import xsna.jn2;
import xsna.kva;
import xsna.l370;
import xsna.laa;
import xsna.lnb;
import xsna.lu70;
import xsna.m8b;
import xsna.m99;
import xsna.ma7;
import xsna.mwa;
import xsna.n34;
import xsna.np0;
import xsna.nt70;
import xsna.oj1;
import xsna.oz50;
import xsna.oza;
import xsna.p470;
import xsna.q29;
import xsna.qgi0;
import xsna.qvw0;
import xsna.r0c;
import xsna.r79;
import xsna.rbg;
import xsna.rd8;
import xsna.rsg0;
import xsna.rtb0;
import xsna.s3q0;
import xsna.s99;
import xsna.ta7;
import xsna.tci;
import xsna.tgi0;
import xsna.tho0;
import xsna.tj1;
import xsna.uh1;
import xsna.us1;
import xsna.xcw0;
import xsna.xu;
import xsna.xy;
import xsna.y40;
import xsna.y5c;
import xsna.yfb;
import xsna.ynb;
import xsna.yz7;
import xsna.z0r0;
import xsna.z19;
import xsna.z40;
import xsna.zak0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class p implements izs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ p(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        boolean z;
        File i1;
        Object obj2;
        String str;
        int i = 6;
        boolean z2 = false;
        boolean z3 = true;
        com.vk.photos.root.albumdetails.presentation.a aVar = null;
        ji8 ji8Var = null;
        aVar = null;
        switch (this.b) {
            case 0:
                q qVar = (q) this.c;
                if (com.vk.movika.sdk.base.utils.d.c((com.vk.movika.sdk.base.model.f) obj)) {
                    qVar.a(true);
                }
                return s3q0.a;
            case 1:
                xu.a aVar2 = (xu.a) this.c;
                tgi0 tgi0Var = (tgi0) obj;
                qgi0.h(tgi0Var, aVar2.b.d);
                qgi0.o(tgi0Var, aVar2.c);
                return s3q0.a;
            case 2:
                z40 z40Var = (z40) this.c;
                ((zak0) z40Var.i).setValue((ModalActionSheetListItem.IconSize) z40Var.b.get((String) obj));
                return s3q0.a;
            case 3:
                Boolean invoke = ((np0) this.c).f.invoke(Integer.valueOf(((rtb0.a) obj).a.b));
                invoke.booleanValue();
                return invoke;
            case 4:
                af1 af1Var = (af1) this.c;
                k.c.a aVar3 = (k.c.a) af1Var.m;
                if (epx.f(aVar3, k.c.a.C1488a.a)) {
                    aVar = a.b.b;
                } else if (aVar3 instanceof k.c.a.C1489c) {
                    aVar = a.l.b;
                } else if (!(aVar3 instanceof k.c.a.d) && aVar3 != null) {
                    if (!aVar3.equals(k.c.a.b.a)) {
                        throw new NoWhenBranchMatchedException();
                    }
                    aVar = new a.w(uh1.c.d, null);
                }
                if (aVar != null) {
                    af1Var.n.P7(aVar);
                }
                return s3q0.a;
            case 5:
                ((oj1) this.c).T(new tj1.a.C3748a(new ewp((Throwable) obj)));
                return s3q0.a;
            case 6:
                ((zak0) ((us1) this.c).h).setValue((tho0) obj);
                return s3q0.a;
            case 7:
                Digest digest = (Digest) this.c;
                Digest digest2 = (Digest) obj;
                Digest.Header header = digest2.k;
                Digest.Header header2 = header != null ? new Digest.Header(header.b, header.c, header.d, header.e, header.f) : null;
                Digest digest3 = new Digest(digest2.i, digest2.j, digest2.k, digest2.l, digest2.m, digest2.n, digest2.o, digest.p);
                digest3.p = digest.p;
                digest3.n |= 2;
                DigestItem digestItem = (DigestItem) j5g.a0(digest3.m);
                if (digestItem != null) {
                    digestItem.k = header2 != null ? header2.c : null;
                }
                digest3.c = digest.c;
                digest3.g = digest.g;
                digest3.h = digest.h;
                return digest3;
            case 8:
                File file = (File) this.c;
                InstantJob instantJob = (InstantJob) obj;
                f34 f34Var = instantJob instanceof f34 ? (f34) instantJob : null;
                if (f34Var != null) {
                    Attach attach = f34Var.c;
                    ftx0 ftx0Var = attach instanceof ftx0 ? (ftx0) attach : null;
                    if (ftx0Var != null && (i1 = ftx0Var.i1()) != null) {
                        z = epx.f(i1.getPath(), file.getPath());
                        return Boolean.valueOf(z);
                    }
                }
                z = false;
                return Boolean.valueOf(z);
            case 9:
                ClipsEditorAudioItem clipsEditorAudioItem = (ClipsEditorAudioItem) obj;
                return ClipsEditorAudioItem.a(clipsEditorAudioItem, ClipsEditorMusicInfo.zb(clipsEditorAudioItem.a, null, null, 0, 0, (int) ((Long) this.c).longValue(), null, 0, CommonConstant.RETCODE.LOGOUT_REQUEST_SUCCESS), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 30);
            case 10:
                ((fh5) this.c).K();
                return s3q0.a;
            case 11:
                is5 is5Var = (is5) this.c;
                ((zak0) is5Var.j).setValue((is5.d) is5Var.e.get((String) obj));
                return s3q0.a;
            case 12:
                d06 d06Var = (d06) this.c;
                h03.b((Throwable) obj);
                BalanceFragment balanceFragment = d06Var.b;
                balanceFragment.lo(!(balanceFragment.d0 != null ? r3 : null).isChecked());
                d06Var.g();
                return s3q0.a;
            case 13:
                ((ma7) this.c).T(new ta7.b.a((Throwable) obj));
                return s3q0.a;
            case 14:
                final yz7 yz7Var = (yz7) this.c;
                g47 g47Var = (g47) obj;
                g47Var.e(tci.l(yz7Var), e08.b);
                l370.n(g47Var, f9t.w(yz7Var), new y40(i));
                g47Var.d(new xy() { // from class: xsna.mz7
                    @Override // xsna.xy
                    public final void a(lj50 lj50Var) {
                        yz7.this.b((com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.a) lj50Var);
                    }
                });
                return s3q0.a;
            case 15:
                List<UserId> list = (List) obj;
                ((dg8) this.c).g = list;
                return rsg0.y0(new z0r0(j5g.H0(list, 3), dg8.n), null, null, 3);
            case 16:
                BroadcastScheduledFragment broadcastScheduledFragment = (BroadcastScheduledFragment) this.c;
                rd8 rd8Var = (rd8) obj;
                int i2 = BroadcastScheduledFragment.U;
                ivq ivqVar = broadcastScheduledFragment.Q;
                ivqVar.getClass();
                if (rd8Var instanceof rd8.a) {
                    rd8.a aVar4 = (rd8.a) rd8Var;
                    Collection<dfw0> collection = aVar4.c;
                    ArrayList arrayList = new ArrayList(c5g.u(collection, 10));
                    for (dfw0 dfw0Var : collection) {
                        String str2 = aVar4.f;
                        Iterator<T> it = aVar4.b.iterator();
                        while (true) {
                            if (it.hasNext()) {
                                obj2 = it.next();
                                if (epx.f(((qvw0) obj2).getId(), dfw0Var.b)) {
                                }
                            } else {
                                obj2 = null;
                            }
                        }
                        qvw0 qvw0Var = (qvw0) obj2;
                        String str3 = dfw0Var.a;
                        gdp gdpVar = ivqVar.a;
                        String str4 = dfw0Var.f;
                        gdpVar.getClass();
                        CharSequence a = gdp.a(str4);
                        Collection<eqw0> collection2 = dfw0Var.e;
                        boolean z4 = z3;
                        long j = dfw0Var.g;
                        if (qvw0Var == null || (str = qvw0Var.a()) == null) {
                            str = "";
                        }
                        arrayList.add(new ji8.a(str3, a, collection2, gdp.a(str), j, dfw0Var.d == VoipBroadcastStatus.UPCOMING ? z4 : false, dfw0Var.a.equals(str2)));
                        z3 = z4;
                    }
                    ji8Var = new ji8(arrayList);
                }
                return new it80(ji8Var);
            case 17:
                dt8 dt8Var = (dt8) this.c;
                dt8Var.q.invoke((Subscription) obj);
                dt8Var.p.dismiss();
                return s3q0.a;
            case 18:
                q29.a aVar5 = (q29.a) obj;
                ((z19) this.c).T(new f29.d(aVar5.a, aVar5.b, aVar5.c));
                return s3q0.a;
            case 19:
                ((r79) this.c).q(xcw0.q.a);
                return s3q0.a;
            case 20:
                m99 m99Var = (m99) this.c;
                FeatureRoles featureRoles = (FeatureRoles) obj;
                ca9 ca9Var = m99Var.j().c;
                if (ca9Var instanceof ca9.c) {
                    m99Var.f(s99.a(m99Var.j(), null, null, ca9.c.a((ca9.c) ca9Var, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, false, featureRoles, false, null, false, null, -1, 503), null, null, null, null, false, 251));
                }
                return s3q0.a;
            case 21:
                jn2 jn2Var = ((g3a) this.c).s;
                if (jn2Var != null) {
                    jn2Var.invoke();
                }
                return s3q0.a;
            case 22:
                List<Playlist> list2 = (List) obj;
                aq40 aq40Var = ((laa) this.c).r;
                nt70 nt70Var = new nt70(aq40Var.h);
                nt70Var.m = list2;
                CatalogSection a2 = lu70.a(nt70Var.a(((laa) aq40Var.i.c).h));
                List<Playlist> list3 = list2;
                HashMap hashMap = new HashMap(list3.size());
                for (Playlist playlist : list3) {
                    hashMap.put(playlist.Ib(), playlist);
                }
                return new hda(a2, new CatalogExtendedData(null, null, null, null, null, null, null, null, new LinkedHashMap(hashMap), null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, null, -257, -1, 7, null), null);
            case 23:
                UserId userId = (UserId) this.c;
                UIBlock uIBlock = (UIBlock) obj;
                if (((uIBlock instanceof UIBlockProfile) && epx.f(((UIBlockProfile) uIBlock).A.c, userId)) || ((uIBlock instanceof UIBlockGroup) && fkq0.e(((UIBlockGroup) uIBlock).y.c).equals(userId))) {
                    z2 = true;
                }
                return Boolean.valueOf(z2);
            case 24:
                kva.a aVar6 = (kva.a) obj;
                mwa.a a3 = ((mwa) this.c).a();
                CommentsHistory commentsHistory = a3.b;
                hag hagVar = aVar6.a;
                List<hag> list4 = commentsHistory.a;
                hag a4 = rbg.a(list4, Integer.valueOf(hagVar.a), false);
                if (a4 != null) {
                    hag a5 = hag.a(hagVar, a4.f, false, null, false, 32735);
                    commentsHistory = CommentsHistory.a(commentsHistory, rbg.c(list4, a5.a, a5), 0, 0, null, null, null, Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                }
                return mwa.a.a(a3, commentsHistory, a3.c.Ib(aVar6.b), 1);
            case 25:
                m8b m8bVar = (m8b) this.c;
                return m8bVar.k.b(m8bVar, new oza(m8bVar.i, Source.ACTUAL, true)).q(asu0.a.c()).l(new ft0(new ci7(i), 12));
            case 26:
                ynb ynbVar = (ynb) this.c;
                lnb lnbVar = (lnb) obj;
                if (!(lnbVar instanceof lnb.a)) {
                    throw new NoWhenBranchMatchedException();
                }
                lnb.a aVar7 = (lnb.a) lnbVar;
                DialogExt dialogExt = aVar7.a;
                int i3 = aVar7.b;
                String str5 = aVar7.c;
                Long l = aVar7.d;
                boolean z5 = aVar7.e;
                FragmentImpl fragmentImpl = (FragmentImpl) ((Fragment) ynbVar.i.c);
                FrameLayout frameLayout = ynbVar.o;
                if (frameLayout != null) {
                    frameLayout.removeAllViews();
                }
                Bundle b = yfb.b(new Pair("id", Integer.valueOf(i3)), new Pair("text", str5), new Pair("person_id", l), new Pair("owner_id", ynbVar.h), new Pair("can_show_quick_stickers_suggest", Boolean.valueOf(z5)));
                if (l != null) {
                    Serializer.c<Peer> cVar = Peer.CREATOR;
                    n34.w(b, dialogExt, new f1e0(Collections.singletonList(Peer.a.b(l.longValue()))));
                } else {
                    n34.w(b, dialogExt, null);
                }
                new oz50(ChatClipsReplyFragment.class, null, b).f().Fn(fragmentImpl.In(), "ChatClipsReplyFragment");
                return s3q0.a;
            case 27:
                ((r0c) this.c).e.g(AuthStatSender.Screen.PHONE_CODE);
                return s3q0.a;
            case 28:
                y5c.a aVar8 = ((y5c) this.c).i;
                p470 p470Var = new p470((ViewGroup) obj, aVar8);
                jjc.g(p470Var.itemView, new bjk(aVar8, 25));
                return p470Var;
            default:
                j03.j(((gwc) this.c).f, (Throwable) obj);
                return s3q0.a;
        }
    }
}
