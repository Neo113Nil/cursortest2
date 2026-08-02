package com.plaid.internal;

import com.facebook.react.views.textinput.ReactEditTextInputConnectionWrapper;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import com.plaid.internal.core.crashreporting.internal.models.CrashLogLevel;
import com.plaid.internal.core.crashreporting.internal.models.DebugImage;
import com.plaid.internal.core.crashreporting.internal.models.DebugMetaInterface;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.List;
import java.util.UUID;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.PlaidCrashReporter$logMessage$1", f = "PlaidCrashReporter.kt", i = {}, l = {66}, m = "invokeSuspend", n = {}, s = {})
/* renamed from: com.plaid.internal.a5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3555a5 extends SuspendLambda implements Function2<Ph.P, Continuation<? super Unit>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public int f39820a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ C3575c5 f39821b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ String f39822c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3555a5(C3575c5 c3575c5, String str, Continuation<? super C3555a5> continuation) {
        super(2, continuation);
        this.f39821b = c3575c5;
        this.f39822c = str;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3555a5(this.f39821b, this.f39822c, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super Unit> continuation) {
        return new C3555a5(this.f39821b, this.f39822c, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x00d7 A[RETURN] */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        List subList;
        Crash a10;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f39820a;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C3575c5 c3575c5 = this.f39821b;
            X6 x62 = c3575c5.f39849a;
            C3560b0 c3560b0 = c3575c5.f39850b;
            String message = this.f39822c;
            c3560b0.getClass();
            Intrinsics.checkNotNullParameter(message, "message");
            UUID randomUUID = UUID.randomUUID();
            c3560b0.f39832f = randomUUID;
            Intrinsics.checkNotNull(randomUUID);
            String uuid = randomUUID.toString();
            Intrinsics.checkNotNullExpressionValue(uuid, "toString(...)");
            String replace$default = StringsKt.replace$default(uuid, "-", "", false, 4, (Object) null);
            String format = ((SimpleDateFormat) c3560b0.f39833g.getValue()).format(new Date());
            Intrinsics.checkNotNullExpressionValue(format, "format(...)");
            CrashLogLevel crashLogLevel = CrashLogLevel.WARNING;
            String release = c3560b0.f39828b.getRelease();
            if (StringsKt.contains$default((CharSequence) message, (CharSequence) "com.plaid.internal.core.networking.models.NetworkException", false, 2, (Object) null)) {
                try {
                    subList = StringsKt.split$default((CharSequence) message, new String[]{ReactEditTextInputConnectionWrapper.NEWLINE_RAW_VALUE}, false, 0, 6, (Object) null).subList(0, 1);
                } catch (Throwable unused) {
                }
                String a11 = c3560b0.f39829c.a();
                DebugMetaInterface debugMetaInterface = new DebugMetaInterface();
                debugMetaInterface.getDebugImages().add(new DebugImage(new String[]{"5641b9b3-9d23-51b6-bf80-f3d7843a9b55"}[0], null, 2, null));
                a10 = c3560b0.a(new Crash(replace$default, message, format, crashLogLevel, null, null, null, null, null, null, null, release, null, a11, null, subList, null, null, debugMetaInterface, 219120, null));
                this.f39820a = 1;
                if (x62.a(a10, this) == coroutine_suspended) {
                    return coroutine_suspended;
                }
            }
            subList = null;
            String a112 = c3560b0.f39829c.a();
            DebugMetaInterface debugMetaInterface2 = new DebugMetaInterface();
            debugMetaInterface2.getDebugImages().add(new DebugImage(new String[]{"5641b9b3-9d23-51b6-bf80-f3d7843a9b55"}[0], null, 2, null));
            a10 = c3560b0.a(new Crash(replace$default, message, format, crashLogLevel, null, null, null, null, null, null, null, release, null, a112, null, subList, null, null, debugMetaInterface2, 219120, null));
            this.f39820a = 1;
            if (x62.a(a10, this) == coroutine_suspended) {
            }
        } else {
            if (i10 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
        }
        return Unit.INSTANCE;
    }
}
