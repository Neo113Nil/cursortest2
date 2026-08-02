package com.vk.movika.sdk.base.model.props;

import com.google.gson.GsonBuilder;
import com.mbridge.msdk.playercommon.exoplayer2.text.ttml.TtmlNode;
import com.unity3d.services.UnityAdsConstants;
import com.vk.attachpicker.di.GalleryPickerComponentImpl;
import com.vk.clips.coauthors.di.ClipsCoauthorsComponent;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.view.components.avatar.badge.b;
import com.vk.movika.sdk.base.model.props.TextProps;
import com.vk.newsfeed.posting.api.di.Posting2ComponentStub;
import com.vk.photo.editor.features.colorgrading.a;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SoccomFeatures;
import com.vk.video.ui.upload.impl.attachedclips.presentation.fragment.AttachedClipsFragmentInternalComponent;
import com.vkontakte.android.R;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.annotation.Annotation;
import java.text.DecimalFormat;
import java.text.DecimalFormatSymbols;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.amc;
import xsna.bbv0;
import xsna.bhu;
import xsna.bwn;
import xsna.ds60;
import xsna.e43;
import xsna.e9w;
import xsna.f2t;
import xsna.gzs;
import xsna.h5s;
import xsna.h6c0;
import xsna.l0d0;
import xsna.l3t;
import xsna.lx70;
import xsna.n1t;
import xsna.ngj0;
import xsna.o1t;
import xsna.qcy;
import xsna.s3q0;
import xsna.t5c0;
import xsna.tu50;
import xsna.uft0;
import xsna.uqe0;
import xsna.x54;
import xsna.y2n;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class c implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ c(int i) {
        this.b = i;
    }

    @Override // xsna.gzs
    public final Object invoke() {
        int i = 0;
        switch (this.b) {
            case 0:
                return bhu.b("com.vk.movika.sdk.base.model.props.TextProps.GravityHorizontal", TextProps.GravityHorizontal.values(), new String[]{"start", TtmlNode.CENTER, TtmlNode.END}, new Annotation[][]{null, null, null});
            case 1:
                DecimalFormat decimalFormat = new DecimalFormat();
                DecimalFormatSymbols decimalFormatSymbols = DecimalFormatSymbols.getInstance();
                decimalFormatSymbols.setGroupingSeparator(' ');
                decimalFormat.setDecimalFormatSymbols(decimalFormatSymbols);
                decimalFormat.setGroupingSize(3);
                return decimalFormat;
            case 2:
                return Long.valueOf(System.currentTimeMillis());
            case 3:
                return s3q0.a;
            case 4:
                return new uqe0();
            case 5:
                AttachedClipsFragmentInternalComponent.a aVar = AttachedClipsFragmentInternalComponent.e;
                return new x54(new uft0(), new ngj0());
            case 6:
                return new bwn();
            case 7:
                return new amc();
            case 8:
                return s3q0.a;
            case 9:
                return e9w.b("ChannelsListFeature");
            case 10:
                return new Regex("/clips/compilation/([0-9]+)");
            case 11:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return new l0d0();
            case 12:
                return new y2n(0);
            case 13:
                return h5s.a("ov-stat-storage-thread");
            case 14:
                f2t f2tVar = n1t.n;
                return new n1t(new o1t(f2tVar, f2tVar), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new a.C1454a(i), new a.b(i));
            case 15:
                qcy<Object>[] qcyVarArr2 = GalleryPickerComponentImpl.b;
                return new l3t();
            case 16:
                SoccomFeatures soccomFeatures = SoccomFeatures.MULTI_INTEGRATION;
                soccomFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(soccomFeatures));
            case 17:
                throw new IllegalStateException("CompositionLocal LocalHostDefaultProvider not present");
            case 18:
                FeedFeatures feedFeatures = FeedFeatures.FEED_LINK_VK_PIXELS;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 19:
                Object obj = com.vk.core.view.components.avatar.badge.b.h;
                return new b.C0801b[]{new b.C0801b(0, R.drawable.vk_icon_live_badge_10, 4.0f, b.a.a(20, 10)), new b.C0801b(40, R.drawable.vk_icon_live_badge_12, 5.5f, b.a.a(24, 12)), new b.C0801b(56, R.drawable.vk_icon_live_badge_16, 6.0f, b.a.a(34, 16)), new b.C0801b(88, R.drawable.vk_icon_live_badge_20, 7.0f, b.a.a(42, 20)), new b.C0801b(Sdk.SDKError.Reason.PRIVACY_URL_ERROR_VALUE, R.drawable.vk_icon_live_badge_20, 8.0f, b.a.a(50, 24)), new b.C0801b(144, R.drawable.vk_icon_live_badge_36, 10.0f, b.a.a(75, 36))};
            case 20:
                return s3q0.a;
            case 21:
                return s3q0.a;
            case 22:
                return new GsonBuilder().serializeNulls().create();
            case 23:
                return new tu50();
            case 24:
                FeedFeatures feedFeatures2 = FeedFeatures.OWNER_DUPLICATE;
                feedFeatures2.getClass();
                if (com.vk.toggle.b.A.a(feedFeatures2)) {
                    return new h6c0();
                }
                return null;
            case 25:
                return new Regex("(https?://)?(www\\.)?(qr|sub)\\.nspk\\.ru\\/.{32}($|\\?\\S*)", RegexOption.IGNORE_CASE);
            case 26:
                return new lx70.a.C3310a();
            case 27:
                bbv0.g.getClass();
                bbv0.a.f().d.c();
                return s3q0.a;
            case 28:
                return e43.l(t5c0.d.a.b, new t5c0.c.a(ds60.a.C2747a.b), new t5c0.c.a(ds60.a.b.b), t5c0.c.b.b);
            default:
                qcy<Object>[] qcyVarArr3 = Posting2ComponentStub.d;
                return ClipsCoauthorsComponent.Companion.getSTUB().e();
        }
    }
}
