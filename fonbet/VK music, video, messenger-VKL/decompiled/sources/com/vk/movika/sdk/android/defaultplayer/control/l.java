package com.vk.movika.sdk.android.defaultplayer.control;

import android.app.PendingIntent;
import android.appwidget.AppWidgetManager;
import android.graphics.Typeface;
import android.view.View;
import android.widget.RemoteViews;
import androidx.compose.runtime.a;
import androidx.compose.ui.node.LayoutNode;
import androidx.recyclerview.widget.m;
import com.vk.catalog2.common.dto.ui.UIBlockVideoAlbum;
import com.vk.catalog2.common.ui.mvp.holder.video.playlist.VideoPlaylistRootVh;
import com.vk.core.preference.Preference;
import com.vk.debug.ui.dev.DebugDevSettingsFragment;
import com.vk.dto.common.DownloadingState;
import com.vk.dto.common.VideoFile;
import com.vk.im.engine.models.ProfilesInfo;
import com.vk.im.engine.models.messages.Msg;
import com.vk.im.ui.components.msg_list.MsgListOpenAtLatestMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtMsgMode;
import com.vk.im.ui.components.msg_list.MsgListOpenAtUnreadMode;
import com.vk.im.ui.components.msg_list.MsgListOpenMode;
import com.vk.music.player.presentation.widgets.AudioPlayerWidget;
import com.vk.music.player.presentation.widgets.PlayerSmallWidget;
import com.vk.music.playerservice.impl.PlayerService;
import com.vk.onboarding.api.dto.VkOnboardingCampaign;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.List;
import java.util.ListIterator;
import java.util.Set;
import kotlin.NoWhenBranchMatchedException;
import kotlin.collections.EmptyList;
import kotlin.collections.EmptySet;
import xsna.aou0;
import xsna.bh7;
import xsna.c430;
import xsna.c5g;
import xsna.cp10;
import xsna.cri;
import xsna.doj;
import xsna.dt1;
import xsna.eg20;
import xsna.egi0;
import xsna.gj30;
import xsna.izs;
import xsna.j5g;
import xsna.ja8;
import xsna.k9q0;
import xsna.ky6;
import xsna.l5p;
import xsna.ll30;
import xsna.m5p;
import xsna.n34;
import xsna.ndn;
import xsna.ne7;
import xsna.nj0;
import xsna.o2l;
import xsna.odn;
import xsna.oj0;
import xsna.q630;
import xsna.q7v0;
import xsna.qri;
import xsna.s3q0;
import xsna.sy90;
import xsna.tk30;
import xsna.ufh0;
import xsna.un20;
import xsna.w8v;
import xsna.wh50;
import xsna.wzs;
import xsna.xf20;
import xsna.y8;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class l implements wzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ l(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:132:0x03c8  */
    /* JADX WARN: Removed duplicated region for block: B:152:0x0267  */
    /* JADX WARN: Removed duplicated region for block: B:179:0x0203  */
    /* JADX WARN: Removed duplicated region for block: B:180:0x01f3  */
    /* JADX WARN: Removed duplicated region for block: B:184:0x01b2  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x01f0  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0200  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x0212  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x022d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x02da  */
    @Override // xsna.wzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke(Object obj, Object obj2) {
        MsgListOpenMode msgListOpenMode;
        int i;
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list;
        int i2;
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> I;
        boolean z;
        MsgListOpenMode c;
        m.d a;
        boolean z2;
        boolean z3;
        boolean z4;
        Set set;
        Set set2;
        ufh0 ufh0Var;
        int i3;
        ufh0 ufh0Var2;
        List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list2;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar;
        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E0;
        int i4 = this.b;
        Object obj3 = this.c;
        switch (i4) {
            case 0:
                ((p) obj3).p.setTypeface((Typeface) obj2);
                return Boolean.TRUE;
            case 1:
                ((Integer) obj2).getClass();
                ((bh7) obj3).e(ne7.I(7), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 2:
                DebugDevSettingsFragment debugDevSettingsFragment = (DebugDevSettingsFragment) obj3;
                String[] strArr = DebugDevSettingsFragment.t0;
                String charSequence = ((CharSequence) obj2).toString();
                long parseLong = charSequence.isEmpty() ? 0L : Long.parseLong(charSequence);
                o2l.a.getClass();
                ky6.a aVar = (ky6.a) Preference.j().edit();
                aVar.putLong("__dbg_lp_sync_start_delay_ms", parseLong);
                aVar.apply();
                debugDevSettingsFragment.findPreference("__dbg_lp_sync_start_delay_ms").I(parseLong == 0 ? "Delays (ms)" : String.valueOf(parseLong));
                return null;
            case 3:
                ((ndn) obj3).T(new odn.g((String) obj, (DownloadingState) obj2));
                return s3q0.a;
            case 4:
                m5p m5pVar = (m5p) obj3;
                q7v0 q7v0Var = (q7v0) obj;
                VkOnboardingCampaign vkOnboardingCampaign = (VkOnboardingCampaign) obj2;
                if (q7v0Var.d(vkOnboardingCampaign)) {
                    m5pVar.f = true;
                    View addStickerButtonView = m5pVar.b.getSideControlPanel().getAddStickerButtonView();
                    addStickerButtonView.post(new l5p(m5pVar, addStickerButtonView, q7v0Var, vkOnboardingCampaign, 0));
                }
                return s3q0.a;
            case 5:
                wh50 wh50Var = (wh50) obj3;
                androidx.compose.runtime.a aVar2 = (androidx.compose.runtime.a) obj;
                int intValue = ((Integer) obj2).intValue();
                if (aVar2.t(intValue & 1, (intValue & 3) != 2)) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-458359394, intValue, -1, "com.vk.core.compose.component.internal.ModalBottomSheetDialog.<anonymous>.<anonymous>.<anonymous> (InternalModalBottomSheet.kt:608)");
                    }
                    Object x = aVar2.x();
                    if (x == a.C0011a.a) {
                        x = new y8(24);
                        aVar2.R(x);
                    }
                    q630 b = egi0.b(q630.a.a, false, (izs) x);
                    dt1.a.getClass();
                    cp10 d = ja8.d(dt1.a.b, false);
                    int hashCode = Long.hashCode(n34.n(aVar2));
                    sy90 D = aVar2.D();
                    q630 c2 = qri.c(aVar2, b);
                    cri.h7.getClass();
                    LayoutNode.a aVar3 = cri.a.b;
                    if (aVar2.N() == null) {
                        n34.r();
                        throw null;
                    }
                    aVar2.H();
                    if (aVar2.L()) {
                        aVar2.I(aVar3);
                    } else {
                        aVar2.f();
                    }
                    k9q0.w(aVar2, d, cri.a.f);
                    k9q0.w(aVar2, D, cri.a.e);
                    k9q0.w(aVar2, Integer.valueOf(hashCode), cri.a.g);
                    k9q0.t(aVar2, cri.a.h);
                    k9q0.w(aVar2, c2, cri.a.d);
                    ((wzs) wh50Var.getValue()).invoke(aVar2, 0);
                    aVar2.G();
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                } else {
                    aVar2.h();
                }
                return s3q0.a;
            case 6:
                eg20 eg20Var = (eg20) obj3;
                oj0 oj0Var = (oj0) obj;
                eg20.a aVar4 = (eg20.a) obj2;
                ProfilesInfo profilesInfo = aVar4.c;
                xf20 xf20Var = aVar4.b;
                w8v w8vVar = aVar4.a;
                nj0 nj0Var = eg20Var.b;
                int i5 = xf20Var.b;
                boolean z5 = xf20Var.d;
                int i6 = xf20Var.a;
                tk30 tk30Var = nj0Var.a;
                tk30Var.y(i5);
                List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list3 = oj0Var.b;
                int i7 = oj0Var.e;
                List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list4 = list3 == null ? EmptyList.b : list3;
                if (eg20Var.f) {
                    i7 = Integer.MAX_VALUE;
                } else {
                    if (!(w8vVar instanceof w8v.b)) {
                        if ((w8vVar instanceof w8v.g) && ((w8v.g) w8vVar).c && i7 < 0) {
                            Iterator<Msg> it = w8vVar.b.iterator();
                            Msg msg = null;
                            while (it.hasNext()) {
                                Msg next = it.next();
                                Msg msg2 = next;
                                if (msg2.d > 0 && msg2.i) {
                                    msg = next;
                                }
                            }
                            msgListOpenMode = null;
                            Msg msg3 = msg;
                            if (msg3 == null) {
                                i = -1;
                                gj30 gj30Var = w8vVar.b;
                                tk30Var.F(profilesInfo);
                                if (w8vVar instanceof w8v.a) {
                                }
                                list = list4;
                                i2 = i;
                                z = w8vVar instanceof w8v.b;
                                if (!z) {
                                }
                                if (c != null) {
                                }
                                z2 = w8vVar instanceof w8v.g;
                                if (z2) {
                                }
                                z4 = w8vVar instanceof w8v.e;
                                if (z4) {
                                }
                                if (z2) {
                                }
                                set = EmptySet.b;
                                set2 = set;
                                io.reactivex.rxjava3.subjects.d<oj0> dVar = eg20Var.p;
                                if (z) {
                                }
                                list2 = I;
                                i3 = i2;
                                ufh0Var2 = ufh0Var;
                                return new oj0(a, list2, c, ufh0Var2, i3, z3, set2);
                            }
                            i7 = msg3.d;
                        } else {
                            msgListOpenMode = null;
                        }
                        i = i7;
                        gj30 gj30Var2 = w8vVar.b;
                        tk30Var.F(profilesInfo);
                        if (w8vVar instanceof w8v.a) {
                        }
                        list = list4;
                        i2 = i;
                        z = w8vVar instanceof w8v.b;
                        if (!z) {
                        }
                        if (c != null) {
                        }
                        z2 = w8vVar instanceof w8v.g;
                        if (z2) {
                        }
                        z4 = w8vVar instanceof w8v.e;
                        if (z4) {
                        }
                        if (z2) {
                        }
                        set = EmptySet.b;
                        set2 = set;
                        io.reactivex.rxjava3.subjects.d<oj0> dVar2 = eg20Var.p;
                        if (z) {
                        }
                        list2 = I;
                        i3 = i2;
                        ufh0Var2 = ufh0Var;
                        return new oj0(a, list2, c, ufh0Var2, i3, z3, set2);
                    }
                    List<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> list5 = list3;
                    if (list5 == null || list5.isEmpty() || i7 == -1) {
                        i = i6;
                        msgListOpenMode = null;
                        gj30 gj30Var22 = w8vVar.b;
                        tk30Var.F(profilesInfo);
                        if (w8vVar instanceof w8v.a) {
                            if (w8vVar instanceof w8v.e) {
                                w8v.e eVar = (w8v.e) w8vVar;
                                if (eVar.c) {
                                    I = nj0Var.a.c(list4, eVar.d, gj30Var22.e, gj30Var22.c, i);
                                } else {
                                    list = list4;
                                    i2 = i;
                                    I = tk30Var.e(gj30Var22, i2);
                                }
                            } else {
                                list = list4;
                                i2 = i;
                                I = w8vVar instanceof w8v.d ? tk30Var.I(list) : tk30Var.e(gj30Var22, i2);
                            }
                            z = w8vVar instanceof w8v.b;
                            c = !z ? msgListOpenMode : eg20.c(((w8v.b) w8vVar).c);
                            a = c != null ? msgListOpenMode : androidx.recyclerview.widget.m.a(new ll30(list, I), false);
                            z2 = w8vVar instanceof w8v.g;
                            z3 = (!z2 && ((w8v.g) w8vVar).e) || ((w8vVar instanceof w8v.e) && ((w8v.e) w8vVar).c);
                            z4 = w8vVar instanceof w8v.e;
                            if (z4) {
                                w8v.e eVar2 = (w8v.e) w8vVar;
                                if (eVar2.c) {
                                    List<Msg> list6 = eVar2.d;
                                    ArrayList arrayList = new ArrayList(c5g.u(list6, 10));
                                    Iterator<T> it2 = list6.iterator();
                                    while (it2.hasNext()) {
                                        arrayList.add(Integer.valueOf(((Msg) it2.next()).b));
                                    }
                                    set = j5g.S0(arrayList);
                                    set2 = set;
                                    io.reactivex.rxjava3.subjects.d<oj0> dVar22 = eg20Var.p;
                                    if (z) {
                                        MsgListOpenMode c3 = eg20.c(((w8v.b) w8vVar).c);
                                        if (c3 == null) {
                                            ufh0Var = ufh0.f.a;
                                        } else {
                                            if (c3 instanceof MsgListOpenAtMsgMode) {
                                                MsgListOpenAtMsgMode msgListOpenAtMsgMode = (MsgListOpenAtMsgMode) c3;
                                                list2 = I;
                                                i3 = i2;
                                                ufh0Var2 = new ufh0.d(msgListOpenAtMsgMode.b, msgListOpenAtMsgMode.c);
                                                return new oj0(a, list2, c, ufh0Var2, i3, z3, set2);
                                            }
                                            if (c3 instanceof MsgListOpenAtLatestMode) {
                                                ufh0Var = new ufh0.b();
                                            } else if (!(c3 instanceof MsgListOpenAtUnreadMode) && !z5) {
                                                ufh0Var = new ufh0.b();
                                            } else if (!z5) {
                                                ufh0Var = new ufh0.b();
                                            } else if (i6 < 0) {
                                                ufh0Var = new ufh0.b();
                                            } else {
                                                Iterator<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> it3 = I.iterator();
                                                int i8 = 0;
                                                while (true) {
                                                    if (it3.hasNext()) {
                                                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g next2 = it3.next();
                                                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E02 = next2.E0();
                                                        if ((E02 != null ? E02.c : -1) <= i6 || next2.N0()) {
                                                            i8++;
                                                        }
                                                    } else {
                                                        i8 = -1;
                                                    }
                                                }
                                                int i9 = i8 - 1;
                                                com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar2 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i9, I);
                                                if (gVar2 == null || !gVar2.v0()) {
                                                    com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g gVar3 = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.k0(I);
                                                    if (gVar3 != null && gVar3.N0()) {
                                                        ListIterator<com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g> listIterator = I.listIterator(I.size());
                                                        while (true) {
                                                            if (!listIterator.hasPrevious()) {
                                                                i9 = -1;
                                                            } else if (!listIterator.previous().N0()) {
                                                                i9 = listIterator.nextIndex();
                                                            }
                                                        }
                                                        com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.c E03 = I.get(i9).E0();
                                                        if (E03 != null) {
                                                            int i10 = E03.b;
                                                            for (int i11 = i9 - 1; -1 < i11; i11--) {
                                                                if (i11 > 0 && ((gVar = (com.vk.im.ui.components.viewcontrollers.msg_list.adapter.model.g) j5g.b0(i11, I)) == null || (E0 = gVar.E0()) == null || E0.b != i10)) {
                                                                    i8 = i11 - 1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                    ufh0Var = new ufh0.e(i8);
                                                }
                                                i8 = i9;
                                                ufh0Var = new ufh0.e(i8);
                                            }
                                        }
                                    } else if (z4) {
                                        ufh0Var = new ufh0.b();
                                    } else if (z2) {
                                        w8v.g gVar4 = (w8v.g) w8vVar;
                                        ufh0Var = (gVar4.e && gVar4.d) ? new ufh0.b() : new ufh0.c();
                                    } else {
                                        if (w8vVar instanceof w8v.d) {
                                            oj0 P0 = dVar22.P0();
                                            if (!((P0 != null ? P0.d : msgListOpenMode) instanceof ufh0.f)) {
                                                ufh0Var = dVar22.P0().d;
                                            }
                                        }
                                        ufh0Var = ufh0.f.a;
                                    }
                                    list2 = I;
                                    i3 = i2;
                                    ufh0Var2 = ufh0Var;
                                    return new oj0(a, list2, c, ufh0Var2, i3, z3, set2);
                                }
                            }
                            if (z2 || !((w8v.g) w8vVar).e) {
                                set = EmptySet.b;
                                set2 = set;
                                io.reactivex.rxjava3.subjects.d<oj0> dVar222 = eg20Var.p;
                                if (z) {
                                }
                                list2 = I;
                                i3 = i2;
                                ufh0Var2 = ufh0Var;
                                return new oj0(a, list2, c, ufh0Var2, i3, z3, set2);
                            }
                            List<Msg> k = w8vVar.a.k();
                            LinkedHashSet linkedHashSet = new LinkedHashSet();
                            Iterator<T> it4 = k.iterator();
                            while (it4.hasNext()) {
                                linkedHashSet.add(Integer.valueOf(((Msg) it4.next()).b));
                            }
                            List<Msg> k2 = w8vVar.b.k();
                            Set linkedHashSet2 = new LinkedHashSet();
                            for (Msg msg4 : k2) {
                                Object valueOf = !linkedHashSet.contains(Integer.valueOf(msg4.b)) ? Integer.valueOf(msg4.b) : msgListOpenMode;
                                if (valueOf != null) {
                                    linkedHashSet2.add(valueOf);
                                }
                            }
                            set2 = linkedHashSet2;
                            io.reactivex.rxjava3.subjects.d<oj0> dVar2222 = eg20Var.p;
                            if (z) {
                            }
                            list2 = I;
                            i3 = i2;
                            ufh0Var2 = ufh0Var;
                            return new oj0(a, list2, c, ufh0Var2, i3, z3, set2);
                        }
                        w8v.a aVar5 = (w8v.a) w8vVar;
                        gj30 gj30Var3 = aVar5.c;
                        int i12 = nj0.a.$EnumSwitchMapping$0[aVar5.d.ordinal()];
                        if (i12 == 1) {
                            I = nj0Var.a.h(list4, gj30Var3.k(), gj30Var22.e, gj30Var3.c, i);
                        } else {
                            if (i12 != 2) {
                                throw new NoWhenBranchMatchedException();
                            }
                            I = nj0Var.a.c(list4, gj30Var3.k(), gj30Var3.e, gj30Var22.c, i);
                        }
                        list = list4;
                        i2 = i;
                        z = w8vVar instanceof w8v.b;
                        if (!z) {
                        }
                        if (c != null) {
                        }
                        z2 = w8vVar instanceof w8v.g;
                        if (z2) {
                        }
                        z4 = w8vVar instanceof w8v.e;
                        if (z4) {
                        }
                        if (z2) {
                        }
                        set = EmptySet.b;
                        set2 = set;
                        io.reactivex.rxjava3.subjects.d<oj0> dVar22222 = eg20Var.p;
                        if (z) {
                        }
                        list2 = I;
                        i3 = i2;
                        ufh0Var2 = ufh0Var;
                        return new oj0(a, list2, c, ufh0Var2, i3, z3, set2);
                    }
                }
                i = i7;
                msgListOpenMode = null;
                gj30 gj30Var222 = w8vVar.b;
                tk30Var.F(profilesInfo);
                if (w8vVar instanceof w8v.a) {
                }
                list = list4;
                i2 = i;
                z = w8vVar instanceof w8v.b;
                if (!z) {
                }
                if (c != null) {
                }
                z2 = w8vVar instanceof w8v.g;
                if (z2) {
                }
                z4 = w8vVar instanceof w8v.e;
                if (z4) {
                }
                if (z2) {
                }
                set = EmptySet.b;
                set2 = set;
                io.reactivex.rxjava3.subjects.d<oj0> dVar222222 = eg20Var.p;
                if (z) {
                }
                list2 = I;
                i3 = i2;
                ufh0Var2 = ufh0Var;
                return new oj0(a, list2, c, ufh0Var2, i3, z3, set2);
            case 7:
                ((Integer) obj2).getClass();
                un20.k((String) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
            case 8:
                ((Integer) obj2).getClass();
                int i13 = c430.h1;
                ((c430) obj3).eo(ne7.I(9), (androidx.compose.runtime.a) obj);
                return s3q0.a;
            case 9:
                PlayerService playerService = (PlayerService) obj3;
                AppWidgetManager appWidgetManager = (AppWidgetManager) obj;
                io.reactivex.rxjava3.disposables.c cVar = PlayerSmallWidget.b;
                RemoteViews remoteViews = new RemoteViews(playerService.getPackageName(), R.layout.widget_player);
                PendingIntent c4 = AudioPlayerWidget.c(playerService, "small_player_widget");
                remoteViews.setViewVisibility(R.id.w_player_artist, 8);
                remoteViews.setViewVisibility(R.id.w_player_placeholder, 0);
                remoteViews.setTextViewText(R.id.w_player_placeholder, playerService.getString(R.string.audio_widget_inactive));
                remoteViews.setViewVisibility(R.id.w_player_btns_wrap, 8);
                remoteViews.setViewVisibility(R.id.w_player_cover, 8);
                remoteViews.setImageViewResource(R.id.w_player_bg, R.drawable.transparent);
                remoteViews.setViewVisibility(R.id.w_player_cover_placeholder, 0);
                remoteViews.setOnClickPendingIntent(R.id.w_player_cover_wrap, c4);
                remoteViews.setOnClickPendingIntent(R.id.w_player_placeholder, c4);
                remoteViews.setImageViewResource(R.id.w_player_cover_placeholder, R.drawable.ic_music_120);
                for (int i14 : (int[]) obj2) {
                    appWidgetManager.updateAppWidget(i14, remoteViews);
                }
                return s3q0.a;
            case 10:
                VideoPlaylistRootVh videoPlaylistRootVh = (VideoPlaylistRootVh) obj3;
                videoPlaylistRootVh.q0((VideoFile) obj, ((UIBlockVideoAlbum) obj2).f, videoPlaylistRootVh.L);
                return s3q0.a;
            default:
                ((Integer) obj2).getClass();
                aou0.a((doj) obj3, (androidx.compose.runtime.a) obj, ne7.I(1));
                return s3q0.a;
        }
    }

    public /* synthetic */ l(Object obj, int i, int i2) {
        this.b = i2;
        this.c = obj;
    }
}
