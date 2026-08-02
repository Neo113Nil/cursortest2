package ru.ozon.android.messenger.framework.data.requests;

import C.o0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.messagetext.MessageTextDTO;
import ru.ozon.android.messenger.framework.data.remote.models.ComposedMessageInfo;

/* loaded from: classes10.dex */
public final class SendMessageRequest extends e {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final String f88639c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final String f88640d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final List<Blocks> f88641e;

    /* renamed from: f, reason: collision with root package name */
    @NotNull
    private final ComposedMessageInfo f88642f;

    /* renamed from: g, reason: collision with root package name */
    private final String f88643g;

    /* renamed from: h, reason: collision with root package name */
    private final Map<String, String> f88644h;

    /* renamed from: i, reason: collision with root package name */
    private final String f88645i;

    /* renamed from: j, reason: collision with root package name */
    @NotNull
    private final Tc.d f88646j;

    @com.squareup.moshi.j(generateAdapter = true)
    @Metadata(d1 = {"\u0000\u0018\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\n\b\u0001\u0018\u00002\u00020\u0001B\u001f\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005\u0012\u0006\u0010\u0006\u001a\u00020\u0001¢\u0006\u0004\b\u0007\u0010\bR\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\nR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000b\u0010\fR\u0011\u0010\u0006\u001a\u00020\u0001¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000e¨\u0006\u000f"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/SendMessageRequest$Blocks;", "", AppMeasurementSdk.ConditionalUserProperty.NAME, "", "version", "", "state", "<init>", "(Ljava/lang/String;JLjava/lang/Object;)V", "getName", "()Ljava/lang/String;", "getVersion", "()J", "getState", "()Ljava/lang/Object;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Blocks {
        public static final int $stable = 8;

        @NotNull
        private final String name;

        @NotNull
        private final Object state;
        private final long version;

        public Blocks(@NotNull String name, long j11, @NotNull Object state) {
            Intrinsics.checkNotNullParameter(name, "name");
            Intrinsics.checkNotNullParameter(state, "state");
            this.name = name;
            this.version = j11;
            this.state = state;
        }

        @NotNull
        public final String getName() {
            return this.name;
        }

        @NotNull
        public final Object getState() {
            return this.state;
        }

        public final long getVersion() {
            return this.version;
        }
    }

    @Metadata(d1 = {"\u0000\u0012\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0000\b1\u0018\u00002\u00020\u0001:\u0001\u0004B\t\b\u0004¢\u0006\u0004\b\u0002\u0010\u0003\u0082\u0001\u0001\u0005¨\u0006\u0006"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/SendMessageRequest$TextState;", "", "<init>", "()V", "Text", "Lru/ozon/android/messenger/framework/data/requests/SendMessageRequest$TextState$Text;", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static abstract class TextState {
        public static final int $stable = 0;

        @com.squareup.moshi.j(generateAdapter = true)
        @Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0007\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\b\u0081\b\u0018\u00002\u00020\u0001B\u0015\u0012\f\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\u000f\u0010\t\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0003J\u0019\u0010\n\u001a\u00020\u00002\u000e\b\u0002\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003HÆ\u0001J\u0013\u0010\u000b\u001a\u00020\f2\b\u0010\r\u001a\u0004\u0018\u00010\u000eHÖ\u0003J\t\u0010\u000f\u001a\u00020\u0010HÖ\u0001J\t\u0010\u0011\u001a\u00020\u0012HÖ\u0001R\u0017\u0010\u0002\u001a\b\u0012\u0004\u0012\u00020\u00040\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/android/messenger/framework/data/requests/SendMessageRequest$TextState$Text;", "Lru/ozon/android/messenger/framework/data/requests/SendMessageRequest$TextState;", "text", "", "Lru/ozon/android/messenger/blocks/messagetext/MessageTextDTO$MessageTextType;", "<init>", "(Ljava/util/List;)V", "getText", "()Ljava/util/List;", "component1", "copy", "equals", "", "other", "", "hashCode", "", "toString", "", "messenger_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
        public static final /* data */ class Text extends TextState {
            public static final int $stable = 8;

            @NotNull
            private final List<MessageTextDTO.MessageTextType> text;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            /* JADX WARN: Multi-variable type inference failed */
            public Text(@NotNull List<? extends MessageTextDTO.MessageTextType> text) {
                super(null);
                Intrinsics.checkNotNullParameter(text, "text");
                this.text = text;
            }

            /* JADX WARN: Multi-variable type inference failed */
            public static /* synthetic */ Text copy$default(Text text, List list, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    list = text.text;
                }
                return text.copy(list);
            }

            @NotNull
            public final List<MessageTextDTO.MessageTextType> component1() {
                return this.text;
            }

            @NotNull
            public final Text copy(@NotNull List<? extends MessageTextDTO.MessageTextType> text) {
                Intrinsics.checkNotNullParameter(text, "text");
                return new Text(text);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                return (other instanceof Text) && Intrinsics.d(this.text, ((Text) other).text);
            }

            @NotNull
            public final List<MessageTextDTO.MessageTextType> getText() {
                return this.text;
            }

            public int hashCode() {
                return this.text.hashCode();
            }

            @NotNull
            public String toString() {
                return H3.c.a("Text(text=", ")", this.text);
            }
        }

        public /* synthetic */ TextState(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        private TextState() {
        }
    }

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;

        @com.squareup.moshi.i(name = "link")
        public static final a LINK;

        @com.squareup.moshi.i(name = "text")
        public static final a TEXT;

        @NotNull
        private final String value;

        static {
            a aVar = new a("TEXT", 0, "text");
            TEXT = aVar;
            a aVar2 = new a("LINK", 1, "link");
            LINK = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a(String str, int i11, String str2) {
            this.value = str2;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }

        @NotNull
        public final String a() {
            return this.value;
        }
    }

    public /* synthetic */ SendMessageRequest(String str, String str2, List list, ComposedMessageInfo composedMessageInfo, String str3, String str4, int i11) {
        this(str, str2, (List<Blocks>) list, composedMessageInfo, (i11 & 16) != 0 ? null : str3, (Map<String, String>) null, str4);
    }

    @Override // ru.ozon.android.messenger.framework.data.requests.e
    @NotNull
    public final Map<String, Object> b() {
        return this.f88646j;
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof SendMessageRequest)) {
            return false;
        }
        SendMessageRequest sendMessageRequest = (SendMessageRequest) obj;
        return Intrinsics.d(this.f88639c, sendMessageRequest.f88639c) && Intrinsics.d(this.f88640d, sendMessageRequest.f88640d) && Intrinsics.d(this.f88641e, sendMessageRequest.f88641e) && Intrinsics.d(this.f88642f, sendMessageRequest.f88642f) && Intrinsics.d(this.f88643g, sendMessageRequest.f88643g) && Intrinsics.d(this.f88644h, sendMessageRequest.f88644h) && Intrinsics.d(this.f88645i, sendMessageRequest.f88645i);
    }

    public final int hashCode() {
        int hashCode = (this.f88642f.hashCode() + G.g.b(G.g.a(this.f88639c.hashCode() * 31, 31, this.f88640d), 31, this.f88641e)) * 31;
        String str = this.f88643g;
        int hashCode2 = (hashCode + (str == null ? 0 : str.hashCode())) * 31;
        Map<String, String> map = this.f88644h;
        int hashCode3 = (hashCode2 + (map == null ? 0 : map.hashCode())) * 31;
        String str2 = this.f88645i;
        return hashCode3 + (str2 != null ? str2.hashCode() : 0);
    }

    @NotNull
    public final String toString() {
        StringBuilder sb2 = new StringBuilder("SendMessageRequest(chatId=");
        sb2.append(this.f88639c);
        sb2.append(", localId=");
        sb2.append(this.f88640d);
        sb2.append(", blocks=");
        sb2.append(this.f88641e);
        sb2.append(", composedMessageInfo=");
        sb2.append(this.f88642f);
        sb2.append(", retryToken=");
        sb2.append(this.f88643g);
        sb2.append(", context=");
        sb2.append(this.f88644h);
        sb2.append(", replyToMessageId=");
        return o0.c(sb2, this.f88645i, ")");
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public SendMessageRequest(@NotNull String chatId, @NotNull String localId, @NotNull List<Blocks> blocks, @NotNull ComposedMessageInfo composedMessageInfo, String str, Map<String, String> map, String str2) {
        super(d.SEND_MESSAGE, chatId, 4);
        Intrinsics.checkNotNullParameter(chatId, "chatId");
        Intrinsics.checkNotNullParameter(localId, "localId");
        Intrinsics.checkNotNullParameter(blocks, "blocks");
        Intrinsics.checkNotNullParameter(composedMessageInfo, "composedMessageInfo");
        this.f88639c = chatId;
        this.f88640d = localId;
        this.f88641e = blocks;
        this.f88642f = composedMessageInfo;
        this.f88643g = str;
        this.f88644h = map;
        this.f88645i = str2;
        Tc.d builder = new Tc.d();
        builder.put("chatId", chatId);
        builder.put("localId", localId);
        builder.put("blocks", blocks);
        builder.put("composedMessageInfo", composedMessageInfo);
        builder.put("token", str);
        if (map != null) {
            builder.put("context", map);
        }
        if (str2 != null) {
            builder.put("replyToMessageId", str2);
        }
        Intrinsics.checkNotNullParameter(builder, "builder");
        this.f88646j = builder.u();
    }
}
