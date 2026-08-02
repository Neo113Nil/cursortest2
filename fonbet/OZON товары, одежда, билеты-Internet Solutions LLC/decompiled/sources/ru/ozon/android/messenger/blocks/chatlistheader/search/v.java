package ru.ozon.android.messenger.blocks.chatlistheader.search;

import B0.C2475h;
import B0.M0;
import B0.N0;
import K1.T;
import Q1.K;
import S0.InterfaceC3967k;
import a1.C4912a;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import l1.K0;
import ru.ozon.uni.atoms.data.text.TextDTO;

/* loaded from: classes10.dex */
final class v extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ long f84855b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ K f84856c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ Function1<K, Unit> f84857d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f84858e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ boolean f84859f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ T f84860g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ TextDTO f84861h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ Function0<Unit> f84862i;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    v(long j11, K k11, Function1<? super K, Unit> function1, androidx.compose.ui.e eVar, boolean z11, T t2, TextDTO textDTO, Function0<Unit> function0) {
        super(2);
        this.f84855b = j11;
        this.f84856c = k11;
        this.f84857d = function1;
        this.f84858e = eVar;
        this.f84859f = z11;
        this.f84860g = t2;
        this.f84861h = textDTO;
        this.f84862i = function0;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        InterfaceC3967k interfaceC3967k2 = interfaceC3967k;
        if ((num.intValue() & 3) == 2 && interfaceC3967k2.b()) {
            interfaceC3967k2.j();
        } else {
            K0 k02 = new K0(this.f84855b);
            N0 n02 = new N0(0, 1, 113);
            M0 m02 = new M0(null, 62);
            TextDTO textDTO = this.f84861h;
            Function0<Unit> function0 = this.f84862i;
            K k11 = this.f84856c;
            C4912a c11 = a1.c.c(1070430924, new u(k11, textDTO, function0), interfaceC3967k2);
            C2475h.c(k11, this.f84857d, this.f84858e, this.f84859f, false, this.f84860g, n02, m02, true, 0, 0, null, null, null, k02, c11, interfaceC3967k2, 100663296, 196608, 15888);
        }
        return Unit.f71690a;
    }
}
