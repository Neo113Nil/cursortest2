package com.instagram.common.viewpoint.core;

import android.os.Bundle;
import com.facebook.ads.androidx.media3.common.text.Cue;
import com.facebook.video.heroplayer.exocustom.MetaExoPlayerCustomization;
import java.util.List;

/* renamed from: com.facebook.ads.redexgen.X.pR, reason: case insensitive filesystem */
/* loaded from: assets/audience_network/classes2.dex */
public final class C2203pR implements AnonymousClass24 {
    public final long A00;

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public final List<C2205pT> A01;
    public static final C2203pR A03 = new C2203pR(MetaExoPlayerCustomizedCollections.A01(), 0);
    public static final String A04 = C5C.A0h(0);
    public static final String A05 = C5C.A0h(1);
    public static final AnonymousClass23<C2203pR> A02 = new AnonymousClass23() { // from class: com.facebook.ads.redexgen.X.pS
        @Override // com.instagram.common.viewpoint.core.AnonymousClass23
        public final AnonymousClass24 A6f(Bundle bundle) {
            C2203pR A00;
            A00 = C2203pR.A00(bundle);
            return A00;
        }
    };

    @MetaExoPlayerCustomization("Oculus does not work well with Google Guava")
    public C2203pR(List<C2205pT> list, long j) {
        this.A01 = MetaExoPlayerCustomizedCollections.A03((C2205pT[]) list.toArray(new C2205pT[0]));
        this.A00 = j;
    }

    public static final C2203pR A00(Bundle bundle) {
        List A01;
        List<Cue> cues = bundle.getParcelableArrayList(A04);
        if (cues == null) {
            A01 = MetaExoPlayerCustomizedCollections.A01();
        } else {
            A01 = AnonymousClass44.A01(C2205pT.A0I, cues);
        }
        return new C2203pR(A01, bundle.getLong(A05));
    }
}
