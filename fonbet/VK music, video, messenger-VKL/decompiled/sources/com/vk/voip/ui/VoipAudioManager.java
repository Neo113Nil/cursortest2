package com.vk.voip.ui;

import xsna.asp;
import xsna.pew0;
import xsna.zrp;

/* compiled from: VoipAudioManager.kt */
/* loaded from: classes7.dex */
public interface VoipAudioManager extends pew0.b {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VoipAudioManager.kt */
    public static final class LoudspeakerMode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ LoudspeakerMode[] $VALUES;
        public static final LoudspeakerMode ALWAYS;
        public static final LoudspeakerMode DEFAULT;
        public static final LoudspeakerMode ON_START;

        static {
            LoudspeakerMode loudspeakerMode = new LoudspeakerMode("DEFAULT", 0);
            DEFAULT = loudspeakerMode;
            LoudspeakerMode loudspeakerMode2 = new LoudspeakerMode("ON_START", 1);
            ON_START = loudspeakerMode2;
            LoudspeakerMode loudspeakerMode3 = new LoudspeakerMode("ALWAYS", 2);
            ALWAYS = loudspeakerMode3;
            LoudspeakerMode[] loudspeakerModeArr = {loudspeakerMode, loudspeakerMode2, loudspeakerMode3};
            $VALUES = loudspeakerModeArr;
            $ENTRIES = new asp(loudspeakerModeArr);
        }

        public LoudspeakerMode() {
            throw null;
        }

        public static LoudspeakerMode valueOf(String str) {
            return (LoudspeakerMode) Enum.valueOf(LoudspeakerMode.class, str);
        }

        public static LoudspeakerMode[] values() {
            return (LoudspeakerMode[]) $VALUES.clone();
        }
    }

    void a();
}
