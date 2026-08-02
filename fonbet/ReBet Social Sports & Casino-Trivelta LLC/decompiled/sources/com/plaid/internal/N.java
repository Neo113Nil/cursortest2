package com.plaid.internal;

import android.os.Looper;
import android.util.Patterns;
import com.plaid.internal.AbstractC3782w7;
import com.plaid.internal.InterfaceC3728q6;
import kotlin.ResultKt;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.jvm.internal.Intrinsics;
import kotlin.text.StringsKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* loaded from: classes3.dex */
public final class N implements InterfaceC3773v7 {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    public final L f39382a;

    public N(@NotNull L requestManager) {
        Intrinsics.checkNotNullParameter(requestManager, "requestManager");
        this.f39382a = requestManager;
    }

    /* JADX WARN: Removed duplicated region for block: B:14:0x006c  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x0077 A[Catch: Exception -> 0x002b, w7 -> 0x002d, TryCatch #2 {w7 -> 0x002d, Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0062, B:16:0x0077, B:19:0x007d, B:20:0x0088, B:21:0x006d, B:25:0x003a, B:27:0x0046, B:29:0x0054, B:33:0x0089, B:34:0x008b, B:35:0x008c, B:36:0x008e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:19:0x007d A[Catch: Exception -> 0x002b, w7 -> 0x002d, TryCatch #2 {w7 -> 0x002d, Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0062, B:16:0x0077, B:19:0x007d, B:20:0x0088, B:21:0x006d, B:25:0x003a, B:27:0x0046, B:29:0x0054, B:33:0x0089, B:34:0x008b, B:35:0x008c, B:36:0x008e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:21:0x006d A[Catch: Exception -> 0x002b, w7 -> 0x002d, TryCatch #2 {w7 -> 0x002d, Exception -> 0x002b, blocks: (B:11:0x0027, B:12:0x0062, B:16:0x0077, B:19:0x007d, B:20:0x0088, B:21:0x006d, B:25:0x003a, B:27:0x0046, B:29:0x0054, B:33:0x0089, B:34:0x008b, B:35:0x008c, B:36:0x008e), top: B:7:0x0021 }] */
    /* JADX WARN: Removed duplicated region for block: B:24:0x0037  */
    /* JADX WARN: Removed duplicated region for block: B:9:0x0023  */
    @Override // com.plaid.internal.InterfaceC3773v7
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull String str, @NotNull ContinuationImpl continuationImpl) {
        M m10;
        int i10;
        N n10;
        String str2;
        boolean z10;
        try {
            if (continuationImpl instanceof M) {
                m10 = (M) continuationImpl;
                int i11 = m10.f39356d;
                if ((i11 & Integer.MIN_VALUE) != 0) {
                    m10.f39356d = i11 - Integer.MIN_VALUE;
                    Object obj = m10.f39354b;
                    Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                    i10 = m10.f39356d;
                    if (i10 != 0) {
                        ResultKt.throwOnFailure(obj);
                        if (!Patterns.WEB_URL.matcher(str).matches()) {
                            throw AbstractC3782w7.b.f41172a;
                        }
                        if (Intrinsics.areEqual(Looper.myLooper(), Looper.getMainLooper())) {
                            throw AbstractC3782w7.e.f41175a;
                        }
                        L l10 = this.f39382a;
                        m10.f39353a = this;
                        m10.f39356d = 1;
                        obj = l10.a(str, m10);
                        if (obj == coroutine_suspended) {
                            return coroutine_suspended;
                        }
                        n10 = this;
                    } else {
                        if (i10 != 1) {
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                        }
                        n10 = m10.f39353a;
                        ResultKt.throwOnFailure(obj);
                    }
                    C3645h4 c3645h4 = (C3645h4) obj;
                    str2 = c3645h4.f40650b;
                    n10.getClass();
                    z10 = false;
                    if (str2 == null) {
                        z10 = StringsKt.contains$default((CharSequence) str2, (CharSequence) "ErrorCode=0&ErrorDescription=Success", false, 2, (Object) null);
                    }
                    if (z10) {
                        throw new AbstractC3782w7.d(String.valueOf(c3645h4.f40650b));
                    }
                    return new InterfaceC3728q6.b(c3645h4);
                }
            }
            if (i10 != 0) {
            }
            C3645h4 c3645h42 = (C3645h4) obj;
            str2 = c3645h42.f40650b;
            n10.getClass();
            z10 = false;
            if (str2 == null) {
            }
            if (z10) {
            }
        } catch (AbstractC3782w7 e10) {
            return new InterfaceC3728q6.a(e10);
        } catch (Exception e11) {
            return new InterfaceC3728q6.a(new AbstractC3782w7.f(e11));
        }
        m10 = new M(this, continuationImpl);
        Object obj2 = m10.f39354b;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = m10.f39356d;
    }
}
