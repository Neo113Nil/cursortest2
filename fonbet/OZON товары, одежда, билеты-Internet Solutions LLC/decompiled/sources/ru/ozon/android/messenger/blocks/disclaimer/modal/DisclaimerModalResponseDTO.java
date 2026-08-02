package ru.ozon.android.messenger.blocks.disclaimer.modal;

import K1.G;
import T7.P;
import com.squareup.moshi.j;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.collections.C7714v;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.disclaimer.modal.adapter.c;
import ru.ozon.android.messenger.blocks.disclaimer.modal.e;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;
import ru.ozon.uni.atoms.data.cell.DisclosureIconTitleSubtitleCellDTO;
import ru.ozon.uni.atoms.data.controls.button.ButtonV3DTO;
import ru.ozon.uni.atoms.data.text.TextDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0006\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u0019B\u0011\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\r\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\u0007\u0010\bJ\u0012\u0010\t\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\t\u0010\nJ\u001c\u0010\u000b\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u000b\u0010\fJ\u0010\u0010\u000e\u001a\u00020\rHÖ\u0001¢\u0006\u0004\b\u000e\u0010\u000fJ\u0010\u0010\u0011\u001a\u00020\u0010HÖ\u0001¢\u0006\u0004\b\u0011\u0010\u0012J\u001a\u0010\u0015\u001a\u00020\u00142\b\u0010\u0013\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u0015\u0010\u0016R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\u0017\u001a\u0004\b\u0018\u0010\n¨\u0006\u001a"}, d2 = {"Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO;", "", "Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO$DisclaimerModalDTO;", "modal", "<init>", "(Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO$DisclaimerModalDTO;)V", "Lru/ozon/android/messenger/blocks/disclaimer/modal/e;", "map", "()Lru/ozon/android/messenger/blocks/disclaimer/modal/e;", "component1", "()Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO$DisclaimerModalDTO;", "copy", "(Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO$DisclaimerModalDTO;)Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO$DisclaimerModalDTO;", "getModal", "DisclaimerModalDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class DisclaimerModalResponseDTO {
    public static final int $stable = 8;
    private final DisclaimerModalDTO modal;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000H\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0010\u000e\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\f\b\u0081\b\u0018\u00002\u00020\u0001BQ\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u000e\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\b\u0012\u0014\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0011\u001a\u00020\u0010¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0018\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0018\u0010\u0017\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0016J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\bHÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0019J\u001e\u0010\u001a\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u001a\u0010\u001bJd\u0010\u001c\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\u0010\b\u0002\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00042\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\b2\u0016\b\u0002\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\nHÆ\u0001¢\u0006\u0004\b\u001c\u0010\u001dJ\u0010\u0010\u001e\u001a\u00020\u000bHÖ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010!\u001a\u00020 HÖ\u0001¢\u0006\u0004\b!\u0010\"J\u001a\u0010%\u001a\u00020$2\b\u0010#\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b%\u0010&R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010'\u001a\u0004\b(\u0010\u0014R\u001f\u0010\u0005\u001a\n\u0012\u0004\u0012\u00020\u0002\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010)\u001a\u0004\b*\u0010\u0016R\u001f\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0006\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0007\u0010)\u001a\u0004\b+\u0010\u0016R\u0019\u0010\t\u001a\u0004\u0018\u00010\b8\u0006¢\u0006\f\n\u0004\b\t\u0010,\u001a\u0004\b-\u0010\u0019R%\u0010\r\u001a\u0010\u0012\u0004\u0012\u00020\u000b\u0012\u0004\u0012\u00020\f\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\r\u0010.\u001a\u0004\b/\u0010\u001b¨\u00060"}, d2 = {"Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO$DisclaimerModalDTO;", "", "Lru/ozon/uni/atoms/data/text/TextDTO;", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "description", "Lru/ozon/uni/atoms/data/cell/DisclosureIconTitleSubtitleCellDTO;", "buttons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "doneButton", "", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "trackingInfo", "<init>", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)V", "Lru/ozon/android/messenger/blocks/disclaimer/modal/e$b;", "map", "()Lru/ozon/android/messenger/blocks/disclaimer/modal/e$b;", "component1", "()Lru/ozon/uni/atoms/data/text/TextDTO;", "component2", "()Ljava/util/List;", "component3", "component4", "()Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "component5", "()Ljava/util/Map;", "copy", "(Lru/ozon/uni/atoms/data/text/TextDTO;Ljava/util/List;Ljava/util/List;Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;Ljava/util/Map;)Lru/ozon/android/messenger/blocks/disclaimer/modal/DisclaimerModalResponseDTO$DisclaimerModalDTO;", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Lru/ozon/uni/atoms/data/text/TextDTO;", "getTitle", "Ljava/util/List;", "getDescription", "getButtons", "Lru/ozon/uni/atoms/data/controls/button/ButtonV3DTO;", "getDoneButton", "Ljava/util/Map;", "getTrackingInfo", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class DisclaimerModalDTO {
        public static final int $stable = 8;
        private final List<DisclosureIconTitleSubtitleCellDTO> buttons;
        private final List<TextDTO> description;
        private final ButtonV3DTO doneButton;
        private final TextDTO title;
        private final Map<String, MessengerTrackingInfo> trackingInfo;

        public DisclaimerModalDTO(TextDTO textDTO, List<TextDTO> list, List<DisclosureIconTitleSubtitleCellDTO> list2, ButtonV3DTO buttonV3DTO, Map<String, MessengerTrackingInfo> map) {
            this.title = textDTO;
            this.description = list;
            this.buttons = list2;
            this.doneButton = buttonV3DTO;
            this.trackingInfo = map;
        }

        public static /* synthetic */ DisclaimerModalDTO copy$default(DisclaimerModalDTO disclaimerModalDTO, TextDTO textDTO, List list, List list2, ButtonV3DTO buttonV3DTO, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                textDTO = disclaimerModalDTO.title;
            }
            if ((i11 & 2) != 0) {
                list = disclaimerModalDTO.description;
            }
            if ((i11 & 4) != 0) {
                list2 = disclaimerModalDTO.buttons;
            }
            if ((i11 & 8) != 0) {
                buttonV3DTO = disclaimerModalDTO.doneButton;
            }
            if ((i11 & 16) != 0) {
                map = disclaimerModalDTO.trackingInfo;
            }
            Map map2 = map;
            List list3 = list2;
            return disclaimerModalDTO.copy(textDTO, list, list3, buttonV3DTO, map2);
        }

        /* renamed from: component1, reason: from getter */
        public final TextDTO getTitle() {
            return this.title;
        }

        public final List<TextDTO> component2() {
            return this.description;
        }

        public final List<DisclosureIconTitleSubtitleCellDTO> component3() {
            return this.buttons;
        }

        /* renamed from: component4, reason: from getter */
        public final ButtonV3DTO getDoneButton() {
            return this.doneButton;
        }

        public final Map<String, MessengerTrackingInfo> component5() {
            return this.trackingInfo;
        }

        @NotNull
        public final DisclaimerModalDTO copy(TextDTO title, List<TextDTO> description, List<DisclosureIconTitleSubtitleCellDTO> buttons, ButtonV3DTO doneButton, Map<String, MessengerTrackingInfo> trackingInfo) {
            return new DisclaimerModalDTO(title, description, buttons, doneButton, trackingInfo);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof DisclaimerModalDTO)) {
                return false;
            }
            DisclaimerModalDTO disclaimerModalDTO = (DisclaimerModalDTO) other;
            return Intrinsics.d(this.title, disclaimerModalDTO.title) && Intrinsics.d(this.description, disclaimerModalDTO.description) && Intrinsics.d(this.buttons, disclaimerModalDTO.buttons) && Intrinsics.d(this.doneButton, disclaimerModalDTO.doneButton) && Intrinsics.d(this.trackingInfo, disclaimerModalDTO.trackingInfo);
        }

        public final List<DisclosureIconTitleSubtitleCellDTO> getButtons() {
            return this.buttons;
        }

        public final List<TextDTO> getDescription() {
            return this.description;
        }

        public final ButtonV3DTO getDoneButton() {
            return this.doneButton;
        }

        public final TextDTO getTitle() {
            return this.title;
        }

        public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
            return this.trackingInfo;
        }

        public int hashCode() {
            TextDTO textDTO = this.title;
            int hashCode = (textDTO == null ? 0 : textDTO.hashCode()) * 31;
            List<TextDTO> list = this.description;
            int hashCode2 = (hashCode + (list == null ? 0 : list.hashCode())) * 31;
            List<DisclosureIconTitleSubtitleCellDTO> list2 = this.buttons;
            int hashCode3 = (hashCode2 + (list2 == null ? 0 : list2.hashCode())) * 31;
            ButtonV3DTO buttonV3DTO = this.doneButton;
            int hashCode4 = (hashCode3 + (buttonV3DTO == null ? 0 : buttonV3DTO.hashCode())) * 31;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            return hashCode4 + (map != null ? map.hashCode() : 0);
        }

        @NotNull
        public final e.b map() {
            ArrayList arrayList = new ArrayList();
            List<TextDTO> list = this.description;
            if (list != null) {
                int i11 = 0;
                for (Object obj : list) {
                    int i12 = i11 + 1;
                    if (i11 < 0) {
                        C7714v.O0();
                        throw null;
                    }
                    arrayList.add(new c.b((TextDTO) obj, i11 == C7714v.P(this.description)));
                    i11 = i12;
                }
            }
            List<DisclosureIconTitleSubtitleCellDTO> list2 = this.buttons;
            if (list2 != null) {
                Iterator<T> it = list2.iterator();
                while (it.hasNext()) {
                    arrayList.add(new c.a.C1492a((DisclosureIconTitleSubtitleCellDTO) it.next()));
                }
            }
            return new e.b(this.title, arrayList, this.doneButton, this.trackingInfo);
        }

        @NotNull
        public String toString() {
            TextDTO textDTO = this.title;
            List<TextDTO> list = this.description;
            List<DisclosureIconTitleSubtitleCellDTO> list2 = this.buttons;
            ButtonV3DTO buttonV3DTO = this.doneButton;
            Map<String, MessengerTrackingInfo> map = this.trackingInfo;
            StringBuilder e11 = G.e("DisclaimerModalDTO(title=", textDTO, ", description=", list, ", buttons=");
            e11.append(list2);
            e11.append(", doneButton=");
            e11.append(buttonV3DTO);
            e11.append(", trackingInfo=");
            return P.f(e11, map, ")");
        }
    }

    public DisclaimerModalResponseDTO(DisclaimerModalDTO disclaimerModalDTO) {
        this.modal = disclaimerModalDTO;
    }

    public static /* synthetic */ DisclaimerModalResponseDTO copy$default(DisclaimerModalResponseDTO disclaimerModalResponseDTO, DisclaimerModalDTO disclaimerModalDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            disclaimerModalDTO = disclaimerModalResponseDTO.modal;
        }
        return disclaimerModalResponseDTO.copy(disclaimerModalDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final DisclaimerModalDTO getModal() {
        return this.modal;
    }

    @NotNull
    public final DisclaimerModalResponseDTO copy(DisclaimerModalDTO modal) {
        return new DisclaimerModalResponseDTO(modal);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        return (other instanceof DisclaimerModalResponseDTO) && Intrinsics.d(this.modal, ((DisclaimerModalResponseDTO) other).modal);
    }

    public final DisclaimerModalDTO getModal() {
        return this.modal;
    }

    public int hashCode() {
        DisclaimerModalDTO disclaimerModalDTO = this.modal;
        if (disclaimerModalDTO == null) {
            return 0;
        }
        return disclaimerModalDTO.hashCode();
    }

    @NotNull
    public final e map() {
        DisclaimerModalDTO disclaimerModalDTO = this.modal;
        return new e(disclaimerModalDTO != null ? disclaimerModalDTO.map() : null);
    }

    @NotNull
    public String toString() {
        return "DisclaimerModalResponseDTO(modal=" + this.modal + ")";
    }
}
