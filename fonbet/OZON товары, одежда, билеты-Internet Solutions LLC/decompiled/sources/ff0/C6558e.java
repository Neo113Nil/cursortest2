package ff0;

import B4.P;
import Bl0.C2652m;
import S0.InterfaceC3967k;
import jf0.AbstractC7421a;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import lf0.C7951b;
import mf0.C8140b;

/* renamed from: ff0.e, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
final class C6558e extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ AbstractC7421a f63398b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ androidx.compose.ui.e f63399c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e1.d f63400d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ P f63401e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ C8140b f63402f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ C7951b f63403g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ Function1<kf0.c, Unit> f63404h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ int f63405i;

    /* renamed from: j, reason: collision with root package name */
    final /* synthetic */ int f63406j;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    C6558e(AbstractC7421a abstractC7421a, androidx.compose.ui.e eVar, e1.d dVar, P p11, C8140b c8140b, C7951b c7951b, Function1 function1, int i11, int i12) {
        super(2);
        this.f63398b = abstractC7421a;
        this.f63399c = eVar;
        this.f63400d = dVar;
        this.f63401e = p11;
        this.f63402f = c8140b;
        this.f63403g = c7951b;
        this.f63404h = function1;
        this.f63405i = i11;
        this.f63406j = i12;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f63405i | 1);
        C8140b c8140b = this.f63402f;
        h.a(this.f63398b, this.f63399c, this.f63400d, this.f63401e, c8140b, this.f63403g, this.f63404h, interfaceC3967k, e11, this.f63406j);
        return Unit.f71690a;
    }
}
