package defpackage;

import android.media.AudioDeviceCallback;
import android.media.AudioDeviceInfo;
import com.google.android.gms.internal.ads.zzfm;
import com.google.android.gms.internal.ads.zzqr;
import java.util.Objects;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class kn0 extends AudioDeviceCallback {
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;

    public /* synthetic */ kn0(Object obj, int i) {
        this.a = i;
        this.b = obj;
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesAdded(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                ((i1k) obj).i();
                break;
            default:
                ((zzqr) obj).c();
                break;
        }
    }

    @Override // android.media.AudioDeviceCallback
    public final void onAudioDevicesRemoved(AudioDeviceInfo[] audioDeviceInfoArr) {
        int i = this.a;
        Object obj = this.b;
        switch (i) {
            case 0:
                i1k i1kVar = (i1k) obj;
                if (nik.m(audioDeviceInfoArr, (AudioDeviceInfo) i1kVar.j)) {
                    i1kVar.j = null;
                }
                i1kVar.i();
                break;
            default:
                zzqr zzqrVar = (zzqr) obj;
                String str = zzfm.a;
                int length = audioDeviceInfoArr.length;
                int i2 = 0;
                while (true) {
                    if (i2 < length) {
                        if (Objects.equals(audioDeviceInfoArr[i2], zzqrVar.i)) {
                            zzqrVar.i = null;
                        } else {
                            i2++;
                        }
                    }
                }
                zzqrVar.c();
                break;
        }
    }
}
