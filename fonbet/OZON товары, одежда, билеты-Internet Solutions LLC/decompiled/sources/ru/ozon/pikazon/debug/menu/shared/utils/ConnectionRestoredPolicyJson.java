package ru.ozon.pikazon.debug.menu.shared.utils;

import Dg0.d;
import com.squareup.moshi.C;
import com.squareup.moshi.h;
import com.squareup.moshi.j;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@j(generateAdapter = true)
@Metadata(d1 = {"\u0000\u0016\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u000b\b\u0001\u0018\u00002\u00020\u0001:\u0001\u000eB\u001b\u0012\b\u0010\u0003\u001a\u0004\u0018\u00010\u0002\u0012\b\u0010\u0005\u001a\u0004\u0018\u00010\u0004¢\u0006\u0004\b\u0006\u0010\u0007R\u0019\u0010\u0003\u001a\u0004\u0018\u00010\u00028\u0006¢\u0006\f\n\u0004\b\u0003\u0010\b\u001a\u0004\b\t\u0010\nR\u0019\u0010\u0005\u001a\u0004\u0018\u00010\u00048\u0006¢\u0006\f\n\u0004\b\u0005\u0010\u000b\u001a\u0004\b\f\u0010\r¨\u0006\u000f"}, d2 = {"Lru/ozon/pikazon/debug/menu/shared/utils/ConnectionRestoredPolicyJson;", "", "LDg0/d$b$b;", "retry", "LDg0/d$b$a;", "doNothing", "<init>", "(LDg0/d$b$b;LDg0/d$b$a;)V", "LDg0/d$b$b;", "getRetry", "()LDg0/d$b$b;", "LDg0/d$b$a;", "getDoNothing", "()LDg0/d$b$a;", "Adapter", "debug-menu-shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes3.dex */
public final class ConnectionRestoredPolicyJson {
    private final d.b.a doNothing;
    private final d.b.C0141b retry;

    @Metadata(d1 = {"\u0000\u001a\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0006\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u0017\u0010\u0007\u001a\u00020\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0007¢\u0006\u0004\b\u0007\u0010\bJ\u0017\u0010\n\u001a\u00020\u00042\u0006\u0010\t\u001a\u00020\u0006H\u0007¢\u0006\u0004\b\n\u0010\u000b¨\u0006\f"}, d2 = {"Lru/ozon/pikazon/debug/menu/shared/utils/ConnectionRestoredPolicyJson$Adapter;", "", "<init>", "()V", "Lru/ozon/pikazon/debug/menu/shared/utils/ConnectionRestoredPolicyJson;", "json", "LDg0/d$b;", "fromJson", "(Lru/ozon/pikazon/debug/menu/shared/utils/ConnectionRestoredPolicyJson;)LDg0/d$b;", "policy", "toJson", "(LDg0/d$b;)Lru/ozon/pikazon/debug/menu/shared/utils/ConnectionRestoredPolicyJson;", "debug-menu-shared_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
    public static final class Adapter {
        @h
        @NotNull
        public final d.b fromJson(@NotNull ConnectionRestoredPolicyJson json) {
            Intrinsics.checkNotNullParameter(json, "json");
            d.b.C0141b retry = json.getRetry();
            return retry != null ? retry : new d.b.a();
        }

        @C
        @NotNull
        public final ConnectionRestoredPolicyJson toJson(@NotNull d.b policy) {
            Intrinsics.checkNotNullParameter(policy, "policy");
            return new ConnectionRestoredPolicyJson(policy instanceof d.b.C0141b ? (d.b.C0141b) policy : null, policy instanceof d.b.a ? (d.b.a) policy : null);
        }
    }

    public ConnectionRestoredPolicyJson(d.b.C0141b c0141b, d.b.a aVar) {
        this.retry = c0141b;
        this.doNothing = aVar;
    }

    public final d.b.a getDoNothing() {
        return this.doNothing;
    }

    public final d.b.C0141b getRetry() {
        return this.retry;
    }
}
