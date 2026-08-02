package kotlin.reflect.full;

import com.sofascore.model.mvvm.model.PlayerKt;
import defpackage.a70;
import defpackage.duf;
import defpackage.k89;
import defpackage.lu3;
import defpackage.rq3;
import defpackage.sw9;
import defpackage.y6a;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import kotlin.Metadata;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;
import kotlin.reflect.KCallable;
import kotlin.reflect.KFunction;
import kotlin.reflect.KParameter;
import kotlin.reflect.jvm.internal.KCallableImpl;
import kotlin.reflect.jvm.internal.UtilKt;
import org.jetbrains.annotations.NotNull;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
@Metadata(d1 = {"\u0000.\n\u0002\u0018\u0002\n\u0002\u0010\u000e\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0011\n\u0002\u0010\u0000\n\u0002\b\u0003\n\u0002\u0010$\n\u0002\b\n\n\u0002\u0010 \n\u0002\b\u0005\u001a!\u0010\u0004\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00002\u0006\u0010\u0002\u001a\u00020\u0001H\u0007¢\u0006\u0004\b\u0004\u0010\u0005\u001a;\u0010\n\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0016\u0010\t\u001a\f\u0012\b\b\u0001\u0012\u0004\u0018\u00010\b0\u0007\"\u0004\u0018\u00010\bH\u0087@ø\u0001\u0000¢\u0006\u0004\b\n\u0010\u000b\u001a9\u0010\r\u001a\u00028\u0000\"\u0004\b\u0000\u0010\u0006*\b\u0012\u0004\u0012\u00028\u00000\u00002\u0014\u0010\t\u001a\u0010\u0012\u0004\u0012\u00020\u0003\u0012\u0006\u0012\u0004\u0018\u00010\b0\fH\u0087@ø\u0001\u0000¢\u0006\u0004\b\r\u0010\u000e\"$\u0010\u0013\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0011\u0010\u0012\u001a\u0004\b\u000f\u0010\u0010\"$\u0010\u0016\u001a\u0004\u0018\u00010\u0003*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u0015\u0010\u0012\u001a\u0004\b\u0014\u0010\u0010\"(\u0010\u001b\u001a\b\u0012\u0004\u0012\u00020\u00030\u0017*\u0006\u0012\u0002\b\u00030\u00008FX\u0087\u0004¢\u0006\f\u0012\u0004\b\u001a\u0010\u0012\u001a\u0004\b\u0018\u0010\u0019\u0082\u0002\u0004\n\u0002\b\u0019¨\u0006\u001c"}, d2 = {"Lkotlin/reflect/KCallable;", "", "name", "Lkotlin/reflect/KParameter;", "findParameterByName", "(Lkotlin/reflect/KCallable;Ljava/lang/String;)Lkotlin/reflect/KParameter;", PlayerKt.ICE_HOCKEY_RIGHT_WING, "", "", "args", "callSuspend", "(Lkotlin/reflect/KCallable;[Ljava/lang/Object;Lrq3;)Ljava/lang/Object;", "", "callSuspendBy", "(Lkotlin/reflect/KCallable;Ljava/util/Map;Lrq3;)Ljava/lang/Object;", "getInstanceParameter", "(Lkotlin/reflect/KCallable;)Lkotlin/reflect/KParameter;", "getInstanceParameter$annotations", "(Lkotlin/reflect/KCallable;)V", "instanceParameter", "getExtensionReceiverParameter", "getExtensionReceiverParameter$annotations", "extensionReceiverParameter", "", "getValueParameters", "(Lkotlin/reflect/KCallable;)Ljava/util/List;", "getValueParameters$annotations", "valueParameters", "kotlin-reflection"}, k = 2, mv = {1, 9, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class KCallables {
    /* JADX WARN: Removed duplicated region for block: B:20:0x0036  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object callSuspend(@NotNull KCallable<? extends R> kCallable, @NotNull Object[] objArr, @NotNull rq3<? super R> rq3Var) {
        KCallables$callSuspend$1 kCallables$callSuspend$1;
        int i;
        if (rq3Var instanceof KCallables$callSuspend$1) {
            kCallables$callSuspend$1 = (KCallables$callSuspend$1) rq3Var;
            int i2 = kCallables$callSuspend$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspend$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kCallables$callSuspend$1.result;
                lu3 lu3Var = lu3.a;
                i = kCallables$callSuspend$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (!kCallable.isSuspend()) {
                        return kCallable.call(Arrays.copyOf(objArr, objArr.length));
                    }
                    if (!(kCallable instanceof KFunction)) {
                        sw9.o(kCallable, ": suspend properties are not supported yet", "Cannot callSuspend on a property ");
                        return null;
                    }
                    kCallables$callSuspend$1.L$0 = kCallable;
                    kCallables$callSuspend$1.L$1 = objArr;
                    kCallables$callSuspend$1.label = 1;
                    k89 k89Var = new k89(2);
                    k89Var.b(objArr);
                    k89Var.a(kCallables$callSuspend$1);
                    ArrayList arrayList = k89Var.a;
                    obj = kCallable.call(arrayList.toArray(new Object[arrayList.size()]));
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kCallable = (KCallable) kCallables$callSuspend$1.L$0;
                    y6a.M(obj);
                }
                return (Intrinsics.c(kCallable.getReturnType().getClassifier(), duf.a.getOrCreateKotlinClass(Unit.class)) || kCallable.getReturnType().isMarkedNullable()) ? obj : Unit.a;
            }
        }
        kCallables$callSuspend$1 = new KCallables$callSuspend$1(rq3Var);
        Object obj2 = kCallables$callSuspend$1.result;
        lu3 lu3Var2 = lu3.a;
        i = kCallables$callSuspend$1.label;
        if (i != 0) {
        }
        if (Intrinsics.c(kCallable.getReturnType().getClassifier(), duf.a.getOrCreateKotlinClass(Unit.class))) {
        }
    }

    /* JADX WARN: Removed duplicated region for block: B:20:0x003a  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    @Nullable
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static final <R> Object callSuspendBy(@NotNull KCallable<? extends R> kCallable, @NotNull Map<KParameter, ? extends Object> map, @NotNull rq3<? super R> rq3Var) {
        KCallables$callSuspendBy$1 kCallables$callSuspendBy$1;
        int i;
        if (rq3Var instanceof KCallables$callSuspendBy$1) {
            kCallables$callSuspendBy$1 = (KCallables$callSuspendBy$1) rq3Var;
            int i2 = kCallables$callSuspendBy$1.label;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                kCallables$callSuspendBy$1.label = i2 - Integer.MIN_VALUE;
                Object obj = kCallables$callSuspendBy$1.result;
                lu3 lu3Var = lu3.a;
                i = kCallables$callSuspendBy$1.label;
                if (i != 0) {
                    y6a.M(obj);
                    if (!kCallable.isSuspend()) {
                        return kCallable.callBy(map);
                    }
                    if (!(kCallable instanceof KFunction)) {
                        sw9.o(kCallable, ": suspend properties are not supported yet", "Cannot callSuspendBy on a property ");
                        return null;
                    }
                    KCallableImpl<?> asKCallableImpl = UtilKt.asKCallableImpl(kCallable);
                    if (asKCallableImpl == null) {
                        sw9.u(kCallable, "This callable does not support a default call: ");
                        return null;
                    }
                    kCallables$callSuspendBy$1.L$0 = kCallable;
                    kCallables$callSuspendBy$1.L$1 = map;
                    kCallables$callSuspendBy$1.L$2 = asKCallableImpl;
                    kCallables$callSuspendBy$1.label = 1;
                    obj = asKCallableImpl.callDefaultMethod$kotlin_reflection(map, kCallables$callSuspendBy$1);
                    if (obj == lu3Var) {
                        return lu3Var;
                    }
                } else {
                    if (i != 1) {
                        a70.r("call to 'resume' before 'invoke' with coroutine");
                        return null;
                    }
                    kCallable = (KCallable) kCallables$callSuspendBy$1.L$0;
                    y6a.M(obj);
                }
                return (Intrinsics.c(kCallable.getReturnType().getClassifier(), duf.a.getOrCreateKotlinClass(Unit.class)) || kCallable.getReturnType().isMarkedNullable()) ? obj : Unit.a;
            }
        }
        kCallables$callSuspendBy$1 = new KCallables$callSuspendBy$1(rq3Var);
        Object obj2 = kCallables$callSuspendBy$1.result;
        lu3 lu3Var2 = lu3.a;
        i = kCallables$callSuspendBy$1.label;
        if (i != 0) {
        }
        if (Intrinsics.c(kCallable.getReturnType().getClassifier(), duf.a.getOrCreateKotlinClass(Unit.class))) {
        }
    }

    @Nullable
    public static final KParameter findParameterByName(@NotNull KCallable<?> kCallable, @NotNull String str) {
        kCallable.getClass();
        str.getClass();
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (Intrinsics.c(((KParameter) next).getName(), str)) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @Nullable
    public static final KParameter getExtensionReceiverParameter(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.Kind.EXTENSION_RECEIVER) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @Nullable
    public static final KParameter getInstanceParameter(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        Iterator<T> it = kCallable.getParameters().iterator();
        Object obj = null;
        boolean z = false;
        Object obj2 = null;
        while (true) {
            if (it.hasNext()) {
                Object next = it.next();
                if (((KParameter) next).getKind() == KParameter.Kind.INSTANCE) {
                    if (z) {
                        break;
                    }
                    z = true;
                    obj2 = next;
                }
            } else if (z) {
                obj = obj2;
            }
        }
        return (KParameter) obj;
    }

    @NotNull
    public static final List<KParameter> getValueParameters(@NotNull KCallable<?> kCallable) {
        kCallable.getClass();
        List<KParameter> parameters = kCallable.getParameters();
        ArrayList arrayList = new ArrayList();
        for (Object obj : parameters) {
            if (((KParameter) obj).getKind() == KParameter.Kind.VALUE) {
                arrayList.add(obj);
            }
        }
        return arrayList;
    }

    public static /* synthetic */ void getExtensionReceiverParameter$annotations(KCallable kCallable) {
    }

    public static /* synthetic */ void getInstanceParameter$annotations(KCallable kCallable) {
    }

    public static /* synthetic */ void getValueParameters$annotations(KCallable kCallable) {
    }
}
