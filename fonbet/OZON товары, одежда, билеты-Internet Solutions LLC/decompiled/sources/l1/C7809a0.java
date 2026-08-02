package l1;

import android.graphics.ColorFilter;
import android.graphics.PorterDuffColorFilter;
import android.os.Build;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.a0, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public class C7809a0 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ColorFilter f72262a;

    /* renamed from: l1.a0$a */
    public static final class a {
        @NotNull
        public static C7795M a(int i11, long j11) {
            return new C7795M(j11, i11, Build.VERSION.SDK_INT >= 29 ? C7796N.f72231a.a(j11, i11) : new PorterDuffColorFilter(C7811b0.i(j11), C7843t.b(i11)));
        }
    }

    public C7809a0(@NotNull ColorFilter colorFilter) {
        this.f72262a = colorFilter;
    }

    @NotNull
    public final ColorFilter a() {
        return this.f72262a;
    }
}
