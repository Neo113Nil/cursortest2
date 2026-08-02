package rl0;

import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import pl0.AbstractC8941a;

/* renamed from: rl0.y, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C9313y extends AbstractC8941a {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final String f83721b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final Map<String, String> f83722c;

    public C9313y(@NotNull String eventName, @NotNull Map<String, String> eventData) {
        Intrinsics.checkNotNullParameter(eventName, "eventName");
        Intrinsics.checkNotNullParameter(eventData, "eventData");
        this.f83721b = eventName;
        this.f83722c = eventData;
    }

    @Override // pl0.AbstractC8941a
    @NotNull
    public final Map<String, String> a() {
        return this.f83722c;
    }

    @Override // pl0.AbstractC8941a
    @NotNull
    public final String b() {
        return this.f83721b;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof C9313y)) {
            return false;
        }
        C9313y c9313y = (C9313y) obj;
        return Intrinsics.d(this.f83721b, c9313y.f83721b) && Intrinsics.d(this.f83722c, c9313y.f83722c);
    }

    public final int hashCode() {
        return this.f83722c.hashCode() + (this.f83721b.hashCode() * 31);
    }

    @NotNull
    public final String toString() {
        return "AppUpdateAnalyticsEvent(eventName=" + this.f83721b + ", eventData=" + this.f83722c + ')';
    }
}
