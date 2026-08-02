package com.huawei.agconnect.config.impl;

import android.text.TextUtils;
import android.util.Log;
import com.huawei.agconnect.config.IDecrypt;
import com.mbridge.msdk.playercommon.exoplayer2.C;
import java.io.UnsupportedEncodingException;
import java.security.GeneralSecurityException;
import java.security.NoSuchAlgorithmException;
import java.security.spec.InvalidKeySpecException;
import javax.crypto.SecretKey;

/* loaded from: classes13.dex */
public class f implements IDecrypt {
    private SecretKey a;
    private final d b;
    private boolean c = false;

    public f(d dVar) {
        this.b = dVar;
    }

    private void a() {
        try {
            this.a = j.a(this.b);
        } catch (IllegalArgumentException | NoSuchAlgorithmException | InvalidKeySpecException e) {
            Log.e("AGC_LocalResource", "Exception when reading the 'K&I' for 'Config'. error is " + e.getMessage());
            this.a = null;
        }
        this.c = true;
    }

    @Override // com.huawei.agconnect.config.IDecrypt
    public String decrypt(String str, String str2) {
        StringBuilder sb;
        if (!this.c) {
            a();
        }
        if (this.a == null || TextUtils.isEmpty(str)) {
            sb = new StringBuilder("decrypt exception: secretKey = ");
            sb.append(this.a);
            sb.append("raw = ");
        } else {
            try {
                return new String(j.a(this.a, Hex.decodeHexString(str)), C.UTF8_NAME);
            } catch (UnsupportedEncodingException | IllegalArgumentException | GeneralSecurityException e) {
                sb = new StringBuilder("decrypt exception:");
                str = e.getMessage();
            }
        }
        sb.append(str);
        Log.e("AGC_LocalResource", sb.toString());
        return str2;
    }
}
