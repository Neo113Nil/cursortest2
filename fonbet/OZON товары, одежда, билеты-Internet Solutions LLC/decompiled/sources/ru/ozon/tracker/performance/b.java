package ru.ozon.tracker.performance;

import Qj0.AbstractC3880a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class b extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f97779a;

    public static final class a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f97780a;

        /* renamed from: b, reason: collision with root package name */
        private final Double f97781b;

        /* renamed from: c, reason: collision with root package name */
        private final String f97782c;

        public a(@NotNull String name, Double d11, String str) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f97780a = name;
            this.f97781b = d11;
            this.f97782c = str;
        }

        public final String a() {
            return this.f97782c;
        }

        public final Number b() {
            return this.f97781b;
        }

        @NotNull
        public final String c() {
            return this.f97780a;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public b(@NotNull ArrayList serverTimings) {
        super(0);
        Intrinsics.checkNotNullParameter(serverTimings, "serverTimings");
        this.f97779a = serverTimings;
    }

    @NotNull
    public final List<a> a() {
        return this.f97779a;
    }
}
