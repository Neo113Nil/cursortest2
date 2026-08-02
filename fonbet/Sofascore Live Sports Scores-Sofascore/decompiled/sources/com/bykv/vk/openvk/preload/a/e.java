package com.bykv.vk.openvk.preload.a;

import defpackage.is8;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public interface e {

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static class a implements e {
        @Override // com.bykv.vk.openvk.preload.a.e
        public final <T> T a(Class<T> cls) {
            try {
                return cls.newInstance();
            } catch (Exception e) {
                is8.h(e);
                return null;
            }
        }
    }

    <T> T a(Class<T> cls);
}
