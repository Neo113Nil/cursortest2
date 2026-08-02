package com.vk.movika.sdk.base.model;

import android.os.Bundle;
import android.view.accessibility.AccessibilityManager;
import androidx.fragment.app.FragmentActivity;
import com.facebook.fresco.animation.bitmap.BitmapAnimationBackend;
import com.vk.accountmanager.di.VideoAccountHolderComponent;
import com.vk.bridges.di.BridgeComponent;
import com.vk.bridges.di.LinksBridgeComponent;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.catalog2.common.ui.mvp.holder.clip.ClipSearchRootVh;
import com.vk.clips.design.view.seek.ClipsSeekBar;
import com.vk.clips.favorites.api.di.ClipsFavoritesComponent;
import com.vk.clips.favorites.impl.di.ClipsFavoritesComponentImpl;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.viewer.api.routing.models.ClipFeedTransientArgumentsContainer;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.feed.wrapper.ui.fragment.arguments.ClipsWrapperInputArguments;
import com.vk.dto.stories.model.clickable.ClickablePoll;
import com.vk.dto.stories.model.clickable.ClickableSticker;
import com.vk.dto.stories.model.clickable.ClickableStickers;
import com.vk.ecomm.cart.api.di.CartComponent;
import com.vk.ecomm.catalog.impl.catalog.base.ClassifiedsCatalogBaseRootVh;
import com.vk.im.engine.commands.channels.ChannelMsgSendConfig;
import com.vk.im.ui.components.common.AvatarAction;
import com.vk.im.ui.views.counter.AnimatedCounterView;
import com.vk.narratives.impl.highlights.AllHighlightsFragment;
import com.vk.newsfeed.posting.action_button.presentation.ActionButtonsFragment;
import com.vk.pushes.PushComponent;
import com.vk.search.ui.api.di.SearchUiComponent;
import com.vk.stories.design.view.polls.AbstractPollView;
import com.vk.story.viewer.api.di.StoryViewerComponent;
import com.vk.toggle.features.SearchFeatures;
import com.vk.topics.impl.fragments.BoardTopicViewFragment;
import com.vk.voip.ui.accessibility.AccessibilityEvents;
import com.vk.writebar.WriteBar;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.regex.Pattern;
import ru.ok.android.externcalls.sdk.api.interceptor.LoginInterceptorListener;
import ru.ok.android.externcalls.sdk.di.ApiModuleImpl;
import xsna.a66;
import xsna.asu0;
import xsna.bre;
import xsna.d260;
import xsna.dde;
import xsna.fpf0;
import xsna.fsk;
import xsna.g5g;
import xsna.gsf;
import xsna.gzs;
import xsna.i8f;
import xsna.irh0;
import xsna.j5g;
import xsna.k7m;
import xsna.ktf;
import xsna.leh0;
import xsna.ljh0;
import xsna.m7m;
import xsna.m960;
import xsna.meh0;
import xsna.mgk0;
import xsna.nfh0;
import xsna.nwy;
import xsna.o25;
import xsna.o260;
import xsna.pkh0;
import xsna.q0f;
import xsna.q2f;
import xsna.qcy;
import xsna.qr6;
import xsna.qsg;
import xsna.r2f;
import xsna.rcb;
import xsna.rgd;
import xsna.roe;
import xsna.rwd;
import xsna.s3q0;
import xsna.sux;
import xsna.u5f0;
import xsna.us2;
import xsna.vou;
import xsna.x65;
import xsna.xqc;
import xsna.xqd;
import xsna.xxt0;
import xsna.yux;
import xsna.zbb;
import xsna.zof;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class b implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ b(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v88, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        LoginInterceptorListener loginInterceptorListener_delegate$lambda$0;
        s3q0 preloadAnimation$lambda$2;
        final leh0 pkh0Var;
        switch (this.b) {
            case 0:
                Chapter chapter = (Chapter) this.c;
                List<j> list = chapter.f;
                ArrayList arrayList = chapter.d;
                ArrayList arrayList2 = new ArrayList();
                Iterator it = arrayList.iterator();
                while (it.hasNext()) {
                    g5g.y(((f) it.next()).b(), arrayList2);
                }
                return j5g.u0(arrayList2, list);
            case 1:
                AbstractPollView abstractPollView = (AbstractPollView) this.c;
                AbstractPollView.c cVar = abstractPollView.b;
                if (cVar != null) {
                    cVar.h3(abstractPollView.getPoll());
                }
                return s3q0.a;
            case 2:
                return Boolean.valueOf(((AccessibilityManager) ((AccessibilityEvents.d) this.c).a.getSystemService("accessibility")).isEnabled());
            case 3:
                ActionButtonsFragment actionButtonsFragment = (ActionButtonsFragment) this.c;
                qcy<Object>[] qcyVarArr = ActionButtonsFragment.U;
                return ((LinksBridgeComponent) m7m.d(actionButtonsFragment).a(fpf0.a(LinksBridgeComponent.class))).p();
            case 4:
                AllHighlightsFragment allHighlightsFragment = (AllHighlightsFragment) this.c;
                int i = AllHighlightsFragment.g0;
                return ((StoryViewerComponent) m7m.d(allHighlightsFragment).a(fpf0.a(StoryViewerComponent.class))).tb();
            case 5:
                AnimatedCounterView animatedCounterView = (AnimatedCounterView) this.c;
                animatedCounterView.g = 1.0f;
                animatedCounterView.e = AnimatedCounterView.a.NONE;
                animatedCounterView.i = null;
                animatedCounterView.k = null;
                animatedCounterView.j = null;
                animatedCounterView.n.setAlpha(255);
                animatedCounterView.v.setAlpha(255);
                return s3q0.a;
            case 6:
                loginInterceptorListener_delegate$lambda$0 = ApiModuleImpl.loginInterceptorListener_delegate$lambda$0((ApiModuleImpl) this.c);
                return loginInterceptorListener_delegate$lambda$0;
            case 7:
                FragmentActivity activity = ((a66) ((x65) this.c)).getActivity();
                if (activity != null) {
                    activity.finish();
                }
                return s3q0.a;
            case 8:
                return "UPLOAD_TRACE finish video uploading for attach " + ((qr6) this.c).o;
            case 9:
                return (us2) this.c;
            case 10:
                preloadAnimation$lambda$2 = BitmapAnimationBackend.preloadAnimation$lambda$2((BitmapAnimationBackend) this.c);
                return preloadAnimation$lambda$2;
            case 11:
                BoardTopicViewFragment boardTopicViewFragment = (BoardTopicViewFragment) this.c;
                Pattern pattern = BoardTopicViewFragment.H0;
                return ((BridgeComponent) m7m.d(boardTopicViewFragment).a(fpf0.a(BridgeComponent.class))).s();
            case 12:
                return ((VideoAccountHolderComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.util.a) this.c)).a(fpf0.a(VideoAccountHolderComponent.class))).x9();
            case 13:
                com.vk.channels.impl.channel_screen.send_msg.a aVar = (com.vk.channels.impl.channel_screen.send_msg.a) this.c;
                zbb.b bVar = aVar.E;
                if (bVar == null) {
                    bVar = null;
                }
                ChannelMsgSendConfig a = ChannelMsgSendConfig.a(aVar.p, null, false, false, false, false, null, null, null, null, false, false, false, false, null, 31743);
                boolean z = aVar.q != null;
                WriteBar writeBar = aVar.x;
                bVar.f(a, z, true ^ (writeBar != null ? writeBar : null).getInputState().a());
                aVar.b.d.w().j(aVar.g);
                return s3q0.a;
            case 14:
                ((rcb) this.c).o.O(AvatarAction.REMOVE);
                return s3q0.a;
            case 15:
                return ((CartComponent) ((k7m) m7m.f((ClassifiedsCatalogBaseRootVh) this.c)).a(fpf0.a(CartComponent.class))).f8();
            case 16:
                PushComponent pushComponent = (PushComponent) this.c;
                o260 o260Var = d260.a;
                if (o260Var == null) {
                    o260Var = null;
                }
                o260Var.getClass();
                asu0.a.getClass();
                asu0.n().execute(new xqc(o260Var, 6));
                if (!o25.a().b()) {
                    pushComponent.sc().h(true, true, null);
                }
                return s3q0.a;
            case 17:
                List<ClickableSticker> list2 = ((ClickableStickers) this.c).d;
                ArrayList arrayList3 = new ArrayList();
                for (Object obj : list2) {
                    if (obj instanceof ClickablePoll) {
                        arrayList3.add(obj);
                    }
                }
                return arrayList3;
            case 18:
                ClipFeedListFragment clipFeedListFragment = (ClipFeedListFragment) this.c;
                int i2 = ClipFeedListFragment.a2;
                meh0 meh0Var = new meh0(clipFeedListFragment.requireContext(), clipFeedListFragment, clipFeedListFragment.j1, clipFeedListFragment.i1, clipFeedListFragment.d1, clipFeedListFragment.Eo(), clipFeedListFragment.c1, (xqd) clipFeedListFragment.I0.getValue());
                zof zofVar = meh0Var.f;
                if (zofVar.G()) {
                    pkh0Var = new ljh0(meh0Var.d.getValue(), meh0Var.e.getValue(), meh0Var.g, meh0Var.a, new vou());
                } else {
                    r2f r2fVar = new r2f(new nfh0(zofVar.H().isEnabled(), 1));
                    q0f value = meh0Var.c.getValue();
                    xxt0 xxt0Var = new xxt0(new sux(25));
                    mgk0 mgk0Var = new mgk0(meh0Var.b);
                    Object obj2 = meh0Var.i;
                    if (obj2 == null) {
                        obj2 = new fsk(16);
                    }
                    pkh0Var = new pkh0(new q2f(r2fVar, value, new u5f0(obj2, xxt0Var, mgk0Var, new m960(meh0Var, 24))), meh0Var.g, meh0Var.a, new vou());
                }
                clipFeedListFragment.w1.a(new yux.b() { // from class: xsna.zxc
                    @Override // xsna.yux.b
                    public final void a(boolean z2) {
                        int i3 = ClipFeedListFragment.a2;
                        leh0.this.c(z2);
                    }
                });
                return pkh0Var;
            case 19:
                SearchUiComponent searchUiComponent = (SearchUiComponent) ((k7m) m7m.f((ClipSearchRootVh) this.c)).a(fpf0.a(SearchUiComponent.class));
                SearchFeatures searchFeatures = SearchFeatures.HUB_CLIPS_SUGGESTER;
                searchFeatures.getClass();
                return searchUiComponent.W(new irh0(com.vk.toggle.b.A.a(searchFeatures), false, 499));
            case 20:
                return (CameraClipsComponent) ((k7m) m7m.f((com.vk.clips.upload.vk.impl.uploader.b) this.c)).a(fpf0.a(CameraClipsComponent.class));
            case 21:
                rgd rgdVar = (rgd) this.c;
                io.reactivex.rxjava3.disposables.c cVar2 = rgdVar.g;
                if (cVar2 != null) {
                    cVar2.dispose();
                }
                rgdVar.e();
                return s3q0.a;
            case 22:
                return (ClipsSeekBar) ((rwd) this.c).d().findViewById(R.id.clips_editor_seek_bar);
            case 23:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) this.c;
                int i3 = ClipsFavoriteFolderContentListFragment.W;
                return (ClipsFavoritesComponentImpl) m7m.d(clipsFavoriteFolderContentListFragment).mo408a(fpf0.a(ClipsFavoritesComponent.class));
            case 24:
                gzs<s3q0> onCellClicked = ((dde) this.c).getOnCellClicked();
                if (onCellClicked != null) {
                    onCellClicked.invoke();
                }
                return s3q0.a;
            case 25:
                roe roeVar = (roe) this.c;
                ClipsWrapperInputArguments.a aVar2 = ClipsWrapperInputArguments.r;
                Bundle a2 = roeVar.a();
                aVar2.getClass();
                if (a2 != null) {
                    return (ClipFeedTransientArgumentsContainer) a2.getParcelable("ClipsWrapperFragment.transient_arguments");
                }
                return null;
            case 26:
                bre breVar = (bre) this.c;
                bre.b bVar2 = bre.s1;
                return Boolean.valueOf(breVar.eo().d);
            case 27:
                return ((i8f) this.c).h.a();
            case 28:
                nwy nwyVar = ((ClipsViewerComponentImpl) this.c).l0;
                qcy<Object> qcyVar = ClipsViewerComponentImpl.o0[50];
                return new ktf((gsf) nwyVar.c());
            default:
                ((qsg) this.c).k.h();
                return s3q0.a;
        }
    }
}
