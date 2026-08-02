package t00;

import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import t00.AbstractC9720b;

/* renamed from: t00.a, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public abstract class AbstractC9719a {

    /* renamed from: a, reason: collision with root package name */
    private final AbstractC9720b.d f98945a;

    /* renamed from: t00.a$a, reason: collision with other inner class name */
    public static final class C2173a extends AbstractC9719a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        public static final C2173a f98946b = new C2173a(null);
    }

    /* renamed from: t00.a$b */
    public static final class b extends AbstractC9719a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractC9720b.d f98947b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(@NotNull AbstractC9720b.d itemToChange) {
            super(itemToChange);
            Intrinsics.checkNotNullParameter(itemToChange, "itemToChange");
            this.f98947b = itemToChange;
        }

        @Override // t00.AbstractC9719a
        public final AbstractC9720b a() {
            return this.f98947b;
        }

        @NotNull
        public final AbstractC9720b.d b() {
            return this.f98947b;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && Intrinsics.d(this.f98947b, ((b) obj).f98947b);
        }

        public final int hashCode() {
            return this.f98947b.hashCode();
        }

        @NotNull
        public final String toString() {
            return "ResetDebugMenuStringItemToDefault(itemToChange=" + this.f98947b + ")";
        }
    }

    /* renamed from: t00.a$c */
    public static final class c extends AbstractC9719a {

        /* renamed from: b, reason: collision with root package name */
        @NotNull
        private final AbstractC9720b.d f98948b;

        /* renamed from: c, reason: collision with root package name */
        @NotNull
        private final String f98949c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public c(@NotNull AbstractC9720b.d itemToChange, @NotNull String valueToSubmit) {
            super(itemToChange);
            Intrinsics.checkNotNullParameter(itemToChange, "itemToChange");
            Intrinsics.checkNotNullParameter(valueToSubmit, "valueToSubmit");
            this.f98948b = itemToChange;
            this.f98949c = valueToSubmit;
        }

        @Override // t00.AbstractC9719a
        public final AbstractC9720b a() {
            return this.f98948b;
        }

        @NotNull
        public final AbstractC9720b.d b() {
            return this.f98948b;
        }

        @NotNull
        public final String c() {
            return this.f98949c;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return Intrinsics.d(this.f98948b, cVar.f98948b) && Intrinsics.d(this.f98949c, cVar.f98949c);
        }

        public final int hashCode() {
            return this.f98949c.hashCode() + (this.f98948b.hashCode() * 31);
        }

        @NotNull
        public final String toString() {
            return "ShowAlertDialogForComposerDebugTokenConfirmation(itemToChange=" + this.f98948b + ", valueToSubmit=" + this.f98949c + ")";
        }
    }

    public AbstractC9719a(AbstractC9720b.d dVar) {
        this.f98945a = dVar;
    }

    public AbstractC9720b a() {
        return this.f98945a;
    }
}
