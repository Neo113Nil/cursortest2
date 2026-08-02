package io.agora.base.internal.voiceengine;

import android.annotation.TargetApi;
import android.media.audiofx.AcousticEchoCanceler;
import android.media.audiofx.AudioEffect;
import android.media.audiofx.AutomaticGainControl;
import android.media.audiofx.NoiseSuppressor;
import android.os.Build;
import com.facebook.react.uimanager.ViewProps;
import io.agora.base.internal.Logging;
import java.util.List;
import java.util.UUID;

/* loaded from: classes2.dex */
public class WebRtcAudioEffects {
    private static final boolean DEBUG = false;
    private static final String TAG = "WebRtcAudioEffects";
    private static final UUID AOSP_ACOUSTIC_ECHO_CANCELER = UUID.fromString("bb392ec0-8d4d-11e0-a896-0002a5d5c51b");
    private static final UUID AOSP_NOISE_SUPPRESSOR = UUID.fromString("c06c8400-8e06-11e0-9cb6-0002a5d5c51b");
    private static final UUID AOSP_AUTOMATIC_GAIN_CONTROL = UUID.fromString("aa8130e0-66fc-11e0-bad0-0002a5d5c51b");
    private static AudioEffect.Descriptor[] cachedEffects = null;
    private AcousticEchoCanceler aec = null;
    private NoiseSuppressor ns = null;
    private AutomaticGainControl agc = null;
    private boolean shouldEnableAec = false;
    private boolean shouldEnableNs = false;
    private boolean shouldEnableAgc = false;

    private WebRtcAudioEffects() {
        Logging.d(TAG, "ctor" + WebRtcAudioUtils.getThreadInfo());
    }

    private static void assertTrue(boolean z10) {
        if (!z10) {
            throw new AssertionError("Expected condition to be true");
        }
    }

    public static boolean canUseAcousticEchoCanceler() {
        boolean z10 = (!isAcousticEchoCancelerSupported() || WebRtcAudioUtils.useWebRtcBasedAcousticEchoCanceler() || isAcousticEchoCancelerBlacklisted() || isAcousticEchoCancelerExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseAcousticEchoCanceler: " + z10);
        return z10;
    }

    public static boolean canUseAutomaticGainControl() {
        boolean z10 = (!isAutomaticGainControlSupported() || WebRtcAudioUtils.useWebRtcBasedAutomaticGainControl() || isAutomaticGainControlBlacklisted() || isAutomaticGainControlExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseAutomaticGainControl: " + z10);
        return z10;
    }

    public static boolean canUseNoiseSuppressor() {
        boolean z10 = (!isNoiseSuppressorSupported() || WebRtcAudioUtils.useWebRtcBasedNoiseSuppressor() || isNoiseSuppressorBlacklisted() || isNoiseSuppressorExcludedByUUID()) ? false : true;
        Logging.d(TAG, "canUseNoiseSuppressor: " + z10);
        return z10;
    }

    public static WebRtcAudioEffects create() {
        return new WebRtcAudioEffects();
    }

    @TargetApi(18)
    private boolean effectTypeIsVoIP(UUID uuid) {
        if (!WebRtcAudioUtils.runningOnJellyBeanMR2OrHigher()) {
            return false;
        }
        if (AudioEffect.EFFECT_TYPE_AEC.equals(uuid) && isAcousticEchoCancelerSupported()) {
            return true;
        }
        return AudioEffect.EFFECT_TYPE_NS.equals(uuid) && isNoiseSuppressorSupported();
    }

    private static AudioEffect.Descriptor[] getAvailableEffects() {
        AudioEffect.Descriptor[] descriptorArr = cachedEffects;
        if (descriptorArr != null) {
            return descriptorArr;
        }
        AudioEffect.Descriptor[] queryEffects = AudioEffect.queryEffects();
        cachedEffects = queryEffects;
        return queryEffects;
    }

    public static boolean isAcousticEchoCancelerBlacklisted() {
        List<String> blackListedModelsForAecUsage = WebRtcAudioUtils.getBlackListedModelsForAecUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAecUsage.contains(str);
        if (contains) {
            Logging.w(TAG, str + " is blacklisted for HW AEC usage!");
        }
        return contains;
    }

    @TargetApi(18)
    private static boolean isAcousticEchoCancelerEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AEC);
    }

