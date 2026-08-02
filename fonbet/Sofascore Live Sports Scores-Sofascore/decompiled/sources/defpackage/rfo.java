package defpackage;

import android.R;
import android.app.Activity;
import android.app.AlertDialog;
import android.content.Context;
import android.content.Intent;
import android.content.res.ColorStateList;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Color;
import android.graphics.Matrix;
import android.graphics.Shader;
import android.graphics.drawable.BitmapDrawable;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.os.Build;
import android.view.View;
import android.view.ViewGroup;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.bytedance.sdk.openadsdk.TTAdConstant;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.crowdsourcing.CrowdsourcingContribution;
import com.sofascore.model.mvvm.model.Sport;
import com.sofascore.model.mvvm.model.Team;
import com.sofascore.model.newNetwork.Highlight;
import com.sofascore.results.event.media.VideoActivity;
import com.sofascore.results.fantasy.ui.components.FantasyLeaderboardStatistic;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncement;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementLocation;
import com.sofascore.results.firebase.announcement.FantasyRemoteAnnouncementSeverity;
import com.sofascore.results.service.VideoWorker;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.lang.reflect.Array;
import java.time.format.DateTimeFormatter;
import java.time.format.DecimalStyle;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Calendar;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Locale;
import java.util.Set;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.coroutines.CoroutineContext;
import kotlin.coroutines.g;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract /* synthetic */ class rfo implements vh2 {
    public static final Object[] a = new Object[0];
    public static final tc3 b = new tc3(-137184388, new qs2(28), false);
    public static final tc3 c = new tc3(1586260288, new qs2(29), false);
    public static final tc3 d = new tc3(-725845824, new pr1(7), false);
    public static final tc3 e = new tc3(1219580973, new pd3(0), false);
    public static final tc3 f = new tc3(-1059509128, new pd3(1), false);
    public static final tc3 g = new tc3(1005176219, new pd3(25), false);
    public static final ld0 h = new ld0(120, Sdk.SDKError.Reason.TPAT_ERROR_VALUE, 18);
    public static final int[] i = {R.attr.state_pressed};
    public static final int[] j = {R.attr.state_focused};
    public static final int[] k = {R.attr.state_selected, R.attr.state_pressed};
    public static final int[] l = {R.attr.state_selected};
    public static final int[] m = {R.attr.state_enabled, R.attr.state_pressed};
    public static final /* synthetic */ int n = 0;
    public static final /* synthetic */ int o = 0;
    public static final /* synthetic */ int p = 0;
    public static final /* synthetic */ int q = 0;
    public static final /* synthetic */ int r = 0;

    public static final void A(eyc eycVar, uj2 uj2Var, n52 n52Var, float f2, qah qahVar, v8j v8jVar, ja5 ja5Var) {
        ArrayList arrayList = eycVar.h;
        int size = arrayList.size();
        for (int i2 = 0; i2 < size; i2++) {
            c8e c8eVar = (c8e) arrayList.get(i2);
            c8eVar.a.g(uj2Var, n52Var, f2, qahVar, v8jVar, ja5Var);
            uj2Var.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, c8eVar.a.b());
        }
    }

    public static final FantasyRemoteAnnouncement B(List list, FantasyRemoteAnnouncementLocation fantasyRemoteAnnouncementLocation, Integer num, String str, String str2) {
        Object obj;
        list.getClass();
        fantasyRemoteAnnouncementLocation.getClass();
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : list) {
            FantasyRemoteAnnouncement fantasyRemoteAnnouncement = (FantasyRemoteAnnouncement) obj2;
            if (fantasyRemoteAnnouncement.getLocation() == fantasyRemoteAnnouncementLocation || fantasyRemoteAnnouncement.getLocation() == FantasyRemoteAnnouncementLocation.EVERYWHERE) {
                arrayList.add(obj2);
            }
        }
        ArrayList arrayList2 = new ArrayList();
        for (Object obj3 : arrayList) {
            FantasyRemoteAnnouncement fantasyRemoteAnnouncement2 = (FantasyRemoteAnnouncement) obj3;
            if (fantasyRemoteAnnouncement2.getCompetitions().isEmpty() || CollectionsKt.R(fantasyRemoteAnnouncement2.getCompetitions(), num)) {
                arrayList2.add(obj3);
            }
        }
        ArrayList arrayList3 = new ArrayList();
        for (Object obj4 : arrayList2) {
            FantasyRemoteAnnouncement fantasyRemoteAnnouncement3 = (FantasyRemoteAnnouncement) obj4;
            boolean z = true;
            if (fantasyRemoteAnnouncement3.getUsers().isEmpty() || fantasyRemoteAnnouncement3.getCountries().isEmpty()) {
                if (!fantasyRemoteAnnouncement3.getUsers().isEmpty()) {
                    z = CollectionsKt.R(fantasyRemoteAnnouncement3.getUsers(), str2);
                } else if (!fantasyRemoteAnnouncement3.getCountries().isEmpty()) {
                    z = CollectionsKt.R(fantasyRemoteAnnouncement3.getCountries(), str);
                }
            } else if (!CollectionsKt.R(fantasyRemoteAnnouncement3.getUsers(), str2) && !CollectionsKt.R(fantasyRemoteAnnouncement3.getCountries(), str)) {
                z = false;
            }
            if (z) {
                arrayList3.add(obj4);
            }
        }
        Iterator it = arrayList3.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                FantasyRemoteAnnouncementSeverity severity = ((FantasyRemoteAnnouncement) next).getSeverity();
                do {
                    Object next2 = it.next();
                    FantasyRemoteAnnouncementSeverity severity2 = ((FantasyRemoteAnnouncement) next2).getSeverity();
                    if (severity.compareTo(severity2) < 0) {
                        next = next2;
                        severity = severity2;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        return (FantasyRemoteAnnouncement) obj;
    }

    public static DateTimeFormatter C(String str, Locale locale, LinkedHashMap linkedHashMap) {
        StringBuilder r2 = mz1.r("P:", str);
        r2.append(locale.toLanguageTag());
        String sb = r2.toString();
        Object obj = linkedHashMap.get(sb);
        if (obj == null) {
            obj = DateTimeFormatter.ofPattern(str, locale).withDecimalStyle(DecimalStyle.of(locale));
            linkedHashMap.put(sb, obj);
        }
        obj.getClass();
        return (DateTimeFormatter) obj;
    }

    public static int D(ColorStateList colorStateList, int[] iArr) {
        int colorForState = colorStateList != null ? colorStateList.getColorForState(iArr, colorStateList.getDefaultColor()) : 0;
        return o23.k(colorForState, Math.min(Color.alpha(colorForState) * 2, 255));
    }

    public static boolean E(Context context) {
        ((mc4) ((lo8) l98.T(context, lo8.class))).getClass();
        int i2 = vv9.c;
        ewf ewfVar = ewf.j;
        o3a.p(ewfVar.h <= 1, "Cannot bind the flag @DisableFragmentGetContextFix more than once.", new Object[0]);
        if (ewfVar.isEmpty()) {
            return true;
        }
        return ((Boolean) ewfVar.iterator().next()).booleanValue();
    }

    public static final void F(List list) {
        list.getClass();
        for (Object obj : list) {
            if (obj instanceof Highlight) {
                ia0 ia0Var = ia0.q;
                udl h2 = ok3.p().h();
                Set set = h2.k;
                if (set == null) {
                    set = (Set) td4.t0(g.a, new ndl(h2, null, 3));
                }
                Highlight highlight = (Highlight) obj;
                if (set.contains(Integer.valueOf(highlight.getId()))) {
                    highlight.markWatched();
                }
            }
        }
    }

    public static final void G(Highlight highlight, Activity activity, Function0 function0, String str) {
        highlight.getClass();
        activity.getClass();
        if (highlight.isDirectStream() && !y05.a(activity)) {
            int i2 = VideoActivity.M;
            String directStreamUrl = highlight.getDirectStreamUrl();
            if (directStreamUrl == null) {
                directStreamUrl = "";
            }
            String thumbnailUrl = highlight.getThumbnailUrl();
            String str2 = thumbnailUrl != null ? thumbnailUrl : "";
            Intent intent = new Intent(activity, (Class<?>) VideoActivity.class);
            intent.putExtra("video_url", directStreamUrl);
            intent.putExtra("thumbnail_url", str2);
            activity.startActivity(intent);
            return;
        }
        int mediaType = highlight.getMediaType();
        if (mediaType != 1 && mediaType != 6) {
            H(highlight, activity, function0, str);
            return;
        }
        if (activity.isFinishing()) {
            return;
        }
        AlertDialog create = new AlertDialog.Builder(activity, com.sofascore.results.R.style.DialogStyle).create();
        View inflate = activity.getLayoutInflater().inflate(com.sofascore.results.R.layout.dialog_sofa_disclaimer, (ViewGroup) null, false);
        int i3 = com.sofascore.results.R.id.disclaimer_text;
        TextView textView = (TextView) nq8.B(com.sofascore.results.R.id.disclaimer_text, inflate);
        if (textView != null) {
            i3 = com.sofascore.results.R.id.disclaimer_url;
            TextView textView2 = (TextView) nq8.B(com.sofascore.results.R.id.disclaimer_url, inflate);
            if (textView2 != null) {
                textView.setText(com.sofascore.results.R.string.media_disclaimer_body);
                textView2.setPaintFlags(textView2.getPaintFlags() | 8);
                textView2.setText(highlight.getSourceUrl());
                create.setView((LinearLayout) inflate);
                create.setIcon(com.sofascore.results.R.mipmap.ic_launcher_sofascore);
                create.setTitle(com.sofascore.results.R.string.media_disclaimer_header);
                create.setButton(-1, activity.getString(com.sofascore.results.R.string.play_video), new jn(highlight, activity, function0, create, 1));
                create.setButton(-2, activity.getString(com.sofascore.results.R.string.cancel), new i0(create, 11));
                create.show();
                return;
            }
        }
        yhk.s("Missing required view with ID: ".concat(inflate.getResources().getResourceName(i3)));
    }

    /* JADX WARN: Removed duplicated region for block: B:10:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:13:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static void H(Highlight highlight, Activity activity, Function0 function0, String str) {
        if (activity == null || activity.isFinishing()) {
            return;
        }
        if (str != null) {
            try {
            } catch (Exception unused) {
                Calendar calendar = ke0.a;
                ke0.g(activity, activity.getString(com.sofascore.results.R.string.web_browser_error), 0);
            }
            if (highlight.getMediaType() == 2) {
                Uri build = Uri.parse(highlight.getUrl()).buildUpon().appendQueryParameter("utm_source", "sofascore.app").appendQueryParameter("utm_medium", "android").appendQueryParameter("utm_content", str).appendQueryParameter("utm_campaign", "app referrals").build();
                build.getClass();
                activity.startActivity(new Intent("android.intent.action.VIEW", build));
                if (highlight.getWatched()) {
                    highlight.markWatched();
                    Pair[] pairArr = {new Pair("WATCHED_ID", Integer.valueOf(highlight.getId()))};
                    hpo hpoVar = new hpo(18);
                    Pair pair = pairArr[0];
                    hpoVar.B(pair.b, (String) pair.a);
                    md4 l2 = hpoVar.l();
                    ktd g2 = vxd.g(VideoWorker.class, l2);
                    Context applicationContext = activity.getApplicationContext();
                    applicationContext.getClass();
                    xbl d2 = xbl.d(applicationContext);
                    d2.getClass();
                    d2.b("VideoWorker-".concat(mha.o(l2)), nf6.a, (ltd) g2.a());
                    function0.invoke();
                    return;
                }
                return;
            }
        }
        Uri parse = Uri.parse(highlight.getUrl());
        parse.getClass();
        activity.startActivity(new Intent("android.intent.action.VIEW", parse));
        if (highlight.getWatched()) {
        }
    }

    public static final wt9 I(View view) {
        wt9 wt9Var;
        cvk Q = aik.Q(view);
        synchronized (Q) {
            ggf ggfVar = Q.b;
            wt9Var = null;
            Object obj = null;
            if (ggfVar != null) {
                try {
                    obj = ((av4) ggfVar.b).G();
                } catch (Throwable unused) {
                }
                wt9Var = (wt9) obj;
            }
        }
        return wt9Var;
    }

    public static ColorStateList J(ColorStateList colorStateList) {
        if (colorStateList == null) {
            return ColorStateList.valueOf(0);
        }
        if (Build.VERSION.SDK_INT <= 27 && Color.alpha(colorStateList.getDefaultColor()) == 0) {
            Color.alpha(colorStateList.getColorForState(m, 0));
        }
        return colorStateList;
    }

    public static final int K(a2h a2hVar, int i2) {
        int i3;
        int[] iArr = a2hVar.f;
        int i4 = i2 + 1;
        int length = a2hVar.e.length - 1;
        int i5 = 0;
        while (true) {
            if (i5 <= length) {
                i3 = (i5 + length) >>> 1;
                int i6 = iArr[i3];
                if (i6 >= i4) {
                    if (i6 <= i4) {
                        break;
                    }
                    length = i3 - 1;
                } else {
                    i5 = i3 + 1;
                }
            } else {
                i3 = (-i5) - 1;
                break;
            }
        }
        return i3 >= 0 ? i3 : ~i3;
    }

    public static boolean L(Context context) {
        context.getClass();
        return zu3.r.hasMcc(Integer.valueOf(ke0.c)) && !xld.e(context) && xld.g(context);
    }

    public static final Object[] M(Collection collection) {
        collection.getClass();
        int size = collection.size();
        Object[] objArr = a;
        if (size == 0) {
            return objArr;
        }
        Iterator it = collection.iterator();
        if (!it.hasNext()) {
            return objArr;
        }
        Object[] objArr2 = new Object[size];
        int i2 = 0;
        while (true) {
            int i3 = i2 + 1;
            objArr2[i2] = it.next();
            if (i3 >= objArr2.length) {
                if (!it.hasNext()) {
                    return objArr2;
                }
                int i4 = ((i3 * 3) + 1) >>> 1;
                if (i4 <= i3) {
                    i4 = 2147483645;
                    if (i3 >= 2147483645) {
                        throw new OutOfMemoryError();
                    }
                }
                objArr2 = Arrays.copyOf(objArr2, i4);
            } else if (!it.hasNext()) {
                return Arrays.copyOf(objArr2, i3);
            }
            i2 = i3;
        }
    }

    public static final Object[] N(Collection collection, Object[] objArr) {
        Object[] objArr2;
        collection.getClass();
        objArr.getClass();
        int size = collection.size();
        int i2 = 0;
        if (size != 0) {
            Iterator it = collection.iterator();
            if (it.hasNext()) {
                if (size <= objArr.length) {
                    objArr2 = objArr;
                } else {
                    Object newInstance = Array.newInstance(objArr.getClass().getComponentType(), size);
                    newInstance.getClass();
                    objArr2 = (Object[]) newInstance;
                }
                while (true) {
                    int i3 = i2 + 1;
                    objArr2[i2] = it.next();
                    if (i3 >= objArr2.length) {
                        if (!it.hasNext()) {
                            return objArr2;
                        }
                        int i4 = ((i3 * 3) + 1) >>> 1;
                        if (i4 <= i3) {
                            i4 = 2147483645;
                            if (i3 >= 2147483645) {
                                throw new OutOfMemoryError();
                            }
                        }
                        objArr2 = Arrays.copyOf(objArr2, i4);
                    } else if (!it.hasNext()) {
                        if (objArr2 != objArr) {
                            return Arrays.copyOf(objArr2, i3);
                        }
                        objArr[i3] = null;
                        return objArr;
                    }
                    i2 = i3;
                }
            } else if (objArr.length > 0) {
                objArr[0] = null;
            }
        } else if (objArr.length > 0) {
            objArr[0] = null;
            return objArr;
        }
        return objArr;
    }

    public static Bitmap O(nr9 nr9Var) {
        int width = nr9Var.getWidth();
        int height = nr9Var.getHeight();
        boolean z = nr9Var instanceof ax1;
        Bitmap.Config config = z ? ((ax1) nr9Var).a.getConfig() : null;
        if (config == null) {
            config = Bitmap.Config.ARGB_8888;
        }
        if (z) {
            Bitmap bitmap = ((ax1) nr9Var).a;
            if (bitmap.getWidth() == width && bitmap.getHeight() == height && bitmap.getConfig() == config) {
                return bitmap;
            }
        }
        Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
        nr9Var.c(new Canvas(createBitmap));
        return createBitmap;
    }

    public static String P(int i2) {
        return i2 == 0 ? "Clear" : i2 == 1 ? "Src" : i2 == 2 ? "Dst" : i2 == 3 ? "SrcOver" : i2 == 4 ? "DstOver" : i2 == 5 ? "SrcIn" : i2 == 6 ? "DstIn" : i2 == 7 ? "SrcOut" : i2 == 8 ? "DstOut" : i2 == 9 ? "SrcAtop" : i2 == 10 ? "DstAtop" : i2 == 11 ? "Xor" : i2 == 12 ? "Plus" : i2 == 13 ? "Modulate" : i2 == 14 ? "Screen" : i2 == 15 ? "Overlay" : i2 == 16 ? "Darken" : i2 == 17 ? "Lighten" : i2 == 18 ? "ColorDodge" : i2 == 19 ? "ColorBurn" : i2 == 20 ? "HardLight" : i2 == 21 ? "Softlight" : i2 == 22 ? "Difference" : i2 == 23 ? "Exclusion" : i2 == 24 ? "Multiply" : i2 == 25 ? "Hue" : i2 == 26 ? "Saturation" : i2 == 27 ? "Color" : i2 == 28 ? "Luminosity" : "Unknown";
    }

    public static final void a(tc3 tc3Var, tc3 tc3Var2, f41 f41Var, xtc xtcVar, String str, String str2, Function1 function1, Function0 function0, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        av8 av8Var2;
        boolean z;
        utc utcVar;
        function1.getClass();
        function0.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(-876023929);
        if ((i2 & 6) == 0) {
            i3 = (av8Var3.i(tc3Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var3.i(tc3Var2) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var3.g(f41Var) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var3.g(xtcVar) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var3.g(str) ? 16384 : 8192;
        }
        if ((196608 & i2) == 0) {
            i3 |= av8Var3.g(str2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var3.i(function1) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var3.i(function0) ? 8388608 : 4194304;
        }
        int i4 = i3;
        if (av8Var3.T(i4 & 1, (i4 & 4793491) != 4793490)) {
            xtc d0 = l98.d0(n9e.q(xtcVar, lz.D(com.sofascore.results.R.color.surface_1, av8Var3), oyn.e), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1);
            Object O = av8Var3.O();
            if (O == nf3.a) {
                O = new hdd();
                av8Var3.n0(O);
            }
            xtc w = oyn.w(d0, false, null, (hdd) O, function0, 7);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, w);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m2, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            tc3Var.invoke(av8Var3, Integer.valueOf(i4 & 14));
            tc3Var2.invoke(av8Var3, Integer.valueOf((i4 >> 3) & 14));
            utc utcVar2 = utc.a;
            if (str == null || str.length() == 0) {
                av8Var2 = av8Var3;
                z = false;
                utcVar = utcVar2;
                av8Var2.d0(-1134368143);
                av8Var2.s(false);
            } else {
                av8Var3.d0(-1134579873);
                xtc f0 = l98.f0(utcVar2, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                utcVar = utcVar2;
                yf8 yf8Var = xth.a;
                z = false;
                udj.c(str, f0, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var3, ((i4 >> 12) & 14) | 48, 0, 131064);
                av8Var2 = av8Var3;
                av8Var2.s(false);
            }
            if (str2 == null || str2.length() == 0) {
                av8Var2.d0(-1134052687);
                av8Var2.s(z);
            } else {
                av8Var2.d0(-1134304779);
                xtc f02 = l98.f0(utcVar, 16.0f, (str == null || str.length() == 0) ? 16.0f : 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12);
                yf8 yf8Var2 = xth.a;
                av8 av8Var4 = av8Var2;
                udj.c(str2, f02, lz.D(com.sofascore.results.R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.f(), av8Var4, (i4 >> 15) & 14, 0, 131064);
                av8Var2 = av8Var4;
                av8Var2.s(z);
            }
            av8 av8Var5 = av8Var2;
            pco.p(f41Var.f().a, f41Var.f().b, f41Var.f().c, f41Var.getG(), l98.f0(utcVar, 16.0f, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12), "main_stacked_card", 0L, true, function1, null, av8Var5, (234881024 & (i4 << 6)) | 12804096, 576);
            av8Var = av8Var5;
            av8Var.s(true);
        } else {
            av8Var = av8Var3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new e41(tc3Var, tc3Var2, f41Var, xtcVar, str, str2, function1, function0, i2);
        }
    }

    public static final void b(CrowdsourcingContribution crowdsourcingContribution, Integer num, of3 of3Var, int i2) {
        boolean z;
        boolean z2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1630540096);
        int i3 = (av8Var.i(crowdsourcingContribution) ? 4 : 2) | i2 | (av8Var.g(num) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            n7g c2 = o7g.c(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 16.0f, 3);
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, d0);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc e2 = bkh.e(bkh.d(utcVar, 1.0f), 1.0f);
            long D = lz.D(com.sofascore.results.R.color.n_lv_5, av8Var);
            uah uahVar = oyn.e;
            nq8.h(av8Var, n9e.q(e2, D, uahVar));
            if (crowdsourcingContribution != null) {
                av8Var.d0(285155661);
                long D2 = lz.D(com.sofascore.results.R.color.surface_1, av8Var);
                if (num == null) {
                    uahVar = c2;
                }
                z = false;
                hkg.f(crowdsourcingContribution, l98.c0(n9e.q(utcVar, D2, uahVar), 16.0f, 4.0f), av8Var, i3 & 14, 0);
                av8Var.s(false);
            } else {
                z = false;
                av8Var.d0(285462220);
                av8Var.s(false);
            }
            if (num != null) {
                av8Var.d0(285521120);
                xtc f0 = l98.f0(l98.d0(n9e.q(bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var), c2), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 5);
                l8g a3 = k8g.a(ww9.f, uxf.m, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C2 = fqj.C(av8Var, f0);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, a3, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_crowdsourcing, 6, av8Var), null, bkh.l(utcVar, 16.0f), lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), av8Var, 432, 0);
                nq8.h(av8Var, bkh.p(utcVar, 8.0f));
                String v = oea.v(num.intValue(), av8Var);
                yf8 yf8Var = xth.a;
                z2 = true;
                udj.c(v, null, lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131066);
                av8Var = av8Var;
                av8Var.s(true);
                av8Var.s(false);
            } else {
                z2 = true;
                av8Var.d0(286424460);
                av8Var.s(z);
            }
            av8Var.s(z2);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new vn6(crowdsourcingContribution, num, i2, 28);
        }
    }

    public static final void c(r9k r9kVar, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        r9kVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1159007493);
        int i3 = (av8Var.g(r9kVar) ? 4 : 2) | i2 | 48;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(wnn.A(l98.b0(utcVar, 8.0f), o7g.a(8.0f)), lz.D(com.sofascore.results.R.color.surface_2, av8Var), oyn.e), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_info, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            String a3 = r9kVar.a(av8Var);
            long D = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            yf8 yf8Var = xth.a;
            q5a.w(a3, new goa(1.0f, true), D, null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.g(), av8Var, 0, 0, 131064);
            av8Var = av8Var;
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new ns4(r9kVar, xtcVar2, i2, 14);
        }
    }

    public static final void d(qug qugVar, xtc xtcVar, Function1 function1, mei meiVar, nei neiVar, tc3 tc3Var, boolean z, Function1 function12, of3 of3Var, int i2) {
        boolean z2;
        Function1 function13;
        pm3 pm3Var;
        e1d e1dVar;
        qugVar.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(257469331);
        int i3 = 2;
        int i4 = i2 | (av8Var.g(qugVar) ? 4 : 2) | (av8Var.g(xtcVar) ? 32 : 16) | (av8Var.i(function1) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.e(meiVar == null ? -1 : meiVar.ordinal()) ? a.o : 1024) | (av8Var.e(neiVar != null ? neiVar.ordinal() : -1) ? 16384 : 8192) | 114819072;
        if (av8Var.T(i4 & 1, (38347923 & i4) != 38347922)) {
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = new yt6(5);
                av8Var.n0(O);
            }
            function13 = (Function1) O;
            View view = (View) av8Var.k(nz.f);
            cdi P = z1a.P(qugVar, av8Var);
            xtc q2 = n9e.q(bkh.d(xtcVar, 1.0f), lz.D(com.sofascore.results.R.color.surface_1, av8Var), oyn.e);
            av8Var.d0(-1003410150);
            av8Var.d0(212064437);
            av8Var.s(false);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = new t1c(kx4Var);
                av8Var.n0(O2);
            }
            t1c t1cVar = (t1c) O2;
            Object O3 = av8Var.O();
            if (O3 == obj) {
                O3 = new am3();
                av8Var.n0(O3);
            }
            am3 am3Var = (am3) O3;
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = e.f(Boolean.FALSE);
                av8Var.n0(O4);
            }
            e1d e1dVar2 = (e1d) O4;
            Object O5 = av8Var.O();
            if (O5 == obj) {
                O5 = new pm3(am3Var);
                av8Var.n0(O5);
            }
            pm3 pm3Var2 = (pm3) O5;
            Object O6 = av8Var.O();
            if (O6 == obj) {
                O6 = e.e(Unit.a, f7a.k);
                av8Var.n0(O6);
            }
            e1d e1dVar3 = (e1d) O6;
            boolean i5 = av8Var.i(t1cVar) | av8Var.e(257);
            Object O7 = av8Var.O();
            if (i5 || O7 == obj) {
                O7 = new kd3(e1dVar3, t1cVar, pm3Var2, e1dVar2, 2);
                pm3Var = pm3Var2;
                e1dVar = e1dVar2;
                av8Var.n0(O7);
            } else {
                pm3Var = pm3Var2;
                e1dVar = e1dVar2;
            }
            k1c k1cVar = (k1c) O7;
            Object O8 = av8Var.O();
            if (O8 == obj) {
                O8 = new ld3(e1dVar, pm3Var, i3);
                av8Var.n0(O8);
            }
            Function0 function0 = (Function0) O8;
            boolean i6 = av8Var.i(t1cVar);
            Object O9 = av8Var.O();
            if (i6 || O9 == obj) {
                O9 = new md3(t1cVar, i3);
                av8Var.n0(O9);
            }
            s6a.h(o3h.a(q2, false, (Function1) O9), yqo.H(1200550679, av8Var, new bx6(e1dVar3, am3Var, function0, tc3Var, P, qugVar, view, function13, meiVar, function1, neiVar)), k1cVar, av8Var, 48);
            av8Var.s(false);
            z2 = true;
        } else {
            av8Var.W();
            z2 = z;
            function13 = function12;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new hi4(qugVar, xtcVar, function1, meiVar, neiVar, tc3Var, z2, function13, i2, 1);
        }
    }

    public static final void e(gv9 gv9Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        gv9Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1578057761);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function0) ? 32 : 16;
        }
        int i4 = i3 | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            lv1 lv1Var = uxf.m;
            long D = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (O == obj) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = b74.E;
                av8Var.n0(O2);
            }
            xtc b0 = l98.b0(tol.y(xtcVar, true, true, true, D, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 23), av8Var, 0), 16.0f);
            wxf wxfVar = ww9.b;
            l8g a2 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(com.sofascore.results.R.string.legend, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(com.sofascore.results.R.color.primary_default, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, (dfj) xth.v.getValue(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            kq9.b(s6a.N(com.sofascore.results.R.drawable.ic_info, 6, av8Var), null, ljg.i(utcVar, 2.0f, av8Var, utcVar, 16.0f), lz.D(com.sofascore.results.R.color.primary_default, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            nq8.h(av8Var, new goa(1.0f, true));
            av8Var.d0(-1562283766);
            Iterator<E> it = gv9Var.iterator();
            while (it.hasNext()) {
                FantasyLeaderboardStatistic fantasyLeaderboardStatistic = (FantasyLeaderboardStatistic) it.next();
                av8Var.a0(-1242029406, fantasyLeaderboardStatistic);
                String v2 = oea.v(fantasyLeaderboardStatistic.a, av8Var);
                yf8 yf8Var2 = xth.a;
                av8 av8Var2 = av8Var;
                fqj.a(v2, xth.m(), lz.D(com.sofascore.results.R.color.n_lv_3, av8Var), bkh.p(utcVar, fantasyLeaderboardStatistic.c), new p7j(3), av8Var2, 0, 0);
                av8Var = av8Var2;
                av8Var.s(false);
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b30(gv9Var, function0, xtcVar, i2, 25);
        }
    }

    public static final void f(vt7 vt7Var, Function0 function0, xtc xtcVar, of3 of3Var, int i2) {
        xtc xtcVar2;
        float f2;
        utc utcVar;
        int i3;
        float f3;
        vt7Var.getClass();
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-733256441);
        int i4 = i2 | (av8Var.g(vt7Var) ? 4 : 2) | (av8Var.i(function0) ? 32 : 16) | 384;
        int i5 = 0;
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            boolean z = (i4 & 14) == 4;
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (z || O == obj) {
                O = new qo6(vt7Var, 23);
                av8Var.n0(O);
            }
            pr4 b2 = c6e.b(0, (Function0) O, av8Var, 0, 3);
            Object O2 = av8Var.O();
            if (O2 == obj) {
                O2 = hz8.G(g.a, av8Var);
                av8Var.n0(O2);
            }
            ku3 ku3Var = (ku3) O2;
            Locale locale = ((Configuration) av8Var.k(nz.a)).getLocales().get(0);
            boolean g2 = av8Var.g(b2);
            Object O3 = av8Var.O();
            if (g2 || O3 == obj) {
                O3 = goh.b(new jt7(b2, i5));
                av8Var.n0(O3);
            }
            cdi cdiVar = (cdi) O3;
            float b3 = llf.b(((Number) cdiVar.getValue()).floatValue(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f) * 0.5f;
            boolean z2 = b2.k() == b.i(vt7Var.d());
            xtc q2 = n9e.q(ml4.f0(ml4.q0(bkh.c)), lz.D(com.sofascore.results.R.color.surface_1, av8Var), oyn.e);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            utc utcVar2 = utc.a;
            xtc c0 = l98.c0(bkh.d(utcVar2, 1.0f), 16.0f, 12.0f);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            boolean z3 = z2;
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(vt7Var.c(), av8Var);
            locale.getClass();
            String upperCase = v.toUpperCase(locale);
            upperCase.getClass();
            yf8 yf8Var = xth.a;
            udj.c(upperCase, new goa(1.0f, true), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 0, 0, 131064);
            udj.c(String.format(dla.d(), "%d/%d", Arrays.copyOf(new Object[]{Integer.valueOf(b2.k() + 1), Integer.valueOf(vt7Var.d().size())}, 2)), l98.d0(utcVar2, 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), lz.D(com.sofascore.results.R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.b(), av8Var, 48, 0, 131064);
            ImageVector N = s6a.N(com.sofascore.results.R.drawable.ic_close, 6, av8Var);
            long D = lz.D(com.sofascore.results.R.color.n_lv_1, av8Var);
            xtc l2 = bkh.l(utcVar2, 24.0f);
            long D2 = lz.D(com.sofascore.results.R.color.n_lv_4, av8Var);
            Object O4 = av8Var.O();
            if (O4 == obj) {
                O4 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O4;
            Object[] objArr = new Object[0];
            Object O5 = av8Var.O();
            if (O5 == obj) {
                O5 = o67.j;
                av8Var.n0(O5);
            }
            kq9.b(N, null, tol.y(l2, true, true, true, D2, wzcVar, new gm(function0, (boh) o3a.N(objArr, (Function0) O5, av8Var, 48), 27), av8Var, 0), D, av8Var, 48, 0);
            av8Var.s(true);
            h(llf.b((((Number) cdiVar.getValue()).floatValue() + 1.0f) / vt7Var.d().size(), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f), 48, av8Var, bkh.d(utcVar2, 1.0f));
            f6a.a(b2, new goa(1.0f, true), null, null, 0, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, false, null, null, null, yqo.H(253351422, av8Var, new jw5(vt7Var, 1)), av8Var, 0, 24576, 16380);
            xtc f0 = l98.f0(bkh.d(utcVar2, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, 5);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            String v2 = oea.v(com.sofascore.results.R.string.button_previous, av8Var);
            mv1 mv1Var = uxf.f;
            n12 n12Var = n12.a;
            xtc C4 = u6h.C(l98.d0(bkh.d(n12Var.a(utcVar2, mv1Var), b3), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), llf.b(b3 * 2.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 1.0f));
            boolean i6 = av8Var.i(ku3Var) | av8Var.g(b2);
            Object O6 = av8Var.O();
            if (i6 || O6 == obj) {
                O6 = new d61(ku3Var, b2, 1);
                av8Var.n0(O6);
            }
            boolean z4 = false;
            mha.h(v2, (Function0) O6, C4, gqh.a, null, false, false, false, 0L, 1, 0, av8Var, 805309440, 0, 1520);
            String v3 = oea.v(z3 ? com.sofascore.results.R.string.got_it_button : com.sofascore.results.R.string.button_next, av8Var);
            boolean h2 = av8Var.h(z3);
            if ((i4 & 112) == 32) {
                z4 = true;
            }
            boolean i7 = h2 | z4 | av8Var.i(ku3Var) | av8Var.g(b2);
            Object O7 = av8Var.O();
            if (i7 || O7 == obj) {
                f2 = 1.0f;
                utcVar = utcVar2;
                i3 = 2;
                f3 = 0.0f;
                b93 b93Var = new b93(z3, function0, ku3Var, b2, 2);
                av8Var.n0(b93Var);
                O7 = b93Var;
            } else {
                f2 = 1.0f;
                utcVar = utcVar2;
                i3 = 2;
                f3 = 0.0f;
            }
            mha.h(v3, (Function0) O7, l98.d0(bkh.d(n12Var.a(utcVar, uxf.h), f2 - b3), 16.0f, f3, i3), null, null, false, false, false, 0L, 0, 0, av8Var, 0, 0, IronSourceError.ERROR_INIT_ALREADY_FINISHED);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new uu6(vt7Var, function0, xtcVar2, i2, 21);
        }
    }

    public static final void h(float f2, int i2, of3 of3Var, xtc xtcVar) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-65836433);
        int i3 = (av8Var.d(f2) ? 4 : 2) | i2;
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            xtc e2 = bkh.e(xtcVar, 4.0f);
            long D = lz.D(com.sofascore.results.R.color.primary_highlight, av8Var);
            jf9 jf9Var = oyn.e;
            xtc q2 = n9e.q(e2, D, jf9Var);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, q2);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            e12.a(0, av8Var, n9e.q(bkh.d(bkh.c(utc.a, 1.0f), f2), lz.D(com.sofascore.results.R.color.primary_default, av8Var), jf9Var));
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new w73(f2, i2, i4, xtcVar);
        }
    }

    public static final void i(int i2, Team team, xtc xtcVar, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        int i5;
        xtc xtcVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1447225013);
        int i6 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.i(team) ? 32 : 16);
        int i7 = i4 & 4;
        if (i7 != 0) {
            i5 = i6 | 384;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i6 | (av8Var.g(xtcVar2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        }
        if (av8Var.T(i5 & 1, (i5 & 147) != 146)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i7 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var.k(nz.b);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.p;
            xtc f0 = l98.f0(bkh.d(xtcVar4, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            long D = lz.D(com.sofascore.results.R.color.on_color_highlight_2, av8Var);
            f0.getClass();
            xtc X = td4.X(f0, new yz(D, 23));
            u23 a2 = t23.a(p4hVar, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, X);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            xtc f02 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 54);
            xtc xtcVar5 = xtcVar4;
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f02);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            td4.G(team.getId(), ljg.i(utcVar, 16.0f, av8Var, utcVar, 40.0f), false, 0L, av8Var, 48, 12);
            w1l.o(1.0f, true, av8Var);
            Set set = wyh.a;
            Sport sport = team.getSport();
            kq9.b(s6a.N(wyh.a(sport != null ? sport.getSlug() : null), 6, av8Var), null, bkh.l(utcVar, 34.0f), lz.D(com.sofascore.results.R.color.on_color_highlight_1, av8Var), av8Var, 432, 0);
            bf3.u(utcVar, 12.0f, av8Var, true);
            xtc f03 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13);
            l8g a4 = k8g.a(wxfVar, lv1Var, av8Var, 54);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, f03);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a4, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            String valueOf2 = String.valueOf(i2 + 1);
            yf8 yf8Var = xth.a;
            udj.c(valueOf2, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            udj.c(tba.p(context, team), null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.j(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new wx1(i2, team, xtcVar3, i3, i4, 11);
        }
    }

    public static final void j(int i2, Team team, boolean z, xtc xtcVar, of3 of3Var, int i3, int i4) {
        xtc xtcVar2;
        int i5;
        xtc xtcVar3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1047442117);
        int i6 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.i(team) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        int i7 = i4 & 8;
        if (i7 != 0) {
            i5 = i6 | 3072;
            xtcVar2 = xtcVar;
        } else {
            xtcVar2 = xtcVar;
            i5 = i6 | (av8Var.g(xtcVar2) ? a.o : 1024);
        }
        if (av8Var.T(i5 & 1, (i5 & 1171) != 1170)) {
            utc utcVar = utc.a;
            xtc xtcVar4 = i7 != 0 ? utcVar : xtcVar2;
            Context context = (Context) av8Var.k(nz.b);
            xtc d2 = bkh.d(xtcVar4, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, a2, f50Var);
            ff3 ff3Var = hf3.f;
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            lv1 lv1Var = uxf.m;
            wxf wxfVar = ww9.b;
            xtc c0 = l98.c0(bkh.d(utcVar, 1.0f), 8.0f, 16.0f);
            l8g a3 = k8g.a(wxfVar, lv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String valueOf2 = String.valueOf(i2 + 1);
            yf8 yf8Var = xth.a;
            xtc xtcVar5 = xtcVar4;
            udj.c(valueOf2, null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 0, 0, 131066);
            td4.G(team.getId(), ljg.i(utcVar, 8.0f, av8Var, utcVar, 32.0f), false, 0L, av8Var, 48, 12);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            udj.c(tba.p(context, team), null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.l(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            w1l.o(1.0f, true, av8Var);
            Set set = wyh.a;
            Sport sport = team.getSport();
            kq9.b(s6a.N(wyh.a(sport != null ? sport.getSlug() : null), 6, av8Var), null, bkh.l(utcVar, 20.0f), lz.D(com.sofascore.results.R.color.on_color_highlight_1, av8Var), av8Var, 432, 0);
            av8Var.s(true);
            if (z) {
                av8Var.d0(1150507527);
                av8Var.s(false);
            } else {
                bf3.r(8.0f, 1150279770, av8Var, av8Var, utcVar);
                td4.w(bkh.d(utcVar, 1.0f), 1.0f, hkg.b(653323999), av8Var, 438, 0);
                av8Var = av8Var;
                av8Var.s(false);
            }
            av8Var.s(true);
            xtcVar3 = xtcVar5;
        } else {
            av8Var.W();
            xtcVar3 = xtcVar2;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x80(i2, team, z, xtcVar3, i3, i4, 11);
        }
    }

    public static final void k(v23 v23Var, ooj oojVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1036242987);
        int i4 = (i2 & 6) == 0 ? i2 | (av8Var.g(v23Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(oojVar) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(40.0f, utcVar, true));
            q9k q9kVar = oojVar.f;
            List list = oojVar.b;
            String a2 = q9kVar.a(av8Var);
            yf8 yf8Var = xth.a;
            i3 = 1;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, v23Var.a(78.0f, utcVar, true));
            av8Var.d0(-602890469);
            int i5 = 0;
            for (Object obj : CollectionsKt.L0(list, 5)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                j(i5, (Team) obj, i5 == list.size() - 1, null, av8Var, 0, 8);
                i5 = i6;
            }
            av8Var.s(false);
            nq8.h(av8Var, v23Var.a(117.0f, utcVar, true));
        } else {
            i3 = 1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new poj(v23Var, oojVar, i2, i3);
        }
    }

    public static final void l(e9i e9iVar, ooj oojVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(331694692);
        int i3 = (i2 & 6) == 0 ? i2 | (av8Var.g(e9iVar) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(oojVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            q9k q9kVar = oojVar.a;
            List list = oojVar.b;
            String a3 = q9kVar.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj i4 = xth.i();
            long D = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            udj.c(a3, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, i4, av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 48.0f));
            av8Var.d0(422213827);
            int i5 = 0;
            for (Object obj : CollectionsKt.L0(list, 5)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                Team team = (Team) obj;
                float a4 = e9iVar.a((i5 * TTAdConstant.STYLE_SIZE_RADIO_3_2) + 1000, 1000);
                float f2 = (0.1f * a4) + 0.9f;
                boolean z = i5 == list.size() - 1;
                boolean d2 = av8Var.d(a4) | av8Var.d(f2);
                Object O = av8Var.O();
                if (d2 || O == nf3.a) {
                    O = new n28(27, a4, f2);
                    av8Var.n0(O);
                }
                j(i5, team, z, s02.M(utcVar, (Function1) O), av8Var, 0, 0);
                i5 = i6;
            }
            av8Var.s(false);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qoj(e9iVar, oojVar, i2, 2);
        }
    }

    public static final void m(v23 v23Var, ooj oojVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1299301244);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(v23Var) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(oojVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Team team = (Team) CollectionsKt.Y(oojVar.b);
            Context context = (Context) av8Var.k(nz.b);
            utc utcVar = utc.a;
            xtc a2 = v23Var.a(1.0f, utcVar, true);
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, a2);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar = hf3.k;
            waa.J(av8Var, ryVar);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            Set set = wyh.a;
            Sport sport = team.getSport();
            ImageVector N = s6a.N(wyh.a(sport != null ? sport.getSlug() : null), 6, av8Var);
            long D = lz.D(com.sofascore.results.R.color.on_color_highlight_2, av8Var);
            g28 g28Var = bkh.c;
            kq9.b(N, null, g28Var, D, av8Var, 432, 0);
            u23 a3 = t23.a(ww9.f, uxf.p, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, g28Var);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            x23 x23Var = x23.a;
            nq8.h(av8Var, x23Var.a(40.0f, utcVar, true));
            String a4 = oojVar.f.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a4, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, x23Var.a(160.0f, utcVar, true));
            td4.G(team.getId(), bkh.l(utcVar, 92.0f), false, 0L, av8Var, 48, 12);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            udj.c(tba.p(context, team), null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            nq8.h(av8Var, x23Var.a(176.0f, utcVar, true));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new poj(v23Var, oojVar, i2, 2);
        }
    }

    public static final void n(e9i e9iVar, ooj oojVar, of3 of3Var, int i2) {
        int i3;
        ry ryVar;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(285235895);
        if ((i2 & 6) == 0) {
            i3 = i2 | (av8Var.g(e9iVar) ? 4 : 2);
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(oojVar) ? 32 : 16;
        }
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            Team team = (Team) CollectionsKt.Y(oojVar.b);
            Context context = (Context) av8Var.k(nz.b);
            g28 g28Var = bkh.c;
            k1c c2 = e12.c(uxf.c, false);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C = fqj.C(av8Var, g28Var);
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
            waa.K(av8Var, m2, ff3Var);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var2 = hf3.j;
            waa.K(av8Var, valueOf, f50Var2);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var3 = hf3.d;
            waa.K(av8Var, C, f50Var3);
            float a2 = e9iVar.a(1000, 500);
            float f2 = (0.1f * a2) + 0.9f;
            Set set = wyh.a;
            Sport sport = team.getSport();
            ImageVector N = s6a.N(wyh.a(sport != null ? sport.getSlug() : null), 6, av8Var);
            long D = lz.D(com.sofascore.results.R.color.on_color_highlight_2, av8Var);
            boolean d2 = av8Var.d(a2) | av8Var.d(f2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (d2 || O == a99Var) {
                ryVar = ryVar2;
                O = new n28(29, a2, f2);
                av8Var.n0(O);
            } else {
                ryVar = ryVar2;
            }
            ry ryVar3 = ryVar;
            kq9.b(N, null, s02.M(g28Var, (Function1) O), D, av8Var, 48, 0);
            p4h p4hVar = ww9.d;
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(g28Var, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a3 = t23.a(p4hVar, kv1Var, av8Var, 54);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar3);
            waa.K(av8Var, C2, f50Var3);
            x23 x23Var = x23.a;
            utc utcVar = utc.a;
            nq8.h(av8Var, x23Var.a(140.0f, utcVar, true));
            String a4 = oojVar.a.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a4, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            nq8.h(av8Var, x23Var.a(60.0f, utcVar, true));
            boolean d3 = av8Var.d(a2) | av8Var.d(f2);
            Object O2 = av8Var.O();
            if (d3 || O2 == a99Var) {
                O2 = new roj(0, a2, f2);
                av8Var.n0(O2);
            }
            xtc M = s02.M(utcVar, (Function1) O2);
            u23 a5 = t23.a(p4hVar, kv1Var, av8Var, 48);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C3 = fqj.C(av8Var, M);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar3);
            waa.K(av8Var, C3, f50Var3);
            td4.G(team.getId(), bkh.l(utcVar, 92.0f), false, 0L, av8Var, 48, 12);
            nq8.h(av8Var, bkh.e(utcVar, 8.0f));
            udj.c(tba.p(context, team), null, lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
            nq8.h(av8Var, x23Var.a(200.0f, utcVar, true));
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qoj(e9iVar, oojVar, i2, 0);
        }
    }

    public static final void o(e9i e9iVar, ooj oojVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-282944858);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(e9iVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(oojVar) ? 32 : 16;
        }
        int i4 = 1;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            List list = oojVar.b;
            if (list.size() >= 5) {
                av8Var.d0(-1327065702);
                l(e9iVar, oojVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            } else if (list.size() < 3 || list.size() >= 5) {
                av8Var.d0(-1327062059);
                n(e9iVar, oojVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            } else {
                av8Var.d0(-1327063269);
                r(e9iVar, oojVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qoj(e9iVar, oojVar, i2, i4);
        }
    }

    public static final void p(v23 v23Var, ooj oojVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-305548455);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(v23Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(oojVar) ? 32 : 16;
        }
        int i4 = 0;
        if (av8Var.T(i3 & 1, (i3 & 19) != 18)) {
            List list = oojVar.b;
            if (list.size() >= 5) {
                av8Var.d0(-1574285932);
                k(v23Var, oojVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            } else if (list.size() < 3 || list.size() >= 5) {
                av8Var.d0(-1574281841);
                m(v23Var, oojVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            } else {
                av8Var.d0(-1574283275);
                q(v23Var, oojVar, av8Var, i3 & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new poj(v23Var, oojVar, i2, i4);
        }
    }

    public static final void q(v23 v23Var, ooj oojVar, of3 of3Var, int i2) {
        ooj oojVar2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1588590665);
        int i4 = (i2 & 6) == 0 ? i2 | (av8Var.g(v23Var) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(oojVar) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            utc utcVar = utc.a;
            nq8.h(av8Var, v23Var.a(40.0f, utcVar, true));
            String a2 = oojVar.f.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a2, bkh.d(utcVar, 1.0f), lz.D(com.sofascore.results.R.color.on_color_primary, av8Var), null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, xth.i(), av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, v23Var.a(84.0f, utcVar, true));
            av8Var.d0(1922250705);
            oojVar2 = oojVar;
            i3 = 3;
            int i5 = 0;
            for (Object obj : CollectionsKt.L0(oojVar2.b, 3)) {
                int i6 = i5 + 1;
                if (i5 < 0) {
                    b.q();
                    throw null;
                }
                i(i5, (Team) obj, null, av8Var, 0, 4);
                nq8.h(av8Var, bkh.e(utcVar, 24.0f));
                i5 = i6;
            }
            av8Var.s(false);
            nq8.h(av8Var, v23Var.a(108.0f, utcVar, true));
        } else {
            oojVar2 = oojVar;
            i3 = 3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new poj(v23Var, oojVar2, i2, i3);
        }
    }

    public static final void r(e9i e9iVar, ooj oojVar, of3 of3Var, int i2) {
        e9i e9iVar2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-379113966);
        int i4 = (i2 & 6) == 0 ? i2 | (av8Var.g(e9iVar) ? 4 : 2) : i2;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(oojVar) ? 32 : 16;
        }
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            kg0 kg0Var = ww9.f;
            kv1 kv1Var = uxf.p;
            xtc d0 = l98.d0(bkh.c, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            u23 a2 = t23.a(kg0Var, kv1Var, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
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
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            String a3 = oojVar.a.a(av8Var);
            yf8 yf8Var = xth.a;
            dfj i5 = xth.i();
            long D = lz.D(com.sofascore.results.R.color.on_color_primary, av8Var);
            utc utcVar = utc.a;
            i3 = 3;
            udj.c(a3, bkh.d(utcVar, 1.0f), D, null, 0L, null, 0L, null, new p7j(3), 0L, 0, false, 0, 0, null, i5, av8Var, 48, 0, 130040);
            av8Var = av8Var;
            nq8.h(av8Var, bkh.e(utcVar, 48.0f));
            av8Var.d0(-2144688705);
            int i6 = 0;
            for (Object obj : CollectionsKt.L0(oojVar.b, 3)) {
                int i7 = i6 + 1;
                if (i6 < 0) {
                    b.q();
                    throw null;
                }
                Team team = (Team) obj;
                float a4 = e9iVar.a((i6 * TTAdConstant.STYLE_SIZE_RADIO_3_2) + 1000, 1000);
                float f2 = (0.1f * a4) + 0.9f;
                boolean d2 = av8Var.d(a4) | av8Var.d(f2);
                Object O = av8Var.O();
                if (d2 || O == nf3.a) {
                    O = new n28(28, a4, f2);
                    av8Var.n0(O);
                }
                i(i6, team, s02.M(utcVar, (Function1) O), av8Var, 0, 0);
                nq8.h(av8Var, bkh.e(utcVar, 24.0f));
                i6 = i7;
            }
            e9iVar2 = e9iVar;
            av8Var.s(false);
            av8Var.s(true);
        } else {
            e9iVar2 = e9iVar;
            i3 = 3;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new qoj(e9iVar2, oojVar, i2, i3);
        }
    }

    public static final String s(Highlight highlight) {
        highlight.getClass();
        if (highlight.isDirectStream()) {
            zu[] zuVarArr = zu.a;
            return "directStream";
        }
        zu[] zuVarArr2 = zu.a;
        return "youtube";
    }

    public static final Drawable t(nr9 nr9Var, Resources resources) {
        return nr9Var instanceof ra5 ? ((ra5) nr9Var).a : nr9Var instanceof ax1 ? new BitmapDrawable(resources, ((ax1) nr9Var).a) : new bb(nr9Var, 1);
    }

    public static final nr9 u(Drawable drawable) {
        return drawable instanceof BitmapDrawable ? new ax1(((BitmapDrawable) drawable).getBitmap()) : new ra5(drawable);
    }

    public static final e1d v(z88 z88Var, Object obj, of3 of3Var, int i2) {
        u6b u6bVar = (u6b) ((av8) of3Var).k(mhb.a);
        e6b e6bVar = e6b.a;
        return w(z88Var, obj, u6bVar.getLifecycle(), g.a, of3Var, i2 & 112);
    }

    public static final e1d w(z88 z88Var, Object obj, g6b g6bVar, CoroutineContext coroutineContext, of3 of3Var, int i2) {
        e6b e6bVar = e6b.d;
        Object[] objArr = {z88Var, g6bVar, e6bVar, coroutineContext};
        av8 av8Var = (av8) of3Var;
        boolean i3 = ((((i2 & 7168) ^ 3072) > 2048 && av8Var.e(e6bVar.ordinal())) || (i2 & 3072) == 2048) | av8Var.i(g6bVar) | av8Var.i(coroutineContext) | av8Var.i(z88Var);
        Object O = av8Var.O();
        rq3 rq3Var = null;
        a99 a99Var = nf3.a;
        if (i3 || O == a99Var) {
            O = new u1(g6bVar, coroutineContext, z88Var, (rq3) null);
            av8Var.n0(O);
        }
        Function2 function2 = (Function2) O;
        Object O2 = av8Var.O();
        if (O2 == a99Var) {
            O2 = e.f(obj);
            av8Var.n0(O2);
        }
        e1d e1dVar = (e1d) O2;
        Object[] copyOf = Arrays.copyOf(objArr, 4);
        boolean i4 = av8Var.i(function2);
        Object O3 = av8Var.O();
        if (i4 || O3 == a99Var) {
            O3 = new hoh(function2, e1dVar, rq3Var, 2);
            av8Var.n0(O3);
        }
        hz8.r(copyOf, (Function2) O3, av8Var);
        return e1dVar;
    }

    public static final e1d x(ddi ddiVar, of3 of3Var, int i2) {
        u6b u6bVar = (u6b) ((av8) of3Var).k(mhb.a);
        e6b e6bVar = e6b.a;
        g gVar = g.a;
        Object value = ddiVar.getValue();
        g6b lifecycle = u6bVar.getLifecycle();
        int i3 = i2 & 14;
        int i4 = i2 << 3;
        return w(ddiVar, value, lifecycle, gVar, of3Var, i3 | (i4 & 7168) | (i4 & 57344));
    }

    public static final float y(long j2, long j3) {
        return Math.min(Float.intBitsToFloat((int) (j3 >> 32)) / Float.intBitsToFloat((int) (j2 >> 32)), Float.intBitsToFloat((int) (j3 & 4294967295L)) / Float.intBitsToFloat((int) (j2 & 4294967295L)));
    }

    public static final void z(eyc eycVar, uj2 uj2Var, n52 n52Var, float f2, qah qahVar, v8j v8jVar, ja5 ja5Var) {
        uj2Var.o();
        ArrayList arrayList = eycVar.h;
        if (arrayList.size() <= 1) {
            A(eycVar, uj2Var, n52Var, f2, qahVar, v8jVar, ja5Var);
        } else if (n52Var instanceof pvh) {
            A(eycVar, uj2Var, n52Var, f2, qahVar, v8jVar, ja5Var);
        } else {
            if (!(n52Var instanceof oah)) {
                zzl.b();
                return;
            }
            int size = arrayList.size();
            float f3 = 0.0f;
            float f4 = 0.0f;
            for (int i2 = 0; i2 < size; i2++) {
                c8e c8eVar = (c8e) arrayList.get(i2);
                f4 += c8eVar.a.b();
                f3 = Math.max(f3, c8eVar.a.d());
            }
            Shader b2 = ((oah) n52Var).b((Float.floatToRawIntBits(f3) << 32) | (Float.floatToRawIntBits(f4) & 4294967295L));
            Matrix matrix = new Matrix();
            b2.getLocalMatrix(matrix);
            int size2 = arrayList.size();
            for (int i3 = 0; i3 < size2; i3++) {
                x10 x10Var = ((c8e) arrayList.get(i3)).a;
                x10Var.g(uj2Var, new o52(b2), f2, qahVar, v8jVar, ja5Var);
                uj2Var.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, x10Var.b());
                matrix.setTranslate(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, -x10Var.b());
                b2.setLocalMatrix(matrix);
            }
        }
        uj2Var.h();
    }
}
