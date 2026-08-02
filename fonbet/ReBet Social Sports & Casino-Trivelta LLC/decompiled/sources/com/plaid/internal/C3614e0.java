package com.plaid.internal;

import com.plaid.internal.C3556a6;
import com.plaid.internal.core.crashreporting.internal.models.Crash;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.internal.core.crashreporting.internal.CrashStorage$getCrashes$2", f = "CrashStorage.kt", i = {1}, l = {36, 38}, m = "invokeSuspend", n = {"destination$iv$iv"}, s = {"L$1"})
@SourceDebugExtension({"SMAP\nCrashStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 CrashStorage.kt\ncom/plaid/internal/core/crashreporting/internal/CrashStorage$getCrashes$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,72:1\n1360#2:73\n1446#2,5:74\n*S KotlinDebug\n*F\n+ 1 CrashStorage.kt\ncom/plaid/internal/core/crashreporting/internal/CrashStorage$getCrashes$2\n*L\n36#1:73\n36#1:74,5\n*E\n"})
/* renamed from: com.plaid.internal.e0, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3614e0 extends SuspendLambda implements Function2<Ph.P, Continuation<? super List<? extends Crash>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public C3641h0 f40569a;

    /* renamed from: b, reason: collision with root package name */
    public Collection f40570b;

    /* renamed from: c, reason: collision with root package name */
    public Iterator f40571c;

    /* renamed from: d, reason: collision with root package name */
    public int f40572d;

    /* renamed from: e, reason: collision with root package name */
    public final /* synthetic */ C3641h0 f40573e;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3614e0(C3641h0 c3641h0, Continuation<? super C3614e0> continuation) {
        super(2, continuation);
        this.f40573e = c3641h0;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3614e0(this.f40573e, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super List<? extends Crash>> continuation) {
        return new C3614e0(this.f40573e, continuation).invokeSuspend(Unit.INSTANCE);
    }

    /* JADX WARN: Code restructure failed: missing block: B:14:0x005f, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Code restructure failed: missing block: B:15:0x0061, code lost:
    
        return r0;
     */
    /* JADX WARN: Code restructure failed: missing block: B:27:0x0033, code lost:
    
        if (r7 == r0) goto L23;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004b  */
    /* JADX WARN: Removed duplicated region for block: B:17:0x0078  */
    /* JADX WARN: Unsupported multi-entry loop pattern (BACK_EDGE: B:14:0x005f -> B:8:0x0062). Please report as a decompilation issue!!! */
    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object invokeSuspend(@NotNull Object obj) {
        Collection arrayList;
        C3641h0 c3641h0;
        Iterator it;
        List listOf;
        Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        int i10 = this.f40572d;
        if (i10 == 0) {
            ResultKt.throwOnFailure(obj);
            C3641h0 c3641h02 = this.f40573e;
            this.f40572d = 1;
            obj = c3641h02.f40638a.a(this);
        } else if (i10 == 1) {
            ResultKt.throwOnFailure(obj);
        } else {
            if (i10 != 2) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            it = this.f40571c;
            arrayList = this.f40570b;
            c3641h0 = this.f40569a;
            try {
                ResultKt.throwOnFailure(obj);
            } catch (Throwable th2) {
                C3556a6.a.a(C3556a6.f39823a, th2);
                listOf = CollectionsKt.listOf(c3641h0.f40639b.a(th2));
            }
            listOf = (List) obj;
            CollectionsKt.addAll(arrayList, listOf);
            if (it.hasNext()) {
                return (List) arrayList;
            }
            String str = (String) it.next();
            Type type = c3641h0.f40641d;
            this.f40569a = c3641h0;
            this.f40570b = arrayList;
            this.f40571c = it;
            this.f40572d = 2;
            obj = C3641h0.a(c3641h0, str, type, this);
        }
        C3641h0 c3641h03 = this.f40573e;
        arrayList = new ArrayList();
        c3641h0 = c3641h03;
        it = ((Iterable) obj).iterator();
        if (it.hasNext()) {
        }
    }
}
