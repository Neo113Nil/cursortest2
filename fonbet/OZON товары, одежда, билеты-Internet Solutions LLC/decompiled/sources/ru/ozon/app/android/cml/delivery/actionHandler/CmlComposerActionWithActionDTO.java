package ru.ozon.app.android.cml.delivery.actionHandler;

import Xc.a;
import Xc.b;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.uni.atoms.data.AtomActionDTO;
import ru.ozon.uni.atoms.data.notification.NotificationDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB%\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0007HÆ\u0003J-\u0010\u0013\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0007HÆ\u0001J\u0013\u0010\u0014\u001a\u00020\u00152\b\u0010\u0016\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0017\u001a\u00020\u0018HÖ\u0001J\t\u0010\u0019\u001a\u00020\u001aHÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000f¨\u0006\u001c"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO;", "", "action", "Lru/ozon/uni/atoms/data/AtomActionDTO;", "message", "Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO;", "notificationBar", "Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "<init>", "(Lru/ozon/uni/atoms/data/AtomActionDTO;Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO;Lru/ozon/uni/atoms/data/notification/NotificationDTO;)V", "getAction", "()Lru/ozon/uni/atoms/data/AtomActionDTO;", "getMessage", "()Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO;", "getNotificationBar", "()Lru/ozon/uni/atoms/data/notification/NotificationDTO;", "component1", "component2", "component3", "copy", "equals", "", "other", "hashCode", "", "toString", "", "MessageDTO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes11.dex */
public final /* data */ class CmlComposerActionWithActionDTO {
    private final AtomActionDTO action;
    private final MessageDTO message;
    private final NotificationDTO notificationBar;

    @Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0087\b\u0018\u00002\u00020\u0001:\u0001\u0015B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0013HÖ\u0001J\t\u0010\u0014\u001a\u00020\u0005HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0016"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO;", "", "type", "Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO$MessageTypeDTO;", "message", "", "<init>", "(Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO$MessageTypeDTO;Ljava/lang/String;)V", "getType", "()Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO$MessageTypeDTO;", "getMessage", "()Ljava/lang/String;", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "MessageTypeDTO", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class MessageDTO {

        @NotNull
        private final String message;

        @NotNull
        private final MessageTypeDTO type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0006\b\u0087\u0081\u0002\u0018\u00002\b\u0012\u0004\u0012\u00020\u00000\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\u0007"}, d2 = {"Lru/ozon/app/android/cml/delivery/actionHandler/CmlComposerActionWithActionDTO$MessageDTO$MessageTypeDTO;", "", "<init>", "(Ljava/lang/String;I)V", "TYPE_PLAIN", "TYPE_SUCCESS", "TYPE_WARNING", "delivery_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
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

        public MessageDTO(@NotNull MessageTypeDTO type, @NotNull String message) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            this.type = type;
            this.message = message;
        }

        public static /* synthetic */ MessageDTO copy$default(MessageDTO messageDTO, MessageTypeDTO messageTypeDTO, String str, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                messageTypeDTO = messageDTO.type;
            }
            if ((i11 & 2) != 0) {
                str = messageDTO.message;
            }
            return messageDTO.copy(messageTypeDTO, str);
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

        @NotNull
        public final MessageDTO copy(@NotNull MessageTypeDTO type, @NotNull String message) {
            Intrinsics.checkNotNullParameter(type, "type");
            Intrinsics.checkNotNullParameter(message, "message");
            return new MessageDTO(type, message);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof MessageDTO)) {
                return false;
            }
            MessageDTO messageDTO = (MessageDTO) other;
            return this.type == messageDTO.type && Intrinsics.d(this.message, messageDTO.message);
        }

        @NotNull
        public final String getMessage() {
            return this.message;
        }

        @NotNull
        public final MessageTypeDTO getType() {
            return this.type;
        }

        public int hashCode() {
            return this.message.hashCode() + (this.type.hashCode() * 31);
        }

        @NotNull
        public String toString() {
            return "MessageDTO(type=" + this.type + ", message=" + this.message + ")";
        }
    }

    public CmlComposerActionWithActionDTO(AtomActionDTO atomActionDTO, MessageDTO messageDTO, NotificationDTO notificationDTO) {
        this.action = atomActionDTO;
        this.message = messageDTO;
        this.notificationBar = notificationDTO;
    }

    public static /* synthetic */ CmlComposerActionWithActionDTO copy$default(CmlComposerActionWithActionDTO cmlComposerActionWithActionDTO, AtomActionDTO atomActionDTO, MessageDTO messageDTO, NotificationDTO notificationDTO, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            atomActionDTO = cmlComposerActionWithActionDTO.action;
        }
        if ((i11 & 2) != 0) {
            messageDTO = cmlComposerActionWithActionDTO.message;
        }
        if ((i11 & 4) != 0) {
            notificationDTO = cmlComposerActionWithActionDTO.notificationBar;
        }
        return cmlComposerActionWithActionDTO.copy(atomActionDTO, messageDTO, notificationDTO);
    }

    /* renamed from: component1, reason: from getter */
    public final AtomActionDTO getAction() {
        return this.action;
    }

    /* renamed from: component2, reason: from getter */
    public final MessageDTO getMessage() {
        return this.message;
    }

    /* renamed from: component3, reason: from getter */
    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    @NotNull
    public final CmlComposerActionWithActionDTO copy(AtomActionDTO action, MessageDTO message, NotificationDTO notificationBar) {
        return new CmlComposerActionWithActionDTO(action, message, notificationBar);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof CmlComposerActionWithActionDTO)) {
            return false;
        }
        CmlComposerActionWithActionDTO cmlComposerActionWithActionDTO = (CmlComposerActionWithActionDTO) other;
        return Intrinsics.d(this.action, cmlComposerActionWithActionDTO.action) && Intrinsics.d(this.message, cmlComposerActionWithActionDTO.message) && Intrinsics.d(this.notificationBar, cmlComposerActionWithActionDTO.notificationBar);
    }

    public final AtomActionDTO getAction() {
        return this.action;
    }

    public final MessageDTO getMessage() {
        return this.message;
    }

    public final NotificationDTO getNotificationBar() {
        return this.notificationBar;
    }

    public int hashCode() {
        AtomActionDTO atomActionDTO = this.action;
        int hashCode = (atomActionDTO == null ? 0 : atomActionDTO.hashCode()) * 31;
        MessageDTO messageDTO = this.message;
        int hashCode2 = (hashCode + (messageDTO == null ? 0 : messageDTO.hashCode())) * 31;
        NotificationDTO notificationDTO = this.notificationBar;
        return hashCode2 + (notificationDTO != null ? notificationDTO.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "CmlComposerActionWithActionDTO(action=" + this.action + ", message=" + this.message + ", notificationBar=" + this.notificationBar + ")";
    }
}
