package ru.ozon.fintech.ui.menuitem;

import E30.i;
import Kk.C3532b;
import Kk.d;
import N3.C3660k;
import Ve.C4636t5;
import android.graphics.Rect;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0018\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B\u008f\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0010\u001a\u00020\u000e\u0012\u001a\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0016\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0017J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0017J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0017J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0017J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001dJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0017J\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u0017J\u0010\u0010!\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010$J$\u0010&\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b&\u0010'Jª\u0001\u0010(\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0010\u001a\u00020\u000e2\u001c\b\u0002\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011HÆ\u0001¢\u0006\u0004\b(\u0010)J\u0010\u0010*\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b*\u0010\u0017J\u0010\u0010,\u001a\u00020+HÖ\u0001¢\u0006\u0004\b,\u0010-J\u001a\u00100\u001a\u00020\u000e2\b\u0010/\u001a\u0004\u0018\u00010.HÖ\u0003¢\u0006\u0004\b0\u00101R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00102\u001a\u0004\b3\u0010\u0017R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00102\u001a\u0004\b4\u0010\u0017R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b5\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00102\u001a\u0004\b6\u0010\u0017R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u00107\u001a\u0004\b8\u0010\u001dR\u0019\u0010\t\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\t\u00107\u001a\u0004\b9\u0010\u001dR\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00102\u001a\u0004\b:\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00102\u001a\u0004\b;\u0010\u0017R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\b=\u0010\"R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b\u000f\u0010$R\u0017\u0010\u0010\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010>\u001a\u0004\b?\u0010$R+\u0010\u0013\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u0010@\u001a\u0004\bA\u0010'¨\u0006B"}, d2 = {"Lru/ozon/fintech/ui/menuitem/MenuItemState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "icon", "iconColor", "src", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "actionId", "chevronColor", "Landroid/graphics/Rect;", "paddings", "", "isNeedChevron", "closeOnClick", "Lkotlin/Function2;", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;ZZLkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component6", "component7", "component8", "component9", "()Landroid/graphics/Rect;", "component10", "()Z", "component11", "component12", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;ZZLkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/menuitem/MenuItemState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIcon", "getIconColor", "getSrc", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getSubTitle", "getActionId", "getChevronColor", "Landroid/graphics/Rect;", "getPaddings", "Z", "getCloseOnClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class MenuItemState implements RecyclerItem {
    private final String actionId;
    private final String chevronColor;
    private final boolean closeOnClick;
    private final String icon;
    private final String iconColor;

    @NotNull
    private final String id;
    private final boolean isNeedChevron;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final String src;
    private final TextAtom subTitle;
    private final TextAtom title;

    /* JADX WARN: Multi-variable type inference failed */
    public MenuItemState(@NotNull String id2, String str, String str2, String str3, TextAtom textAtom, TextAtom textAtom2, String str4, String str5, @NotNull Rect paddings, boolean z11, boolean z12, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.icon = str;
        this.iconColor = str2;
        this.src = str3;
        this.title = textAtom;
        this.subTitle = textAtom2;
        this.actionId = str4;
        this.chevronColor = str5;
        this.paddings = paddings;
        this.isNeedChevron = z11;
        this.closeOnClick = z12;
        this.onClick = function2;
    }

    public static /* synthetic */ MenuItemState copy$default(MenuItemState menuItemState, String str, String str2, String str3, String str4, TextAtom textAtom, TextAtom textAtom2, String str5, String str6, Rect rect, boolean z11, boolean z12, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = menuItemState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = menuItemState.icon;
        }
        if ((i11 & 4) != 0) {
            str3 = menuItemState.iconColor;
        }
        if ((i11 & 8) != 0) {
            str4 = menuItemState.src;
        }
        if ((i11 & 16) != 0) {
            textAtom = menuItemState.title;
        }
        if ((i11 & 32) != 0) {
            textAtom2 = menuItemState.subTitle;
        }
        if ((i11 & 64) != 0) {
            str5 = menuItemState.actionId;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            str6 = menuItemState.chevronColor;
        }
        if ((i11 & 256) != 0) {
            rect = menuItemState.paddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z11 = menuItemState.isNeedChevron;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            z12 = menuItemState.closeOnClick;
        }
        if ((i11 & 2048) != 0) {
            function2 = menuItemState.onClick;
        }
        boolean z13 = z12;
        Function2 function22 = function2;
        Rect rect2 = rect;
        boolean z14 = z11;
        String str7 = str5;
        String str8 = str6;
        TextAtom textAtom3 = textAtom;
        TextAtom textAtom4 = textAtom2;
        return menuItemState.copy(str, str2, str3, str4, textAtom3, textAtom4, str7, str8, rect2, z14, z13, function22);
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

    /* renamed from: component10, reason: from getter */
    public final boolean getIsNeedChevron() {
        return this.isNeedChevron;
    }

    /* renamed from: component11, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final Function2<String, Boolean, Unit> component12() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component6, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component8, reason: from getter */
    public final String getChevronColor() {
        return this.chevronColor;
    }

    @NotNull
    /* renamed from: component9, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    @NotNull
    public final MenuItemState copy(@NotNull String id2, String icon, String iconColor, String src, TextAtom title, TextAtom subTitle, String actionId, String chevronColor, @NotNull Rect paddings, boolean isNeedChevron, boolean closeOnClick, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new MenuItemState(id2, icon, iconColor, src, title, subTitle, actionId, chevronColor, paddings, isNeedChevron, closeOnClick, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MenuItemState)) {
            return false;
        }
        MenuItemState menuItemState = (MenuItemState) other;
        return Intrinsics.d(this.id, menuItemState.id) && Intrinsics.d(this.icon, menuItemState.icon) && Intrinsics.d(this.iconColor, menuItemState.iconColor) && Intrinsics.d(this.src, menuItemState.src) && Intrinsics.d(this.title, menuItemState.title) && Intrinsics.d(this.subTitle, menuItemState.subTitle) && Intrinsics.d(this.actionId, menuItemState.actionId) && Intrinsics.d(this.chevronColor, menuItemState.chevronColor) && Intrinsics.d(this.paddings, menuItemState.paddings) && this.isNeedChevron == menuItemState.isNeedChevron && this.closeOnClick == menuItemState.closeOnClick && Intrinsics.d(this.onClick, menuItemState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getChevronColor() {
        return this.chevronColor;
    }

    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final String getIcon() {
        return this.icon;
    }

    public final String getIconColor() {
        return this.iconColor;
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

    public final String getSrc() {
        return this.src;
    }

    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.icon;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.iconColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.src;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode5 = (hashCode4 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subTitle;
        int hashCode6 = (hashCode5 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        String str4 = this.actionId;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.chevronColor;
        int a11 = C3532b.a(C3532b.a(d.a(this.paddings, (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31, 31), 31, this.isNeedChevron), 31, this.closeOnClick);
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return a11 + (function2 != null ? function2.hashCode() : 0);
    }

    public final boolean isNeedChevron() {
        return this.isNeedChevron;
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.icon;
        String str3 = this.iconColor;
        String str4 = this.src;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        String str5 = this.actionId;
        String str6 = this.chevronColor;
        Rect rect = this.paddings;
        boolean z11 = this.isNeedChevron;
        boolean z12 = this.closeOnClick;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder d11 = C3660k.d("MenuItemState(id=", str, ", icon=", str2, ", iconColor=");
        Nh.a.h(d11, str3, ", src=", str4, ", title=");
        C4636t5.c(", subTitle=", ", actionId=", d11, textAtom, textAtom2);
        Nh.a.h(d11, str5, ", chevronColor=", str6, ", paddings=");
        d11.append(rect);
        d11.append(", isNeedChevron=");
        d11.append(z11);
        d11.append(", closeOnClick=");
        d11.append(z12);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ MenuItemState(String str, String str2, String str3, String str4, TextAtom textAtom, TextAtom textAtom2, String str5, String str6, Rect rect, boolean z11, boolean z12, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, textAtom, textAtom2, str5, str6, (i11 & 256) != 0 ? i.a() : rect, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? false : z11, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? true : z12, function2);
    }
}
