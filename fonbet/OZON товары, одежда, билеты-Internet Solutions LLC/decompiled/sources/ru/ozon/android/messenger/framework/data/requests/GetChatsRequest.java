package ru.ozon.android.messenger.framework.data.requests;

import C.o0;
import java.util.LinkedHashMap;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class GetChatsRequest extends e {

    /* renamed from: c, reason: collision with root package name */
    private final Integer f88634c;

    /* renamed from: d, reason: collision with root package name */
    private final Integer f88635d;

    /* renamed from: e, reason: collision with root package name */
    private final Boolean f88636e;

    /* renamed from: f, reason: collision with root package name */
    private final Filter f88637f;

    /* renamed from: g, reason: collision with root package name */
    @NotNull
    private final LinkedHashMap f88638g;

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u000b\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B+\u0012\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\u0007\u0010\bJ\u000b\u0010\u000f\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0010\u0010\u0010\u001a\u0004\u0018\u00010\u0005HÆ\u0003¢\u0006\u0002\u0010\fJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J2\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00052\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0003HÆ\u0001¢\u0006\u0002\u0010\u0013J\u0013\u0010\u0014\u001a\u00020\u00052\b\u0010\u0015\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0016\u001a\u00020\u0017HÖ\u0001J\t\u0010\u0018\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0015\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\n\n\u0002\u0010\r\u001a\u0004\b\u000b\u0010\fR\u0013\u0010\u0006\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\n¨\u0006\u0019"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/GetChatsRequest$Filter;", "", "chatId", "", "onlyUnread", "", "chatType", "<init>", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)V", "getChatId", "()Ljava/lang/String;", "getOnlyUnread", "()Ljava/lang/Boolean;", "Ljava/lang/Boolean;", "getChatType", "component1", "component2", "component3", "copy", "(Ljava/lang/String;Ljava/lang/Boolean;Ljava/lang/String;)Lru/ozon/android/messenger/framework/data/requests/GetChatsRequest$Filter;", "equals", "other", "hashCode", "", "toString", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final /* data */ class Filter {
        public static final int $stable = 0;
        private final String chatId;
        private final String chatType;
        private final Boolean onlyUnread;

        public Filter() {
            this(null, null, null, 7, null);
        }

        public static /* synthetic */ Filter copy$default(Filter filter, String str, Boolean bool, String str2, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                str = filter.chatId;
            }
            if ((i11 & 2) != 0) {
                bool = filter.onlyUnread;
            }
            if ((i11 & 4) != 0) {
                str2 = filter.chatType;
            }
            return filter.copy(str, bool, str2);
        }

        /* renamed from: component1, reason: from getter */
        public final String getChatId() {
            return this.chatId;
        }

        /* renamed from: component2, reason: from getter */
        public final Boolean getOnlyUnread() {
            return this.onlyUnread;
        }

        /* renamed from: component3, reason: from getter */
        public final String getChatType() {
            return this.chatType;
        }

        @NotNull
        public final Filter copy(String chatId, Boolean onlyUnread, String chatType) {
            return new Filter(chatId, onlyUnread, chatType);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Filter)) {
                return false;
            }
            Filter filter = (Filter) other;
            return Intrinsics.d(this.chatId, filter.chatId) && Intrinsics.d(this.onlyUnread, filter.onlyUnread) && Intrinsics.d(this.chatType, filter.chatType);
        }

        public final String getChatId() {
            return this.chatId;
        }

        public final String getChatType() {
            return this.chatType;
        }

        public final Boolean getOnlyUnread() {
            return this.onlyUnread;
        }

        public int hashCode() {
            String str = this.chatId;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Boolean bool = this.onlyUnread;
            int hashCode2 = (hashCode + (bool == null ? 0 : bool.hashCode())) * 31;
            String str2 = this.chatType;
            return hashCode2 + (str2 != null ? str2.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            String str = this.chatId;
            Boolean bool = this.onlyUnread;
            String str2 = this.chatType;
            StringBuilder sb2 = new StringBuilder("Filter(chatId=");
            sb2.append(str);
            sb2.append(", onlyUnread=");
            sb2.append(bool);
            sb2.append(", chatType=");
            return o0.c(sb2, str2, ")");
        }

        public Filter(String str, Boolean bool, String str2) {
            this.chatId = str;
            this.onlyUnread = bool;
            this.chatType = str2;
        }

        public /* synthetic */ Filter(String str, Boolean bool, String str2, int i11, DefaultConstructorMarker defaultConstructorMarker) {
            this((i11 & 1) != 0 ? null : str, (i11 & 2) != 0 ? null : bool, (i11 & 4) != 0 ? null : str2);
        }
    }

    public GetChatsRequest(Integer num, Integer num2, Boolean bool, Filter filter) {
        super(d.GET_CHATS, null, 6);
        this.f88634c = num;
        this.f88635d = num2;
        this.f88636e = bool;
        this.f88637f = filter;
        this.f88638g = U.l(new Pair("offset", num), new Pair("limit", num2), new Pair("filter", filter), new Pair("withFirstPageInfo", bool));
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88638g;
    }

    public final Filter d() {
        return this.f88637f;
    }

    public final Integer e() {
        return this.f88635d;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof GetChatsRequest)) {
            return false;
        }
        GetChatsRequest getChatsRequest = (GetChatsRequest) obj;
        return Intrinsics.d(this.f88634c, getChatsRequest.f88634c) && Intrinsics.d(this.f88635d, getChatsRequest.f88635d) && Intrinsics.d(this.f88636e, getChatsRequest.f88636e) && Intrinsics.d(this.f88637f, getChatsRequest.f88637f);
    }

    public final Integer f() {
        return this.f88634c;
    }

    public final int hashCode() {
        Integer num = this.f88634c;
        int hashCode = (num == null ? 0 : num.hashCode()) * 31;
        Integer num2 = this.f88635d;
        int hashCode2 = (hashCode + (num2 == null ? 0 : num2.hashCode())) * 31;
        Boolean bool = this.f88636e;
        int hashCode3 = (hashCode2 + (bool == null ? 0 : bool.hashCode())) * 31;
        Filter filter = this.f88637f;
        return hashCode3 + (filter != null ? filter.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        return "GetChatsRequest(offset=" + this.f88634c + ", limit=" + this.f88635d + ", withFirstPageInfo=" + this.f88636e + ", filter=" + this.f88637f + ")";
    }
}
