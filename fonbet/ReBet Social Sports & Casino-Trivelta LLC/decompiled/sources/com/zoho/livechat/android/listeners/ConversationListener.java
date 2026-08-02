package com.zoho.livechat.android.listeners;

import androidx.annotation.Keep;
import com.zoho.livechat.android.VisitorChat;
import java.util.ArrayList;

/* loaded from: classes4.dex */
public interface ConversationListener {
    @Keep
    void onFailure(int i10, String str);

    @Keep
    void onSuccess(ArrayList<VisitorChat> arrayList);
}
