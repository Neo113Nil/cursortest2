package K0;

import I0.InterfaceC1342g;
import android.content.Context;
import android.content.SharedPreferences;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import kotlin.Lazy;
import kotlin.LazyKt;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.coroutines.intrinsics.IntrinsicsKt;
import kotlin.coroutines.jvm.internal.Boxing;
import kotlin.coroutines.jvm.internal.ContinuationImpl;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.JvmStatic;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.functions.Function3;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlin.jvm.internal.Lambda;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes.dex */
public final class a implements InterfaceC1342g {

    /* renamed from: a, reason: collision with root package name */
    public final Function2 f6201a;

    /* renamed from: b, reason: collision with root package name */
    public final Function3 f6202b;

    /* renamed from: c, reason: collision with root package name */
    public final Context f6203c;

    /* renamed from: d, reason: collision with root package name */
    public final String f6204d;

    /* renamed from: e, reason: collision with root package name */
    public final Lazy f6205e;

    /* renamed from: f, reason: collision with root package name */
    public final Set f6206f;

    /* renamed from: K0.a$a, reason: collision with other inner class name */
    public static final class C0133a extends SuspendLambda implements Function2 {

        /* renamed from: n, reason: collision with root package name */
        public int f6207n;

        public C0133a(Continuation continuation) {
            super(2, continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Continuation create(Object obj, Continuation continuation) {
            return new C0133a(continuation);
        }

        @Override // kotlin.jvm.functions.Function2
        /* renamed from: i, reason: merged with bridge method [inline-methods] */
        public final Object invoke(Object obj, Continuation continuation) {
            return ((C0133a) create(obj, continuation)).invokeSuspend(Unit.INSTANCE);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            IntrinsicsKt.getCOROUTINE_SUSPENDED();
            if (this.f6207n != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            ResultKt.throwOnFailure(obj);
            return Boxing.boxBoolean(true);
        }
    }

    public static final class b extends Lambda implements Function0 {

        /* renamed from: d, reason: collision with root package name */
        public final /* synthetic */ Context f6208d;

        /* renamed from: e, reason: collision with root package name */
        public final /* synthetic */ String f6209e;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(Context context, String str) {
            super(0);
            this.f6208d = context;
            this.f6209e = str;
        }

        @Override // kotlin.jvm.functions.Function0
        /* renamed from: b, reason: merged with bridge method [inline-methods] */
        public final SharedPreferences invoke() {
            SharedPreferences sharedPreferences = this.f6208d.getSharedPreferences(this.f6209e, 0);
            Intrinsics.checkNotNullExpressionValue(sharedPreferences, "context.getSharedPrefere…me, Context.MODE_PRIVATE)");
            return sharedPreferences;
        }
    }

    public static final class c {

        /* renamed from: a, reason: collision with root package name */
        public static final c f6210a = new c();

        @JvmStatic
        public static final boolean a(@NotNull Context context, @NotNull String name) {
            Intrinsics.checkNotNullParameter(context, "context");
            Intrinsics.checkNotNullParameter(name, "name");
            return context.deleteSharedPreferences(name);
        }
    }

    public static final class d extends ContinuationImpl {

        /* renamed from: n, reason: collision with root package name */
        public Object f6211n;

        /* renamed from: o, reason: collision with root package name */
        public /* synthetic */ Object f6212o;

        /* renamed from: q, reason: collision with root package name */
        public int f6214q;

        public d(Continuation continuation) {
            super(continuation);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            this.f6212o = obj;
            this.f6214q |= Integer.MIN_VALUE;
            return a.this.a(null, this);
        }
    }

    public a(Function0 function0, Set set, Function2 function2, Function3 function3, Context context, String str) {
        this.f6201a = function2;
        this.f6202b = function3;
        this.f6203c = context;
        this.f6204d = str;
        this.f6205e = LazyKt.lazy(function0);
        this.f6206f = set == K0.b.a() ? null : CollectionsKt.toMutableSet(set);
    }

    /* JADX WARN: Code restructure failed: missing block: B:18:0x0069, code lost:
    
        if (r5.isEmpty() == false) goto L38;
     */
    /* JADX WARN: Removed duplicated region for block: B:12:0x004f  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0054  */
    /* JADX WARN: Removed duplicated region for block: B:36:0x0035  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0023  */
    @Override // I0.InterfaceC1342g
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public Object a(Object obj, Continuation continuation) {
        d dVar;
        Object obj2;
        int i10;
        a aVar;
        if (continuation instanceof d) {
            dVar = (d) continuation;
            int i11 = dVar.f6214q;
            if ((i11 & Integer.MIN_VALUE) != 0) {
                dVar.f6214q = i11 - Integer.MIN_VALUE;
                obj2 = dVar.f6212o;
                Object coroutine_suspended = IntrinsicsKt.getCOROUTINE_SUSPENDED();
                i10 = dVar.f6214q;
                boolean z10 = true;
                if (i10 != 0) {
                    ResultKt.throwOnFailure(obj2);
                    Function2 function2 = this.f6201a;
                    dVar.f6211n = this;
                    dVar.f6214q = 1;
                    obj2 = function2.invoke(obj, dVar);
                    if (obj2 == coroutine_suspended) {
                        return coroutine_suspended;
                    }
                    aVar = this;
                } else {
                    if (i10 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    aVar = (a) dVar.f6211n;
                    ResultKt.throwOnFailure(obj2);
                }
                if (((Boolean) obj2).booleanValue()) {
                    return Boxing.boxBoolean(false);
                }
                Set set = aVar.f6206f;
                if (set != null) {
                    SharedPreferences e10 = aVar.e();
                    if (set == null || !set.isEmpty()) {
                        Iterator it = set.iterator();
                        while (it.hasNext()) {
                            if (e10.contains((String) it.next())) {
                                break;
                            }
                        }
                    }
                    z10 = false;
                    return Boxing.boxBoolean(z10);
                }
                Map<String, ?> all = aVar.e().getAll();
                Intrinsics.checkNotNullExpressionValue(all, "sharedPrefs.all");
            }
        }
        dVar = new d(continuation);
        obj2 = dVar.f6212o;
        Object coroutine_suspended2 = IntrinsicsKt.getCOROUTINE_SUSPENDED();
        i10 = dVar.f6214q;
        boolean z102 = true;
        if (i10 != 0) {
        }
        if (((Boolean) obj2).booleanValue()) {
        }
    }

    @Override // I0.InterfaceC1342g
    public Object b(Continuation continuation) {
        Context context;
        String str;
        SharedPreferences.Editor edit = e().edit();
        Set set = this.f6206f;
        if (set == null) {
            edit.clear();
        } else {
            Iterator it = set.iterator();
            while (it.hasNext()) {
                edit.remove((String) it.next());
            }
        }
        if (!edit.commit()) {
            throw new IOException("Unable to delete migrated keys from SharedPreferences.");
        }
        if (e().getAll().isEmpty() && (context = this.f6203c) != null && (str = this.f6204d) != null) {
            d(context, str);
        }
        Set set2 = this.f6206f;
        if (set2 != null) {
            set2.clear();
        }
        return Unit.INSTANCE;
    }

    @Override // I0.InterfaceC1342g
    public Object c(Object obj, Continuation continuation) {
        return this.f6202b.invoke(new K0.c(e(), this.f6206f), obj, continuation);
    }

    public final void d(Context context, String str) {
        c.a(context, str);
    }

    public final SharedPreferences e() {
        return (SharedPreferences) this.f6205e.getValue();
    }

    public /* synthetic */ a(Context context, String str, Set set, Function2 function2, Function3 function3, int i10, DefaultConstructorMarker defaultConstructorMarker) {
        this(context, str, (i10 & 4) != 0 ? K0.b.a() : set, (i10 & 8) != 0 ? new C0133a(null) : function2, function3);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public a(Context context, String sharedPreferencesName, Set keysToMigrate, Function2 shouldRunMigration, Function3 migrate) {
        this(new b(context, sharedPreferencesName), keysToMigrate, shouldRunMigration, migrate, context, sharedPreferencesName);
        Intrinsics.checkNotNullParameter(context, "context");
        Intrinsics.checkNotNullParameter(sharedPreferencesName, "sharedPreferencesName");
        Intrinsics.checkNotNullParameter(keysToMigrate, "keysToMigrate");
        Intrinsics.checkNotNullParameter(shouldRunMigration, "shouldRunMigration");
        Intrinsics.checkNotNullParameter(migrate, "migrate");
    }
}
