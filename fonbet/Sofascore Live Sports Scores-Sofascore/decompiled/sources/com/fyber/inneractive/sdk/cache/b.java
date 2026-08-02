package com.fyber.inneractive.sdk.cache;

import android.graphics.Bitmap;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.o;
import com.fyber.inneractive.sdk.util.w0;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class b implements a {
    public final String a;

    public b(String str) {
        this.a = str;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        Bitmap bitmap = (Bitmap) obj;
        if (bitmap != null) {
            o.a.getSharedPreferences("IAConfigurationPreferences", 0).edit().putString("dt.dynamic.icon.data", w0.a(bitmap)).apply();
        }
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "dt.dynamic.icon.last.modified";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return String.valueOf(("dt.dynamic.icon_" + this.a).hashCode());
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final boolean d() {
        return true;
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final Object a(String str) {
        if (TextUtils.isEmpty(str)) {
            return null;
        }
        return w0.a(str);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.a;
    }
}
