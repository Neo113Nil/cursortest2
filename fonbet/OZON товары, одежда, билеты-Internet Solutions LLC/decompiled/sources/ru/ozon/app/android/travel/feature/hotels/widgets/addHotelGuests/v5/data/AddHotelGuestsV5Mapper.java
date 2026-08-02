package ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data;

import android.text.SpannableStringBuilder;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.h;
import l20.d;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.atoms.data.disclaimer.DisclaimerAtom;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.data.AddHotelGuestsV5DTO;
import ru.ozon.app.android.travel.feature.hotels.widgets.addHotelGuests.v5.presentation.AddHotelGuestsV5VO;
import ru.ozon.app.android.travel.molecules.dto.commonInput.v1.CommonInputDTO;
import ru.ozon.app.android.travel.molecules.dto.linkButton.LinkButtonDTO;
import ru.ozon.app.android.travel.molecules.input.v1.CommonInputVO;
import ru.ozon.app.android.travel.molecules.input.v1.mapper.CommonInputMapperKt;
import ru.ozon.app.android.travel.molecules.mapper.MapperExtKt;
import ru.ozon.app.android.travel.molecules.view.linkButton.LinkButtonVO;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.text.TextDTO;
import ru.ozon.uni.atoms.utils.OzonSpannableStringKt;
import ru.ozon.uni.core.R$drawable;

