package ib;

import bb.AbstractC5615b;
import java.util.Map;
import kotlin.Pair;
import kotlin.collections.U;
import org.jetbrains.annotations.NotNull;

/* renamed from: ib.b, reason: case insensitive filesystem */
/* loaded from: classes9.dex */
public final class C7039b extends AbstractC5615b {

    /* renamed from: b, reason: collision with root package name */
    private final long f66210b;

    /* renamed from: c, reason: collision with root package name */
    private final long f66211c;

    /* renamed from: ib.b$a */
    public static final class a {
        public static C7039b a(long j11, long j12) {
            return new C7039b(j11, j12);
        }
    }

    public C7039b(long j11, long j12) {
        super("PushMessageDeliveredToClientSdk");
        this.f66210b = j11;
        this.f66211c = j12;
    }

    @Override // bb.AbstractC5615b
    @NotNull
    public final Map<String, String> b() {
        long j11 = this.f66211c;
        long j12 = this.f66210b;
        return U.j(new Pair("received_by_server_at", String.valueOf(j12)), new Pair("received_by_endpoint_at", String.valueOf(j11)), new Pair("time_spent", String.valueOf(j11 - j12)), new Pair("slot_id", String.valueOf(0L)));
    }
}
