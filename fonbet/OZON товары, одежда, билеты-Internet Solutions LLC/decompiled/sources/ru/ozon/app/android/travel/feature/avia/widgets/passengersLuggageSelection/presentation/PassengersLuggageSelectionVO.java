package ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation;

import Kk.C3532b;
import Ns.b;
import Pk0.f;
import T7.E;
import TY.a;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.aspect.AspectDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.dsCell.CellDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0010\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0002$%B)\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\u0006\u0010\b\u001a\u00020\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ:\u0010\r\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\b\b\u0002\u0010\b\u001a\u00020\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0012\u001a\u00020\u0011HÖ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u001a\u0010\u0017\u001a\u00020\u00162\b\u0010\u0015\u001a\u0004\u0018\u00010\u0014HÖ\u0003¢\u0006\u0004\b\u0017\u0010\u0018R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0019\u001a\u0004\b\u001a\u0010\u001bR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001f\u001a\u0004\b \u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010\"\u001a\u0004\b#\u0010\u0010¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "state", "", "asyncData", "<init>", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;Ljava/lang/String;)V", "copy", "(JLru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "Ljava/lang/String;", "getAsyncData", "State", "PassengerVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final /* data */ class PassengersLuggageSelectionVO implements c {
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0017\b\u0087\b\u0018\u00002\u00020\u0001:\u0001)BM\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\n\u001a\u00020\t\u0012\u0006\u0010\u000b\u001a\u00020\t\u0012\u0006\u0010\f\u001a\u00020\t\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r¢\u0006\u0004\b\u000f\u0010\u0010Jf\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\n\u001a\u00020\t2\b\b\u0002\u0010\u000b\u001a\u00020\t2\b\b\u0002\u0010\f\u001a\u00020\t2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\rHÆ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u0010\u0010\u0014\u001a\u00020\u0013HÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u0019\u001a\u00020\t2\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0019\u0010\u001aR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001b\u001a\u0004\b\u001c\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010 \u001a\u0004\b!\u0010\"R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\b\u0010 \u001a\u0004\b#\u0010\"R\u0017\u0010\n\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b\n\u0010%R\u0017\u0010\u000b\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\u000b\u0010$\u001a\u0004\b\u000b\u0010%R\u0017\u0010\f\u001a\u00020\t8\u0006¢\u0006\f\n\u0004\b\f\u0010$\u001a\u0004\b\f\u0010%R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010&\u001a\u0004\b'\u0010(¨\u0006*"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO;", "", "", "id", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "cell", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;", "luggageThere", "luggageBack", "", "isThereShow", "isBackShow", "isTextShow", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "bonusCardBadge", "<init>", "(ILru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;ZZZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)V", "copy", "(ILru/ozon/uni/atoms/data/dsCell/CellDTO;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;ZZZLru/ozon/uni/atoms/data/dsBadge/BadgeDTO;)Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "getCell", "()Lru/ozon/uni/atoms/data/dsCell/CellDTO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;", "getLuggageThere", "()Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;", "getLuggageBack", "Z", "()Z", "Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "getBonusCardBadge", "()Lru/ozon/uni/atoms/data/dsBadge/BadgeDTO;", "LuggageVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class PassengerVO {
        private final BadgeDTO bonusCardBadge;

        @NotNull
        private final CellDTO cell;
        private final int id;
        private final boolean isBackShow;
        private final boolean isTextShow;
        private final boolean isThereShow;
        private final LuggageVO luggageBack;
        private final LuggageVO luggageThere;

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001:\u0003\u0019\u001a\u001bB!\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00102\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u001f\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffListItemVO;", "tariffs", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Ljava/util/List;", "getTariffs", "()Ljava/util/List;", "TariffListItemVO", "SkeletonVO", "TariffVO", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LuggageVO {
            private final List<TariffListItemVO> tariffs;
            private final TextDTO title;

            @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\t\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u000bHÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\n¨\u0006\u0012"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$SkeletonVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffListItemVO;", "", "id", "<init>", "(I)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class SkeletonVO implements TariffListItemVO {
                private final int id;

                public SkeletonVO(int i11) {
                    this.id = i11;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    return (other instanceof SkeletonVO) && this.id == ((SkeletonVO) other).id;
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO
                public int getId() {
                    return this.id;
                }

                public int hashCode() {
                    return Integer.hashCode(this.id);
                }

                @NotNull
                public String toString() {
                    return E.a(this.id, "SkeletonVO(id=", ")");
                }
            }

            @Metadata(d1 = {"\u0000\u001c\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bp\u0018\u00002\u00020\u0001R\u0012\u0010\u0002\u001a\u00020\u0003X¦\u0004¢\u0006\u0006\u001a\u0004\b\u0004\u0010\u0005\u0082\u0001\u0002\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffListItemVO;", "", "id", "", "getId", "()I", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$SkeletonVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffVO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public interface TariffListItemVO {
                int getId();
            }

            @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\f\b\u0087\b\u0018\u00002\u00020\u0001B)\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\u0006\u0010\b\u001a\u00020\u0007¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u001a\u0010\u0003\u001a\u00020\u00028\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u000fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0017\u001a\u0004\b\u001a\u0010\u0019R\u0017\u0010\b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001b\u001a\u0004\b\u001c\u0010\u001d¨\u0006\u001e"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffVO;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO$LuggageVO$TariffListItemVO;", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "aspect", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/aspect/AspectDTO;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "getAspect", "()Lru/ozon/uni/atoms/data/aspect/AspectDTO;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
            public static final /* data */ class TariffVO implements TariffListItemVO {
                public static final int $stable = AspectDTO.$stable;

                @NotNull
                private final AspectDTO aspect;
                private final int id;
                private final TextDTO subtitle;

                @NotNull
                private final TextDTO title;

                public TariffVO(int i11, @NotNull TextDTO title, TextDTO textDTO, @NotNull AspectDTO aspect) {
                    Intrinsics.checkNotNullParameter(title, "title");
                    Intrinsics.checkNotNullParameter(aspect, "aspect");
                    this.id = i11;
                    this.title = title;
                    this.subtitle = textDTO;
                    this.aspect = aspect;
                }

                public boolean equals(Object other) {
                    if (this == other) {
                        return true;
                    }
                    if (!(other instanceof TariffVO)) {
                        return false;
                    }
                    TariffVO tariffVO = (TariffVO) other;
                    return this.id == tariffVO.id && Intrinsics.d(this.title, tariffVO.title) && Intrinsics.d(this.subtitle, tariffVO.subtitle) && Intrinsics.d(this.aspect, tariffVO.aspect);
                }

                @NotNull
                public final AspectDTO getAspect() {
                    return this.aspect;
                }

                @Override // ru.ozon.app.android.travel.feature.avia.widgets.passengersLuggageSelection.presentation.PassengersLuggageSelectionVO.PassengerVO.LuggageVO.TariffListItemVO
                public int getId() {
                    return this.id;
                }

                public final TextDTO getSubtitle() {
                    return this.subtitle;
                }

                @NotNull
                public final TextDTO getTitle() {
                    return this.title;
                }

                public int hashCode() {
                    int a11 = b.a(this.title, Integer.hashCode(this.id) * 31, 31);
                    TextDTO textDTO = this.subtitle;
                    return this.aspect.hashCode() + ((a11 + (textDTO == null ? 0 : textDTO.hashCode())) * 31);
                }

                @NotNull
                public String toString() {
                    int i11 = this.id;
                    TextDTO textDTO = this.title;
                    TextDTO textDTO2 = this.subtitle;
                    AspectDTO aspectDTO = this.aspect;
                    StringBuilder b11 = C4055a.b(textDTO, "TariffVO(id=", ", title=", ", subtitle=", i11);
                    b11.append(textDTO2);
                    b11.append(", aspect=");
                    b11.append(aspectDTO);
                    b11.append(")");
                    return b11.toString();
                }
            }

            /* JADX WARN: Multi-variable type inference failed */
            public LuggageVO(TextDTO textDTO, List<? extends TariffListItemVO> list) {
                this.title = textDTO;
                this.tariffs = list;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof LuggageVO)) {
                    return false;
                }
                LuggageVO luggageVO = (LuggageVO) other;
                return Intrinsics.d(this.title, luggageVO.title) && Intrinsics.d(this.tariffs, luggageVO.tariffs);
            }

            public final List<TariffListItemVO> getTariffs() {
                return this.tariffs;
            }

            public final TextDTO getTitle() {
                return this.title;
            }

            public int hashCode() {
                TextDTO textDTO = this.title;
                int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
                List<TariffListItemVO> list = this.tariffs;
                return hashCode + (list != null ? list.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "LuggageVO(title=" + this.title + ", tariffs=" + this.tariffs + ")";
            }
        }

        public PassengerVO(int i11, @NotNull CellDTO cell, LuggageVO luggageVO, LuggageVO luggageVO2, boolean z11, boolean z12, boolean z13, BadgeDTO badgeDTO) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            this.id = i11;
            this.cell = cell;
            this.luggageThere = luggageVO;
            this.luggageBack = luggageVO2;
            this.isThereShow = z11;
            this.isBackShow = z12;
            this.isTextShow = z13;
            this.bonusCardBadge = badgeDTO;
        }

        public static /* synthetic */ PassengerVO copy$default(PassengerVO passengerVO, int i11, CellDTO cellDTO, LuggageVO luggageVO, LuggageVO luggageVO2, boolean z11, boolean z12, boolean z13, BadgeDTO badgeDTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = passengerVO.id;
            }
            if ((i12 & 2) != 0) {
                cellDTO = passengerVO.cell;
            }
            if ((i12 & 4) != 0) {
                luggageVO = passengerVO.luggageThere;
            }
            if ((i12 & 8) != 0) {
                luggageVO2 = passengerVO.luggageBack;
            }
            if ((i12 & 16) != 0) {
                z11 = passengerVO.isThereShow;
            }
            if ((i12 & 32) != 0) {
                z12 = passengerVO.isBackShow;
            }
            if ((i12 & 64) != 0) {
                z13 = passengerVO.isTextShow;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                badgeDTO = passengerVO.bonusCardBadge;
            }
            boolean z14 = z13;
            BadgeDTO badgeDTO2 = badgeDTO;
            boolean z15 = z11;
            boolean z16 = z12;
            return passengerVO.copy(i11, cellDTO, luggageVO, luggageVO2, z15, z16, z14, badgeDTO2);
        }

        @NotNull
        public final PassengerVO copy(int id2, @NotNull CellDTO cell, LuggageVO luggageThere, LuggageVO luggageBack, boolean isThereShow, boolean isBackShow, boolean isTextShow, BadgeDTO bonusCardBadge) {
            Intrinsics.checkNotNullParameter(cell, "cell");
            return new PassengerVO(id2, cell, luggageThere, luggageBack, isThereShow, isBackShow, isTextShow, bonusCardBadge);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof PassengerVO)) {
                return false;
            }
            PassengerVO passengerVO = (PassengerVO) other;
            return this.id == passengerVO.id && Intrinsics.d(this.cell, passengerVO.cell) && Intrinsics.d(this.luggageThere, passengerVO.luggageThere) && Intrinsics.d(this.luggageBack, passengerVO.luggageBack) && this.isThereShow == passengerVO.isThereShow && this.isBackShow == passengerVO.isBackShow && this.isTextShow == passengerVO.isTextShow && Intrinsics.d(this.bonusCardBadge, passengerVO.bonusCardBadge);
        }

        public final BadgeDTO getBonusCardBadge() {
            return this.bonusCardBadge;
        }

        @NotNull
        public final CellDTO getCell() {
            return this.cell;
        }

        public final int getId() {
            return this.id;
        }

        public final LuggageVO getLuggageBack() {
            return this.luggageBack;
        }

        public final LuggageVO getLuggageThere() {
            return this.luggageThere;
        }

        public int hashCode() {
            int c11 = Bi.b.c(this.cell, Integer.hashCode(this.id) * 31, 31);
            LuggageVO luggageVO = this.luggageThere;
            int hashCode = (c11 + (luggageVO == null ? 0 : luggageVO.hashCode())) * 31;
            LuggageVO luggageVO2 = this.luggageBack;
            int a11 = C3532b.a(C3532b.a(C3532b.a((hashCode + (luggageVO2 == null ? 0 : luggageVO2.hashCode())) * 31, 31, this.isThereShow), 31, this.isBackShow), 31, this.isTextShow);
            BadgeDTO badgeDTO = this.bonusCardBadge;
            return a11 + (badgeDTO != null ? badgeDTO.hashCode() : 0);
        }

        /* renamed from: isBackShow, reason: from getter */
        public final boolean getIsBackShow() {
            return this.isBackShow;
        }

        /* renamed from: isTextShow, reason: from getter */
        public final boolean getIsTextShow() {
            return this.isTextShow;
        }

        /* renamed from: isThereShow, reason: from getter */
        public final boolean getIsThereShow() {
            return this.isThereShow;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            CellDTO cellDTO = this.cell;
            LuggageVO luggageVO = this.luggageThere;
            LuggageVO luggageVO2 = this.luggageBack;
            boolean z11 = this.isThereShow;
            boolean z12 = this.isBackShow;
            boolean z13 = this.isTextShow;
            BadgeDTO badgeDTO = this.bonusCardBadge;
            StringBuilder sb2 = new StringBuilder("PassengerVO(id=");
            sb2.append(i11);
            sb2.append(", cell=");
            sb2.append(cellDTO);
            sb2.append(", luggageThere=");
            sb2.append(luggageVO);
            sb2.append(", luggageBack=");
            sb2.append(luggageVO2);
            sb2.append(", isThereShow=");
            f.c(", isBackShow=", ", isTextShow=", sb2, z11, z12);
            sb2.append(z13);
            sb2.append(", bonusCardBadge=");
            sb2.append(badgeDTO);
            sb2.append(")");
            return sb2.toString();
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "", "RefreshState", "LoadedState", "FetchState", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$FetchState;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$LoadedState;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$RefreshState;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0005¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0012\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0006\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$FetchState;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO;", "passengers", "", "", "asyncParams", "<init>", "(Ljava/util/List;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "Ljava/util/Map;", "getAsyncParams", "()Ljava/util/Map;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class FetchState implements State {
            private final Map<String, String> asyncParams;

            @NotNull
            private final List<PassengerVO> passengers;

            public FetchState(@NotNull List<PassengerVO> passengers, Map<String, String> map) {
                Intrinsics.checkNotNullParameter(passengers, "passengers");
                this.passengers = passengers;
                this.asyncParams = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof FetchState)) {
                    return false;
                }
                FetchState fetchState = (FetchState) other;
                return Intrinsics.d(this.passengers, fetchState.passengers) && Intrinsics.d(this.asyncParams, fetchState.asyncParams);
            }

            public final Map<String, String> getAsyncParams() {
                return this.asyncParams;
            }

            @NotNull
            public final List<PassengerVO> getPassengers() {
                return this.passengers;
            }

            public int hashCode() {
                int hashCode = this.passengers.hashCode() * 31;
                Map<String, String> map = this.asyncParams;
                return hashCode + (map == null ? 0 : map.hashCode());
            }

            @NotNull
            public String toString() {
                return Kk.c.d("FetchState(passengers=", ", asyncParams=", ")", this.passengers, this.asyncParams);
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$LoadedState;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$PassengerVO;", "passengers", "<init>", "(Ljava/util/List;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getPassengers", "()Ljava/util/List;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class LoadedState implements State {

            @NotNull
            private final List<PassengerVO> passengers;

            public LoadedState(@NotNull List<PassengerVO> passengers) {
                Intrinsics.checkNotNullParameter(passengers, "passengers");
                this.passengers = passengers;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof LoadedState) && Intrinsics.d(this.passengers, ((LoadedState) other).passengers);
            }

            @NotNull
            public final List<PassengerVO> getPassengers() {
                return this.passengers;
            }

            public int hashCode() {
                return this.passengers.hashCode();
            }

            @NotNull
            public String toString() {
                return H3.c.a("LoadedState(passengers=", ")", this.passengers);
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State$RefreshState;", "Lru/ozon/app/android/travel/feature/avia/widgets/passengersLuggageSelection/presentation/PassengersLuggageSelectionVO$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RefreshState implements State {

            @NotNull
            public static final RefreshState INSTANCE = new RefreshState();

            private RefreshState() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof RefreshState);
            }

            public int hashCode() {
                return 1506654123;
            }

            @NotNull
            public String toString() {
                return "RefreshState";
            }
        }
    }

    public PassengersLuggageSelectionVO(long j11, @NotNull TextDTO title, @NotNull State state, String str) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.title = title;
        this.state = state;
        this.asyncData = str;
    }

    public static /* synthetic */ PassengersLuggageSelectionVO copy$default(PassengersLuggageSelectionVO passengersLuggageSelectionVO, long j11, TextDTO textDTO, State state, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = passengersLuggageSelectionVO.id;
        }
        long j12 = j11;
        if ((i11 & 2) != 0) {
            textDTO = passengersLuggageSelectionVO.title;
        }
        TextDTO textDTO2 = textDTO;
        if ((i11 & 4) != 0) {
            state = passengersLuggageSelectionVO.state;
        }
        State state2 = state;
        if ((i11 & 8) != 0) {
            str = passengersLuggageSelectionVO.asyncData;
        }
        return passengersLuggageSelectionVO.copy(j12, textDTO2, state2, str);
    }

    @NotNull
    public final PassengersLuggageSelectionVO copy(long id2, @NotNull TextDTO title, @NotNull State state, String asyncData) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(state, "state");
        return new PassengersLuggageSelectionVO(id2, title, state, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof PassengersLuggageSelectionVO)) {
            return false;
        }
        PassengersLuggageSelectionVO passengersLuggageSelectionVO = (PassengersLuggageSelectionVO) other;
        return this.id == passengersLuggageSelectionVO.id && Intrinsics.d(this.title, passengersLuggageSelectionVO.title) && Intrinsics.d(this.state, passengersLuggageSelectionVO.state) && Intrinsics.d(this.asyncData, passengersLuggageSelectionVO.asyncData);
    }

    public final String getAsyncData() {
        return this.asyncData;
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
    public final State getState() {
        return this.state;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + b.a(this.title, Long.hashCode(this.id) * 31, 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        TextDTO textDTO = this.title;
        State state = this.state;
        String str = this.asyncData;
        StringBuilder b11 = a.b("PassengersLuggageSelectionVO(id=", j11, ", title=", textDTO);
        b11.append(", state=");
        b11.append(state);
        b11.append(", asyncData=");
        b11.append(str);
        b11.append(")");
        return b11.toString();
    }
}
