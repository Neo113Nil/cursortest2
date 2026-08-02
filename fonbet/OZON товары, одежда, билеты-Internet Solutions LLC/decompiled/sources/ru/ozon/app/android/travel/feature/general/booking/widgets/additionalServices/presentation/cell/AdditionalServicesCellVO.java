package ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.cell;

import H3.c;
import Kk.C3532b;
import Ns.b;
import Pk0.a;
import Pk0.f;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import ed.InterfaceC6346b;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.tokenized.model.TokenizedTrackingInfo;
import ru.ozon.app.android.travel.feature.general.booking.widgets.additionalServices.presentation.tariff.AdditionalServicesTariffAspectVO;
import ru.ozon.app.android.travel.molecules.dto.counterInput.v2.CounterInputV2DTO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.af.AtomAction;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.controls.button.IconButtonV3DTO;
import ru.ozon.uni.atoms.data.image.ImageDTO;
import ru.ozon.uni.atoms.data.selectionControls.toggle.ToggleDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000F\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b'\b\u0080\b\u0018\u00002\u00020\u0001:\u0002;<B{\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0007\u001a\u00020\u0006\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\b\u0010\n\u001a\u0004\u0018\u00010\u0006\u0012\u0006\u0010\f\u001a\u00020\u000b\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\r\u0012\u0006\u0010\u0010\u001a\u00020\u000f\u0012\u0006\u0010\u0011\u001a\u00020\u000b\u0012\u0006\u0010\u0012\u001a\u00020\u000b\u0012\u0006\u0010\u0013\u001a\u00020\u000b\u0012\u0014\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014¢\u0006\u0004\b\u0018\u0010\u0019J\u009c\u0001\u0010\u001a\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0007\u001a\u00020\u00062\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u00062\b\b\u0002\u0010\f\u001a\u00020\u000b2\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\r2\b\b\u0002\u0010\u0010\u001a\u00020\u000f2\b\b\u0002\u0010\u0011\u001a\u00020\u000b2\b\b\u0002\u0010\u0012\u001a\u00020\u000b2\b\b\u0002\u0010\u0013\u001a\u00020\u000b2\u0016\b\u0002\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u0014HÆ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u0010\u0010\u001c\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u001a\u0010!\u001a\u00020\u000b2\b\u0010 \u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u001fR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010'R\u0017\u0010\u0007\u001a\u00020\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010(\u001a\u0004\b)\u0010*R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0019\u0010\n\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\n\u0010(\u001a\u0004\b.\u0010*R\u0017\u0010\f\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\f\u0010/\u001a\u0004\b\f\u00100R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\r8\u0006¢\u0006\f\n\u0004\b\u000e\u00101\u001a\u0004\b2\u00103R\u0017\u0010\u0010\u001a\u00020\u000f8\u0006¢\u0006\f\n\u0004\b\u0010\u00104\u001a\u0004\b5\u00106R\u0017\u0010\u0011\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0011\u0010/\u001a\u0004\b\u0011\u00100R\u0017\u0010\u0012\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0012\u0010/\u001a\u0004\b\u0012\u00100R\u0017\u0010\u0013\u001a\u00020\u000b8\u0006¢\u0006\f\n\u0004\b\u0013\u0010/\u001a\u0004\b7\u00100R%\u0010\u0017\u001a\u0010\u0012\u0004\u0012\u00020\u0015\u0012\u0004\u0012\u00020\u0016\u0018\u00010\u00148\u0006¢\u0006\f\n\u0004\b\u0017\u00108\u001a\u0004\b9\u0010:¨\u0006="}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "", "", "id", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "image", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "titleInfoButton", "subtitle", "", "isSubtitleSkeletonVisible", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "control", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "cellType", "isTariffsVisible", "isTariffSkeletonsVisible", "hideSeparator", "", "", "Lru/ozon/android/tokenized/model/TokenizedTrackingInfo;", "trackingInfo", "<init>", "(ILru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;ZZZLjava/util/Map;)V", "copy", "(ILru/ozon/uni/atoms/data/image/ImageDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;Lru/ozon/uni/atoms/data/text/TextDTO;ZLru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;ZZZLjava/util/Map;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/image/ImageDTO;", "getImage", "()Lru/ozon/uni/atoms/data/image/ImageDTO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getTitleInfoButton", "()Lru/ozon/uni/atoms/data/controls/button/IconButtonV3DTO;", "getSubtitle", "Z", "()Z", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "getControl", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "getCellType", "()Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "getHideSeparator", "Ljava/util/Map;", "getTrackingInfo", "()Ljava/util/Map;", "CellType", "ControlType", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class AdditionalServicesCellVO {

    @NotNull
    private final CellType cellType;
    private final ControlType control;
    private final boolean hideSeparator;
    private final int id;

    @NotNull
    private final ImageDTO image;
    private final boolean isSubtitleSkeletonVisible;
    private final boolean isTariffSkeletonsVisible;
    private final boolean isTariffsVisible;
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;
    private final IconButtonV3DTO titleInfoButton;
    private final Map<String, TokenizedTrackingInfo> trackingInfo;

    @Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0002\u0002\u0003\u0082\u0001\u0002\u0004\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "", "WithoutTariffs", "WithTariffs", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType$WithTariffs;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType$WithoutTariffs;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface CellType {

        @InterfaceC6346b
        @Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0007\b\u0087@\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u0002¢\u0006\u0004\b\u0005\u0010\u0006J\u0010\u0010\n\u001a\u00020\u0007HÖ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u001a\u0010\u0014\u001a\u00020\u00112\b\u0010\u0010\u001a\u0004\u0018\u00010\u000fHÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u001d\u0010\u0004\u001a\b\u0012\u0004\u0012\u00020\u00030\u00028\u0006¢\u0006\f\n\u0004\b\u0004\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017\u0088\u0001\u0004\u0092\u0001\b\u0012\u0004\u0012\u00020\u00030\u0002¨\u0006\u0018"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType$WithTariffs;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/tariff/AdditionalServicesTariffAspectVO;", "tariffs", "constructor-impl", "(Ljava/util/List;)Ljava/util/List;", "", "toString-impl", "(Ljava/util/List;)Ljava/lang/String;", "toString", "", "hashCode-impl", "(Ljava/util/List;)I", "hashCode", "", "other", "", "equals-impl", "(Ljava/util/List;Ljava/lang/Object;)Z", "equals", "Ljava/util/List;", "getTariffs", "()Ljava/util/List;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final class WithTariffs implements CellType {

            @NotNull
            private final List<AdditionalServicesTariffAspectVO> tariffs;

            private /* synthetic */ WithTariffs(List list) {
                this.tariffs = list;
            }

            /* renamed from: box-impl, reason: not valid java name */
            public static final /* synthetic */ WithTariffs m1101boximpl(List list) {
                return new WithTariffs(list);
            }

            @NotNull
            /* renamed from: constructor-impl, reason: not valid java name */
            public static List<? extends AdditionalServicesTariffAspectVO> m1102constructorimpl(@NotNull List<AdditionalServicesTariffAspectVO> tariffs) {
                Intrinsics.checkNotNullParameter(tariffs, "tariffs");
                return tariffs;
            }

            /* renamed from: equals-impl, reason: not valid java name */
            public static boolean m1103equalsimpl(List<? extends AdditionalServicesTariffAspectVO> list, Object obj) {
                return (obj instanceof WithTariffs) && Intrinsics.d(list, ((WithTariffs) obj).getTariffs());
            }

            /* renamed from: hashCode-impl, reason: not valid java name */
            public static int m1104hashCodeimpl(List<? extends AdditionalServicesTariffAspectVO> list) {
                return list.hashCode();
            }

            /* renamed from: toString-impl, reason: not valid java name */
            public static String m1105toStringimpl(List<? extends AdditionalServicesTariffAspectVO> list) {
                return c.a("WithTariffs(tariffs=", ")", list);
            }

            public boolean equals(Object obj) {
                return m1103equalsimpl(this.tariffs, obj);
            }

            public int hashCode() {
                return m1104hashCodeimpl(this.tariffs);
            }

            public String toString() {
                return m1105toStringimpl(this.tariffs);
            }

            /* renamed from: unbox-impl, reason: not valid java name and from getter */
            public final /* synthetic */ List getTariffs() {
                return this.tariffs;
            }
        }

        @Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\bÆ\n\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0013\u0010\u0004\u001a\u00020\u00052\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÖ\u0003J\t\u0010\b\u001a\u00020\tHÖ\u0001J\t\u0010\n\u001a\u00020\u000bHÖ\u0001¨\u0006\f"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType$WithoutTariffs;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$CellType;", "<init>", "()V", "equals", "", "other", "", "hashCode", "", "toString", "", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class WithoutTariffs implements CellType {

            @NotNull
            public static final WithoutTariffs INSTANCE = new WithoutTariffs();

            private WithoutTariffs() {
            }

            public boolean equals(Object other) {
                return this == other || (other instanceof WithoutTariffs);
            }

            public int hashCode() {
                return 132230379;
            }

            @NotNull
            public String toString() {
                return "WithoutTariffs";
            }
        }
    }

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\bv\u0018\u00002\u00020\u0001:\u0003\u0002\u0003\u0004\u0082\u0001\u0003\u0005\u0006\u0007¨\u0006\b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "", "Button", "Toggle", "Counter", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Button;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Counter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Toggle;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public interface ControlType {

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J$\u0010\b\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0012\u001a\u00020\u00042\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0012\u0010\u0013R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0014\u001a\u0004\b\u0015\u0010\u0016R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0017\u001a\u0004\b\u0005\u0010\u0018¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Button;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "buttonV3DTO", "", "isLoading", "<init>", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)V", "copy", "(Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Z)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Button;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getButtonV3DTO", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "Z", "()Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Button implements ControlType {

            @NotNull
            private final ButtonV3DTO buttonV3DTO;
            private final boolean isLoading;

            public Button(@NotNull ButtonV3DTO buttonV3DTO, boolean z11) {
                Intrinsics.checkNotNullParameter(buttonV3DTO, "buttonV3DTO");
                this.buttonV3DTO = buttonV3DTO;
                this.isLoading = z11;
            }

            public static /* synthetic */ Button copy$default(Button button, ButtonV3DTO buttonV3DTO, boolean z11, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    buttonV3DTO = button.buttonV3DTO;
                }
                if ((i11 & 2) != 0) {
                    z11 = button.isLoading;
                }
                return button.copy(buttonV3DTO, z11);
            }

            @NotNull
            public final Button copy(@NotNull ButtonV3DTO buttonV3DTO, boolean isLoading) {
                Intrinsics.checkNotNullParameter(buttonV3DTO, "buttonV3DTO");
                return new Button(buttonV3DTO, isLoading);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Button)) {
                    return false;
                }
                Button button = (Button) other;
                return Intrinsics.d(this.buttonV3DTO, button.buttonV3DTO) && this.isLoading == button.isLoading;
            }

            @NotNull
            public final ButtonV3DTO getButtonV3DTO() {
                return this.buttonV3DTO;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isLoading) + (this.buttonV3DTO.hashCode() * 31);
            }

            /* renamed from: isLoading, reason: from getter */
            public final boolean getIsLoading() {
                return this.isLoading;
            }

            @NotNull
            public String toString() {
                return "Button(buttonV3DTO=" + this.buttonV3DTO + ", isLoading=" + this.isLoading + ")";
            }
        }

        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\u0006\u0010\u0006\u001a\u00020\u0004¢\u0006\u0004\b\u0007\u0010\bJ.\u0010\t\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\b\b\u0002\u0010\u0006\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\t\u0010\nJ\u0010\u0010\f\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\f\u0010\rJ\u0010\u0010\u000f\u001a\u00020\u000eHÖ\u0001¢\u0006\u0004\b\u000f\u0010\u0010J\u001a\u0010\u0013\u001a\u00020\u00042\b\u0010\u0012\u001a\u0004\u0018\u00010\u0011HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0005\u0010\u0019R\u0017\u0010\u0006\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010\u0018\u001a\u0004\b\u0006\u0010\u0019¨\u0006\u001a"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Counter;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "Lru/ozon/app/android/travel/molecules/dto/counterInput/v2/CounterInputV2DTO;", "counterInputV2DTO", "", "isDecrementLoading", "isIncrementLoading", "<init>", "(Lru/ozon/app/android/travel/molecules/dto/counterInput/v2/CounterInputV2DTO;ZZ)V", "copy", "(Lru/ozon/app/android/travel/molecules/dto/counterInput/v2/CounterInputV2DTO;ZZ)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Counter;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/app/android/travel/molecules/dto/counterInput/v2/CounterInputV2DTO;", "getCounterInputV2DTO", "()Lru/ozon/app/android/travel/molecules/dto/counterInput/v2/CounterInputV2DTO;", "Z", "()Z", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Counter implements ControlType {

            @NotNull
            private final CounterInputV2DTO counterInputV2DTO;
            private final boolean isDecrementLoading;
            private final boolean isIncrementLoading;

            public Counter(@NotNull CounterInputV2DTO counterInputV2DTO, boolean z11, boolean z12) {
                Intrinsics.checkNotNullParameter(counterInputV2DTO, "counterInputV2DTO");
                this.counterInputV2DTO = counterInputV2DTO;
                this.isDecrementLoading = z11;
                this.isIncrementLoading = z12;
            }

            public static /* synthetic */ Counter copy$default(Counter counter, CounterInputV2DTO counterInputV2DTO, boolean z11, boolean z12, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    counterInputV2DTO = counter.counterInputV2DTO;
                }
                if ((i11 & 2) != 0) {
                    z11 = counter.isDecrementLoading;
                }
                if ((i11 & 4) != 0) {
                    z12 = counter.isIncrementLoading;
                }
                return counter.copy(counterInputV2DTO, z11, z12);
            }

            @NotNull
            public final Counter copy(@NotNull CounterInputV2DTO counterInputV2DTO, boolean isDecrementLoading, boolean isIncrementLoading) {
                Intrinsics.checkNotNullParameter(counterInputV2DTO, "counterInputV2DTO");
                return new Counter(counterInputV2DTO, isDecrementLoading, isIncrementLoading);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Counter)) {
                    return false;
                }
                Counter counter = (Counter) other;
                return Intrinsics.d(this.counterInputV2DTO, counter.counterInputV2DTO) && this.isDecrementLoading == counter.isDecrementLoading && this.isIncrementLoading == counter.isIncrementLoading;
            }

            @NotNull
            public final CounterInputV2DTO getCounterInputV2DTO() {
                return this.counterInputV2DTO;
            }

            public int hashCode() {
                return Boolean.hashCode(this.isIncrementLoading) + C3532b.a(this.counterInputV2DTO.hashCode() * 31, 31, this.isDecrementLoading);
            }

            /* renamed from: isDecrementLoading, reason: from getter */
            public final boolean getIsDecrementLoading() {
                return this.isDecrementLoading;
            }

            /* renamed from: isIncrementLoading, reason: from getter */
            public final boolean getIsIncrementLoading() {
                return this.isIncrementLoading;
            }

            @NotNull
            public String toString() {
                CounterInputV2DTO counterInputV2DTO = this.counterInputV2DTO;
                boolean z11 = this.isDecrementLoading;
                boolean z12 = this.isIncrementLoading;
                StringBuilder sb2 = new StringBuilder("Counter(counterInputV2DTO=");
                sb2.append(counterInputV2DTO);
                sb2.append(", isDecrementLoading=");
                sb2.append(z11);
                sb2.append(", isIncrementLoading=");
                return a.a(")", sb2, z12);
            }
        }

        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000b\n\u0002\b\t\b\u0086\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004¢\u0006\u0004\b\u0006\u0010\u0007J&\u0010\b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u0004HÆ\u0001¢\u0006\u0004\b\b\u0010\tJ\u0010\u0010\u000b\u001a\u00020\nHÖ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u001a\u0010\u0013\u001a\u00020\u00122\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010HÖ\u0003¢\u0006\u0004\b\u0013\u0010\u0014R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0015\u001a\u0004\b\u0016\u0010\u0017R\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u0018\u001a\u0004\b\u0019\u0010\u001a¨\u0006\u001b"}, d2 = {"Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Toggle;", "Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType;", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "toggleDTO", "Lru/ozon/uni/atoms/af/AtomAction;", "action", "<init>", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Lru/ozon/uni/atoms/af/AtomAction;)V", "copy", "(Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;Lru/ozon/uni/atoms/af/AtomAction;)Lru/ozon/app/android/travel/feature/general/booking/widgets/additionalServices/presentation/cell/AdditionalServicesCellVO$ControlType$Toggle;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "getToggleDTO", "()Lru/ozon/uni/atoms/data/selectionControls/toggle/ToggleDTO;", "Lru/ozon/uni/atoms/af/AtomAction;", "getAction", "()Lru/ozon/uni/atoms/af/AtomAction;", "booking_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Toggle implements ControlType {

            @NotNull
            private final AtomAction action;
            private final ToggleDTO toggleDTO;

            public Toggle(ToggleDTO toggleDTO, @NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.toggleDTO = toggleDTO;
                this.action = action;
            }

            public static /* synthetic */ Toggle copy$default(Toggle toggle, ToggleDTO toggleDTO, AtomAction atomAction, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    toggleDTO = toggle.toggleDTO;
                }
                if ((i11 & 2) != 0) {
                    atomAction = toggle.action;
                }
                return toggle.copy(toggleDTO, atomAction);
            }

            @NotNull
            public final Toggle copy(ToggleDTO toggleDTO, @NotNull AtomAction action) {
                Intrinsics.checkNotNullParameter(action, "action");
                return new Toggle(toggleDTO, action);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Toggle)) {
                    return false;
                }
                Toggle toggle = (Toggle) other;
                return Intrinsics.d(this.toggleDTO, toggle.toggleDTO) && Intrinsics.d(this.action, toggle.action);
            }

            @NotNull
            public final AtomAction getAction() {
                return this.action;
            }

            public final ToggleDTO getToggleDTO() {
                return this.toggleDTO;
            }

            public int hashCode() {
                ToggleDTO toggleDTO = this.toggleDTO;
                return this.action.hashCode() + ((toggleDTO == null ? 0 : toggleDTO.hashCode()) * 31);
            }

            @NotNull
            public String toString() {
                return "Toggle(toggleDTO=" + this.toggleDTO + ", action=" + this.action + ")";
            }
        }
    }

    public AdditionalServicesCellVO(int i11, @NotNull ImageDTO image, @NotNull TextDTO title, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO, boolean z11, ControlType controlType, @NotNull CellType cellType, boolean z12, boolean z13, boolean z14, Map<String, TokenizedTrackingInfo> map) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cellType, "cellType");
        this.id = i11;
        this.image = image;
        this.title = title;
        this.titleInfoButton = iconButtonV3DTO;
        this.subtitle = textDTO;
        this.isSubtitleSkeletonVisible = z11;
        this.control = controlType;
        this.cellType = cellType;
        this.isTariffsVisible = z12;
        this.isTariffSkeletonsVisible = z13;
        this.hideSeparator = z14;
        this.trackingInfo = map;
    }

    public static /* synthetic */ AdditionalServicesCellVO copy$default(AdditionalServicesCellVO additionalServicesCellVO, int i11, ImageDTO imageDTO, TextDTO textDTO, IconButtonV3DTO iconButtonV3DTO, TextDTO textDTO2, boolean z11, ControlType controlType, CellType cellType, boolean z12, boolean z13, boolean z14, Map map, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            i11 = additionalServicesCellVO.id;
        }
        if ((i12 & 2) != 0) {
            imageDTO = additionalServicesCellVO.image;
        }
        if ((i12 & 4) != 0) {
            textDTO = additionalServicesCellVO.title;
        }
        if ((i12 & 8) != 0) {
            iconButtonV3DTO = additionalServicesCellVO.titleInfoButton;
        }
        if ((i12 & 16) != 0) {
            textDTO2 = additionalServicesCellVO.subtitle;
        }
        if ((i12 & 32) != 0) {
            z11 = additionalServicesCellVO.isSubtitleSkeletonVisible;
        }
        if ((i12 & 64) != 0) {
            controlType = additionalServicesCellVO.control;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            cellType = additionalServicesCellVO.cellType;
        }
        if ((i12 & 256) != 0) {
            z12 = additionalServicesCellVO.isTariffsVisible;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            z13 = additionalServicesCellVO.isTariffSkeletonsVisible;
        }
        if ((i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            z14 = additionalServicesCellVO.hideSeparator;
        }
        if ((i12 & 2048) != 0) {
            map = additionalServicesCellVO.trackingInfo;
        }
        boolean z15 = z14;
        Map map2 = map;
        boolean z16 = z12;
        boolean z17 = z13;
        ControlType controlType2 = controlType;
        CellType cellType2 = cellType;
        TextDTO textDTO3 = textDTO2;
        boolean z18 = z11;
        return additionalServicesCellVO.copy(i11, imageDTO, textDTO, iconButtonV3DTO, textDTO3, z18, controlType2, cellType2, z16, z17, z15, map2);
    }

    @NotNull
    public final AdditionalServicesCellVO copy(int id2, @NotNull ImageDTO image, @NotNull TextDTO title, IconButtonV3DTO titleInfoButton, TextDTO subtitle, boolean isSubtitleSkeletonVisible, ControlType control, @NotNull CellType cellType, boolean isTariffsVisible, boolean isTariffSkeletonsVisible, boolean hideSeparator, Map<String, TokenizedTrackingInfo> trackingInfo) {
        Intrinsics.checkNotNullParameter(image, "image");
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(cellType, "cellType");
        return new AdditionalServicesCellVO(id2, image, title, titleInfoButton, subtitle, isSubtitleSkeletonVisible, control, cellType, isTariffsVisible, isTariffSkeletonsVisible, hideSeparator, trackingInfo);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AdditionalServicesCellVO)) {
            return false;
        }
        AdditionalServicesCellVO additionalServicesCellVO = (AdditionalServicesCellVO) other;
        return this.id == additionalServicesCellVO.id && Intrinsics.d(this.image, additionalServicesCellVO.image) && Intrinsics.d(this.title, additionalServicesCellVO.title) && Intrinsics.d(this.titleInfoButton, additionalServicesCellVO.titleInfoButton) && Intrinsics.d(this.subtitle, additionalServicesCellVO.subtitle) && this.isSubtitleSkeletonVisible == additionalServicesCellVO.isSubtitleSkeletonVisible && Intrinsics.d(this.control, additionalServicesCellVO.control) && Intrinsics.d(this.cellType, additionalServicesCellVO.cellType) && this.isTariffsVisible == additionalServicesCellVO.isTariffsVisible && this.isTariffSkeletonsVisible == additionalServicesCellVO.isTariffSkeletonsVisible && this.hideSeparator == additionalServicesCellVO.hideSeparator && Intrinsics.d(this.trackingInfo, additionalServicesCellVO.trackingInfo);
    }

    @NotNull
    public final CellType getCellType() {
        return this.cellType;
    }

    public final ControlType getControl() {
        return this.control;
    }

    public final boolean getHideSeparator() {
        return this.hideSeparator;
    }

    public final int getId() {
        return this.id;
    }

    @NotNull
    public final ImageDTO getImage() {
        return this.image;
    }

    public final TextDTO getSubtitle() {
        return this.subtitle;
    }

    @NotNull
    public final TextDTO getTitle() {
        return this.title;
    }

    public final IconButtonV3DTO getTitleInfoButton() {
        return this.titleInfoButton;
    }

    public final Map<String, TokenizedTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public int hashCode() {
        int a11 = b.a(this.title, Nh.a.b(this.image, Integer.hashCode(this.id) * 31, 31), 31);
        IconButtonV3DTO iconButtonV3DTO = this.titleInfoButton;
        int hashCode = (a11 + (iconButtonV3DTO == null ? 0 : iconButtonV3DTO.hashCode())) * 31;
        TextDTO textDTO = this.subtitle;
        int a12 = C3532b.a((hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31, 31, this.isSubtitleSkeletonVisible);
        ControlType controlType = this.control;
        int a13 = C3532b.a(C3532b.a(C3532b.a((this.cellType.hashCode() + ((a12 + (controlType == null ? 0 : controlType.hashCode())) * 31)) * 31, 31, this.isTariffsVisible), 31, this.isTariffSkeletonsVisible), 31, this.hideSeparator);
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        return a13 + (map != null ? map.hashCode() : 0);
    }

    /* renamed from: isSubtitleSkeletonVisible, reason: from getter */
    public final boolean getIsSubtitleSkeletonVisible() {
        return this.isSubtitleSkeletonVisible;
    }

    /* renamed from: isTariffSkeletonsVisible, reason: from getter */
    public final boolean getIsTariffSkeletonsVisible() {
        return this.isTariffSkeletonsVisible;
    }

    /* renamed from: isTariffsVisible, reason: from getter */
    public final boolean getIsTariffsVisible() {
        return this.isTariffsVisible;
    }

    @NotNull
    public String toString() {
        int i11 = this.id;
        ImageDTO imageDTO = this.image;
        TextDTO textDTO = this.title;
        IconButtonV3DTO iconButtonV3DTO = this.titleInfoButton;
        TextDTO textDTO2 = this.subtitle;
        boolean z11 = this.isSubtitleSkeletonVisible;
        ControlType controlType = this.control;
        CellType cellType = this.cellType;
        boolean z12 = this.isTariffsVisible;
        boolean z13 = this.isTariffSkeletonsVisible;
        boolean z14 = this.hideSeparator;
        Map<String, TokenizedTrackingInfo> map = this.trackingInfo;
        StringBuilder sb2 = new StringBuilder("AdditionalServicesCellVO(id=");
        sb2.append(i11);
        sb2.append(", image=");
        sb2.append(imageDTO);
        sb2.append(", title=");
        sb2.append(textDTO);
        sb2.append(", titleInfoButton=");
        sb2.append(iconButtonV3DTO);
        sb2.append(", subtitle=");
        sb2.append(textDTO2);
        sb2.append(", isSubtitleSkeletonVisible=");
        sb2.append(z11);
        sb2.append(", control=");
        sb2.append(controlType);
        sb2.append(", cellType=");
        sb2.append(cellType);
        sb2.append(", isTariffsVisible=");
        f.c(", isTariffSkeletonsVisible=", ", hideSeparator=", sb2, z12, z13);
        sb2.append(z14);
        sb2.append(", trackingInfo=");
        sb2.append(map);
        sb2.append(")");
        return sb2.toString();
    }
}
