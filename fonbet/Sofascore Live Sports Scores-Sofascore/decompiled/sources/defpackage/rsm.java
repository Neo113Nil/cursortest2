package defpackage;

import android.content.Context;
import androidx.core.app.NotificationCompat;
import com.blaze.blazesdk.ads.models.ui.BlazeMomentsAdsConfigType;
import com.blaze.blazesdk.data_source.BlazeDataSourceType;
import com.blaze.blazesdk.delegates.models.BlazePlayerType;
import com.blaze.blazesdk.extentions.ParcelableExtensionKt;
import com.blaze.blazesdk.features.moments.models.args.a;
import com.blaze.blazesdk.features.moments.models.configuration.BlazeMomentsPlaybackConfiguration;
import com.blaze.blazesdk.features.moments.models.ui.MomentModel;
import com.blaze.blazesdk.features.moments.players.ui.MomentsPlayerActivity;
import com.blaze.blazesdk.players.models.B;
import com.blaze.blazesdk.shared.BlazeSDK;
import com.blaze.blazesdk.shared.results.BlazeResult;
import com.blaze.blazesdk.shared.results.t0;
import com.blaze.blazesdk.shared.results.u0;
import com.blaze.blazesdk.shared.results.y0;
import com.blaze.blazesdk.style.players.moments.BlazeMomentsPlayerStyle;
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
public final class rsm {
    public static final rsm a = new rsm();
    public static BlazeMomentsPlayerStyle b = BlazeMomentsPlayerStyle.INSTANCE.base();
    public static BlazeMomentsPlaybackConfiguration c = BlazeMomentsPlaybackConfiguration.INSTANCE.base();

    public static void a(BlazeDataSourceType blazeDataSourceType, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, B b2, boolean z, String str, String str2, String str3, Function1 function1) {
        blazeDataSourceType.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        b2.getClass();
        function1.getClass();
        try {
            evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new jqm(blazeDataSourceType, function1, str2, blazeMomentsPlayerStyle, z, str, str3, blazeMomentsPlaybackConfiguration, b2, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            evl.l(new u0().d(), function1);
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
                                gum gumVar = gum.b;
                                esm esmVar = new esm(sb2, str, blazeDataSourceType, function1, 0);
                                function12 = function1;
                                gumVar.h(blazeDataSourceType, sb2, str, str2, esmVar);
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
                    gumVar.h(blazeDataSourceType, sb2, str, str2, esmVar);
                    return;
                } catch (Throwable th2) {
                    th = th2;
                    obj = th;
                    BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(obj, null);
                    evl.l(new t0().d(), function12);
                    return;
                }
                esm esmVar2 = new esm(sb2, str, blazeDataSourceType, function1, 0);
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
            gum gumVar2 = gum.b;
        } catch (Throwable th4) {
            th = th4;
            function12 = function1;
        }
        str3 = null;
    }

