package ru.ozon.app.android.travel.utils.html.tagmappers;

import Sc.o;
import Xc.a;
import Xc.b;
import android.text.Editable;
import java.util.ArrayList;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.Regex;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;
import org.xml.sax.Attributes;
import ru.ozon.app.android.travel.utils.html.OzonTagMapper;

@Metadata(d1 = {"\u0000>\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010!\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0004\b\u0001\u0018\u0000 \u00152\u00020\u0001:\u0003\u0015\u0016\u0017B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J&\u0010\u0007\u001a\u00020\b2\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eH\u0016J\u001c\u0010\u000f\u001a\u00020\u00102\b\u0010\t\u001a\u0004\u0018\u00010\n2\b\u0010\u000b\u001a\u0004\u0018\u00010\fH\u0016J\u0006\u0010\u0011\u001a\u00020\u0010J\u0010\u0010\u0012\u001a\u00020\n2\u0006\u0010\u0013\u001a\u00020\u0014H\u0002R\u0014\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper;", "Lru/ozon/app/android/travel/utils/html/OzonTagMapper;", "<init>", "()V", "listStack", "", "Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper$ListState;", "mapOpeningTag", "", "tag", "", "output", "Landroid/text/Editable;", "attributes", "Lorg/xml/sax/Attributes;", "mapClosingTag", "", "clearStack", "getBulletForDepth", "depth", "", "Companion", "ListType", "ListState", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes2.dex */
public final class ListTagMapper implements OzonTagMapper {

    @NotNull
    private final List<ListState> listStack = new ArrayList();

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0007X\u0086T¢\u0006\u0002\n\u0000¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper$Companion;", "", "<init>", "()V", "MAX_DEPTH", "", "LIST_MARKER_PATTERN", "", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\n\b\u0082\b\u0018\u00002\u00020\u0001B\u0019\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\b\u0002\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\"\u0010\u0005\u001a\u00020\u00048\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\f\"\u0004\b\u0016\u0010\u0017¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper$ListState;", "", "Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper$ListType;", "type", "", "itemCount", "<init>", "(Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper$ListType;I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper$ListType;", "getType", "()Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper$ListType;", "I", "getItemCount", "setItemCount", "(I)V", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final /* data */ class ListState {
        private int itemCount;

        @NotNull
        private final ListType type;

        public ListState(@NotNull ListType type, int i11) {
            Intrinsics.checkNotNullParameter(type, "type");
            this.type = type;
            this.itemCount = i11;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof ListState)) {
                return false;
            }
            ListState listState = (ListState) other;
            return this.type == listState.type && this.itemCount == listState.itemCount;
        }

        public final int getItemCount() {
            return this.itemCount;
        }

        @NotNull
        public final ListType getType() {
            return this.type;
        }

        public int hashCode() {
            return Integer.hashCode(this.itemCount) + (this.type.hashCode() * 31);
        }

        public final void setItemCount(int i11) {
            this.itemCount = i11;
        }

        @NotNull
        public String toString() {
            return "ListState(type=" + this.type + ", itemCount=" + this.itemCount + ")";
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0082\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/utils/html/tagmappers/ListTagMapper$ListType;", "", "<init>", "(Ljava/lang/String;I)V", "ORDERED", "UNORDERED", "utils_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class ListType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ ListType[] $VALUES;
        public static final ListType ORDERED = new ListType("ORDERED", 0);
        public static final ListType UNORDERED = new ListType("UNORDERED", 1);

        private static final /* synthetic */ ListType[] $values() {
            return new ListType[]{ORDERED, UNORDERED};
        }

        static {
            ListType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private ListType(String str, int i11) {
        }

        public static ListType valueOf(String str) {
            return (ListType) Enum.valueOf(ListType.class, str);
        }

        public static ListType[] values() {
            return (ListType[]) $VALUES.clone();
        }
    }

    @Metadata(k = 3, mv = {2, 0, 0}, xi = 48)
    public /* synthetic */ class WhenMappings {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[ListType.values().length];
            try {
                iArr[ListType.UNORDERED.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[ListType.ORDERED.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    private final String getBulletForDepth(int depth) {
        int i11 = depth % 4;
        return i11 != 1 ? i11 != 2 ? i11 != 3 ? "•" : "▪" : "◦" : "•";
    }

    public final void clearStack() {
        this.listStack.clear();
    }

    @Override // ru.ozon.app.android.travel.utils.html.OzonTagMapper
    public void mapClosingTag(String tag, Editable output) {
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode == 3453) {
                if (!tag.equals("li") || output == null || h.B(output, "\n")) {
                    return;
                }
                output.append("\n");
                return;
            }
            if (hashCode != 3549) {
                if (hashCode != 3735 || !tag.equals("ul")) {
                    return;
                }
            } else if (!tag.equals("ol")) {
                return;
            }
            if (this.listStack.isEmpty()) {
                return;
            }
            List<ListState> list = this.listStack;
            list.remove(C7714v.P(list));
            if (output == null || output.length() <= 0 || h.B(output, "\n\n")) {
                return;
            }
            boolean z11 = false;
            int f7 = h.f(output, "\n", 0, 6);
            if (f7 >= 0) {
                z11 = new Regex("^\\s*(\\d+\\.|•)\\s").a(output.subSequence(f7 + 1, output.length()).toString());
            }
            if (z11 || h.B(output, "\n")) {
                return;
            }
            output.append("\n");
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:13:0x0036  */
    @Override // ru.ozon.app.android.travel.utils.html.OzonTagMapper
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public boolean mapOpeningTag(String tag, Editable output, Attributes attributes) {
        String bulletForDepth;
        if (tag != null) {
            int hashCode = tag.hashCode();
            if (hashCode != 3453) {
                if (hashCode != 3549) {
                    if (this.listStack.size() < 10) {
                        this.listStack.add(new ListState(tag.equals("ol") ? ListType.ORDERED : ListType.UNORDERED, 0));
                        return true;
                    }
                } else if (this.listStack.size() < 10) {
                }
            } else if (tag.equals("li") && !this.listStack.isEmpty()) {
                if (output != null) {
                    ListState listState = (ListState) C7714v.X(this.listStack);
                    int size = this.listStack.size();
                    if (size > 1 && output.length() > 0 && !h.B(output, "\n")) {
                        output.append("\n");
                    }
                    int i11 = WhenMappings.$EnumSwitchMapping$0[listState.getType().ordinal()];
                    if (i11 == 1) {
                        bulletForDepth = getBulletForDepth(size);
                    } else {
                        if (i11 != 2) {
                            throw new o();
                        }
                        listState.setItemCount(listState.getItemCount() + 1);
                        bulletForDepth = listState.getItemCount() + ".";
                    }
                    output.append((CharSequence) (h.W(size - 1, "  ") + bulletForDepth + " "));
                }
                return true;
            }
        }
        return false;
    }
}
