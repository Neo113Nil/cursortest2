package com.vk.permission;

import android.annotation.SuppressLint;
import android.app.Activity;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.Intent;
import android.content.res.Resources;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import androidx.fragment.app.Fragment;
import androidx.fragment.app.FragmentActivity;
import com.vk.core.preference.Preference;
import com.vk.permission.c;
import com.vk.permission.d;
import com.vkontakte.android.R;
import io.reactivex.rxjava3.internal.operators.observable.i0;
import io.reactivex.rxjava3.subjects.f;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import xsna.asp;
import xsna.b290;
import xsna.bpn0;
import xsna.bwg;
import xsna.enj;
import xsna.gy90;
import xsna.gz80;
import xsna.gzs;
import xsna.izs;
import xsna.jw5;
import xsna.npe;
import xsna.rdj;
import xsna.rl3;
import xsna.s3q0;
import xsna.tvo;
import xsna.vqb;
import xsna.vx90;
import xsna.wx90;
import xsna.xj3;
import xsna.zrp;

/* compiled from: PermissionHelper.kt */
/* loaded from: classes.dex */
public final class PermissionHelper {
    public static final f<gy90> A;
    public static final PermissionHelper a = new PermissionHelper();
    public static final String[] b = {"android.permission.POST_NOTIFICATIONS"};
    public static final String[] c;
    public static final String[] d;
    public static final String[] e;
    public static final String[] f;
    public static final String[] g;
    public static final String[] h;
    public static final String[] i;
    public static final String[] j;
    public static final String[] k;
    public static final String[] l;
    public static final String[] m;
    public static final String[] n;
    public static final String[] o;
    public static final String[] p;
    public static final String[] q;
    public static final String[] r;
    public static final String[] s;
    public static final String[] t;
    public static final String[] u;
    public static final String[] v;
    public static final String[] w;
    public static final String[] x;
    public static final String[] y;
    public static final String[] z;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: PermissionHelper.kt */
    public static final class PermissionResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ PermissionResult[] $VALUES;
        public static final PermissionResult ALLOWED;
        public static final PermissionResult DONT_ASK_AGAIN;
        public static final PermissionResult NOT_ALLOWED;
        public static final PermissionResult NOT_DETERMINED;

        static {
            PermissionResult permissionResult = new PermissionResult("ALLOWED", 0);
            ALLOWED = permissionResult;
            PermissionResult permissionResult2 = new PermissionResult("NOT_ALLOWED", 1);
            NOT_ALLOWED = permissionResult2;
            PermissionResult permissionResult3 = new PermissionResult("DONT_ASK_AGAIN", 2);
            DONT_ASK_AGAIN = permissionResult3;
            PermissionResult permissionResult4 = new PermissionResult("NOT_DETERMINED", 3);
            NOT_DETERMINED = permissionResult4;
            PermissionResult[] permissionResultArr = {permissionResult, permissionResult2, permissionResult3, permissionResult4};
            $VALUES = permissionResultArr;
            $ENTRIES = new asp(permissionResultArr);
        }

        public PermissionResult() {
            throw null;
        }

        public static PermissionResult valueOf(String str) {
            return (PermissionResult) Enum.valueOf(PermissionResult.class, str);
        }

