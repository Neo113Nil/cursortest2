package ru.ozon.app.android.authCustomActionHandlers.email;

import C.o0;
import G.g;
import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0016B\u001b\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\u000b\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J!\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0015HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0017"}, d2 = {"Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO;", "", "message", "Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "<init>", "(Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;Lru/ozon/uni/atoms/data/AtomActionDTO;)V", "getMessage", "()Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MessageDTO", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class ActionDTO {
    private final AtomActionDTO action;
    private final MessageDTO message;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0018B!\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\u0004\b\u0007\u0010\bJ\t\u0010\u000e\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000f\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003J)\u0010\u0011\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0005HÆ\u0001J\u0013\u0010\u0012\u001a\u00020\u00132\b\u0010\u0014\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0015\u001a\u00020\u0016HÖ\u0001J\t\u0010\u0017\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\f¨\u0006\u0019"}, d2 = {"Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO;", "", "type", "Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO$MessageTypeDTO;", "message", "", "subtitle", "<init>", "(Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO$MessageTypeDTO;Ljava/lang/String;Ljava/lang/String;)V", "getType", "()Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO$MessageTypeDTO;", "getMessage", "()Ljava/lang/String;", "getSubtitle", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "MessageTypeDTO", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MessageDTO {

        @NotNull
        private final String message;
        private final String subtitle;

        @NotNull
        private final MessageTypeDTO type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/authCustomActionHandlers/email/ActionDTO$MessageDTO$MessageTypeDTO;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_PLAIN", "TYPE_SUCCESS", "TYPE_WARNING", "custom-action-handler_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = false)
        public static final class MessageTypeDTO {
            private static final /* synthetic */ a $ENTRIES;
            private static final /* synthetic */ MessageTypeDTO[] $VALUES;
            public static final MessageTypeDTO TYPE_PLAIN = new MessageTypeDTO("TYPE_PLAIN", 0);
            public static final MessageTypeDTO TYPE_SUCCESS = new MessageTypeDTO("TYPE_SUCCESS", 1);
            public static final MessageTypeDTO TYPE_WARNING = new MessageTypeDTO("TYPE_WARNING", 2);

            private static final /* synthetic */ MessageTypeDTO[] $values() {
                return new MessageTypeDTO[]{TYPE_PLAIN, TYPE_SUCCESS, TYPE_WARNING};
            }

            static {
                MessageTypeDTO[] $values = $values();
                $VALUES = $values;
                $ENTRIES = b.a($values);
            }

            private MessageTypeDTO(String str, int i11) {
            }

            @NotNull
            public static a<MessageTypeDTO> getEntries() {
                return $ENTRIES;
            }

            public static MessageTypeDTO valueOf(String str) {
                return (MessageTypeDTO) Enum.valueOf(MessageTypeDTO.class, str);
            }

            public static MessageTypeDTO[] values() {
                return (MessageTypeDTO[]) $VALUES.clone();
            }
        }

        public MessageDTO(@NotNull MessageTypeDTO type, @NotNull String message, String str) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            this.type = type;
            this.message = message;
            this.subtitle = str;
        }

        public static /* synthetic */ MessageDTO copy$default(MessageDTO messageDTO, MessageTypeDTO messageTypeDTO, String str, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                messageTypeDTO = messageDTO.type;
            }
            if ((i11 & 2) != 0) {
                str = messageDTO.message;
            }
            if ((i11 & 4) != 0) {
                str2 = messageDTO.subtitle;
            }
            return messageDTO.copy(messageTypeDTO, str, str2);
        }

        @NotNull
        /* renamed from: component1, reason: from getter */
        public final MessageTypeDTO getType() {
            return this.type;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        /* renamed from: component3, reason: from getter */
        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final MessageDTO copy(@NotNull MessageTypeDTO type, @NotNull String message, String subtitle) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            return new MessageDTO(type, message, subtitle);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageDTO)) {
                return false;
            }
            MessageDTO messageDTO = (MessageDTO) other;
            return this.type == messageDTO.type && Intrinsics.d(this.message, messageDTO.message) && Intrinsics.d(this.subtitle, messageDTO.subtitle);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        public final String getSubtitle() {
            return this.subtitle;
        }

        @NotNull
        public final MessageTypeDTO getType() {
            return this.type;
        }

        public int hashCode() {
            int a11 = g.a(this.type.hashCode() * 31, 31, this.message);
            String str = this.subtitle;
            return a11 + (str == null ? 0 : str.hashCode());
        }

        @NotNull
        public String toString() {
            MessageTypeDTO messageTypeDTO = this.type;
            String str = this.message;
            String str2 = this.subtitle;
            StringBuilder sb2 = new StringBuilder("MessageDTO(type=");
            sb2.append(messageTypeDTO);
            sb2.append(", message=");
            sb2.append(str);
            sb2.append(", subtitle=");
            return o0.c(sb2, str2, ")");
        }
    }

    public ActionDTO(MessageDTO messageDTO, AtomActionDTO atomActionDTO) {
        this.message = messageDTO;
        this.action = atomActionDTO;
    }

    public static /* synthetic */ ActionDTO copy$default(ActionDTO actionDTO, MessageDTO messageDTO, AtomActionDTO atomActionDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            messageDTO = actionDTO.message;
        }
        if ((i11 & 2) != 0) {
            atomActionDTO = actionDTO.action;
        }
        return actionDTO.copy(messageDTO, atomActionDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final MessageDTO getMessage() {
        return this.message;
    }

    /* renamed from: component2, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    @NotNull
    public final ActionDTO copy(MessageDTO message, AtomActionDTO action) {
        return new ActionDTO(message, action);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ActionDTO)) {
            return false;
        }
        ActionDTO actionDTO = (ActionDTO) other;
        return Intrinsics.d(this.message, actionDTO.message) && Intrinsics.d(this.action, actionDTO.action);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final MessageDTO getMessage() {
        return this.message;
    }

    public int hashCode() {
        MessageDTO messageDTO = this.message;
        int hashCode = (messageDTO == null ? 0 : messageDTO.hashCode()) * 31;
        AtomActionDTO atomActionDTO = this.action;
        return hashCode + (atomActionDTO != null ? atomActionDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "ActionDTO(message=" + this.message + ", action=" + this.action + ")";
    }
}
