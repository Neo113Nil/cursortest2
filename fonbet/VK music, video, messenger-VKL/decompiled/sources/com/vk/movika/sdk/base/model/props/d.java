package com.vk.movika.sdk.base.model.props;

import android.content.Context;
import android.os.HandlerThread;
import androidx.recyclerview.widget.RecyclerView;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.vk.camera.clips.core.drafts.ClipsDraftPersistentStore;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.clips.viewer.impl.feed.view.ClipFeedListFragment;
import com.vk.core.preference.Preference;
import com.vk.dto.common.DuetType;
import com.vk.im.channelcreation.impl.di.ChannelCreationDiComponentImpl;
import com.vk.im.channelcreation.impl.f;
import com.vk.im.engine.models.LinkTarget;
import com.vk.im.ui.views.dialogs.AnimatedDialogUnreadMarkerView;
import com.vk.movika.sdk.base.model.props.TextProps;
import com.vk.music.design.view.download.DownloadingView;
import com.vk.preview.di.GalleryPickerPreviewComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.ImFeatures;
import com.vk.toggle.features.MusicFeatures;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vkontakte.android.task.di.components.clips.ClipsEditorComponentVkApp;
import java.lang.annotation.Annotation;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.text.Regex;
import xsna.ay4;
import xsna.bhu;
import xsna.bpn0;
import xsna.c5g;
import xsna.cvk;
import xsna.e43;
import xsna.ee3;
import xsna.fxc0;
import xsna.g5g;
import xsna.gzs;
import xsna.iz10;
import xsna.j9x;
import xsna.jr3;
import xsna.k9x;
import xsna.nt;
import xsna.qcy;
import xsna.s3q0;
import xsna.u8r;
import xsna.vme;
import xsna.vsx;
import xsna.wh50;
import xsna.x4t;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class d implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ d(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        ArrayList arrayList;
        switch (this.b) {
            case 0:
                return bhu.b("com.vk.movika.sdk.base.model.props.TextProps.GravityVertical", TextProps.GravityVertical.values(), new String[]{"top", TtmlNode.CENTER, "bottom"}, new Annotation[][]{null, null, null});
            case 1:
                return new ConcurrentHashMap();
            case 2:
                bpn0 bpn0Var = iz10.a;
                Context context = e43.a;
                return iz10.a(context != null ? context : null);
            case 3:
                int i = AnimatedDialogUnreadMarkerView.y;
                ImFeatures imFeatures = ImFeatures.REDESIGN_DIALOG_LIST_ITEM;
                imFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(imFeatures));
            case 4:
                AttachedClipsFragmentInternalComponent.a aVar = AttachedClipsFragmentInternalComponent.e;
                return com.vk.core.utils.newtork.b.a;
            case 5:
                cvk.u(R.string.attach_viewer_image_format_invalid, false);
                return s3q0.a;
            case 6:
                return new ay4();
            case 7:
                return Boolean.valueOf(fxc0.B().J().N1());
            case 8:
                return s3q0.a;
            case 9:
                return s3q0.a;
            case 10:
                qcy<Object>[] qcyVarArr = ChannelCreationDiComponentImpl.b;
                return new f();
            case 11:
                return new Regex("/clips/hashtag/([\\d\\p{L}_]{2,})");
            case 12:
                int i2 = ClipFeedListFragment.a2;
                return new RecyclerView.u();
            case 13:
                return s3q0.a;
            case 14:
                List i3 = ClipsDraftPersistentStore.a.i(ClipsDraftPersistentStore.c, "%clips_drafts%", new jr3(5), null, 4);
                if (i3 != null) {
                    ArrayList arrayList2 = new ArrayList();
                    Iterator it = i3.iterator();
                    while (it.hasNext()) {
                        g5g.y(((ClipsDraftPersistentStore.Drafts) it.next()).b, arrayList2);
                    }
                    arrayList = new ArrayList(arrayList2);
                } else {
                    arrayList = new ArrayList();
                }
                List i4 = ClipsDraftPersistentStore.a.i(ClipsDraftPersistentStore.c, "%clips_active_draft%", new nt(17), null, 4);
                if (i4 != null) {
                    arrayList.addAll(i4);
                }
                return arrayList;
            case 15:
                qcy<Object>[] qcyVarArr2 = ClipsEditorComponentVkApp.c;
                return new ClipsEditorComponentVkApp.b();
            case 16:
                qcy<Object>[] qcyVarArr3 = ClipsViewerComponentImpl.o0;
                return new vme();
            case 17:
                ComFeatures comFeatures = ComFeatures.COM_VIDEO_ON_MAIN_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 18:
                k9x k9xVar = new k9x(1, 10, 1);
                ArrayList arrayList3 = new ArrayList(c5g.u(k9xVar, 10));
                j9x it2 = k9xVar.iterator();
                while (it2.d) {
                    it2.nextInt();
                    arrayList3.add(ee3.b.c.a);
                }
                return arrayList3;
            case 19:
                ComFeatures comFeatures2 = ComFeatures.COM_DONUT_PRICE_DISCOUNT;
                comFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures2));
            case 20:
                int i5 = DownloadingView.m;
                return Boolean.valueOf(MusicFeatures.OFFLINE_PENDING_UI.h());
            case 21:
                return DuetType.h();
            case 22:
                return ((HandlerThread) u8r.k.getValue()).getLooper();
            case 23:
                return Preference.f("firebase_override_domain");
            case 24:
                return s3q0.a;
            case 25:
                qcy<Object>[] qcyVarArr4 = GalleryPickerPreviewComponentImpl.e;
                return new x4t();
            case 26:
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_INLINE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 27:
                wh50 wh50Var = vsx.a;
                return Boolean.FALSE;
            case 28:
                return LinkTarget.h();
            default:
                return s3q0.a;
        }
    }
}
