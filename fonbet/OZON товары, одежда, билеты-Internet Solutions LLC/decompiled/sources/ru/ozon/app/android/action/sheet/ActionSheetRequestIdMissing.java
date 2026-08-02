package ru.ozon.app.android.action.sheet;

import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0003\n\u0002\b\u0003\bÇ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lru/ozon/app/android/action/sheet/ActionSheetRequestIdMissing;", "", "<init>", "()V", "action_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ActionSheetRequestIdMissing extends Throwable {

    @NotNull
    public static final ActionSheetRequestIdMissing INSTANCE = new ActionSheetRequestIdMissing();

    private ActionSheetRequestIdMissing() {
        super("Cannot start action sheet without request id");
    }
}
