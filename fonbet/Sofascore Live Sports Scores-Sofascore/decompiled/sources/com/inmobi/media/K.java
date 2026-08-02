package com.inmobi.media;

import com.inmobi.media.core.config.models.AdConfig;
import java.util.concurrent.LinkedBlockingQueue;
import java.util.concurrent.ThreadPoolExecutor;
import java.util.concurrent.TimeUnit;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public abstract class K {
    public static final ThreadPoolExecutor a;

    static {
        AdConfig adConfig = (AdConfig) AbstractC3435g4.a.a(AdConfig.class);
        ThreadPoolExecutor threadPoolExecutor = new ThreadPoolExecutor(adConfig.getMaxPoolSize(), adConfig.getMaxPoolSize(), 5L, TimeUnit.SECONDS, new LinkedBlockingQueue(), new M9("K-AD", false));
        threadPoolExecutor.allowCoreThreadTimeOut(true);
        a = threadPoolExecutor;
    }
}
