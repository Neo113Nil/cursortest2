package com.zoho.livechat.android.listeners;

import android.graphics.drawable.Drawable;
import androidx.annotation.Keep;

/* loaded from: classes4.dex */
public interface OperatorImageListener {
    @Keep
    void onFailure(int i10, String str);

    @Keep
    void onSuccess(Drawable drawable);
}
