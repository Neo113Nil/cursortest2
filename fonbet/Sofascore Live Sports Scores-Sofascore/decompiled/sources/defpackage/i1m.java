package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class i1m extends a6m {
    public final String c;
    public final Exception d;

    public /* synthetic */ i1m(Integer num, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : exc, null);
    }

    @Override // defpackage.a6m
    public Exception a() {
        return this.d;
    }

    @Override // defpackage.a6m
    public String b() {
        return this.c;
    }

    public i1m(Integer num, String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
        super(null, null, null, 7, null);
        this.c = str;
        this.d = exc;
    }
}
