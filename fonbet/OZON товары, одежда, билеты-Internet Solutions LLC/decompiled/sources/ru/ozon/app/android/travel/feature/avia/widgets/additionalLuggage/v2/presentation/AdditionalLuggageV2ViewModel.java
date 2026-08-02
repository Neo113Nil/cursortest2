package ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation;

import Am.C2438a;
import B0.C2454a;
import Cm.e;
import Pk0.a;
import T7.P;
import android.net.Uri;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.LinkedHashSet;
import java.util.Map;
import java.util.Set;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.C7714v;
import kotlin.collections.U;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.data.AdditionalLuggageV2Api;
import ru.ozon.app.android.travel.feature.avia.widgets.additionalLuggage.v2.presentation.AdditionalLuggageV2VO;
import ru.ozon.app.android.travel.utils.PriceFormatter;
import ru.ozon.app.android.utils.livedata.SingleLiveEvent;
import ru.ozon.uni.atoms.af.AtomAction;
import xe.B0;
import xe.C10727i;

@Metadata(d1 = {"\u0000\u0092\u0001\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\b\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010%\n\u0002\u0010#\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u00002\u00020\u0001:\u0003ABCB\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\t\u001a\u00020\b2\u0006\u0010\u0007\u001a\u00020\u0006H\u0002¢\u0006\u0004\b\t\u0010\nJ1\u0010\u000f\u001a\u000e\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\u000e0\u000b2\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\f\u0012\u0004\u0012\u00020\f\u0018\u00010\u000bH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J\u0013\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120\u0011¢\u0006\u0004\b\u0013\u0010\u0014J\u0013\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150\u0011¢\u0006\u0004\b\u0016\u0010\u0014J\u0013\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0017\u0010\u0014J\u0013\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0018\u0010\u0014J\u0013\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060\u0011¢\u0006\u0004\b\u0019\u0010\u0014J\u0013\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0\u0011¢\u0006\u0004\b\u001b\u0010\u0014J\u0013\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0\u0011¢\u0006\u0004\b\u001d\u0010\u0014J\u0013\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0\u0011¢\u0006\u0004\b\u001e\u0010\u0014J\u0015\u0010\"\u001a\u00020!2\u0006\u0010 \u001a\u00020\u001f¢\u0006\u0004\b\"\u0010#J\u0015\u0010$\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b$\u0010%J\u0015\u0010&\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b&\u0010%J\u001d\u0010)\u001a\u00020!2\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010(\u001a\u00020'¢\u0006\u0004\b)\u0010*J\u0015\u0010,\u001a\u00020!2\u0006\u0010+\u001a\u00020\u001a¢\u0006\u0004\b,\u0010-J\u0015\u0010.\u001a\u00020!2\u0006\u0010+\u001a\u00020\u001a¢\u0006\u0004\b.\u0010-R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010/R\u0014\u00101\u001a\u0002008\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b1\u00102R(\u00105\u001a\u0014\u0012\u0004\u0012\u00020\u0006\u0012\n\u0012\b\u0012\u0004\u0012\u00020\f04038\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b5\u00106R\u0016\u00107\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b7\u00108R\u0016\u00109\u001a\u00020\u00068\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b9\u00108R\u0018\u0010;\u001a\u0004\u0018\u00010:8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b;\u0010<R\u001a\u0010\u0013\u001a\b\u0012\u0004\u0012\u00020\u00120=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0013\u0010>R\u001a\u0010\u0016\u001a\b\u0012\u0004\u0012\u00020\u00150=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0016\u0010>R\u001a\u0010\u0017\u001a\b\u0012\u0004\u0012\u00020\u00060=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0017\u0010>R\u001a\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00060=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0018\u0010>R\u001a\u0010\u0019\u001a\b\u0012\u0004\u0012\u00020\u00060=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0019\u0010>R\u001a\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u001a0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001b\u0010>R\u001a\u0010\u001d\u001a\b\u0012\u0004\u0012\u00020\u001c0=8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001d\u0010>R\u001a\u0010\u001e\u001a\b\u0012\u0004\u0012\u00020\b0?8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u001e\u0010@¨\u0006D"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel;", "Landroidx/lifecycle/w0;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2Api;", "api", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2Api;)V", "", "position", "", "updateSelectedTabPosition", "(I)Z", "", "", "params", "", "prepareRequestBody", "(Ljava/util/Map;)Ljava/util/Map;", "Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateTabBorder;", "updateTabBorderLiveData", "()Landroidx/lifecycle/P;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick;", "updateOptionClick", "scrollFlightToPositionLiveData", "scrollTabToPosition", "checkAppBarElevation", "Lru/ozon/uni/atoms/af/AtomAction;", "openPriceDetailsScreenLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult;", "saveLuggageResultLiveData", "progressLiveData", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;", "item", "", "bind", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO;)V", "onTabSelected", "(I)V", "onFlightSwiped", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;", "option", "onLuggageOptionSelected", "(ILru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2VO$LuggageOptionItem;)V", "action", "onPriceDetailsButtonClicked", "(Lru/ozon/uni/atoms/af/AtomAction;)V", "onSaveButtonClicked", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/data/AdditionalLuggageV2Api;", "Lru/ozon/app/android/travel/utils/PriceFormatter;", "priceFormatter", "Lru/ozon/app/android/travel/utils/PriceFormatter;", "", "", "addedLuggage", "Ljava/util/Map;", "selectedTabPosition", "I", "totalLuggagePrice", "Lxe/B0;", "saveLuggageJob", "Lxe/B0;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Lru/ozon/app/android/utils/livedata/SingleLiveEvent;", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/V;", "UpdateOptionClick", "UpdateTabBorder", "SaveLuggageResult", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final class AdditionalLuggageV2ViewModel extends w0 {

    @NotNull
    private Map<Integer, Set<String>> addedLuggage;

    @NotNull
    private final AdditionalLuggageV2Api api;

    @NotNull
    private final SingleLiveEvent<Integer> checkAppBarElevation;

    @NotNull
    private final SingleLiveEvent<AtomAction> openPriceDetailsScreenLiveData;

    @NotNull
    private final PriceFormatter priceFormatter;

    @NotNull
    private final V<Boolean> progressLiveData;
    private B0 saveLuggageJob;

    @NotNull
    private final SingleLiveEvent<SaveLuggageResult> saveLuggageResultLiveData;

    @NotNull
    private final SingleLiveEvent<Integer> scrollFlightToPositionLiveData;

    @NotNull
    private final SingleLiveEvent<Integer> scrollTabToPosition;
    private int selectedTabPosition;
    private int totalLuggagePrice;

    @NotNull
    private final SingleLiveEvent<UpdateOptionClick> updateOptionClick;

    @NotNull
    private final SingleLiveEvent<UpdateTabBorder> updateTabBorderLiveData;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult;", "", "Error", "Success", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult$Error;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult$Success;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface SaveLuggageResult {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÇ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult$Error;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Error implements SaveLuggageResult {

            @NotNull
            public static final Error INSTANCE = new Error();

            private Error() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Error);
            }

            public int hashCode() {
                return 1401274517;
            }

            @NotNull
            public String toString() {
                return "Error";
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0014\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\u0014\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R%\u0010\u0007\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u0018\u001a\u0004\b\u0019\u0010\u001aR%\u0010\b\u001a\u0010\u0012\u0004\u0012\u00020\u0005\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010\u0018\u001a\u0004\b\u001b\u0010\u001a¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult$Success;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$SaveLuggageResult;", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "trackingPayloads", "<init>", "(Lru/ozon/uni/atoms/af/AtomAction;Ljava/util/Map;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "getTrackingPayloads", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Success implements SaveLuggageResult {

            @NotNull
            private final AtomAction action;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;
            private final Map<String, String> trackingPayloads;

            public Success(@NotNull AtomAction action, Map<String, TokenizedTrackingInfo> map, Map<String, String> map2) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
                this.trackingInfo = map;
                this.trackingPayloads = map2;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Success)) {
                    return false;
                }
                Success success = (Success) other;
                return Intrinsics.d(this.action, success.action) && Intrinsics.d(this.trackingInfo, success.trackingInfo) && Intrinsics.d(this.trackingPayloads, success.trackingPayloads);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public final Map<String, String> getTrackingPayloads() {
                return this.trackingPayloads;
            }

            public int hashCode() {
                int hashCode = this.action.hashCode() * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                int hashCode2 = (hashCode + (map == null ? 0 : map.hashCode())) * 31;
                Map<String, String> map2 = this.trackingPayloads;
                return hashCode2 + (map2 != null ? map2.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                AtomAction atomAction = this.action;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                Map<String, String> map2 = this.trackingPayloads;
                StringBuilder sb2 = new StringBuilder("Success(action=");
                sb2.append(atomAction);
                sb2.append(", trackingInfo=");
                sb2.append(map);
                sb2.append(", trackingPayloads=");
                return P.f(sb2, map2, ")");
            }
        }
    }

    @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010%\n\u0002\u0010\b\n\u0002\u0010#\n\u0002\u0010\u000e\n\u0002\b\b\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u0003#$%B;\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\u0018\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u000f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u0010\u0010\u0011\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR)\u0010\f\u001a\u0014\u0012\u0004\u0012\u00020\t\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u000b0\n0\b8\u0006¢\u0006\f\n\u0004\b\f\u0010 \u001a\u0004\b!\u0010\"¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick;", "", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Indicator;", "indicator", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Luggage;", "luggage", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Price;", "price", "", "", "", "", "addedLuggage", "<init>", "(Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Indicator;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Luggage;Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Price;Ljava/util/Map;)V", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Indicator;", "getIndicator", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Indicator;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Luggage;", "getLuggage", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Luggage;", "Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Price;", "getPrice", "()Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Price;", "Ljava/util/Map;", "getAddedLuggage", "()Ljava/util/Map;", "Indicator", "Luggage", "Price", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateOptionClick {

        @NotNull
        private final Map<Integer, Set<String>> addedLuggage;
        private final Indicator indicator;

        @NotNull
        private final Luggage luggage;

        @NotNull
        private final Price price;

        @Metadata(d1 = {"\u0000\u001e\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000e\u001a\u00020\u00042\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0012\u001a\u0004\b\u0013\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Indicator;", "", "", "position", "", "hasAddedLuggage", "<init>", "(IZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPosition", "Z", "getHasAddedLuggage", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Indicator {
            private final boolean hasAddedLuggage;
            private final int position;

            public Indicator(int i11, boolean z11) {
                this.position = i11;
                this.hasAddedLuggage = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Indicator)) {
                    return false;
                }
                Indicator indicator = (Indicator) other;
                return this.position == indicator.position && this.hasAddedLuggage == indicator.hasAddedLuggage;
            }

            public final boolean getHasAddedLuggage() {
                return this.hasAddedLuggage;
            }

            public final int getPosition() {
                return this.position;
            }

            public int hashCode() {
                return Boolean.hashCode(this.hasAddedLuggage) + (Integer.hashCode(this.position) * 31);
            }

            @NotNull
            public String toString() {
                return "Indicator(position=" + this.position + ", hasAddedLuggage=" + this.hasAddedLuggage + ")";
            }
        }

        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\r\b\u0087\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002\u0012\u0006\u0010\u0006\u001a\u00020\u0005¢\u0006\u0004\b\u0007\u0010\bJ\u0010\u0010\n\u001a\u00020\tHÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u0010\u0010\f\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u000f\u001a\u00020\u00052\b\u0010\u000e\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\rR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0011\u001a\u0004\b\u0013\u0010\rR\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0014\u001a\u0004\b\u0006\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Luggage;", "", "", "passengerPosition", "luggagePosition", "", "isSelected", "<init>", "(IIZ)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getPassengerPosition", "getLuggagePosition", "Z", "()Z", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Luggage {
            private final boolean isSelected;
            private final int luggagePosition;
            private final int passengerPosition;

            public Luggage(int i11, int i12, boolean z11) {
                this.passengerPosition = i11;
                this.luggagePosition = i12;
                this.isSelected = z11;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Luggage)) {
                    return false;
                }
                Luggage luggage = (Luggage) other;
                return this.passengerPosition == luggage.passengerPosition && this.luggagePosition == luggage.luggagePosition && this.isSelected == luggage.isSelected;
            }

            public final int getLuggagePosition() {
                return this.luggagePosition;
            }

            public final int getPassengerPosition() {
                return this.passengerPosition;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isSelected) + C2454a.a(this.luggagePosition, Integer.hashCode(this.passengerPosition) * 31, 31);
            }

            /* renamed from: isSelected, reason: from getter */
            public final boolean getIsSelected() {
                return this.isSelected;
            }

            @NotNull
            public String toString() {
                int i11 = this.passengerPosition;
                int i12 = this.luggagePosition;
                return a.a(")", C2438a.a("Luggage(passengerPosition=", i11, ", luggagePosition=", ", isSelected=", i12), this.isSelected);
            }
        }

        @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\r\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\b\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J\u0010\u0010\t\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\u000b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u001a\u0010\u000f\u001a\u00020\u000e2\b\u0010\r\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000f\u0010\u0010R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0011\u001a\u0004\b\u0012\u0010\fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0013\u001a\u0004\b\u0014\u0010\u0015¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateOptionClick$Price;", "", "", "price", "", "formattedPrice", "<init>", "(ILjava/lang/CharSequence;)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getPrice", "Ljava/lang/CharSequence;", "getFormattedPrice", "()Ljava/lang/CharSequence;", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Price {

            @NotNull
            private final CharSequence formattedPrice;
            private final int price;

            public Price(int i11, @NotNull CharSequence formattedPrice) {
                Intrinsics.checkNotNullParameter(formattedPrice, "formattedPrice");
                this.price = i11;
                this.formattedPrice = formattedPrice;
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Price)) {
                    return false;
                }
                Price price = (Price) other;
                return this.price == price.price && Intrinsics.d(this.formattedPrice, price.formattedPrice);
            }

            @NotNull
            public final CharSequence getFormattedPrice() {
                return this.formattedPrice;
            }

            public final int getPrice() {
                return this.price;
            }

            public int hashCode() {
                return this.formattedPrice.hashCode() + (Integer.hashCode(this.price) * 31);
            }

            @NotNull
            public String toString() {
                return "Price(price=" + this.price + ", formattedPrice=" + ((Object) this.formattedPrice) + ")";
            }
        }

        public UpdateOptionClick(Indicator indicator, @NotNull Luggage luggage, @NotNull Price price, @NotNull Map<Integer, Set<String>> addedLuggage) {
            Intrinsics.checkNotNullParameter(luggage, "luggage");
            Intrinsics.checkNotNullParameter(price, "price");
            Intrinsics.checkNotNullParameter(addedLuggage, "addedLuggage");
            this.indicator = indicator;
            this.luggage = luggage;
            this.price = price;
            this.addedLuggage = addedLuggage;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateOptionClick)) {
                return false;
            }
            UpdateOptionClick updateOptionClick = (UpdateOptionClick) other;
            return Intrinsics.d(this.indicator, updateOptionClick.indicator) && Intrinsics.d(this.luggage, updateOptionClick.luggage) && Intrinsics.d(this.price, updateOptionClick.price) && Intrinsics.d(this.addedLuggage, updateOptionClick.addedLuggage);
        }

        @NotNull
        public final Map<Integer, Set<String>> getAddedLuggage() {
            return this.addedLuggage;
        }

        public final Indicator getIndicator() {
            return this.indicator;
        }

        @NotNull
        public final Luggage getLuggage() {
            return this.luggage;
        }

        @NotNull
        public final Price getPrice() {
            return this.price;
        }

        public int hashCode() {
            Indicator indicator = this.indicator;
            return this.addedLuggage.hashCode() + ((this.price.hashCode() + ((this.luggage.hashCode() + ((indicator == null ? 0 : indicator.hashCode()) * 31)) * 31)) * 31);
        }

        @NotNull
        public String toString() {
            return "UpdateOptionClick(indicator=" + this.indicator + ", luggage=" + this.luggage + ", price=" + this.price + ", addedLuggage=" + this.addedLuggage + ")";
        }
    }

    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0087\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\b\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\n\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\n\u0010\u000bJ\u001a\u0010\u000e\u001a\u00020\r2\b\u0010\f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u000e\u0010\u000fR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0010\u001a\u0004\b\u0011\u0010\u000bR\u0017\u0010\u0004\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0010\u001a\u0004\b\u0012\u0010\u000b¨\u0006\u0013"}, d2 = {"Lru/ozon/app/android/travel/feature/avia/widgets/additionalLuggage/v2/presentation/AdditionalLuggageV2ViewModel$UpdateTabBorder;", "", "", "oldPosition", "newPosition", "<init>", "(II)V", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "I", "getOldPosition", "getNewPosition", "avia_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class UpdateTabBorder {
        private final int newPosition;
        private final int oldPosition;

        public UpdateTabBorder(int i11, int i12) {
            this.oldPosition = i11;
            this.newPosition = i12;
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof UpdateTabBorder)) {
                return false;
            }
            UpdateTabBorder updateTabBorder = (UpdateTabBorder) other;
            return this.oldPosition == updateTabBorder.oldPosition && this.newPosition == updateTabBorder.newPosition;
        }

        public final int getNewPosition() {
            return this.newPosition;
        }

        public final int getOldPosition() {
            return this.oldPosition;
        }

        public int hashCode() {
            return Integer.hashCode(this.newPosition) + (Integer.hashCode(this.oldPosition) * 31);
        }

        @NotNull
        public String toString() {
            return e.c("UpdateTabBorder(oldPosition=", this.oldPosition, ", newPosition=", ")", this.newPosition);
        }
    }

    public AdditionalLuggageV2ViewModel(@NotNull AdditionalLuggageV2Api api) {
        Intrinsics.checkNotNullParameter(api, "api");
        this.api = api;
        this.priceFormatter = new PriceFormatter();
        this.addedLuggage = new LinkedHashMap();
        this.updateTabBorderLiveData = new SingleLiveEvent<>();
        this.updateOptionClick = new SingleLiveEvent<>();
        this.scrollFlightToPositionLiveData = new SingleLiveEvent<>();
        this.scrollTabToPosition = new SingleLiveEvent<>();
        this.checkAppBarElevation = new SingleLiveEvent<>();
        this.openPriceDetailsScreenLiveData = new SingleLiveEvent<>();
        this.saveLuggageResultLiveData = new SingleLiveEvent<>();
        this.progressLiveData = new V<>();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Map<String, Object> prepareRequestBody(Map<String, String> params) {
        Map<Integer, Set<String>> map = this.addedLuggage;
        ArrayList arrayList = new ArrayList();
        Iterator<Map.Entry<Integer, Set<String>>> it = map.entrySet().iterator();
        while (it.hasNext()) {
            C7714v.p(it.next().getValue(), arrayList);
        }
        LinkedHashMap l11 = U.l(new Pair("luggageAddedIds", arrayList));
        if (params == null) {
            params = U.c();
        }
        return U.m(params, l11);
    }

    private final boolean updateSelectedTabPosition(int position) {
        int i11 = this.selectedTabPosition;
        if (position == i11) {
            return false;
        }
        UpdateTabBorder updateTabBorder = new UpdateTabBorder(i11, position);
        this.selectedTabPosition = position;
        this.updateTabBorderLiveData.setValue(updateTabBorder);
        return true;
    }

    public final void bind(@NotNull AdditionalLuggageV2VO item) {
        Intrinsics.checkNotNullParameter(item, "item");
        this.selectedTabPosition = item.getContent().getSelectedTabPosition();
        this.totalLuggagePrice = item.getContent().getTotalPrice();
        this.addedLuggage = item.getContent().getAddedLuggage();
    }

    @NotNull
    public final androidx.lifecycle.P<Integer> checkAppBarElevation() {
        return this.checkAppBarElevation;
    }

    public final void onFlightSwiped(int position) {
        updateSelectedTabPosition(position);
        this.scrollTabToPosition.setValue(Integer.valueOf(position));
        this.checkAppBarElevation.setValue(Integer.valueOf(position));
    }

    public final void onLuggageOptionSelected(int position, @NotNull AdditionalLuggageV2VO.LuggageOptionItem option) {
        Intrinsics.checkNotNullParameter(option, "option");
        Set<String> orDefault = this.addedLuggage.getOrDefault(Integer.valueOf(option.getPassengerIndex()), new LinkedHashSet());
        boolean remove = orDefault.remove(option.getRefId());
        boolean isEmpty = orDefault.isEmpty();
        if (remove) {
            this.totalLuggagePrice -= option.getPrice();
        } else {
            this.totalLuggagePrice = option.getPrice() + this.totalLuggagePrice;
            orDefault.add(option.getRefId());
            this.addedLuggage.put(Integer.valueOf(option.getPassengerIndex()), orDefault);
        }
        UpdateOptionClick.Indicator indicator = isEmpty ? new UpdateOptionClick.Indicator(option.getPassengerIndex(), !remove) : null;
        SingleLiveEvent<UpdateOptionClick> singleLiveEvent = this.updateOptionClick;
        UpdateOptionClick.Luggage luggage = new UpdateOptionClick.Luggage(option.getPassengerIndex(), position, !remove);
        int i11 = this.totalLuggagePrice;
        singleLiveEvent.setValue(new UpdateOptionClick(indicator, luggage, new UpdateOptionClick.Price(i11, PriceFormatter.format$default(this.priceFormatter, Integer.valueOf(i11), null, null, false, 14, null)), this.addedLuggage));
    }

    public final void onPriceDetailsButtonClicked(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.Move) {
            AtomAction.Move move = (AtomAction.Move) action;
            if (move.getLink() != null) {
                String link = move.getLink();
                if (link != null) {
                    Uri.Builder buildUpon = Uri.parse(link).buildUpon();
                    Map<Integer, Set<String>> map = this.addedLuggage;
                    ArrayList arrayList = new ArrayList();
                    Iterator<Map.Entry<Integer, Set<String>>> it = map.entrySet().iterator();
                    while (it.hasNext()) {
                        C7714v.p(it.next().getValue(), arrayList);
                    }
                    Iterator it2 = arrayList.iterator();
                    while (it2.hasNext()) {
                        buildUpon.appendQueryParameter("luggageAddedIds", (String) it2.next());
                    }
                    this.openPriceDetailsScreenLiveData.setValue(AtomAction.Move.copy$default(move, buildUpon.build().toString(), null, null, null, null, 30, null));
                    return;
                }
                return;
            }
        }
        this.openPriceDetailsScreenLiveData.setValue(action);
    }

    public final void onSaveButtonClicked(@NotNull AtomAction action) {
        Intrinsics.checkNotNullParameter(action, "action");
        if (action instanceof AtomAction.ComposerAction) {
            B0 b02 = this.saveLuggageJob;
            if (b02 != null) {
                b02.j(null);
            }
            this.saveLuggageJob = C10727i.c(x0.a(this), null, null, new AdditionalLuggageV2ViewModel$onSaveButtonClicked$1(this, action, null), 3);
        }
    }

    public final void onTabSelected(int position) {
        if (updateSelectedTabPosition(position)) {
            this.scrollFlightToPositionLiveData.setValue(Integer.valueOf(position));
            this.checkAppBarElevation.setValue(Integer.valueOf(position));
        }
    }

    @NotNull
    public final androidx.lifecycle.P<AtomAction> openPriceDetailsScreenLiveData() {
        return this.openPriceDetailsScreenLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<Boolean> progressLiveData() {
        return this.progressLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<SaveLuggageResult> saveLuggageResultLiveData() {
        return this.saveLuggageResultLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<Integer> scrollFlightToPositionLiveData() {
        return this.scrollFlightToPositionLiveData;
    }

    @NotNull
    public final androidx.lifecycle.P<Integer> scrollTabToPosition() {
        return this.scrollTabToPosition;
    }

    @NotNull
    public final androidx.lifecycle.P<UpdateOptionClick> updateOptionClick() {
        return this.updateOptionClick;
    }

    @NotNull
    public final androidx.lifecycle.P<UpdateTabBorder> updateTabBorderLiveData() {
        return this.updateTabBorderLiveData;
    }
}
