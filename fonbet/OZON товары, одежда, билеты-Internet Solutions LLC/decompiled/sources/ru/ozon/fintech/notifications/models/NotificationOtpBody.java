package ru.ozon.fintech.notifications.models;

import B90.C2618u;
import G.g;
import N3.C3660k;
import Ul.C4070a;
import V.e;
import androidx.annotation.Keep;
import com.squareup.moshi.i;
import com.squareup.moshi.j;
import java.util.Map;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.ugc.widgets.selectionItemForm.data.SelectionItemFormDTO;

@j(generateAdapter = true)
@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\b\u0081\b\u0018\u00002\u00020\u0001:\u0001\u001bB5\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\b\u0001\u0010\u0005\u001a\u00020\u0006\u0012\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\u0004\b\b\u0010\tJ\u000b\u0010\u0010\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\t\u0010\u0012\u001a\u00020\u0006HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J7\u0010\u0014\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00032\b\b\u0003\u0010\u0005\u001a\u00020\u00062\n\b\u0003\u0010\u0007\u001a\u0004\u0018\u00010\u0003HÆ\u0001J\u0013\u0010\u0015\u001a\u00020\u00162\b\u0010\u0017\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0018\u001a\u00020\u0019HÖ\u0001J\t\u0010\u001a\u001a\u00020\u0003HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0011\u0010\u0005\u001a\u00020\u0006¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000eR\u0013\u0010\u0007\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u000b¨\u0006\u001c"}, d2 = {"Lru/ozon/fintech/notifications/models/NotificationOtpBody;", "", "id", "", "type", "encrypted", "Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted;", "parentId", "<init>", "(Ljava/lang/String;Ljava/lang/String;Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted;Ljava/lang/String;)V", "getId", "()Ljava/lang/String;", "getType", "getEncrypted", "()Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted;", "getParentId", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Encrypted", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final /* data */ class NotificationOtpBody {

    @NotNull
    private final Encrypted encrypted;
    private final String id;
    private final String parentId;
    private final String type;

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010$\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001:\u0002\u001f B?\u0012\n\b\u0001\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\n\b\u0001\u0010\u0004\u001a\u0004\u0018\u00010\u0005\u0012\b\b\u0001\u0010\u0006\u001a\u00020\u0007\u0012\u0014\b\u0001\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t¢\u0006\u0004\b\n\u0010\u000bJ\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0015\u001a\u0004\u0018\u00010\u0005HÆ\u0003J\t\u0010\u0016\u001a\u00020\u0007HÆ\u0003J\u0015\u0010\u0017\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tHÆ\u0003JA\u0010\u0018\u001a\u00020\u00002\n\b\u0003\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0003\u0010\u0004\u001a\u0004\u0018\u00010\u00052\b\b\u0003\u0010\u0006\u001a\u00020\u00072\u0014\b\u0003\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\tHÆ\u0001J\u0013\u0010\u0019\u001a\u00020\u001a2\b\u0010\u001b\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001c\u001a\u00020\u001dHÖ\u0001J\t\u0010\u001e\u001a\u00020\u0007HÖ\u0001R\u0013\u0010\u0002\u001a\u0004\u0018\u00010\u0003¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0013\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0011\u0010\u0006\u001a\u00020\u0007¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u001d\u0010\b\u001a\u000e\u0012\u0004\u0012\u00020\u0007\u0012\u0004\u0012\u00020\u00070\t¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u0013¨\u0006!"}, d2 = {"Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted;", "", "template", "Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Template;", "copyAction", "Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Copy;", "nonce", "", "messages", "", "<init>", "(Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Template;Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Copy;Ljava/lang/String;Ljava/util/Map;)V", "getTemplate", "()Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Template;", "getCopyAction", "()Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Copy;", "getNonce", "()Ljava/lang/String;", "getMessages", "()Ljava/util/Map;", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "hashCode", "", "toString", "Template", "Copy", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
    @j(generateAdapter = true)
    public static final /* data */ class Encrypted {
        private final Copy copyAction;

        @NotNull
        private final Map<String, String> messages;

        @NotNull
        private final String nonce;
        private final Template template;

        @Keep
        @Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\b\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0004\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007J\t\u0010\f\u001a\u00020\u0003HÆ\u0003J\t\u0010\r\u001a\u00020\u0005HÆ\u0003J\u001d\u0010\u000e\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0005HÆ\u0001J\u0013\u0010\u000f\u001a\u00020\u00102\b\u0010\u0011\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0012\u001a\u00020\u0005HÖ\u0001J\t\u0010\u0013\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000b¨\u0006\u0014"}, d2 = {"Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Copy;", "", "action", "", "position", "", "<init>", "(Ljava/lang/String;I)V", "getAction", "()Ljava/lang/String;", "getPosition", "()I", "component1", "component2", "copy", "equals", "", "other", "hashCode", "toString", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Copy {

            @NotNull
            private final String action;
            private final int position;

            public Copy(@i(name = "action") @NotNull String action, @i(name = "position") int i11) {
                Intrinsics.checkNotNullParameter(action, "action");
                this.action = action;
                this.position = i11;
            }

            public static /* synthetic */ Copy copy$default(Copy copy, String str, int i11, int i12, Object obj) {
                if ((i12 & 1) != 0) {
                    str = copy.action;
                }
                if ((i12 & 2) != 0) {
                    i11 = copy.position;
                }
                return copy.copy(str, i11);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getAction() {
                return this.action;
            }

            /* renamed from: component2, reason: from getter */
            public final int getPosition() {
                return this.position;
            }

            @NotNull
            public final Copy copy(@i(name = "action") @NotNull String action, @i(name = "position") int position) {
                Intrinsics.checkNotNullParameter(action, "action");
                return new Copy(action, position);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Copy)) {
                    return false;
                }
                Copy copy = (Copy) other;
                return Intrinsics.d(this.action, copy.action) && this.position == copy.position;
            }

            @NotNull
            public final String getAction() {
                return this.action;
            }

            public final int getPosition() {
                return this.position;
            }

            public int hashCode() {
                return Integer.hashCode(this.position) + (this.action.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return C2618u.f(this.position, "Copy(action=", this.action, ", position=", ")");
            }
        }

        @Keep
        @Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\n\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u001b\u0012\b\b\u0001\u0010\u0002\u001a\u00020\u0003\u0012\b\b\u0001\u0010\u0004\u001a\u00020\u0003¢\u0006\u0004\b\u0005\u0010\u0006J\t\u0010\n\u001a\u00020\u0003HÆ\u0003J\t\u0010\u000b\u001a\u00020\u0003HÆ\u0003J\u001d\u0010\f\u001a\u00020\u00002\b\b\u0003\u0010\u0002\u001a\u00020\u00032\b\b\u0003\u0010\u0004\u001a\u00020\u0003HÆ\u0001J\u0013\u0010\r\u001a\u00020\u000e2\b\u0010\u000f\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0010\u001a\u00020\u0011HÖ\u0001J\t\u0010\u0012\u001a\u00020\u0003HÖ\u0001R\u0011\u0010\u0002\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u0011\u0010\u0004\u001a\u00020\u0003¢\u0006\b\n\u0000\u001a\u0004\b\t\u0010\b¨\u0006\u0013"}, d2 = {"Lru/ozon/fintech/notifications/models/NotificationOtpBody$Encrypted$Template;", "", SelectionItemFormDTO.TITLE_FIELD_NAME, "", "body", "<init>", "(Ljava/lang/String;Ljava/lang/String;)V", "getTitle", "()Ljava/lang/String;", "getBody", "component1", "component2", "copy", "equals", "", "other", "hashCode", "", "toString", "fintech-notifications_prodRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
        @j(generateAdapter = true)
        public static final /* data */ class Template {

            @NotNull
            private final String body;

            @NotNull
            private final String title;

            public Template(@i(name = "title") @NotNull String title, @i(name = "body") @NotNull String body) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(body, "body");
                this.title = title;
                this.body = body;
            }

            public static /* synthetic */ Template copy$default(Template template, String str, String str2, int i11, Object obj) {
                if ((i11 & 1) != 0) {
                    str = template.title;
                }
                if ((i11 & 2) != 0) {
                    str2 = template.body;
                }
                return template.copy(str, str2);
            }

            @NotNull
            /* renamed from: component1, reason: from getter */
            public final String getTitle() {
                return this.title;
            }

            @NotNull
            /* renamed from: component2, reason: from getter */
            public final String getBody() {
                return this.body;
            }

            @NotNull
            public final Template copy(@i(name = "title") @NotNull String title, @i(name = "body") @NotNull String body) {
                Intrinsics.checkNotNullParameter(title, "title");
                Intrinsics.checkNotNullParameter(body, "body");
                return new Template(title, body);
            }

            public boolean equals(Object other) {
                if (this == other) {
                    return true;
                }
                if (!(other instanceof Template)) {
                    return false;
                }
                Template template = (Template) other;
                return Intrinsics.d(this.title, template.title) && Intrinsics.d(this.body, template.body);
            }

            @NotNull
            public final String getBody() {
                return this.body;
            }

            @NotNull
            public final String getTitle() {
                return this.title;
            }

            public int hashCode() {
                return this.body.hashCode() + (this.title.hashCode() * 31);
            }

            @NotNull
            public String toString() {
                return e.a("Template(title=", this.title, ", body=", this.body, ")");
            }
        }

        public Encrypted(@i(name = "template") Template template, @i(name = "copy") Copy copy, @i(name = "nonce") @NotNull String nonce, @i(name = "messages") @NotNull Map<String, String> messages) {
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(messages, "messages");
            this.template = template;
            this.copyAction = copy;
            this.nonce = nonce;
            this.messages = messages;
        }

        /* JADX WARN: Multi-variable type inference failed */
        public static /* synthetic */ Encrypted copy$default(Encrypted encrypted, Template template, Copy copy, String str, Map map, int i11, Object obj) {
            if ((i11 & 1) != 0) {
                template = encrypted.template;
            }
            if ((i11 & 2) != 0) {
                copy = encrypted.copyAction;
            }
            if ((i11 & 4) != 0) {
                str = encrypted.nonce;
            }
            if ((i11 & 8) != 0) {
                map = encrypted.messages;
            }
            return encrypted.copy(template, copy, str, map);
        }

        /* renamed from: component1, reason: from getter */
        public final Template getTemplate() {
            return this.template;
        }

        /* renamed from: component2, reason: from getter */
        public final Copy getCopyAction() {
            return this.copyAction;
        }

        @NotNull
        /* renamed from: component3, reason: from getter */
        public final String getNonce() {
            return this.nonce;
        }

        @NotNull
        public final Map<String, String> component4() {
            return this.messages;
        }

        @NotNull
        public final Encrypted copy(@i(name = "template") Template template, @i(name = "copy") Copy copyAction, @i(name = "nonce") @NotNull String nonce, @i(name = "messages") @NotNull Map<String, String> messages) {
            Intrinsics.checkNotNullParameter(nonce, "nonce");
            Intrinsics.checkNotNullParameter(messages, "messages");
            return new Encrypted(template, copyAction, nonce, messages);
        }

        public boolean equals(Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Encrypted)) {
                return false;
            }
            Encrypted encrypted = (Encrypted) other;
            return Intrinsics.d(this.template, encrypted.template) && Intrinsics.d(this.copyAction, encrypted.copyAction) && Intrinsics.d(this.nonce, encrypted.nonce) && Intrinsics.d(this.messages, encrypted.messages);
        }

        public final Copy getCopyAction() {
            return this.copyAction;
        }

        @NotNull
        public final Map<String, String> getMessages() {
            return this.messages;
        }

        @NotNull
        public final String getNonce() {
            return this.nonce;
        }

        public final Template getTemplate() {
            return this.template;
        }

        public int hashCode() {
            Template template = this.template;
            int hashCode = (template == null ? 0 : template.hashCode()) * 31;
            Copy copy = this.copyAction;
            return this.messages.hashCode() + g.a((hashCode + (copy != null ? copy.hashCode() : 0)) * 31, 31, this.nonce);
        }

        @NotNull
        public String toString() {
            Template template = this.template;
            Copy copy = this.copyAction;
            String str = this.nonce;
            Map<String, String> map = this.messages;
            StringBuilder sb2 = new StringBuilder("Encrypted(template=");
            sb2.append(template);
            sb2.append(", copyAction=");
            sb2.append(copy);
            sb2.append(", nonce=");
            return C4070a.a(sb2, str, ", messages=", map, ")");
        }
    }

    public NotificationOtpBody(@i(name = "push_id") String str, @i(name = "push_type") String str2, @i(name = "encrypted") @NotNull Encrypted encrypted, @i(name = "parent_id") String str3) {
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        this.id = str;
        this.type = str2;
        this.encrypted = encrypted;
        this.parentId = str3;
    }

    public static /* synthetic */ NotificationOtpBody copy$default(NotificationOtpBody notificationOtpBody, String str, String str2, Encrypted encrypted, String str3, int i11, Object obj) {
        if ((i11 & 1) != 0) {
            str = notificationOtpBody.id;
        }
        if ((i11 & 2) != 0) {
            str2 = notificationOtpBody.type;
        }
        if ((i11 & 4) != 0) {
            encrypted = notificationOtpBody.encrypted;
        }
        if ((i11 & 8) != 0) {
            str3 = notificationOtpBody.parentId;
        }
        return notificationOtpBody.copy(str, str2, encrypted, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final String getId() {
        return this.id;
    }

    /* renamed from: component2, reason: from getter */
    public final String getType() {
        return this.type;
    }

    @NotNull
    /* renamed from: component3, reason: from getter */
    public final Encrypted getEncrypted() {
        return this.encrypted;
    }

    /* renamed from: component4, reason: from getter */
    public final String getParentId() {
        return this.parentId;
    }

    @NotNull
    public final NotificationOtpBody copy(@i(name = "push_id") String id2, @i(name = "push_type") String type, @i(name = "encrypted") @NotNull Encrypted encrypted, @i(name = "parent_id") String parentId) {
        Intrinsics.checkNotNullParameter(encrypted, "encrypted");
        return new NotificationOtpBody(id2, type, encrypted, parentId);
    }

    public boolean equals(Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof NotificationOtpBody)) {
            return false;
        }
        NotificationOtpBody notificationOtpBody = (NotificationOtpBody) other;
        return Intrinsics.d(this.id, notificationOtpBody.id) && Intrinsics.d(this.type, notificationOtpBody.type) && Intrinsics.d(this.encrypted, notificationOtpBody.encrypted) && Intrinsics.d(this.parentId, notificationOtpBody.parentId);
    }

    @NotNull
    public final Encrypted getEncrypted() {
        return this.encrypted;
    }

    public final String getId() {
        return this.id;
    }

    public final String getParentId() {
        return this.parentId;
    }

    public final String getType() {
        return this.type;
    }

    public int hashCode() {
        String str = this.id;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.type;
        int hashCode2 = (this.encrypted.hashCode() + ((hashCode + (str2 == null ? 0 : str2.hashCode())) * 31)) * 31;
        String str3 = this.parentId;
        return hashCode2 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        String str = this.id;
        String str2 = this.type;
        Encrypted encrypted = this.encrypted;
        String str3 = this.parentId;
        StringBuilder d11 = C3660k.d("NotificationOtpBody(id=", str, ", type=", str2, ", encrypted=");
        d11.append(encrypted);
        d11.append(", parentId=");
        d11.append(str3);
        d11.append(")");
        return d11.toString();
    }

    public /* synthetic */ NotificationOtpBody(String str, String str2, Encrypted encrypted, String str3, int i11, DefaultConstructorMarker defaultConstructorMarker) {
        this(str, str2, encrypted, (i11 & 8) != 0 ? null : str3);
    }
}
