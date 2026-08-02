package io.intercom.android.sdk.sheets;

import java.util.Map;

/* loaded from: classes9.dex */
public interface SheetListener {
    void onCloseSheetAction();

    void onSheetTitleAction(String str);

    void onSubmitSheetAction(Map<String, Object> map);

    void onWebViewFinishedLoad();
}
