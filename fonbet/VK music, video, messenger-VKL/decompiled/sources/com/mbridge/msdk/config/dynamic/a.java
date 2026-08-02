package com.mbridge.msdk.config.dynamic;

import android.view.View;
import android.view.ViewGroup;
import xsna.bd3;

/* compiled from: ComponentInflater.java */
/* loaded from: classes13.dex */
public class a {
    private View a() {
        return null;
    }

    public View a(String str, ViewGroup viewGroup, com.mbridge.msdk.config.dynamic.binddata.wrapper.a aVar) {
        if (!bd3.d(str)) {
            return null;
        }
        View a = c.a().a(str, viewGroup, aVar);
        return a != null ? a : a();
    }
}
