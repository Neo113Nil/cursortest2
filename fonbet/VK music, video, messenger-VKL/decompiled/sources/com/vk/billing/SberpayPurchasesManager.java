package com.vk.billing;

import android.content.Context;
import android.net.Uri;
import android.webkit.WebView;
import xsna.asp;
import xsna.zrp;

/* compiled from: SberpayPurchasesManager.kt */
/* loaded from: classes.dex */
public interface SberpayPurchasesManager {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: SberpayPurchasesManager.kt */
    /* loaded from: classes15.dex */
    public static final class SberpayUriHandleResult {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ SberpayUriHandleResult[] $VALUES;
        public static final SberpayUriHandleResult FIRST_FAIL;
        public static final SberpayUriHandleResult IRRELEVANT;
        public static final SberpayUriHandleResult SECOND_FAIL;
        public static final SberpayUriHandleResult SUCCESS;

        static {
            SberpayUriHandleResult sberpayUriHandleResult = new SberpayUriHandleResult("IRRELEVANT", 0);
            IRRELEVANT = sberpayUriHandleResult;
            SberpayUriHandleResult sberpayUriHandleResult2 = new SberpayUriHandleResult("SUCCESS", 1);
            SUCCESS = sberpayUriHandleResult2;
            SberpayUriHandleResult sberpayUriHandleResult3 = new SberpayUriHandleResult("FIRST_FAIL", 2);
            FIRST_FAIL = sberpayUriHandleResult3;
            SberpayUriHandleResult sberpayUriHandleResult4 = new SberpayUriHandleResult("SECOND_FAIL", 3);
            SECOND_FAIL = sberpayUriHandleResult4;
            SberpayUriHandleResult[] sberpayUriHandleResultArr = {sberpayUriHandleResult, sberpayUriHandleResult2, sberpayUriHandleResult3, sberpayUriHandleResult4};
            $VALUES = sberpayUriHandleResultArr;
            $ENTRIES = new asp(sberpayUriHandleResultArr);
        }

        public SberpayUriHandleResult() {
            throw null;
        }

        public static SberpayUriHandleResult valueOf(String str) {
            return (SberpayUriHandleResult) Enum.valueOf(SberpayUriHandleResult.class, str);
        }

        public static SberpayUriHandleResult[] values() {
            return (SberpayUriHandleResult[]) $VALUES.clone();
        }
    }

    SberpayUriHandleResult a(Context context, Uri uri, WebView webView, String str, SberpayUriHandleResult sberpayUriHandleResult);
}
