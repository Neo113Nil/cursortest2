package com.mbridge.msdk.config.component.common.express.operator;

import android.text.TextUtils;
import androidx.core.app.NotificationCompat;
import com.inmobi.media.core.config.models.AdConfig;
import com.mbridge.msdk.foundation.tools.SameMD5;
import com.mbridge.msdk.foundation.tools.q0;
import defpackage.w1l;
import defpackage.wt3;
import java.io.File;
import java.io.FileInputStream;
import java.security.MessageDigest;
import java.util.List;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class j {
    private final com.mbridge.msdk.config.component.common.express.operator.parts.c a;

    public j(com.mbridge.msdk.config.component.common.express.operator.parts.c cVar) {
        this.a = cVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0045  */
    /* JADX WARN: Removed duplicated region for block: B:19:0x004a  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a a(Object obj) {
        int i;
        int i2 = 0;
        if (obj instanceof List) {
            List list = (List) obj;
            String valueOf = String.valueOf(list.get(0));
            String valueOf2 = list.size() > 1 ? String.valueOf(list.get(1)) : "1";
            if (TextUtils.isEmpty(valueOf) || valueOf.equalsIgnoreCase("null")) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
            }
            if (!TextUtils.isEmpty(valueOf2) && !valueOf2.equalsIgnoreCase("null")) {
                try {
                    i = Integer.parseInt(valueOf2);
                } catch (Throwable unused) {
                }
                i2 = !TextUtils.isEmpty(i != 1 ? com.mbridge.msdk.config.component.common.file.a.c(valueOf) : com.mbridge.msdk.config.component.common.file.a.g(valueOf)) ? 1 : 0;
            }
            i = 1;
            i2 = !TextUtils.isEmpty(i != 1 ? com.mbridge.msdk.config.component.common.file.a.c(valueOf) : com.mbridge.msdk.config.component.common.file.a.g(valueOf)) ? 1 : 0;
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Integer.valueOf(i2));
    }

    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(String str, Object obj, Object obj2) {
        try {
            if (com.mbridge.msdk.config.component.common.util.c.c("870").equals(str)) {
                return a(obj2);
            }
            if (com.mbridge.msdk.config.component.common.util.c.c("901").equals(str)) {
                return b(obj2);
            }
            File file = new File(String.valueOf(obj));
            if (!file.exists()) {
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            if (!com.mbridge.msdk.config.component.common.util.c.c("871").equals(str) && !com.mbridge.msdk.config.component.common.util.c.c("872").equals(str)) {
                if (com.mbridge.msdk.config.component.common.util.c.c("873").equals(str)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Long.valueOf(file.length()));
                }
                if (com.mbridge.msdk.config.component.common.util.c.c("874").equals(str)) {
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(a(file));
                }
                q0.b("OperatorFile", "Unknown file operation: " + str);
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(Long.valueOf(file.lastModified()));
        } catch (Exception e) {
            StringBuilder q = wt3.q("Error handling file operation: ", str, ", ");
            q.append(e.getMessage());
            q0.b("OperatorFile", q.toString(), e);
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(null);
        }
    }

    public com.mbridge.msdk.config.component.common.express.operator.parts.a a(String str, Object obj, Object obj2) {
        if (TextUtils.isEmpty(str)) {
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
        }
        if (a(str)) {
            return b(str, obj, obj2);
        }
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.c();
    }

    private String a(File file) {
        int i;
        try {
            MessageDigest messageDigest = MessageDigest.getInstance(SameMD5.TAG);
            byte[] bArr = new byte[8192];
            FileInputStream fileInputStream = new FileInputStream(file);
            while (true) {
                int read = fileInputStream.read(bArr);
                if (read == -1) {
                    break;
                }
                messageDigest.update(bArr, 0, read);
            }
            fileInputStream.close();
            byte[] digest = messageDigest.digest();
            StringBuilder sb = new StringBuilder();
            for (byte b : digest) {
                sb.append(Integer.toString((b & AdConfig.NETWORK_LOAD_LIMIT_DISABLED) + NotificationCompat.FLAG_LOCAL_ONLY, 16).substring(1));
            }
            return sb.toString();
        } catch (Exception e) {
            w1l.v(e, new StringBuilder("Calculate MD5 error: "), "OperatorFile");
            return null;
        }
    }

    private boolean a(String str) {
        return str.equals(com.mbridge.msdk.config.component.common.util.c.c("870")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("871")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("872")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("873")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("874")) || str.equals(com.mbridge.msdk.config.component.common.util.c.c("901"));
    }

    /* JADX WARN: Removed duplicated region for block: B:17:0x0047  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0073  */
    /* JADX WARN: Removed duplicated region for block: B:26:0x0062  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    private com.mbridge.msdk.config.component.common.express.operator.parts.a b(Object obj) {
        String str;
        String str2;
        int i;
        if (obj instanceof List) {
            List list = (List) obj;
            String valueOf = String.valueOf(list.get(0));
            if (list.size() > 1) {
                str2 = String.valueOf(list.get(1));
            } else {
                str2 = "1";
            }
            if (!TextUtils.isEmpty(valueOf) && !valueOf.equalsIgnoreCase("null")) {
                if (!TextUtils.isEmpty(str2) && !str2.equalsIgnoreCase("null")) {
                    try {
                        i = Integer.parseInt(str2);
                    } catch (Throwable unused) {
                    }
                    if (i != 1) {
                        String concat = "template".concat("/").concat(valueOf);
                        if (com.mbridge.msdk.config.component.common.file.a.j(concat)) {
                            str = "assets://".concat(concat);
                        }
                    } else {
                        str = com.mbridge.msdk.config.component.common.file.a.g(valueOf);
                    }
                    return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(TextUtils.isEmpty(str) ? "" : str);
                }
                i = 1;
                if (i != 1) {
                }
                return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(TextUtils.isEmpty(str) ? "" : str);
            }
            return com.mbridge.msdk.config.component.common.express.operator.parts.a.a("");
        }
        str = "";
        return com.mbridge.msdk.config.component.common.express.operator.parts.a.a(TextUtils.isEmpty(str) ? "" : str);
    }
}
