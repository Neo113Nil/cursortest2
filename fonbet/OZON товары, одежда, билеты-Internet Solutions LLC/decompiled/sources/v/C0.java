package v;

import android.media.CamcorderProfile;
import android.media.EncoderProfiles;
import android.os.Build;
import android.util.Size;
import androidx.annotation.NonNull;
import androidx.camera.camera2.internal.compat.quirk.CamcorderProfileResolutionQuirk;
import androidx.camera.camera2.internal.compat.quirk.InvalidVideoProfilesQuirk;
import androidx.camera.core.impl.InterfaceC5084b0;
import androidx.camera.core.impl.InterfaceC5086c0;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes8.dex */
public final class C0 implements InterfaceC5084b0 {

    /* renamed from: b, reason: collision with root package name */
    private final boolean f100867b;

    /* renamed from: c, reason: collision with root package name */
    private final String f100868c;

    /* renamed from: d, reason: collision with root package name */
    private final int f100869d;

    /* renamed from: e, reason: collision with root package name */
    private final HashMap f100870e = new HashMap();

    /* renamed from: f, reason: collision with root package name */
    private final androidx.camera.core.impl.I0 f100871f;

    static class a {
        static EncoderProfiles a(int i11, String str) {
            return CamcorderProfile.getAll(str, i11);
        }
    }

    public C0(@NonNull String str, @NonNull androidx.camera.core.impl.I0 i02) {
        boolean z11;
        int i11;
        this.f100868c = str;
        try {
            i11 = Integer.parseInt(str);
            z11 = true;
        } catch (NumberFormatException unused) {
            C.S.k("Camera2EncoderProfilesProvider", "Camera id is not an integer: " + str + ", unable to create Camera2EncoderProfilesProvider");
            z11 = false;
            i11 = -1;
        }
        this.f100867b = z11;
        this.f100869d = i11;
        this.f100871f = i02;
    }

