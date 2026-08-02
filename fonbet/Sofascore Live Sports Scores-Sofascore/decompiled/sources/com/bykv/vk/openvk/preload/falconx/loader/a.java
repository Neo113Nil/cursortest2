package com.bykv.vk.openvk.preload.falconx.loader;

import android.content.Context;
import android.text.TextUtils;
import com.bykv.vk.openvk.preload.geckox.e.b;
import com.bykv.vk.openvk.preload.geckox.logger.GeckoLogger;
import defpackage.cp4;
import java.io.File;
import java.io.InputStream;
import java.util.Map;
import java.util.concurrent.atomic.AtomicBoolean;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public class a implements ILoader {
    private b a;
    private AtomicBoolean b = new AtomicBoolean(false);

    public a(Context context, String str, File file) {
        if (context == null) {
            cp4.h("context == null");
            throw null;
        }
        if (TextUtils.isEmpty(str)) {
            cp4.h("access key empty");
            throw null;
        }
        if (file != null) {
            this.a = new b(context, str, file);
        } else {
            cp4.h("resRootDir == null");
            throw null;
        }
    }

    public final int a(String str) throws Exception {
        if (!this.b.get()) {
            return this.a.b(str);
        }
        cp4.h("released!");
        return 0;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public boolean exist(String str) throws Exception {
        if (!this.b.get()) {
            return this.a.c(str);
        }
        cp4.h("released!");
        return false;
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public Map<String, Long> getChannelVersion() {
        return this.a.b();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public InputStream getInputStream(String str) throws Exception {
        if (this.b.get()) {
            cp4.h("released!");
            return null;
        }
        GeckoLogger.d("WebOffline-falcon", "GeckoResLoader ready to load, file:", str);
        return this.a.a(str);
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public String getResRootDir() {
        return this.a.a();
    }

    @Override // com.bykv.vk.openvk.preload.falconx.loader.ILoader
    public void release() throws Exception {
        if (this.b.getAndSet(true)) {
            return;
        }
        this.a.c();
    }
}
