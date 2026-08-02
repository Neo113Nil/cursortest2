package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.SharedPreferences;
import android.content.pm.ApplicationInfo;
import android.content.pm.PackageManager;
import android.graphics.Bitmap;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Log;
import android.view.View;
import android.widget.ImageView;
import androidx.appcompat.app.AppCompatActivity;
import androidx.compose.runtime.e;
import androidx.core.app.NotificationCompat;
import com.google.android.gms.tasks.Tasks;
import com.google.firebase.messaging.FirebaseMessaging;
import com.google.firebase.messaging.FirebaseMessagingService;
import com.ironsource.U3;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.sofascore.model.Sports;
import com.sofascore.model.mvvm.model.Gender;
import com.sofascore.model.mvvm.model.Player;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.FootballShotmapItem;
import com.sofascore.model.newNetwork.WSCStory;
import com.sofascore.model.newNetwork.WSCThumbnailAspectRatio;
import com.sofascore.results.R;
import com.sofascore.results.notifications.ui.NotificationGroupSettingsBottomSheet;
import com.unity3d.services.UnityAdsConstants;
import java.io.BufferedInputStream;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.WeakHashMap;
import java.util.concurrent.ExecutionException;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import kotlin.text.StringsKt__StringsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public abstract class qea {
    public static final /* synthetic */ int a = 0;
    public static final /* synthetic */ int b = 0;
    public static final /* synthetic */ int c = 0;
    public static final /* synthetic */ int d = 0;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;

    /* JADX WARN: Can't wrap try/catch for region: R(42:24|(1:26)|27|(1:29)(40:124|(2:127|128)|126|31|(5:113|114|115|116|117)|33|34|(1:36)(1:112)|37|38|(29:40|(1:105)|42|(1:44)(1:(1:104))|45|46|(1:48)|49|(1:51)(1:102)|52|(1:101)|(1:57)(1:100)|58|(1:60)(1:99)|61|(1:63)(1:98)|64|(1:66)(1:97)|67|(5:93|94|76|(1:78)(1:80)|79)|69|(5:89|90|76|(0)(0)|79)|71|72|(1:74)(6:82|(2:85|(1:87))|84|76|(0)(0)|79)|75|76|(0)(0)|79)|106|(1:108)(3:109|(1:111)|42)|(0)(0)|45|46|(0)|49|(0)(0)|52|(1:54)|101|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)|69|(0)|71|72|(0)(0)|75|76|(0)(0)|79)|30|31|(0)|33|34|(0)(0)|37|38|(0)|106|(0)(0)|(0)(0)|45|46|(0)|49|(0)(0)|52|(0)|101|(0)(0)|58|(0)(0)|61|(0)(0)|64|(0)(0)|67|(0)|69|(0)|71|72|(0)(0)|75|76|(0)(0)|79) */
    /* JADX WARN: Removed duplicated region for block: B:100:0x010c  */
    /* JADX WARN: Removed duplicated region for block: B:102:0x00f4  */
    /* JADX WARN: Removed duplicated region for block: B:103:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x00cc  */
    /* JADX WARN: Removed duplicated region for block: B:112:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:113:0x006f A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:36:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00ac  */
    /* JADX WARN: Removed duplicated region for block: B:44:0x00d8  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x00e8  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x00f2  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x00fd  */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0109  */
    /* JADX WARN: Removed duplicated region for block: B:60:0x0116  */
    /* JADX WARN: Removed duplicated region for block: B:63:0x0121  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x012e  */
    /* JADX WARN: Removed duplicated region for block: B:74:0x0165 A[Catch: NumberFormatException -> 0x0173, TRY_ENTER, TRY_LEAVE, TryCatch #5 {NumberFormatException -> 0x0173, blocks: (B:74:0x0165, B:87:0x017f), top: B:72:0x0163 }] */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0187  */
    /* JADX WARN: Removed duplicated region for block: B:80:0x0189  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x016a  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0153 A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:93:0x013d A[EXC_TOP_SPLITTER, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:97:0x0131  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0124  */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0118  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void A(Intent intent) {
        wxj wxjVar;
        int parseInt;
        int i;
        String string;
        String string2;
        char c2;
        String string3;
        String string4;
        long parseLong;
        eic eicVar;
        String str;
        String str2;
        if (G(intent)) {
            B(intent.getExtras(), "_nr");
        }
        int i2 = 0;
        if (!((intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction())) ? false : q()) || (wxjVar = (wxj) FirebaseMessaging.m.get()) == null) {
            return;
        }
        if (intent == null) {
            eicVar = null;
        } else {
            Bundle extras = intent.getExtras();
            if (extras == null) {
                extras = Bundle.EMPTY;
            }
            Object obj = extras.get("google.ttl");
            if (obj instanceof Integer) {
                parseInt = ((Integer) obj).intValue();
            } else {
                if (obj instanceof String) {
                    try {
                        parseInt = Integer.parseInt((String) obj);
                    } catch (NumberFormatException unused) {
                    }
                }
                i = 0;
                string = extras.getString("google.to");
                if (TextUtils.isEmpty(string)) {
                    try {
                        r38 c3 = r38.c();
                        try {
                            Object obj2 = k48.l;
                            string = (String) Tasks.await(((k48) c3.b(l48.class)).c());
                        } catch (InterruptedException e2) {
                            e = e2;
                            is8.h(e);
                            return;
                        }
                    } catch (InterruptedException | ExecutionException e3) {
                        e = e3;
                    }
                }
                String str3 = string;
                r38 c4 = r38.c();
                c4.a();
                String packageName = c4.a.getPackageName();
                cic cicVar = !bka.u(extras) ? cic.DISPLAY_NOTIFICATION : cic.DATA_MESSAGE;
                string2 = extras.getString("google.delivered_priority");
                if (string2 == null) {
                    if (!"1".equals(extras.getString("google.priority_reduced"))) {
                        string2 = extras.getString("google.priority");
                    }
                    c2 = 2;
                    if (c2 == 2) {
                        i2 = 5;
                    } else if (c2 == 1) {
                        i2 = 10;
                    }
                    int i3 = i2;
                    string3 = extras.getString("google.message_id");
                    if (string3 == null) {
                        string3 = extras.getString("message_id");
                    }
                    String str4 = string3 != null ? string3 : "";
                    string4 = extras.getString("from");
                    if (string4 != null || !string4.startsWith("/topics/")) {
                        string4 = null;
                    }
                    String str5 = string4 != null ? string4 : "";
                    String string5 = extras.getString("collapse_key");
                    String str6 = string5 != null ? string5 : "";
                    String string6 = extras.getString("google.c.a.m_l");
                    String str7 = string6 != null ? string6 : "";
                    String string7 = extras.getString("google.c.a.c_l");
                    String str8 = string7 != null ? string7 : "";
                    if (extras.containsKey("google.c.sender.id")) {
                        try {
                            parseLong = Long.parseLong(extras.getString("google.c.sender.id"));
                        } catch (NumberFormatException unused2) {
                        }
                        eicVar = new eic(parseLong <= 0 ? parseLong : 0L, str4, str3, cicVar, packageName, str6, i3, i, str5, str7, str8);
                    }
                    r38 c5 = r38.c();
                    s48 s48Var = c5.c;
                    c5.a();
                    str = s48Var.e;
                    if (str != null) {
                        try {
                            parseLong = Long.parseLong(str);
                        } catch (NumberFormatException unused3) {
                        }
                        eicVar = new eic(parseLong <= 0 ? parseLong : 0L, str4, str3, cicVar, packageName, str6, i3, i, str5, str7, str8);
                    }
                    c5.a();
                    str2 = s48Var.b;
                    if (str2.startsWith("1:")) {
                        String[] split = str2.split(":");
                        if (split.length >= 2) {
                            String str9 = split[1];
                            if (!str9.isEmpty()) {
                                parseLong = Long.parseLong(str9);
                            }
                        }
                        parseLong = 0;
                        eicVar = new eic(parseLong <= 0 ? parseLong : 0L, str4, str3, cicVar, packageName, str6, i3, i, str5, str7, str8);
                    } else {
                        parseLong = Long.parseLong(str2);
                    }
                    eicVar = new eic(parseLong <= 0 ? parseLong : 0L, str4, str3, cicVar, packageName, str6, i3, i, str5, str7, str8);
                }
                if (FootballShotmapItem.GOAL_HIGH.equals(string2)) {
                    if (!"normal".equals(string2)) {
                        c2 = 0;
                    }
                    c2 = 2;
                } else {
                    c2 = 1;
                }
                if (c2 == 2) {
                }
                int i32 = i2;
                string3 = extras.getString("google.message_id");
                if (string3 == null) {
                }
                if (string3 != null) {
                }
                string4 = extras.getString("from");
                if (string4 != null) {
                }
                string4 = null;
                if (string4 != null) {
                }
                String string52 = extras.getString("collapse_key");
                if (string52 != null) {
                }
                String string62 = extras.getString("google.c.a.m_l");
                if (string62 != null) {
                }
                String string72 = extras.getString("google.c.a.c_l");
                if (string72 != null) {
                }
                if (extras.containsKey("google.c.sender.id")) {
                }
                r38 c52 = r38.c();
                s48 s48Var2 = c52.c;
                c52.a();
                str = s48Var2.e;
                if (str != null) {
                }
                c52.a();
                str2 = s48Var2.b;
                if (str2.startsWith("1:")) {
                }
                eicVar = new eic(parseLong <= 0 ? parseLong : 0L, str4, str3, cicVar, packageName, str6, i32, i, str5, str7, str8);
            }
            i = parseInt;
            string = extras.getString("google.to");
            if (TextUtils.isEmpty(string)) {
            }
            String str32 = string;
            r38 c42 = r38.c();
            c42.a();
            String packageName2 = c42.a.getPackageName();
            cic cicVar2 = !bka.u(extras) ? cic.DISPLAY_NOTIFICATION : cic.DATA_MESSAGE;
            string2 = extras.getString("google.delivered_priority");
            if (string2 == null) {
            }
            if (FootballShotmapItem.GOAL_HIGH.equals(string2)) {
            }
            if (c2 == 2) {
            }
            int i322 = i2;
            string3 = extras.getString("google.message_id");
            if (string3 == null) {
            }
            if (string3 != null) {
            }
            string4 = extras.getString("from");
            if (string4 != null) {
            }
            string4 = null;
            if (string4 != null) {
            }
            String string522 = extras.getString("collapse_key");
            if (string522 != null) {
            }
            String string622 = extras.getString("google.c.a.m_l");
            if (string622 != null) {
            }
            String string722 = extras.getString("google.c.a.c_l");
            if (string722 != null) {
            }
            if (extras.containsKey("google.c.sender.id")) {
            }
            r38 c522 = r38.c();
            s48 s48Var22 = c522.c;
            c522.a();
            str = s48Var22.e;
            if (str != null) {
            }
            c522.a();
            str2 = s48Var22.b;
            if (str2.startsWith("1:")) {
            }
            eicVar = new eic(parseLong <= 0 ? parseLong : 0L, str4, str32, cicVar2, packageName2, str6, i322, i, str5, str7, str8);
        }
        if (eicVar == null) {
            return;
        }
        try {
            ((xxj) wxjVar).a("FCM_CLIENT_EVENT_LOGGING", new kn5("proto"), new i3c(11)).x(new cu0(null, new fic(eicVar), i7f.a, new vu0(Integer.valueOf(intent.getIntExtra("google.product_id", 111881503)))), new ogj(15));
        } catch (RuntimeException unused4) {
        }
    }

    public static void B(Bundle bundle, String str) {
        try {
            r38.c();
            if (bundle == null) {
                bundle = new Bundle();
            }
            Bundle bundle2 = new Bundle();
            String string = bundle.getString("google.c.a.c_id");
            if (string != null) {
                bundle2.putString("_nmid", string);
            }
            String string2 = bundle.getString("google.c.a.c_l");
            if (string2 != null) {
                bundle2.putString("_nmn", string2);
            }
            String string3 = bundle.getString("google.c.a.m_l");
            if (!TextUtils.isEmpty(string3)) {
                bundle2.putString("label", string3);
            }
            String string4 = bundle.getString("google.c.a.m_c");
            if (!TextUtils.isEmpty(string4)) {
                bundle2.putString("message_channel", string4);
            }
            String string5 = bundle.getString("from");
            if (string5 == null || !string5.startsWith("/topics/")) {
                string5 = null;
            }
            if (string5 != null) {
                bundle2.putString("_nt", string5);
            }
            String string6 = bundle.getString("google.c.a.ts");
            if (string6 != null) {
                try {
                    bundle2.putInt("_nmt", Integer.parseInt(string6));
                } catch (NumberFormatException unused) {
                }
            }
            String string7 = bundle.containsKey("google.c.a.udt") ? bundle.getString("google.c.a.udt") : null;
            if (string7 != null) {
                try {
                    bundle2.putInt("_ndt", Integer.parseInt(string7));
                } catch (NumberFormatException unused2) {
                }
            }
            String str2 = bka.u(bundle) ? U3.i.d : "data";
            if ("_nr".equals(str) || "_nf".equals(str)) {
                bundle2.putString("_nmc", str2);
            }
            if (Log.isLoggable("FirebaseMessaging", 3)) {
                bundle2.toString();
            }
            iu iuVar = (iu) r38.c().b(iu.class);
            if (iuVar != null) {
                iuVar.b("fcm", str, bundle2);
            }
        } catch (IllegalStateException unused3) {
        }
    }

    public static void C(Context context, String str, String str2, String str3) {
        str.getClass();
        str2.getClass();
        NotificationGroupSettingsBottomSheet notificationGroupSettingsBottomSheet = new NotificationGroupSettingsBottomSheet();
        notificationGroupSettingsBottomSheet.setArguments(fz8.C(fz8.H("GROUP_EXTRA", str), fz8.H("TITLE_EXTRA", str2), fz8.H("PRESELECTED_SETTING_EXTRA", str3)));
        Unit unit = Unit.a;
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        rq3 rq3Var = null;
        AppCompatActivity appCompatActivity = context instanceof AppCompatActivity ? (AppCompatActivity) context : null;
        if (appCompatActivity != null) {
            wca.x(appCompatActivity.getLifecycle()).b(new r1(notificationGroupSettingsBottomSheet, appCompatActivity, rq3Var, 3));
        }
    }

    public static String D(File file) {
        int i;
        if (!file.isFile()) {
            return "";
        }
        byte[] bArr = new byte[1024];
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            BufferedInputStream bufferedInputStream = new BufferedInputStream(new FileInputStream(file));
            while (true) {
                int read = bufferedInputStream.read(bArr, 0, 1024);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            if (!TextUtils.isEmpty(null)) {
                throw null;
            }
            bufferedInputStream.close();
            byte[] digest = messageDigest.digest();
            if (digest == null || digest.length <= 0) {
                return "";
            }
            char[] cArr = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'a', 'b', 'c', 'd', 'e', 'f'};
            char[] cArr2 = new char[digest.length * 2];
            int i2 = 0;
            for (byte b2 : digest) {
                int i3 = i2 + 1;
                cArr2[i2] = cArr[(b2 >>> 4) & 15];
                i2 += 2;
                cArr2[i3] = cArr[b2 & 15];
            }
            return new String(cArr2);
        } catch (Exception unused) {
            return "";
        }
    }

    public static final long E(mze mzeVar, boolean z) {
        long h = dnd.h(mzeVar.c, mzeVar.g);
        if (z || !mzeVar.b()) {
            return h;
        }
        return 0L;
    }

    public static final e1d F(of3 of3Var, Object obj, Function2 function2) {
        av8 av8Var = (av8) of3Var;
        Object O = av8Var.O();
        a99 a99Var = nf3.a;
        if (O == a99Var) {
            O = e.f(obj);
            av8Var.n0(O);
        }
        e1d e1dVar = (e1d) O;
        Unit unit = Unit.a;
        boolean i = av8Var.i(function2);
        Object O2 = av8Var.O();
        if (i || O2 == a99Var) {
            O2 = new hoh(function2, e1dVar, null, 0);
            av8Var.n0(O2);
        }
        hz8.o(av8Var, unit, (Function2) O2);
        return e1dVar;
    }

    public static boolean G(Intent intent) {
        Bundle extras;
        if (intent == null || FirebaseMessagingService.ACTION_DIRECT_BOOT_REMOTE_INTENT.equals(intent.getAction()) || (extras = intent.getExtras()) == null) {
            return false;
        }
        return "1".equals(extras.getString("google.c.a.e"));
    }

    public static final long H(oqf oqfVar) {
        float f2 = oqfVar.c - oqfVar.a;
        float f3 = oqfVar.d - oqfVar.b;
        return (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32);
    }

    public static en0 I(Object obj) {
        return new en0(obj.getClass().getSimpleName());
    }

    public static kkk J(int i, String str) {
        return new kkk(new e5a(0, 0, 0, 0), str);
    }

    public static final String K(String str, boolean z) {
        return (!z || str == null || str.length() == 0) ? str : dmi.q("@ ", str);
    }

    public static String L(View view) {
        if (!view.isAttachedToWindow()) {
            return "notAttached";
        }
        int visibility = view.getVisibility();
        if (visibility == 8) {
            return "viewGone";
        }
        if (visibility == 4) {
            return "viewInvisible";
        }
        if (visibility != 0) {
            return "viewNotVisible";
        }
        if (view.getAlpha() == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) {
            return "viewAlphaZero";
        }
        return null;
    }

    public static int M(c4p c4pVar) {
        Iterator it = c4pVar.iterator();
        int i = 0;
        while (it.hasNext()) {
            Object next = it.next();
            i += next != null ? next.hashCode() : 0;
        }
        return i;
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v1 */
    /* JADX WARN: Type inference failed for: r1v2, types: [boolean, int] */
    /* JADX WARN: Type inference failed for: r1v3 */
    public static final void a(a3a a3aVar, of3 of3Var, int i) {
        av8 av8Var;
        float f2;
        utc utcVar;
        ?? r1;
        av8 av8Var2;
        utc utcVar2;
        av8 av8Var3;
        utc utcVar3;
        av8 av8Var4;
        boolean z;
        av8 av8Var5;
        a3aVar.getClass();
        av8 av8Var6 = (av8) of3Var;
        av8Var6.f0(-996317158);
        int i2 = i | (av8Var6.i(a3aVar) ? 4 : 2);
        if (av8Var6.T(i2 & 1, (i2 & 3) != 2)) {
            utc utcVar4 = utc.a;
            xtc b0 = l98.b0(utcVar4, 16.0f);
            u23 a2 = t23.a(new ng0(8.0f, true, new a70(6)), uxf.o, av8Var6, 6);
            int hashCode = Long.hashCode(av8Var6.T);
            aee m = av8Var6.m();
            xtc C = fqj.C(av8Var6, b0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var6.h0();
            if (av8Var6.S) {
                av8Var6.l(zg3Var);
            } else {
                av8Var6.q0();
            }
            waa.K(av8Var6, a2, hf3.g);
            waa.K(av8Var6, m, hf3.f);
            waa.K(av8Var6, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var6, hf3.k);
            waa.K(av8Var6, C, hf3.d);
            Integer num = a3aVar.a;
            if (num == null) {
                av8Var6.d0(856685990);
                av8Var6.s(false);
                utcVar = utcVar4;
                r1 = 0;
                f2 = 8.0f;
                av8Var2 = av8Var6;
            } else {
                av8Var6.d0(856685991);
                int intValue = num.intValue();
                xtc d2 = bkh.d(utcVar4, 1.0f);
                String v = oea.v(intValue, av8Var6);
                yf8 yf8Var = xth.a;
                f2 = 8.0f;
                utcVar = utcVar4;
                r1 = 0;
                udj.c(v, d2, lz.D(R.color.n_lv_1, av8Var6), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var6, 48, 0, 131064);
                av8 av8Var7 = av8Var6;
                Unit unit = Unit.a;
                av8Var7.s(false);
                av8Var2 = av8Var7;
            }
            Integer num2 = a3aVar.b;
            if (num2 == null) {
                av8Var2.d0(856952032);
                av8Var2.s(r1);
                utcVar2 = utcVar;
                av8Var3 = av8Var2;
            } else {
                av8Var2.d0(856952033);
                int intValue2 = num2.intValue();
                utc utcVar5 = utcVar;
                xtc d3 = bkh.d(utcVar5, 1.0f);
                String v2 = oea.v(intValue2, av8Var2);
                yf8 yf8Var2 = xth.a;
                of3 of3Var2 = av8Var2;
                utcVar2 = utcVar5;
                udj.c(v2, d3, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), of3Var2, 48, 0, 131064);
                av8 av8Var8 = of3Var2;
                Unit unit2 = Unit.a;
                av8Var8.s(r1);
                av8Var3 = av8Var8;
            }
            Integer num3 = a3aVar.c;
            if (num3 == null) {
                av8Var3.d0(857223840);
                av8Var3.s(r1);
                utcVar3 = utcVar2;
                av8Var4 = av8Var3;
            } else {
                av8Var3.d0(857223841);
                int intValue3 = num3.intValue();
                utc utcVar6 = utcVar2;
                xtc d4 = bkh.d(utcVar6, 1.0f);
                String v3 = oea.v(intValue3, av8Var3);
                yf8 yf8Var3 = xth.a;
                of3 of3Var3 = av8Var3;
                utcVar3 = utcVar6;
                udj.c(v3, d4, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), of3Var3, 48, 0, 131064);
                av8 av8Var9 = of3Var3;
                Unit unit3 = Unit.a;
                av8Var9.s(r1);
                av8Var4 = av8Var9;
            }
            List list = a3aVar.d;
            if (list == null) {
                av8Var4.d0(857509660);
                av8Var4.s(r1);
                z = true;
                av8Var5 = av8Var4;
            } else {
                av8Var4.d0(857509661);
                av8Var4.d0(-942168586);
                Iterator it = CollectionsKt.W(list).iterator();
                int i3 = r1;
                av8 av8Var10 = av8Var4;
                while (it.hasNext()) {
                    Object next = it.next();
                    int i4 = i3 + 1;
                    if (i3 < 0) {
                        b.q();
                        throw null;
                    }
                    int intValue4 = ((Number) next).intValue();
                    xtc f0 = l98.f0(utcVar3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i3 == 0 ? 4.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
                    l8g a3 = k8g.a(ww9.b, uxf.l, av8Var10, r1);
                    int hashCode2 = Long.hashCode(av8Var10.T);
                    aee m2 = av8Var10.m();
                    xtc C2 = fqj.C(av8Var10, f0);
                    if3.k7.getClass();
                    zg3 zg3Var2 = hf3.b;
                    av8Var10.h0();
                    if (av8Var10.S) {
                        av8Var10.l(zg3Var2);
                    } else {
                        av8Var10.q0();
                    }
                    waa.K(av8Var10, a3, hf3.g);
                    waa.K(av8Var10, m2, hf3.f);
                    waa.K(av8Var10, Integer.valueOf(hashCode2), hf3.j);
                    waa.J(av8Var10, hf3.k);
                    waa.K(av8Var10, C2, hf3.d);
                    utc utcVar7 = utcVar3;
                    e12.a(r1, av8Var10, bkh.l(n9e.q(l98.f0(utcVar7, f2, 6.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), lz.D(R.color.n_lv_1, av8Var10), o7g.a), 4.0f));
                    xtc f02 = l98.f0(bkh.d(utcVar7, 1.0f), f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
                    String v4 = oea.v(intValue4, av8Var10);
                    yf8 yf8Var4 = xth.a;
                    utcVar3 = utcVar7;
                    av8 av8Var11 = av8Var10;
                    udj.c(v4, f02, lz.D(R.color.n_lv_1, av8Var10), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var11, 48, 0, 131064);
                    av8 av8Var12 = av8Var11;
                    av8Var12.s(true);
                    i3 = i4;
                    av8Var10 = av8Var12;
                }
                z = true;
                av8Var10.s(r1);
                Unit unit4 = Unit.a;
                av8Var10.s(r1);
                av8Var5 = av8Var10;
            }
            av8Var5.s(z);
            av8Var = av8Var5;
        } else {
            av8Var6.W();
            av8Var = av8Var6;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(a3aVar, i, 3);
        }
    }

    public static final void b(int i, int i2, of3 of3Var, String str) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-225539928);
        int i3 = i2 | (av8Var.g(str) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 17) != 16)) {
            av8Var.Y();
            if ((i2 & 1) != 0 && !av8Var.B()) {
                av8Var.W();
            }
            av8Var.t();
            utc utcVar = utc.a;
            xtc q = n9e.q(l98.d0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), lz.D(R.color.surface_P, av8Var), oyn.e);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, q);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            e12.a(0, av8Var, bkh.l(n9e.q(l98.f0(utcVar, 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), lz.D(R.color.primary_default, av8Var), o7g.a), 8.0f));
            xtc f0 = l98.f0(new goa(1.0f, true), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            long D = lz.D(R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(str, f0, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, (i3 >> 3) & 14, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new k93(i, str, i2);
        }
    }

    public static final void c(int i, int i2, of3 of3Var, xtc xtcVar) {
        xtc xtcVar2;
        int i3;
        xtc xtcVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-255705387);
        int i4 = i2 & 1;
        if (i4 != 0) {
            i3 = i | 6;
            xtcVar2 = xtcVar;
        } else if ((i & 6) == 0) {
            xtcVar2 = xtcVar;
            i3 = (av8Var.g(xtcVar2) ? 4 : 2) | i;
        } else {
            xtcVar2 = xtcVar;
            i3 = i;
        }
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            xtc xtcVar4 = i4 != 0 ? utc.a : xtcVar2;
            xtc d0 = l98.d0(n9e.q(xtcVar4, lz.D(R.color.surface_P, av8Var), o7g.a(6.0f)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            b(1, 6, av8Var, oea.v(R.string.weekly_challenge_instruction_1, av8Var));
            b(2, 6, av8Var, oea.v(R.string.weekly_challenge_instruction_2, av8Var));
            b(3, 6, av8Var, oea.v(R.string.weekly_challenge_instruction_3, av8Var));
            b(4, 6, av8Var, oea.v(R.string.weekly_challenge_instruction_4, av8Var));
            av8Var.s(true);
            xtcVar3 = xtcVar4;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hn1(xtcVar3, i, i2, 7, (byte) 0);
        }
    }

    public static final void d(dta dtaVar, of3 of3Var, int i) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2065105598);
        int i2 = 2;
        int i3 = (av8Var.i(dtaVar) ? 4 : 2) | i;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            boolean i4 = av8Var.i(dtaVar);
            Object O = av8Var.O();
            if (i4 || O == nf3.a) {
                O = new ida(dtaVar, 11);
                av8Var.n0(O);
            }
            v8a.a(null, null, null, null, null, null, false, null, (Function1) O, av8Var, 0, 511);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new faa(dtaVar, i, i2);
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:30:0x0084, code lost:
    
        if ((r42 & 8) != 0) goto L44;
     */
    /* JADX WARN: Removed duplicated region for block: B:17:0x004e  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x0071  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0175  */
    /* JADX WARN: Removed duplicated region for block: B:52:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:69:0x0169  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0068  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x0059  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(String str, String str2, xtc xtcVar, long j, of3 of3Var, int i, int i2) {
        xtc xtcVar2;
        long j2;
        int i3;
        int i4;
        av8 av8Var;
        eqf u;
        List split$default;
        str.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(947169680);
        int i5 = (av8Var2.g(str) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i5 |= av8Var2.g(str2) ? 32 : 16;
        }
        int i6 = i2 & 4;
        if (i6 != 0) {
            i5 |= 384;
        } else if ((i & 384) == 0) {
            xtcVar2 = xtcVar;
            i5 |= av8Var2.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
            if ((i2 & 8) != 0) {
                j2 = j;
                if (av8Var2.f(j2)) {
                    i3 = a.o;
                    i4 = i5 | i3;
                    if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
                        av8Var2.Y();
                        if ((i & 1) == 0 || av8Var2.B()) {
                            if (i6 != 0) {
                                xtcVar2 = utc.a;
                            }
                            if ((i2 & 8) != 0) {
                                j2 = lz.D(R.color.on_color_primary, av8Var2);
                                i4 &= -7169;
                            }
                            av8Var2.t();
                            boolean z = (i4 & 14) == 4;
                            Object O = av8Var2.O();
                            if (z || O == nf3.a) {
                                split$default = StringsKt__StringsKt.split$default(str, new String[]{" "}, false, 0, 6, null);
                                O = Integer.valueOf(split$default.size());
                                av8Var2.n0(O);
                            }
                            int intValue = ((Number) O).intValue();
                            av8Var2.d0(-302996744);
                            o80 o80Var = new o80();
                            if (str2 == null) {
                                av8Var2.d0(-274872716);
                                av8Var2.s(false);
                            } else {
                                av8Var2.d0(-274872715);
                                int g = o80Var.g(new pwh(lz.D(R.color.on_color_secondary, av8Var2), 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                                try {
                                    o80Var.d(str2);
                                    Unit unit = Unit.a;
                                    o80Var.f(g);
                                    o80Var.d(" ");
                                    av8Var2.s(false);
                                } catch (Throwable th) {
                                    o80Var.f(g);
                                    throw th;
                                }
                            }
                            o80Var.d(str);
                            q80 h = o80Var.h();
                            av8Var2.s(false);
                            yf8 yf8Var = xth.a;
                            av8Var = av8Var2;
                            udj.d(h, xtcVar2, j2, null, 0L, 0L, new p7j(3), 0L, 2, false, intValue == 1 ? 1 : 2, 0, null, null, xth.n(), av8Var, (i4 >> 3) & 1008, 384, 240632);
                        } else {
                            av8Var2.W();
                        }
                    } else {
                        av8Var = av8Var2;
                        av8Var.W();
                    }
                    xtc xtcVar3 = xtcVar2;
                    long j3 = j2;
                    u = av8Var.u();
                    if (u != null) {
                        u.d = new iq9(str, str2, xtcVar3, j3, i, i2);
                        return;
                    }
                    return;
                }
            } else {
                j2 = j;
            }
            i3 = 1024;
            i4 = i5 | i3;
            if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
            }
            xtc xtcVar32 = xtcVar2;
            long j32 = j2;
            u = av8Var.u();
            if (u != null) {
            }
        }
        xtcVar2 = xtcVar;
        if ((i2 & 8) != 0) {
        }
        i3 = 1024;
        i4 = i5 | i3;
        if (av8Var2.T(i4 & 1, (i4 & 1171) != 1170)) {
        }
        xtc xtcVar322 = xtcVar2;
        long j322 = j2;
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final void f(Player player, Integer num, boolean z, xtc xtcVar, of3 of3Var, int i) {
        String t;
        xtcVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(804823047);
        int i2 = i | (av8Var.i(player) ? 4 : 2) | (av8Var.g(num) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i2 & 1, (i2 & 1171) != 1170)) {
            xtc c0 = l98.c0(xtcVar, 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            f50 f50Var = hf3.g;
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            int id = player.getId();
            utc utcVar = utc.a;
            td4.C(id, bkh.l(utcVar, 40.0f), 0L, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 48, 12);
            goa goaVar = new goa(1.0f, true);
            u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, goaVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String jerseyNumber = player.getJerseyNumber();
            if (jerseyNumber == null) {
                jerseyNumber = "";
            }
            String obj = StringsKt.l0(jerseyNumber + " " + tba.t(player)).toString();
            yf8 yf8Var = xth.a;
            udj.c(obj, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            String position = player.getPosition();
            if (position == null || !z) {
                position = null;
            }
            if (position == null) {
                av8Var.d0(441473010);
                av8Var.s(false);
            } else {
                av8Var.d0(441473011);
                t = vha.t((Context) av8Var.k(nz.b), player.getGender(), Sports.FOOTBALL, player.getPosition(), false);
                udj.c(t, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
            if (num != null) {
                av8Var.d0(2142778815);
                td4.G(num.intValue(), bkh.l(utcVar, 24.0f), false, 0L, av8Var, ((i2 >> 3) & 14) | 48, 12);
                av8Var.s(false);
            } else {
                av8Var.d0(2142901823);
                av8Var.s(false);
            }
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(player, num, z, xtcVar, i, 16);
        }
    }

    public static final void g(Team team, xtc xtcVar, of3 of3Var, int i) {
        team.getClass();
        xtcVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-907364544);
        int i2 = (av8Var.i(team) ? 4 : 2) | i | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i2 & 1, (i2 & 19) != 18)) {
            xtc c0 = l98.c0(xtcVar, 16.0f, 8.0f);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, c0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            td4.G(team.getId(), bkh.l(utc.a, 40.0f), false, 0L, av8Var, 48, 12);
            goa goaVar = new goa(1.0f, true);
            String p = tba.p((Context) av8Var.k(nz.b), team);
            yf8 yf8Var = xth.a;
            udj.c(p, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new op9(team, xtcVar, i, 29);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:30:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x0354  */
    /* JADX WARN: Removed duplicated region for block: B:76:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0343  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void h(final long j, final Function0 function0, Function0 function02, Function0 function03, xtc xtcVar, boolean z, of3 of3Var, final int i, final int i2) {
        xtc xtcVar2;
        int i3;
        int i4;
        Function0 function04;
        Function0 function05;
        final boolean z2;
        final xtc xtcVar3;
        eqf u;
        int i5;
        xtc xtcVar4;
        a99 a99Var;
        utc utcVar;
        function0.getClass();
        function02.getClass();
        function03.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(187046035);
        int i6 = (av8Var.f(j) ? 4 : 2) | i;
        if ((i & 48) == 0) {
            i6 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i6 |= av8Var.i(function02) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i7 = i6 | (av8Var.i(function03) ? a.o : 1024);
        int i8 = i2 & 16;
        if (i8 != 0) {
            i3 = i7 | 24576;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i3 = i7 | (av8Var.g(xtcVar2) ? 16384 : 8192);
        }
        int i9 = i2 & 32;
        if (i9 != 0) {
            i3 |= 196608;
        } else if ((196608 & i) == 0) {
            i3 |= av8Var.h(z) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            i4 = i3 | 1572864;
            if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
                function04 = function02;
                function05 = function03;
                av8Var.W();
                z2 = z;
                xtcVar3 = xtcVar2;
            } else {
                utc utcVar2 = utc.a;
                xtc xtcVar5 = i8 != 0 ? utcVar2 : xtcVar2;
                boolean z3 = i9 != 0 ? false : z;
                xtc d2 = bkh.d(xtcVar5, 1.0f);
                k1c c2 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, d2);
                if3.k7.getClass();
                zg3 zg3Var = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, c2, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                a99 a99Var2 = nf3.a;
                if (z3) {
                    i5 = i4;
                    xtcVar4 = xtcVar5;
                    a99Var = a99Var2;
                    utcVar = utcVar2;
                    av8Var.d0(1318385365);
                    av8Var.s(false);
                } else {
                    av8Var.d0(1316720913);
                    xtcVar4 = xtcVar5;
                    xtc f0 = l98.f0(n9e.q(l98.f0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.surface_1, av8Var), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 12.0f, 4.0f, 1);
                    lv1 lv1Var = uxf.m;
                    wxf wxfVar = ww9.b;
                    l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    int hashCode2 = Long.hashCode(av8Var.T);
                    aee m2 = av8Var.m();
                    xtc C2 = fqj.C(av8Var, f0);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a2, f50Var);
                    waa.K(av8Var, m2, ff3Var);
                    bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C2, f50Var3);
                    utcVar = utcVar2;
                    xtc e2 = fn0.e(1.0f, l98.f0(utcVar2, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), true);
                    String v = oea.v(R.string.rank, av8Var);
                    long D = lz.D(R.color.n_lv_3, av8Var);
                    yf8 yf8Var = xth.a;
                    i5 = i4;
                    a99Var = a99Var2;
                    udj.c(v, e2, D, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.m(), av8Var, 0, 0, 131064);
                    xtc A = wnn.A(utcVar, o7g.a(8.0f));
                    boolean z4 = (i5 & 112) == 32;
                    Object O = av8Var.O();
                    if (z4 || O == a99Var) {
                        O = new rsd(24, function0);
                        av8Var.n0(O);
                    }
                    xtc w = oyn.w(A, false, null, null, (Function0) O, 15);
                    l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
                    int hashCode3 = Long.hashCode(av8Var.T);
                    aee m3 = av8Var.m();
                    xtc C3 = fqj.C(av8Var, w);
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, a3, f50Var);
                    waa.K(av8Var, m3, ff3Var);
                    bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                    waa.K(av8Var, C3, f50Var3);
                    kq9.a(haa.t(R.drawable.ic_info, 0, av8Var), "", bkh.l(l98.b0(utcVar, 4.0f), 18.0f), lz.D(R.color.n_lv_3, av8Var), av8Var, 440, 0);
                    udj.c(oea.v(R.string.points, av8Var), l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 4.0f, 6.0f, 4.0f, 1), lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.m(), av8Var, 0, 0, 131064);
                    av8Var = av8Var;
                    ljg.t(av8Var, true, true, false);
                }
                av8Var.d0(1318423216);
                xtc a4 = n12.a.a(utcVar, uxf.d);
                int i10 = i5;
                boolean z5 = (i10 & 896) == 256;
                Object O2 = av8Var.O();
                if (z5 || O2 == a99Var) {
                    function04 = function02;
                    O2 = new rsd(25, function04);
                    av8Var.n0(O2);
                } else {
                    function04 = function02;
                }
                Function0 function06 = (Function0) O2;
                boolean z6 = (i10 & 7168) == 2048;
                Object O3 = av8Var.O();
                if (z6 || O3 == a99Var) {
                    function05 = function03;
                    O3 = new rsd(26, function05);
                    av8Var.n0(O3);
                } else {
                    function05 = function03;
                }
                jca.u(a4, j, function06, (Function0) O3, av8Var, (i10 << 3) & 112);
                av8Var.s(false);
                av8Var.s(true);
                z2 = z3;
                xtcVar3 = xtcVar4;
            }
            u = av8Var.u();
            if (u == null) {
                final Function0 function07 = function04;
                final Function0 function08 = function05;
                u.d = new Function2() { // from class: bgk
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        qea.h(j, function0, function07, function08, xtcVar3, z2, (of3) obj, aba.K(i | 1), i2);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        i4 = i3 | 1572864;
        if (av8Var.T(i4 & 1, (599187 & i4) == 599186)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void i(l3l l3lVar, Function1 function1, Function0 function0, xtc xtcVar, b3l b3lVar, of3 of3Var, int i, int i2) {
        b3l b3lVar2;
        int i3;
        xtc xtcVar2;
        b3l b3lVar3;
        function1.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1484491197);
        int i4 = i | (av8Var.i(l3lVar) ? 4 : 2);
        if ((i & 48) == 0) {
            i4 |= av8Var.i(function1) ? 32 : 16;
        }
        int i5 = i4 | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i6 = i5 | 3072;
        int i7 = i2 & 16;
        if (i7 != 0) {
            i3 = i5 | 27648;
            b3lVar2 = b3lVar;
        } else {
            b3lVar2 = b3lVar;
            i3 = i6 | (av8Var.i(b3lVar2) ? 16384 : 8192);
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            b3l b3lVar4 = i7 != 0 ? null : b3lVar2;
            ksa a2 = msa.a(0, 0, av8Var, 0, 3);
            Object[] objArr = new Object[0];
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = new vak(27);
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) o3a.N(objArr, (Function0) O, av8Var, 48);
            boolean z = b3lVar4 != null;
            int i8 = l3lVar.e;
            boolean z2 = z;
            tol.b(nyd.a.a(null), yqo.H(313486083, av8Var, new x64(z2, a2, b3lVar4, l3lVar, function1, function0)), av8Var, 56);
            if (z2) {
                av8Var.d0(804812319);
                av8Var.s(false);
            } else {
                av8Var.d0(804148268);
                e1d x = rfo.x(((u6b) av8Var.k(mhb.a)).getLifecycle().c(), av8Var, 0);
                e6b e6bVar = (e6b) x.getValue();
                boolean e2 = av8Var.e(i8) | av8Var.g(e1dVar) | av8Var.g(a2) | av8Var.g(x);
                Object O2 = av8Var.O();
                if (e2 || O2 == a99Var) {
                    ly7 ly7Var = new ly7(i8, e1dVar, a2, x, (rq3) null);
                    av8Var.n0(ly7Var);
                    O2 = ly7Var;
                }
                hz8.o(av8Var, e6bVar, (Function2) O2);
                av8Var.s(false);
            }
            xtcVar2 = utc.a;
            b3lVar3 = b3lVar4;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
            b3lVar3 = b3lVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ei(i, i2, 6, function0, xtcVar2, l3lVar, function1, b3lVar3);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:27:0x0066  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0084  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x008f  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x0086  */
    /* JADX WARN: Removed duplicated region for block: B:72:0x006b  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(o5c o5cVar, Function1 function1, xtc xtcVar, boolean z, Function0 function0, of3 of3Var, int i, int i2) {
        int i3;
        boolean z2;
        int i4;
        Function0 function02;
        boolean z3;
        eqf u;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1768138459);
        int i5 = 4;
        if ((i & 6) == 0) {
            i3 = (av8Var.g(o5cVar) ? 4 : 2) | i;
        } else {
            i3 = i;
        }
        if ((i & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = i2 & 8;
        if (i6 != 0) {
            i3 |= 3072;
        } else if ((i & 3072) == 0) {
            z2 = z;
            i3 |= av8Var.h(z2) ? a.o : 1024;
            i4 = i2 & 16;
            if (i4 == 0) {
                i3 |= 24576;
            } else if ((i & 24576) == 0) {
                i3 |= av8Var.i(function0) ? 16384 : 8192;
                if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
                    if (i6 != 0) {
                        z2 = false;
                    }
                    Function0 function03 = i4 != 0 ? null : function0;
                    xtc A = wnn.A(bkh.d(xtcVar, 1.0f), o7g.a(12.0f));
                    boolean z4 = ((i3 & 112) == 32) | ((i3 & 14) == 4);
                    Object O = av8Var.O();
                    a99 a99Var = nf3.a;
                    if (z4 || O == a99Var) {
                        O = new ufl(i5, function1, o5cVar);
                        av8Var.n0(O);
                    }
                    Function0 function04 = function03;
                    xtc O2 = kda.O(tol.y(A, false, false, false, 0L, null, (Function0) O, av8Var, 31), "wsc_web_clip_card", av8Var);
                    k1c c2 = e12.c(uxf.c, false);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, O2);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.l(zg3Var);
                    } else {
                        av8Var.q0();
                    }
                    waa.K(av8Var, c2, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    utc utcVar = utc.a;
                    xtc p = qx9.p(bkh.d(utcVar, 1.0f), 1.7777778f);
                    WSCStory wSCStory = o5cVar.a;
                    haa.b(wSCStory.getThumbnailUrl(WSCThumbnailAspectRatio.RATIO_16X9), null, p, haa.t(2131232755, 0, av8Var), haa.t(2131232755, 0, av8Var), null, mp3.a, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, 37296, 6, 31712);
                    n12 n12Var = n12.a;
                    e12.a(0, av8Var, n9e.q(n12Var.b(utcVar), lz.D(R.color.darken_overlay_1, av8Var), oyn.e));
                    kq9.b(s6a.N(R.drawable.ic_highlights_white, 6, av8Var), null, kda.O(n12Var.a(bkh.l(utcVar, 48.0f), uxf.g), "wsc_play_button", av8Var), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                    Boolean isImageBasedStory = wSCStory.isImageBasedStory();
                    Boolean bool = Boolean.TRUE;
                    yqo.j(0, av8Var, n12Var.a(utcVar, uxf.e), o5cVar.c, Intrinsics.c(isImageBasedStory, bool));
                    boolean z5 = z2;
                    av8Var = av8Var;
                    yso.m(Intrinsics.c(wSCStory.isImageBasedStory(), bool), wSCStory.getType(), o5cVar.c, z5, n12Var.a(utcVar, uxf.j), function1, av8Var, ((i3 << 12) & 458752) | (i3 & 7168));
                    av8Var.s(true);
                    if (function04 == null) {
                        av8Var.d0(1135922943);
                        av8Var.s(false);
                    } else {
                        av8Var.d0(1135922944);
                        d6b d6bVar = d6b.ON_RESUME;
                        boolean g = av8Var.g(function04);
                        Object O3 = av8Var.O();
                        if (g || O3 == a99Var) {
                            O3 = new vdl(2, function04);
                            av8Var.n0(O3);
                        }
                        jca.b(d6bVar, null, (Function0) O3, av8Var, 6);
                        av8Var.s(false);
                    }
                    z3 = z5;
                    function02 = function04;
                } else {
                    av8Var.W();
                    function02 = function0;
                    z3 = z2;
                }
                u = av8Var.u();
                if (u != null) {
                    u.d = new ci(o5cVar, function1, xtcVar, z3, function02, i, i2);
                    return;
                }
                return;
            }
            if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            }
            u = av8Var.u();
            if (u != null) {
            }
        }
        z2 = z;
        i4 = i2 & 16;
        if (i4 == 0) {
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
        }
        u = av8Var.u();
        if (u != null) {
        }
    }

    public static final boolean k(mze mzeVar) {
        return (mzeVar.b() || mzeVar.h || !mzeVar.d) ? false : true;
    }

    public static final boolean l(mze mzeVar) {
        return !mzeVar.h && mzeVar.d;
    }

    public static final boolean m(mze mzeVar) {
        return (mzeVar.b() || !mzeVar.h || mzeVar.d) ? false : true;
    }

    public static final boolean n(mze mzeVar) {
        return mzeVar.h && !mzeVar.d;
    }

    public static final f8j o(xv4 xv4Var) {
        q8j q8jVar;
        d8j d8jVar = new d8j();
        jca.X(xv4Var, h8j.a, new g2i(new g2i(d8jVar, 25), new chf(1, d8jVar, d8j.class, "addFilter", "addFilter$foundation(Lkotlin/jvm/functions/Function1;)V", 0, 25)));
        l0d l0dVar = new l0d();
        l0d l0dVar2 = d8jVar.a;
        Object[] objArr = l0dVar2.a;
        int i = l0dVar2.b;
        int i2 = 0;
        int i3 = 0;
        boolean z = true;
        e8j e8jVar = null;
        while (true) {
            q8jVar = q8j.b;
            if (i3 >= i) {
                break;
            }
            e8j e8jVar2 = (e8j) objArr[i3];
            if (!z || e8jVar2 != q8jVar) {
                if (e8jVar2 != q8jVar || e8jVar != q8jVar) {
                    if (e8jVar2 != q8jVar) {
                        l0d l0dVar3 = d8jVar.b;
                        Object[] objArr2 = l0dVar3.a;
                        int i4 = l0dVar3.b;
                        for (int i5 = 0; i5 < i4; i5++) {
                            if (((Boolean) ((Function1) objArr2[i5]).invoke(e8jVar2)).booleanValue()) {
                            }
                        }
                    }
                    l0dVar.a(e8jVar2);
                    z = false;
                    e8jVar = e8jVar2;
                }
                z = false;
                break;
            }
            i3++;
        }
        if (((e8j) (l0dVar.h() ? null : l0dVar.a[l0dVar.b - 1])) == q8jVar) {
            l0dVar.k(l0dVar.b - 1);
        }
        j0d j0dVar = l0dVar.c;
        if (j0dVar == null) {
            j0dVar = new j0d(l0dVar, i2);
            l0dVar.c = j0dVar;
        }
        return new f8j(j0dVar);
    }

    public static cal p(of3 of3Var) {
        av8 av8Var = (av8) of3Var;
        View view = (View) av8Var.k(nz.f);
        cal u = u(view);
        boolean i = av8Var.i(u) | av8Var.i(view);
        Object O = av8Var.O();
        if (i || O == nf3.a) {
            O = new mwj(29, u, view);
            av8Var.n0(O);
        }
        hz8.d(u, (Function1) O, av8Var);
        return u;
    }

    public static boolean q() {
        Context context;
        SharedPreferences sharedPreferences;
        ApplicationInfo applicationInfo;
        Bundle bundle;
        try {
            r38.c();
            r38 c2 = r38.c();
            c2.a();
            context = c2.a;
            sharedPreferences = context.getSharedPreferences("com.google.firebase.messaging", 0);
        } catch (PackageManager.NameNotFoundException | IllegalStateException unused) {
        }
        if (sharedPreferences.contains("export_to_big_query")) {
            return sharedPreferences.getBoolean("export_to_big_query", false);
        }
        PackageManager packageManager = context.getPackageManager();
        if (packageManager != null && (applicationInfo = packageManager.getApplicationInfo(context.getPackageName(), 128)) != null && (bundle = applicationInfo.metaData) != null && bundle.containsKey("delivery_metrics_exported_to_big_query_enabled")) {
            return applicationInfo.metaData.getBoolean("delivery_metrics_exported_to_big_query_enabled", false);
        }
        return false;
    }

    public static void r(ha5 ha5Var, pea peaVar, long j) {
        boolean z = peaVar instanceof dxd;
        e28 e28Var = e28.a;
        if (z) {
            oqf oqfVar = ((dxd) peaVar).g;
            float f2 = oqfVar.a;
            float f3 = oqfVar.b;
            ha5Var.Q0(j, (Float.floatToRawIntBits(f3) & 4294967295L) | (Float.floatToRawIntBits(f2) << 32), H(oqfVar), 1.0f, e28Var, null, 3);
            return;
        }
        if (!(peaVar instanceof exd)) {
            if (peaVar instanceof cxd) {
                ha5Var.l0(((cxd) peaVar).g, j, 1.0f, e28Var);
                return;
            } else {
                zzl.b();
                return;
            }
        }
        exd exdVar = (exd) peaVar;
        b20 b20Var = exdVar.h;
        if (b20Var != null) {
            ha5Var.l0(b20Var, j, 1.0f, e28Var);
            return;
        }
        e7g e7gVar = exdVar.g;
        float f4 = e7gVar.b;
        float f5 = e7gVar.a;
        float intBitsToFloat = Float.intBitsToFloat((int) (e7gVar.h >> 32));
        float f6 = e7gVar.c - f5;
        float f7 = e7gVar.d - f4;
        ha5Var.X(j, (Float.floatToRawIntBits(f5) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << 32) | (4294967295L & Float.floatToRawIntBits(intBitsToFloat)), e28Var);
    }

    public static void s(xhi xhiVar, Function2 function2) {
        for (Map.Entry entry : xhiVar.c()) {
            function2.invoke((String) entry.getKey(), (List) entry.getValue());
        }
    }

    public static final g6b t(View view) {
        view.getClass();
        u6b w = qha.w(view);
        if (w != null) {
            return w.getLifecycle();
        }
        return null;
    }

    public static cal u(View view) {
        cal calVar;
        WeakHashMap weakHashMap = cal.w;
        synchronized (weakHashMap) {
            try {
                Object obj = weakHashMap.get(view);
                if (obj == null) {
                    obj = new cal(view);
                    weakHashMap.put(view, obj);
                }
                calVar = (cal) obj;
            } catch (Throwable th) {
                throw th;
            }
        }
        return calVar;
    }

    public static final Object v(l3h l3hVar, a4h a4hVar) {
        Object g = l3hVar.a.g(a4hVar);
        if (g == null) {
            return null;
        }
        return g;
    }

    public static final String w(Context context, Team team) {
        team.getClass();
        context.getClass();
        Integer ranking = team.getRanking();
        if (ranking == null || ranking.intValue() <= 0) {
            ranking = null;
        }
        if (ranking == null || team.getGender() == null || team.hasSubTeams()) {
            return null;
        }
        Gender gender = team.getGender();
        gender.getClass();
        int i = ywi.a[gender.ordinal()];
        if (i == 1) {
            return String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(R.string.atp), yid.p(ranking.intValue())}, 2));
        }
        if (i == 2) {
            return String.format("%s %s", Arrays.copyOf(new Object[]{context.getString(R.string.wta), yid.p(ranking.intValue())}, 2));
        }
        zzl.b();
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:6:0x005e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ImageView x(Context context, zeg zegVar, Function1 function1) {
        Bitmap bitmap;
        zegVar.getClass();
        String str = zegVar.a;
        Bitmap bitmap2 = null;
        if (str != null) {
            try {
                bitmap = (Bitmap) function1.invoke(str);
                Integer num = zegVar.b;
                int intValue = num != null ? num.intValue() : -1;
                Integer num2 = zegVar.c;
                int intValue2 = num2 != null ? num2.intValue() : -1;
                if (intValue > 0 && intValue2 > 0) {
                    double width = bitmap.getWidth();
                    double height = bitmap.getHeight();
                    double min = Math.min(intValue / width, intValue2 / height);
                    bitmap = Bitmap.createScaledBitmap(bitmap, (int) (width * min), (int) (height * min), true);
                }
            } catch (Exception unused) {
                jeg jegVar = jeg.d;
                "Could not load native ad image asset url: ".concat(str);
                jegVar.f(4);
                bitmap = null;
            }
            if (bitmap != null) {
                bitmap2 = bitmap;
                ImageView imageView = new ImageView(context);
                if (bitmap2 != null) {
                    imageView.setImageBitmap(bitmap2);
                    imageView.setAdjustViewBounds(true);
                }
                return imageView;
            }
        }
        jeg.d.f(4);
        ImageView imageView2 = new ImageView(context);
        if (bitmap2 != null) {
        }
        return imageView2;
    }

    public static final boolean y(Team team) {
        team.getClass();
        return team.getGender() == Gender.Female;
    }

    public static final boolean z(mze mzeVar, long j, long j2) {
        int i = mzeVar.i == 1 ? 1 : 0;
        long j3 = mzeVar.c;
        float intBitsToFloat = Float.intBitsToFloat((int) (j3 >> 32));
        float intBitsToFloat2 = Float.intBitsToFloat((int) (j3 & 4294967295L));
        float f2 = i;
        float intBitsToFloat3 = Float.intBitsToFloat((int) (j2 >> 32)) * f2;
        float f3 = ((int) (j >> 32)) + intBitsToFloat3;
        float intBitsToFloat4 = Float.intBitsToFloat((int) (j2 & 4294967295L)) * f2;
        return (intBitsToFloat > f3) | (intBitsToFloat < (-intBitsToFloat3)) | (intBitsToFloat2 < (-intBitsToFloat4)) | (intBitsToFloat2 > ((int) (j & 4294967295L)) + intBitsToFloat4);
    }
}
