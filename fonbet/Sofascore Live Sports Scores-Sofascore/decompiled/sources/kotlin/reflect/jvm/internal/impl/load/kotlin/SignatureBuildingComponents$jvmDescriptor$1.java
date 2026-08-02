package kotlin.reflect.jvm.internal.impl.load.kotlin;

import defpackage.xka;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class SignatureBuildingComponents$jvmDescriptor$1 extends xka implements Function1<String, CharSequence> {
    public static final SignatureBuildingComponents$jvmDescriptor$1 INSTANCE = new SignatureBuildingComponents$jvmDescriptor$1();

    public SignatureBuildingComponents$jvmDescriptor$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull String str) {
        String escapeClassName;
        str.getClass();
        escapeClassName = SignatureBuildingComponents.INSTANCE.escapeClassName(str);
        return escapeClassName;
    }
}
