package com.zoho.livechat.android.listeners;

import androidx.annotation.Keep;
import java.util.ArrayList;
import od.w;

/* loaded from: classes4.dex */
public interface DepartmentListener {
    @Keep
    void onFailure(int i10, String str);

    @Keep
    void onSuccess(ArrayList<w> arrayList);
}
