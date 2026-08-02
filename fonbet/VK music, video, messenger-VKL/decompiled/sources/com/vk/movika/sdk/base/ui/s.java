package com.vk.movika.sdk.base.ui;

import android.content.Context;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.view.GestureDetector;
import android.view.View;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.ads.core.data.datasource.MaxAdRevenueListener;
import com.vk.catalog.mvi.block.impl.LinksSmallListVideoLibrary;
import com.vk.catalog.mvi.block.video.impl.video.list.c;
import com.vk.clips.editor.mapper.fragment.ClipsEditorFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.ClipsWrapperFragment;
import com.vk.core.ui.bottomsheet.actionsheet.ModalActionSheetListItem;
import com.vk.core.ui.bottomsheet.actionsheet.a;
import com.vk.core.ui.tracking.UiTracker;
import com.vk.dto.common.VideoFile;
import com.vk.dto.common.VideoFileOld;
import com.vk.dto.stories.model.StoryEntry;
import com.vk.dto.stories.model.StoryOwner;
import com.vk.ecomm.cart.impl.cart.ui.items.CartItem;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.OrderListAction;
import com.vk.ecomm.orders.impl.orderlist.presentation.mvi.viewstate.OrdersListItem;
import com.vk.libvideo.autoplay.VideoAutoPlay;
import com.vk.libvideo.videobottomsheet.api.VideoBottomSheetSideEffectOptions;
import com.vk.music.player.PlayerTrack;
import com.vk.profile.user.impl.UserProfileDialogs;
import com.vk.profile.user.impl.ui.f;
import com.vk.stat.scheme.MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.stat.scheme.SchemeStat$TypeClick;
import com.vkontakte.android.R;
import com.vkontakte.android.api.ExtendedUserProfile;
import java.util.Iterator;
import one.video.player.OneVideoPlayer;
import xsna.a0a;
import xsna.a1p;
import xsna.ad7;
import xsna.b6f;
import xsna.b6f.c;
import xsna.bjc;
import xsna.c8m0;
import xsna.cih;
import xsna.dms0;
import xsna.dw20;
import xsna.e2b0;
import xsna.ecw;
import xsna.f4m;
import xsna.fq60;
import xsna.fsc0;
import xsna.gq60;
import xsna.gzs;
import xsna.hg10;
import xsna.i2e0;
import xsna.i5s;
import xsna.izs;
import xsna.jd10;
import xsna.jte;
import xsna.jtm;
import xsna.kd7;
import xsna.lq;
import xsna.m7q;
import xsna.myc0;
import xsna.n6j;
import xsna.npf;
import xsna.po5;
import xsna.ppf;
import xsna.rl3;
import xsna.rv9;
import xsna.s3q0;
import xsna.s6s0;
import xsna.tbh;
import xsna.tho0;
import xsna.ujm;
import xsna.uuf;
import xsna.vfg0;
import xsna.vst0;
import xsna.wh50;
import xsna.wve;
import xsna.xkh;
import xsna.xn50;
import xsna.xpp0;
import xsna.xu20;
import xsna.y40;
import xsna.y6s0;
import xsna.yo60;
import xsna.yu20;
import xsna.z40;
import xsna.zak0;
import xsna.ztm;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class s implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ s(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        npf h;
        String onMessageReceived$lambda$0;
        StoryOwner storyOwner;
        String str = null;
        int i = 0;
        switch (this.b) {
            case 0:
                ((y) this.c).d.n.g((String) this.d);
                return s3q0.a;
            case 1:
                z40 z40Var = (z40) this.c;
                wh50 wh50Var = z40Var.d;
                wh50 wh50Var2 = z40Var.i;
                Context context = (Context) this.d;
                a.C0785a c0785a = new a.C0785a();
                wh50 wh50Var3 = z40Var.c;
                xu20 xu20Var = (myc0.f(((tho0) ((zak0) wh50Var3).getValue()).a.c) || myc0.f(((tho0) ((zak0) wh50Var).getValue()).a.c)) ? new xu20(((tho0) ((zak0) wh50Var3).getValue()).a.c, ((tho0) ((zak0) wh50Var).getValue()).a.c, 0, null, 12) : null;
                ModalActionSheetListItem.Appearance appearance = ModalActionSheetListItem.Appearance.Default;
                c0785a.b = rl3.I(new yu20[]{xu20Var, new ModalActionSheetListItem(0, appearance, "Title Default", null, z40Var.d() ? "Description" : null, z40Var.e() ? R.drawable.vk_icon_user_24 : 0, (ModalActionSheetListItem.IconSize) ((zak0) wh50Var2).getValue(), z40Var.b(), z40Var.c(), 8), new ModalActionSheetListItem(0, appearance, "Very Long Title Very Long Title Very Long Title Very Long Title Very Long Title Very Long Title Very Long Title Very Long Title Very Long Title ", null, z40Var.d() ? "Very Long Description Very Long Description Very Long Description Very Long Description Very Long Description Very Long Description Very Long Description Very Long Description " : null, z40Var.e() ? R.drawable.vk_icon_users_24 : 0, (ModalActionSheetListItem.IconSize) ((zak0) wh50Var2).getValue(), z40Var.b(), z40Var.c(), 8), new ModalActionSheetListItem(0, ModalActionSheetListItem.Appearance.Disabled, "Title Disabled", null, z40Var.d() ? "Description" : null, z40Var.e() ? R.drawable.vk_icon_attach_24 : 0, (ModalActionSheetListItem.IconSize) ((zak0) wh50Var2).getValue(), z40Var.b(), z40Var.c(), 8), new ModalActionSheetListItem(0, ModalActionSheetListItem.Appearance.Negative, "Title Negative", null, z40Var.d() ? "Description" : null, z40Var.e() ? R.drawable.vk_icon_delete_outline_24 : 0, (ModalActionSheetListItem.IconSize) ((zak0) wh50Var2).getValue(), z40Var.b(), z40Var.c(), 8)});
                c0785a.c = new y40(i);
                c0785a.a(context, null);
                return s3q0.a;
            case 2:
                ((izs) this.c).invoke(new rv9.i.f(((CartItem.d) this.d).c));
                return s3q0.a;
            case 3:
                ((izs) this.c).invoke(new jte.j(((wve.a) this.d).a));
                return s3q0.a;
            case 4:
                return new GestureDetector((Context) this.c, ((b6f) this.d).new c());
            case 5:
                uuf.e eVar = (uuf.e) this.c;
                ClipsWrapperFragment clipsWrapperFragment = (ClipsWrapperFragment) this.d;
                int i2 = ClipsWrapperFragment.Q0;
                ppf o = eVar.a.o();
                if (o != null && (h = o.h()) != null) {
                    xn50.a.c(clipsWrapperFragment, h);
                }
                return s3q0.a;
            case 6:
                cih cihVar = (cih) this.c;
                return new xkh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) this.d, cihVar.f);
            case 7:
                ztm ztmVar = (ztm) this.c;
                RecyclerView.e0 e0Var = (RecyclerView.e0) this.d;
                if (!ztmVar.b()) {
                    ztmVar.a();
                } else if (((ujm) e0Var).m) {
                    ((jtm) ztmVar.c.invoke()).e();
                }
                return s3q0.a;
            case 8:
                y6s0 y6s0Var = (y6s0) this.c;
                s6s0 s6s0Var = (s6s0) this.d;
                if (y6s0Var != null) {
                    y6s0Var.b(VideoBottomSheetSideEffectOptions.PUBLICATION_DATE_CHANGED, s6s0Var.a);
                }
                a1p a1pVar = a1p.c;
                boolean g = hg10.g(s6s0Var);
                VideoFile videoFile = s6s0Var.a;
                long o0 = videoFile.o0();
                long j = videoFile.I0().b;
                a1pVar.getClass();
                SchemeStat$EventItem.Type type = g ? SchemeStat$EventItem.Type.CLIP : SchemeStat$EventItem.Type.VIDEO;
                UiTracker uiTracker = UiTracker.a;
                new bjc(UiTracker.c(), SchemeStat$TypeClick.a.b(new SchemeStat$EventItem(type, Long.valueOf(o0), Long.valueOf(j), null, null, null, 56, null), new MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick(MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventType.CHANGE_POSTPONED, null, MobileOfficialAppsVideoStat$TypeVideoPostponedPublicationClick.EventSubtype.POSTPONED, 2, null), 2)).q();
                return s3q0.a;
            case 9:
                one.video.player.j jVar = (one.video.player.j) this.c;
                OneVideoPlayer oneVideoPlayer = (OneVideoPlayer) this.d;
                Iterator<OneVideoPlayer.c> it = jVar.b.iterator();
                while (it.hasNext()) {
                    it.next().p(oneVideoPlayer);
                }
                return s3q0.a;
            case 10:
                ecw ecwVar = (ecw) this.c;
                tbh tbhVar = (tbh) this.d;
                ecwVar.d = false;
                View view = ecwVar.a;
                view.clearFocus();
                f4m.j(view);
                tbhVar.invoke();
                return s3q0.a;
            case 11:
                ((izs) this.c).invoke(new LinksSmallListVideoLibrary.b(((LinksSmallListVideoLibrary.d) this.d).b));
                return s3q0.a;
            case 12:
                ((jd10) this.c).j.d((VideoFileOld) this.d);
                return s3q0.a;
            case 13:
                onMessageReceived$lambda$0 = MaxAdRevenueListener.onMessageReceived$lambda$0((MaxAdRevenueListener) this.c, (Bundle) this.d);
                return onMessageReceived$lambda$0;
            case 14:
                ((izs) this.c).invoke(new OrderListAction.d(((OrdersListItem.Order) this.d).b));
                return s3q0.a;
            case 15:
                ((e2b0) this.c).s0((PlayerTrack) this.d, false, "new");
                return s3q0.a;
            case 16:
                fsc0 fsc0Var = (fsc0) this.c;
                yo60.j jVar2 = (yo60.j) this.d;
                fq60 fq60Var = (fq60) fsc0Var.e.getValue();
                gq60 gq60Var = fsc0Var.c;
                fq60Var.getClass();
                fq60.c(jVar2, gq60Var);
                return s3q0.a;
            case 17:
                int i3 = ((i2e0) this.c).a;
                ad7 ad7Var = (ad7) this.d;
                Bitmap bitmap = ad7Var.j;
                return ad7Var instanceof c8m0 ? bitmap.getWidth() > bitmap.getHeight() ? kd7.b(bitmap, i3, i3, false, true) : kd7.b(bitmap, i3, i3, false, false) : kd7.b(bitmap, i3, i3, false, true);
            case 18:
                StoryEntry storyEntry = (StoryEntry) this.c;
                String str2 = (String) this.d;
                StringBuilder sb = new StringBuilder("preload done entry ");
                n6j.b(sb, storyEntry != null ? storyEntry.Kb() : null, " photo url=", str2, " owner=");
                if (storyEntry != null && (storyOwner = storyEntry.l0) != null) {
                    str = storyOwner.Db();
                }
                sb.append(str);
                return sb.toString();
            case 19:
                xpp0 xpp0Var = (xpp0) this.c;
                xpp0.a aVar = (xpp0.a) this.d;
                xpp0Var.dismiss();
                aVar.j.invoke();
                return s3q0.a;
            case 20:
                UserProfileDialogs userProfileDialogs = (UserProfileDialogs) this.c;
                if (userProfileDialogs.g.a(((ExtendedUserProfile) this.d).a.c)) {
                    dw20 dw20Var = userProfileDialogs.k;
                    if (dw20Var != null) {
                        dw20Var.dismiss();
                    }
                } else {
                    userProfileDialogs.h.B(new f.e.o0(null, i5s.a(new StringBuilder("https://id."), a0a.d, "/account/#/verifications")));
                    dw20 dw20Var2 = userProfileDialogs.k;
                    if (dw20Var2 != null) {
                        dw20Var2.dismiss();
                    }
                }
                return s3q0.a;
            case 21:
                m7q m7qVar = (m7q) this.c;
                VideoAutoPlay videoAutoPlay = (VideoAutoPlay) this.d;
                StringBuilder sb2 = new StringBuilder("Source host is null in source= {");
                sb2.append(m7qVar);
                sb2.append("}, videoFile {");
                return lq.a(sb2, videoAutoPlay.u, '}');
            case 22:
                dms0 dms0Var = (dms0) this.c;
                return new vfg0(dms0Var.a.getCtx(), dms0Var.d, dms0Var.b, dms0Var.f, (ClipsEditorFragment.b) this.d, dms0Var.h);
            default:
                ((izs) this.c).invoke(new c.b(((vst0) this.d).b));
                return s3q0.a;
        }
    }
}
