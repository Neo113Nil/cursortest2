package com.mbridge.msdk.videocommon.download;

import android.net.Uri;
import android.text.TextUtils;
import android.util.Patterns;
import android.webkit.URLUtil;
import com.mbridge.msdk.foundation.entity.CampaignEx;
import com.mbridge.msdk.foundation.tools.q0;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ConcurrentMap;
import java.util.concurrent.CopyOnWriteArrayList;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class d {
    private static d h;
    private CopyOnWriteArrayList<String> a;
    private ConcurrentMap<String, Object> b;
    private i c;
    private f d;
    private boolean e;
    private final String f = CampaignEx.JSON_KEY_LOCAL_REQUEST_ID;
    private final String g = "down_type";

    private d() {
        this.e = false;
        try {
            this.c = i.a();
            this.d = f.a();
            this.a = new CopyOnWriteArrayList<>();
            this.b = new ConcurrentHashMap();
            com.mbridge.msdk.setting.g f = com.mbridge.msdk.setting.i.b().f(com.mbridge.msdk.foundation.controller.c.n().b());
            if (f != null) {
                this.e = f.b(1);
            }
        } catch (Throwable th) {
            q0.b("H5DownLoadManager", th.getMessage(), th);
        }
    }

    private String b(String str) {
        f fVar = this.d;
        return fVar != null ? fVar.b(str) : str;
    }

    public String a(String str) {
        try {
            if (!Patterns.WEB_URL.matcher(str).matches()) {
                if (URLUtil.isValidUrl(str)) {
                }
                return str;
            }
            Uri parse = Uri.parse(str);
            String path = parse.getPath();
            if (!TextUtils.isEmpty(path) && TextUtils.isEmpty(parse.getQueryParameter("urlDebug"))) {
                return path.toLowerCase().endsWith(".zip") ? c(str) : b(str);
            }
            return str;
        } catch (Exception e) {
            e.printStackTrace();
            return str;
        }
    }

    public String c(String str) {
        i iVar = this.c;
        if (iVar != null) {
            return iVar.a(str);
        }
        return null;
    }

    public static synchronized d a() {
        d dVar;
        synchronized (d.class) {
            dVar = h;
            if (dVar == null) {
                dVar = new d();
                h = dVar;
            }
        }
        return dVar;
    }
}
