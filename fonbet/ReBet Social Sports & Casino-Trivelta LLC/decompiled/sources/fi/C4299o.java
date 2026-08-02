package fi;

import kotlin.jvm.internal.Intrinsics;

/* renamed from: fi.o, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4299o extends C4298n {

    /* renamed from: c, reason: collision with root package name */
    public final boolean f46780c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C4299o(InterfaceC4306w writer, boolean z10) {
        super(writer);
        Intrinsics.checkNotNullParameter(writer, "writer");
        this.f46780c = z10;
    }

    @Override // fi.C4298n
    public void n(String value) {
        Intrinsics.checkNotNullParameter(value, "value");
        if (this.f46780c) {
            super.n(value);
        } else {
            super.k(value);
        }
    }
}
