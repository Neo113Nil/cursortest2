package com.facebook.react.viewmanagers;

import android.view.View;
import com.facebook.hermes.intl.Constants;
import com.facebook.react.uimanager.BaseViewManager;
import com.facebook.react.uimanager.BaseViewManagerDelegate;
import com.facebook.react.uimanager.LayoutShadowNode;
import com.facebook.react.viewmanagers.RNDatePickerManagerInterface;

/* loaded from: classes2.dex */
public class RNDatePickerManagerDelegate<T extends View, U extends BaseViewManager<T, ? extends LayoutShadowNode> & RNDatePickerManagerInterface<T>> extends BaseViewManagerDelegate<T, U> {
    /* JADX WARN: Incorrect types in method signature: (TU;)V */
    public RNDatePickerManagerDelegate(BaseViewManager baseViewManager) {
        super(baseViewManager);
    }

    /* JADX WARN: Failed to restore switch over string. Please report as a decompilation issue */
    @Override // com.facebook.react.uimanager.BaseViewManagerDelegate, com.facebook.react.uimanager.ViewManagerDelegate
    /* renamed from: setProperty */
    public void kotlinCompat$setProperty(T t10, String str, Object obj) {
        str.getClass();
        char c10 = 65535;
        switch (str.hashCode()) {
            case -1785411759:
                if (str.equals("buttonColor")) {
                    c10 = 0;
                    break;
                }
                break;
            case -1411282677:
                if (str.equals("is24hourSource")) {
                    c10 = 1;
                    break;
                }
                break;
            case -1339516167:
                if (str.equals("minuteInterval")) {
                    c10 = 2;
                    break;
                }
                break;
            case -1235930166:
                if (str.equals("dividerColor")) {
                    c10 = 3;
                    break;
                }
                break;
            case -1097462182:
                if (str.equals(Constants.LOCALE)) {
                    c10 = 4;
                    break;
                }
                break;
            case -1063571914:
                if (str.equals("textColor")) {
                    c10 = 5;
                    break;
                }
                break;
            case -292758706:
                if (str.equals("timeZoneOffsetInMinutes")) {
                    c10 = 6;
                    break;
                }
                break;
            case 3076014:
                if (str.equals("date")) {
                    c10 = 7;
                    break;
                }
                break;
            case 3357091:
                if (str.equals("mode")) {
                    c10 = '\b';
                    break;
                }
                break;
            case 3417674:
                if (str.equals("open")) {
                    c10 = '\t';
                    break;
                }
                break;
            case 104069805:
                if (str.equals("modal")) {
                    c10 = '\n';
                    break;
                }
                break;
            case 110327241:
                if (str.equals("theme")) {
                    c10 = 11;
                    break;
                }
                break;
            case 110371416:
                if (str.equals("title")) {
                    c10 = '\f';
                    break;
                }
                break;
            case 344408077:
                if (str.equals("confirmText")) {
                    c10 = '\r';
                    break;
                }
                break;
            case 1007762652:
                if (str.equals("minimumDate")) {
                    c10 = 14;
                    break;
                }
                break;
            case 1685195246:
                if (str.equals("maximumDate")) {
                    c10 = 15;
                    break;
                }
                break;
            case 1888623303:
                if (str.equals("cancelText")) {
                    c10 = 16;
                    break;
                }
                break;
        }
        switch (c10) {
            case 0:
                ((RNDatePickerManagerInterface) this.mViewManager).setButtonColor(t10, obj != null ? (String) obj : null);
                break;
            case 1:
                ((RNDatePickerManagerInterface) this.mViewManager).setIs24hourSource(t10, (String) obj);
                break;
            case 2:
                ((RNDatePickerManagerInterface) this.mViewManager).setMinuteInterval(t10, obj != null ? ((Double) obj).intValue() : 0);
                break;
            case 3:
                ((RNDatePickerManagerInterface) this.mViewManager).setDividerColor(t10, obj != null ? (String) obj : null);
                break;
            case 4:
                ((RNDatePickerManagerInterface) this.mViewManager).setLocale(t10, obj != null ? (String) obj : null);
                break;
            case 5:
                ((RNDatePickerManagerInterface) this.mViewManager).setTextColor(t10, obj != null ? (String) obj : null);
                break;
            case 6:
                ((RNDatePickerManagerInterface) this.mViewManager).setTimeZoneOffsetInMinutes(t10, obj != null ? (String) obj : null);
                break;
            case 7:
                ((RNDatePickerManagerInterface) this.mViewManager).setDate(t10, obj != null ? (String) obj : null);
                break;
            case '\b':
                ((RNDatePickerManagerInterface) this.mViewManager).setMode(t10, (String) obj);
                break;
            case '\t':
                ((RNDatePickerManagerInterface) this.mViewManager).setOpen(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case '\n':
                ((RNDatePickerManagerInterface) this.mViewManager).setModal(t10, obj != null ? ((Boolean) obj).booleanValue() : false);
                break;
            case 11:
                ((RNDatePickerManagerInterface) this.mViewManager).setTheme(t10, (String) obj);
                break;
            case '\f':
                ((RNDatePickerManagerInterface) this.mViewManager).setTitle(t10, obj != null ? (String) obj : null);
                break;
            case '\r':
                ((RNDatePickerManagerInterface) this.mViewManager).setConfirmText(t10, obj != null ? (String) obj : null);
                break;
            case 14:
                ((RNDatePickerManagerInterface) this.mViewManager).setMinimumDate(t10, obj != null ? (String) obj : null);
                break;
            case 15:
                ((RNDatePickerManagerInterface) this.mViewManager).setMaximumDate(t10, obj != null ? (String) obj : null);
                break;
            case 16:
                ((RNDatePickerManagerInterface) this.mViewManager).setCancelText(t10, obj != null ? (String) obj : null);
                break;
            default:
                super.kotlinCompat$setProperty(t10, str, obj);
                break;
        }
    }
}
