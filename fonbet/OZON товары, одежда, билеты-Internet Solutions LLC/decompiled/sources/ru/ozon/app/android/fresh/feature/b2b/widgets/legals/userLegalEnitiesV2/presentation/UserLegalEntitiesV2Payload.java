package ru.ozon.app.android.fresh.feature.b2b.widgets.legals.userLegalEnitiesV2.presentation;

import Xc.a;
import Xc.b;
import kotlin.Metadata;
import ru.ozon.app.android.ugc.core.widgets.selectionItemDescription.data.SelectionItemDescriptionDTO;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\t\b\u0080\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007j\u0002\b\bj\u0002\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/feature/b2b/widgets/legals/userLegalEnitiesV2/presentation/UserLegalEntitiesV2Payload;", "", "<init>", "(Ljava/lang/String;I)V", SelectionItemDescriptionDTO.TITLE, "REMOVE", "PAYPROPS", "ADDRESS", "COMPANYID", "CELLBUTTON", "b2b_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UserLegalEntitiesV2Payload {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ UserLegalEntitiesV2Payload[] $VALUES;
    public static final UserLegalEntitiesV2Payload TITLE = new UserLegalEntitiesV2Payload(SelectionItemDescriptionDTO.TITLE, 0);
    public static final UserLegalEntitiesV2Payload REMOVE = new UserLegalEntitiesV2Payload("REMOVE", 1);
    public static final UserLegalEntitiesV2Payload PAYPROPS = new UserLegalEntitiesV2Payload("PAYPROPS", 2);
    public static final UserLegalEntitiesV2Payload ADDRESS = new UserLegalEntitiesV2Payload("ADDRESS", 3);
    public static final UserLegalEntitiesV2Payload COMPANYID = new UserLegalEntitiesV2Payload("COMPANYID", 4);
    public static final UserLegalEntitiesV2Payload CELLBUTTON = new UserLegalEntitiesV2Payload("CELLBUTTON", 5);

    private static final /* synthetic */ UserLegalEntitiesV2Payload[] $values() {
        return new UserLegalEntitiesV2Payload[]{TITLE, REMOVE, PAYPROPS, ADDRESS, COMPANYID, CELLBUTTON};
    }

    static {
        UserLegalEntitiesV2Payload[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
    }

    private UserLegalEntitiesV2Payload(String str, int i11) {
    }

    public static UserLegalEntitiesV2Payload valueOf(String str) {
        return (UserLegalEntitiesV2Payload) Enum.valueOf(UserLegalEntitiesV2Payload.class, str);
    }

    public static UserLegalEntitiesV2Payload[] values() {
        return (UserLegalEntitiesV2Payload[]) $VALUES.clone();
    }
}
