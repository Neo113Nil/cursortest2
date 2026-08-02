package com.vk.movika.sdk.base.ui;

import android.app.Activity;
import android.content.Context;
import android.content.DialogInterface;
import android.view.View;
import android.view.ViewGroup;
import android.view.ViewStub;
import android.widget.Toast;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import androidx.fragment.app.FragmentManager;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.data.model.AdObject;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import com.unity3d.services.core.di.ServiceProvider;
import com.unity3d.services.core.di.ServicesRegistry;
import com.unity3d.services.core.di.UnityAdsModule;
import com.vk.catalog2.feature.music.holders.ComposeMusicActionPlayAudiosFromBlockIdVh;
import com.vk.dto.actionlinks.ActionLink;
import com.vk.dto.articles.Article;
import com.vk.dto.attachments.ArticleAttachment;
import com.vk.dto.podcast.PodcastPage;
import com.vk.ecomm.market.good.ui.holder.contentholder.MediaContentItem;
import com.vk.ecomm.onlinebooking.impl.main.presentation.mvi2.o;
import com.vk.im.engine.models.attaches.AttachVideoMsg;
import com.vk.im.ui.components.viewcontrollers.msg_list.adapter.skelton.MsgSkeletonViewRedesign;
import com.vk.log.L;
import com.vk.log.LoggerOutputTarget;
import com.vk.music.podcast.api.menu.PodcastMenuItem;
import com.vk.music.podcast.impl.ui.episode.PodcastEpisodeFragment;
import com.vk.profile.user.impl.ui.UserProfileAction;
import com.vk.qrcode.QRStatsTracker;
import com.vk.qrcode.b;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$EditorEvent;
import com.vk.stat.scheme.MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem;
import com.vk.voip.dto.call_member.CallMemberId;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vkontakte.android.R;
import com.vkontakte.android.actionlinks.BaseItem;
import com.vkontakte.android.actionlinks.views.fragments.add.AddLinkPresenter;
import com.vkontakte.android.attachments.GeoAttachment;
import java.util.Collection;
import java.util.Set;
import java.util.concurrent.locks.ReentrantLock;
import kotlin.collections.EmptyList;
import ru.ok.android.webrtc.signaling.transport.SignalingTransport;
import xsna.a0a;
import xsna.aiq0;
import xsna.an30;
import xsna.b2d;
import xsna.b3;
import xsna.b9w;
import xsna.c7a0;
import xsna.cih;
import xsna.d3h;
import xsna.dm0;
import xsna.drm0;
import xsna.e4s;
import xsna.ei90;
import xsna.enq;
import xsna.f1m;
import xsna.fnf0;
import xsna.fvk;
import xsna.go9;
import xsna.gzs;
import xsna.hyn;
import xsna.i0q0;
import xsna.i3i0;
import xsna.izs;
import xsna.j5g;
import xsna.jl4;
import xsna.k9x;
import xsna.ksk0;
import xsna.l2d;
import xsna.mc90;
import xsna.mfh;
import xsna.no00;
import xsna.nt8;
import xsna.o25;
import xsna.onf0;
import xsna.p0x;
import xsna.paa0;
import xsna.pb90;
import xsna.plc;
import xsna.po5;
import xsna.pqq;
import xsna.qb90;
import xsna.qgp0;
import xsna.qp0;
import xsna.rp0;
import xsna.rwi;
import xsna.s3q0;
import xsna.sm3;
import xsna.tty;
import xsna.uhz;
import xsna.va9;
import xsna.vof0;
import xsna.vtn0;
import xsna.w6d;
import xsna.wz30;
import xsna.xe9;
import xsna.xq3;
import xsna.ym3;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class r0 implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ r0(int i, Object obj, Object obj2) {
        this.b = i;
        this.c = obj;
        this.d = obj2;
    }

    /* JADX WARN: Type inference failed for: r0v28, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        ExposedFunction invoke$lambda$40;
        fvk initialize$lambda$220$lambda$22;
        int i = 1;
        switch (this.b) {
            case 0:
                com.vk.movika.sdk.player.base.model.a aVar = (com.vk.movika.sdk.player.base.model.a) this.c;
                v0 v0Var = (v0) this.d;
                String str = aVar.b;
                String str2 = aVar.a;
                Set keySet = v0Var.h.keySet();
                StringBuilder a = xe9.a("getNext: Can not resolve chapter from chapterBuffer! item.tag = ", str, ", item.id = ", str2, ", chapterBuffer.keys = ");
                a.append(keySet);
                return a.toString();
            case 1:
                AccessibilityEvents accessibilityEvents = (AccessibilityEvents) this.c;
                Collection<CallMemberId> collection = (Collection) this.d;
                accessibilityEvents.c("usersStartMovie(" + collection.size() + ')');
                accessibilityEvents.b(AccessibilityEvents.Event.MOVIE_STARTED, AccessibilityEvents.Event.MOVIE_STOPPED, collection);
                return s3q0.a;
            case 2:
                AddLinkPresenter addLinkPresenter = (AddLinkPresenter) this.c;
                BaseItem baseItem = (BaseItem) this.d;
                if (baseItem instanceof com.vkontakte.android.actionlinks.h) {
                    addLinkPresenter.b("https://" + a0a.d + "/id" + ((com.vkontakte.android.actionlinks.h) baseItem).e.c);
                } else if (baseItem instanceof com.vkontakte.android.actionlinks.e) {
                    addLinkPresenter.b("https://" + a0a.d + "/club" + ((com.vkontakte.android.actionlinks.e) baseItem).e.c);
                }
                return s3q0.a;
            case 3:
                rp0 rp0Var = (rp0) this.c;
                ActionLink actionLink = (ActionLink) this.d;
                qp0 qp0Var = rp0Var.j;
                (qp0Var != null ? qp0Var : null).dismiss();
                if (!rp0Var.b) {
                    rp0Var.b = true;
                    dm0 dm0Var = rp0Var.k;
                    if (dm0Var != null) {
                        dm0Var.b(actionLink);
                    }
                }
                return s3q0.a;
            case 4:
                ym3 ym3Var = (ym3) this.c;
                sm3 sm3Var = (sm3) this.d;
                Article article = ym3Var.a;
                enq.g(sm3Var.itemView.getContext(), new ArticleAttachment(article), new pqq(article.d, null, null, null, 14), null, null);
                return s3q0.a;
            case 5:
                ((izs) this.c).invoke(((o.a) this.d).b.b);
                return s3q0.a;
            case 6:
                va9 va9Var = (va9) this.c;
                FragmentManager fragmentManager = (FragmentManager) this.d;
                va9Var.getClass();
                va9.k(new b3(va9Var, 12));
                if (va9Var.e()) {
                    i0q0.f(new jl4(i, va9Var, fragmentManager));
                }
                return s3q0.a;
            case 7:
                return new l2d((w6d) ((b2d) this.c).a.getValue(), (i3i0) this.d);
            case 8:
                ((d3h) this.c).i((String) this.d);
                return s3q0.a;
            case 9:
                cih cihVar = (cih) this.c;
                return new mfh(cihVar.a, cihVar.b, cihVar.c, cihVar.d, (po5) this.d, cihVar.f);
            case 10:
                ((ComposeMusicActionPlayAudiosFromBlockIdVh) this.c).onClick((View) this.d);
                return s3q0.a;
            case 11:
                ((izs) this.c).invoke(new aiq0.g.a((e4s.a) this.d));
                return s3q0.a;
            case 12:
                invoke$lambda$40 = HandleInvocationsFromAdViewer.invoke$lambda$40((HandleInvocationsFromAdViewer) this.c, (AdObject) this.d);
                return invoke$lambda$40;
            case 13:
                f1m f1mVar = (f1m) this.c;
                mc90 mc90Var = (mc90) this.d;
                pb90 pb90Var = (pb90) f1mVar.getValue();
                return new qb90(mc90Var, pb90Var, new androidx.compose.foundation.lazy.layout.d((k9x) ((tty) mc90Var.d.f).getValue(), pb90Var));
            case 14:
                uhz uhzVar = (uhz) this.c;
                com.vk.newsfeed.common.posting.listfriends.a aVar2 = (com.vk.newsfeed.common.posting.listfriends.a) this.d;
                uhzVar.l.P(aVar2.b, uhzVar.getBindingAdapterPosition(), aVar2.c);
                return s3q0.a;
            case 15:
                no00 no00Var = (no00) this.c;
                Long l = (Long) this.d;
                no00Var.e = true;
                if (l != null) {
                    no00Var.postDelayed(new xq3(no00Var, 9), l.longValue());
                }
                return s3q0.a;
            case 16:
                ((izs) this.c).invoke((MediaContentItem) this.d);
                return s3q0.a;
            case 17:
                View view = (View) this.c;
                an30 an30Var = (an30) this.d;
                MsgSkeletonViewRedesign msgSkeletonViewRedesign = (MsgSkeletonViewRedesign) ((ViewStub) view.findViewById(R.id.msg_skeleton_redesign_view_viewstub)).inflate();
                wz30 wz30Var = an30Var.b;
                if (wz30Var != null) {
                    msgSkeletonViewRedesign.setSkeletonConfig(wz30Var);
                }
                return msgSkeletonViewRedesign;
            case 18:
                com.vk.core.view.components.spinner.c cVar = (com.vk.core.view.components.spinner.c) this.c;
                final io.reactivex.rxjava3.disposables.c cVar2 = (io.reactivex.rxjava3.disposables.c) this.d;
                cVar.setOnCancelListener(new DialogInterface.OnCancelListener() { // from class: xsna.ha60
                    @Override // android.content.DialogInterface.OnCancelListener
                    public final void onCancel(DialogInterface dialogInterface) {
                        io.reactivex.rxjava3.disposables.c.this.dispose();
                    }
                });
                return s3q0.a;
            case 19:
                nt8 nt8Var = (nt8) this.c;
                final c7a0 c7a0Var = (c7a0) this.d;
                ReentrantLock reentrantLock = c7a0Var.d;
                reentrantLock.lock();
                try {
                    String str3 = (String) j5g.i0(drm0.c0(c7a0Var.a, new String[]{DomExceptionUtils.SEPARATOR}, 0, 6));
                    ei90 ei90Var = c7a0Var.b;
                    ReentrantLock reentrantLock2 = ei90Var.e;
                    reentrantLock2.lock();
                    try {
                        ei90Var.d = str3;
                        final paa0 a2 = ei90Var.a.a(str3);
                        ei90Var.b = a2;
                        String str4 = a2 != null ? a2.a : null;
                        if (str4 == null) {
                            str4 = "";
                        }
                        ei90Var.c = str4;
                        reentrantLock2.unlock();
                        Long l2 = (Long) nt8Var.b;
                        if (a2 != null && l2 != null) {
                            final long longValue = l2.longValue();
                            ksk0.b(new gzs() { // from class: xsna.b7a0
                                @Override // xsna.gzs
                                public final Object invoke() {
                                    c7a0.this.getClass();
                                    paa0 paa0Var = a2;
                                    return new MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem(paa0Var.b.l != null ? MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType.COLLAGE : MobileOfficialAppsCorePhotoEditorStat$TypePhotoEditorItem.MediaType.PHOTO, paa0Var.a, Long.valueOf(longValue), MobileOfficialAppsCorePhotoEditorStat$EditorEvent.SAVE, null, null, null, null, null, null, null, null, null, null, null, laa0.a(paa0Var), 32752, null);
                                }
                            });
                        }
                        ei90 ei90Var2 = c7a0Var.b;
                        reentrantLock2 = ei90Var2.e;
                        reentrantLock2.lock();
                        try {
                            String str5 = ei90Var2.d;
                            if (str5 != null) {
                                ei90Var2.a.a.remove(str5);
                            }
                            ei90Var2.c = "";
                            ei90Var2.b = null;
                            ei90Var2.d = null;
                            s3q0 s3q0Var = s3q0.a;
                            reentrantLock2.unlock();
                            c7a0Var.c.invoke();
                            reentrantLock.unlock();
                            return s3q0.a;
                        } catch (Throwable th) {
                            throw th;
                        }
                    } finally {
                        reentrantLock2.unlock();
                    }
                } catch (Throwable th2) {
                    reentrantLock.unlock();
                    throw th2;
                }
            case 20:
                PodcastPage podcastPage = (PodcastPage) this.c;
                PodcastEpisodeFragment podcastEpisodeFragment = (PodcastEpisodeFragment) this.d;
                int i2 = PodcastEpisodeFragment.u0;
                podcastPage.d = false;
                podcastEpisodeFragment.mo(PodcastMenuItem.SubscribeToAuthor, false);
                podcastEpisodeFragment.lo();
                return s3q0.a;
            case 21:
                com.vk.qrcode.b bVar = (com.vk.qrcode.b) this.c;
                Activity activity = (Activity) this.d;
                b.a aVar3 = bVar.c;
                double d = aVar3.a;
                double d2 = aVar3.b;
                int i3 = com.vkontakte.android.attachments.a.a;
                rwi.d().f().b(activity, new GeoAttachment(d, d2, "title", "subtitle", -1, null, 0));
                QRStatsTracker qRStatsTracker = QRStatsTracker.a;
                QRStatsTracker.a(QRStatsTracker.Action.OPEN_MAP);
                return s3q0.a;
            case 22:
                vof0 vof0Var = (vof0) this.c;
                fnf0 fnf0Var = ((com.vk.reefton.trackers.b) this.d).a;
                String appId = fnf0Var.getAppId();
                onf0 onf0Var = onf0.a;
                String str6 = fnf0Var.getClientId() + "802f35d1a8d4d0";
                onf0Var.getClass();
                vof0Var.a(new plc(appId, onf0.a(str6)));
                return s3q0.a;
            case 23:
                initialize$lambda$220$lambda$22 = ServiceProvider.initialize$lambda$220$lambda$22((UnityAdsModule) this.c, (ServicesRegistry) this.d);
                return initialize$lambda$220$lambda$22;
            case 24:
                return Long.valueOf(SignalingTransport.a((SignalingTransport) this.c, (gzs) this.d));
            case 25:
                Toast.makeText((Context) this.c, (String) this.d, 0).show();
                return s3q0.a;
            case 26:
                vtn0 vtn0Var = (vtn0) this.c;
                Context context = (Context) this.d;
                return vtn0Var.d(context, false, vtn0Var.c(context, vtn0Var.g), context.getString(R.string.superapp_tabbar_tooltip_subtitle_profile), EmptyList.b);
            case 27:
                qgp0 qgp0Var = (qgp0) this.c;
                String str7 = (String) this.d;
                L l3 = L.a;
                l3.getClass();
                if (!L.m(LoggerOutputTarget.NONE)) {
                    L.u(l3, L.LogType.i, new Object[]{"OfflineDbConn", go9.b("mid=", str7)});
                }
                return qgp0Var.b.h(String.valueOf(o25.a().c().b), str7);
            case 28:
                hyn hynVar = (hyn) this.c;
                izs izsVar = (izs) this.d;
                String str8 = ((hyn.b) hynVar).a.i;
                if (str8 != null) {
                    izsVar.invoke(new UserProfileAction.DonutBanner.UrlClick(str8, UserProfileAction.DonutBanner.UrlClick.Source.Regular));
                }
                return s3q0.a;
            default:
                b9w b9wVar = (b9w) this.c;
                return b9wVar != null ? b9wVar.f(AttachVideoMsg.class) : new p0x(((ViewGroup) this.d).getContext());
        }
    }
}
