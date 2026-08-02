package ru.ozon.android.messenger.framework.presentation.common.screen;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public abstract class m {

    public static final class a extends m {

        /* renamed from: a, reason: collision with root package name */
        private final Integer f91134a;

        public a(Integer num) {
            this.f91134a = num;
        }

        public final Integer a() {
            return this.f91134a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f91134a, ((a) obj).f91134a);
        }

        public final int hashCode() {
            Integer num = this.f91134a;
            if (num == null) {
                return 0;
            }
            return num.hashCode();
        }

        @NotNull
        public final String toString() {
            return "Overlay(bgColor=" + this.f91134a + ")";
        }

        public a() {
            this(null);
        }
    }
}
