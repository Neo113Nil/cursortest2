package ru.ozon.app.android.ugc.core.widgets.common;

import Ae.C0;
import Ae.C2399j;
import Ae.E0;
import Ae.InterfaceC2395h;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import xe.C10727i;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0002\b\u0006\n\u0002\u0010#\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0007\u0018\u00002\u00020\u0001B\t\b\u0007¢\u0006\u0004\b\u0002\u0010\u0003J%\u0010\n\u001a\u00020\t2\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\n\u0010\u000bJ\u001f\u0010\f\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0005\u001a\u00020\u00042\u0006\u0010\b\u001a\u00020\u0004¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u000e\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0011\u001a\b\u0012\u0004\u0012\u00020\u00040\u00108\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012R.\u0010\u0015\u001a\u001c\u0012\u0012\u0012\u0010\u0012\u0004\u0012\u00020\u0004\u0012\u0006\u0012\u0004\u0018\u00010\u00040\u0014\u0012\u0004\u0012\u00020\u00060\u00138\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00178\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010\u0019R\u001d\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001e¨\u0006\u001f"}, d2 = {"Lru/ozon/app/android/ugc/core/widgets/common/UgcCachedActionsSharedViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "reviewUuid", "", "isSelected", "actionId", "", "saveActionState", "(Ljava/lang/String;ZLjava/lang/String;)V", "isActionSelected", "(Ljava/lang/String;Ljava/lang/String;)Ljava/lang/Boolean;", "hasSavedStates", "(Ljava/lang/String;)Z", "", "reviewUuids", "Ljava/util/Set;", "", "Lkotlin/Pair;", "actionStates", "Ljava/util/Map;", "LAe/w0;", "_actionsChanged", "LAe/w0;", "LAe/h;", "actionsChanged", "LAe/h;", "getActionsChanged", "()LAe/h;", "core_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class UgcCachedActionsSharedViewModel extends w0 {

    @NotNull
    private final Ae.w0<Unit> _actionsChanged;

    @NotNull
    private final InterfaceC2395h<Unit> actionsChanged;

    @NotNull
    private final Set<String> reviewUuids = new LinkedHashSet();

    @NotNull
    private final Map<Pair<String, String>, Boolean> actionStates = new LinkedHashMap();

    public UgcCachedActionsSharedViewModel() {
        C0 b11 = E0.b(0, 0, null, 6);
        this._actionsChanged = b11;
        this.actionsChanged = C2399j.a(b11);
    }

    @NotNull
    public final InterfaceC2395h<Unit> getActionsChanged() {
        return this.actionsChanged;
    }

    public final boolean hasSavedStates(@NotNull String reviewUuid) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        return this.reviewUuids.contains(reviewUuid);
    }

    public final Boolean isActionSelected(@NotNull String reviewUuid, @NotNull String actionId) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        return this.actionStates.get(new Pair(reviewUuid, actionId));
    }

    public final void saveActionState(@NotNull String reviewUuid, boolean isSelected, @NotNull String actionId) {
        Intrinsics.checkNotNullParameter(reviewUuid, "reviewUuid");
        Intrinsics.checkNotNullParameter(actionId, "actionId");
        this.reviewUuids.add(reviewUuid);
        this.actionStates.put(new Pair<>(reviewUuid, actionId), Boolean.valueOf(isSelected));
        C10727i.c(x0.a(this), null, null, new UgcCachedActionsSharedViewModel$saveActionState$1(this, null), 3);
    }
}
