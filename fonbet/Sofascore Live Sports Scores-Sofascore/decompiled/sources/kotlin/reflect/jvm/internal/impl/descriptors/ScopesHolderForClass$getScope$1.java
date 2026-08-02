package kotlin.reflect.jvm.internal.impl.descriptors;

import defpackage.xka;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.resolve.scopes.MemberScope;
import kotlin.reflect.jvm.internal.impl.types.checker.KotlinTypeRefiner;
import org.jetbrains.annotations.NotNull;

/* JADX INFO: Add missing generic type declarations: [T] */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class ScopesHolderForClass$getScope$1<T> extends xka implements Function0<T> {
    final /* synthetic */ KotlinTypeRefiner $kotlinTypeRefiner;
    final /* synthetic */ ScopesHolderForClass<T> this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public ScopesHolderForClass$getScope$1(ScopesHolderForClass<T> scopesHolderForClass, KotlinTypeRefiner kotlinTypeRefiner) {
        super(0);
        this.this$0 = scopesHolderForClass;
        this.$kotlinTypeRefiner = kotlinTypeRefiner;
    }

    /* JADX WARN: Incorrect return type in method signature: ()TT; */
    @Override // kotlin.jvm.functions.Function0
    @NotNull
    public final MemberScope invoke() {
        Function1 function1;
        function1 = ((ScopesHolderForClass) this.this$0).scopeFactory;
        return (MemberScope) function1.invoke(this.$kotlinTypeRefiner);
    }
}
