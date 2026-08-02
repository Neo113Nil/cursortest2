package rc0;

import Db0.h;
import De.C2862e;
import Ic0.j;
import Sc.InterfaceC4008j;
import We.B;
import We.G;
import We.L;
import android.os.ConditionVariable;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import td0.f;
import td0.k;
import uc0.C10020a;
import xe.C10727i;

/* renamed from: rc0.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C9245b extends h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final InterfaceC4008j<C10020a> f83285a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f83286b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final AtomicBoolean f83287c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ConditionVariable f83288d;

    /* renamed from: e, reason: collision with root package name */
    @NotNull
    private final C2862e f83289e;

    public C9245b(@NotNull InterfaceC4008j<C10020a> migrateSharedStoreUseCase) {
        Intrinsics.checkNotNullParameter(migrateSharedStoreUseCase, "migrateSharedStoreUseCase");
        this.f83285a = migrateSharedStoreUseCase;
        this.f83286b = new AtomicBoolean(false);
        this.f83287c = new AtomicBoolean(false);
        this.f83288d = new ConditionVariable(false);
        this.f83289e = f.a();
    }

    @Override // Db0.h
    @NotNull
    public final L a(@NotNull B.a chain) {
        Intrinsics.checkNotNullParameter(chain, "chain");
        if (!this.f83286b.get()) {
            G request = chain.request();
            Intrinsics.checkNotNullParameter(request, "<this>");
            if (request.i(j.class) == null) {
                G request2 = chain.request();
                Intrinsics.checkNotNullParameter(request2, "<this>");
                if (request2.i(C9246c.class) == null) {
                    k.a(chain);
                    C10727i.c(this.f83289e, null, null, new C9244a(this, null), 3);
                    this.f83288d.block();
                }
            }
        }
        return chain.proceed(chain.request());
    }
}
