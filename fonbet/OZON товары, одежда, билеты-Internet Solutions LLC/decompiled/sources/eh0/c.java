package eh0;

import fh0.C6568c;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes3.dex */
public interface c {

    public static final class a implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C6568c f62341a;

        public a(@NotNull C6568c model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.f62341a = model;
        }

        @Override // eh0.c
        @NotNull
        public final c a(c cVar) {
            return cVar != null ? new a(cVar.getModel()) : this;
        }

        @Override // eh0.c
        @NotNull
        public final C6568c getModel() {
            return this.f62341a;
        }
    }

    public static final class b implements c {

        /* renamed from: a, reason: collision with root package name */
        @NotNull
        private final C6568c f62342a;

        public b(@NotNull C6568c model) {
            Intrinsics.checkNotNullParameter(model, "model");
            this.f62342a = model;
        }

        @Override // eh0.c
        @NotNull
        public final c a(c cVar) {
            return cVar == null ? this : cVar;
        }

        @Override // eh0.c
        @NotNull
        public final C6568c getModel() {
            return this.f62342a;
        }
    }

    @NotNull
    c a(c cVar);

    @NotNull
    C6568c getModel();
}
