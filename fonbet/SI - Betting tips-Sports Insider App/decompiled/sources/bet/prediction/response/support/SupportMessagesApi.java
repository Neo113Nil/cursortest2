package bet.prediction.response.support;

import b4.k;
import b4.l;
import com.sports.insider.data.repository.room.live.LiveTable;
import com.sports.insider.data.repository.room.metric.EventsTable;
import io.sentry.config.a;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.SourceDebugExtension;
import o9.b;
import oi.s0;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
@Metadata(d1 = {"\u0000@\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000b\n\u0000\n\u0002\u0018\u0002\n\u0002\b\r\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u000b\n\u0002\u0018\u0002\n\u0002\b\u0006\b\u0080\b\u0018\u00002\u00020\u00012\u00020\u00022\u000e\u0012\u0004\u0012\u00020\u0000\u0012\u0004\u0012\u00020\u00010\u0003:\u0001+B+\u0012\u000e\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\b\u0010\n\u001a\u0004\u0018\u00010\t¢\u0006\u0004\b\u000b\u0010\fJ\u000f\u0010\r\u001a\u00020\u0001H\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u0018\u0010\u000f\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J:\u0010\u0015\u001a\u00020\u00002\u0010\b\u0002\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00042\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\tHÆ\u0001¢\u0006\u0004\b\u0015\u0010\u0016J\u0010\u0010\u0018\u001a\u00020\u0017HÖ\u0001¢\u0006\u0004\b\u0018\u0010\u0019J\u0010\u0010\u001b\u001a\u00020\u001aHÖ\u0001¢\u0006\u0004\b\u001b\u0010\u001cJ\u001a\u0010\u001e\u001a\u00020\u00072\b\u0010\u001d\u001a\u0004\u0018\u00010\u0003HÖ\u0003¢\u0006\u0004\b\u001e\u0010\u001fR\"\u0010\u0006\u001a\n\u0012\u0004\u0012\u00020\u0005\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010 \u001a\u0004\b!\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\b\u0010\"\u001a\u0004\b#\u0010\u0012R\u001c\u0010\n\u001a\u0004\u0018\u00010\t8\u0016X\u0097\u0004¢\u0006\f\n\u0004\b\n\u0010$\u001a\u0004\b%\u0010\u0014R\u001c\u0010(\u001a\n\u0012\u0004\u0012\u00020&\u0018\u00010\u00048VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b'\u0010\u0010R\u0014\u0010*\u001a\u00020\u001a8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b)\u0010\u001c¨\u0006,"}, d2 = {"Lbet/prediction/response/support/SupportMessagesApi;", "Lb4/l;", "Lio/sentry/config/a;", "", "", "Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;", "listMsg", "", "activeChat", "Lv3/b;", "httpException", "<init>", "(Ljava/util/List;Ljava/lang/Boolean;Lv3/b;)V", "map", "()Lb4/l;", "component1", "()Ljava/util/List;", "component2", "()Ljava/lang/Boolean;", "component3", "()Lv3/b;", "copy", "(Ljava/util/List;Ljava/lang/Boolean;Lv3/b;)Lbet/prediction/response/support/SupportMessagesApi;", "", "toString", "()Ljava/lang/String;", "", "hashCode", "()I", "other", "equals", "(Ljava/lang/Object;)Z", "Ljava/util/List;", "getListMsg", "Ljava/lang/Boolean;", "getActiveChat", "Lv3/b;", "getHttpException", "Lb4/k;", "getMessages", "messages", "getStatusCode", "statusCode", "SupportMessage", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nSupportMessagesApi.kt\nKotlin\n*S Kotlin\n*F\n+ 1 SupportMessagesApi.kt\nbet/prediction/response/support/SupportMessagesApi\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n+ 3 fake.kt\nkotlin/jvm/internal/FakeKt\n*L\n1#1,60:1\n1617#2,9:61\n1869#2:70\n1870#2:72\n1626#2:73\n1#3:71\n*S KotlinDebug\n*F\n+ 1 SupportMessagesApi.kt\nbet/prediction/response/support/SupportMessagesApi\n*L\n42#1:61,9\n42#1:70\n42#1:72\n42#1:73\n42#1:71\n*E\n"})
/* loaded from: classes.dex */
public final /* data */ class SupportMessagesApi extends a implements l {

    @b("is_closed")
    @Nullable
    private final Boolean activeChat;

    @Nullable
    private final v3.b httpException;

    @b("data")
    @Nullable
    private final List<SupportMessage> listMsg;

    public SupportMessagesApi(@Nullable List<SupportMessage> list, @Nullable Boolean bool, @Nullable v3.b bVar) {
        this.listMsg = list;
        this.activeChat = bool;
        this.httpException = bVar;
    }

    /* JADX WARN: Multi-variable type inference failed */
    public static /* synthetic */ SupportMessagesApi copy$default(SupportMessagesApi supportMessagesApi, List list, Boolean bool, v3.b bVar, int i5, Object obj) {
        if ((i5 & 1) != 0) {
            list = supportMessagesApi.listMsg;
        }
        if ((i5 & 2) != 0) {
            bool = supportMessagesApi.activeChat;
        }
        if ((i5 & 4) != 0) {
            bVar = supportMessagesApi.httpException;
        }
        return supportMessagesApi.copy(list, bool, bVar);
    }

    @Nullable
    public final List<SupportMessage> component1() {
        return this.listMsg;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final Boolean getActiveChat() {
        return this.activeChat;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final v3.b getHttpException() {
        return this.httpException;
    }

    @NotNull
    public final SupportMessagesApi copy(@Nullable List<SupportMessage> listMsg, @Nullable Boolean activeChat, @Nullable v3.b httpException) {
        return new SupportMessagesApi(listMsg, activeChat, httpException);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof SupportMessagesApi)) {
            return false;
        }
        SupportMessagesApi supportMessagesApi = (SupportMessagesApi) other;
        return Intrinsics.areEqual(this.listMsg, supportMessagesApi.listMsg) && Intrinsics.areEqual(this.activeChat, supportMessagesApi.activeChat) && Intrinsics.areEqual(this.httpException, supportMessagesApi.httpException);
    }

    @Override // b4.l
    @Nullable
    public Boolean getActiveChat() {
        return this.activeChat;
    }

    @Override // v3.e
    @Nullable
    public v3.b getHttpException() {
        return this.httpException;
    }

    @Nullable
    public final List<SupportMessage> getListMsg() {
        return this.listMsg;
    }

    @Override // b4.l
    @Nullable
    public List<k> getMessages() {
        k kVar;
        List<SupportMessage> list = this.listMsg;
        if (list == null) {
            return null;
        }
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = list.iterator();
        while (it.hasNext()) {
            try {
                kVar = SupportMessage.INSTANCE.mapper((SupportMessage) it.next());
            } catch (Exception unused) {
                kVar = null;
            }
            if (kVar != null) {
                arrayList.add(kVar);
            }
        }
        return arrayList;
    }

    @Override // v3.e
    public int getStatusCode() {
        s0 response;
        v3.b httpException = getHttpException();
        if (httpException == null || (response = httpException.getResponse()) == null) {
            return 200;
        }
        return response.f21334a.f10276d;
    }

    public int hashCode() {
        List<SupportMessage> list = this.listMsg;
        int hashCode = (list == null ? 0 : list.hashCode()) * 31;
        Boolean bool = this.activeChat;
        int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
        v3.b bVar = this.httpException;
        return hashCode2 + (bVar != null ? bVar.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "SupportMessagesApi(listMsg=" + this.listMsg + ", activeChat=" + this.activeChat + ", httpException=" + this.httpException + ')';
    }

    @NotNull
    /* renamed from: map, reason: merged with bridge method [inline-methods] */
    public l m90map() {
        return new l() { // from class: bet.prediction.response.support.SupportMessagesApi$map$1
            private final Boolean activeChat;
            private final v3.b httpException;
            private final List<k> messages;

            {
                this.activeChat = SupportMessagesApi.this.getActiveChat() != null ? Boolean.valueOf(!r0.booleanValue()) : null;
                this.messages = SupportMessagesApi.this.getMessages();
                this.httpException = SupportMessagesApi.this.getHttpException();
            }

            @Override // b4.l
            public Boolean getActiveChat() {
                return this.activeChat;
            }

            @Override // v3.e
            public v3.b getHttpException() {
                return this.httpException;
            }

            @Override // b4.l
            public List<k> getMessages() {
                return this.messages;
            }

            @Override // v3.e
            public int getStatusCode() {
                return SupportMessagesApi.this.getStatusCode();
            }
        };
    }

    /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u001b\b\u0086\b\u0018\u0000 %2\u00020\u0001:\u0001%BI\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0005\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0005\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000b¢\u0006\u0004\b\f\u0010\rJ\t\u0010\u0018\u001a\u00020\u0003HÆ\u0003J\t\u0010\u0019\u001a\u00020\u0005HÆ\u0003J\t\u0010\u001a\u001a\u00020\u0005HÆ\u0003J\u000b\u0010\u001b\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001c\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u000b\u0010\u001d\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\u0010\u0010\u001e\u001a\u0004\u0018\u00010\u000bHÆ\u0003¢\u0006\u0002\u0010\u0016J\\\u0010\u001f\u001a\u00020\u00002\b\b\u0002\u0010\u0002\u001a\u00020\u00032\b\b\u0002\u0010\u0004\u001a\u00020\u00052\b\b\u0002\u0010\u0006\u001a\u00020\u00052\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\n\u001a\u0004\u0018\u00010\u000bHÆ\u0001¢\u0006\u0002\u0010 J\u0013\u0010!\u001a\u00020\u000b2\b\u0010\"\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010#\u001a\u00020\u0003HÖ\u0001J\t\u0010$\u001a\u00020\u0005HÖ\u0001R\u0016\u0010\u0002\u001a\u00020\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0004\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0016\u0010\u0006\u001a\u00020\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0011R\u0018\u0010\u0007\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u0011R\u0018\u0010\b\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0014\u0010\u0011R\u0018\u0010\t\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0015\u0010\u0011R\u001a\u0010\n\u001a\u0004\u0018\u00010\u000b8\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u0017\u001a\u0004\b\n\u0010\u0016¨\u0006&"}, d2 = {"Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;", "", "messageId", "", "createAt", "", "operator", LiveTable.messageColumn, EventsTable.contentColumn, "mime", "isPurchaseAttached", "", "<init>", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)V", "getMessageId", "()I", "getCreateAt", "()Ljava/lang/String;", "getOperator", "getMessage", "getContent", "getMime", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "component1", "component2", "component3", "component4", "component5", "component6", "component7", "copy", "(ILjava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/Boolean;)Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;", "equals", "other", "hashCode", "toString", "Companion", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
    public static final /* data */ class SupportMessage {

        /* renamed from: Companion, reason: from kotlin metadata */
        @NotNull
        public static final Companion INSTANCE = new Companion(null);

        @b(EventsTable.contentColumn)
        @Nullable
        private final String content;

        @b("created_at")
        @NotNull
        private final String createAt;

        @b("is_purchase_attached")
        @Nullable
        private final Boolean isPurchaseAttached;

        @b(LiveTable.messageColumn)
        @Nullable
        private final String message;

        @b("message_id")
        private final int messageId;

        @b("mime")
        @Nullable
        private final String mime;

        @b("operator")
        @NotNull
        private final String operator;

        /* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
        @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\b\u0086\u0003\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u0015\u0010\u0006\u001a\u0004\u0018\u00010\u0005*\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007¨\u0006\b"}, d2 = {"Lbet/prediction/response/support/SupportMessagesApi$SupportMessage$Companion;", "", "<init>", "()V", "Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;", "Lb4/k;", "mapper", "(Lbet/prediction/response/support/SupportMessagesApi$SupportMessage;)Lb4/k;", "Betting-123_googleProductionRelease"}, k = 1, mv = {2, 2, 0}, xi = 48)
        public static final class Companion {
            public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
                this();
            }

            @Nullable
            public final k mapper(@Nullable final SupportMessage supportMessage) {
                if (supportMessage == null) {
                    return null;
                }
                return new k(supportMessage) { // from class: bet.prediction.response.support.SupportMessagesApi$SupportMessage$Companion$mapper$1
                    private final String content;
                    private final String createAt;
                    private final Boolean isPurchaseAttached;
                    private final String message;
                    private final int messageId;
                    private final String mime;
                    private final String operator;

                    {
                        this.messageId = supportMessage.getMessageId();
                        this.createAt = supportMessage.getCreateAt();
                        this.operator = supportMessage.getOperator();
                        this.message = supportMessage.getMessage();
                        this.content = supportMessage.getContent();
                        this.mime = supportMessage.getMime();
                        this.isPurchaseAttached = supportMessage.isPurchaseAttached();
                    }

                    @Override // b4.k
                    public String getContent() {
                        return this.content;
                    }

                    @Override // b4.k
                    public String getCreateAt() {
                        return this.createAt;
                    }

                    @Override // b4.k
                    public String getMessage() {
                        return this.message;
                    }

                    @Override // b4.k
                    public int getMessageId() {
                        return this.messageId;
                    }

                    @Override // b4.k
                    public String getMime() {
                        return this.mime;
                    }

                    @Override // b4.k
                    public String getOperator() {
                        return this.operator;
                    }

                    @Override // b4.k
                    /* renamed from: isPurchaseAttached, reason: from getter */
                    public Boolean getIsPurchaseAttached() {
                        return this.isPurchaseAttached;
                    }
                };
            }

            private Companion() {
            }
        }

        public SupportMessage(int i5, @NotNull String createAt, @NotNull String operator, @Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable Boolean bool) {
            Intrinsics.checkNotNullParameter(createAt, "createAt");
            Intrinsics.checkNotNullParameter(operator, "operator");
            this.messageId = i5;
            this.createAt = createAt;
            this.operator = operator;
            this.message = str;
            this.content = str2;
            this.mime = str3;
            this.isPurchaseAttached = bool;
        }

        public static /* synthetic */ SupportMessage copy$default(SupportMessage supportMessage, int i5, String str, String str2, String str3, String str4, String str5, Boolean bool, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                i5 = supportMessage.messageId;
            }
            if ((i10 & 2) != 0) {
                str = supportMessage.createAt;
            }
            if ((i10 & 4) != 0) {
                str2 = supportMessage.operator;
            }
            if ((i10 & 8) != 0) {
                str3 = supportMessage.message;
            }
            if ((i10 & 16) != 0) {
                str4 = supportMessage.content;
            }
            if ((i10 & 32) != 0) {
                str5 = supportMessage.mime;
            }
            if ((i10 & 64) != 0) {
                bool = supportMessage.isPurchaseAttached;
            }
            String str6 = str5;
            Boolean bool2 = bool;
            String str7 = str4;
            String str8 = str2;
            return supportMessage.copy(i5, str, str8, str3, str7, str6, bool2);
        }

        /* renamed from: component1, reason: from getter */
        public final int getMessageId() {
            return this.messageId;
        }

        @NotNull
        /* renamed from: component2, reason: from getter */
        public final String getCreateAt() {
            return this.createAt;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getOperator() {
            return this.operator;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getMessage() {
            return this.message;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getContent() {
            return this.content;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final String getMime() {
            return this.mime;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final Boolean getIsPurchaseAttached() {
            return this.isPurchaseAttached;
        }

        @NotNull
        public final SupportMessage copy(int messageId, @NotNull String createAt, @NotNull String operator, @Nullable String message, @Nullable String content, @Nullable String mime, @Nullable Boolean isPurchaseAttached) {
            Intrinsics.checkNotNullParameter(createAt, "createAt");
            Intrinsics.checkNotNullParameter(operator, "operator");
            return new SupportMessage(messageId, createAt, operator, message, content, mime, isPurchaseAttached);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof SupportMessage)) {
                return false;
            }
            SupportMessage supportMessage = (SupportMessage) other;
            return this.messageId == supportMessage.messageId && Intrinsics.areEqual(this.createAt, supportMessage.createAt) && Intrinsics.areEqual(this.operator, supportMessage.operator) && Intrinsics.areEqual(this.message, supportMessage.message) && Intrinsics.areEqual(this.content, supportMessage.content) && Intrinsics.areEqual(this.mime, supportMessage.mime) && Intrinsics.areEqual(this.isPurchaseAttached, supportMessage.isPurchaseAttached);
        }

        @Nullable
        public final String getContent() {
            return this.content;
        }

        @NotNull
        public final String getCreateAt() {
            return this.createAt;
        }

        @Nullable
        public final String getMessage() {
            return this.message;
        }

        public final int getMessageId() {
            return this.messageId;
        }

        @Nullable
        public final String getMime() {
            return this.mime;
        }

        @NotNull
        public final String getOperator() {
            return this.operator;
        }

        public int hashCode() {
            int j = r4.k.j(r4.k.j(this.messageId * 31, 31, this.createAt), 31, this.operator);
            String str = this.message;
            int hashCode = (j + (str == null ? 0 : str.hashCode())) * 31;
            String str2 = this.content;
            int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.mime;
            int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
            Boolean bool = this.isPurchaseAttached;
            return hashCode3 + (bool != null ? bool.hashCode() : 0);
        }

        @Nullable
        public final Boolean isPurchaseAttached() {
            return this.isPurchaseAttached;
        }

        @NotNull
        public String toString() {
            return "SupportMessage(messageId=" + this.messageId + ", createAt=" + this.createAt + ", operator=" + this.operator + ", message=" + this.message + ", content=" + this.content + ", mime=" + this.mime + ", isPurchaseAttached=" + this.isPurchaseAttached + ')';
        }

        public /* synthetic */ SupportMessage(int i5, String str, String str2, String str3, String str4, String str5, Boolean bool, int i10, DefaultConstructorMarker defaultConstructorMarker) {
            this(i5, str, str2, str3, str4, str5, (i10 & 64) != 0 ? Boolean.FALSE : bool);
        }
    }
}
