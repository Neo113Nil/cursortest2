package com.plaid.internal;

import Ph.AbstractC1459k;
import com.plaid.internal.link.LinkActivity;
import javax.inject.Inject;
import kotlin.Function;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.FunctionAdapter;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.j2, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3661j2 extends androidx.lifecycle.Q {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3695n0 f40696a;

    /* renamed from: b, reason: collision with root package name */
    @Inject
    public final G2 f40697b;

    /* renamed from: c, reason: collision with root package name */
    @Inject
    public final InterfaceC3759u2 f40698c;

    /* renamed from: d, reason: collision with root package name */
    @Inject
    public final Z2 f40699d;

    /* renamed from: e, reason: collision with root package name */
    @Inject
    public final A2 f40700e;

    /* renamed from: f, reason: collision with root package name */
    @Nullable
    public Ph.C0 f40701f;

    /* renamed from: com.plaid.internal.j2$a */
    public static final class a implements androidx.lifecycle.C, FunctionAdapter {

        /* renamed from: a, reason: collision with root package name */
        public final /* synthetic */ LinkActivity.b f40702a;

        public a(LinkActivity.b function) {
            Intrinsics.checkNotNullParameter(function, "function");
            this.f40702a = function;
        }

        public final boolean equals(@Nullable Object obj) {
            if ((obj instanceof androidx.lifecycle.C) && (obj instanceof FunctionAdapter)) {
                return Intrinsics.areEqual(this.f40702a, ((FunctionAdapter) obj).getFunctionDelegate());
            }
            return false;
        }

        @Override // kotlin.jvm.internal.FunctionAdapter
        @NotNull
        public final Function<?> getFunctionDelegate() {
            return this.f40702a;
        }

        public final int hashCode() {
            return this.f40702a.hashCode();
        }

        @Override // androidx.lifecycle.C
        public final /* synthetic */ void onChanged(Object obj) {
            this.f40702a.invoke(obj);
        }
    }

    public C3661j2(@NotNull InterfaceC3553a3 tokenComponent) {
        Intrinsics.checkNotNullParameter(tokenComponent, "tokenComponent");
        C3704o0 c3704o0 = (C3704o0) tokenComponent;
        C3713p0 c3713p0 = c3704o0.f40882a;
        C3695n0 c3695n0 = new C3695n0(c3713p0, c3704o0.f40883b, new I1());
        c3713p0.f40947p.get();
        this.f40697b = c3695n0.f40816d.get();
        this.f40698c = c3695n0.f40826n.get();
        c3713p0.f40940i.get();
        this.f40699d = c3713p0.f40937f.get();
        c3713p0.f40939h.get();
        this.f40700e = c3713p0.f40941j.get();
        this.f40696a = c3695n0;
    }

    @NotNull
    public final void a(@Nullable D6 d62) {
        AbstractC1459k.d(androidx.lifecycle.S.a(this), null, null, new C3643h2(d62, this, null), 3, null);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x0031  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ContinuationImpl continuationImpl) {
        C3652i2 c3652i2;
        int i10;
        if (continuationImpl instanceof C3652i2) {
            c3652i2 = (C3652i2) continuationImpl;
            int i11 = c3652i2.f40670c;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                c3652i2.f40670c = i11 - Integer.MIN_VALUE;
                Object obj = c3652i2.f40668a;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = c3652i2.f40670c;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC3759u2 interfaceC3759u2 = this.f40698c;
                    if (interfaceC3759u2 == null) {
                        Intrinsics.throwUninitializedPropertyAccessException("controller");
                        interfaceC3759u2 = null;
                    }
                    c3652i2.f40670c = 1;
                    if (interfaceC3759u2.a(c3652i2) == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    ResultKt.throwOnFailure(obj);
                }
                return Boxing.boxBoolean(true);
            }
        }
        c3652i2 = new C3652i2(this, continuationImpl);
        Object obj2 = c3652i2.f40668a;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = c3652i2.f40670c;
        if (i10 != 0) {
        }
        return Boxing.boxBoolean(true);
    }
}
