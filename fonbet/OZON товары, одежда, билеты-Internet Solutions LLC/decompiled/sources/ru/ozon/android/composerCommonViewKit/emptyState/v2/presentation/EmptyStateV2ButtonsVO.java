package ru.ozon.android.composerCommonViewKit.emptyState.v2.presentation;

import Lh.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.composerCommonViewKit.emptyState.statusWidget.data.StatusWidgetDTO;
import ru.ozon.uni.atoms.data.AtomDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010 \u001a\u0004\b!\u0010\u000e¨\u0006\""}, d2 = {"Lru/ozon/android/composerCommonViewKit/emptyState/v2/presentation/EmptyStateV2ButtonsVO;", "Ll20/c;", "", "id", "", "Lru/ozon/uni/atoms/data/AtomDTO;", "buttons", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "buttonsLayout", "", "backgroundColor", "<init>", "(JLjava/util/List;Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getButtons", "()Ljava/util/List;", "Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "getButtonsLayout", "()Lru/ozon/android/composerCommonViewKit/emptyState/statusWidget/data/StatusWidgetDTO$ButtonLayout;", "Ljava/lang/String;", "getBackgroundColor", "common-view-kit_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class EmptyStateV2ButtonsVO implements c {
    private final String backgroundColor;
    private final List<AtomDTO> buttons;
    private final StatusWidgetDTO.ButtonLayout buttonsLayout;
    private final long id;

    /* JADX WARN: Multi-variable type inference failed */
    public EmptyStateV2ButtonsVO(long j11, List<? extends AtomDTO> list, StatusWidgetDTO.ButtonLayout buttonLayout, String str) {
        this.id = j11;
        this.buttons = list;
        this.buttonsLayout = buttonLayout;
        this.backgroundColor = str;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof EmptyStateV2ButtonsVO)) {
            return false;
        }
        EmptyStateV2ButtonsVO emptyStateV2ButtonsVO = (EmptyStateV2ButtonsVO) other;
        return this.id == emptyStateV2ButtonsVO.id && Intrinsics.d(this.buttons, emptyStateV2ButtonsVO.buttons) && this.buttonsLayout == emptyStateV2ButtonsVO.buttonsLayout && Intrinsics.d(this.backgroundColor, emptyStateV2ButtonsVO.backgroundColor);
    }

    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    public final List<AtomDTO> getButtons() {
        return this.buttons;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        List<AtomDTO> list = this.buttons;
        int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
        StatusWidgetDTO.ButtonLayout buttonLayout = this.buttonsLayout;
        int hashCode3 = (hashCode2 + (buttonLayout == null ? 0 : buttonLayout.hashCode())) * 31;
        String str = this.backgroundColor;
        return hashCode3 + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomDTO> list = this.buttons;
        StatusWidgetDTO.ButtonLayout buttonLayout = this.buttonsLayout;
        String str = this.backgroundColor;
        StringBuilder b11 = b.b(j11, "EmptyStateV2ButtonsVO(id=", ", buttons=", list);
        b11.append(", buttonsLayout=");
        b11.append(buttonLayout);
        b11.append(", backgroundColor=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}
