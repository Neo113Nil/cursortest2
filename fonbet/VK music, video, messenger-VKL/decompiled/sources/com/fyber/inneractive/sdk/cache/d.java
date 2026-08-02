package com.fyber.inneractive.sdk.cache;

import android.net.Uri;
import android.text.TextUtils;
import com.fyber.inneractive.sdk.util.IAlog;
import java.io.File;
import java.util.Locale;

/* loaded from: classes12.dex */
public final class d implements a {
    public static final String c = IAlog.a(d.class);
    public final String a;
    public final String b;

    public d(String str) {
        this.a = str;
        Locale locale = Locale.US;
        int hashCode = str.hashCode();
        StringBuilder sb = new StringBuilder();
        sb.append(hashCode);
        this.b = sb.toString();
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final void a(Object obj) {
        String str = this.a;
        IAlog.c("%s: onCacheCommitted: %s for url: %s", c, (Uri) obj, str);
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String b() {
        return "";
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String c() {
        return this.b;
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
        return Uri.fromFile(new File(str));
    }

    @Override // com.fyber.inneractive.sdk.cache.a
    public final String a() {
        return this.a;
    }
}
