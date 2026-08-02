package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class ped extends Error {
    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public ped(String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        super(str);
        str = (i & 1) != 0 ? "An operation is not implemented." : str;
        str.getClass();
    }

    public ped() {
        this(null, 1, null);
    }
}
