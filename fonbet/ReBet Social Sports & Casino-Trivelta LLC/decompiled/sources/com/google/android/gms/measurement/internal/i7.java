package com.google.android.gms.measurement.internal;

import android.net.Uri;
import android.os.Bundle;
import android.text.TextUtils;
import android.util.Pair;

/* loaded from: classes2.dex */
public final class i7 {

    /* renamed from: a, reason: collision with root package name */
    public final C3298l3 f34055a;

    public i7(C3298l3 c3298l3) {
        this.f34055a = c3298l3;
    }

    public final void a() {
        C3298l3 c3298l3 = this.f34055a;
        c3298l3.b().h();
        if (e()) {
            if (d()) {
                c3298l3.x().f33534x.b(null);
                Bundle bundle = new Bundle();
                bundle.putString("source", "(not set)");
                bundle.putString("medium", "(not set)");
                bundle.putString("_cis", "intent");
                bundle.putLong("_cc", 1L);
                c3298l3.B().t("auto", "_cmpx", bundle);
            } else {
                String a10 = c3298l3.x().f33534x.a();
                if (TextUtils.isEmpty(a10)) {
                    c3298l3.a().p().a("Cache still valid but referrer not found");
                } else {
                    long a11 = c3298l3.x().f33535y.a() / 3600000;
                    Uri parse = Uri.parse(a10);
                    Bundle bundle2 = new Bundle();
                    Pair pair = new Pair(parse.getPath(), bundle2);
                    for (String str : parse.getQueryParameterNames()) {
                        bundle2.putString(str, parse.getQueryParameter(str));
                    }
                    ((Bundle) pair.second).putLong("_cc", (a11 - 1) * 3600000);
                    Object obj = pair.first;
                    c3298l3.B().t(obj == null ? "app" : (String) obj, "_cmp", (Bundle) pair.second);
                }
                c3298l3.x().f33534x.b(null);
            }
            c3298l3.x().f33535y.b(0L);
        }
    }

    public final void b(String str, Bundle bundle) {
        String uri;
        C3298l3 c3298l3 = this.f34055a;
        c3298l3.b().h();
        if (c3298l3.g()) {
            return;
        }
        if (bundle.isEmpty()) {
            uri = null;
        } else {
            if (true == str.isEmpty()) {
                str = "auto";
            }
            Uri.Builder builder = new Uri.Builder();
            builder.path(str);
            for (String str2 : bundle.keySet()) {
                builder.appendQueryParameter(str2, bundle.getString(str2));
            }
            uri = builder.build().toString();
        }
        if (TextUtils.isEmpty(uri)) {
            return;
        }
        c3298l3.x().f33534x.b(uri);
        c3298l3.x().f33535y.b(c3298l3.e().a());
    }

    public final void c() {
        if (e() && d()) {
            this.f34055a.x().f33534x.b(null);
        }
    }

    public final boolean d() {
        if (!e()) {
            return false;
        }
        C3298l3 c3298l3 = this.f34055a;
        return c3298l3.e().a() - c3298l3.x().f33535y.a() > c3298l3.w().D(null, AbstractC3209a2.f33883k0);
    }

    public final boolean e() {
        return this.f34055a.x().f33535y.a() > 0;
    }
}
