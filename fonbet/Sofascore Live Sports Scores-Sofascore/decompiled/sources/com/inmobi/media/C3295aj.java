package com.inmobi.media;

import java.util.List;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.aj, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3295aj {
    public final C3891xk a;
    public final double b;
    public final List c;

    public C3295aj(C3891xk c3891xk, double d, List list) {
        c3891xk.getClass();
        list.getClass();
        this.a = c3891xk;
        this.b = d;
        this.c = list;
    }

    public final boolean a(String str, Map map) {
        map.getClass();
        str.getClass();
        C3891xk c3891xk = this.a;
        if (c3891xk.e && !c3891xk.f.contains(str)) {
            return false;
        }
        if (map.isEmpty() || !Intrinsics.c(str, "AssetDownloaded") || !map.containsKey("assetType")) {
            return true;
        }
        if ("image".equals(map.get("assetType")) && !this.a.b) {
            C3839vk c3839vk = C3839vk.a;
            return false;
        }
        if ("gif".equals(map.get("assetType")) && !this.a.c) {
            C3839vk c3839vk2 = C3839vk.a;
            return false;
        }
        if (!"video".equals(map.get("assetType")) || this.a.d) {
            return true;
        }
        C3839vk c3839vk3 = C3839vk.a;
        return false;
    }

    public final int a(String str) {
        str.getClass();
        if (!this.c.contains(str)) {
            return 1;
        }
        if (this.b < this.a.g) {
            C3839vk c3839vk = C3839vk.a;
            return 2;
        }
        C3839vk c3839vk2 = C3839vk.a;
        return 0;
    }
}
