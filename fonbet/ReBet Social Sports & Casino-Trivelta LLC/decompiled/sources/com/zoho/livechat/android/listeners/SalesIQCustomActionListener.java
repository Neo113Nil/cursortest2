package com.zoho.livechat.android.listeners;

import androidx.annotation.Keep;

/* loaded from: classes4.dex */
public interface SalesIQCustomActionListener {
    @Keep
    void onFailure();

    @Keep
    void onFailure(String str);

    @Keep
    void onSuccess();

    @Keep
    void onSuccess(String str);
}
