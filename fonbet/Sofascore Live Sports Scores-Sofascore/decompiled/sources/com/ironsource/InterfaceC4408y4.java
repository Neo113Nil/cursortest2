package com.ironsource;

import defpackage.a70;
import java.util.Map;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.y4, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public interface InterfaceC4408y4 {
    static /* synthetic */ String a(InterfaceC4408y4 interfaceC4408y4, String str, String str2, int i, Object obj) {
        if (obj != null) {
            a70.m("Super calls with default arguments not supported in this target, function: getString");
            return null;
        }
        if ((i & 2) != 0) {
            str2 = null;
        }
        return interfaceC4408y4.a(str, str2);
    }

    @Nullable
    String a(@NotNull String str, @Nullable String str2);

    void a(@NotNull String str);

    @NotNull
    Map<String, ?> allData();

    void b(@NotNull String str, @NotNull String str2);
}
