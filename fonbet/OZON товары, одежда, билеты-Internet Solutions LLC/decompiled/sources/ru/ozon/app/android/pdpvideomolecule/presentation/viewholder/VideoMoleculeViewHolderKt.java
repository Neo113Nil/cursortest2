package ru.ozon.app.android.pdpvideomolecule.presentation.viewholder;

import j3.Q;
import kotlin.Metadata;

@Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u000b\n\u0002\b\u0003\"\u001a\u0010\u0002\u001a\u0004\u0018\u00010\u0001*\u00020\u00008BX\u0082\u0004¢\u0006\u0006\u001a\u0004\b\u0002\u0010\u0003¨\u0006\u0004"}, d2 = {"Lj3/Q;", "", "isPortrait", "(Lj3/Q;)Ljava/lang/Boolean;", "pdpvideomolecule_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class VideoMoleculeViewHolderKt {
    /* JADX INFO: Access modifiers changed from: private */
    public static final Boolean isPortrait(Q q11) {
        int i11;
        int i12 = q11.f69043a;
        if (i12 == 0 || (i11 = q11.f69044b) == 0) {
            return null;
        }
        return Boolean.valueOf(((float) i12) / ((float) i11) < 1.1f);
    }
}
