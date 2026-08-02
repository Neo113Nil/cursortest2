package com.inmobi.media;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.inmobi.media.g6, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public final class C3437g6 {
    public static EnumC3489i6 a(int i) {
        if (400 <= i && 500 > i) {
            return EnumC3489i6.f;
        }
        if (200 < i && 300 > i) {
            return EnumC3489i6.g;
        }
        EnumC3489i6 enumC3489i6 = (EnumC3489i6) EnumC3489i6.c.get(i);
        return enumC3489i6 == null ? EnumC3489i6.d : enumC3489i6;
    }
}
