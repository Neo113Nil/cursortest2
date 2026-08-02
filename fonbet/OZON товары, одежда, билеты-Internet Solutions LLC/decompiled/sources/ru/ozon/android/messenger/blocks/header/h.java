package ru.ozon.android.messenger.blocks.header;

import k1.C7456b;
import k1.C7464j;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import l1.C7807Z;
import n1.InterfaceC8410c;
import n1.InterfaceC8412e;

/* loaded from: classes10.dex */
final class h extends AbstractC7737t implements Function1<InterfaceC8410c, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f85276b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ float f85277c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ boolean f85278d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ float f85279e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ float f85280f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ float f85281g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ float f85282h;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(long j11, float f7, boolean z11, float f11, float f12, float f13, float f14) {
        super(1);
        this.f85276b = j11;
        this.f85277c = f7;
        this.f85278d = z11;
        this.f85279e = f11;
        this.f85280f = f12;
        this.f85281g = f13;
        this.f85282h = f14;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Unit invoke(InterfaceC8410c interfaceC8410c) {
        long j11;
        InterfaceC8410c drawWithContent = interfaceC8410c;
        Intrinsics.checkNotNullParameter(drawWithContent, "$this$drawWithContent");
        long i11 = drawWithContent.i();
        float f7 = this.f85277c;
        InterfaceC8412e.p0(drawWithContent, this.f85276b, 0L, i11, C7456b.a(f7, f7), null, 242);
        drawWithContent.F0();
        if (this.f85278d) {
            j11 = C7807Z.f72258l;
            float f11 = C7464j.f(drawWithContent.i());
            float f12 = this.f85280f;
            InterfaceC8412e.m1(drawWithContent, j11, this.f85279e, P9.a.a(f11 - f12, ((C7464j.d(drawWithContent.i()) - f12) - this.f85281g) - this.f85282h), 56);
        }
        return Unit.f71690a;
    }
}
