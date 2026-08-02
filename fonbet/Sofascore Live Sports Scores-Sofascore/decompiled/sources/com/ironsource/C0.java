package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import java.util.Map;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public final class C0 extends C5 {

    @NotNull
    private final C4243p0 a;

    @NotNull
    private final C4100h0 b;

    @Nullable
    private final String c;

    public C0(@NotNull C4243p0 c4243p0, @NotNull C4100h0 c4100h0, @Nullable String str) {
        c4243p0.getClass();
        c4100h0.getClass();
        this.a = c4243p0;
        this.b = c4100h0;
        this.c = str;
    }

    @Override // com.ironsource.D0
    @NotNull
    public Map<String, Object> a(@Nullable B0 b0) {
        Map<String, Object> a = a(this.b);
        a.put(IronSourceConstants.EVENTS_PROVIDER, "Mediation");
        a.put("sessionDepth", Integer.valueOf(this.a.g()));
        String str = this.c;
        if (str != null) {
            a.put(IronSourceConstants.EVENTS_MEDIATION_LOAD_STRATEGY, str);
        }
        return a;
    }

    public /* synthetic */ C0(C4243p0 c4243p0, C4100h0 c4100h0, String str, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(c4243p0, c4100h0, (i & 4) != 0 ? null : str);
    }
}
