package com.zoho.livechat.android.modules.conversations.models;

import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.enums.EnumEntries;
import kotlin.enums.EnumEntriesKt;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes4.dex */
public abstract class SalesIQConversation {

    @Keep
    @Metadata(d1 = {"\u00004\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0016\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0012\b\u0087\b\u0018\u00002\u00020\u0001:\u000256Ba\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\t\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u000b\u001a\u0004\u0018\u00010\n\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0006\u0012\b\u0010\r\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u000e\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0014J\u0012\u0010\u0015\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u0015\u0010\u0016J\u0012\u0010\u0017\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0017\u0010\u0014J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0014J\u0012\u0010\u0019\u001a\u0004\u0018\u00010\nHÆ\u0003¢\u0006\u0004\b\u0019\u0010\u001aJ\u0012\u0010\u001b\u001a\u0004\u0018\u00010\u0006HÆ\u0003¢\u0006\u0004\b\u001b\u0010\u0016J\u0012\u0010\u001c\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u001c\u0010\u0012J\u0012\u0010\u001d\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u001d\u0010\u0014J|\u0010\u001e\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\t\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u000b\u001a\u0004\u0018\u00010\n2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u00062\n\b\u0002\u0010\r\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u000e\u001a\u0004\u0018\u00010\u0004HÆ\u0001¢\u0006\u0004\b\u001e\u0010\u001fJ\u0010\u0010 \u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b \u0010\u0012J\u0010\u0010\"\u001a\u00020!HÖ\u0001¢\u0006\u0004\b\"\u0010#J\u001a\u0010&\u001a\u00020%2\b\u0010$\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b&\u0010'R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010(\u001a\u0004\b)\u0010\u0012R\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010*\u001a\u0004\b+\u0010\u0014R\u0019\u0010\u0007\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\u0007\u0010,\u001a\u0004\b-\u0010\u0016R\u0019\u0010\b\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\b\u0010*\u001a\u0004\b.\u0010\u0014R\u0019\u0010\t\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\t\u0010*\u001a\u0004\b/\u0010\u0014R\u0019\u0010\u000b\u001a\u0004\u0018\u00010\n8\u0006¢\u0006\f\n\u0004\b\u000b\u00100\u001a\u0004\b1\u0010\u001aR\u0019\u0010\f\u001a\u0004\u0018\u00010\u00068\u0006¢\u0006\f\n\u0004\b\f\u0010,\u001a\u0004\b2\u0010\u0016R\u0019\u0010\r\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\r\u0010(\u001a\u0004\b3\u0010\u0012R\u0019\u0010\u000e\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u000e\u0010*\u001a\u0004\b4\u0010\u0014¨\u00067"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media;", "", "", StackTraceHelper.ID_KEY, "", "endTime", "Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$b;", "initiatedBy", "pickupTime", "connectedTime", "Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$a;", "status", "endedBy", "type", "createdTime", "<init>", "(Ljava/lang/String;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$b;Ljava/lang/Long;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$a;Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$b;Ljava/lang/String;Ljava/lang/Long;)V", "component1", "()Ljava/lang/String;", "component2", "()Ljava/lang/Long;", "component3", "()Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$b;", "component4", "component5", "component6", "()Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$a;", "component7", "component8", "component9", "copy", "(Ljava/lang/String;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$b;Ljava/lang/Long;Ljava/lang/Long;Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$a;Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$b;Ljava/lang/String;Ljava/lang/Long;)Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getId", "Ljava/lang/Long;", "getEndTime", "Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$b;", "getInitiatedBy", "getPickupTime", "getConnectedTime", "Lcom/zoho/livechat/android/modules/conversations/models/SalesIQConversation$Media$a;", "getStatus", "getEndedBy", "getType", "getCreatedTime", "a", com.google.crypto.tink.integration.android.b.f37029b, "core_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Media {

        @Nullable
        private final Long connectedTime;

        @Nullable
        private final Long createdTime;

        @Nullable
        private final Long endTime;

        @Nullable
        private final b endedBy;

        @Nullable
        private final String id;

        @Nullable
        private final b initiatedBy;

        @Nullable
        private final Long pickupTime;

        @Nullable
        private final a status;

        @Nullable
        private final String type;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        public static final class a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ a[] $VALUES;
            public static final a ENDED = new a("ENDED", 0);
            public static final a MISSED = new a("MISSED", 1);
            public static final a CANCELLED = new a("CANCELLED", 2);
            public static final a CONNECTED = new a("CONNECTED", 3);
            public static final a INVITED = new a("INVITED", 4);
            public static final a INITIATED = new a("INITIATED", 5);
            public static final a ACCEPTED = new a("ACCEPTED", 6);

            private static final /* synthetic */ a[] $values() {
                return new a[]{ENDED, MISSED, CANCELLED, CONNECTED, INVITED, INITIATED, ACCEPTED};
            }

            static {
                a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private a(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<a> getEntries() {
                return $ENTRIES;
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
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ b[] $VALUES;
            public static final b VISITOR = new b("VISITOR", 0);
            public static final b OPERATOR = new b("OPERATOR", 1);

            private static final /* synthetic */ b[] $values() {
                return new b[]{VISITOR, OPERATOR};
            }

            static {
                b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private b(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<b> getEntries() {
                return $ENTRIES;
            }

            public static b valueOf(String str) {
                return (b) Enum.valueOf(b.class, str);
            }

            public static b[] values() {
                return (b[]) $VALUES.clone();
            }
        }

        public Media(@Nullable String str, @Nullable Long l10, @Nullable b bVar, @Nullable Long l11, @Nullable Long l12, @Nullable a aVar, @Nullable b bVar2, @Nullable String str2, @Nullable Long l13) {
            this.id = str;
            this.endTime = l10;
            this.initiatedBy = bVar;
            this.pickupTime = l11;
            this.connectedTime = l12;
            this.status = aVar;
            this.endedBy = bVar2;
            this.type = str2;
            this.createdTime = l13;
        }

        public static /* synthetic */ Media copy$default(Media media, String str, Long l10, b bVar, Long l11, Long l12, a aVar, b bVar2, String str2, Long l13, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = media.id;
            }
            if ((i10 & 2) != 0) {
                l10 = media.endTime;
            }
            if ((i10 & 4) != 0) {
                bVar = media.initiatedBy;
            }
            if ((i10 & 8) != 0) {
                l11 = media.pickupTime;
            }
            if ((i10 & 16) != 0) {
                l12 = media.connectedTime;
            }
            if ((i10 & 32) != 0) {
                aVar = media.status;
            }
            if ((i10 & 64) != 0) {
                bVar2 = media.endedBy;
            }
            if ((i10 & 128) != 0) {
                str2 = media.type;
            }
            if ((i10 & 256) != 0) {
                l13 = media.createdTime;
            }
            String str3 = str2;
            Long l14 = l13;
            a aVar2 = aVar;
            b bVar3 = bVar2;
            Long l15 = l12;
            b bVar4 = bVar;
            return media.copy(str, l10, bVar4, l11, l15, aVar2, bVar3, str3, l14);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getId() {
            return this.id;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final Long getEndTime() {
            return this.endTime;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final b getInitiatedBy() {
            return this.initiatedBy;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final Long getPickupTime() {
            return this.pickupTime;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final Long getConnectedTime() {
            return this.connectedTime;
        }

        @Nullable
        /* renamed from: component6, reason: from getter */
        public final a getStatus() {
            return this.status;
        }

        @Nullable
        /* renamed from: component7, reason: from getter */
        public final b getEndedBy() {
            return this.endedBy;
        }

        @Nullable
        /* renamed from: component8, reason: from getter */
        public final String getType() {
            return this.type;
        }

        @Nullable
        /* renamed from: component9, reason: from getter */
        public final Long getCreatedTime() {
            return this.createdTime;
        }

        @NotNull
        public final Media copy(@Nullable String id2, @Nullable Long endTime, @Nullable b initiatedBy, @Nullable Long pickupTime, @Nullable Long connectedTime, @Nullable a status, @Nullable b endedBy, @Nullable String type, @Nullable Long createdTime) {
            return new Media(id2, endTime, initiatedBy, pickupTime, connectedTime, status, endedBy, type, createdTime);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Media)) {
                return false;
            }
            Media media = (Media) other;
            return Intrinsics.areEqual(this.id, media.id) && Intrinsics.areEqual(this.endTime, media.endTime) && this.initiatedBy == media.initiatedBy && Intrinsics.areEqual(this.pickupTime, media.pickupTime) && Intrinsics.areEqual(this.connectedTime, media.connectedTime) && this.status == media.status && this.endedBy == media.endedBy && Intrinsics.areEqual(this.type, media.type) && Intrinsics.areEqual(this.createdTime, media.createdTime);
        }

        @Nullable
        public final Long getConnectedTime() {
            return this.connectedTime;
        }

        @Nullable
        public final Long getCreatedTime() {
            return this.createdTime;
        }

        @Nullable
        public final Long getEndTime() {
            return this.endTime;
        }

        @Nullable
        public final b getEndedBy() {
            return this.endedBy;
        }

        @Nullable
        public final String getId() {
            return this.id;
        }

        @Nullable
        public final b getInitiatedBy() {
            return this.initiatedBy;
        }

        @Nullable
        public final Long getPickupTime() {
            return this.pickupTime;
        }

        @Nullable
        public final a getStatus() {
            return this.status;
        }

        @Nullable
        public final String getType() {
            return this.type;
        }

        public int hashCode() {
            String str = this.id;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            Long l10 = this.endTime;
            int hashCode2 = (hashCode + (l10 == null ? 0 : l10.hashCode())) * 31;
            b bVar = this.initiatedBy;
            int hashCode3 = (hashCode2 + (bVar == null ? 0 : bVar.hashCode())) * 31;
            Long l11 = this.pickupTime;
            int hashCode4 = (hashCode3 + (l11 == null ? 0 : l11.hashCode())) * 31;
            Long l12 = this.connectedTime;
            int hashCode5 = (hashCode4 + (l12 == null ? 0 : l12.hashCode())) * 31;
            a aVar = this.status;
            int hashCode6 = (hashCode5 + (aVar == null ? 0 : aVar.hashCode())) * 31;
            b bVar2 = this.endedBy;
            int hashCode7 = (hashCode6 + (bVar2 == null ? 0 : bVar2.hashCode())) * 31;
            String str2 = this.type;
            int hashCode8 = (hashCode7 + (str2 == null ? 0 : str2.hashCode())) * 31;
            Long l13 = this.createdTime;
            return hashCode8 + (l13 != null ? l13.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Media(id=" + this.id + ", endTime=" + this.endTime + ", initiatedBy=" + this.initiatedBy + ", pickupTime=" + this.pickupTime + ", connectedTime=" + this.connectedTime + ", status=" + this.status + ", endedBy=" + this.endedBy + ", type=" + this.type + ", createdTime=" + this.createdTime + ')';
        }
    }

    public static final class a extends SalesIQConversation {

        /* renamed from: a, reason: collision with root package name */
        public final String f43131a;

        /* renamed from: b, reason: collision with root package name */
        public final String f43132b;

        /* renamed from: c, reason: collision with root package name */
        public final String f43133c;

        /* renamed from: d, reason: collision with root package name */
        public final String f43134d;

        /* renamed from: e, reason: collision with root package name */
        public final String f43135e;

        /* renamed from: f, reason: collision with root package name */
        public final String f43136f;

        /* renamed from: g, reason: collision with root package name */
        public final String f43137g;

        /* renamed from: h, reason: collision with root package name */
        public final EnumC0619a f43138h;

        /* renamed from: i, reason: collision with root package name */
        public final String f43139i;

        /* renamed from: j, reason: collision with root package name */
        public final String f43140j;

        /* renamed from: k, reason: collision with root package name */
        public final int f43141k;

        /* renamed from: l, reason: collision with root package name */
        public final Media f43142l;

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.zoho.livechat.android.modules.conversations.models.SalesIQConversation$a$a, reason: collision with other inner class name */
        public static final class EnumC0619a {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EnumC0619a[] $VALUES;
            public static final EnumC0619a WAITING = new EnumC0619a("WAITING", 0);
            public static final EnumC0619a CONNECTED = new EnumC0619a("CONNECTED", 1);
            public static final EnumC0619a MISSED = new EnumC0619a("MISSED", 2);
            public static final EnumC0619a CLOSED = new EnumC0619a("CLOSED", 3);

            private static final /* synthetic */ EnumC0619a[] $values() {
                return new EnumC0619a[]{WAITING, CONNECTED, MISSED, CLOSED};
            }

            static {
                EnumC0619a[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private EnumC0619a(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<EnumC0619a> getEntries() {
                return $ENTRIES;
            }

            public static EnumC0619a valueOf(String str) {
                return (EnumC0619a) Enum.valueOf(EnumC0619a.class, str);
            }

            public static EnumC0619a[] values() {
                return (EnumC0619a[]) $VALUES.clone();
            }
        }

        public a(String str, String str2, String str3, String str4, String str5, String str6, String str7, EnumC0619a enumC0619a, String str8, String str9, int i10, Media media) {
            super(null);
            this.f43131a = str;
            this.f43132b = str2;
            this.f43133c = str3;
            this.f43134d = str4;
            this.f43135e = str5;
            this.f43136f = str6;
            this.f43137g = str7;
            this.f43138h = enumC0619a;
            this.f43139i = str8;
            this.f43140j = str9;
            this.f43141k = i10;
            this.f43142l = media;
        }

        public String toString() {
            String v10 = Yd.b.a().v(this);
            Intrinsics.checkNotNullExpressionValue(v10, "toJson(...)");
            return v10;
        }
    }

    public static final class b extends SalesIQConversation {

        /* renamed from: a, reason: collision with root package name */
        public final String f43143a;

        /* renamed from: b, reason: collision with root package name */
        public final String f43144b;

        /* renamed from: c, reason: collision with root package name */
        public final String f43145c;

        /* renamed from: d, reason: collision with root package name */
        public final String f43146d;

        /* renamed from: e, reason: collision with root package name */
        public final String f43147e;

        /* renamed from: f, reason: collision with root package name */
        public final String f43148f;

        /* renamed from: g, reason: collision with root package name */
        public final String f43149g;

        /* renamed from: h, reason: collision with root package name */
        public final boolean f43150h;

        /* renamed from: i, reason: collision with root package name */
        public final EnumC0622b f43151i;

        /* renamed from: j, reason: collision with root package name */
        public final String f43152j;

        /* renamed from: k, reason: collision with root package name */
        public final String f43153k;

        /* renamed from: l, reason: collision with root package name */
        public final int f43154l;

        /* renamed from: m, reason: collision with root package name */
        public final int f43155m;

        /* renamed from: n, reason: collision with root package name */
        public final a f43156n;

        /* renamed from: o, reason: collision with root package name */
        public final Media f43157o;

        public static final class a {

            /* renamed from: a, reason: collision with root package name */
            public final String f43158a;

            /* renamed from: b, reason: collision with root package name */
            public final String f43159b;

            /* renamed from: c, reason: collision with root package name */
            public final String f43160c;

            /* renamed from: d, reason: collision with root package name */
            public final String f43161d;

            /* renamed from: e, reason: collision with root package name */
            public final Long f43162e;

            /* renamed from: f, reason: collision with root package name */
            public final boolean f43163f;

            /* renamed from: g, reason: collision with root package name */
            public final boolean f43164g;

            /* renamed from: h, reason: collision with root package name */
            public final C0620a f43165h;

            /* renamed from: i, reason: collision with root package name */
            public final EnumC0621b f43166i;

            /* renamed from: com.zoho.livechat.android.modules.conversations.models.SalesIQConversation$b$a$a, reason: collision with other inner class name */
            public static final class C0620a {

                /* renamed from: a, reason: collision with root package name */
                public final String f43167a;

                /* renamed from: b, reason: collision with root package name */
                public final String f43168b;

                /* renamed from: c, reason: collision with root package name */
                public final String f43169c;

                /* renamed from: d, reason: collision with root package name */
                public final Long f43170d;

                public C0620a(String str, String str2, String str3, Long l10) {
                    this.f43167a = str;
                    this.f43168b = str2;
                    this.f43169c = str3;
                    this.f43170d = l10;
                }

                public boolean equals(Object obj) {
                    if (this == obj) {
                        return true;
                    }
                    if (!(obj instanceof C0620a)) {
                        return false;
                    }
                    C0620a c0620a = (C0620a) obj;
                    return Intrinsics.areEqual(this.f43167a, c0620a.f43167a) && Intrinsics.areEqual(this.f43168b, c0620a.f43168b) && Intrinsics.areEqual(this.f43169c, c0620a.f43169c) && Intrinsics.areEqual(this.f43170d, c0620a.f43170d);
                }

                public int hashCode() {
                    String str = this.f43167a;
                    int hashCode = (str == null ? 0 : str.hashCode()) * 31;
                    String str2 = this.f43168b;
                    int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
                    String str3 = this.f43169c;
                    int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
                    Long l10 = this.f43170d;
                    return hashCode3 + (l10 != null ? l10.hashCode() : 0);
                }

                public String toString() {
                    return "SalesIQFile(name=" + this.f43167a + ", contentType=" + this.f43168b + ", comment=" + this.f43169c + ", size=" + this.f43170d + ')';
                }
            }

            /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
            /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
            /* renamed from: com.zoho.livechat.android.modules.conversations.models.SalesIQConversation$b$a$b, reason: collision with other inner class name */
            public static final class EnumC0621b {
                private static final /* synthetic */ EnumEntries $ENTRIES;
                private static final /* synthetic */ EnumC0621b[] $VALUES;
                public static final EnumC0621b Sending = new EnumC0621b("Sending", 0);
                public static final EnumC0621b Uploading = new EnumC0621b("Uploading", 1);
                public static final EnumC0621b Sent = new EnumC0621b("Sent", 2);
                public static final EnumC0621b Failure = new EnumC0621b("Failure", 3);

                private static final /* synthetic */ EnumC0621b[] $values() {
                    return new EnumC0621b[]{Sending, Uploading, Sent, Failure};
                }

                static {
                    EnumC0621b[] $values = $values();
                    $VALUES = $values;
                    $ENTRIES = EnumEntriesKt.enumEntries($values);
                }

                private EnumC0621b(String str, int i10) {
                }

                @NotNull
                public static EnumEntries<EnumC0621b> getEntries() {
                    return $ENTRIES;
                }

                public static EnumC0621b valueOf(String str) {
                    return (EnumC0621b) Enum.valueOf(EnumC0621b.class, str);
                }

                public static EnumC0621b[] values() {
                    return (EnumC0621b[]) $VALUES.clone();
                }
            }

            public a(String str, String str2, String str3, String str4, Long l10, boolean z10, boolean z11, C0620a c0620a, EnumC0621b enumC0621b) {
                this.f43158a = str;
                this.f43159b = str2;
                this.f43160c = str3;
                this.f43161d = str4;
                this.f43162e = l10;
                this.f43163f = z10;
                this.f43164g = z11;
                this.f43165h = c0620a;
                this.f43166i = enumC0621b;
            }

            public String toString() {
                Object m147constructorimpl;
                try {
                    Result.Companion companion = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(Yd.b.a().v(this));
                } catch (Throwable th2) {
                    Result.Companion companion2 = Result.INSTANCE;
                    m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
                }
                if (Result.m153isFailureimpl(m147constructorimpl)) {
                    m147constructorimpl = null;
                }
                String str = (String) m147constructorimpl;
                return str == null ? super.toString() : str;
            }
        }

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* renamed from: com.zoho.livechat.android.modules.conversations.models.SalesIQConversation$b$b, reason: collision with other inner class name */
        public static final class EnumC0622b {
            private static final /* synthetic */ EnumEntries $ENTRIES;
            private static final /* synthetic */ EnumC0622b[] $VALUES;
            public static final EnumC0622b WAITING = new EnumC0622b("WAITING", 0);
            public static final EnumC0622b CONNECTED = new EnumC0622b("CONNECTED", 1);
            public static final EnumC0622b MISSED = new EnumC0622b("MISSED", 2);
            public static final EnumC0622b CLOSED = new EnumC0622b("CLOSED", 3);
            public static final EnumC0622b TRIGGERED = new EnumC0622b("TRIGGERED", 4);
            public static final EnumC0622b PROACTIVE = new EnumC0622b("PROACTIVE", 5);

            private static final /* synthetic */ EnumC0622b[] $values() {
                return new EnumC0622b[]{WAITING, CONNECTED, MISSED, CLOSED, TRIGGERED, PROACTIVE};
            }

            static {
                EnumC0622b[] $values = $values();
                $VALUES = $values;
                $ENTRIES = EnumEntriesKt.enumEntries($values);
            }

            private EnumC0622b(String str, int i10) {
            }

            @NotNull
            public static EnumEntries<EnumC0622b> getEntries() {
                return $ENTRIES;
            }

            public static EnumC0622b valueOf(String str) {
                return (EnumC0622b) Enum.valueOf(EnumC0622b.class, str);
            }

            public static EnumC0622b[] values() {
                return (EnumC0622b[]) $VALUES.clone();
            }
        }

        public b(String str, String str2, String str3, String str4, String str5, String str6, String str7, boolean z10, EnumC0622b enumC0622b, String str8, String str9, int i10, int i11, a aVar, Media media) {
            super(null);
            this.f43143a = str;
            this.f43144b = str2;
            this.f43145c = str3;
            this.f43146d = str4;
            this.f43147e = str5;
            this.f43148f = str6;
            this.f43149g = str7;
            this.f43150h = z10;
            this.f43151i = enumC0622b;
            this.f43152j = str8;
            this.f43153k = str9;
            this.f43154l = i10;
            this.f43155m = i11;
            this.f43156n = aVar;
            this.f43157o = media;
        }

        public String toString() {
            Object m147constructorimpl;
            try {
                Result.Companion companion = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(Yd.b.a().v(this));
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            if (Result.m153isFailureimpl(m147constructorimpl)) {
                m147constructorimpl = null;
            }
            String str = (String) m147constructorimpl;
            return str == null ? super.toString() : str;
        }
    }

    public /* synthetic */ SalesIQConversation(DefaultConstructorMarker defaultConstructorMarker) {
        this();
    }

    public SalesIQConversation() {
    }
}
