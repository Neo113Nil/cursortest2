package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeStoriesAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.stories.models.args.a;
import com.blaze.blazesdk.features.stories.models.ui.StoryModel;
import com.blaze.blazesdk.features.stories.players.ui.StoriesPlayerActivity;
import com.blaze.blazesdk.features.stories.repos.StoriesRepositoryImpl;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.t0;
import com.blaze.blazesdk.shared.results.v0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.stories.BlazeStoryPlayerStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class bxm {
    public static final bxm a = new bxm();
    public static BlazeStoryPlayerStyle b = BlazeStoryPlayerStyle.INSTANCE.base();

    public static void a(BlazeDataSourceType blazeDataSourceType, BlazeStoryPlayerStyle blazeStoryPlayerStyle, B b2, boolean z, String str, String str2, String str3, String str4, Function1 function1) {
        blazeDataSourceType.getClass();
        blazeStoryPlayerStyle.getClass();
        b2.getClass();
        function1.getClass();
        try {
            evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new svm(blazeDataSourceType, function1, str2, blazeStoryPlayerStyle, str4, z, str, b2, str3, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            evl.l(new v0().d(), function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0025 A[Catch: all -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:26:0x0009, B:7:0x0025), top: B:25:0x0009 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void b(BlazeDataSourceType blazeDataSourceType, String str, String str2, Function1 function1) {
        String str3;
        Object obj;
        Function1 function12;
        blazeDataSourceType.getClass();
        function1.getClass();
        try {
            try {
                if (str2 != null) {
                    try {
                        if (!StringsKt.R(str2)) {
                            str3 = str2;
                            StringBuilder sb = new StringBuilder();
                            sb.append(blazeDataSourceType.getStringRepresentation$blazesdk_release());
                            if (str3 != null) {
                                sb.append(str3);
                            }
                            sb.append("prepare");
                            String sb2 = sb.toString();
                            StoriesRepositoryImpl storiesRepositoryImpl = StoriesRepositoryImpl.a;
                            function12 = function1;
                            esm esmVar = new esm(sb2, str, blazeDataSourceType, function12, 1);
                            storiesRepositoryImpl.getClass();
                            StoriesRepositoryImpl.g(blazeDataSourceType, sb2, str, str2, esmVar);
                            return;
                        }
                    } catch (Throwable th) {
                        obj = th;
                        function12 = function1;
                        BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj, null);
                        evl.l(new t0().d(), function12);
                        return;
                    }
                }
                esm esmVar2 = new esm(sb2, str, blazeDataSourceType, function12, 1);
                storiesRepositoryImpl.getClass();
                StoriesRepositoryImpl.g(blazeDataSourceType, sb2, str, str2, esmVar2);
                return;
            } catch (Throwable th2) {
                th = th2;
                obj = th;
                BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj, null);
                evl.l(new t0().d(), function12);
                return;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(blazeDataSourceType.getStringRepresentation$blazesdk_release());
            if (str3 != null) {
            }
            sb3.append("prepare");
            String sb22 = sb3.toString();
            StoriesRepositoryImpl storiesRepositoryImpl2 = StoriesRepositoryImpl.a;
            function12 = function1;
        } catch (Throwable th3) {
            th = th3;
            function12 = function1;
        }
        str3 = null;
    }

    public static final void d(String str, String str2, String str3, BlazeStoryPlayerStyle blazeStoryPlayerStyle, B b2, String str4, String str5, String str6, Function1 function1) {
        Function1 function12;
        StoriesRepositoryImpl.a.getClass();
        StoriesRepositoryImpl.i(str, str5);
        yda ydaVar = bmm.a;
        BlazePlayerType blazePlayerType = BlazePlayerType.STORIES;
        List o = StoriesRepositoryImpl.o(str);
        ArrayList arrayList = new ArrayList(k13.r(o, 10));
        Iterator it = o.iterator();
        while (it.hasNext()) {
            arrayList.add(((StoryModel) it.next()).id);
        }
        bmm.c(str, str4, str2, blazePlayerType, arrayList);
        a aVar = new a(blazeStoryPlayerStyle, str, "entry_points_broadcast_id", str3, null, b2, BlazeStoriesAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG, null, str6, false, null, true, str4, 1664, null);
        BlazeResult.Success success = new BlazeResult.Success(Unit.a);
        try {
            Context currActivityOrApplicationContext$blazesdk_release = BlazeSDK.INSTANCE.getCurrActivityOrApplicationContext$blazesdk_release();
            if (currActivityOrApplicationContext$blazesdk_release != null) {
                StoriesPlayerActivity.n.getClass();
                StoriesPlayerActivity.a.a(currActivityOrApplicationContext$blazesdk_release, aVar);
            }
            evl.l(success, function1);
        } catch (Exception e) {
            function12 = function1;
            try {
                evl.l(new BlazeResult.Error(null, null, null, "playStories failed", null, e, 23, null), function12);
            } catch (Throwable th) {
                th = th;
                evl.l(success, function12);
                throw th;
            }
        } catch (Throwable th2) {
            th = th2;
            function12 = function1;
            evl.l(success, function12);
            throw th;
        }
    }

    public static void fetchAndPlayStory$blazesdk_release$default(bxm bxmVar, String str, String str2, String str3, BlazeStoryPlayerStyle blazeStoryPlayerStyle, boolean z, B b2, String str4, String str5, Function1 function1, int i, Object obj) {
        Function1 function12;
        String str6;
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            str3 = null;
        }
        if ((i & 8) != 0) {
            blazeStoryPlayerStyle = b;
        }
        if ((i & 16) != 0) {
            z = false;
        }
        if ((i & 128) != 0) {
            str5 = null;
        }
        bxmVar.getClass();
        str.getClass();
        blazeStoryPlayerStyle.getClass();
        b2.getClass();
        str4.getClass();
        function1.getClass();
        try {
            BlazeStoryPlayerStyle blazeStoryPlayerStyle2 = blazeStoryPlayerStyle;
            function12 = function1;
            str6 = str4;
            try {
                evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new uum(str, str3, str5, function12, z, blazeStoryPlayerStyle2, b2, str2, str6, null), 1, null);
            } catch (Throwable th) {
                th = th;
                Throwable th2 = th;
                BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
                blazeSDK.getGlobalThrowableCatcher$blazesdk_release().invoke(th2, null);
                y0 y0Var = new y0();
                y0Var.f = th2;
                y0Var.g = i9a.p("storyId", str);
                y0Var.b(str6);
                evl.dispatchOnMain$default(blazeSDK, null, new e9m(function12, y0Var, null), 1, null);
            }
        } catch (Throwable th3) {
            th = th3;
            function12 = function1;
            str6 = str4;
        }
    }

    public static /* synthetic */ void playStories$blazesdk_release$default(bxm bxmVar, BlazeDataSourceType blazeDataSourceType, BlazeStoryPlayerStyle blazeStoryPlayerStyle, B b2, boolean z, String str, String str2, String str3, String str4, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeStoryPlayerStyle = b;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            function1 = new fsm(5);
        }
        bxmVar.getClass();
        a(blazeDataSourceType, blazeStoryPlayerStyle, b2, z, str, str2, str3, str4, function1);
    }

    public static /* synthetic */ void playStory$blazesdk_release$default(bxm bxmVar, String str, String str2, BlazeStoryPlayerStyle blazeStoryPlayerStyle, String str3, B b2, String str4, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            str2 = null;
        }
        if ((i & 4) != 0) {
            blazeStoryPlayerStyle = b;
        }
        if ((i & 8) != 0) {
            str3 = null;
        }
        if ((i & 64) != 0) {
            function1 = new fsm(4);
        }
        bxmVar.c(str, str2, blazeStoryPlayerStyle, str3, b2, str4, function1);
    }

    public static /* synthetic */ void prepareStories$blazesdk_release$default(bxm bxmVar, BlazeDataSourceType blazeDataSourceType, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new fsm(3);
        }
        bxmVar.getClass();
        b(blazeDataSourceType, str, str2, function1);
    }

    public final void c(String str, String str2, BlazeStoryPlayerStyle blazeStoryPlayerStyle, String str3, B b2, String str4, Function1 function1) {
        str.getClass();
        blazeStoryPlayerStyle.getClass();
        b2.getClass();
        function1.getClass();
        fetchAndPlayStory$blazesdk_release$default(this, str, str2, str3, (BlazeStoryPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeStoryPlayerStyle), false, b2, "playPage failed", str4, new fuj(29, function1), 16, null);
    }
}
