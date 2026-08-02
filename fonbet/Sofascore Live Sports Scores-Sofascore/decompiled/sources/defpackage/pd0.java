package defpackage;

import android.app.Activity;
import android.app.Application;
import android.content.Context;
import android.content.ContextWrapper;
import android.content.pm.PackageManager;
import android.content.res.Configuration;
import android.content.res.Resources;
import android.graphics.Canvas;
import android.icu.text.DateTimePatternGenerator;
import android.os.Build;
import android.os.Bundle;
import android.os.LocaleList;
import android.text.format.DateFormat;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import android.view.Window;
import android.view.inputmethod.EditorInfo;
import android.widget.FrameLayout;
import android.widget.ImageButton;
import android.widget.ImageView;
import android.widget.LinearLayout;
import android.widget.TextView;
import androidx.compose.runtime.e;
import androidx.constraintlayout.widget.ConstraintLayout;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.metadata.a;
import com.sofascore.common.widget.ScrollInterceptorHorizontalScrollView;
import com.sofascore.model.crowdsourcing.TeamSide;
import com.sofascore.model.fantasy.FantasyRound;
import com.sofascore.model.mvvm.model.Event;
import com.sofascore.model.mvvm.model.PlayerKt;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.mvvm.model.Time;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.net.ConnectException;
import java.net.HttpURLConnection;
import java.net.SocketTimeoutException;
import java.time.Instant;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Locale;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.ranges.IntRange;
import kotlin.reflect.KClass;
import kotlin.text.Regex;
import kotlin.text.StringsKt;
import kotlin.text.c;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public abstract class pd0 {
    public static final jv1 a = new jv1(-1.0f, -1.0f);
    public static final jv1 b = new jv1(1.0f, -1.0f);
    public static final jv1 c = new jv1(1.0f, 1.0f);
    public static final iv1 d = new iv1(-1.0f);
    public static final iv1 e = new iv1(1.0f);
    public static final tc3 f = new tc3(-516401386, new gd3(9), false);
    public static final tc3 g = new tc3(-749860403, new gd3(10), false);
    public static final tc3 h = new tc3(1742751874, new qd3(8), false);
    public static final tc3 i = new tc3(1728863678, new qd3(9), false);
    public static final int[] j = {13, 15, 14};
    public static Method k;
    public static Method l;
    public static boolean m;
    public static Boolean n;
    public static Boolean o;
    public static Boolean p;
    public static Boolean q;
    public static Boolean r;
    public static Boolean s;
    public static Boolean t;
    public static final /* synthetic */ int u = 0;
    public static final /* synthetic */ int v = 0;
    public static final /* synthetic */ int w = 0;
    public static final /* synthetic */ int x = 0;
    public static final /* synthetic */ int y = 0;

    public static final float[] A(float[] fArr) {
        float f2 = fArr[0];
        float f3 = fArr[3];
        float f4 = fArr[6];
        float f5 = fArr[1];
        float f6 = fArr[4];
        float f7 = fArr[7];
        float f8 = fArr[2];
        float f9 = fArr[5];
        float f10 = fArr[8];
        float f11 = (f6 * f10) - (f7 * f9);
        float f12 = (f7 * f8) - (f5 * f10);
        float f13 = (f5 * f9) - (f6 * f8);
        float f14 = (f4 * f13) + (f3 * f12) + (f2 * f11);
        float[] fArr2 = new float[fArr.length];
        fArr2[0] = f11 / f14;
        fArr2[1] = f12 / f14;
        fArr2[2] = f13 / f14;
        fArr2[3] = mz1.c(f3, f10, f4 * f9, f14);
        fArr2[4] = mz1.c(f4, f8, f10 * f2, f14);
        fArr2[5] = mz1.c(f2, f9, f8 * f3, f14);
        fArr2[6] = mz1.c(f4, f6, f3 * f7, f14);
        fArr2[7] = mz1.c(f2, f7, f4 * f5, f14);
        fArr2[8] = mz1.c(f3, f5, f2 * f6, f14);
        return fArr2;
    }

    public static final boolean B() {
        String str = Build.FINGERPRINT;
        str.getClass();
        if (c.v(str, "generic", false) || c.v(str, "unknown", false)) {
            return true;
        }
        String str2 = Build.MODEL;
        str2.getClass();
        if (StringsKt.J(str2, "google_sdk", false) || StringsKt.J(str2, "Emulator", false) || StringsKt.J(str2, "Android SDK built for x86", false)) {
            return true;
        }
        String str3 = Build.MANUFACTURER;
        str3.getClass();
        if (StringsKt.J(str3, "Genymotion", false)) {
            return true;
        }
        String str4 = Build.BRAND;
        str4.getClass();
        if (c.v(str4, "generic", false)) {
            String str5 = Build.DEVICE;
            str5.getClass();
            if (c.v(str5, "generic", false)) {
                return true;
            }
        }
        return "google_sdk".equals(Build.PRODUCT);
    }

    public static boolean C(Resources resources) {
        boolean z = false;
        if (resources == null) {
            return false;
        }
        Boolean bool = q;
        if (bool == null) {
            Configuration configuration = resources.getConfiguration();
            if ((configuration.screenLayout & 15) <= 3 && configuration.smallestScreenWidthDp >= 600) {
                z = true;
            }
            bool = Boolean.valueOf(z);
            q = bool;
        }
        return bool.booleanValue();
    }

    public static boolean D(Context context) {
        Resources resources = context.getResources();
        if (resources == null) {
            return false;
        }
        Boolean bool = o;
        if (bool == null) {
            bool = Boolean.valueOf((resources.getConfiguration().screenLayout & 15) > 3 || C(resources));
            o = bool;
        }
        return bool.booleanValue();
    }

    public static boolean E(Context context) {
        PackageManager packageManager = context.getPackageManager();
        Boolean bool = t;
        if (bool == null) {
            bool = Boolean.valueOf(packageManager.hasSystemFeature("com.google.android.tv") || packageManager.hasSystemFeature("android.hardware.type.television") || packageManager.hasSystemFeature("android.software.leanback"));
            t = bool;
        }
        return bool.booleanValue();
    }

    public static final float[] F(float[] fArr, float[] fArr2) {
        float[] fArr3 = new float[9];
        if (fArr.length < 9 || fArr2.length < 9) {
            return fArr3;
        }
        float f2 = fArr[0] * fArr2[0];
        float f3 = fArr[3];
        float f4 = fArr2[1];
        float f5 = fArr[6];
        float f6 = fArr2[2];
        fArr3[0] = (f5 * f6) + (f3 * f4) + f2;
        float f7 = fArr[1];
        float f8 = fArr2[0];
        float f9 = fArr[4];
        float f10 = fArr[7];
        float f11 = f10 * f6;
        fArr3[1] = f11 + (f4 * f9) + (f7 * f8);
        float f12 = fArr[2] * f8;
        float f13 = fArr[5];
        float f14 = (fArr2[1] * f13) + f12;
        float f15 = fArr[8];
        fArr3[2] = (f6 * f15) + f14;
        float f16 = fArr[0];
        float f17 = fArr2[3] * f16;
        float f18 = fArr2[4];
        float f19 = (f3 * f18) + f17;
        float f20 = fArr2[5];
        fArr3[3] = (f5 * f20) + f19;
        float f21 = fArr[1];
        float f22 = fArr2[3];
        float f23 = f9 * f18;
        fArr3[4] = (f10 * f20) + f23 + (f21 * f22);
        float f24 = fArr[2];
        float f25 = f20 * f15;
        fArr3[5] = f25 + (f13 * fArr2[4]) + (f22 * f24);
        float f26 = f16 * fArr2[6];
        float f27 = fArr[3];
        float f28 = fArr2[7];
        float f29 = (f27 * f28) + f26;
        float f30 = fArr2[8];
        fArr3[6] = (f5 * f30) + f29;
        float f31 = fArr2[6];
        float f32 = f10 * f30;
        fArr3[7] = f32 + (fArr[4] * f28) + (f21 * f31);
        float f33 = f15 * f30;
        fArr3[8] = f33 + (fArr[5] * fArr2[7]) + (f24 * f31);
        return fArr3;
    }

    public static final float[] G(float[] fArr, float[] fArr2) {
        if (fArr.length < 9 || fArr2.length < 3) {
            return fArr2;
        }
        float f2 = fArr2[0];
        float f3 = fArr2[1];
        float f4 = fArr2[2];
        fArr2[0] = (fArr[6] * f4) + (fArr[3] * f3) + (fArr[0] * f2);
        fArr2[1] = (fArr[7] * f4) + (fArr[4] * f3) + (fArr[1] * f2);
        fArr2[2] = (fArr[8] * f4) + (fArr[5] * f3) + (fArr[2] * f2);
        return fArr2;
    }

    public static final xtc H(xtc xtcVar, boolean z, wzc wzcVar, p5g p5gVar, boolean z2, u5g u5gVar, Function0 function0) {
        xtc z3;
        if (p5gVar != null) {
            z3 = new r2h(z, wzcVar, p5gVar, z2, u5gVar, function0);
        } else if (p5gVar == null) {
            z3 = new r2h(z, wzcVar, null, z2, u5gVar, function0);
        } else {
            utc utcVar = utc.a;
            z3 = wzcVar != null ? f1a.a(utcVar, wzcVar, p5gVar).z(new r2h(z, wzcVar, null, z2, u5gVar, function0)) : fqj.q(utcVar, new s2h(p5gVar, z, z2, u5gVar, function0));
        }
        return xtcVar.z(z3);
    }

    public static final void I(String str, KClass kClass) {
        String sb;
        kClass.getClass();
        String str2 = "in the polymorphic scope of '" + kClass.getSimpleName() + '\'';
        if (str == null) {
            sb = dmi.j('.', "Class discriminator was missing and no default serializers were registered ", str2);
        } else {
            StringBuilder s2 = mz1.s("Serializer for subclass '", str, "' is not found ", str2, ".\nCheck if class with serial name '");
            bf3.v(s2, str, "' exists and serializer is registered in a corresponding SerializersModule.\nTo be registered automatically, class '", str, "' has to be '@Serializable', and the base class '");
            s2.append(kClass.getSimpleName());
            s2.append("' has to be sealed and '@Serializable'.");
            sb = s2.toString();
        }
        throw new v5h(sb);
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:23:0x0083  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final Object J(HttpURLConnection httpURLConnection, zj9 zj9Var, fa faVar, sq3 sq3Var) {
        h40 h40Var;
        int i2;
        bl9 bl9Var;
        if (sq3Var instanceof h40) {
            h40Var = (h40) sq3Var;
            int i3 = h40Var.u;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                h40Var.u = i3 - Integer.MIN_VALUE;
                Object obj = h40Var.t;
                lu3 lu3Var = lu3.a;
                i2 = h40Var.u;
                if (i2 != 0) {
                    y6a.M(obj);
                    try {
                        return faVar.invoke(httpURLConnection);
                    } catch (Throwable th) {
                        th = th;
                        h40Var.r = zj9Var;
                        h40Var.s = th;
                        h40Var.u = 1;
                        if (cga.U(h40Var) == lu3Var) {
                            return lu3Var;
                        }
                    }
                } else {
                    if (i2 != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    th = h40Var.s;
                    zj9Var = h40Var.r;
                    y6a.M(obj);
                }
                if (!(th instanceof SocketTimeoutException)) {
                    if (!(th instanceof ConnectException)) {
                        throw th;
                    }
                    String message = th.getMessage();
                    if (!(message != null ? StringsKt.J(message, "timed out", false) : false)) {
                        throw th;
                    }
                }
                bjb bjbVar = dl9.a;
                zj9Var.getClass();
                StringBuilder sb = new StringBuilder("Connect timeout has expired [url=");
                sb.append(zj9Var.a);
                sb.append(", connect_timeout=");
                Map map = (Map) zj9Var.f.d(ei9.a);
                bl9Var = (bl9) (map != null ? map.get(al9.a) : null);
                if (bl9Var != null || (r6 = bl9Var.b) == null) {
                    Object obj2 = "unknown";
                }
                throw new wj3(mz1.n(sb, obj2, " ms]"), th);
            }
        }
        h40Var = new h40(sq3Var);
        Object obj3 = h40Var.t;
        lu3 lu3Var2 = lu3.a;
        i2 = h40Var.u;
        if (i2 != 0) {
        }
        if (!(th instanceof SocketTimeoutException)) {
        }
        bjb bjbVar2 = dl9.a;
        zj9Var.getClass();
        StringBuilder sb2 = new StringBuilder("Connect timeout has expired [url=");
        sb2.append(zj9Var.a);
        sb2.append(", connect_timeout=");
        Map map2 = (Map) zj9Var.f.d(ei9.a);
        bl9Var = (bl9) (map2 != null ? map2.get(al9.a) : null);
        if (bl9Var != null) {
        }
        Object obj22 = "unknown";
        throw new wj3(mz1.n(sb2, obj22, " ms]"), th);
    }

    public static final mj7 K(FantasyRound fantasyRound) {
        jj7 jj7Var;
        fantasyRound.getClass();
        int id = fantasyRound.getId();
        String name = fantasyRound.getName();
        int sequence = fantasyRound.getSequence();
        Long revealTimestamp = fantasyRound.getRevealTimestamp();
        long deadlineTimestamp = fantasyRound.getDeadlineTimestamp();
        long startTimestamp = fantasyRound.getStartTimestamp();
        long endTimestamp = fantasyRound.getEndTimestamp();
        Float averageScore = fantasyRound.getAverageScore();
        Integer highScore = fantasyRound.getHighScore();
        int fantasyCompetitionId = fantasyRound.getFantasyCompetitionId();
        String maxPointsUserAccountId = fantasyRound.getMaxPointsUserAccountId();
        int maxPlayersFromSameTeam = fantasyRound.getMaxPlayersFromSameTeam();
        long w2 = yaa.w();
        if (Long.MIN_VALUE > w2 || w2 >= fantasyRound.getDeadlineTimestamp()) {
            jj7Var = (w2 >= fantasyRound.getEndTimestamp() || fantasyRound.getDeadlineTimestamp() > w2) ? jj7.f : jj7.e;
        } else {
            jj7Var = jj7.d;
        }
        return new mj7(id, name, sequence, deadlineTimestamp, startTimestamp, endTimestamp, averageScore, revealTimestamp, highScore, fantasyCompetitionId, maxPointsUserAccountId, maxPlayersFromSameTeam, jj7Var, fantasyRound.isPlaceholderRound(), fantasyRound.isFinalized(), fantasyRound.getRebuildSquadActive());
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x00b2  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x00ca  */
    /* JADX WARN: Removed duplicated region for block: B:32:0x010f A[ADDED_TO_REGION] */
    /* JADX WARN: Removed duplicated region for block: B:45:0x0132  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x0043  */
    /* JADX WARN: Removed duplicated region for block: B:7:0x003f  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void L(EditorInfo editorInfo, CharSequence charSequence, long j2, qu9 qu9Var) {
        int i2;
        eib eibVar;
        int i3;
        Bundle bundle;
        int i4 = qu9Var.e;
        int i5 = qu9Var.d;
        boolean z = qu9Var.a;
        if (i4 != 1) {
            if (i4 == 0) {
                i2 = 1;
            } else if (i4 == 2) {
                i2 = 2;
            } else if (i4 == 6) {
                i2 = 5;
            } else if (i4 == 5) {
                i2 = 7;
            } else if (i4 == 3) {
                i2 = 3;
            } else if (i4 == 4) {
                i2 = 4;
            } else {
                if (i4 != 7) {
                    a70.r("invalid ImeAction");
                    return;
                }
                i2 = 6;
            }
            editorInfo.imeOptions = i2;
            eibVar = qu9Var.f;
            if (Intrinsics.c(eibVar, eib.c)) {
            }
            if (i5 != 1) {
            }
            i3 = 1;
            editorInfo.inputType = i3;
            if (!z) {
            }
            if ((i3 & 1) == 1) {
            }
            int i6 = pej.c;
            editorInfo.initialSelStart = (int) (j2 >> 32);
            editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
            lz.M(editorInfo, charSequence);
            editorInfo.imeOptions |= 33554432;
            if (oji.a) {
            }
            if (Build.VERSION.SDK_INT >= 35) {
            }
            bundle = editorInfo.extras;
            if (bundle == null) {
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        }
        if (!z) {
            i2 = 0;
            editorInfo.imeOptions = i2;
            eibVar = qu9Var.f;
            if (Intrinsics.c(eibVar, eib.c)) {
                editorInfo.hintLocales = null;
            } else {
                ArrayList arrayList = new ArrayList(k13.r(eibVar, 10));
                Iterator it = eibVar.a.iterator();
                while (it.hasNext()) {
                    arrayList.add(((dib) it.next()).a);
                }
                Locale[] localeArr = (Locale[]) arrayList.toArray(new Locale[0]);
                editorInfo.hintLocales = new LocaleList((Locale[]) Arrays.copyOf(localeArr, localeArr.length));
            }
            if (i5 != 1) {
                if (i5 != 2) {
                    if (i5 == 3) {
                        i3 = 2;
                    } else if (i5 == 4) {
                        i3 = 3;
                    } else if (i5 == 5) {
                        i3 = 17;
                    } else if (i5 == 6) {
                        i3 = 33;
                    } else if (i5 == 7) {
                        i3 = 129;
                    } else if (i5 == 8) {
                        i3 = 18;
                    } else {
                        if (i5 != 9) {
                            a70.r("Invalid Keyboard Type");
                            return;
                        }
                        i3 = 8194;
                    }
                    editorInfo.inputType = i3;
                    if (!z && (i3 & 1) == 1) {
                        i3 |= 131072;
                        editorInfo.inputType = i3;
                        if (qu9Var.e == 1) {
                            editorInfo.imeOptions |= 1073741824;
                        }
                    }
                    if ((i3 & 1) == 1) {
                        int i7 = qu9Var.b;
                        if (i7 == 1) {
                            i3 |= 4096;
                            editorInfo.inputType = i3;
                        } else if (i7 == 2) {
                            i3 |= 8192;
                            editorInfo.inputType = i3;
                        } else if (i7 == 3) {
                            i3 |= 16384;
                            editorInfo.inputType = i3;
                        }
                        if (qu9Var.c) {
                            editorInfo.inputType = 32768 | i3;
                        }
                    }
                    int i62 = pej.c;
                    editorInfo.initialSelStart = (int) (j2 >> 32);
                    editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
                    lz.M(editorInfo, charSequence);
                    editorInfo.imeOptions |= 33554432;
                    if (oji.a || i5 == 7 || i5 == 8) {
                        if (Build.VERSION.SDK_INT >= 35) {
                            li5.d(editorInfo, false);
                        }
                        bundle = editorInfo.extras;
                        if (bundle == null) {
                            bundle = new Bundle();
                            editorInfo.extras = bundle;
                        }
                        bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
                    }
                    if (Build.VERSION.SDK_INT >= 35) {
                        li5.d(editorInfo, true);
                    }
                    Bundle bundle2 = editorInfo.extras;
                    if (bundle2 == null) {
                        bundle2 = new Bundle();
                        editorInfo.extras = bundle2;
                    }
                    bundle2.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", true);
                    q9.G(editorInfo);
                    return;
                }
                editorInfo.imeOptions |= Integer.MIN_VALUE;
            }
            i3 = 1;
            editorInfo.inputType = i3;
            if (!z) {
                i3 |= 131072;
                editorInfo.inputType = i3;
                if (qu9Var.e == 1) {
                }
            }
            if ((i3 & 1) == 1) {
            }
            int i622 = pej.c;
            editorInfo.initialSelStart = (int) (j2 >> 32);
            editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
            lz.M(editorInfo, charSequence);
            editorInfo.imeOptions |= 33554432;
            if (oji.a) {
            }
            if (Build.VERSION.SDK_INT >= 35) {
            }
            bundle = editorInfo.extras;
            if (bundle == null) {
            }
            bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
        }
        i2 = 6;
        editorInfo.imeOptions = i2;
        eibVar = qu9Var.f;
        if (Intrinsics.c(eibVar, eib.c)) {
        }
        if (i5 != 1) {
        }
        i3 = 1;
        editorInfo.inputType = i3;
        if (!z) {
        }
        if ((i3 & 1) == 1) {
        }
        int i6222 = pej.c;
        editorInfo.initialSelStart = (int) (j2 >> 32);
        editorInfo.initialSelEnd = (int) (j2 & 4294967295L);
        lz.M(editorInfo, charSequence);
        editorInfo.imeOptions |= 33554432;
        if (oji.a) {
        }
        if (Build.VERSION.SDK_INT >= 35) {
        }
        bundle = editorInfo.extras;
        if (bundle == null) {
        }
        bundle.putBoolean("androidx.core.view.inputmethod.EditorInfoCompat.STYLUS_HANDWRITING_ENABLED", false);
    }

    public static final void M(p12 p12Var, boolean z, boolean z2) {
        int i2;
        ImageButton imageButton = (ImageButton) p12Var.e;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) p12Var.g;
        int i3 = 4;
        if (z) {
            i2 = scrollInterceptorHorizontalScrollView.canScrollHorizontally(z2 ? -1 : 1) ? 0 : 4;
        } else {
            i2 = 8;
        }
        imageButton.setVisibility(i2);
        ImageButton imageButton2 = (ImageButton) p12Var.d;
        if (z) {
            if (scrollInterceptorHorizontalScrollView.canScrollHorizontally(z2 ? 1 : -1)) {
                i3 = 0;
            }
        } else {
            i3 = 8;
        }
        imageButton2.setVisibility(i3);
    }

    public static final void a(gv9 gv9Var, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        float f2;
        b20 b20Var;
        xtc xtcVar2;
        final gv9 gv9Var2 = gv9Var;
        gv9Var2.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-775111742);
        int i4 = (av8Var.g(gv9Var2) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            kx4 kx4Var = (kx4) av8Var.k(dh3.h);
            final long D = lz.D(R.color.n_lv_4, av8Var);
            final long D2 = lz.D(R.color.n_lv_5, av8Var);
            final long D3 = lz.D(R.color.n_lv_3, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                kx4Var.getClass();
                float H0 = kx4Var.H0(32.0f);
                b20 a2 = e20.a();
                i3 = i4;
                a2.g(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
                float f3 = -H0;
                float f4 = f3 / 2.0f;
                a2.f(f3, f4);
                a2.f(f3, f3);
                a2.f(H0, f3);
                a2.f(H0, f4);
                a2.d();
                av8Var.n0(a2);
                O = a2;
            } else {
                i3 = i4;
            }
            b20 b20Var2 = (b20) O;
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                kx4Var.getClass();
                f2 = 1.0f;
                O2 = new tb(R.color.surface_1, kx4Var.H0(5.0f), kx4Var.H0(1.0f));
                av8Var.n0(O2);
            } else {
                f2 = 1.0f;
            }
            final tb tbVar = (tb) O2;
            boolean g2 = av8Var.g(context);
            Object O3 = av8Var.O();
            if (g2 || O3 == a99Var) {
                b20Var = b20Var2;
                O3 = new wb(context, (Float.floatToRawIntBits(f2) << 32) | (Float.floatToRawIntBits(f2) & 4294967295L), null, tbVar, null, 20);
                tbVar = tbVar;
                av8Var.n0(O3);
            } else {
                b20Var = b20Var2;
            }
            final wb wbVar = (wb) O3;
            xtc m2 = bkh.m(xtcVar, 232.0f, 330.0f);
            final b20 b20Var3 = b20Var;
            boolean i5 = ((i3 & 14) == 4) | av8Var.i(b20Var3) | av8Var.f(D) | av8Var.i(tbVar) | av8Var.i(wbVar) | av8Var.f(D2) | av8Var.f(D3);
            Object O4 = av8Var.O();
            if (i5 || O4 == a99Var) {
                gv9Var2 = gv9Var;
                xtcVar2 = m2;
                Function1 function1 = new Function1() { // from class: j91
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        ha5 ha5Var;
                        float f5;
                        long j2 = D2;
                        long j3 = D3;
                        b20 b20Var4 = b20Var3;
                        long j4 = D;
                        gv9 gv9Var3 = gv9Var2;
                        wb wbVar2 = wbVar;
                        ha5 ha5Var2 = (ha5) obj;
                        ha5Var2.getClass();
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) / 2.0f;
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) - ha5Var2.H0(22.0f);
                        ((hpo) ha5Var2.L0().a).I(intBitsToFloat, intBitsToFloat2);
                        try {
                            ha5.X0(ha5Var2, b20Var4, j4, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, 60);
                            ((hpo) ha5Var2.L0().a).I(-intBitsToFloat, -intBitsToFloat2);
                            float f6 = tb.this.b;
                            ((hpo) ha5Var2.L0().a).y(f6, f6, f6, f6);
                            try {
                                Iterator<E> it = gv9Var3.iterator();
                                while (true) {
                                    if (!it.hasNext()) {
                                        float f7 = -f6;
                                        ((hpo) ha5Var2.L0().a).y(f7, f7, f7, f7);
                                        float H02 = ha5Var2.H0(75.0f);
                                        float H03 = ha5Var2.H0(122.0f);
                                        float H04 = ha5Var2.H0(1.0f);
                                        long floatToRawIntBits = (Float.floatToRawIntBits((-H03) / 2.0f) & 4294967295L) | (Float.floatToRawIntBits((-H02) / 2.0f) << 32);
                                        long floatToRawIntBits2 = (Float.floatToRawIntBits(H02) << 32) | (Float.floatToRawIntBits(H03) & 4294967295L);
                                        long floatToRawIntBits3 = (Float.floatToRawIntBits(H02 + H04) << 32) | (Float.floatToRawIntBits(H03 + H04) & 4294967295L);
                                        float intBitsToFloat3 = Float.intBitsToFloat((int) (ha5Var2.n() >> 32)) / 2.0f;
                                        float intBitsToFloat4 = Float.intBitsToFloat((int) (ha5Var2.n() & 4294967295L)) / 2.0f;
                                        ((hpo) ha5Var2.L0().a).I(intBitsToFloat3, intBitsToFloat4);
                                        ha5 ha5Var3 = ha5Var2;
                                        try {
                                            ha5.o0(ha5Var3, j2, floatToRawIntBits, floatToRawIntBits2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, null, null, 120);
                                            ha5Var = ha5Var3;
                                            f5 = H04 / 2.0f;
                                        } catch (Throwable th) {
                                            th = th;
                                            ha5Var = ha5Var3;
                                        }
                                        try {
                                            ha5.o0(ha5Var, j3, dnd.h(floatToRawIntBits, (Float.floatToRawIntBits(f5) & 4294967295L) | (Float.floatToRawIntBits(f5) << 32)), floatToRawIntBits3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, new jii(H04, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 0, 0, null, 30), null, 104);
                                            ((hpo) ha5Var.L0().a).I(-intBitsToFloat3, -intBitsToFloat4);
                                            return Unit.a;
                                        } catch (Throwable th2) {
                                            th = th2;
                                            ((hpo) ha5Var.L0().a).I(-intBitsToFloat3, -intBitsToFloat4);
                                            throw th;
                                        }
                                    }
                                    ol1 ol1Var = (ol1) it.next();
                                    gv9 gv9Var4 = ol1Var.b;
                                    int i6 = ol1Var.c;
                                    float f8 = ol1Var.d ? 1.0f : 0.1f;
                                    wbVar2.getClass();
                                    gv9Var4.getClass();
                                    Iterator<E> it2 = gv9Var4.iterator();
                                    while (it2.hasNext()) {
                                        ha5 ha5Var4 = ha5Var2;
                                        int i7 = i6;
                                        try {
                                            wbVar2.a(ha5Var4, ((dnd) it2.next()).a, i7, f8);
                                            ha5Var2 = ha5Var4;
                                            i6 = i7;
                                        } catch (Throwable th3) {
                                            th = th3;
                                            ha5Var2 = ha5Var4;
                                            float f9 = -f6;
                                            ((hpo) ha5Var2.L0().a).y(f9, f9, f9, f9);
                                            throw th;
                                        }
                                    }
                                }
                            } catch (Throwable th4) {
                                th = th4;
                            }
                        } catch (Throwable th5) {
                            ((hpo) ha5Var2.L0().a).I(-intBitsToFloat, -intBitsToFloat2);
                            throw th5;
                        }
                    }
                };
                av8Var.n0(function1);
                O4 = function1;
            } else {
                gv9Var2 = gv9Var;
                xtcVar2 = m2;
            }
            lz.d(0, av8Var, xtcVar2, (Function1) O4);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new y81(gv9Var2, xtcVar, i2, 1);
        }
    }

    public static final void b(ks3 ks3Var, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1576182862);
        int i3 = 4;
        int i4 = (av8Var.i(ks3Var) ? 4 : 2) | i2 | 48;
        int i5 = 1;
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            Context context = (Context) av8Var.k(nz.b);
            e1d x2 = rfo.x(ks3Var.f, av8Var, 0);
            xhf J = x2a.J(av8Var);
            is3 is3Var = (is3) ((vnb) x2.getValue()).a();
            boolean c2 = Intrinsics.c(is3Var != null ? Boolean.valueOf(is3Var.e) : null, Boolean.TRUE);
            g28 g28Var = bkh.c;
            boolean i6 = av8Var.i(ks3Var);
            Object O = av8Var.O();
            if (i6 || O == nf3.a) {
                O = new h63(ks3Var, i3);
                av8Var.n0(O);
            }
            x2a.h(c2, (Function0) O, g28Var, J, null, yqo.H(-1977918983, av8Var, new ak1(J, x2, i5)), yqo.H(-1723529576, av8Var, new d67(context, ks3Var, x2)), av8Var, 1769856);
            xtcVar = utc.a;
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new vn6(ks3Var, xtcVar, i2, 26);
        }
    }

    public static final void c(vnb vnbVar, Function1 function1, Function1 function12, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-162149821);
        int i3 = i2 | (av8Var.g(vnbVar) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16) | (av8Var.i(function12) ? 256 : 128);
        utc utcVar = utc.a;
        int i4 = (av8Var.g(utcVar) ? a.o : 1024) | i3;
        if (!av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            av8Var.W();
        } else if ((vnbVar instanceof snb) || Intrinsics.c(vnbVar, tnb.a)) {
            av8Var.d0(1233141412);
            lz.g((i4 >> 9) & 14, av8Var, utcVar);
            av8Var.s(false);
        } else {
            if (!(vnbVar instanceof unb)) {
                throw dmi.h(av8Var, -1207144663, false);
            }
            av8Var.d0(1233374687);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = e.f(Boolean.valueOf(((is3) ((unb) vnbVar).a).c.size() <= 10));
                av8Var.n0(O);
            }
            e1d e1dVar = (e1d) O;
            t3e t3eVar = new t3e(8.0f, 8.0f, 8.0f, 48.0f);
            boolean z = ((i4 & 14) == 4) | ((i4 & 112) == 32) | ((i4 & 896) == 256);
            Object O2 = av8Var.O();
            if (z || O2 == a99Var) {
                l50 l50Var = new l50(vnbVar, e1dVar, function1, function12, 4);
                av8Var.n0(l50Var);
                O2 = l50Var;
            }
            v8a.a(utcVar, null, t3eVar, null, null, null, false, null, (Function1) O2, av8Var, (i4 >> 9) & 14, 506);
            av8Var.s(false);
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new cyb(vnbVar, function1, function12, i2, 14);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:34:0x0170  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0173  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void d(int i2, int i3, TeamSide teamSide, of3 of3Var, int i4) {
        long f2;
        int i5;
        long f3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(275506327);
        int i6 = i4 | (av8Var.e(i2) ? 4 : 2) | (av8Var.e(i3) ? 32 : 16) | (av8Var.e(teamSide == null ? -1 : teamSide.ordinal()) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i6 & 1, (i6 & 147) != 146)) {
            l8g a2 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var, utcVar);
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
            String valueOf = String.valueOf(i2);
            yf8 yf8Var = xth.a;
            dfj l2 = xth.l();
            int i7 = teamSide == null ? -1 : g64.a[teamSide.ordinal()];
            if (i7 != -1) {
                if (i7 == 1) {
                    f2 = ljg.f(av8Var, -1792747804, R.color.n_lv_1, av8Var, false);
                    udj.c(valueOf, null, f2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l2, av8Var, 0, 0, 131066);
                    nq8.h(av8Var, bkh.p(utcVar, 2.0f));
                    udj.c("-", null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 6, 0, 131066);
                    nq8.h(av8Var, bkh.p(utcVar, 2.0f));
                    String valueOf2 = String.valueOf(i3);
                    dfj l3 = xth.l();
                    i5 = teamSide != null ? -1 : g64.a[teamSide.ordinal()];
                    if (i5 != -1 || i5 == 1) {
                        f3 = ljg.f(av8Var, -1792732476, R.color.n_lv_3, av8Var, false);
                    } else {
                        if (i5 != 2) {
                            throw dmi.h(av8Var, -1792734062, false);
                        }
                        f3 = ljg.f(av8Var, -1792731100, R.color.n_lv_1, av8Var, false);
                    }
                    udj.c(valueOf2, null, f3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l3, av8Var, 0, 0, 131066);
                    av8Var = av8Var;
                    av8Var.s(true);
                } else if (i7 != 2) {
                    throw dmi.h(av8Var, -1792749198, false);
                }
            }
            f2 = ljg.f(av8Var, -1792746236, R.color.n_lv_3, av8Var, false);
            udj.c(valueOf, null, f2, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l2, av8Var, 0, 0, 131066);
            nq8.h(av8Var, bkh.p(utcVar, 2.0f));
            udj.c("-", null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, 6, 0, 131066);
            nq8.h(av8Var, bkh.p(utcVar, 2.0f));
            String valueOf22 = String.valueOf(i3);
            dfj l32 = xth.l();
            if (teamSide != null) {
            }
            if (i5 != -1) {
            }
            f3 = ljg.f(av8Var, -1792732476, R.color.n_lv_3, av8Var, false);
            udj.c(valueOf22, null, f3, null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, l32, av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new vo(i2, i3, i4, 1, teamSide);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r2v15 */
    /* JADX WARN: Type inference failed for: r2v8 */
    /* JADX WARN: Type inference failed for: r2v9, types: [boolean, int] */
    public static final void e(fo7 fo7Var, xtc xtcVar, boolean z, Function0 function0, of3 of3Var, int i2) {
        long j2;
        f50 f50Var;
        wxf wxfVar;
        f50 f50Var2;
        ff3 ff3Var;
        zg3 zg3Var;
        ry ryVar;
        utc utcVar;
        f50 f50Var3;
        float f2;
        lv1 lv1Var;
        ?? r2;
        av8 av8Var;
        Function0 function02 = function0;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1190285913);
        int i3 = i2 | (av8Var2.g(fo7Var) ? 4 : 2) | (av8Var2.g(xtcVar) ? 32 : 16) | (av8Var2.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var2.i(function02) ? a.o : 1024);
        if (av8Var2.T(i3 & 1, (i3 & 1171) != 1170)) {
            if (z) {
                j2 = ljg.f(av8Var2, -1403453636, R.color.primary_highlight, av8Var2, false);
            } else {
                av8Var2.d0(-1403452590);
                av8Var2.s(false);
                j2 = r13.h;
            }
            cdi a2 = wih.a(j2, null, null, av8Var2, 0, 14);
            av8 av8Var3 = av8Var2;
            lv1 lv1Var2 = uxf.m;
            xtc f0 = l98.f0(l98.d0(bkh.d(fz8.Y(n9e.q(xtcVar, ((r13) a2.getValue()).a, oyn.e), n9a.b), 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 1), 16.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
            wxf wxfVar2 = ww9.b;
            l8g a3 = k8g.a(wxfVar2, lv1Var2, av8Var3, 48);
            int hashCode = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C = fqj.C(av8Var3, f0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var3, a3, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var3, m2, ff3Var2);
            Integer valueOf = Integer.valueOf(hashCode);
            f50 f50Var5 = hf3.j;
            waa.K(av8Var3, valueOf, f50Var5);
            ry ryVar2 = hf3.k;
            waa.J(av8Var3, ryVar2);
            f50 f50Var6 = hf3.d;
            waa.K(av8Var3, C, f50Var6);
            goa goaVar = new goa(1.0f, true);
            u23 a4 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m3 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, goaVar);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a4, f50Var4);
            waa.K(av8Var3, m3, ff3Var2);
            bf3.s(hashCode2, av8Var3, f50Var5, av8Var3, ryVar2);
            waa.K(av8Var3, C2, f50Var6);
            l8g a5 = k8g.a(wxfVar2, lv1Var2, av8Var3, 48);
            int hashCode3 = Long.hashCode(av8Var3.T);
            aee m4 = av8Var3.m();
            utc utcVar2 = utc.a;
            xtc C3 = fqj.C(av8Var3, utcVar2);
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a5, f50Var4);
            waa.K(av8Var3, m4, ff3Var2);
            bf3.s(hashCode3, av8Var3, f50Var5, av8Var3, ryVar2);
            waa.K(av8Var3, C3, f50Var6);
            j67 j67Var = fo7Var.a;
            boolean z2 = fo7Var.c;
            if (j67Var != null) {
                av8Var3.d0(-1421746506);
                String str = j67Var.b;
                yf8 yf8Var = xth.a;
                f50Var = f50Var6;
                f50Var2 = f50Var4;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                ryVar = ryVar2;
                utcVar = utcVar2;
                f50Var3 = f50Var5;
                f2 = 16.0f;
                lv1Var = lv1Var2;
                wxfVar = wxfVar2;
                udj.c(str, null, lz.D(R.color.n_lv_1, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var3, 0, 24960, 110586);
                e12.a(0, av8Var3, n9e.q(l98.b0(bkh.l(utcVar, 16.0f), 5.5f), r13.c(lz.D(R.color.n_lv_1, av8Var3), 0.15f), o7g.a));
                kq9.a(haa.t(R.drawable.ic_team, 0, av8Var3), null, bkh.l(utcVar, 16.0f), lz.D(R.color.n_lv_3, av8Var3), av8Var3, 440, 0);
                nq8.h(av8Var3, bkh.p(utcVar, 4.0f));
                r2 = 0;
                udj.c(uxf.E(j67Var.f, 58, false), null, lz.D(R.color.n_lv_3, av8Var3), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var3, 0, 24960, 110586);
                av8 av8Var4 = av8Var3;
                av8Var4.s(false);
                av8Var = av8Var4;
            } else {
                f50Var = f50Var6;
                wxfVar = wxfVar2;
                f50Var2 = f50Var4;
                ff3Var = ff3Var2;
                zg3Var = zg3Var2;
                ryVar = ryVar2;
                utcVar = utcVar2;
                f50Var3 = f50Var5;
                f2 = 16.0f;
                lv1Var = lv1Var2;
                r2 = 0;
                av8Var3.d0(-1420509699);
                av8Var3.s(false);
                av8Var = av8Var3;
            }
            bf3.t(av8Var, true, utcVar, 2.0f, av8Var);
            l8g a6 = k8g.a(wxfVar, lv1Var, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m5 = av8Var.m();
            xtc C4 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a6, f50Var2);
            waa.K(av8Var, m5, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var3, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var);
            if (z2) {
                av8Var.d0(-590398724);
                kq9.a(haa.t(R.drawable.ic_shield_person, r2, av8Var), null, bkh.l(utcVar, f2), lz.D(R.color.n_lv_1, av8Var), av8Var, 440, 0);
                bf3.u(utcVar, 4.0f, av8Var, r2);
            } else {
                av8Var.d0(-590050842);
                av8Var.s(r2);
            }
            String v2 = oea.v(z2 ? R.string.fantasy_league_admin : R.string.fantasy_league_member, av8Var);
            yf8 yf8Var2 = xth.a;
            av8 av8Var5 = av8Var;
            udj.c(v2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var5, 0, 24960, 110586);
            av8Var2 = av8Var5;
            av8Var2.s(true);
            av8Var2.s(true);
            nq8.h(av8Var2, bkh.p(utcVar, f2));
            d7e t2 = haa.t(R.drawable.ic_reorder, r2, av8Var2);
            long D = lz.D(R.color.n_lv_3, av8Var2);
            xtc c2 = bkh.c(utcVar, 1.0f);
            boolean z3 = (i3 & 7168) == 2048 ? true : r2;
            Object O = av8Var2.O();
            if (z3 || O == nf3.a) {
                function02 = function0;
                O = new ma0(4, function02);
                av8Var2.n0(O);
            } else {
                function02 = function0;
            }
            kq9.a(t2, null, bkh.l(l98.b0(fqj.q(c2, new e60((Function1) O, 3)), 8.0f), 24.0f), D, av8Var2, 56, 0);
            av8Var2.s(true);
        } else {
            av8Var2.W();
        }
        eqf u2 = av8Var2.u();
        if (u2 != null) {
            u2.d = new p81(fo7Var, xtcVar, z, function02, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:11:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:14:0x0041  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x009f  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cf  */
    /* JADX WARN: Removed duplicated region for block: B:28:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:31:0x0111  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0130  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0139  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x015c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x01d2  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x01df  */
    /* JADX WARN: Removed duplicated region for block: B:48:0x0230  */
    /* JADX WARN: Removed duplicated region for block: B:51:0x0239  */
    /* JADX WARN: Removed duplicated region for block: B:54:0x0262  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x028c  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x03c0  */
    /* JADX WARN: Removed duplicated region for block: B:85:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:86:0x026a  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x023c  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01d7  */
    /* JADX WARN: Removed duplicated region for block: B:89:0x0146  */
    /* JADX WARN: Removed duplicated region for block: B:90:0x0135  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x0115  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x00de  */
    /* JADX WARN: Removed duplicated region for block: B:93:0x00a3  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x03b7  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0039  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(gv9 gv9Var, long j2, of3 of3Var, int i2, int i3) {
        long j3;
        int i4;
        int i5;
        eqf u2;
        long D;
        Integer num;
        boolean z;
        String v2;
        String str;
        int i6;
        String v3;
        lv1 lv1Var = uxf.l;
        gv9Var.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-395795115);
        int i7 = i2 | (av8Var.g(gv9Var) ? 4 : 2);
        if ((i3 & 2) == 0) {
            j3 = j2;
            if (av8Var.f(j3)) {
                i4 = 32;
                i5 = i7 | i4;
                if (av8Var.T(i5 & 1, (i5 & 19) == 18)) {
                    av8Var.W();
                } else {
                    av8Var.Y();
                    if ((i2 & 1) != 0 && !av8Var.B()) {
                        av8Var.W();
                        int i8 = i3 & 2;
                    } else if ((i3 & 2) != 0) {
                        D = lz.D(R.color.surface_2, av8Var);
                        av8Var.t();
                        utc utcVar = utc.a;
                        xtc Y = fz8.Y(bkh.d(utcVar, 1.0f), n9a.b);
                        l8g a2 = k8g.a(new ng0(32.0f, true, new a70(6)), lv1Var, av8Var, 6);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m2 = av8Var.m();
                        xtc C = fqj.C(av8Var, Y);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
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
                        if (1.0f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        xtc b0 = l98.b0(n9e.q(new goa(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), D, o7g.a(8.0f)), 16.0f);
                        u23 a3 = t23.a(ww9.f, uxf.p, av8Var, 54);
                        int hashCode2 = Long.hashCode(av8Var.T);
                        aee m3 = av8Var.m();
                        xtc C2 = fqj.C(av8Var, b0);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a3, f50Var);
                        waa.K(av8Var, m3, ff3Var);
                        bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C2, f50Var3);
                        Pair pair = (Pair) CollectionsKt.firstOrNull(gv9Var);
                        num = pair == null ? (Integer) pair.a : null;
                        if (num != null) {
                            av8Var.d0(-154068488);
                            z = false;
                            av8Var.s(false);
                            v2 = null;
                        } else {
                            z = false;
                            av8Var.d0(-154068487);
                            v2 = oea.v(num.intValue(), av8Var);
                            av8Var.s(false);
                        }
                        if (v2 == null) {
                            v2 = "";
                        }
                        String upperCase = v2.toUpperCase(Locale.ROOT);
                        upperCase.getClass();
                        yf8 yf8Var = xth.a;
                        long j4 = D;
                        utc utcVar2 = utcVar;
                        udj.c(upperCase, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
                        Pair pair2 = (Pair) CollectionsKt.firstOrNull(gv9Var);
                        str = pair2 == null ? (String) pair2.b : null;
                        Regex regex = yid.a;
                        if (str == null) {
                            str = "-";
                        }
                        udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131066);
                        av8Var = av8Var;
                        av8Var.s(true);
                        if (1.0f <= 0.0d) {
                            p3a.a("invalid weight; must be greater than zero");
                        }
                        xtc c2 = bkh.c(new goa(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                        u23 a4 = t23.a(ww9.i, uxf.o, av8Var, 6);
                        int hashCode3 = Long.hashCode(av8Var.T);
                        aee m4 = av8Var.m();
                        xtc C3 = fqj.C(av8Var, c2);
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a4, f50Var);
                        waa.K(av8Var, m4, ff3Var);
                        bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                        waa.K(av8Var, C3, f50Var3);
                        av8Var.d0(13236203);
                        i6 = 0;
                        while (i6 < 3) {
                            utc utcVar3 = utcVar2;
                            xtc d2 = bkh.d(utcVar3, 1.0f);
                            l8g a5 = k8g.a(ww9.b, lv1Var, av8Var, 0);
                            int hashCode4 = Long.hashCode(av8Var.T);
                            aee m5 = av8Var.m();
                            xtc C4 = fqj.C(av8Var, d2);
                            if3.k7.getClass();
                            zg3 zg3Var2 = hf3.b;
                            av8Var.h0();
                            if (av8Var.S) {
                                av8Var.l(zg3Var2);
                            } else {
                                av8Var.q0();
                            }
                            waa.K(av8Var, a5, hf3.g);
                            waa.K(av8Var, m5, hf3.f);
                            waa.K(av8Var, Integer.valueOf(hashCode4), hf3.j);
                            waa.J(av8Var, hf3.k);
                            waa.K(av8Var, C4, hf3.d);
                            int i9 = i6 + 1;
                            Pair pair3 = (Pair) CollectionsKt.a0(i9, gv9Var);
                            if (pair3 == null) {
                                av8Var.d0(399470223);
                                av8Var.s(false);
                                v3 = null;
                            } else {
                                av8Var.d0(399470224);
                                v3 = oea.v(((Number) pair3.a).intValue(), av8Var);
                                av8Var.s(false);
                            }
                            if (v3 == null) {
                                v3 = "";
                            }
                            yf8 yf8Var2 = xth.a;
                            av8 av8Var2 = av8Var;
                            lv1 lv1Var2 = lv1Var;
                            udj.c(v3, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.e(), av8Var2, 0, 0, 131066);
                            w1l.o(1.0f, true, av8Var2);
                            String str2 = pair3 != null ? (String) pair3.b : null;
                            if (str2 == null) {
                                str2 = "-";
                            }
                            udj.c(str2, null, lz.D(R.color.n_lv_1, av8Var2), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var2, 0, 0, 131066);
                            av8Var = av8Var2;
                            av8Var.s(true);
                            i6 = i9;
                            lv1Var = lv1Var2;
                            utcVar2 = utcVar3;
                        }
                        ljg.t(av8Var, false, true, true);
                        j3 = j4;
                    }
                    D = j3;
                    av8Var.t();
                    utc utcVar4 = utc.a;
                    xtc Y2 = fz8.Y(bkh.d(utcVar4, 1.0f), n9a.b);
                    l8g a22 = k8g.a(new ng0(32.0f, true, new a70(6)), lv1Var, av8Var, 6);
                    int hashCode5 = Long.hashCode(av8Var.T);
                    aee m22 = av8Var.m();
                    xtc C5 = fqj.C(av8Var, Y2);
                    if3.k7.getClass();
                    zg3 zg3Var3 = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    f50 f50Var4 = hf3.g;
                    waa.K(av8Var, a22, f50Var4);
                    ff3 ff3Var2 = hf3.f;
                    waa.K(av8Var, m22, ff3Var2);
                    Integer valueOf2 = Integer.valueOf(hashCode5);
                    f50 f50Var22 = hf3.j;
                    waa.K(av8Var, valueOf2, f50Var22);
                    ry ryVar2 = hf3.k;
                    waa.J(av8Var, ryVar2);
                    f50 f50Var32 = hf3.d;
                    waa.K(av8Var, C5, f50Var32);
                    if (1.0f <= 0.0d) {
                    }
                    xtc b02 = l98.b0(n9e.q(new goa(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), D, o7g.a(8.0f)), 16.0f);
                    u23 a32 = t23.a(ww9.f, uxf.p, av8Var, 54);
                    int hashCode22 = Long.hashCode(av8Var.T);
                    aee m32 = av8Var.m();
                    xtc C22 = fqj.C(av8Var, b02);
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, a32, f50Var4);
                    waa.K(av8Var, m32, ff3Var2);
                    bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
                    waa.K(av8Var, C22, f50Var32);
                    Pair pair4 = (Pair) CollectionsKt.firstOrNull(gv9Var);
                    if (pair4 == null) {
                    }
                    if (num != null) {
                    }
                    if (v2 == null) {
                    }
                    String upperCase2 = v2.toUpperCase(Locale.ROOT);
                    upperCase2.getClass();
                    yf8 yf8Var3 = xth.a;
                    long j42 = D;
                    utc utcVar22 = utcVar4;
                    udj.c(upperCase2, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
                    Pair pair22 = (Pair) CollectionsKt.firstOrNull(gv9Var);
                    if (pair22 == null) {
                    }
                    Regex regex2 = yid.a;
                    if (str == null) {
                    }
                    udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.h(), av8Var, 0, 0, 131066);
                    av8Var = av8Var;
                    av8Var.s(true);
                    if (1.0f <= 0.0d) {
                    }
                    xtc c22 = bkh.c(new goa(1.0f <= Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), 1.0f);
                    u23 a42 = t23.a(ww9.i, uxf.o, av8Var, 6);
                    int hashCode32 = Long.hashCode(av8Var.T);
                    aee m42 = av8Var.m();
                    xtc C32 = fqj.C(av8Var, c22);
                    av8Var.h0();
                    if (av8Var.S) {
                    }
                    waa.K(av8Var, a42, f50Var4);
                    waa.K(av8Var, m42, ff3Var2);
                    bf3.s(hashCode32, av8Var, f50Var22, av8Var, ryVar2);
                    waa.K(av8Var, C32, f50Var32);
                    av8Var.d0(13236203);
                    i6 = 0;
                    while (i6 < 3) {
                    }
                    ljg.t(av8Var, false, true, true);
                    j3 = j42;
                }
                u2 = av8Var.u();
                if (u2 == null) {
                    u2.d = new pu8(gv9Var, j3, i2, i3);
                    return;
                }
                return;
            }
        } else {
            j3 = j2;
        }
        i4 = 16;
        i5 = i7 | i4;
        if (av8Var.T(i5 & 1, (i5 & 19) == 18)) {
        }
        u2 = av8Var.u();
        if (u2 == null) {
        }
    }

    public static final void g(qu8 qu8Var, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        av8 av8Var;
        int i4;
        function1.getClass();
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1515093446);
        int i5 = 2;
        if ((i2 & 6) == 0) {
            i3 = (av8Var2.g(qu8Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var2.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var2.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        int i6 = 0;
        int i7 = 1;
        if (av8Var2.T(i3 & 1, (i3 & 147) != 146)) {
            int i8 = qu8Var.g;
            x43 x43Var = qu8Var.o;
            boolean z = qu8Var.e;
            tc3 H = yqo.H(-379960224, av8Var2, new mu8(qu8Var, i6));
            tc3 H2 = yqo.H(494907930, av8Var2, new mu8(qu8Var, i7));
            tc3 H3 = yqo.H(1143500700, av8Var2, new mu8(qu8Var, i5));
            int i9 = i3 & 112;
            int i10 = i3 & 14;
            boolean z2 = (i9 == 32) | (i10 == 4);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                i4 = 0;
                O = new nu8(function1, qu8Var, i4);
                av8Var2.n0(O);
            } else {
                i4 = 0;
            }
            Function0 function0 = (Function0) O;
            int i11 = i9 == 32 ? 1 : i4;
            if (i10 == 4) {
                i4 = 1;
            }
            int i12 = i4 | i11;
            Object O2 = av8Var2.O();
            if (i12 != 0 || O2 == a99Var) {
                O2 = new nu8(function1, qu8Var, 1);
                av8Var2.n0(O2);
            }
            av8Var = av8Var2;
            pco.a(i8, x43Var, xtcVar, H, H2, null, H3, null, null, null, false, z, false, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, function1, function0, (Function0) O2, av8Var, (i3 & 896) | 1600512, (i3 << 15) & 3670016, 63392);
        } else {
            av8Var = av8Var2;
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new ou8(qu8Var, function1, xtcVar, i2, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r11v6, types: [xtc] */
    public static final void h(String str, String str2, boolean z, Function1 function1, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-410337923);
        int i3 = i2 | (av8Var.g(str) ? 4 : 2) | (av8Var.g(str2) ? 32 : 16) | (av8Var.h(z) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function1) ? 2048 : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            Activity activity = (Activity) av8Var.k(ngb.a);
            boolean z2 = ((Configuration) av8Var.k(nz.a)).orientation == 2;
            int i4 = i3 & 7168;
            boolean i5 = (i4 == 2048) | av8Var.i(activity);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (i5 || O == a99Var) {
                O = new fej(17, function1, activity);
                av8Var.n0(O);
            }
            tol.a((i3 >> 6) & 14, 0, av8Var, (Function0) O, z);
            Boolean valueOf = Boolean.valueOf(z2);
            boolean i6 = av8Var.i(activity) | av8Var.h(z2);
            Object O2 = av8Var.O();
            if (i6 || O2 == a99Var) {
                O2 = new apk(activity, z2, (rq3) null);
                av8Var.n0(O2);
            }
            hz8.o(av8Var, valueOf, (Function2) O2);
            g28 g28Var = bkh.c;
            xtc q2 = n9e.q(g28Var, r13.b, oyn.e);
            k1c c2 = e12.c(uxf.g, false);
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
            g28 p2 = z2 ? g28Var : qx9.p(bkh.d(utc.a, 1.0f), 1.7777778f);
            qqk qqkVar = qqk.b;
            boolean i7 = (i4 == 2048) | av8Var.i(activity) | ((i3 & 896) == 256);
            Object O3 = av8Var.O();
            if (i7 || O3 == a99Var) {
                O3 = new l4b(z, function1, (Object) activity, 8);
                av8Var.n0(O3);
            }
            rd0.q(str, str2, p2, (ct8) O3, false, null, null, qqkVar, av8Var, (i3 & 14) | 805306368 | (i3 & 112), 496);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u2 = av8Var.u();
        if (u2 != null) {
            u2.d = new p81(str, str2, z, function1, i2, 25);
        }
    }

    public static j23 i(j23 j23Var) {
        u5l u5lVar = xw3.f;
        de0 de0Var = de0.e;
        if (kik.p(j23Var.b, 12884901888L)) {
            b5g b5gVar = (b5g) j23Var;
            u5l u5lVar2 = b5gVar.d;
            if (!l(u5lVar2, u5lVar)) {
                return new b5g(b5gVar.a, b5gVar.h, u5lVar, F(k((float[]) de0Var.b, u5lVar2.a(), u5lVar.a()), b5gVar.i), b5gVar.k, b5gVar.n, b5gVar.e, b5gVar.f, b5gVar.g, -1);
            }
        }
        return j23Var;
    }

    /* JADX WARN: Code restructure failed: missing block: B:4:0x0040, code lost:
    
        if (r13 != null) goto L8;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void j(final p12 p12Var, final m22 m22Var, int i2, final boolean z, Integer num, final yzc yzcVar, Function1 function1, Function1 function12) {
        String b2;
        String str;
        r9k b3;
        v12 v12Var = (v12) p12Var.l;
        v12 v12Var2 = (v12) p12Var.j;
        v12 v12Var3 = (v12) p12Var.i;
        v12 v12Var4 = (v12) p12Var.k;
        yzcVar.getClass();
        function1.getClass();
        TextView textView = (TextView) p12Var.c;
        ImageButton imageButton = (ImageButton) p12Var.d;
        ImageButton imageButton2 = (ImageButton) p12Var.e;
        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView = (ScrollInterceptorHorizontalScrollView) p12Var.g;
        LinearLayout linearLayout = (LinearLayout) p12Var.f;
        ConstraintLayout constraintLayout = (ConstraintLayout) p12Var.b;
        if (num != null) {
            b2 = constraintLayout.getContext().getString(num.intValue());
        }
        r9k r9kVar = m22Var.b;
        Context context = constraintLayout.getContext();
        context.getClass();
        b2 = r9kVar.b(context);
        textView.setText(b2);
        ((FrameLayout) p12Var.h).setOnClickListener(new qh(9, function1, m22Var, p12Var));
        if (!z) {
            linearLayout.setPaddingRelative(linearLayout.getPaddingStart(), linearLayout.getPaddingTop(), 0, linearLayout.getPaddingBottom());
        }
        boolean z2 = m22Var.g;
        boolean z3 = m22Var.i;
        ArrayList arrayList = m22Var.c;
        boolean z4 = m22Var.j;
        if (!z2) {
            scrollInterceptorHorizontalScrollView.setOnScrollChangeListener(null);
            imageButton.setVisibility(4);
            imageButton2.setVisibility(4);
            scrollInterceptorHorizontalScrollView.setVisibility(4);
            ArrayList arrayList2 = new ArrayList();
            Iterator it = arrayList.iterator();
            while (it.hasNext()) {
                Object next = it.next();
                if (!((x12) next).c()) {
                    arrayList2.add(next);
                }
            }
            if (z3) {
                ConstraintLayout constraintLayout2 = v12Var4.a;
                constraintLayout2.getClass();
                ViewGroup.LayoutParams layoutParams = constraintLayout2.getLayoutParams();
                if (layoutParams == null) {
                    yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                    return;
                }
                ViewGroup.MarginLayoutParams marginLayoutParams = (ViewGroup.MarginLayoutParams) layoutParams;
                Context context2 = constraintLayout.getContext();
                context2.getClass();
                marginLayoutParams.setMarginEnd(ao2.s(32, context2));
                constraintLayout2.setLayoutParams(marginLayoutParams);
            }
            int i3 = 0;
            for (Object obj : b.j(v12Var3, v12Var2, v12Var4, v12Var)) {
                int i4 = i3 + 1;
                if (i3 < 0) {
                    b.q();
                    throw null;
                }
                v12 v12Var5 = (v12) obj;
                if (i3 < i2) {
                    x12 x12Var = (x12) CollectionsKt.a0(i3, arrayList2);
                    View view = v12Var5.b;
                    ImageView imageView = v12Var5.d;
                    TextView textView2 = v12Var5.c;
                    ConstraintLayout constraintLayout3 = v12Var5.a;
                    view.setVisibility((x12Var == null || i3 == 0) ? 8 : 0);
                    mm3 mm3Var = new mm3();
                    mm3Var.e(constraintLayout3);
                    mm3Var.f(v12Var5.b.getId(), 4, 0, 4);
                    mm3Var.a(constraintLayout3);
                    constraintLayout3.setVisibility(0);
                    if (x12Var == null || (b3 = x12Var.b()) == null) {
                        str = null;
                    } else {
                        Context context3 = constraintLayout3.getContext();
                        context3.getClass();
                        str = b3.b(context3);
                    }
                    textView2.setText(str);
                    if (Intrinsics.c(x12Var, m22Var.f) && m22Var.d && z4) {
                        imageView.setVisibility(0);
                        haa.G(textView2);
                    } else {
                        imageView.setVisibility(4);
                        haa.D(textView2);
                    }
                    constraintLayout3.setOnClickListener(new t12(m22Var, x12Var, function12));
                } else {
                    ConstraintLayout constraintLayout4 = v12Var5.a;
                    constraintLayout4.getClass();
                    constraintLayout4.setVisibility(8);
                }
                i3 = i4;
            }
            return;
        }
        Context context4 = constraintLayout.getContext();
        context4.getClass();
        final boolean c0 = hkg.c0(context4);
        Iterator it2 = b.j(v12Var3, v12Var2, v12Var4, v12Var).iterator();
        while (it2.hasNext()) {
            ConstraintLayout constraintLayout5 = ((v12) it2.next()).a;
            constraintLayout5.getClass();
            constraintLayout5.setVisibility(8);
        }
        scrollInterceptorHorizontalScrollView.setVisibility(0);
        if (z3) {
            ViewGroup.LayoutParams layoutParams2 = imageButton2.getLayoutParams();
            if (layoutParams2 == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.MarginLayoutParams");
                return;
            }
            ViewGroup.MarginLayoutParams marginLayoutParams2 = (ViewGroup.MarginLayoutParams) layoutParams2;
            Context context5 = constraintLayout.getContext();
            context5.getClass();
            marginLayoutParams2.setMarginEnd(ao2.s(24, context5));
            imageButton2.setLayoutParams(marginLayoutParams2);
        }
        linearLayout.setHorizontalGravity(8);
        final int i5 = 1;
        if (c0) {
            constraintLayout.setLayoutDirection(1);
            textView.setGravity(8388629);
        }
        scrollInterceptorHorizontalScrollView.post(new q12(c0, p12Var, yzcVar, m22Var, 0));
        if (linearLayout.getChildCount() > 0) {
            linearLayout.removeAllViews();
        }
        IntRange h2 = b.h(arrayList);
        int c2 = sub.c(k13.r(h2, 10));
        if (c2 < 16) {
            c2 = 16;
        }
        LinkedHashMap linkedHashMap = new LinkedHashMap(c2);
        v6a it3 = h2.iterator();
        while (it3.c) {
            Object next2 = it3.next();
            ((Number) next2).intValue();
            View inflate = LayoutInflater.from(linearLayout.getContext()).inflate(R.layout.box_score_category_name_item, (ViewGroup) linearLayout, false);
            linearLayout.addView(inflate);
            v12 a2 = v12.a(inflate);
            ConstraintLayout constraintLayout6 = a2.a;
            constraintLayout6.getClass();
            ViewGroup.LayoutParams layoutParams3 = constraintLayout6.getLayoutParams();
            if (layoutParams3 == null) {
                yhk.s("null cannot be cast to non-null type android.view.ViewGroup.LayoutParams");
                return;
            }
            layoutParams3.height = -1;
            Context context6 = linearLayout.getContext();
            context6.getClass();
            layoutParams3.width = ao2.s(42, context6);
            constraintLayout6.setLayoutParams(layoutParams3);
            a2.b.setVisibility(z4 ? 0 : 8);
            if (!z4) {
                a2.c.setTextAppearance(R.style.TableMedium);
            }
            linkedHashMap.put(next2, a2);
        }
        scrollInterceptorHorizontalScrollView.setOnScrollChangeListener(new View.OnScrollChangeListener() { // from class: r12
            @Override // android.view.View.OnScrollChangeListener
            public final void onScrollChange(View view2, int i6, int i7, int i8, int i9) {
                HashMap hashMap;
                pd0.M(p12.this, z, c0);
                yzc yzcVar2 = yzcVar;
                hf9 hf9Var = (hf9) yzcVar2.d();
                if (hf9Var == null || (hashMap = hf9Var.d) == null) {
                    hashMap = new HashMap();
                }
                m22 m22Var2 = m22Var;
                hashMap.put(m22Var2.a, Integer.valueOf(i6));
                yzcVar2.j(((hf9) yzcVar2.d()) != null ? new hf9(i6, i8, m22Var2, hashMap) : null);
            }
        });
        final int i6 = 0;
        imageButton.setOnClickListener(new View.OnClickListener() { // from class: s12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i7 = i6;
                p12 p12Var2 = p12Var;
                switch (i7) {
                    case 0:
                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView2 = (ScrollInterceptorHorizontalScrollView) p12Var2.g;
                        int scrollX = scrollInterceptorHorizontalScrollView2.getScrollX();
                        Context context7 = ((ImageButton) p12Var2.d).getContext();
                        context7.getClass();
                        scrollInterceptorHorizontalScrollView2.scrollTo(scrollX - ao2.s(42, context7), 0);
                        break;
                    default:
                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView3 = (ScrollInterceptorHorizontalScrollView) p12Var2.g;
                        int scrollX2 = scrollInterceptorHorizontalScrollView3.getScrollX();
                        Context context8 = ((ImageButton) p12Var2.d).getContext();
                        context8.getClass();
                        scrollInterceptorHorizontalScrollView3.scrollTo(ao2.s(42, context8) + scrollX2, 0);
                        break;
                }
            }
        });
        imageButton2.setOnClickListener(new View.OnClickListener() { // from class: s12
            @Override // android.view.View.OnClickListener
            public final void onClick(View view2) {
                int i7 = i5;
                p12 p12Var2 = p12Var;
                switch (i7) {
                    case 0:
                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView2 = (ScrollInterceptorHorizontalScrollView) p12Var2.g;
                        int scrollX = scrollInterceptorHorizontalScrollView2.getScrollX();
                        Context context7 = ((ImageButton) p12Var2.d).getContext();
                        context7.getClass();
                        scrollInterceptorHorizontalScrollView2.scrollTo(scrollX - ao2.s(42, context7), 0);
                        break;
                    default:
                        ScrollInterceptorHorizontalScrollView scrollInterceptorHorizontalScrollView3 = (ScrollInterceptorHorizontalScrollView) p12Var2.g;
                        int scrollX2 = scrollInterceptorHorizontalScrollView3.getScrollX();
                        Context context8 = ((ImageButton) p12Var2.d).getContext();
                        context8.getClass();
                        scrollInterceptorHorizontalScrollView3.scrollTo(ao2.s(42, context8) + scrollX2, 0);
                        break;
                }
            }
        });
        for (Map.Entry entry : linkedHashMap.entrySet()) {
            int intValue = ((Number) entry.getKey()).intValue();
            Object value = entry.getValue();
            value.getClass();
            v12 v12Var6 = (v12) value;
            ConstraintLayout constraintLayout7 = v12Var6.a;
            x12 x12Var2 = (x12) arrayList.get(intValue);
            if (intValue == 0) {
                v12Var6.b.setVisibility(8);
            }
            ImageView imageView2 = v12Var6.d;
            TextView textView3 = v12Var6.c;
            constraintLayout7.setVisibility(0);
            r9k b4 = x12Var2.b();
            Context context7 = constraintLayout.getContext();
            context7.getClass();
            textView3.setText(b4.b(context7));
            if (x12Var2.equals(m22Var.f) && m22Var.d && z4) {
                imageView2.setVisibility(0);
                haa.G(textView3);
            } else {
                imageView2.setVisibility(4);
                haa.D(textView3);
            }
            constraintLayout7.setOnClickListener(new t12(m22Var, function12, x12Var2));
        }
        scrollInterceptorHorizontalScrollView.post(new u12(0, p12Var, z, c0));
    }

    public static final float[] k(float[] fArr, float[] fArr2, float[] fArr3) {
        G(fArr, fArr2);
        G(fArr, fArr3);
        float[] fArr4 = {fArr3[0] / fArr2[0], fArr3[1] / fArr2[1], fArr3[2] / fArr2[2]};
        float[] A = A(fArr);
        float f2 = fArr4[0];
        float f3 = fArr[0] * f2;
        float f4 = fArr4[1];
        float f5 = fArr[1] * f4;
        float f6 = fArr4[2];
        return F(A, new float[]{f3, f5, fArr[2] * f6, fArr[3] * f2, fArr[4] * f4, fArr[5] * f6, f2 * fArr[6], f4 * fArr[7], f6 * fArr[8]});
    }

    public static final boolean l(u5l u5lVar, u5l u5lVar2) {
        if (u5lVar == u5lVar2) {
            return true;
        }
        return Math.abs(u5lVar.a - u5lVar2.a) < 0.001f && Math.abs(u5lVar.b - u5lVar2.b) < 0.001f;
    }

    public static final vk3 m(j23 j23Var, j23 j23Var2) {
        return j23Var == j23Var2 ? new tk3(j23Var, j23Var, 1) : (kik.p(j23Var.b, 12884901888L) && kik.p(j23Var2.b, 12884901888L)) ? new uk3((b5g) j23Var, (b5g) j23Var2) : new vk3(j23Var, j23Var2, 0);
    }

    public static final aa8 n(z88 z88Var, int i2) {
        if (i2 >= 0) {
            return new aa8(z88Var, i2, 0);
        }
        ogj.h(ljg.j(i2, "Drop count should be non-negative, but had "));
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void o(b98 b98Var, Object obj, Object obj2, sq3 sq3Var) {
        ea8 ea8Var;
        int i2;
        if (sq3Var instanceof ea8) {
            ea8Var = (ea8) sq3Var;
            int i3 = ea8Var.t;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                ea8Var.t = i3 - Integer.MIN_VALUE;
                Object obj3 = ea8Var.s;
                Object obj4 = lu3.a;
                i2 = ea8Var.t;
                if (i2 != 0) {
                    y6a.M(obj3);
                    ea8Var.r = obj2;
                    ea8Var.t = 1;
                    if (b98Var.emit(obj, ea8Var) == obj4) {
                        return;
                    }
                } else if (i2 != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return;
                } else {
                    obj2 = ea8Var.r;
                    y6a.M(obj3);
                }
                throw new f0(obj2);
            }
        }
        ea8Var = new ea8(sq3Var);
        Object obj32 = ea8Var.s;
        Object obj42 = lu3.a;
        i2 = ea8Var.t;
        if (i2 != 0) {
        }
        throw new f0(obj2);
    }

    public static void p(Canvas canvas, boolean z) {
        Method method;
        int i2 = Build.VERSION.SDK_INT;
        if (i2 >= 29) {
            eq3.m(canvas, z);
            return;
        }
        if (!m) {
            try {
                if (i2 == 28) {
                    Method declaredMethod = Class.class.getDeclaredMethod("getDeclaredMethod", String.class, new Class[0].getClass());
                    k = (Method) declaredMethod.invoke(Canvas.class, "insertReorderBarrier", new Class[0]);
                    l = (Method) declaredMethod.invoke(Canvas.class, "insertInorderBarrier", new Class[0]);
                } else {
                    k = Canvas.class.getDeclaredMethod("insertReorderBarrier", null);
                    l = Canvas.class.getDeclaredMethod("insertInorderBarrier", null);
                }
                Method method2 = k;
                if (method2 != null) {
                    method2.setAccessible(true);
                }
                Method method3 = l;
                if (method3 != null) {
                    method3.setAccessible(true);
                }
            } catch (IllegalAccessException | NoSuchMethodException | InvocationTargetException unused) {
            }
            m = true;
        }
        if (z) {
            try {
                Method method4 = k;
                if (method4 != null) {
                    method4.invoke(canvas, null);
                }
            } catch (IllegalAccessException | InvocationTargetException unused2) {
                return;
            }
        }
        if (z || (method = l) == null) {
            return;
        }
        method.invoke(canvas, null);
    }

    public static final xtc q(int i2, of3 of3Var, xtc xtcVar) {
        xtcVar.getClass();
        return n9e.p(n9e.q(xtcVar, lz.D(R.color.graphics_dark, of3Var), oyn.e), wxf.E(b.j(new r13(hkg.b(i2)), new r13(r13.h)), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6);
    }

    public static final xtc r(xtc xtcVar, boolean z, wzc wzcVar) {
        return xtcVar.z(z ? new re8(wzcVar) : utc.a);
    }

    public static Application s(Context context) {
        if (context instanceof Application) {
            return (Application) context;
        }
        Context context2 = context;
        while (context2 instanceof ContextWrapper) {
            context2 = ((ContextWrapper) context2).getBaseContext();
            if (context2 instanceof Application) {
                return (Application) context2;
            }
        }
        yhk.r(context, "Could not find an Application in the given context: ");
        return null;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x0078  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x007f A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:34:0x003e  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0040  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x0044  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static String t(Time time, int i2) {
        int i3;
        int i4;
        Integer played = time != null ? time.getPlayed() : null;
        Integer periodLength = time != null ? time.getPeriodLength() : null;
        Integer totalPeriodCount = time != null ? time.getTotalPeriodCount() : null;
        if (time != null && played != null && periodLength != null && totalPeriodCount != null) {
            int intValue = totalPeriodCount.intValue() * periodLength.intValue();
            if (i2 == 40) {
                i3 = played.intValue() - intValue;
            } else {
                switch (i2) {
                    case 1:
                    case 6:
                        i4 = 1;
                        break;
                    case 2:
                    case 7:
                        i4 = 2;
                        break;
                    case 3:
                        i4 = 3;
                        break;
                    case 4:
                        i4 = 4;
                        break;
                    case 5:
                        i4 = 5;
                        break;
                    default:
                        switch (i2) {
                            case 13:
                                break;
                            case 14:
                                break;
                            case 15:
                                break;
                            case 16:
                                break;
                            default:
                                i4 = -1;
                                break;
                        }
                }
                if (i4 != -1) {
                    if (played.intValue() >= periodLength.intValue() * (i4 - 1)) {
                        i3 = played.intValue() < periodLength.intValue() * i4 ? played.intValue() % periodLength.intValue() : periodLength.intValue() - 60;
                    }
                }
            }
            if (i3 != -1) {
                i3 = (i3 / 60) + 1;
            }
            return i3 == -1 ? mz1.i(i3, "'") : "";
        }
        i3 = -1;
        if (i3 != -1) {
        }
        if (i3 == -1) {
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:13:0x0058, code lost:
    
        r0 = y(r6.getTime(), r6.getStatus().getCode());
        r1 = defpackage.rei.k(r0, true);
        r3 = w(r5, r6.getStatusDescription());
     */
    /* JADX WARN: Code restructure failed: missing block: B:14:0x0075, code lost:
    
        if (r0 == (-1)) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0077, code lost:
    
        if (r3 == null) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:17:0x007f, code lost:
    
        return defpackage.lnb.o(r1, " ", r3);
     */
    /* JADX WARN: Removed duplicated region for block: B:21:0x009e  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String u(Context context, Event event) {
        String t2;
        context.getClass();
        event.getClass();
        String slug = event.getTournament().getCategory().getSport().getSlug();
        if (event.getTime() != null) {
            Time time = event.getTime();
            time.getClass();
            if (time.timeNotNull()) {
                if ((r1 = slug.hashCode()) != -2002238939) {
                    String w2 = w(context, event.getStatusDescription());
                    t2 = t(event.getTime(), event.getStatus().getCode());
                    if (t2.length() > 0) {
                        return dmi.r(w2, " (", t2, ")");
                    }
                } else {
                    String w22 = w(context, event.getStatusDescription());
                    t2 = t(event.getTime(), event.getStatus().getCode());
                    if (t2.length() > 0) {
                    }
                }
            }
        }
        if (event.isAwarded()) {
            String string = context.getString(R.string.reason_awarded);
            string.getClass();
            return string;
        }
        if (Intrinsics.c(event.getStatusType(), StatusKt.STATUS_NOT_STARTED) && event.getFinalResultOnly()) {
            return "FRO";
        }
        String u2 = z8e.u(context, event.getStatusDescription(), event.getSportSlug(), true);
        u2.getClass();
        return u2;
    }

    public static Pair v(long j2, Context context) {
        String i2;
        String str;
        String str2;
        String str3;
        context.getClass();
        long j3 = 1000 * j2;
        long currentTimeMillis = j3 - System.currentTimeMillis();
        long j4 = currentTimeMillis / 86400000;
        if (currentTimeMillis < 0) {
            if (ug5.u(j2)) {
                str2 = context.getString(R.string.today);
                str2.getClass();
            } else if (ug5.w(j2)) {
                str2 = context.getString(R.string.yesterday);
                str2.getClass();
            } else {
                bi4 bi4Var = bi4.PATTERN_DMY;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                str2 = fc6.i(j2, hk4.a(bi4Var.d()));
            }
            DateTimePatternGenerator b2 = hk4.b();
            String bestPattern = DateFormat.is24HourFormat(context) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
            bestPattern.getClass();
            str3 = fc6.i(j2, hk4.a(bestPattern));
        } else {
            if (j4 >= 1) {
                if (((int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(yaa.v())), vxd.o(Instant.ofEpochMilli(j3)))) == 1) {
                    DateTimePatternGenerator b3 = hk4.b();
                    String bestPattern2 = DateFormat.is24HourFormat(context) ? b3.getBestPattern("Hm") : b3.getBestPattern("hm");
                    bestPattern2.getClass();
                    str3 = fc6.i(j2, hk4.a(bestPattern2));
                    str2 = context.getString(R.string.tomorrow);
                    str2.getClass();
                } else {
                    i2 = rik.h(j2, bi4.PATTERN_DMY);
                    str = String.format("%s, %s", Arrays.copyOf(new Object[]{rik.h(j2, bi4.PATTERN_DAY_SHORT), rik.m(j2, context)}, 2));
                }
            } else {
                DateTimePatternGenerator b4 = hk4.b();
                String bestPattern3 = DateFormat.is24HourFormat(context) ? b4.getBestPattern("Hm") : b4.getBestPattern("hm");
                bestPattern3.getClass();
                i2 = fc6.i(j2, hk4.a(bestPattern3));
                String string = context.getString(R.string.today);
                if (!fc6.B(fc6.t(Instant.ofEpochSecond(j2)))) {
                    string = null;
                }
                if (string == null) {
                    str = context.getString(R.string.tomorrow);
                    str.getClass();
                } else {
                    str = string;
                }
            }
            String str4 = i2;
            str2 = str;
            str3 = str4;
        }
        return new Pair(str3, str2);
    }

    public static String w(Context context, String str) {
        switch (str.hashCode()) {
            case -1990994007:
                if (str.equals("1. quarter")) {
                    return context.getString(R.string.quarter_1_short);
                }
                return null;
            case -1782379738:
                if (str.equals("3. period")) {
                    return context.getString(R.string.period_3_short);
                }
                return null;
            case -1613044659:
                if (str.equals("1. extra")) {
                    return context.getString(R.string.extra_time_1_short);
                }
                return null;
            case -1601306165:
                if (str.equals("1. round")) {
                    return context.getString(R.string.round_1_short);
                }
                return null;
            case -1519767657:
                if (str.equals("2. half")) {
                    return context.getString(R.string.half_2_short);
                }
                return null;
            case -1102321368:
                if (str.equals("5. period")) {
                    return context.getString(R.string.period_5_short);
                }
                return null;
            case -667842456:
                if (str.equals("4. round")) {
                    return context.getString(R.string.round_4_short);
                }
                return null;
            case 2533:
                if (str.equals(PlayerKt.AMERICAN_FOOTBALL_OFFENSIVE_TACKLE)) {
                    return context.getString(R.string.overtime_short);
                }
                return null;
            case 25074725:
                if (str.equals("2. period")) {
                    return context.getString(R.string.period_2_short);
                }
                return null;
            case 129765676:
                if (str.equals("2. extra")) {
                    return context.getString(R.string.extra_time_2_short);
                }
                return null;
            case 141504170:
                if (str.equals("2. round")) {
                    return context.getString(R.string.round_2_short);
                }
                return null;
            case 705133095:
                if (str.equals("4. period")) {
                    return context.getString(R.string.period_4_short);
                }
                return null;
            case 1074967879:
                if (str.equals("5. round")) {
                    return context.getString(R.string.round_5_short);
                }
                return null;
            case 1714432774:
                if (str.equals("4. quarter")) {
                    return context.getString(R.string.quarter_4_short);
                }
                return null;
            case 1832529188:
                if (str.equals("1. period")) {
                    return context.getString(R.string.period_1_short);
                }
                return null;
            case 1884314505:
                if (str.equals("3. round")) {
                    return context.getString(R.string.round_3_short);
                }
                return null;
            case 1887695958:
                if (str.equals("1. half")) {
                    return context.getString(R.string.half_1_short);
                }
                return null;
            case 1910946279:
                if (str.equals("3. quarter")) {
                    return context.getString(R.string.quarter_3_short);
                }
                return null;
            case 2107459784:
                if (str.equals("2. quarter")) {
                    return context.getString(R.string.quarter_2_short);
                }
                return null;
            default:
                return null;
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x0048, code lost:
    
        if (((int) java.time.temporal.ChronoUnit.DAYS.between(defpackage.vxd.o(java.time.Instant.ofEpochMilli(defpackage.yaa.v())), defpackage.vxd.o(java.time.Instant.ofEpochMilli(r0)))) != 1) goto L15;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static Pair x(long j2) {
        long j3 = 1000 * j2;
        long currentTimeMillis = j3 - System.currentTimeMillis();
        long j4 = currentTimeMillis / 86400000;
        int i2 = 3;
        int i3 = 5;
        if (currentTimeMillis >= 0 || ug5.u(j2) || ug5.w(j2)) {
            if (j4 >= 1) {
            }
            i2 = 5;
        } else {
            i3 = 3;
            i2 = 5;
        }
        return new Pair(Integer.valueOf(i2), Integer.valueOf(i3));
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x0042  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0044  */
    /* JADX WARN: Removed duplicated region for block: B:35:0x0046  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0048  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final int y(Time time, int i2) {
        Integer played;
        int i3;
        if (time != null && (played = time.getPlayed()) != null) {
            int intValue = played.intValue();
            Integer periodLength = time.getPeriodLength();
            if (periodLength != null) {
                int intValue2 = periodLength.intValue();
                Integer overtimeLength = time.getOvertimeLength();
                if (overtimeLength != null) {
                    int intValue3 = overtimeLength.intValue();
                    Integer totalPeriodCount = time.getTotalPeriodCount();
                    if (totalPeriodCount != null) {
                        int intValue4 = totalPeriodCount.intValue();
                        int i4 = intValue2 * intValue4;
                        if (i2 == 40) {
                            int i5 = (intValue - i4) % intValue3;
                            if (i5 != 0) {
                                return intValue3 - i5;
                            }
                        } else {
                            switch (i2) {
                                case 1:
                                case 6:
                                    i3 = 1;
                                    break;
                                case 2:
                                case 7:
                                    i3 = 2;
                                    break;
                                case 3:
                                    i3 = 3;
                                    break;
                                case 4:
                                    i3 = 4;
                                    break;
                                case 5:
                                    i3 = 5;
                                    break;
                                default:
                                    switch (i2) {
                                        case 13:
                                            break;
                                        case 14:
                                            break;
                                        case 15:
                                            break;
                                        case 16:
                                            break;
                                        default:
                                            i3 = -1;
                                            break;
                                    }
                            }
                            if (i3 != -1 && intValue >= (i3 - 1) * intValue2) {
                                if (i3 > intValue4) {
                                    int i6 = intValue3 - ((intValue - i4) % intValue3);
                                    if (i6 != intValue3) {
                                        return i6;
                                    }
                                } else {
                                    int i7 = intValue2 - (intValue % intValue2);
                                    if (i7 != intValue2) {
                                        return i7;
                                    }
                                }
                                return 0;
                            }
                        }
                    }
                }
            }
        }
        return -1;
    }

    public static final View z(Activity activity) {
        if (cw3.a.contains(pd0.class) || activity == null) {
            return null;
        }
        try {
            Window window = activity.getWindow();
            if (window == null) {
                return null;
            }
            return window.getDecorView().getRootView();
        } catch (Exception unused) {
            return null;
        } catch (Throwable th) {
            cw3.a(pd0.class, th);
            return null;
        }
    }
}
