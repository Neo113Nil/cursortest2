package com.zoho.livechat.android.modules.triggers.domain.entities;

import Gb.c;
import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0010\t\n\u0000\n\u0002\u0010\u000e\n\u0002\b\u000b\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0002\b\u0087\b\u0018\u00002\u00020\u0001B\u0019\u0012\b\u0010\u0002\u001a\u0004\u0018\u00010\u0003\u0012\b\u0010\u0004\u001a\u0004\u0018\u00010\u0005¢\u0006\u0002\u0010\u0006J\u0010\u0010\f\u001a\u0004\u0018\u00010\u0003HÆ\u0003¢\u0006\u0002\u0010\nJ\u000b\u0010\r\u001a\u0004\u0018\u00010\u0005HÆ\u0003J&\u0010\u000e\u001a\u00020\u00002\n\b\u0002\u0010\u0002\u001a\u0004\u0018\u00010\u00032\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0005HÆ\u0001¢\u0006\u0002\u0010\u000fJ\u0013\u0010\u0010\u001a\u00020\u00112\b\u0010\u0012\u001a\u0004\u0018\u00010\u0001HÖ\u0003J\t\u0010\u0013\u001a\u00020\u0014HÖ\u0001J\t\u0010\u0015\u001a\u00020\u0005HÖ\u0001R\u0018\u0010\u0004\u001a\u0004\u0018\u00010\u00058\u0006X\u0087\u0004¢\u0006\b\n\u0000\u001a\u0004\b\u0007\u0010\bR\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u00038\u0006X\u0087\u0004¢\u0006\n\n\u0002\u0010\u000b\u001a\u0004\b\t\u0010\n¨\u0006\u0016"}, d2 = {"Lcom/zoho/livechat/android/modules/triggers/domain/entities/TriggerAlarm;", "", "time", "", "customActionName", "", "(Ljava/lang/Long;Ljava/lang/String;)V", "getCustomActionName", "()Ljava/lang/String;", "getTime", "()Ljava/lang/Long;", "Ljava/lang/Long;", "component1", "component2", "copy", "(Ljava/lang/Long;Ljava/lang/String;)Lcom/zoho/livechat/android/modules/triggers/domain/entities/TriggerAlarm;", "equals", "", "other", "hashCode", "", "toString", "mobilisten_release"}, k = 1, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes4.dex */
public final /* data */ class TriggerAlarm {

    @c("custom_action_name")
    @Nullable
    private final String customActionName;

    @c("time")
    @Nullable
    private final Long time;

    public TriggerAlarm(@Nullable Long l10, @Nullable String str) {
        this.time = l10;
        this.customActionName = str;
    }

    public static /* synthetic */ TriggerAlarm copy$default(TriggerAlarm triggerAlarm, Long l10, String str, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            l10 = triggerAlarm.time;
        }
        if ((i10 & 2) != 0) {
            str = triggerAlarm.customActionName;
        }
        return triggerAlarm.copy(l10, str);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final Long getTime() {
        return this.time;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getCustomActionName() {
        return this.customActionName;
    }

    @NotNull
    public final TriggerAlarm copy(@Nullable Long time, @Nullable String customActionName) {
        return new TriggerAlarm(time, customActionName);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof TriggerAlarm)) {
            return false;
        }
        TriggerAlarm triggerAlarm = (TriggerAlarm) other;
        return Intrinsics.areEqual(this.time, triggerAlarm.time) && Intrinsics.areEqual(this.customActionName, triggerAlarm.customActionName);
    }

    @Nullable
    public final String getCustomActionName() {
        return this.customActionName;
    }

    @Nullable
    public final Long getTime() {
        return this.time;
    }

    public int hashCode() {
        Long l10 = this.time;
        int hashCode = (l10 == null ? 0 : l10.hashCode()) * 31;
        String str = this.customActionName;
        return hashCode + (str != null ? str.hashCode() : 0);
    }

    @NotNull
    public String toString() {
        return "TriggerAlarm(time=" + this.time + ", customActionName=" + this.customActionName + ')';
    }
}
