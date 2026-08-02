package kotlin.reflect.jvm.internal.impl.serialization.deserialization.builtins;

import defpackage.duf;
import defpackage.nt8;
import java.io.InputStream;
import kotlin.jvm.functions.Function1;
import kotlin.reflect.KDeclarationContainer;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public /* synthetic */ class BuiltInsLoaderImpl$createPackageFragmentProvider$1 extends nt8 implements Function1<String, InputStream> {
    public BuiltInsLoaderImpl$createPackageFragmentProvider$1(Object obj) {
        super(1, obj);
    }

    @Override // defpackage.nh2, kotlin.reflect.KCallable
    @NotNull
    public final String getName() {
        return "loadResource";
    }

    @Override // defpackage.nh2
    @NotNull
    public final KDeclarationContainer getOwner() {
        return duf.a.getOrCreateKotlinClass(BuiltInsResourceLoader.class);
    }

    @Override // defpackage.nh2
    @NotNull
    public final String getSignature() {
        return "loadResource(Ljava/lang/String;)Ljava/io/InputStream;";
    }

    @Override // kotlin.jvm.functions.Function1
    @Nullable
    public final InputStream invoke(@NotNull String str) {
        str.getClass();
        return ((BuiltInsResourceLoader) this.receiver).loadResource(str);
    }
}
