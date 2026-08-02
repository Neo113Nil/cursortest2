package defpackage;

import android.app.Notification;
import android.app.job.JobParameters;
import android.content.Context;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.graphics.Canvas;
import android.graphics.NinePatch;
import android.graphics.Paint;
import android.graphics.Path;
import android.graphics.Rect;
import android.graphics.RectF;
import android.graphics.RenderEffect;
import android.graphics.RenderNode;
import android.graphics.Shader;
import android.graphics.Typeface;
import android.graphics.fonts.Font;
import android.location.Location;
import android.media.AudioDescriptor;
import android.media.MediaDrm;
import android.media.MediaFormat;
import android.media.metrics.LogSessionId;
import android.net.NetworkRequest;
import android.os.Build;
import android.telephony.TelephonyManager;
import android.util.LongSparseArray;
import android.view.Display;
import android.view.DisplayCutout;
import android.view.RoundedCorner;
import android.view.View;
import android.view.WindowInsets;
import android.view.translation.TranslationRequestValue;
import android.view.translation.TranslationResponseValue;
import android.view.translation.ViewTranslationRequest;
import android.view.translation.ViewTranslationResponse;
import android.widget.EdgeEffect;
import androidx.work.impl.background.systemjob.SystemJobService;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgxm;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;
import java.util.WeakHashMap;
import java.util.concurrent.Executor;
import java.util.function.Consumer;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class qz {
    public static void A(RenderNode renderNode, qy1 qy1Var) {
        renderNode.setRenderEffect(qy1Var != null ? qy1Var.a() : null);
    }

    public static void B(View view, qy1 qy1Var) {
        view.setRenderEffect(qy1Var != null ? qy1Var.a() : null);
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0039  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String C(ug8 ug8Var, Context context) {
        int i;
        int i2;
        List list = ug8Var.a;
        ox4 e = wnn.e(context);
        if (Build.VERSION.SDK_INT >= 31) {
            i2 = context.getResources().getConfiguration().fontWeightAdjustment;
            if (i2 != Integer.MAX_VALUE) {
                i = context.getResources().getConfiguration().fontWeightAdjustment;
                if (i != 0) {
                    return ycb.a(list, null, new jie(e), 31);
                }
                if (list.size() > 0) {
                    list.get(0).getClass();
                    pvd.j();
                    return null;
                }
                return (list.isEmpty() ? "" : "".concat(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)) + "'wght' " + llf.b(i + 400.0f, 1.0f, 1000.0f);
            }
        }
        i = 0;
        if (i != 0) {
        }
    }

    public static int[] D(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] transportTypes = networkRequest.getTransportTypes();
        transportTypes.getClass();
        return transportTypes;
    }

    public static zzgxm E(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            mio mioVar = zzgxm.b;
            return s.e;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(nvo.c).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor f = a70.f(it.next());
            if (f.getStandard() == 1) {
                byte[] descriptor = f.getDescriptor();
                int length = descriptor.length;
                if (length != 3) {
                    x5n.p(length, "Invalid SAD length: ", new StringBuilder(String.valueOf(length).length() + 20));
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(zzfm.e(i)));
                    }
                }
            }
        }
        return zzgxm.x(treeSet);
    }

    public static String F(Context context, String str, ArrayList arrayList) {
        if (Build.VERSION.SDK_INT <= 30 && !Build.VERSION.CODENAME.equals(PlayerKt.VOLLEYBALL_SETTER)) {
            return null;
        }
        n8p q = n8p.q();
        context.getPackageManager().requestChecksums(str, false, 8, arrayList, new hmn(q, 2));
        return (String) q.get();
    }

    public static int[] a(NetworkRequest networkRequest) {
        networkRequest.getClass();
        int[] capabilities = networkRequest.getCapabilities();
        capabilities.getClass();
        return capabilities;
    }

    public static EdgeEffect b(Context context) {
        try {
            return new EdgeEffect(context, null);
        } catch (Throwable unused) {
            return new EdgeEffect(context);
        }
    }

    public static RenderEffect c(int i, float f, float f2) {
        return (f == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT && f2 == UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) ? RenderEffect.createOffsetEffect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) : RenderEffect.createBlurEffect(f, f2, lz.P(i));
    }

    public static void d(Context context, mbd mbdVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            kbd kbdVar = new kbd(mbdVar, 0);
            telephonyManager.registerTelephonyCallback(context.getMainExecutor(), kbdVar);
            telephonyManager.unregisterTelephonyCallback(kbdVar);
        } catch (RuntimeException unused) {
            mbdVar.f(5);
        }
    }

    public static void e(Context context, nbd nbdVar) {
        try {
            TelephonyManager telephonyManager = (TelephonyManager) context.getSystemService("phone");
            telephonyManager.getClass();
            kbd kbdVar = new kbd(nbdVar, 1);
            telephonyManager.registerTelephonyCallback((Executor) nbdVar.c, kbdVar);
            telephonyManager.unregisterTelephonyCallback(kbdVar);
        } catch (RuntimeException unused) {
            nbdVar.j(5);
        }
    }

    public static void f(tz tzVar, LongSparseArray longSparseArray) {
        TranslationResponseValue value;
        CharSequence text;
        u3h u3hVar;
        s3h s3hVar;
        Function1 function1;
        int size = longSparseArray.size();
        for (int i = 0; i < size; i++) {
            long keyAt = longSparseArray.keyAt(i);
            ViewTranslationResponse viewTranslationResponse = (ViewTranslationResponse) longSparseArray.get(keyAt);
            if (viewTranslationResponse != null && (value = viewTranslationResponse.getValue("android:text")) != null && (text = value.getText()) != null && (u3hVar = (u3h) tzVar.d().b((int) keyAt)) != null && (s3hVar = u3hVar.a) != null) {
                Object g = s3hVar.d.a.g(k3h.l);
                if (g == null) {
                    g = null;
                }
                m9 m9Var = (m9) g;
                if (m9Var != null && (function1 = (Function1) m9Var.b) != null) {
                }
            }
        }
    }

    public static void g(Canvas canvas, int[] iArr, int i, float[] fArr, int i2, int i3, Font font, Paint paint) {
        canvas.drawGlyphs(iArr, i, fArr, i2, i3, font, paint);
    }

    public static void h(Canvas canvas, NinePatch ninePatch, Rect rect, Paint paint) {
        canvas.drawPatch(ninePatch, rect, paint);
    }

    public static void i(Canvas canvas, NinePatch ninePatch, RectF rectF, Paint paint) {
        canvas.drawPatch(ninePatch, rectF, paint);
    }

    public static hv9 j(List list) {
        if (Build.VERSION.SDK_INT < 31 || list == null) {
            av9 av9Var = hv9.b;
            return vvf.e;
        }
        TreeSet treeSet = new TreeSet(Comparator.comparing(new mn0(0)).reversed());
        Iterator it = list.iterator();
        while (it.hasNext()) {
            AudioDescriptor f = a70.f(it.next());
            if (f.getStandard() == 1) {
                byte[] descriptor = f.getDescriptor();
                if (descriptor.length != 3) {
                    tgj.d0("Invalid SAD length: " + descriptor.length);
                } else {
                    byte b = descriptor[0];
                    int i = (b & 7) + 1;
                    if (((b >> 3) & 15) == 1) {
                        treeSet.add(Integer.valueOf(nik.t(i)));
                    }
                }
            }
        }
        return hv9.v(treeSet);
    }

    public static Path k(DisplayCutout displayCutout) {
        return displayCutout.getCutoutPath();
    }

    public static float l(EdgeEffect edgeEffect) {
        try {
            return edgeEffect.getDistance();
        } catch (Throwable unused) {
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public static Shader.TileMode m() {
        return Shader.TileMode.DECAL;
    }

    public static m7g n(Display display, int i) {
        RoundedCorner roundedCorner;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || (roundedCorner = display.getRoundedCorner(i)) == null) {
            return null;
        }
        int position = roundedCorner.getPosition();
        if (position != 0) {
            i2 = 1;
            if (position != 1) {
                i2 = 2;
                if (position != 2) {
                    i2 = 3;
                    if (position != 3) {
                        a70.p(ljg.j(position, "Invalid position: "));
                        return null;
                    }
                }
            }
        } else {
            i2 = 0;
        }
        return new m7g(i2, roundedCorner.getRadius(), roundedCorner.getCenter());
    }

    public static int o(JobParameters jobParameters) {
        int stopReason = jobParameters.getStopReason();
        int i = SystemJobService.e;
        switch (stopReason) {
            case 0:
            case 1:
            case 2:
            case 3:
            case 4:
            case 5:
            case 6:
            case 7:
            case 8:
            case 9:
            case 10:
            case 11:
            case 12:
            case 13:
            case 14:
            case 15:
                return stopReason;
            default:
                return -512;
        }
    }

    public static boolean p(Location location) {
        return location.isMock();
    }

    public static zid q(Context context) {
        zid zidVar = zid.g;
        context.getClass();
        try {
            PackageManager.Property property = context.getPackageManager().getProperty("android.window.PROPERTY_ACTIVITY_EMBEDDING_SPLITS_ENABLED", context.getPackageName());
            property.getClass();
            if (property.isBoolean()) {
                return property.getBoolean() ? zid.e : zid.f;
            }
            int i = q62.a;
            fok fokVar = fok.a;
            return zidVar;
        } catch (PackageManager.NameNotFoundException unused) {
            int i2 = q62.a;
            fok fokVar2 = fok.a;
            return zidVar;
        } catch (Exception unused2) {
            int i3 = q62.a;
            fok fokVar3 = fok.a;
            return zidVar;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:3:0x0006, code lost:
    
        r0 = r2.fontWeightAdjustment;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Typeface r(Configuration configuration, Typeface typeface) {
        int i;
        int i2;
        if (Build.VERSION.SDK_INT < 31 || i == Integer.MAX_VALUE || i == 0 || typeface == null) {
            return null;
        }
        int weight = typeface.getWeight();
        i2 = configuration.fontWeightAdjustment;
        return Typeface.create(typeface, s6a.t(weight + i2, 1, 1000), typeface.isItalic());
    }

    public static void s(tz tzVar, long[] jArr, Consumer consumer) {
        s3h s3hVar;
        for (long j : jArr) {
            u3h u3hVar = (u3h) tzVar.d().b((int) j);
            if (u3hVar != null && (s3hVar = u3hVar.a) != null) {
                ViewTranslationRequest.Builder builder = new ViewTranslationRequest.Builder(tzVar.a.getAutofillId(), s3hVar.f);
                Object g = s3hVar.d.a.g(w3h.C);
                if (g == null) {
                    g = null;
                }
                List list = (List) g;
                if (list != null) {
                    builder.setValue("android:text", TranslationRequestValue.forText(new q80(ycb.a(list, "\n", null, 62))));
                    consumer.accept(builder.build());
                }
            }
        }
    }

    public static float t(EdgeEffect edgeEffect, float f, float f2) {
        try {
            return edgeEffect.onPullDistance(f, f2);
        } catch (Throwable unused) {
            edgeEffect.onPull(f, f2);
            return UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT;
        }
    }

    public static boolean u(MediaDrm mediaDrm, String str, int i) {
        return mediaDrm.requiresSecureDecoder(str, i);
    }

    public static void v(Notification.Action.Builder builder, boolean z) {
        builder.setAuthenticationRequired(z);
    }

    public static void w(MediaDrm mediaDrm, byte[] bArr, cse cseVar) {
        LogSessionId logSessionId;
        LogSessionId a = cseVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a.equals(logSessionId)) {
            return;
        }
        MediaDrm.PlaybackComponent playbackComponent = mediaDrm.getPlaybackComponent(bArr);
        playbackComponent.getClass();
        playbackComponent.setLogSessionId(a);
    }

    public static void x(vng vngVar, cse cseVar) {
        LogSessionId logSessionId;
        LogSessionId a = cseVar.a();
        logSessionId = LogSessionId.LOG_SESSION_ID_NONE;
        if (a.equals(logSessionId)) {
            return;
        }
        ((MediaFormat) vngVar.b).setString("log-session-id", a.getStringId());
    }

    public static final void y(View view, gkg gkgVar, Function0 function0) {
        view.getClass();
        ow9 ow9Var = new ow9(11, function0, gkgVar);
        WeakHashMap weakHashMap = bsk.a;
        srk.c(view, ow9Var);
    }

    /* JADX WARN: Code restructure failed: missing block: B:10:0x0045, code lost:
    
        if (r2.intValue() != 1) goto L14;
     */
    /* JADX WARN: Code restructure failed: missing block: B:11:0x0053, code lost:
    
        r2 = true;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x004e, code lost:
    
        if (r2.intValue() != 3) goto L19;
     */
    /* JADX WARN: Code restructure failed: missing block: B:68:0x0063, code lost:
    
        if (r12.getContext().getResources().getConfiguration().orientation == 2) goto L20;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void z(Function0 function0, gkg gkgVar, View view, x9l x9lVar) {
        boolean z;
        int i;
        int i2;
        view.getClass();
        if (!((Boolean) function0.invoke()).booleanValue()) {
            view.setPadding(0, 0, 0, 0);
            return;
        }
        u9l u9lVar = x9lVar.a;
        u4a i3 = u9lVar.i(128);
        i3.getClass();
        u4a i4 = u9lVar.i(519);
        i4.getClass();
        int i5 = Build.VERSION.SDK_INT;
        if (i5 >= 30) {
            Display display = view.getDisplay();
            Integer valueOf = display != null ? Integer.valueOf(display.getRotation()) : null;
            if (valueOf != null) {
            }
            if (valueOf != null) {
            }
            z = false;
        }
        if (i5 >= 31) {
            WindowInsets rootWindowInsets = view.getRootWindowInsets();
            RoundedCorner roundedCorner = rootWindowInsets != null ? rootWindowInsets.getRoundedCorner(2) : null;
            if (z) {
                i = roundedCorner != null ? roundedCorner.getRadius() : 0;
                i2 = 0;
            } else {
                i2 = roundedCorner != null ? roundedCorner.getRadius() : 0;
                i = 0;
            }
        } else {
            i = 0;
            i2 = 0;
        }
        int max = Math.max(i3.a + (z ? i4.a : 0), i);
        int max2 = Math.max(i3.b + (z ? i4.b : 0), i2);
        int max3 = Math.max(i3.c + (z ? i4.c : 0), i);
        int max4 = Math.max(i3.d + i4.d, i2);
        int ordinal = gkgVar.ordinal();
        if (ordinal == 0) {
            view.setPadding(view.getPaddingLeft(), max2, view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (ordinal == 1) {
            view.setPadding(max, max2, view.getPaddingRight(), view.getPaddingBottom());
            return;
        }
        if (ordinal == 2) {
            view.setPadding(view.getPaddingLeft(), max2, max3, view.getPaddingBottom());
            return;
        }
        if (ordinal == 3) {
            view.setPadding(max, view.getPaddingTop(), max3, max4);
            return;
        }
        if (ordinal == 4) {
            view.setPadding(view.getPaddingLeft(), view.getPaddingTop(), max3, max4);
        } else if (ordinal == 5) {
            view.setPadding(max, max2, max3, max4);
        } else {
            zzl.b();
        }
    }
}
