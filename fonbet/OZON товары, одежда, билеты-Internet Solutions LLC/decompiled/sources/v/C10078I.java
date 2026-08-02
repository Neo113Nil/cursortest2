package v;

import android.media.CamcorderProfile;

/* renamed from: v.I, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
final class C10078I implements InterfaceC10094f {
    @Override // v.InterfaceC10094f
    public final CamcorderProfile a(int i11, int i12) {
        return CamcorderProfile.get(i11, i12);
    }

    @Override // v.InterfaceC10094f
    public final boolean b(int i11, int i12) {
        return CamcorderProfile.hasProfile(i11, i12);
    }
}
