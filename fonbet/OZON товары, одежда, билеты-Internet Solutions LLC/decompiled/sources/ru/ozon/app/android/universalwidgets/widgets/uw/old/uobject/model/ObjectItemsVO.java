package ru.ozon.app.android.universalwidgets.widgets.uw.old.uobject.model;

import Ak.C2436a;
import Am.C2438a;
import B0.C2454a;
import G.g;
import J0.P;
import Xc.a;
import Xc.b;
import android.os.Parcelable;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import m10.InterfaceC8039a;
import m10.m;
import m10.o;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.common.CornerRadius;

@Metadata(d1 = {"\u0000r\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0007\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0002\b(\b\u0086\b\u0018\u00002\u00060\u0001j\u0002`\u00022\u00060\u0003j\u0002`\u00042\u00060\u0005j\u0002`\u00062\u00060\u0007j\u0002`\b:\u0001NB}\u0012\u0006\u0010\n\u001a\u00020\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u000b\u0012\f\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\b\u0001\u0010\u0013\u001a\u00020\u0012\u0012\u0006\u0010\u0015\u001a\u00020\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0012\u0012\u0006\u0010\u0017\u001a\u00020\u000b\u0012\n\b\u0002\u0010\u0019\u001a\u0004\u0018\u00010\u0018\u0012\u0006\u0010\u001b\u001a\u00020\u001a\u0012\u0006\u0010\u001c\u001a\u00020\u000b\u0012\u0006\u0010\u001e\u001a\u00020\u001d\u0012\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b!\u0010\"J\u0010\u0010#\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b#\u0010$J\u0010\u0010%\u001a\u00020\u0012HÖ\u0001¢\u0006\u0004\b%\u0010&J\u001a\u0010)\u001a\u00020\u001f2\b\u0010(\u001a\u0004\u0018\u00010'HÖ\u0003¢\u0006\u0004\b)\u0010*R\u001a\u0010\n\u001a\u00020\t8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\f\u001a\u0004\u0018\u00010\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010.\u001a\u0004\b/\u0010$R\u001d\u0010\u000f\u001a\b\u0012\u0004\u0012\u00020\u000e0\r8\u0006¢\u0006\f\n\u0004\b\u000f\u00100\u001a\u0004\b1\u00102R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00103\u001a\u0004\b4\u00105R\u0017\u0010\u0013\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00106\u001a\u0004\b7\u0010&R\u0017\u0010\u0015\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u00108\u001a\u0004\b9\u0010:R\u0017\u0010\u0016\u001a\u00020\u00128\u0006¢\u0006\f\n\u0004\b\u0016\u00106\u001a\u0004\b;\u0010&R\u0017\u0010\u0017\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0017\u0010.\u001a\u0004\b<\u0010$R$\u0010\u0019\u001a\u0004\u0018\u00010\u00188\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0019\u0010=\u001a\u0004\b>\u0010?\"\u0004\b@\u0010AR\u0017\u0010\u001b\u001a\u00020\u001a8\u0006¢\u0006\f\n\u0004\b\u001b\u0010B\u001a\u0004\bC\u0010DR\u0017\u0010\u001c\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u001c\u0010.\u001a\u0004\bE\u0010$R\u0017\u0010\u001e\u001a\u00020\u001d8\u0006¢\u0006\f\n\u0004\b\u001e\u0010F\u001a\u0004\bG\u0010HR\u0017\u0010 \u001a\u00020\u001f8\u0006¢\u0006\f\n\u0004\b \u0010I\u001a\u0004\bJ\u0010KR\u001a\u0010L\u001a\u00020\u000b8\u0016X\u0096\u0004¢\u0006\f\n\u0004\bL\u0010.\u001a\u0004\bM\u0010$¨\u0006O"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lm10/a;", "Lru/ozon/app/android/composer/view/AppendBottom;", "Lm10/m;", "Lru/ozon/app/android/composer/view/KeepTop;", "Lm10/o;", "Lru/ozon/app/android/composer/view/WidgetComponent;", "", "id", "", "style", "", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemVO;", "items", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "textAlign", "", "textColor", "", "ratio", "span", "stateId", "Landroid/os/Parcelable;", "layoutManagerState", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "paddings", "backgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "cornerRadius", "", "hidePagination", "<init>", "(JLjava/lang/String;Ljava/util/List;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;IFILjava/lang/String;Landroid/os/Parcelable;Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;Ljava/lang/String;Lru/ozon/uni/atoms/data/common/CornerRadius;Z)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/String;", "getStyle", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "getTextAlign", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/TextAlign;", "I", "getTextColor", "F", "getRatio", "()F", "getSpan", "getStateId", "Landroid/os/Parcelable;", "getLayoutManagerState", "()Landroid/os/Parcelable;", "setLayoutManagerState", "(Landroid/os/Parcelable;)V", "Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "getPaddings", "()Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "getBackgroundColor", "Lru/ozon/uni/atoms/data/common/CornerRadius;", "getCornerRadius", "()Lru/ozon/uni/atoms/data/common/CornerRadius;", "Z", "getHidePagination", "()Z", "widgetName", "getWidgetName", "Paddings", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final /* data */ class ObjectItemsVO implements c, InterfaceC8039a, m, o {

    @NotNull
    private final String backgroundColor;

    @NotNull
    private final CornerRadius cornerRadius;
    private final boolean hidePagination;
    private final long id;

    @NotNull
    private final List<ObjectItemVO> items;
    private Parcelable layoutManagerState;

    @NotNull
    private final Paddings paddings;
    private final float ratio;
    private final int span;

    @NotNull
    private final String stateId;
    private final String style;

    @NotNull
    private final TextAlign textAlign;
    private final int textColor;

    @NotNull
    private final String widgetName;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001:\u0001\u0017B'\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0014\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0015\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0012\u001a\u0004\b\u0016\u0010\r¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings;", "", "", "top", "bottom", "left", "right", "<init>", "(IIII)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getTop", "getBottom", "getLeft", "getRight", "Position", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Paddings {
        private final int bottom;
        private final int left;
        private final int right;
        private final int top;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/universalwidgets/widgets/uw/old/uobject/model/ObjectItemsVO$Paddings$Position;", "", "<init>", "(Ljava/lang/String;I)V", "LEFT", "TOP", "RIGHT", "BOTTOM", "universalwidgets_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Position {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Position[] $VALUES;
            public static final Position LEFT = new Position("LEFT", 0);
            public static final Position TOP = new Position("TOP", 1);
            public static final Position RIGHT = new Position("RIGHT", 2);
            public static final Position BOTTOM = new Position("BOTTOM", 3);

            private static final /* synthetic */ Position[] $values() {
                return new Position[]{LEFT, TOP, RIGHT, BOTTOM};
            }

            static {
                Position[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Position(String str, int i11) {
            }

            public static Position valueOf(String str) {
                return (Position) Enum.valueOf(Position.class, str);
            }

            public static Position[] values() {
                return (Position[]) $VALUES.clone();
            }
        }

        public Paddings(int i11, int i12, int i13, int i14) {
            this.top = i11;
            this.bottom = i12;
            this.left = i13;
            this.right = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Paddings)) {
                return false;
            }
            Paddings paddings = (Paddings) other;
            return this.top == paddings.top && this.bottom == paddings.bottom && this.left == paddings.left && this.right == paddings.right;
        }

        public final int getBottom() {
            return this.bottom;
        }

        public final int getLeft() {
            return this.left;
        }

        public final int getRight() {
            return this.right;
        }

        public final int getTop() {
            return this.top;
        }

        public int hashCode() {
            return Integer.hashCode(this.right) + C2454a.a(this.left, C2454a.a(this.bottom, Integer.hashCode(this.top) * 31, 31), 31);
        }

        @NotNull
        public String toString() {
            return P.a(this.left, this.right, ", right=", ")", C2438a.a("Paddings(top=", this.top, ", bottom=", ", left=", this.bottom));
        }
    }

    public ObjectItemsVO(long j11, String str, @NotNull List<ObjectItemVO> items, @NotNull TextAlign textAlign, int i11, float f7, int i12, @NotNull String stateId, Parcelable parcelable, @NotNull Paddings paddings, @NotNull String backgroundColor, @NotNull CornerRadius cornerRadius, boolean z11) {
        Intrinsics.checkNotNullParameter(items, "items");
        Intrinsics.checkNotNullParameter(textAlign, "textAlign");
        Intrinsics.checkNotNullParameter(stateId, "stateId");
        Intrinsics.checkNotNullParameter(paddings, "paddings");
        Intrinsics.checkNotNullParameter(backgroundColor, "backgroundColor");
        Intrinsics.checkNotNullParameter(cornerRadius, "cornerRadius");
        this.id = j11;
        this.style = str;
        this.items = items;
        this.textAlign = textAlign;
        this.textColor = i11;
        this.ratio = f7;
        this.span = i12;
        this.stateId = stateId;
        this.layoutManagerState = parcelable;
        this.paddings = paddings;
        this.backgroundColor = backgroundColor;
        this.cornerRadius = cornerRadius;
        this.hidePagination = z11;
        this.widgetName = stateId;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ObjectItemsVO)) {
            return false;
        }
        ObjectItemsVO objectItemsVO = (ObjectItemsVO) other;
        return this.id == objectItemsVO.id && Intrinsics.d(this.style, objectItemsVO.style) && Intrinsics.d(this.items, objectItemsVO.items) && this.textAlign == objectItemsVO.textAlign && this.textColor == objectItemsVO.textColor && Float.compare(this.ratio, objectItemsVO.ratio) == 0 && this.span == objectItemsVO.span && Intrinsics.d(this.stateId, objectItemsVO.stateId) && Intrinsics.d(this.layoutManagerState, objectItemsVO.layoutManagerState) && Intrinsics.d(this.paddings, objectItemsVO.paddings) && Intrinsics.d(this.backgroundColor, objectItemsVO.backgroundColor) && this.cornerRadius == objectItemsVO.cornerRadius && this.hidePagination == objectItemsVO.hidePagination;
    }

    @NotNull
    public final String getBackgroundColor() {
        return this.backgroundColor;
    }

    @NotNull
    public final CornerRadius getCornerRadius() {
        return this.cornerRadius;
    }

    public final boolean getHidePagination() {
        return this.hidePagination;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @NotNull
    public final List<ObjectItemVO> getItems() {
        return this.items;
    }

    public final Parcelable getLayoutManagerState() {
        return this.layoutManagerState;
    }

    @NotNull
    public final Paddings getPaddings() {
        return this.paddings;
    }

    public final float getRatio() {
        return this.ratio;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final int getSpan() {
        return this.span;
    }

    public final String getStyle() {
        return this.style;
    }

    @NotNull
    public final TextAlign getTextAlign() {
        return this.textAlign;
    }

    public final int getTextColor() {
        return this.textColor;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // m10.o
    @NotNull
    public String getWidgetName() {
        return this.widgetName;
    }

    public int hashCode() {
        int hashCode = Long.hashCode(this.id) * 31;
        String str = this.style;
        int a11 = g.a(C2454a.a(this.span, Pk0.b.a(this.ratio, C2454a.a(this.textColor, (this.textAlign.hashCode() + g.b((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.items)) * 31, 31), 31), 31), 31, this.stateId);
        Parcelable parcelable = this.layoutManagerState;
        return Boolean.hashCode(this.hidePagination) + Tl.b.b(this.cornerRadius, g.a((this.paddings.hashCode() + ((a11 + (parcelable != null ? parcelable.hashCode() : 0)) * 31)) * 31, 31, this.backgroundColor), 31);
    }

    public final void setLayoutManagerState(Parcelable parcelable) {
        this.layoutManagerState = parcelable;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        String str = this.style;
        List<ObjectItemVO> list = this.items;
        TextAlign textAlign = this.textAlign;
        int i11 = this.textColor;
        float f7 = this.ratio;
        int i12 = this.span;
        String str2 = this.stateId;
        Parcelable parcelable = this.layoutManagerState;
        Paddings paddings = this.paddings;
        String str3 = this.backgroundColor;
        CornerRadius cornerRadius = this.cornerRadius;
        boolean z11 = this.hidePagination;
        StringBuilder c11 = C2436a.c(j11, "ObjectItemsVO(id=", ", style=", str);
        c11.append(", items=");
        c11.append(list);
        c11.append(", textAlign=");
        c11.append(textAlign);
        c11.append(", textColor=");
        c11.append(i11);
        c11.append(", ratio=");
        c11.append(f7);
        c11.append(", span=");
        c11.append(i12);
        c11.append(", stateId=");
        c11.append(str2);
        c11.append(", layoutManagerState=");
        c11.append(parcelable);
        c11.append(", paddings=");
        c11.append(paddings);
        c11.append(", backgroundColor=");
        c11.append(str3);
        c11.append(", cornerRadius=");
        c11.append(cornerRadius);
        return Bi.b.f(c11, ", hidePagination=", z11, ")");
    }

    public /* synthetic */ ObjectItemsVO(long j11, String str, List list, TextAlign textAlign, int i11, float f7, int i12, String str2, Parcelable parcelable, Paddings paddings, String str3, CornerRadius cornerRadius, boolean z11, int i13, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, str, list, textAlign, i11, f7, i12, str2, (i13 & 256) != 0 ? null : parcelable, paddings, str3, cornerRadius, z11);
    }
}
