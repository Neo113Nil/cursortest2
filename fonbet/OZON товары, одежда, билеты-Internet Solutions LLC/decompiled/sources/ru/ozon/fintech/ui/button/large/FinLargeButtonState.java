package ru.ozon.fintech.ui.button.large;

import B0.C2454a;
import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import androidx.annotation.Keep;
import com.detmir.recycli.adapters.RecyclerItem;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Keep
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u001f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u00014B{\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006\u0012\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t\u0012\b\b\u0002\u0010\n\u001a\u00020\u000b\u0012\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f\u0012\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\u0004\b\u0011\u0010\u0012J\b\u0010\"\u001a\u00020\u0003H\u0016J\t\u0010#\u001a\u00020\u0003HÆ\u0003J\t\u0010$\u001a\u00020\u0003HÆ\u0003J\u0011\u0010%\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006HÆ\u0003J\u0017\u0010&\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\tHÆ\u0003J\t\u0010'\u001a\u00020\u000bHÆ\u0003J\u000b\u0010(\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010)\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010*\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0010\u0010+\u001a\u0004\u0018\u00010\u000fHÆ\u0003¢\u0006\u0002\u0010\u001fJ\u0086\u0001\u0010,\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u00062\u0016\b\u0002\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t2\b\b\u0002\u0010\n\u001a\u00020\u000b2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u000e\u001a\u0004\u0018\u00010\u000f2\n\b\u0003\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÆ\u0001¢\u0006\u0002\u0010-J\u0013\u0010.\u001a\u00020/2\b\u00100\u001a\u0004\u0018\u000101HÖ\u0003J\t\u00102\u001a\u00020\u000fHÖ\u0001J\t\u00103\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0014R\u0019\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0007\u0018\u00010\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0016\u0010\u0017R\u001f\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u0007\u0018\u00010\t¢\u0006\b\n\u0000\u001a\u0004\b\u0018\u0010\u0019R\u0011\u0010\n\u001a\u00020\u000b¢\u0006\b\n\u0000\u001a\u0004\b\u001a\u0010\u001bR\u0013\u0010\f\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001c\u0010\u0014R\u0013\u0010\r\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u001d\u0010\u0014R\u0015\u0010\u000e\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b\u001e\u0010\u001fR\u0015\u0010\u0010\u001a\u0004\u0018\u00010\u000f¢\u0006\n\n\u0002\u0010 \u001a\u0004\b!\u0010\u001f¨\u00065"}, d2 = {"Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "Lcom/detmir/recycli/adapters/RecyclerItem;", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "onClick", "Lkotlin/Function0;", "", "onClickId", "Lkotlin/Function1;", "type", "Lru/ozon/fintech/ui/button/large/FinLargeButtonState$Type;", "subTitle", "icon", "backgroundColor", "", "titleColor", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lru/ozon/fintech/ui/button/large/FinLargeButtonState$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getTitle", "getOnClick", "()Lkotlin/jvm/functions/Function0;", "getOnClickId", "()Lkotlin/jvm/functions/Function1;", "getType", "()Lru/ozon/fintech/ui/button/large/FinLargeButtonState$Type;", "getSubTitle", "getIcon", "getBackgroundColor", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "getTitleColor", "provideId", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function0;Lkotlin/jvm/functions/Function1;Lru/ozon/fintech/ui/button/large/FinLargeButtonState$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Integer;Ljava/lang/Integer;)Lru/ozon/fintech/ui/button/large/FinLargeButtonState;", "equals", "", "other", "", "hashCode", "toString", "Type", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class FinLargeButtonState implements RecyclerItem {
    private final Integer backgroundColor;
    private final String icon;

    @NotNull
    private final String id;
    private final Function0<Unit> onClick;
    private final Function1<String, Unit> onClickId;
    private final String subTitle;

    @NotNull
    private final String title;
    private final Integer titleColor;

    @NotNull
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/fintech/ui/button/large/FinLargeButtonState$Type;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "SECONDARY", "CUSTOM", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type PRIMARY = new Type("PRIMARY", 0);
        public static final Type SECONDARY = new Type("SECONDARY", 1);
        public static final Type CUSTOM = new Type("CUSTOM", 2);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{PRIMARY, SECONDARY, CUSTOM};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        @NotNull
        public static a<Type> getEntries() {
            return $ENTRIES;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public FinLargeButtonState(@NotNull String id2, @NotNull String title, Function0<Unit> function0, Function1<? super String, Unit> function1, @NotNull Type type, String str, String str2, Integer num, Integer num2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.title = title;
        this.onClick = function0;
        this.onClickId = function1;
        this.type = type;
        this.subTitle = str;
        this.icon = str2;
        this.backgroundColor = num;
        this.titleColor = num2;
    }

    public static /* synthetic */ FinLargeButtonState copy$default(FinLargeButtonState finLargeButtonState, String str, String str2, Function0 function0, Function1 function1, Type type, String str3, String str4, Integer num, Integer num2, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = finLargeButtonState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = finLargeButtonState.title;
        }
        if ((i11 & 4) != 0) {
            function0 = finLargeButtonState.onClick;
        }
        if ((i11 & 8) != 0) {
            function1 = finLargeButtonState.onClickId;
        }
        if ((i11 & 16) != 0) {
            type = finLargeButtonState.type;
        }
        if ((i11 & 32) != 0) {
            str3 = finLargeButtonState.subTitle;
        }
        if ((i11 & 64) != 0) {
            str4 = finLargeButtonState.icon;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            num = finLargeButtonState.backgroundColor;
        }
        if ((i11 & 256) != 0) {
            num2 = finLargeButtonState.titleColor;
        }
        Integer num3 = num;
        Integer num4 = num2;
        String str5 = str3;
        String str6 = str4;
        Type type2 = type;
        Function0 function02 = function0;
        return finLargeButtonState.copy(str, str2, function02, function1, type2, str5, str6, num3, num4);
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
    public final String getTitle() {
        return this.title;
    }

    public final Function0<Unit> component3() {
        return this.onClick;
    }

    public final Function1<String, Unit> component4() {
        return this.onClickId;
    }

    @NotNull
    /* renamed from: component5, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component6, reason: from getter */
    public final String getSubTitle() {
        return this.subTitle;
    }

    /* renamed from: component7, reason: from getter */
    public final String getIcon() {
        return this.icon;
    }

    /* renamed from: component8, reason: from getter */
    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    /* renamed from: component9, reason: from getter */
    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @NotNull
    public final FinLargeButtonState copy(@NotNull String id2, @NotNull String title, Function0<Unit> onClick, Function1<? super String, Unit> onClickId, @NotNull Type type, String subTitle, String icon, Integer backgroundColor, Integer titleColor) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        return new FinLargeButtonState(id2, title, onClick, onClickId, type, subTitle, icon, backgroundColor, titleColor);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FinLargeButtonState)) {
            return false;
        }
        FinLargeButtonState finLargeButtonState = (FinLargeButtonState) other;
        return Intrinsics.d(this.id, finLargeButtonState.id) && Intrinsics.d(this.title, finLargeButtonState.title) && Intrinsics.d(this.onClick, finLargeButtonState.onClick) && Intrinsics.d(this.onClickId, finLargeButtonState.onClickId) && this.type == finLargeButtonState.type && Intrinsics.d(this.subTitle, finLargeButtonState.subTitle) && Intrinsics.d(this.icon, finLargeButtonState.icon) && Intrinsics.d(this.backgroundColor, finLargeButtonState.backgroundColor) && Intrinsics.d(this.titleColor, finLargeButtonState.titleColor);
    }

    public final Integer getBackgroundColor() {
        return this.backgroundColor;
    }

    public final String getIcon() {
        return this.icon;
    }

    @NotNull
    public final String getId() {
        return this.id;
    }

    public final Function0<Unit> getOnClick() {
        return this.onClick;
    }

    public final Function1<String, Unit> getOnClickId() {
        return this.onClickId;
    }

    public final String getSubTitle() {
        return this.subTitle;
    }

    @NotNull
    public final String getTitle() {
        return this.title;
    }

    public final Integer getTitleColor() {
        return this.titleColor;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int a11 = g.a(this.id.hashCode() * 31, 31, this.title);
        Function0<Unit> function0 = this.onClick;
        int hashCode = (a11 + (function0 == null ? 0 : function0.hashCode())) * 31;
        Function1<String, Unit> function1 = this.onClickId;
        int hashCode2 = (this.type.hashCode() + ((hashCode + (function1 == null ? 0 : function1.hashCode())) * 31)) * 31;
        String str = this.subTitle;
        int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
        String str2 = this.icon;
        int hashCode4 = (hashCode3 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Integer num = this.backgroundColor;
        int hashCode5 = (hashCode4 + (num == null ? 0 : num.hashCode())) * 31;
        Integer num2 = this.titleColor;
        return hashCode5 + (num2 != null ? num2.hashCode() : 0);
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    @NotNull
    public String provideId() {
        return this.id;
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        Function0<Unit> function0 = this.onClick;
        Function1<String, Unit> function1 = this.onClickId;
        Type type = this.type;
        String str3 = this.subTitle;
        String str4 = this.icon;
        Integer num = this.backgroundColor;
        Integer num2 = this.titleColor;
        StringBuilder d11 = C3660k.d("FinLargeButtonState(id=", str, ", title=", str2, ", onClick=");
        d11.append(function0);
        d11.append(", onClickId=");
        d11.append(function1);
        d11.append(", type=");
        d11.append(type);
        d11.append(", subTitle=");
        d11.append(str3);
        d11.append(", icon=");
        C2454a.f(num, str4, ", backgroundColor=", ", titleColor=", d11);
        return Ep.a.c(d11, num2, ")");
    }

    @Override // com.detmir.recycli.adapters.RecyclerItem
    public Class<? extends Object> withView() {
        return null;
    }

    public /* synthetic */ FinLargeButtonState(String str, String str2, Function0 function0, Function1 function1, Type type, String str3, String str4, Integer num, Integer num2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? null : function0, (i11 & 8) != 0 ? null : function1, (i11 & 16) != 0 ? Type.PRIMARY : type, (i11 & 32) != 0 ? null : str3, (i11 & 64) != 0 ? null : str4, (i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? null : num, (i11 & 256) != 0 ? null : num2);
    }
}
