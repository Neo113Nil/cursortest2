package androidx.appcompat.widget;

import androidx.fragment.app.Fragment;
import androidx.recyclerview.widget.RecyclerView;
import com.google.android.gms.internal.measurement.x4;
import io.appmetrica.analytics.impl.C0122e9;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public abstract /* synthetic */ class c1 {
    public static /* synthetic */ String A(int i5) {
        switch (i5) {
            case 1:
                return "CLIENT_UPLOAD_ELIGIBILITY_UNKNOWN";
            case 2:
                return "CLIENT_UPLOAD_ELIGIBLE";
            case 3:
                return "MEASUREMENT_SERVICE_NOT_ENABLED";
            case 4:
                return "ANDROID_TOO_OLD";
            case 5:
                return "NON_PLAY_MODE";
            case 6:
                return "SDK_TOO_OLD";
            case 7:
                return "MISSING_JOB_SCHEDULER";
            case 8:
                return "NOT_ENABLED_IN_MANIFEST";
            case 9:
                return "CLIENT_FLAG_OFF";
            case 10:
                return "SERVICE_FLAG_OFF";
            case 11:
                return "PINNED_TO_SERVICE_UPLOAD";
            case 12:
                return "MISSING_SGTM_SERVER_URL";
            default:
                throw null;
        }
    }

    public static com.google.android.gms.internal.measurement.n B(com.google.android.gms.internal.measurement.j jVar, com.google.android.gms.internal.measurement.q qVar, com.google.firebase.messaging.x xVar, ArrayList arrayList) {
        String str = qVar.f5186a;
        if (jVar.g(str)) {
            com.google.android.gms.internal.measurement.n a7 = jVar.a(str);
            if (a7 instanceof com.google.android.gms.internal.measurement.h) {
                return ((com.google.android.gms.internal.measurement.h) a7).j(xVar, arrayList);
            }
            throw new IllegalArgumentException(r4.k.l(str, " is not a function"));
        }
        if (!"hasOwnProperty".equals(str)) {
            throw new IllegalArgumentException(m("Object has no function ", str));
        }
        ci.c.f0("hasOwnProperty", arrayList, 1);
        return jVar.g(((com.google.android.gms.internal.measurement.t) xVar.f6183b).c(xVar, (com.google.android.gms.internal.measurement.n) arrayList.get(0)).h()) ? com.google.android.gms.internal.measurement.n.f5144a0 : com.google.android.gms.internal.measurement.n.f5145b0;
    }

    public static androidx.lifecycle.k1 a(androidx.lifecycle.m1 m1Var, ag.c modelClass, t1.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return m1Var.c(u6.h.k(modelClass), extras);
    }

    public static androidx.lifecycle.k1 b(androidx.lifecycle.m1 m1Var, Class modelClass, t1.e extras) {
        Intrinsics.checkNotNullParameter(modelClass, "modelClass");
        Intrinsics.checkNotNullParameter(extras, "extras");
        return m1Var.a(modelClass);
    }

    public static int c(int i5) {
        switch (i5) {
            case 0:
                return 1;
            case 1:
                return 2;
            case 2:
                return 3;
            case 3:
                return 4;
            case 4:
                return 5;
            case 5:
                return 6;
            case 6:
                return 7;
            case 7:
                return 8;
            case 8:
                return 9;
            default:
                switch (i5) {
                    case 20:
                        return 10;
                    case 21:
                        return 11;
                    case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                        return 12;
                    default:
                        return 0;
                }
        }
    }

    public static /* synthetic */ String d(int i5) {
        switch (i5) {
            case 1:
                return "lr.core.Exception";
            case 2:
                return "lr.Identify";
            case 3:
                return "lr.core.LogEvent";
            case 4:
                return "lr.Metadata";
            case 5:
                return "lr.android.TouchEvent";
            case 6:
                return "lr.android.ActivityLifecycleEvent";
            case 7:
                return "lr.network.RequestEvent";
            case 8:
                return "lr.network.ResponseEvent";
            case 9:
                return "lr.android.ResourceInitializationEvent";
            case 10:
                return "lr.android.NetworkStatusEvent";
            case 11:
                return "lr.Buffer";
            case 12:
                return "lr.android.FlatViewCapture";
            case 13:
                return "lr.android.InputChangeEvent";
            case 14:
                return "lr.CustomEvent";
            case 15:
                return "lr.DebugLog";
            case 16:
                return "lr.filter.Match";
            case 17:
                return "lr.filter.ErrorState";
            case 18:
                return "lr.redux.ReduxAction";
            case 19:
                return "lr.redux.InitialState";
            case 20:
                return "lr.error.Truncated";
            case 21:
                return "lr.performance.Memory";
            case zg.g.DEBUGMODULES_FIELD_NUMBER /* 22 */:
                return "lr.performance.CpuUsage";
            case zg.g.ISCRASH_FIELD_NUMBER /* 23 */:
                return "lr.performance.NetworkThroughput";
            case zg.g.FORCEINGEST_FIELD_NUMBER /* 24 */:
                return "lr.performance.AppStartTiming";
            case C0122e9.F /* 25 */:
                return "lr.mobile.WebViewInitEvent";
            case C0122e9.G /* 26 */:
                return "lr.mobile.ImageNonCaptureEvent";
            case C0122e9.H /* 27 */:
                return "lr.mobile.CustomFonts";
            case 28:
                return "lr.metrics.Metric";
            case C0122e9.I /* 29 */:
                return "lr.PreviousSession";
            case 30:
                return "lr.ConditionalRecordingConfirmation";
            case 31:
                return "lr.AppFramework";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int e(int i5) {
        switch (i5) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 3;
            case 5:
                return 4;
            case 6:
                return 5;
            case 7:
                return 6;
            case 8:
                return 7;
            case 9:
                return 8;
            case 10:
                return 20;
            case 11:
                return 21;
            case 12:
                return 22;
            default:
                throw null;
        }
    }

    public static int f(int i5, int i10, int i11) {
        return x4.b0(i5) + i10 + i11;
    }

    public static int g(int i5, int i10, int i11, int i12) {
        return x4.b0(i5) + i10 + i11 + i12;
    }

    public static int h(int i5, int i10, int i11, int i12, int i13) {
        return Math.max(((i5 * i10) / i11) + i12, i13);
    }

    public static String i(int i5, String str) {
        return str + i5;
    }

    public static String j(int i5, String str, String str2, int i10) {
        return str + i5 + str2 + i10;
    }

    public static String k(RecyclerView recyclerView, StringBuilder sb2) {
        sb2.append(recyclerView.exceptionLabel());
        return sb2.toString();
    }

    public static String l(String str, Fragment fragment, String str2) {
        return str + fragment + str2;
    }

    public static String m(String str, String str2) {
        return str + str2;
    }

    public static String n(String str, String str2, String str3) {
        return str + str2 + str3;
    }

    public static String o(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String p(StringBuilder sb2, List list, char c2) {
        sb2.append(list);
        sb2.append(c2);
        return sb2.toString();
    }

    public static String q(Object[] objArr, int i5, String str, String str2, StringBuilder sb2) {
        String format = String.format(str, Arrays.copyOf(objArr, i5));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        sb2.append(format);
        return sb2.toString();
    }

    public static StringBuilder r(int i5, String str, String str2) {
        StringBuilder sb2 = new StringBuilder(str);
        sb2.append(i5);
        sb2.append(str2);
        return sb2;
    }

    public static void s(int i5, com.logrocket.core.graphics.n nVar, com.logrocket.core.graphics.c cVar) {
        nVar.e(cVar, Integer.valueOf(r4.k.h(i5)));
    }

    public static /* synthetic */ void t(Object obj) {
        if (obj != null) {
            throw new ClassCastException();
        }
    }

    public static void u(Object[] objArr, int i5, String str, String str2, StringBuilder sb2) {
        String format = String.format(str, Arrays.copyOf(objArr, i5));
        Intrinsics.checkNotNullExpressionValue(format, str2);
        sb2.append(format);
    }

    public static /* synthetic */ boolean v(Object obj) {
        return obj != null;
    }

    public static int w(int i5, int i10, int i11) {
        return com.google.android.gms.internal.play_billing.z2.e0(i5) + i10 + i11;
    }

    public static int x(int i5, int i10, int i11, int i12) {
        return com.google.android.gms.internal.play_billing.z2.e0(i5) + i10 + i11 + i12;
    }

    public static int y(int i5, int i10, int i11) {
        return com.logrocket.protobuf.p.o(i5) + i10 + i11;
    }

    public static int z(int i5, int i10, int i11, int i12) {
        return com.logrocket.protobuf.p.p(i5) + i10 + i11 + i12;
    }
}
