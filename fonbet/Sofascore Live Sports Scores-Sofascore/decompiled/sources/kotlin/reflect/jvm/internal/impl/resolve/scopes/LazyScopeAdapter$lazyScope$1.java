package kotlin.reflect.jvm.internal.impl.resolve.scopes;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class LazyScopeAdapter$lazyScope$1 extends xka implements Function0<MemberScope> {
    final /* synthetic */ Function0<MemberScope> $getScope;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    /* JADX WARN: Multi-variable type inference failed */
    public LazyScopeAdapter$lazyScope$1(Function0<? extends MemberScope> function0) {
        super(0);
        this.$getScope = function0;
    }

    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MemberScope invoke() {
        MemberScope memberScope = (MemberScope) this.$getScope.invoke();
        return memberScope instanceof AbstractScopeAdapter ? ((AbstractScopeAdapter) memberScope).getActualScope() : memberScope;
    }
}
