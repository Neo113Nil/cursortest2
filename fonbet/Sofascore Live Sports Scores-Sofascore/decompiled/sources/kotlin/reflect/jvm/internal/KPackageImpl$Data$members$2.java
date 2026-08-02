package kotlin.reflect.jvm.internal;

import defpackage.xka;
import java.util.Collection;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.reflect.jvm.internal.KDeclarationContainerImpl;
import kotlin.reflect.jvm.internal.KPackageImpl;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\u000e\n\u0000\n\u0002\u0010\u001e\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u001e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002 \u0003*\u000e\u0012\b\u0012\u0006\u0012\u0002\b\u00030\u0002\u0018\u00010\u00010\u0001H\n¢\u0006\u0002\b\u0004"}, d2 = {"<anonymous>", "", "Lkotlin/reflect/jvm/internal/KCallableImpl;", "kotlin.jvm.PlatformType", "invoke"}, k = 3, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KPackageImpl$Data$members$2 extends xka implements Function0<Collection<? extends KCallableImpl<?>>> {
    final /* synthetic */ KPackageImpl this$0;
    final /* synthetic */ KPackageImpl.Data this$1;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public KPackageImpl$Data$members$2(KPackageImpl kPackageImpl, KPackageImpl.Data data) {
        super(0);
        this.this$0 = kPackageImpl;
        this.this$1 = data;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Collection<KCallableImpl<?>> invoke() {
        return this.this$0.getMembers(this.this$1.getScope(), KDeclarationContainerImpl.MemberBelonginess.DECLARED);
    }
}
