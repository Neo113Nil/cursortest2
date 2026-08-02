package ru.ozon.fintech.ui.actionV2;

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
import ru.ozon.fintech.ui.utils.Gravity;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0017\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\b\u0002\u0010\r\u001a\u00020\f\u0012\b\b\u0002\u0010\u000f\u001a\u00020\u000e\u0012\u001a\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010¢\u0006\u0004\b\u0013\u0010\u0014J\u000f\u0010\u0015\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0017\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJ\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0016J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0016J\u0012\u0010\u001e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001e\u0010\u0016J\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u0016J\u0010\u0010 \u001a\u00020\fHÆ\u0003¢\u0006\u0004\b \u0010!J\u0010\u0010\"\u001a\u00020\u000eHÆ\u0003¢\u0006\u0004\b\"\u0010#J$\u0010$\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0094\u0001\u0010&\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\r\u001a\u00020\f2\b\b\u0002\u0010\u000f\u001a\u00020\u000e2\u001c\b\u0002\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u0010HÆ\u0001¢\u0006\u0004\b&\u0010'J\u0010\u0010(\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b(\u0010\u0016J\u0010\u0010*\u001a\u00020)HÖ\u0001¢\u0006\u0004\b*\u0010+J\u001a\u0010.\u001a\u00020\u000e2\b\u0010-\u001a\u0004\u0018\u00010,HÖ\u0003¢\u0006\u0004\b.\u0010/R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u00100\u001a\u0004\b1\u0010\u0016R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u00102\u001a\u0004\b3\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u00104\u001a\u0004\b5\u0010\u001bR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\b\u00100\u001a\u0004\b6\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\t\u00100\u001a\u0004\b7\u0010\u0016R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\n\u00100\u001a\u0004\b8\u0010\u0016R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b9\u0010\u0016R\u0017\u0010\r\u001a\u00020\f8\u0006¢\u0006\f\n\u0004\b\r\u0010:\u001a\u0004\b;\u0010!R\u0017\u0010\u000f\u001a\u00020\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010<\u001a\u0004\b=\u0010#R+\u0010\u0012\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u000e\u0012\u0004\u0012\u00020\u0011\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0012\u0010>\u001a\u0004\b?\u0010%¨\u0006@"}, d2 = {"Lru/ozon/fintech/ui/actionV2/ActionTextItemV2State;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "text", "Lru/ozon/fintech/ui/utils/Gravity;", "gravity", "actionId", "src", "icon", "iconColor", "Landroid/graphics/Rect;", "paddings", "", "closeOnClick", "Lkotlin/Function2;", "", "onClick", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/fintech/ui/utils/Gravity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;ZLkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component3", "()Lru/ozon/fintech/ui/utils/Gravity;", "component4", "component5", "component6", "component7", "component8", "()Landroid/graphics/Rect;", "component9", "()Z", "component10", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/fintech/ui/utils/Gravity;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Landroid/graphics/Rect;ZLkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/actionV2/ActionTextItemV2State;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getText", "Lru/ozon/fintech/ui/utils/Gravity;", "getGravity", "getActionId", "getSrc", "getIcon", "getIconColor", "Landroid/graphics/Rect;", "getPaddings", "Z", "getCloseOnClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class ActionTextItemV2State implements RecyclerItem {
    private final String actionId;
    private final boolean closeOnClick;
    private final Gravity gravity;
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
    public ActionTextItemV2State(@NotNull String id2, TextAtom textAtom, Gravity gravity, String str, String str2, String str3, String str4, @NotNull Rect paddings, boolean z11, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.text = textAtom;
        this.gravity = gravity;
        this.actionId = str;
        this.src = str2;
        this.icon = str3;
        this.iconColor = str4;
        this.paddings = paddings;
        this.closeOnClick = z11;
        this.onClick = function2;
    }

    public static /* synthetic */ ActionTextItemV2State copy$default(ActionTextItemV2State actionTextItemV2State, String str, TextAtom textAtom, Gravity gravity, String str2, String str3, String str4, String str5, Rect rect, boolean z11, Function2 function2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = actionTextItemV2State.id;
        }
        if ((i11 & 2) != 0) {
            textAtom = actionTextItemV2State.text;
        }
        if ((i11 & 4) != 0) {
            gravity = actionTextItemV2State.gravity;
        }
        if ((i11 & 8) != 0) {
            str2 = actionTextItemV2State.actionId;
        }
        if ((i11 & 16) != 0) {
            str3 = actionTextItemV2State.src;
        }
        if ((i11 & 32) != 0) {
            str4 = actionTextItemV2State.icon;
        }
        if ((i11 & 64) != 0) {
            str5 = actionTextItemV2State.iconColor;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            rect = actionTextItemV2State.paddings;
        }
        if ((i11 & 256) != 0) {
            z11 = actionTextItemV2State.closeOnClick;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            function2 = actionTextItemV2State.onClick;
        }
        boolean z12 = z11;
        Function2 function22 = function2;
        String str6 = str5;
        Rect rect2 = rect;
        String str7 = str3;
        String str8 = str4;
        return actionTextItemV2State.copy(str, textAtom, gravity, str2, str7, str8, str6, rect2, z12, function22);
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

    public final Function2<String, Boolean, Unit> component10() {
        return this.onClick;
    }

    /* renamed from: component2, reason: from getter */
    public final TextAtom getText() {
        return this.text;
    }

    /* renamed from: component3, reason: from getter */
    public final Gravity getGravity() {
        return this.gravity;
    }

    /* renamed from: component4, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component5, reason: from getter */
    public final String getSrc() {
        return this.src;
    }

    /* renamed from: component6, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* renamed from: component8, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    @NotNull
    public final ActionTextItemV2State copy(@NotNull String id2, TextAtom text, Gravity gravity, String actionId, String src, String icon, String iconColor, @NotNull Rect paddings, boolean closeOnClick, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new ActionTextItemV2State(id2, text, gravity, actionId, src, icon, iconColor, paddings, closeOnClick, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionTextItemV2State)) {
            return false;
        }
        ActionTextItemV2State actionTextItemV2State = (ActionTextItemV2State) other;
        return Intrinsics.d(this.id, actionTextItemV2State.id) && Intrinsics.d(this.text, actionTextItemV2State.text) && this.gravity == actionTextItemV2State.gravity && Intrinsics.d(this.actionId, actionTextItemV2State.actionId) && Intrinsics.d(this.src, actionTextItemV2State.src) && Intrinsics.d(this.icon, actionTextItemV2State.icon) && Intrinsics.d(this.iconColor, actionTextItemV2State.iconColor) && Intrinsics.d(this.paddings, actionTextItemV2State.paddings) && this.closeOnClick == actionTextItemV2State.closeOnClick && Intrinsics.d(this.onClick, actionTextItemV2State.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final Gravity getGravity() {
        return this.gravity;
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
        Gravity gravity = this.gravity;
        int hashCode3 = (hashCode2 + (gravity == null ? 0 : gravity.hashCode())) * 31;
        String str = this.actionId;
        int hashCode4 = (hashCode3 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.src;
        int hashCode5 = (hashCode4 + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode6 = (hashCode5 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconColor;
        int a11 = C3532b.a(d.a(this.paddings, (hashCode6 + (str4 == null ? 0 : str4.hashCode())) * 31, 31), 31, this.closeOnClick);
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
        Gravity gravity = this.gravity;
        String str2 = this.actionId;
        String str3 = this.src;
        String str4 = this.icon;
        String str5 = this.iconColor;
        Rect rect = this.paddings;
        boolean z11 = this.closeOnClick;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder d11 = C2436a.d("ActionTextItemV2State(id=", str, ", text=", ", gravity=", textAtom);
        d11.append(gravity);
        d11.append(", actionId=");
        d11.append(str2);
        d11.append(", src=");
        a.h(d11, str3, ", icon=", str4, ", iconColor=");
        d11.append(str5);
        d11.append(", paddings=");
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

    public /* synthetic */ ActionTextItemV2State(String str, TextAtom textAtom, Gravity gravity, String str2, String str3, String str4, String str5, Rect rect, boolean z11, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, textAtom, gravity, str2, str3, str4, str5, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? i.a() : rect, (i11 & 256) != 0 ? false : z11, function2);
    }
}
