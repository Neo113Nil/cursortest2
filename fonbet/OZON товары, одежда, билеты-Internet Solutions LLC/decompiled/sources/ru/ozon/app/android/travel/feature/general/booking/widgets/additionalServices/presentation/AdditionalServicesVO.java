package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation;

import B0.C2454a;
import G.g;
import g.C6594f;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell.AdditionalServicesCellVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0007\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\r\b\u0080\b\u0018\u0000 \u001f2\u00060\u0001j\u0002`\u0002:\u0002\u001f B!\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\t\u0010\nJ0\u0010\u000b\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0007HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\r\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\r\u0010\u000eJ\u0010\u0010\u0010\u001a\u00020\u000fHÖ\u0001¢\u0006\u0004\b\u0010\u0010\u0011J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010\u0017\u001a\u0004\b\u0018\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u001a\u001a\u0004\b\u001b\u0010\u001cR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010\u001d\u001a\u0004\b\u001e\u0010\u000e¨\u0006!"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;", "state", "", "asyncData", "<init>", "(JLru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;Ljava/lang/String;)V", "copy", "(JLru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;Ljava/lang/String;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;", "getState", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;", "Ljava/lang/String;", "getAsyncData", "Companion", "State", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdditionalServicesVO implements c {

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE = new Companion(null);
    private final String asyncData;
    private final long id;

    @NotNull
    private final State state;

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0006\u0010\u0004\u001a\u00020\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$Companion;", "", "<init>", "()V", "getInitialVO", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final AdditionalServicesVO getInitialVO() {
            return new AdditionalServicesVO(-1L, State.Initial.INSTANCE, null);
        }

        private Companion() {
        }
    }

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;", "", "Initial", "Loaded", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Initial;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface State {

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Initial;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Initial implements State {

            @NotNull
            public static final Initial INSTANCE = new Initial();

            private Initial() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof Initial);
            }

            public int hashCode() {
                return -1423465789;
            }

            @NotNull
            public String toString() {
                return "Initial";
            }
        }

        @Metadata(d1 = {"\u0000D\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\t\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0086\b\u0018\u00002\u00020\u0001BO\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\u0014\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f¢\u0006\u0004\b\u0010\u0010\u0011Jd\u0010\u0012\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\u0016\b\u0002\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\fHÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u0014\u0010\u0015J\u0010\u0010\u0016\u001a\u00020\bHÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0018HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\u001fR\u0019\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b \u0010\u001fR\u001d\u0010\u0007\u001a\b\u0012\u0004\u0012\u00020\u00060\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b\"\u0010#R\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010$\u001a\u0004\b%\u0010\u0017R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u0010&\u001a\u0004\b'\u0010(R%\u0010\u000f\u001a\u0010\u0012\u0004\u0012\u00020\r\u0012\u0004\u0012\u00020\u000e\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\u000f\u0010)\u001a\u0004\b*\u0010+¨\u0006,"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "cells", "", "cellsCount", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "showMoreButton", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;ILru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/AdditionalServicesVO$State$Loaded;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getCells", "()Ljava/util/List;", "I", "getCellsCount", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getShowMoreButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Loaded implements State {

            @NotNull
            private final List<AdditionalServicesCellVO> cells;
            private final int cellsCount;
            private final ButtonV3DTO showMoreButton;
            private final TextDTO subtitle;

            @NotNull
            private final TextDTO title;
            private final Map<String, TokenizedTrackingInfo> trackingInfo;

            public Loaded(@NotNull TextDTO title, TextDTO textDTO, @NotNull List<AdditionalServicesCellVO> cells, int i11, ButtonV3DTO buttonV3DTO, Map<String, TokenizedTrackingInfo> map) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(cells, "cells");
                this.title = title;
                this.subtitle = textDTO;
                this.cells = cells;
                this.cellsCount = i11;
                this.showMoreButton = buttonV3DTO;
                this.trackingInfo = map;
            }

            public static /* synthetic */ Loaded copy$default(Loaded loaded, TextDTO textDTO, TextDTO textDTO2, List list, int i11, ButtonV3DTO buttonV3DTO, Map map, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    textDTO = loaded.title;
                }
                if ((i12 & 2) != 0) {
                    textDTO2 = loaded.subtitle;
                }
                if ((i12 & 4) != 0) {
                    list = loaded.cells;
                }
                if ((i12 & 8) != 0) {
                    i11 = loaded.cellsCount;
                }
                if ((i12 & 16) != 0) {
                    buttonV3DTO = loaded.showMoreButton;
                }
                if ((i12 & 32) != 0) {
                    map = loaded.trackingInfo;
                }
                ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
                Map map2 = map;
                return loaded.copy(textDTO, textDTO2, list, i11, buttonV3DTO2, map2);
            }

            @NotNull
            public final Loaded copy(@NotNull TextDTO title, TextDTO subtitle, @NotNull List<AdditionalServicesCellVO> cells, int cellsCount, ButtonV3DTO showMoreButton, Map<String, TokenizedTrackingInfo> trackingInfo) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(cells, "cells");
                return new Loaded(title, subtitle, cells, cellsCount, showMoreButton, trackingInfo);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Loaded)) {
                    return false;
                }
                Loaded loaded = (Loaded) other;
                return Intrinsics.d(this.title, loaded.title) && Intrinsics.d(this.subtitle, loaded.subtitle) && Intrinsics.d(this.cells, loaded.cells) && this.cellsCount == loaded.cellsCount && Intrinsics.d(this.showMoreButton, loaded.showMoreButton) && Intrinsics.d(this.trackingInfo, loaded.trackingInfo);
            }

            @NotNull
            public final List<AdditionalServicesCellVO> getCells() {
                return this.cells;
            }

            public final int getCellsCount() {
                return this.cellsCount;
            }

            public final ButtonV3DTO getShowMoreButton() {
                return this.showMoreButton;
            }

            public final TextDTO getSubtitle() {
                return this.subtitle;
            }

            @NotNull
            public final TextDTO getTitle() {
                return this.title;
            }

            public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
                return this.trackingInfo;
            }

            public int hashCode() {
                int hashCode = this.title.hashCode() * 31;
                TextDTO textDTO = this.subtitle;
                int a11 = C2454a.a(this.cellsCount, g.b((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.cells), 31);
                ButtonV3DTO buttonV3DTO = this.showMoreButton;
                int hashCode2 = (a11 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                return hashCode2 + (map != null ? map.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                TextDTO textDTO = this.title;
                TextDTO textDTO2 = this.subtitle;
                List<AdditionalServicesCellVO> list = this.cells;
                int i11 = this.cellsCount;
                ButtonV3DTO buttonV3DTO = this.showMoreButton;
                Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
                StringBuilder g10 = D3.g.g("Loaded(title=", textDTO, ", subtitle=", textDTO2, ", cells=");
                g10.append(list);
                g10.append(", cellsCount=");
                g10.append(i11);
                g10.append(", showMoreButton=");
                g10.append(buttonV3DTO);
                g10.append(", trackingInfo=");
                g10.append(map);
                g10.append(")");
                return g10.toString();
            }
        }
    }

    public AdditionalServicesVO(long j11, @NotNull State state, String str) {
        Intrinsics.checkNotNullParameter(state, "state");
        this.id = j11;
        this.state = state;
        this.asyncData = str;
    }

    public static /* synthetic */ AdditionalServicesVO copy$default(AdditionalServicesVO additionalServicesVO, long j11, State state, String str, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            j11 = additionalServicesVO.id;
        }
        if ((i11 & 2) != 0) {
            state = additionalServicesVO.state;
        }
        if ((i11 & 4) != 0) {
            str = additionalServicesVO.asyncData;
        }
        return additionalServicesVO.copy(j11, state, str);
    }

    @NotNull
    public final AdditionalServicesVO copy(long id2, @NotNull State state, String asyncData) {
        Intrinsics.checkNotNullParameter(state, "state");
        return new AdditionalServicesVO(id2, state, asyncData);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesVO)) {
            return false;
        }
        AdditionalServicesVO additionalServicesVO = (AdditionalServicesVO) other;
        return this.id == additionalServicesVO.id && Intrinsics.d(this.state, additionalServicesVO.state) && Intrinsics.d(this.asyncData, additionalServicesVO.asyncData);
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

    @Override // l20.c
    public int getViewItemKey() {
        return hashCode();
    }

    public int hashCode() {
        int hashCode = (this.state.hashCode() + (Long.hashCode(this.id) * 31)) * 31;
        String str = this.asyncData;
        return hashCode + (str == null ? 0 : str.hashCode());
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        State state = this.state;
        String str = this.asyncData;
        StringBuilder sb2 = new StringBuilder("AdditionalServicesVO(id=");
        sb2.append(j11);
        sb2.append(", state=");
        sb2.append(state);
        return C6594f.a(", asyncData=", str, ")", sb2);
    }
}
