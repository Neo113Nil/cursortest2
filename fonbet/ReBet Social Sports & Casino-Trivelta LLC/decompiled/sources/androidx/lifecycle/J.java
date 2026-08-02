package androidx.lifecycle;

import android.os.Bundle;
import androidx.savedstate.a;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes.dex */
public final class J {

    /* renamed from: c, reason: collision with root package name */
    public static final a f20259c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Map f20260a;

    /* renamed from: b, reason: collision with root package name */
    public V0.b f20261b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final J a(Bundle bundle, Bundle bundle2) {
            if (bundle == null) {
                bundle = bundle2;
            }
            if (bundle == null) {
                return new J();
            }
            ClassLoader classLoader = J.class.getClassLoader();
            Intrinsics.checkNotNull(classLoader);
            bundle.setClassLoader(classLoader);
            return new J(B2.b.g(B2.b.a(bundle)));
        }

        public a() {
        }
    }

    public J(Map initialState) {
        Intrinsics.checkNotNullParameter(initialState, "initialState");
        this.f20260a = new LinkedHashMap();
        this.f20261b = new V0.b(initialState);
    }

    public final Object a(String key) {
        Intrinsics.checkNotNullParameter(key, "key");
        return this.f20261b.b(key);
    }

    public final a.b b() {
        return this.f20261b.c();
    }

    public J() {
        this.f20260a = new LinkedHashMap();
        this.f20261b = new V0.b(null, 1, null);
    }
}
