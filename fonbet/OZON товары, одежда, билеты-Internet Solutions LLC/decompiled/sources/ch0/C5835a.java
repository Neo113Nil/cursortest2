package ch0;

import G.g;
import Xc.b;
import java.util.Date;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: ch0.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C5835a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final EnumC0868a f57184a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f57185b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final Date f57186c;

    /* renamed from: d, reason: collision with root package name */
    private final Date f57187d;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* renamed from: ch0.a$a, reason: collision with other inner class name */
    public static final class EnumC0868a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ EnumC0868a[] $VALUES;
        public static final EnumC0868a END;
        public static final EnumC0868a UPDATE;

        static {
            EnumC0868a enumC0868a = new EnumC0868a("UPDATE", 0);
            UPDATE = enumC0868a;
            EnumC0868a enumC0868a2 = new EnumC0868a("END", 1);
            END = enumC0868a2;
            EnumC0868a[] enumC0868aArr = {enumC0868a, enumC0868a2};
            $VALUES = enumC0868aArr;
            $ENTRIES = b.a(enumC0868aArr);
        }

        private EnumC0868a() {
            throw null;
        }

        public static EnumC0868a valueOf(String str) {
            return (EnumC0868a) Enum.valueOf(EnumC0868a.class, str);
        }

        public static EnumC0868a[] values() {
            return (EnumC0868a[]) $VALUES.clone();
        }
    }

    public C5835a(@NotNull EnumC0868a event, @NotNull String contentState, @NotNull Date timestamp, Date date) {
        Intrinsics.checkNotNullParameter(event, "event");
        Intrinsics.checkNotNullParameter(contentState, "contentState");
        Intrinsics.checkNotNullParameter(timestamp, "timestamp");
        this.f57184a = event;
        this.f57185b = contentState;
        this.f57186c = timestamp;
        this.f57187d = date;
    }

    @NotNull
    public final String a() {
        return this.f57185b;
    }

    public final Date b() {
        return this.f57187d;
    }

    @NotNull
    public final EnumC0868a c() {
        return this.f57184a;
    }

    @NotNull
    public final Date d() {
        return this.f57186c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!C5835a.class.equals(obj != null ? obj.getClass() : null)) {
            return false;
        }
        Intrinsics.g(obj, "null cannot be cast to non-null type ru.ozon.push.sdk.external.liveactivity.model.LiveActivityUpdate");
        C5835a c5835a = (C5835a) obj;
        if (this.f57184a == c5835a.f57184a && Intrinsics.d(this.f57185b, c5835a.f57185b) && Intrinsics.d(this.f57186c, c5835a.f57186c)) {
            return Intrinsics.d(this.f57187d, c5835a.f57187d);
        }
        return false;
    }

    public final int hashCode() {
        int hashCode = (this.f57186c.hashCode() + g.a(this.f57184a.hashCode() * 31, 31, this.f57185b)) * 31;
        Date date = this.f57187d;
        return hashCode + (date != null ? date.hashCode() : 0);
    }
}