    public static final void d(String str, String str2, String str3, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, B b2, String str4, String str5, Function1 function1) {
        Function1 function12;
        u45 u45Var;
        Exception exc;
        gum.b.getClass();
        str.getClass();
        List list = (List) gum.c.get(str);
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
                if (Intrinsics.c(((MomentModel) next).id, str5)) {
                    break;
                } else {
                    i++;
                }
            }
            Integer valueOf = i >= 0 ? Integer.valueOf(i) : null;
            if (valueOf != null) {
                list.add(0, (MomentModel) list.remove(valueOf.intValue()));
            }
        }
        yda ydaVar = bmm.a;
        BlazePlayerType blazePlayerType = BlazePlayerType.MOMENTS;
        gum.b.getClass();
        List q = gum.q(str);
        ArrayList arrayList = new ArrayList(k13.r(q, 10));
        Iterator it2 = q.iterator();
        while (it2.hasNext()) {
            arrayList.add(((MomentModel) it2.next()).id);
        }
        bmm.c(str, str4, str2, blazePlayerType, arrayList);
        a aVar = new a(blazeMomentsPlayerStyle, str, "entry_points_broadcast_id", str3, null, b2, BlazeMomentsAdsConfigType.FIRST_AVAILABLE_ADS_CONFIG, null, false, null, false, true, str4, i2a.p(blazeMomentsPlaybackConfiguration), 1920, null);
        fsf fsfVar = new fsf();
        fsfVar.a = new BlazeResult.Success(Unit.a);
        try {
            try {
                BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
                Context currActivityOrApplicationContext$blazesdk_release = blazeSDK.getCurrActivityOrApplicationContext$blazesdk_release();
                if (currActivityOrApplicationContext$blazesdk_release != null) {
                    try {
                        MomentsPlayerActivity.n.getClass();
                        MomentsPlayerActivity.a.a(currActivityOrApplicationContext$blazesdk_release, aVar);
                    } catch (Exception e) {
                        function12 = function1;
                        exc = e;
                        u45Var = null;
                        try {
                            fsfVar.a = new BlazeResult.Error(null, null, null, "playMoments failed", null, exc, 23, null);
                            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, u45Var, new krm(function12, fsfVar, u45Var), 1, u45Var);
                            return;
                        } catch (Throwable th) {
                            th = th;
                            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, u45Var, new krm(function12, fsfVar, u45Var), 1, u45Var);
                            throw th;
                        }
                    }
                }
                evl.dispatchOnMain$default(blazeSDK, null, new krm(function1, fsfVar, null), 1, null);
            } catch (Exception e2) {
                function12 = function1;
                u45Var = null;
                exc = e2;
            }
        } catch (Throwable th2) {
            th = th2;
            function12 = function1;
            u45Var = null;
            evl.dispatchOnMain$default(BlazeSDK.INSTANCE, u45Var, new krm(function12, fsfVar, u45Var), 1, u45Var);
            throw th;
        }
    }

    public static void fetchAndPlayMoment$default(rsm rsmVar, String str, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, String str2, B b2, boolean z, String str3, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeMomentsPlayerStyle = b;
        }
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2 = blazeMomentsPlayerStyle;
        BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration2 = (i & 4) != 0 ? c : blazeMomentsPlaybackConfiguration;
        boolean z2 = (i & 32) != 0 ? false : z;
        String str4 = (i & 64) != 0 ? null : str3;
        rsmVar.getClass();
        str.getClass();
        blazeMomentsPlayerStyle2.getClass();
        blazeMomentsPlaybackConfiguration2.getClass();
        str2.getClass();
        b2.getClass();
        function1.getClass();
        try {
            evl.dispatchOnIO$default(BlazeSDK.INSTANCE, null, new epm(str, str4, function1, z2, blazeMomentsPlayerStyle2, b2, blazeMomentsPlaybackConfiguration2, str2, null), 1, null);
        } catch (Throwable th) {
            BlazeSDK blazeSDK = BlazeSDK.INSTANCE;
            blazeSDK.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
            y0 y0Var = new y0();
            y0Var.f = th;
            y0Var.g = i9a.p("momentId", str);
            y0Var.b(str2);
            evl.dispatchOnMain$default(blazeSDK, null, new e9m(function1, y0Var, null), 1, null);
        }
    }

    public static /* synthetic */ void playMoment$default(rsm rsmVar, String str, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, B b2, String str2, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeMomentsPlayerStyle = b;
        }
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2 = blazeMomentsPlayerStyle;
        if ((i & 4) != 0) {
            blazeMomentsPlaybackConfiguration = c;
        }
        BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration2 = blazeMomentsPlaybackConfiguration;
        if ((i & 32) != 0) {
            function1 = new w5m(29);
        }
        rsmVar.c(str, blazeMomentsPlayerStyle2, blazeMomentsPlaybackConfiguration2, b2, str2, function1);
    }

    public static /* synthetic */ void playMoments$default(rsm rsmVar, BlazeDataSourceType blazeDataSourceType, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, B b2, boolean z, String str, String str2, String str3, Function1 function1, int i, Object obj) {
        if ((i & 2) != 0) {
            blazeMomentsPlayerStyle = b;
        }
        if ((i & 4) != 0) {
            blazeMomentsPlaybackConfiguration = c;
        }
        if ((i & NotificationCompat.FLAG_LOCAL_ONLY) != 0) {
            function1 = new fsm(0);
        }
        rsmVar.getClass();
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2 = blazeMomentsPlayerStyle;
        a(blazeDataSourceType, blazeMomentsPlayerStyle2, blazeMomentsPlaybackConfiguration, b2, z, str, str2, str3, function1);
    }

    public static /* synthetic */ void prepareMoments$default(rsm rsmVar, BlazeDataSourceType blazeDataSourceType, String str, String str2, Function1 function1, int i, Object obj) {
        if ((i & 8) != 0) {
            function1 = new w5m(28);
        }
        rsmVar.getClass();
        b(blazeDataSourceType, str, str2, function1);
    }

    public final void c(String str, BlazeMomentsPlayerStyle blazeMomentsPlayerStyle, BlazeMomentsPlaybackConfiguration blazeMomentsPlaybackConfiguration, B b2, String str2, Function1 function1) {
        str.getClass();
        blazeMomentsPlayerStyle.getClass();
        blazeMomentsPlaybackConfiguration.getClass();
        b2.getClass();
        function1.getClass();
        BlazeMomentsPlayerStyle blazeMomentsPlayerStyle2 = (BlazeMomentsPlayerStyle) ParcelableExtensionKt.blazeDeepCopy(blazeMomentsPlayerStyle);
        bmm.e(str);
        fetchAndPlayMoment$default(this, str, blazeMomentsPlayerStyle2, blazeMomentsPlaybackConfiguration, "playMoment failed", b2, false, str2, new fuj(28, function1), 32, null);
    }
}
