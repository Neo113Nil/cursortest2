package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.AbstractC1477t0;
import com.plaid.internal.C3556a6;
import com.plaid.internal.N2;
import ei.AbstractC4212b;
import java.io.File;
import javax.inject.Inject;
import kotlin.Unit;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.io.FilesKt;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.y1, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3794y1 implements Z2 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final H5 f41195a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final Fg.a f41196b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final AbstractC1477t0 f41197c;

    /* renamed from: d, reason: collision with root package name */
    @Nullable
    public N2 f41198d;

    @Inject
    public C3794y1(@NotNull H5 plaidStorage, @NotNull Fg.a json) {
        Intrinsics.checkNotNullParameter(plaidStorage, "plaidStorage");
        Intrinsics.checkNotNullParameter(json, "json");
        this.f41195a = plaidStorage;
        this.f41196b = json;
        this.f41197c = Ph.b1.b("LinkStateStoreThreadSafe");
    }

    public static final N2 b(C3794y1 c3794y1) {
        c3794y1.getClass();
        try {
            try {
                H5 h52 = c3794y1.f41195a;
                h52.getClass();
                Intrinsics.checkNotNullParameter("plaid_link_state", "fileName");
                File parentDirectory = h52.f39274a.getFilesDir();
                Intrinsics.checkNotNullExpressionValue(parentDirectory, "getFilesDir(...)");
                Intrinsics.checkNotNullParameter(parentDirectory, "parentDirectory");
                Intrinsics.checkNotNullParameter("plaid_link_state", "fileName");
                if (!parentDirectory.exists()) {
                    parentDirectory.mkdirs();
                }
                File file = new File(parentDirectory, "plaid_link_state");
                if (!file.exists()) {
                    file.createNewFile();
                }
                String readText$default = FilesKt.readText$default(file, null, 1, null);
                if (readText$default != null && readText$default.length() != 0) {
                    N2 n22 = (N2) ((AbstractC4212b) c3794y1.f41196b.get()).d(N2.f39388a.getValue(), readText$default);
                    c3794y1.f41195a.a();
                    return n22;
                }
            } catch (Exception e10) {
                C3556a6.a.a(C3556a6.f39823a, e10);
                c3794y1.f41195a.a();
            }
            return N2.j.f39425b;
        } finally {
            c3794y1.f41195a.a();
        }
    }

    @Override // com.plaid.internal.Z2
    @Nullable
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        return AbstractC1455i.g(this.f41197c, new C3776w1(this, null), continuationImpl);
    }

    @Override // com.plaid.internal.Z2
    @Nullable
    public final Object a(@NotNull N2 n22, @NotNull ContinuationImpl continuationImpl) {
        Object g10 = AbstractC1455i.g(this.f41197c, new C3785x1(n22, this, null), continuationImpl);
        return g10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? g10 : Unit.INSTANCE;
    }

    public static final void b(C3794y1 c3794y1, N2 n22) {
        c3794y1.getClass();
        if (n22 instanceof N2.b) {
            return;
        }
        c3794y1.f41195a.a("plaid_link_state", ((AbstractC4212b) c3794y1.f41196b.get()).b(N2.f39388a.getValue(), n22));
    }
}
