package ru.ozon.app.android.fresh.main.widgets.navigationSlider.v3.presentation.row;

import Bl.b;
import G.g;
import WZ.t;
import Xc.a;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.account.adult.presenter.AdultVO;
import ru.ozon.app.android.favorites.data.favoritebutton.favoriteproduct.FavoriteProductMolecule;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.texts.TextAtom;

@Metadata(d1 = {"\u0000:\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0007\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u001c\u0018\u00002\u00060\u0001j\u0002`\u00022\u00020\u0003:\u0003()*BI\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\u000b\u001a\u00020\n\u0012\u000e\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\b\b\u0002\u0010\u0011\u001a\u00020\u000f¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0005\u001a\u00020\u00048\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u001f\u0010\u000e\u001a\n\u0018\u00010\fj\u0004\u0018\u0001`\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010 \u001a\u0004\b!\u0010\"R\"\u0010\u0010\u001a\u00020\u000f8\u0016@\u0016X\u0096\u000e¢\u0006\u0012\n\u0004\b\u0010\u0010#\u001a\u0004\b$\u0010%\"\u0004\b&\u0010'R\u001a\u0010\u0011\u001a\u00020\u000f8\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0011\u0010#\u001a\u0004\b\u0011\u0010%¨\u0006+"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "Lru/ozon/app/android/account/adult/presenter/AdultVO;", "", "id", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Settings;", "settings", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Data;", "data", "", "ratio", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "tokenizedEvent", "", "shouldBlur", FavoriteProductMolecule.IS_ADULT_PARAMS_NAME, "<init>", "(JLru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Settings;Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Data;FLWZ/t;ZZ)V", "J", "getId", "()J", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Settings;", "getSettings", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Settings;", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Data;", "getData", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Data;", "F", "getRatio", "()F", "LWZ/t;", "getTokenizedEvent", "()LWZ/t;", "Z", "getShouldBlur", "()Z", "setShouldBlur", "(Z)V", "Settings", "Data", "PositionType", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class NavigationSliderV3ItemVO implements c, AdultVO {

    @NotNull
    private final Data data;
    private final long id;
    private final boolean isAdult;
    private final float ratio;

    @NotNull
    private final Settings settings;
    private boolean shouldBlur;
    private final t tokenizedEvent;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0086\b\u0018\u00002\u00020\u0001B7\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0019\u001a\u0004\b\u001a\u0010\u000eR\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001b\u0010\u000eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\u001f\u001a\u0004\b \u0010!¨\u0006\""}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Data;", "", "Lru/ozon/uni/atoms/data/texts/TextAtom;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "backgroundColor", "image", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "advBadgeV2", "<init>", "(Lru/ozon/uni/atoms/data/texts/TextAtom;Ljava/lang/String;Ljava/lang/String;Lru/ozon/uni/atoms/af/AtomAction;Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/texts/TextAtom;", "getTitle", "()Lru/ozon/uni/atoms/data/texts/TextAtom;", "Ljava/lang/String;", "getBackgroundColor", "getImage", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getAdvBadgeV2", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Data {
        private final AtomAction action;
        private final BadgeDTO advBadgeV2;
        private final String backgroundColor;

        @NotNull
        private final String image;
        private final TextAtom title;

        public Data(TextAtom textAtom, String str, @NotNull String image, AtomAction atomAction, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(image, "image");
            this.title = textAtom;
            this.backgroundColor = str;
            this.image = image;
            this.action = atomAction;
            this.advBadgeV2 = badgeDTO;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Data)) {
                return false;
            }
            Data data = (Data) other;
            return Intrinsics.d(this.title, data.title) && Intrinsics.d(this.backgroundColor, data.backgroundColor) && Intrinsics.d(this.image, data.image) && Intrinsics.d(this.action, data.action) && Intrinsics.d(this.advBadgeV2, data.advBadgeV2);
        }

        public final AtomAction getAction() {
            return this.action;
        }

        public final BadgeDTO getAdvBadgeV2() {
            return this.advBadgeV2;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        @NotNull
        public final String getImage() {
            return this.image;
        }

        public final TextAtom getTitle() {
            return this.title;
        }

        public int hashCode() {
            TextAtom textAtom = this.title;
            int hashCode = (textAtom == null ? 0 : textAtom.hashCode()) * 31;
            String str = this.backgroundColor;
            int a11 = g.a((hashCode + (str == null ? 0 : str.hashCode())) * 31, 31, this.image);
            AtomAction atomAction = this.action;
            int hashCode2 = (a11 + (atomAction == null ? 0 : atomAction.hashCode())) * 31;
            BadgeDTO badgeDTO = this.advBadgeV2;
            return hashCode2 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            TextAtom textAtom = this.title;
            String str = this.backgroundColor;
            String str2 = this.image;
            AtomAction atomAction = this.action;
            BadgeDTO badgeDTO = this.advBadgeV2;
            StringBuilder d11 = b.d("Data(title=", ", backgroundColor=", str, ", image=", textAtom);
            Ns.b.d(str2, ", action=", ", advBadgeV2=", d11, atomAction);
            return AZ.c.b(d11, badgeDTO, ")");
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\b\b\u0086\u0081\u0002\u0018\u0000 \b2\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\bB\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006j\u0002\b\u0007¨\u0006\t"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$PositionType;", "", "<init>", "(Ljava/lang/String;I)V", "INVALID", "FULL_WIDTH", "HALF_WIDTH_LEFT", "HALF_WIDTH_RIGHT", "Companion", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class PositionType {
        private static final /* synthetic */ a $ENTRIES;
        private static final /* synthetic */ PositionType[] $VALUES;

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE;

        @NotNull
        private static final Map<String, PositionType> values;
        public static final PositionType INVALID = new PositionType("INVALID", 0);
        public static final PositionType FULL_WIDTH = new PositionType("FULL_WIDTH", 1);
        public static final PositionType HALF_WIDTH_LEFT = new PositionType("HALF_WIDTH_LEFT", 2);
        public static final PositionType HALF_WIDTH_RIGHT = new PositionType("HALF_WIDTH_RIGHT", 3);

        @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0010\u0010\b\u001a\u00020\u00072\b\u0010\t\u001a\u0004\u0018\u00010\u0006R\u001a\u0010\u0004\u001a\u000e\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u00070\u0005X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\n"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$PositionType$Companion;", "", "<init>", "()V", "values", "", "", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$PositionType;", "fromValue", AppMeasurementSdk.ConditionalUserProperty.VALUE, "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @NotNull
            public final PositionType fromValue(String value) {
                PositionType positionType = (PositionType) PositionType.values.get(value);
                return positionType == null ? PositionType.INVALID : positionType;
            }

            private Companion() {
            }
        }

        private static final /* synthetic */ PositionType[] $values() {
            return new PositionType[]{INVALID, FULL_WIDTH, HALF_WIDTH_LEFT, HALF_WIDTH_RIGHT};
        }

        static {
            PositionType[] $values = $values();
            $VALUES = $values;
            $ENTRIES = Xc.b.a($values);
            INSTANCE = new Companion(null);
            PositionType[] values2 = values();
            int h11 = U.h(values2.length);
            LinkedHashMap linkedHashMap = new LinkedHashMap(h11 < 16 ? 16 : h11);
            for (PositionType positionType : values2) {
                linkedHashMap.put(positionType.name(), positionType);
            }
            values = linkedHashMap;
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

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$Settings;", "", "", "rightIndent", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$PositionType;", "position", "<init>", "(ILru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$PositionType;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getRightIndent", "Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$PositionType;", "getPosition", "()Lru/ozon/app/android/fresh/main/widgets/navigationSlider/v3/presentation/row/NavigationSliderV3ItemVO$PositionType;", "widgets-main_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

    public NavigationSliderV3ItemVO(long j11, @NotNull Settings settings, @NotNull Data data, float f7, t tVar, boolean z11, boolean z12) {
        Intrinsics.checkNotNullParameter(settings, "settings");
        Intrinsics.checkNotNullParameter(data, "data");
        this.id = j11;
        this.settings = settings;
        this.data = data;
        this.ratio = f7;
        this.tokenizedEvent = tVar;
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

    public /* synthetic */ NavigationSliderV3ItemVO(long j11, Settings settings, Data data, float f7, t tVar, boolean z11, boolean z12, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(j11, settings, data, f7, tVar, z11, (i11 & 64) != 0 ? z11 : z12);
    }
}
