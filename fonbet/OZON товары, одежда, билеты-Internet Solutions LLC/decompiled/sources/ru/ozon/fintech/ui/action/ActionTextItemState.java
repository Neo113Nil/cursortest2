package ru.ozon.fintech.ui.action;

import Ak.C2436a;
import E30.i;
import Kk.C3532b;
import Kk.d;
import Nh.a;
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
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0015\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001Bq\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0013\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0014J\u0012\u0010\u0016\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0019\u0010\u0014J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0014J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0014J\u0010\u0010\u001c\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\fHÆ\u0003¢\u0006\u0004\b\u001e\u0010\u001fJ$\u0010 \u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b \u0010!J\u0088\u0001\u0010\"\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u000b\u001a\u00020\n2\b\b\u0002\u0010\r\u001a\u00020\f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0001¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b$\u0010\u0014J\u0010\u0010&\u001a\u00020%HÖ\u0001¢\u0006\u0004\b&\u0010'J\u001a\u0010*\u001a\u00020\f2\b\u0010)\u001a\u0004\u0018\u00010(HÖ\u0003¢\u0006\u0004\b*\u0010+R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010,\u001a\u0004\b-\u0010\u0014R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010.\u001a\u0004\b/\u0010\u0017R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010,\u001a\u0004\b0\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b1\u0010\u0014R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b2\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b3\u0010\u0014R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00104\u001a\u0004\b5\u0010\u001dR\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u00106\u001a\u0004\b7\u0010\u001fR+\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u00108\u001a\u0004\b9\u0010!¨\u0006:"}, d2 = {"Lru/ozon/fintech/ui/action/ActionTextItemState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "actionId", "src", "icon", "iconColor", "Landroid/graphics/Rect;", "paddings", "", "closeOnClick", "Lkotlin/Function2;", "", "onClick", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;ZLkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component3", "component4", "component5", "component6", "component7", "()Landroid/graphics/Rect;", "component8", "()Z", "component9", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;ZLkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/action/ActionTextItemState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "getActionId", "getSrc", "getIcon", "getIconColor", "Landroid/graphics/Rect;", "getPaddings", "Z", "getCloseOnClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionTextItemState implements RecyclerItem {
    private final String actionId;
    private final boolean closeOnClick;
    private final String icon;
    private final String iconColor;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final String src;
    private final TextAtom text;

    /* JADX WARN: Multi-variable type inference failed */
    public ActionTextItemState(@NotNull String id2, TextAtom textAtom, String str, String str2, String str3, String str4, @NotNull Rect paddings, boolean z11, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.text = textAtom;
        this.actionId = str;
        this.src = str2;
        this.icon = str3;
        this.iconColor = str4;
        this.paddings = paddings;
        this.closeOnClick = z11;
        this.onClick = function2;
    }

    public static /* synthetic */ ActionTextItemState copy$default(ActionTextItemState actionTextItemState, String str, TextAtom textAtom, String str2, String str3, String str4, String str5, Rect rect, boolean z11, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionTextItemState.id;
        }
        if ((i11 & 2) != 0) {
            textAtom = actionTextItemState.text;
        }
        if ((i11 & 4) != 0) {
            str2 = actionTextItemState.actionId;
        }
        if ((i11 & 8) != 0) {
            str3 = actionTextItemState.src;
        }
        if ((i11 & 16) != 0) {
            str4 = actionTextItemState.icon;
        }
        if ((i11 & 32) != 0) {
            str5 = actionTextItemState.iconColor;
        }
        if ((i11 & 64) != 0) {
            rect = actionTextItemState.paddings;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            z11 = actionTextItemState.closeOnClick;
        }
        if ((i11 & 256) != 0) {
            function2 = actionTextItemState.onClick;
        }
        boolean z12 = z11;
        Function2 function22 = function2;
        String str6 = str5;
        Rect rect2 = rect;
        String str7 = str4;
        String str8 = str2;
        return actionTextItemState.copy(str, textAtom, str8, str3, str7, str6, rect2, z12, function22);
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
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component4, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component5, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component8, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final Function2<String, Boolean, Unit> component9() {
        return this.onClick;
    }

    @NotNull
    public final ActionTextItemState copy(@NotNull String id2, TextAtom text, String actionId, String src, String icon, String iconColor, @NotNull Rect paddings, boolean closeOnClick, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new ActionTextItemState(id2, text, actionId, src, icon, iconColor, paddings, closeOnClick, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionTextItemState)) {
            return false;
        }
        ActionTextItemState actionTextItemState = (ActionTextItemState) other;
        return Intrinsics.d(this.id, actionTextItemState.id) && Intrinsics.d(this.text, actionTextItemState.text) && Intrinsics.d(this.actionId, actionTextItemState.actionId) && Intrinsics.d(this.src, actionTextItemState.src) && Intrinsics.d(this.icon, actionTextItemState.icon) && Intrinsics.d(this.iconColor, actionTextItemState.iconColor) && Intrinsics.d(this.paddings, actionTextItemState.paddings) && this.closeOnClick == actionTextItemState.closeOnClick && Intrinsics.d(this.onClick, actionTextItemState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
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

    public final TextAtom getText() {
        return this.text;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        TextAtom textAtom = this.text;
        int hashCode2 = (hashCode + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str = this.actionId;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.src;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode5 = (hashCode4 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconColor;
        int a11 = C3532b.a(d.a(this.paddings, (hashCode5 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.closeOnClick);
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
        TextAtom textAtom = this.text;
        String str2 = this.actionId;
        String str3 = this.src;
        String str4 = this.icon;
        String str5 = this.iconColor;
        Rect rect = this.paddings;
        boolean z11 = this.closeOnClick;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder d11 = C2436a.d("ActionTextItemState(id=", str, ", text=", ", actionId=", textAtom);
        a.h(d11, str2, ", src=", str3, ", icon=");
        a.h(d11, str4, ", iconColor=", str5, ", paddings=");
        d11.append(rect);
        d11.append(", closeOnClick=");
        d11.append(z11);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ ActionTextItemState(String str, TextAtom textAtom, String str2, String str3, String str4, String str5, Rect rect, boolean z11, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textAtom, str2, str3, str4, str5, (i11 & 64) != 0 ? i.a() : rect, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? false : z11, function2);
    }
}
