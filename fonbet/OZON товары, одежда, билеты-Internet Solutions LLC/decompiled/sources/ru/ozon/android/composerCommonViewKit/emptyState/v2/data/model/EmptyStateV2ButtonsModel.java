package ru.ozon.android.composerCommonViewKit.emptyState.v2.data.model;

import Kk.C3532b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u000e\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0013\u001a\u00020\u00072\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001f\u0010\u0004\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\b\u0010\u001cR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006\u001f"}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/data/model/EmptyStateV2ButtonsModel;", "", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttons", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "buttonLayout", "", "isOverlayWidget", "", "backgroundColor", "<init>", "(Ljava/util/List;Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;ZLjava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "getButtonLayout", "()Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EmptyStateV2ButtonsModel {
    private final String backgroundColor;
    private final StatusWidgetDTO.ButtonLayout buttonLayout;
    private final List<AtomDTO> buttons;
    private final boolean isOverlayWidget;

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyStateV2ButtonsModel(List<? extends AtomDTO> list, StatusWidgetDTO.ButtonLayout buttonLayout, boolean z11, String str) {
        this.buttons = list;
        this.buttonLayout = buttonLayout;
        this.isOverlayWidget = z11;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2ButtonsModel)) {
            return false;
        }
        EmptyStateV2ButtonsModel emptyStateV2ButtonsModel = (EmptyStateV2ButtonsModel) other;
        return Intrinsics.d(this.buttons, emptyStateV2ButtonsModel.buttons) && this.buttonLayout == emptyStateV2ButtonsModel.buttonLayout && this.isOverlayWidget == emptyStateV2ButtonsModel.isOverlayWidget && Intrinsics.d(this.backgroundColor, emptyStateV2ButtonsModel.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final StatusWidgetDTO.ButtonLayout getButtonLayout() {
        return this.buttonLayout;
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    public int hashCode() {
        List<AtomDTO> list = this.buttons;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        StatusWidgetDTO.ButtonLayout buttonLayout = this.buttonLayout;
        int a11 = C3532b.a((hashCode + (buttonLayout == null ? 0 : buttonLayout.hashCode())) * 31, 31, this.isOverlayWidget);
        String str = this.backgroundColor;
        return a11 + (str != null ? str.hashCode() : 0);
    }

    /* renamed from: isOverlayWidget, reason: from getter */
    public final boolean getIsOverlayWidget() {
        return this.isOverlayWidget;
    }

    @NotNull
    public String toString() {
        return "EmptyStateV2ButtonsModel(buttons=" + this.buttons + ", buttonLayout=" + this.buttonLayout + ", isOverlayWidget=" + this.isOverlayWidget + ", backgroundColor=" + this.backgroundColor + ")";
    }
}
