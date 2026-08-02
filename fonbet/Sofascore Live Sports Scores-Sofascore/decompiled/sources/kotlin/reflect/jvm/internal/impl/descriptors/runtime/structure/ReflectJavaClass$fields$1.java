package kotlin.reflect.jvm.internal.impl.descriptors.runtime.structure;

import defpackage.duf;
import defpackage.nt8;
import java.lang.reflect.Member;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class ReflectJavaClass$fields$1 extends nt8 implements Function1<Member, Boolean> {
    public static final ReflectJavaClass$fields$1 INSTANCE = new ReflectJavaClass$fields$1();

    public ReflectJavaClass$fields$1() {
        super(1);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "isSynthetic";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(Member.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "isSynthetic()Z";
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final Boolean invoke(@NotNull Member member) {
        member.getClass();
        return Boolean.valueOf(member.isSynthetic());
    }
}
