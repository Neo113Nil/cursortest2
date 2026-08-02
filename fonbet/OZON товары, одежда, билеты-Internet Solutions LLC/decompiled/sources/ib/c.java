package ib;

import bb.AbstractC5615b;
import eb.C6338b;
import eb.EnumC6339c;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class c extends AbstractC5615b {

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C6338b f66212b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final EnumC6339c f66213c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final EnumC6339c f66214d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final EnumC6339c f66215e;

    public c(C6338b c6338b, EnumC6339c enumC6339c, EnumC6339c enumC6339c2, EnumC6339c enumC6339c3) {
        super("PushMessageShowsByVkpnsSDK");
        this.f66212b = c6338b;
        this.f66213c = enumC6339c;
        this.f66214d = enumC6339c2;
        this.f66215e = enumC6339c3;
    }

    @Override // bb.AbstractC5615b
    @NotNull
    public final Map<String, String> b() {
        C6338b c6338b = this.f66212b;
        String a11 = c6338b.a();
        boolean z11 = !(a11 == null || h.K(a11));
        String g10 = c6338b.g();
        boolean z12 = !(g10 == null || h.K(g10));
        String c11 = c6338b.c();
        return U.j(new Pair("has_body", String.valueOf(z11)), new Pair("has_image", String.valueOf(z12)), new Pair("has_click_action", String.valueOf(!(c11 == null || h.K(c11)))), new Pair("icon_type", this.f66213c.toString()), new Pair("color_type", this.f66214d.toString()), new Pair("channel_type", this.f66215e.toString()), new Pair("slot_id", String.valueOf(0L)));
    }
}
