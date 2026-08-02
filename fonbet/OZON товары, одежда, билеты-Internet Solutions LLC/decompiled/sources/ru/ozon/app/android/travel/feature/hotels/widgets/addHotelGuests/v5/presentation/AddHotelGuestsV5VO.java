package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation;

import B0.C2454a;
import D40.d;
import G.g;
import Kk.C3532b;
import Lh.a;
import Ns.b;
import Pk0.f;
import Tz.C4055a;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import l20.c;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@Metadata(d1 = {"\u0000P\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010\u0000\n\u0002\b\u001d\b\u0081\b\u0018\u00002\u00060\u0001j\u0002`\u0002:\u0001;Bm\u0012\u0006\u0010\u0004\u001a\u00020\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0007\u001a\u00020\u0005\u0012\u0006\u0010\t\u001a\u00020\b\u0012\u0006\u0010\n\u001a\u00020\b\u0012\f\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\u0006\u0010\u0011\u001a\u00020\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012\u0012\b\u0010\u0014\u001a\u0004\u0018\u00010\u0005\u0012\u0006\u0010\u0015\u001a\u00020\u0010¢\u0006\u0004\b\u0016\u0010\u0017J\u008c\u0001\u0010\u0018\u001a\u00020\u00002\b\b\u0002\u0010\u0004\u001a\u00020\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0007\u001a\u00020\u00052\b\b\u0002\u0010\t\u001a\u00020\b2\b\b\u0002\u0010\n\u001a\u00020\b2\u000e\b\u0002\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\b\b\u0002\u0010\u0011\u001a\u00020\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u00122\n\b\u0002\u0010\u0014\u001a\u0004\u0018\u00010\u00052\b\b\u0002\u0010\u0015\u001a\u00020\u0010HÆ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0005HÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020\u00102\b\u0010 \u001a\u0004\u0018\u00010\u001fHÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001a\u0010\u0004\u001a\u00020\u00038\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0004\u0010#\u001a\u0004\b$\u0010%R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00058\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0006\u0010&\u001a\u0004\b'\u0010(R\u0017\u0010\u0007\u001a\u00020\u00058\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b*\u0010\u001eR\u0017\u0010\t\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\t\u0010+\u001a\u0004\b,\u0010-R\u0017\u0010\n\u001a\u00020\b8\u0006¢\u0006\f\n\u0004\b\n\u0010+\u001a\u0004\b.\u0010-R\u001d\u0010\r\u001a\b\u0012\u0004\u0012\u00020\f0\u000b8\u0006¢\u0006\f\n\u0004\b\r\u0010/\u001a\u0004\b0\u00101R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u00102\u001a\u0004\b3\u00104R\u0017\u0010\u0011\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u00105\u001a\u0004\b\u0011\u00106R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00107\u001a\u0004\b8\u00109R\u0019\u0010\u0014\u001a\u0004\u0018\u00010\u00058\u0006¢\u0006\f\n\u0004\b\u0014\u0010&\u001a\u0004\b:\u0010(R\u0017\u0010\u0015\u001a\u00020\u00108\u0006¢\u0006\f\n\u0004\b\u0015\u00105\u001a\u0004\b\u0015\u00106¨\u0006<"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "Ll20/c;", "Lru/ozon/app/android/composer/view/ViewObject;", "", "id", "", "scrollWidgetKey", "roomId", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "subtitle", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "forms", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "addGuestButton", "", "isAddGuestButtonVisible", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", SelectionItemFormDTO.DISCLAIMER_FIELD_NAME, "scrollToFormId", "isNeedScroll", "<init>", "(JLjava/lang/Integer;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;ZLru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/Integer;Z)V", "copy", "(JLjava/lang/Integer;ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;ZLru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;Ljava/lang/Integer;Z)Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "", "toString", "()Ljava/lang/String;", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "J", "getId", "()J", "Ljava/lang/Integer;", "getScrollWidgetKey", "()Ljava/lang/Integer;", "I", "getRoomId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getSubtitle", "Ljava/util/List;", "getForms", "()Ljava/util/List;", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getAddGuestButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "Z", "()Z", "Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getDisclaimer", "()Lru/ozon/app/android/atoms/data/disclaimer/DisclaimerAtom;", "getScrollToFormId", "GuestFormVO", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class AddHotelGuestsV5VO implements c {
    private final LinkButtonVO addGuestButton;
    private final DisclaimerAtom disclaimer;

    @NotNull
    private final List<GuestFormVO> forms;
    private final long id;
    private final boolean isAddGuestButtonVisible;
    private final boolean isNeedScroll;
    private final int roomId;
    private final Integer scrollToFormId;
    private final Integer scrollWidgetKey;

    @NotNull
    private final TextDTO subtitle;

    @NotNull
    private final TextDTO title;

    @Metadata(d1 = {"\u0000<\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b!\b\u0087\b\u0018\u00002\u00020\u0001Bi\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\f\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n\u0012\u0006\u0010\u000e\u001a\u00020\r\u0012\u0006\u0010\u000f\u001a\u00020\r\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\b\u0010\u0013\u001a\u0004\u0018\u00010\u0012¢\u0006\u0004\b\u0014\u0010\u0015J\u0086\u0001\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u000e\b\u0002\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n2\b\b\u0002\u0010\u000e\u001a\u00020\r2\b\b\u0002\u0010\u000f\u001a\u00020\r2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\n\b\u0002\u0010\u0013\u001a\u0004\u0018\u00010\u0012HÆ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u0010\u0010\u0018\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001a\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001a\u0010\u001bJ\u001a\u0010\u001d\u001a\u00020\r2\b\u0010\u001c\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001d\u0010\u001eR\u0017\u0010\u0003\u001a\u00020\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u001f\u001a\u0004\b \u0010\u001bR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010!\u001a\u0004\b\"\u0010#R\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010!\u001a\u0004\b$\u0010#R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010!\u001a\u0004\b%\u0010#R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010&\u001a\u0004\b'\u0010(R\u001d\u0010\f\u001a\b\u0012\u0004\u0012\u00020\u000b0\n8\u0006¢\u0006\f\n\u0004\b\f\u0010)\u001a\u0004\b*\u0010+R\u0017\u0010\u000e\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000e\u0010,\u001a\u0004\b\u000e\u0010-R\u0017\u0010\u000f\u001a\u00020\r8\u0006¢\u0006\f\n\u0004\b\u000f\u0010,\u001a\u0004\b\u000f\u0010-R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010.\u001a\u0004\b/\u0010\u0019R\u0019\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0013\u00100\u001a\u0004\b1\u00102¨\u00063"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "", "", "id", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "optionalGuestTitlePostfix", "resultTitle", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "removeOptionalGuestButton", "", "Lru/ozon/app/android/travel/molecules/input/v1/CommonInputVO;", "inputs", "", "isFormVisible", "isOptionalForm", "", "guestId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "selectEmployeeButton", "<init>", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Ljava/util/List;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)V", "copy", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;Ljava/util/List;ZZLjava/lang/String;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "toString", "()Ljava/lang/String;", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "I", "getId", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "getOptionalGuestTitlePostfix", "getResultTitle", "Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "getRemoveOptionalGuestButton", "()Lru/ozon/app/android/travel/molecules/view/linkButton/LinkButtonVO;", "Ljava/util/List;", "getInputs", "()Ljava/util/List;", "Z", "()Z", "Ljava/lang/String;", "getGuestId", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getSelectEmployeeButton", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class GuestFormVO {
        private final String guestId;
        private final int id;

        @NotNull
        private final List<CommonInputVO> inputs;
        private final boolean isFormVisible;
        private final boolean isOptionalForm;
        private final TextDTO optionalGuestTitlePostfix;
        private final LinkButtonVO removeOptionalGuestButton;
        private final TextDTO resultTitle;
        private final ButtonV3DTO selectEmployeeButton;
        private final TextDTO title;

        /* JADX WARN: Multi-variable type inference failed */
        public GuestFormVO(int i11, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, LinkButtonVO linkButtonVO, @NotNull List<? extends CommonInputVO> inputs, boolean z11, boolean z12, String str, ButtonV3DTO buttonV3DTO) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            this.id = i11;
            this.title = textDTO;
            this.optionalGuestTitlePostfix = textDTO2;
            this.resultTitle = textDTO3;
            this.removeOptionalGuestButton = linkButtonVO;
            this.inputs = inputs;
            this.isFormVisible = z11;
            this.isOptionalForm = z12;
            this.guestId = str;
            this.selectEmployeeButton = buttonV3DTO;
        }

        public static /* synthetic */ GuestFormVO copy$default(GuestFormVO guestFormVO, int i11, TextDTO textDTO, TextDTO textDTO2, TextDTO textDTO3, LinkButtonVO linkButtonVO, List list, boolean z11, boolean z12, String str, ButtonV3DTO buttonV3DTO, int i12, Object obj) {
            if ((i12 & 1) != 0) {
                i11 = guestFormVO.id;
            }
            if ((i12 & 2) != 0) {
                textDTO = guestFormVO.title;
            }
            if ((i12 & 4) != 0) {
                textDTO2 = guestFormVO.optionalGuestTitlePostfix;
            }
            if ((i12 & 8) != 0) {
                textDTO3 = guestFormVO.resultTitle;
            }
            if ((i12 & 16) != 0) {
                linkButtonVO = guestFormVO.removeOptionalGuestButton;
            }
            if ((i12 & 32) != 0) {
                list = guestFormVO.inputs;
            }
            if ((i12 & 64) != 0) {
                z11 = guestFormVO.isFormVisible;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
                z12 = guestFormVO.isOptionalForm;
            }
            if ((i12 & 256) != 0) {
                str = guestFormVO.guestId;
            }
            if ((i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
                buttonV3DTO = guestFormVO.selectEmployeeButton;
            }
            String str2 = str;
            ButtonV3DTO buttonV3DTO2 = buttonV3DTO;
            boolean z13 = z11;
            boolean z14 = z12;
            LinkButtonVO linkButtonVO2 = linkButtonVO;
            List list2 = list;
            return guestFormVO.copy(i11, textDTO, textDTO2, textDTO3, linkButtonVO2, list2, z13, z14, str2, buttonV3DTO2);
        }

        @NotNull
        public final GuestFormVO copy(int id2, TextDTO title, TextDTO optionalGuestTitlePostfix, TextDTO resultTitle, LinkButtonVO removeOptionalGuestButton, @NotNull List<? extends CommonInputVO> inputs, boolean isFormVisible, boolean isOptionalForm, String guestId, ButtonV3DTO selectEmployeeButton) {
            Intrinsics.checkNotNullParameter(inputs, "inputs");
            return new GuestFormVO(id2, title, optionalGuestTitlePostfix, resultTitle, removeOptionalGuestButton, inputs, isFormVisible, isOptionalForm, guestId, selectEmployeeButton);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof GuestFormVO)) {
                return false;
            }
            GuestFormVO guestFormVO = (GuestFormVO) other;
            return this.id == guestFormVO.id && Intrinsics.d(this.title, guestFormVO.title) && Intrinsics.d(this.optionalGuestTitlePostfix, guestFormVO.optionalGuestTitlePostfix) && Intrinsics.d(this.resultTitle, guestFormVO.resultTitle) && Intrinsics.d(this.removeOptionalGuestButton, guestFormVO.removeOptionalGuestButton) && Intrinsics.d(this.inputs, guestFormVO.inputs) && this.isFormVisible == guestFormVO.isFormVisible && this.isOptionalForm == guestFormVO.isOptionalForm && Intrinsics.d(this.guestId, guestFormVO.guestId) && Intrinsics.d(this.selectEmployeeButton, guestFormVO.selectEmployeeButton);
        }

        public final String getGuestId() {
            return this.guestId;
        }

        public final int getId() {
            return this.id;
        }

        @NotNull
        public final List<CommonInputVO> getInputs() {
            return this.inputs;
        }

        public final TextDTO getOptionalGuestTitlePostfix() {
            return this.optionalGuestTitlePostfix;
        }

        public final LinkButtonVO getRemoveOptionalGuestButton() {
            return this.removeOptionalGuestButton;
        }

        public final TextDTO getResultTitle() {
            return this.resultTitle;
        }

        public final ButtonV3DTO getSelectEmployeeButton() {
            return this.selectEmployeeButton;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public int hashCode() {
            int hashCode = Integer.hashCode(this.id) * 31;
            TextDTO textDTO = this.title;
            int hashCode2 = (hashCode + (textDTO == null ? 0 : textDTO.hashCode())) * 31;
            TextDTO textDTO2 = this.optionalGuestTitlePostfix;
            int hashCode3 = (hashCode2 + (textDTO2 == null ? 0 : textDTO2.hashCode())) * 31;
            TextDTO textDTO3 = this.resultTitle;
            int hashCode4 = (hashCode3 + (textDTO3 == null ? 0 : textDTO3.hashCode())) * 31;
            LinkButtonVO linkButtonVO = this.removeOptionalGuestButton;
            int a11 = C3532b.a(C3532b.a(g.b((hashCode4 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode())) * 31, 31, this.inputs), 31, this.isFormVisible), 31, this.isOptionalForm);
            String str = this.guestId;
            int hashCode5 = (a11 + (str == null ? 0 : str.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.selectEmployeeButton;
            return hashCode5 + (buttonV3DTO != null ? buttonV3DTO.hashCode() : 0);
        }

        /* renamed from: isFormVisible, reason: from getter */
        public final boolean getIsFormVisible() {
            return this.isFormVisible;
        }

        /* renamed from: isOptionalForm, reason: from getter */
        public final boolean getIsOptionalForm() {
            return this.isOptionalForm;
        }

        @NotNull
        public String toString() {
            int i11 = this.id;
            TextDTO textDTO = this.title;
            TextDTO textDTO2 = this.optionalGuestTitlePostfix;
            TextDTO textDTO3 = this.resultTitle;
            LinkButtonVO linkButtonVO = this.removeOptionalGuestButton;
            List<CommonInputVO> list = this.inputs;
            boolean z11 = this.isFormVisible;
            boolean z12 = this.isOptionalForm;
            String str = this.guestId;
            ButtonV3DTO buttonV3DTO = this.selectEmployeeButton;
            StringBuilder b11 = C4055a.b(textDTO, "GuestFormVO(id=", ", title=", ", optionalGuestTitlePostfix=", i11);
            d.e(", resultTitle=", ", removeOptionalGuestButton=", b11, textDTO2, textDTO3);
            b11.append(linkButtonVO);
            b11.append(", inputs=");
            b11.append(list);
            b11.append(", isFormVisible=");
            f.c(", isOptionalForm=", ", guestId=", b11, z11, z12);
            b11.append(str);
            b11.append(", selectEmployeeButton=");
            b11.append(buttonV3DTO);
            b11.append(")");
            return b11.toString();
        }
    }

    public AddHotelGuestsV5VO(long j11, Integer num, int i11, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<GuestFormVO> forms, LinkButtonVO linkButtonVO, boolean z11, DisclaimerAtom disclaimerAtom, Integer num2, boolean z12) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(forms, "forms");
        this.id = j11;
        this.scrollWidgetKey = num;
        this.roomId = i11;
        this.title = title;
        this.subtitle = subtitle;
        this.forms = forms;
        this.addGuestButton = linkButtonVO;
        this.isAddGuestButtonVisible = z11;
        this.disclaimer = disclaimerAtom;
        this.scrollToFormId = num2;
        this.isNeedScroll = z12;
    }

    public static /* synthetic */ AddHotelGuestsV5VO copy$default(AddHotelGuestsV5VO addHotelGuestsV5VO, long j11, Integer num, int i11, TextDTO textDTO, TextDTO textDTO2, List list, LinkButtonVO linkButtonVO, boolean z11, DisclaimerAtom disclaimerAtom, Integer num2, boolean z12, int i12, Object obj) {
        if ((i12 & 1) != 0) {
            j11 = addHotelGuestsV5VO.id;
        }
        return addHotelGuestsV5VO.copy(j11, (i12 & 2) != 0 ? addHotelGuestsV5VO.scrollWidgetKey : num, (i12 & 4) != 0 ? addHotelGuestsV5VO.roomId : i11, (i12 & 8) != 0 ? addHotelGuestsV5VO.title : textDTO, (i12 & 16) != 0 ? addHotelGuestsV5VO.subtitle : textDTO2, (i12 & 32) != 0 ? addHotelGuestsV5VO.forms : list, (i12 & 64) != 0 ? addHotelGuestsV5VO.addGuestButton : linkButtonVO, (i12 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0 ? addHotelGuestsV5VO.isAddGuestButtonVisible : z11, (i12 & 256) != 0 ? addHotelGuestsV5VO.disclaimer : disclaimerAtom, (i12 & UserVerificationMethods.USER_VERIFY_NONE) != 0 ? addHotelGuestsV5VO.scrollToFormId : num2, (i12 & UserVerificationMethods.USER_VERIFY_ALL) != 0 ? addHotelGuestsV5VO.isNeedScroll : z12);
    }

    @NotNull
    public final AddHotelGuestsV5VO copy(long id2, Integer scrollWidgetKey, int roomId, @NotNull TextDTO title, @NotNull TextDTO subtitle, @NotNull List<GuestFormVO> forms, LinkButtonVO addGuestButton, boolean isAddGuestButtonVisible, DisclaimerAtom disclaimer, Integer scrollToFormId, boolean isNeedScroll) {
        Intrinsics.checkNotNullParameter(title, "title");
        Intrinsics.checkNotNullParameter(subtitle, "subtitle");
        Intrinsics.checkNotNullParameter(forms, "forms");
        return new AddHotelGuestsV5VO(id2, scrollWidgetKey, roomId, title, subtitle, forms, addGuestButton, isAddGuestButtonVisible, disclaimer, scrollToFormId, isNeedScroll);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof AddHotelGuestsV5VO)) {
            return false;
        }
        AddHotelGuestsV5VO addHotelGuestsV5VO = (AddHotelGuestsV5VO) other;
        return this.id == addHotelGuestsV5VO.id && Intrinsics.d(this.scrollWidgetKey, addHotelGuestsV5VO.scrollWidgetKey) && this.roomId == addHotelGuestsV5VO.roomId && Intrinsics.d(this.title, addHotelGuestsV5VO.title) && Intrinsics.d(this.subtitle, addHotelGuestsV5VO.subtitle) && Intrinsics.d(this.forms, addHotelGuestsV5VO.forms) && Intrinsics.d(this.addGuestButton, addHotelGuestsV5VO.addGuestButton) && this.isAddGuestButtonVisible == addHotelGuestsV5VO.isAddGuestButtonVisible && Intrinsics.d(this.disclaimer, addHotelGuestsV5VO.disclaimer) && Intrinsics.d(this.scrollToFormId, addHotelGuestsV5VO.scrollToFormId) && this.isNeedScroll == addHotelGuestsV5VO.isNeedScroll;
    }

    public final LinkButtonVO getAddGuestButton() {
        return this.addGuestButton;
    }

    public final DisclaimerAtom getDisclaimer() {
        return this.disclaimer;
    }

    @NotNull
    public final List<GuestFormVO> getForms() {
        return this.forms;
    }

    @Override // l20.c
    public long getId() {
        return this.id;
    }

    public final int getRoomId() {
        return this.roomId;
    }

    public final Integer getScrollToFormId() {
        return this.scrollToFormId;
    }

    @Override // l20.c
    public Integer getScrollWidgetKey() {
        return this.scrollWidgetKey;
    }

    @NotNull
    public final TextDTO getSubtitle() {
        return this.subtitle;
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
        int hashCode = Long.hashCode(this.id) * 31;
        Integer num = this.scrollWidgetKey;
        int b11 = g.b(b.a(this.subtitle, b.a(this.title, C2454a.a(this.roomId, (hashCode + (num == null ? 0 : num.hashCode())) * 31, 31), 31), 31), 31, this.forms);
        LinkButtonVO linkButtonVO = this.addGuestButton;
        int a11 = C3532b.a((b11 + (linkButtonVO == null ? 0 : linkButtonVO.hashCode())) * 31, 31, this.isAddGuestButtonVisible);
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        int hashCode2 = (a11 + (disclaimerAtom == null ? 0 : disclaimerAtom.hashCode())) * 31;
        Integer num2 = this.scrollToFormId;
        return Boolean.hashCode(this.isNeedScroll) + ((hashCode2 + (num2 != null ? num2.hashCode() : 0)) * 31);
    }

    /* renamed from: isAddGuestButtonVisible, reason: from getter */
    public final boolean getIsAddGuestButtonVisible() {
        return this.isAddGuestButtonVisible;
    }

    /* renamed from: isNeedScroll, reason: from getter */
    public final boolean getIsNeedScroll() {
        return this.isNeedScroll;
    }

    @NotNull
    public String toString() {
        long j11 = this.id;
        Integer num = this.scrollWidgetKey;
        int i11 = this.roomId;
        TextDTO textDTO = this.title;
        TextDTO textDTO2 = this.subtitle;
        List<GuestFormVO> list = this.forms;
        LinkButtonVO linkButtonVO = this.addGuestButton;
        boolean z11 = this.isAddGuestButtonVisible;
        DisclaimerAtom disclaimerAtom = this.disclaimer;
        Integer num2 = this.scrollToFormId;
        boolean z12 = this.isNeedScroll;
        StringBuilder c11 = a.c("AddHotelGuestsV5VO(id=", j11, ", scrollWidgetKey=", num);
        c11.append(", roomId=");
        c11.append(i11);
        c11.append(", title=");
        c11.append(textDTO);
        c11.append(", subtitle=");
        c11.append(textDTO2);
        c11.append(", forms=");
        c11.append(list);
        c11.append(", addGuestButton=");
        c11.append(linkButtonVO);
        c11.append(", isAddGuestButtonVisible=");
        c11.append(z11);
        c11.append(", disclaimer=");
        c11.append(disclaimerAtom);
        c11.append(", scrollToFormId=");
        c11.append(num2);
        return Bi.b.f(c11, ", isNeedScroll=", z12, ")");
    }
}
