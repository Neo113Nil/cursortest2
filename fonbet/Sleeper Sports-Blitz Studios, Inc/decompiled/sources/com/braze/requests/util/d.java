package com.braze.requests.util;

import android.net.Uri;
import java.net.URL;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes6.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final String f681a;
    public final Uri b;
    public final URL c;
    public final boolean d;

    public d(Uri uri) {
        Intrinsics.checkNotNullParameter(uri, "uri");
        this.b = uri;
        String uri2 = uri.toString();
        this.f681a = uri2;
        this.c = new URL(uri2);
        this.d = false;
    }

    public final String toString() {
        return this.f681a;
    }

    public /* synthetic */ d(String str) {
        this(str, false);
    }

    public d(String urlString, boolean z) {
        Intrinsics.checkNotNullParameter(urlString, "urlString");
        this.b = Uri.parse(urlString);
        this.f681a = urlString;
        this.c = new URL(urlString);
        this.d = z;
    }
}
