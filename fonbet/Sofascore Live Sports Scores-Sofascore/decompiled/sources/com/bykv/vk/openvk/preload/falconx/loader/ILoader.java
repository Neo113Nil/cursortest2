package com.bykv.vk.openvk.preload.falconx.loader;

import java.io.InputStream;
import java.util.Map;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface ILoader {
    boolean exist(String str) throws Exception;

    Map<String, Long> getChannelVersion();

    InputStream getInputStream(String str) throws Exception;

    String getResRootDir();

    void release() throws Exception;
}
