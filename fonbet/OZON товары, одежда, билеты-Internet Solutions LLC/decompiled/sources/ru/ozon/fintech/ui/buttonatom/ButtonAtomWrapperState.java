package ru.ozon.fintech.ui.buttonatom;

import E30.i;
import Kk.C3532b;
import Kk.d;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.controls.button.ButtonDTO;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001BQ\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\b\u001a\u00020\u0007\u0012\b\b\u0002\u0010\n\u001a\u00020\t\u0012\u001a\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\u000f\u0010\u0010\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0010\u0010\u0011J\u0010\u0010\u0012\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0012\u0010\u0011J\u0010\u0010\u0013\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0011J\u0010\u0010\u0016\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\tHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J$\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJb\u0010\u001c\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\b\u001a\u00020\u00072\b\b\u0002\u0010\n\u001a\u00020\t2\u001c\b\u0002\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u0011J\u0010\u0010 \u001a\u00020\u001fHÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\t2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010\u0011R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010(\u001a\u0004\b)\u0010\u0014R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b*\u0010\u0011R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010+\u001a\u0004\b,\u0010\u0017R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010-\u001a\u0004\b.\u0010\u0019R+\u0010\r\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u0010\u001b¨\u00061"}, d2 = {"Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "buttonDTO", "actionId", "Landroid/graphics/Rect;", "paddings", "", "closeOnClick", "Lkotlin/Function2;", "", "onClick", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Ljava/lang/String;Landroid/graphics/Rect;ZLkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "component3", "component4", "()Landroid/graphics/Rect;", "component5", "()Z", "component6", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;Ljava/lang/String;Landroid/graphics/Rect;ZLkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/controls/button/ButtonDTO;", "getButtonDTO", "getActionId", "Landroid/graphics/Rect;", "getPaddings", "Z", "getCloseOnClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ButtonAtomWrapperState implements RecyclerItem {
    private final String actionId;

    @NotNull
    private final ButtonDTO buttonDTO;
    private final boolean closeOnClick;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;

    /* JADX WARN: Multi-variable type inference failed */
    public ButtonAtomWrapperState(@NotNull String id2, @NotNull ButtonDTO buttonDTO, String str, @NotNull Rect paddings, boolean z11, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(buttonDTO, "buttonDTO");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.buttonDTO = buttonDTO;
        this.actionId = str;
        this.paddings = paddings;
        this.closeOnClick = z11;
        this.onClick = function2;
    }

    public static /* synthetic */ ButtonAtomWrapperState copy$default(ButtonAtomWrapperState buttonAtomWrapperState, String str, ButtonDTO buttonDTO, String str2, Rect rect, boolean z11, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = buttonAtomWrapperState.id;
        }
        if ((i11 & 2) != 0) {
            buttonDTO = buttonAtomWrapperState.buttonDTO;
        }
        if ((i11 & 4) != 0) {
            str2 = buttonAtomWrapperState.actionId;
        }
        if ((i11 & 8) != 0) {
            rect = buttonAtomWrapperState.paddings;
        }
        if ((i11 & 16) != 0) {
            z11 = buttonAtomWrapperState.closeOnClick;
        }
        if ((i11 & 32) != 0) {
            function2 = buttonAtomWrapperState.onClick;
        }
        boolean z12 = z11;
        Function2 function22 = function2;
        return buttonAtomWrapperState.copy(str, buttonDTO, str2, rect, z12, function22);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public boolean areContentsTheSame(@NotNull RecyclerItem recyclerItem) {
        return RecyclerItem.a.a(this, recyclerItem);
    }

    @NotNull
    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final ButtonDTO getButtonDTO() {
        return this.buttonDTO;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final Function2<String, Boolean, Unit> component6() {
        return this.onClick;
    }

    @NotNull
    public final ButtonAtomWrapperState copy(@NotNull String id2, @NotNull ButtonDTO buttonDTO, String actionId, @NotNull Rect paddings, boolean closeOnClick, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(buttonDTO, "buttonDTO");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new ButtonAtomWrapperState(id2, buttonDTO, actionId, paddings, closeOnClick, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ButtonAtomWrapperState)) {
            return false;
        }
        ButtonAtomWrapperState buttonAtomWrapperState = (ButtonAtomWrapperState) other;
        return Intrinsics.d(this.id, buttonAtomWrapperState.id) && Intrinsics.d(this.buttonDTO, buttonAtomWrapperState.buttonDTO) && Intrinsics.d(this.actionId, buttonAtomWrapperState.actionId) && Intrinsics.d(this.paddings, buttonAtomWrapperState.paddings) && this.closeOnClick == buttonAtomWrapperState.closeOnClick && Intrinsics.d(this.onClick, buttonAtomWrapperState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    public final ButtonDTO getButtonDTO() {
        return this.buttonDTO;
    }

    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final Function2<String, Boolean, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final Rect getPaddings() {
        return this.paddings;
    }

    public int hashCode() {
        int hashCode = (this.buttonDTO.hashCode() + (this.id.hashCode() * 31)) * 31;
        String str = this.actionId;
        int a11 = C3532b.a(d.a(this.paddings, (hashCode + (str == null ? 0 : str.hashCode())) * 31, 31), 31, this.closeOnClick);
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return a11 + (function2 != null ? function2.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        return "ButtonAtomWrapperState(id=" + this.id + ", buttonDTO=" + this.buttonDTO + ", actionId=" + this.actionId + ", paddings=" + this.paddings + ", closeOnClick=" + this.closeOnClick + ", onClick=" + this.onClick + ")";
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ ButtonAtomWrapperState(String str, ButtonDTO buttonDTO, String str2, Rect rect, boolean z11, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, buttonDTO, str2, (i11 & 8) != 0 ? i.a() : rect, (i11 & 16) != 0 ? true : z11, function2);
    }
}
