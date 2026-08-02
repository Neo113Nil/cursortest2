package ru.ozon.android.messenger.framework.presentation.ai;

import Ae.InterfaceC2397i;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;

/* renamed from: ru.ozon.android.messenger.framework.presentation.ai.j, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9427j<T> implements InterfaceC2397i {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ InterfaceC2397i f89622a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.framework.presentation.ai.AiAssistantFragment$onViewCreated$2$1$invokeSuspend$$inlined$map$1$2", f = "AiAssistantFragment.kt", l = {223}, m = "emit")
    /* renamed from: ru.ozon.android.messenger.framework.presentation.ai.j$a */
    public static final class a extends kotlin.coroutines.jvm.internal.c {

        /* renamed from: d, reason: collision with root package name */
        /* synthetic */ Object f89623d;

        /* renamed from: e, reason: collision with root package name */
        int f89624e;

        public a(kotlin.coroutines.d dVar) {
            super(dVar);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(@NotNull Object obj) {
            this.f89623d = obj;
            this.f89624e |= LinearLayoutManager.INVALID_OFFSET;
            return C9427j.this.emit(null, this);
        }
    }

    public C9427j(InterfaceC2397i interfaceC2397i) {
        this.f89622a = interfaceC2397i;
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    @Override // Ae.InterfaceC2397i
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object emit(Object obj, @NotNull kotlin.coroutines.d dVar) {
        a aVar;
        int i11;
        if (dVar instanceof a) {
            aVar = (a) dVar;
            int i12 = aVar.f89624e;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                aVar.f89624e = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj2 = aVar.f89623d;
                Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                i11 = aVar.f89624e;
                if (i11 != 0) {
                    Sc.s.b(obj2);
                    List<ru.ozon.android.messenger.framework.presentation.models.q> c11 = ((W) obj).c();
                    aVar.f89624e = 1;
                    if (this.f89622a.emit(c11, aVar) == aVar2) {
                        return aVar2;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj2);
                }
                return Unit.f71690a;
            }
        }
        aVar = new a(dVar);
        Object obj22 = aVar.f89623d;
        Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
        i11 = aVar.f89624e;
        if (i11 != 0) {
        }
        return Unit.f71690a;
    }
}
