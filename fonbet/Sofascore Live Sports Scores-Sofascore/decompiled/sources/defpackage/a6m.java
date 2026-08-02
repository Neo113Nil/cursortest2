package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public abstract class a6m extends a9m {
    public final String a;
    public final Exception b;

    public /* synthetic */ a6m(Integer num, String str, Exception exc, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this((i & 1) != 0 ? null : num, (i & 2) != 0 ? null : str, (i & 4) != 0 ? null : exc, null);
    }

    public Exception a() {
        return this.b;
    }

    public String b() {
        return this.a;
    }

    public a6m(Integer num, String str, Exception exc, DefaultConstructorMarker defaultConstructorMarker) {
        super(null);
        this.a = str;
        this.b = exc;
    }
}
