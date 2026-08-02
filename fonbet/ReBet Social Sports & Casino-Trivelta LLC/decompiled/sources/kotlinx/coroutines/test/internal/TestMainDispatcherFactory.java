package kotlinx.coroutines.test.internal;

import Ph.L;
import Ph.M0;
import Sh.AbstractC1583v;
import Sh.InterfaceC1581t;
import Sh.x;
import Yh.c;
import Yh.f;
import com.google.crypto.tink.integration.android.b;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.KotlinNothingValueException;
import kotlin.Metadata;
import kotlin.Result;
import kotlin.ResultKt;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.internal.SourceDebugExtension;
import kotlinx.coroutines.test.internal.TestMainDispatcherFactory;

@Metadata(d1 = {"\u0000\"\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010 \n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0004\b\u0000\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\u0007\u001a\u00020\u00062\f\u0010\u0005\u001a\b\u0012\u0004\u0012\u00020\u00010\u0004H\u0016¢\u0006\u0004\b\u0007\u0010\bR\u0014\u0010\f\u001a\u00020\t8VX\u0096\u0004¢\u0006\u0006\u001a\u0004\b\n\u0010\u000b¨\u0006\r"}, d2 = {"Lkotlinx/coroutines/test/internal/TestMainDispatcherFactory;", "LSh/t;", "<init>", "()V", "", "allFactories", "LPh/M0;", b.f37029b, "(Ljava/util/List;)LPh/M0;", "", "c", "()I", "loadPriority", "kotlinx-coroutines-test"}, k = 1, mv = {2, 1, 0}, xi = 48)
@SourceDebugExtension({"SMAP\nTestMainDispatcherJvm.kt\nKotlin\n*S Kotlin\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n+ 2 _Collections.kt\nkotlin/collections/CollectionsKt___CollectionsKt\n*L\n1#1,53:1\n774#2:54\n865#2,2:55\n1971#2,14:57\n*S KotlinDebug\n*F\n+ 1 TestMainDispatcherJvm.kt\nkotlinx/coroutines/test/internal/TestMainDispatcherFactory\n*L\n9#1:54\n9#1:55,2\n10#1:57,14\n*E\n"})
/* loaded from: classes5.dex */
public final class TestMainDispatcherFactory implements InterfaceC1581t {
    public static final L f(InterfaceC1581t interfaceC1581t, List list, TestMainDispatcherFactory testMainDispatcherFactory) {
        Object m147constructorimpl;
        try {
            M0 e10 = AbstractC1583v.e(interfaceC1581t, list);
            if (!AbstractC1583v.c(e10)) {
                return e10;
            }
            try {
                Result.Companion companion = Result.INSTANCE;
                e10.Y1(e10, new Runnable() { // from class: Yh.e
                    @Override // java.lang.Runnable
                    public final void run() {
                        TestMainDispatcherFactory.g();
                    }
                });
                m147constructorimpl = Result.m147constructorimpl(Unit.INSTANCE);
            } catch (Throwable th2) {
                Result.Companion companion2 = Result.INSTANCE;
                m147constructorimpl = Result.m147constructorimpl(ResultKt.createFailure(th2));
            }
            f.b(Result.m150exceptionOrNullimpl(m147constructorimpl));
            throw new KotlinNothingValueException();
        } catch (Throwable th3) {
            f.b(th3);
            throw new KotlinNothingValueException();
        }
    }

    public static final void g() {
    }

    @Override // Sh.InterfaceC1581t
    public String a() {
        return InterfaceC1581t.a.a(this);
    }

    @Override // Sh.InterfaceC1581t
    public M0 b(List allFactories) {
        Object obj;
        final ArrayList arrayList = new ArrayList();
        for (Object obj2 : allFactories) {
            if (((InterfaceC1581t) obj2) != this) {
                arrayList.add(obj2);
            }
        }
        Iterator it = arrayList.iterator();
        if (it.hasNext()) {
            Object next = it.next();
            if (it.hasNext()) {
                int c10 = ((InterfaceC1581t) next).c();
                do {
                    Object next2 = it.next();
                    int c11 = ((InterfaceC1581t) next2).c();
                    if (c10 < c11) {
                        next = next2;
                        c10 = c11;
                    }
                } while (it.hasNext());
            }
            obj = next;
        } else {
            obj = null;
        }
        final InterfaceC1581t interfaceC1581t = (InterfaceC1581t) obj;
        if (interfaceC1581t == null) {
            interfaceC1581t = x.f10823a;
        }
        return new c(new Function0() { // from class: Yh.d
            @Override // kotlin.jvm.functions.Function0
            public final Object invoke() {
                L f10;
                f10 = TestMainDispatcherFactory.f(InterfaceC1581t.this, arrayList, this);
                return f10;
            }
        });
    }

    @Override // Sh.InterfaceC1581t
    public int c() {
        return Integer.MAX_VALUE;
    }
}
