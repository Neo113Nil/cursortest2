package defpackage;

import android.media.AudioDescriptor;
import android.media.AudioDeviceInfo;
import android.media.AudioProfile;
import android.os.Build;
import com.mbridge.msdk.playercommon.exoplayer2.extractor.ts.PsExtractor;
import java.util.ArrayList;
import java.util.Comparator;
import java.util.Iterator;
import java.util.List;
import java.util.TreeSet;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes3.dex */
public abstract class hxh {
    public static final vvf a = hv9.z(12);

    public static hv9 a(AudioDeviceInfo audioDeviceInfo) {
        List<AudioProfile> audioProfiles = audioDeviceInfo.getAudioProfiles();
        TreeSet treeSet = new TreeSet(Comparator.comparing(new mn0(0)).reversed());
        Iterator<AudioProfile> it = audioProfiles.iterator();
        while (it.hasNext()) {
            AudioProfile b = ilg.b(it.next());
            if (b.getEncapsulationType() != 1 && nik.P(b.getFormat())) {
                for (int i : b.getChannelMasks()) {
                    treeSet.add(Integer.valueOf(i));
                }
            }
        }
        return hv9.v(treeSet);
    }

    public static hv9 b(AudioDeviceInfo audioDeviceInfo) {
        int type;
        hv9 hv9Var;
        int speakerLayoutChannelMask;
        boolean I = lz.I(audioDeviceInfo.getType());
        vvf vvfVar = a;
        if (!I) {
            if (audioDeviceInfo.getType() == 1) {
                return hv9.z(4);
            }
            if (audioDeviceInfo.getType() == 2) {
                if (Build.VERSION.SDK_INT >= 36 && (speakerLayoutChannelMask = audioDeviceInfo.getSpeakerLayoutChannelMask()) != 0 && speakerLayoutChannelMask != 1) {
                    return hv9.z(Integer.valueOf(speakerLayoutChannelMask));
                }
                tgj.d0("Built-in speaker's getSpeakerLayoutChannelMask not usable, defaulting to stereo.");
                return vvfVar;
            }
            int i = Build.VERSION.SDK_INT;
            if (i < 31 || audioDeviceInfo.getType() != 10) {
                if (i >= 31) {
                    int type2 = audioDeviceInfo.getType();
                    if (i >= 31 && type2 == 29) {
                        hv9 a2 = a(audioDeviceInfo);
                        if (!a2.isEmpty()) {
                            return a2;
                        }
                        List<AudioDescriptor> audioDescriptors = audioDeviceInfo.getAudioDescriptors();
                        if (i >= 34) {
                            if (i < 34 || audioDescriptors == null) {
                                av9 av9Var = hv9.b;
                                hv9Var = vvf.e;
                            } else {
                                ArrayList arrayList = new ArrayList();
                                Iterator<AudioDescriptor> it = audioDescriptors.iterator();
                                while (it.hasNext()) {
                                    AudioDescriptor f = a70.f(it.next());
                                    if (f.getStandard() == 2) {
                                        byte[] descriptor = f.getDescriptor();
                                        if (descriptor.length != 3) {
                                            tgj.d0("Invalid SADB length: " + descriptor.length);
                                        } else {
                                            if (Build.VERSION.SDK_INT >= 34 && descriptor.length == 3) {
                                                byte b = descriptor[0];
                                                r10 = (b & 1) != 0 ? 12 : 0;
                                                if ((b & 2) != 0) {
                                                    r10 |= 32;
                                                }
                                                if ((b & 4) != 0) {
                                                    r10 |= 16;
                                                }
                                                if ((b & 8) != 0) {
                                                    r10 |= PsExtractor.AUDIO_STREAM;
                                                }
                                                if ((b & 16) != 0) {
                                                    r10 |= 1024;
                                                }
                                                if ((b & 32) != 0) {
                                                    r10 |= 768;
                                                }
                                                if ((b & 128) != 0) {
                                                    r10 |= 201326592;
                                                }
                                                byte b2 = descriptor[1];
                                                if ((b2 & 1) != 0) {
                                                    r10 |= 81920;
                                                }
                                                if ((b2 & 2) != 0) {
                                                    r10 |= 8192;
                                                }
                                                if ((b2 & 4) != 0) {
                                                    r10 |= 32768;
                                                }
                                                if ((b2 & 8) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b2 & 16) != 0) {
                                                    r10 |= 33554432;
                                                }
                                                if ((b2 & 32) != 0) {
                                                    r10 |= 262144;
                                                }
                                                if ((b2 & 64) != 0) {
                                                    r10 |= 6144;
                                                }
                                                if ((b2 & 128) != 0) {
                                                    r10 |= 3145728;
                                                }
                                                byte b3 = descriptor[2];
                                                if ((b3 & 1) != 0) {
                                                    r10 |= 655360;
                                                }
                                                if ((b3 & 2) != 0) {
                                                    r10 = 8388608 | r10;
                                                }
                                                if ((b3 & 4) != 0) {
                                                    r10 |= 20971520;
                                                }
                                            }
                                            arrayList.add(Integer.valueOf(r10));
                                        }
                                    }
                                }
                                arrayList.sort(new z(2));
                                hv9Var = hv9.v(arrayList);
                            }
                            if (!hv9Var.isEmpty()) {
                                return hv9Var;
                            }
                        }
                        hv9 j = qz.j(audioDescriptors);
                        if (!j.isEmpty()) {
                            return j;
                        }
                    }
                }
                if (i >= 31 && ((type = audioDeviceInfo.getType()) == 11 || type == 12 || (i >= 31 && type == 22))) {
                    hv9 a3 = a(audioDeviceInfo);
                    if (!a3.isEmpty()) {
                        return a3;
                    }
                }
            } else {
                hv9 a4 = a(audioDeviceInfo);
                if (!a4.isEmpty()) {
                    return a4;
                }
                hv9 j2 = qz.j(audioDeviceInfo.getAudioDescriptors());
                if (!j2.isEmpty()) {
                    return j2;
                }
            }
        }
        return vvfVar;
    }
}
