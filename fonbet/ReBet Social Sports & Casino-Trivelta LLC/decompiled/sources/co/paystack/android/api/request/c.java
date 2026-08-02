package co.paystack.android.api.request;

import java.io.Serializable;
import java.util.HashMap;

/* loaded from: classes.dex */
public class c extends a implements Serializable {

    @Gb.c("token")
    private String token;

    @Gb.c("trans")
    private String trans;

    public c() {
        a();
    }

    public HashMap b() {
        HashMap hashMap = new HashMap();
        hashMap.put("trans", d());
        hashMap.put("token", c());
        String str = this.device;
        if (str != null) {
            hashMap.put("device", str);
        }
        return hashMap;
    }

    public final String c() {
        return this.token;
    }

    public final String d() {
        return this.trans;
    }

    public c e(String str) {
        this.token = str;
        return this;
    }

    public c f(String str) {
        this.trans = str;
        return this;
    }
}
