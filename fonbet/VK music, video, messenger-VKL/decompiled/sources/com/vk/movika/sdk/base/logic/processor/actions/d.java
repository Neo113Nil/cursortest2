package com.vk.movika.sdk.base.logic.processor.actions;

import android.view.ViewGroup;
import com.vk.camera.clips.api.di.CameraClipsComponent;
import com.vk.camera.editor.stories.api.di.StoryEditorComponent;
import com.vk.catalog2.common.ui.mvp.clip.trends.ClipTrendsCatalogFragment;
import com.vk.catalog2.common.ui.mvp.holder.CatalogBasePaginatedListVh;
import com.vk.channels.impl.channel_screen.ChannelFragment;
import com.vk.channels.impl.comments.a;
import com.vk.clips.config.viewers.api.di.ClipsConfigViewersComponent;
import com.vk.clips.design.view.component.description.ClipDescription;
import com.vk.clips.entrypoints.params.ClipsEntryPointsParams;
import com.vk.clips.entrypoints.ui.ClipsEntryPointsFragment;
import com.vk.clips.favorites.impl.ui.folders.content.ClipsFavoriteFolderContentListFragment;
import com.vk.clips.favorites.impl.ui.folders.content.a;
import com.vk.clips.tool.view.viewer.feed.list.clip.ClipFeedSideControlsView;
import com.vk.clips.viewer.api.di.ClipsViewerComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.clips.viewer.impl.grid.a;
import com.vk.clips.viewer.impl.grid.lists.fragments.ClipsGridCommonClipsListFragment;
import com.vk.clips.viewer.impl.owner.ui.fragment.ClipsOwnerSwipeFragment;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.core.serialize.Serializer;
import com.vk.core.view.components.cell.VkMiniInfoCell;
import com.vk.core.view.components.text.links.VkLinkedText;
import com.vk.dto.attaches.AttachWidget;
import com.vk.dto.common.id.UserId;
import com.vk.dto.music.MusicTrack;
import com.vk.dto.music.StoryMusicInfo;
import com.vk.ecomm.market.api.di.MarketComponent;
import com.vk.movika.sdk.base.logic.processor.actions.j;
import com.vk.movika.sdk.base.model.k;
import com.vk.onboarding.api.stat.VkOnboardingStat$Delegate;
import com.vk.profile.community.impl.ui.profile.CommunityProfileFragment;
import com.vk.profile.community.impl.ui.profile.actions.CommunityProfileAction;
import com.vk.search.params.api.di.SearchParamsComponent;
import com.vk.stat.scheme.MobileOfficialAppsClipsStat$ClipsCreateContext;
import com.vkontakte.android.R;
import kotlin.jvm.internal.Ref$ObjectRef;
import org.json.JSONObject;
import ru.ok.android.webrtc.Call;
import xsna.a23;
import xsna.arg;
import xsna.b1y;
import xsna.e8v0;
import xsna.eb7;
import xsna.ei90;
import xsna.fpf0;
import xsna.g620;
import xsna.gzs;
import xsna.h3p0;
import xsna.iah0;
import xsna.isc;
import xsna.jbs;
import xsna.jn4;
import xsna.k7m;
import xsna.m7e;
import xsna.m7m;
import xsna.mgj0;
import xsna.mq4;
import xsna.naa0;
import xsna.o6a0;
import xsna.pbh;
import xsna.pkd;
import xsna.qcy;
import xsna.r4c;
import xsna.r4k;
import xsna.s3q0;
import xsna.saf;
import xsna.tmh;
import xsna.u48;
import xsna.up2;
import xsna.wh50;
import xsna.wrp;
import xsna.xn50;
import xsna.xq4;
import xsna.xyb;
import xsna.y1z;
import xsna.zhf0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements gzs {
    public final /* synthetic */ int b;
    public final /* synthetic */ Object c;

    public /* synthetic */ d(Object obj, int i) {
        this.b = i;
        this.c = obj;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r3v14, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint;
        StoryMusicInfo storyMusicInfo;
        MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint creationEntryPoint2;
        int i = this.b;
        Object obj = this.c;
        switch (i) {
            case 0:
                k kVar = ((j.a) obj).c;
                return Boolean.valueOf(a.b(kVar, fpf0.a(com.vk.movika.sdk.base.model.actions.d.class)) && !a.b(kVar, fpf0.a(com.vk.movika.sdk.base.model.actions.e.class)));
            case 1:
                return (ViewGroup) ((com.vk.libvideo.design.view.actionlink.a) obj).findViewById(R.id.vkl_action_link_product_full);
            case 2:
                Serializer.c<AttachWidget> cVar = AttachWidget.CREATOR;
                return new JSONObject(((AttachWidget) obj).b);
            case 3:
                return xq4.c((mq4) obj);
            case 4:
                h3p0.b(((eb7) obj).b);
                return s3q0.a;
            case 5:
                return ((StoryEditorComponent) ((k7m) m7m.c((u48) obj)).a(fpf0.a(StoryEditorComponent.class))).G3();
            case 6:
                return ((Call) obj).f();
            case 7:
                return new CatalogBasePaginatedListVh.a((CatalogBasePaginatedListVh) obj);
            case 8:
                return ((MarketComponent) ((k7m) m7m.f((com.vk.catalog2.common.ui.mvp.util.a) obj)).a(fpf0.a(MarketComponent.class))).C3();
            case 9:
                ((com.vk.channels.impl.comments.e) obj).O(a.d.b);
                return s3q0.a;
            case 10:
                ChannelFragment channelFragment = (ChannelFragment) obj;
                int i2 = ChannelFragment.a1;
                return up2.g(m7m.d(channelFragment), channelFragment.requireContext());
            case 11:
                return ((xyb) obj).q.a;
            case 12:
                return ((SearchParamsComponent) ((r4c) obj).a.a(fpf0.a(SearchParamsComponent.class))).be();
            case 13:
                ((a23) obj).invoke();
                return s3q0.a;
            case 14:
                int i3 = ClipDescription.M;
                VkLinkedText vkLinkedText = (VkLinkedText) ((ClipDescription) obj).findViewById(R.id.clip_description_text);
                vkLinkedText.setHighlightCornerRadius(iah0.a(4));
                vkLinkedText.setDrawHighlightInBackground(true);
                vkLinkedText.setCanShowMessageOptions(true);
                return vkLinkedText;
            case 15:
                qcy<Object>[] qcyVarArr = isc.t1;
                return ((isc) obj).eo().c();
            case 16:
                int i4 = ClipFeedListFragment.a2;
                return new saf(new r4k(new jn4(new b1y((mgj0) ((ClipFeedListFragment) obj).D0.getValue(), 3))));
            case 17:
                m7e m7eVar = ClipFeedSideControlsView.r;
                return ((ClipsConfigViewersComponent) ((k7m) m7m.c((ClipFeedSideControlsView) obj)).a(fpf0.a(ClipsConfigViewersComponent.class))).getExperiments();
            case 18:
                int i5 = ClipTrendsCatalogFragment.S;
                return ((CameraClipsComponent) m7m.d((ClipTrendsCatalogFragment) obj).a(fpf0.a(CameraClipsComponent.class))).c4();
            case 19:
                ClipsEntryPointsFragment clipsEntryPointsFragment = (ClipsEntryPointsFragment) obj;
                int i6 = ClipsEntryPointsFragment.i0;
                clipsEntryPointsFragment.requireContext();
                ClipsEntryPointsParams jo = clipsEntryPointsFragment.jo();
                if (jo == null || (creationEntryPoint = jo.b) == null) {
                    creationEntryPoint = MobileOfficialAppsClipsStat$ClipsCreateContext.CreationEntryPoint.OTHER;
                }
                pkd f = g620.f();
                jbs jbsVar = new jbs(clipsEntryPointsFragment);
                ClipsEntryPointsParams jo2 = clipsEntryPointsFragment.jo();
                String b = (jo2 == null || (creationEntryPoint2 = jo2.b) == null) ? null : wrp.b(creationEntryPoint2);
                if (b == null) {
                    b = "";
                }
                String str = b;
                String b2 = wrp.b(creationEntryPoint);
                ClipsEntryPointsParams jo3 = clipsEntryPointsFragment.jo();
                UserId userId = jo3 != null ? jo3.g : null;
                ClipsEntryPointsParams jo4 = clipsEntryPointsFragment.jo();
                MusicTrack musicTrack = (jo4 == null || (storyMusicInfo = jo4.c) == null) ? null : storyMusicInfo.b;
                ClipsEntryPointsParams jo5 = clipsEntryPointsFragment.jo();
                pkd.A(f, jbsVar, 18940, str, b2, null, null, null, null, musicTrack, 0, jo5 != null ? jo5.d : null, null, null, null, null, clipsEntryPointsFragment.ho(), userId, 64240);
                return s3q0.a;
            case 20:
                ClipsFavoriteFolderContentListFragment clipsFavoriteFolderContentListFragment = (ClipsFavoriteFolderContentListFragment) obj;
                int i7 = ClipsFavoriteFolderContentListFragment.W;
                clipsFavoriteFolderContentListFragment.getClass();
                xn50.a.c(clipsFavoriteFolderContentListFragment, a.e.C0589a.b);
                return s3q0.a;
            case 21:
                ClipsGridCommonClipsListFragment.a aVar = new ClipsGridCommonClipsListFragment.a(ClipsGridCommonClipsListFragment.class, null, null);
                aVar.j.putBoolean("ClipsGridListFragment.force_dark_theme", ((a.C0712a) obj).a);
                return aVar.f();
            case 22:
                Object obj2 = ClipsOwnerSwipeFragment.k0;
                return (ClipsViewerComponentImpl) m7m.d((ClipsOwnerSwipeFragment) obj).a(fpf0.a(ClipsViewerComponent.class));
            case 23:
                return ((ClipsViewerComponentImpl) obj).k.getConfig();
            case 24:
                return new o6a0(new ei90((naa0) ((com.vk.attachpicker.screen.f) obj).j.a.getValue()));
            case 25:
                return (zhf0) ((wh50) ((Ref$ObjectRef) obj).element).getValue();
            case 26:
                return (VkMiniInfoCell) ((arg) obj).a.findViewById(R.id.community_address_place_mini_info_cell);
            case 27:
                pbh.a aVar2 = (pbh.a) obj;
                VkOnboardingStat$Delegate vkOnboardingStat$Delegate = aVar2.p;
                if (vkOnboardingStat$Delegate != null) {
                    vkOnboardingStat$Delegate.d4(e8v0.b.b);
                }
                aVar2.n.invoke();
                return s3q0.a;
            case 28:
                int i8 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return ((tmh) obj).a;
            default:
                int i9 = CommunityProfileFragment.k0;
                xn50.a.c((CommunityProfileFragment) obj, new CommunityProfileAction.o(true));
                return s3q0.a;
        }
    }
}
