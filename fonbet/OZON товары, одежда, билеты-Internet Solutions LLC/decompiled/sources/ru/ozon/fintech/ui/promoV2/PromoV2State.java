package ru.ozon.fintech.ui.promoV2;

import E30.i;
import Kk.C3532b;
import Kk.d;
import N3.C3660k;
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
@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0016\b\u0087\b\u0018\u00002\u00020\u0001B£\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\r\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0002\u0010\u0012\u001a\u00020\u0010\u0012\u001a\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013¢\u0006\u0004\b\u0016\u0010\u0017J\u000f\u0010\u0018\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0019J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0019J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0019J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0019J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0019J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J\u0012\u0010!\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b!\u0010 J\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u0019J\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u0019J\u0012\u0010$\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b$\u0010 J\u0010\u0010%\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b'\u0010(J\u0010\u0010)\u001a\u00020\u0010HÆ\u0003¢\u0006\u0004\b)\u0010(J$\u0010*\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0003¢\u0006\u0004\b*\u0010+JÂ\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\b\b\u0002\u0010\u0012\u001a\u00020\u00102\u001c\b\u0002\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u0013HÆ\u0001¢\u0006\u0004\b,\u0010-J\u0010\u0010.\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b.\u0010\u0019J\u0010\u00100\u001a\u00020/HÖ\u0001¢\u0006\u0004\b0\u00101J\u001a\u00104\u001a\u00020\u00102\b\u00103\u001a\u0004\u0018\u000102HÖ\u0003¢\u0006\u0004\b4\u00105R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00106\u001a\u0004\b7\u0010\u0019R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u00106\u001a\u0004\b8\u0010\u0019R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u00106\u001a\u0004\b9\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u00106\u001a\u0004\b:\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u00106\u001a\u0004\b;\u0010\u0019R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010<\u001a\u0004\b=\u0010 R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010<\u001a\u0004\b>\u0010 R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b?\u0010\u0019R\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u00106\u001a\u0004\b@\u0010\u0019R\u0019\u0010\r\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\r\u0010<\u001a\u0004\bA\u0010 R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010B\u001a\u0004\bC\u0010&R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010D\u001a\u0004\b\u0011\u0010(R\u0017\u0010\u0012\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010D\u001a\u0004\bE\u0010(R+\u0010\u0015\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0010\u0012\u0004\u0012\u00020\u0014\u0018\u00010\u00138\u0006¢\u0006\f\n\u0004\b\u0015\u0010F\u001a\u0004\bG\u0010+¨\u0006H"}, d2 = {"Lru/ozon/fintech/ui/promoV2/PromoV2State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "icon", "iconColor", "iconBackgroundColor", "src", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "actionId", "chevronColor", "iconDigit", "Landroid/graphics/Rect;", "paddings", "", "isNeedChevron", "closeOnClick", "Lkotlin/Function2;", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Landroid/graphics/Rect;ZZLkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component7", "component8", "component9", "component10", "component11", "()Landroid/graphics/Rect;", "component12", "()Z", "component13", "component14", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Landroid/graphics/Rect;ZZLkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/promoV2/PromoV2State;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIcon", "getIconColor", "getIconBackgroundColor", "getSrc", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getSubTitle", "getActionId", "getChevronColor", "getIconDigit", "Landroid/graphics/Rect;", "getPaddings", "Z", "getCloseOnClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromoV2State implements RecyclerItem {
    private final String actionId;
    private final String chevronColor;
    private final boolean closeOnClick;
    private final String icon;
    private final String iconBackgroundColor;
    private final String iconColor;
    private final TextAtom iconDigit;

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
    public PromoV2State(@NotNull String id2, String str, String str2, String str3, String str4, TextAtom textAtom, TextAtom textAtom2, String str5, String str6, TextAtom textAtom3, @NotNull Rect paddings, boolean z11, boolean z12, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.icon = str;
        this.iconColor = str2;
        this.iconBackgroundColor = str3;
        this.src = str4;
        this.title = textAtom;
        this.subTitle = textAtom2;
        this.actionId = str5;
        this.chevronColor = str6;
        this.iconDigit = textAtom3;
        this.paddings = paddings;
        this.isNeedChevron = z11;
        this.closeOnClick = z12;
        this.onClick = function2;
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
    public final TextAtom getIconDigit() {
        return this.iconDigit;
    }

    @NotNull
    /* renamed from: component11, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component12, reason: from getter */
    public final boolean getIsNeedChevron() {
        return this.isNeedChevron;
    }

    /* renamed from: component13, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final Function2<String, Boolean, Unit> component14() {
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
    public final String getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component6, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component7, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component8, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component9, reason: from getter */
    public final String getChevronColor() {
        return this.chevronColor;
    }

    @NotNull
    public final PromoV2State copy(@NotNull String id2, String icon, String iconColor, String iconBackgroundColor, String src, TextAtom title, TextAtom subTitle, String actionId, String chevronColor, TextAtom iconDigit, @NotNull Rect paddings, boolean isNeedChevron, boolean closeOnClick, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new PromoV2State(id2, icon, iconColor, iconBackgroundColor, src, title, subTitle, actionId, chevronColor, iconDigit, paddings, isNeedChevron, closeOnClick, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoV2State)) {
            return false;
        }
        PromoV2State promoV2State = (PromoV2State) other;
        return Intrinsics.d(this.id, promoV2State.id) && Intrinsics.d(this.icon, promoV2State.icon) && Intrinsics.d(this.iconColor, promoV2State.iconColor) && Intrinsics.d(this.iconBackgroundColor, promoV2State.iconBackgroundColor) && Intrinsics.d(this.src, promoV2State.src) && Intrinsics.d(this.title, promoV2State.title) && Intrinsics.d(this.subTitle, promoV2State.subTitle) && Intrinsics.d(this.actionId, promoV2State.actionId) && Intrinsics.d(this.chevronColor, promoV2State.chevronColor) && Intrinsics.d(this.iconDigit, promoV2State.iconDigit) && Intrinsics.d(this.paddings, promoV2State.paddings) && this.isNeedChevron == promoV2State.isNeedChevron && this.closeOnClick == promoV2State.closeOnClick && Intrinsics.d(this.onClick, promoV2State.onClick);
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

    public final String getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    public final String getIconColor() {
        return this.iconColor;
    }

    public final TextAtom getIconDigit() {
        return this.iconDigit;
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
        String str3 = this.iconBackgroundColor;
        int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.src;
        int hashCode5 = (hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode6 = (hashCode5 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subTitle;
        int hashCode7 = (hashCode6 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        String str5 = this.actionId;
        int hashCode8 = (hashCode7 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.chevronColor;
        int hashCode9 = (hashCode8 + (str6 == null ? 0 : str6.hashCode())) * 31;
        TextAtom textAtom3 = this.iconDigit;
        int a11 = C3532b.a(C3532b.a(d.a(this.paddings, (hashCode9 + (textAtom3 == null ? 0 : textAtom3.hashCode())) * 31, 31), 31, this.isNeedChevron), 31, this.closeOnClick);
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
        String str4 = this.iconBackgroundColor;
        String str5 = this.src;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        String str6 = this.actionId;
        String str7 = this.chevronColor;
        TextAtom textAtom3 = this.iconDigit;
        Rect rect = this.paddings;
        boolean z11 = this.isNeedChevron;
        boolean z12 = this.closeOnClick;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder d11 = C3660k.d("PromoV2State(id=", str, ", icon=", str2, ", iconColor=");
        Nh.a.h(d11, str3, ", iconBackgroundColor=", str4, ", src=");
        d11.append(str5);
        d11.append(", title=");
        d11.append(textAtom);
        d11.append(", subTitle=");
        d11.append(textAtom2);
        d11.append(", actionId=");
        d11.append(str6);
        d11.append(", chevronColor=");
        d11.append(str7);
        d11.append(", iconDigit=");
        d11.append(textAtom3);
        d11.append(", paddings=");
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

    public /* synthetic */ PromoV2State(String str, String str2, String str3, String str4, String str5, TextAtom textAtom, TextAtom textAtom2, String str6, String str7, TextAtom textAtom3, Rect rect, boolean z11, boolean z12, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, textAtom, textAtom2, str6, str7, textAtom3, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? i.a() : rect, (i11 & 2048) != 0 ? false : z11, (i11 & 4096) != 0 ? true : z12, function2);
    }
}
