package com.vk.core.util.state;

import com.huawei.hms.framework.common.BundleUtil;
import io.appmetrica.analytics.coreutils.internal.StringUtils;
import java.util.ArrayList;
import java.util.concurrent.LinkedBlockingDeque;
import xsna.drm0;
import xsna.e43;
import xsna.fwk;
import xsna.j5g;
import xsna.pgn;
import xsna.tw8;

/* compiled from: AppStateCacheException.kt */
/* loaded from: classes17.dex */
public final class AppStateCacheException extends Throwable {
    public static final /* synthetic */ int b = 0;

    /* compiled from: AppStateCacheException.kt */
    public static final class a {
        public static AppStateCacheException a(String str, String str2, tw8 tw8Var, LinkedBlockingDeque linkedBlockingDeque) {
            int size;
            int i = 0;
            long j = 0;
            try {
                String str3 = (String) j5g.k0(drm0.c0(str, new String[]{BundleUtil.UNDERLINE_TAG}, 0, 6));
                if (str3 != null) {
                    j = Long.parseLong(str3);
                }
            } catch (Exception unused) {
            }
            long currentTimeMillis = System.currentTimeMillis();
            StringBuilder sb = new StringBuilder("db_size: ");
            fwk fwkVar = (fwk) tw8Var.b;
            sb.append(fwkVar.c("app_persistent_state_cache") + fwkVar.c("app_state_cache"));
            sb.append("\nmem_size: ");
            pgn pgnVar = (pgn) tw8Var.c;
            synchronized (pgnVar) {
                size = ((ArrayList) pgnVar.b).size();
            }
            sb.append(size);
            sb.append("\nuid: ");
            sb.append(str);
            sb.append("\nkey: ");
            sb.append(str2);
            sb.append("\ncreation_time: ");
            sb.append(j);
            sb.append("\nnow_time: ");
            sb.append(currentTimeMillis);
            sb.append("\nlive_time: ");
            sb.append((currentTimeMillis - j) / 1000);
            sb.append("(s)\n");
            if (linkedBlockingDeque != null) {
                for (Object obj : linkedBlockingDeque) {
                    int i2 = i + 1;
                    if (i < 0) {
                        e43.t();
                        throw null;
                    }
                    sb.append("error ");
                    sb.append(i);
                    sb.append(StringUtils.PROCESS_POSTFIX_DELIMITER);
                    sb.append((String) obj);
                    sb.append("\n");
                    i = i2;
                }
            }
            return new AppStateCacheException(sb.toString());
        }
    }
}
