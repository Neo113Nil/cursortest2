package com.facebook.ads.redexgen.core;

import android.media.AudioDeviceInfo;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.nio.ByteBuffer;

/* renamed from: com.facebook.ads.redexgen.X.8z, reason: invalid class name and case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public interface InterfaceC15638z {
    void A59(C3212qI c3212qI, int i, int[] iArr) throws C15588s;

    void A5z();

    void A6M();

    void A6T();

    long A7f(boolean z);

    C3191px A8m();

    boolean A9e(ByteBuffer byteBuffer, long j, int i) throws C15598t, C15628y;

    void A9h();

    boolean A9o();

    boolean AAP();

    void AH0();

    void AH2() throws C15628y;

    void AJG(C3218qQ c3218qQ);

    void AJH(int i);

    void AJI(AnonymousClass21 anonymousClass21);

    @MetaExoPlayerCustomization(type = {"NEW_METHOD"}, value = "Enable Retry Audio Track")
    void AJQ(boolean z);

    void AJV(InterfaceC15608v interfaceC15608v);

    void AJd(C3191px c3191px);

    void AJg(C8O c8o);

    void AJi(AudioDeviceInfo audioDeviceInfo);

    void AJo(boolean z);

    boolean AKN(C3212qI c3212qI);

    @MetaExoPlayerCustomization(type = {"TEMPORARY"}, value = "Old API that can be removed when we move to MediaCodecRenderer2")
    boolean AKP(int i, int i2);

    void flush();

    void pause();

    void setVolume(float f);
}
