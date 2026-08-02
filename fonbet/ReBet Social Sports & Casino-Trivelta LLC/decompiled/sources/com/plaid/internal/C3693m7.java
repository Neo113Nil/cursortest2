package com.plaid.internal;

import Ph.AbstractC1455i;
import Ph.AbstractC1457j;
import Ph.C1452g0;
import android.content.Context;
import android.content.Intent;
import android.net.Uri;
import androidx.lifecycle.AbstractC2177b;
import com.plaid.internal.C3556a6;
import com.plaid.internal.Y6;
import java.io.File;
import java.io.IOException;
import java.util.UUID;
import java.util.concurrent.atomic.AtomicReference;
import k.AbstractC5140a;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import l0.AbstractC5339d;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* renamed from: com.plaid.internal.m7, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3693m7 extends AbstractC5140a {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final C3655i5 f40804a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    public final k.j f40805b;

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    public final AtomicReference<Uri> f40806c;

    @DebugMetadata(c = "com.plaid.internal.workflow.TakePictureWithAppInternalUri$createInternalUri$file$1", f = "TakePictureWithAppInternalUri.kt", i = {}, l = {55}, m = "invokeSuspend", n = {}, s = {})
    /* renamed from: com.plaid.internal.m7$a */
    public static final class a extends SuspendLambda implements Function2<Ph.P, Continuation<? super File>, Object> {

        /* renamed from: a, reason: collision with root package name */
        public int f40807a;

        public a(Continuation<? super a> continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @NotNull
        public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
            return C3693m7.this.new a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(Ph.P p10, Continuation<? super File> continuation) {
            return C3693m7.this.new a(continuation).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        @Nullable
        public final Object invokeSuspend(@NotNull Object obj) {
            Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
            int i10 = this.f40807a;
            if (i10 != 0) {
                if (i10 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                ResultKt.throwOnFailure(obj);
                return obj;
            }
            ResultKt.throwOnFailure(obj);
            C3655i5 c3655i5 = C3693m7.this.f40804a;
            String valueOf = String.valueOf(UUID.randomUUID());
            this.f40807a = 1;
            c3655i5.getClass();
            Object g10 = AbstractC1455i.g(C1452g0.b(), new C3610d5(c3655i5, valueOf, null), this);
            return g10 == coroutine_suspended ? coroutine_suspended : g10;
        }
    }

    public C3693m7(@NotNull C3655i5 internalPictureStorage) {
        Intrinsics.checkNotNullParameter(internalPictureStorage, "internalPictureStorage");
        this.f40804a = internalPictureStorage;
        this.f40805b = new k.j();
        this.f40806c = new AtomicReference<>();
    }

    public final Uri a(Context context) {
        Object b10;
        try {
            b10 = AbstractC1457j.b(null, new a(null), 1, null);
            Uri uriForFile = AbstractC5339d.getUriForFile(context, context.getPackageName() + ".com.plaid.link.internal.PlaidFileProvider", (File) b10);
            Intrinsics.checkNotNull(uriForFile);
            return uriForFile;
        } catch (IOException e10) {
            Y6.a.a(e10, "TakePictureWithAppInternalUri - Unable to create file");
            Uri uri = Uri.EMPTY;
            Intrinsics.checkNotNull(uri);
            return uri;
        }
    }

    @Override // k.AbstractC5140a
    public final Intent createIntent(Context context, Object obj) {
        Unit input = (Unit) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        Uri a10 = a(context);
        if (AbstractC2177b.a(this.f40806c, null, a10)) {
            Intrinsics.checkNotNullParameter("TakePictureWithAppInternalUri - Result URI was already set", "message");
            C3556a6.a.b(C3556a6.f39823a, "TakePictureWithAppInternalUri - Result URI was already set");
            J5 j52 = Y6.f39796a;
            if (j52 != null) {
                j52.a("TakePictureWithAppInternalUri - Result URI was already set");
            }
        }
        Intent createIntent = this.f40805b.createIntent(context, a10);
        createIntent.addFlags(2);
        return createIntent;
    }

    @Override // k.AbstractC5140a
    public final AbstractC5140a.C0780a getSynchronousResult(Context context, Object obj) {
        Unit input = (Unit) obj;
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(input, "input");
        return null;
    }

    @Override // k.AbstractC5140a
    public final Object parseResult(int i10, Intent intent) {
        if (i10 != -1) {
            Uri EMPTY = Uri.EMPTY;
            Intrinsics.checkNotNullExpressionValue(EMPTY, "EMPTY");
            return EMPTY;
        }
        Uri andSet = this.f40806c.getAndSet(null);
        if (andSet != null) {
            return andSet;
        }
        Intrinsics.checkNotNullParameter("TakePictureWithAppInternalUri - Result URI should not be null", "message");
        C3556a6.a.b(C3556a6.f39823a, "TakePictureWithAppInternalUri - Result URI should not be null");
        J5 j52 = Y6.f39796a;
        if (j52 != null) {
            j52.a("TakePictureWithAppInternalUri - Result URI should not be null");
        }
        Uri uri = Uri.EMPTY;
        Intrinsics.checkNotNull(uri);
        return uri;
    }
}
