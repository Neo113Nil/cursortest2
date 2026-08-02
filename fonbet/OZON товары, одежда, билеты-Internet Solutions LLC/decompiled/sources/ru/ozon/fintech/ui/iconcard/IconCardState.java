package ru.ozon.fintech.ui.iconcard;

import B0.C2454a;
import B4.V;
import E30.i;
import Ef0.c;
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
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\u0010\u0002\n\u0002\b#\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0087\b\u0018\u00002\u00020\u0001BÕ\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0006\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0012\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0016\u001a\u0004\u0018\u00010\u0002\u0012\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017\u0012\b\b\u0002\u0010\u001b\u001a\u00020\u0018¢\u0006\u0004\b\u001c\u0010\u001dJ\u000f\u0010\u001e\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001fJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001fJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001fJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0012\u0010%\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b%\u0010$J\u0012\u0010&\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b&\u0010$J\u0010\u0010'\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b'\u0010(J\u0012\u0010)\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b+\u0010\u001fJ\u0012\u0010,\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b,\u0010\u001fJ\u0012\u0010-\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b-\u0010\u001fJ\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001fJ\u0012\u0010/\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b/\u0010$J\u0012\u00100\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b0\u0010\u001fJ\u0012\u00101\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b1\u0010\u001fJ\u0012\u00102\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b2\u0010\u001fJ\u0012\u00103\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b3\u0010\u001fJ$\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0017HÆ\u0003¢\u0006\u0004\b4\u00105J\u0010\u00106\u001a\u00020\u0018HÆ\u0003¢\u0006\u0004\b6\u00107J\u0080\u0002\u00108\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0016\u001a\u0004\u0018\u00010\u00022\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00172\b\b\u0002\u0010\u001b\u001a\u00020\u0018HÆ\u0001¢\u0006\u0004\b8\u00109J\u0010\u0010:\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b:\u0010\u001fJ\u0010\u0010;\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b;\u0010<J\u001a\u0010?\u001a\u00020\u00182\b\u0010>\u001a\u0004\u0018\u00010=HÖ\u0003¢\u0006\u0004\b?\u0010@R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010A\u001a\u0004\bB\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010A\u001a\u0004\bC\u0010\u001fR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010A\u001a\u0004\bD\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010E\u001a\u0004\bF\u0010$R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010E\u001a\u0004\bG\u0010$R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010E\u001a\u0004\bH\u0010$R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010I\u001a\u0004\bJ\u0010(R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010K\u001a\u0004\bL\u0010*R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000e\u0010A\u001a\u0004\bM\u0010\u001fR\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000f\u0010A\u001a\u0004\bN\u0010\u001fR\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0010\u0010A\u001a\u0004\bO\u0010\u001fR\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0011\u0010A\u001a\u0004\bP\u0010\u001fR\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0012\u0010E\u001a\u0004\bQ\u0010$R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0013\u0010A\u001a\u0004\bR\u0010\u001fR\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0014\u0010A\u001a\u0004\bS\u0010\u001fR\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010A\u001a\u0004\bT\u0010\u001fR\u0019\u0010\u0016\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0016\u0010A\u001a\u0004\bU\u0010\u001fR+\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0018\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00178\u0006¢\u0006\f\n\u0004\b\u001a\u0010V\u001a\u0004\bW\u00105R\u0017\u0010\u001b\u001a\u00020\u00188\u0006¢\u0006\f\n\u0004\b\u001b\u0010X\u001a\u0004\bY\u00107¨\u0006Z"}, d2 = {"Lru/ozon/fintech/ui/iconcard/IconCardState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "actionId", "backColor", "", "radius", "width", "height", "Landroid/graphics/Rect;", "paddings", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "icon", "iconSrc", "iconColor", "iconBackgroundColor", "iconRadius", "secondaryIcon", "secondaryIconSrc", "secondaryIconColor", "secondaryIconBackgroundColor", "Lkotlin/Function2;", "", "", "onClick", "closeOnClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Rect;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Z)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "()Ljava/lang/Integer;", "component5", "component6", "component7", "()Landroid/graphics/Rect;", "component8", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component9", "component10", "component11", "component12", "component13", "component14", "component15", "component16", "component17", "component18", "()Lkotlin/jvm/functions/Function2;", "component19", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;Ljava/lang/Integer;Landroid/graphics/Rect;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function2;Z)Lru/ozon/fintech/ui/iconcard/IconCardState;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getActionId", "getBackColor", "Ljava/lang/Integer;", "getRadius", "getWidth", "getHeight", "Landroid/graphics/Rect;", "getPaddings", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getIcon", "getIconSrc", "getIconColor", "getIconBackgroundColor", "getIconRadius", "getSecondaryIcon", "getSecondaryIconSrc", "getSecondaryIconColor", "getSecondaryIconBackgroundColor", "Lkotlin/jvm/functions/Function2;", "getOnClick", "Z", "getCloseOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class IconCardState implements RecyclerItem {
    private final String actionId;
    private final String backColor;
    private final boolean closeOnClick;
    private final Integer height;
    private final String icon;
    private final String iconBackgroundColor;
    private final String iconColor;
    private final Integer iconRadius;
    private final String iconSrc;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final Integer radius;
    private final String secondaryIcon;
    private final String secondaryIconBackgroundColor;
    private final String secondaryIconColor;
    private final String secondaryIconSrc;
    private final TextAtom title;
    private final Integer width;

    /* JADX WARN: Multi-variable type inference failed */
    public IconCardState(@NotNull String id2, String str, String str2, Integer num, Integer num2, Integer num3, @NotNull Rect paddings, TextAtom textAtom, String str3, String str4, String str5, String str6, Integer num4, String str7, String str8, String str9, String str10, Function2<? super String, ? super Boolean, Unit> function2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.actionId = str;
        this.backColor = str2;
        this.radius = num;
        this.width = num2;
        this.height = num3;
        this.paddings = paddings;
        this.title = textAtom;
        this.icon = str3;
        this.iconSrc = str4;
        this.iconColor = str5;
        this.iconBackgroundColor = str6;
        this.iconRadius = num4;
        this.secondaryIcon = str7;
        this.secondaryIconSrc = str8;
        this.secondaryIconColor = str9;
        this.secondaryIconBackgroundColor = str10;
        this.onClick = function2;
        this.closeOnClick = z11;
    }

    public static /* synthetic */ IconCardState copy$default(IconCardState iconCardState, String str, String str2, String str3, Integer num, Integer num2, Integer num3, Rect rect, TextAtom textAtom, String str4, String str5, String str6, String str7, Integer num4, String str8, String str9, String str10, String str11, Function2 function2, boolean z11, int i11, Object obj) {
        boolean z12;
        Function2 function22;
        String str12 = (i11 & 1) != 0 ? iconCardState.id : str;
        String str13 = (i11 & 2) != 0 ? iconCardState.actionId : str2;
        String str14 = (i11 & 4) != 0 ? iconCardState.backColor : str3;
        Integer num5 = (i11 & 8) != 0 ? iconCardState.radius : num;
        Integer num6 = (i11 & 16) != 0 ? iconCardState.width : num2;
        Integer num7 = (i11 & 32) != 0 ? iconCardState.height : num3;
        Rect rect2 = (i11 & 64) != 0 ? iconCardState.paddings : rect;
        TextAtom textAtom2 = (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? iconCardState.title : textAtom;
        String str15 = (i11 & 256) != 0 ? iconCardState.icon : str4;
        String str16 = (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? iconCardState.iconSrc : str5;
        String str17 = (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? iconCardState.iconColor : str6;
        String str18 = (i11 & 2048) != 0 ? iconCardState.iconBackgroundColor : str7;
        Integer num8 = (i11 & 4096) != 0 ? iconCardState.iconRadius : num4;
        String str19 = (i11 & 8192) != 0 ? iconCardState.secondaryIcon : str8;
        String str20 = str12;
        String str21 = (i11 & 16384) != 0 ? iconCardState.secondaryIconSrc : str9;
        String str22 = (i11 & 32768) != 0 ? iconCardState.secondaryIconColor : str10;
        String str23 = (i11 & 65536) != 0 ? iconCardState.secondaryIconBackgroundColor : str11;
        Function2 function23 = (i11 & 131072) != 0 ? iconCardState.onClick : function2;
        if ((i11 & 262144) != 0) {
            function22 = function23;
            z12 = iconCardState.closeOnClick;
        } else {
            z12 = z11;
            function22 = function23;
        }
        return iconCardState.copy(str20, str13, str14, num5, num6, num7, rect2, textAtom2, str15, str16, str17, str18, num8, str19, str21, str22, str23, function22, z12);
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
    public final String getIconSrc() {
        return this.iconSrc;
    }

    /* renamed from: component11, reason: from getter */
    public final String getIconColor() {
        return this.iconColor;
    }

    /* renamed from: component12, reason: from getter */
    public final String getIconBackgroundColor() {
        return this.iconBackgroundColor;
    }

    /* renamed from: component13, reason: from getter */
    public final Integer getIconRadius() {
        return this.iconRadius;
    }

    /* renamed from: component14, reason: from getter */
    public final String getSecondaryIcon() {
        return this.secondaryIcon;
    }

    /* renamed from: component15, reason: from getter */
    public final String getSecondaryIconSrc() {
        return this.secondaryIconSrc;
    }

    /* renamed from: component16, reason: from getter */
    public final String getSecondaryIconColor() {
        return this.secondaryIconColor;
    }

    /* renamed from: component17, reason: from getter */
    public final String getSecondaryIconBackgroundColor() {
        return this.secondaryIconBackgroundColor;
    }

    public final Function2<String, Boolean, Unit> component18() {
        return this.onClick;
    }

    /* renamed from: component19, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    /* renamed from: component2, reason: from getter */
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component3, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    /* renamed from: component4, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getWidth() {
        return this.width;
    }

    /* renamed from: component6, reason: from getter */
    public final Integer getHeight() {
        return this.height;
    }

    @NotNull
    /* renamed from: component7, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component8, reason: from getter */
    public final TextAtom getTitle() {
        return this.title;
    }

    /* renamed from: component9, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final IconCardState copy(@NotNull String id2, String actionId, String backColor, Integer radius, Integer width, Integer height, @NotNull Rect paddings, TextAtom title, String icon, String iconSrc, String iconColor, String iconBackgroundColor, Integer iconRadius, String secondaryIcon, String secondaryIconSrc, String secondaryIconColor, String secondaryIconBackgroundColor, Function2<? super String, ? super Boolean, Unit> onClick, boolean closeOnClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new IconCardState(id2, actionId, backColor, radius, width, height, paddings, title, icon, iconSrc, iconColor, iconBackgroundColor, iconRadius, secondaryIcon, secondaryIconSrc, secondaryIconColor, secondaryIconBackgroundColor, onClick, closeOnClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof IconCardState)) {
            return false;
        }
        IconCardState iconCardState = (IconCardState) other;
        return Intrinsics.d(this.id, iconCardState.id) && Intrinsics.d(this.actionId, iconCardState.actionId) && Intrinsics.d(this.backColor, iconCardState.backColor) && Intrinsics.d(this.radius, iconCardState.radius) && Intrinsics.d(this.width, iconCardState.width) && Intrinsics.d(this.height, iconCardState.height) && Intrinsics.d(this.paddings, iconCardState.paddings) && Intrinsics.d(this.title, iconCardState.title) && Intrinsics.d(this.icon, iconCardState.icon) && Intrinsics.d(this.iconSrc, iconCardState.iconSrc) && Intrinsics.d(this.iconColor, iconCardState.iconColor) && Intrinsics.d(this.iconBackgroundColor, iconCardState.iconBackgroundColor) && Intrinsics.d(this.iconRadius, iconCardState.iconRadius) && Intrinsics.d(this.secondaryIcon, iconCardState.secondaryIcon) && Intrinsics.d(this.secondaryIconSrc, iconCardState.secondaryIconSrc) && Intrinsics.d(this.secondaryIconColor, iconCardState.secondaryIconColor) && Intrinsics.d(this.secondaryIconBackgroundColor, iconCardState.secondaryIconBackgroundColor) && Intrinsics.d(this.onClick, iconCardState.onClick) && this.closeOnClick == iconCardState.closeOnClick;
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

    public final Integer getHeight() {
        return this.height;
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

    public final Integer getIconRadius() {
        return this.iconRadius;
    }

    public final String getIconSrc() {
        return this.iconSrc;
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

    public final String getSecondaryIcon() {
        return this.secondaryIcon;
    }

    public final String getSecondaryIconBackgroundColor() {
        return this.secondaryIconBackgroundColor;
    }

    public final String getSecondaryIconColor() {
        return this.secondaryIconColor;
    }

    public final String getSecondaryIconSrc() {
        return this.secondaryIconSrc;
    }

    public final TextAtom getTitle() {
        return this.title;
    }

    public final Integer getWidth() {
        return this.width;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.actionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.backColor;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.radius;
        int hashCode4 = (hashCode3 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.width;
        int hashCode5 = (hashCode4 + (num2 == null ? 0 : num2.hashCode())) * 31;
        Integer num3 = this.height;
        int a11 = d.a(this.paddings, (hashCode5 + (num3 == null ? 0 : num3.hashCode())) * 31, 31);
        TextAtom textAtom = this.title;
        int hashCode6 = (a11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str3 = this.icon;
        int hashCode7 = (hashCode6 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.iconSrc;
        int hashCode8 = (hashCode7 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.iconColor;
        int hashCode9 = (hashCode8 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.iconBackgroundColor;
        int hashCode10 = (hashCode9 + (str6 == null ? 0 : str6.hashCode())) * 31;
        Integer num4 = this.iconRadius;
        int hashCode11 = (hashCode10 + (num4 == null ? 0 : num4.hashCode())) * 31;
        String str7 = this.secondaryIcon;
        int hashCode12 = (hashCode11 + (str7 == null ? 0 : str7.hashCode())) * 31;
        String str8 = this.secondaryIconSrc;
        int hashCode13 = (hashCode12 + (str8 == null ? 0 : str8.hashCode())) * 31;
        String str9 = this.secondaryIconColor;
        int hashCode14 = (hashCode13 + (str9 == null ? 0 : str9.hashCode())) * 31;
        String str10 = this.secondaryIconBackgroundColor;
        int hashCode15 = (hashCode14 + (str10 == null ? 0 : str10.hashCode())) * 31;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return Boolean.hashCode(this.closeOnClick) + ((hashCode15 + (function2 != null ? function2.hashCode() : 0)) * 31);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.actionId;
        String str3 = this.backColor;
        Integer num = this.radius;
        Integer num2 = this.width;
        Integer num3 = this.height;
        Rect rect = this.paddings;
        TextAtom textAtom = this.title;
        String str4 = this.icon;
        String str5 = this.iconSrc;
        String str6 = this.iconColor;
        String str7 = this.iconBackgroundColor;
        Integer num4 = this.iconRadius;
        String str8 = this.secondaryIcon;
        String str9 = this.secondaryIconSrc;
        String str10 = this.secondaryIconColor;
        String str11 = this.secondaryIconBackgroundColor;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        boolean z11 = this.closeOnClick;
        StringBuilder d11 = C3660k.d("IconCardState(id=", str, ", actionId=", str2, ", backColor=");
        C2454a.f(num, str3, ", radius=", ", width=", d11);
        c.e(d11, num2, ", height=", num3, ", paddings=");
        d11.append(rect);
        d11.append(", title=");
        d11.append(textAtom);
        d11.append(", icon=");
        Nh.a.h(d11, str4, ", iconSrc=", str5, ", iconColor=");
        Nh.a.h(d11, str6, ", iconBackgroundColor=", str7, ", iconRadius=");
        V.f(num4, ", secondaryIcon=", str8, ", secondaryIconSrc=", d11);
        Nh.a.h(d11, str9, ", secondaryIconColor=", str10, ", secondaryIconBackgroundColor=");
        d11.append(str11);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(", closeOnClick=");
        return Pk0.a.a(")", d11, z11);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ IconCardState(String str, String str2, String str3, Integer num, Integer num2, Integer num3, Rect rect, TextAtom textAtom, String str4, String str5, String str6, String str7, Integer num4, String str8, String str9, String str10, String str11, Function2 function2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, num, num2, num3, (i11 & 64) != 0 ? i.a() : rect, textAtom, str4, str5, str6, str7, num4, str8, str9, str10, str11, function2, (i11 & 262144) != 0 ? true : z11);
    }
}
