package com.detmir.recycli.adapters;

import B4.V;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b7\u0018\u00002\u00020\u0001:\u0002\u0004\u0005B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lcom/detmir/recycli/adapters/RecyclerAction;", "", "<init>", "()V", "a", "b", "Lcom/detmir/recycli/adapters/RecyclerAction$a;", "Lcom/detmir/recycli/adapters/RecyclerAction$b;", "recycli_release"}, k = 1, mv = {1, 8, 0}, xi = 48)
/* loaded from: classes8.dex */
public abstract class RecyclerAction {

    public static final class a extends RecyclerAction {
        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            ((a) obj).getClass();
            return true;
        }

        public final int hashCode() {
            throw null;
        }

        @NotNull
        public final String toString() {
            return "ScrollToItem(recyclerItem=null)";
        }
    }

    public static final class b extends RecyclerAction {

        /* renamed from: a, reason: collision with root package name */
        private final boolean f57700a;

        public b() {
            this(true);
        }

        public final boolean a() {
            return this.f57700a;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            return (obj instanceof b) && this.f57700a == ((b) obj).f57700a;
        }

        public final int hashCode() {
            boolean z11 = this.f57700a;
            if (z11) {
                return 1;
            }
            return z11 ? 1 : 0;
        }

        @NotNull
        public final String toString() {
            return V.d(new StringBuilder("ScrollToTop(smooth="), this.f57700a, ')');
        }

        public b(boolean z11) {
            super(null);
            this.f57700a = z11;
        }
    }

    public /* synthetic */ RecyclerAction(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    private RecyclerAction() {
    }
}
