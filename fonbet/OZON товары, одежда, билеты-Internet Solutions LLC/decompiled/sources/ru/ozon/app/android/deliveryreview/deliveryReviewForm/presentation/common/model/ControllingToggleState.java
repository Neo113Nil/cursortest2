package ru.ozon.app.android.deliveryreview.deliveryReviewForm.presentation.common.model;

import java.util.Iterator;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010%\n\u0002\u0010\u000b\n\u0002\b\b\u0018\u00002\u00020\u0001B#\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0012\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0006\u0010\r\u001a\u00020\u0006R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u001d\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\f¨\u0006\u000e"}, d2 = {"Lru/ozon/app/android/deliveryreview/deliveryReviewForm/presentation/common/model/ControllingToggleState;", "", "selectControllingComponentId", "", "dependedComponents", "", "", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "getSelectControllingComponentId", "()Ljava/lang/String;", "getDependedComponents", "()Ljava/util/Map;", "anyDependedComponentSelected", "deliveryreview_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final class ControllingToggleState {

    @NotNull
    private final Map<String, Boolean> dependedComponents;

    @NotNull
    private final String selectControllingComponentId;

    public ControllingToggleState(@NotNull String selectControllingComponentId, @NotNull Map<String, Boolean> dependedComponents) {
        Intrinsics.checkNotNullParameter(selectControllingComponentId, "selectControllingComponentId");
        Intrinsics.checkNotNullParameter(dependedComponents, "dependedComponents");
        this.selectControllingComponentId = selectControllingComponentId;
        this.dependedComponents = dependedComponents;
    }

    public final boolean anyDependedComponentSelected() {
        Map<String, Boolean> map = this.dependedComponents;
        if (map.isEmpty()) {
            return false;
        }
        Iterator<Map.Entry<String, Boolean>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            if (it.next().getValue().booleanValue()) {
                return true;
            }
        }
        return false;
    }

    @NotNull
    public final Map<String, Boolean> getDependedComponents() {
        return this.dependedComponents;
    }

    @NotNull
    public final String getSelectControllingComponentId() {
        return this.selectControllingComponentId;
    }
}
