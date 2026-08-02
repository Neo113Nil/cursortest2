package com.zoho.livechat.android.listeners;

import androidx.annotation.Keep;
import com.zoho.livechat.android.models.SalesIQArticle;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public interface FAQListener {
    @Keep
    void onFailure(int i10, String str);

    @Keep
    void onSuccess(ArrayList<SalesIQArticle> arrayList);
}