    @TargetApi(18)
    private static boolean isAcousticEchoCancelerExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AEC) && descriptor.uuid.equals(AOSP_ACOUSTIC_ECHO_CANCELER)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAcousticEchoCancelerSupported() {
        return isAcousticEchoCancelerEffectAvailable();
    }

    public static boolean isAutomaticGainControlBlacklisted() {
        List<String> blackListedModelsForAgcUsage = WebRtcAudioUtils.getBlackListedModelsForAgcUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForAgcUsage.contains(str);
        if (contains) {
            Logging.w(TAG, str + " is blacklisted for HW AGC usage!");
        }
        return contains;
    }

    @TargetApi(18)
    private static boolean isAutomaticGainControlEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_AGC);
    }

    @TargetApi(18)
    private static boolean isAutomaticGainControlExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_AGC) && descriptor.uuid.equals(AOSP_AUTOMATIC_GAIN_CONTROL)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isAutomaticGainControlSupported() {
        return isAutomaticGainControlEffectAvailable();
    }

    private static boolean isEffectTypeAvailable(UUID uuid) {
        AudioEffect.Descriptor[] availableEffects = getAvailableEffects();
        if (availableEffects == null) {
            return false;
        }
        for (AudioEffect.Descriptor descriptor : availableEffects) {
            if (descriptor.type.equals(uuid)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorBlacklisted() {
        List<String> blackListedModelsForNsUsage = WebRtcAudioUtils.getBlackListedModelsForNsUsage();
        String str = Build.MODEL;
        boolean contains = blackListedModelsForNsUsage.contains(str);
        if (contains) {
            Logging.w(TAG, str + " is blacklisted for HW NS usage!");
        }
        return contains;
    }

    @TargetApi(18)
    private static boolean isNoiseSuppressorEffectAvailable() {
        return isEffectTypeAvailable(AudioEffect.EFFECT_TYPE_NS);
    }

    @TargetApi(18)
    private static boolean isNoiseSuppressorExcludedByUUID() {
        for (AudioEffect.Descriptor descriptor : getAvailableEffects()) {
            if (descriptor.type.equals(AudioEffect.EFFECT_TYPE_NS) && descriptor.uuid.equals(AOSP_NOISE_SUPPRESSOR)) {
                return true;
            }
        }
        return false;
    }

    public static boolean isNoiseSuppressorSupported() {
        return isNoiseSuppressorEffectAvailable();
    }

    public void enable(int i10) {
        Logging.d(TAG, "enable(audioSession=" + i10 + ")");
        boolean z10 = false;
        assertTrue(this.aec == null);
        assertTrue(this.ns == null);
        assertTrue(this.agc == null);
        if (isAcousticEchoCancelerSupported() && this.shouldEnableAec) {
            AcousticEchoCanceler create = AcousticEchoCanceler.create(i10);
            this.aec = create;
            if (create != null) {
                boolean enabled = create.getEnabled();
                boolean z11 = this.shouldEnableAec && canUseAcousticEchoCanceler();
                if (this.aec.setEnabled(z11) != 0) {
                    Logging.e(TAG, "Failed to set the AcousticEchoCanceler state");
                }
                StringBuilder sb2 = new StringBuilder();
                sb2.append("AcousticEchoCanceler: was ");
                sb2.append(enabled ? ViewProps.ENABLED : "disabled");
                sb2.append(", enable: ");
                sb2.append(z11);
                sb2.append(", is now: ");
                sb2.append(this.aec.getEnabled() ? ViewProps.ENABLED : "disabled");
                Logging.d(TAG, sb2.toString());
            } else {
                Logging.e(TAG, "Failed to create the AcousticEchoCanceler instance");
            }
        }
        if (isNoiseSuppressorSupported() && this.shouldEnableNs) {
            NoiseSuppressor create2 = NoiseSuppressor.create(i10);
            this.ns = create2;
            if (create2 != null) {
                boolean enabled2 = create2.getEnabled();
                boolean z12 = this.shouldEnableNs && canUseNoiseSuppressor();
                if (this.ns.setEnabled(z12) != 0) {
                    Logging.e(TAG, "Failed to set the NoiseSuppressor state");
                }
                StringBuilder sb3 = new StringBuilder();
                sb3.append("NoiseSuppressor: was ");
                sb3.append(enabled2 ? ViewProps.ENABLED : "disabled");
                sb3.append(", enable: ");
                sb3.append(z12);
                sb3.append(", is now: ");
                sb3.append(this.ns.getEnabled() ? ViewProps.ENABLED : "disabled");
                Logging.d(TAG, sb3.toString());
            } else {
                Logging.e(TAG, "Failed to create the NoiseSuppressor instance");
            }
        }
        if (isAutomaticGainControlSupported() && this.shouldEnableAgc) {
            AutomaticGainControl create3 = AutomaticGainControl.create(i10);
            this.agc = create3;
            if (create3 == null) {
                Logging.e(TAG, "Failed to create the AutomaticGainControl instance");
                return;
            }
            boolean enabled3 = create3.getEnabled();
            if (this.shouldEnableAgc && canUseAutomaticGainControl()) {
                z10 = true;
            }
            if (this.agc.setEnabled(z10) != 0) {
                Logging.e(TAG, "Failed to set the AutomaticGainControl state");
            }
            StringBuilder sb4 = new StringBuilder();
            sb4.append("AutomaticGainControl: was ");
            sb4.append(enabled3 ? ViewProps.ENABLED : "disabled");
            sb4.append(", enable: ");
            sb4.append(z10);
            sb4.append(", is now: ");
            sb4.append(this.agc.getEnabled() ? ViewProps.ENABLED : "disabled");
            Logging.d(TAG, sb4.toString());
        }
    }

    public void release() {
        Logging.d(TAG, "release");
        AcousticEchoCanceler acousticEchoCanceler = this.aec;
        if (acousticEchoCanceler != null) {
            acousticEchoCanceler.release();
            this.aec = null;
            this.shouldEnableAec = false;
        }
        NoiseSuppressor noiseSuppressor = this.ns;
        if (noiseSuppressor != null) {
            noiseSuppressor.release();
            this.ns = null;
            this.shouldEnableNs = false;
        }
        AutomaticGainControl automaticGainControl = this.agc;
        if (automaticGainControl != null) {
            automaticGainControl.release();
            this.agc = null;
            this.shouldEnableAgc = false;
        }
    }

    public boolean setAEC(boolean z10) {
        Logging.d(TAG, "setAEC(" + z10 + ")");
        if (!canUseAcousticEchoCanceler()) {
            Logging.w(TAG, "Platform AEC is not supported");
            this.shouldEnableAec = false;
            return false;
        }
        if (this.aec == null || z10 == this.shouldEnableAec) {
            this.shouldEnableAec = z10;
            return true;
        }
        Logging.e(TAG, "Platform AEC state can't be modified while recording");
        return false;
    }

    public boolean setAGC(boolean z10) {
        Logging.d(TAG, "setAGC(" + z10 + ")");
        if (!canUseAutomaticGainControl()) {
            Logging.w(TAG, "Platform AGC is not supported");
            this.shouldEnableAgc = false;
            return false;
        }
        if (this.agc == null || z10 == this.shouldEnableAgc) {
            this.shouldEnableAgc = z10;
            return true;
        }
        Logging.e(TAG, "Platform AGC state can't be modified while recording");
        return false;
    }

    public boolean setNS(boolean z10) {
        Logging.d(TAG, "setNS(" + z10 + ")");
        if (!canUseNoiseSuppressor()) {
            Logging.w(TAG, "Platform NS is not supported");
            this.shouldEnableNs = false;
            return false;
        }
        if (this.ns == null || z10 == this.shouldEnableNs) {
            this.shouldEnableNs = z10;
            return true;
        }
        Logging.e(TAG, "Platform NS state can't be modified while recording");
        return false;
    }
}
