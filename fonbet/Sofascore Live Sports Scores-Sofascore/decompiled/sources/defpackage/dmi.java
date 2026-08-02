package defpackage;

import android.content.SharedPreferences;
import android.content.res.TypedArray;
import android.media.MediaDrm;
import android.media.MediaMetadataRetriever;
import android.net.Uri;
import android.util.Pair;
import androidx.core.app.NotificationCompat;
import com.ironsource.U3;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.BasketballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.FootballTopTeamsStatisticsItem;
import com.sofascore.model.newNetwork.topperformance.topTeams.items.RugbyTopTeamsStatisticsItem;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.ForkJoinPool;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract /* synthetic */ class dmi {
    public static /* synthetic */ String A(int i) {
        switch (i) {
            case 1:
                return U3.i.r;
            case 2:
                return "start";
            case 3:
                return "firstQuartile";
            case 4:
                return CampaignEx.JSON_NATIVE_VIDEO_MIDPOINT;
            case 5:
                return "thirdQuartile";
            case 6:
                return CampaignEx.JSON_NATIVE_VIDEO_COMPLETE;
            case 7:
                return NotificationCompat.CATEGORY_PROGRESS;
            case 8:
                return CampaignEx.JSON_NATIVE_VIDEO_CLOSE;
            case 9:
                return "closeLinear";
            case 10:
                return CampaignEx.JSON_NATIVE_VIDEO_MUTE;
            case 11:
                return CampaignEx.JSON_NATIVE_VIDEO_UNMUTE;
            case 12:
                return CampaignEx.JSON_NATIVE_VIDEO_PAUSE;
            case 13:
                return CampaignEx.JSON_NATIVE_VIDEO_RESUME;
            case 14:
                return "creativeView";
            case 15:
                return "verificationNotExecuted";
            default:
                throw null;
        }
    }

    public static /* synthetic */ int a(int i) {
        switch (i) {
            case 1:
                return 0;
            case 2:
                return 1;
            case 3:
                return 2;
            case 4:
                return 8;
            case 5:
                return 9;
            case 6:
                return 10;
            case 7:
                return 16;
            default:
                throw null;
        }
    }

    public static int b(int i, int i2, double d) {
        return (Double.hashCode(d) + i) * i2;
    }

    public static int c(int i, int i2, String str) {
        return (str.hashCode() + i) * i2;
    }

    public static int d(int i, int i2, List list) {
        return (list.hashCode() + i) * i2;
    }

    public static int e(int i, int i2, boolean z) {
        return (Boolean.hashCode(z) + i) * i2;
    }

    public static int f(dfj dfjVar, int i, int i2) {
        return (dfjVar.hashCode() + i) * i2;
    }

    public static int g(Map map, int i, int i2) {
        return (map.hashCode() + i) * i2;
    }

    public static ndd h(av8 av8Var, int i, boolean z) {
        av8Var.d0(i);
        av8Var.s(z);
        return new ndd();
    }

    public static SharedPreferences.Editor i(SharedPreferences sharedPreferences, String str, boolean z) {
        SharedPreferences.Editor edit = sharedPreferences.edit();
        edit.getClass();
        edit.putBoolean(str, z);
        return edit;
    }

    public static String j(char c, String str, String str2) {
        return str + str2 + c;
    }

    public static String k(int i, int i2, String str, String str2) {
        return str + i + str2 + i2;
    }

    public static String l(int i, String str, String str2, String str3) {
        return str + str2 + str3 + i;
    }

    public static String m(Uri uri, String str) {
        return str + uri;
    }

    public static String n(BasketballTopTeamsStatisticsItem basketballTopTeamsStatisticsItem, Integer num) {
        return rei.m(num, Integer.valueOf(basketballTopTeamsStatisticsItem.getMatches()));
    }

    public static String o(FootballTopTeamsStatisticsItem footballTopTeamsStatisticsItem, Integer num) {
        return rei.m(num, Integer.valueOf(footballTopTeamsStatisticsItem.getMatches()));
    }

    public static String p(RugbyTopTeamsStatisticsItem rugbyTopTeamsStatisticsItem, Integer num) {
        return rei.m(num, Integer.valueOf(rugbyTopTeamsStatisticsItem.getMatches()));
    }

    public static String q(String str, String str2) {
        return str + str2;
    }

    public static String r(String str, String str2, String str3, String str4) {
        return str + str2 + str3 + str4;
    }

    public static String s(StringBuilder sb, Map map, char c) {
        sb.append(map);
        sb.append(c);
        return sb.toString();
    }

    public static StringBuilder t(int i, String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder(str);
        sb.append(i);
        sb.append(str2);
        sb.append(str3);
        sb.append(str4);
        return sb;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ void u(d2g d2gVar) {
        boolean isTerminated;
        if (d2gVar instanceof AutoCloseable) {
            d2gVar.close();
            return;
        }
        if (!(d2gVar instanceof ExecutorService)) {
            ilg.c();
            return;
        }
        ExecutorService executorService = (ExecutorService) d2gVar;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static /* synthetic */ void v(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                ilg.c();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }

    public static void w(StringBuilder sb, String str, String str2, boolean z, String str3) {
        sb.append(str);
        sb.append(str2);
        sb.append(z);
        sb.append(str3);
    }

    public static void x(ArrayList arrayList, String str, String str2) {
        arrayList.add(new Pair(str, str2));
    }

    public static String y(String str, String str2) {
        return str + str2;
    }

    public static /* synthetic */ void z(AutoCloseable autoCloseable) {
        boolean isTerminated;
        if (autoCloseable instanceof AutoCloseable) {
            autoCloseable.close();
            return;
        }
        if (!(autoCloseable instanceof ExecutorService)) {
            if (autoCloseable instanceof TypedArray) {
                ((TypedArray) autoCloseable).recycle();
                return;
            }
            if (autoCloseable instanceof MediaMetadataRetriever) {
                ((MediaMetadataRetriever) autoCloseable).release();
                return;
            } else if (autoCloseable instanceof MediaDrm) {
                ((MediaDrm) autoCloseable).release();
                return;
            } else {
                ilg.c();
                return;
            }
        }
        ExecutorService executorService = (ExecutorService) autoCloseable;
        if (executorService == ForkJoinPool.commonPool() || (isTerminated = executorService.isTerminated())) {
            return;
        }
        executorService.shutdown();
        boolean z = false;
        while (!isTerminated) {
            try {
                isTerminated = executorService.awaitTermination(1L, TimeUnit.DAYS);
            } catch (InterruptedException unused) {
                if (!z) {
                    executorService.shutdownNow();
                    z = true;
                }
            }
        }
        if (z) {
            Thread.currentThread().interrupt();
        }
    }
}
