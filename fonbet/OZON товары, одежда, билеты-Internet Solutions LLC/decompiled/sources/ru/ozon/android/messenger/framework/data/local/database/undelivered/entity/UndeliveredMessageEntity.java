package ru.ozon.android.messenger.framework.data.local.database.undelivered.entity;

import G.g;
import N3.C3660k;
import Pk0.c;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.input.CustomBlockDTO;
import ru.ozon.android.messenger.blocks.messagefile.FileDTO;
import ru.ozon.android.messenger.blocks.messageimage.ImageDTO;
import ru.ozon.android.messenger.framework.data.remote.models.blocks.BlockDTO;

/* loaded from: classes10.dex */
public final class UndeliveredMessageEntity {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final String f87574a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f87575b;

    /* renamed from: c, reason: collision with root package name */
    private final long f87576c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final UndeliveredMessage f87577d;

    public UndeliveredMessageEntity(@NotNull String localId, @NotNull String chatId, long j11, @NotNull UndeliveredMessage undeliveredMessage) {
        Intrinsics.checkNotNullParameter(localId, "localId");
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(undeliveredMessage, "undeliveredMessage");
        this.f87574a = localId;
        this.f87575b = chatId;
        this.f87576c = j11;
        this.f87577d = undeliveredMessage;
    }

    @NotNull
    public final String a() {
        return this.f87575b;
    }

    @NotNull
    public final String b() {
        return this.f87574a;
    }

    @NotNull
    public final UndeliveredMessage c() {
        return this.f87577d;
    }

