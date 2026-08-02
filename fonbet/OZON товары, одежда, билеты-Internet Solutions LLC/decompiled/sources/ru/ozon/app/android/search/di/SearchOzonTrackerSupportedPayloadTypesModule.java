package ru.ozon.app.android.search.di;

import YZ.a;
import java.util.Set;
import kotlin.Metadata;
import kotlin.collections.e0;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.tracker.sendEvent.ActionType;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\b\u0007\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0019\u0010\t\u001a\f\u0012\b\u0012\u00060\u0005j\u0002`\u00060\u0004H\u0001¢\u0006\u0004\b\u0007\u0010\b¨\u0006\n"}, d2 = {"Lru/ozon/app/android/search/di/SearchOzonTrackerSupportedPayloadTypesModule;", "", "<init>", "()V", "", "LYZ/a;", "Lru/ozon/app/android/analytics/modules/tokenized/payloadprocessing/base/PayloadType;", "provideSupportedPayloadTypes$search_prodGoogleAllVendorsRelease", "()Ljava/util/Set;", "provideSupportedPayloadTypes", "search_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class SearchOzonTrackerSupportedPayloadTypesModule {
    @NotNull
    public final Set<a> provideSupportedPayloadTypes$search_prodGoogleAllVendorsRelease() {
        String type = ActionType.SUBSCRIBE_PRICE.INSTANCE.getType();
        Intrinsics.checkNotNullParameter(type, "type");
        a a11 = a.a(type);
        String type2 = ActionType.UNSUBSCRIBE_PRICE.INSTANCE.getType();
        Intrinsics.checkNotNullParameter(type2, "type");
        a a12 = a.a(type2);
        String type3 = ActionType.FAVORITE.INSTANCE.getType();
        Intrinsics.checkNotNullParameter(type3, "type");
        a a13 = a.a(type3);
        String type4 = ActionType.SEARCH.INSTANCE.getType();
        Intrinsics.checkNotNullParameter(type4, "type");
        return e0.a(a11, a12, a13, a.a(type4));
    }
}
