package com.ironsource.adqualitysdk.sdk.i;

import android.media.MediaPlayer;
import android.view.View;
import com.ironsource.adqualitysdk.sdk.StringFog;
import java.lang.reflect.Field;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.adqualitysdk.sdk.i.ᴦ, reason: contains not printable characters */
/* loaded from: classes4.dex */
public abstract class AbstractC0807 {

    /* renamed from: טּ, reason: contains not printable characters */
    public static Field f2564;

    /* renamed from: סּ, reason: contains not printable characters */
    public static Field f2565;

    /* renamed from: ףּ, reason: contains not printable characters */
    public static Field f2566;

    /* renamed from: ﭖ, reason: contains not printable characters */
    public static Field f2567;

    /* renamed from: ﭴ, reason: contains not printable characters */
    public static Object f2568;

    /* renamed from: ﭸ, reason: contains not printable characters */
    public static Class f2569;

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static final String f2581 = StringFog.decrypt("eJeUm6ACwX1NkJya\n", "Ofnw6c9rpSg=\n");

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static final String f2580 = StringFog.decrypt("BoTT+IO9l+Unos7PirqR/A==\n", "a8u9u+/U9I4=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static final String f2579 = StringFog.decrypt("PN8Q2sK30scd+Q36yKzU3Q==\n", "UZB+jq3Csa8=\n");

    /* renamed from: ﻛ, reason: contains not printable characters */
    public static final String f2578 = StringFog.decrypt("4YmwKFKb\n", "jN/ZTSXoWtU=\n");

    /* renamed from: ﻐ, reason: contains not printable characters */
    public static final String f2577 = StringFog.decrypt("Bj8bUTKWDwQZOhxEKQ==\n", "a3NyIkbzYWE=\n");

    /* renamed from: ﻏ, reason: contains not printable characters */
    public static final String f2576 = StringFog.decrypt("N6JdT3UV4Ns+pEw=\n", "UMcpBhtmlLo=\n");

    /* renamed from: ﺙ, reason: contains not printable characters */
    public static final String f2575 = StringFog.decrypt("0blFCFq7NFzaqA==\n", "ttwxTD/dVSk=\n");

    /* renamed from: ﱡ, reason: contains not printable characters */
    public static final String f2574 = StringFog.decrypt("KSwZ3yBZsN4tEAPzIFqt\n", "RGN3lk4/35I=\n");

    /* renamed from: ﱟ, reason: contains not printable characters */
    public static final String f2573 = StringFog.decrypt("f4ilDMBvT2J3s6IgwU5WfWaipSrd\n", "EsfLT68CPw4=\n");

    /* renamed from: ﮐ, reason: contains not printable characters */
    public static final String f2572 = StringFog.decrypt("Kf0niI5Y7tg21y2UlU7q3CrXOw==\n", "RLJJ2Pw9nrk=\n");

    /* renamed from: ﮌ, reason: contains not printable characters */
    public static final String f2571 = StringFog.decrypt("BUkyWQ+nYtQHayxmD7Zs2wF1KG8Ep3s=\n", "aAZcCmrCCZc=\n");

    /* renamed from: ﮉ, reason: contains not printable characters */
    public static final String f2570 = StringFog.decrypt("Jak+W6+Z0mspnT5N\n", "SORbP8b4ggc=\n");

    /* renamed from: ｋ, reason: contains not printable characters */
    public static View.OnTouchListener m465(View view) {
        Field field;
        try {
            Object m467 = m467(view);
            if (m467 == null) {
                return null;
            }
            Class<?> cls = m467.getClass();
            synchronized (AbstractC0370.class) {
                try {
                    field = f2564;
                    if (field == null) {
                        field = m468(cls, f2579);
                        f2564 = field;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnTouchListener) field.get(m467);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾇ, reason: contains not printable characters */
    public static View.OnClickListener m466(View view) {
        Field field;
        try {
            Object m467 = m467(view);
            if (m467 == null) {
                return null;
            }
            Class<?> cls = m467.getClass();
            synchronized (AbstractC0370.class) {
                try {
                    field = f2565;
                    if (field == null) {
                        field = m468(cls, f2580);
                        f2565 = field;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return (View.OnClickListener) field.get(m467);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static ArrayList m469() {
        Object invoke;
        try {
            if (f2569 == null || (invoke = f2568) == null) {
                Class<?> cls = Class.forName(StringFog.decrypt("+gvOUA5G0lXtDM9VT3jfFf8K3W8AQdcc/hftTg5N1xc=\n", "m2WqImEvtns=\n"));
                f2569 = cls;
                invoke = cls.getMethod(f2576, null).invoke(null, null);
                f2568 = invoke;
            }
            Class cls2 = f2569;
            if (f2567 == null) {
                Field declaredField = cls2.getDeclaredField(f2578);
                f2567 = declaredField;
                declaredField.setAccessible(true);
            }
            Object obj = f2567.get(invoke);
            return obj instanceof List ? new ArrayList((List) obj) : obj instanceof View[] ? new ArrayList(Arrays.asList((View[]) obj)) : new ArrayList();
        } catch (Throwable th) {
            AbstractC0420.m244(f2581, StringFog.decrypt("7abn9F6uxvvcoPz1S67298aw+uxh78//z7Hnu1rnxOnb7rU=\n", "qNSVmyyOoZ4=\n") + th.getLocalizedMessage());
            return new ArrayList();
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m472(MediaPlayer mediaPlayer, InterfaceC0860 interfaceC0860) {
        try {
            Field m468 = m468(MediaPlayer.class, f2574);
            MediaPlayer.OnInfoListener onInfoListener = (MediaPlayer.OnInfoListener) m468.get(mediaPlayer);
            if (onInfoListener instanceof C0852) {
                return;
            }
            m468.set(mediaPlayer, new C0852(onInfoListener, interfaceC0860));
        } catch (Exception e) {
            AbstractC0356.m204(f2581, StringFog.decrypt("FuSwpNobrhBT5Ke7xFqkGzz4j67MUqY3HfCth8FIsxsd87A=\n", "c5bCy6g7x34=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m473(MediaPlayer mediaPlayer, InterfaceC0886 interfaceC0886) {
        try {
            Field m468 = m468(MediaPlayer.class, f2573);
            MediaPlayer.OnCompletionListener onCompletionListener = (MediaPlayer.OnCompletionListener) m468.get(mediaPlayer);
            if (onCompletionListener instanceof C0879) {
                return;
            }
            m468.set(mediaPlayer, new C0879(onCompletionListener, interfaceC0886));
        } catch (Exception e) {
            AbstractC0356.m204(f2581, StringFog.decrypt("byswKf66qxUqKyc24PuhHkU3DyPo86M4ZTQyKunuqxRkFSs1+P+sHng=\n", "CllCRoyawns=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m471(MediaPlayer mediaPlayer, InterfaceC0837 interfaceC0837) {
        try {
            Field m468 = m468(MediaPlayer.class, f2572);
            MediaPlayer.OnPreparedListener onPreparedListener = (MediaPlayer.OnPreparedListener) m468.get(mediaPlayer);
            if (onPreparedListener instanceof C0829) {
                return;
            }
            m468.set(mediaPlayer, new C0829(onPreparedListener, interfaceC0837));
        } catch (Exception e) {
            AbstractC0356.m204(f2581, StringFog.decrypt("uq3a56XimAX/rc34u6OSDpCx5e2zq5A7rbrY6aWnlSe2rNztuaeD\n", "39+oiNfC8Ws=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static void m470(MediaPlayer mediaPlayer, InterfaceC0800 interfaceC0800) {
        try {
            Field m468 = m468(MediaPlayer.class, f2571);
            MediaPlayer.OnSeekCompleteListener onSeekCompleteListener = (MediaPlayer.OnSeekCompleteListener) m468.get(mediaPlayer);
            if (onSeekCompleteListener instanceof C0757) {
                return;
            }
            m468.set(mediaPlayer, new C0757(onSeekCompleteListener, interfaceC0800));
        } catch (Exception e) {
            AbstractC0356.m204(f2581, StringFog.decrypt("WW59R/Cge44cbmpY7uFxhXNyXE3n61GPUWxjTfblXolPaGpG5/I=\n", "PBwPKIKAEuA=\n"), (Throwable) e, false);
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Object m467(View view) {
        Field field;
        try {
            synchronized (AbstractC0370.class) {
                try {
                    field = f2566;
                    if (field == null) {
                        field = m468(View.class, f2577);
                        f2566 = field;
                    }
                } catch (Throwable th) {
                    throw th;
                }
            }
            return field.get(view);
        } catch (Exception unused) {
            return null;
        }
    }

    /* renamed from: ﾒ, reason: contains not printable characters */
    public static Field m468(Class cls, String str) {
        try {
            Field declaredField = cls.getDeclaredField(str);
            declaredField.setAccessible(true);
            return declaredField;
        } catch (Exception e) {
            AbstractC0356.m204(f2581, StringFog.decrypt("pOn6m7mcblbh/O2Aj9lkVKDp7ZCN1WJUpQ==\n", "wZuI9Mu8Bzg=\n"), (Throwable) e, false);
            return null;
        }
    }
}
