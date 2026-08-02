package com.vk.movika.sdk.base.model.props;

import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.ecomm.product_list.di.ProductListComponentImpl;
import com.vk.friends.impl.friendsandfollowers.tabbedscreen.presentation.fragment.FriendsAndFollowersRootFragment;
import com.vk.home.HomeFragment2;
import com.vk.im.design.view.placeholder.ImChipPlaceholder;
import com.vk.im.engine.models.PhoneStatus;
import com.vk.im.ui.views.ReplyView;
import com.vk.movika.sdk.base.model.props.BackgroundProps;
import com.vk.music.common.MusicPlaybackLaunchContext;
import com.vk.music.player.PlaySourceMeta;
import com.vk.network.eventhub.impl.di.EventHubApiComponent;
import com.vk.newsfeed.posting.impl.di.Posting2ComponentImpl;
import com.vk.profile.community.creationonboarding.impl.di.CreationOnboardingComponentImpl;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.FeedFeatures;
import java.lang.annotation.Annotation;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import java.util.regex.Pattern;
import kotlin.collections.EmptyList;
import okhttp3.o;
import xsna.bbv0;
import xsna.bhu;
import xsna.bpn0;
import xsna.bv90;
import xsna.c200;
import xsna.f4;
import xsna.gzs;
import xsna.hfc0;
import xsna.jwx;
import xsna.k5y;
import xsna.k840;
import xsna.lqd0;
import xsna.n97;
import xsna.nzj0;
import xsna.nzw;
import xsna.p4r;
import xsna.qcy;
import xsna.r4b0;
import xsna.r57;
import xsna.s3q0;
import xsna.u1r0;
import xsna.wbk;
import xsna.y1z;
import xsna.y2v;
import xsna.zhl;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class a implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ a(int i) {
        this.b = i;
    }

    /* JADX WARN: Type inference failed for: r0v20, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    public final Object invoke() {
        switch (this.b) {
            case 0:
                return bhu.b("com.vk.movika.sdk.base.model.props.BackgroundProps.Type", BackgroundProps.Type.values(), new String[]{"color"}, new Annotation[][]{null});
            case 1:
                return new DecimalFormat("#.##", new DecimalFormatSymbols());
            case 2:
                return s3q0.a;
            case 3:
                return "tryPinChannel: ";
            case 4:
                return s3q0.a;
            case 5:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return nzj0.a;
            case 6:
                qcy<Object>[] qcyVarArr2 = CreationOnboardingComponentImpl.d;
                return new wbk();
            case 7:
                qcy<Object>[] qcyVarArr3 = EventHubApiComponent.e;
                return new bv90();
            case 8:
                int i = FriendsAndFollowersRootFragment.Z;
                ComFeatures comFeatures = ComFeatures.COM_FOLLOWERS_ONLINE_TAB;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 9:
                return new u1r0();
            case 10:
                o.a aVar = new o.a();
                aVar.f = true;
                aVar.c.add(new c200(false, EmptyList.b, new com.vk.api.sdk.utils.log.a("GeoStaticMap", new bpn0(new f4(21))), new zhl()));
                return new o(aVar);
            case 11:
                int i2 = y2v.m1;
                return (n97) r57.b.getValue();
            case 12:
                int i3 = HomeFragment2.x0;
                int i4 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                return Boolean.FALSE;
            case 13:
                int i5 = ImChipPlaceholder.c;
                return s3q0.a;
            case 14:
                return new nzw.a();
            case 15:
                return new k5y();
            case 16:
                return s3q0.a;
            case 17:
                return s3q0.a;
            case 18:
                return k840.a.g().b();
            case 19:
                FeedFeatures feedFeatures = FeedFeatures.MVI_DISCOVER;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 20:
                bbv0.g.getClass();
                bbv0.a.f().d.g();
                return s3q0.a;
            case 21:
                return PhoneStatus.h();
            case 22:
                return new r4b0(MusicPlaybackLaunchContext.d, "", null, PlaySourceMeta.Default.b);
            case 23:
                return new p4r();
            case 24:
                qcy<Object>[] qcyVarArr4 = Posting2ComponentImpl.h;
                return new hfc0();
            case 25:
                FeedFeatures feedFeatures2 = FeedFeatures.POSTING_PHOTO_EDITOR;
                feedFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures2));
            case 26:
                qcy<Object>[] qcyVarArr5 = ProductListComponentImpl.b;
                return new lqd0();
            case 27:
                int i6 = ReplyView.k;
                return new jwx(2, 20);
            case 28:
                return "player is null on sendFailover";
            default:
                return Pattern.compile("\\[([a-zA-Z0-9_]+)\\|([^\\]]+)\\]");
        }
    }
}
