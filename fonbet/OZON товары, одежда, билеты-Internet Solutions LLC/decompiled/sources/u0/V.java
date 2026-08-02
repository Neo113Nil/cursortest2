package u0;

import ed.InterfaceC6346b;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@InterfaceC6346b
/* loaded from: classes8.dex */
public final class V {

    /* renamed from: a, reason: collision with root package name */
    private static final int f99644a = 9;

    /* renamed from: b, reason: collision with root package name */
    private static final int f99645b = 6;

    /* renamed from: c, reason: collision with root package name */
    private static final int f99646c = 10;

    /* renamed from: d, reason: collision with root package name */
    private static final int f99647d = 5;

    @NotNull
    public static String a() {
        StringBuilder sb2 = new StringBuilder("WindowInsetsSides(");
        StringBuilder sb3 = new StringBuilder();
        int i11 = f99644a;
        if ((32 & i11) == i11) {
            b("Start", sb3);
        }
        int i12 = f99646c;
        if ((32 & i12) == i12) {
            b("Left", sb3);
        }
        int i13 = f99645b;
        if ((32 & i13) == i13) {
            b("End", sb3);
        }
        int i14 = f99647d;
        if ((32 & i14) == i14) {
            b("Right", sb3);
        }
        b("Bottom", sb3);
        String sb4 = sb3.toString();
        Intrinsics.checkNotNullExpressionValue(sb4, "StringBuilder().apply(builderAction).toString()");
        sb2.append(sb4);
        sb2.append(')');
        return sb2.toString();
    }

    private static final void b(String str, StringBuilder sb2) {
        if (sb2.length() > 0) {
            sb2.append('+');
        }
        sb2.append(str);
    }
}
