package ah;

import ch.AbstractC2921A;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: ah.m, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C2021m extends AbstractC2921A implements InterfaceC2019k {
    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C2021m(Map values) {
        super(true, values);
        Intrinsics.checkNotNullParameter(values, "values");
    }

    public String toString() {
        return "Headers " + a();
    }
}
