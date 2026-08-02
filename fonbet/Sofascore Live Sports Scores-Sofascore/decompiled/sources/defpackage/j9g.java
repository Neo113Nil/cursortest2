package defpackage;

import android.content.Context;
import android.graphics.BitmapFactory;
import com.google.firebase.perf.network.FirebasePerfUrlConnection;
import com.sofascore.model.mvvm.model.PlayerData;
import com.sofascore.model.network.response.RugbyPlayerEventStatistics;
import java.net.URL;
import java.net.URLConnection;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Random;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final /* synthetic */ class j9g implements Function1 {
    public final /* synthetic */ int a;

    public /* synthetic */ j9g(int i) {
        this.a = i;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        switch (this.a) {
            case 0:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 1:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics.getTryAssists()));
            case 2:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getTryAssists()));
            case 3:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 4:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics2 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics2.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics2.getTurnoversWon()));
            case 5:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 6:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getTurnoversWon()));
            case 7:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 8:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics3 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics3.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics3.getTries()));
            case 9:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getTries()));
            case 10:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 11:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics4 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics4.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics4.getTackles()));
            case 12:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getTackles()));
            case 13:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 14:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics5 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics5.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics5.getPenaltyGoals()));
            case 15:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics6 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics6.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics6.getPasses()));
            case 16:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getPasses()));
            case 17:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 18:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics7 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics7.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics7.getCarries()));
            case 19:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Double.valueOf(yid.m(r6.getCarries()));
            case 20:
                ((RugbyPlayerEventStatistics) obj).getClass();
                return Boolean.TRUE;
            case 21:
                RugbyPlayerEventStatistics rugbyPlayerEventStatistics8 = (RugbyPlayerEventStatistics) obj;
                rugbyPlayerEventStatistics8.getClass();
                return String.valueOf(yid.m(rugbyPlayerEventStatistics8.getCleanBreaks()));
            case 22:
                ((PlayerData) obj).getClass();
                return Boolean.TRUE;
            case 23:
                pgg pggVar = (pgg) obj;
                pggVar.getClass();
                return new tgg(pggVar);
            case 24:
                List list = (List) obj;
                list.getClass();
                jhg jhgVar = new jhg(new wm2(list, false), new HashMap());
                jhgVar.g = new ArrayList();
                synchronized (jhgVar) {
                    Iterator it = ((ArrayList) jhgVar.c).iterator();
                    while (it.hasNext()) {
                        fkg fkgVar = (fkg) it.next();
                        if (fkgVar instanceof ihg) {
                            ArrayList arrayList = jhgVar.g;
                            clg clgVar = new clg();
                            clgVar.a = new Random().nextLong();
                            clgVar.b = (ihg) fkgVar;
                            clgVar.c = 0L;
                            arrayList.add(clgVar);
                        }
                    }
                }
                jhgVar.h = -1L;
                return jhgVar;
            case 25:
                return new vgg((String) obj);
            case 26:
                ((Long) obj).getClass();
                return Unit.a;
            case 27:
                String str = (String) obj;
                str.getClass();
                return BitmapFactory.decodeStream(((URLConnection) FirebasePerfUrlConnection.instrument(new URL(str).openConnection())).getInputStream());
            case 28:
                Context context = (Context) obj;
                context.getClass();
                return new wf6(context).a();
            default:
                Context context2 = (Context) obj;
                context2.getClass();
                return new sgg(context2);
        }
    }
}
