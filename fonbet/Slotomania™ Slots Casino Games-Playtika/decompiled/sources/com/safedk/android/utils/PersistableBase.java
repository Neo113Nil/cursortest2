package com.safedk.android.utils;

import android.provider.Settings;
import android.util.Base64;
import com.google.android.exoplayer2.C;
import com.safedk.android.SafeDK;
import java.io.Externalizable;
import java.io.IOException;
import java.io.ObjectInput;
import java.io.ObjectOutput;
import java.nio.charset.Charset;
import javax.crypto.Cipher;
import javax.crypto.spec.SecretKeySpec;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes8.dex */
public abstract class PersistableBase implements f, Externalizable {
    private static final String a = "PersistableBase";
    private static final String b;
    private static final long serialVersionUID = 0;

    static {
        String string = Settings.Secure.getString(SafeDK.getInstance().m().getContentResolver(), "android_id");
        b = string + string;
    }

    @Override // java.io.Externalizable
    public void writeExternal(ObjectOutput out) throws IOException {
        try {
            byte[] bytes = a(i().toString(), b).getBytes(Charset.forName(C.UTF8_NAME));
            out.writeInt(bytes.length);
            out.write(bytes);
        } catch (IOException e) {
            throw new IOException("object serialization failed", e);
        } catch (JSONException e2) {
            throw new IOException("JSON serialization failed", e2);
        } catch (Exception e3) {
            throw new IOException("encryption failed", e3);
        }
    }

    @Override // java.io.Externalizable
    public void readExternal(ObjectInput in) throws ClassNotFoundException, IOException {
        byte[] bArr = new byte[in.readInt()];
        in.readFully(bArr);
        try {
            a(new JSONObject(b(new String(bArr, Charset.forName(C.UTF8_NAME)), b)));
        } catch (JSONException e) {
            throw new IOException("JSON deserialization failed", e);
        } catch (Exception e2) {
            throw new IOException("decryption failed", e2);
        }
    }

    private static String a(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(1, secretKeySpec);
        return Base64.encodeToString(cipher.doFinal(str.getBytes()), 2);
    }

    private static String b(String str, String str2) throws Exception {
        SecretKeySpec secretKeySpec = new SecretKeySpec(str2.getBytes(), "AES");
        Cipher cipher = Cipher.getInstance("AES");
        cipher.init(2, secretKeySpec);
        return new String(cipher.doFinal(Base64.decode(str, 2)));
    }
}
