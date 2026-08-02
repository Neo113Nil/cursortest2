package l1;

import android.graphics.Path;
import l1.s0;
import org.jetbrains.annotations.NotNull;

/* renamed from: l1.H, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C7790H {

    /* renamed from: l1.H$a */
    /* loaded from: classes8.dex */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f72221a;

        static {
            int[] iArr = new int[s0.a.values().length];
            try {
                iArr[s0.a.CounterClockwise.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[s0.a.Clockwise.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f72221a = iArr;
        }
    }

    @NotNull
    public static final C7786D a() {
        return new C7786D(0);
    }

    public static final Path.Direction b(s0.a aVar) {
        int i11 = a.f72221a[aVar.ordinal()];
        if (i11 == 1) {
            return Path.Direction.CCW;
        }
        if (i11 == 2) {
            return Path.Direction.CW;
        }
        throw new Sc.o();
    }
}
