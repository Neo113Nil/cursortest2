package pa;

import com.vk.id.internal.auth.pkce.PkceGeneratorSHA256;
import com.vk.id.internal.di.VKIDDepsProd;
import kotlin.jvm.functions.Function0;

/* loaded from: classes9.dex */
public final /* synthetic */ class b implements Function0 {
    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        PkceGeneratorSHA256 pkceGenerator$lambda$28;
        pkceGenerator$lambda$28 = VKIDDepsProd.pkceGenerator$lambda$28();
        return pkceGenerator$lambda$28;
    }
}
