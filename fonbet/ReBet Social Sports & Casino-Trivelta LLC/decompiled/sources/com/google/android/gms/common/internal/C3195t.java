package com.google.android.gms.common.internal;

import android.os.Bundle;
import com.google.android.gms.common.api.C3117a;

/* renamed from: com.google.android.gms.common.internal.t, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C3195t implements C3117a.d {

    /* renamed from: b, reason: collision with root package name */
    public static final C3195t f32753b = a().a();

    /* renamed from: a, reason: collision with root package name */
    public final String f32754a;

    /* renamed from: com.google.android.gms.common.internal.t$a */
    public static class a {

        /* renamed from: a, reason: collision with root package name */
        public String f32755a;

        public /* synthetic */ a(AbstractC3199x abstractC3199x) {
        }

        public C3195t a() {
            return new C3195t(this.f32755a, null);
        }

        public a b(String str) {
            this.f32755a = str;
            return this;
        }
    }

    public /* synthetic */ C3195t(String str, AbstractC3200y abstractC3200y) {
        this.f32754a = str;
    }

    public static a a() {
        return new a(null);
    }

    public final Bundle b() {
        Bundle bundle = new Bundle();
        String str = this.f32754a;
        if (str != null) {
            bundle.putString("api", str);
        }
        return bundle;
    }

    public final boolean equals(Object obj) {
        if (obj == this) {
            return true;
        }
        if (obj instanceof C3195t) {
            return AbstractC3189m.b(this.f32754a, ((C3195t) obj).f32754a);
        }
        return false;
    }

    public final int hashCode() {
        return AbstractC3189m.c(this.f32754a);
    }
}
