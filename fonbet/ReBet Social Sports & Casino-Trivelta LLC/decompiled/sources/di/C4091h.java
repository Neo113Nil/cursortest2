package di;

import Zh.InterfaceC1901b;
import ai.AbstractC2028a;
import kotlin.jvm.internal.BooleanCompanionObject;
import kotlin.jvm.internal.Intrinsics;

/* renamed from: di.h, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4091h extends P0 implements InterfaceC1901b {

    /* renamed from: c, reason: collision with root package name */
    public static final C4091h f45367c = new C4091h();

    public C4091h() {
        super(AbstractC2028a.z(BooleanCompanionObject.INSTANCE));
    }

    @Override // di.P0
    /* renamed from: A, reason: merged with bridge method [inline-methods] */
    public void v(ci.d encoder, boolean[] content, int i10) {
        Intrinsics.checkNotNullParameter(encoder, "encoder");
        Intrinsics.checkNotNullParameter(content, "content");
        for (int i11 = 0; i11 < i10; i11++) {
            encoder.F(getDescriptor(), i11, content[i11]);
        }
    }

    @Override // di.AbstractC4077a
    /* renamed from: w, reason: merged with bridge method [inline-methods] */
    public int f(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return zArr.length;
    }

    @Override // di.P0
    /* renamed from: x, reason: merged with bridge method [inline-methods] */
    public boolean[] s() {
        return new boolean[0];
    }

    @Override // di.AbstractC4120w, di.AbstractC4077a
    /* renamed from: y, reason: merged with bridge method [inline-methods] */
    public void i(ci.c decoder, int i10, C4089g builder, boolean z10) {
        Intrinsics.checkNotNullParameter(decoder, "decoder");
        Intrinsics.checkNotNullParameter(builder, "builder");
        builder.e(decoder.t(getDescriptor(), i10));
    }

    @Override // di.AbstractC4077a
    /* renamed from: z, reason: merged with bridge method [inline-methods] */
    public C4089g l(boolean[] zArr) {
        Intrinsics.checkNotNullParameter(zArr, "<this>");
        return new C4089g(zArr);
    }
}
