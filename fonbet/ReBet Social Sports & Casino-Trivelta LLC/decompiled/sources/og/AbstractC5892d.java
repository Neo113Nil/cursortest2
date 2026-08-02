package og;

import android.content.Context;
import android.content.SharedPreferences;
import android.content.res.Configuration;
import android.graphics.PorterDuff;
import android.graphics.PorterDuffColorFilter;
import android.graphics.drawable.Drawable;
import android.os.Build;
import android.os.VibrationEffect;
import android.os.Vibrator;
import android.os.VibratorManager;
import android.util.TypedValue;
import androidx.core.graphics.AbstractC2074d;
import com.zoho.livechat.android.utils.LiveChatUtil;
import com.zoho.livechat.android.utils.P;
import com.zoho.salesiqembed.ZohoSalesIQ;
import java.util.Locale;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import od.u;
import p8.AbstractC6055d;
import rd.C6218a;

/* renamed from: og.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5892d {
    public static final Context a(Context context, Locale locale) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(locale, "locale");
        Locale.setDefault(locale);
        Configuration configuration = context.getResources().getConfiguration();
        configuration.setLocale(locale);
        Context createConfigurationContext = context.createConfigurationContext(configuration);
        Intrinsics.checkNotNullExpressionValue(createConfigurationContext, "createConfigurationContext(...)");
        return createConfigurationContext;
    }

    public static final Context b(Context context) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return new androidx.appcompat.view.d(context, ZohoSalesIQ.getStyleForCurrentThemeMode());
    }

    public static final Drawable c(Context context, int i10, int i11) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(context, "<this>");
        try {
            Result.Companion companion = Result.INSTANCE;
            Drawable f10 = androidx.core.content.res.k.f(context.getResources(), i10, context.getTheme());
            r0 = f10 != null ? f10.mutate() : null;
            if (r0 != null) {
                r0.setColorFilter(new PorterDuffColorFilter(i11, PorterDuff.Mode.SRC_IN));
            }
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return r0;
    }

    public static final Drawable d(Context context, int i10, int i11) {
        Object m147constructorimpl;
        if (context == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            Drawable f10 = androidx.core.content.res.k.f(context.getResources(), i10, context.getTheme());
            r0 = f10 != null ? f10.mutate() : null;
            if (r0 != null) {
                r0.setColorFilter(new PorterDuffColorFilter(P.e(context, i11), PorterDuff.Mode.SRC_IN));
            }
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return r0;
    }

    public static final Drawable e(Context context, Drawable drawable, int i10) {
        Object m147constructorimpl;
        Intrinsics.checkNotNullParameter(drawable, "drawable");
        if (context == null) {
            return null;
        }
        try {
            Result.Companion companion = Result.INSTANCE;
            drawable.setColorFilter(new PorterDuffColorFilter(P.e(context, i10), PorterDuff.Mode.SRC_IN));
            m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
        } catch (Throwable th2) {
            Result.Companion companion2 = Result.INSTANCE;
            m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
        }
        Throwable m150exceptionOrNullimpl = Result.m150exceptionOrNullimpl(m147constructorimpl);
        if (m150exceptionOrNullimpl != null) {
            LiveChatUtil.log(m150exceptionOrNullimpl);
        }
        return drawable;
    }

    public static final int f(Context context, Integer num) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return h(context, num, 0.0f, 2, null);
    }

    public static final int g(Context context, Integer num, float f10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (num != null) {
            context.getTheme().resolveAttribute(num.intValue(), typedValue, false);
        }
        int color = typedValue.type == 1 ? context.getResources().getColor(typedValue.data) : typedValue.data;
        if (f10 <= -1.0f) {
            context = null;
        }
        return context != null ? AbstractC2074d.k(color, (int) (255 * (f10 / 100))) : color;
    }

    public static /* synthetic */ int h(Context context, Integer num, float f10, int i10, Object obj) {
        if ((i10 & 2) != 0) {
            f10 = -1.0f;
        }
        return g(context, num, f10);
    }

    public static final int i(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return androidx.core.content.res.k.d(context.getResources(), i10, context.getTheme());
    }

    public static final Context j(Context context) {
        SharedPreferences M10 = C6218a.M();
        return new androidx.appcompat.view.d(context, (context == null || M10 == null || !M10.getBoolean("SYNC_WITH_OS", true)) ? ZohoSalesIQ.getTheme() : (context.getResources().getConfiguration().uiMode & 48) == 32 ? u.f61163i : u.f61164j);
    }

    public static final float k(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        if (context.getTheme().resolveAttribute(i10, typedValue, true)) {
            return TypedValue.complexToDimension(typedValue.data, context.getResources().getDisplayMetrics());
        }
        return 0.0f;
    }

    public static final int l(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(i10, typedValue, true);
        return typedValue.resourceId;
    }

    public static final Drawable m(Context context, int i10) {
        Intrinsics.checkNotNullParameter(context, "<this>");
        return androidx.core.content.res.k.f(context.getResources(), l(context, i10), context.getTheme());
    }

    public static final void n(Context context, long[] timings) {
        VibrationEffect createWaveform;
        Vibrator defaultVibrator;
        Vibrator defaultVibrator2;
        VibrationEffect createWaveform2;
        Intrinsics.checkNotNullParameter(context, "<this>");
        Intrinsics.checkNotNullParameter(timings, "timings");
        int i10 = Build.VERSION.SDK_INT;
        if (i10 >= 31) {
            Object systemService = context.getSystemService("vibrator_manager");
            Intrinsics.checkNotNull(systemService, "null cannot be cast to non-null type android.os.VibratorManager");
            VibratorManager a10 = AbstractC6055d.a(systemService);
            defaultVibrator = a10.getDefaultVibrator();
            if (defaultVibrator.hasVibrator()) {
                defaultVibrator2 = a10.getDefaultVibrator();
                createWaveform2 = VibrationEffect.createWaveform(timings, -1);
                defaultVibrator2.vibrate(createWaveform2);
                return;
            }
            return;
        }
        Object systemService2 = context.getSystemService("vibrator");
        Intrinsics.checkNotNull(systemService2, "null cannot be cast to non-null type android.os.Vibrator");
        Vibrator vibrator = (Vibrator) systemService2;
        if (vibrator.hasVibrator()) {
            if (i10 < 26) {
                vibrator.vibrate(timings, -1);
            } else {
                createWaveform = VibrationEffect.createWaveform(timings, -1);
                vibrator.vibrate(createWaveform);
            }
        }
    }
}