    public final long d() {
        return this.f87576c;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof UndeliveredMessageEntity)) {
            return false;
        }
        UndeliveredMessageEntity undeliveredMessageEntity = (UndeliveredMessageEntity) obj;
        return Intrinsics.d(this.f87574a, undeliveredMessageEntity.f87574a) && Intrinsics.d(this.f87575b, undeliveredMessageEntity.f87575b) && this.f87576c == undeliveredMessageEntity.f87576c && Intrinsics.d(this.f87577d, undeliveredMessageEntity.f87577d);
    }

    public final int hashCode() {
        return this.f87577d.hashCode() + c.a(g.a(this.f87574a.hashCode() * 31, 31, this.f87575b), 31, this.f87576c);
    }

    @NotNull
    public final String toString() {
        return "UndeliveredMessageEntity(localId=" + this.f87574a + ", chatId=" + this.f87575b + ", updatedAt=" + this.f87576c + ", undeliveredMessage=" + this.f87577d + ")";
    }

    public interface UndeliveredMessage {
        BlockDTO getLocalMessageBlock();

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B3\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\b¢\u0006\u0004\b\t\u0010\nJ\t\u0010\u0012\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\bHÆ\u0003J7\u0010\u0016\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u001aHÖ\u0003J\t\u0010\u001b\u001a\u00020\u001cHÖ\u0001J\t\u0010\u001d\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0016\u0010\u0006\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\fR\u0016\u0010\u0007\u001a\u0004\u0018\u00010\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011¨\u0006\u001e"}, d2 = {"Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$Text;", "Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage;", "messageText", "", "customBlockDTO", "Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;", "replyToMessageId", "localMessageBlock", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "<init>", "(Ljava/lang/String;Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;)V", "getMessageText", "()Ljava/lang/String;", "getCustomBlockDTO", "()Lru/ozon/android/messenger/blocks/input/CustomBlockDTO;", "getReplyToMessageId", "getLocalMessageBlock", "()Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Text implements UndeliveredMessage {
            public static final int $stable = 8;
            private final CustomBlockDTO customBlockDTO;
            private final BlockDTO localMessageBlock;

            @NotNull
            private final String messageText;
            private final String replyToMessageId;

            public Text(@NotNull String messageText, CustomBlockDTO customBlockDTO, String str, BlockDTO blockDTO) {
                Intrinsics.checkNotNullParameter(messageText, "messageText");
                this.messageText = messageText;
                this.customBlockDTO = customBlockDTO;
                this.replyToMessageId = str;
                this.localMessageBlock = blockDTO;
            }

            public static /* synthetic */ Text copy$default(Text text, String str, CustomBlockDTO customBlockDTO, String str2, BlockDTO blockDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = text.messageText;
                }
                if ((i11 & 2) != 0) {
                    customBlockDTO = text.customBlockDTO;
                }
                if ((i11 & 4) != 0) {
                    str2 = text.replyToMessageId;
                }
                if ((i11 & 8) != 0) {
                    blockDTO = text.localMessageBlock;
                }
                return text.copy(str, customBlockDTO, str2, blockDTO);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getMessageText() {
                return this.messageText;
            }

            /* renamed from: component2, reason: from getter */
            public final CustomBlockDTO getCustomBlockDTO() {
                return this.customBlockDTO;
            }

            /* renamed from: component3, reason: from getter */
            public final String getReplyToMessageId() {
                return this.replyToMessageId;
            }

            /* renamed from: component4, reason: from getter */
            public final BlockDTO getLocalMessageBlock() {
                return this.localMessageBlock;
            }

            @NotNull
            public final Text copy(@NotNull String messageText, CustomBlockDTO customBlockDTO, String replyToMessageId, BlockDTO localMessageBlock) {
                Intrinsics.checkNotNullParameter(messageText, "messageText");
                return new Text(messageText, customBlockDTO, replyToMessageId, localMessageBlock);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Text)) {
                    return false;
                }
                Text text = (Text) other;
                return Intrinsics.d(this.messageText, text.messageText) && Intrinsics.d(this.customBlockDTO, text.customBlockDTO) && Intrinsics.d(this.replyToMessageId, text.replyToMessageId) && Intrinsics.d(this.localMessageBlock, text.localMessageBlock);
            }

            public final CustomBlockDTO getCustomBlockDTO() {
                return this.customBlockDTO;
            }

            @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity.UndeliveredMessage
            public BlockDTO getLocalMessageBlock() {
                return this.localMessageBlock;
            }

            @NotNull
            public final String getMessageText() {
                return this.messageText;
            }

            public String getReplyToMessageId() {
                return this.replyToMessageId;
            }

            public int hashCode() {
                int hashCode = this.messageText.hashCode() * 31;
                CustomBlockDTO customBlockDTO = this.customBlockDTO;
                int hashCode2 = (hashCode + (customBlockDTO == null ? 0 : customBlockDTO.hashCode())) * 31;
                String str = this.replyToMessageId;
                int hashCode3 = (hashCode2 + (str == null ? 0 : str.hashCode())) * 31;
                BlockDTO blockDTO = this.localMessageBlock;
                return hashCode3 + (blockDTO != null ? blockDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                return "Text(messageText=" + this.messageText + ", customBlockDTO=" + this.customBlockDTO + ", replyToMessageId=" + this.replyToMessageId + ", localMessageBlock=" + this.localMessageBlock + ")";
            }

            public /* synthetic */ Text(String str, CustomBlockDTO customBlockDTO, String str2, BlockDTO blockDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? null : customBlockDTO, (i11 & 4) != 0 ? null : str2, (i11 & 8) != 0 ? null : blockDTO);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$File;", "Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage;", "localUriString", "", "remoteUrlString", "fileDTO", "Lru/ozon/android/messenger/blocks/messagefile/FileDTO;", "replyToMessageId", "localMessageBlock", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/messenger/blocks/messagefile/FileDTO;Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;)V", "getLocalUriString", "()Ljava/lang/String;", "getRemoteUrlString", "getFileDTO", "()Lru/ozon/android/messenger/blocks/messagefile/FileDTO;", "getReplyToMessageId", "getLocalMessageBlock", "()Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class File implements UndeliveredMessage {
            public static final int $stable = 0;

            @NotNull
            private final FileDTO fileDTO;
            private final BlockDTO localMessageBlock;

            @NotNull
            private final String localUriString;
            private final String remoteUrlString;
            private final String replyToMessageId;

            public File(@NotNull String localUriString, String str, @NotNull FileDTO fileDTO, String str2, BlockDTO blockDTO) {
                Intrinsics.checkNotNullParameter(localUriString, "localUriString");
                Intrinsics.checkNotNullParameter(fileDTO, "fileDTO");
                this.localUriString = localUriString;
                this.remoteUrlString = str;
                this.fileDTO = fileDTO;
                this.replyToMessageId = str2;
                this.localMessageBlock = blockDTO;
            }

            public static /* synthetic */ File copy$default(File file, String str, String str2, FileDTO fileDTO, String str3, BlockDTO blockDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = file.localUriString;
                }
                if ((i11 & 2) != 0) {
                    str2 = file.remoteUrlString;
                }
                if ((i11 & 4) != 0) {
                    fileDTO = file.fileDTO;
                }
                if ((i11 & 8) != 0) {
                    str3 = file.replyToMessageId;
                }
                if ((i11 & 16) != 0) {
                    blockDTO = file.localMessageBlock;
                }
                BlockDTO blockDTO2 = blockDTO;
                FileDTO fileDTO2 = fileDTO;
                return file.copy(str, str2, fileDTO2, str3, blockDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLocalUriString() {
                return this.localUriString;
            }

            /* renamed from: component2, reason: from getter */
            public final String getRemoteUrlString() {
                return this.remoteUrlString;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final FileDTO getFileDTO() {
                return this.fileDTO;
            }

            /* renamed from: component4, reason: from getter */
            public final String getReplyToMessageId() {
                return this.replyToMessageId;
            }

            /* renamed from: component5, reason: from getter */
            public final BlockDTO getLocalMessageBlock() {
                return this.localMessageBlock;
            }

            @NotNull
            public final File copy(@NotNull String localUriString, String remoteUrlString, @NotNull FileDTO fileDTO, String replyToMessageId, BlockDTO localMessageBlock) {
                Intrinsics.checkNotNullParameter(localUriString, "localUriString");
                Intrinsics.checkNotNullParameter(fileDTO, "fileDTO");
                return new File(localUriString, remoteUrlString, fileDTO, replyToMessageId, localMessageBlock);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof File)) {
                    return false;
                }
                File file = (File) other;
                return Intrinsics.d(this.localUriString, file.localUriString) && Intrinsics.d(this.remoteUrlString, file.remoteUrlString) && Intrinsics.d(this.fileDTO, file.fileDTO) && Intrinsics.d(this.replyToMessageId, file.replyToMessageId) && Intrinsics.d(this.localMessageBlock, file.localMessageBlock);
            }

            @NotNull
            public final FileDTO getFileDTO() {
                return this.fileDTO;
            }

            @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity.UndeliveredMessage
            public BlockDTO getLocalMessageBlock() {
                return this.localMessageBlock;
            }

            @NotNull
            public final String getLocalUriString() {
                return this.localUriString;
            }

            public final String getRemoteUrlString() {
                return this.remoteUrlString;
            }

            public String getReplyToMessageId() {
                return this.replyToMessageId;
            }

            public int hashCode() {
                int hashCode = this.localUriString.hashCode() * 31;
                String str = this.remoteUrlString;
                int hashCode2 = (this.fileDTO.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                String str2 = this.replyToMessageId;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                BlockDTO blockDTO = this.localMessageBlock;
                return hashCode3 + (blockDTO != null ? blockDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.localUriString;
                String str2 = this.remoteUrlString;
                FileDTO fileDTO = this.fileDTO;
                String str3 = this.replyToMessageId;
                BlockDTO blockDTO = this.localMessageBlock;
                StringBuilder d11 = C3660k.d("File(localUriString=", str, ", remoteUrlString=", str2, ", fileDTO=");
                d11.append(fileDTO);
                d11.append(", replyToMessageId=");
                d11.append(str3);
                d11.append(", localMessageBlock=");
                d11.append(blockDTO);
                d11.append(")");
                return d11.toString();
            }

            public /* synthetic */ File(String str, String str2, FileDTO fileDTO, String str3, BlockDTO blockDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? null : str2, fileDTO, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : blockDTO);
            }
        }

        @j(generateAdapter = true)
        @Metadata(d1 = {"\u00006\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B;\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0014\u001a\u00020\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0017\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0018\u001a\u0004\u0018\u00010\tHÆ\u0003JA\u0010\u0019\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0002\u0010\u0005\u001a\u00020\u00062\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\tHÆ\u0001J\u0013\u0010\u001a\u001a\u00020\u001b2\b\u0010\u001c\u001a\u0004\u0018\u00010\u001dHÖ\u0003J\t\u0010\u001e\u001a\u00020\u001fHÖ\u0001J\t\u0010 \u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\rR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010R\u0016\u0010\u0007\u001a\u0004\u0018\u00010\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0011\u0010\rR\u0016\u0010\b\u001a\u0004\u0018\u00010\tX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage$Image;", "Lru/ozon/android/messenger/framework/data/local/database/undelivered/entity/UndeliveredMessageEntity$UndeliveredMessage;", "localUriString", "", "remoteUrlString", "imageDTO", "Lru/ozon/android/messenger/blocks/messageimage/ImageDTO;", "replyToMessageId", "localMessageBlock", "Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/android/messenger/blocks/messageimage/ImageDTO;Ljava/lang/String;Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;)V", "getLocalUriString", "()Ljava/lang/String;", "getRemoteUrlString", "getImageDTO", "()Lru/ozon/android/messenger/blocks/messageimage/ImageDTO;", "getReplyToMessageId", "getLocalMessageBlock", "()Lru/ozon/android/messenger/framework/data/remote/models/blocks/BlockDTO;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Image implements UndeliveredMessage {
            public static final int $stable = 0;

            @NotNull
            private final ImageDTO imageDTO;
            private final BlockDTO localMessageBlock;

            @NotNull
            private final String localUriString;
            private final String remoteUrlString;
            private final String replyToMessageId;

            public Image(@NotNull String localUriString, String str, @NotNull ImageDTO imageDTO, String str2, BlockDTO blockDTO) {
                Intrinsics.checkNotNullParameter(localUriString, "localUriString");
                Intrinsics.checkNotNullParameter(imageDTO, "imageDTO");
                this.localUriString = localUriString;
                this.remoteUrlString = str;
                this.imageDTO = imageDTO;
                this.replyToMessageId = str2;
                this.localMessageBlock = blockDTO;
            }

            public static /* synthetic */ Image copy$default(Image image, String str, String str2, ImageDTO imageDTO, String str3, BlockDTO blockDTO, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = image.localUriString;
                }
                if ((i11 & 2) != 0) {
                    str2 = image.remoteUrlString;
                }
                if ((i11 & 4) != 0) {
                    imageDTO = image.imageDTO;
                }
                if ((i11 & 8) != 0) {
                    str3 = image.replyToMessageId;
                }
                if ((i11 & 16) != 0) {
                    blockDTO = image.localMessageBlock;
                }
                BlockDTO blockDTO2 = blockDTO;
                ImageDTO imageDTO2 = imageDTO;
                return image.copy(str, str2, imageDTO2, str3, blockDTO2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getLocalUriString() {
                return this.localUriString;
            }

            /* renamed from: component2, reason: from getter */
            public final String getRemoteUrlString() {
                return this.remoteUrlString;
            }

            @NotNull
            /* renamed from: component3, reason: from getter */
            public final ImageDTO getImageDTO() {
                return this.imageDTO;
            }

            /* renamed from: component4, reason: from getter */
            public final String getReplyToMessageId() {
                return this.replyToMessageId;
            }

            /* renamed from: component5, reason: from getter */
            public final BlockDTO getLocalMessageBlock() {
                return this.localMessageBlock;
            }

            @NotNull
            public final Image copy(@NotNull String localUriString, String remoteUrlString, @NotNull ImageDTO imageDTO, String replyToMessageId, BlockDTO localMessageBlock) {
                Intrinsics.checkNotNullParameter(localUriString, "localUriString");
                Intrinsics.checkNotNullParameter(imageDTO, "imageDTO");
                return new Image(localUriString, remoteUrlString, imageDTO, replyToMessageId, localMessageBlock);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Image)) {
                    return false;
                }
                Image image = (Image) other;
                return Intrinsics.d(this.localUriString, image.localUriString) && Intrinsics.d(this.remoteUrlString, image.remoteUrlString) && Intrinsics.d(this.imageDTO, image.imageDTO) && Intrinsics.d(this.replyToMessageId, image.replyToMessageId) && Intrinsics.d(this.localMessageBlock, image.localMessageBlock);
            }

            @NotNull
            public final ImageDTO getImageDTO() {
                return this.imageDTO;
            }

            @Override // ru.ozon.android.messenger.framework.data.local.database.undelivered.entity.UndeliveredMessageEntity.UndeliveredMessage
            public BlockDTO getLocalMessageBlock() {
                return this.localMessageBlock;
            }

            @NotNull
            public final String getLocalUriString() {
                return this.localUriString;
            }

            public final String getRemoteUrlString() {
                return this.remoteUrlString;
            }

            public String getReplyToMessageId() {
                return this.replyToMessageId;
            }

            public int hashCode() {
                int hashCode = this.localUriString.hashCode() * 31;
                String str = this.remoteUrlString;
                int hashCode2 = (this.imageDTO.hashCode() + ((hashCode + (str == null ? 0 : str.hashCode())) * 31)) * 31;
                String str2 = this.replyToMessageId;
                int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
                BlockDTO blockDTO = this.localMessageBlock;
                return hashCode3 + (blockDTO != null ? blockDTO.hashCode() : 0);
            }

            @NotNull
            public String toString() {
                String str = this.localUriString;
                String str2 = this.remoteUrlString;
                ImageDTO imageDTO = this.imageDTO;
                String str3 = this.replyToMessageId;
                BlockDTO blockDTO = this.localMessageBlock;
                StringBuilder d11 = C3660k.d("Image(localUriString=", str, ", remoteUrlString=", str2, ", imageDTO=");
                d11.append(imageDTO);
                d11.append(", replyToMessageId=");
                d11.append(str3);
                d11.append(", localMessageBlock=");
                d11.append(blockDTO);
                d11.append(")");
                return d11.toString();
            }

            public /* synthetic */ Image(String str, String str2, ImageDTO imageDTO, String str3, BlockDTO blockDTO, int i11, DefaultConstructorMarker defaultConstructorMarker) {
                this(str, (i11 & 2) != 0 ? null : str2, imageDTO, (i11 & 8) != 0 ? null : str3, (i11 & 16) != 0 ? null : blockDTO);
            }
        }
    }
}
