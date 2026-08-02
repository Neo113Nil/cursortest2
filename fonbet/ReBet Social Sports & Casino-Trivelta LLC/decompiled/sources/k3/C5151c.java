package k3;

import android.webkit.URLUtil;
import com.google.gson.Gson;
import java.io.Serializable;

/* renamed from: k3.c, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C5151c extends AbstractC5149a implements Serializable {

    @Gb.c("auth")
    public String auth;

    @Gb.c("countryCode")
    public String avsCountryCode;

    @Gb.c("otpmessage")
    public String otpmessage;

    @Gb.c("reference")
    public String reference;

    @Gb.c("trans")
    public String trans;

    public static C5151c a(String str) {
        try {
            return (C5151c) new Gson().m(str, C5151c.class);
        } catch (Exception e10) {
            C5151c c5151c = new C5151c();
            c5151c.status = "0";
            c5151c.message = e10.getMessage();
            return c5151c;
        }
    }

    public static C5151c f() {
        C5151c c5151c = new C5151c();
        c5151c.status = "0";
        c5151c.message = "Unknown server response";
        return c5151c;
    }

    public boolean b() {
        return this.auth != null;
    }

    public boolean c() {
        return this.otpmessage != null;
    }

    public boolean d() {
        return (this.reference == null || this.trans == null) ? false : true;
    }

    public boolean e() {
        String str = this.otpmessage;
        return str != null && URLUtil.isValidUrl(str);
    }
}
