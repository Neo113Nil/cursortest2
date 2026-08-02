package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import com.google.android.gms.internal.ads.s;
import com.google.android.gms.internal.ads.zzeh;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzgxm;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class c8p {
    public static final s a = zzgxm.t(12);

    public static zzgxm a(AudioDeviceInfo audioDeviceInfo) {
        int type;
        zzgxm zzgxmVar;
        int speakerLayoutChannelMask;
        boolean k0 = aik.k0(audioDeviceInfo.getType());
        s sVar = a;
        if (!k0) {
            if (audioDeviceInfo.getType() == 1) {
                return zzgxm.t(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return zzgxm.t(Integer.valueOf(speakerLayoutChannelMask));
                }
                zzeh.c("Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return sVar;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || audioDeviceInfo.getType() != 10) {
                if (i >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i >= 31 && type2 == 29) {
                        zzgxm b = b(audioDeviceInfo);
                        if (!b.isEmpty()) {
                            return b;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i < 34 || audioDescriptors == null) {
                                mio mioVar = zzgxm.b;
                                zzgxmVar = s.e;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor f = a70.f(it.next());
                                    if (f.getStandard() == 2) {
                                        byte[] descriptor = f.getDescriptor();
                                        int length = descriptor.length;
                                        if (length != 3) {
                                            x5n.p(length, "Invalid SADB length: ", new StringBuilder(String.valueOf(length).length() + 21));
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34) {
                                                byte b2 = descriptor[0];
                                                r9 = 1 == (b2 & 1) ? 12 : 0;
                                                if ((b2 & 2) != 0) {
                                                    r9 |= 32;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    r9 |= 16;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    r9 |= PsExtractor.AUDIO_STREAM;
                                                }
                                                if ((b2 & 16) != 0) {
                                                    r9 |= 1024;
                                                }
                                                if ((b2 & 32) != 0) {
                                                    r9 |= 768;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    r9 |= 201326592;
                                                }
                                                byte b3 = descriptor[1];
                                                if ((b3 & 1) != 0) {
                                                    r9 |= 81920;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    r9 |= 8192;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    r9 |= 32768;
                                                }
                                                if ((b3 & 8) != 0) {
                                                    r9 |= 6144;
                                                }
                                                if ((b3 & 16) != 0) {
                                                    r9 |= 33554432;
                                                }
                                                if ((b3 & 32) != 0) {
                                                    r9 |= 262144;
                                                }
                                                if ((b3 & 64) != 0) {
                                                    r9 |= 6144;
                                                }
                                                if ((b3 & 128) != 0) {
                                                    r9 |= 3145728;
                                                }
                                                byte b4 = descriptor[2];
                                                if ((b4 & 1) != 0) {
                                                    r9 |= 655360;
                                                }
                                                if ((b4 & 2) != 0) {
                                                    r9 = 8388608 | r9;
                                                }
                                                if ((b4 & 4) != 0) {
                                                    r9 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r9));
                                        }
                                    }
                                }
                                arrayList.sort(v4n.o);
                                zzgxmVar = zzgxm.x(arrayList);
                            }
                            if (!zzgxmVar.isEmpty()) {
                                return zzgxmVar;
                            }
                        }
                        zzgxm E = qz.E(audioDescriptors);
                        if (!E.isEmpty()) {
                            return E;
                        }
                    }
                }
                if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    zzgxm b5 = b(audioDeviceInfo);
                    if (!b5.isEmpty()) {
                        return b5;
                    }
                }
            } else {
                zzgxm b6 = b(audioDeviceInfo);
                if (!b6.isEmpty()) {
                    return b6;
                }
                zzgxm E2 = qz.E(audioDeviceInfo.getAudioDescriptors());
                if (!E2.isEmpty()) {
                    return E2;
                }
            }
        }
        return sVar;
    }

    public static zzgxm b(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(nvo.d).reversed());
        Iterator<AudioProfile> it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile b = ilg.b(it.next());
            if (b.getEncapsulationType() != 1 && zzfm.d(b.getFormat())) {
                for (int i : b.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return zzgxm.x(treeSet);
    }
}
