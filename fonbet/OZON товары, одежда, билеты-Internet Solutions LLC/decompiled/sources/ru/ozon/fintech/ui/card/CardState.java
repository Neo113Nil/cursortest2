package ru.ozon.fintech.ui.card;

import Ak.C2436a;
import E30.i;
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
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b\u0012\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u000f\b\u0087\b\u0018\u00002\u00020\u0001B]\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b¢\u0006\u0004\b\u000f\u0010\u0010J\u000f\u0010\u0011\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0012J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0012J\u0010\u0010\u0018\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0012J$\u0010\u001b\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJr\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000bHÆ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001f\u0010\u0012J\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020\f2\b\u0010$\u001a\u0004\u0018\u00010#HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010)\u001a\u0004\b+\u0010\u0015R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010'\u001a\u0004\b,\u0010\u0012R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010-\u001a\u0004\b.\u0010\u0019R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u0010'\u001a\u0004\b/\u0010\u0012R+\u0010\u000e\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\r\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\u000e\u00100\u001a\u0004\b1\u0010\u001c¨\u00062"}, d2 = {"Lru/ozon/fintech/ui/card/CardState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "actionId", "Landroid/graphics/Rect;", "paddings", "backColor", "Lkotlin/Function2;", "", "", "onClick", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Landroid/graphics/Rect;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component3", "component4", "component5", "()Landroid/graphics/Rect;", "component6", "component7", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Landroid/graphics/Rect;Ljava/lang/String;Lkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/card/CardState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getSubTitle", "getActionId", "Landroid/graphics/Rect;", "getPaddings", "getBackColor", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class CardState implements RecyclerItem {
    private final String actionId;
    private final String backColor;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final TextAtom subTitle;
    private final TextAtom title;

    /* JADX WARN: Multi-variable type inference failed */
    public CardState(@NotNull String id2, TextAtom textAtom, TextAtom textAtom2, String str, @NotNull Rect paddings, String str2, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.title = textAtom;
        this.subTitle = textAtom2;
        this.actionId = str;
        this.paddings = paddings;
        this.backColor = str2;
        this.onClick = function2;
    }

    public static /* synthetic */ CardState copy$default(CardState cardState, String str, TextAtom textAtom, TextAtom textAtom2, String str2, Rect rect, String str3, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = cardState.id;
        }
        if ((i11 & 2) != 0) {
            textAtom = cardState.title;
        }
        if ((i11 & 4) != 0) {
            textAtom2 = cardState.subTitle;
        }
        if ((i11 & 8) != 0) {
            str2 = cardState.actionId;
        }
        if ((i11 & 16) != 0) {
            rect = cardState.paddings;
        }
        if ((i11 & 32) != 0) {
            str3 = cardState.backColor;
        }
        if ((i11 & 64) != 0) {
            function2 = cardState.onClick;
        }
        String str4 = str3;
        Function2 function22 = function2;
        Rect rect2 = rect;
        TextAtom textAtom3 = textAtom2;
        return cardState.copy(str, textAtom, textAtom3, str2, rect2, str4, function22);
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

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component6, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    public final Function2<String, Boolean, Unit> component7() {
        return this.onClick;
    }

    @NotNull
    public final CardState copy(@NotNull String id2, TextAtom title, TextAtom subTitle, String actionId, @NotNull Rect paddings, String backColor, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new CardState(id2, title, subTitle, actionId, paddings, backColor, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CardState)) {
            return false;
        }
        CardState cardState = (CardState) other;
        return Intrinsics.d(this.id, cardState.id) && Intrinsics.d(this.title, cardState.title) && Intrinsics.d(this.subTitle, cardState.subTitle) && Intrinsics.d(this.actionId, cardState.actionId) && Intrinsics.d(this.paddings, cardState.paddings) && Intrinsics.d(this.backColor, cardState.backColor) && Intrinsics.d(this.onClick, cardState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final String getBackColor() {
        return this.backColor;
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
        int a11 = d.a(this.paddings, (hashCode3 + (str == null ? 0 : str.hashCode())) * 31, 31);
        String str2 = this.backColor;
        int hashCode4 = (a11 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return hashCode4 + (function2 != null ? function2.hashCode() : 0);
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
        Rect rect = this.paddings;
        String str3 = this.backColor;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder d11 = C2436a.d("CardState(id=", str, ", title=", ", subTitle=", textAtom);
        d11.append(textAtom2);
        d11.append(", actionId=");
        d11.append(str2);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(", backColor=");
        d11.append(str3);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ CardState(String str, TextAtom textAtom, TextAtom textAtom2, String str2, Rect rect, String str3, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textAtom, textAtom2, str2, (i11 & 16) != 0 ? i.a() : rect, str3, function2);
    }
}
