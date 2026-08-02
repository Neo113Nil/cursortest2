package com.ironsource;

import com.ironsource.mediationsdk.utils.IronSourceConstants;
import defpackage.tub;
import java.util.Map;
import kotlin.Pair;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;
import org.json.JSONObject;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes4.dex */
public interface M4 {
    void a(@NotNull EnumC4373w5 enumC4373w5, @Nullable Be be);

    void a(@NotNull EnumC4373w5 enumC4373w5, @NotNull String str);

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class a {

        @NotNull
        private final Map<String, Object> a;

        public a(@NotNull String str) {
            str.getClass();
            this.a = tub.i(new Pair(IronSourceConstants.EVENTS_PROVIDER, str), new Pair(IronSourceConstants.EVENTS_DEMAND_ONLY, 1));
        }

        public final void a(@NotNull String str, @NotNull Object obj) {
            str.getClass();
            obj.getClass();
            this.a.put(str, obj);
        }

        @NotNull
        public final Map<String, Object> a() {
            return tub.q(this.a);
        }
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    public static final class b implements M4 {

        @NotNull
        private final InterfaceC4411y7 a;

        @NotNull
        private final a b;

        public b(@NotNull InterfaceC4411y7 interfaceC4411y7, @NotNull a aVar) {
            interfaceC4411y7.getClass();
            aVar.getClass();
            this.a = interfaceC4411y7;
            this.b = aVar;
        }

        @Override // com.ironsource.M4
        public void a(@NotNull EnumC4373w5 enumC4373w5, @Nullable Be be) {
            enumC4373w5.getClass();
            Map<String, Object> a = this.b.a();
            if (be != null) {
                a.put(IronSourceConstants.EVENTS_EXT1, be.toString());
            }
            this.a.a(new C4355v5(enumC4373w5, new JSONObject(tub.p(a))));
        }

        @Override // com.ironsource.M4
        public void a(@NotNull EnumC4373w5 enumC4373w5, @NotNull String str) {
            enumC4373w5.getClass();
            str.getClass();
            Map<String, Object> a = this.b.a();
            a.put("spId", str);
            this.a.a(new C4355v5(enumC4373w5, new JSONObject(tub.p(a))));
        }
    }
}
