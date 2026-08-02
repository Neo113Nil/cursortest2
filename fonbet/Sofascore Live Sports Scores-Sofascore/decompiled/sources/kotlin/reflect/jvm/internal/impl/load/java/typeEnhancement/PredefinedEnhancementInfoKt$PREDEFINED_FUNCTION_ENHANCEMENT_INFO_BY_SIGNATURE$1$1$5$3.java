package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$3 extends xka implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
    final /* synthetic */ String $JLObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$3(String str) {
        super(1);
        this.$JLObject = str;
    }

    public final void invoke(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        JavaTypeQualifiers javaTypeQualifiers;
        JavaTypeQualifiers javaTypeQualifiers2;
        JavaTypeQualifiers javaTypeQualifiers3;
        functionEnhancementBuilder.getClass();
        String str = this.$JLObject;
        javaTypeQualifiers = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        String str2 = this.$JLObject;
        javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers2);
        String str3 = this.$JLObject;
        javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NULLABLE;
        functionEnhancementBuilder.returns(str3, javaTypeQualifiers3);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
        return Unit.a;
    }
}
