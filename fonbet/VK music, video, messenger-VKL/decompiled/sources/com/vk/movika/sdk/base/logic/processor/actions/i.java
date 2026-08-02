package com.vk.movika.sdk.base.logic.processor.actions;

import android.view.ViewGroup;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.dto.stories.model.clickable.ClickableMarketItem;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.onlinebooking.impl.completed.pesentation.BookingRecordCompletedScreenFragment;
import com.vk.ecomm.onlinebooking.impl.di.OnlineBookingInternalComponent;
import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.movika.sdk.base.model.k;
import com.vk.movika.sdk.base.model.s;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.webapp.fragments.BannedFragment;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.LazyThreadSafetyMode;
import xsna.azb;
import xsna.bp80;
import xsna.bpn0;
import xsna.bre;
import xsna.cpk;
import xsna.frd;
import xsna.gzs;
import xsna.hkp;
import xsna.hrl;
import xsna.l7m;
import xsna.m7m;
import xsna.qcy;
import xsna.qnj;
import xsna.s3q0;
import xsna.tim;
import xsna.tsu;
import xsna.xn50;
import xsna.xyb;
import xsna.ynh;
import xsna.yok0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class i implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ i(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Type inference failed for: r0v32, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r0v50, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r1v13, types: [java.lang.Object, kotlin.Lazy] */
    /* JADX WARN: Type inference failed for: r3v26, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        io.reactivex.rxjava3.disposables.c cVar;
        int i = this.b;
        boolean z = false;
        z = false;
        Object obj = this.c;
        switch (i) {
            case 0:
                j.a aVar = (j.a) obj;
                k kVar = aVar.c;
                s sVar = aVar.d;
                if (sVar != null && (r0 = a.a(kVar)) != null) {
                    break;
                }
                break;
            case 1:
                break;
            case 2:
                int i2 = AllHighlightsFragment.g0;
                break;
            case 3:
                int i3 = BannedFragment.c0;
                String string = ((BannedFragment) obj).requireArguments().getString("secret");
                if (string == null) {
                }
                break;
            case 4:
                break;
            case 5:
                BookingRecordCompletedScreenFragment bookingRecordCompletedScreenFragment = (BookingRecordCompletedScreenFragment) obj;
                qcy<Object>[] qcyVarArr = BookingRecordCompletedScreenFragment.Q;
                bp80 bp80Var = new bp80(bookingRecordCompletedScreenFragment.eo());
                l7m d = m7m.d(bookingRecordCompletedScreenFragment);
                OnlineBookingInternalComponent.n.getClass();
                break;
            case 6:
                break;
            case 7:
                break;
            case 8:
                break;
            case 9:
                break;
            case 10:
                tsu tsuVar = ((azb) obj).k;
                if (tsuVar != null && (cVar = ((xyb) tsuVar.b).x.j) != null) {
                    cVar.dispose();
                }
                break;
            case 11:
                break;
            case 12:
                List<ClickableSticker> list = ((ClickableStickers) obj).d;
                if (!(list instanceof Collection) || !list.isEmpty()) {
                    Iterator<T> it = list.iterator();
                    while (true) {
                        if (it.hasNext()) {
                            if (((ClickableSticker) it.next()) instanceof ClickableMarketItem) {
                                z = true;
                            }
                        }
                    }
                }
                break;
            case 13:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) obj;
                int i4 = ClipFeedListFragment.a2;
                io.reactivex.rxjava3.subjects.e eVar = frd.a;
                if (frd.a()) {
                    break;
                }
                break;
            case 14:
                break;
            case 15:
                break;
            case 16:
                break;
            case 17:
                break;
            case 18:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj;
                int i5 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.getClass();
                xn50.a.c(clipsFavoriteFolderContentListFragment, a.InterfaceC0586a.C0587a.b);
                break;
            case 19:
                bre.b bVar = bre.s1;
                break;
            case 20:
                ClipsViewerComponentImpl clipsViewerComponentImpl = (ClipsViewerComponentImpl) obj;
                qcy<Object>[] qcyVarArr2 = ClipsViewerComponentImpl.o0;
                LazyThreadSafetyMode lazyThreadSafetyMode = LazyThreadSafetyMode.PUBLICATION;
                break;
            case 21:
                ((yok0) obj).b(null);
                break;
            case 22:
                break;
            case 23:
                bpn0 bpn0Var = com.vk.libvideo.autoplay.b.B;
                break;
            case 24:
                ynh ynhVar = (ynh) obj;
                CommunityProfileFragment communityProfileFragment = ynhVar.a;
                break;
            case 25:
                qnj qnjVar = (qnj) obj;
                ViewGroup viewGroup = qnjVar.e;
                qnjVar.b(viewGroup != null ? viewGroup : null);
                break;
            case 26:
                ((cpk) obj).a();
                break;
            case 27:
                break;
            case 28:
                ((hrl) obj).d = false;
                break;
            default:
                hkp hkpVar = ((tim) obj).p;
                if (hkpVar != null) {
                    hkpVar.g();
                }
                break;
        }
        return s3q0.a;
    }
}
