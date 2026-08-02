package com.ironsource;

import defpackage.lm5;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class J1 {

    @NotNull
    private final Map<String, String> a;

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public J1(Map map, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(map);
        if ((i & 1) != 0) {
            map = lm5.a;
            map.getClass();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ J1 a(J1 j1, Map map, int i, Object obj) {
        if ((i & 1) != 0) {
            map = j1.a;
        }
        return j1.a(map);
    }

    @NotNull
    public final Map<String, String> b() {
        return this.a;
    }

    public boolean equals(@Nullable Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof J1) && Intrinsics.c(this.a, ((J1) obj).a);
    }

    public int hashCode() {
        return this.a.hashCode();
    }

    @NotNull
    public String toString() {
        return "ApplicationExternalSettings(mediationTypes=" + this.a + ")";
    }

    @NotNull
    public final J1 a(@NotNull Map<String, String> map) {
        map.getClass();
        return new J1(map);
    }

    @NotNull
    public final Map<String, String> a() {
        return this.a;
    }

    public J1(@NotNull Map<String, String> map) {
        map.getClass();
        this.a = map;
    }

    public J1() {
        this(null, 1, null);
    }
}
