package com.sofascore.model.util;

import defpackage.dmi;
import defpackage.ljg;
import java.io.Serializable;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u00000\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\t\n\u0002\b\u0010\n\u0002\u0010\u000b\n\u0000\n\u0002\u0010\u0000\n\u0002\b\u0003\b\u0086\b\u0018\u00002\u00020\u00012\u00020\u0002B+\u0012\u0006\u0010\u0003\u001a\u00020\u0004\u0012\u0006\u0010\u0005\u001a\u00020\u0006\u0012\b\b\u0002\u0010\u0007\u001a\u00020\b\u0012\b\b\u0002\u0010\t\u001a\u00020\u0006¢\u0006\u0004\b\n\u0010\u000bJ\t\u0010\u0013\u001a\u00020\u0004HÆ\u0003J\t\u0010\u0014\u001a\u00020\u0006HÆ\u0003J\t\u0010\u0015\u001a\u00020\bHÆ\u0003J\t\u0010\u0016\u001a\u00020\u0006HÆ\u0003J1\u0010\u0017\u001a\u00020\u00002\b\b\u0002\u0010\u0003\u001a\u00020\u00042\b\b\u0002\u0010\u0005\u001a\u00020\u00062\b\b\u0002\u0010\u0007\u001a\u00020\b2\b\b\u0002\u0010\t\u001a\u00020\u0006HÆ\u0001J\u0014\u0010\u0018\u001a\u00020\u00192\b\u0010\u001a\u001a\u0004\u0018\u00010\u001bHÖ\u0083\u0004J\n\u0010\u001c\u001a\u00020\u0004HÖ\u0081\u0004J\n\u0010\u001d\u001a\u00020\u0006HÖ\u0081\u0004R\u0014\u0010\u0003\u001a\u00020\u0004X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\rR\u0014\u0010\u0005\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000fR\u0014\u0010\u0007\u001a\u00020\bX\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\t\u001a\u00020\u0006X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0012\u0010\u000f¨\u0006\u001e"}, d2 = {"Lcom/sofascore/model/util/ChatInterfaceBasic;", "Lcom/sofascore/model/util/ChatInterface;", "Ljava/io/Serializable;", "chatId", "", "channelName", "", "timestamp", "", "statusType", "<init>", "(ILjava/lang/String;JLjava/lang/String;)V", "getChatId", "()I", "getChannelName", "()Ljava/lang/String;", "getTimestamp", "()J", "getStatusType", "component1", "component2", "component3", "component4", "copy", "equals", "", "other", "", "hashCode", "toString", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final /* data */ class ChatInterfaceBasic implements ChatInterface, Serializable {

    @NotNull
    private final String channelName;
    private final int chatId;

    @NotNull
    private final String statusType;
    private final long timestamp;

    public /* synthetic */ ChatInterfaceBasic(int i, String str, long j, String str2, int i2, DefaultConstructorMarker defaultConstructorMarker) {
        this(i, str, (i2 & 4) != 0 ? 0L : j, (i2 & 8) != 0 ? "" : str2);
    }

    public static /* synthetic */ ChatInterfaceBasic copy$default(ChatInterfaceBasic chatInterfaceBasic, int i, String str, long j, String str2, int i2, Object obj) {
        if ((i2 & 1) != 0) {
            i = chatInterfaceBasic.chatId;
        }
        if ((i2 & 2) != 0) {
            str = chatInterfaceBasic.channelName;
        }
        if ((i2 & 4) != 0) {
            j = chatInterfaceBasic.timestamp;
        }
        if ((i2 & 8) != 0) {
            str2 = chatInterfaceBasic.statusType;
        }
        String str3 = str2;
        return chatInterfaceBasic.copy(i, str, j, str3);
    }

    /* renamed from: component1, reason: from getter */
    public final int getChatId() {
        return this.chatId;
    }

    @NotNull
    /* renamed from: component2, reason: from getter */
    public final String getChannelName() {
        return this.channelName;
    }

    /* renamed from: component3, reason: from getter */
    public final long getTimestamp() {
        return this.timestamp;
    }

    @NotNull
    /* renamed from: component4, reason: from getter */
    public final String getStatusType() {
        return this.statusType;
    }

    @NotNull
    public final ChatInterfaceBasic copy(int chatId, @NotNull String channelName, long timestamp, @NotNull String statusType) {
        channelName.getClass();
        statusType.getClass();
        return new ChatInterfaceBasic(chatId, channelName, timestamp, statusType);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof ChatInterfaceBasic)) {
            return false;
        }
        ChatInterfaceBasic chatInterfaceBasic = (ChatInterfaceBasic) other;
        return this.chatId == chatInterfaceBasic.chatId && Intrinsics.c(this.channelName, chatInterfaceBasic.channelName) && this.timestamp == chatInterfaceBasic.timestamp && Intrinsics.c(this.statusType, chatInterfaceBasic.statusType);
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getChannelName() {
        return this.channelName;
    }

    @Override // com.sofascore.model.util.ChatInterface
    public int getChatId() {
        return this.chatId;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getStatusType() {
        return this.statusType;
    }

    @Override // com.sofascore.model.util.ChatInterface
    public long getTimestamp() {
        return this.timestamp;
    }

    public int hashCode() {
        return this.statusType.hashCode() + ljg.c(dmi.c(Integer.hashCode(this.chatId) * 31, 31, this.channelName), 31, this.timestamp);
    }

    @NotNull
    public String toString() {
        int i = this.chatId;
        String str = this.channelName;
        long j = this.timestamp;
        String str2 = this.statusType;
        StringBuilder t = dmi.t(i, "ChatInterfaceBasic(chatId=", ", channelName=", str, ", timestamp=");
        t.append(j);
        t.append(", statusType=");
        t.append(str2);
        t.append(")");
        return t.toString();
    }

    public ChatInterfaceBasic(int i, @NotNull String str, long j, @NotNull String str2) {
        str.getClass();
        str2.getClass();
        this.chatId = i;
        this.channelName = str;
        this.timestamp = j;
        this.statusType = str2;
    }
}
