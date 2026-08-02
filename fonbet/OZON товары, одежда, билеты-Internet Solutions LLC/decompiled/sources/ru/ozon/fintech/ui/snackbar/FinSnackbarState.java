package ru.ozon.fintech.ui.snackbar;

import B90.C2619v;
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
import ru.ozon.fintech.ui.buttonatom.ButtonAtomWrapperState;
import ru.ozon.fintech.ui.progress.circle.CircleProgressWithNumberState;
import ru.ozon.fintech.ui.progress.horizontal.HorizontalProgressState;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Keep
@Metadata(d1 = {"\u0000T\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001f\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001b\b\u0087\b\u0018\u00002\u00020\u0001B»\u0001\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u0011\u0012\b\b\u0002\u0010\u0014\u001a\u00020\u0013\u0012\b\b\u0002\u0010\u0016\u001a\u00020\u0015\u0012\b\b\u0002\u0010\u0017\u001a\u00020\u0015\u0012\u001a\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018¢\u0006\u0004\b\u001b\u0010\u001cJ\u000f\u0010\u001d\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u001d\u0010\u001eJ\u0010\u0010\u001f\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b \u0010\u001eJ\u0012\u0010!\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b!\u0010\u001eJ\u0012\u0010\"\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\"\u0010\u001eJ\u0012\u0010#\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b#\u0010\u001eJ\u0010\u0010$\u001a\u00020\bHÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b&\u0010%J\u0012\u0010'\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b'\u0010\u001eJ\u0012\u0010(\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b(\u0010\u001eJ\u0012\u0010)\u001a\u0004\u0018\u00010\rHÆ\u0003¢\u0006\u0004\b)\u0010*J\u0012\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0004\b+\u0010,J\u0012\u0010-\u001a\u0004\u0018\u00010\u0011HÆ\u0003¢\u0006\u0004\b-\u0010.J\u0010\u0010/\u001a\u00020\u0013HÆ\u0003¢\u0006\u0004\b/\u00100J\u0010\u00101\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0015HÆ\u0003¢\u0006\u0004\b3\u00102J$\u00104\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0003¢\u0006\u0004\b4\u00105JØ\u0001\u00106\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\n\b\u0002\u0010\u0012\u001a\u0004\u0018\u00010\u00112\b\b\u0002\u0010\u0014\u001a\u00020\u00132\b\b\u0002\u0010\u0016\u001a\u00020\u00152\b\b\u0002\u0010\u0017\u001a\u00020\u00152\u001c\b\u0002\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u0018HÆ\u0001¢\u0006\u0004\b6\u00107J\u0010\u00108\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b8\u0010\u001eJ\u0010\u0010:\u001a\u000209HÖ\u0001¢\u0006\u0004\b:\u0010;J\u001a\u0010>\u001a\u00020\u00152\b\u0010=\u001a\u0004\u0018\u00010<HÖ\u0003¢\u0006\u0004\b>\u0010?R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010@\u001a\u0004\bA\u0010\u001eR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010@\u001a\u0004\bB\u0010\u001eR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010@\u001a\u0004\bC\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010@\u001a\u0004\bD\u0010\u001eR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010@\u001a\u0004\bE\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010F\u001a\u0004\bG\u0010%R\u0019\u0010\n\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\n\u0010F\u001a\u0004\bH\u0010%R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u000b\u0010@\u001a\u0004\bI\u0010\u001eR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\f\u0010@\u001a\u0004\bJ\u0010\u001eR\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010K\u001a\u0004\bL\u0010*R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u0010M\u001a\u0004\bN\u0010,R\u0019\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0012\u0010O\u001a\u0004\bP\u0010.R\u0017\u0010\u0014\u001a\u00020\u00138\u0006¢\u0006\f\n\u0004\b\u0014\u0010Q\u001a\u0004\bR\u00100R\u0017\u0010\u0016\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0016\u0010S\u001a\u0004\b\u0016\u00102R\u0017\u0010\u0017\u001a\u00020\u00158\u0006¢\u0006\f\n\u0004\b\u0017\u0010S\u001a\u0004\bT\u00102R+\u0010\u001a\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0019\u0018\u00010\u00188\u0006¢\u0006\f\n\u0004\b\u001a\u0010U\u001a\u0004\bV\u00105¨\u0006W"}, d2 = {"Lru/ozon/fintech/ui/snackbar/FinSnackbarState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "icon", "iconColor", "iconBackgroundColor", "src", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subTitle", "actionId", "chevronColor", "Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;", "circleProgress", "Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressState;", "horizontalProgress", "Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperState;", "button", "Landroid/graphics/Rect;", "paddings", "", "isNeedChevron", "closeOnClick", "Lkotlin/Function2;", "", "onClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressState;Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperState;Landroid/graphics/Rect;ZZLkotlin/jvm/functions/Function2;)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "component4", "component5", "component6", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "component7", "component8", "component9", "component10", "()Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;", "component11", "()Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressState;", "component12", "()Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperState;", "component13", "()Landroid/graphics/Rect;", "component14", "()Z", "component15", "component16", "()Lkotlin/jvm/functions/Function2;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/data/texts/TextAtom;Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressState;Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperState;Landroid/graphics/Rect;ZZLkotlin/jvm/functions/Function2;)Lru/ozon/fintech/ui/snackbar/FinSnackbarState;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getIcon", "getIconColor", "getIconBackgroundColor", "getSrc", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "getSubTitle", "getActionId", "getChevronColor", "Lru/ozon/fintech/ui/progress/circle/CircleProgressWithNumberState;", "getCircleProgress", "Lru/ozon/fintech/ui/progress/horizontal/HorizontalProgressState;", "getHorizontalProgress", "Lru/ozon/fintech/ui/buttonatom/ButtonAtomWrapperState;", "getButton", "Landroid/graphics/Rect;", "getPaddings", "Z", "getCloseOnClick", "Lkotlin/jvm/functions/Function2;", "getOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinSnackbarState implements RecyclerItem {
    private final String actionId;
    private final ButtonAtomWrapperState button;
    private final String chevronColor;
    private final CircleProgressWithNumberState circleProgress;
    private final boolean closeOnClick;
    private final HorizontalProgressState horizontalProgress;
    private final String icon;
    private final String iconBackgroundColor;
    private final String iconColor;

    @NotNull
    private final String id;
    private final boolean isNeedChevron;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final String src;
    private final TextAtom subTitle;

    @NotNull
    private final TextAtom title;

    /* JADX WARN: Multi-variable type inference failed */
    public FinSnackbarState(@NotNull String id2, String str, String str2, String str3, String str4, @NotNull TextAtom title, TextAtom textAtom, String str5, String str6, CircleProgressWithNumberState circleProgressWithNumberState, HorizontalProgressState horizontalProgressState, ButtonAtomWrapperState buttonAtomWrapperState, @NotNull Rect paddings, boolean z11, boolean z12, Function2<? super String, ? super Boolean, Unit> function2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.icon = str;
        this.iconColor = str2;
        this.iconBackgroundColor = str3;
        this.src = str4;
        this.title = title;
        this.subTitle = textAtom;
        this.actionId = str5;
        this.chevronColor = str6;
        this.circleProgress = circleProgressWithNumberState;
        this.horizontalProgress = horizontalProgressState;
        this.button = buttonAtomWrapperState;
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
    public final CircleProgressWithNumberState getCircleProgress() {
        return this.circleProgress;
    }

    /* renamed from: component11, reason: from getter */
    public final HorizontalProgressState getHorizontalProgress() {
        return this.horizontalProgress;
    }

    /* renamed from: component12, reason: from getter */
    public final ButtonAtomWrapperState getButton() {
        return this.button;
    }

    @NotNull
    /* renamed from: component13, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component14, reason: from getter */
    public final boolean getIsNeedChevron() {
        return this.isNeedChevron;
    }

    /* renamed from: component15, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final Function2<String, Boolean, Unit> component16() {
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

    @NotNull
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
    public final FinSnackbarState copy(@NotNull String id2, String icon, String iconColor, String iconBackgroundColor, String src, @NotNull TextAtom title, TextAtom subTitle, String actionId, String chevronColor, CircleProgressWithNumberState circleProgress, HorizontalProgressState horizontalProgress, ButtonAtomWrapperState button, @NotNull Rect paddings, boolean isNeedChevron, boolean closeOnClick, Function2<? super String, ? super Boolean, Unit> onClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new FinSnackbarState(id2, icon, iconColor, iconBackgroundColor, src, title, subTitle, actionId, chevronColor, circleProgress, horizontalProgress, button, paddings, isNeedChevron, closeOnClick, onClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinSnackbarState)) {
            return false;
        }
        FinSnackbarState finSnackbarState = (FinSnackbarState) other;
        return Intrinsics.d(this.id, finSnackbarState.id) && Intrinsics.d(this.icon, finSnackbarState.icon) && Intrinsics.d(this.iconColor, finSnackbarState.iconColor) && Intrinsics.d(this.iconBackgroundColor, finSnackbarState.iconBackgroundColor) && Intrinsics.d(this.src, finSnackbarState.src) && Intrinsics.d(this.title, finSnackbarState.title) && Intrinsics.d(this.subTitle, finSnackbarState.subTitle) && Intrinsics.d(this.actionId, finSnackbarState.actionId) && Intrinsics.d(this.chevronColor, finSnackbarState.chevronColor) && Intrinsics.d(this.circleProgress, finSnackbarState.circleProgress) && Intrinsics.d(this.horizontalProgress, finSnackbarState.horizontalProgress) && Intrinsics.d(this.button, finSnackbarState.button) && Intrinsics.d(this.paddings, finSnackbarState.paddings) && this.isNeedChevron == finSnackbarState.isNeedChevron && this.closeOnClick == finSnackbarState.closeOnClick && Intrinsics.d(this.onClick, finSnackbarState.onClick);
    }

    public final String getActionId() {
        return this.actionId;
    }

    public final ButtonAtomWrapperState getButton() {
        return this.button;
    }

    public final String getChevronColor() {
        return this.chevronColor;
    }

    public final CircleProgressWithNumberState getCircleProgress() {
        return this.circleProgress;
    }

    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    public final HorizontalProgressState getHorizontalProgress() {
        return this.horizontalProgress;
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

    @NotNull
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
        int b11 = C2619v.b((hashCode4 + (str4 == null ? 0 : str4.hashCode())) * 31, 31, this.title);
        TextAtom textAtom = this.subTitle;
        int hashCode5 = (b11 + (textAtom == null ? 0 : textAtom.hashCode())) * 31;
        String str5 = this.actionId;
        int hashCode6 = (hashCode5 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.chevronColor;
        int hashCode7 = (hashCode6 + (str6 == null ? 0 : str6.hashCode())) * 31;
        CircleProgressWithNumberState circleProgressWithNumberState = this.circleProgress;
        int hashCode8 = (hashCode7 + (circleProgressWithNumberState == null ? 0 : circleProgressWithNumberState.hashCode())) * 31;
        HorizontalProgressState horizontalProgressState = this.horizontalProgress;
        int hashCode9 = (hashCode8 + (horizontalProgressState == null ? 0 : horizontalProgressState.hashCode())) * 31;
        ButtonAtomWrapperState buttonAtomWrapperState = this.button;
        int a11 = C3532b.a(C3532b.a(d.a(this.paddings, (hashCode9 + (buttonAtomWrapperState == null ? 0 : buttonAtomWrapperState.hashCode())) * 31, 31), 31, this.isNeedChevron), 31, this.closeOnClick);
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
        CircleProgressWithNumberState circleProgressWithNumberState = this.circleProgress;
        HorizontalProgressState horizontalProgressState = this.horizontalProgress;
        ButtonAtomWrapperState buttonAtomWrapperState = this.button;
        Rect rect = this.paddings;
        boolean z11 = this.isNeedChevron;
        boolean z12 = this.closeOnClick;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        StringBuilder d11 = C3660k.d("FinSnackbarState(id=", str, ", icon=", str2, ", iconColor=");
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
        d11.append(", circleProgress=");
        d11.append(circleProgressWithNumberState);
        d11.append(", horizontalProgress=");
        d11.append(horizontalProgressState);
        d11.append(", button=");
        d11.append(buttonAtomWrapperState);
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

    public /* synthetic */ FinSnackbarState(String str, String str2, String str3, String str4, String str5, TextAtom textAtom, TextAtom textAtom2, String str6, String str7, CircleProgressWithNumberState circleProgressWithNumberState, HorizontalProgressState horizontalProgressState, ButtonAtomWrapperState buttonAtomWrapperState, Rect rect, boolean z11, boolean z12, Function2 function2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, str3, str4, str5, textAtom, textAtom2, str6, str7, (i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? null : circleProgressWithNumberState, (i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? null : horizontalProgressState, (i11 & 2048) != 0 ? null : buttonAtomWrapperState, (i11 & 4096) != 0 ? i.a() : rect, (i11 & 8192) != 0 ? false : z11, (i11 & 16384) != 0 ? true : z12, function2);
    }
}
