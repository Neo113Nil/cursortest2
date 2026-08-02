package androidx.work.impl.constraints;

import Q2.AbstractC1508t;
import V2.n;
import android.os.Build;
import androidx.work.impl.constraints.b;
import androidx.work.impl.model.WorkSpec;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import kotlinx.coroutines.flow.AbstractC5323h;
import kotlinx.coroutines.flow.InterfaceC5321f;
import kotlinx.coroutines.flow.InterfaceC5322g;
import kotlinx.coroutines.flow.internal.l;

/* loaded from: classes.dex */
public final class i {

    /* renamed from: a, reason: collision with root package name */
    public final List f23889a;

    public static final class a extends Lambda implements Function1 {

        /* renamed from: d, reason: collision with root package name */
        public static final a f23890d = new a();

        public a() {
            super(1);
        }

        @Override // kotlin.jvm.functions.Function1
        /* renamed from: a, reason: merged with bridge method [inline-methods] */
        public final CharSequence invoke(U2.d it) {
            Intrinsics.checkNotNullParameter(it, "it");
            String simpleName = it.getClass().getSimpleName();
            Intrinsics.checkNotNullExpressionValue(simpleName, "it.javaClass.simpleName");
            return simpleName;
        }
    }

    public static final class b implements InterfaceC5321f {
        final /* synthetic */ InterfaceC5321f[] $flowArray$inlined;

        public static final class a extends Lambda implements Function0 {
            final /* synthetic */ InterfaceC5321f[] $flowArray;

            /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
            public a(InterfaceC5321f[] interfaceC5321fArr) {
                super(0);
                this.$flowArray = interfaceC5321fArr;
            }

            @Override // kotlin.jvm.functions.Function0
            /* renamed from: b, reason: merged with bridge method [inline-methods] */
            public final Object[] invoke() {
                return new androidx.work.impl.constraints.b[this.$flowArray.length];
            }
        }

        /* renamed from: androidx.work.impl.constraints.i$b$b, reason: collision with other inner class name */
        public static final class C0423b extends SuspendLambda implements Function3 {

            /* renamed from: n, reason: collision with root package name */
            public int f23891n;

            /* renamed from: o, reason: collision with root package name */
            public /* synthetic */ Object f23892o;

            /* renamed from: p, reason: collision with root package name */
            public /* synthetic */ Object f23893p;

            public C0423b(Continuation continuation) {
                super(3, continuation);
            }

            @Override // kotlin.jvm.functions.Function3
            /* renamed from: i, reason: merged with bridge method [inline-methods] */
            public final Object invoke(InterfaceC5322g interfaceC5322g, Object[] objArr, Continuation continuation) {
                C0423b c0423b = new C0423b(continuation);
                c0423b.f23892o = interfaceC5322g;
                c0423b.f23893p = objArr;
                return c0423b.invokeSuspend(Unit.INSTANCE);
            }

            @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
            public final Object invokeSuspend(Object obj) {
                androidx.work.impl.constraints.b bVar;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                int i10 = this.f23891n;
                if (i10 == 0) {
                    ResultKt.throwOnFailure(obj);
                    InterfaceC5322g interfaceC5322g = (InterfaceC5322g) this.f23892o;
                    androidx.work.impl.constraints.b[] bVarArr = (androidx.work.impl.constraints.b[]) ((Object[]) this.f23893p);
                    int length = bVarArr.length;
                    int i11 = 0;
                    while (true) {
                        if (i11 >= length) {
                            bVar = null;
                            break;
                        }
                        bVar = bVarArr[i11];
                        if (!Intrinsics.areEqual(bVar, b.a.f23858a)) {
                            break;
                        }
                        i11++;
                    }
                    if (bVar == null) {
                        bVar = b.a.f23858a;
                    }
                    this.f23891n = 1;
                    if (interfaceC5322g.emit(bVar, this) == coroutine_suspended) {
                        return coroutine_suspended;
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

        public b(InterfaceC5321f[] interfaceC5321fArr) {
            this.$flowArray$inlined = interfaceC5321fArr;
        }

        @Override // kotlinx.coroutines.flow.InterfaceC5321f
        public Object collect(InterfaceC5322g interfaceC5322g, Continuation continuation) {
            InterfaceC5321f[] interfaceC5321fArr = this.$flowArray$inlined;
            Object a10 = l.a(interfaceC5322g, interfaceC5321fArr, new a(interfaceC5321fArr), new C0423b(null), continuation);
            return a10 == IntrinsicsKt.getCOROUTINE_SUSPENDED() ? a10 : Unit.INSTANCE;
        }
    }

    public i(List controllers) {
        Intrinsics.checkNotNullParameter(controllers, "controllers");
        this.f23889a = controllers;
    }

    public final boolean a(WorkSpec workSpec) {
        String str;
        Intrinsics.checkNotNullParameter(workSpec, "workSpec");
        List list = this.f23889a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((U2.d) obj).b(workSpec)) {
                arrayList.add(obj);
            }
        }
        if (!arrayList.isEmpty()) {
            AbstractC1508t e10 = AbstractC1508t.e();
            str = j.f23894a;
            e10.a(str, "Work " + workSpec.com.facebook.react.devsupport.StackTraceHelper.ID_KEY java.lang.String + " constrained by " + CollectionsKt.joinToString$default(arrayList, null, null, null, 0, null, a.f23890d, 31, null));
        }
        return arrayList.isEmpty();
    }

    public final InterfaceC5321f b(WorkSpec spec) {
        Intrinsics.checkNotNullParameter(spec, "spec");
        List list = this.f23889a;
        ArrayList arrayList = new ArrayList();
        for (Object obj : list) {
            if (((U2.d) obj).c(spec)) {
                arrayList.add(obj);
            }
        }
        ArrayList arrayList2 = new ArrayList(CollectionsKt.collectionSizeOrDefault(arrayList, 10));
        Iterator it = arrayList.iterator();
        while (it.hasNext()) {
            arrayList2.add(((U2.d) it.next()).a(spec.constraints));
        }
        return AbstractC5323h.k(new b((InterfaceC5321f[]) CollectionsKt.toList(arrayList2).toArray(new InterfaceC5321f[0])));
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public i(n trackers) {
        this(CollectionsKt.listOfNotNull((Object[]) new U2.d[]{new U2.b(trackers.a()), new U2.c(trackers.b()), new U2.i(trackers.e()), new U2.e(trackers.d()), new U2.h(trackers.d()), new U2.g(trackers.d()), new U2.f(trackers.d()), Build.VERSION.SDK_INT >= 28 ? j.a(trackers.c()) : null}));
        Intrinsics.checkNotNullParameter(trackers, "trackers");
    }
}
