package defpackage;

import kotlin.jvm.functions.Function1;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public enum yva {
    DRAFT_ORDER("draft_order", new isa(1)),
    LOTTERY("lottery", new isa(2)),
    PROSPECTS("prospects", new isa(3)),
    PICKS("picks", new isa(4)),
    PREVIOUS_PICKS("picks", new isa(5));

    public static final wib c = new wib(26);
    public final Function1 a;
    public final String b;

    yva(String str, Function1 function1) {
        this.a = function1;
        this.b = str;
    }
}
