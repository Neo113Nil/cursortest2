package x2;

import T7.E;
import android.graphics.drawable.Drawable;
import androidx.annotation.NonNull;
import java.util.Objects;

/* loaded from: classes8.dex */
public final class d<F, S> {

    /* renamed from: a, reason: collision with root package name */
    public final F f104935a;

    /* renamed from: b, reason: collision with root package name */
    public final S f104936b;

    public d(F f7, S s11) {
        this.f104935a = f7;
        this.f104936b = s11;
    }

    @NonNull
    public static d a(CharSequence charSequence, Drawable drawable) {
        return new d(charSequence, drawable);
    }

    public final boolean equals(Object obj) {
        if (!(obj instanceof d)) {
            return false;
        }
        d dVar = (d) obj;
        return Objects.equals(dVar.f104935a, this.f104935a) && Objects.equals(dVar.f104936b, this.f104936b);
    }

    public final int hashCode() {
        F f7 = this.f104935a;
        int hashCode = f7 == null ? 0 : f7.hashCode();
        S s11 = this.f104936b;
        return (s11 != null ? s11.hashCode() : 0) ^ hashCode;
    }

    @NonNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("Pair{");
        sb2.append(this.f104935a);
        sb2.append(" ");
        return E.c(this.f104936b, "}", sb2);
    }
}
