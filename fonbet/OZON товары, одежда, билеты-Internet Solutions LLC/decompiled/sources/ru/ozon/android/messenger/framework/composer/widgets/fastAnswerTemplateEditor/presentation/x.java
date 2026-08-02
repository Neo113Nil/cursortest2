package ru.ozon.android.messenger.framework.composer.widgets.fastAnswerTemplateEditor.presentation;

import C.o0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.composer.action.b;
import ru.ozon.uni.atoms.af.AtomAction;

/* loaded from: classes10.dex */
public interface x {

    public static final class a implements x {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final y f86929a;

        public a(@NotNull y inputData) {
            Intrinsics.checkNotNullParameter(inputData, "inputData");
            this.f86929a = inputData;
        }

        @NotNull
        public final y a() {
            return this.f86929a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof a) && Intrinsics.d(this.f86929a, ((a) obj).f86929a);
        }

        public final int hashCode() {
            return this.f86929a.hashCode();
        }

        @NotNull
        public final String toString() {
            return "OnInputDataUpdated(inputData=" + this.f86929a + ")";
        }
    }

    public static final class b implements x {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f86930a;

        /* renamed from: b, reason: collision with root package name */
        private final AtomAction f86931b;

        /* renamed from: c, reason: collision with root package name */
        private final b.a f86932c;

        public /* synthetic */ b() {
            this(false, null, null);
        }

        public final Tg.b a() {
            return this.f86931b;
        }

        public final b.a b() {
            return this.f86932c;
        }

        public final boolean c() {
            return this.f86930a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof b)) {
                return false;
            }
            b bVar = (b) obj;
            return this.f86930a == bVar.f86930a && Intrinsics.d(this.f86931b, bVar.f86931b) && Intrinsics.d(this.f86932c, bVar.f86932c);
        }

        public final int hashCode() {
            int hashCode = Boolean.hashCode(this.f86930a) * 31;
            AtomAction atomAction = this.f86931b;
            int hashCode2 = (hashCode + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            b.a aVar = this.f86932c;
            return hashCode2 + (aVar != null ? aVar.hashCode() : 0);
        }

        @NotNull
        public final String toString() {
            return "OnInputSubmit(loading=" + this.f86930a + ", action=" + this.f86931b + ", ah=" + this.f86932c + ")";
        }

        public b(boolean z11, AtomAction atomAction, b.a aVar) {
            this.f86930a = z11;
            this.f86931b = atomAction;
            this.f86932c = aVar;
        }
    }

    public static final class c implements x {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final String f86933a;

        public c(@NotNull String text) {
            Intrinsics.checkNotNullParameter(text, "text");
            this.f86933a = text;
        }

        @NotNull
        public final String a() {
            return this.f86933a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof c) && Intrinsics.d(this.f86933a, ((c) obj).f86933a);
        }

        public final int hashCode() {
            return this.f86933a.hashCode();
        }

        @NotNull
        public final String toString() {
            return o0.c(new StringBuilder("OnInputValueChanged(text="), this.f86933a, ")");
        }
    }
}
