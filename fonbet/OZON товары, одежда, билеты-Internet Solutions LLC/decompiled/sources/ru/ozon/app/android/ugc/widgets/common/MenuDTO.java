package ru.ozon.app.android.ugc.widgets.common;

import T7.P;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.data.ActionSheetDTO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitDialog;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\u0014\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0017\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0003J7\u0010\u0015\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\u0016\b\u0002\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0016\u001a\u00020\u00172\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001J\t\u0010\u001b\u001a\u00020\bHÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u001f\u0010\u0006\u001a\u0010\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\t\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/MenuDTO;", "", "button", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "actions", "Lru/ozon/app/android/action/sheet/data/ActionSheetDTO;", "submitDialogsByActionIDs", "", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog;", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/action/sheet/data/ActionSheetDTO;Ljava/util/Map;)V", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getActions", "()Lru/ozon/app/android/action/sheet/data/ActionSheetDTO;", "getSubmitDialogsByActionIDs", "()Ljava/util/Map;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MenuDTO {
    public static final int $stable = 8;
    private final ActionSheetDTO actions;

    @NotNull
    private final ButtonV3Atom.SmallIconButton button;
    private final Map<String, SubmitDialog> submitDialogsByActionIDs;

    public MenuDTO(@NotNull ButtonV3Atom.SmallIconButton button, ActionSheetDTO actionSheetDTO, Map<String, SubmitDialog> map) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.actions = actionSheetDTO;
        this.submitDialogsByActionIDs = map;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ MenuDTO copy$default(MenuDTO menuDTO, ButtonV3Atom.SmallIconButton smallIconButton, ActionSheetDTO actionSheetDTO, Map map, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            smallIconButton = menuDTO.button;
        }
        if ((i11 & 2) != 0) {
            actionSheetDTO = menuDTO.actions;
        }
        if ((i11 & 4) != 0) {
            map = menuDTO.submitDialogsByActionIDs;
        }
        return menuDTO.copy(smallIconButton, actionSheetDTO, map);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    /* renamed from: component2, reason: from getter */
    public final ActionSheetDTO getActions() {
        return this.actions;
    }

    public final Map<String, SubmitDialog> component3() {
        return this.submitDialogsByActionIDs;
    }

    @NotNull
    public final MenuDTO copy(@NotNull ButtonV3Atom.SmallIconButton button, ActionSheetDTO actions, Map<String, SubmitDialog> submitDialogsByActionIDs) {
        Intrinsics.checkNotNullParameter(button, "button");
        return new MenuDTO(button, actions, submitDialogsByActionIDs);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuDTO)) {
            return false;
        }
        MenuDTO menuDTO = (MenuDTO) other;
        return Intrinsics.d(this.button, menuDTO.button) && Intrinsics.d(this.actions, menuDTO.actions) && Intrinsics.d(this.submitDialogsByActionIDs, menuDTO.submitDialogsByActionIDs);
    }

    public final ActionSheetDTO getActions() {
        return this.actions;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    public final Map<String, SubmitDialog> getSubmitDialogsByActionIDs() {
        return this.submitDialogsByActionIDs;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        ActionSheetDTO actionSheetDTO = this.actions;
        int hashCode2 = (hashCode + (actionSheetDTO == null ? 0 : actionSheetDTO.hashCode())) * 31;
        Map<String, SubmitDialog> map = this.submitDialogsByActionIDs;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.SmallIconButton smallIconButton = this.button;
        ActionSheetDTO actionSheetDTO = this.actions;
        Map<String, SubmitDialog> map = this.submitDialogsByActionIDs;
        StringBuilder sb2 = new StringBuilder("MenuDTO(button=");
        sb2.append(smallIconButton);
        sb2.append(", actions=");
        sb2.append(actionSheetDTO);
        sb2.append(", submitDialogsByActionIDs=");
        return P.f(sb2, map, ")");
    }
}
