package ru.ozon.app.android.thirdpartylibs.config;

import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\n \u0002*\u0004\u0018\u00010\u00010\u00012\u0011\u0010\u0003\u001a\r\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "kotlin.jvm.PlatformType", "libraries", "", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrary;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Ljava/util/List;)Ljava/lang/Boolean;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ThirdPartyLibrariesConfigServiceImpl$isLibraryAvailable$isAvailableRemote$3 extends AbstractC7737t implements Function1<List<? extends ThirdPartyLibrary>, Boolean> {
    final /* synthetic */ ThirdPartyLibrary $library;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    ThirdPartyLibrariesConfigServiceImpl$isLibraryAvailable$isAvailableRemote$3(ThirdPartyLibrary thirdPartyLibrary) {
        super(1);
        this.$library = thirdPartyLibrary;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Boolean invoke(List<? extends ThirdPartyLibrary> libraries) {
        Intrinsics.checkNotNullParameter(libraries, "libraries");
        return Boolean.valueOf(libraries.contains(this.$library));
    }
}
