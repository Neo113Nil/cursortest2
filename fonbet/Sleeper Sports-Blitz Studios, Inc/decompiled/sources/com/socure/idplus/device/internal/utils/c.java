package com.socure.idplus.device.internal.utils;

import android.content.Context;
import android.os.Build;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import java.util.Calendar;
import java.util.Iterator;
import java.util.List;
import java.util.Locale;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes8.dex */
public abstract class c {
    public static String b(Context context) {
        InputMethodManager inputMethodManager = (InputMethodManager) (context != null ? context.getSystemService("input_method") : null);
        List<InputMethodInfo> enabledInputMethodList = inputMethodManager != null ? inputMethodManager.getEnabledInputMethodList() : null;
        String str = "";
        if (enabledInputMethodList != null) {
            Iterator<InputMethodInfo> it = enabledInputMethodList.iterator();
            while (it.hasNext()) {
                List<InputMethodSubtype> enabledInputMethodSubtypeList = inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true);
                Intrinsics.checkNotNullExpressionValue(enabledInputMethodSubtypeList, "getEnabledInputMethodSubtypeList(...)");
                for (InputMethodSubtype inputMethodSubtype : enabledInputMethodSubtypeList) {
                    if (Intrinsics.areEqual(inputMethodSubtype.getMode(), "keyboard")) {
                        String locale = inputMethodSubtype.getLocale();
                        Intrinsics.checkNotNullExpressionValue(locale, "getLocale(...)");
                        Locale locale2 = new Locale(locale);
                        if (str.length() > 0) {
                            str = str + ",";
                        }
                        str = str + locale2.getDisplayLanguage() + "@hw=" + locale;
                    }
                }
            }
        }
        return str;
    }

    public static String a(Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        return context.getResources().getConfiguration().getLocales().toLanguageTags();
    }

    public static String a(Calendar calendar) {
        String calendarType;
        Intrinsics.checkNotNullParameter(calendar, "calendar");
        if (Build.VERSION.SDK_INT < 26) {
            return null;
        }
        calendarType = calendar.getCalendarType();
        return calendarType;
    }
}
