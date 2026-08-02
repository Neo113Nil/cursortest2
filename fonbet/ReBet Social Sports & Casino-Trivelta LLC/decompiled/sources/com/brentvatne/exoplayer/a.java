package com.brentvatne.exoplayer;

import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* loaded from: classes.dex */
public final class a {
    private static final /* synthetic */ a[] $VALUES;

    /* renamed from: c, reason: collision with root package name */
    public static final C0465a f29489c;

    /* renamed from: d, reason: collision with root package name */
    public static final a f29490d = new a("SPEAKER", 0, "speaker", 3);

    /* renamed from: e, reason: collision with root package name */
    public static final a f29491e = new a("EARPIECE", 1, "earpiece", 0);

    /* renamed from: f, reason: collision with root package name */
    public static final /* synthetic */ EnumEntries f29492f;

    /* renamed from: a, reason: collision with root package name */
    public final String f29493a;

    /* renamed from: b, reason: collision with root package name */
    public final int f29494b;

    /* renamed from: com.brentvatne.exoplayer.a$a, reason: collision with other inner class name */
    public static final class C0465a {
        public /* synthetic */ C0465a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final a a(String name) {
            Intrinsics.checkNotNullParameter(name, "name");
            for (a aVar : a.values()) {
                if (StringsKt.equals(aVar.f29493a, name, true)) {
                    return aVar;
                }
            }
            return a.f29490d;
        }

        public C0465a() {
        }
    }

    static {
        a[] a10 = a();
        $VALUES = a10;
        f29492f = EnumEntriesKt.enumEntries(a10);
        f29489c = new C0465a(null);
    }

    public a(String str, int i10, String str2, int i11) {
        this.f29493a = str2;
        this.f29494b = i11;
    }

    public static final /* synthetic */ a[] a() {
        return new a[]{f29490d, f29491e};
    }

    public static a valueOf(String str) {
        return (a) Enum.valueOf(a.class, str);
    }

    public static a[] values() {
        return (a[]) $VALUES.clone();
    }

    public final int c() {
        return this.f29494b;
    }

    @Override // java.lang.Enum
    public String toString() {
        return a.class.getSimpleName() + "(" + this.f29493a + ", " + this.f29494b + ")";
    }
}
