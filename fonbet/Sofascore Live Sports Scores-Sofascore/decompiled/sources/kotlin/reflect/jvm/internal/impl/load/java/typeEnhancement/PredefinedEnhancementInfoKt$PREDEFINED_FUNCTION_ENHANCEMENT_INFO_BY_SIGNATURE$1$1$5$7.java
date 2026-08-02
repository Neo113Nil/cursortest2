package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.xka;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement.SignatureEnhancementBuilder;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$7 extends xka implements Function1<SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder, Unit> {
    final /* synthetic */ String $JFFunction;
    final /* synthetic */ String $JLObject;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public PredefinedEnhancementInfoKt$PREDEFINED_FUNCTION_ENHANCEMENT_INFO_BY_SIGNATURE$1$1$5$7(String str, String str2) {
        super(1);
        this.$JLObject = str;
        this.$JFFunction = str2;
    }

    public final void invoke(@NotNull SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder functionEnhancementBuilder) {
        JavaTypeQualifiers javaTypeQualifiers;
        JavaTypeQualifiers javaTypeQualifiers2;
        JavaTypeQualifiers javaTypeQualifiers3;
        JavaTypeQualifiers javaTypeQualifiers4;
        JavaTypeQualifiers javaTypeQualifiers5;
        functionEnhancementBuilder.getClass();
        String str = this.$JLObject;
        javaTypeQualifiers = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        functionEnhancementBuilder.parameter(str, javaTypeQualifiers);
        String str2 = this.$JFFunction;
        javaTypeQualifiers2 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        javaTypeQualifiers3 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        javaTypeQualifiers4 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        functionEnhancementBuilder.parameter(str2, javaTypeQualifiers2, javaTypeQualifiers3, javaTypeQualifiers4);
        String str3 = this.$JLObject;
        javaTypeQualifiers5 = PredefinedEnhancementInfoKt.NOT_PLATFORM;
        functionEnhancementBuilder.returns(str3, javaTypeQualifiers5);
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        invoke((SignatureEnhancementBuilder.ClassEnhancementBuilder.FunctionEnhancementBuilder) obj);
        return Unit.a;
    }
}
