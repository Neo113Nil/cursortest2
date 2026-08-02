package ru.ozon.android.messenger.framework.data.remote.models.items;

import Kk.C3532b;
import com.google.android.gms.fido.fido2.api.common.UserVerificationMethods;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.joda.time.DateTime;
import ru.ozon.android.messenger.framework.analytics.MessengerTrackingInfo;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000^\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010$\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u001c\n\u0002\u0010\b\n\u0002\b\u0002\n\u0002\u0010\u0000\n\u0002\b\u001a\b\u0081\b\u0018\u00002\u00020\u0001:\u0002OPB\u008b\u0001\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\u0006\u0010\u0005\u001a\u00020\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t\u0012\u0006\u0010\u000b\u001a\u00020\u0007\u0012\b\u0010\r\u001a\u0004\u0018\u00010\f\u0012\b\u0010\u000f\u001a\u0004\u0018\u00010\u000e\u0012\b\u0010\u0011\u001a\u0004\u0018\u00010\u0010\u0012\u0014\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012\u0012\b\u0010\u0015\u001a\u0004\u0018\u00010\u0002\u0012\f\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u001cJ\u0010\u0010\u001d\u001a\u00020\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u001eJ\u0012\u0010\u001f\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001f\u0010\u001eJ\u0012\u0010 \u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b \u0010!J\u0012\u0010\"\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\"\u0010#J\u0010\u0010$\u001a\u00020\u0007HÆ\u0003¢\u0006\u0004\b$\u0010%J\u0012\u0010&\u001a\u0004\u0018\u00010\fHÆ\u0003¢\u0006\u0004\b&\u0010'J\u0012\u0010(\u001a\u0004\u0018\u00010\u000eHÆ\u0003¢\u0006\u0004\b(\u0010)J\u0012\u0010*\u001a\u0004\u0018\u00010\u0010HÆ\u0003¢\u0006\u0004\b*\u0010+J\u001e\u0010,\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u0012HÆ\u0003¢\u0006\u0004\b,\u0010-J\u0012\u0010.\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b.\u0010\u001cJ\u0016\u0010/\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0003¢\u0006\u0004\b/\u00100J¬\u0001\u00101\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\b\b\u0002\u0010\u0005\u001a\u00020\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\t2\b\b\u0002\u0010\u000b\u001a\u00020\u00072\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\f2\n\b\u0002\u0010\u000f\u001a\u0004\u0018\u00010\u000e2\n\b\u0002\u0010\u0011\u001a\u0004\u0018\u00010\u00102\u0016\b\u0002\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00122\n\b\u0002\u0010\u0015\u001a\u0004\u0018\u00010\u00022\u000e\b\u0002\u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u0016HÆ\u0001¢\u0006\u0004\b1\u00102J\u0010\u00103\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b3\u0010\u001cJ\u0010\u00105\u001a\u000204HÖ\u0001¢\u0006\u0004\b5\u00106J\u001a\u00109\u001a\u00020\u00072\b\u00108\u001a\u0004\u0018\u000107HÖ\u0003¢\u0006\u0004\b9\u0010:R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010;\u001a\u0004\b<\u0010\u001cR\u0017\u0010\u0005\u001a\u00020\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010=\u001a\u0004\b>\u0010\u001eR\u0019\u0010\u0006\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0006\u0010=\u001a\u0004\b?\u0010\u001eR\u0019\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006¢\u0006\f\n\u0004\b\b\u0010@\u001a\u0004\b\b\u0010!R\u0019\u0010\n\u001a\u0004\u0018\u00010\t8\u0006¢\u0006\f\n\u0004\b\n\u0010A\u001a\u0004\bB\u0010#R\u0017\u0010\u000b\u001a\u00020\u00078\u0006¢\u0006\f\n\u0004\b\u000b\u0010C\u001a\u0004\b\u000b\u0010%R\u0019\u0010\r\u001a\u0004\u0018\u00010\f8\u0006¢\u0006\f\n\u0004\b\r\u0010D\u001a\u0004\bE\u0010'R\u0019\u0010\u000f\u001a\u0004\u0018\u00010\u000e8\u0006¢\u0006\f\n\u0004\b\u000f\u0010F\u001a\u0004\bG\u0010)R\u0019\u0010\u0011\u001a\u0004\u0018\u00010\u00108\u0006¢\u0006\f\n\u0004\b\u0011\u0010H\u001a\u0004\bI\u0010+R%\u0010\u0014\u001a\u0010\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u0013\u0018\u00010\u00128\u0006¢\u0006\f\n\u0004\b\u0014\u0010J\u001a\u0004\bK\u0010-R\u0019\u0010\u0015\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0015\u0010;\u001a\u0004\bL\u0010\u001cR \u0010\u0018\u001a\b\u0012\u0004\u0012\u00020\u00170\u00168\u0016X\u0096\u0004¢\u0006\f\n\u0004\b\u0018\u0010M\u001a\u0004\bN\u00100¨\u0006Q"}, d2 = {"Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO;", "Lru/ozon/android/messenger/framework/data/remote/models/items/a;", "", "localId", "Lorg/joda/time/DateTime;", "createdAt", "updatedAt", "", "isRead", "Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$a;", "layout", "isMine", "Lru/ozon/android/messenger/framework/data/remote/models/items/AuthorDTO;", "author", "Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$b;", "status", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "contextMenu", "", "Lru/ozon/android/messenger/framework/analytics/MessengerTrackingInfo;", "trackingInfo", "updateStatusLabel", "", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "blocks", "<init>", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$a;ZLru/ozon/android/messenger/framework/data/remote/models/items/AuthorDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$b;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)V", "component1", "()Ljava/lang/String;", "component2", "()Lorg/joda/time/DateTime;", "component3", "component4", "()Ljava/lang/Boolean;", "component5", "()Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$a;", "component6", "()Z", "component7", "()Lru/ozon/android/messenger/framework/data/remote/models/items/AuthorDTO;", "component8", "()Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$b;", "component9", "()Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "component10", "()Ljava/util/Map;", "component11", "component12", "()Ljava/util/List;", "copy", "(Ljava/lang/String;Lorg/joda/time/DateTime;Lorg/joda/time/DateTime;Ljava/lang/Boolean;Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$a;ZLru/ozon/android/messenger/framework/data/remote/models/items/AuthorDTO;Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$b;Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;Ljava/util/Map;Ljava/lang/String;Ljava/util/List;)Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO;", "toString", "", "hashCode", "()I", "", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getLocalId", "Lorg/joda/time/DateTime;", "getCreatedAt", "getUpdatedAt", "Ljava/lang/Boolean;", "Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$a;", "getLayout", "Z", "Lru/ozon/android/messenger/framework/data/remote/models/items/AuthorDTO;", "getAuthor", "Lru/ozon/android/messenger/framework/data/remote/models/items/MessageModelDTO$b;", "getStatus", "Lru/ozon/android/messenger/framework/data/remote/models/items/ContextMenuDTO;", "getContextMenu", "Ljava/util/Map;", "getTrackingInfo", "getUpdateStatusLabel", "Ljava/util/List;", "getBlocks", "a", "b", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes10.dex */
public final /* data */ class MessageModelDTO implements ru.ozon.android.messenger.framework.data.remote.models.items.a {
    public static final int $stable = 8;
    private final AuthorDTO author;

    @NotNull
    private final List<BlockDTO> blocks;
    private final ContextMenuDTO contextMenu;

    @NotNull
    private final DateTime createdAt;
    private final boolean isMine;
    private final Boolean isRead;
    private final a layout;
    private final String localId;
    private final b status;
    private final Map<String, MessengerTrackingInfo> trackingInfo;
    private final String updateStatusLabel;
    private final DateTime updatedAt;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @i(name = "AvatarMessage")
        public static final a AVATAR_MESSAGE;

        @i(name = "Empty")
        public static final a EMPTY;

        @i(name = "Message")
        public static final a MESSAGE;

        @i(name = "Wide")
        public static final a WIDE;

        @NotNull
        private final String dtoName;

        static {
            a aVar = new a("MESSAGE", 0, "Message");
            MESSAGE = aVar;
            a aVar2 = new a("AVATAR_MESSAGE", 1, "AvatarMessage");
            AVATAR_MESSAGE = aVar2;
            a aVar3 = new a("WIDE", 2, "Wide");
            WIDE = aVar3;
            a aVar4 = new a("EMPTY", 3, "Empty");
            EMPTY = aVar4;
            a[] aVarArr = {aVar, aVar2, aVar3, aVar4};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.dtoName = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class b {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ b[] $VALUES;

        @i(name = "Delivered")
        public static final b DELIVERED;

        @i(name = "NoStatus")
        public static final b NO_STATUS;

        @i(name = "Read")
        public static final b READ;

        @NotNull
        private final String dtoName;

        static {
            b bVar = new b("NO_STATUS", 0, "NoStatus");
            NO_STATUS = bVar;
            b bVar2 = new b("DELIVERED", 1, "Delivered");
            DELIVERED = bVar2;
            b bVar3 = new b("READ", 2, "Read");
            READ = bVar3;
            b[] bVarArr = {bVar, bVar2, bVar3};
            $VALUES = bVarArr;
            $ENTRIES = Xc.b.a(bVarArr);
        }

        private b(String str, int i11, String str2) {
            this.dtoName = str2;
        }

        public static b valueOf(String str) {
            return (b) Enum.valueOf(b.class, str);
        }

        public static b[] values() {
            return (b[]) $VALUES.clone();
        }
    }

    public MessageModelDTO(String str, @NotNull DateTime createdAt, DateTime dateTime, Boolean bool, a aVar, boolean z11, AuthorDTO authorDTO, b bVar, ContextMenuDTO contextMenuDTO, Map<String, MessengerTrackingInfo> map, String str2, @NotNull List<BlockDTO> blocks) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        this.localId = str;
        this.createdAt = createdAt;
        this.updatedAt = dateTime;
        this.isRead = bool;
        this.layout = aVar;
        this.isMine = z11;
        this.author = authorDTO;
        this.status = bVar;
        this.contextMenu = contextMenuDTO;
        this.trackingInfo = map;
        this.updateStatusLabel = str2;
        this.blocks = blocks;
    }

    public static /* synthetic */ MessageModelDTO copy$default(MessageModelDTO messageModelDTO, String str, DateTime dateTime, DateTime dateTime2, Boolean bool, a aVar, boolean z11, AuthorDTO authorDTO, b bVar, ContextMenuDTO contextMenuDTO, Map map, String str2, List list, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = messageModelDTO.localId;
        }
        if ((i11 & 2) != 0) {
            dateTime = messageModelDTO.createdAt;
        }
        if ((i11 & 4) != 0) {
            dateTime2 = messageModelDTO.updatedAt;
        }
        if ((i11 & 8) != 0) {
            bool = messageModelDTO.isRead;
        }
        if ((i11 & 16) != 0) {
            aVar = messageModelDTO.layout;
        }
        if ((i11 & 32) != 0) {
            z11 = messageModelDTO.isMine;
        }
        if ((i11 & 64) != 0) {
            authorDTO = messageModelDTO.author;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_PATTERN) != 0) {
            bVar = messageModelDTO.status;
        }
        if ((i11 & 256) != 0) {
            contextMenuDTO = messageModelDTO.contextMenu;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_NONE) != 0) {
            map = messageModelDTO.trackingInfo;
        }
        if ((i11 & UserVerificationMethods.USER_VERIFY_ALL) != 0) {
            str2 = messageModelDTO.updateStatusLabel;
        }
        if ((i11 & 2048) != 0) {
            list = messageModelDTO.blocks;
        }
        String str3 = str2;
        List list2 = list;
        ContextMenuDTO contextMenuDTO2 = contextMenuDTO;
        Map map2 = map;
        AuthorDTO authorDTO2 = authorDTO;
        b bVar2 = bVar;
        a aVar2 = aVar;
        boolean z12 = z11;
        return messageModelDTO.copy(str, dateTime, dateTime2, bool, aVar2, z12, authorDTO2, bVar2, contextMenuDTO2, map2, str3, list2);
    }

    /* renamed from: component1, reason: from getter */
    public final String getLocalId() {
        return this.localId;
    }

    public final Map<String, MessengerTrackingInfo> component10() {
        return this.trackingInfo;
    }

    /* renamed from: component11, reason: from getter */
    public final String getUpdateStatusLabel() {
        return this.updateStatusLabel;
    }

    @NotNull
    public final List<BlockDTO> component12() {
        return this.blocks;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    /* renamed from: component3, reason: from getter */
    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    /* renamed from: component4, reason: from getter */
    public final Boolean getIsRead() {
        return this.isRead;
    }

    /* renamed from: component5, reason: from getter */
    public final a getLayout() {
        return this.layout;
    }

    /* renamed from: component6, reason: from getter */
    public final boolean getIsMine() {
        return this.isMine;
    }

    /* renamed from: component7, reason: from getter */
    public final AuthorDTO getAuthor() {
        return this.author;
    }

    /* renamed from: component8, reason: from getter */
    public final b getStatus() {
        return this.status;
    }

    /* renamed from: component9, reason: from getter */
    public final ContextMenuDTO getContextMenu() {
        return this.contextMenu;
    }

    @NotNull
    public final MessageModelDTO copy(String localId, @NotNull DateTime createdAt, DateTime updatedAt, Boolean isRead, a layout, boolean isMine, AuthorDTO author, b status, ContextMenuDTO contextMenu, Map<String, MessengerTrackingInfo> trackingInfo, String updateStatusLabel, @NotNull List<BlockDTO> blocks) {
        Intrinsics.checkNotNullParameter(createdAt, "createdAt");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        return new MessageModelDTO(localId, createdAt, updatedAt, isRead, layout, isMine, author, status, contextMenu, trackingInfo, updateStatusLabel, blocks);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof MessageModelDTO)) {
            return false;
        }
        MessageModelDTO messageModelDTO = (MessageModelDTO) other;
        return Intrinsics.d(this.localId, messageModelDTO.localId) && Intrinsics.d(this.createdAt, messageModelDTO.createdAt) && Intrinsics.d(this.updatedAt, messageModelDTO.updatedAt) && Intrinsics.d(this.isRead, messageModelDTO.isRead) && this.layout == messageModelDTO.layout && this.isMine == messageModelDTO.isMine && Intrinsics.d(this.author, messageModelDTO.author) && this.status == messageModelDTO.status && Intrinsics.d(this.contextMenu, messageModelDTO.contextMenu) && Intrinsics.d(this.trackingInfo, messageModelDTO.trackingInfo) && Intrinsics.d(this.updateStatusLabel, messageModelDTO.updateStatusLabel) && Intrinsics.d(this.blocks, messageModelDTO.blocks);
    }

    public final AuthorDTO getAuthor() {
        return this.author;
    }

    @Override // ru.ozon.android.messenger.framework.data.remote.models.items.a
    @NotNull
    public List<BlockDTO> getBlocks() {
        return this.blocks;
    }

    public final ContextMenuDTO getContextMenu() {
        return this.contextMenu;
    }

    @NotNull
    public final DateTime getCreatedAt() {
        return this.createdAt;
    }

    public final a getLayout() {
        return this.layout;
    }

    public final String getLocalId() {
        return this.localId;
    }

    public final b getStatus() {
        return this.status;
    }

    public final Map<String, MessengerTrackingInfo> getTrackingInfo() {
        return this.trackingInfo;
    }

    public final String getUpdateStatusLabel() {
        return this.updateStatusLabel;
    }

    public final DateTime getUpdatedAt() {
        return this.updatedAt;
    }

    public int hashCode() {
        String str = this.localId;
        int a11 = GR.b.a(this.createdAt, (str == null ? 0 : str.hashCode()) * 31, 31);
        DateTime dateTime = this.updatedAt;
        int hashCode = (a11 + (dateTime == null ? 0 : dateTime.hashCode())) * 31;
        Boolean bool = this.isRead;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        a aVar = this.layout;
        int a12 = C3532b.a((hashCode2 + (aVar == null ? 0 : aVar.hashCode())) * 31, 31, this.isMine);
        AuthorDTO authorDTO = this.author;
        int hashCode3 = (a12 + (authorDTO == null ? 0 : authorDTO.hashCode())) * 31;
        b bVar = this.status;
        int hashCode4 = (hashCode3 + (bVar == null ? 0 : bVar.hashCode())) * 31;
        ContextMenuDTO contextMenuDTO = this.contextMenu;
        int hashCode5 = (hashCode4 + (contextMenuDTO == null ? 0 : contextMenuDTO.hashCode())) * 31;
        Map<String, MessengerTrackingInfo> map = this.trackingInfo;
        int hashCode6 = (hashCode5 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.updateStatusLabel;
        return this.blocks.hashCode() + ((hashCode6 + (str2 != null ? str2.hashCode() : 0)) * 31);
    }

    public final boolean isMine() {
        return this.isMine;
    }

    public final Boolean isRead() {
        return this.isRead;
    }

    @NotNull
    public String toString() {
        return "MessageModelDTO(localId=" + this.localId + ", createdAt=" + this.createdAt + ", updatedAt=" + this.updatedAt + ", isRead=" + this.isRead + ", layout=" + this.layout + ", isMine=" + this.isMine + ", author=" + this.author + ", status=" + this.status + ", contextMenu=" + this.contextMenu + ", trackingInfo=" + this.trackingInfo + ", updateStatusLabel=" + this.updateStatusLabel + ", blocks=" + this.blocks + ")";
    }
}
