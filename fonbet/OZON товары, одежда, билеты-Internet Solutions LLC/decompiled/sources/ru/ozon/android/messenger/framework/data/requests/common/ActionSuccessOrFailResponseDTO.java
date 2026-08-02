package ru.ozon.android.messenger.framework.data.requests.common;

import V.e;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0002\u0016\u0017B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0018"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO;", "", "successMessage", "Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$SuccessMessageDTO;", "failMessage", "Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$FailMessageDTO;", "<init>", "(Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$SuccessMessageDTO;Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$FailMessageDTO;)V", "getSuccessMessage", "()Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$SuccessMessageDTO;", "getFailMessage", "()Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$FailMessageDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "SuccessMessageDTO", "FailMessageDTO", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class ActionSuccessOrFailResponseDTO {
    public static final int $stable = 0;
    private final FailMessageDTO failMessage;
    private final SuccessMessageDTO successMessage;

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$FailMessageDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class FailMessageDTO {
        public static final int $stable = 0;
        private final String subtitle;
        private final String title;

        public FailMessageDTO(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public static /* synthetic */ FailMessageDTO copy$default(FailMessageDTO failMessageDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = failMessageDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = failMessageDTO.subtitle;
            }
            return failMessageDTO.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final FailMessageDTO copy(String title, String subtitle) {
            return new FailMessageDTO(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof FailMessageDTO)) {
                return false;
            }
            FailMessageDTO failMessageDTO = (FailMessageDTO) other;
            return Intrinsics.d(this.title, failMessageDTO.title) && Intrinsics.d(this.subtitle, failMessageDTO.subtitle);
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("FailMessageDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    @j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000b\u0010\n\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u000b\u001a\u0004\u0018\u00010\u0003HÆ\u0003J!\u0010\f\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/common/ActionSuccessOrFailResponseDTO$SuccessMessageDTO;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "subtitle", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class SuccessMessageDTO {
        public static final int $stable = 0;
        private final String subtitle;
        private final String title;

        public SuccessMessageDTO(String str, String str2) {
            this.title = str;
            this.subtitle = str2;
        }

        public static /* synthetic */ SuccessMessageDTO copy$default(SuccessMessageDTO successMessageDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = successMessageDTO.title;
            }
            if ((i11 & 2) != 0) {
                str2 = successMessageDTO.subtitle;
            }
            return successMessageDTO.copy(str, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getTitle() {
            return this.title;
        }

        /* renamed from: component2, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final SuccessMessageDTO copy(String title, String subtitle) {
            return new SuccessMessageDTO(title, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SuccessMessageDTO)) {
                return false;
            }
            SuccessMessageDTO successMessageDTO = (SuccessMessageDTO) other;
            return Intrinsics.d(this.title, successMessageDTO.title) && Intrinsics.d(this.subtitle, successMessageDTO.subtitle);
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        public final String getTitle() {
            return this.title;
        }

        public int hashCode() {
            String str = this.title;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            String str2 = this.subtitle;
            return hashCode + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return e.a("SuccessMessageDTO(title=", this.title, ", subtitle=", this.subtitle, ")");
        }
    }

    public ActionSuccessOrFailResponseDTO(SuccessMessageDTO successMessageDTO, FailMessageDTO failMessageDTO) {
        this.successMessage = successMessageDTO;
        this.failMessage = failMessageDTO;
    }

    public static /* synthetic */ ActionSuccessOrFailResponseDTO copy$default(ActionSuccessOrFailResponseDTO actionSuccessOrFailResponseDTO, SuccessMessageDTO successMessageDTO, FailMessageDTO failMessageDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            successMessageDTO = actionSuccessOrFailResponseDTO.successMessage;
        }
        if ((i11 & 2) != 0) {
            failMessageDTO = actionSuccessOrFailResponseDTO.failMessage;
        }
        return actionSuccessOrFailResponseDTO.copy(successMessageDTO, failMessageDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final SuccessMessageDTO getSuccessMessage() {
        return this.successMessage;
    }

    /* renamed from: component2, reason: from getter */
    public final FailMessageDTO getFailMessage() {
        return this.failMessage;
    }

    @NotNull
    public final ActionSuccessOrFailResponseDTO copy(SuccessMessageDTO successMessage, FailMessageDTO failMessage) {
        return new ActionSuccessOrFailResponseDTO(successMessage, failMessage);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionSuccessOrFailResponseDTO)) {
            return false;
        }
        ActionSuccessOrFailResponseDTO actionSuccessOrFailResponseDTO = (ActionSuccessOrFailResponseDTO) other;
        return Intrinsics.d(this.successMessage, actionSuccessOrFailResponseDTO.successMessage) && Intrinsics.d(this.failMessage, actionSuccessOrFailResponseDTO.failMessage);
    }

    public final FailMessageDTO getFailMessage() {
        return this.failMessage;
    }

    public final SuccessMessageDTO getSuccessMessage() {
        return this.successMessage;
    }

    public int hashCode() {
        SuccessMessageDTO successMessageDTO = this.successMessage;
        int hashCode = (successMessageDTO == null ? 0 : successMessageDTO.hashCode()) * 31;
        FailMessageDTO failMessageDTO = this.failMessage;
        return hashCode + (failMessageDTO != null ? failMessageDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActionSuccessOrFailResponseDTO(successMessage=" + this.successMessage + ", failMessage=" + this.failMessage + ")";
    }
}