    /* JADX WARN: Can't wrap try/catch for region: R(10:10|(7:12|(2:45|(1:47)(6:48|49|(4:16|(2:41|(2:43|(2:20|(5:22|(3:25|(4:27|28|29|30)(1:31)|23)|32|29|30)(3:(3:34|(2:36|(2:39|28)(1:38))|40)|29|30))))|18|(0))|44|29|30))|14|(0)|44|29|30)|53|54|(14:56|(1:58)|59|60|62|(2:64|(1:(1:67)(1:68)))(1:82)|69|70|71|73|(0)|44|29|30)|14|(0)|44|29|30) */
    /* JADX WARN: Code restructure failed: missing block: B:89:0x005c, code lost:
    
        r0 = move-exception;
     */
    /* JADX WARN: Code restructure failed: missing block: B:90:0x005d, code lost:
    
        C.S.l("Camera2EncoderProfilesProvider", "Unable to get CamcorderProfile by quality: " + r20, r0);
        r0 = null;
     */
    /* JADX WARN: Removed duplicated region for block: B:16:0x010a  */
    /* JADX WARN: Removed duplicated region for block: B:20:0x0142  */
    @Override // androidx.camera.core.impl.InterfaceC5084b0
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final InterfaceC5086c0 a(int i11) {
        String str;
        int i12;
        String str2;
        InterfaceC5086c0 e11;
        boolean contains;
        InterfaceC5086c0 a11;
        InterfaceC5086c0 interfaceC5086c0 = null;
        if (this.f100867b) {
            int i13 = this.f100869d;
            if (CamcorderProfile.hasProfile(i13, i11)) {
                HashMap hashMap = this.f100870e;
                if (hashMap.containsKey(Integer.valueOf(i11))) {
                    return (InterfaceC5086c0) hashMap.get(Integer.valueOf(i11));
                }
                if (Build.VERSION.SDK_INT >= 31) {
                    EncoderProfiles a12 = a.a(i11, this.f100868c);
                    if (a12 != null) {
                        if (androidx.camera.camera2.internal.compat.quirk.b.b(InvalidVideoProfilesQuirk.class) == null) {
                            try {
                                e11 = F.a.a(a12);
                            } catch (NullPointerException e12) {
                                C.S.l("Camera2EncoderProfilesProvider", "Failed to create EncoderProfilesProxy, EncoderProfiles might  contain invalid video profiles. Use CamcorderProfile instead.", e12);
                            }
                            if (e11 != null) {
                                CamcorderProfileResolutionQuirk camcorderProfileResolutionQuirk = (CamcorderProfileResolutionQuirk) this.f100871f.b(CamcorderProfileResolutionQuirk.class);
                                if (camcorderProfileResolutionQuirk != null) {
                                    List<InterfaceC5086c0.c> d11 = e11.d();
                                    if (!d11.isEmpty()) {
                                        InterfaceC5086c0.c cVar = d11.get(0);
                                        contains = camcorderProfileResolutionQuirk.e().contains(new Size(cVar.k(), cVar.h()));
                                        if (!contains) {
                                            List<Integer> list = InterfaceC5084b0.f38260a;
                                            if (i11 == 1) {
                                                Iterator<Integer> it = list.iterator();
                                                while (it.hasNext()) {
                                                    a11 = a(it.next().intValue());
                                                    if (a11 != null) {
                                                        interfaceC5086c0 = a11;
                                                        hashMap.put(Integer.valueOf(i11), interfaceC5086c0);
                                                        return interfaceC5086c0;
                                                    }
                                                }
                                                hashMap.put(Integer.valueOf(i11), interfaceC5086c0);
                                                return interfaceC5086c0;
                                            }
                                            if (i11 == 0) {
                                                for (int size = list.size() - 1; size >= 0; size--) {
                                                    a11 = a(size);
                                                    if (a11 != null) {
                                                        interfaceC5086c0 = a11;
                                                    }
                                                }
                                            }
                                            hashMap.put(Integer.valueOf(i11), interfaceC5086c0);
                                            return interfaceC5086c0;
                                        }
                                    }
                                }
                                contains = true;
                                if (!contains) {
                                }
                            }
                            interfaceC5086c0 = e11;
                            hashMap.put(Integer.valueOf(i11), interfaceC5086c0);
                            return interfaceC5086c0;
                        }
                        C.S.a("Camera2EncoderProfilesProvider", "EncoderProfiles contains invalid video profiles, use CamcorderProfile to create EncoderProfilesProxy.");
                    }
                    e11 = null;
                    if (e11 != null) {
                    }
                    interfaceC5086c0 = e11;
                    hashMap.put(Integer.valueOf(i11), interfaceC5086c0);
                    return interfaceC5086c0;
                }
                CamcorderProfile camcorderProfile = CamcorderProfile.get(i13, i11);
                if (camcorderProfile != null) {
                    int i14 = Build.VERSION.SDK_INT;
                    if (i14 >= 31) {
                        C.S.k("EncoderProfilesProxyCompat", "Should use from(EncoderProfiles) on API " + i14 + "instead. CamcorderProfile is deprecated on API 31.");
                    }
                    int i15 = camcorderProfile.duration;
                    int i16 = camcorderProfile.fileFormat;
                    ArrayList arrayList = new ArrayList();
                    int i17 = camcorderProfile.audioCodec;
                    switch (i17) {
                        case 1:
                            str = "audio/3gpp";
                            break;
                        case 2:
                            str = "audio/amr-wb";
                            break;
                        case 3:
                        case 4:
                        case 5:
                            str = "audio/mp4a-latm";
                            break;
                        case 6:
                            str = "audio/vorbis";
                            break;
                        case 7:
                            str = "audio/opus";
                            break;
                        default:
                            str = "audio/none";
                            break;
                    }
                    int i18 = camcorderProfile.audioBitRate;
                    int i19 = camcorderProfile.audioSampleRate;
                    int i21 = camcorderProfile.audioChannels;
                    if (i17 != 3) {
                        i12 = 5;
                        if (i17 != 4) {
                            i12 = i17 != 5 ? -1 : 39;
                        }
                    } else {
                        i12 = 2;
                    }
                    arrayList.add(InterfaceC5086c0.a.a(str, i17, i18, i19, i21, i12));
                    ArrayList arrayList2 = new ArrayList();
                    int i22 = camcorderProfile.videoCodec;
                    switch (i22) {
                        case 1:
                            str2 = "video/3gpp";
                            break;
                        case 2:
                            str2 = "video/avc";
                            break;
                        case 3:
                            str2 = "video/mp4v-es";
                            break;
                        case 4:
                            str2 = "video/x-vnd.on2.vp8";
                            break;
                        case 5:
                            str2 = "video/hevc";
                            break;
                        case 6:
                            str2 = "video/x-vnd.on2.vp9";
                            break;
                        case 7:
                            str2 = "video/dolby-vision";
                            break;
                        case 8:
                            str2 = "video/av01";
                            break;
                        default:
                            str2 = "video/none";
                            break;
                    }
                    arrayList2.add(InterfaceC5086c0.c.a(i22, str2, camcorderProfile.videoBitRate, camcorderProfile.videoFrameRate, camcorderProfile.videoFrameWidth, camcorderProfile.videoFrameHeight, -1, 8, 0, 0));
                    e11 = InterfaceC5086c0.b.e(i15, i16, arrayList, arrayList2);
                    if (e11 != null) {
                    }
                    interfaceC5086c0 = e11;
                    hashMap.put(Integer.valueOf(i11), interfaceC5086c0);
                    return interfaceC5086c0;
                }
                e11 = null;
                if (e11 != null) {
                }
                interfaceC5086c0 = e11;
                hashMap.put(Integer.valueOf(i11), interfaceC5086c0);
                return interfaceC5086c0;
            }
        }
        return null;
    }

    @Override // androidx.camera.core.impl.InterfaceC5084b0
    public final boolean b(int i11) {
        return this.f100867b && a(i11) != null;
    }
}
