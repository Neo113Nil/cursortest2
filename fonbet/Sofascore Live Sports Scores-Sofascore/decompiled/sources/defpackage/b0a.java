package defpackage;

import android.app.ActionBar;
import android.app.Activity;
import android.app.Dialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.SharedPreferences;
import android.content.pm.PackageManager;
import android.database.SQLException;
import android.icu.text.DateTimePatternGenerator;
import android.os.Build;
import android.text.format.DateFormat;
import android.view.KeyEvent;
import android.view.View;
import android.view.Window;
import androidx.compose.runtime.e;
import androidx.compose.ui.graphics.vector.ImageVector;
import androidx.core.app.NotificationCompat;
import com.ironsource.mediationsdk.logger.IronSourceError;
import com.ironsource.mediationsdk.metadata.a;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import com.mbridge.msdk.playercommon.exoplayer2.source.ExtractorMediaSource;
import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.newNetwork.PowerRanking;
import com.sofascore.results.R;
import com.sofascore.results.team.TeamActivity;
import com.unity3d.services.UnityAdsConstants;
import com.vungle.ads.internal.protos.Sdk;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.lang.reflect.Modifier;
import java.time.Instant;
import java.time.LocalDate;
import java.time.ZoneId;
import java.time.chrono.ChronoLocalDateTime;
import java.time.format.DateTimeFormatterBuilder;
import java.time.format.FormatStyle;
import java.time.temporal.ChronoUnit;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import java.util.ServiceConfigurationError;
import java.util.ServiceLoader;
import java.util.concurrent.ConcurrentHashMap;
import java.util.zip.Inflater;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.collections.b;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.c;
import kotlinx.serialization.KSerializer;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public abstract class b0a {
    public static boolean a = false;
    public static Method b = null;
    public static boolean c = false;
    public static Field d;
    public static final /* synthetic */ int e = 0;
    public static final /* synthetic */ int f = 0;
    public static final /* synthetic */ int g = 0;
    public static final /* synthetic */ int h = 0;
    public static final /* synthetic */ int i = 0;
    public static final /* synthetic */ int j = 0;
    public static x2k k;
    public static Boolean l;

    public static final void A(int i2, int i3, int i4) {
        if (i2 < 0 || i3 > i4) {
            pvd.m(i4, lnb.s(i2, i3, "fromIndex: ", ", toIndex: ", ", size: "));
        } else {
            if (i2 <= i3) {
                return;
            }
            a70.p(dmi.k(i2, i3, "fromIndex: ", " > toIndex: "));
        }
    }

    /* JADX WARN: Code restructure failed: missing block: B:37:0x008d, code lost:
    
        if ((r18[r5] & 192) == 128) goto L30;
     */
    /* JADX WARN: Code restructure failed: missing block: B:64:0x00f5, code lost:
    
        if ((r18[r5] & 192) == 128) goto L55;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final String B(int i2, int i3, byte[] bArr) {
        int i4;
        int i5;
        int i6;
        int i7 = i2;
        if (i7 < 0 || i3 > bArr.length || i7 > i3) {
            StringBuilder sb = new StringBuilder("size=");
            me4.q(sb, bArr.length, " beginIndex=", i7, " endIndex=");
            pvd.m(i3, sb);
            return null;
        }
        char[] cArr = new char[i3 - i7];
        int i8 = 0;
        while (i7 < i3) {
            byte b2 = bArr[i7];
            if (b2 >= 0) {
                int i9 = i8 + 1;
                cArr[i8] = (char) b2;
                i7++;
                while (i7 < i3) {
                    byte b3 = bArr[i7];
                    if (b3 < 0) {
                        break;
                    }
                    i7++;
                    cArr[i9] = (char) b3;
                    i9++;
                }
                Unit unit = Unit.a;
                i8 = i9;
            } else {
                if ((b2 >> 5) == -2) {
                    int i10 = i7 + 1;
                    if (i3 <= i10) {
                        i4 = i8 + 1;
                        cArr[i8] = 65533;
                    } else {
                        byte b4 = bArr[i10];
                        if ((b4 & 192) == 128) {
                            int i11 = (b2 << 6) ^ (b4 ^ 3968);
                            if (i11 < 128) {
                                i4 = i8 + 1;
                                cArr[i8] = 65533;
                                Unit unit2 = Unit.a;
                            } else {
                                int i12 = i8 + 1;
                                cArr[i8] = (char) i11;
                                Unit unit3 = Unit.a;
                                i4 = i12;
                            }
                            i6 = 2;
                        } else {
                            i4 = i8 + 1;
                            cArr[i8] = 65533;
                        }
                    }
                    Unit unit4 = Unit.a;
                    i6 = 1;
                } else if ((b2 >> 4) == -2) {
                    int i13 = i7 + 2;
                    if (i3 <= i13) {
                        i4 = i8 + 1;
                        cArr[i8] = 65533;
                        Unit unit5 = Unit.a;
                        int i14 = i7 + 1;
                        if (i3 > i14) {
                        }
                        i6 = 1;
                    } else {
                        byte b5 = bArr[i7 + 1];
                        if ((b5 & 192) == 128) {
                            byte b6 = bArr[i13];
                            if ((b6 & 192) == 128) {
                                int i15 = (b2 << 12) ^ ((b6 ^ (-123008)) ^ (b5 << 6));
                                if (i15 < 2048) {
                                    i4 = i8 + 1;
                                    cArr[i8] = 65533;
                                } else if (55296 > i15 || i15 >= 57344) {
                                    int i16 = i8 + 1;
                                    cArr[i8] = (char) i15;
                                    Unit unit6 = Unit.a;
                                    i4 = i16;
                                    i6 = 3;
                                } else {
                                    i4 = i8 + 1;
                                    cArr[i8] = 65533;
                                }
                                Unit unit7 = Unit.a;
                                i6 = 3;
                            } else {
                                i4 = i8 + 1;
                                cArr[i8] = 65533;
                                Unit unit8 = Unit.a;
                                i6 = 2;
                            }
                        } else {
                            i4 = i8 + 1;
                            cArr[i8] = 65533;
                            Unit unit9 = Unit.a;
                            i6 = 1;
                        }
                    }
                } else if ((b2 >> 3) == -2) {
                    int i17 = i7 + 3;
                    if (i3 <= i17) {
                        i4 = i8 + 1;
                        cArr[i8] = 65533;
                        Unit unit10 = Unit.a;
                        int i18 = i7 + 1;
                        if (i3 > i18 && (bArr[i18] & 192) == 128) {
                            int i19 = i7 + 2;
                            if (i3 > i19) {
                            }
                            i6 = 2;
                        }
                        i6 = 1;
                    } else {
                        byte b7 = bArr[i7 + 1];
                        if ((b7 & 192) == 128) {
                            byte b8 = bArr[i7 + 2];
                            if ((b8 & 192) == 128) {
                                byte b9 = bArr[i17];
                                if ((b9 & 192) == 128) {
                                    int i20 = (b2 << 18) ^ (((b9 ^ 3678080) ^ (b8 << 6)) ^ (b7 << 12));
                                    if (i20 > 1114111) {
                                        i4 = i8 + 1;
                                        cArr[i8] = 65533;
                                    } else if (55296 <= i20 && i20 < 57344) {
                                        i4 = i8 + 1;
                                        cArr[i8] = 65533;
                                    } else if (i20 < 65536) {
                                        i4 = i8 + 1;
                                        cArr[i8] = 65533;
                                    } else {
                                        if (i20 != 65533) {
                                            cArr[i8] = (char) ((i20 >>> 10) + 55232);
                                            i5 = i8 + 2;
                                            cArr[i8 + 1] = (char) ((i20 & IronSourceError.ERROR_RV_SHOW_CALLED_WRONG_STATE) + 56320);
                                        } else {
                                            cArr[i8] = 65533;
                                            i5 = i8 + 1;
                                        }
                                        Unit unit11 = Unit.a;
                                        i4 = i5;
                                        i6 = 4;
                                    }
                                    Unit unit12 = Unit.a;
                                    i6 = 4;
                                } else {
                                    i4 = i8 + 1;
                                    cArr[i8] = 65533;
                                    Unit unit13 = Unit.a;
                                    i6 = 3;
                                }
                            } else {
                                i4 = i8 + 1;
                                cArr[i8] = 65533;
                                Unit unit14 = Unit.a;
                                i6 = 2;
                            }
                        } else {
                            i4 = i8 + 1;
                            cArr[i8] = 65533;
                            Unit unit15 = Unit.a;
                            i6 = 1;
                        }
                    }
                } else {
                    i4 = i8 + 1;
                    cArr[i8] = 65533;
                    i7++;
                    i8 = i4;
                }
                i7 += i6;
                i8 = i4;
            }
        }
        return c.i(cArr, 0, i8);
    }

    /* JADX WARN: Can't wrap try/catch for region: R(15:58|(1:(2:60|(1:113)(1:64))(2:115|116))|(4:108|109|(8:82|83|(1:(3:85|(1:103)(1:(1:91)(2:88|89))|90)(2:104|(1:106)))|92|(1:102)(1:96)|97|(1:99)|101)|(1:71)(4:72|(2:74|(2:76|(1:78))(1:79))|80|81))|66|(1:68)|82|83|(2:(0)(0)|90)|92|(1:94)|102|97|(0)|101|(0)(0)) */
    /* JADX WARN: Code restructure failed: missing block: B:121:0x00f0, code lost:
    
        if (r12 == false) goto L51;
     */
    /* JADX WARN: Code restructure failed: missing block: B:126:0x00aa, code lost:
    
        if (r11 == false) goto L35;
     */
    /* JADX WARN: Code restructure failed: missing block: B:36:0x00a3, code lost:
    
        r12 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:104:0x0173 A[SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:57:0x0102 A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:58:0x0103  */
    /* JADX WARN: Removed duplicated region for block: B:71:0x018e A[RETURN] */
    /* JADX WARN: Removed duplicated region for block: B:72:0x018f  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x015b A[Catch: NoSuchFieldException -> 0x018b, TryCatch #1 {NoSuchFieldException -> 0x018b, blocks: (B:83:0x014d, B:85:0x015b, B:94:0x0178, B:96:0x017e, B:97:0x0184, B:99:0x0188, B:90:0x0170), top: B:82:0x014d }] */
    /* JADX WARN: Removed duplicated region for block: B:99:0x0188 A[Catch: NoSuchFieldException -> 0x018b, TRY_LEAVE, TryCatch #1 {NoSuchFieldException -> 0x018b, blocks: (B:83:0x014d, B:85:0x015b, B:94:0x0178, B:96:0x017e, B:97:0x0184, B:99:0x0188, B:90:0x0170), top: B:82:0x014d }] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final KSerializer C(Class cls, KSerializer... kSerializerArr) {
        Object obj;
        KSerializer kSerializer;
        Field field;
        Object obj2;
        KSerializer kSerializer2;
        int length;
        int i2;
        Object obj3;
        Field field2;
        if (cls.isEnum() && cls.getAnnotation(r5h.class) == null && cls.getAnnotation(yze.class) == null) {
            Object[] enumConstants = cls.getEnumConstants();
            String canonicalName = cls.getCanonicalName();
            canonicalName.getClass();
            enumConstants.getClass();
            return new qq3(canonicalName, (Enum[]) enumConstants);
        }
        KSerializer[] kSerializerArr2 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
        try {
            Field declaredField = cls.getDeclaredField("Companion");
            declaredField.setAccessible(true);
            obj = declaredField.get(null);
        } catch (Throwable unused) {
            obj = null;
        }
        KSerializer J = obj == null ? null : J(obj, (KSerializer[]) Arrays.copyOf(kSerializerArr2, kSerializerArr2.length));
        if (J != null) {
            return J;
        }
        String canonicalName2 = cls.getCanonicalName();
        if (canonicalName2 != null && !c.v(canonicalName2, "java.", false) && !c.v(canonicalName2, "kotlin.", false)) {
            Field[] declaredFields = cls.getDeclaredFields();
            declaredFields.getClass();
            int length2 = declaredFields.length;
            Field field3 = null;
            int i3 = 0;
            boolean z = false;
            while (true) {
                if (i3 < length2) {
                    Field field4 = declaredFields[i3];
                    if (Intrinsics.c(field4.getName(), "INSTANCE") && Intrinsics.c(field4.getType(), cls) && Modifier.isStatic(field4.getModifiers())) {
                        if (z) {
                            break;
                        }
                        z = true;
                        field3 = field4;
                    }
                    i3++;
                }
            }
            if (field3 != null) {
                Object obj4 = field3.get(null);
                Method[] methods = cls.getMethods();
                methods.getClass();
                int length3 = methods.length;
                Method method = null;
                int i4 = 0;
                boolean z2 = false;
                while (true) {
                    if (i4 < length3) {
                        Method method2 = methods[i4];
                        if (Intrinsics.c(method2.getName(), "serializer")) {
                            Class<?>[] parameterTypes = method2.getParameterTypes();
                            parameterTypes.getClass();
                            if (parameterTypes.length == 0 && Intrinsics.c(method2.getReturnType(), KSerializer.class)) {
                                if (z2) {
                                    break;
                                }
                                z2 = true;
                                method = method2;
                            }
                        }
                        i4++;
                    }
                }
                method = null;
                if (method != null) {
                    Object invoke = method.invoke(obj4, null);
                    if (invoke instanceof KSerializer) {
                        kSerializer = (KSerializer) invoke;
                        if (kSerializer == null) {
                            return kSerializer;
                        }
                        KSerializer[] kSerializerArr3 = (KSerializer[]) Arrays.copyOf(kSerializerArr, kSerializerArr.length);
                        Field[] declaredFields2 = cls.getDeclaredFields();
                        declaredFields2.getClass();
                        int length4 = declaredFields2.length;
                        int i5 = 0;
                        while (true) {
                            if (i5 >= length4) {
                                field = null;
                                break;
                            }
                            field = declaredFields2[i5];
                            if (Modifier.isStatic(field.getModifiers()) && field.getType().getAnnotation(n3d.class) != null) {
                                break;
                            }
                            i5++;
                        }
                        if (field != null) {
                            try {
                                field.setAccessible(true);
                                obj2 = field.get(null);
                            } catch (Throwable unused2) {
                            }
                            if (obj2 != null || (kSerializer2 = J(obj2, (KSerializer[]) Arrays.copyOf(kSerializerArr3, kSerializerArr3.length))) == null) {
                                Class<?>[] declaredClasses = cls.getDeclaredClasses();
                                declaredClasses.getClass();
                                length = declaredClasses.length;
                                Class<?> cls2 = null;
                                i2 = 0;
                                boolean z3 = false;
                                while (true) {
                                    if (i2 >= length) {
                                        Class<?> cls3 = declaredClasses[i2];
                                        if (cls3.getSimpleName().equals("$serializer")) {
                                            if (z3) {
                                                break;
                                            }
                                            z3 = true;
                                            cls2 = cls3;
                                        }
                                        i2++;
                                    } else if (!z3) {
                                    }
                                }
                                cls2 = null;
                                obj3 = (cls2 != null || (field2 = cls2.getField("INSTANCE")) == null) ? null : field2.get(null);
                                if (obj3 instanceof KSerializer) {
                                    kSerializer2 = (KSerializer) obj3;
                                }
                                kSerializer2 = null;
                            }
                            if (kSerializer2 == null) {
                                return kSerializer2;
                            }
                            if (cls.getAnnotation(yze.class) == null) {
                                r5h r5hVar = (r5h) cls.getAnnotation(r5h.class);
                                if (r5hVar == null) {
                                    return null;
                                }
                                Class with = r5hVar.with();
                                fuf fufVar = duf.a;
                                if (!Intrinsics.c(fufVar.getOrCreateKotlinClass(with), fufVar.getOrCreateKotlinClass(a0f.class))) {
                                    return null;
                                }
                            }
                            return new a0f(duf.a.getOrCreateKotlinClass(cls));
                        }
                        obj2 = null;
                        if (obj2 != null) {
                        }
                        Class<?>[] declaredClasses2 = cls.getDeclaredClasses();
                        declaredClasses2.getClass();
                        length = declaredClasses2.length;
                        Class<?> cls22 = null;
                        i2 = 0;
                        boolean z32 = false;
                        while (true) {
                            if (i2 >= length) {
                            }
                            i2++;
                        }
                        cls22 = null;
                        if (cls22 != null) {
                        }
                        if (obj3 instanceof KSerializer) {
                        }
                        kSerializer2 = null;
                        if (kSerializer2 == null) {
                        }
                    }
                }
            }
        }
        kSerializer = null;
        if (kSerializer == null) {
        }
    }

    public static e1d D() {
        return e.e(Unit.a, f7a.k);
    }

    /* JADX WARN: Removed duplicated region for block: B:56:0x00bf  */
    /* JADX WARN: Removed duplicated region for block: B:63:? A[RETURN, SYNTHETIC] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean E(tia tiaVar, View view, Window.Callback callback, KeyEvent keyEvent) {
        DialogInterface.OnKeyListener onKeyListener;
        Window window;
        boolean z = false;
        if (tiaVar != null) {
            if (Build.VERSION.SDK_INT >= 28) {
                return tiaVar.superDispatchKeyEvent(keyEvent);
            }
            if (callback instanceof Activity) {
                Activity activity = (Activity) callback;
                activity.onUserInteraction();
                Window window2 = activity.getWindow();
                if (window2.hasFeature(8)) {
                    ActionBar actionBar = activity.getActionBar();
                    if (keyEvent.getKeyCode() == 82 && actionBar != null) {
                        if (!a) {
                            try {
                                b = actionBar.getClass().getMethod("onMenuKeyEvent", KeyEvent.class);
                            } catch (NoSuchMethodException unused) {
                            }
                            a = true;
                        }
                        Method method = b;
                        if (method != null) {
                            try {
                                Object invoke = method.invoke(actionBar, keyEvent);
                                if (invoke != null) {
                                    z = ((Boolean) invoke).booleanValue();
                                }
                            } catch (IllegalAccessException | InvocationTargetException unused2) {
                            }
                        }
                        if (z) {
                            return true;
                        }
                    }
                }
                if (window2.superDispatchKeyEvent(keyEvent)) {
                    return true;
                }
                View decorView = window2.getDecorView();
                if (bsk.d(decorView, keyEvent)) {
                    return true;
                }
                return keyEvent.dispatch(activity, decorView != null ? decorView.getKeyDispatcherState() : null, activity);
            }
            if (callback instanceof Dialog) {
                Dialog dialog = (Dialog) callback;
                if (!c) {
                    try {
                        Field declaredField = Dialog.class.getDeclaredField("mOnKeyListener");
                        d = declaredField;
                        declaredField.setAccessible(true);
                    } catch (NoSuchFieldException unused3) {
                    }
                    c = true;
                }
                Field field = d;
                if (field != null) {
                    try {
                        onKeyListener = (DialogInterface.OnKeyListener) field.get(dialog);
                    } catch (IllegalAccessException unused4) {
                    }
                    if (onKeyListener == null && onKeyListener.onKey(dialog, keyEvent.getKeyCode(), keyEvent)) {
                        return true;
                    }
                    window = dialog.getWindow();
                    if (!window.superDispatchKeyEvent(keyEvent)) {
                        return true;
                    }
                    View decorView2 = window.getDecorView();
                    if (bsk.d(decorView2, keyEvent)) {
                        return true;
                    }
                    return keyEvent.dispatch(dialog, decorView2 != null ? decorView2.getKeyDispatcherState() : null, dialog);
                }
                onKeyListener = null;
                if (onKeyListener == null) {
                }
                window = dialog.getWindow();
                if (!window.superDispatchKeyEvent(keyEvent)) {
                }
            } else if ((view != null && bsk.d(view, keyEvent)) || tiaVar.superDispatchKeyEvent(keyEvent)) {
                return true;
            }
        }
        return false;
    }

    public static final void F(glg glgVar, String str) {
        glgVar.getClass();
        str.getClass();
        nlg V0 = glgVar.V0(str);
        try {
            V0.U0();
            o1j.t(V0, null);
        } finally {
        }
    }

    public static String G(Context context) {
        SharedPreferences d2;
        context.getClass();
        SharedPreferences sharedPreferences = uic.j;
        if (sharedPreferences == null) {
            Context applicationContext = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences = d2;
        }
        return sharedPreferences.getString("REGION_USER_COUNTRY_ALPHA", null);
    }

    public static final oqf H(phe pheVar, int i2, gwj gwjVar, aej aejVar, boolean z, int i3) {
        oqf c2 = aejVar != null ? aejVar.c(gwjVar.b.v(i2)) : oqf.e;
        int e0 = pheVar.e0(2.0f);
        float f2 = c2.a;
        return oqf.b(c2, z ? (i3 - f2) - e0 : f2, z ? i3 - f2 : e0 + f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 10);
    }

    public static final Pair I(long j2, Context context) {
        long w = j2 - yaa.w();
        long j3 = w / 86400;
        if (w < 0) {
            context.getClass();
            DateTimePatternGenerator b2 = hk4.b();
            String bestPattern = DateFormat.is24HourFormat(context) ? b2.getBestPattern("Hm") : b2.getBestPattern("hm");
            bestPattern.getClass();
            return new Pair(new m9k(fc6.i(j2, hk4.a(bestPattern))), ug5.u(j2) ? new q9k(R.string.today) : ug5.w(j2) ? new q9k(R.string.yesterday) : new m9k(fc6.i(j2, hk4.a(bi4.PATTERN_DMY.d()))));
        }
        if (j3 < 1) {
            context.getClass();
            DateTimePatternGenerator b3 = hk4.b();
            String bestPattern2 = DateFormat.is24HourFormat(context) ? b3.getBestPattern("Hm") : b3.getBestPattern("hm");
            bestPattern2.getClass();
            return new Pair(new m9k(fc6.i(j2, hk4.a(bestPattern2))), fc6.B(fc6.t(Instant.ofEpochSecond(j2))) ? new q9k(R.string.today) : new q9k(R.string.tomorrow));
        }
        if (((int) ChronoUnit.DAYS.between(vxd.o(Instant.ofEpochMilli(yaa.v())), vxd.o(Instant.ofEpochMilli(1000 * j2)))) != 1) {
            return new Pair(new m9k(rik.h(j2, bi4.PATTERN_DMY)), new m9k(lnb.o(rik.h(j2, bi4.PATTERN_DAY_SHORT), " ", rik.m(j2, context))));
        }
        context.getClass();
        DateTimePatternGenerator b4 = hk4.b();
        String bestPattern3 = DateFormat.is24HourFormat(context) ? b4.getBestPattern("Hm") : b4.getBestPattern("hm");
        bestPattern3.getClass();
        return new Pair(new m9k(fc6.i(j2, hk4.a(bestPattern3))), new q9k(R.string.tomorrow));
    }

    public static final KSerializer J(Object obj, KSerializer... kSerializerArr) {
        Class[] clsArr;
        try {
            if (kSerializerArr.length == 0) {
                clsArr = new Class[0];
            } else {
                int length = kSerializerArr.length;
                Class[] clsArr2 = new Class[length];
                for (int i2 = 0; i2 < length; i2++) {
                    clsArr2[i2] = KSerializer.class;
                }
                clsArr = clsArr2;
            }
            Object invoke = obj.getClass().getDeclaredMethod("serializer", (Class[]) Arrays.copyOf(clsArr, clsArr.length)).invoke(obj, Arrays.copyOf(kSerializerArr, kSerializerArr.length));
            if (invoke instanceof KSerializer) {
                return (KSerializer) invoke;
            }
            return null;
        } catch (NoSuchMethodException unused) {
            return null;
        } catch (InvocationTargetException e2) {
            Throwable cause = e2.getCause();
            if (cause == null) {
                throw e2;
            }
            String message = cause.getMessage();
            if (message == null) {
                message = e2.getMessage();
            }
            throw new InvocationTargetException(cause, message);
        }
    }

    public static boolean K(Context context) {
        Boolean bool = l;
        if (bool != null) {
            return bool.booleanValue();
        }
        try {
            boolean z = context.getPackageManager().getApplicationInfo(context.getPackageName(), 128).metaData.getBoolean("firebase_performance_logcat_enabled", false);
            l = Boolean.valueOf(z);
            return z;
        } catch (PackageManager.NameNotFoundException | NullPointerException e2) {
            l10 c2 = l10.c();
            e2.getMessage();
            c2.getClass();
            return false;
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r5v3 */
    /* JADX WARN: Type inference failed for: r5v4 */
    /* JADX WARN: Type inference failed for: r5v5, types: [java.lang.Iterable] */
    /* JADX WARN: Type inference failed for: r5v9, types: [java.util.ArrayList] */
    public static List L(Class cls, Iterable iterable, ClassLoader classLoader, f7h f7hVar) {
        ?? load;
        try {
            Class.forName("android.app.Application", false, classLoader);
            load = new ArrayList();
            Iterator it = iterable.iterator();
            while (it.hasNext()) {
                Class cls2 = (Class) it.next();
                Object obj = null;
                try {
                    obj = cls2.asSubclass(cls).getConstructor(null).newInstance(null);
                } catch (ClassCastException unused) {
                } catch (Throwable th) {
                    throw new ServiceConfigurationError(String.format("Provider %s could not be instantiated %s", cls2.getName(), th), th);
                }
                if (obj != null) {
                    load.add(obj);
                }
            }
        } catch (Exception unused2) {
            ServiceLoader load2 = ServiceLoader.load(cls, classLoader);
            load = !load2.iterator().hasNext() ? ServiceLoader.load(cls) : load2;
        }
        ArrayList arrayList = new ArrayList();
        for (Object obj2 : load) {
            if (f7hVar.n(obj2)) {
                arrayList.add(obj2);
            }
        }
        Collections.sort(arrayList, Collections.reverseOrder(new cp(f7hVar, 28)));
        return Collections.unmodifiableList(arrayList);
    }

    public static tmi M(tmi tmiVar) {
        return !(tmiVar instanceof vmi) ? tmiVar instanceof umi ? tmiVar : tmiVar instanceof Serializable ? new umi(tmiVar) : new vmi(tmiVar) : tmiVar;
    }

    /* JADX WARN: Code restructure failed: missing block: B:79:0x003c, code lost:
    
        if (r3 != 1918990112) goto L4;
     */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0195  */
    /* JADX WARN: Removed duplicated region for block: B:29:0x01ab A[SYNTHETIC] */
    /* JADX WARN: Type inference failed for: r1v15, types: [ldf] */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static ArrayList N(j9e j9eVar) {
        char c2;
        ArrayList arrayList;
        boolean z;
        ArrayList arrayList2;
        j9e j9eVar2 = j9eVar;
        ArrayList arrayList3 = null;
        if (j9eVar2.A() == 0) {
            char c3 = 7;
            j9eVar2.O(7);
            int m = j9eVar2.m();
            boolean z2 = true;
            if (m == 1684433976) {
                j9e j9eVar3 = new j9e();
                Inflater inflater = new Inflater(true);
                try {
                    if (!nik.M(j9eVar2, j9eVar3, inflater)) {
                        return null;
                    }
                    inflater.end();
                    j9eVar2 = j9eVar3;
                } finally {
                    inflater.end();
                }
            }
            ArrayList arrayList4 = new ArrayList();
            int i2 = j9eVar2.b;
            int i3 = j9eVar2.c;
            while (i2 < i3) {
                int m2 = j9eVar2.m() + i2;
                if (m2 > i2 && m2 <= i3) {
                    if (j9eVar2.m() == 1835365224) {
                        int m3 = j9eVar2.m();
                        if (m3 <= 10000) {
                            float[] fArr = new float[m3];
                            byte b2 = 0;
                            for (int i4 = 0; i4 < m3; i4++) {
                                fArr[i4] = Float.intBitsToFloat(j9eVar2.m());
                            }
                            int m4 = j9eVar2.m();
                            if (m4 <= 32000) {
                                double log = Math.log(2.0d);
                                c2 = c3;
                                ArrayList arrayList5 = arrayList3;
                                int ceil = (int) Math.ceil(Math.log(m3 * 2.0d) / log);
                                z = z2;
                                byte[] bArr = j9eVar2.a;
                                nm2 nm2Var = new nm2(bArr, bArr.length, 3, b2);
                                nm2Var.q(j9eVar2.b * 8);
                                float[] fArr2 = new float[m4 * 5];
                                int i5 = 5;
                                int[] iArr = new int[5];
                                arrayList = arrayList5;
                                int i6 = 0;
                                int i7 = 0;
                                while (true) {
                                    if (i6 < m4) {
                                        int i8 = 0;
                                        while (i8 < i5) {
                                            int i9 = iArr[i8];
                                            int i10 = nm2Var.i(ceil);
                                            int i11 = ((i10 >> 1) ^ (-(i10 & 1))) + i9;
                                            if (i11 >= m3 || i11 < 0) {
                                                break;
                                            }
                                            fArr2[i7] = fArr[i11];
                                            iArr[i8] = i11;
                                            i8++;
                                            i7++;
                                            i5 = 5;
                                        }
                                        i6++;
                                        i5 = 5;
                                    } else {
                                        nm2Var.q((nm2Var.g() + 7) & (-8));
                                        int i12 = 32;
                                        int i13 = nm2Var.i(32);
                                        mdf[] mdfVarArr = new mdf[i13];
                                        int i14 = 0;
                                        while (i14 < i13) {
                                            int i15 = nm2Var.i(8);
                                            int i16 = nm2Var.i(8);
                                            int i17 = nm2Var.i(i12);
                                            if (i17 <= 128000) {
                                                nm2 nm2Var2 = nm2Var;
                                                int ceil2 = (int) Math.ceil(Math.log(m4 * 2.0d) / log);
                                                float[] fArr3 = new float[i17 * 3];
                                                float[] fArr4 = new float[i17 * 2];
                                                int i18 = 0;
                                                int i19 = 0;
                                                while (i18 < i17) {
                                                    int i20 = nm2Var2.i(ceil2);
                                                    int i21 = ceil2;
                                                    int i22 = ((i20 >> 1) ^ (-(i20 & 1))) + i19;
                                                    if (i22 >= 0 && i22 < m4) {
                                                        int i23 = i18 * 3;
                                                        int i24 = i22 * 5;
                                                        fArr3[i23] = fArr2[i24];
                                                        fArr3[i23 + 1] = fArr2[i24 + 1];
                                                        fArr3[i23 + 2] = fArr2[i24 + 2];
                                                        int i25 = i18 * 2;
                                                        fArr4[i25] = fArr2[i24 + 3];
                                                        fArr4[i25 + 1] = fArr2[i24 + 4];
                                                        i18++;
                                                        i19 = i22;
                                                        ceil2 = i21;
                                                    }
                                                }
                                                mdfVarArr[i14] = new mdf(i15, fArr3, fArr4, i16, 1);
                                                i14++;
                                                nm2Var = nm2Var2;
                                                i12 = 32;
                                            }
                                        }
                                        arrayList2 = new ldf(mdfVarArr);
                                    }
                                }
                                arrayList2 = arrayList;
                                if (arrayList2 != null) {
                                    return arrayList;
                                }
                                arrayList4.add(arrayList2);
                            }
                        }
                        c2 = c3;
                        ArrayList arrayList6 = arrayList3;
                        arrayList = arrayList6;
                        z = z2;
                        arrayList2 = arrayList6;
                        if (arrayList2 != null) {
                        }
                    } else {
                        c2 = c3;
                        arrayList = arrayList3;
                        z = z2;
                    }
                    j9eVar2.N(m2);
                    i2 = m2;
                    c3 = c2;
                    z2 = z;
                    arrayList3 = arrayList;
                }
            }
            return arrayList4;
        }
        return arrayList3;
    }

    public static int O(long j2) {
        if (j2 > 2147483647L) {
            return Integer.MAX_VALUE;
        }
        if (j2 < -2147483648L) {
            return Integer.MIN_VALUE;
        }
        return (int) j2;
    }

    public static void P(Context context, String str) {
        SharedPreferences d2;
        SharedPreferences d3;
        context.getClass();
        if (str == null) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d3 = a5f.d(applicationContext);
                    uic.j = d3;
                }
                d3.getClass();
                sharedPreferences = d3;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.remove("REGION_USER_COUNTRY_ALPHA");
            Unit unit = Unit.a;
            edit.apply();
            return;
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext2);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences2 = d2;
        }
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.getClass();
        edit2.putString("REGION_USER_COUNTRY_ALPHA", str);
        Unit unit2 = Unit.a;
        edit2.apply();
    }

    public static void Q(Context context, String str) {
        SharedPreferences d2;
        SharedPreferences d3;
        context.getClass();
        if (str == null) {
            SharedPreferences sharedPreferences = uic.j;
            if (sharedPreferences == null) {
                Context applicationContext = context.getApplicationContext();
                synchronized (uic.i) {
                    d3 = a5f.d(applicationContext);
                    uic.j = d3;
                }
                d3.getClass();
                sharedPreferences = d3;
            }
            SharedPreferences.Editor edit = sharedPreferences.edit();
            edit.getClass();
            edit.remove("REGION_USER_LAST_REGION");
            Unit unit = Unit.a;
            edit.apply();
            return;
        }
        SharedPreferences sharedPreferences2 = uic.j;
        if (sharedPreferences2 == null) {
            Context applicationContext2 = context.getApplicationContext();
            synchronized (uic.i) {
                d2 = a5f.d(applicationContext2);
                uic.j = d2;
            }
            d2.getClass();
            sharedPreferences2 = d2;
        }
        SharedPreferences.Editor edit2 = sharedPreferences2.edit();
        edit2.getClass();
        edit2.putString("REGION_USER_LAST_REGION", str);
        Unit unit2 = Unit.a;
        edit2.apply();
    }

    public static final void R(int i2, String str) {
        throw new SQLException(ljg.j(i2, "Error code: ") + ", message: ".concat(str));
    }

    public static final gv9 S(Context context, List list) {
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            PowerRanking powerRanking = (PowerRanking) it.next();
            arrayList.add(new u2f(powerRanking.getTeam().getId(), tba.p(context, powerRanking.getTeam()), powerRanking.getRank(), powerRanking.getPoints(), powerRanking.getTeam().getDisabled(), powerRanking.getRankDiff()));
        }
        return l6g.W(arrayList);
    }

    public static /* synthetic */ String T(int i2) {
        switch (i2) {
            case 1:
                return "BEGIN_ARRAY";
            case 2:
                return "END_ARRAY";
            case 3:
                return "BEGIN_OBJECT";
            case 4:
                return "END_OBJECT";
            case 5:
                return "NAME";
            case 6:
                return "STRING";
            case 7:
                return "NUMBER";
            case 8:
                return "BOOLEAN";
            case 9:
                return "NULL";
            default:
                return "END_DOCUMENT";
        }
    }

    public static boolean U(String str) {
        return str == null || str.isEmpty();
    }

    public static int V(Class cls, List list) {
        Iterator it = list.iterator();
        while (it.hasNext()) {
            ((u9p) ((w9p) it.next())).getClass();
            String name = cls.getName();
            int i2 = (name.startsWith("android.") || name.startsWith("androidx.") || name.startsWith("java.") || name.startsWith("javax.")) ? 4 : 2;
            if (i2 != 2) {
                return i2;
            }
        }
        return 1;
    }

    public static final void a(final int i2, final v22 v22Var, final float f2, final xtc xtcVar, of3 of3Var, final int i3) {
        v22 v22Var2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(557384149);
        int i4 = i3 | (av8Var.e(i2) ? 4 : 2) | (av8Var.d(f2) ? 256 : 128) | (av8Var.g(xtcVar) ? a.o : 1024);
        if (av8Var.T(i4 & 1, (i4 & 1171) != 1170)) {
            if (hkg.c0((Context) av8Var.k(nz.b))) {
                v22Var2 = v22.a;
                if (v22Var == v22Var2) {
                    v22Var2 = v22.b;
                }
            } else {
                v22Var2 = v22Var;
            }
            final long D = lz.D(R.color.neutral_highlight, av8Var);
            final float H0 = ((kx4) av8Var.k(dh3.h)).H0(4.0f);
            boolean d2 = ((i4 & 14) == 4) | av8Var.d(H0) | av8Var.e(v22Var2.ordinal()) | ((i4 & 896) == 256) | av8Var.f(D);
            Object O = av8Var.O();
            if (d2 || O == nf3.a) {
                final v22 v22Var3 = v22Var2;
                Function1 function1 = new Function1() { // from class: hel
                    @Override // kotlin.jvm.functions.Function1
                    public final Object invoke(Object obj) {
                        float f3;
                        long j2;
                        hel helVar = this;
                        ha5 ha5Var = (ha5) obj;
                        ha5Var.getClass();
                        int i5 = i2;
                        if (i5 <= 0) {
                            return Unit.a;
                        }
                        char c2 = ' ';
                        float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                        float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                        float f4 = H0;
                        float f5 = (intBitsToFloat2 - ((i5 - 1) * f4)) / i5;
                        v22 v22Var4 = v22.a;
                        v22 v22Var5 = v22Var3;
                        float f6 = v22Var5 == v22Var4 ? 0.0f : intBitsToFloat;
                        float f7 = v22Var5 == v22Var4 ? intBitsToFloat : 0.0f;
                        float f8 = intBitsToFloat * 0.5f;
                        int i6 = i5 / 2;
                        int i7 = 0;
                        while (true) {
                            f3 = f2;
                            j2 = D;
                            if (i7 >= i6) {
                                break;
                            }
                            float f9 = f5 + f4;
                            float f10 = f5 * 0.5f;
                            float f11 = ((i7 * 2 * f9) + f10 + ((r10 + 1) * f9) + f10) * 0.5f;
                            float f12 = f3 / 2.0f;
                            char c3 = c2;
                            float f13 = f8 + (v22Var5 == v22.a ? f3 / 2.0f : (-f3) / 2.0f);
                            ha5Var = ha5Var;
                            ha5.W0(ha5Var, j2, (Float.floatToRawIntBits(r26) & 4294967295L) | (Float.floatToRawIntBits(f6) << c3), (Float.floatToRawIntBits(r26) & 4294967295L) | (Float.floatToRawIntBits(f13) << c3), f3, 0, null, 496);
                            ha5.W0(ha5Var, j2, (Float.floatToRawIntBits(f6) << c3) | (Float.floatToRawIntBits(r24) & 4294967295L), (Float.floatToRawIntBits(f13) << c3) | (Float.floatToRawIntBits(r24) & 4294967295L), f3, 0, null, 496);
                            ha5.W0(ha5Var, j2, (Float.floatToRawIntBits(f8) << c3) | (Float.floatToRawIntBits(r26 + f12) & 4294967295L), (Float.floatToRawIntBits(f8) << c3) | (Float.floatToRawIntBits(r24 - f12) & 4294967295L), f3, 0, null, 496);
                            ha5.W0(ha5Var, j2, (Float.floatToRawIntBits(f13) << c3) | (Float.floatToRawIntBits(f11) & 4294967295L), (Float.floatToRawIntBits(f7) << c3) | (Float.floatToRawIntBits(f11) & 4294967295L), f3, 0, null, 496);
                            i7++;
                            c2 = c3;
                            i6 = i6;
                            f4 = f4;
                            v22Var5 = v22Var5;
                            helVar = this;
                        }
                        char c4 = c2;
                        if (i5 == 1) {
                            float f14 = intBitsToFloat2 * 0.5f;
                            ha5.W0(ha5Var, j2, (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) << c4) | (Float.floatToRawIntBits(f14) & 4294967295L), (Float.floatToRawIntBits(intBitsToFloat) << c4) | (Float.floatToRawIntBits(f14) & 4294967295L), f3, 0, null, 496);
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(function1);
                O = function1;
            }
            lz.d((i4 >> 9) & 14, av8Var, xtcVar, (Function1) O);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2(i2, v22Var, f2, xtcVar, i3) { // from class: bel
                public final /* synthetic */ int a;
                public final /* synthetic */ v22 b;
                public final /* synthetic */ float c;
                public final /* synthetic */ xtc d;

                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    int K = aba.K(49);
                    b0a.a(this.a, this.b, this.c, this.d, (of3) obj, K);
                    return Unit.a;
                }
            };
        }
    }

    public static final void b(gv9 gv9Var, xtc xtcVar, Function1 function1, float f2, float f3, of3 of3Var, int i2) {
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1794124707);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(gv9Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(xtcVar) ? 32 : 16;
        }
        Function1 function12 = function1;
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        float f4 = f2;
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.d(f4) ? a.o : 1024;
        }
        float f5 = f3;
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.d(f5) ? 16384 : 8192;
        }
        boolean z = false;
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, xtcVar);
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
            Iterator p = ljg.p(av8Var, C, hf3.d, 1914194408, gv9Var);
            while (p.hasNext()) {
                wn1 wn1Var = (wn1) p.next();
                goa goaVar = new goa(1.0f, true);
                k1c c2 = e12.c(uxf.g, z);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, goaVar);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var2);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                e(null, wn1Var, function12, f4, f5, av8Var, i3 & 65408);
                av8Var.s(true);
                function12 = function1;
                f4 = f2;
                f5 = f3;
                z = false;
            }
            av8Var.s(z);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gel(gv9Var, xtcVar, function1, f2, f3, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:105:0x02f2  */
    /* JADX WARN: Removed duplicated region for block: B:109:0x0314  */
    /* JADX WARN: Removed duplicated region for block: B:121:0x03a6  */
    /* JADX WARN: Removed duplicated region for block: B:122:0x02fa  */
    /* JADX WARN: Removed duplicated region for block: B:124:0x02a9  */
    /* JADX WARN: Removed duplicated region for block: B:125:0x02a1  */
    /* JADX WARN: Removed duplicated region for block: B:126:0x01ff  */
    /* JADX WARN: Removed duplicated region for block: B:127:0x01c2  */
    /* JADX WARN: Removed duplicated region for block: B:128:0x0191  */
    /* JADX WARN: Removed duplicated region for block: B:129:0x0142  */
    /* JADX WARN: Removed duplicated region for block: B:82:0x0137  */
    /* JADX WARN: Removed duplicated region for block: B:85:0x018d  */
    /* JADX WARN: Removed duplicated region for block: B:88:0x01b5  */
    /* JADX WARN: Removed duplicated region for block: B:91:0x01fb  */
    /* JADX WARN: Removed duplicated region for block: B:94:0x029f  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x02a7  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void c(final wn1 wn1Var, final wn1 wn1Var2, final boolean z, final float f2, final float f3, final float f4, final Function1 function1, Function1 function12, of3 of3Var, final int i2) {
        int i3;
        final Function1 function13;
        Integer num;
        Integer valueOf;
        boolean f5;
        Object O;
        final boolean z2;
        boolean z3;
        boolean z4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-813195495);
        int i4 = i2 & 6;
        n12 n12Var = n12.a;
        if (i4 == 0) {
            i3 = (av8Var.g(n12Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(wn1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(wn1Var2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.h(z) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.d(f2) ? 16384 : 8192;
        }
        if ((i2 & 196608) == 0) {
            i3 |= av8Var.d(f3) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
        }
        if ((1572864 & i2) == 0) {
            i3 |= av8Var.d(f4) ? ExtractorMediaSource.DEFAULT_LOADING_CHECK_INTERVAL_BYTES : 524288;
        }
        if ((12582912 & i2) == 0) {
            i3 |= av8Var.i(function1) ? 8388608 : 4194304;
        }
        if ((i2 & 100663296) == 0) {
            i3 |= av8Var.i(function12) ? 67108864 : 33554432;
        }
        if (av8Var.T(i3 & 1, (i3 & 38347923) != 38347922)) {
            final long D = lz.D(R.color.neutral_highlight, av8Var);
            Integer num2 = wn1Var != null ? wn1Var.u : null;
            Integer valueOf2 = (num2 != null && num2.intValue() == 1) ? Integer.valueOf(wn1Var.b) : (num2 != null && num2.intValue() == 2) ? Integer.valueOf(wn1Var.c) : null;
            Integer num3 = wn1Var2 != null ? wn1Var2.u : null;
            if (num3 != null && num3.intValue() == 1) {
                valueOf = Integer.valueOf(wn1Var2.b);
            } else if (num3 != null && num3.intValue() == 2) {
                valueOf = Integer.valueOf(wn1Var2.c);
            } else {
                num = null;
                utc utcVar = utc.a;
                if (valueOf2 != null) {
                    av8Var.d0(2004148540);
                    av8Var.s(false);
                } else {
                    av8Var.d0(2004148541);
                    d(valueOf2.intValue(), function12, n12Var.a(utcVar, uxf.d), av8Var, (i3 >> 21) & 112);
                    Unit unit = Unit.a;
                    av8Var.s(false);
                }
                xtc a2 = n12Var.a(utcVar, uxf.g);
                kv1 kv1Var = uxf.p;
                u23 a3 = t23.a(ww9.d, kv1Var, av8Var, 48);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
                xtc C = fqj.C(av8Var, a2);
                if3.k7.getClass();
                Function0 function0 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.q0();
                } else {
                    av8Var.l(function0);
                }
                f50 f50Var = hf3.g;
                waa.K(av8Var, a3, f50Var);
                ff3 ff3Var = hf3.f;
                waa.K(av8Var, m, ff3Var);
                Integer valueOf3 = Integer.valueOf(hashCode);
                f50 f50Var2 = hf3.j;
                waa.K(av8Var, valueOf3, f50Var2);
                ry ryVar = hf3.k;
                waa.J(av8Var, ryVar);
                f50 f50Var3 = hf3.d;
                waa.K(av8Var, C, f50Var3);
                if (num == null) {
                    bf3.r(72.0f, -497193118, av8Var, av8Var, utcVar);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-497072993);
                    av8Var.s(false);
                }
                int i5 = i3;
                u23 a4 = t23.a(new ng0(4.0f, true, new a70(6)), kv1Var, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.q0();
                } else {
                    av8Var.l(function0);
                }
                waa.K(av8Var, a4, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                String v = oea.v(R.string.final_string, av8Var);
                yf8 yf8Var = xth.a;
                q5a.w(v, null, lz.D(R.color.sentiment_neutral, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.c(), av8Var, 0, 0, 131066);
                int i6 = (i5 >> 18) & 112;
                int i7 = i5 >> 6;
                int i8 = i7 & 896;
                int i9 = i7 & 7168;
                f(wn1Var, function1, f2, f3, null, true, av8Var, ((i5 >> 3) & 14) | 196608 | i6 | i8 | i9, 16);
                av8Var.s(true);
                xtc e2 = bkh.e(utcVar, 124.0f);
                f5 = av8Var.f(D) | ((3670016 & i5) != 1048576) | ((i5 & 7168) != 2048);
                O = av8Var.O();
                if (!f5 || O == nf3.a) {
                    z2 = z;
                    O = new Function1() { // from class: cel
                        @Override // kotlin.jvm.functions.Function1
                        public final Object invoke(Object obj) {
                            ha5 ha5Var = (ha5) obj;
                            ha5Var.getClass();
                            float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                            float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                            float f6 = intBitsToFloat * 0.5f;
                            long floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                            float f7 = intBitsToFloat2 / 2.0f;
                            long floatToRawIntBits2 = (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                            long j2 = D;
                            float f8 = f4;
                            ha5.W0(ha5Var, j2, floatToRawIntBits, floatToRawIntBits2, f8, 0, null, 496);
                            if (z2) {
                                ha5.W0(ha5Var, j2, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), f8, 0, null, 496);
                            }
                            return Unit.a;
                        }
                    };
                    av8Var.n0(O);
                } else {
                    z2 = z;
                }
                lz.d(6, av8Var, e2, (Function1) O);
                u23 a5 = t23.a(new ng0(4.0f, true, new a70(6)), kv1Var, av8Var, 54);
                int hashCode3 = Long.hashCode(av8Var.T);
                aee m3 = av8Var.m();
                xtc C3 = fqj.C(av8Var, utcVar);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.q0();
                } else {
                    av8Var.l(function0);
                }
                waa.K(av8Var, a5, f50Var);
                waa.K(av8Var, m3, ff3Var);
                bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C3, f50Var3);
                if (z2) {
                    function13 = function12;
                    z3 = true;
                    bf3.r(40.0f, -224167133, av8Var, av8Var, utcVar);
                    av8Var.s(false);
                } else {
                    av8Var.d0(-225012379);
                    f(wn1Var2, function1, f2, f3, null, false, av8Var, (i7 & 14) | i6 | i8 | i9, 48);
                    if (num == null) {
                        av8Var.d0(-224731891);
                        z3 = true;
                        q5a.w(oea.v(R.string.third_place, av8Var), null, lz.D(R.color.neutral_default, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.c(), av8Var, 0, 0, 131066);
                        z4 = false;
                        av8Var.s(false);
                        function13 = function12;
                    } else {
                        z3 = true;
                        z4 = false;
                        av8Var.d0(-224484263);
                        function13 = function12;
                        v(num.intValue(), function13, l98.f0(utcVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), av8Var, ((i5 >> 21) & 112) | 384);
                        w1l.s(utcVar, 12.0f, av8Var, false);
                    }
                    av8Var.s(z4);
                }
                av8Var.s(z3);
                av8Var.s(z3);
            }
            num = valueOf;
            utc utcVar2 = utc.a;
            if (valueOf2 != null) {
            }
            xtc a22 = n12Var.a(utcVar2, uxf.g);
            kv1 kv1Var2 = uxf.p;
            u23 a32 = t23.a(ww9.d, kv1Var2, av8Var, 48);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, a22);
            if3.k7.getClass();
            Function0 function02 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            f50 f50Var4 = hf3.g;
            waa.K(av8Var, a32, f50Var4);
            ff3 ff3Var2 = hf3.f;
            waa.K(av8Var, m4, ff3Var2);
            Integer valueOf32 = Integer.valueOf(hashCode4);
            f50 f50Var22 = hf3.j;
            waa.K(av8Var, valueOf32, f50Var22);
            ry ryVar2 = hf3.k;
            waa.J(av8Var, ryVar2);
            f50 f50Var32 = hf3.d;
            waa.K(av8Var, C4, f50Var32);
            if (num == null) {
            }
            int i52 = i3;
            u23 a42 = t23.a(new ng0(4.0f, true, new a70(6)), kv1Var2, av8Var, 54);
            int hashCode22 = Long.hashCode(av8Var.T);
            aee m22 = av8Var.m();
            xtc C22 = fqj.C(av8Var, utcVar2);
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a42, f50Var4);
            waa.K(av8Var, m22, ff3Var2);
            bf3.s(hashCode22, av8Var, f50Var22, av8Var, ryVar2);
            waa.K(av8Var, C22, f50Var32);
            String v2 = oea.v(R.string.final_string, av8Var);
            yf8 yf8Var2 = xth.a;
            q5a.w(v2, null, lz.D(R.color.sentiment_neutral, av8Var), null, 0L, 0L, null, 0L, 0, false, 0, 0, xth.c(), av8Var, 0, 0, 131066);
            int i62 = (i52 >> 18) & 112;
            int i72 = i52 >> 6;
            int i82 = i72 & 896;
            int i92 = i72 & 7168;
            f(wn1Var, function1, f2, f3, null, true, av8Var, ((i52 >> 3) & 14) | 196608 | i62 | i82 | i92, 16);
            av8Var.s(true);
            xtc e22 = bkh.e(utcVar2, 124.0f);
            f5 = av8Var.f(D) | ((3670016 & i52) != 1048576) | ((i52 & 7168) != 2048);
            O = av8Var.O();
            if (f5) {
            }
            z2 = z;
            O = new Function1() { // from class: cel
                @Override // kotlin.jvm.functions.Function1
                public final Object invoke(Object obj) {
                    ha5 ha5Var = (ha5) obj;
                    ha5Var.getClass();
                    float intBitsToFloat = Float.intBitsToFloat((int) (ha5Var.n() >> 32));
                    float intBitsToFloat2 = Float.intBitsToFloat((int) (ha5Var.n() & 4294967295L));
                    float f6 = intBitsToFloat * 0.5f;
                    long floatToRawIntBits = (Float.floatToRawIntBits(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                    float f7 = intBitsToFloat2 / 2.0f;
                    long floatToRawIntBits2 = (Float.floatToRawIntBits(f7) & 4294967295L) | (Float.floatToRawIntBits(f6) << 32);
                    long j2 = D;
                    float f8 = f4;
                    ha5.W0(ha5Var, j2, floatToRawIntBits, floatToRawIntBits2, f8, 0, null, 496);
                    if (z2) {
                        ha5.W0(ha5Var, j2, (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(f7) & 4294967295L), (Float.floatToRawIntBits(f6) << 32) | (Float.floatToRawIntBits(intBitsToFloat2) & 4294967295L), f8, 0, null, 496);
                    }
                    return Unit.a;
                }
            };
            av8Var.n0(O);
            lz.d(6, av8Var, e22, (Function1) O);
            u23 a52 = t23.a(new ng0(4.0f, true, new a70(6)), kv1Var2, av8Var, 54);
            int hashCode32 = Long.hashCode(av8Var.T);
            aee m32 = av8Var.m();
            xtc C32 = fqj.C(av8Var, utcVar2);
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a52, f50Var4);
            waa.K(av8Var, m32, ff3Var2);
            bf3.s(hashCode32, av8Var, f50Var22, av8Var, ryVar2);
            waa.K(av8Var, C32, f50Var32);
            if (z2) {
            }
            av8Var.s(z3);
            av8Var.s(z3);
        } else {
            function13 = function12;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: del
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b0a.c(wn1.this, wn1Var2, z, f2, f3, f4, function1, function13, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void d(int i2, Function1 function1, xtc xtcVar, of3 of3Var, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-2121377750);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), r13.c(lz.D(R.color.sentiment_neutral, av8Var), 0.2f), oyn.e);
            boolean z = (i4 & 112) == 32;
            int i5 = i4 & 14;
            boolean z2 = z | (i5 == 4);
            Object O = av8Var.O();
            int i6 = 6;
            if (z2 || O == nf3.a) {
                O = new kj4(i2, i6, function1);
                av8Var.n0(O);
            }
            xtc c0 = l98.c0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 8.0f, 4.0f);
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(i6)), uxf.p, av8Var, 54);
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
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
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
            td4.y(16, 54, 12, av8Var, bkh.l(utcVar, 32.0f), null, false);
            td4.G(i2, bkh.l(utcVar, 24.0f), false, 0L, av8Var, i5 | 48, 12);
            av8Var = av8Var;
            av8Var.s(true);
            String v = oea.v(R.string.football_champions, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.sentiment_neutral, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fel(i2, function1, xtcVar, i3, 0);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:56:0x012a  */
    /* JADX WARN: Removed duplicated region for block: B:59:0x0157  */
    /* JADX WARN: Removed duplicated region for block: B:62:0x016b  */
    /* JADX WARN: Removed duplicated region for block: B:64:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:76:0x01db  */
    /* JADX WARN: Removed duplicated region for block: B:81:0x018e  */
    /* JADX WARN: Removed duplicated region for block: B:86:0x015e  */
    /* JADX WARN: Removed duplicated region for block: B:87:0x012e  */
    /* JADX WARN: Type inference failed for: r7v10 */
    /* JADX WARN: Type inference failed for: r7v11, types: [int] */
    /* JADX WARN: Type inference failed for: r7v12 */
    /* JADX WARN: Type inference failed for: r7v14 */
    /* JADX WARN: Type inference failed for: r7v15, types: [int] */
    /* JADX WARN: Type inference failed for: r7v16 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void e(xtc xtcVar, wn1 wn1Var, Function1 function1, float f2, float f3, of3 of3Var, int i2) {
        xtc xtcVar2;
        utc utcVar;
        boolean z;
        xtc xtcVar3;
        Boolean valueOf;
        Boolean bool;
        ImageVector imageVector;
        Boolean bool2;
        int i3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(2094446497);
        int i4 = i2 | 6;
        if ((i2 & 48) == 0) {
            i4 |= av8Var.g(wn1Var) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.i(function1) ? 256 : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.d(f2) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i4 |= av8Var.d(f3) ? 16384 : 8192;
        }
        int i5 = 1;
        if (av8Var.T(i4 & 1, (i4 & 9363) != 9362)) {
            av8Var.d0(-1576568284);
            n7g a2 = o7g.a(4.0f);
            utc utcVar2 = utc.a;
            xtc q = n9e.q(wnn.A(utcVar2, a2), lz.D(R.color.neutral_highlight, av8Var), oyn.e);
            Boolean valueOf2 = wn1Var != null ? Boolean.valueOf(wn1Var.n) : null;
            Boolean bool3 = Boolean.FALSE;
            if (Intrinsics.c(valueOf2, bool3)) {
                if (Intrinsics.c(wn1Var != null ? Boolean.valueOf(wn1Var.o) : null, bool3)) {
                    boolean z2 = ((i4 & 896) == 256) | ((i4 & 112) == 32);
                    Object O = av8Var.O();
                    if (z2 || O == nf3.a) {
                        O = new eel(wn1Var, function1, i5);
                        av8Var.n0(O);
                    }
                    z = false;
                    xtc y = tol.y(utcVar2, false, false, false, 0L, null, (Function0) O, av8Var, 31);
                    av8Var = av8Var;
                    utcVar = utcVar2;
                    xtcVar3 = q.z(y);
                    av8Var.s(z);
                    xtc c0 = l98.c0(xtcVar3, f3, 2.0f);
                    u23 a3 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
                    int hashCode = Long.hashCode(av8Var.T);
                    aee m = av8Var.m();
                    xtc C = fqj.C(av8Var, c0);
                    if3.k7.getClass();
                    zg3 zg3Var = hf3.b;
                    av8Var.h0();
                    if (av8Var.S) {
                        av8Var.q0();
                    } else {
                        av8Var.l(zg3Var);
                    }
                    waa.K(av8Var, a3, hf3.g);
                    waa.K(av8Var, m, hf3.f);
                    waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                    waa.J(av8Var, hf3.k);
                    waa.K(av8Var, C, hf3.d);
                    ImageVector N = s6a.N(R.drawable.team_logo_placeholder, 6, av8Var);
                    valueOf = wn1Var == null ? Boolean.valueOf(wn1Var.n) : null;
                    bool = Boolean.TRUE;
                    if (Intrinsics.c(valueOf, bool)) {
                        imageVector = N;
                        bool2 = bool;
                        i3 = R.color.neutral_default;
                        av8Var.d0(297070007);
                        td4.G(wn1Var != null ? wn1Var.b : z, bkh.l(utcVar, f2), false, 0L, av8Var, 0, 12);
                        av8Var.s(z);
                    } else {
                        av8Var.d0(296857347);
                        xtc l2 = bkh.l(utcVar, f2);
                        long D = lz.D(R.color.neutral_default, av8Var);
                        i3 = R.color.neutral_default;
                        bool2 = bool;
                        kq9.b(N, null, l2, D, av8Var, 48, 0);
                        imageVector = N;
                        av8Var.s(z);
                    }
                    if (Intrinsics.c(wn1Var != null ? Boolean.valueOf(wn1Var.o) : null, bool2)) {
                        av8Var.d0(297492630);
                        td4.G(wn1Var != null ? wn1Var.c : z, bkh.l(utcVar, f2), false, 0L, av8Var, 0, 12);
                        av8Var.s(z);
                    } else {
                        av8Var.d0(297279939);
                        kq9.b(imageVector, null, bkh.l(utcVar, f2), lz.D(i3, av8Var), av8Var, 48, 0);
                        av8Var.s(z);
                    }
                    av8Var.s(true);
                    xtcVar2 = utcVar;
                }
            }
            utcVar = utcVar2;
            z = false;
            xtcVar3 = q;
            av8Var.s(z);
            xtc c02 = l98.c0(xtcVar3, f3, 2.0f);
            u23 a32 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.o, av8Var, 6);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, c02);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
            }
            waa.K(av8Var, a32, hf3.g);
            waa.K(av8Var, m2, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C2, hf3.d);
            ImageVector N2 = s6a.N(R.drawable.team_logo_placeholder, 6, av8Var);
            if (wn1Var == null) {
            }
            bool = Boolean.TRUE;
            if (Intrinsics.c(valueOf, bool)) {
            }
            if (Intrinsics.c(wn1Var != null ? Boolean.valueOf(wn1Var.o) : null, bool2)) {
            }
            av8Var.s(true);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new gel(xtcVar2, wn1Var, function1, f2, f3, i2);
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Removed duplicated region for block: B:107:0x0255  */
    /* JADX WARN: Removed duplicated region for block: B:108:0x0082  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x0080  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x008b  */
    /* JADX WARN: Removed duplicated region for block: B:67:0x0184  */
    /* JADX WARN: Removed duplicated region for block: B:70:0x01aa  */
    /* JADX WARN: Removed duplicated region for block: B:73:0x01bf  */
    /* JADX WARN: Removed duplicated region for block: B:75:0x020b  */
    /* JADX WARN: Removed duplicated region for block: B:78:0x0219  */
    /* JADX WARN: Removed duplicated region for block: B:83:0x0261  */
    /* JADX WARN: Removed duplicated region for block: B:86:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:87:0x0233  */
    /* JADX WARN: Removed duplicated region for block: B:92:0x01e7  */
    /* JADX WARN: Removed duplicated region for block: B:97:0x01b1  */
    /* JADX WARN: Removed duplicated region for block: B:98:0x0188  */
    /* JADX WARN: Type inference failed for: r8v10, types: [int] */
    /* JADX WARN: Type inference failed for: r8v11 */
    /* JADX WARN: Type inference failed for: r8v5 */
    /* JADX WARN: Type inference failed for: r8v6, types: [int] */
    /* JADX WARN: Type inference failed for: r8v7 */
    /* JADX WARN: Type inference failed for: r8v9 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void f(wn1 wn1Var, Function1 function1, float f2, float f3, xtc xtcVar, boolean z, of3 of3Var, int i2, int i3) {
        int i4;
        boolean z2;
        xtc xtcVar2;
        boolean z3;
        eqf u;
        long f4;
        utc utcVar;
        boolean z4;
        xtc xtcVar3;
        Boolean valueOf;
        Boolean bool;
        boolean z5;
        utc utcVar2;
        Boolean bool2;
        int i5;
        int i6;
        long j2;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1838073327);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.g(wn1Var) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.d(f2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i4 |= av8Var.d(f3) ? a.o : 1024;
        }
        int i7 = i4 | 24576;
        int i8 = i3 & 32;
        if (i8 != 0) {
            i7 = 221184 | i4;
        } else if ((196608 & i2) == 0) {
            z2 = z;
            i7 |= av8Var.h(z2) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            int i9 = 0;
            if (av8Var.T(i7 & 1, (74899 & i7) == 74898)) {
                av8Var.W();
                xtcVar2 = xtcVar;
                z3 = z2;
            } else {
                if (i8 != 0) {
                    z2 = false;
                }
                if (z2) {
                    av8Var.d0(-1156899933);
                    f4 = r13.c(lz.D(R.color.sentiment_neutral, av8Var), 0.2f);
                    av8Var.s(false);
                } else {
                    f4 = ljg.f(av8Var, -1156898810, R.color.neutral_highlight, av8Var, false);
                }
                long f5 = z2 ? ljg.f(av8Var, -1156896410, R.color.sentiment_neutral, av8Var, false) : ljg.f(av8Var, -1156895196, R.color.neutral_default, av8Var, false);
                av8Var.d0(-1156889868);
                n7g a2 = o7g.a(4.0f);
                utc utcVar3 = utc.a;
                xtc q = n9e.q(wnn.A(utcVar3, a2), f4, oyn.e);
                Boolean valueOf2 = wn1Var != null ? Boolean.valueOf(wn1Var.n) : null;
                Boolean bool3 = Boolean.FALSE;
                if (Intrinsics.c(valueOf2, bool3)) {
                    if (Intrinsics.c(wn1Var != null ? Boolean.valueOf(wn1Var.o) : null, bool3)) {
                        boolean z6 = ((i7 & 14) == 4) | ((i7 & 112) == 32);
                        Object O = av8Var.O();
                        if (z6 || O == nf3.a) {
                            O = new eel(wn1Var, function1, i9);
                            av8Var.n0(O);
                        }
                        Function0 function0 = (Function0) O;
                        utcVar = utcVar3;
                        z4 = false;
                        xtc y = tol.y(utcVar, false, false, false, 0L, null, function0, av8Var, 31);
                        av8Var = av8Var;
                        xtcVar3 = q.z(y);
                        av8Var.s(z4);
                        xtc c0 = l98.c0(xtcVar3, f3, 2.0f);
                        l8g a3 = k8g.a(new ng0(4.0f, true, new l1(uxf.p, 5)), uxf.m, av8Var, 54);
                        int hashCode = Long.hashCode(av8Var.T);
                        aee m = av8Var.m();
                        xtc C = fqj.C(av8Var, c0);
                        if3.k7.getClass();
                        zg3 zg3Var = hf3.b;
                        av8Var.h0();
                        if (av8Var.S) {
                            av8Var.q0();
                        } else {
                            av8Var.l(zg3Var);
                        }
                        waa.K(av8Var, a3, hf3.g);
                        waa.K(av8Var, m, hf3.f);
                        waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                        waa.J(av8Var, hf3.k);
                        waa.K(av8Var, C, hf3.d);
                        valueOf = wn1Var == null ? Boolean.valueOf(wn1Var.n) : null;
                        bool = Boolean.TRUE;
                        if (Intrinsics.c(valueOf, bool)) {
                            z5 = z2;
                            utcVar2 = utcVar;
                            bool2 = bool;
                            i5 = R.drawable.team_logo_placeholder;
                            i6 = 6;
                            j2 = f5;
                            av8Var.d0(-1513191025);
                            td4.G(wn1Var != null ? wn1Var.b : z4, bkh.l(utcVar2, f2), false, j2, av8Var, 0, 4);
                            av8Var.s(z4);
                        } else {
                            av8Var.d0(-1513447519);
                            bool2 = bool;
                            xtc l2 = bkh.l(utcVar, f2);
                            utc utcVar4 = utcVar;
                            ImageVector N = s6a.N(R.drawable.team_logo_placeholder, 6, av8Var);
                            z5 = z2;
                            i5 = R.drawable.team_logo_placeholder;
                            i6 = 6;
                            utcVar2 = utcVar4;
                            j2 = f5;
                            kq9.b(N, null, l2, j2, av8Var, 48, 0);
                            av8Var.s(z4);
                        }
                        if (Intrinsics.c(wn1Var != null ? Boolean.valueOf(wn1Var.o) : null, bool2)) {
                            av8Var.d0(-1512675154);
                            td4.G(wn1Var != null ? wn1Var.c : z4, bkh.l(utcVar2, f2), false, j2, av8Var, 0, 4);
                            av8Var.s(z4);
                        } else {
                            av8Var.d0(-1512931679);
                            kq9.b(s6a.N(i5, i6, av8Var), null, bkh.l(utcVar2, f2), j2, av8Var, 48, 0);
                            av8Var.s(z4);
                        }
                        av8Var.s(true);
                        z3 = z5;
                        xtcVar2 = utcVar2;
                    }
                }
                utcVar = utcVar3;
                z4 = false;
                xtcVar3 = q;
                av8Var.s(z4);
                xtc c02 = l98.c0(xtcVar3, f3, 2.0f);
                l8g a32 = k8g.a(new ng0(4.0f, true, new l1(uxf.p, 5)), uxf.m, av8Var, 54);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, c02);
                if3.k7.getClass();
                zg3 zg3Var2 = hf3.b;
                av8Var.h0();
                if (av8Var.S) {
                }
                waa.K(av8Var, a32, hf3.g);
                waa.K(av8Var, m2, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode2), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C2, hf3.d);
                if (wn1Var == null) {
                }
                bool = Boolean.TRUE;
                if (Intrinsics.c(valueOf, bool)) {
                }
                if (Intrinsics.c(wn1Var != null ? Boolean.valueOf(wn1Var.o) : null, bool2)) {
                }
                av8Var.s(true);
                z3 = z5;
                xtcVar2 = utcVar2;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new t2f(wn1Var, function1, f2, f3, xtcVar2, z3, i2, i3);
                return;
            }
            return;
        }
        z2 = z;
        int i92 = 0;
        if (av8Var.T(i7 & 1, (74899 & i7) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void g(dxk dxkVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-769177897);
        int i3 = i2 | (av8Var.g(dxkVar) ? 4 : 2);
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, utc.a);
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
            String str = dxkVar.i;
            Boolean bool = dxkVar.o;
            Boolean bool2 = dxkVar.n;
            if (str == null) {
                str = "-";
            }
            Boolean bool3 = Boolean.TRUE;
            r(str, Intrinsics.c(bool2, bool3), Intrinsics.c(bool, bool3), av8Var, 0);
            String v = oea.v(R.string.minus, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.on_color_secondary, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            String str2 = dxkVar.j;
            if (str2 == null) {
                str2 = "-";
            }
            Boolean bool4 = Boolean.FALSE;
            r(str2, Intrinsics.c(bool2, bool4), Intrinsics.c(bool, bool4), av8Var, 0);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new axk(dxkVar, i2, 2);
        }
    }

    public static final void h(String str, c0a c0aVar, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        Function1 function13;
        str.getClass();
        c0aVar.getClass();
        function1.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1366735019);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(str) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.g(c0aVar) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            function13 = function1;
            i3 |= av8Var.i(function13) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            function13 = function1;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.i(function12) ? a.o : 1024;
        }
        if ((i2 & 24576) == 0) {
            i3 |= av8Var.g(xtcVar) ? 16384 : 8192;
        }
        if (av8Var.T(i3 & 1, (i3 & 9363) != 9362)) {
            xtc c0 = l98.c0(n9e.q(bkh.d(xtcVar, 1.0f), lz.D(R.color.surface_1, av8Var), o7g.a(16.0f)), 16.0f, 8.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            int i4 = i3;
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
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
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.l(), av8Var, i4 & 14, 0, 131066);
            udj.c(fc6.f(8.0f, R.string.crowdsourcing_scorer_optional, av8Var, av8Var, utcVar), null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
            w1l.o(1.0f, true, av8Var);
            h5a.v((i4 >> 3) & 112, 4, lz.D(R.color.crowdsourcing, av8Var), av8Var, null, function13, c0aVar.a);
            av8Var.s(true);
            fz8.b(x23.a, c0aVar.a, null, null, null, null, yqo.H(241751367, av8Var, new qm4(26, c0aVar, function12)), av8Var, 1572870, 30);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new s52(str, c0aVar, function1, function12, xtcVar, i2, 8);
        }
    }

    public static final void i(efl eflVar, Function1 function1, Function1 function12, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(514349696);
        int i3 = (i2 & 6) == 0 ? (av8Var.g(eflVar) ? 4 : 2) | i2 : i2;
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.i(function12) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            i3 |= av8Var.g(xtcVar) ? a.o : 1024;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            av8Var.d0(368824614);
            ff5 ff5Var = dh3.h;
            boolean z = p75.a(((kx4) av8Var.k(ff5Var)).C0((int) (((ata) ((s8l) av8Var.k(dh3.u))).a() >> 32)), 320.0f) < 0;
            av8Var.s(false);
            float f2 = z ? 16.0f : 20.0f;
            float f3 = z ? 2.0f : 4.0f;
            float H0 = ((kx4) av8Var.k(ff5Var)).H0(2.0f);
            int i4 = i3 & 14;
            boolean z2 = i4 == 4;
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (z2 || O == a99Var) {
                gv9 gv9Var = eflVar.a;
                ArrayList arrayList = new ArrayList();
                for (Object obj : gv9Var) {
                    if (((ffl) obj).a > 1) {
                        arrayList.add(obj);
                    }
                }
                O = CollectionsKt.H0(arrayList, new q6i(15));
                av8Var.n0(O);
            }
            List list = (List) O;
            boolean z3 = i4 == 4;
            Object O2 = av8Var.O();
            if (z3 || O2 == a99Var) {
                ffl a2 = eflVar.a();
                O2 = a2 != null ? (wn1) CollectionsKt.firstOrNull(a2.b) : null;
                av8Var.n0(O2);
            }
            wn1 wn1Var = (wn1) O2;
            boolean z4 = i4 == 4;
            Object O3 = av8Var.O();
            if (z4 || O3 == a99Var) {
                ffl a3 = eflVar.a();
                O3 = a3 != null ? (wn1) CollectionsKt.a0(1, a3.b) : null;
                av8Var.n0(O3);
            }
            wn1 wn1Var2 = (wn1) O3;
            boolean z5 = i4 == 4;
            Object O4 = av8Var.O();
            if (z5 || O4 == a99Var) {
                ffl a4 = eflVar.a();
                O4 = Boolean.valueOf((a4 != null ? a4.b.size() : 0) > 1);
                av8Var.n0(O4);
            }
            boolean booleanValue = ((Boolean) O4).booleanValue();
            xtc g2 = bkh.g(fz8.Y(xtcVar, n9a.b), 320.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            k1c c2 = e12.c(uxf.c, false);
            int i5 = i3;
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, g2);
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
            l8g a5 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            float f4 = f3;
            utc utcVar = utc.a;
            xtc C2 = fqj.C(av8Var, utcVar);
            av8Var.h0();
            utc utcVar2 = utcVar;
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a5, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            av8Var.d0(-1681950231);
            Iterator it = list.iterator();
            int i6 = 0;
            while (true) {
                String str = "invalid weight; must be greater than zero";
                if (it.hasNext()) {
                    Object next = it.next();
                    int i7 = i6 + 1;
                    if (i6 < 0) {
                        b.q();
                        throw null;
                    }
                    gv9 gv9Var2 = ((ffl) next).b;
                    gv9 W = l6g.W(gv9Var2.subList(0, gv9Var2.size() / 2));
                    utc utcVar3 = utcVar2;
                    float f5 = f2;
                    av8 av8Var2 = av8Var;
                    b(W, bkh.c(l98.f0(utcVar2, i6 == 0 ? 8.0f : UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), 1.0f), function1, f5, f4, av8Var2, (i5 << 3) & 896);
                    av8Var = av8Var2;
                    int size = W.size();
                    v22 v22Var = v22.a;
                    xtc c3 = bkh.c(utcVar3, 1.0f);
                    if (1.0f <= 0.0d) {
                        p3a.a("invalid weight; must be greater than zero");
                    }
                    a(size, v22Var, H0, c3.z(new goa(1.0f <= Float.MAX_VALUE ? 1.0f : Float.MAX_VALUE, true)), av8Var, 48);
                    f2 = f5;
                    utcVar2 = utcVar3;
                    i6 = i7;
                } else {
                    float f6 = f2;
                    float f7 = H0;
                    utc utcVar4 = utcVar2;
                    av8Var.s(false);
                    av8Var.d0(-1681922436);
                    int i8 = 0;
                    for (Object obj2 : CollectionsKt.B0(list)) {
                        int i9 = i8 + 1;
                        if (i8 < 0) {
                            b.q();
                            throw null;
                        }
                        gv9 gv9Var3 = ((ffl) obj2).b;
                        gv9 W2 = l6g.W(gv9Var3.subList(gv9Var3.size() / 2, gv9Var3.size()));
                        int size2 = W2.size();
                        v22 v22Var2 = v22.b;
                        xtc c4 = bkh.c(utcVar4, 1.0f);
                        float f8 = r3;
                        String str2 = str;
                        if (1.0f <= 0.0d) {
                            p3a.a(str2);
                        }
                        a(size2, v22Var2, f7, c4.z(new goa(1.0f > f8 ? f8 : 1.0f, true)), av8Var, 48);
                        float f9 = f7;
                        utc utcVar5 = utcVar4;
                        av8 av8Var3 = av8Var;
                        b(W2, bkh.c(l98.f0(utcVar5, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, i8 == list.size() + (-1) ? 8.0f : 0.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 11), 1.0f), function1, f6, f4, av8Var3, (i5 << 3) & 896);
                        f7 = f9;
                        av8Var = av8Var3;
                        i8 = i9;
                        utcVar4 = utcVar5;
                        str = str2;
                        r3 = f8;
                    }
                    av8Var.s(false);
                    av8Var.s(true);
                    int i10 = i5 << 18;
                    av8 av8Var4 = av8Var;
                    c(wn1Var, wn1Var2, booleanValue, f6, f4, f7, function1, function12, av8Var4, (29360128 & i10) | 6 | (i10 & 234881024));
                    av8Var = av8Var4;
                    av8Var.s(true);
                }
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new b1j((Object) eflVar, function1, (Object) function12, xtcVar, i2, 4);
        }
    }

    public static final void j(dxk dxkVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1688002991);
        int i3 = i2 | (av8Var.g(dxkVar) ? 4 : 2);
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            l8g a2 = k8g.a(new ng0(4.0f, true, new a70(6)), uxf.m, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, utc.a);
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
            String str = dxkVar.i;
            if (str == null) {
                str = "-";
            }
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.stayDarkLive, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            udj.c(oea.v(R.string.minus, av8Var), null, lz.D(R.color.stayDarkLive, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            String str2 = dxkVar.j;
            String str3 = str2 != null ? str2 : "-";
            udj.c(str3, null, lz.D(R.color.stayDarkLive, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new axk(dxkVar, i2, 3);
        }
    }

    public static final void k(long j2, Function1 function1, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var;
        Function1 function12;
        int i3;
        e1d e1dVar;
        a99 a99Var;
        boolean z;
        av8 av8Var2;
        function1.getClass();
        function0.getClass();
        av8 av8Var3 = (av8) of3Var;
        av8Var3.f0(669098884);
        int i4 = i2 | (av8Var3.f(j2) ? 4 : 2) | (av8Var3.i(function1) ? 32 : 16) | (av8Var3.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var3.T(i4 & 1, (i4 & 147) != 146)) {
            boolean z2 = j2 != 0;
            Object O = av8Var3.O();
            a99 a99Var2 = nf3.a;
            if (O == a99Var2) {
                O = e.f(null);
                av8Var3.n0(O);
            }
            e1d e1dVar2 = (e1d) O;
            qug o0 = hkg.o0(av8Var3);
            utc utcVar = utc.a;
            xtc u0 = hkg.u0(utcVar, o0, false, 14);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var3, 0);
            boolean z3 = z2;
            int hashCode = Long.hashCode(av8Var3.T);
            aee m = av8Var3.m();
            xtc C = fqj.C(av8Var3, u0);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a2, hf3.g);
            waa.K(av8Var3, m, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C, hf3.d);
            if (z3) {
                av8Var3.d0(659339449);
                m(j2, av8Var3, i4 & 14);
                av8Var3.s(false);
            } else {
                av8Var3.d0(659396148);
                av8Var3.s(false);
            }
            av8Var3.d0(-1502748657);
            for (y1d y1dVar : y1d.h) {
                boolean z4 = ((y1d) e1dVar2.getValue()) == y1dVar;
                boolean e2 = av8Var3.e(y1dVar.ordinal());
                Object O2 = av8Var3.O();
                if (e2 || O2 == a99Var2) {
                    O2 = new ixa(17, y1dVar, e1dVar2);
                    av8Var3.n0(O2);
                }
                l(y1dVar, z4, (Function0) O2, av8Var3, 0);
            }
            bf3.t(av8Var3, false, utcVar, 24.0f, av8Var3);
            xtc b0 = l98.b0(utcVar, 16.0f);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var3, 0);
            int hashCode2 = Long.hashCode(av8Var3.T);
            aee m2 = av8Var3.m();
            xtc C2 = fqj.C(av8Var3, b0);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var3.h0();
            if (av8Var3.S) {
                av8Var3.l(zg3Var2);
            } else {
                av8Var3.q0();
            }
            waa.K(av8Var3, a3, hf3.g);
            waa.K(av8Var3, m2, hf3.f);
            waa.K(av8Var3, Integer.valueOf(hashCode2), hf3.j);
            waa.J(av8Var3, hf3.k);
            waa.K(av8Var3, C2, hf3.d);
            if (z3) {
                av8Var3.d0(-1833263793);
                if (1.0f <= 0.0d) {
                    p3a.a("invalid weight; must be greater than zero");
                }
                i3 = i4;
                e1dVar = e1dVar2;
                z = false;
                a99Var = a99Var2;
                mha.h(oea.v(R.string.unmute_button, av8Var3), function0, new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true), gqh.a, null, false, false, false, 0L, 0, 0, av8Var3, ((i4 >> 3) & 112) | 3072, 0, 2032);
                av8Var2 = av8Var3;
                bf3.u(utcVar, 16.0f, av8Var2, false);
            } else {
                i3 = i4;
                e1dVar = e1dVar2;
                a99Var = a99Var2;
                z = false;
                av8Var2 = av8Var3;
                av8Var2.d0(-1832947624);
                av8Var2.s(false);
            }
            if (1.0f <= 0.0d) {
                p3a.a("invalid weight; must be greater than zero");
            }
            goa goaVar = new goa(1.0f > Float.MAX_VALUE ? Float.MAX_VALUE : 1.0f, true);
            String v = oea.v(R.string.save, av8Var2);
            boolean z5 = ((y1d) e1dVar.getValue()) != null ? true : z;
            if ((i3 & 112) == 32) {
                z = true;
            }
            Object O3 = av8Var2.O();
            if (z || O3 == a99Var) {
                function12 = function1;
                O3 = new s91(e1dVar, function12, 10);
                av8Var2.n0(O3);
            } else {
                function12 = function1;
            }
            av8 av8Var4 = av8Var2;
            mha.h(v, (Function0) O3, goaVar, null, null, z5, false, false, 0L, 0, 0, av8Var4, 0, 0, 2008);
            av8Var = av8Var4;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            av8Var = av8Var3;
            function12 = function1;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new x1d(j2, function12, function0, i2);
        }
    }

    public static final void l(y1d y1dVar, boolean z, Function0 function0, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1985398749);
        int i3 = i2 | (av8Var.e(y1dVar.ordinal()) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.i(function0) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (O == a99Var) {
                O = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O;
            Object[] objArr = new Object[0];
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = jxa.l;
                av8Var.n0(O2);
            }
            p28 p28Var = new p28(function0, (boh) o3a.N(objArr, (Function0) O2, av8Var, 48), 14);
            utc utcVar = utc.a;
            xtc c0 = l98.c0(tol.y(utcVar, true, true, true, D, wzcVar, p28Var, av8Var, 0), 16.0f, 12.0f);
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
            kq9.b(s6a.N(y1dVar.a, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.n_lv_1, av8Var), av8Var, 432, 0);
            goa goaVar = new goa(1.0f, true);
            String a3 = y1dVar.b.a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, goaVar, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.e(), av8Var, 0, 24960, 110584);
            av8Var = av8Var;
            tol.b(l7a.c.a(new p75(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT)), yqo.H(1737801543, av8Var, new n34(z, function0)), av8Var, 56);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new t60(y1dVar, z, function0, i2, 19);
        }
    }

    public static final void m(long j2, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(213818797);
        int i3 = (av8Var.f(j2) ? 4 : 2) | i2;
        if (av8Var.T(i3 & 1, (i3 & 3) != 2)) {
            utc utcVar = utc.a;
            xtc c0 = l98.c0(n9e.q(wnn.A(bkh.d(l98.b0(utcVar, 8.0f), 1.0f), o7g.a(16.0f)), lz.D(R.color.surface_2, av8Var), oyn.e), 16.0f, 8.0f);
            l8g a2 = k8g.a(ww9.b, uxf.m, av8Var, 48);
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
            kq9.b(s6a.N(R.drawable.ic_notification_mute, 6, av8Var), null, bkh.l(utcVar, 24.0f), lz.D(R.color.neutral_default, av8Var), av8Var, 432, 0);
            nq8.h(av8Var, bkh.p(utcVar, 8.0f));
            ChronoLocalDateTime<LocalDate> localDateTime = Instant.ofEpochSecond(j2).atZone(ZoneId.systemDefault()).toLocalDateTime();
            localDateTime.getClass();
            String a3 = new q9k(R.string.notifications_muted_until, l6g.K(new DateTimeFormatterBuilder().appendLocalized(null, FormatStyle.SHORT).toFormatter(Locale.getDefault()).format(localDateTime))).a(av8Var);
            yf8 yf8Var = xth.a;
            udj.c(a3, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.g(), av8Var, 0, 0, 131066);
            av8Var = av8Var;
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new kv3(j2, i2, 2);
        }
    }

    public static final void n(boolean z, xtc xtcVar, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(996954841);
        int i3 = 2;
        int i4 = (av8Var.h(z) ? 4 : 2) | i2 | (av8Var.g(xtcVar) ? 32 : 16);
        if (av8Var.T(i4 & 1, (i4 & 19) != 18)) {
            int i5 = 14;
            boolean z2 = (i4 & 14) == 4;
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new c31(z, i5);
                av8Var.n0(O);
            }
            nq8.h(av8Var, td4.Y(xtcVar, (Function1) O));
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new es8(z, xtcVar, i2, i3);
        }
    }

    public static final void o(wyi wyiVar, Function1 function1, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        long j2 = wyiVar.b;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(726217093);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(wyiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            i3 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i3 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            Integer num = wyiVar.e;
            Integer num2 = wyiVar.d;
            boolean f2 = av8Var.f(j2);
            Object O = av8Var.O();
            a99 a99Var = nf3.a;
            if (f2 || O == a99Var) {
                int year = LocalDate.now(ZoneId.systemDefault()).getYear();
                LocalDate localDate = Instant.ofEpochSecond(j2).atZone(ZoneId.systemDefault()).toLocalDate();
                localDate.getClass();
                bi4 bi4Var = year == localDate.getYear() ? bi4.PATTERN_DM : bi4.PATTERN_DMY_SHORT;
                ConcurrentHashMap concurrentHashMap = hk4.a;
                O = hk4.a(bi4Var.d()).format(Instant.ofEpochSecond(j2));
                O.getClass();
                av8Var.n0(O);
            }
            String str = (String) O;
            kv1 kv1Var = uxf.p;
            ng0 ng0Var = new ng0(8.0f, true, new a70(6));
            xtc A = wnn.A(xtcVar, o7g.a(8.0f));
            long D = lz.D(R.color.n_lv_4, av8Var);
            Object O2 = av8Var.O();
            if (O2 == a99Var) {
                O2 = mz1.e(av8Var);
            }
            wzc wzcVar = (wzc) O2;
            Object[] objArr = new Object[0];
            Object O3 = av8Var.O();
            if (O3 == a99Var) {
                O3 = nuh.n;
                av8Var.n0(O3);
            }
            int i4 = i3;
            xtc c0 = l98.c0(tol.y(A, true, true, true, D, wzcVar, new eui((boh) o3a.N(objArr, (Function0) O3, av8Var, 48), function1, wyiVar, 4), av8Var, 0), 4.0f, 8.0f);
            u23 a2 = t23.a(ng0Var, kv1Var, av8Var, 54);
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
            yf8 yf8Var = xth.a;
            udj.c(str, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 2, false, 1, 0, null, xth.b(), av8Var, 0, 24960, 110586);
            av8Var = av8Var;
            utc utcVar = utc.a;
            if (num2 == null || num == null) {
                av8Var.d0(1757236229);
                td4.G(wyiVar.c, bkh.l(utcVar, 40.0f), false, 0L, av8Var, 48, 12);
                av8Var.s(false);
            } else {
                av8Var.d0(1756672339);
                xtc l2 = bkh.l(utcVar, 40.0f);
                mv1 mv1Var = uxf.c;
                k1c c2 = e12.c(mv1Var, false);
                int hashCode2 = Long.hashCode(av8Var.T);
                aee m2 = av8Var.m();
                xtc C2 = fqj.C(av8Var, l2);
                av8Var.h0();
                if (av8Var.S) {
                    av8Var.l(zg3Var);
                } else {
                    av8Var.q0();
                }
                waa.K(av8Var, c2, f50Var);
                waa.K(av8Var, m2, ff3Var);
                bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
                waa.K(av8Var, C2, f50Var3);
                int intValue = num2.intValue();
                n12 n12Var = n12.a;
                td4.J(intValue, 0, av8Var, bkh.l(n12Var.a(utcVar, mv1Var), 28.0f));
                td4.J(num.intValue(), 0, av8Var, bkh.l(n12Var.a(utcVar, uxf.k), 28.0f));
                av8Var.s(true);
                av8Var.s(false);
            }
            p(wyiVar, null, av8Var, i4 & 14);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new opg(wyiVar, function1, xtcVar, i2, 10);
        }
    }

    public static final void p(wyi wyiVar, xtc xtcVar, of3 of3Var, int i2) {
        int i3;
        xtc xtcVar2;
        int i4;
        int i5;
        boolean z;
        boolean z2;
        utc utcVar;
        boolean z3;
        vyi vyiVar = wyiVar.i;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-980305206);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(wyiVar) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        int i6 = i3 | 48;
        if (av8Var.T(i6 & 1, (i6 & 19) != 18)) {
            boolean z4 = wyiVar.h;
            int ordinal = vyiVar.ordinal();
            if (ordinal == 0) {
                i4 = -1475459498;
                i5 = R.color.success;
            } else if (ordinal == 1) {
                i4 = -1475458179;
                i5 = R.color.neutral_default;
            } else {
                if (ordinal != 2) {
                    throw dmi.h(av8Var, -1475460924, false);
                }
                i4 = -1475456652;
                i5 = R.color.error;
            }
            long f2 = ljg.f(av8Var, i4, i5, av8Var, false);
            long D = lz.D(R.color.on_color_primary, av8Var);
            long D2 = lz.D(R.color.on_color_secondary, av8Var);
            boolean z5 = vyiVar == (z4 ? vyi.a : vyi.c);
            boolean z6 = vyiVar == (z4 ? vyi.c : vyi.a);
            mv1 mv1Var = uxf.g;
            utc utcVar2 = utc.a;
            xtc q = n9e.q(bkh.g(bkh.d(utcVar2, 1.0f), 20.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), f2, o7g.a(4.0f));
            k1c c2 = e12.c(mv1Var, false);
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
            waa.K(av8Var, c2, hf3.g);
            waa.K(av8Var, m, hf3.f);
            waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var, hf3.k);
            waa.K(av8Var, C, hf3.d);
            if (wyiVar.j) {
                av8Var.d0(523328689);
                z = false;
                n(z4, n12.a.a(bkh.l(l98.b0(utcVar2, 2.0f), 6.0f), z4 ? uxf.c : uxf.e), av8Var, 0);
                av8Var.s(false);
            } else {
                z = false;
                av8Var.d0(523617950);
                av8Var.s(false);
            }
            av8Var.d0(-1645675793);
            String str = wyiVar.f;
            String str2 = wyiVar.g;
            if (str == null || str2 == null) {
                z2 = z;
                utcVar = utcVar2;
                z3 = true;
            } else {
                yf8 yf8Var = xth.a;
                dfj k2 = xth.k();
                es0 es0Var = new es0(v8a.v(8), v8a.v(12), v8a.u(0.25d));
                xtc c0 = l98.c0(utcVar2, 4.0f, 2.0f);
                o80 o80Var = new o80();
                int g2 = o80Var.g(new pwh(z5 ? D : D2, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                try {
                    o80Var.d(str);
                    Unit unit = Unit.a;
                    o80Var.f(g2);
                    g2 = o80Var.g(new pwh(D2, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                    try {
                        o80Var.d(" - ");
                        o80Var.f(g2);
                        g2 = o80Var.g(new pwh(z6 ? D : D2, 0L, (wg8) null, (rg8) null, (sg8) null, (tf8) null, (String) null, 0L, (sn1) null, (zcj) null, (eib) null, 0L, (v8j) null, (qah) null, 65534));
                        try {
                            o80Var.d(str2);
                            o80Var.f(g2);
                            utcVar = utcVar2;
                            z2 = z;
                            udj.d(o80Var.h(), c0, 0L, es0Var, 0L, 0L, null, 0L, 2, false, 1, 0, null, null, k2, av8Var, 48, 24960, 241652);
                            av8Var = av8Var;
                            z3 = true;
                        } finally {
                        }
                    } finally {
                    }
                } finally {
                }
            }
            av8Var.s(z2);
            av8Var.s(z3);
            xtcVar2 = utcVar;
        } else {
            av8Var.W();
            xtcVar2 = xtcVar;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new nmi(wyiVar, xtcVar2, i2, 5);
        }
    }

    /* JADX WARN: Can't fix incorrect switch cases order, some code will duplicate */
    /* JADX WARN: Code restructure failed: missing block: B:25:0x00a5, code lost:
    
        if (r8.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_POSTPONED) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:26:0x00a8, code lost:
    
        r1 = r32;
        r26 = true;
        r0 = com.sofascore.results.R.color.on_color_primary;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x02de, code lost:
    
        r2.d0(25361036);
        r3 = defpackage.afi.c(r5, r10, r9, r26);
        r4 = defpackage.xth.a;
        defpackage.udj.c(r3, null, defpackage.lz.D(r0, r2), null, 0, null, 0, null, null, 0, 0, false, 0, 0, null, defpackage.xth.j(), r2, 0, 0, 131066);
        defpackage.udj.c(((defpackage.r9k) I(r11, r5).b).a(r2), null, defpackage.lz.D(com.sofascore.results.R.color.on_color_primary, r2), null, 0, null, 0, null, null, 0, 0, false, 0, 0, null, defpackage.xth.c(), r2, 0, 0, 131066);
        r2 = r2;
        r2.s(false);
        r0 = kotlin.Unit.a;
        r14 = true;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:29:0x00b4, code lost:
    
        if (r8.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_DELAYED) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x00bd, code lost:
    
        if (r8.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_WILL_CONTINUE) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x00e0, code lost:
    
        r2.d0(24744198);
        g(r32, r2, r3 & 14);
        r3 = defpackage.afi.c(r5, r10, r9, false);
        r4 = defpackage.xth.a;
        r26 = true;
        defpackage.udj.c(r3, null, defpackage.lz.D(com.sofascore.results.R.color.on_color_primary, r2), null, 0, null, 0, null, null, 0, 0, false, 0, 0, null, defpackage.xth.c(), r2, 0, 0, 131066);
        r2 = r2;
        r2.s(false);
        r1 = kotlin.Unit.a;
        r1 = r32;
        r2 = r2;
     */
    /* JADX WARN: Code restructure failed: missing block: B:34:0x00c6, code lost:
    
        if (r8.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_CANCELED) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:40:0x00dd, code lost:
    
        if (r8.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_FINISHED) == false) goto L18;
     */
    /* JADX WARN: Code restructure failed: missing block: B:70:0x02c1, code lost:
    
        if (r8.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_SUSPENDED) == false) goto L76;
     */
    /* JADX WARN: Code restructure failed: missing block: B:72:0x02ce, code lost:
    
        if (r8.equals(com.sofascore.model.mvvm.model.StatusKt.STATUS_INTERRUPTED) == false) goto L76;
     */
    /* JADX WARN: Failed to find 'out' block for switch in B:13:0x0097. Please report as an issue. */
    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r14v0 */
    /* JADX WARN: Type inference failed for: r14v1, types: [int] */
    /* JADX WARN: Type inference failed for: r14v13 */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void q(dxk dxkVar, of3 of3Var, int i2) {
        dxk dxkVar2;
        ?? r14;
        av8 av8Var;
        boolean z;
        int i3;
        String w;
        boolean z2;
        av8 av8Var2;
        boolean z3;
        av8 av8Var3;
        av8 av8Var4;
        av8 av8Var5 = (av8) of3Var;
        av8Var5.f0(1250322194);
        int i4 = i2 | (av8Var5.g(dxkVar) ? 4 : 2);
        if (av8Var5.T(i4 & 1, (i4 & 3) != 2)) {
            ff5 ff5Var = nz.b;
            Context context = (Context) av8Var5.k(ff5Var);
            xtc o = bkh.o(utc.a, 56.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14);
            u23 a2 = t23.a(ww9.d, uxf.p, av8Var5, 48);
            int hashCode = Long.hashCode(av8Var5.T);
            aee m = av8Var5.m();
            xtc C = fqj.C(av8Var5, o);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var5.h0();
            if (av8Var5.S) {
                av8Var5.l(zg3Var);
            } else {
                av8Var5.q0();
            }
            waa.K(av8Var5, a2, hf3.g);
            waa.K(av8Var5, m, hf3.f);
            waa.K(av8Var5, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var5, hf3.k);
            waa.K(av8Var5, C, hf3.d);
            String str = dxkVar.a;
            String str2 = dxkVar.c;
            String str3 = dxkVar.b;
            long j2 = dxkVar.d;
            switch (str.hashCode()) {
                case -1947652542:
                    dxkVar2 = dxkVar;
                    z = true;
                    i3 = R.color.on_color_primary;
                    break;
                case -1661628965:
                    dxkVar2 = dxkVar;
                    z = true;
                    i3 = R.color.on_color_primary;
                    break;
                case -1411655086:
                    z = true;
                    if (!str.equals(StatusKt.STATUS_IN_PROGRESS)) {
                        dxkVar2 = dxkVar;
                        av8Var5.d0(25845690);
                        av8Var5.s(false);
                        Unit unit = Unit.a;
                        av8Var4 = av8Var5;
                        z3 = z;
                        av8Var3 = av8Var4;
                        break;
                    } else {
                        av8Var5.d0(23762769);
                        dxkVar2 = dxkVar;
                        j(dxkVar2, av8Var5, i4 & 14);
                        String str4 = dxkVar2.k;
                        if (str4 == null) {
                            av8Var5.d0(23830565);
                            z2 = false;
                            av8Var5.s(false);
                            av8Var2 = av8Var5;
                        } else {
                            av8Var5.d0(23830566);
                            int indexOf = ywk.a.indexOf(str4);
                            Integer valueOf = Integer.valueOf(indexOf);
                            if (indexOf == -1) {
                                valueOf = null;
                            }
                            boolean a3 = ywk.a(str4);
                            if (a3) {
                                w = ljg.k(av8Var5, 352884588, R.string.volleyball_golden_set_short, av8Var5, false);
                            } else {
                                av8Var5.d0(352995506);
                                w = oea.w(R.string.volleyball_set_number_short, new Object[]{Integer.valueOf(yid.m(valueOf) + 1)}, av8Var5);
                                av8Var5.s(false);
                            }
                            String str5 = dxkVar2.l;
                            if (str5 == null) {
                                str5 = "";
                            }
                            String str6 = dxkVar2.m;
                            String str7 = w + " " + str5 + " - " + (str6 != null ? str6 : "");
                            yf8 yf8Var = xth.a;
                            udj.c(str7, null, a3 ? ljg.f(av8Var5, 288493983, R.color.stayDarkValue, av8Var5, false) : ljg.f(av8Var5, 288494750, R.color.stayDarkLive, av8Var5, false), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var5, 0, 0, 131066);
                            av8 av8Var6 = av8Var5;
                            z2 = false;
                            av8Var6.s(false);
                            av8Var2 = av8Var6;
                        }
                        av8Var2.s(z2);
                        Unit unit2 = Unit.a;
                        av8Var4 = av8Var2;
                        z3 = z;
                        av8Var3 = av8Var4;
                    }
                case -1322584522:
                    z = true;
                    if (!str.equals(StatusKt.STATUS_PRELIMINARY)) {
                        dxkVar2 = dxkVar;
                        av8Var5.d0(25845690);
                        av8Var5.s(false);
                        Unit unit3 = Unit.a;
                        av8Var4 = av8Var5;
                        z3 = z;
                        av8Var3 = av8Var4;
                        break;
                    }
                    av8Var5.d0(23217510);
                    Pair I = I(j2, (Context) av8Var5.k(ff5Var));
                    r9k r9kVar = (r9k) I.a;
                    r9k r9kVar2 = (r9k) I.b;
                    String a4 = r9kVar.a(av8Var5);
                    yf8 yf8Var2 = xth.a;
                    udj.c(a4, null, lz.D(R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var5, 0, 0, 131066);
                    udj.c(r9kVar2.a(av8Var5), null, lz.D(R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var5, 0, 0, 131066);
                    av8 av8Var7 = av8Var5;
                    av8Var7.s(false);
                    Unit unit4 = Unit.a;
                    dxkVar2 = dxkVar;
                    av8Var4 = av8Var7;
                    z3 = z;
                    av8Var3 = av8Var4;
                case -673660814:
                    break;
                case -500280754:
                    if (str.equals(StatusKt.STATUS_NOT_STARTED)) {
                        z = true;
                        av8Var5.d0(23217510);
                        Pair I2 = I(j2, (Context) av8Var5.k(ff5Var));
                        r9k r9kVar3 = (r9k) I2.a;
                        r9k r9kVar22 = (r9k) I2.b;
                        String a42 = r9kVar3.a(av8Var5);
                        yf8 yf8Var22 = xth.a;
                        udj.c(a42, null, lz.D(R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.j(), av8Var5, 0, 0, 131066);
                        udj.c(r9kVar22.a(av8Var5), null, lz.D(R.color.on_color_primary, av8Var5), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var5, 0, 0, 131066);
                        av8 av8Var72 = av8Var5;
                        av8Var72.s(false);
                        Unit unit42 = Unit.a;
                        dxkVar2 = dxkVar;
                        av8Var4 = av8Var72;
                        z3 = z;
                        av8Var3 = av8Var4;
                        break;
                    }
                    dxkVar2 = dxkVar;
                    z = true;
                    av8Var5.d0(25845690);
                    av8Var5.s(false);
                    Unit unit32 = Unit.a;
                    av8Var4 = av8Var5;
                    z3 = z;
                    av8Var3 = av8Var4;
                case -123173735:
                    break;
                case 527231609:
                    break;
                case 1550348642:
                    break;
                case 2018521742:
                    break;
                default:
                    dxkVar2 = dxkVar;
                    z = true;
                    av8Var5.d0(25845690);
                    av8Var5.s(false);
                    Unit unit322 = Unit.a;
                    av8Var4 = av8Var5;
                    z3 = z;
                    av8Var3 = av8Var4;
                    break;
            }
            av8Var3.s(z3);
            av8Var = av8Var3;
            r14 = z3;
        } else {
            dxkVar2 = dxkVar;
            r14 = 1;
            av8Var5.W();
            av8Var = av8Var5;
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new axk(dxkVar2, i2, r14);
        }
    }

    public static final void r(String str, boolean z, boolean z2, of3 of3Var, int i2) {
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-1693254791);
        int i3 = (av8Var.g(str) ? 4 : 2) | i2 | (av8Var.h(z) ? 32 : 16) | (av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            tc3 H = yqo.H(54095042, av8Var, new bxk(str, z2, z));
            if (z2) {
                av8Var.d0(637901432);
                k1c c2 = e12.c(uxf.c, false);
                int hashCode = Long.hashCode(av8Var.T);
                aee m = av8Var.m();
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
                waa.K(av8Var, c2, hf3.g);
                waa.K(av8Var, m, hf3.f);
                waa.K(av8Var, Integer.valueOf(hashCode), hf3.j);
                waa.J(av8Var, hf3.k);
                waa.K(av8Var, C, hf3.d);
                H.invoke(av8Var, 6);
                kq9.b(s6a.N(R.drawable.ic_aggregate_pointer, 6, av8Var), null, bkh.m(n12.a.a(utcVar, uxf.e), 8.0f, 16.0f), lz.D(R.color.on_color_primary, av8Var), av8Var, 48, 0);
                av8Var.s(true);
                av8Var.s(false);
            } else {
                av8Var.d0(638293675);
                H.invoke(av8Var, 6);
                av8Var.s(false);
            }
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new bxk(str, z, z2, i2);
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x007c  */
    /* JADX WARN: Removed duplicated region for block: B:42:0x0092  */
    /* JADX WARN: Removed duplicated region for block: B:45:0x009d  */
    /* JADX WARN: Removed duplicated region for block: B:56:0x0102  */
    /* JADX WARN: Removed duplicated region for block: B:59:? A[RETURN, SYNTHETIC] */
    /* JADX WARN: Removed duplicated region for block: B:65:0x00f8  */
    /* JADX WARN: Removed duplicated region for block: B:66:0x0094  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final void s(final boolean z, final Function0 function0, final xtc xtcVar, xhf xhfVar, float f2, final tc3 tc3Var, of3 of3Var, final int i2, final int i3) {
        int i4;
        final xhf xhfVar2;
        float f3;
        final float f4;
        eqf u;
        final float f5;
        int i5;
        function0.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-390320080);
        if ((i2 & 6) == 0) {
            i4 = (av8Var.h(z) ? 4 : 2) | i2;
        } else {
            i4 = i2;
        }
        if ((i2 & 48) == 0) {
            i4 |= av8Var.i(function0) ? 32 : 16;
        }
        if ((i2 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if ((i2 & 3072) == 0) {
            if ((i3 & 8) == 0) {
                xhfVar2 = xhfVar;
                if (av8Var.g(xhfVar2)) {
                    i5 = a.o;
                    i4 |= i5;
                }
            } else {
                xhfVar2 = xhfVar;
            }
            i5 = 1024;
            i4 |= i5;
        } else {
            xhfVar2 = xhfVar;
        }
        int i6 = i3 & 16;
        if (i6 != 0) {
            i4 |= 24576;
        } else if ((i2 & 24576) == 0) {
            f3 = f2;
            i4 |= av8Var.d(f3) ? 16384 : 8192;
            if ((196608 & i2) == 0) {
                i4 |= av8Var.i(tc3Var) ? 131072 : C.DEFAULT_BUFFER_SEGMENT_SIZE;
            }
            int i7 = 1;
            if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
                av8Var.W();
                f4 = f3;
            } else {
                av8Var.Y();
                if ((i2 & 1) == 0 || av8Var.B()) {
                    if ((i3 & 8) != 0) {
                        xhfVar2 = x2a.J(av8Var);
                        i4 &= -7169;
                    }
                    if (i6 != 0) {
                        f5 = 0.0f;
                        av8Var.t();
                        xhf xhfVar3 = xhfVar2;
                        x2a.h(z, function0, xtcVar, xhfVar3, null, yqo.H(2031072329, av8Var, new ct8() { // from class: dsh
                            @Override // defpackage.ct8
                            public final Object invoke(Object obj, Object obj2, Object obj3) {
                                m12 m12Var = (m12) obj;
                                of3 of3Var2 = (of3) obj2;
                                int intValue = ((Integer) obj3).intValue();
                                m12Var.getClass();
                                if ((intValue & 6) == 0) {
                                    intValue |= ((av8) of3Var2).g(m12Var) ? 4 : 2;
                                }
                                av8 av8Var2 = (av8) of3Var2;
                                if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                                    b0a.t(m12Var, xhf.this, z, f5, av8Var2, intValue & 14);
                                } else {
                                    av8Var2.W();
                                }
                                return Unit.a;
                            }
                        }), yqo.H(335048970, av8Var, new ay7(tc3Var, i7)), av8Var, (i4 & 14) | 1769472 | (i4 & 112) | (i4 & 896) | (i4 & 7168));
                        xhfVar2 = xhfVar3;
                        f4 = f5;
                    }
                } else {
                    av8Var.W();
                    if ((i3 & 8) != 0) {
                        i4 &= -7169;
                    }
                }
                f5 = f3;
                av8Var.t();
                xhf xhfVar32 = xhfVar2;
                x2a.h(z, function0, xtcVar, xhfVar32, null, yqo.H(2031072329, av8Var, new ct8() { // from class: dsh
                    @Override // defpackage.ct8
                    public final Object invoke(Object obj, Object obj2, Object obj3) {
                        m12 m12Var = (m12) obj;
                        of3 of3Var2 = (of3) obj2;
                        int intValue = ((Integer) obj3).intValue();
                        m12Var.getClass();
                        if ((intValue & 6) == 0) {
                            intValue |= ((av8) of3Var2).g(m12Var) ? 4 : 2;
                        }
                        av8 av8Var2 = (av8) of3Var2;
                        if (av8Var2.T(intValue & 1, (intValue & 19) != 18)) {
                            b0a.t(m12Var, xhf.this, z, f5, av8Var2, intValue & 14);
                        } else {
                            av8Var2.W();
                        }
                        return Unit.a;
                    }
                }), yqo.H(335048970, av8Var, new ay7(tc3Var, i7)), av8Var, (i4 & 14) | 1769472 | (i4 & 112) | (i4 & 896) | (i4 & 7168));
                xhfVar2 = xhfVar32;
                f4 = f5;
            }
            u = av8Var.u();
            if (u == null) {
                u.d = new Function2() { // from class: esh
                    @Override // kotlin.jvm.functions.Function2
                    public final Object invoke(Object obj, Object obj2) {
                        ((Integer) obj2).getClass();
                        b0a.s(z, function0, xtcVar, xhfVar2, f4, tc3Var, (of3) obj, aba.K(i2 | 1), i3);
                        return Unit.a;
                    }
                };
                return;
            }
            return;
        }
        f3 = f2;
        if ((196608 & i2) == 0) {
        }
        int i72 = 1;
        if (av8Var.T(i4 & 1, (74899 & i4) == 74898)) {
        }
        u = av8Var.u();
        if (u == null) {
        }
    }

    public static final void t(final m12 m12Var, final xhf xhfVar, final boolean z, final float f2, of3 of3Var, final int i2) {
        int i3;
        xhf xhfVar2;
        boolean z2;
        float f3;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(-733397913);
        if ((i2 & 6) == 0) {
            i3 = (av8Var.g(m12Var) ? 4 : 2) | i2;
        } else {
            i3 = i2;
        }
        if ((i2 & 48) == 0) {
            xhfVar2 = xhfVar;
            i3 |= av8Var.g(xhfVar2) ? 32 : 16;
        } else {
            xhfVar2 = xhfVar;
        }
        if ((i2 & 384) == 0) {
            z2 = z;
            i3 |= av8Var.h(z2) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        } else {
            z2 = z;
        }
        if ((i2 & 3072) == 0) {
            f3 = f2;
            i3 |= av8Var.d(f3) ? a.o : 1024;
        } else {
            f3 = f2;
        }
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            phf.a.a(xhfVar2, z2, l98.f0(m12Var.a(utc.a, uxf.d), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, f3, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 13), lz.D(R.color.surface_P, av8Var), lz.D(R.color.primary_default, av8Var), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, av8Var, (i3 >> 3) & Sdk.SDKError.Reason.ASSET_FAILED_INSUFFICIENT_SPACE_VALUE, 32);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new Function2() { // from class: fsh
                @Override // kotlin.jvm.functions.Function2
                public final Object invoke(Object obj, Object obj2) {
                    ((Integer) obj2).getClass();
                    b0a.t(m12.this, xhfVar, z, f2, (of3) obj, aba.K(i2 | 1));
                    return Unit.a;
                }
            };
        }
    }

    public static final void u(int i2, of3 of3Var, gv9 gv9Var, xtc xtcVar, Function1 function1) {
        xtc xtcVar2;
        function1.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1915202196);
        int i3 = i2 | (av8Var.g(gv9Var) ? 4 : 2) | (av8Var.i(function1) ? 32 : 16);
        if (av8Var.T(i3 & 1, (i3 & 147) != 146)) {
            xtcVar2 = xtcVar;
            xtc q = n9e.q(xtcVar2, lz.D(R.color.surface_1, av8Var), o7g.a(16.0f));
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
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
            rha.b(oea.v(R.string.recent_form, av8Var), null, 0L, av8Var, 0, 6);
            xtc f0 = l98.f0(l98.d0(bkh.d(utc.a, 1.0f), 4.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8.0f, 7);
            l8g a3 = k8g.a(ww9.b, uxf.l, av8Var, 0);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, f0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            Iterator p = ljg.p(av8Var, C2, f50Var3, -1352296012, gv9Var);
            while (p.hasNext()) {
                wyi wyiVar = (wyi) p.next();
                av8Var.a0(386406041, Integer.valueOf(wyiVar.a));
                o(wyiVar, function1, new goa(1.0f, true), av8Var, i3 & 112);
                av8Var.s(false);
            }
            ljg.t(av8Var, false, true, true);
        } else {
            xtcVar2 = xtcVar;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new tr6(gv9Var, function1, xtcVar2, i2, 4);
        }
    }

    public static final void v(int i2, Function1 function1, xtc xtcVar, of3 of3Var, int i3) {
        int i4;
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1037707219);
        if ((i3 & 6) == 0) {
            i4 = (av8Var.e(i2) ? 4 : 2) | i3;
        } else {
            i4 = i3;
        }
        if ((i3 & 48) == 0) {
            i4 |= av8Var.i(function1) ? 32 : 16;
        }
        if ((i3 & 384) == 0) {
            i4 |= av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128;
        }
        if (av8Var.T(i4 & 1, (i4 & 147) != 146)) {
            xtc q = n9e.q(wnn.A(xtcVar, o7g.a(8.0f)), lz.D(R.color.neutral_highlight, av8Var), oyn.e);
            boolean z = (i4 & 112) == 32;
            int i5 = i4 & 14;
            boolean z2 = z | (i5 == 4);
            Object O = av8Var.O();
            if (z2 || O == nf3.a) {
                O = new kj4(i2, 7, function1);
                av8Var.n0(O);
            }
            xtc b0 = l98.b0(tol.y(q, false, false, false, 0L, null, (Function0) O, av8Var, 31), 4.0f);
            u23 a2 = t23.a(new ng0(4.0f, true, new a70(6)), uxf.p, av8Var, 54);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, b0);
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
            td4.G(i2, bkh.l(utc.a, 20.0f), false, 0L, av8Var, i5 | 48, 12);
            String v = oea.v(R.string.third_place, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_3, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.c(), av8Var, 0, 0, 131066);
            av8Var.s(true);
        } else {
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new fel(i2, function1, xtcVar, i3, 1);
        }
    }

    public static final void w(final dxk dxkVar, of3 of3Var, int i2) {
        av8 av8Var;
        int i3;
        av8 av8Var2 = (av8) of3Var;
        av8Var2.f0(-1348080334);
        int i4 = i2 | (av8Var2.g(dxkVar) ? 4 : 2);
        final int i5 = 0;
        if (!av8Var2.T(i4 & 1, (i4 & 3) != 2)) {
            av8Var = av8Var2;
            i3 = 0;
            av8Var.W();
        } else if (dxkVar == null) {
            av8Var2.d0(1578090421);
            av8Var2.s(false);
            av8Var = av8Var2;
            i3 = 0;
        } else {
            av8Var2.d0(1578090422);
            final Context context = (Context) av8Var2.k(nz.b);
            l8g a2 = k8g.a(new ng0(16.0f, true, new a70(6)), uxf.m, av8Var2, 54);
            int hashCode = Long.hashCode(av8Var2.T);
            aee m = av8Var2.m();
            utc utcVar = utc.a;
            xtc C = fqj.C(av8Var2, utcVar);
            if3.k7.getClass();
            zg3 zg3Var = hf3.b;
            av8Var2.h0();
            if (av8Var2.S) {
                av8Var2.l(zg3Var);
            } else {
                av8Var2.q0();
            }
            waa.K(av8Var2, a2, hf3.g);
            waa.K(av8Var2, m, hf3.f);
            waa.K(av8Var2, Integer.valueOf(hashCode), hf3.j);
            waa.J(av8Var2, hf3.k);
            waa.K(av8Var2, C, hf3.d);
            xtc l2 = bkh.l(utcVar, 32.0f);
            boolean z = dxkVar.g;
            boolean i6 = av8Var2.i(context) | av8Var2.g(dxkVar);
            Object O = av8Var2.O();
            a99 a99Var = nf3.a;
            if (i6 || O == a99Var) {
                O = new Function0() { // from class: zwk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i7 = i5;
                        dxk dxkVar2 = dxkVar;
                        switch (i7) {
                            case 0:
                                int i8 = TeamActivity.Z;
                                jle.r(context, dxkVar2.e, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                break;
                            default:
                                int i9 = TeamActivity.Z;
                                jle.r(context, dxkVar2.f, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var2.n0(O);
            }
            av8Var = av8Var2;
            td4.G(dxkVar.e, tol.y(l2, z, false, false, 0L, null, (Function0) O, av8Var, 28), false, 0L, av8Var, 0, 12);
            q(dxkVar, av8Var, i4 & 14);
            xtc l3 = bkh.l(utcVar, 32.0f);
            boolean z2 = dxkVar.h;
            boolean i7 = av8Var.i(context) | av8Var.g(dxkVar);
            Object O2 = av8Var.O();
            if (i7 || O2 == a99Var) {
                final int i8 = 1;
                O2 = new Function0() { // from class: zwk
                    @Override // kotlin.jvm.functions.Function0
                    public final Object invoke() {
                        int i72 = i8;
                        dxk dxkVar2 = dxkVar;
                        switch (i72) {
                            case 0:
                                int i82 = TeamActivity.Z;
                                jle.r(context, dxkVar2.e, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                break;
                            default:
                                int i9 = TeamActivity.Z;
                                jle.r(context, dxkVar2.f, null, null, null, Sdk.SDKError.Reason.INVALID_LOG_ERROR_ENDPOINT_VALUE);
                                break;
                        }
                        return Unit.a;
                    }
                };
                av8Var.n0(O2);
            }
            td4.G(dxkVar.f, tol.y(l3, z2, false, false, 0L, null, (Function0) O2, av8Var, 30), false, 0L, av8Var, 0, 12);
            av8Var.s(true);
            i3 = 0;
            av8Var.s(false);
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new axk(dxkVar, i2, i3);
        }
    }

    public static final void x(efl eflVar, boolean z, xtc xtcVar, Function1 function1, of3 of3Var, int i2) {
        boolean z2;
        zg3 zg3Var;
        mv1 mv1Var;
        mv1 mv1Var2;
        boolean z3;
        Function1 function12 = function1;
        mv1 mv1Var3 = uxf.j;
        eflVar.getClass();
        function12.getClass();
        av8 av8Var = (av8) of3Var;
        av8Var.f0(1511080358);
        int i3 = i2 | (av8Var.g(eflVar) ? 4 : 2) | (av8Var.h(z) ? 32 : 16) | (av8Var.g(xtcVar) ? NotificationCompat.FLAG_LOCAL_ONLY : 128) | (av8Var.i(function12) ? a.o : 1024);
        if (av8Var.T(i3 & 1, (i3 & 1171) != 1170)) {
            xtc d2 = bkh.d(xtcVar, 1.0f);
            u23 a2 = t23.a(ww9.d, uxf.o, av8Var, 0);
            int hashCode = Long.hashCode(av8Var.T);
            aee m = av8Var.m();
            xtc C = fqj.C(av8Var, d2);
            if3.k7.getClass();
            zg3 zg3Var2 = hf3.b;
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
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
            utc utcVar = utc.a;
            xtc d0 = l98.d0(bkh.d(utcVar, 1.0f), 24.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 2);
            l8g a3 = k8g.a(ww9.b, uxf.m, av8Var, 48);
            int hashCode2 = Long.hashCode(av8Var.T);
            aee m2 = av8Var.m();
            xtc C2 = fqj.C(av8Var, d0);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var2);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, a3, f50Var);
            waa.K(av8Var, m2, ff3Var);
            bf3.s(hashCode2, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C2, f50Var3);
            String v = oea.v(R.string.competition_type_knockout, av8Var);
            yf8 yf8Var = xth.a;
            udj.c(v, null, lz.D(R.color.n_lv_1, av8Var), null, 0L, null, 0L, null, null, 0L, 0, false, 0, 0, null, xth.i(), av8Var, 0, 0, 131066);
            nq8.h(av8Var, new goa(1.0f, true));
            String v2 = oea.v(R.string.full_view, av8Var);
            int i4 = i3 & 7168;
            boolean z4 = i4 == 2048;
            Object O = av8Var.O();
            Object obj = nf3.a;
            if (z4 || O == obj) {
                O = new b4j(7, function12);
                av8Var.n0(O);
            }
            tz9.s(0, 4, av8Var, null, v2, (Function0) O);
            av8Var.s(true);
            cdi b2 = a60.b(z ? 1.0f : 0.33f, null, "visible_knockout_percentage", av8Var, 3072, 22);
            xtc q = n9e.q(wnn.A(l98.c0(utcVar, 8.0f, 12.0f), o7g.a(16.0f)), lz.D(R.color.surface_1, av8Var), oyn.e);
            mv1 mv1Var4 = uxf.c;
            k1c c2 = e12.c(mv1Var4, false);
            int hashCode3 = Long.hashCode(av8Var.T);
            aee m3 = av8Var.m();
            xtc C3 = fqj.C(av8Var, q);
            av8Var.h0();
            if (av8Var.S) {
                zg3Var = zg3Var2;
                av8Var.l(zg3Var);
            } else {
                zg3Var = zg3Var2;
                av8Var.q0();
            }
            waa.K(av8Var, c2, f50Var);
            waa.K(av8Var, m3, ff3Var);
            bf3.s(hashCode3, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C3, f50Var3);
            xtc f0 = l98.f0(bkh.d(utcVar, 1.0f), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, z ? 48.0f : 12.0f, 5);
            boolean g2 = av8Var.g(b2);
            Object O2 = av8Var.O();
            if (g2 || O2 == obj) {
                mv1Var = mv1Var3;
                O2 = new izh(b2, 1);
                av8Var.n0(O2);
            } else {
                mv1Var = mv1Var3;
            }
            xtc B = wnn.B(s9a.A(f0, (ct8) O2));
            k1c c3 = e12.c(mv1Var4, false);
            int hashCode4 = Long.hashCode(av8Var.T);
            aee m4 = av8Var.m();
            xtc C4 = fqj.C(av8Var, B);
            av8Var.h0();
            if (av8Var.S) {
                av8Var.l(zg3Var);
            } else {
                av8Var.q0();
            }
            waa.K(av8Var, c3, f50Var);
            waa.K(av8Var, m4, ff3Var);
            bf3.s(hashCode4, av8Var, f50Var2, av8Var, ryVar);
            waa.K(av8Var, C4, f50Var3);
            boolean z5 = i4 == 2048;
            Object O3 = av8Var.O();
            if (z5 || O3 == obj) {
                function12 = function1;
                O3 = new fuj(5, function12);
                av8Var.n0(O3);
            } else {
                function12 = function1;
            }
            Function1 function13 = (Function1) O3;
            boolean z6 = i4 == 2048;
            Object O4 = av8Var.O();
            int i5 = 6;
            if (z6 || O4 == obj) {
                O4 = new fuj(i5, function12);
                av8Var.n0(O4);
            }
            i(eflVar, function13, (Function1) O4, bkh.d(utcVar, 1.0f), av8Var, (i3 & 14) | 3072);
            av8Var.s(true);
            n12 n12Var = n12.a;
            if (z) {
                mv1Var2 = mv1Var;
                z3 = false;
                av8Var.d0(-804632264);
                av8Var.s(false);
            } else {
                av8Var.d0(-805080090);
                mv1Var2 = mv1Var;
                nq8.h(av8Var, n9e.p(bkh.e(bkh.d(n12Var.a(utcVar, mv1Var2), 1.0f), 56.0f), wxf.E(b.j(new r13(r13.h), new r13(lz.D(R.color.surface_1, av8Var))), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14), null, 6));
                z3 = false;
                av8Var.s(false);
            }
            xtc O5 = kda.O(l98.f0(n12Var.a(utcVar, mv1Var2), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 16.0f, 7), "wc26_knockout_show_more", av8Var);
            String v3 = oea.v(z ? R.string.show_less : R.string.show_more, av8Var);
            bqh bqhVar = new bqh(s6a.N(z ? R.drawable.ic_chevron_up_large_16 : R.drawable.ic_chevron_down_large_16, 6, av8Var), uxf.q);
            boolean z7 = i4 == 2048 ? true : z3;
            if ((i3 & 112) == 32) {
                z3 = true;
            }
            boolean z8 = z7 | z3;
            Object O6 = av8Var.O();
            if (z8 || O6 == obj) {
                z2 = z;
                O6 = new ct2(function12, z2, 2);
                av8Var.n0(O6);
            } else {
                z2 = z;
            }
            mha.h(v3, (Function0) O6, O5, tqh.a, bqhVar, false, false, false, 0L, 0, 0, av8Var, 3072, 0, 2016);
            av8Var = av8Var;
            av8Var.s(true);
            av8Var.s(true);
        } else {
            z2 = z;
            av8Var.W();
        }
        eqf u = av8Var.u();
        if (u != null) {
            u.d = new p81(eflVar, z2, xtcVar, function12, i2, 26);
        }
    }

    public static final void y(int i2, int i3) {
        if (i2 < 0 || i2 >= i3) {
            zzl.r(dmi.k(i2, i3, "index: ", ", size: "));
        }
    }

    public static final void z(int i2, int i3) {
        if (i2 < 0 || i2 > i3) {
            zzl.r(dmi.k(i2, i3, "index: ", ", size: "));
        }
    }
}
