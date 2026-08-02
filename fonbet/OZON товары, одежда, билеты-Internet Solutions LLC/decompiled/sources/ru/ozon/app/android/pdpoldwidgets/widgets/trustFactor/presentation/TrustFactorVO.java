package ru.ozon.app.android.pdpoldwidgets.widgets.trustFactor.presentation;

import C.o0;
import G.g;
import Nh.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002\u001b\u001cB\u001d\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001d"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$TrustFactorItem;", "items", "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "TrustFactorItem", "Type", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class TrustFactorVO implements c {
    private final long id;

    @NotNull
    private final List<TrustFactorItem> items;

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\fR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0019\u0010\fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u001a\u0010\fR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0017\u001a\u0004\b\u001b\u0010\f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$TrustFactorItem;", "", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$Type;", "type", "", "icon", SelectionItemFormDTO.TITLE_FIELD_NAME, "description", "deeplink", "<init>", "(Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$Type;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$Type;", "getType", "()Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$Type;", "Ljava/lang/String;", "getIcon", "getTitle", "getDescription", "getDeeplink", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TrustFactorItem {
        private final String deeplink;
        private final String description;

        @NotNull
        private final String icon;

        @NotNull
        private final String title;

        @NotNull
        private final Type type;

        public TrustFactorItem(@NotNull Type type, @NotNull String icon, @NotNull String title, String str, String str2) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(icon, "icon");
            Intrinsics.checkNotNullParameter(title, "title");
            this.type = type;
            this.icon = icon;
            this.title = title;
            this.description = str;
            this.deeplink = str2;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TrustFactorItem)) {
                return false;
            }
            TrustFactorItem trustFactorItem = (TrustFactorItem) other;
            return this.type == trustFactorItem.type && Intrinsics.d(this.icon, trustFactorItem.icon) && Intrinsics.d(this.title, trustFactorItem.title) && Intrinsics.d(this.description, trustFactorItem.description) && Intrinsics.d(this.deeplink, trustFactorItem.deeplink);
        }

        public final String getDeeplink() {
            return this.deeplink;
        }

        public final String getDescription() {
            return this.description;
        }

        @NotNull
        public final String getIcon() {
            return this.icon;
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
            int a11 = g.a(g.a(this.type.hashCode() * 31, 31, this.icon), 31, this.title);
            String str = this.description;
            int hashCode = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.deeplink;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            Type type = this.type;
            String str = this.icon;
            String str2 = this.title;
            String str3 = this.description;
            String str4 = this.deeplink;
            StringBuilder sb2 = new StringBuilder("TrustFactorItem(type=");
            sb2.append(type);
            sb2.append(", icon=");
            sb2.append(str);
            sb2.append(", title=");
            a.h(sb2, str2, ", description=", str3, ", deeplink=");
            return o0.c(sb2, str4, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/pdpoldwidgets/widgets/trustFactor/presentation/TrustFactorVO$Type;", "", "<init>", "(Ljava/lang/String;I)V", "ONLY", "FIRST", "MIDDLE", "LAST", "pdp-old-widgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Type {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type ONLY = new Type("ONLY", 0);
        public static final Type FIRST = new Type("FIRST", 1);
        public static final Type MIDDLE = new Type("MIDDLE", 2);
        public static final Type LAST = new Type("LAST", 3);

        private static final /* synthetic */ Type[] $values() {
            return new Type[]{ONLY, FIRST, MIDDLE, LAST};
        }

        static {
            Type[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private Type(String str, int i11) {
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    public TrustFactorVO(long j11, @NotNull List<TrustFactorItem> items) {
        Intrinsics.checkNotNullParameter(items, "items");
        this.id = j11;
        this.items = items;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TrustFactorVO)) {
            return false;
        }
        TrustFactorVO trustFactorVO = (TrustFactorVO) other;
        return this.id == trustFactorVO.id && Intrinsics.d(this.items, trustFactorVO.items);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<TrustFactorItem> getItems() {
        return this.items;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.items.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = Lh.b.b(this.id, "TrustFactorVO(id=", ", items=", this.items);
        b11.append(")");
        return b11.toString();
    }
}
