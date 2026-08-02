package com.bytedance.sdk.component.adexpress.oo;

import android.net.Uri;
import android.text.TextUtils;
import com.mbridge.msdk.playercommon.exoplayer2.util.MimeTypes;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class vy {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public enum pcc {
        HTML("text/html"),
        CSS("text/css"),
        JS("application/x-javascript"),
        IMAGE("image/*"),
        VIDEO(MimeTypes.VIDEO_MP4);

        private String wh;

        pcc(String str) {
            this.wh = str;
        }

        public String pcc() {
            return this.wh;
        }
    }

    public static pcc pcc(String str) {
        pcc pccVar = pcc.IMAGE;
        if (!TextUtils.isEmpty(str)) {
            try {
                String path = Uri.parse(str).getPath();
                if (path != null) {
                    if (path.endsWith(".css")) {
                        return pcc.CSS;
                    }
                    if (path.endsWith(".js")) {
                        return pcc.JS;
                    }
                    if (!path.endsWith(".jpg") && !path.endsWith(".gif") && !path.endsWith(".png") && !path.endsWith(".jpeg") && !path.endsWith(".webp") && !path.endsWith(".bmp") && !path.endsWith(".ico")) {
                        if (path.endsWith(".html")) {
                            return pcc.HTML;
                        }
                        if (path.endsWith(".mp4")) {
                            return pcc.VIDEO;
                        }
                    }
                }
            } catch (Throwable unused) {
            }
        }
        return pccVar;
    }
}