        public static PermissionResult[] values() {
            return (PermissionResult[]) $VALUES.clone();
        }
    }

    static {
        String[] strArr = {"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO"};
        c = strArr;
        if (gz80.a(34)) {
            strArr = new String[]{"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        } else if (!gz80.a(33)) {
            strArr = new String[]{"android.permission.READ_EXTERNAL_STORAGE"};
        }
        d = strArr;
        String[] strArr2 = {"android.permission.READ_MEDIA_IMAGES", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        String[] strArr3 = {"android.permission.READ_MEDIA_VIDEO", "android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        String[] a2 = a(strArr);
        e = a2;
        String[] strArr4 = {"android.permission.READ_MEDIA_VISUAL_USER_SELECTED"};
        f = strArr4;
        if (!gz80.a(34)) {
            strArr4 = a2;
        }
        g = strArr4;
        String[] strArr5 = {"android.permission.ACCESS_COARSE_LOCATION"};
        h = strArr5;
        String[] strArr6 = (String[]) jw5.y("android.permission.ACCESS_FINE_LOCATION", strArr5);
        i = strArr6;
        String[] strArr7 = {"android.permission.CAMERA", "android.permission.RECORD_AUDIO"};
        j = strArr7;
        k = (String[]) jw5.z(strArr7, strArr6);
        l = new String[]{"android.permission.CAMERA"};
        m = new String[]{"android.permission.RECORD_AUDIO"};
        n = a(new String[]{"android.permission.RECORD_AUDIO"});
        o = a(new String[0]);
        String[] strArr8 = {"android.permission.ACCESS_MEDIA_LOCATION"};
        p = strArr8;
        q = (String[]) jw5.z(a2, strArr8);
        r = (String[]) jw5.z(strArr2, strArr8);
        s = (String[]) jw5.z(strArr3, strArr8);
        t = (String[]) jw5.y("android.permission.CAMERA", a2);
        u = new String[]{"android.permission.READ_CONTACTS"};
        a(new String[]{"android.permission.RECORD_AUDIO", "android.permission.CAMERA"});
        String[] strArr9 = {"android.permission.RECORD_AUDIO", "android.permission.CAMERA"};
        v = strArr9;
        w = new String[]{"android.permission.READ_CALENDAR", "android.permission.WRITE_CALENDAR"};
        x = a(new String[0]);
        y = new String[]{"android.permission.READ_CONTACTS", "android.permission.WRITE_CONTACTS"};
        z = new String[]{"android.permission.CAMERA"};
        A = new f<>();
    }

    public static String[] a(String[] strArr) {
        return !gz80.a(30) ? (String[]) jw5.y("android.permission.WRITE_EXTERNAL_STORAGE", strArr) : strArr;
    }

    public static boolean b(Context context, String[] strArr) {
        return tvo.a(context, (String[]) Arrays.copyOf(strArr, strArr.length));
    }

    public static boolean c(Context context, String[] strArr) {
        for (String str : strArr) {
            if (tvo.a(context, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean e(FragmentActivity fragmentActivity, String[] strArr, String[] strArr2, String str, int i2, gzs gzsVar, izs izsVar, Integer num, gzs gzsVar2) {
        if (fragmentActivity == null) {
            return false;
        }
        boolean a2 = gz80.a(34);
        String[] strArr3 = l;
        String[] strArr4 = t;
        String[] strArr5 = f;
        String[] strArr6 = e;
        String[] strArr7 = (a2 && Arrays.equals(strArr2, strArr6) && Arrays.equals(strArr2, strArr)) ? strArr5 : (gz80.a(34) && Arrays.equals(strArr2, strArr4) && Arrays.equals(strArr2, strArr) && o(fragmentActivity)) ? strArr3 : strArr;
        String[] strArr8 = (gz80.a(34) && Arrays.equals(strArr2, strArr4) && Arrays.equals(strArr2, strArr) && o(fragmentActivity)) ? strArr3 : (gz80.a(34) && Arrays.equals(strArr2, strArr6) && Arrays.equals(strArr2, strArr) && o(fragmentActivity)) ? strArr5 : strArr2;
        bwg bwgVar = new bwg(fragmentActivity, gzsVar, strArr8, 5);
        vqb vqbVar = new vqb(fragmentActivity, strArr7, izsVar, strArr8, 1);
        if (b(fragmentActivity, strArr8)) {
            if (gzsVar != null) {
                gzsVar.invoke();
            }
            w(strArr8);
            return true;
        }
        vx90 vx90Var = new vx90(strArr7, strArr8, bwgVar, vqbVar, i2, gzsVar2, str);
        d a3 = d.a.a(fragmentActivity);
        if (a3 != null) {
            vx90Var.invoke(a3);
            return false;
        }
        new Handler(Looper.getMainLooper()).post(new xj3(num, fragmentActivity, vx90Var, 4));
        return false;
    }

    public static /* synthetic */ void f(PermissionHelper permissionHelper, Context context, String[] strArr, int i2, int i3, gzs gzsVar, izs izsVar, int i4) {
        izs izsVar2;
        PermissionHelper permissionHelper2;
        Context context2;
        String[] strArr2;
        int i5;
        if ((i4 & 8) != 0) {
            i3 = 0;
        }
        int i6 = i3;
        gzs gzsVar2 = (i4 & 16) != 0 ? null : gzsVar;
        if ((i4 & 32) != 0) {
            izsVar2 = null;
            context2 = context;
            strArr2 = strArr;
            i5 = i2;
            permissionHelper2 = permissionHelper;
        } else {
            izsVar2 = izsVar;
            permissionHelper2 = permissionHelper;
            context2 = context;
            strArr2 = strArr;
            i5 = i2;
        }
        permissionHelper2.d(context2, strArr2, i5, i6, gzsVar2, izsVar2);
    }

    public static void g(PermissionHelper permissionHelper, Context context, String[] strArr, String[] strArr2, int i2, int i3, gzs gzsVar, izs izsVar, b290 b290Var, int i4) {
        boolean z2;
        int i5 = (i4 & 8) != 0 ? -1 : i2;
        int i6 = (i4 & 16) != 0 ? 0 : i3;
        FragmentActivity fragmentActivity = null;
        gzs gzsVar2 = (i4 & 32) != 0 ? null : gzsVar;
        izs izsVar2 = (i4 & 64) != 0 ? null : izsVar;
        b290 b290Var2 = (i4 & 128) != 0 ? null : b290Var;
        permissionHelper.getClass();
        if (context != null) {
            while (true) {
                z2 = context instanceof FragmentActivity;
                if (z2 || !(context instanceof ContextWrapper)) {
                    break;
                } else {
                    context = ((ContextWrapper) context).getBaseContext();
                }
            }
            fragmentActivity = (FragmentActivity) (z2 ? (Activity) context : null);
        }
        i(permissionHelper, fragmentActivity, strArr, strArr2, i5, i6, gzsVar2, izsVar2, b290Var2, 128);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x001b, code lost:
    
        if (r1 == null) goto L16;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean h(PermissionHelper permissionHelper, FragmentActivity fragmentActivity, String[] strArr, int i2, int i3, gzs gzsVar, izs izsVar, int i4) {
        String str = null;
        izs izsVar2 = (i4 & 32) != 0 ? null : izsVar;
        if (fragmentActivity != null) {
            permissionHelper.getClass();
            if (i2 != 0 && i2 != -1) {
                str = fragmentActivity.getResources().getString(i2);
            }
        } else {
            permissionHelper.getClass();
        }
        str = "";
        return j(permissionHelper, fragmentActivity, strArr, strArr, str, i3, gzsVar, izsVar2, 256);
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x001d, code lost:
    
        if (r1 == null) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean i(PermissionHelper permissionHelper, FragmentActivity fragmentActivity, String[] strArr, String[] strArr2, int i2, int i3, gzs gzsVar, izs izsVar, gzs gzsVar2, int i4) {
        String str = null;
        if ((i4 & 64) != 0) {
            izsVar = null;
        }
        if ((i4 & 256) != 0) {
            gzsVar2 = null;
        }
        if (fragmentActivity != null) {
            permissionHelper.getClass();
            if (i2 != 0 && i2 != -1) {
                str = fragmentActivity.getResources().getString(i2);
            }
        }
        str = "";
        permissionHelper.getClass();
        return e(fragmentActivity, strArr, strArr2, str, i3, gzsVar, izsVar, null, gzsVar2);
    }

    public static /* synthetic */ boolean j(PermissionHelper permissionHelper, FragmentActivity fragmentActivity, String[] strArr, String[] strArr2, String str, int i2, gzs gzsVar, izs izsVar, int i3) {
        if ((i3 & 16) != 0) {
            i2 = 0;
        }
        permissionHelper.getClass();
        return e(fragmentActivity, strArr, strArr2, str, i2, gzsVar, izsVar, null, null);
    }

    public static /* synthetic */ void l(PermissionHelper permissionHelper, Context context, String[] strArr, gzs gzsVar, izs izsVar, int i2) {
        if ((i2 & 8) != 0) {
            gzsVar = null;
        }
        permissionHelper.k(context, strArr, 0, gzsVar, (i2 & 16) != 0 ? null : izsVar);
    }

    public static Intent m(Context context) {
        return new Intent("android.settings.APPLICATION_DETAILS_SETTINGS").setData(Uri.fromParts("package", context.getPackageName(), null)).addFlags(67141632);
    }

    public static boolean n(Context context) {
        Iterable C = rl3.C(y);
        bpn0 bpn0Var = enj.a;
        if ((C instanceof Collection) && ((Collection) C).isEmpty()) {
            return true;
        }
        Iterator it = C.iterator();
        while (it.hasNext()) {
            if (!enj.l(context, (String) it.next())) {
                return false;
            }
        }
        return true;
    }

    public static final boolean o(Context context) {
        if (!gz80.a(34)) {
            return false;
        }
        a.getClass();
        return !c(context, c) && b(context, f);
    }

    public static PermissionResult p(Activity activity, String[] strArr) {
        if (b(activity, strArr)) {
            return PermissionResult.ALLOWED;
        }
        if (t(activity, strArr)) {
            for (String str : strArr) {
                if (!Preference.s("prefs_determine_name", str, "not_determined").equals("not_determined")) {
                    if (u(activity, rl3.u0(strArr))) {
                        return PermissionResult.DONT_ASK_AGAIN;
                    }
                }
            }
            return PermissionResult.NOT_DETERMINED;
        }
        return PermissionResult.NOT_ALLOWED;
    }

    public static boolean q(Context context) {
        return b(context, e) || o(context);
    }

    public static i0 r(String[] strArr) {
        rdj rdjVar = new rdj(new npe(strArr, 2), 1);
        f<gy90> fVar = A;
        fVar.getClass();
        return new i0(fVar, rdjVar);
    }

    @SuppressLint({"RestrictedApi"})
    public static c s(Fragment fragment, int i2, String[] strArr, String str, Integer num) {
        if (str.length() == 0) {
            if (gz80.a(23)) {
                fragment.requestPermissions(strArr, i2);
            }
            return null;
        }
        if (!tvo.a(fragment.requireContext(), (String[]) Arrays.copyOf(strArr, strArr.length))) {
            Resources resources = fragment.getResources();
            return c.a.a(fragment.getChildFragmentManager(), new b(str, resources.getString(R.string.vk_permissions_ok), resources.getString(R.string.vk_permissions_cancel), i2, strArr, num));
        }
        int[] iArr = new int[strArr.length];
        int length = strArr.length;
        for (int i3 = 0; i3 < length; i3++) {
            iArr[i3] = 0;
        }
        tvo.b(i2, strArr, iArr, fragment);
        w(strArr);
        return null;
    }

    public static boolean t(Context context, String[] strArr) {
        for (String str : strArr) {
            if (!tvo.a(context, str)) {
                return true;
            }
        }
        return false;
    }

    public static boolean u(Activity activity, List list) {
        LinkedList linkedList = new LinkedList();
        Iterator it = list.iterator();
        while (it.hasNext()) {
            String str = (String) it.next();
            if (!tvo.a(activity, str)) {
                linkedList.add(str);
            }
        }
        return wx90.b(activity).d(linkedList);
    }

    public static void v(PermissionHelper permissionHelper, Activity activity) {
        Intent m2;
        permissionHelper.getClass();
        if (gz80.a(26)) {
            m2 = new Intent("android.settings.APP_NOTIFICATION_SETTINGS");
            m2.putExtra("android.provider.extra.APP_PACKAGE", activity.getPackageName());
            m2.putExtra("app_package", activity.getPackageName());
            m2.putExtra("app_uid", activity.getApplicationInfo().uid);
            m2.addFlags(67141632);
        } else {
            m2 = m(activity);
        }
        activity.startActivityForResult(m2, 7534);
    }

    public static void w(String[] strArr) {
        for (String str : strArr) {
            Preference.H("prefs_determine_name", str, "determined");
        }
    }

    public final boolean d(Context context, String[] strArr, int i2, int i3, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar) {
        boolean z2;
        FragmentActivity fragmentActivity = null;
        if (context != null) {
            while (true) {
                z2 = context instanceof FragmentActivity;
                if (z2 || !(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            fragmentActivity = (FragmentActivity) (z2 ? (Activity) context : null);
        }
        return h(this, fragmentActivity, strArr, i2, i3, gzsVar, izsVar, 64);
    }

    public final boolean k(Context context, String[] strArr, int i2, gzs<s3q0> gzsVar, izs<? super List<String>, s3q0> izsVar) {
        boolean z2;
        FragmentActivity fragmentActivity = null;
        if (context != null) {
            while (true) {
                z2 = context instanceof FragmentActivity;
                if (z2 || !(context instanceof ContextWrapper)) {
                    break;
                }
                context = ((ContextWrapper) context).getBaseContext();
            }
            fragmentActivity = (FragmentActivity) (z2 ? (Activity) context : null);
        }
        return h(this, fragmentActivity, strArr, -1, i2, gzsVar, izsVar, 64);
    }
}
