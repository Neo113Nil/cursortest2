package com.vk.movika.sdk.base.ui;

import android.app.ActivityManager;
import android.content.Context;
import android.graphics.Path;
import android.os.Handler;
import android.os.Looper;
import android.view.Choreographer;
import android.view.animation.PathInterpolator;
import com.unity3d.services.UnityAdsConstants;
import com.vk.catalog2.common.ui.mvp.holder.container.FirstPinnedTabLayoutVh;
import com.vk.clips.viewer.impl.di.ClipsViewerComponentImpl;
import com.vk.core.files.PrivateFiles;
import com.vk.core.files.PrivateSubdir;
import com.vk.core.preference.Preference;
import com.vk.folders.impl.di.FoldersComponentImpl;
import com.vk.im.ui.components.contacts.ContactsListFactory;
import com.vk.im.ui.components.contacts.vc.ContactsViews;
import com.vk.im.ui.components.viewcontrollers.msg_send.MsgSendOptionsPopup$Option;
import com.vk.im.ui.formatters.DisplayNameFormatter;
import com.vk.log.L;
import com.vk.newsfeed.impl.presentation.search.presentation.fragment.NewsfeedSearchFragment;
import com.vk.stat.scheme.SchemeStat$EventItem;
import com.vk.toggle.features.FeedFeatures;
import com.vk.toggle.features.SaFeatures;
import com.vk.toggle.features.SearchFeatures;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.concurrent.atomic.AtomicReference;
import kotlin.text.Regex;
import kotlin.text.RegexOption;
import xsna.a1w;
import xsna.b4k;
import xsna.d5r0;
import xsna.dl4;
import xsna.dqu;
import xsna.e370;
import xsna.e43;
import xsna.e520;
import xsna.e8r;
import xsna.fxc0;
import xsna.gzs;
import xsna.hhd0;
import xsna.mtf;
import xsna.ngj0;
import xsna.q1w;
import xsna.q3w0;
import xsna.qcy;
import xsna.rl3;
import xsna.s3q0;
import xsna.u6g0;
import xsna.vx2;
import xsna.znk0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes3.dex */
public final /* synthetic */ class o0 implements gzs {
    public final /* synthetic */ int b;

    public /* synthetic */ o0(int i) {
        this.b = i;
    }

    /* JADX WARN: Code restructure failed: missing block: B:59:0x0152, code lost:
    
        if (r0.totalMem > 3000000000L) goto L62;
     */
    @Override // xsna.gzs
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invoke() {
        PrivateFiles.a b;
        boolean z = false;
        switch (this.b) {
            case 0:
                return new k0();
            case 1:
                vx2.a.getClass();
                return vx2.b();
            case 2:
                hhd0 hhd0Var = znk0.o;
                return new d5r0(((u6g0) (hhd0Var != null ? hhd0Var : null).b).a());
            case 3:
                return Choreographer.getInstance();
            case 4:
                return new dl4();
            case 5:
                return "error on state subscription";
            case 6:
                return new DisplayNameFormatter(null, 3, null);
            case 7:
                return s3q0.a;
            case 8:
                return Boolean.valueOf(fxc0.B().J().N1());
            case 9:
                return new ngj0();
            case 10:
                return new dqu();
            case 11:
                if (b4k.e.a()) {
                    Context context = e43.a;
                    Context context2 = context != null ? context : null;
                    try {
                        ActivityManager.MemoryInfo memoryInfo = new ActivityManager.MemoryInfo();
                        ((ActivityManager) context2.getSystemService("activity")).getMemoryInfo(memoryInfo);
                        break;
                    } catch (Throwable th) {
                        L.g("Failed to get device total memory", th);
                    }
                }
                z = true;
                return Boolean.valueOf(z);
            case 12:
                qcy<Object>[] qcyVarArr = ClipsViewerComponentImpl.o0;
                return new mtf();
            case 13:
                SearchFeatures searchFeatures = SearchFeatures.SEARCH_INSIDE_COMMUNITY;
                searchFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures));
            case 14:
                ContactsListFactory contactsListFactory = ContactsListFactory.CREATE_CONVERSATION_VKME;
                return rl3.y0(new ContactsViews[]{ContactsViews.CONTACTS, ContactsViews.RECENT_USERS, ContactsViews.CREATE_CONTACT, ContactsViews.EMPTY});
            case 15:
                return new ArrayList();
            case 16:
                SchemeStat$EventItem schemeStat$EventItem = FirstPinnedTabLayoutVh.F;
                Context context3 = e43.a;
                return Preference.h(context3 != null ? context3 : null, 0, "highlighted_tabs_pref");
            case 17:
                qcy<Object>[] qcyVarArr2 = FoldersComponentImpl.e;
                a1w a1wVar = q1w.a;
                if (a1wVar != null) {
                    return a1wVar;
                }
                return null;
            case 18:
                if (e370.s != null && com.vk.toggle.b.A.a(SaFeatures.SA_MINI_APPS_CATALOG_ALIAS)) {
                    z = true;
                }
                return Boolean.valueOf(z);
            case 19:
                SearchFeatures searchFeatures2 = SearchFeatures.SEARCH_FILTERS_DS;
                searchFeatures2.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(searchFeatures2));
            case 20:
                b = e8r.a.b(r1, PrivateSubdir.WEBVIEW.h(), true);
                return b.a;
            case 21:
                Path path = new Path();
                path.moveTo(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                path.cubicTo(0.0375f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0.12876461f, 0.0895381f, 0.25f, 0.21855351f);
                path.cubicTo(0.32241032f, 0.2956106f, 0.43666667f, 0.41759142f, 0.48333332f, 0.48982617f);
                path.cubicTo(0.69f, 0.80972296f, 0.79333335f, 0.95001614f, 1.0f, 1.0f);
                return new PathInterpolator(path);
            case 22:
                return Boolean.valueOf(fxc0.B().J().X1());
            case 23:
                return new Regex("/legal/vkid_captcha_privacy(/\\w*)*", RegexOption.IGNORE_CASE);
            case 24:
                return new q3w0();
            case 25:
                return new e520(MsgSendOptionsPopup$Option.MUTED.ordinal(), R.drawable.vk_icon_mute_outline_28, R.string.vkim_mute_msg_send, 0, false, 0, 0, false, null, 0, null, false, 8176);
            case 26:
                FeedFeatures feedFeatures = FeedFeatures.FRIEND_LIKES_INLINE;
                feedFeatures.getClass();
                return Boolean.valueOf(com.vk.toggle.b.A.a(feedFeatures));
            case 27:
                qcy<Object>[] qcyVarArr3 = NewsfeedSearchFragment.p0;
                return new AtomicReference("search");
            case 28:
                return s3q0.a;
            default:
                return new Handler(Looper.getMainLooper());
        }
    }
}
