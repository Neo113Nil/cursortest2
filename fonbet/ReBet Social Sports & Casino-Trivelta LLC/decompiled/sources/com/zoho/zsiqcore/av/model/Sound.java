package com.zoho.zsiqcore.av.model;

import androidx.annotation.Keep;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@Keep
@Metadata(d1 = {"\u0000&\n\u0000\n\u0002\u0010\u0000\n\u0002\u0010\u000e\n\u0002\b\u000f\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0010\u000b\n\u0002\b\u0011\b\u0087\b\u0018\u00002\u00020\u0001BO\u0012\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u0002\u0012\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002¢\u0006\u0004\b\t\u0010\nJ\u0012\u0010\u000b\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000b\u0010\fJ\u0012\u0010\r\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\r\u0010\fJ\u0012\u0010\u000e\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000e\u0010\fJ\u0012\u0010\u000f\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u000f\u0010\fJ\u0012\u0010\u0010\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0010\u0010\fJ\u0012\u0010\u0011\u001a\u0004\u0018\u00010\u0002HÆ\u0003¢\u0006\u0004\b\u0011\u0010\fJX\u0010\u0013\u001a\u00020\u00122\n\b\u0002\u0010\u0003\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0004\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0005\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0006\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\u0007\u001a\u0004\u0018\u00010\u00022\n\b\u0002\u0010\b\u001a\u0004\u0018\u00010\u0002HÆ\u0001¢\u0006\u0004\b\u0013\u0010\u0014J\u0010\u0010\u0015\u001a\u00020\u0002HÖ\u0001¢\u0006\u0004\b\u0015\u0010\fJ\u0010\u0010\u0017\u001a\u00020\u0016HÖ\u0001¢\u0006\u0004\b\u0017\u0010\u0018J\u001a\u0010\u001b\u001a\u00020\u001a2\b\u0010\u0019\u001a\u0004\u0018\u00010\u0001HÖ\u0003¢\u0006\u0004\b\u001b\u0010\u001cR$\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0003\u0010\u001d\u001a\u0004\b\u001e\u0010\f\"\u0004\b\u001f\u0010 R$\u0010\u0004\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0004\u0010\u001d\u001a\u0004\b!\u0010\f\"\u0004\b\"\u0010 R$\u0010\u0005\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0005\u0010\u001d\u001a\u0004\b#\u0010\f\"\u0004\b$\u0010 R$\u0010\u0006\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0006\u0010\u001d\u001a\u0004\b%\u0010\f\"\u0004\b&\u0010 R$\u0010\u0007\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\u0007\u0010\u001d\u001a\u0004\b'\u0010\f\"\u0004\b(\u0010 R$\u0010\b\u001a\u0004\u0018\u00010\u00028\u0006@\u0006X\u0086\u000e¢\u0006\u0012\n\u0004\b\b\u0010\u001d\u001a\u0004\b)\u0010\f\"\u0004\b*\u0010 ¨\u0006+"}, d2 = {"com/zoho/zsiqcore/av/model/ZSIQConfigurations$Sound", "", "", "ringtone", "ping", "buzz", "hold", "waiting", "shortNotification", "<init>", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)V", "component1", "()Ljava/lang/String;", "component2", "component3", "component4", "component5", "component6", "Lcom/zoho/zsiqcore/av/model/ZSIQConfigurations$Sound;", "copy", "(Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;Ljava/lang/String;)Lcom/zoho/zsiqcore/av/model/ZSIQConfigurations$Sound;", "toString", "", "hashCode", "()I", "other", "", "equals", "(Ljava/lang/Object;)Z", "Ljava/lang/String;", "getRingtone", "setRingtone", "(Ljava/lang/String;)V", "getPing", "setPing", "getBuzz", "setBuzz", "getHold", "setHold", "getWaiting", "setWaiting", "getShortNotification", "setShortNotification", "core_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* renamed from: com.zoho.zsiqcore.av.model.ZSIQConfigurations$Sound, reason: from toString */
/* loaded from: classes4.dex */
public final /* data */ class Sound {

    @Nullable
    private String buzz;

    @Nullable
    private String hold;

    @Nullable
    private String ping;

    @Nullable
    private String ringtone;

    @Nullable
    private String shortNotification;

    @Nullable
    private String waiting;

    public Sound() {
        this(null, null, null, null, null, null, 63, null);
    }

    public static /* synthetic */ Sound copy$default(Sound sound, String str, String str2, String str3, String str4, String str5, String str6, int i10, Object obj) {
        if ((i10 & 1) != 0) {
            str = sound.ringtone;
        }
        if ((i10 & 2) != 0) {
            str2 = sound.ping;
        }
        if ((i10 & 4) != 0) {
            str3 = sound.buzz;
        }
        if ((i10 & 8) != 0) {
            str4 = sound.hold;
        }
        if ((i10 & 16) != 0) {
            str5 = sound.waiting;
        }
        if ((i10 & 32) != 0) {
            str6 = sound.shortNotification;
        }
        String str7 = str5;
        String str8 = str6;
        return sound.copy(str, str2, str3, str4, str7, str8);
    }

    @Nullable
    /* renamed from: component1, reason: from getter */
    public final String getRingtone() {
        return this.ringtone;
    }

    @Nullable
    /* renamed from: component2, reason: from getter */
    public final String getPing() {
        return this.ping;
    }

    @Nullable
    /* renamed from: component3, reason: from getter */
    public final String getBuzz() {
        return this.buzz;
    }

    @Nullable
    /* renamed from: component4, reason: from getter */
    public final String getHold() {
        return this.hold;
    }

    @Nullable
    /* renamed from: component5, reason: from getter */
    public final String getWaiting() {
        return this.waiting;
    }

    @Nullable
    /* renamed from: component6, reason: from getter */
    public final String getShortNotification() {
        return this.shortNotification;
    }

    @NotNull
    public final Sound copy(@Nullable String ringtone, @Nullable String ping, @Nullable String buzz, @Nullable String hold, @Nullable String waiting, @Nullable String shortNotification) {
        return new Sound(ringtone, ping, buzz, hold, waiting, shortNotification);
    }

    public boolean equals(@Nullable Object other) {
        if (this == other) {
            return true;
        }
        if (!(other instanceof Sound)) {
            return false;
        }
        Sound sound = (Sound) other;
        return Intrinsics.areEqual(this.ringtone, sound.ringtone) && Intrinsics.areEqual(this.ping, sound.ping) && Intrinsics.areEqual(this.buzz, sound.buzz) && Intrinsics.areEqual(this.hold, sound.hold) && Intrinsics.areEqual(this.waiting, sound.waiting) && Intrinsics.areEqual(this.shortNotification, sound.shortNotification);
    }

    @Nullable
    public final String getBuzz() {
        return this.buzz;
    }

    @Nullable
    public final String getHold() {
        return this.hold;
    }

    @Nullable
    public final String getPing() {
        return this.ping;
    }

    @Nullable
    public final String getRingtone() {
        return this.ringtone;
    }

    @Nullable
    public final String getShortNotification() {
        return this.shortNotification;
    }

    @Nullable
    public final String getWaiting() {
        return this.waiting;
    }

    public int hashCode() {
        String str = this.ringtone;
        int hashCode = (str == null ? 0 : str.hashCode()) * 31;
        String str2 = this.ping;
        int hashCode2 = (hashCode + (str2 == null ? 0 : str2.hashCode())) * 31;
        String str3 = this.buzz;
        int hashCode3 = (hashCode2 + (str3 == null ? 0 : str3.hashCode())) * 31;
        String str4 = this.hold;
        int hashCode4 = (hashCode3 + (str4 == null ? 0 : str4.hashCode())) * 31;
        String str5 = this.waiting;
        int hashCode5 = (hashCode4 + (str5 == null ? 0 : str5.hashCode())) * 31;
        String str6 = this.shortNotification;
        return hashCode5 + (str6 != null ? str6.hashCode() : 0);
    }

    public final void setBuzz(@Nullable String str) {
        this.buzz = str;
    }

    public final void setHold(@Nullable String str) {
        this.hold = str;
    }

    public final void setPing(@Nullable String str) {
        this.ping = str;
    }

    public final void setRingtone(@Nullable String str) {
        this.ringtone = str;
    }

    public final void setShortNotification(@Nullable String str) {
        this.shortNotification = str;
    }

    public final void setWaiting(@Nullable String str) {
        this.waiting = str;
    }

    @NotNull
    public String toString() {
        return "Sound(ringtone=" + this.ringtone + ", ping=" + this.ping + ", buzz=" + this.buzz + ", hold=" + this.hold + ", waiting=" + this.waiting + ", shortNotification=" + this.shortNotification + ')';
    }

    public Sound(@Nullable String str, @Nullable String str2, @Nullable String str3, @Nullable String str4, @Nullable String str5, @Nullable String str6) {
        this.ringtone = str;
        this.ping = str2;
        this.buzz = str3;
        this.hold = str4;
        this.waiting = str5;
        this.shortNotification = str6;
    }

    public /* synthetic */ Sound(String str, String str2, String str3, String str4, String str5, String str6, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this((i10 & 1) != 0 ? null : str, (i10 & 2) != 0 ? null : str2, (i10 & 4) != 0 ? null : str3, (i10 & 8) != 0 ? null : str4, (i10 & 16) != 0 ? null : str5, (i10 & 32) != 0 ? null : str6);
    }
}