@Metadata(d1 = {"\u0000b\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\t\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0005\b\u0001\u0018\u0000 %2*\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0003\u0012\n\u0012\b\u0012\u0004\u0012\u00020\u00050\u00040\u0001j\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0005`\u0006:\u0001%B\u0007¢\u0006\u0004\b\u0007\u0010\bJ'\u0010\u000f\u001a\u00020\u00052\u0006\u0010\n\u001a\u00020\t2\u0006\u0010\f\u001a\u00020\u000b2\u0006\u0010\u000e\u001a\u00020\rH\u0002¢\u0006\u0004\b\u000f\u0010\u0010J'\u0010\u0017\u001a\u00020\u00162\u0006\u0010\u0012\u001a\u00020\u00112\u0006\u0010\u0013\u001a\u00020\u000b2\u0006\u0010\u0015\u001a\u00020\u0014H\u0002¢\u0006\u0004\b\u0017\u0010\u0018J5\u0010\u001e\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u0013\u001a\u00020\u000b2\b\u0010\u001a\u001a\u0004\u0018\u00010\u00192\b\u0010\u001b\u001a\u0004\u0018\u00010\u00192\u0006\u0010\u001d\u001a\u00020\u001cH\u0002¢\u0006\u0004\b\u001e\u0010\u001fJ*\u0010#\u001a\b\u0012\u0004\u0012\u00020\u00050\u00042\u0006\u0010 \u001a\u00020\u00022\n\u0010\"\u001a\u00060\u0003j\u0002`!H\u0096\u0002¢\u0006\u0004\b#\u0010$¨\u0006&"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5Mapper;", "Lkotlin/Function2;", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;", "Ll20/d;", "", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "Lru/ozon/app/android/composer/widgets/base/WidgetMapper;", "<init>", "()V", "", "stateId", "", "roomIndex", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$RoomDTO;", "roomDTO", "mapRoom", "(Ljava/lang/String;ILru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$RoomDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO;", "", "widgetId", "formIndex", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$GuestFormDTO;", "formDTO", "Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "mapForm", "(JILru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO$GuestFormDTO;)Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/presentation/AddHotelGuestsV5VO$GuestFormVO;", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "optionalPostfix", "", "isFormOptional", "provideTitle", "(ILru/ozon/uni/atoms/data/text/TextDTO;Lru/ozon/uni/atoms/data/text/TextDTO;Z)Lru/ozon/uni/atoms/data/text/TextDTO;", "state", "Lru/ozon/app/android/composer/view/WidgetInfo;", "widgetInfo", "invoke", "(Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5DTO;Ll20/d;)Ljava/util/List;", "Companion", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AddHotelGuestsV5Mapper implements Function2<AddHotelGuestsV5DTO, d, List<? extends AddHotelGuestsV5VO>> {

    @NotNull
    private static final Companion Companion = new Companion(null);

    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010\f\n\u0002\b\u0002\b\u0082\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003R\u000e\u0010\u0004\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000R\u000e\u0010\u0006\u001a\u00020\u0005X\u0086T¢\u0006\u0002\n\u0000¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/travel/feature/hotels/widgets/addHotelGuests/v5/data/AddHotelGuestsV5Mapper$Companion;", "", "<init>", "()V", "COMMA", "", "SPACE", "hotels_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    private static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private Companion() {
        }
    }

    private final AddHotelGuestsV5VO.GuestFormVO mapForm(long widgetId, int formIndex, AddHotelGuestsV5DTO.GuestFormDTO formDTO) {
        TextDTO title = formDTO.getTitle();
        TextDTO optionalGuestTitlePostfix = formDTO.getOptionalGuestTitlePostfix();
        TextDTO provideTitle = provideTitle(formIndex, formDTO.getTitle(), formDTO.getOptionalGuestTitlePostfix(), formDTO.isOptionalForm());
        LinkButtonDTO removeOptionalGuestButton = formDTO.getRemoveOptionalGuestButton();
        LinkButtonVO vo = removeOptionalGuestButton != null ? MapperExtKt.toVO(removeOptionalGuestButton) : null;
        List<CommonInputDTO> inputs = formDTO.getInputs();
        ArrayList arrayList = new ArrayList();
        int i11 = 0;
        for (Object obj : inputs) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            CommonInputDTO commonInputDTO = (CommonInputDTO) obj;
            Boolean bool = Boolean.TRUE;
            Long valueOf = Long.valueOf(widgetId);
            TextDTO title2 = formDTO.getTitle();
            CommonInputVO vo2 = CommonInputMapperKt.toVO(commonInputDTO, bool, valueOf, i11, String.valueOf(title2 != null ? title2.getText() : null));
            if (vo2 instanceof CommonInputVO.Selector) {
                ((CommonInputVO.Selector) vo2).setRightIcon(Integer.valueOf(R$drawable.ic_s_picker));
            }
            if (vo2 != null) {
                arrayList.add(vo2);
            }
            i11 = i12;
        }
        return new AddHotelGuestsV5VO.GuestFormVO(formIndex, title, optionalGuestTitlePostfix, provideTitle, vo, arrayList, formDTO.isFormVisible(), formDTO.isOptionalForm(), formDTO.getGuestId(), formDTO.getSelectEmployeeButton());
    }

    private final AddHotelGuestsV5VO mapRoom(String stateId, int roomIndex, AddHotelGuestsV5DTO.RoomDTO roomDTO) {
        boolean z11;
        int hashCode = (roomIndex + "-" + stateId).hashCode();
        long j11 = (long) hashCode;
        List<AddHotelGuestsV5DTO.GuestFormDTO> forms = roomDTO.getForms();
        ArrayList arrayList = new ArrayList(C7714v.z(forms, 10));
        int i11 = 0;
        int i12 = 0;
        for (Object obj : forms) {
            int i13 = i12 + 1;
            if (i12 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapForm(j11, i12, (AddHotelGuestsV5DTO.GuestFormDTO) obj));
            i12 = i13;
        }
        Integer valueOf = Integer.valueOf(hashCode);
        TextDTO title = roomDTO.getTitle();
        TextDTO subtitle = roomDTO.getSubtitle();
        LinkButtonDTO addGuestButton = roomDTO.getAddGuestButton();
        LinkButtonVO vo = addGuestButton != null ? MapperExtKt.toVO(addGuestButton) : null;
        if (roomDTO.getAddGuestButton() != null) {
            List<AddHotelGuestsV5DTO.GuestFormDTO> forms2 = roomDTO.getForms();
            if (!(forms2 instanceof Collection) || !forms2.isEmpty()) {
                Iterator<T> it = forms2.iterator();
                while (it.hasNext()) {
                    if (!((AddHotelGuestsV5DTO.GuestFormDTO) it.next()).isFormVisible()) {
                        z11 = true;
                        break;
                    }
                }
            }
        }
        z11 = false;
        DisclaimerAtom disclaimer = roomDTO.getDisclaimer();
        Iterator<AddHotelGuestsV5DTO.GuestFormDTO> it2 = roomDTO.getForms().iterator();
        loop2: while (true) {
            if (!it2.hasNext()) {
                i11 = -1;
                break;
            }
            List<CommonInputDTO> inputs = it2.next().getInputs();
            if (!(inputs instanceof Collection) || !inputs.isEmpty()) {
                Iterator<T> it3 = inputs.iterator();
                while (it3.hasNext()) {
                    if (((CommonInputDTO) it3.next()).getScrollOnMount()) {
                        break loop2;
                    }
                }
            }
            i11++;
        }
        Integer valueOf2 = Integer.valueOf(i11);
        return new AddHotelGuestsV5VO(j11, valueOf, roomIndex, title, subtitle, arrayList, vo, z11, disclaimer, valueOf2.intValue() != -1 ? valueOf2 : null, false);
    }

    private final TextDTO provideTitle(int formIndex, TextDTO title, TextDTO optionalPostfix, boolean isFormOptional) {
        if (title == null || !isFormOptional) {
            return title;
        }
        SpannableStringBuilder append = new SpannableStringBuilder(title.getText()).append((CharSequence) " ").append((CharSequence) String.valueOf(formIndex + 1));
        if (optionalPostfix != null) {
            if (!h.f0(optionalPostfix.getText(), ',') && !h.f0(optionalPostfix.getText(), ' ')) {
                append.append(' ');
            }
            append.append((CharSequence) optionalPostfix.getText());
        }
        Intrinsics.f(append);
        return TextDTO.copy$default(title, OzonSpannableStringKt.toOzonSpannableString(append), null, null, null, null, null, null, null, null, null, null, null, null, false, null, null, null, null, null, 524286, null);
    }

    @Override // kotlin.jvm.functions.Function2
    @NotNull
    public List<AddHotelGuestsV5VO> invoke(@NotNull AddHotelGuestsV5DTO state, @NotNull d widgetInfo) {
        Intrinsics.checkNotNullParameter(state, "state");
        Intrinsics.checkNotNullParameter(widgetInfo, "widgetInfo");
        String d11 = widgetInfo.d();
        List<AddHotelGuestsV5DTO.RoomDTO> rooms = state.getRooms();
        ArrayList arrayList = new ArrayList(C7714v.z(rooms, 10));
        int i11 = 0;
        for (Object obj : rooms) {
            int i12 = i11 + 1;
            if (i11 < 0) {
                C7714v.O0();
                throw null;
            }
            arrayList.add(mapRoom(d11, i11, (AddHotelGuestsV5DTO.RoomDTO) obj));
            i11 = i12;
        }
        return arrayList;
    }
}
