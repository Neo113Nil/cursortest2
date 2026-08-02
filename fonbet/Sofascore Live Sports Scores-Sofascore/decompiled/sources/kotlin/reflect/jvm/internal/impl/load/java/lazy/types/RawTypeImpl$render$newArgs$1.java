package kotlin.reflect.jvm.internal.impl.load.java.lazy.types;

import com.appsflyer.internal.i;
import defpackage.xka;
import kotlin.jvm.functions.Function1;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class RawTypeImpl$render$newArgs$1 extends xka implements Function1<String, CharSequence> {
    public static final RawTypeImpl$render$newArgs$1 INSTANCE = new RawTypeImpl$render$newArgs$1();

    public RawTypeImpl$render$newArgs$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    @NotNull
    public final CharSequence invoke(@NotNull String str) {
        return i.h(str, "(raw) ", str);
    }
}
