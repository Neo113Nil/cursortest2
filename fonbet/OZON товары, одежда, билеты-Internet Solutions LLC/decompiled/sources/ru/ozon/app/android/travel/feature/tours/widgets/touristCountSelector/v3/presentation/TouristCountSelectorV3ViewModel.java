package ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation;

import Kk.c;
import Nh.a;
import androidx.lifecycle.P;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.UUID;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.K;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l10.InterfaceC7851b;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.action.v2.ActionV2Repository;
import ru.ozon.app.android.travel.feature.tours.R$string;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.data.TouristCountSelectorV3RoomRequest;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.TouristCountSelectorV3ConfigVO;
import ru.ozon.app.android.travel.feature.tours.widgets.touristCountSelector.v3.presentation.room.TouristCountSelectorV3RoomVO;
import ru.ozon.app.android.uikit.text.StringProvider;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.android.flashbar.model.Restriction;
import ru.ozon.uni.android.wrappers.main.chip.ChipState;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.common.CommonAtomLabelDTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.chip.ChipDTO;
import ru.ozon.uni.atoms.data.dsBadge.BadgeDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableString;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000ª\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0006\n\u0002\u0010\u001e\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0010\t\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0001\u0018\u0000 R2\u00020\u0001:\u0003RSTB\u001b\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\n\u0010\u0006\u001a\u00060\u0004j\u0002`\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u001f\u0010\u000e\u001a\u00020\r2\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000bH\u0002¢\u0006\u0004\b\u000e\u0010\u000fJ%\u0010\u0012\u001a\u0004\u0018\u00010\t*\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u0011\u001a\u00020\u0010H\u0002¢\u0006\u0004\b\u0012\u0010\u0013J\u0015\u0010\u0014\u001a\u0004\u0018\u00010\t*\u00020\tH\u0002¢\u0006\u0004\b\u0014\u0010\u0015J\u0015\u0010\u0016\u001a\u0004\u0018\u00010\t*\u00020\tH\u0002¢\u0006\u0004\b\u0016\u0010\u0015J1\u0010\u001e\u001a\u000e\u0012\u0004\u0012\u00020\u001c\u0012\u0004\u0012\u00020\u001d0\u001b2\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\t0\u00172\u0006\u0010\u001a\u001a\u00020\u0019H\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ'\u0010#\u001a\b\u0012\u0004\u0012\u00020!0 *\b\u0012\u0004\u0012\u00020!0 2\u0006\u0010\"\u001a\u00020!H\u0002¢\u0006\u0004\b#\u0010$J\u0013\u0010'\u001a\b\u0012\u0004\u0012\u00020&0%¢\u0006\u0004\b'\u0010(J\u0013\u0010*\u001a\b\u0012\u0004\u0012\u00020)0%¢\u0006\u0004\b*\u0010(J\u0013\u0010,\u001a\b\u0012\u0004\u0012\u00020+0%¢\u0006\u0004\b,\u0010(J\u0015\u00100\u001a\u00020/2\u0006\u0010.\u001a\u00020-¢\u0006\u0004\b0\u00101J\u0015\u00103\u001a\u00020/2\u0006\u00102\u001a\u00020\t¢\u0006\u0004\b3\u00104J\u001d\u00107\u001a\u00020/2\u0006\u00106\u001a\u0002052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b7\u00108J\u001d\u00109\u001a\u00020/2\u0006\u00106\u001a\u0002052\u0006\u0010\f\u001a\u00020\u000b¢\u0006\u0004\b9\u00108J%\u0010;\u001a\u00020/2\u0006\u00106\u001a\u0002052\u0006\u0010:\u001a\u00020\u00102\u0006\u0010\"\u001a\u00020!¢\u0006\u0004\b;\u0010<J\u0015\u0010=\u001a\u00020/2\u0006\u00106\u001a\u000205¢\u0006\u0004\b=\u0010>J\r\u0010?\u001a\u00020/¢\u0006\u0004\b?\u0010@J\u0015\u0010B\u001a\u00020/2\u0006\u0010\u001a\u001a\u00020A¢\u0006\u0004\bB\u0010CR\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010DR\u0018\u0010\u0006\u001a\u00060\u0004j\u0002`\u00058\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0006\u0010ER\u001a\u0010'\u001a\b\u0012\u0004\u0012\u00020&0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b'\u0010GR\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020)0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010GR\u001a\u0010,\u001a\b\u0012\u0004\u0012\u00020+0F8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b,\u0010GR \u0010I\u001a\u000e\u0012\u0004\u0012\u000205\u0012\u0004\u0012\u00020\t0H8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\bI\u0010JR\u0018\u0010K\u001a\u0004\u0018\u00010-8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bK\u0010LR\u0016\u0010M\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bM\u0010NR\u0018\u0010P\u001a\u0004\u0018\u00010O8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\bP\u0010Q¨\u0006U"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "actionV2Repository", "Ll10/b;", "Lru/ozon/app/android/composer/ComposerController;", "composerController", "<init>", "(Lru/ozon/app/android/action/v2/ActionV2Repository;Ll10/b;)V", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "room", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;", "cell", "", "isExceedMaxRestrictions", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;)Z", "", "valueDiff", "changeTouristsCount", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;I)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "removeChildForm", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;)Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "addChildForm", "", "rooms", "Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;", "action", "", "", "", "mapToRequest", "(Ljava/util/Collection;Lru/ozon/uni/atoms/af/AtomAction$ComposerAction;)Ljava/util/Map;", "", "Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;", "selectedChip", "changeSelection", "(Ljava/util/List;Lru/ozon/uni/atoms/data/controls/chip/ChipDTO;)Ljava/util/List;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action;", "actionLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update;", "roomsUpdateLiveData", "Lru/ozon/uni/android/flashbar/model/Restriction;", "restrictionLiveData", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO;", "config", "", "onBindConfig", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO;)V", "item", "onBindNewItem", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;)V", "", "roomId", "onMinusButtonClicked", "(JLru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3QuantityCellVO;)V", "onPlusButtonClicked", "childFormPosition", "onChildAgeSelected", "(JILru/ozon/uni/atoms/data/controls/chip/ChipDTO;)V", "onDeleteRoomClicked", "(J)V", "addRoom", "()V", "Lru/ozon/uni/atoms/af/AtomAction;", "submitRequest", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "Lru/ozon/app/android/action/v2/ActionV2Repository;", "Ll10/b;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "", "cachedRooms", "Ljava/util/Map;", "cachedConfig", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ConfigVO;", "touristsSum", "I", "Lxe/B0;", "submitJob", "Lxe/B0;", "Companion", "Action", "Update", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class TouristCountSelectorV3ViewModel extends w0 {

    @NotNull
    private final SingleLiveEvent<Action> actionLiveData;

    @NotNull
    private final ActionV2Repository actionV2Repository;
    private TouristCountSelectorV3ConfigVO cachedConfig;

    @NotNull
    private final Map<Long, TouristCountSelectorV3RoomVO> cachedRooms;

    @NotNull
    private final InterfaceC7851b composerController;

    @NotNull
    private final SingleLiveEvent<Restriction> restrictionLiveData;

    @NotNull
    private final SingleLiveEvent<Update> roomsUpdateLiveData;
    private B0 submitJob;
    private int touristsSum;

    @NotNull
    private static final Companion Companion = new Companion(null);
    public static final int $stable = 8;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action;", "", "Error", "HandleAction", "RefreshAction", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action$RefreshAction;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Action {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action$Error;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements Action {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return -808100465;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action$HandleAction;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action;", "Lru/ozon/uni/atoms/af/AtomAction;", "atomAction", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAtomAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class HandleAction implements Action {
            public static final int $stable = AtomAction.$stable;

            @NotNull
            private final AtomAction atomAction;

            public HandleAction(@NotNull AtomAction atomAction) {
                Intrinsics.checkNotNullParameter(atomAction, "atomAction");
                this.atomAction = atomAction;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof HandleAction) && Intrinsics.d(this.atomAction, ((HandleAction) other).atomAction);
            }

            @NotNull
            public final AtomAction getAtomAction() {
                return this.atomAction;
            }

            public int hashCode() {
                return this.atomAction.hashCode();
            }

            @NotNull
            public String toString() {
                return c.e("HandleAction(atomAction=", ")", this.atomAction);
            }
        }

        @Metadata(d1 = {"\u0000,\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0005\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B'\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0014\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u0010\u001a\u00020\u000f2\b\u0010\u000e\u001a\u0004\u0018\u00010\rHÖ\u0003¢\u0006\u0004\b\u0010\u0010\u0011R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0012\u001a\u0004\b\u0013\u0010\tR%\u0010\u0005\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action$RefreshAction;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Action;", "", "link", "", "params", "<init>", "(Ljava/lang/String;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLink", "Ljava/util/Map;", "getParams", "()Ljava/util/Map;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RefreshAction implements Action {
            private final String link;
            private final Map<String, String> params;

            public RefreshAction(String str, Map<String, String> map) {
                this.link = str;
                this.params = map;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RefreshAction)) {
                    return false;
                }
                RefreshAction refreshAction = (RefreshAction) other;
                return Intrinsics.d(this.link, refreshAction.link) && Intrinsics.d(this.params, refreshAction.params);
            }

            public final String getLink() {
                return this.link;
            }

            public final Map<String, String> getParams() {
                return this.params;
            }

            public int hashCode() {
                String str = this.link;
                int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                Map<String, String> map = this.params;
                return hashCode + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return a.d("RefreshAction(link=", this.link, ", params=", ")", this.params);
            }
        }
    }

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Companion;", "", "<init>", "()V", "ROOMS_PARAM", "", "CELL_ID_CHILD", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    public TouristCountSelectorV3ViewModel(@NotNull ActionV2Repository actionV2Repository, @NotNull InterfaceC7851b composerController) {
        Intrinsics.checkNotNullParameter(actionV2Repository, "actionV2Repository");
        Intrinsics.checkNotNullParameter(composerController, "composerController");
        this.actionV2Repository = actionV2Repository;
        this.composerController = composerController;
        this.actionLiveData = new SingleLiveEvent<>();
        this.roomsUpdateLiveData = new SingleLiveEvent<>();
        this.restrictionLiveData = new SingleLiveEvent<>();
        this.cachedRooms = new LinkedHashMap();
    }

    private final TouristCountSelectorV3RoomVO addChildForm(TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO) {
        TouristCountSelectorV3ConfigVO touristCountSelectorV3ConfigVO = this.cachedConfig;
        if (touristCountSelectorV3ConfigVO == null) {
            return null;
        }
        ArrayList W02 = C7714v.W0(touristCountSelectorV3RoomVO.getChildForms());
        W02.add(TouristCountSelectorV3ChildFormVO.copy$default(touristCountSelectorV3ConfigVO.getDefaultRoomConfig().getDefaultChildForm(), UUID.randomUUID().hashCode(), null, null, null, null, 0, 62, null));
        if (W02.size() > 1) {
            TextDTO title = touristCountSelectorV3ConfigVO.getDefaultRoomConfig().getDefaultChildForm().getTitle();
            Iterator it = W02.iterator();
            int i11 = 0;
            while (it.hasNext()) {
                Object next = it.next();
                int i12 = i11 + 1;
                if (i11 < 0) {
                    C7714v.O0();
                    throw null;
                }
                W02.set(i11, TouristCountSelectorV3ChildFormVO.copy$default((TouristCountSelectorV3ChildFormVO) next, 0, TextDTO.copy$default(title, OzonSpannableStringKt.toOzonSpannableString(((Object) title.getText()) + " " + i12), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null), null, null, null, 0, 61, null));
                i11 = i12;
            }
        }
        return TouristCountSelectorV3RoomVO.copy$default(touristCountSelectorV3RoomVO, 0L, null, false, null, false, null, W02, false, 191, null);
    }

    private final List<ChipDTO> changeSelection(List<ChipDTO> list, ChipDTO chipDTO) {
        Object obj;
        List<ChipDTO> list2 = list;
        Iterator<T> it = list2.iterator();
        while (true) {
            if (!it.hasNext()) {
                obj = null;
                break;
            }
            obj = it.next();
            if (((ChipDTO) obj).getState() == ChipState.SELECTED) {
                break;
            }
        }
        ChipDTO chipDTO2 = (ChipDTO) obj;
        if (chipDTO2 != null && Intrinsics.d(chipDTO2.getTitle().getText(), chipDTO.getTitle().getText())) {
            return list;
        }
        ArrayList arrayList = new ArrayList();
        for (ChipDTO chipDTO3 : list2) {
            ChipState state = chipDTO3.getState();
            ChipState chipState = ChipState.SELECTED;
            boolean z11 = state == chipState;
            boolean d11 = Intrinsics.d(chipDTO3.getTitle().getText(), chipDTO.getTitle().getText());
            if (z11 || d11) {
                if (!d11) {
                    chipState = ChipState.ENABLED;
                }
                chipDTO3 = ChipDTO.copy$default(chipDTO3, null, null, chipState, null, null, null, null, 123, null);
            }
            arrayList.add(chipDTO3);
        }
        return arrayList;
    }

    private final TouristCountSelectorV3RoomVO changeTouristsCount(TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO, TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO, int i11) {
        Iterator<TouristCountSelectorV3QuantityCellVO> it = touristCountSelectorV3RoomVO.getGuests().iterator();
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            }
            if (Intrinsics.d(it.next().getId(), touristCountSelectorV3QuantityCellVO.getId())) {
                break;
            }
            i12++;
        }
        Integer valueOf = Integer.valueOf(i12);
        if (i12 < 0) {
            valueOf = null;
        }
        if (valueOf == null) {
            return null;
        }
        int intValue = valueOf.intValue();
        ArrayList W02 = C7714v.W0(touristCountSelectorV3RoomVO.getGuests());
        int value = touristCountSelectorV3QuantityCellVO.getValue() + i11;
        W02.set(intValue, TouristCountSelectorV3QuantityCellVO.copy$default(touristCountSelectorV3QuantityCellVO, null, null, null, value, 0, 0, IconButtonV3DTO.copy$default(touristCountSelectorV3QuantityCellVO.getDecreaseButton(), null, null, null, null, Boolean.valueOf(value <= touristCountSelectorV3QuantityCellVO.getMinValue()), null, null, null, null, null, null, null, null, null, 16367, null), IconButtonV3DTO.copy$default(touristCountSelectorV3QuantityCellVO.getIncreaseButton(), null, null, null, null, Boolean.valueOf(value >= touristCountSelectorV3QuantityCellVO.getMaxValue()), null, null, null, null, null, null, null, null, null, 16367, null), null, 311, null));
        return TouristCountSelectorV3RoomVO.copy$default(touristCountSelectorV3RoomVO, 0L, null, false, null, false, W02, null, false, 223, null);
    }

    private final boolean isExceedMaxRestrictions(TouristCountSelectorV3RoomVO room, TouristCountSelectorV3QuantityCellVO cell) {
        TouristCountSelectorV3ConfigVO.AlertVO totalTouristAlert;
        TouristCountSelectorV3ConfigVO.AlertVO totalRoomTouristAlert;
        Iterator<T> it = room.getGuests().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            i11 += ((TouristCountSelectorV3QuantityCellVO) it.next()).getValue();
        }
        TouristCountSelectorV3ConfigVO touristCountSelectorV3ConfigVO = this.cachedConfig;
        if (touristCountSelectorV3ConfigVO != null && (totalRoomTouristAlert = touristCountSelectorV3ConfigVO.getTotalRoomTouristAlert()) != null && totalRoomTouristAlert.getValue() != null && totalRoomTouristAlert.getValue().intValue() <= i11) {
            this.restrictionLiveData.setValue(totalRoomTouristAlert.getRestriction());
            return true;
        }
        TouristCountSelectorV3ConfigVO touristCountSelectorV3ConfigVO2 = this.cachedConfig;
        if (touristCountSelectorV3ConfigVO2 != null && (totalTouristAlert = touristCountSelectorV3ConfigVO2.getTotalTouristAlert()) != null && totalTouristAlert.getValue() != null && totalTouristAlert.getValue().intValue() <= this.touristsSum) {
            this.restrictionLiveData.setValue(totalTouristAlert.getRestriction());
            return true;
        }
        if (!Intrinsics.d(cell.getIncreaseButton().isDisabled(), Boolean.TRUE)) {
            return false;
        }
        Restriction maxValueRestriction = cell.getMaxValueRestriction();
        if (maxValueRestriction != null) {
            this.restrictionLiveData.setValue(maxValueRestriction);
        }
        return true;
    }

    private final Map<String, Object> mapToRequest(Collection<TouristCountSelectorV3RoomVO> rooms, AtomAction.ComposerAction action) {
        CommonAtomLabelDTO title;
        OzonSpannableString text;
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Map<String, String> params = action.getParams();
        if (params != null) {
            linkedHashMap.putAll(params);
        }
        ArrayList arrayList = new ArrayList();
        for (TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO : rooms) {
            TouristCountSelectorV3RoomRequest touristCountSelectorV3RoomRequest = null;
            if (touristCountSelectorV3RoomVO.getIsRoomVisible()) {
                List<TouristCountSelectorV3QuantityCellVO> guests = touristCountSelectorV3RoomVO.getGuests();
                int h11 = U.h(C7714v.z(guests, 10));
                if (h11 < 16) {
                    h11 = 16;
                }
                LinkedHashMap linkedHashMap2 = new LinkedHashMap(h11);
                for (TouristCountSelectorV3QuantityCellVO touristCountSelectorV3QuantityCellVO : guests) {
                    Pair pair = new Pair(touristCountSelectorV3QuantityCellVO.getId(), Integer.valueOf(touristCountSelectorV3QuantityCellVO.getValue()));
                    linkedHashMap2.put(pair.e(), pair.f());
                }
                List<TouristCountSelectorV3ChildFormVO> childForms = touristCountSelectorV3RoomVO.getChildForms();
                ArrayList arrayList2 = new ArrayList();
                for (TouristCountSelectorV3ChildFormVO touristCountSelectorV3ChildFormVO : childForms) {
                    ChipDTO chipDTO = (ChipDTO) C7714v.Q(touristCountSelectorV3ChildFormVO.getSelectedAgePosition(), touristCountSelectorV3ChildFormVO.getAgeCategories());
                    String obj = (chipDTO == null || (title = chipDTO.getTitle()) == null || (text = title.getText()) == null) ? null : text.toString();
                    if (obj != null) {
                        arrayList2.add(obj);
                    }
                }
                touristCountSelectorV3RoomRequest = new TouristCountSelectorV3RoomRequest(linkedHashMap2, arrayList2);
            }
            if (touristCountSelectorV3RoomRequest != null) {
                arrayList.add(touristCountSelectorV3RoomRequest);
            }
        }
        linkedHashMap.put("rooms", arrayList);
        return linkedHashMap;
    }

    private final TouristCountSelectorV3RoomVO removeChildForm(TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO) {
        TouristCountSelectorV3ConfigVO touristCountSelectorV3ConfigVO = this.cachedConfig;
        if (touristCountSelectorV3ConfigVO == null) {
            return null;
        }
        ArrayList W02 = C7714v.W0(touristCountSelectorV3RoomVO.getChildForms());
        C7714v.x0(W02);
        if (W02.size() == 1) {
            W02.set(0, TouristCountSelectorV3ChildFormVO.copy$default((TouristCountSelectorV3ChildFormVO) W02.get(0), 0, touristCountSelectorV3ConfigVO.getDefaultRoomConfig().getDefaultChildForm().getTitle(), null, null, null, 0, 61, null));
        }
        return TouristCountSelectorV3RoomVO.copy$default(touristCountSelectorV3RoomVO, 0L, null, false, null, false, null, W02, false, 191, null);
    }

    @NotNull
    public final P<Action> actionLiveData() {
        return this.actionLiveData;
    }

    public final void addRoom() {
        TouristCountSelectorV3ConfigVO touristCountSelectorV3ConfigVO = this.cachedConfig;
        if (touristCountSelectorV3ConfigVO == null) {
            return;
        }
        TouristCountSelectorV3ConfigVO.AlertVO totalTouristAlert = touristCountSelectorV3ConfigVO.getTotalTouristAlert();
        if (totalTouristAlert != null && totalTouristAlert.getValue() != null && totalTouristAlert.getValue().intValue() <= this.touristsSum) {
            this.restrictionLiveData.setValue(totalTouristAlert.getRestriction());
            return;
        }
        ArrayList W02 = C7714v.W0(this.cachedRooms.values());
        Iterator it = W02.iterator();
        int i11 = 0;
        int i12 = 0;
        while (true) {
            if (!it.hasNext()) {
                i12 = -1;
                break;
            } else if (!((TouristCountSelectorV3RoomVO) it.next()).getIsRoomVisible()) {
                break;
            } else {
                i12++;
            }
        }
        if (i12 == -1) {
            return;
        }
        if (i12 >= 0) {
            while (true) {
                W02.set(i11, TouristCountSelectorV3RoomVO.copy$default((TouristCountSelectorV3RoomVO) W02.get(i11), 0L, null, true, null, true, null, null, true, 107, null));
                if (i11 == i12) {
                    break;
                } else {
                    i11++;
                }
            }
        }
        this.roomsUpdateLiveData.setValue(new Update.RoomsUpdate(W02, true));
    }

    public final void onBindConfig(@NotNull TouristCountSelectorV3ConfigVO config) {
        Restriction restriction;
        Intrinsics.checkNotNullParameter(config, "config");
        this.cachedConfig = config;
        TouristCountSelectorV3ConfigVO.AlertVO unspecifiedAlert = config.getUnspecifiedAlert();
        if (unspecifiedAlert == null || !unspecifiedAlert.getShowAlertNow()) {
            unspecifiedAlert = null;
        }
        if (unspecifiedAlert == null || (restriction = unspecifiedAlert.getRestriction()) == null) {
            return;
        }
        this.restrictionLiveData.setValue(restriction);
    }

    public final void onBindNewItem(@NotNull TouristCountSelectorV3RoomVO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.cachedRooms.put(Long.valueOf(item.getId()), item);
        Iterator<T> it = this.cachedRooms.values().iterator();
        int i11 = 0;
        while (it.hasNext()) {
            Iterator<T> it2 = ((TouristCountSelectorV3RoomVO) it.next()).getGuests().iterator();
            int i12 = 0;
            while (it2.hasNext()) {
                i12 += ((TouristCountSelectorV3QuantityCellVO) it2.next()).getValue();
            }
            i11 += i12;
        }
        this.touristsSum = i11;
    }

    public final void onChildAgeSelected(long roomId, int childFormPosition, @NotNull ChipDTO selectedChip) {
        Intrinsics.checkNotNullParameter(selectedChip, "selectedChip");
        TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO = this.cachedRooms.get(Long.valueOf(roomId));
        if (touristCountSelectorV3RoomVO == null) {
            return;
        }
        ArrayList W02 = C7714v.W0(touristCountSelectorV3RoomVO.getChildForms());
        TouristCountSelectorV3ChildFormVO touristCountSelectorV3ChildFormVO = (TouristCountSelectorV3ChildFormVO) C7714v.Q(childFormPosition, W02);
        if (touristCountSelectorV3ChildFormVO == null) {
            return;
        }
        List<ChipDTO> changeSelection = changeSelection(touristCountSelectorV3ChildFormVO.getAgeCategories(), selectedChip);
        BadgeDTO copy$default = BadgeDTO.copy$default(touristCountSelectorV3ChildFormVO.getAgeBadge(), selectedChip.getTitle().getText().toString(), null, null, null, null, null, null, null, touristCountSelectorV3ChildFormVO.getAgeBadge().getStyleType(), null, null, null, 3838, null);
        Iterator<ChipDTO> it = changeSelection.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (it.next().getState() == ChipState.SELECTED) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = Integer.valueOf(i11);
        if (i11 < 0) {
            valueOf = null;
        }
        W02.set(childFormPosition, TouristCountSelectorV3ChildFormVO.copy$default(touristCountSelectorV3ChildFormVO, 0, null, null, copy$default, changeSelection, valueOf != null ? valueOf.intValue() : 0, 7, null));
        this.roomsUpdateLiveData.setValue(new Update.SingleRoomUpdate(TouristCountSelectorV3RoomVO.copy$default(touristCountSelectorV3RoomVO, 0L, null, false, null, false, null, W02, false, 191, null)));
    }

    public final void onDeleteRoomClicked(long roomId) {
        TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO;
        int i11;
        int i12;
        TouristCountSelectorV3ConfigVO touristCountSelectorV3ConfigVO = this.cachedConfig;
        if (touristCountSelectorV3ConfigVO == null || (touristCountSelectorV3RoomVO = this.cachedRooms.get(Long.valueOf(roomId))) == null) {
            return;
        }
        ArrayList W02 = C7714v.W0(this.cachedRooms.values());
        DefaultConstructorMarker defaultConstructorMarker = null;
        boolean z11 = false;
        if (W02.isEmpty()) {
            i11 = 0;
        } else {
            Iterator it = W02.iterator();
            i11 = 0;
            while (it.hasNext()) {
                if (((TouristCountSelectorV3RoomVO) it.next()).getIsRoomVisible() && (i11 = i11 + 1) < 0) {
                    C7714v.N0();
                    throw null;
                }
            }
        }
        int i13 = i11 - 1;
        int indexOf = W02.indexOf(touristCountSelectorV3RoomVO);
        ListIterator listIterator = W02.listIterator(W02.size());
        while (true) {
            if (!listIterator.hasPrevious()) {
                i12 = -1;
                break;
            } else if (((TouristCountSelectorV3RoomVO) listIterator.previous()).getIsRoomVisible()) {
                i12 = listIterator.nextIndex();
                break;
            }
        }
        if (indexOf == -1 || i12 == -1) {
            return;
        }
        if (indexOf != i12) {
            while (indexOf < i12) {
                TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO2 = (TouristCountSelectorV3RoomVO) W02.get(indexOf);
                int i14 = indexOf + 1;
                TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO3 = (TouristCountSelectorV3RoomVO) W02.get(i14);
                W02.set(indexOf, TouristCountSelectorV3RoomVO.copy$default(touristCountSelectorV3RoomVO2, 0L, null, false, null, false, touristCountSelectorV3RoomVO3.getGuests(), touristCountSelectorV3RoomVO3.getChildForms(), false, 159, null));
                indexOf = i14;
            }
        }
        W02.set(i12, TouristCountSelectorV3RoomVO.copy$default((TouristCountSelectorV3RoomVO) W02.get(i12), 0L, null, false, null, false, touristCountSelectorV3ConfigVO.getDefaultRoomConfig().getDefaultGuests(), K.f71697a, false, 31, null));
        Iterator it2 = W02.iterator();
        int i15 = 0;
        while (it2.hasNext()) {
            Object next = it2.next();
            int i16 = i15 + 1;
            if (i15 < 0) {
                C7714v.O0();
                throw null;
            }
            W02.set(i15, TouristCountSelectorV3RoomVO.copy$default((TouristCountSelectorV3RoomVO) next, 0L, StringProvider.getString(R$string.tourist_count_selector_room_android, Integer.valueOf(i16)), i13 > 1, null, i13 > 1, null, null, false, 233, null));
            i15 = i16;
        }
        this.roomsUpdateLiveData.setValue(new Update.RoomsUpdate(W02, z11, 2, defaultConstructorMarker));
    }

    public final void onMinusButtonClicked(long roomId, @NotNull TouristCountSelectorV3QuantityCellVO cell) {
        TouristCountSelectorV3RoomVO changeTouristsCount;
        Intrinsics.checkNotNullParameter(cell, "cell");
        TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO = this.cachedRooms.get(Long.valueOf(roomId));
        if (touristCountSelectorV3RoomVO == null || Intrinsics.d(cell.getDecreaseButton().isDisabled(), Boolean.TRUE) || (changeTouristsCount = changeTouristsCount(touristCountSelectorV3RoomVO, cell, -1)) == null) {
            return;
        }
        if (Intrinsics.d(cell.getId(), "child") && (changeTouristsCount = removeChildForm(changeTouristsCount)) == null) {
            return;
        }
        this.roomsUpdateLiveData.setValue(new Update.SingleRoomUpdate(changeTouristsCount));
    }

    public final void onPlusButtonClicked(long roomId, @NotNull TouristCountSelectorV3QuantityCellVO cell) {
        TouristCountSelectorV3RoomVO changeTouristsCount;
        Intrinsics.checkNotNullParameter(cell, "cell");
        TouristCountSelectorV3RoomVO touristCountSelectorV3RoomVO = this.cachedRooms.get(Long.valueOf(roomId));
        if (touristCountSelectorV3RoomVO == null || isExceedMaxRestrictions(touristCountSelectorV3RoomVO, cell) || (changeTouristsCount = changeTouristsCount(touristCountSelectorV3RoomVO, cell, 1)) == null) {
            return;
        }
        if (Intrinsics.d(cell.getId(), "child") && (changeTouristsCount = addChildForm(changeTouristsCount)) == null) {
            return;
        }
        this.roomsUpdateLiveData.setValue(new Update.SingleRoomUpdate(changeTouristsCount));
    }

    @NotNull
    public final P<Restriction> restrictionLiveData() {
        return this.restrictionLiveData;
    }

    @NotNull
    public final P<Update> roomsUpdateLiveData() {
        return this.roomsUpdateLiveData;
    }

    public final void submitRequest(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            B0 b02 = this.submitJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.submitJob = C10727i.c(x0.a(this), null, null, new TouristCountSelectorV3ViewModel$submitRequest$1(this, mapToRequest(this.cachedRooms.values(), (AtomAction.ComposerAction) action), action, null), 3);
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update;", "", "SingleRoomUpdate", "RoomsUpdate", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update$RoomsUpdate;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update$SingleRoomUpdate;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface Update {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0010\u0010\u0007\u001a\u00020\u0006HÖ\u0001¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\fHÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\u0013¨\u0006\u0014"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update$SingleRoomUpdate;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "room", "<init>", "(Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "getRoom", "()Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class SingleRoomUpdate implements Update {

            @NotNull
            private final TouristCountSelectorV3RoomVO room;

            public SingleRoomUpdate(@NotNull TouristCountSelectorV3RoomVO room) {
                Intrinsics.checkNotNullParameter(room, "room");
                this.room = room;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof SingleRoomUpdate) && Intrinsics.d(this.room, ((SingleRoomUpdate) other).room);
            }

            @NotNull
            public final TouristCountSelectorV3RoomVO getRoom() {
                return this.room;
            }

            public int hashCode() {
                return this.room.hashCode();
            }

            @NotNull
            public String toString() {
                return "SingleRoomUpdate(room=" + this.room + ")";
            }
        }

        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002\u0012\b\b\u0002\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\r\u001a\u00020\fHÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u001a\u0010\u0011\u001a\u00020\u00052\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0011\u0010\u0012R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0016\u001a\u0004\b\u0017\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update$RoomsUpdate;", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/TouristCountSelectorV3ViewModel$Update;", "", "Lru/ozon/app/android/travel/feature/tours/widgets/touristCountSelector/v3/presentation/room/TouristCountSelectorV3RoomVO;", "rooms", "", "scrollToBottom", "<init>", "(Ljava/util/List;Z)V", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getRooms", "()Ljava/util/List;", "Z", "getScrollToBottom", "()Z", "tours_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class RoomsUpdate implements Update {

            @NotNull
            private final List<TouristCountSelectorV3RoomVO> rooms;
            private final boolean scrollToBottom;

            public RoomsUpdate(@NotNull List<TouristCountSelectorV3RoomVO> rooms, boolean z11) {
                Intrinsics.checkNotNullParameter(rooms, "rooms");
                this.rooms = rooms;
                this.scrollToBottom = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof RoomsUpdate)) {
                    return false;
                }
                RoomsUpdate roomsUpdate = (RoomsUpdate) other;
                return Intrinsics.d(this.rooms, roomsUpdate.rooms) && this.scrollToBottom == roomsUpdate.scrollToBottom;
            }

            @NotNull
            public final List<TouristCountSelectorV3RoomVO> getRooms() {
                return this.rooms;
            }

            public final boolean getScrollToBottom() {
                return this.scrollToBottom;
            }

            public int hashCode() {
                return Boolean.hashCode(this.scrollToBottom) + (this.rooms.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return "RoomsUpdate(rooms=" + this.rooms + ", scrollToBottom=" + this.scrollToBottom + ")";
            }

            public /* synthetic */ RoomsUpdate(List list, boolean z11, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(list, (i11 & 2) != 0 ? false : z11);
            }
        }
    }
}
