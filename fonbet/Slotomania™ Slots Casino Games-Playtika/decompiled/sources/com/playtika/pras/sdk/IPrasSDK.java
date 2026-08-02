package com.playtika.pras.sdk;

import android.os.Bundle;
import com.playtika.pras.sdk.PrasSDK;
import java.util.ArrayList;

/* loaded from: classes8.dex */
public interface IPrasSDK {
    void consumePurchase(String str, PrasSDK.ResponseHandler responseHandler);

    void getApprovedUnacknowledgedTransactions(PrasSDK.ResponseHandler responseHandler);

    void getApprovedUnacknowledgedTransactions(PrasSDK.ResponseHandler responseHandler, String str);

    void getProductDetails(ArrayList<String> arrayList, PrasSDK.ResponseHandler responseHandler);

    void getProductDetails(ArrayList<String> arrayList, PrasSDK.ResponseHandler responseHandler, String str);

    void openPaymentSettings(PrasSDK.ResponseHandler responseHandler);

    void openPaymentSettings(PrasSDK.ResponseHandler responseHandler, Bundle bundle);

    void openPaymentSettings(PrasSDK.ResponseHandler responseHandler, String str);

    void openPaymentSettings(PrasSDK.ResponseHandlerEx responseHandlerEx);

    void openPaymentSettings(PrasSDK.ResponseHandlerEx responseHandlerEx, Bundle bundle);

    void openPaymentSettings(PrasSDK.ResponseHandlerEx responseHandlerEx, String str);

    void startPurchase(String str, String str2, Bundle bundle, PrasSDK.ResponseHandler responseHandler);

    void startPurchase(String str, String str2, Bundle bundle, PrasSDK.ResponseHandlerEx responseHandlerEx);
}
