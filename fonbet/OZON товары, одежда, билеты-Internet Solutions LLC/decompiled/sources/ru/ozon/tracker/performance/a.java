package ru.ozon.tracker.performance;

import Qj0.AbstractC3880a;
import java.util.ArrayList;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes7.dex */
public final class a extends AbstractC3880a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ArrayList f97776a;

    /* renamed from: ru.ozon.tracker.performance.a$a, reason: collision with other inner class name */
    public static final class C2147a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f97777a;

        /* renamed from: b, reason: collision with root package name */
        private final float f97778b;

        public C2147a(@NotNull String name, float f7) {
            Intrinsics.checkNotNullParameter(name, "name");
            this.f97777a = name;
            this.f97778b = f7;
        }

        @NotNull
        public final String a() {
            return this.f97777a;
        }

        public final float b() {
            return this.f97778b;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public a(@NotNull ArrayList launchSteps) {
        super(0);
        Intrinsics.checkNotNullParameter(launchSteps, "launchSteps");
        this.f97776a = launchSteps;
    }

    @NotNull
    public final List<C2147a> a() {
        return this.f97776a;
    }
}
