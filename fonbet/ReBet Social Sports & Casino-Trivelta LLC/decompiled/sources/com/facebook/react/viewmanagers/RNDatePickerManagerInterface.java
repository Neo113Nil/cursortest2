package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.react.uimanager.ViewManagerWithGeneratedInterface;

/* loaded from: classes2.dex */
public interface RNDatePickerManagerInterface<T extends View> extends ViewManagerWithGeneratedInterface {
    void setButtonColor(T t10, String str);

    void setCancelText(T t10, String str);

    void setConfirmText(T t10, String str);

    void setDate(T t10, String str);

    void setDividerColor(T t10, String str);

    void setIs24hourSource(T t10, String str);

    void setLocale(T t10, String str);

    void setMaximumDate(T t10, String str);

    void setMinimumDate(T t10, String str);

    void setMinuteInterval(T t10, int i10);

    void setModal(T t10, boolean z10);

    void setMode(T t10, String str);

    void setOpen(T t10, boolean z10);

    void setTextColor(T t10, String str);

    void setTheme(T t10, String str);

    void setTimeZoneOffsetInMinutes(T t10, String str);

    void setTitle(T t10, String str);
}
