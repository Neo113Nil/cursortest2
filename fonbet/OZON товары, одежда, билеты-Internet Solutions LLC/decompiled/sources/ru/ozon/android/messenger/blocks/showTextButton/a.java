package ru.ozon.android.messenger.blocks.showTextButton;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public interface a {

    /* renamed from: ru.ozon.android.messenger.blocks.showTextButton.a$a, reason: collision with other inner class name */
    public static final class C1530a implements a {

        /* renamed from: a, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.navigation.action.a f86379a;

        /* renamed from: b, reason: collision with root package name */
        private final ru.ozon.android.messenger.framework.core.d f86380b;

        public C1530a(ru.ozon.android.messenger.framework.navigation.action.a aVar, ru.ozon.android.messenger.framework.core.d dVar) {
            this.f86379a = aVar;
            this.f86380b = dVar;
        }

        public final ru.ozon.android.messenger.framework.navigation.action.a a() {
            return this.f86379a;
        }

        public final ru.ozon.android.messenger.framework.core.d b() {
            return this.f86380b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof C1530a)) {
                return false;
            }
            C1530a c1530a = (C1530a) obj;
            c1530a.getClass();
            return this.f86379a.equals(c1530a.f86379a) && Intrinsics.d(this.f86380b, c1530a.f86380b);
        }

        public final int hashCode() {
            int hashCode = (this.f86379a.hashCode() + (Boolean.hashCode(true) * 31)) * 31;
            ru.ozon.android.messenger.framework.core.d dVar = this.f86380b;
            return hashCode + (dVar == null ? 0 : dVar.hashCode());
        }

        @NotNull
        public final String toString() {
            return "OnAction(loading=true, action=" + this.f86379a + ", references=" + this.f86380b + ")";
        }
    }

    public static final class b implements a {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final k f86381a;

        public b(@NotNull k state) {
            Intrinsics.checkNotNullParameter(state, "state");
            this.f86381a = state;
        }

        @NotNull
        public final k a() {
            return this.f86381a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f86381a, ((b) obj).f86381a);
        }

        public final int hashCode() {
            return this.f86381a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OnDataUpdated(state=" + this.f86381a + ")";
        }
    }
}
