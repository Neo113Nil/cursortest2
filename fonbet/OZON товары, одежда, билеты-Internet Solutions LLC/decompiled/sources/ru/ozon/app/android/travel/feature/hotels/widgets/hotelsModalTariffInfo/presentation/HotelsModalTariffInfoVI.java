package ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation;

import B0.C2454a;
import Bi.b;
import C.o0;
import Ek.a;
import G.g;
import T7.P;
import WZ.t;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.travel.molecules.view.travelWidgetSettings.TravelWidgetSettingsVO;
import ru.ozon.uni.atoms.data.disclaimer.DisclaimerDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;

@Metadata(d1 = {"\u0000B\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0081\b\u0018\u00002\u00020\u0001:\u0005 !\"#$B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\f\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u0004\u0012\u000e\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u001d\u0010\u0006\u001a\b\u0012\u0004\u0012\u00020\u00050\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u001f\u0010\t\u001a\n\u0018\u00010\u0007j\u0004\u0018\u0001`\b8\u0006¢\u0006\f\n\u0004\b\t\u0010\u001d\u001a\u0004\b\u001e\u0010\u001f¨\u0006%"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI;", "Ll20/c;", "", "id", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "atoms", "LWZ/t;", "Lru/ozon/app/android/analytics/modules/tokenized/TokenizedEvent;", "viewEvent", "<init>", "(JLjava/util/List;LWZ/t;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/util/List;", "getAtoms", "()Ljava/util/List;", "LWZ/t;", "getViewEvent", "()LWZ/t;", "AtomWrapperVI", "TextAtomWrapper", "CellAtomWrapper", "DisclaimerAtomWrapper", "HtmlBlockWrapper", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class HotelsModalTariffInfoVI implements c {

    @NotNull
    private final List<AtomWrapperVI> atoms;
    private final long id;
    private final t viewEvent;

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0004\u0006\u0007\b\t¨\u0006\n"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "", "id", "", "getId", "()Ljava/lang/String;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$CellAtomWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$DisclaimerAtomWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$HtmlBlockWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$TextAtomWrapper;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface AtomWrapperVI {
        @NotNull
        String getId();
    }

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0007\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001BY\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\u0006\u0010\t\u001a\u00020\u0007\u0012\b\b\u0002\u0010\u000b\u001a\u00020\n\u0012\b\b\u0002\u0010\f\u001a\u00020\n\u0012\b\b\u0002\u0010\r\u001a\u00020\n\u0012\b\b\u0002\u0010\u000e\u001a\u00020\n¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0013\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u001a\u0010\u0018\u001a\u00020\u00172\b\u0010\u0016\u001a\u0004\u0018\u00010\u0015HÖ\u0003¢\u0006\u0004\b\u0018\u0010\u0019R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001a\u001a\u0004\b\u001b\u0010\u0012R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001f\u0010\u0012R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b!\u0010\"R\u0017\u0010\t\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\t\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\u000b\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b%\u0010\u0014R\u0017\u0010\f\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b&\u0010\u0014R\u0017\u0010\r\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\r\u0010$\u001a\u0004\b'\u0010\u0014R\u0017\u0010\u000e\u001a\u00020\n8\u0006¢\u0006\f\n\u0004\b\u000e\u0010$\u001a\u0004\b(\u0010\u0014¨\u0006)"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$CellAtomWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "atom", "backgroundColor", "", "topRadius", "bottomRadius", "", "topMargin", "startMargin", "endMargin", "bottomMargin", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/dsCell/CellDTO;Ljava/lang/String;FFIIII)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getBackgroundColor", "F", "getTopRadius", "()F", "getBottomRadius", "I", "getTopMargin", "getStartMargin", "getEndMargin", "getBottomMargin", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class CellAtomWrapper implements AtomWrapperVI {
        public static final int $stable = CellDTO.$stable;

        @NotNull
        private final CellDTO atom;
        private final String backgroundColor;
        private final int bottomMargin;
        private final float bottomRadius;
        private final int endMargin;

        @NotNull
        private final String id;
        private final int startMargin;
        private final int topMargin;
        private final float topRadius;

        public CellAtomWrapper(@NotNull String id2, @NotNull CellDTO atom, String str, float f7, float f11, int i11, int i12, int i13, int i14) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.id = id2;
            this.atom = atom;
            this.backgroundColor = str;
            this.topRadius = f7;
            this.bottomRadius = f11;
            this.topMargin = i11;
            this.startMargin = i12;
            this.endMargin = i13;
            this.bottomMargin = i14;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof CellAtomWrapper)) {
                return false;
            }
            CellAtomWrapper cellAtomWrapper = (CellAtomWrapper) other;
            return Intrinsics.d(this.id, cellAtomWrapper.id) && Intrinsics.d(this.atom, cellAtomWrapper.atom) && Intrinsics.d(this.backgroundColor, cellAtomWrapper.backgroundColor) && Float.compare(this.topRadius, cellAtomWrapper.topRadius) == 0 && Float.compare(this.bottomRadius, cellAtomWrapper.bottomRadius) == 0 && this.topMargin == cellAtomWrapper.topMargin && this.startMargin == cellAtomWrapper.startMargin && this.endMargin == cellAtomWrapper.endMargin && this.bottomMargin == cellAtomWrapper.bottomMargin;
        }

        @NotNull
        public final CellDTO getAtom() {
            return this.atom;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getBottomMargin() {
            return this.bottomMargin;
        }

        public final float getBottomRadius() {
            return this.bottomRadius;
        }

        public final int getEndMargin() {
            return this.endMargin;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI.AtomWrapperVI
        @NotNull
        public String getId() {
            return this.id;
        }

        public final int getStartMargin() {
            return this.startMargin;
        }

        public final int getTopMargin() {
            return this.topMargin;
        }

        public final float getTopRadius() {
            return this.topRadius;
        }

        public int hashCode() {
            int c11 = b.c(this.atom, this.id.hashCode() * 31, 31);
            String str = this.backgroundColor;
            return Integer.hashCode(this.bottomMargin) + C2454a.a(this.endMargin, C2454a.a(this.startMargin, C2454a.a(this.topMargin, Pk0.b.a(this.bottomRadius, Pk0.b.a(this.topRadius, (c11 + (str == null ? 0 : str.hashCode())) * 31, 31), 31), 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            CellDTO cellDTO = this.atom;
            String str2 = this.backgroundColor;
            float f7 = this.topRadius;
            float f11 = this.bottomRadius;
            int i11 = this.topMargin;
            int i12 = this.startMargin;
            int i13 = this.endMargin;
            int i14 = this.bottomMargin;
            StringBuilder sb2 = new StringBuilder("CellAtomWrapper(id=");
            sb2.append(str);
            sb2.append(", atom=");
            sb2.append(cellDTO);
            sb2.append(", backgroundColor=");
            sb2.append(str2);
            sb2.append(", topRadius=");
            sb2.append(f7);
            sb2.append(", bottomRadius=");
            sb2.append(f11);
            sb2.append(", topMargin=");
            sb2.append(i11);
            sb2.append(", startMargin=");
            a.f(i12, i13, ", endMargin=", ", bottomMargin=", sb2);
            return K00.b.e(i14, ")", sb2);
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000b\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$DisclaimerAtomWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "", "id", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "atom", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "settings", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/disclaimer/DisclaimerDTO;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisclaimerAtomWrapper implements AtomWrapperVI {
        public static final int $stable = TravelWidgetSettingsVO.$stable | DisclaimerDTO.$stable;

        @NotNull
        private final DisclaimerDTO atom;

        @NotNull
        private final String id;

        @NotNull
        private final TravelWidgetSettingsVO settings;

        public DisclaimerAtomWrapper(@NotNull String id2, @NotNull DisclaimerDTO atom, @NotNull TravelWidgetSettingsVO settings) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(atom, "atom");
            Intrinsics.checkNotNullParameter(settings, "settings");
            this.id = id2;
            this.atom = atom;
            this.settings = settings;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclaimerAtomWrapper)) {
                return false;
            }
            DisclaimerAtomWrapper disclaimerAtomWrapper = (DisclaimerAtomWrapper) other;
            return Intrinsics.d(this.id, disclaimerAtomWrapper.id) && Intrinsics.d(this.atom, disclaimerAtomWrapper.atom) && Intrinsics.d(this.settings, disclaimerAtomWrapper.settings);
        }

        @NotNull
        public final DisclaimerDTO getAtom() {
            return this.atom;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI.AtomWrapperVI
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final TravelWidgetSettingsVO getSettings() {
            return this.settings;
        }

        public int hashCode() {
            return this.settings.hashCode() + ((this.atom.hashCode() + (this.id.hashCode() * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "DisclaimerAtomWrapper(id=" + this.id + ", atom=" + this.atom + ", settings=" + this.settings + ")";
        }
    }

    @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B/\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0006\u0010\b\u001a\u00020\u0002\u0012\u0006\u0010\t\u001a\u00020\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0016\u001a\u0004\b\u0017\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001b\u001a\u0004\b\u001c\u0010\u001dR\u0017\u0010\b\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\b\u0010\u0016\u001a\u0004\b\u001e\u0010\rR\u0017\u0010\t\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\t\u0010\u0016\u001a\u0004\b\u001f\u0010\r¨\u0006 "}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$HtmlBlockWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "", "id", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "htmlString", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "settings", "typographyToken", "textColor", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/utils/OzonSpannableString;Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/utils/OzonSpannableString;", "getHtmlString", "()Lru/ozon/uni/atoms/utils/OzonSpannableString;", "Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getSettings", "()Lru/ozon/app/android/travel/molecules/view/travelWidgetSettings/TravelWidgetSettingsVO;", "getTypographyToken", "getTextColor", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class HtmlBlockWrapper implements AtomWrapperVI {
        public static final int $stable = TravelWidgetSettingsVO.$stable | OzonSpannableString.$stable;

        @NotNull
        private final OzonSpannableString htmlString;

        @NotNull
        private final String id;

        @NotNull
        private final TravelWidgetSettingsVO settings;

        @NotNull
        private final String textColor;

        @NotNull
        private final String typographyToken;

        public HtmlBlockWrapper(@NotNull String id2, @NotNull OzonSpannableString htmlString, @NotNull TravelWidgetSettingsVO settings, @NotNull String typographyToken, @NotNull String textColor) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(htmlString, "htmlString");
            Intrinsics.checkNotNullParameter(settings, "settings");
            Intrinsics.checkNotNullParameter(typographyToken, "typographyToken");
            Intrinsics.checkNotNullParameter(textColor, "textColor");
            this.id = id2;
            this.htmlString = htmlString;
            this.settings = settings;
            this.typographyToken = typographyToken;
            this.textColor = textColor;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof HtmlBlockWrapper)) {
                return false;
            }
            HtmlBlockWrapper htmlBlockWrapper = (HtmlBlockWrapper) other;
            return Intrinsics.d(this.id, htmlBlockWrapper.id) && Intrinsics.d(this.htmlString, htmlBlockWrapper.htmlString) && Intrinsics.d(this.settings, htmlBlockWrapper.settings) && Intrinsics.d(this.typographyToken, htmlBlockWrapper.typographyToken) && Intrinsics.d(this.textColor, htmlBlockWrapper.textColor);
        }

        @NotNull
        public final OzonSpannableString getHtmlString() {
            return this.htmlString;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI.AtomWrapperVI
        @NotNull
        public String getId() {
            return this.id;
        }

        @NotNull
        public final TravelWidgetSettingsVO getSettings() {
            return this.settings;
        }

        @NotNull
        public final String getTextColor() {
            return this.textColor;
        }

        @NotNull
        public final String getTypographyToken() {
            return this.typographyToken;
        }

        public int hashCode() {
            return this.textColor.hashCode() + g.a((this.settings.hashCode() + P.c(this.htmlString, this.id.hashCode() * 31, 31)) * 31, 31, this.typographyToken);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            OzonSpannableString ozonSpannableString = this.htmlString;
            TravelWidgetSettingsVO travelWidgetSettingsVO = this.settings;
            String str2 = this.typographyToken;
            String str3 = this.textColor;
            StringBuilder sb2 = new StringBuilder("HtmlBlockWrapper(id=");
            sb2.append(str);
            sb2.append(", htmlString=");
            sb2.append((Object) ozonSpannableString);
            sb2.append(", settings=");
            sb2.append(travelWidgetSettingsVO);
            sb2.append(", typographyToken=");
            sb2.append(str2);
            sb2.append(", textColor=");
            return o0.c(sb2, str3, ")");
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public HotelsModalTariffInfoVI(long j11, @NotNull List<? extends AtomWrapperVI> atoms, t tVar) {
        Intrinsics.checkNotNullParameter(atoms, "atoms");
        this.id = j11;
        this.atoms = atoms;
        this.viewEvent = tVar;
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof HotelsModalTariffInfoVI)) {
            return false;
        }
        HotelsModalTariffInfoVI hotelsModalTariffInfoVI = (HotelsModalTariffInfoVI) other;
        return this.id == hotelsModalTariffInfoVI.id && Intrinsics.d(this.atoms, hotelsModalTariffInfoVI.atoms) && Intrinsics.d(this.viewEvent, hotelsModalTariffInfoVI.viewEvent);
    }

    @NotNull
    public final List<AtomWrapperVI> getAtoms() {
        return this.atoms;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return null;
    }

    public final t getViewEvent() {
        return this.viewEvent;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int b11 = g.b(Long.hashCode(this.id) * 31, 31, this.atoms);
        t tVar = this.viewEvent;
        return b11 + (tVar == null ? 0 : tVar.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        List<AtomWrapperVI> list = this.atoms;
        return Lh.a.b(Lh.b.b(j11, "HotelsModalTariffInfoVI(id=", ", atoms=", list), ", viewEvent=", this.viewEvent, ")");
    }

    @Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B5\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\b\u0002\u0010\u0007\u001a\u00020\u0006\u0012\b\b\u0002\u0010\b\u001a\u00020\u0006\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\rR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001a\u001a\u0004\b\u001b\u0010\u000fR\u0017\u0010\b\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010\u001a\u001a\u0004\b\u001c\u0010\u000fR\u0017\u0010\t\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\t\u0010\u001a\u001a\u0004\b\u001d\u0010\u000f¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$TextAtomWrapper;", "Lru/ozon/app/android/travel/feature/hotels/widgets/hotelsModalTariffInfo/presentation/HotelsModalTariffInfoVI$AtomWrapperVI;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", "atom", "", "topMargin", "startMargin", "endMargin", "<init>", "(Ljava/lang/String;Lru/ozon/uni/atoms/data/text/TextDTO;III)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "I", "getTopMargin", "getStartMargin", "getEndMargin", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class TextAtomWrapper implements AtomWrapperVI {

        @NotNull
        private final TextDTO atom;
        private final int endMargin;

        @NotNull
        private final String id;
        private final int startMargin;
        private final int topMargin;

        public TextAtomWrapper(@NotNull String id2, @NotNull TextDTO atom, int i11, int i12, int i13) {
            Intrinsics.checkNotNullParameter(id2, "id");
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.id = id2;
            this.atom = atom;
            this.topMargin = i11;
            this.startMargin = i12;
            this.endMargin = i13;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof TextAtomWrapper)) {
                return false;
            }
            TextAtomWrapper textAtomWrapper = (TextAtomWrapper) other;
            return Intrinsics.d(this.id, textAtomWrapper.id) && Intrinsics.d(this.atom, textAtomWrapper.atom) && this.topMargin == textAtomWrapper.topMargin && this.startMargin == textAtomWrapper.startMargin && this.endMargin == textAtomWrapper.endMargin;
        }

        @NotNull
        public final TextDTO getAtom() {
            return this.atom;
        }

        public final int getEndMargin() {
            return this.endMargin;
        }

        @Override // ru.ozon.app.android.travel.feature.hotels.widgets.hotelsModalTariffInfo.presentation.HotelsModalTariffInfoVI.AtomWrapperVI
        @NotNull
        public String getId() {
            return this.id;
        }

        public final int getStartMargin() {
            return this.startMargin;
        }

        public final int getTopMargin() {
            return this.topMargin;
        }

        public int hashCode() {
            return Integer.hashCode(this.endMargin) + C2454a.a(this.startMargin, C2454a.a(this.topMargin, Ns.b.a(this.atom, this.id.hashCode() * 31, 31), 31), 31);
        }

        @NotNull
        public String toString() {
            String str = this.id;
            TextDTO textDTO = this.atom;
            int i11 = this.topMargin;
            int i12 = this.startMargin;
            int i13 = this.endMargin;
            StringBuilder b11 = Co.a.b("TextAtomWrapper(id=", textDTO, str, ", atom=", ", topMargin=");
            a.f(i11, i12, ", startMargin=", ", endMargin=", b11);
            return K00.b.e(i13, ")", b11);
        }

        public /* synthetic */ TextAtomWrapper(String str, TextDTO textDTO, int i11, int i12, int i13, int i14, DefaultConstructorMarker defaultConstructorMarker) {
            this(str, textDTO, (i14 & 4) != 0 ? 0 : i11, (i14 & 8) != 0 ? 0 : i12, (i14 & 16) != 0 ? 0 : i13);
        }
    }
}
