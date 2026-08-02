package ru.ozon.app.android.geo.addressbook.presentation;

import Ih.a;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.composer.TrackingInfoMapperKt;
import ru.ozon.app.android.geo.addressbook.data.AddressBookDTO;
import ru.ozon.app.android.geo.addressbook.presentation.AddressBookVO;

@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\t\b\u0000\u0018\u0000 \u00112*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001\u0011B\u0007¢\u0006\u0004\b\u0007\u0010\bJ!\u0010\u000b\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004*\u00020\u00022\u0006\u0010\n\u001a\u00020\tH\u0002¢\u0006\u0004\b\u000b\u0010\fJ&\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010\r\u001a\u00020\u00022\u0006\u0010\u000e\u001a\u00020\u0003H\u0096\u0002¢\u0006\u0004\b\u000f\u0010\u0010¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAnalyticsMapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;", "Ll20/d;", "", "Lru/ozon/app/android/geo/addressbook/presentation/AddressBookVO$Analytics;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "toAnalyticsVO", "(Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;Ljava/lang/String;)Ljava/util/List;", "state", "widgetInfo", "invoke", "(Lru/ozon/app/android/geo/addressbook/data/AddressBookDTO;Ll20/d;)Ljava/util/List;", "Companion", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AddressBookAnalyticsMapper implements Function2<AddressBookDTO, d, List<? extends AddressBookVO.Analytics>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/geo/addressbook/presentation/AddressBookAnalyticsMapper$Companion;", "", "<init>", "()V", "WIDGET_ID_PREFIX", "", "geo_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final List<AddressBookVO.Analytics> toAnalyticsVO(AddressBookDTO addressBookDTO, String str) {
        if (addressBookDTO instanceof AddressBookDTO.Analytics) {
            AddressBookDTO.Analytics analytics = (AddressBookDTO.Analytics) addressBookDTO;
            if (analytics.getTrackingInfo() != null) {
                long a11 = a.a("AddressBook-Analytics-", str);
                return C7714v.a0(new AddressBookVO.Analytics(a11, TrackingInfoMapperKt.mapToTokenizedEvent$default(analytics.getTrackingInfo(), Long.valueOf(a11), null, 2, null)));
            }
        }
        return K.f71697a;
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddressBookVO.Analytics> invoke(@NotNull AddressBookDTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        return toAnalyticsVO(state, widgetInfo.d());
    }
}
