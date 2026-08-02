package com.zoho.livechat.android.modules.brand.data.remote.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.google.gson.h;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u00008\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\t\n\u0000\n\u0002\u0010 \n\u0002\u0018\u0002\n\u0002\b\u0011\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u000e\b\u0087\b\u0018\u00002\u00020\u0001:\u0001-BI\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0007\u0012\u000e\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t\u0012\b\u0010\f\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\u0010J\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\u0011\u0010\u0012J\u0012\u0010\u0013\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0013\u0010\u0010J\u0012\u0010\u0014\u001a\u0004\u0018\u00010\u0007HÆ\u0003¢\u0006\u0004\b\u0014\u0010\u0015J\u0018\u0010\u0016\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\tHÆ\u0003¢\u0006\u0004\b\u0016\u0010\u0017J\u0012\u0010\u0018\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0018\u0010\u0010J^\u0010\u0019\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u00072\u0010\b\u0002\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t2\n\b\u0002\u0010\f\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0019\u0010\u001aJ\u0010\u0010\u001b\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u001b\u0010\u0010J\u0010\u0010\u001d\u001a\u00020\u001cHÖ\u0001¢\u0006\u0004\b\u001d\u0010\u001eJ\u001a\u0010!\u001a\u00020 2\b\u0010\u001f\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b!\u0010\"R\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010#\u001a\u0004\b$\u0010\u0010R\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010%\u001a\u0004\b&\u0010\u0012R\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010#\u001a\u0004\b'\u0010\u0010R\u001c\u0010\b\u001a\u0004\u0018\u00010\u00078\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010(\u001a\u0004\b)\u0010\u0015R\"\u0010\u000b\u001a\n\u0012\u0004\u0012\u00020\n\u0018\u00010\t8\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u000b\u0010*\u001a\u0004\b+\u0010\u0017R\u001c\u0010\f\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\f\u0010#\u001a\u0004\b,\u0010\u0010¨\u0006."}, d2 = {"Lcom/zoho/livechat/android/modules/brand/data/remote/entities/FormResponse;", "", "", "displayName", "Lcom/google/gson/h;", "fieldsPrefillType", "formType", "", "syncTime", "", "Lcom/zoho/livechat/android/modules/brand/data/remote/entities/FormResponse$Message;", "messages", "title", "<init>", "(Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/google/gson/h;", "component3", "component4", "()Ljava/lang/Long;", "component5", "()Ljava/util/List;", "component6", "copy", "(Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;Ljava/lang/Long;Ljava/util/List;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/brand/data/remote/entities/FormResponse;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "Lcom/google/gson/h;", "getFieldsPrefillType", "getFormType", "Ljava/lang/Long;", "getSyncTime", "Ljava/util/List;", "getMessages", "getTitle", "Message", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class FormResponse {

    @c("dname")
    @Nullable
    private final String displayName;

    @c("fields_prefill_type")
    @Nullable
    private final h fieldsPrefillType;

    @c("form_type")
    @Nullable
    private final String formType;

    @c("msglist")
    @Nullable
    private final List<Message> messages;

    @c("sync_time")
    @Nullable
    private final Long syncTime;

    @c("title")
    @Nullable
    private final String title;

    @Keep
    @Metadata(d1 = {"\u0000&\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0010\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\n\b\u0087\b\u0018\u00002\u00020\u0001B9\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0004HÆ\u0003¢\u0006\u0004\b\r\u0010\u000eJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJL\u0010\u0012\u001a\u00020\u00002\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00042\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0012\u0010\u0013J\u0010\u0010\u0014\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0014\u0010\fJ\u0010\u0010\u0016\u001a\u00020\u0015HÖ\u0001¢\u0006\u0004\b\u0016\u0010\u0017J\u001a\u0010\u001a\u001a\u00020\u00192\b\u0010\u0018\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001a\u0010\u001bR\u001c\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0003\u0010\u001c\u001a\u0004\b\u001d\u0010\fR\u001c\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0005\u0010\u001e\u001a\u0004\b\u001f\u0010\u000eR\u001c\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0006\u0010\u001c\u001a\u0004\b \u0010\fR\u001c\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\u0007\u0010\u001c\u001a\u0004\b!\u0010\fR\u001c\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006X\u0087\u0004¢\u0006\f\n\u0004\b\b\u0010\u001c\u001a\u0004\b\"\u0010\f¨\u0006#"}, d2 = {"Lcom/zoho/livechat/android/modules/brand/data/remote/entities/FormResponse$Message;", "", "", "displayName", "Lcom/google/gson/h;", "meta", "text", "messageTime", "sender", "<init>", "(Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "()Lcom/google/gson/h;", "component3", "component4", "component5", "copy", "(Ljava/lang/String;Lcom/google/gson/h;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/brand/data/remote/entities/FormResponse$Message;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getDisplayName", "Lcom/google/gson/h;", "getMeta", "getText", "getMessageTime", "getSender", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
    public static final /* data */ class Message {

        @c("dname")
        @Nullable
        private final String displayName;

        @c("mtime")
        @Nullable
        private final String messageTime;

        @c("meta")
        @Nullable
        private final h meta;

        @c("sender")
        @Nullable
        private final String sender;

        @c("msg")
        @Nullable
        private final String text;

        public Message(@Nullable String str, @Nullable h hVar, @Nullable String str2, @Nullable String str3, @Nullable String str4) {
            this.displayName = str;
            this.meta = hVar;
            this.text = str2;
            this.messageTime = str3;
            this.sender = str4;
        }

        public static /* synthetic */ Message copy$default(Message message, String str, h hVar, String str2, String str3, String str4, int i10, Object obj) {
            if ((i10 & 1) != 0) {
                str = message.displayName;
            }
            if ((i10 & 2) != 0) {
                hVar = message.meta;
            }
            if ((i10 & 4) != 0) {
                str2 = message.text;
            }
            if ((i10 & 8) != 0) {
                str3 = message.messageTime;
            }
            if ((i10 & 16) != 0) {
                str4 = message.sender;
            }
            String str5 = str4;
            String str6 = str2;
            return message.copy(str, hVar, str6, str3, str5);
        }

        @Nullable
        /* renamed from: component1, reason: from getter */
        public final String getDisplayName() {
            return this.displayName;
        }

        @Nullable
        /* renamed from: component2, reason: from getter */
        public final h getMeta() {
            return this.meta;
        }

        @Nullable
        /* renamed from: component3, reason: from getter */
        public final String getText() {
            return this.text;
        }

        @Nullable
        /* renamed from: component4, reason: from getter */
        public final String getMessageTime() {
            return this.messageTime;
        }

        @Nullable
        /* renamed from: component5, reason: from getter */
        public final String getSender() {
            return this.sender;
        }

        @NotNull
        public final Message copy(@Nullable String displayName, @Nullable h meta, @Nullable String text, @Nullable String messageTime, @Nullable String sender) {
            return new Message(displayName, meta, text, messageTime, sender);
        }

        public boolean equals(@Nullable Object other) {
            if (this == other) {
                return true;
            }
            if (!(other instanceof Message)) {
                return false;
            }
            Message message = (Message) other;
            return Intrinsics.areEqual(this.displayName, message.displayName) && Intrinsics.areEqual(this.meta, message.meta) && Intrinsics.areEqual(this.text, message.text) && Intrinsics.areEqual(this.messageTime, message.messageTime) && Intrinsics.areEqual(this.sender, message.sender);
        }

        @Nullable
        public final String getDisplayName() {
            return this.displayName;
        }

        @Nullable
        public final String getMessageTime() {
            return this.messageTime;
        }

        @Nullable
        public final h getMeta() {
            return this.meta;
        }

        @Nullable
        public final String getSender() {
            return this.sender;
        }

        @Nullable
        public final String getText() {
            return this.text;
        }

        public int hashCode() {
            String str = this.displayName;
            int hashCode = (str == null ? 0 : str.hashCode()) * 31;
            h hVar = this.meta;
            int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
            String str2 = this.text;
            int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
            String str3 = this.messageTime;
            int hashCode4 = (hashCode3 + (str3 == null ? 0 : str3.hashCode())) * 31;
            String str4 = this.sender;
            return hashCode4 + (str4 != null ? str4.hashCode() : 0);
        }

        @NotNull
        public String toString() {
            return "Message(displayName=" + this.displayName + ", meta=" + this.meta + ", text=" + this.text + ", messageTime=" + this.messageTime + ", sender=" + this.sender + ')';
        }
    }

    public FormResponse(@Nullable String str, @Nullable h hVar, @Nullable String str2, @Nullable Long l10, @Nullable List<Message> list, @Nullable String str3) {
        this.displayName = str;
        this.fieldsPrefillType = hVar;
        this.formType = str2;
        this.syncTime = l10;
        this.messages = list;
        this.title = str3;
    }

    public static /* synthetic */ FormResponse copy$default(FormResponse formResponse, String str, h hVar, String str2, Long l10, List list, String str3, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = formResponse.displayName;
        }
        if ((i10 & 2) != 0) {
            hVar = formResponse.fieldsPrefillType;
        }
        if ((i10 & 4) != 0) {
            str2 = formResponse.formType;
        }
        if ((i10 & 8) != 0) {
            l10 = formResponse.syncTime;
        }
        if ((i10 & 16) != 0) {
            list = formResponse.messages;
        }
        if ((i10 & 32) != 0) {
            str3 = formResponse.title;
        }
        List list2 = list;
        String str4 = str3;
        return formResponse.copy(str, hVar, str2, l10, list2, str4);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final h getFieldsPrefillType() {
        return this.fieldsPrefillType;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getFormType() {
        return this.formType;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final Long getSyncTime() {
        return this.syncTime;
    }

    @Nullable
    public final List<Message> component5() {
        return this.messages;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getTitle() {
        return this.title;
    }

    @NotNull
    public final FormResponse copy(@Nullable String displayName, @Nullable h fieldsPrefillType, @Nullable String formType, @Nullable Long syncTime, @Nullable List<Message> messages, @Nullable String title) {
        return new FormResponse(displayName, fieldsPrefillType, formType, syncTime, messages, title);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof FormResponse)) {
            return false;
        }
        FormResponse formResponse = (FormResponse) other;
        return Intrinsics.areEqual(this.displayName, formResponse.displayName) && Intrinsics.areEqual(this.fieldsPrefillType, formResponse.fieldsPrefillType) && Intrinsics.areEqual(this.formType, formResponse.formType) && Intrinsics.areEqual(this.syncTime, formResponse.syncTime) && Intrinsics.areEqual(this.messages, formResponse.messages) && Intrinsics.areEqual(this.title, formResponse.title);
    }

    @Nullable
    public final String getDisplayName() {
        return this.displayName;
    }

    @Nullable
    public final h getFieldsPrefillType() {
        return this.fieldsPrefillType;
    }

    @Nullable
    public final String getFormType() {
        return this.formType;
    }

    @Nullable
    public final List<Message> getMessages() {
        return this.messages;
    }

    @Nullable
    public final Long getSyncTime() {
        return this.syncTime;
    }

    @Nullable
    public final String getTitle() {
        return this.title;
    }

    public int hashCode() {
        String str = this.displayName;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        h hVar = this.fieldsPrefillType;
        int hashCode2 = (hashCode + (hVar == null ? 0 : hVar.hashCode())) * 31;
        String str2 = this.formType;
        int hashCode3 = (hashCode2 + (str2 == null ? 0 : str2.hashCode())) * 31;
        Long l10 = this.syncTime;
        int hashCode4 = (hashCode3 + (l10 == null ? 0 : l10.hashCode())) * 31;
        List<Message> list = this.messages;
        int hashCode5 = (hashCode4 + (list == null ? 0 : list.hashCode())) * 31;
        String str3 = this.title;
        return hashCode5 + (str3 != null ? str3.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "FormResponse(displayName=" + this.displayName + ", fieldsPrefillType=" + this.fieldsPrefillType + ", formType=" + this.formType + ", syncTime=" + this.syncTime + ", messages=" + this.messages + ", title=" + this.title + ')';
    }
}
