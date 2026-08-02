package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.content.Context;
import android.os.Build;
import android.os.Process;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public final class z7f {
    public static final z7f a = new z7f();

    public static ArrayList a(Context context) {
        List<ActivityManager.RunningAppProcessInfo> list;
        context.getClass();
        int i = context.getApplicationInfo().uid;
        String str = context.getApplicationInfo().processName;
        Object systemService = context.getSystemService("activity");
        ActivityManager activityManager = systemService instanceof ActivityManager ? (ActivityManager) systemService : null;
        if (activityManager == null || (list = activityManager.getRunningAppProcesses()) == null) {
            list = km5.a;
        }
        ArrayList W = CollectionsKt.W(list);
        ArrayList arrayList = new ArrayList();
        Iterator it = W.iterator();
        while (it.hasNext()) {
            Object next = it.next();
            if (((ActivityManager.RunningAppProcessInfo) next).uid == i) {
                arrayList.add(next);
            }
        }
        ArrayList arrayList2 = new ArrayList(k13.r(arrayList, 10));
        Iterator it2 = arrayList.iterator();
        while (it2.hasNext()) {
            ActivityManager.RunningAppProcessInfo runningAppProcessInfo = (ActivityManager.RunningAppProcessInfo) it2.next();
            pt0 pt0Var = new pt0();
            String str2 = runningAppProcessInfo.processName;
            if (str2 == null) {
                yhk.s("Null processName");
                return null;
            }
            pt0Var.a = str2;
            pt0Var.b = runningAppProcessInfo.pid;
            byte b = (byte) (pt0Var.e | 1);
            pt0Var.c = runningAppProcessInfo.importance;
            pt0Var.e = (byte) (b | 2);
            pt0Var.d = Intrinsics.c(str2, str);
            pt0Var.e = (byte) (pt0Var.e | 4);
            arrayList2.add(pt0Var.a());
        }
        return arrayList2;
    }

    public final gx3 b(Context context) {
        Object obj;
        String str;
        context.getClass();
        int myPid = Process.myPid();
        Iterator it = a(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((qt0) ((gx3) obj)).b == myPid) {
                break;
            }
        }
        gx3 gx3Var = (gx3) obj;
        if (gx3Var != null) {
            return gx3Var;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            str = Process.myProcessName();
            str.getClass();
        } else if (i < 28 || (str = Application.getProcessName()) == null) {
            str = "";
        }
        pt0 pt0Var = new pt0();
        pt0Var.a = str;
        pt0Var.b = myPid;
        byte b = (byte) (pt0Var.e | 1);
        pt0Var.c = 0;
        pt0Var.d = false;
        pt0Var.e = (byte) (((byte) (b | 2)) | 4);
        return pt0Var.a();
    }
}
