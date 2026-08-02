package io.sentry.internal.gestures;

import android.view.View;
import io.sentry.util.p;
import java.lang.ref.WeakReference;
import java.util.Arrays;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    final WeakReference<Object> f67999a;

    /* renamed from: b, reason: collision with root package name */
    final String f68000b;

    /* renamed from: c, reason: collision with root package name */
    final String f68001c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    final String f68002d = "old_view_system";

    /* loaded from: classes.dex */
    public enum a {
        CLICKABLE,
        SCROLLABLE
    }

    public b(View view, String str, String str2) {
        this.f67999a = new WeakReference<>(view);
        this.f68000b = str;
        this.f68001c = str2;
    }

    public final String a() {
        return this.f68000b;
    }

    @NotNull
    public final String b() {
        String str = this.f68001c;
        if (str != null) {
            return str;
        }
        p.b(null, "UiElement.tag can't be null");
        return null;
    }

    @NotNull
    public final String c() {
        return this.f68002d;
    }

    public final String d() {
        return this.f68001c;
    }

    public final Object e() {
        return this.f67999a.get();
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj == null || b.class != obj.getClass()) {
            return false;
        }
        b bVar = (b) obj;
        return p.a(this.f68000b, bVar.f68000b) && p.a(this.f68001c, bVar.f68001c) && p.a(null, null);
    }

    public final int hashCode() {
        return Arrays.hashCode(new Object[]{this.f67999a, this.f68001c, null});
    }
}
