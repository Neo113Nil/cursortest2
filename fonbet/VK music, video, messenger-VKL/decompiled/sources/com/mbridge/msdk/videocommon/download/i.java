package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import androidx.credentials.exceptions.publickeycredential.DomExceptionUtils;
import com.mbridge.msdk.MBridgeConstans;
import com.mbridge.msdk.foundation.download.download.ResourceManager;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.c1;
import com.mbridge.msdk.foundation.tools.o0;
import java.io.File;
import java.util.List;

/* compiled from: ResourceManager.java */
/* loaded from: classes14.dex */
public class i {
    private String a;

    /* compiled from: ResourceManager.java */
    public static class a {
        public static i a = new i(null);
    }

    public /* synthetic */ i(h hVar) {
        this();
    }

    public static i a() {
        return a.a;
    }

    public void b() {
        this.a = com.mbridge.msdk.foundation.same.directory.e.b(com.mbridge.msdk.foundation.same.directory.c.MBRIDGE_700_RES);
    }

    private i() {
        b();
    }

    public String a(String str) {
        String str2;
        String str3 = "";
        try {
            String str4 = this.a + DomExceptionUtils.SEPARATOR + SameMD5.getMD5(c1.b(str));
            List<String> queryParameters = Uri.parse(str).getQueryParameters(ResourceManager.KEY_INDEX_HTML);
            if (queryParameters == null || queryParameters.size() <= 0) {
                return null;
            }
            String str5 = queryParameters.get(0);
            if (TextUtils.isEmpty(str5)) {
                return null;
            }
            String str6 = str4 + DomExceptionUtils.SEPARATOR + str5 + DomExceptionUtils.SEPARATOR + str5 + ".html";
            if (!o0.e(str6)) {
                return null;
            }
            try {
                com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
                if (f != null && !TextUtils.isEmpty(f.V())) {
                    com.mbridge.msdk.foundation.same.d.a(str, new File(str6));
                }
                str2 = str.substring(str.indexOf("?") + 1);
            } catch (Exception unused) {
                str2 = "";
            }
            if (!TextUtils.isEmpty(str2)) {
                str3 = "?" + str2;
            }
            return "file://" + str6 + str3;
        } catch (Exception e) {
            if (!MBridgeConstans.DEBUG) {
                return null;
            }
            e.printStackTrace();
            return null;
        }
    }
}
