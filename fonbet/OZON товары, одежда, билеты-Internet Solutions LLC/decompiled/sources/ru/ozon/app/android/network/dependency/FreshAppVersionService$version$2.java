package ru.ozon.app.android.network.dependency;

import T7.Z;
import kotlin.Metadata;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.AbstractC7737t;
import ru.ozon.app.android.storage.appversion.AppVersionStorage;

@Metadata(d1 = {"\u0000\b\n\u0000\n\u0002\u0010\u000e\n\u0000\u0010\u0000\u001a\u00020\u0001H\n¢\u0006\u0002\b\u0002"}, d2 = {"<anonymous>", "", "invoke"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
final class FreshAppVersionService$version$2 extends AbstractC7737t implements Function0<String> {
    final /* synthetic */ FreshAppVersionService this$0;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    FreshAppVersionService$version$2(FreshAppVersionService freshAppVersionService) {
        super(0);
        this.this$0 = freshAppVersionService;
    }

    @Override // kotlin.jvm.functions.Function0
    public final String invoke() {
        AppVersionStorage appVersionStorage;
        AppVersionStorage appVersionStorage2;
        appVersionStorage = this.this$0.appVersionStorage;
        String versionNameWithoutSuffix = appVersionStorage.getVersionNameWithoutSuffix();
        appVersionStorage2 = this.this$0.appVersionStorage;
        return Z.a(versionNameWithoutSuffix, "(", appVersionStorage2.getVersionCode(), ")");
    }
}
