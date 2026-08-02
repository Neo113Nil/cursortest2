package ru.ozon.app.android.ugc.widgets.common;

import T7.P;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.sheet.ActionSheetVO;
import ru.ozon.app.android.pdp.ui.configurators.ugc.common.SubmitDialog;
import ru.ozon.uni.atoms.data.button.ButtonV3Atom;

@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\b\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/ugc/widgets/common/MenuVO;", "", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "button", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "actions", "", "", "Lru/ozon/app/android/pdp/ui/configurators/ugc/common/SubmitDialog;", "submitDialogs", "<init>", "(Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;Lru/ozon/app/android/action/sheet/ActionSheetVO;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "getButton", "()Lru/ozon/uni/atoms/data/button/ButtonV3Atom$SmallIconButton;", "Lru/ozon/app/android/action/sheet/ActionSheetVO;", "getActions", "()Lru/ozon/app/android/action/sheet/ActionSheetVO;", "Ljava/util/Map;", "getSubmitDialogs", "()Ljava/util/Map;", "ugc_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class MenuVO {
    private final ActionSheetVO actions;

    @NotNull
    private final ButtonV3Atom.SmallIconButton button;
    private final Map<String, SubmitDialog> submitDialogs;

    public MenuVO(@NotNull ButtonV3Atom.SmallIconButton button, ActionSheetVO actionSheetVO, Map<String, SubmitDialog> map) {
        Intrinsics.checkNotNullParameter(button, "button");
        this.button = button;
        this.actions = actionSheetVO;
        this.submitDialogs = map;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuVO)) {
            return false;
        }
        MenuVO menuVO = (MenuVO) other;
        return Intrinsics.d(this.button, menuVO.button) && Intrinsics.d(this.actions, menuVO.actions) && Intrinsics.d(this.submitDialogs, menuVO.submitDialogs);
    }

    public final ActionSheetVO getActions() {
        return this.actions;
    }

    @NotNull
    public final ButtonV3Atom.SmallIconButton getButton() {
        return this.button;
    }

    public final Map<String, SubmitDialog> getSubmitDialogs() {
        return this.submitDialogs;
    }

    public int hashCode() {
        int hashCode = this.button.hashCode() * 31;
        ActionSheetVO actionSheetVO = this.actions;
        int hashCode2 = (hashCode + (actionSheetVO == null ? 0 : actionSheetVO.hashCode())) * 31;
        Map<String, SubmitDialog> map = this.submitDialogs;
        return hashCode2 + (map != null ? map.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        ButtonV3Atom.SmallIconButton smallIconButton = this.button;
        ActionSheetVO actionSheetVO = this.actions;
        Map<String, SubmitDialog> map = this.submitDialogs;
        StringBuilder sb2 = new StringBuilder("MenuVO(button=");
        sb2.append(smallIconButton);
        sb2.append(", actions=");
        sb2.append(actionSheetVO);
        sb2.append(", submitDialogs=");
        return P.f(sb2, map, ")");
    }
}
