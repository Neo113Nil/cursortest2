package defpackage;

import android.content.Context;
import android.content.Intent;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Paint;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.Bundle;
import coil.memory.MemoryCache$Key;
import com.facebook.internal.k0;
import com.facebook.w;
import com.google.android.gms.internal.cast.zzyh;
import com.google.android.gms.internal.consent_sdk.zzqp;
import com.google.android.gms.tasks.Task;
import com.ironsource.U3;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.SubTeam;
import com.sofascore.results.R;
import com.sofascore.results.base.BaseActivity;
import com.sofascore.results.fantasy.league.FantasyLeagueActivity;
import com.sofascore.results.mma.organisation.MmaOrganisationActivity;
import com.sofascore.results.view.BellButton;
import com.sofascore.results.view.WDLView;
import java.io.InputStream;
import java.io.OutputStream;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.Locale;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.Executor;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.logging.Logger;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.text.StringsKt;
import org.json.JSONArray;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class inb implements lx2, lkk, moh, c6h, zzqp, zzyh, lg0, bw1, pjd, ii9, d0l, meh, evk {
    public static boolean c;
    public static JSONArray d;
    public final /* synthetic */ int a;
    public static final inb b = new inb(0);
    public static final String[] e = {"event", "_locale", "_appVersion", "_deviceOS", "_platform", "_deviceModel", "_nativeAppID", "_nativeAppShortVersion", "_timezone", "_carrier", "_deviceOSTypeName", "_deviceOSVersion", "_remainingDiskGB"};
    public static final inb f = new inb(1);
    public static final inb g = new inb(2);
    public static final inb h = new inb(3);
    public static final inb i = new inb(4);
    public static final inb j = new inb(5);
    public static final inb k = new inb(6);
    public static final inb l = new inb(7);
    public static final ogj m = new ogj(1);
    public static final inb n = new inb(9);
    public static final inb o = new inb(10);
    public static final inb p = new inb(11);
    public static final inb q = new inb(12);
    public static final inb r = new inb(13);
    public static final inb s = new inb(14);
    public static final inb t = new inb(15);

    public /* synthetic */ inb(int i2) {
        this.a = i2;
    }

    public static final String A(Bundle bundle) {
        String optString;
        if (cw3.a.contains(inb.class)) {
            return null;
        }
        try {
            JSONArray jSONArray = d;
            if (jSONArray == null) {
                return "[]";
            }
            if (jSONArray != null && jSONArray.length() == 0) {
                return "[]";
            }
            JSONArray jSONArray2 = d;
            jSONArray2.getClass();
            ArrayList arrayList = new ArrayList();
            int length = jSONArray2.length();
            for (int i2 = 0; i2 < length; i2++) {
                String optString2 = jSONArray2.optString(i2);
                if (optString2 != null) {
                    JSONObject jSONObject = new JSONObject(optString2);
                    long optLong = jSONObject.optLong("id");
                    if (optLong != 0 && (optString = jSONObject.optString("rule")) != null && B(bundle, optString)) {
                        arrayList.add(Long.valueOf(optLong));
                    }
                }
            }
            String jSONArray3 = new JSONArray((Collection) arrayList).toString();
            jSONArray3.getClass();
            return jSONArray3;
        } catch (Throwable th) {
            cw3.a(inb.class, th);
            return null;
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:18:0x007f  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0080 A[Catch: all -> 0x004b, TryCatch #0 {all -> 0x004b, blocks: (B:6:0x0013, B:9:0x0020, B:16:0x007b, B:19:0x0080, B:22:0x0038, B:25:0x0041, B:27:0x004d, B:29:0x0055, B:32:0x005a, B:34:0x0061, B:36:0x0070, B:41:0x0073, B:43:0x0085, B:46:0x008a, B:48:0x0091), top: B:5:0x0013 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean B(Bundle bundle, String str) {
        JSONObject jSONObject;
        if (!cw3.a.contains(inb.class) && str != null && bundle != null) {
            try {
                JSONObject jSONObject2 = new JSONObject(str);
                String z = z(jSONObject2);
                if (z != null) {
                    Object obj = jSONObject2.get(z);
                    int hashCode = z.hashCode();
                    if (hashCode != 3555) {
                        if (hashCode != 96727) {
                            if (hashCode == 109267 && z.equals("not")) {
                                return !B(bundle, obj.toString());
                            }
                        } else if (z.equals("and")) {
                            JSONArray jSONArray = (JSONArray) obj;
                            if (jSONArray != null) {
                                int length = jSONArray.length();
                                for (int i2 = 0; i2 < length; i2++) {
                                    if (B(bundle, jSONArray.get(i2).toString())) {
                                    }
                                }
                                return true;
                            }
                        }
                        jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                            return G(z, jSONObject, bundle);
                        }
                    } else {
                        if (z.equals("or")) {
                            JSONArray jSONArray2 = (JSONArray) obj;
                            if (jSONArray2 != null) {
                                int length2 = jSONArray2.length();
                                for (int i3 = 0; i3 < length2; i3++) {
                                    if (B(bundle, jSONArray2.get(i3).toString())) {
                                        return true;
                                    }
                                }
                            }
                        }
                        jSONObject = (JSONObject) obj;
                        if (jSONObject == null) {
                        }
                    }
                }
            } catch (Throwable th) {
                cw3.a(inb.class, th);
            }
        }
        return false;
    }

    public static final void C(Bundle bundle, String str) {
        if (cw3.a.contains(inb.class)) {
            return;
        }
        try {
            str.getClass();
            if (!c || bundle == null) {
                return;
            }
            try {
                s(bundle, str);
                bundle.putString("_audiencePropertyIds", A(bundle));
                bundle.putString("cs_maca", "1");
                D(bundle);
            } catch (Exception unused) {
            }
        } catch (Throwable th) {
            cw3.a(inb.class, th);
        }
    }

    public static final void D(Bundle bundle) {
        if (cw3.a.contains(inb.class)) {
            return;
        }
        try {
            bundle.getClass();
            String[] strArr = e;
            for (int i2 = 0; i2 < 13; i2++) {
                bundle.remove(strArr[i2]);
            }
        } catch (Throwable th) {
            cw3.a(inb.class, th);
        }
    }

    public static void E(Context context, j67 j67Var, ev6 ev6Var) {
        Boolean bool = Boolean.TRUE;
        context.getClass();
        j67Var.getClass();
        ev6Var.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasyLeagueActivity.class);
        intent.putExtra("FANTASY_LEAGUE_EXTRA", j67Var);
        intent.putExtra("FANTASY_COMPETITION_EXTRA", ev6Var);
        intent.putExtra("FANTASY_LEAGUE_POSITION_ON_CHAT", bool);
        context.startActivity(intent);
    }

    public static void F(int i2, Context context) {
        int i3 = MmaOrganisationActivity.T;
        context.getClass();
        context.startActivity(x(context, i2, null));
    }

    /* JADX WARN: Code restructure failed: missing block: B:24:0x0076, code lost:
    
        if (r10 == null) goto L32;
     */
    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    /* JADX WARN: Removed duplicated region for block: B:101:0x01dd  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x01c7  */
    /* JADX WARN: Removed duplicated region for block: B:117:0x01a1  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0229  */
    /* JADX WARN: Removed duplicated region for block: B:140:0x033e A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:6:0x000d, B:9:0x0015, B:13:0x004c, B:16:0x0057, B:23:0x0069, B:25:0x0083, B:26:0x0087, B:29:0x008c, B:33:0x0096, B:35:0x00b0, B:39:0x00ba, B:44:0x00c7, B:50:0x0239, B:53:0x0241, B:54:0x0245, B:56:0x024b, B:63:0x00d1, B:67:0x00db, B:69:0x00f5, B:75:0x027b, B:79:0x0283, B:80:0x0287, B:82:0x028d, B:89:0x00ff, B:93:0x0109, B:95:0x0123, B:99:0x01d3, B:103:0x012d, B:107:0x01b7, B:111:0x0137, B:115:0x0191, B:119:0x0141, B:123:0x014b, B:127:0x0219, B:131:0x0155, B:135:0x015f, B:140:0x033e, B:142:0x0169, B:146:0x01e9, B:150:0x0173, B:154:0x017d, B:158:0x0205, B:160:0x0187, B:164:0x01a3, B:168:0x01ad, B:172:0x01c9, B:176:0x01df, B:180:0x01fb, B:184:0x020f, B:188:0x022b, B:192:0x026d, B:196:0x02af, B:200:0x02b9, B:204:0x02d5, B:208:0x02df, B:210:0x02e9, B:216:0x0329, B:218:0x02f3, B:222:0x02fd, B:224:0x030b, B:228:0x0314, B:230:0x031d, B:234:0x0332, B:238:0x0347, B:242:0x0350, B:246:0x007a, B:259:0x0048, B:252:0x002d, B:254:0x0039), top: B:5:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:148:0x01f9  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0055  */
    /* JADX WARN: Removed duplicated region for block: B:215:0x0328  */
    /* JADX WARN: Removed duplicated region for block: B:216:0x0329 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:6:0x000d, B:9:0x0015, B:13:0x004c, B:16:0x0057, B:23:0x0069, B:25:0x0083, B:26:0x0087, B:29:0x008c, B:33:0x0096, B:35:0x00b0, B:39:0x00ba, B:44:0x00c7, B:50:0x0239, B:53:0x0241, B:54:0x0245, B:56:0x024b, B:63:0x00d1, B:67:0x00db, B:69:0x00f5, B:75:0x027b, B:79:0x0283, B:80:0x0287, B:82:0x028d, B:89:0x00ff, B:93:0x0109, B:95:0x0123, B:99:0x01d3, B:103:0x012d, B:107:0x01b7, B:111:0x0137, B:115:0x0191, B:119:0x0141, B:123:0x014b, B:127:0x0219, B:131:0x0155, B:135:0x015f, B:140:0x033e, B:142:0x0169, B:146:0x01e9, B:150:0x0173, B:154:0x017d, B:158:0x0205, B:160:0x0187, B:164:0x01a3, B:168:0x01ad, B:172:0x01c9, B:176:0x01df, B:180:0x01fb, B:184:0x020f, B:188:0x022b, B:192:0x026d, B:196:0x02af, B:200:0x02b9, B:204:0x02d5, B:208:0x02df, B:210:0x02e9, B:216:0x0329, B:218:0x02f3, B:222:0x02fd, B:224:0x030b, B:228:0x0314, B:230:0x031d, B:234:0x0332, B:238:0x0347, B:242:0x0350, B:246:0x007a, B:259:0x0048, B:252:0x002d, B:254:0x0039), top: B:5:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0067  */
    /* JADX WARN: Removed duplicated region for block: B:49:0x0237  */
    /* JADX WARN: Removed duplicated region for block: B:50:0x0239 A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:6:0x000d, B:9:0x0015, B:13:0x004c, B:16:0x0057, B:23:0x0069, B:25:0x0083, B:26:0x0087, B:29:0x008c, B:33:0x0096, B:35:0x00b0, B:39:0x00ba, B:44:0x00c7, B:50:0x0239, B:53:0x0241, B:54:0x0245, B:56:0x024b, B:63:0x00d1, B:67:0x00db, B:69:0x00f5, B:75:0x027b, B:79:0x0283, B:80:0x0287, B:82:0x028d, B:89:0x00ff, B:93:0x0109, B:95:0x0123, B:99:0x01d3, B:103:0x012d, B:107:0x01b7, B:111:0x0137, B:115:0x0191, B:119:0x0141, B:123:0x014b, B:127:0x0219, B:131:0x0155, B:135:0x015f, B:140:0x033e, B:142:0x0169, B:146:0x01e9, B:150:0x0173, B:154:0x017d, B:158:0x0205, B:160:0x0187, B:164:0x01a3, B:168:0x01ad, B:172:0x01c9, B:176:0x01df, B:180:0x01fb, B:184:0x020f, B:188:0x022b, B:192:0x026d, B:196:0x02af, B:200:0x02b9, B:204:0x02d5, B:208:0x02df, B:210:0x02e9, B:216:0x0329, B:218:0x02f3, B:222:0x02fd, B:224:0x030b, B:228:0x0314, B:230:0x031d, B:234:0x0332, B:238:0x0347, B:242:0x0350, B:246:0x007a, B:259:0x0048, B:252:0x002d, B:254:0x0039), top: B:5:0x000d, inners: #1 }] */
    /* JADX WARN: Removed duplicated region for block: B:82:0x028d A[Catch: all -> 0x0063, TryCatch #0 {all -> 0x0063, blocks: (B:6:0x000d, B:9:0x0015, B:13:0x004c, B:16:0x0057, B:23:0x0069, B:25:0x0083, B:26:0x0087, B:29:0x008c, B:33:0x0096, B:35:0x00b0, B:39:0x00ba, B:44:0x00c7, B:50:0x0239, B:53:0x0241, B:54:0x0245, B:56:0x024b, B:63:0x00d1, B:67:0x00db, B:69:0x00f5, B:75:0x027b, B:79:0x0283, B:80:0x0287, B:82:0x028d, B:89:0x00ff, B:93:0x0109, B:95:0x0123, B:99:0x01d3, B:103:0x012d, B:107:0x01b7, B:111:0x0137, B:115:0x0191, B:119:0x0141, B:123:0x014b, B:127:0x0219, B:131:0x0155, B:135:0x015f, B:140:0x033e, B:142:0x0169, B:146:0x01e9, B:150:0x0173, B:154:0x017d, B:158:0x0205, B:160:0x0187, B:164:0x01a3, B:168:0x01ad, B:172:0x01c9, B:176:0x01df, B:180:0x01fb, B:184:0x020f, B:188:0x022b, B:192:0x026d, B:196:0x02af, B:200:0x02b9, B:204:0x02d5, B:208:0x02df, B:210:0x02e9, B:216:0x0329, B:218:0x02f3, B:222:0x02fd, B:224:0x030b, B:228:0x0314, B:230:0x031d, B:234:0x0332, B:238:0x0347, B:242:0x0350, B:246:0x007a, B:259:0x0048, B:252:0x002d, B:254:0x0039), top: B:5:0x000d, inners: #1 }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final boolean G(String str, JSONObject jSONObject, Bundle bundle) {
        ArrayList<String> arrayList;
        Object obj;
        Set set = cw3.a;
        if (!set.contains(inb.class)) {
            try {
                String z = z(jSONObject);
                if (z != null) {
                    String obj2 = jSONObject.get(z).toString();
                    JSONArray optJSONArray = jSONObject.optJSONArray(z);
                    if (!set.contains(inb.class) && optJSONArray != null) {
                        try {
                            arrayList = new ArrayList();
                            int length = optJSONArray.length();
                            for (int i2 = 0; i2 < length; i2++) {
                                arrayList.add(optJSONArray.get(i2).toString());
                            }
                        } catch (Throwable th) {
                            cw3.a(inb.class, th);
                        }
                        if (!z.equals("exists")) {
                            return bundle != null && bundle.containsKey(str) == Boolean.parseBoolean(obj2);
                        }
                        if (bundle != null) {
                            String lowerCase = str.toLowerCase(Locale.ROOT);
                            lowerCase.getClass();
                            obj = bundle.get(lowerCase);
                        }
                        Object obj3 = bundle != null ? bundle.get(str) : null;
                        if (obj3 != null) {
                            obj = obj3;
                            switch (z.hashCode()) {
                                case -1729128927:
                                    if (z.equals("i_not_contains")) {
                                        String obj4 = obj.toString();
                                        Locale locale = Locale.ROOT;
                                        String lowerCase2 = obj4.toLowerCase(locale);
                                        lowerCase2.getClass();
                                        String lowerCase3 = obj2.toLowerCase(locale);
                                        lowerCase3.getClass();
                                        if (StringsKt.J(lowerCase2, lowerCase3, false)) {
                                        }
                                        break;
                                    } else {
                                        break;
                                    }
                                    break;
                                case -1179774633:
                                    if (!z.equals("is_any")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                        break;
                                    }
                                    break;
                                case -1039699439:
                                    if (!z.equals("not_in")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                        break;
                                    } else {
                                        break;
                                    }
                                case -969266188:
                                    if (z.equals("starts_with")) {
                                        break;
                                    } else {
                                        break;
                                    }
                                case -966353971:
                                    if (z.equals("regex_match")) {
                                        break;
                                    } else {
                                        break;
                                    }
                                case -665609109:
                                    if (!z.equals("is_not_any")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                    }
                                    break;
                                case -567445985:
                                    if (z.equals("contains")) {
                                        break;
                                    } else {
                                        break;
                                    }
                                case -327990090:
                                    if (z.equals("i_str_neq")) {
                                        String obj5 = obj.toString();
                                        Locale locale2 = Locale.ROOT;
                                        String lowerCase4 = obj5.toLowerCase(locale2);
                                        lowerCase4.getClass();
                                        String lowerCase5 = obj2.toLowerCase(locale2);
                                        lowerCase5.getClass();
                                        if (!lowerCase4.equals(lowerCase5)) {
                                            break;
                                        }
                                    } else {
                                        break;
                                    }
                                    break;
                                case -159812115:
                                    if (!z.equals("i_is_any")) {
                                        break;
                                    }
                                    if (arrayList != null && !arrayList.isEmpty()) {
                                        for (String str2 : arrayList) {
                                            Locale locale3 = Locale.ROOT;
                                            String lowerCase6 = str2.toLowerCase(locale3);
                                            lowerCase6.getClass();
                                            String lowerCase7 = obj.toString().toLowerCase(locale3);
                                            lowerCase7.getClass();
                                            if (lowerCase6.equals(lowerCase7)) {
                                                break;
                                            }
                                        }
                                        break;
                                    }
                                    break;
                                case -92753547:
                                    if (!z.equals("i_str_not_in")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                        break;
                                    } else {
                                        if (!arrayList.isEmpty()) {
                                            for (String str3 : arrayList) {
                                                Locale locale4 = Locale.ROOT;
                                                String lowerCase8 = str3.toLowerCase(locale4);
                                                lowerCase8.getClass();
                                                String lowerCase9 = obj.toString().toLowerCase(locale4);
                                                lowerCase9.getClass();
                                                if (lowerCase8.equals(lowerCase9)) {
                                                    break;
                                                }
                                            }
                                        }
                                        break;
                                    }
                                case 60:
                                    if (!z.equals("<")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                        break;
                                    }
                                    break;
                                case 61:
                                    if (!z.equals(U3.j.b)) {
                                        break;
                                    }
                                    break;
                                case 62:
                                    if (!z.equals(">")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                        break;
                                    }
                                    break;
                                case 1084:
                                    if (!z.equals("!=")) {
                                        break;
                                    }
                                    if (!Intrinsics.c(obj.toString(), obj2)) {
                                        break;
                                    }
                                    break;
                                case 1921:
                                    if (!z.equals("<=")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                        break;
                                    }
                                    break;
                                case 1952:
                                    if (!z.equals("==")) {
                                        break;
                                    }
                                    break;
                                case 1983:
                                    if (!z.equals(">=")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                        break;
                                    }
                                    break;
                                case 3244:
                                    if (!z.equals("eq")) {
                                        break;
                                    }
                                    break;
                                case 3294:
                                    if (!z.equals("ge")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 3309:
                                    if (!z.equals("gt")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 3365:
                                    if (!z.equals("in")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                    }
                                    break;
                                case 3449:
                                    if (!z.equals("le")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 3464:
                                    if (!z.equals("lt")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 3511:
                                    if (!z.equals("ne")) {
                                        break;
                                    }
                                    if (!Intrinsics.c(obj.toString(), obj2)) {
                                    }
                                    break;
                                case 102680:
                                    if (!z.equals("gte")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) >= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 107485:
                                    if (!z.equals("lte")) {
                                        break;
                                    }
                                    if (Double.parseDouble(obj.toString()) <= Double.parseDouble(obj2)) {
                                    }
                                    break;
                                case 108954:
                                    if (!z.equals("neq")) {
                                        break;
                                    }
                                    if (!Intrinsics.c(obj.toString(), obj2)) {
                                    }
                                    break;
                                case 127966736:
                                    if (z.equals("i_str_eq")) {
                                        String obj6 = obj.toString();
                                        Locale locale5 = Locale.ROOT;
                                        String lowerCase10 = obj6.toLowerCase(locale5);
                                        lowerCase10.getClass();
                                        String lowerCase11 = obj2.toLowerCase(locale5);
                                        lowerCase11.getClass();
                                        break;
                                    } else {
                                        break;
                                    }
                                case 127966857:
                                    if (!z.equals("i_str_in")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                        while (r9.hasNext()) {
                                        }
                                        break;
                                    }
                                case 363990325:
                                    if (z.equals("i_contains")) {
                                        String obj7 = obj.toString();
                                        Locale locale6 = Locale.ROOT;
                                        String lowerCase12 = obj7.toLowerCase(locale6);
                                        lowerCase12.getClass();
                                        String lowerCase13 = obj2.toLowerCase(locale6);
                                        lowerCase13.getClass();
                                        break;
                                    } else {
                                        break;
                                    }
                                case 1091487233:
                                    if (!z.equals("i_is_not_any")) {
                                        break;
                                    }
                                    if (arrayList != null) {
                                    }
                                    break;
                                case 1918401035:
                                    if (!z.equals("not_contains") || StringsKt.J(obj.toString(), obj2, false)) {
                                    }
                                    break;
                                case 1961112862:
                                    if (z.equals("i_starts_with")) {
                                        String obj8 = obj.toString();
                                        Locale locale7 = Locale.ROOT;
                                        String lowerCase14 = obj8.toLowerCase(locale7);
                                        lowerCase14.getClass();
                                        String lowerCase15 = obj2.toLowerCase(locale7);
                                        lowerCase15.getClass();
                                        break;
                                    } else {
                                        break;
                                    }
                            }
                        }
                    }
                    arrayList = null;
                    if (!z.equals("exists")) {
                    }
                }
            } catch (Throwable th2) {
                cw3.a(inb.class, th2);
                return false;
            }
        }
        return false;
    }

    public static void o(BellButton bellButton, scb scbVar) {
        if (bellButton.getVisibility() == 0) {
            bellButton.e(scbVar.a, wu.MAIN_FAVORITES);
        }
    }

    public static void p(BellButton bellButton, WDLView wDLView, Event event, Integer num) {
        SubTeam subTeam1;
        SubTeam subTeam2;
        SubTeam subTeam12;
        SubTeam subTeam22;
        event.getClass();
        boolean z = num != null && (Intrinsics.c(event.getStatusType(), StatusKt.STATUS_CANCELED) || Intrinsics.c(event.getStatusType(), StatusKt.STATUS_SUSPENDED) || Intrinsics.c(event.getStatusType(), StatusKt.STATUS_FINISHED));
        bellButton.setVisibility(!z ? 0 : 8);
        wDLView.setVisibility(z ? 0 : 8);
        if (z) {
            int intValue = num.intValue();
            Paint paint = wDLView.a;
            Integer num2 = (Event.getHomeTeam$default(event, null, 1, null).getId() == intValue || ((subTeam1 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam1()) != null && subTeam1.getId() == intValue) || ((subTeam2 = Event.getHomeTeam$default(event, null, 1, null).getSubTeam2()) != null && subTeam2.getId() == intValue)) ? 1 : (Event.getAwayTeam$default(event, null, 1, null).getId() == intValue || ((subTeam12 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam1()) != null && subTeam12.getId() == intValue) || ((subTeam22 = Event.getAwayTeam$default(event, null, 1, null).getSubTeam2()) != null && subTeam22.getId() == intValue)) ? 2 : null;
            if (Intrinsics.c(Event.getWinnerCode$default(event, null, 1, null), num2)) {
                paint.setColor(wDLView.getContext().getColor(R.color.success));
                String string = wDLView.getContext().getString(R.string.any_sport_wins_short);
                string.getClass();
                wDLView.c = string;
                return;
            }
            IntRange intRange = new IntRange(1, 2, 1);
            Integer winnerCode$default = Event.getWinnerCode$default(event, null, 1, null);
            if (winnerCode$default != null && intRange.d(winnerCode$default.intValue()) && !Intrinsics.c(Event.getWinnerCode$default(event, null, 1, null), num2)) {
                paint.setColor(wDLView.getContext().getColor(R.color.error));
                String string2 = wDLView.getContext().getString(R.string.any_sport_losses_short);
                string2.getClass();
                wDLView.c = string2;
                return;
            }
            Integer winnerCode$default2 = Event.getWinnerCode$default(event, null, 1, null);
            if (winnerCode$default2 == null || winnerCode$default2.intValue() != 3) {
                paint.setColor(0);
                wDLView.c = "";
            } else {
                paint.setColor(wDLView.getContext().getColor(R.color.neutral_default));
                String string3 = wDLView.getContext().getString(R.string.any_sport_draws_short);
                string3.getClass();
                wDLView.c = string3;
            }
        }
    }

    public static wk2 r(String str) {
        Object obj;
        Iterator<E> it = wk2.l.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((wk2) obj).a.equals(str)) {
                break;
            }
        }
        return (wk2) obj;
    }

    public static final void s(Bundle bundle, String str) {
        if (cw3.a.contains(inb.class)) {
            return;
        }
        try {
            bundle.getClass();
            str.getClass();
            bundle.putString("event", str);
            StringBuilder sb = new StringBuilder();
            Locale locale = k0.i;
            String language = locale != null ? locale.getLanguage() : null;
            String str2 = "";
            if (language == null) {
                language = "";
            }
            sb.append(language);
            sb.append('_');
            Locale locale2 = k0.i;
            String country = locale2 != null ? locale2.getCountry() : null;
            if (country == null) {
                country = "";
            }
            sb.append(country);
            bundle.putString("_locale", sb.toString());
            String str3 = k0.h;
            if (str3 == null) {
                str3 = "";
            }
            bundle.putString("_appVersion", str3);
            bundle.putString("_deviceOS", "ANDROID");
            bundle.putString("_platform", "mobile");
            String str4 = Build.MODEL;
            if (str4 == null) {
                str4 = "";
            }
            bundle.putString("_deviceModel", str4);
            bundle.putString("_nativeAppID", w.b());
            String str5 = k0.h;
            if (str5 != null) {
                str2 = str5;
            }
            bundle.putString("_nativeAppShortVersion", str2);
            bundle.putString("_timezone", k0.f);
            bundle.putString("_carrier", k0.g);
            bundle.putString("_deviceOSTypeName", "ANDROID");
            bundle.putString("_deviceOSVersion", Build.VERSION.RELEASE);
            bundle.putLong("_remainingDiskGB", k0.d);
        } catch (Throwable th) {
            cw3.a(inb.class, th);
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(13:0|1|(2:3|(10:5|6|7|(1:(2:10|11)(2:26|27))(5:28|29|(1:31)|32|(1:34))|12|(2:14|(4:16|17|18|(1:23)(2:20|21)))|25|17|18|(0)(0)))|37|6|7|(0)(0)|12|(0)|25|17|18|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:35:0x002b, code lost:
    
        r6 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x0080, code lost:
    
        r7 = defpackage.w2g.b;
        r6 = new defpackage.u2g(r6);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0069 A[Catch: all -> 0x002b, TryCatch #0 {all -> 0x002b, blocks: (B:11:0x0027, B:12:0x0061, B:14:0x0069, B:16:0x0076, B:17:0x007d, B:29:0x0036, B:31:0x0041, B:32:0x004e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:20:0x008e  */
    /* JADX WARN: Removed duplicated region for block: B:23:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:28:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object t(Context context, String str, urh urhVar, sq3 sq3Var) {
        q03 q03Var;
        int i2;
        Object u2gVar;
        nr9 b2;
        if (sq3Var instanceof q03) {
            q03Var = (q03) sq3Var;
            int i3 = q03Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                q03Var.t = i3 - Integer.MIN_VALUE;
                Object obj = q03Var.s;
                lu3 lu3Var = lu3.a;
                i2 = q03Var.t;
                if (i2 != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    ht9 ht9Var = new ht9(context);
                    ht9Var.c = str;
                    if (urhVar != null) {
                        awj[] awjVarArr = {urhVar};
                        sl6 sl6Var = st9.a;
                        st9.b(ht9Var, ph0.X(awjVarArr));
                    }
                    nt9 a = ht9Var.a();
                    apf a2 = ajh.a(context);
                    q03Var.r = context;
                    q03Var.t = 1;
                    obj = a2.c(a, q03Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    context = q03Var.r;
                    y6a.M(obj);
                }
                b2 = ((wt9) obj).b();
                if (b2 != null) {
                    Resources resources = context.getResources();
                    resources.getClass();
                    Drawable t2 = rfo.t(b2, resources);
                    if (t2 != null) {
                        u2gVar = u6h.U(t2, 0, 0, 7);
                        p2g p2gVar2 = w2g.b;
                        if (u2gVar instanceof u2g) {
                            return null;
                        }
                        return u2gVar;
                    }
                }
                u2gVar = null;
                p2g p2gVar22 = w2g.b;
                if (u2gVar instanceof u2g) {
                }
            }
        }
        q03Var = new q03(sq3Var);
        Object obj2 = q03Var.s;
        lu3 lu3Var2 = lu3.a;
        i2 = q03Var.t;
        if (i2 != 0) {
        }
        b2 = ((wt9) obj2).b();
        if (b2 != null) {
        }
        u2gVar = null;
        p2g p2gVar222 = w2g.b;
        if (u2gVar instanceof u2g) {
        }
    }

    public static Bitmap w(Context context, String str) {
        Bitmap.Config config = Bitmap.Config.ARGB_8888;
        context.getClass();
        config.getClass();
        return (Bitmap) td4.t0(g.a, new g2(context, str, config, (rq3) null, 22));
    }

    public static Intent x(Context context, int i2, Intent intent) {
        context.getClass();
        Intent intent2 = new Intent(context, (Class<?>) MmaOrganisationActivity.class);
        if (intent != null) {
            intent2.putExtras(intent);
        }
        intent2.putExtra("ORGANISATION_ID", i2);
        if (context instanceof csk) {
            context = ((csk) context).getBaseContext();
        }
        BaseActivity baseActivity = context instanceof BaseActivity ? (BaseActivity) context : null;
        intent2.putExtra("screen_name", baseActivity != null ? baseActivity.u() : null);
        intent2.putExtra("tab_name", baseActivity != null ? baseActivity.C : null);
        return intent2;
    }

    public static Intent y(Context context, j67 j67Var, ev6 ev6Var, boolean z) {
        context.getClass();
        j67Var.getClass();
        Intent intent = new Intent(context, (Class<?>) FantasyLeagueActivity.class);
        intent.putExtra("FANTASY_LEAGUE_EXTRA", j67Var);
        intent.putExtra("FANTASY_COMPETITION_EXTRA", ev6Var);
        intent.putExtra("FANTASY_LEAGUE_POSITION_ON_SETTINGS", z);
        return intent;
    }

    public static final String z(JSONObject jSONObject) {
        if (!cw3.a.contains(inb.class)) {
            try {
                Iterator<String> keys = jSONObject.keys();
                if (keys.hasNext()) {
                    return keys.next();
                }
            } catch (Throwable th) {
                cw3.a(inb.class, th);
                return null;
            }
        }
        return null;
    }

    @Override // defpackage.meh
    public Object c() {
        switch (this.a) {
            case 25:
                ScheduledExecutorService newScheduledThreadPool = Executors.newScheduledThreadPool(1, n49.e("grpc-timer-%d"));
                try {
                    newScheduledThreadPool.getClass().getMethod("setRemoveOnCancelPolicy", Boolean.TYPE).invoke(newScheduledThreadPool, Boolean.TRUE);
                } catch (NoSuchMethodException unused) {
                } catch (RuntimeException e2) {
                    throw e2;
                } catch (Exception e3) {
                    is8.h(e3);
                    return null;
                }
                return Executors.unconfigurableScheduledExecutorService(newScheduledThreadPool);
            default:
                return Executors.newCachedThreadPool(n49.e("grpc-okhttp-%d"));
        }
    }

    @Override // defpackage.d0l
    public pec d(MemoryCache$Key memoryCache$Key) {
        return null;
    }

    @Override // defpackage.meh
    public void f(Object obj) {
        switch (this.a) {
            case 25:
                ((ScheduledExecutorService) obj).shutdown();
                break;
            default:
                ((ExecutorService) ((Executor) obj)).shutdown();
                break;
        }
    }

    @Override // defpackage.c6h
    public Object getDefaultValue() {
        return new p0d(true);
    }

    @Override // defpackage.ii9
    public pm0 getKey() {
        return bs4.c;
    }

    /* JADX WARN: Multi-variable type inference failed */
    @Override // defpackage.lx2
    public void h(vh9 vh9Var, hoi hoiVar) {
        rq3 rq3Var = null;
        switch (this.a) {
            case 1:
                vh9Var.h.f(rj9.h, new tl((Function2) hoiVar, rq3Var, 0));
                break;
            default:
                vh9Var.e.f(rj9.i, new vpf((ct8) hoiVar, rq3Var, 2));
                break;
        }
    }

    @Override // defpackage.lkk
    public Object i(wga wgaVar, float f2) {
        return Integer.valueOf(Math.round(nha.d(wgaVar) * f2));
    }

    @Override // defpackage.lg0
    public void j(kx4 kx4Var, int i2, int[] iArr, ema emaVar, int[] iArr2) {
        int length = iArr.length;
        int i3 = 0;
        int i4 = 0;
        int i5 = 0;
        while (i3 < length) {
            int i6 = iArr[i3];
            iArr2[i4] = i5;
            i5 += i6;
            i3++;
            i4++;
        }
    }

    @Override // defpackage.ii9
    public void k(Object obj, vh9 vh9Var) {
        bs4 bs4Var = (bs4) obj;
        bs4Var.getClass();
        vh9Var.e.f(rj9.i, new br3(bs4Var, null));
    }

    @Override // defpackage.ii9
    public Object l(Function1 function1) {
        function1.getClass();
        return new bs4(function1);
    }

    @Override // defpackage.evk
    public int m() {
        return R.id.view_tree_view_model_store_owner;
    }

    @Override // defpackage.pjd
    public Object n() {
        return new LinkedHashSet();
    }

    /* JADX WARN: Can't wrap try/catch for region: R(11:0|1|(2:3|(7:5|6|7|(1:(1:(6:11|12|13|(1:15)|16|17)(2:20|21))(2:22|23))(6:30|31|32|33|(1:35)|28)|24|25|26))|41|6|7|(0)(0)|24|25|26|(1:(0))) */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0079, code lost:
    
        if (r6 != r8) goto L33;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:30:0x003f  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0024  */
    /* JADX WARN: Type inference failed for: r7v0, types: [l48] */
    /* JADX WARN: Type inference failed for: r7v1 */
    /* JADX WARN: Type inference failed for: r7v11 */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v18 */
    /* JADX WARN: Type inference failed for: r7v19 */
    /* JADX WARN: Type inference failed for: r7v2 */
    /* JADX WARN: Type inference failed for: r7v20 */
    /* JADX WARN: Type inference failed for: r7v3 */
    /* JADX WARN: Type inference failed for: r7v6, types: [java.lang.String] */
    /* JADX WARN: Type inference failed for: r7v7 */
    /* JADX WARN: Type inference failed for: r7v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object q(l48 l48Var, sq3 sq3Var) {
        m5a m5aVar;
        int i2;
        k48 k48Var;
        String str;
        if (sq3Var instanceof m5a) {
            m5aVar = (m5a) sq3Var;
            int i3 = m5aVar.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                m5aVar.u = i3 - Integer.MIN_VALUE;
                Object obj = m5aVar.s;
                lu3 lu3Var = lu3.a;
                i2 = m5aVar.u;
                String str2 = "";
                if (i2 != 0) {
                    y6a.M(obj);
                    k48 k48Var2 = (k48) l48Var;
                    Task d2 = k48Var2.d();
                    try {
                        d2.getClass();
                        m5aVar.r = k48Var2;
                        m5aVar.u = 1;
                        Object j2 = v8a.j(d2, m5aVar);
                        if (j2 != lu3Var) {
                            l48Var = k48Var2;
                            obj = j2;
                        }
                    } catch (Exception unused) {
                        l48Var = k48Var2;
                        k48Var = l48Var;
                        str = "";
                        Task c2 = k48Var.c();
                        c2.getClass();
                        m5aVar.r = str;
                        m5aVar.u = 2;
                        obj = v8a.j(c2, m5aVar);
                        l48Var = str;
                    }
                    return lu3Var;
                }
                if (i2 != 1) {
                    if (i2 != 2) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    String str3 = (String) m5aVar.r;
                    y6a.M(obj);
                    l48Var = str3;
                    String str4 = (String) obj;
                    if (str4 != null) {
                        str2 = str4;
                    }
                    return new n5a(str2, l48Var);
                }
                l48 l48Var2 = (l48) m5aVar.r;
                y6a.M(obj);
                l48Var = l48Var2;
                String str5 = ((mu0) obj).a;
                str5.getClass();
                k48 k48Var3 = l48Var;
                str = str5;
                k48Var = k48Var3;
                Task c22 = k48Var.c();
                c22.getClass();
                m5aVar.r = str;
                m5aVar.u = 2;
                obj = v8a.j(c22, m5aVar);
                l48Var = str;
            }
        }
        m5aVar = new m5a(this, sq3Var);
        Object obj2 = m5aVar.s;
        lu3 lu3Var2 = lu3.a;
        i2 = m5aVar.u;
        String str22 = "";
        if (i2 != 0) {
        }
        String str52 = ((mu0) obj2).a;
        str52.getClass();
        k48 k48Var32 = l48Var;
        str = str52;
        k48Var = k48Var32;
        Task c222 = k48Var.c();
        c222.getClass();
        m5aVar.r = str;
        m5aVar.u = 2;
        obj2 = v8a.j(c222, m5aVar);
        l48Var = str;
    }

    @Override // defpackage.c6h
    public Object readFrom(InputStream inputStream, rq3 rq3Var) {
        byte[] bArr;
        inputStream.getClass();
        try {
            k5f o2 = k5f.o(inputStream);
            p0d p0dVar = new p0d(false);
            f5f[] f5fVarArr = (f5f[]) Arrays.copyOf(new f5f[0], 0);
            p0dVar.b();
            if (f5fVarArr.length > 0) {
                f5f f5fVar = f5fVarArr[0];
                throw null;
            }
            Map l2 = o2.l();
            l2.getClass();
            for (Map.Entry entry : l2.entrySet()) {
                String str = (String) entry.getKey();
                o5f o5fVar = (o5f) entry.getValue();
                str.getClass();
                o5fVar.getClass();
                int u = o5fVar.u();
                switch (u == 0 ? -1 : h5f.a[wt3.C(u)]) {
                    case -1:
                        throw new uu3("Value case is null.", null);
                    case 0:
                    default:
                        zzl.b();
                        return null;
                    case 1:
                        p0dVar.f(new e5f(str), Boolean.valueOf(o5fVar.l()));
                        break;
                    case 2:
                        p0dVar.f(new e5f(str), Float.valueOf(o5fVar.p()));
                        break;
                    case 3:
                        p0dVar.f(new e5f(str), Double.valueOf(o5fVar.o()));
                        break;
                    case 4:
                        p0dVar.f(new e5f(str), Integer.valueOf(o5fVar.q()));
                        break;
                    case 5:
                        p0dVar.f(new e5f(str), Long.valueOf(o5fVar.r()));
                        break;
                    case 6:
                        p0dVar.f(new e5f(str), o5fVar.s());
                        break;
                    case 7:
                        e5f e5fVar = new e5f(str);
                        t7a n2 = o5fVar.t().n();
                        n2.getClass();
                        p0dVar.f(e5fVar, CollectionsKt.W0(n2));
                        break;
                    case 8:
                        e5f e5fVar2 = new e5f(str);
                        ec2 m2 = o5fVar.m();
                        int size = m2.size();
                        if (size == 0) {
                            bArr = w7a.b;
                        } else {
                            byte[] bArr2 = new byte[size];
                            m2.m(size, bArr2);
                            bArr = bArr2;
                        }
                        p0dVar.f(e5fVar2, bArr);
                        break;
                    case 9:
                        throw new uu3("Value not set.", null);
                }
            }
            return p0dVar.h();
        } catch (naa e2) {
            throw new uu3("Unable to parse preferences proto.", e2);
        }
    }

    public String toString() {
        switch (this.a) {
            case 5:
                return "NoDeclaredBrand";
            case 16:
                return "AbsoluteArrangement#Left";
            default:
                return super.toString();
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(16:0|1|(2:3|(12:5|6|7|(1:(2:10|11)(2:33|34))(5:35|36|(1:38)|39|(1:41))|12|(1:14)(1:32)|15|(1:17)(1:31)|(1:30)(1:21)|22|23|(1:28)(2:25|26)))|44|6|7|(0)(0)|12|(0)(0)|15|(0)(0)|(1:19)|30|22|23|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:42:0x002c, code lost:
    
        r4 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:43:0x008d, code lost:
    
        r5 = defpackage.w2g.b;
        r4 = new defpackage.u2g(r4);
     */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0066 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x005e, B:14:0x0066, B:15:0x0073, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x008a, B:36:0x0037, B:38:0x0042, B:39:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0077 A[Catch: all -> 0x002c, TryCatch #0 {all -> 0x002c, blocks: (B:11:0x0028, B:12:0x005e, B:14:0x0066, B:15:0x0073, B:17:0x0077, B:19:0x007d, B:21:0x0083, B:22:0x008a, B:36:0x0037, B:38:0x0042, B:39:0x0049), top: B:7:0x0020 }] */
    /* JADX WARN: Removed duplicated region for block: B:25:0x009b  */
    /* JADX WARN: Removed duplicated region for block: B:28:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:31:0x007a  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x0072  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0034  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object u(Context context, String str, kjh kjhVar, Bitmap.Config config, sq3 sq3Var) {
        r03 r03Var;
        int i2;
        Object u2gVar;
        nr9 b2;
        Drawable drawable;
        Bitmap bitmap;
        if (sq3Var instanceof r03) {
            r03Var = (r03) sq3Var;
            int i3 = r03Var.v;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                r03Var.v = i3 - Integer.MIN_VALUE;
                Object obj = r03Var.t;
                lu3 lu3Var = lu3.a;
                i2 = r03Var.v;
                if (i2 != 0) {
                    y6a.M(obj);
                    p2g p2gVar = w2g.b;
                    ht9 ht9Var = new ht9(context);
                    ht9Var.c = str;
                    if (kjhVar != null) {
                        ht9Var.p = new jpf(kjhVar);
                    }
                    nt9 a = ht9Var.a();
                    apf a2 = ajh.a(context);
                    r03Var.r = context;
                    r03Var.s = config;
                    r03Var.v = 1;
                    obj = a2.c(a, r03Var);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    config = r03Var.s;
                    context = r03Var.r;
                    y6a.M(obj);
                }
                b2 = ((wt9) obj).b();
                if (b2 == null) {
                    Resources resources = context.getResources();
                    resources.getClass();
                    drawable = rfo.t(b2, resources);
                } else {
                    drawable = null;
                }
                BitmapDrawable bitmapDrawable = !(drawable instanceof BitmapDrawable) ? (BitmapDrawable) drawable : null;
                u2gVar = (bitmapDrawable != null || (bitmap = bitmapDrawable.getBitmap()) == null) ? null : bitmap.copy(config, false);
                p2g p2gVar2 = w2g.b;
                if (u2gVar instanceof u2g) {
                    return u2gVar;
                }
                return null;
            }
        }
        r03Var = new r03(this, sq3Var);
        Object obj2 = r03Var.t;
        lu3 lu3Var2 = lu3.a;
        i2 = r03Var.v;
        if (i2 != 0) {
        }
        b2 = ((wt9) obj2).b();
        if (b2 == null) {
        }
        if (!(drawable instanceof BitmapDrawable)) {
        }
        if (bitmapDrawable != null) {
        }
        p2g p2gVar22 = w2g.b;
        if (u2gVar instanceof u2g) {
        }
    }

    @Override // defpackage.c6h
    public Object writeTo(Object obj, OutputStream outputStream, rq3 rq3Var) {
        hw8 a;
        Map a2 = ((p0d) obj).a();
        i5f n2 = k5f.n();
        for (Map.Entry entry : a2.entrySet()) {
            e5f e5fVar = (e5f) entry.getKey();
            Object value = entry.getValue();
            String str = e5fVar.a;
            if (value instanceof Boolean) {
                n5f v = o5f.v();
                boolean booleanValue = ((Boolean) value).booleanValue();
                v.c();
                ((o5f) v.b).w(booleanValue);
                a = v.a();
            } else if (value instanceof Float) {
                n5f v2 = o5f.v();
                float floatValue = ((Number) value).floatValue();
                v2.c();
                ((o5f) v2.b).z(floatValue);
                a = v2.a();
            } else if (value instanceof Double) {
                n5f v3 = o5f.v();
                double doubleValue = ((Number) value).doubleValue();
                v3.c();
                ((o5f) v3.b).y(doubleValue);
                a = v3.a();
            } else if (value instanceof Integer) {
                n5f v4 = o5f.v();
                int intValue = ((Number) value).intValue();
                v4.c();
                ((o5f) v4.b).A(intValue);
                a = v4.a();
            } else if (value instanceof Long) {
                n5f v5 = o5f.v();
                long longValue = ((Number) value).longValue();
                v5.c();
                ((o5f) v5.b).B(longValue);
                a = v5.a();
            } else if (value instanceof String) {
                n5f v6 = o5f.v();
                v6.c();
                ((o5f) v6.b).C((String) value);
                a = v6.a();
            } else if (value instanceof Set) {
                n5f v7 = o5f.v();
                l5f o2 = m5f.o();
                o2.c();
                ((m5f) o2.b).l((Set) value);
                v7.c();
                ((o5f) v7.b).D((m5f) o2.a());
                a = v7.a();
            } else {
                if (!(value instanceof byte[])) {
                    a70.r("PreferencesSerializer does not support type: ".concat(value.getClass().getName()));
                    return null;
                }
                n5f v8 = o5f.v();
                byte[] bArr = (byte[]) value;
                ec2 e2 = ec2.e(0, bArr.length, bArr);
                v8.c();
                ((o5f) v8.b).x(e2);
                a = v8.a();
            }
            n2.getClass();
            str.getClass();
            n2.c();
            ((k5f) n2.b).m().put(str, (o5f) a);
        }
        k5f k5fVar = (k5f) n2.a();
        int a3 = k5fVar.a(null);
        Logger logger = h03.f;
        if (a3 > 4096) {
            a3 = 4096;
        }
        h03 h03Var = new h03(outputStream, a3);
        k5fVar.b(h03Var);
        if (h03Var.d > 0) {
            h03Var.k();
        }
        return Unit.a;
    }

    @Override // defpackage.bw1
    public long a(long j2) {
        return j2;
    }

    @Override // defpackage.d0l
    public void b(int i2) {
    }

    @Override // defpackage.d0l
    public void g(MemoryCache$Key memoryCache$Key, Bitmap bitmap, Map map, int i2) {
    }
}
