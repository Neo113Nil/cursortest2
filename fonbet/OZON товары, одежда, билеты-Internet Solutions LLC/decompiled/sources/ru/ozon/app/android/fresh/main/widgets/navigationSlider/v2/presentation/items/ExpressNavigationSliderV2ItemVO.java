package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v2.presentation.items;

import C.o0;
import G.g;
import N3.C3660k;
import Nh.a;
import WZ.t;
import Xc.b;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003()*BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u000e\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\f\u001a\n\u0018\u00010\nj\u0004\u0018\u0001`\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b\u0011\u0010%¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Settings;", "settings", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Data;", "data", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "ratio", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "<init>", "(JLru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Settings;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Data;LWZ/t;FZZ)V", "J", "getId", "()J", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Settings;", "getSettings", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Settings;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Data;", "getData", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Data;", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "F", "getRatio", "()F", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "Settings", "Data", "PositionType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class ExpressNavigationSliderV2ItemVO implements c, AdultVO {

    @NotNull
    private final Data data;
    private final long id;
    private final boolean isAdult;
    private final float ratio;

    @NotNull
    private final Settings settings;
    private boolean shouldBlur;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B3\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0002\u0012\u0006\u0010\u0007\u001a\u00020\u0002¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u000bR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0016\u0010\u000bR\u0017\u0010\u0006\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0013\u001a\u0004\b\u0017\u0010\u000bR\u0017\u0010\u0007\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0013\u001a\u0004\b\u0018\u0010\u000b¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Data;", "", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "backgroundColor", "image", "deeplink", "link", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getTitle", "getBackgroundColor", "getImage", "getDeeplink", "getLink", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {
        private final String backgroundColor;

        @NotNull
        private final String deeplink;

        @NotNull
        private final String image;

        @NotNull
        private final String link;
        private final String title;

        public Data(String str, String str2, @NotNull String image, @NotNull String deeplink, @NotNull String link) {
            Intrinsics.checkNotNullParameter(image, "image");
            Intrinsics.checkNotNullParameter(deeplink, "deeplink");
            Intrinsics.checkNotNullParameter(link, "link");
            this.title = str;
            this.backgroundColor = str2;
            this.image = image;
            this.deeplink = deeplink;
            this.link = link;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.title, data.title) && Intrinsics.d(this.backgroundColor, data.backgroundColor) && Intrinsics.d(this.image, data.image) && Intrinsics.d(this.deeplink, data.deeplink) && Intrinsics.d(this.link, data.link);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getDeeplink() {
            return this.deeplink;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.backgroundColor;
            return this.link.hashCode() + g.a(g.a((hashCode + (str2 != null ? str2.hashCode() : 0)) * 31, 31, this.image), 31, this.deeplink);
        }

        @NotNull
        public String toString() {
            String str = this.title;
            String str2 = this.backgroundColor;
            String str3 = this.image;
            String str4 = this.deeplink;
            String str5 = this.link;
            StringBuilder d11 = C3660k.d("Data(title=", str, ", backgroundColor=", str2, ", image=");
            a.h(d11, str3, ", deeplink=", str4, ", link=");
            return o0.c(d11, str5, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$PositionType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "FULL_WIDTH", "HALF_WIDTH_LEFT", "HALF_WIDTH_RIGHT", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PositionType {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ PositionType[] $VALUES;
        public static final PositionType INVALID = new PositionType("INVALID", 0);
        public static final PositionType FULL_WIDTH = new PositionType("FULL_WIDTH", 1);
        public static final PositionType HALF_WIDTH_LEFT = new PositionType("HALF_WIDTH_LEFT", 2);
        public static final PositionType HALF_WIDTH_RIGHT = new PositionType("HALF_WIDTH_RIGHT", 3);

        private static final /* synthetic */ PositionType[] $values() {
            return new PositionType[]{INVALID, FULL_WIDTH, HALF_WIDTH_LEFT, HALF_WIDTH_RIGHT};
        }

        static {
            PositionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = b.a($values);
        }

        private PositionType(String str, int i11) {
        }

        public static PositionType valueOf(String str) {
            return (PositionType) Enum.valueOf(PositionType.class, str);
        }

        public static PositionType[] values() {
            return (PositionType[]) $VALUES.clone();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$Settings;", "", "", "rightIndent", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$PositionType;", "position", "<init>", "(ILru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$PositionType;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRightIndent", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$PositionType;", "getPosition", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v2/presentation/items/ExpressNavigationSliderV2ItemVO$PositionType;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Settings {

        @NotNull
        private final PositionType position;
        private final int rightIndent;

        public Settings(int i11, @NotNull PositionType position) {
            Intrinsics.checkNotNullParameter(position, "position");
            this.rightIndent = i11;
            this.position = position;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Settings)) {
                return false;
            }
            Settings settings = (Settings) other;
            return this.rightIndent == settings.rightIndent && this.position == settings.position;
        }

        @NotNull
        public final PositionType getPosition() {
            return this.position;
        }

        public final int getRightIndent() {
            return this.rightIndent;
        }

        public int hashCode() {
            return this.position.hashCode() + (Integer.hashCode(this.rightIndent) * 31);
        }

        @NotNull
        public String toString() {
            return "Settings(rightIndent=" + this.rightIndent + ", position=" + this.position + ")";
        }
    }

    public ExpressNavigationSliderV2ItemVO(long j11, @NotNull Settings settings, @NotNull Data data, t tVar, float f7, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = j11;
        this.settings = settings;
        this.data = data;
        this.tokenizedEvent = tVar;
        this.ratio = f7;
        this.shouldBlur = z11;
        this.isAdult = z12;
    }

    @NotNull
    public final Data getData() {
        return this.data;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final float getRatio() {
        return this.ratio;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    @NotNull
    public final Settings getSettings() {
        return this.settings;
    }

    public boolean getShouldBlur() {
        return this.shouldBlur;
    }

    public final t getTokenizedEvent() {
        return this.tokenizedEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    /* renamed from: isAdult, reason: from getter */
    public boolean getIsAdult() {
        return this.isAdult;
    }

    @Override // ru.ozon.app.android.account.adult.presenter.AdultVO
    public void setShouldBlur(boolean z11) {
        this.shouldBlur = z11;
    }

    public /* synthetic */ ExpressNavigationSliderV2ItemVO(long j11, Settings settings, Data data, t tVar, float f7, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, settings, data, tVar, f7, z11, (i11 & 64) != 0 ? z11 : z12);
    }
}
