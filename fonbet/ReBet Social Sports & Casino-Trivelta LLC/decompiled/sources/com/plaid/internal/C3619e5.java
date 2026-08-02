package com.plaid.internal;

import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.ArraysKt;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.DebugMetadata;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.SourceDebugExtension;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

@DebugMetadata(c = "com.plaid.core.storage.PlaidDirectoryStorage$listFileNames$2", f = "PlaidDirectoryStorage.kt", i = {}, l = {}, m = "invokeSuspend", n = {}, s = {})
@SourceDebugExtension({"SMAP\nPlaidDirectoryStorage.kt\nKotlin\n*S Kotlin\n*F\n+ 1 PlaidDirectoryStorage.kt\ncom/plaid/core/storage/PlaidDirectoryStorage$listFileNames$2\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,40:1\n1549#2:41\n1620#2,3:42\n*S KotlinDebug\n*F\n+ 1 PlaidDirectoryStorage.kt\ncom/plaid/core/storage/PlaidDirectoryStorage$listFileNames$2\n*L\n30#1:41\n30#1:42,3\n*E\n"})
/* renamed from: com.plaid.internal.e5, reason: case insensitive filesystem */
/* loaded from: classes3.dex */
public final class C3619e5 extends SuspendLambda implements Function2<Ph.P, Continuation<? super List<? extends String>>, Object> {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ C3655i5 f40581a;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public C3619e5(C3655i5 c3655i5, Continuation<? super C3619e5> continuation) {
        super(2, continuation);
        this.f40581a = c3655i5;
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @NotNull
    public final Continuation<Unit> create(@Nullable Object obj, @NotNull Continuation<?> continuation) {
        return new C3619e5(this.f40581a, continuation);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(Ph.P p10, Continuation<? super List<? extends String>> continuation) {
        return new C3619e5(this.f40581a, continuation).invokeSuspend(Unit.INSTANCE);
    }

    @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
    @Nullable
    public final Object invokeSuspend(@NotNull Object obj) {
        List list;
        IntrinsicsKt.getCOROUTINE_SUSPENDED();
        ResultKt.throwOnFailure(obj);
        File[] listFiles = this.f40581a.f40678a.listFiles();
        if (listFiles == null || (list = ArraysKt.toList(listFiles)) == null) {
            return CollectionsKt.emptyList();
        }
        ArrayList arrayList = new ArrayList(CollectionsKt.collectionSizeOrDefault(list, 10));
        Iterator it = list.iterator();
        while (it.hasNext()) {
            arrayList.add(((File) it.next()).getName());
        }
        return arrayList;
    }
}
