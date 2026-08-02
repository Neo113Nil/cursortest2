package defpackage;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes7.dex */
public final class fdm {
    public final aeh a;
    public volatile Object b;

    public /* synthetic */ fdm(Object obj, int i, int i2, a62 a62Var, int i3, DefaultConstructorMarker defaultConstructorMarker) {
        this(obj, (i3 & 2) != 0 ? 0 : i, (i3 & 4) != 0 ? 0 : i2, (i3 & 8) != 0 ? a62.a : a62Var);
    }

    public fdm(Object obj, int i, int i2, @NotNull a62 a62Var) {
        a62Var.getClass();
        this.a = beh.a(i, i2, a62Var);
        this.b = obj;
    }
}
