package com.bykv.vk.openvk.preload.geckox.logger;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
class DefaultLogger implements Logger {
    private static String formatMsgs(Object... objArr) {
        if (objArr == null || objArr.length == 0) {
            return "";
        }
        StringBuilder sb = new StringBuilder();
        for (Object obj : objArr) {
            if (obj != null) {
                sb.append(obj.toString());
            } else {
                sb.append(" null ");
            }
            sb.append(" ");
        }
        return sb.toString();
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void d(String str, Object... objArr) {
        if (objArr == null) {
            return;
        }
        try {
            formatMsgs(objArr);
        } catch (Throwable unused) {
        }
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(String str, String str2, Throwable th) {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void w(String str, String str2) {
    }

    @Override // com.bykv.vk.openvk.preload.geckox.logger.Logger
    public void e(String str, String str2, Throwable th) {
    }
}
