package ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation;

import B0.C2454a;
import Cm.e;
import G.g;
import I0.C3173b;
import K1.G;
import Kk.C3532b;
import Nh.a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.Arrays;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.data.QuickFiltersDTO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.AsyncActionVO;
import ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.AtomDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u000f\b\u0080\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0006\u001c\u001d\u001e\u001f !B\u0017\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ$\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u0005HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0014\u001a\u00020\u00132\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0014\u0010\u0015R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0019\u001a\u0004\b\u001a\u0010\u001b¨\u0006\""}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "state", "<init>", "(JLru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "getState", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "QuickFiltersState", "FilterItem", "AtomViewVO", "Divider", "Loader", "SkeletonsSettings", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class QuickFiltersVO implements c {
    private final long id;

    @NotNull
    private final QuickFiltersState state;

    @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$AtomViewVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$FilterItem;", "", "id", "Lru/ozon/uni/atoms/data/AtomDTO;", "atom", "<init>", "(ILru/ozon/uni/atoms/data/AtomDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/AtomDTO;", "getAtom", "()Lru/ozon/uni/atoms/data/AtomDTO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class AtomViewVO implements FilterItem {

        @NotNull
        private final AtomDTO atom;
        private final int id;

        public AtomViewVO(int i11, @NotNull AtomDTO atom) {
            Intrinsics.checkNotNullParameter(atom, "atom");
            this.id = i11;
            this.atom = atom;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof AtomViewVO)) {
                return false;
            }
            AtomViewVO atomViewVO = (AtomViewVO) other;
            return this.id == atomViewVO.id && Intrinsics.d(this.atom, atomViewVO.atom);
        }

        @NotNull
        public final AtomDTO getAtom() {
            return this.atom;
        }

        @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO.FilterItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.atom.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return "AtomViewVO(id=" + this.id + ", atom=" + this.atom + ")";
        }
    }

    @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u000bR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\t¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Divider;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$FilterItem;", "", "id", "", "color", "<init>", "(ILjava/lang/String;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Ljava/lang/String;", "getColor", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Divider implements FilterItem {

        @NotNull
        private final String color;
        private final int id;

        public Divider(int i11, @NotNull String color) {
            Intrinsics.checkNotNullParameter(color, "color");
            this.id = i11;
            this.color = color;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Divider)) {
                return false;
            }
            Divider divider = (Divider) other;
            return this.id == divider.id && Intrinsics.d(this.color, divider.color);
        }

        @NotNull
        public final String getColor() {
            return this.color;
        }

        @Override // ru.ozon.app.android.travel.feature.general.booking.widgets.quickFilters.presentation.QuickFiltersVO.FilterItem
        public int getId() {
            return this.id;
        }

        public int hashCode() {
            return this.color.hashCode() + (Integer.hashCode(this.id) * 31);
        }

        @NotNull
        public String toString() {
            return a.c(this.id, "Divider(id=", ", color=", this.color, ")");
        }
    }

    @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$FilterItem;", "", "id", "", "getId", "()I", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$AtomViewVO;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Divider;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface FilterItem {
        int getId();
    }

    @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\f\b\u0086\b\u0018\u00002\u00020\u0001B-\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0004HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0010\u001a\u00020\u00022\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0003\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u000bR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0016\u0010\u000bR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0014\u001a\u0004\b\u0017\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;", "", "", "isProgressBarShown", "", "backgroundColor", "solidColor", "gradientAccentColor", "<init>", "(ZLjava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Z", "()Z", "Ljava/lang/String;", "getBackgroundColor", "getSolidColor", "getGradientAccentColor", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Loader {
        private final String backgroundColor;
        private final String gradientAccentColor;
        private final boolean isProgressBarShown;
        private final String solidColor;

        public Loader(boolean z11, String str, String str2, String str3) {
            this.isProgressBarShown = z11;
            this.backgroundColor = str;
            this.solidColor = str2;
            this.gradientAccentColor = str3;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Loader)) {
                return false;
            }
            Loader loader = (Loader) other;
            return this.isProgressBarShown == loader.isProgressBarShown && Intrinsics.d(this.backgroundColor, loader.backgroundColor) && Intrinsics.d(this.solidColor, loader.solidColor) && Intrinsics.d(this.gradientAccentColor, loader.gradientAccentColor);
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final String getGradientAccentColor() {
            return this.gradientAccentColor;
        }

        public final String getSolidColor() {
            return this.solidColor;
        }

        public int hashCode() {
            int hashCode = Boolean.hashCode(this.isProgressBarShown) * 31;
            String str = this.backgroundColor;
            int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.solidColor;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.gradientAccentColor;
            return hashCode3 + (str3 != null ? str3.hashCode() : 0);
        }

        /* renamed from: isProgressBarShown, reason: from getter */
        public final boolean getIsProgressBarShown() {
            return this.isProgressBarShown;
        }

        @NotNull
        public String toString() {
            boolean z11 = this.isProgressBarShown;
            String str = this.backgroundColor;
            return C3173b.c(G.d("Loader(isProgressBarShown=", ", backgroundColor=", str, ", solidColor=", z11), this.solidColor, ", gradientAccentColor=", this.gradientAccentColor, ")");
        }
    }

    @Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u0000\n\u0002\b#\b\u0086\b\u0018\u00002\u00020\u0001B\u0085\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\f\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u0006\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\b\u0010\u0010\u001a\u0004\u0018\u00010\u000f\u0012\u0014\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u0011\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014\u0012\u0006\u0010\u0016\u001a\u00020\u0014\u0012\u0006\u0010\u0018\u001a\u00020\u0017\u0012\u0006\u0010\u0019\u001a\u00020\r¢\u0006\u0004\b\u001a\u0010\u001bJ¦\u0001\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\u000e\b\u0002\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\f\u001a\u00020\u000b2\b\b\u0002\u0010\u000e\u001a\u00020\r2\n\b\u0002\u0010\u0010\u001a\u0004\u0018\u00010\u000f2\u0016\b\u0002\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00112\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00142\b\b\u0002\u0010\u0016\u001a\u00020\u00142\b\b\u0002\u0010\u0018\u001a\u00020\u00172\b\b\u0002\u0010\u0019\u001a\u00020\rHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0014HÖ\u0001¢\u0006\u0004\b \u0010!J\u001a\u0010$\u001a\u00020\r2\b\u0010#\u001a\u0004\u0018\u00010\"HÖ\u0003¢\u0006\u0004\b$\u0010%R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010&\u001a\u0004\b'\u0010(R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010+R\u001d\u0010\b\u001a\b\u0012\u0004\u0012\u00020\u00070\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010,\u001a\u0004\b-\u0010.R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010/\u001a\u0004\b0\u0010\u001fR\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00104\u001a\u0004\b\u000e\u00105R\u0019\u0010\u0010\u001a\u0004\u0018\u00010\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00106\u001a\u0004\b7\u00108R%\u0010\u0013\u001a\u0010\u0012\u0004\u0012\u00020\t\u0012\u0004\u0012\u00020\u0012\u0018\u00010\u00118\u0006¢\u0006\f\n\u0004\b\u0013\u00109\u001a\u0004\b:\u0010;R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0015\u0010<\u001a\u0004\b=\u0010>R\u0017\u0010\u0016\u001a\u00020\u00148\u0006¢\u0006\f\n\u0004\b\u0016\u0010?\u001a\u0004\b@\u0010!R\u0017\u0010\u0018\u001a\u00020\u00178\u0006¢\u0006\f\n\u0004\b\u0018\u0010A\u001a\u0004\bB\u0010CR\u0017\u0010\u0019\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u0019\u00104\u001a\u0004\bD\u00105¨\u0006E"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/HasAsyncAction;", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "asyncAction", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$FilterItem;", "items", "", "backgroundColor", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;", "loader", "", "isSkeletonVisible", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;", "skeletonsSettings", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "viewEvent", "", "autoScrollIndex", "bottomPadding", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;", "stickyBehavior", "dynamicTitlePaddings", "<init>", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;ZLru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;Ljava/util/Map;Ljava/lang/Integer;ILru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;Z)V", "copy", "(Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/lang/String;Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;ZLru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;Ljava/util/Map;Ljava/lang/Integer;ILru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;Z)Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$QuickFiltersState;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "getAsyncAction", "()Lru/ozon/app/android/travel/utils/asyncWidget/asyncAction/AsyncActionVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getItems", "()Ljava/util/List;", "Ljava/lang/String;", "getBackgroundColor", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;", "getLoader", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$Loader;", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;", "getSkeletonsSettings", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;", "Ljava/util/Map;", "getViewEvent", "()Ljava/util/Map;", "Ljava/lang/Integer;", "getAutoScrollIndex", "()Ljava/lang/Integer;", "I", "getBottomPadding", "Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;", "getStickyBehavior", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/data/QuickFiltersDTO$StickyBehavior;", "getDynamicTitlePaddings", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class QuickFiltersState implements HasAsyncAction {
        private final AsyncActionVO asyncAction;
        private final Integer autoScrollIndex;
        private final String backgroundColor;
        private final int bottomPadding;
        private final boolean dynamicTitlePaddings;
        private final boolean isSkeletonVisible;

        @NotNull
        private final List<FilterItem> items;

        @NotNull
        private final Loader loader;
        private final SkeletonsSettings skeletonsSettings;

        @NotNull
        private final QuickFiltersDTO.StickyBehavior stickyBehavior;
        private final TextDTO title;
        private final Map<String, TokenizedTrackingInfo> viewEvent;

        /* JADX WARN: Multi-variable type inference failed */
        public QuickFiltersState(AsyncActionVO asyncActionVO, TextDTO textDTO, @NotNull List<? extends FilterItem> items, String str, @NotNull Loader loader, boolean z11, SkeletonsSettings skeletonsSettings, Map<String, TokenizedTrackingInfo> map, Integer num, int i11, @NotNull QuickFiltersDTO.StickyBehavior stickyBehavior, boolean z12) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(loader, "loader");
            Intrinsics.checkNotNullParameter(stickyBehavior, "stickyBehavior");
            this.asyncAction = asyncActionVO;
            this.title = textDTO;
            this.items = items;
            this.backgroundColor = str;
            this.loader = loader;
            this.isSkeletonVisible = z11;
            this.skeletonsSettings = skeletonsSettings;
            this.viewEvent = map;
            this.autoScrollIndex = num;
            this.bottomPadding = i11;
            this.stickyBehavior = stickyBehavior;
            this.dynamicTitlePaddings = z12;
        }

        public static /* synthetic */ QuickFiltersState copy$default(QuickFiltersState quickFiltersState, AsyncActionVO asyncActionVO, TextDTO textDTO, List list, String str, Loader loader, boolean z11, SkeletonsSettings skeletonsSettings, Map map, Integer num, int i11, QuickFiltersDTO.StickyBehavior stickyBehavior, boolean z12, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                asyncActionVO = quickFiltersState.asyncAction;
            }
            if ((i12 & 2) != 0) {
                textDTO = quickFiltersState.title;
            }
            if ((i12 & 4) != 0) {
                list = quickFiltersState.items;
            }
            if ((i12 & 8) != 0) {
                str = quickFiltersState.backgroundColor;
            }
            if ((i12 & 16) != 0) {
                loader = quickFiltersState.loader;
            }
            if ((i12 & 32) != 0) {
                z11 = quickFiltersState.isSkeletonVisible;
            }
            if ((i12 & 64) != 0) {
                skeletonsSettings = quickFiltersState.skeletonsSettings;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                map = quickFiltersState.viewEvent;
            }
            if ((i12 & 256) != 0) {
                num = quickFiltersState.autoScrollIndex;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                i11 = quickFiltersState.bottomPadding;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
                stickyBehavior = quickFiltersState.stickyBehavior;
            }
            if ((i12 & 2048) != 0) {
                z12 = quickFiltersState.dynamicTitlePaddings;
            }
            QuickFiltersDTO.StickyBehavior stickyBehavior2 = stickyBehavior;
            boolean z13 = z12;
            Integer num2 = num;
            int i13 = i11;
            SkeletonsSettings skeletonsSettings2 = skeletonsSettings;
            Map map2 = map;
            Loader loader2 = loader;
            boolean z14 = z11;
            return quickFiltersState.copy(asyncActionVO, textDTO, list, str, loader2, z14, skeletonsSettings2, map2, num2, i13, stickyBehavior2, z13);
        }

        @NotNull
        public final QuickFiltersState copy(AsyncActionVO asyncAction, TextDTO title, @NotNull List<? extends FilterItem> items, String backgroundColor, @NotNull Loader loader, boolean isSkeletonVisible, SkeletonsSettings skeletonsSettings, Map<String, TokenizedTrackingInfo> viewEvent, Integer autoScrollIndex, int bottomPadding, @NotNull QuickFiltersDTO.StickyBehavior stickyBehavior, boolean dynamicTitlePaddings) {
            Intrinsics.checkNotNullParameter(items, "items");
            Intrinsics.checkNotNullParameter(loader, "loader");
            Intrinsics.checkNotNullParameter(stickyBehavior, "stickyBehavior");
            return new QuickFiltersState(asyncAction, title, items, backgroundColor, loader, isSkeletonVisible, skeletonsSettings, viewEvent, autoScrollIndex, bottomPadding, stickyBehavior, dynamicTitlePaddings);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof QuickFiltersState)) {
                return false;
            }
            QuickFiltersState quickFiltersState = (QuickFiltersState) other;
            return Intrinsics.d(this.asyncAction, quickFiltersState.asyncAction) && Intrinsics.d(this.title, quickFiltersState.title) && Intrinsics.d(this.items, quickFiltersState.items) && Intrinsics.d(this.backgroundColor, quickFiltersState.backgroundColor) && Intrinsics.d(this.loader, quickFiltersState.loader) && this.isSkeletonVisible == quickFiltersState.isSkeletonVisible && Intrinsics.d(this.skeletonsSettings, quickFiltersState.skeletonsSettings) && Intrinsics.d(this.viewEvent, quickFiltersState.viewEvent) && Intrinsics.d(this.autoScrollIndex, quickFiltersState.autoScrollIndex) && this.bottomPadding == quickFiltersState.bottomPadding && this.stickyBehavior == quickFiltersState.stickyBehavior && this.dynamicTitlePaddings == quickFiltersState.dynamicTitlePaddings;
        }

        @Override // ru.ozon.app.android.travel.utils.asyncWidget.asyncAction.HasAsyncAction
        public AsyncActionVO getAsyncAction() {
            return this.asyncAction;
        }

        public final Integer getAutoScrollIndex() {
            return this.autoScrollIndex;
        }

        public final String getBackgroundColor() {
            return this.backgroundColor;
        }

        public final int getBottomPadding() {
            return this.bottomPadding;
        }

        public final boolean getDynamicTitlePaddings() {
            return this.dynamicTitlePaddings;
        }

        @NotNull
        public final List<FilterItem> getItems() {
            return this.items;
        }

        @NotNull
        public final Loader getLoader() {
            return this.loader;
        }

        public final SkeletonsSettings getSkeletonsSettings() {
            return this.skeletonsSettings;
        }

        @NotNull
        public final QuickFiltersDTO.StickyBehavior getStickyBehavior() {
            return this.stickyBehavior;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, TokenizedTrackingInfo> getViewEvent() {
            return this.viewEvent;
        }

        public int hashCode() {
            AsyncActionVO asyncActionVO = this.asyncAction;
            int hashCode = (asyncActionVO == null ? 0 : asyncActionVO.hashCode()) * 31;
            TextDTO textDTO = this.title;
            int b11 = g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.items);
            String str = this.backgroundColor;
            int a11 = C3532b.a((this.loader.hashCode() + ((b11 + (str == null ? 0 : str.hashCode())) * 31)) * 31, 31, this.isSkeletonVisible);
            SkeletonsSettings skeletonsSettings = this.skeletonsSettings;
            int hashCode2 = (a11 + (skeletonsSettings == null ? 0 : skeletonsSettings.hashCode())) * 31;
            Map<String, TokenizedTrackingInfo> map = this.viewEvent;
            int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
            Integer num = this.autoScrollIndex;
            return Boolean.hashCode(this.dynamicTitlePaddings) + ((this.stickyBehavior.hashCode() + C2454a.a(this.bottomPadding, (hashCode3 + (num != null ? num.hashCode() : 0)) * 31, 31)) * 31);
        }

        /* renamed from: isSkeletonVisible, reason: from getter */
        public final boolean getIsSkeletonVisible() {
            return this.isSkeletonVisible;
        }

        @NotNull
        public String toString() {
            AsyncActionVO asyncActionVO = this.asyncAction;
            TextDTO textDTO = this.title;
            List<FilterItem> list = this.items;
            String str = this.backgroundColor;
            Loader loader = this.loader;
            boolean z11 = this.isSkeletonVisible;
            SkeletonsSettings skeletonsSettings = this.skeletonsSettings;
            Map<String, TokenizedTrackingInfo> map = this.viewEvent;
            Integer num = this.autoScrollIndex;
            int i11 = this.bottomPadding;
            QuickFiltersDTO.StickyBehavior stickyBehavior = this.stickyBehavior;
            boolean z12 = this.dynamicTitlePaddings;
            StringBuilder sb2 = new StringBuilder("QuickFiltersState(asyncAction=");
            sb2.append(asyncActionVO);
            sb2.append(", title=");
            sb2.append(textDTO);
            sb2.append(", items=");
            e.i(", backgroundColor=", str, ", loader=", sb2, list);
            sb2.append(loader);
            sb2.append(", isSkeletonVisible=");
            sb2.append(z11);
            sb2.append(", skeletonsSettings=");
            sb2.append(skeletonsSettings);
            sb2.append(", viewEvent=");
            sb2.append(map);
            sb2.append(", autoScrollIndex=");
            sb2.append(num);
            sb2.append(", bottomPadding=");
            sb2.append(i11);
            sb2.append(", stickyBehavior=");
            sb2.append(stickyBehavior);
            sb2.append(", dynamicTitlePaddings=");
            sb2.append(z12);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u0015\n\u0002\b\u0004\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\n\b\u0001\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0001\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u001a\u0010\n\u001a\u00020\t2\b\u0010\b\u001a\u0004\u0018\u00010\u0001H\u0096\u0002¢\u0006\u0004\b\n\u0010\u000bJ\u000f\u0010\f\u001a\u00020\u0002H\u0016¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/quickFilters/presentation/QuickFiltersVO$SkeletonsSettings;", "", "", "height", "", "widthPatterns", "<init>", "(Ljava/lang/Integer;[I)V", "other", "", "equals", "(Ljava/lang/Object;)Z", "hashCode", "()I", "", "toString", "()Ljava/lang/String;", "Ljava/lang/Integer;", "getHeight", "()Ljava/lang/Integer;", "[I", "getWidthPatterns", "()[I", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SkeletonsSettings {
        private final Integer height;
        private final int[] widthPatterns;

        public SkeletonsSettings(Integer num, int[] iArr) {
            this.height = num;
            this.widthPatterns = iArr;
        }

        public boolean equals(Object other) {
            if (other == null || !other.getClass().equals(SkeletonsSettings.class)) {
                return false;
            }
            SkeletonsSettings skeletonsSettings = (SkeletonsSettings) other;
            return Intrinsics.d(this.height, skeletonsSettings.height) && Arrays.equals(this.widthPatterns, skeletonsSettings.widthPatterns);
        }

        public final Integer getHeight() {
            return this.height;
        }

        public final int[] getWidthPatterns() {
            return this.widthPatterns;
        }

        public int hashCode() {
            Integer num = this.height;
            return Arrays.hashCode(this.widthPatterns) + ((155 + (num != null ? num.intValue() : 0)) * 31);
        }

        @NotNull
        public String toString() {
            return "SkeletonsSettings(height=" + this.height + ", widthPatterns=" + Arrays.toString(this.widthPatterns) + ")";
        }
    }

    public QuickFiltersVO(long j11, @NotNull QuickFiltersState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
    }

    public static /* synthetic */ QuickFiltersVO copy$default(QuickFiltersVO quickFiltersVO, long j11, QuickFiltersState quickFiltersState, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = quickFiltersVO.id;
        }
        if ((i11 & 2) != 0) {
            quickFiltersState = quickFiltersVO.state;
        }
        return quickFiltersVO.copy(j11, quickFiltersState);
    }

    @NotNull
    public final QuickFiltersVO copy(long id2, @NotNull QuickFiltersState state) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new QuickFiltersVO(id2, state);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof QuickFiltersVO)) {
            return false;
        }
        QuickFiltersVO quickFiltersVO = (QuickFiltersVO) other;
        return this.id == quickFiltersVO.id && Intrinsics.d(this.state, quickFiltersVO.state);
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
    public final QuickFiltersState getState() {
        return this.state;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        return this.state.hashCode() + (Long.hashCode(this.id) * 31);
    }

    @NotNull
    public String toString() {
        return "QuickFiltersVO(id=" + this.id + ", state=" + this.state + ")";
    }
}
