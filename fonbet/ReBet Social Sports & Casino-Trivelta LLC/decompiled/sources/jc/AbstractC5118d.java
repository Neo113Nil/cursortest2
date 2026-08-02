package jc;

import android.R;
import android.app.AlertDialog;
import android.app.DatePickerDialog;
import android.content.Context;
import android.content.DialogInterface;
import android.content.res.Resources;
import android.os.Bundle;
import android.util.TypedValue;
import android.view.View;
import android.widget.Button;
import android.widget.DatePicker;
import androidx.fragment.app.AbstractActivityC2168s;
import androidx.fragment.app.DialogInterfaceOnCancelListenerC2163m;
import com.facebook.react.bridge.Arguments;
import com.facebook.react.bridge.Promise;
import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.devsupport.StackTraceHelper;
import com.facebook.react.uimanager.ViewProps;
import com.facebook.react.util.RNLog;
import com.twilio.voice.Constants;
import com.twilio.voice.EventKeys;
import java.util.Calendar;
import java.util.Locale;
import java.util.SimpleTimeZone;
import java.util.TimeZone;
import kotlin.jvm.internal.LongCompanionObject;
import l0.AbstractC5338c;
import org.bouncycastle.jcajce.util.AnnotatedPrivateKey;

/* renamed from: jc.d, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public abstract class AbstractC5118d {
    public static /* synthetic */ void a(DialogInterface.OnShowListener[] onShowListenerArr, DialogInterface dialogInterface) {
        for (DialogInterface.OnShowListener onShowListener : onShowListenerArr) {
            if (onShowListener != null) {
                onShowListener.onShow(dialogInterface);
            }
        }
    }

    public static /* synthetic */ void b(boolean z10, AlertDialog alertDialog, DialogInterface dialogInterface) {
        View findViewById;
        if (z10 && (alertDialog instanceof DatePickerDialog)) {
            DatePicker datePicker = ((DatePickerDialog) alertDialog).getDatePicker();
            int identifier = Resources.getSystem().getIdentifier("date_picker_header_year", StackTraceHelper.ID_KEY, Constants.PLATFORM_ANDROID);
            if (identifier == 0 || (findViewById = datePicker.findViewById(identifier)) == null) {
                return;
            }
            findViewById.performClick();
        }
    }

    public static /* synthetic */ void c(AlertDialog alertDialog, Context context, Bundle bundle, boolean z10, DialogInterface dialogInterface) {
        Button button = alertDialog.getButton(-1);
        Button button2 = alertDialog.getButton(-2);
        Button button3 = alertDialog.getButton(-3);
        int j10 = j(context);
        t(button, "positive", bundle, z10, j10);
        t(button2, "negative", bundle, z10, j10);
        t(button3, "neutral", bundle, z10, j10);
    }

    public static DialogInterface.OnShowListener d(final DialogInterface.OnShowListener... onShowListenerArr) {
        return new DialogInterface.OnShowListener() { // from class: jc.b
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AbstractC5118d.a(onShowListenerArr, dialogInterface);
            }
        };
    }

    public static Bundle e(ReadableMap readableMap) {
        Bundle f10 = f(readableMap);
        if (readableMap.hasKey("minimumDate") && !readableMap.isNull("minimumDate")) {
            f10.putLong("minimumDate", (long) readableMap.getDouble("minimumDate"));
        }
        if (readableMap.hasKey("maximumDate") && !readableMap.isNull("maximumDate")) {
            f10.putLong("maximumDate", (long) readableMap.getDouble("maximumDate"));
        }
        if (readableMap.hasKey(ViewProps.DISPLAY) && !readableMap.isNull(ViewProps.DISPLAY)) {
            f10.putString(ViewProps.DISPLAY, readableMap.getString(ViewProps.DISPLAY));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            f10.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            f10.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        if (readableMap.hasKey(ViewProps.TEST_ID) && !readableMap.isNull(ViewProps.TEST_ID)) {
            f10.putString(ViewProps.TEST_ID, readableMap.getString(ViewProps.TEST_ID));
        }
        if (readableMap.hasKey("fullscreen") && !readableMap.isNull("fullscreen")) {
            f10.putBoolean("fullscreen", readableMap.getBoolean("fullscreen"));
        }
        if (readableMap.hasKey("firstDayOfWeek") && !readableMap.isNull("firstDayOfWeek")) {
            f10.putInt("firstDayOfWeek", readableMap.getInt("firstDayOfWeek") + 1);
        }
        if (readableMap.hasKey("startOnYearSelection") && !readableMap.isNull("startOnYearSelection")) {
            f10.putBoolean("startOnYearSelection", readableMap.getBoolean("startOnYearSelection"));
        }
        return f10;
    }

    public static Bundle f(ReadableMap readableMap) {
        Bundle bundle = new Bundle();
        if (readableMap.hasKey(EventKeys.VALUE_KEY) && !readableMap.isNull(EventKeys.VALUE_KEY)) {
            bundle.putLong(EventKeys.VALUE_KEY, (long) readableMap.getDouble(EventKeys.VALUE_KEY));
        }
        if (readableMap.hasKey("timeZoneName") && !readableMap.isNull("timeZoneName")) {
            bundle.putString("timeZoneName", readableMap.getString("timeZoneName"));
        }
        if (readableMap.hasKey("title") && !readableMap.isNull("title")) {
            bundle.putString("title", readableMap.getString("title"));
        }
        if (readableMap.hasKey("initialInputMode") && !readableMap.isNull("initialInputMode")) {
            bundle.putString("initialInputMode", readableMap.getString("initialInputMode"));
        }
        return bundle;
    }

    public static Bundle g(ReadableMap readableMap) {
        Bundle f10 = f(readableMap);
        if (readableMap.hasKey("is24Hour") && !readableMap.isNull("is24Hour")) {
            f10.putBoolean("is24Hour", readableMap.getBoolean("is24Hour"));
        }
        if (readableMap.hasKey(ViewProps.DISPLAY) && !readableMap.isNull(ViewProps.DISPLAY)) {
            f10.putString(ViewProps.DISPLAY, readableMap.getString(ViewProps.DISPLAY));
        }
        if (readableMap.hasKey("dialogButtons") && !readableMap.isNull("dialogButtons")) {
            f10.putBundle("dialogButtons", Arguments.toBundle(readableMap.getMap("dialogButtons")));
        }
        if (readableMap.hasKey("minuteInterval") && !readableMap.isNull("minuteInterval")) {
            f10.putInt("minuteInterval", readableMap.getInt("minuteInterval"));
        }
        if (readableMap.hasKey("timeZoneOffsetInMinutes") && !readableMap.isNull("timeZoneOffsetInMinutes")) {
            f10.putLong("timeZoneOffsetInMinutes", (long) readableMap.getDouble("timeZoneOffsetInMinutes"));
        }
        return f10;
    }

    public static void h(AbstractActivityC2168s abstractActivityC2168s, String str, Promise promise) {
        if (abstractActivityC2168s == null) {
            promise.reject("E_NO_ACTIVITY", "Tried to close a " + str + " dialog while not attached to an Activity");
            return;
        }
        try {
            DialogInterfaceOnCancelListenerC2163m dialogInterfaceOnCancelListenerC2163m = (DialogInterfaceOnCancelListenerC2163m) abstractActivityC2168s.getSupportFragmentManager().p0(str);
            boolean z10 = dialogInterfaceOnCancelListenerC2163m != null;
            if (z10) {
                dialogInterfaceOnCancelListenerC2163m.dismiss();
            }
            promise.resolve(Boolean.valueOf(z10));
        } catch (Exception e10) {
            promise.reject(e10);
        }
    }

    public static Integer i(Bundle bundle, String str) {
        Bundle bundle2;
        int i10;
        Bundle bundle3 = bundle.getBundle("dialogButtons");
        if (bundle3 == null || (bundle2 = bundle3.getBundle(str)) == null || (i10 = (int) bundle2.getDouble("textColor", 0.0d)) == 0) {
            return null;
        }
        return Integer.valueOf(i10);
    }

    public static int j(Context context) {
        TypedValue typedValue = new TypedValue();
        context.getTheme().resolveAttribute(R.attr.textColorPrimary, typedValue, true);
        int i10 = typedValue.resourceId;
        return i10 != 0 ? AbstractC5338c.getColor(context, i10) : typedValue.data;
    }

    public static EnumC5128n k(Bundle bundle) {
        return (bundle == null || bundle.getString(ViewProps.DISPLAY, null) == null) ? EnumC5128n.DEFAULT : EnumC5128n.valueOf(bundle.getString(ViewProps.DISPLAY).toUpperCase(Locale.US));
    }

    public static z l(Bundle bundle) {
        return (bundle == null || bundle.getString(ViewProps.DISPLAY, null) == null) ? z.DEFAULT : z.valueOf(bundle.getString(ViewProps.DISPLAY).toUpperCase(Locale.US));
    }

    public static TimeZone m(Bundle bundle) {
        if (bundle != null && bundle.containsKey("timeZoneOffsetInMinutes")) {
            return new SimpleTimeZone(((int) bundle.getLong("timeZoneOffsetInMinutes")) * 60000, "GMT");
        }
        if (bundle != null && bundle.containsKey("timeZoneName")) {
            String string = bundle.getString("timeZoneName");
            if ("GMT".equals(string)) {
                return TimeZone.getTimeZone("GMT");
            }
            if (!"GMT".equals(TimeZone.getTimeZone(string).getID())) {
                return TimeZone.getTimeZone(string);
            }
            RNLog.w(null, "'" + string + "' does not exist in TimeZone.getAvailableIDs(). Falling back to TimeZone.getDefault()=" + TimeZone.getDefault().getID());
        }
        return TimeZone.getDefault();
    }

    public static long n(Bundle bundle) {
        if (!bundle.containsKey("maximumDate")) {
            return LongCompanionObject.MAX_VALUE;
        }
        Calendar calendar = Calendar.getInstance(m(bundle));
        calendar.setTimeInMillis(bundle.getLong("maximumDate"));
        calendar.set(11, 23);
        calendar.set(12, 59);
        calendar.set(13, 59);
        calendar.set(14, androidx.room.w.MAX_BIND_PARAMETER_CNT);
        return calendar.getTimeInMillis();
    }

    public static long o(Bundle bundle) {
        if (!bundle.containsKey("minimumDate")) {
            return 0L;
        }
        Calendar calendar = Calendar.getInstance(m(bundle));
        calendar.setTimeInMillis(bundle.getLong("minimumDate"));
        calendar.set(11, 0);
        calendar.set(12, 0);
        calendar.set(13, 0);
        calendar.set(14, 0);
        return calendar.getTimeInMillis();
    }

    public static DialogInterface.OnShowListener p(final AlertDialog alertDialog, final boolean z10) {
        return new DialogInterface.OnShowListener() { // from class: jc.c
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AbstractC5118d.b(z10, alertDialog, dialogInterface);
            }
        };
    }

    public static void q(Bundle bundle, AlertDialog alertDialog, int i10, DialogInterface.OnClickListener onClickListener) {
        if (bundle == null || bundle.getString(AnnotatedPrivateKey.LABEL) == null) {
            return;
        }
        alertDialog.setButton(i10, bundle.getString(AnnotatedPrivateKey.LABEL), onClickListener);
    }

    public static DialogInterface.OnShowListener r(final Context context, final AlertDialog alertDialog, final Bundle bundle, final boolean z10) {
        return new DialogInterface.OnShowListener() { // from class: jc.a
            @Override // android.content.DialogInterface.OnShowListener
            public final void onShow(DialogInterface dialogInterface) {
                AbstractC5118d.c(alertDialog, context, bundle, z10, dialogInterface);
            }
        };
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static void s(Bundle bundle, AlertDialog alertDialog, DialogInterface.OnClickListener onClickListener) {
        Bundle bundle2 = bundle.getBundle("dialogButtons");
        if (bundle2 == null) {
            return;
        }
        q(bundle2.getBundle("neutral"), alertDialog, -3, onClickListener);
        DialogInterface.OnClickListener onClickListener2 = (DialogInterface.OnClickListener) alertDialog;
        q(bundle2.getBundle("positive"), alertDialog, -1, onClickListener2);
        q(bundle2.getBundle("negative"), alertDialog, -2, onClickListener2);
    }

    public static void t(Button button, String str, Bundle bundle, boolean z10, int i10) {
        if (button == null) {
            return;
        }
        Integer i11 = i(bundle, str);
        if (z10 || i11 != null) {
            if (i11 != null) {
                i10 = i11.intValue();
            }
            button.setTextColor(i10);
        }
    }
}
