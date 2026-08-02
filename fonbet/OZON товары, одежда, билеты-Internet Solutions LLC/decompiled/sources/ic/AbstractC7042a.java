package ic;

import Hf.u;
import Ub.d;
import android.view.LayoutInflater;
import android.view.ViewGroup;
import androidx.annotation.NonNull;
import androidx.recyclerview.widget.RecyclerView;
import ic.C7043b;
import jc.C7335b;

/* renamed from: ic.a, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public abstract class AbstractC7042a extends RecyclerView.g<c> {

    /* renamed from: ic.a$a, reason: collision with other inner class name */
    public interface InterfaceC1089a {
        @NonNull
        InterfaceC1089a a(@NonNull C7335b c7335b);

        @NonNull
        AbstractC7042a build();
    }

    /* renamed from: ic.a$b */
    public static abstract class b<N extends u, H extends c> {
        public abstract void a(@NonNull d dVar, @NonNull H h11, @NonNull N n11);

        public void b() {
        }

        @NonNull
        public abstract H c(@NonNull LayoutInflater layoutInflater, @NonNull ViewGroup viewGroup);
    }

    /* renamed from: ic.a$c */
    public static class c extends RecyclerView.C {
    }

    @NonNull
    public static InterfaceC1089a f(int i11) {
        return new C7043b.a(new C7044c(i11));
    }

    public abstract void g(@NonNull d dVar, @NonNull String str);
}
