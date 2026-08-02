package ru.ozon.app.android.favorites.accesscontrol.data;

import Xc.a;
import Xc.b;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
@Metadata(d1 = {"\u0000\u0010\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\u0010\u000e\n\u0002\b\u000b\b\u0086\u0081\u0002\u0018\u0000 \t2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\tB\u0011\b\u0002\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0006\u001a\u0004\b\u0007\u0010\bj\u0002\b\nj\u0002\b\u000bj\u0002\b\f¨\u0006\r"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlAction;", "", "", "id", "<init>", "(Ljava/lang/String;ILjava/lang/String;)V", "Ljava/lang/String;", "getId", "()Ljava/lang/String;", "Companion", "REMOVE_USER", "RESET_READ", "RESET_EDIT", "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class AccessControlAction {
    private static final /* synthetic */ a $ENTRIES;
    private static final /* synthetic */ AccessControlAction[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;

    @NotNull
    private static final Map<String, AccessControlAction> values;

    @NotNull
    private final String id;
    public static final AccessControlAction REMOVE_USER = new AccessControlAction("REMOVE_USER", 0, "favoriteAccessRemoveUser");
    public static final AccessControlAction RESET_READ = new AccessControlAction("RESET_READ", 1, "favoriteAccessResetRead");
    public static final AccessControlAction RESET_EDIT = new AccessControlAction("RESET_EDIT", 2, "favoriteAccessResetEdit");

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0012\u0010\n\u001a\u0004\u0018\u00010\u00072\b\u0010\u000b\u001a\u0004\u0018\u00010\u0006R\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\t¨\u0006\f"}, d2 = {"Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlAction$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/favorites/accesscontrol/data/AccessControlAction;", "getValues", "()Ljava/util/Map;", "fromValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "favorites_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final AccessControlAction fromValue(String value) {
            if (value != null) {
                return AccessControlAction.INSTANCE.getValues().get(value);
            }
            return null;
        }

        @NotNull
        public final Map<String, AccessControlAction> getValues() {
            return AccessControlAction.values;
        }

        private Companion() {
        }
    }

    private static final /* synthetic */ AccessControlAction[] $values() {
        return new AccessControlAction[]{REMOVE_USER, RESET_READ, RESET_EDIT};
    }

    static {
        AccessControlAction[] $values = $values();
        $VALUES = $values;
        $ENTRIES = b.a($values);
        INSTANCE = new Companion(null);
        AccessControlAction[] values2 = values();
        int h11 = U.h(values2.length);
        LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
        for (AccessControlAction accessControlAction : values2) {
            linkedHashMap.put(accessControlAction.id, accessControlAction);
        }
        values = linkedHashMap;
    }

    private AccessControlAction(String str, int i11, String str2) {
        this.id = str2;
    }

    public static AccessControlAction valueOf(String str) {
        return (AccessControlAction) Enum.valueOf(AccessControlAction.class, str);
    }

    public static AccessControlAction[] values() {
        return (AccessControlAction[]) $VALUES.clone();
    }
}
