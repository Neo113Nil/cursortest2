package ru.ozon.fintech.ui.smalllabel;

import G.g;
import N3.C3660k;
import Xc.a;
import Xc.b;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0010\u001a\u00020\u0006HÆ\u0003J'\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u0006HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\nR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\r¨\u0006\u0019"}, d2 = {"Lru/ozon/fintech/ui/smalllabel/SmallLabelState;", "", "id", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "type", "Lru/ozon/fintech/ui/smalllabel/SmallLabelState$Type;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/ui/smalllabel/SmallLabelState$Type;)V", "getId", "()Ljava/lang/String;", "getTitle", "getType", "()Lru/ozon/fintech/ui/smalllabel/SmallLabelState$Type;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "Type", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class SmallLabelState {

    @NotNull
    private final String id;

    @NotNull
    private final String title;

    @NotNull
    private final Type type;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0004\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004¨\u0006\u0005"}, d2 = {"Lru/ozon/fintech/ui/smalllabel/SmallLabelState$Type;", "", "<init>", "(Ljava/lang/String;I)V", "POSITIVE_PALE", "fintech-ui_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type POSITIVE_PALE = new Type("POSITIVE_PALE", 0);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{POSITIVE_PALE};
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

    public SmallLabelState(@NotNull String id2, @NotNull String title, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        this.id = id2;
        this.title = title;
        this.type = type;
    }

    public static /* synthetic */ SmallLabelState copy$default(SmallLabelState smallLabelState, String str, String str2, Type type, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = smallLabelState.id;
        }
        if ((i11 & 2) != 0) {
            str2 = smallLabelState.title;
        }
        if ((i11 & 4) != 0) {
            type = smallLabelState.type;
        }
        return smallLabelState.copy(str, str2, type);
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
    /* renamed from: component3, reason: from getter */
    public final Type getType() {
        return this.type;
    }

    @NotNull
    public final SmallLabelState copy(@NotNull String id2, @NotNull String title, @NotNull Type type) {
        Intrinsics.checkNotNullParameter(id2, "id");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(type, "type");
        return new SmallLabelState(id2, title, type);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SmallLabelState)) {
            return false;
        }
        SmallLabelState smallLabelState = (SmallLabelState) other;
        return Intrinsics.d(this.id, smallLabelState.id) && Intrinsics.d(this.title, smallLabelState.title) && this.type == smallLabelState.type;
    }

    @NotNull
    public final String getId() {
        return this.id;
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
        return this.type.hashCode() + g.a(this.id.hashCode() * 31, 31, this.title);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.title;
        Type type = this.type;
        StringBuilder d11 = C3660k.d("SmallLabelState(id=", str, ", title=", str2, ", type=");
        d11.append(type);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ SmallLabelState(String str, String str2, Type type, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, (i11 & 4) != 0 ? Type.POSITIVE_PALE : type);
    }
}
