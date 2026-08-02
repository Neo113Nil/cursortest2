package l10;

import java.util.ArrayList;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;

/* loaded from: classes7.dex */
final class n extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ boolean f72471b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ i f72472c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ ArrayList f72473d;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    n(boolean z11, i iVar, ArrayList arrayList) {
        super(0);
        this.f72471b = z11;
        this.f72472c = iVar;
        this.f72473d = arrayList;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        C10.a aVar;
        if (this.f72471b) {
            i iVar = this.f72472c;
            boolean s11 = iVar.f72417f.s();
            ArrayList arrayList = this.f72473d;
            if (s11) {
                aVar = iVar.f72399S;
                aVar.a(arrayList);
            } else {
                i.d(iVar, arrayList);
            }
        }
        return Unit.f71690a;
    }
}
