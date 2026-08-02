package defpackage;

import android.app.ActivityManager;
import android.app.Application;
import android.app.LocaleManager;
import android.content.Context;
import android.content.Intent;
import android.content.pm.PackageInfo;
import android.content.pm.PackageManager;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.text.LineBreakConfig;
import android.media.AudioDeviceInfo;
import android.media.AudioManager;
import android.media.AudioProfile;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.os.Process;
import android.os.ext.SdkExtensions;
import android.provider.MediaStore;
import android.text.BoringLayout;
import android.text.StaticLayout;
import android.text.TextDirectionHeuristic;
import android.text.TextPaint;
import android.text.TextUtils;
import android.util.SparseArray;
import android.view.View;
import android.view.accessibility.AccessibilityNodeInfo;
import android.view.inputmethod.CursorAnchorInfo;
import android.view.inputmethod.InputMethodManager;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.common.util.ProcessUtils;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.results.R;
import java.io.Serializable;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class z9 {
    public static final void A(CursorAnchorInfo.Builder builder, oqf oqfVar) {
        builder.setEditorBoundsInfo(rz1.b().setEditorBounds(wba.N(oqfVar)).setHandwritingBounds(wba.N(oqfVar)).build());
    }

    public static final void B(StaticLayout.Builder builder, int i, int i2) {
        builder.setLineBreakConfig(new LineBreakConfig.Builder().setLineBreakStyle(i).setLineBreakWordStyle(i2).build());
    }

    public static void C(InputMethodManager inputMethodManager, View view) {
        inputMethodManager.startStylusHandwriting(view);
    }

    public static final void a(int i, int i2, vy8 vy8Var, tc3 tc3Var, tc3 tc3Var2, tc3 tc3Var3, of3 of3Var, int i3) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2069246850);
        int i4 = (av8Var.e(i) ? 4 : 2) | i3;
        if ((i3 & 48) == 0) {
            i4 |= av8Var.e(i2) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.g(vy8Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (74899 & i4) != 74898)) {
            lz.c(j72.x(h5a.O(c5n.t(nq8.F(nq8.A(vy8Var), 44.0f), new h1g(R.color.surface_1)), 16.0f, 2), ok3.H((Context) av8Var.k(bh3.b), "event_id", "open_details", i)), ho.e, yqo.H(-542515740, av8Var, new opg(i2, tc3Var2, tc3Var, tc3Var3)), av8Var, 384, 0);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new sw7(i, i2, vy8Var, tc3Var, tc3Var2, tc3Var3, i3);
        }
    }

    public static final void b(final boolean z, final boolean z2, final Bitmap bitmap, final Bitmap bitmap2, final boolean z3, final boolean z4, final Integer num, final jfj jfjVar, vy8 vy8Var, of3 of3Var, final int i) {
        Bitmap bitmap3;
        final vy8 vy8Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1208920700);
        int i2 = (av8Var.h(z) ? 4 : 2) | i | (av8Var.i(bitmap) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if ((i & 3072) == 0) {
            bitmap3 = bitmap2;
            i2 |= av8Var.i(bitmap3) ? a.o : 1024;
        } else {
            bitmap3 = bitmap2;
        }
        if ((i & 24576) == 0) {
            i2 |= av8Var.h(z3) ? 16384 : 8192;
        }
        int i3 = i2 | (av8Var.g(num) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288) | (av8Var.g(jfjVar) ? 8388608 : 4194304) | 100663296;
        if (av8Var.T(i3 & 1, (38347923 & i3) != 38347922)) {
            int i4 = z2 ? 0 : 2;
            vy8Var2 = ty8.a;
            rd0.b(nq8.y(vy8Var2), 1, i4, yqo.H(2103944818, av8Var, new cuh(z, jfjVar, bitmap, num, z4, z2, z3, bitmap3)), av8Var, 3072, 0);
        } else {
            av8Var.W();
            vy8Var2 = vy8Var;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: w7l
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    z9.b(z, z2, bitmap, bitmap2, z3, z4, num, jfjVar, vy8Var2, (of3) obj, aba.K(i | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void c(Bitmap bitmap, Integer num, boolean z, boolean z2, vy8 vy8Var, of3 of3Var, int i, int i2) {
        vy8 vy8Var2;
        int i3;
        vy8 vy8Var3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-529547060);
        int i4 = (av8Var.i(bitmap) ? 4 : 2) | i | (av8Var.g(num) ? 32 : 16);
        if ((i & 384) == 0) {
            i4 |= av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i5 = i4 | (av8Var.h(z2) ? a.o : 1024);
        int i6 = i2 & 16;
        if (i6 != 0) {
            i3 = i5 | 24576;
            vy8Var2 = vy8Var;
        } else {
            vy8Var2 = vy8Var;
            i3 = i5 | (av8Var.g(vy8Var2) ? 16384 : 8192);
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            vy8 vy8Var4 = i6 != 0 ? ty8.a : vy8Var2;
            boolean u = u((Context) av8Var.k(bh3.b));
            Pair pair = z2 ? new Pair(ho.h, Integer.valueOf(R.color.red_fighter_default)) : new Pair(ho.g, Integer.valueOf(R.color.blue_fighter_default));
            ho hoVar = (ho) pair.a;
            int intValue = ((Number) pair.b).intValue();
            dt9 bx1Var = bitmap != null ? new bx1(bitmap) : num != null ? new v20(num.intValue()) : new v20(android.R.color.transparent);
            int i7 = R.drawable.ic_corner;
            if ((!z2 || u) && ((z2 && u) || (!z2 && !u))) {
                i7 = R.drawable.ic_corner_flipped;
            }
            lz.c(vy8Var4, hoVar, yqo.H(-178424406, av8Var, new ms9(bx1Var, i7, z, intValue)), av8Var, ((i3 >> 12) & 14) | 384, 0);
            vy8Var3 = vy8Var4;
        } else {
            av8Var.W();
            vy8Var3 = vy8Var2;
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new e82(bitmap, num, z, z2, vy8Var3, i, i2, 9);
        }
    }

    public static v09 d(Bundle bundle) {
        bundle.getClass();
        try {
            String string = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID");
            String string2 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_ID_TOKEN");
            String string3 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_DISPLAY_NAME");
            String string4 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_FAMILY_NAME");
            String string5 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_GIVEN_NAME");
            Uri uri = Build.VERSION.SDK_INT >= 33 ? (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI", Uri.class) : (Uri) bundle.getParcelable("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PROFILE_PICTURE_URI");
            String string6 = bundle.getString("com.google.android.libraries.identity.googleid.BUNDLE_KEY_PHONE_NUMBER");
            string.getClass();
            string2.getClass();
            return new v09(string, string2, string3, string4, string5, uri, string6);
        } catch (Exception e) {
            throw new wo0(e);
        }
    }

    public static ArrayList e(Context context) {
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
            String str2 = runningAppProcessInfo.processName;
            str2.getClass();
            arrayList2.add(new y7f(runningAppProcessInfo.pid, runningAppProcessInfo.importance, str2, Intrinsics.c(runningAppProcessInfo.processName, str)));
        }
        return arrayList2;
    }

    public static jn0 f(AudioManager audioManager, an0 an0Var, hv9 hv9Var, List list) {
        List<AudioProfile> directProfilesForAttributes = audioManager.getDirectProfilesForAttributes(an0Var.a());
        HashMap hashMap = new HashMap();
        hashMap.put(2, new HashSet(jaa.r(12)));
        for (int i = 0; i < directProfilesForAttributes.size(); i++) {
            AudioProfile audioProfile = directProfilesForAttributes.get(i);
            if (audioProfile.getEncapsulationType() != 1) {
                int format = audioProfile.getFormat();
                if (nik.P(format) || jn0.h.containsKey(Integer.valueOf(format))) {
                    if (hashMap.containsKey(Integer.valueOf(format))) {
                        Set set = (Set) hashMap.get(Integer.valueOf(format));
                        set.getClass();
                        set.addAll(jaa.r(audioProfile.getChannelMasks()));
                    } else {
                        hashMap.put(Integer.valueOf(format), new HashSet(jaa.r(audioProfile.getChannelMasks())));
                    }
                }
            }
        }
        zu9 s = hv9.s();
        for (Map.Entry entry : hashMap.entrySet()) {
            s.c(new hn0(((Integer) entry.getKey()).intValue(), (Set) entry.getValue()));
        }
        return new jn0(s.g(), hv9Var, list);
    }

    public static AudioDeviceInfo g(AudioManager audioManager, an0 an0Var) {
        audioManager.getClass();
        List<AudioDeviceInfo> audioDevicesForAttributes = audioManager.getAudioDevicesForAttributes(an0Var.a());
        if (audioDevicesForAttributes.isEmpty()) {
            return null;
        }
        return audioDevicesForAttributes.get(0);
    }

    public static int h() {
        int i = Build.VERSION.SDK_INT;
        if (i < 33 && (i < 30 || SdkExtensions.getExtensionVersion(30) < 2)) {
            return Integer.MAX_VALUE;
        }
        return MediaStore.getPickImagesMaxLimit();
    }

    public static y7f i(Context context) {
        Object obj;
        String a;
        context.getClass();
        int myPid = Process.myPid();
        Iterator it = e(context).iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((y7f) obj).b == myPid) {
                break;
            }
        }
        y7f y7fVar = (y7f) obj;
        if (y7fVar != null) {
            return y7fVar;
        }
        int i = Build.VERSION.SDK_INT;
        if (i > 33) {
            a = Process.myProcessName();
            a.getClass();
        } else if ((i < 28 || (a = Application.getProcessName()) == null) && (a = ProcessUtils.a()) == null) {
            a = "";
        }
        return new y7f(myPid, 0, a, false);
    }

    public static PackageInfo j(PackageManager packageManager, Context context) {
        return packageManager.getPackageInfo(context.getPackageName(), PackageManager.PackageInfoFlags.of(0L));
    }

    public static Object k(Bundle bundle, String str, Class cls) {
        return bundle.getParcelable(str, cls);
    }

    public static Object[] l(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArray(str, cls);
    }

    public static ArrayList m(Bundle bundle, String str, Class cls) {
        return bundle.getParcelableArrayList(str, cls);
    }

    public static Serializable n(Bundle bundle, String str, Class cls) {
        return bundle.getSerializable(str, cls);
    }

    public static Serializable o(Intent intent, String str, Class cls) {
        return intent.getSerializableExtra(str, cls);
    }

    public static SparseArray p(Bundle bundle, String str, Class cls) {
        return bundle.getSparseParcelableArray(str, cls);
    }

    public static String q(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.getUniqueId();
    }

    public static final BoringLayout.Metrics r(CharSequence charSequence, TextPaint textPaint, TextDirectionHeuristic textDirectionHeuristic) {
        return BoringLayout.isBoring(charSequence, textPaint, textDirectionHeuristic, true, null);
    }

    public static final boolean s(BoringLayout boringLayout) {
        return boringLayout.isFallbackLineSpacingEnabled();
    }

    public static final boolean t(StaticLayout staticLayout) {
        return staticLayout.isFallbackLineSpacingEnabled();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r0v2, types: [u2g] */
    public static final boolean u(Context context) {
        Locale u2gVar;
        LocaleList systemLocales;
        context.getClass();
        if (Build.VERSION.SDK_INT >= 33) {
            try {
                p2g p2gVar = w2g.b;
                LocaleManager b = hbo.b(context.getSystemService(hbo.d()));
                u2gVar = (b == null || (systemLocales = b.getSystemLocales()) == null) ? null : systemLocales.get(0);
            } catch (Throwable th) {
                p2g p2gVar2 = w2g.b;
                u2gVar = new u2g(th);
            }
            r2 = u2gVar instanceof u2g ? null : u2gVar;
        }
        if (r2 == null) {
            r2 = Resources.getSystem().getConfiguration().getLocales().get(0);
        }
        return TextUtils.getLayoutDirectionFromLocale(r2) == 1;
    }

    public static boolean v(AccessibilityNodeInfo accessibilityNodeInfo) {
        return accessibilityNodeInfo.isTextSelectable();
    }

    public static LocaleList w(Object obj) {
        return ((LocaleManager) obj).getSystemLocales();
    }

    public static final void x(b2f b2fVar, Object obj) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (!(obj instanceof OnBackInvokedCallback) || (findOnBackInvokedDispatcher = b2fVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.registerOnBackInvokedCallback(1000000, (OnBackInvokedCallback) obj);
    }

    public static final void y(b2f b2fVar, h90 h90Var) {
        OnBackInvokedDispatcher findOnBackInvokedDispatcher;
        if (h90Var == null || (findOnBackInvokedDispatcher = b2fVar.findOnBackInvokedDispatcher()) == null) {
            return;
        }
        findOnBackInvokedDispatcher.unregisterOnBackInvokedCallback(h90Var);
    }

    public static final void z(CursorAnchorInfo.Builder builder, oqf oqfVar) {
        builder.setEditorBoundsInfo(rz1.b().setEditorBounds(wba.N(oqfVar)).setHandwritingBounds(wba.N(oqfVar)).build());
    }
}
