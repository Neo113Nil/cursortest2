package com.fyber.inneractive.sdk.config;

import android.content.Context;
import android.os.LocaleList;
import android.text.TextUtils;
import android.view.inputmethod.InputMethodInfo;
import android.view.inputmethod.InputMethodManager;
import android.view.inputmethod.InputMethodSubtype;
import com.blaze.blazesdk.data_source.BlazeDataSourcePersonalizedType;
import com.fyber.inneractive.sdk.util.IAlog;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.Iterator;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class j {
    public static ArrayList a(Context context) {
        List<InputMethodInfo> list;
        HashSet hashSet = new HashSet();
        InputMethodManager inputMethodManager = (InputMethodManager) context.getSystemService("input_method");
        try {
            list = inputMethodManager.getEnabledInputMethodList();
        } catch (Throwable unused) {
            list = null;
        }
        if (list != null) {
            Iterator<InputMethodInfo> it = list.iterator();
            int i = 0;
            while (it.hasNext()) {
                for (InputMethodSubtype inputMethodSubtype : inputMethodManager.getEnabledInputMethodSubtypeList(it.next(), true)) {
                    if (inputMethodSubtype.getMode().equals("keyboard") && i < 10) {
                        String locale = inputMethodSubtype.getLocale();
                        if (!TextUtils.isEmpty(locale)) {
                            try {
                                String replace = locale.replace("_", "-");
                                hashSet.add(replace);
                                IAlog.a("Available input language: %s", replace);
                                i++;
                            } catch (Exception unused2) {
                            }
                        }
                    }
                }
            }
        }
        if (hashSet.isEmpty()) {
            hashSet.addAll(Arrays.asList(LocaleList.getDefault().toLanguageTags().split(BlazeDataSourcePersonalizedType.STRING_SEPARATOR)));
        }
        return new ArrayList(hashSet);
    }
}
