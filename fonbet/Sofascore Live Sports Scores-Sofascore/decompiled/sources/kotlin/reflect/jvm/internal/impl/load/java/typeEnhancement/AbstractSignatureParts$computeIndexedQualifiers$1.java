package kotlin.reflect.jvm.internal.impl.load.java.typeEnhancement;

import defpackage.ph0;
import defpackage.xka;
import java.util.Map;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class AbstractSignatureParts$computeIndexedQualifiers$1 extends xka implements Function1<Integer, JavaTypeQualifiers> {
    final /* synthetic */ JavaTypeQualifiers[] $computedResult;
    final /* synthetic */ TypeEnhancementInfo $predefined;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public AbstractSignatureParts$computeIndexedQualifiers$1(TypeEnhancementInfo typeEnhancementInfo, JavaTypeQualifiers[] javaTypeQualifiersArr) {
        super(1);
        this.$predefined = typeEnhancementInfo;
        this.$computedResult = javaTypeQualifiersArr;
    }

    @NotNull
    public final JavaTypeQualifiers invoke(int i) {
        Map<Integer, JavaTypeQualifiers> map;
        JavaTypeQualifiers javaTypeQualifiers;
        TypeEnhancementInfo typeEnhancementInfo = this.$predefined;
        if (typeEnhancementInfo != null && (map = typeEnhancementInfo.getMap()) != null && (javaTypeQualifiers = map.get(Integer.valueOf(i))) != null) {
            return javaTypeQualifiers;
        }
        JavaTypeQualifiers[] javaTypeQualifiersArr = this.$computedResult;
        return (i < 0 || i > ph0.D(javaTypeQualifiersArr)) ? JavaTypeQualifiers.Companion.getNONE() : javaTypeQualifiersArr[i];
    }

    @Override // kotlin.jvm.functions.Function1
    public /* bridge */ /* synthetic */ Object invoke(Object obj) {
        return invoke(((Number) obj).intValue());
    }
}
