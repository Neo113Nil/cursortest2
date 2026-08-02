package com.vk.movika.sdk.base.logic.interactor;

import android.content.Context;
import android.graphics.Path;
import com.unity3d.ads.adplayer.ExposedFunction;
import com.unity3d.ads.core.domain.exposure.CommonAdViewerExposedFunctionsKt;
import com.unity3d.services.UnityAdsConstants;
import com.vk.biometrics.lock.impl.presentation.base.mvi.setup.BiometricsLockSecuritySetupFragment;
import com.vk.core.apps.BuildInfo;
import com.vk.core.design.lego.LegoCustomRedesignedScreen;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.onboardingscreens.impl.di.OnboardingScreensComponentImpl;
import com.vk.search.fragment.DiscoverSearchFragment;
import com.vk.toggle.features.ClipsFeatures;
import com.vk.toggle.features.ComFeatures;
import com.vk.toggle.features.CoreFeatures;
import com.vk.toggle.features.VideoFeatures;
import java.util.Calendar;
import java.util.Set;
import kotlin.collections.EmptySet;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.blg0;
import xsna.bpp;
import xsna.czq0;
import xsna.e43;
import xsna.gzs;
import xsna.jgp;
import xsna.n97;
import xsna.o360;
import xsna.qcy;
import xsna.r57;
import xsna.rl3;
import xsna.s1c0;
import xsna.s290;
import xsna.s3q0;
import xsna.sf2;
import xsna.tfa0;
import xsna.u1r0;
import xsna.vx2;
import xsna.y1z;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class g implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ g(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:36:0x00bc, code lost:
    
        if (com.vk.toggle.b.A.a(r0) != false) goto L40;
     */
    /* JADX WARN: Type inference failed for: r0v8, types: [java.lang.Object, kotlin.Lazy] */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        ExposedFunction deleteStorage;
        boolean z = true;
        switch (this.b) {
            case 0:
                return "Manifest does not contain chapter with id null";
            case 1:
                return s3q0.a;
            case 2:
                return tfa0.a;
            case 3:
                return s3q0.a;
            case 4:
                return io.reactivex.rxjava3.subjects.d.O0(jgp.b);
            case 5:
                int i = BiometricsLockSecuritySetupFragment.W;
                return (n97) r57.b.getValue();
            case 6:
                return s3q0.a;
            case 7:
                vx2.a.getClass();
                return vx2.b().a.h;
            case 8:
                return s3q0.a;
            case 9:
                s1c0.a aVar = new s1c0.a();
                aVar.b = true;
                aVar.a = true;
                aVar.q = true;
                sf2 sf2Var = new sf2();
                Context context = e43.a;
                if (context == null) {
                    context = null;
                }
                sf2Var.b = context;
                aVar.s = sf2Var.a();
                aVar.w = true;
                int i2 = y1z.a;
                LegoCustomRedesignedScreen legoCustomRedesignedScreen = LegoCustomRedesignedScreen.EXAMPLE;
                aVar.J = false;
                return aVar.a();
            case 10:
                return new s290();
            case 11:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return rl3.y0(new ContactsViews[]{ContactsViews.USERS, ContactsViews.CONTACTS, ContactsViews.HINTS, ContactsViews.NEW_USERS_BANNER, ContactsViews.REQUEST_PERMISSION, ContactsViews.BIRTHDAYS, ContactsViews.EMPTY, ContactsViews.INVITE, ContactsViews.CREATE_CONTACT, ContactsViews.SHARE});
            case 12:
                return EmptySet.b;
            case 13:
                int i3 = DiscoverSearchFragment.s0;
                return s3q0.a;
            case 14:
                if (!BuildInfo.g()) {
                    CoreFeatures coreFeatures = CoreFeatures.PHOTO_EDITOR_ML_ENHANCE;
                    coreFeatures.getClass();
                    break;
                }
                z = false;
                return Boolean.valueOf(z);
            case 15:
                VideoFeatures videoFeatures = VideoFeatures.WHITELIST_AD_PARAMS;
                videoFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(videoFeatures));
            case 16:
                return new u1r0();
            case 17:
                return Calendar.getInstance();
            case 18:
                deleteStorage = CommonAdViewerExposedFunctionsKt.deleteStorage();
                return deleteStorage;
            case 19:
                ComFeatures comFeatures = ComFeatures.COM_POSTING_AUTHOR_SELECTION;
                comFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(comFeatures));
            case 20:
                return "#doStopBgSync starting...";
            case 21:
                Path path = new Path();
                path.moveTo(-522.6f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.rCubicTo(48.89972f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 166.02657f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 301.2173f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.rCubicTo(197.58128f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 420.9827f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 420.9827f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                return path;
            case 22:
                return new Regex("sferum\\.ru");
            case 23:
                return new bpp();
            case 24:
                return new Regex("(?:id|club)([0-9]+)", (Set<? extends RegexOption>) rl3.y0(new RegexOption[]{RegexOption.IGNORE_CASE, RegexOption.UNIX_LINES}));
            case 25:
                return new o360();
            case 26:
                qcy<Object>[] qcyVarArr = OnboardingScreensComponentImpl.h;
                return new czq0(0);
            case 27:
                ClipsFeatures clipsFeatures = ClipsFeatures.CLIPS_TITLE_IN_RETENTION_BLOCK;
                clipsFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(clipsFeatures));
            case 28:
                return new blg0();
            default:
                return s3q0.a;
        }
    }
}
