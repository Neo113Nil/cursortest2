package x0;

import org.jetbrains.annotations.NotNull;

/* renamed from: x0.z, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final class C10621z {
    public static final int a(int i11, Object obj, @NotNull InterfaceC10620y interfaceC10620y) {
        int b11;
        return (obj == null || interfaceC10620y.getItemCount() == 0 || (i11 < interfaceC10620y.getItemCount() && obj.equals(interfaceC10620y.d(i11))) || (b11 = interfaceC10620y.b(obj)) == -1) ? i11 : b11;
    }
}
