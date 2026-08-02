package com.vk.stat.scheme;

import com.ironsource.X3;
import xsna.epx;
import xsna.pmi0;
import xsna.uqi;
import xsna.zcl;

/* compiled from: MobileOfficialAppsClipsStat.kt */
/* loaded from: classes5.dex */
public final class MobileOfficialAppsClipsStat$TypeClipsOpenConstructor {

    @pmi0(X3.i.L)
    private final Integer position;

    /* JADX WARN: Multi-variable type inference failed */
    public MobileOfficialAppsClipsStat$TypeClipsOpenConstructor() {
        this(null, 1, 0 == true ? 1 : 0);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        return (obj instanceof MobileOfficialAppsClipsStat$TypeClipsOpenConstructor) && epx.f(this.position, ((MobileOfficialAppsClipsStat$TypeClipsOpenConstructor) obj).position);
    }

    public final int hashCode() {
        Integer num = this.position;
        if (num == null) {
            return 0;
        }
        return num.hashCode();
    }

    public final String toString() {
        return uqi.b(new StringBuilder("TypeClipsOpenConstructor(position="), this.position, ')');
    }

    public MobileOfficialAppsClipsStat$TypeClipsOpenConstructor(Integer num) {
        this.position = num;
    }

    public /* synthetic */ MobileOfficialAppsClipsStat$TypeClipsOpenConstructor(Integer num, int i, zcl zclVar) {
        this((i & 1) != 0 ? null : num);
    }
}
