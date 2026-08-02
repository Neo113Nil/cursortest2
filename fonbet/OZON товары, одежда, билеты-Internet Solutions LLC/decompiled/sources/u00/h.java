package u00;

import Bl0.C2652m;
import S0.InterfaceC3967k;
import androidx.compose.ui.e;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.AbstractC7737t;
import t00.AbstractC9720b;

/* loaded from: classes3.dex */
final class h extends AbstractC7737t implements Function2<InterfaceC3967k, Integer, Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ l f99704b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ List<AbstractC9720b> f99705c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ e.a f99706d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ int f99707e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    h(l lVar, List list, e.a aVar, int i11) {
        super(2);
        this.f99704b = lVar;
        this.f99705c = list;
        this.f99706d = aVar;
        this.f99707e = i11;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Unit invoke(InterfaceC3967k interfaceC3967k, Integer num) {
        num.intValue();
        int e11 = C2652m.e(this.f99707e | 1);
        e.a aVar = this.f99706d;
        this.f99704b.v(this.f99705c, aVar, interfaceC3967k, e11);
        return Unit.f71690a;
    }
}
