package l10;

import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.K;
import ru.ozon.composer.ui.behavior.ComposerListBehavior;

/* loaded from: classes7.dex */
public final class m extends AbstractC7737t implements Function0<Unit> {

    /* renamed from: b, reason: collision with root package name */
    final /* synthetic */ i f72467b;

    /* renamed from: c, reason: collision with root package name */
    final /* synthetic */ int[] f72468c;

    /* renamed from: d, reason: collision with root package name */
    final /* synthetic */ K f72469d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ K f72470e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(androidx.recyclerview.widget.g gVar, i iVar, int[] iArr, K k11, K k12) {
        super(0);
        this.f72467b = iVar;
        this.f72468c = iArr;
        this.f72469d = k11;
        this.f72470e = k12;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Unit invoke() {
        i iVar = this.f72467b;
        androidx.recyclerview.widget.g e02 = iVar.e0();
        int[] iArr = this.f72468c;
        e02.getLocationOnScreen(iArr);
        int i11 = iArr[1];
        K k11 = this.f72469d;
        int i12 = k11.f71785a;
        K k12 = this.f72470e;
        if (i11 != i12 || iVar.e0().getMeasuredHeight() != k12.f71785a) {
            k11.f71785a = iArr[1];
            k12.f71785a = iVar.e0().getMeasuredHeight();
            ComposerListBehavior composerListBehavior = iVar.f72430r;
            if (composerListBehavior != null) {
                composerListBehavior.x();
            }
        }
        return Unit.f71690a;
    }
}
