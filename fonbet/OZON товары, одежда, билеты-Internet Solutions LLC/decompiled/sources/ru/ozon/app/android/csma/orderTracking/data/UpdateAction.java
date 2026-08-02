package ru.ozon.app.android.csma.orderTracking.data;

import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\b6\u0018\u00002\u00020\u0001:\u0002\b\tB\u0011\b\u0004\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0006\u0010\u0007\u0082\u0001\u0002\n\u000b¨\u0006\f"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "", "actionName", "", "<init>", "(Ljava/lang/String;)V", "getActionName", "()Ljava/lang/String;", "UpdateActionMain", "UpdateActionLK", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction$UpdateActionLK;", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction$UpdateActionMain;", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public abstract class UpdateAction {

    @NotNull
    private final String actionName;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/UpdateAction$UpdateActionLK;", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "actionName", "", "<init>", "(Ljava/lang/String;)V", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateActionLK extends UpdateAction {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateActionLK(@NotNull String actionName) {
            super(actionName, null);
            Intrinsics.checkNotNullParameter(actionName, "actionName");
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0004\b\u0004\u0010\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/csma/orderTracking/data/UpdateAction$UpdateActionMain;", "Lru/ozon/app/android/csma/orderTracking/data/UpdateAction;", "actionName", "", "<init>", "(Ljava/lang/String;)V", "csma_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class UpdateActionMain extends UpdateAction {
        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public UpdateActionMain(@NotNull String actionName) {
            super(actionName, null);
            Intrinsics.checkNotNullParameter(actionName, "actionName");
        }
    }

    public /* synthetic */ UpdateAction(String str, DefaultConstructorMarker defaultConstructorMarker) {
        this(str);
    }

    @NotNull
    public final String getActionName() {
        return this.actionName;
    }

    private UpdateAction(String str) {
        this.actionName = str;
    }
}
