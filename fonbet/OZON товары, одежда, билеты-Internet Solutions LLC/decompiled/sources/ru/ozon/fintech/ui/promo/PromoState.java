package ru.ozon.fintech.ui.promo;

import E30.i;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0013\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0010\b\u0087\b\u0018\u00002\u00020\u0001Bg\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\u001a\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011J\u000f\u0010\u0012\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0013J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0013J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0013J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0018J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0018J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0013J\u0010\u0010\u001b\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ$\u0010\u001d\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ~\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\u001c\b\u0002\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u001f\u0010 J\u0010\u0010!\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b!\u0010\u0013J\u0010\u0010#\u001a\u00020\"HÖ\u0001¢\u0006\u0004\b#\u0010$J\u001a\u0010'\u001a\u00020\r2\b\u0010&\u001a\u0004\u0018\u00010%HÖ\u0003¢\u0006\u0004\b'\u0010(R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010)\u001a\u0004\b*\u0010\u0013R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010)\u001a\u0004\b+\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b,\u0010\u0013R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010-\u001a\u0004\b.\u0010\u0018R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010-\u001a\u0004\b/\u0010\u0018R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010)\u001a\u0004\b0\u0010\u0013R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00101\u001a\u0004\b2\u0010\u001cR+\u0010\u000f\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u00103\u001a\u0004\b4\u0010\u001e¨\u00065"}, d2 = {"Lru/ozon/fintech/ui/promo/PromoState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "icon", "src", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "actionId", "Landroid/graphics/Rect;", "paddings", "Lkotlin/Function2;", "", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component5", "component6", "component7", "()Landroid/graphics/Rect;", "component8", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Landroid/graphics/Rect;Lkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/promo/PromoState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIcon", "getSrc", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getSubTitle", "getActionId", "Landroid/graphics/Rect;", "getPaddings", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class PromoState implements RecyclerItem {
    private final String actionId;
    private final String icon;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final String src;
    private final TextAtom subTitle;
    private final TextAtom title;

    /* JADX WARN: Multi-variable type inference failed */
    public PromoState(@NotNull String id2, String str, String str2, TextAtom textAtom, TextAtom textAtom2, String str3, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.icon = str;
        this.src = str2;
        this.title = textAtom;
        this.subTitle = textAtom2;
        this.actionId = str3;
        this.paddings = paddings;
        this.onClick = function2;
    }

    public static /* synthetic */ PromoState copy$default(PromoState promoState, String str, String str2, String str3, TextAtom textAtom, TextAtom textAtom2, String str4, Rect rect, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = promoState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = promoState.icon;
        }
        if ((i11 & 4) != 0) {
            str3 = promoState.src;
        }
        if ((i11 & 8) != 0) {
            textAtom = promoState.title;
        }
        if ((i11 & 16) != 0) {
            textAtom2 = promoState.subTitle;
        }
        if ((i11 & 32) != 0) {
            str4 = promoState.actionId;
        }
        if ((i11 & 64) != 0) {
            rect = promoState.paddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            function2 = promoState.onClick;
        }
        Rect rect2 = rect;
        Function2 function22 = function2;
        TextAtom textAtom3 = textAtom2;
        String str5 = str4;
        return promoState.copy(str, str2, str3, textAtom, textAtom3, str5, rect2, function22);
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

    /* renamed from: component2, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component4, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component5, reason: from getter */
    public final TextAtom getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component6, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    public final Function2<String, Boolean, Unit> component8() {
        return this.onClick;
    }

    @NotNull
    public final PromoState copy(@NotNull String id2, String icon, String src, TextAtom title, TextAtom subTitle, String actionId, @NotNull Rect paddings, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new PromoState(id2, icon, src, title, subTitle, actionId, paddings, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PromoState)) {
            return false;
        }
        PromoState promoState = (PromoState) other;
        return Intrinsics.d(this.id, promoState.id) && Intrinsics.d(this.icon, promoState.icon) && Intrinsics.d(this.src, promoState.src) && Intrinsics.d(this.title, promoState.title) && Intrinsics.d(this.subTitle, promoState.subTitle) && Intrinsics.d(this.actionId, promoState.actionId) && Intrinsics.d(this.paddings, promoState.paddings) && Intrinsics.d(this.onClick, promoState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getIcon() {
        return this.icon;
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
        String str2 = this.src;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        TextAtom textAtom = this.title;
        int hashCode4 = (hashCode3 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        TextAtom textAtom2 = this.subTitle;
        int hashCode5 = (hashCode4 + (textAtom2 == null ? 0 : textAtom2.hashCode())) * 31;
        String str3 = this.actionId;
        int a11 = d.a(this.paddings, (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31, 31);
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
        String str = this.id;
        String str2 = this.icon;
        String str3 = this.src;
        TextAtom textAtom = this.title;
        TextAtom textAtom2 = this.subTitle;
        String str4 = this.actionId;
        Rect rect = this.paddings;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder d11 = C3660k.d("PromoState(id=", str, ", icon=", str2, ", src=");
        d11.append(str3);
        d11.append(", title=");
        d11.append(textAtom);
        d11.append(", subTitle=");
        d11.append(textAtom2);
        d11.append(", actionId=");
        d11.append(str4);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ PromoState(String str, String str2, String str3, TextAtom textAtom, TextAtom textAtom2, String str4, Rect rect, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, textAtom, textAtom2, str4, (i11 & 64) != 0 ? i.a() : rect, function2);
    }
}
