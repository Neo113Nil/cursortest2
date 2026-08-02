package com.huawei.agconnect.config.impl;

import android.content.Context;
import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.AesDecrypt;
import com.ironsource.B5;
import java.io.UnsupportedEncodingException;

/* loaded from: classes13.dex */
public class k {
    private final AesDecrypt a;

    public k(Context context, String str) {
        this.a = !TextUtils.isEmpty(a(context, str)) ? new h(context, str) : new g(context, str);
    }

    private String a(Context context, String str) {
        String a = l.a(context, str, "agc_plugin_", "crypto");
        if (a == null) {
            return null;
        }
        try {
            return new String(Hex.decodeHexString(a), B5.O);
        } catch (UnsupportedEncodingException | IllegalArgumentException e) {
            Log.e("ReaderStrategy", "UnsupportedEncodingException" + e.getMessage());
            return null;
        }
    }

    public String a(String str, String str2) {
        return this.a.decrypt(str, str2);
    }
}
