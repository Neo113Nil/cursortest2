package ru.ozon.fintech.features.offline.ui.itemcard;

import G.g;
import N3.C3660k;
import Nh.a;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Keep
@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B?\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0003\u0012\u0012\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\u0004\b\n\u0010\u000bJ\b\u0010\u0013\u001a\u00020\u0003H\u0016J\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0015\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0016\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0017\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u0018\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0003JI\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00032\u0014\b\u0002\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\bHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0013\u0010\u0005\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\rR\u0011\u0010\u0006\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\rR\u001d\u0010\u0007\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\t0\b¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012¨\u0006!"}, d2 = {"Lru/ozon/fintech/features/offline/ui/itemcard/IconTextCardState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", "icon", "iconColor", "text", "onClick", "Lkotlin/Function1;", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;)V", "getId", "()Ljava/lang/String;", "getIcon", "getIconColor", "getText", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "provideId", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "offline_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IconTextCardState implements RecyclerItem {

    @NotNull
    private final String icon;
    private final String iconColor;

    @NotNull
    private final String id;

    @NotNull
    private final Function1<String, Unit> onClick;

    @NotNull
    private final String text;

    /* JADX WARN: Multi-variable type inference failed */
    public IconTextCardState(@NotNull String id2, @NotNull String icon, String str, @NotNull String text, @NotNull Function1<? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        this.id = id2;
        this.icon = icon;
        this.iconColor = str;
        this.text = text;
        this.onClick = onClick;
    }

    public static /* synthetic */ IconTextCardState copy$default(IconTextCardState iconTextCardState, String str, String str2, String str3, String str4, Function1 function1, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = iconTextCardState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = iconTextCardState.icon;
        }
        if ((i11 & 4) != 0) {
            str3 = iconTextCardState.iconColor;
        }
        if ((i11 & 8) != 0) {
            str4 = iconTextCardState.text;
        }
        if ((i11 & 16) != 0) {
            function1 = iconTextCardState.onClick;
        }
        Function1 function12 = function1;
        String str5 = str3;
        return iconTextCardState.copy(str, str2, str5, str4, function12);
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
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component3, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getText() {
        return this.text;
    }

    @NotNull
    public final Function1<String, Unit> component5() {
        return this.onClick;
    }

    @NotNull
    public final IconTextCardState copy(@NotNull String id2, @NotNull String icon, String iconColor, @NotNull String text, @NotNull Function1<? super String, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(icon, "icon");
        Intrinsics.checkNotNullParameter(text, "text");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        return new IconTextCardState(id2, icon, iconColor, text, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconTextCardState)) {
            return false;
        }
        IconTextCardState iconTextCardState = (IconTextCardState) other;
        return Intrinsics.d(this.id, iconTextCardState.id) && Intrinsics.d(this.icon, iconTextCardState.icon) && Intrinsics.d(this.iconColor, iconTextCardState.iconColor) && Intrinsics.d(this.text, iconTextCardState.text) && Intrinsics.d(this.onClick, iconTextCardState.onClick);
    }

    @NotNull
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

    @NotNull
    public final Function1<String, Unit> getOnClick() {
        return this.onClick;
    }

    @NotNull
    public final String getText() {
        return this.text;
    }

    public int hashCode() {
        int a11 = g.a(this.id.hashCode() * 31, 31, this.icon);
        String str = this.iconColor;
        return this.onClick.hashCode() + g.a((a11 + (str == null ? 0 : str.hashCode())) * 31, 31, this.text);
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
        String str4 = this.text;
        Function1<String, Unit> function1 = this.onClick;
        StringBuilder d11 = C3660k.d("IconTextCardState(id=", str, ", icon=", str2, ", iconColor=");
        a.h(d11, str3, ", text=", str4, ", onClick=");
        d11.append(function1);
        d11.append(")");
        return d11.toString();
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ IconTextCardState(String str, String str2, String str3, String str4, Function1 function1, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : str3, str4, function1);
    }
}
