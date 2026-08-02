package com.sofascore.model;

import com.sofascore.model.mvvm.model.StatusKt;
import com.sofascore.model.util.ChatInterface;
import kotlin.Metadata;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0000\n\u0002\u0010\u000e\n\u0002\b\t\n\u0002\u0010\t\n\u0002\b\u0005\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0002\u001a\u00020\u0003\u0012\u0006\u0010\u0004\u001a\u00020\u0005¢\u0006\u0004\b\u0006\u0010\u0007R\u0014\u0010\u0002\u001a\u00020\u0003X\u0096\u0004¢\u0006\b\n\u0000\u001a\u0004\b\b\u0010\tR\u0011\u0010\u0004\u001a\u00020\u0005¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0014\u0010\f\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0014\u0010\u000e\u001a\u00020\u000f8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\u0010\u0010\u0011R\u0014\u0010\u0012\u001a\u00020\u0005X\u0096D¢\u0006\b\n\u0000\u001a\u0004\b\u0013\u0010\u000b¨\u0006\u0014"}, d2 = {"Lcom/sofascore/model/ChatCountry;", "Lcom/sofascore/model/util/ChatInterface;", "chatId", "", "description", "", "<init>", "(ILjava/lang/String;)V", "getChatId", "()I", "getDescription", "()Ljava/lang/String;", "channelName", "getChannelName", "timestamp", "", "getTimestamp", "()J", "statusType", "getStatusType", "model_release"}, k = 1, mv = {2, 3, 0}, xi = 48)
/* loaded from: classes5.dex */
public final class ChatCountry implements ChatInterface {

    @NotNull
    private final String channelName;
    private final int chatId;

    @NotNull
    private final String description;

    @NotNull
    private final String statusType;

    public ChatCountry(int i, @NotNull String str) {
        str.getClass();
        this.chatId = i;
        this.description = str;
        this.channelName = "country";
        this.statusType = StatusKt.STATUS_IN_PROGRESS;
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

    @NotNull
    public final String getDescription() {
        return this.description;
    }

    @Override // com.sofascore.model.util.ChatInterface
    @NotNull
    public String getStatusType() {
        return this.statusType;
    }

    @Override // com.sofascore.model.util.ChatInterface
    public long getTimestamp() {
        return System.currentTimeMillis() / 1000;
    }
}
