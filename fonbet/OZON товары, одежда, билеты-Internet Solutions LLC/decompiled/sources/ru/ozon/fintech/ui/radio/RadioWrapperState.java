package ru.ozon.fintech.ui.radio;

import E30.i;
import HY.b;
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
import ru.ozon.app.android.partpayment.formpage.data.FormPageDTO;
import ru.ozon.uni.atoms.data.selectionControls.radiobutton.RadioDTO;

@Keep
@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u001a\n\u0002\u0010\u0000\n\u0002\b\u0014\b\u0087\b\u0018\u00002\u00020\u0001Bo\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\u001a\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0005¢\u0006\u0004\b\u0012\u0010\u0013J\u000f\u0010\u0014\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0015J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0015J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u0012\u0010\u001a\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001a\u0010\u0015J\u0012\u0010\u001b\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\nHÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b\u001f\u0010 J$\u0010!\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u0005HÆ\u0003¢\u0006\u0004\b#\u0010$J\u0088\u0001\u0010%\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\b\b\u0002\u0010\u000b\u001a\u00020\n2\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\u001c\b\u0002\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b%\u0010&J\u0010\u0010'\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b'\u0010\u0015J\u0010\u0010(\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b(\u0010)J\u001a\u0010,\u001a\u00020\u00052\b\u0010+\u001a\u0004\u0018\u00010*HÖ\u0003¢\u0006\u0004\b,\u0010-R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010.\u001a\u0004\b/\u0010\u0015R\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010.\u001a\u0004\b0\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u00101\u001a\u0004\b2\u0010\u0019R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010.\u001a\u0004\b3\u0010\u0015R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u00104\u001a\u0004\b5\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00106\u001a\u0004\b7\u0010\u001eR\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u00108\u001a\u0004\b9\u0010 R+\u0010\u0010\u001a\u0016\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u000f\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u0010\u0010:\u001a\u0004\b;\u0010\"R\u0017\u0010\u0011\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0011\u0010<\u001a\u0004\b=\u0010$¨\u0006>"}, d2 = {"Lru/ozon/fintech/ui/radio/RadioWrapperState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "", "id", "actionId", "", "actionEnabled", "backColor", "", "radius", "Landroid/graphics/Rect;", "paddings", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", FormPageDTO.Field.FIELD_TYPE_RADIO, "Lkotlin/Function2;", "", "onClick", "closeOnClick", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Landroid/graphics/Rect;Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;Lkotlin/jvm/functions/Function2;Z)V", "provideId", "()Ljava/lang/String;", "component1", "component2", "component3", "()Ljava/lang/Boolean;", "component4", "component5", "()Ljava/lang/Integer;", "component6", "()Landroid/graphics/Rect;", "component7", "()Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", "component8", "()Lkotlin/jvm/functions/Function2;", "component9", "()Z", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;Ljava/lang/Integer;Landroid/graphics/Rect;Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;Lkotlin/jvm/functions/Function2;Z)Lru/ozon/fintech/ui/radio/RadioWrapperState;", "toString", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "getActionId", "Ljava/lang/Boolean;", "getActionEnabled", "getBackColor", "Ljava/lang/Integer;", "getRadius", "Landroid/graphics/Rect;", "getPaddings", "Lru/ozon/uni/atoms/data/selectionControls/radiobutton/RadioDTO;", "getRadio", "Lkotlin/jvm/functions/Function2;", "getOnClick", "Z", "getCloseOnClick", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class RadioWrapperState implements RecyclerItem {
    private final Boolean actionEnabled;
    private final String actionId;
    private final String backColor;
    private final boolean closeOnClick;

    @NotNull
    private final String id;
    private final Function2<String, Boolean, Unit> onClick;

    @NotNull
    private final Rect paddings;
    private final RadioDTO radio;
    private final Integer radius;

    /* JADX WARN: Multi-variable type inference failed */
    public RadioWrapperState(@NotNull String id2, String str, Boolean bool, String str2, Integer num, @NotNull Rect paddings, RadioDTO radioDTO, Function2<? super String, ? super Boolean, Unit> function2, boolean z11) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        this.id = id2;
        this.actionId = str;
        this.actionEnabled = bool;
        this.backColor = str2;
        this.radius = num;
        this.paddings = paddings;
        this.radio = radioDTO;
        this.onClick = function2;
        this.closeOnClick = z11;
    }

    public static /* synthetic */ RadioWrapperState copy$default(RadioWrapperState radioWrapperState, String str, String str2, Boolean bool, String str3, Integer num, Rect rect, RadioDTO radioDTO, Function2 function2, boolean z11, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = radioWrapperState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = radioWrapperState.actionId;
        }
        if ((i11 & 4) != 0) {
            bool = radioWrapperState.actionEnabled;
        }
        if ((i11 & 8) != 0) {
            str3 = radioWrapperState.backColor;
        }
        if ((i11 & 16) != 0) {
            num = radioWrapperState.radius;
        }
        if ((i11 & 32) != 0) {
            rect = radioWrapperState.paddings;
        }
        if ((i11 & 64) != 0) {
            radioDTO = radioWrapperState.radio;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            function2 = radioWrapperState.onClick;
        }
        if ((i11 & 256) != 0) {
            z11 = radioWrapperState.closeOnClick;
        }
        Function2 function22 = function2;
        boolean z12 = z11;
        Rect rect2 = rect;
        RadioDTO radioDTO2 = radioDTO;
        Integer num2 = num;
        Boolean bool2 = bool;
        return radioWrapperState.copy(str, str2, bool2, str3, num2, rect2, radioDTO2, function22, z12);
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
    public final String getActionId() {
        return this.actionId;
    }

    /* renamed from: component3, reason: from getter */
    public final Boolean getActionEnabled() {
        return this.actionEnabled;
    }

    /* renamed from: component4, reason: from getter */
    public final String getBackColor() {
        return this.backColor;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getRadius() {
        return this.radius;
    }

    @NotNull
    /* renamed from: component6, reason: from getter */
    public final Rect getPaddings() {
        return this.paddings;
    }

    /* renamed from: component7, reason: from getter */
    public final RadioDTO getRadio() {
        return this.radio;
    }

    public final Function2<String, Boolean, Unit> component8() {
        return this.onClick;
    }

    /* renamed from: component9, reason: from getter */
    public final boolean getCloseOnClick() {
        return this.closeOnClick;
    }

    @NotNull
    public final RadioWrapperState copy(@NotNull String id2, String actionId, Boolean actionEnabled, String backColor, Integer radius, @NotNull Rect paddings, RadioDTO radio, Function2<? super String, ? super Boolean, Unit> onClick, boolean closeOnClick) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        return new RadioWrapperState(id2, actionId, actionEnabled, backColor, radius, paddings, radio, onClick, closeOnClick);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof RadioWrapperState)) {
            return false;
        }
        RadioWrapperState radioWrapperState = (RadioWrapperState) other;
        return Intrinsics.d(this.id, radioWrapperState.id) && Intrinsics.d(this.actionId, radioWrapperState.actionId) && Intrinsics.d(this.actionEnabled, radioWrapperState.actionEnabled) && Intrinsics.d(this.backColor, radioWrapperState.backColor) && Intrinsics.d(this.radius, radioWrapperState.radius) && Intrinsics.d(this.paddings, radioWrapperState.paddings) && Intrinsics.d(this.radio, radioWrapperState.radio) && Intrinsics.d(this.onClick, radioWrapperState.onClick) && this.closeOnClick == radioWrapperState.closeOnClick;
    }

    public final Boolean getActionEnabled() {
        return this.actionEnabled;
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

    public final RadioDTO getRadio() {
        return this.radio;
    }

    public final Integer getRadius() {
        return this.radius;
    }

    public int hashCode() {
        int hashCode = this.id.hashCode() * 31;
        String str = this.actionId;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Boolean bool = this.actionEnabled;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        String str2 = this.backColor;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.radius;
        int a11 = d.a(this.paddings, (hashCode4 + (num == null ? 0 : num.hashCode())) * 31, 31);
        RadioDTO radioDTO = this.radio;
        int hashCode5 = (a11 + (radioDTO == null ? 0 : radioDTO.hashCode())) * 31;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        return Boolean.hashCode(this.closeOnClick) + ((hashCode5 + (function2 != null ? function2.hashCode() : 0)) * 31);
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
        Boolean bool = this.actionEnabled;
        String str3 = this.backColor;
        Integer num = this.radius;
        Rect rect = this.paddings;
        RadioDTO radioDTO = this.radio;
        Function2<String, Boolean, Unit> function2 = this.onClick;
        boolean z11 = this.closeOnClick;
        StringBuilder d11 = C3660k.d("RadioWrapperState(id=", str, ", actionId=", str2, ", actionEnabled=");
        b.c(bool, ", backColor=", str3, ", radius=", d11);
        d11.append(num);
        d11.append(", paddings=");
        d11.append(rect);
        d11.append(", radio=");
        d11.append(radioDTO);
        d11.append(", onClick=");
        d11.append(function2);
        d11.append(", closeOnClick=");
        return Pk0.a.a(")", d11, z11);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ RadioWrapperState(String str, String str2, Boolean bool, String str3, Integer num, Rect rect, RadioDTO radioDTO, Function2 function2, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, bool, str3, num, (i11 & 32) != 0 ? i.a() : rect, radioDTO, function2, z11);
    }
}
