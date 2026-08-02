package com.google.android.gms.internal.ads;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import com.google.android.exoplayer2.extractor.ts.PsExtractor;
import com.google.common.base.Ascii;
import com.google.common.primitives.SignedBytes;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: com.google.android.gms:play-services-ads@@25.1.0 */
/* loaded from: classes7.dex */
final class zztt {
    private static final zzgvz zza = zzgvz.zzj(12);

    public static zzgvz zza(AudioDeviceInfo audioDeviceInfo) {
        int type;
        zzgvz zzi;
        int speakerLayoutChannelMask;
        if (!zztm.zza(audioDeviceInfo.getType())) {
            if (audioDeviceInfo.getType() == 1) {
                return zzgvz.zzj(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return zzgvz.zzj(Integer.valueOf(speakerLayoutChannelMask));
                }
                zzef.zzc("SpeakerLayoutUtil", "Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return zza;
            }
            if (Build.VERSION.SDK_INT < 31 || audioDeviceInfo.getType() != 10) {
                if (Build.VERSION.SDK_INT >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (Build.VERSION.SDK_INT >= 31 && type2 == 29) {
                        zzgvz zzb = zzb(audioDeviceInfo);
                        if (!zzb.isEmpty()) {
                            return zzb;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (Build.VERSION.SDK_INT >= 34) {
                            if (Build.VERSION.SDK_INT < 34 || audioDescriptors == null) {
                                zzi = zzgvz.zzi();
                            } else {
                                ArrayList arrayList = new ArrayList();
                                for (AudioDescriptor audioDescriptor : audioDescriptors) {
                                    if (audioDescriptor.getStandard() == 2) {
                                        byte[] descriptor = audioDescriptor.getDescriptor();
                                        int length = descriptor.length;
                                        if (length != 3) {
                                            StringBuilder sb = new StringBuilder(String.valueOf(length).length() + 21);
                                            sb.append("Invalid SADB length: ");
                                            sb.append(length);
                                            zzef.zzc("AudioDescriptorUtil", sb.toString());
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                byte b = descriptor[0];
                                                r8 = 1 == (b & 1) ? 12 : 0;
                                                if ((b & 2) != 0) {
                                                    r8 |= 32;
                                                }
                                                if ((b & 4) != 0) {
                                                    r8 |= 16;
                                                }
                                                if ((b & 8) != 0) {
                                                    r8 |= PsExtractor.AUDIO_STREAM;
                                                }
                                                if ((b & Ascii.DLE) != 0) {
                                                    r8 |= 1024;
                                                }
                                                if ((b & 32) != 0) {
                                                    r8 |= 768;
                                                }
                                                if ((b & 128) != 0) {
                                                    r8 |= 201326592;
                                                }
                                                byte b2 = descriptor[1];
                                                if ((b2 & 1) != 0) {
                                                    r8 |= 81920;
                                                }
                                                if ((b2 & 2) != 0) {
                                                    r8 |= 8192;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    r8 |= 32768;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    r8 |= 6144;
                                                }
                                                if ((b2 & Ascii.DLE) != 0) {
                                                    r8 |= 33554432;
                                                }
                                                if ((b2 & 32) != 0) {
                                                    r8 |= 262144;
                                                }
                                                if ((b2 & SignedBytes.MAX_POWER_OF_TWO) != 0) {
                                                    r8 |= 6144;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    r8 |= 3145728;
                                                }
                                                byte b3 = descriptor[2];
                                                if ((b3 & 1) != 0) {
                                                    r8 |= 655360;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    r8 = 8388608 | r8;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    r8 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r8));
                                        }
                                    }
                                }
                                arrayList.sort(zzqi.zza);
                                zzi = zzgvz.zzq(arrayList);
                            }
                            if (!zzi.isEmpty()) {
                                return zzi;
                            }
                        }
                        zzgvz zza2 = zzqk.zza(audioDescriptors);
                        if (!zza2.isEmpty()) {
                            return zza2;
                        }
                    }
                }
                if (Build.VERSION.SDK_INT >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (Build.VERSION.SDK_INT >= 31 && type == 22))) {
                    zzgvz zzb2 = zzb(audioDeviceInfo);
                    if (!zzb2.isEmpty()) {
                        return zzb2;
                    }
                }
            } else {
                zzgvz zzb3 = zzb(audioDeviceInfo);
                if (!zzb3.isEmpty()) {
                    return zzb3;
                }
                zzgvz zza3 = zzqk.zza(audioDeviceInfo.getAudioDescriptors());
                if (!zza3.isEmpty()) {
                    return zza3;
                }
            }
        }
        return zza;
    }

    private static zzgvz zzb(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(zzts.zza).reversed());
        for (AudioProfile audioProfile : audioProfiles) {
            if (audioProfile.getEncapsulationType() != 1 && zzfk.zzC(audioProfile.getFormat())) {
                for (int i : audioProfile.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return zzgvz.zzq(treeSet);
    }
}
