package ru.ozon.fintech.ui.cardV2;

import Ak.C2436a;
import E30.i;
import Kk.C3532b;
import Kk.d;
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
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0004\n\u0002\u0010\b\n\u0002\b\u001b\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B\u008d\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0013¢\u0006\u0004\b\u0015\u0010\u0016J\u000f\u0010\u0017\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0017\u0010\u0018J\u0010\u0010\u0019\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001bJ\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0018J\u0010\u0010\u001e\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\nHÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0018J$\u0010#\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b%\u0010\u0018J\u0012\u0010&\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b&\u0010\u0018J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u0018J\u0012\u0010(\u001a\u0004\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b(\u0010)J¬\u0001\u0010*\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b*\u0010+J\u0010\u0010,\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b,\u0010\u0018J\u0010\u0010-\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b-\u0010.J\u001a\u00101\u001a\u00020\b2\b\u00100\u001a\u0004\u0018\u00010/HÖ\u0003¢\u0006\u0004\b1\u00102R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00103\u001a\u0004\b4\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00105\u001a\u0004\b6\u0010\u001bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u00105\u001a\u0004\b7\u0010\u001bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00103\u001a\u0004\b8\u0010\u0018R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u00109\u001a\u0004\b:\u0010\u001fR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010;\u001a\u0004\b<\u0010!R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00103\u001a\u0004\b=\u0010\u0018R+\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\b\u0012\u0004\u0012\u00020\u000e\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010>\u001a\u0004\b?\u0010$R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u00103\u001a\u0004\b@\u0010\u0018R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\bA\u0010\u0018R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0012\u00103\u001a\u0004\bB\u0010\u0018R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010C\u001a\u0004\bD\u0010)¨\u0006E"}, d2 = {"Lru/ozon/fintech/ui/cardV2/CardV2State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "actionId", "", "closeOnClick", "Landroid/graphics/Rect;", "paddings", "backColor", "Lkotlin/Function2;", "", "onClick", "icon", "src", "iconColor", "", "radius", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ZLandroid/graphics/Rect;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component3", "component4", "component5", "()Z", "component6", "()Landroid/graphics/Rect;", "component7", "component8", "()Lkotlin/jvm/functions/Function2;", "component9", "component10", "component11", "component12", "()Ljava/lang/Integer;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;ZLandroid/graphics/Rect;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;)Lru/ozon/fintech/ui/cardV2/CardV2State;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getSubTitle", "getActionId", "Z", "getCloseOnClick", "Landroid/graphics/Rect;", "getPaddings", "getBackColor", "Lkotlin/jvm/functions/Function2;", "getOnClick", "getIcon", "getSrc", "getIconColor", "Ljava/lang/Integer;", "getRadius", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardV2State implements RecyclerItem {
    private final String actionId;
    private final String backColor;
    private final boolean closeOnClick;
    private final String icon;
    private final String iconColor;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final Integer radius;
    private final String src;
    private final TextAtom subTitle;
    private final TextAtom title;

    /* JADX WARN: Multi-variable type inference failed */
    public CardV2State(@NotNull String id2, TextAtom textAtom, TextAtom textAtom2, String str, boolean z11, @NotNull Rect paddings, String str2, Function2<? super String, ? super Boolean, Unit> function2, String str3, String str4, String str5, Integer num) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.title = textAtom;
        this.subTitle = textAtom2;
        this.actionId = str;
        this.closeOnClick = z11;
        this.paddings = paddings;
        this.backColor = str2;
        this.onClick = function2;
        this.icon = str3;
        this.src = str4;
        this.iconColor = str5;
        this.radius = num;
    }

    public static /* synthetic */ CardV2State copy$default(CardV2State cardV2State, String str, TextAtom textAtom, TextAtom textAtom2, String str2, boolean z11, Rect rect, String str3, Function2 function2, String str4, String str5, String str6, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardV2State.id;
        }
        if ((i11 & 2) != 0) {
            textAtom = cardV2State.title;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = cardV2State.subTitle;
        }
        if ((i11 & 8) != 0) {
            str2 = cardV2State.actionId;
        }
        if ((i11 & 16) != 0) {
            z11 = cardV2State.closeOnClick;
        }
        if ((i11 & 32) != 0) {
            rect = cardV2State.paddings;
        }
        if ((i11 & 64) != 0) {
            str3 = cardV2State.backColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            function2 = cardV2State.onClick;
        }
        if ((i11 & 256) != 0) {
            str4 = cardV2State.icon;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            str5 = cardV2State.src;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str6 = cardV2State.iconColor;
        }
        if ((i11 & 2048) != 0) {
            num = cardV2State.radius;
        }
        String str7 = str6;
        Integer num2 = num;
        String str8 = str4;
        String str9 = str5;
        String str10 = str3;
        Function2 function22 = function2;
        boolean z12 = z11;
        Rect rect2 = rect;
        return cardV2State.copy(str, textAtom, textAtom2, str2, z12, rect2, str10, function22, str8, str9, str7, num2);
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
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component11, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component12, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component3, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component5, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component7, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    public final Function2<String, Boolean, Unit> component8() {
        return this.onClick;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final CardV2State copy(@NotNull String id2, TextAtom title, TextAtom subTitle, String actionId, boolean closeOnClick, @NotNull Rect paddings, String backColor, Function2<? super String, ? super Boolean, Unit> onClick, String icon, String src, String iconColor, Integer radius) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new CardV2State(id2, title, subTitle, actionId, closeOnClick, paddings, backColor, onClick, icon, src, iconColor, radius);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardV2State)) {
            return false;
        }
        CardV2State cardV2State = (CardV2State) other;
        return Intrinsics.d(this.id, cardV2State.id) && Intrinsics.d(this.title, cardV2State.title) && Intrinsics.d(this.subTitle, cardV2State.subTitle) && Intrinsics.d(this.actionId, cardV2State.actionId) && this.closeOnClick == cardV2State.closeOnClick && Intrinsics.d(this.paddings, cardV2State.paddings) && Intrinsics.d(this.backColor, cardV2State.backColor) && Intrinsics.d(this.onClick, cardV2State.onClick) && Intrinsics.d(this.icon, cardV2State.icon) && Intrinsics.d(this.src, cardV2State.src) && Intrinsics.d(this.iconColor, cardV2State.iconColor) && Intrinsics.d(this.radius, cardV2State.radius);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getBackColor() {
        return this.backColor;
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

    public final Integer getRadius() {
        return this.radius;
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
        TextAtom textAtom = this.title;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subTitle;
        int hashCode3 = (hashCode2 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        String str = this.actionId;
        int a11 = d.a(this.paddings, C3532b.a((hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31, this.closeOnClick), 31);
        String str2 = this.backColor;
        int hashCode4 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        int hashCode5 = (hashCode4 + (function2 == null ? 0 : function2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.src;
        int hashCode7 = (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconColor;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        Integer num = this.radius;
        return hashCode8 + (num != null ? num.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        String str2 = this.actionId;
        boolean z11 = this.closeOnClick;
        Rect rect = this.paddings;
        String str3 = this.backColor;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        String str4 = this.icon;
        String str5 = this.src;
        String str6 = this.iconColor;
        Integer num = this.radius;
        StringBuilder d11 = C2436a.d("CardV2State(id=", str, ", title=", ", subTitle=", textAtom);
        d11.append(textAtom2);
        d11.append(", actionId=");
        d11.append(str2);
        d11.append(", closeOnClick=");
        d11.append(z11);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(", backColor=");
        d11.append(str3);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(", icon=");
        Nh.a.h(d11, str4, ", src=", str5, ", iconColor=");
        d11.append(str6);
        d11.append(", radius=");
        d11.append(num);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ CardV2State(String str, TextAtom textAtom, TextAtom textAtom2, String str2, boolean z11, Rect rect, String str3, Function2 function2, String str4, String str5, String str6, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textAtom, textAtom2, str2, z11, (i11 & 32) != 0 ? i.a() : rect, str3, function2, str4, str5, str6, num);
    }
}
