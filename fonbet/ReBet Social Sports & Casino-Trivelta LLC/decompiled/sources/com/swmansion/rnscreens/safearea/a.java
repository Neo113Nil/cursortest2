package com.swmansion.rnscreens.safearea;

import com.facebook.react.bridge.ReadableMap;
import com.facebook.react.uimanager.ViewProps;
import kotlin.jvm.internal.DefaultConstructorMarker;

/* loaded from: classes4.dex */
public final class a {

    /* renamed from: e, reason: collision with root package name */
    public static final C0599a f42040e = new C0599a(null);

    /* renamed from: f, reason: collision with root package name */
    public static final a f42041f = new a(false, false, false, false);

    /* renamed from: a, reason: collision with root package name */
    public final boolean f42042a;

    /* renamed from: b, reason: collision with root package name */
    public final boolean f42043b;

    /* renamed from: c, reason: collision with root package name */
    public final boolean f42044c;

    /* renamed from: d, reason: collision with root package name */
    public final boolean f42045d;

    /* renamed from: com.swmansion.rnscreens.safearea.a$a, reason: collision with other inner class name */
    public static final class C0599a {
        public /* synthetic */ C0599a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(ReadableMap readableMap) {
            if (readableMap != null) {
                return new a(readableMap.getBoolean(ViewProps.LEFT), readableMap.getBoolean(ViewProps.TOP), readableMap.getBoolean(ViewProps.RIGHT), readableMap.getBoolean(ViewProps.BOTTOM));
            }
            return null;
        }

        public C0599a() {
        }
    }

    public a(boolean z10, boolean z11, boolean z12, boolean z13) {
        this.f42042a = z10;
        this.f42043b = z11;
        this.f42044c = z12;
        this.f42045d = z13;
    }

    public final boolean a() {
        return this.f42045d;
    }

    public final boolean b() {
        return this.f42042a;
    }

    public final boolean c() {
        return this.f42044c;
    }

    public final boolean d() {
        return this.f42043b;
    }

    public boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof a)) {
            return false;
        }
        a aVar = (a) obj;
        return this.f42042a == aVar.f42042a && this.f42043b == aVar.f42043b && this.f42044c == aVar.f42044c && this.f42045d == aVar.f42045d;
    }

    public int hashCode() {
        return (((((Boolean.hashCode(this.f42042a) * 31) + Boolean.hashCode(this.f42043b)) * 31) + Boolean.hashCode(this.f42044c)) * 31) + Boolean.hashCode(this.f42045d);
    }

    public String toString() {
        return "SafeAreaViewEdges(left=" + this.f42042a + ", top=" + this.f42043b + ", right=" + this.f42044c + ", bottom=" + this.f42045d + ")";
    }
}
