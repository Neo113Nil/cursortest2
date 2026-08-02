package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeVideosAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.videos.models.args.a;
import com.blaze.blazesdk.features.videos.models.configuration.BlazeVideosPlaybackConfiguration;
import com.blaze.blazesdk.features.videos.models.ui.VideoModel;
import com.blaze.blazesdk.features.videos.models.ui.a;
import com.blaze.blazesdk.features.videos.models.ui.e;
import com.blaze.blazesdk.features.videos.models.ui.i;
import com.blaze.blazesdk.features.videos.players.ui.VideosPlayerActivity;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.t0;
import com.blaze.blazesdk.shared.results.w0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.videos.BlazeVideosPlayerStyle;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.b;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class n0n {
    public static final n0n a = new n0n();
    public static BlazeVideosPlayerStyle b = BlazeVideosPlayerStyle.INSTANCE.base();
    public static BlazeVideosPlaybackConfiguration c = BlazeVideosPlaybackConfiguration.INSTANCE.base();

    public static void a(BlazeDataSourceType blazeDataSourceType, BlazeVideosPlayerStyle blazeVideosPlayerStyle, B b2, boolean z, String str, String str2, String str3, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1) {
        blazeDataSourceType.getClass();
        blazeVideosPlayerStyle.getClass();
        b2.getClass();
        blazeVideosPlaybackConfiguration.getClass();
        function1.getClass();
        try {
            evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new ezm(blazeDataSourceType, function1, str2, blazeVideosPlayerStyle, blazeVideosPlaybackConfiguration, z, str, str3, b2, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            w0 w0Var = new w0();
            w0Var.g = fn0.p("dataSource", blazeDataSourceType.getStringRepresentation$blazesdk_release());
            evl.l(w0Var.d(), function1);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:7:0x0026 A[Catch: all -> 0x0012, TRY_ENTER, TRY_LEAVE, TryCatch #0 {all -> 0x0012, blocks: (B:32:0x0009, B:7:0x0026), top: B:31:0x0009 }] */
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
                                qom qomVar = qom.b;
                                esm esmVar = new esm(sb2, str, blazeDataSourceType, function1, 2);
                                function12 = function1;
                                qomVar.f(blazeDataSourceType, sb2, str, str2, esmVar);
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
                    qomVar.f(blazeDataSourceType, sb2, str, str2, esmVar);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    obj = th;
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj, null);
                    evl.l(new t0().d(), function12);
                    return;
                }
                esm esmVar2 = new esm(sb2, str, blazeDataSourceType, function1, 2);
                function12 = function1;
            } catch (Throwable th3) {
                th = th3;
                function12 = function1;
            }
            StringBuilder sb3 = new StringBuilder();
            sb3.append(blazeDataSourceType.getStringRepresentation$blazesdk_release());
            if (str3 != null) {
            }
            sb3.append("prepare");
            String sb22 = sb3.toString();
            qom qomVar2 = qom.b;
        } catch (Throwable th4) {
            th = th4;
            function12 = function1;
        }
        str3 = null;
    }

    public static final void d(String str, String str2, String str3, BlazeVideosPlayerStyle blazeVideosPlayerStyle, B b2, String str4, String str5, i iVar, Function1 function1) {
        Function1 function12;
        qom.b.getClass();
        str.getClass();
        List list = (List) qom.c.get(str);
        if (list != null) {
            Iterator it = list.iterator();
            int i = 0;
            while (true) {
                if (!it.hasNext()) {
                    i = -1;
                    break;
                }
                Object next = it.next();
                if (i < 0) {
                    b.q();
                    throw null;
                }
                if (Intrinsics.c(((VideoModel) next).id, str5)) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = i >= 0 ? Integer.valueOf(i) : null;
            if (valueOf != null) {
                list.add(0, (VideoModel) list.remove(valueOf.intValue()));
            }
        }
        yda ydaVar = bmm.a;
        BlazePlayerType blazePlayerType = BlazePlayerType.VIDEOS;
        qom.b.getClass();
        List l = qom.l(str);
        ArrayList arrayList = new ArrayList(k13.r(l, 10));
        Iterator it2 = l.iterator();
        while (it2.hasNext()) {
            arrayList.add(((VideoModel) it2.next()).id);
        }
        bmm.c(str, str4, str2, blazePlayerType, arrayList);
        a aVar = new a(new a.e(blazeVideosPlayerStyle, new a.d.C0014a(e.a)), str, "entry_points_broadcast_id", str3, null, b2, BlazeVideosAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG, null, false, null, false, true, false, str4, iVar, 6016, null);
        BlazeResult.Success success = new BlazeResult.Success(Unit.a);
        try {
            Context currActivityOrApplicationContext$blazesdk_release = BlazeSDK.INSTANCE.getCurrActivityOrApplicationContext$blazesdk_release();
            if (currActivityOrApplicationContext$blazesdk_release != null) {
                VideosPlayerActivity.u.getClass();
                VideosPlayerActivity.a.b(currActivityOrApplicationContext$blazesdk_release, aVar);
            }
            evl.l(success, function1);
        } catch (Exception e) {
            function12 = function1;
            try {
                evl.l(new BlazeResult.Error(null, null, null, "playVideos failed", null, e, 23, null), function12);
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

    public static void fetchAndPlayVideo$default(n0n n0nVar, String str, BlazeVideosPlayerStyle blazeVideosPlayerStyle, String str2, B b2, boolean z, String str3, i iVar, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeVideosPlayerStyle = b;
        }
        BlazeVideosPlayerStyle blazeVideosPlayerStyle2 = blazeVideosPlayerStyle;
        boolean z2 = (i & 16) != 0 ? false : z;
        String str4 = (i & 32) != 0 ? null : str3;
        n0nVar.getClass();
        str.getClass();
        blazeVideosPlayerStyle2.getClass();
        str2.getClass();
        b2.getClass();
        iVar.getClass();
        function1.getClass();
        try {
            evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new lym(str, str4, function1, z2, blazeVideosPlayerStyle2, b2, iVar, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            blazeSDK.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            y0 y0Var = new y0();
            y0Var.f = th;
            y0Var.g = i9a.p("videoId", str);
            y0Var.b(str2);
            evl.dispatchOnMain$default(blazeSDK, null, new e9m(function1, y0Var, null), 1, null);
        }
    }

    public static /* synthetic */ void playVideo$default(n0n n0nVar, String str, BlazeVideosPlayerStyle blazeVideosPlayerStyle, B b2, String str2, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeVideosPlayerStyle = b;
        }
        BlazeVideosPlayerStyle blazeVideosPlayerStyle2 = blazeVideosPlayerStyle;
        if ((i & 16) != 0) {
            blazeVideosPlaybackConfiguration = c;
        }
        BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration2 = blazeVideosPlaybackConfiguration;
        if ((i & 32) != 0) {
            function1 = new fsm(15);
        }
        n0nVar.c(str, blazeVideosPlayerStyle2, b2, str2, blazeVideosPlaybackConfiguration2, function1);
    }

    public static /* synthetic */ void playVideos$default(n0n n0nVar, BlazeDataSourceType blazeDataSourceType, BlazeVideosPlayerStyle blazeVideosPlayerStyle, B b2, boolean z, String str, String str2, String str3, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeVideosPlayerStyle = b;
        }
        if ((i & 128) != 0) {
            blazeVideosPlaybackConfiguration = c;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            function1 = new fsm(17);
        }
        n0nVar.getClass();
        BlazeVideosPlayerStyle blazeVideosPlayerStyle2 = blazeVideosPlayerStyle;
        a(blazeDataSourceType, blazeVideosPlayerStyle2, b2, z, str, str2, str3, blazeVideosPlaybackConfiguration, function1);
    }

    public static /* synthetic */ void prepareVideos$default(n0n n0nVar, BlazeDataSourceType blazeDataSourceType, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new fsm(18);
        }
        n0nVar.getClass();
        b(blazeDataSourceType, str, str2, function1);
    }

    public final void c(String str, BlazeVideosPlayerStyle blazeVideosPlayerStyle, B b2, String str2, BlazeVideosPlaybackConfiguration blazeVideosPlaybackConfiguration, Function1 function1) {
        str.getClass();
        blazeVideosPlayerStyle.getClass();
        b2.getClass();
        blazeVideosPlaybackConfiguration.getClass();
        function1.getClass();
        BlazeVideosPlayerStyle blazeVideosPlayerStyle2 = (BlazeVideosPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeVideosPlayerStyle);
        i iVar = new i(blazeVideosPlaybackConfiguration.getMultiAspectRatio(), blazeVideosPlaybackConfiguration.getShouldOpenOnLandscape(), blazeVideosPlaybackConfiguration.getPip());
        bmm.e(str);
        fetchAndPlayVideo$default(this, str, blazeVideosPlayerStyle2, "playVideo failed", b2, false, str2, iVar, new rzm(0, function1), 16, null);
    }
}
