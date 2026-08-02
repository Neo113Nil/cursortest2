package com.unity3d.ads.core.data.datasource;

import com.ironsource.U3;
import defpackage.a70;
import defpackage.ad2;
import defpackage.au3;
import defpackage.bu3;
import defpackage.hoi;
import defpackage.il4;
import defpackage.ku3;
import defpackage.lu3;
import defpackage.ox1;
import defpackage.rq3;
import defpackage.s9a;
import defpackage.xw3;
import defpackage.y6a;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000(\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010\u000e\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\u0018\u00002\u00020\u0001B\u0017\u0012\u0006\u0010\u0003\u001a\u00020\u0002\u0012\u0006\u0010\u0004\u001a\u00020\u0001¢\u0006\u0004\b\u0005\u0010\u0006J\u0012\u0010\b\u001a\u0004\u0018\u00010\u0007H\u0096\u0002¢\u0006\u0004\b\b\u0010\tR\u0014\u0010\u0004\u001a\u00020\u00018\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0004\u0010\nR\u0016\u0010\f\u001a\u00020\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\f\u0010\rR\u0018\u0010\u000e\u001a\u0004\u0018\u00010\u00078\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u000e\u0010\u000fR\u0016\u0010\u0011\u001a\u00020\u00108\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0011\u0010\u0012¨\u0006\u0013"}, d2 = {"Lcom/unity3d/ads/core/data/datasource/CachedFIdDataSource;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "Lau3;", "dispatcher", "dataSource", "<init>", "(Lau3;Lcom/unity3d/ads/core/data/datasource/FIdDataSource;)V", "", "invoke", "()Ljava/lang/String;", "Lcom/unity3d/ads/core/data/datasource/FIdDataSource;", "Ljava/util/concurrent/atomic/AtomicBoolean;", U3.i.r, "Ljava/util/concurrent/atomic/AtomicBoolean;", U3.i.X, "Ljava/lang/String;", "Lku3;", "scope", "Lku3;", "unity-ads_defaultRelease"}, k = 1, mv = {2, 1, 0}, xi = 48)
/* loaded from: classes6.dex */
public final class CachedFIdDataSource implements FIdDataSource {

    @NotNull
    private final FIdDataSource dataSource;

    @NotNull
    private AtomicBoolean loaded;

    @NotNull
    private ku3 scope;

    @Nullable
    private volatile String value;

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    @Metadata(d1 = {"\u0000\f\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0002\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\n¢\u0006\u0004\b\u0002\u0010\u0003"}, d2 = {"Lku3;", "", "<anonymous>", "(Lku3;)V"}, k = 3, mv = {2, 1, 0})
    @il4(c = "com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1", f = "CachedFIdDataSource.kt", l = {}, m = "invokeSuspend")
    /* renamed from: com.unity3d.ads.core.data.datasource.CachedFIdDataSource$1, reason: invalid class name */
    public static final class AnonymousClass1 extends hoi implements Function2<ku3, rq3<? super Unit>, Object> {
        int label;

        public AnonymousClass1(rq3<? super AnonymousClass1> rq3Var) {
            super(2, rq3Var);
        }

        @Override // defpackage.h21
        public final rq3<Unit> create(Object obj, rq3<?> rq3Var) {
            return CachedFIdDataSource.this.new AnonymousClass1(rq3Var);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(ku3 ku3Var, rq3<? super Unit> rq3Var) {
            return ((AnonymousClass1) create(ku3Var, rq3Var)).invokeSuspend(Unit.a);
        }

        @Override // defpackage.h21
        public final Object invokeSuspend(Object obj) {
            lu3 lu3Var = lu3.a;
            if (this.label != 0) {
                a70.r("call to 'resume' before 'invoke' with coroutine");
                return null;
            }
            y6a.M(obj);
            CachedFIdDataSource cachedFIdDataSource = CachedFIdDataSource.this;
            cachedFIdDataSource.value = cachedFIdDataSource.dataSource.invoke();
            return Unit.a;
        }
    }

    public CachedFIdDataSource(@NotNull au3 au3Var, @NotNull FIdDataSource fIdDataSource) {
        au3Var.getClass();
        fIdDataSource.getClass();
        this.dataSource = fIdDataSource;
        this.loaded = new AtomicBoolean(false);
        ad2 F = s9a.F(s9a.c(au3Var), new CachedFIdDataSource$special$$inlined$CoroutineExceptionHandler$1(bu3.a));
        this.scope = F;
        xw3.L(F, null, null, new AnonymousClass1(null), 3).n(new ox1(this, 13));
    }

    /* JADX INFO: Access modifiers changed from: private */
    public static final Unit _init_$lambda$1(CachedFIdDataSource cachedFIdDataSource, Throwable th) {
        s9a.o(cachedFIdDataSource.scope, null);
        cachedFIdDataSource.loaded.set(true);
        return Unit.a;
    }

    @Override // com.unity3d.ads.core.data.datasource.FIdDataSource
    @Nullable
    public String invoke() {
        if (this.loaded.get()) {
            return this.value;
        }
        return null;
    }
}
