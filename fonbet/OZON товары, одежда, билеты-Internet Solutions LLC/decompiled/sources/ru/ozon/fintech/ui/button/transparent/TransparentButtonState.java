package ru.ozon.fintech.ui.button.transparent;

import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0014\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0086\b\u0018\u00002\u00020\u0001:\u0001$BA\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0012\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\t\u0012\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0003HÆ\u0003J\u0015\u0010\u001a\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006HÆ\u0003J\t\u0010\u001b\u001a\u00020\tHÆ\u0003J\u0010\u0010\u001c\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016JN\u0010\u001d\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\u0014\b\u0002\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u00062\b\b\u0002\u0010\b\u001a\u00020\t2\n\b\u0003\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010\u001eJ\u0013\u0010\u001f\u001a\u00020 2\b\u0010!\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\"\u001a\u00020\u000bHÖ\u0001J\t\u0010#\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u000fR\u001d\u0010\u0005\u001a\u000e\u0012\u0004\u0012\u00020\u0003\u0012\u0004\u0012\u00020\u00070\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\u0012R\u0011\u0010\b\u001a\u00020\t¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0014R\u0015\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\u0015\u0010\u0016¨\u0006%"}, d2 = {"Lru/ozon/fintech/ui/button/transparent/TransparentButtonState;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "onClick", "Lkotlin/Function1;", "", "type", "Lru/ozon/fintech/ui/button/transparent/TransparentButtonState$Type;", "icon", "", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lru/ozon/fintech/ui/button/transparent/TransparentButtonState$Type;Ljava/lang/Integer;)V", "getId", "()Ljava/lang/String;", "getTitle", "getOnClick", "()Lkotlin/jvm/functions/Function1;", "getType", "()Lru/ozon/fintech/ui/button/transparent/TransparentButtonState$Type;", "getIcon", "()Ljava/lang/Integer;", "Ljava/lang/Integer;", "component1", "component2", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Ljava/lang/String;Lkotlin/jvm/functions/Function1;Lru/ozon/fintech/ui/button/transparent/TransparentButtonState$Type;Ljava/lang/Integer;)Lru/ozon/fintech/ui/button/transparent/TransparentButtonState;", "equals", "", "other", "hashCode", "toString", "Type", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class TransparentButtonState {
    private final Integer icon;

    @NotNull
    private final String id;

    @NotNull
    private final Function1<String, Unit> onClick;

    @NotNull
    private final String title;

    @NotNull
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/ui/button/transparent/TransparentButtonState$Type;", "", "<init>", "(Ljava/lang/String;I)V", "PRIMARY", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type PRIMARY = new Type("PRIMARY", 0);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{PRIMARY};
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
    public TransparentButtonState(@NotNull String id2, @NotNull String title, @NotNull Function1<? super String, Unit> onClick, @NotNull Type type, Integer num) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.title = title;
        this.onClick = onClick;
        this.type = type;
        this.icon = num;
    }

    public static /* synthetic */ TransparentButtonState copy$default(TransparentButtonState transparentButtonState, String str, String str2, Function1 function1, Type type, Integer num, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = transparentButtonState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = transparentButtonState.title;
        }
        if ((i11 & 4) != 0) {
            function1 = transparentButtonState.onClick;
        }
        if ((i11 & 8) != 0) {
            type = transparentButtonState.type;
        }
        if ((i11 & 16) != 0) {
            num = transparentButtonState.icon;
        }
        Integer num2 = num;
        Function1 function12 = function1;
        return transparentButtonState.copy(str, str2, function12, type, num2);
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

    @NotNull
    public final Function1<String, Unit> component3() {
        return this.onClick;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    /* renamed from: component5, reason: from getter */
    public final Integer getIcon() {
        return this.icon;
    }

    @NotNull
    public final TransparentButtonState copy(@NotNull String id2, @NotNull String title, @NotNull Function1<? super String, Unit> onClick, @NotNull Type type, Integer icon) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(onClick, "onClick");
        Intrinsics.checkNotNullParameter(type, "type");
        return new TransparentButtonState(id2, title, onClick, type, icon);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TransparentButtonState)) {
            return false;
        }
        TransparentButtonState transparentButtonState = (TransparentButtonState) other;
        return Intrinsics.d(this.id, transparentButtonState.id) && Intrinsics.d(this.title, transparentButtonState.title) && Intrinsics.d(this.onClick, transparentButtonState.onClick) && this.type == transparentButtonState.type && Intrinsics.d(this.icon, transparentButtonState.icon);
    }

    public final Integer getIcon() {
        return this.icon;
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
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final Type getType() {
        return this.type;
    }

    public int hashCode() {
        int hashCode = (this.type.hashCode() + ((this.onClick.hashCode() + g.a(this.id.hashCode() * 31, 31, this.title)) * 31)) * 31;
        Integer num = this.icon;
        return hashCode + (num == null ? 0 : num.hashCode());
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        Function1<String, Unit> function1 = this.onClick;
        Type type = this.type;
        Integer num = this.icon;
        StringBuilder d11 = C3660k.d("TransparentButtonState(id=", str, ", title=", str2, ", onClick=");
        d11.append(function1);
        d11.append(", type=");
        d11.append(type);
        d11.append(", icon=");
        return Ep.a.c(d11, num, ")");
    }

    public /* synthetic */ TransparentButtonState(String str, String str2, Function1 function1, Type type, Integer num, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, function1, (i11 & 8) != 0 ? Type.PRIMARY : type, (i11 & 16) != 0 ? null : num);
    }
}
