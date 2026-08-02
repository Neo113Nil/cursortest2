package ru.ozon.app.android.regulardraw.widgets.morkovskTabbar.v2.presentation;

import B0.A0;
import G.g;
import N3.C3660k;
import Ve.C4598rp;
import WZ.t;
import Xc.a;
import Xc.b;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.checkoutcomposer.common.splitDynamicElements.data.DynamicElementDTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.TestInfo;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001aB\u001d\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab;", DynamicElementDTO.TABS, "<init>", "(JLjava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getTabs", "()Ljava/util/List;", "Tab", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final /* data */ class MorkovskTabbarVI implements c {
    private final long id;

    @NotNull
    private final List<Tab> tabs;

    @Metadata(d1 = {"\u0000J\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u001a\b\u0087\b\u0018\u00002\u00020\u0001:\u000223BS\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u000e\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u0015R\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b\u001f\u0010\u0015R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010#\u001a\u0004\b$\u0010%R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u001f\u0010\u000f\u001a\n\u0018\u00010\rj\u0004\u0018\u0001`\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b0\u00101¨\u00064"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "image", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "indicator", "", "weight", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Layout;", "layout", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "Lru/ozon/uni/atoms/data/TestInfo;", "testInfo", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;FLru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Layout;Lru/ozon/uni/atoms/af/AtomAction;LWZ/t;Lru/ozon/uni/atoms/data/TestInfo;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getImage", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "getIndicator", "()Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "F", "getWeight", "()F", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Layout;", "getLayout", "()Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Layout;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Lru/ozon/uni/atoms/data/TestInfo;", "getTestInfo", "()Lru/ozon/uni/atoms/data/TestInfo;", "Layout", "Indicator", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Tab {

        @NotNull
        private final AtomAction action;

        @NotNull
        private final String image;
        private final Indicator indicator;

        @NotNull
        private final Layout layout;
        private final TestInfo testInfo;

        @NotNull
        private final String title;
        private final t tokenizedEvent;
        private final float weight;

        @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bw\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "", "Pin", "Badge", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator$Badge;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator$Pin;", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public interface Indicator {

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator$Badge;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "", "image", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Badge implements Indicator {

                @NotNull
                private final String image;

                public Badge(@NotNull String image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.image = image;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Badge) && Intrinsics.d(this.image, ((Badge) other).image);
                }

                @NotNull
                public final String getImage() {
                    return this.image;
                }

                public int hashCode() {
                    return this.image.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("Badge(image=", this.image, ")");
                }
            }

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0006\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u0007¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator$Pin;", "Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Indicator;", "", "image", "<init>", "(Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getImage", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class Pin implements Indicator {

                @NotNull
                private final String image;

                public Pin(@NotNull String image) {
                    Intrinsics.checkNotNullParameter(image, "image");
                    this.image = image;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof Pin) && Intrinsics.d(this.image, ((Pin) other).image);
                }

                @NotNull
                public final String getImage() {
                    return this.image;
                }

                public int hashCode() {
                    return this.image.hashCode();
                }

                @NotNull
                public String toString() {
                    return A0.b("Pin(image=", this.image, ")");
                }
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0005\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/regulardraw/widgets/morkovskTabbar/v2/presentation/MorkovskTabbarVI$Tab$Layout;", "", "<init>", "(Ljava/lang/String;I)V", "Vertical", "Horizontal", "regulardraw_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Layout {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ Layout[] $VALUES;
            public static final Layout Vertical = new Layout("Vertical", 0);
            public static final Layout Horizontal = new Layout("Horizontal", 1);

            private static final /* synthetic */ Layout[] $values() {
                return new Layout[]{Vertical, Horizontal};
            }

            static {
                Layout[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private Layout(String str, int i11) {
            }

            public static Layout valueOf(String str) {
                return (Layout) Enum.valueOf(Layout.class, str);
            }

            public static Layout[] values() {
                return (Layout[]) $VALUES.clone();
            }
        }

        public Tab(@NotNull String title, @NotNull String image, Indicator indicator, float f7, @NotNull Layout layout, @NotNull AtomAction action, t tVar, TestInfo testInfo) {
            Intrinsics.checkNotNullParameter(title, "title");
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(layout, "layout");
            Intrinsics.checkNotNullParameter(action, "action");
            this.title = title;
            this.image = image;
            this.indicator = indicator;
            this.weight = f7;
            this.layout = layout;
            this.action = action;
            this.tokenizedEvent = tVar;
            this.testInfo = testInfo;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Tab)) {
                return false;
            }
            Tab tab = (Tab) other;
            return Intrinsics.d(this.title, tab.title) && Intrinsics.d(this.image, tab.image) && Intrinsics.d(this.indicator, tab.indicator) && Float.compare(this.weight, tab.weight) == 0 && this.layout == tab.layout && Intrinsics.d(this.action, tab.action) && Intrinsics.d(this.tokenizedEvent, tab.tokenizedEvent) && Intrinsics.d(this.testInfo, tab.testInfo);
        }

        @NotNull
        public final AtomAction getAction() {
            return this.action;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final Indicator getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final Layout getLayout() {
            return this.layout;
        }

        public final TestInfo getTestInfo() {
            return this.testInfo;
        }

        @NotNull
        public final String getTitle() {
            return this.title;
        }

        public final t getTokenizedEvent() {
            return this.tokenizedEvent;
        }

        public final float getWeight() {
            return this.weight;
        }

        public int hashCode() {
            int a11 = g.a(this.title.hashCode() * 31, 31, this.image);
            Indicator indicator = this.indicator;
            int a12 = C4598rp.a(this.action, (this.layout.hashCode() + Pk0.b.a(this.weight, (a11 + (indicator == null ? 0 : indicator.hashCode())) * 31, 31)) * 31, 31);
            t tVar = this.tokenizedEvent;
            int hashCode = (a12 + (tVar == null ? 0 : tVar.hashCode())) * 31;
            TestInfo testInfo = this.testInfo;
            return hashCode + (testInfo != null ? testInfo.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.image;
            Indicator indicator = this.indicator;
            float f7 = this.weight;
            Layout layout = this.layout;
            AtomAction atomAction = this.action;
            t tVar = this.tokenizedEvent;
            TestInfo testInfo = this.testInfo;
            StringBuilder d11 = C3660k.d("Tab(title=", str, ", image=", str2, ", indicator=");
            d11.append(indicator);
            d11.append(", weight=");
            d11.append(f7);
            d11.append(", layout=");
            d11.append(layout);
            d11.append(", action=");
            d11.append(atomAction);
            d11.append(", tokenizedEvent=");
            d11.append(tVar);
            d11.append(", testInfo=");
            d11.append(testInfo);
            d11.append(")");
            return d11.toString();
        }
    }

    public MorkovskTabbarVI(long j11, @NotNull List<Tab> tabs) {
        Intrinsics.checkNotNullParameter(tabs, "tabs");
        this.id = j11;
        this.tabs = tabs;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MorkovskTabbarVI)) {
            return false;
        }
        MorkovskTabbarVI morkovskTabbarVI = (MorkovskTabbarVI) other;
        return this.id == morkovskTabbarVI.id && Intrinsics.d(this.tabs, morkovskTabbarVI.tabs);
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final List<Tab> getTabs() {
        return this.tabs;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.tabs.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        StringBuilder b11 = Lh.b.b(this.id, "MorkovskTabbarVI(id=", ", tabs=", this.tabs);
        b11.append(")");
        return b11.toString();
    }
}
