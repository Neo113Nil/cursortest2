package com.ironsource;

import android.text.TextUtils;
import com.ironsource.mediationsdk.utils.IronSourceUtils;
import java.util.Map;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class Jb {
    public final void a(@Nullable Map<String, String> map, boolean z) {
        if (z && TextUtils.isEmpty(com.ironsource.mediationsdk.p.g().j()) && map != null && !map.isEmpty()) {
            for (String str : map.keySet()) {
                if (IronSourceUtils.a(str)) {
                    String str2 = map.get(str);
                    if (!TextUtils.isEmpty(str2)) {
                        str = str2;
                    }
                    com.ironsource.mediationsdk.p.g().f(str);
                    return;
                }
            }
        }
    }
}
