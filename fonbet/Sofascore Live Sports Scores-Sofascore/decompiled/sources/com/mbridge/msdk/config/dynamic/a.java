package com.mbridge.msdk.config.dynamic;

import android.view.View;
import android.view.ViewGroup;
import java.io.File;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public class a {
    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (str.startsWith("assets://")) {
            return c.a().a(str, viewGroup, aVar);
        }
        if (new File(str).exists()) {
            return c.a().a(str, viewGroup, aVar);
        }
        return null;
    }
}
