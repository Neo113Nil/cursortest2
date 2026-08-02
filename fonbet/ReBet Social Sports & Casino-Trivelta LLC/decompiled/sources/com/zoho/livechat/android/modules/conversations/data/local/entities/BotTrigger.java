package com.zoho.livechat.android.modules.conversations.data.local.entities;

import Gb.c;
import androidx.annotation.Keep;
import com.facebook.react.devsupport.StackTraceHelper;
import com.twilio.voice.EventKeys;
import java.util.List;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000*\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u0004\n\u0002\u0010 \n\u0002\b\u000f\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B=\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0006\u001a\u0004\u0018\u00010\u0003\u0012\u000e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b¢\u0006\u0002\u0010\tJ\u000b\u0010\u0011\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0012\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0013\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u000b\u0010\u0014\u001a\u0004\u0018\u00010\u0003HÆ\u0003J\u0011\u0010\u0015\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0003JK\u0010\u0016\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00032\u0010\b\u0002\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\bHÆ\u0001J\u0013\u0010\u0017\u001a\u00020\u00182\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u001a\u001a\u00020\u001bHÖ\u0001J\t\u0010\u001c\u001a\u00020\u0003HÖ\u0001R\u0018\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\n\u0010\u000bR\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\f\u0010\u000bR\u0018\u0010\u0005\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\r\u0010\u000bR\u0018\u0010\u0006\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000e\u0010\u000bR\u001e\u0010\u0007\u001a\n\u0012\u0004\u0012\u00020\u0003\u0018\u00010\b8\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u000f\u0010\u0010¨\u0006\u001d"}, d2 = {"Lcom/zoho/livechat/android/modules/conversations/data/local/entities/BotTrigger;", "", "event", "", StackTraceHelper.ID_KEY, "imageKey", "name", EventKeys.VALUES_KEY, "", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/util/List;)V", "getEvent", "()Ljava/lang/String;", "getId", "getImageKey", "getName", "getValues", "()Ljava/util/List;", "component1", "component2", "component3", "component4", "component5", "copy", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class BotTrigger {

    @c("event")
    @Nullable
    private final String event;

    @c(StackTraceHelper.ID_KEY)
    @Nullable
    private final String id;

    @c("image_key")
    @Nullable
    private final String imageKey;

    @c("name")
    @Nullable
    private final String name;

    @c(EventKeys.VALUES_KEY)
    @Nullable
    private final List<String> values;

    public BotTrigger(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable List<String> list) {
        this.event = str;
        this.id = str2;
        this.imageKey = str3;
        this.name = str4;
        this.values = list;
    }

    public static /* synthetic */ BotTrigger copy$default(BotTrigger botTrigger, String str, String str2, String str3, String str4, List list, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = botTrigger.event;
        }
        if ((i10 & 2) != 0) {
            str2 = botTrigger.id;
        }
        if ((i10 & 4) != 0) {
            str3 = botTrigger.imageKey;
        }
        if ((i10 & 8) != 0) {
            str4 = botTrigger.name;
        }
        if ((i10 & 16) != 0) {
            list = botTrigger.values;
        }
        List list2 = list;
        String str5 = str3;
        return botTrigger.copy(str, str2, str5, str4, list2);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getId() {
        return this.id;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getImageKey() {
        return this.imageKey;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<String> component5() {
        return this.values;
    }

    @NotNull
    public final BotTrigger copy(@Nullable String event, @Nullable String id2, @Nullable String imageKey, @Nullable String name, @Nullable List<String> values) {
        return new BotTrigger(event, id2, imageKey, name, values);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof BotTrigger)) {
            return false;
        }
        BotTrigger botTrigger = (BotTrigger) other;
        return Intrinsics.areEqual(this.event, botTrigger.event) && Intrinsics.areEqual(this.id, botTrigger.id) && Intrinsics.areEqual(this.imageKey, botTrigger.imageKey) && Intrinsics.areEqual(this.name, botTrigger.name) && Intrinsics.areEqual(this.values, botTrigger.values);
    }

    @Nullable
    public final String getEvent() {
        return this.event;
    }

    @Nullable
    public final String getId() {
        return this.id;
    }

    @Nullable
    public final String getImageKey() {
        return this.imageKey;
    }

    @Nullable
    public final String getName() {
        return this.name;
    }

    @Nullable
    public final List<String> getValues() {
        return this.values;
    }

    public int hashCode() {
        String str = this.event;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.id;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.imageKey;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.name;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        List<String> list = this.values;
        return hashCode4 + (list != null ? list.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "BotTrigger(event=" + this.event + ", id=" + this.id + ", imageKey=" + this.imageKey + ", name=" + this.name + ", values=" + this.values + ')';
    }
}
