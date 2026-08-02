package org.chromium.net.impl;

import Ra.g;
import android.util.Log;
import androidx.annotation.NonNull;
import java.util.AbstractMap;
import java.util.ArrayList;
import java.util.Map;
import java.util.Objects;
import org.chromium.net.C;
import org.chromium.net.k;

/* loaded from: classes6.dex */
public final class b0 extends k.a {

    /* renamed from: a, reason: collision with root package name */
    private final D f78905a;

    /* renamed from: b, reason: collision with root package name */
    private final String f78906b;

    /* renamed from: c, reason: collision with root package name */
    private final C.b f78907c;

    /* renamed from: d, reason: collision with root package name */
    private final Va.a f78908d;

    /* renamed from: e, reason: collision with root package name */
    private String f78909e;

    /* renamed from: g, reason: collision with root package name */
    private boolean f78911g;

    /* renamed from: i, reason: collision with root package name */
    private org.chromium.net.A f78913i;

    /* renamed from: j, reason: collision with root package name */
    private Va.a f78914j;

    /* renamed from: k, reason: collision with root package name */
    private g.d f78915k;

    /* renamed from: f, reason: collision with root package name */
    private final ArrayList<Map.Entry<String, String>> f78910f = new ArrayList<>();

    /* renamed from: h, reason: collision with root package name */
    private int f78912h = 3;

    /* renamed from: l, reason: collision with root package name */
    @NonNull
    private String f78916l = "";

    /* renamed from: m, reason: collision with root package name */
    private long f78917m = -1;

    b0(String str, C.b bVar, Va.a aVar, D d11) {
        Objects.requireNonNull(str, "URL is required.");
        this.f78906b = str;
        this.f78907c = bVar;
        Objects.requireNonNull(aVar, "Executor is required.");
        this.f78908d = aVar;
        Objects.requireNonNull(d11, "CronetEngine is required.");
        this.f78905a = d11;
    }

    @Override // org.chromium.net.C.a
    public final b0 a(String str, String str2) {
        Objects.requireNonNull(str, "Invalid header name.");
        Objects.requireNonNull(str2, "Invalid header value.");
        if (!"Accept-Encoding".equalsIgnoreCase(str)) {
            this.f78910f.add(new AbstractMap.SimpleEntry(str, str2));
            return this;
        }
        if (Log.isLoggable("b0", 3)) {
            Log.d("b0", "It's not necessary to set Accept-Encoding on requests - cronet will do this automatically for you, and setting it yourself has no effect. See https://crbug.com/581399 for details.", new Exception());
        }
        return this;
    }

    @Override // org.chromium.net.C.a
    public final b0 b() {
        this.f78911g = true;
        return this;
    }

    @Override // org.chromium.net.C.a
    public final b0 c(String str) {
        Objects.requireNonNull(str, "Method is required.");
        this.f78909e = str;
        return this;
    }

    @Override // org.chromium.net.C.a
    public final b0 d(org.chromium.net.A a11, Va.a aVar) {
        Objects.requireNonNull(a11, "Invalid UploadDataProvider.");
        this.f78913i = a11;
        Objects.requireNonNull(aVar, "Invalid UploadDataProvider Executor.");
        this.f78914j = aVar;
        if (this.f78909e == null) {
            this.f78909e = "POST";
        }
        return this;
    }

    public final org.chromium.net.k e() {
        boolean z11 = this.f78911g;
        g.d dVar = this.f78915k;
        String str = this.f78909e;
        if (str == null) {
            str = "GET";
        }
        String str2 = str;
        ArrayList<Map.Entry<String, String>> arrayList = this.f78910f;
        org.chromium.net.A a11 = this.f78913i;
        Va.a aVar = this.f78914j;
        long j11 = this.f78917m;
        return this.f78905a.c(this.f78906b, this.f78907c, this.f78908d, this.f78912h, z11, dVar, j11, str2, arrayList, a11, aVar, this.f78916l);
    }

    public final b0 f(g.d dVar) {
        this.f78915k = dVar;
        return this;
    }
}
