package com.inmobi.ads;

import com.ironsource.U3;
import defpackage.gz8;
import defpackage.jp5;
import kotlin.Metadata;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0010\n\u0002\b\u0007\b\u0086\u0081\u0002\u0018\u0000 \u00072\b\u0012\u0004\u0012\u00020\u00000\u0001:\u0001\u0007B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003j\u0002\b\u0004j\u0002\b\u0005j\u0002\b\u0006¨\u0006\b"}, d2 = {"Lcom/inmobi/ads/AudioStatus;", "", "<init>", "(Ljava/lang/String;I)V", "PLAYING", "PAUSED", "COMPLETED", "Companion", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes4.dex */
public final class AudioStatus {
    private static final /* synthetic */ jp5 $ENTRIES;
    private static final /* synthetic */ AudioStatus[] $VALUES;

    /* renamed from: Companion, reason: from kotlin metadata */
    @NotNull
    public static final Companion INSTANCE;
    public static final AudioStatus PLAYING = new AudioStatus("PLAYING", 0);
    public static final AudioStatus PAUSED = new AudioStatus("PAUSED", 1);
    public static final AudioStatus COMPLETED = new AudioStatus("COMPLETED", 2);

    private static final /* synthetic */ AudioStatus[] $values() {
        return new AudioStatus[]{PLAYING, PAUSED, COMPLETED};
    }

    static {
        AudioStatus[] $values = $values();
        $VALUES = $values;
        $ENTRIES = gz8.G($values);
        INSTANCE = new Companion(null);
    }

    private AudioStatus(String str, int i) {
    }

    @NotNull
    public static AudioStatus from(int i) {
        return INSTANCE.from(i);
    }

    @NotNull
    public static jp5 getEntries() {
        return $ENTRIES;
    }

    public static int to(@NotNull AudioStatus audioStatus) {
        return INSTANCE.to(audioStatus).intValue();
    }

    public static AudioStatus valueOf(String str) {
        return (AudioStatus) Enum.valueOf(AudioStatus.class, str);
    }

    public static AudioStatus[] values() {
        return (AudioStatus[]) $VALUES.clone();
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\u0014\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0002\u0010\b\n\u0002\b\t\b\u0086\u0003\u0018\u00002\u000e\u0012\u0004\u0012\u00020\u0002\u0012\u0004\u0012\u00020\u00030\u0001B\t\b\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u0017\u0010\u0007\u001a\u00020\u00022\u0006\u0010\u0006\u001a\u00020\u0003H\u0017¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00032\u0006\u0010\t\u001a\u00020\u0002H\u0017¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lcom/inmobi/ads/AudioStatus$Companion;", "", "Lcom/inmobi/ads/AudioStatus;", "", "<init>", "()V", U3.i.X, "from", "(I)Lcom/inmobi/ads/AudioStatus;", "item", "to", "(Lcom/inmobi/ads/AudioStatus;)Ljava/lang/Integer;", "media_release"}, k = 1, mv = {2, 1, 0}, xi = 48)
    public static final class Companion {
        public /* synthetic */ Companion(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public AudioStatus from(int value) {
            return value != 0 ? value != 1 ? AudioStatus.COMPLETED : AudioStatus.PAUSED : AudioStatus.PLAYING;
        }

        @NotNull
        public Integer to(@NotNull AudioStatus item) {
            item.getClass();
            return Integer.valueOf(item.ordinal());
        }

        private Companion() {
        }

        public /* bridge */ /* synthetic */ Object from(Object obj) {
            return from(((Number) obj).intValue());
        }
    }
}
