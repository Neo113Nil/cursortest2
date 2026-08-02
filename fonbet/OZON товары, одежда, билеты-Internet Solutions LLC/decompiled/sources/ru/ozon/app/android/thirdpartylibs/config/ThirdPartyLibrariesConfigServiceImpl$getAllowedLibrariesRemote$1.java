package ru.ozon.app.android.thirdpartylibs.config;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.K;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.app.android.thirdpartylibs.config.ThirdPartyLibrary;

@Metadata(d1 = {"\u0000\u001a\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\u0010\u0000\u001a\u0016\u0012\u0004\u0012\u00020\u0002 \u0003*\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00010\u00012\u000b\u0010\u0004\u001a\u00070\u0005¢\u0006\u0002\b\u0006H\n¢\u0006\u0004\b\u0007\u0010\b"}, d2 = {"<anonymous>", "", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrary;", "kotlin.jvm.PlatformType", "libraries", "Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigResponse;", "Lkotlin/jvm/internal/EnhancedNullability;", "invoke", "(Lru/ozon/app/android/thirdpartylibs/config/ThirdPartyLibrariesConfigResponse;)Ljava/util/List;"}, k = 3, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
final class ThirdPartyLibrariesConfigServiceImpl$getAllowedLibrariesRemote$1 extends AbstractC7737t implements Function1<ThirdPartyLibrariesConfigResponse, List<? extends ThirdPartyLibrary>> {
    public static final ThirdPartyLibrariesConfigServiceImpl$getAllowedLibrariesRemote$1 INSTANCE = new ThirdPartyLibrariesConfigServiceImpl$getAllowedLibrariesRemote$1();

    ThirdPartyLibrariesConfigServiceImpl$getAllowedLibrariesRemote$1() {
        super(1);
    }

    @Override // kotlin.jvm.functions.Function1
    public final List<ThirdPartyLibrary> invoke(ThirdPartyLibrariesConfigResponse libraries) {
        Intrinsics.checkNotNullParameter(libraries, "libraries");
        List<String> allowedSDKs = libraries.getAllowedSDKs();
        if (allowedSDKs == null) {
            allowedSDKs = K.f71697a;
        }
        ThirdPartyLibrary.Companion companion = ThirdPartyLibrary.INSTANCE;
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = allowedSDKs.iterator();
        while (it.hasNext()) {
            ThirdPartyLibrary fromString = companion.fromString((String) it.next());
            if (fromString != null) {
                arrayList.add(fromString);
            }
        }
        return arrayList;
    }
}
