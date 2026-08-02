package ru.ozon.android.messenger.framework.domain.usecases;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.b;
import ru.ozon.android.messenger.utils.i;

/* renamed from: ru.ozon.android.messenger.framework.domain.usecases.n, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9397n {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89102a;

    /* renamed from: ru.ozon.android.messenger.framework.domain.usecases.n$a */
    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89103a;

        static {
            int[] iArr = new int[b.a.values().length];
            try {
                iArr[b.a.FORWARD.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[b.a.BACKWARD.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[b.a.BACK_AND_FORTH.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            f89103a = iArr;
        }
    }

    public C9397n(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f89102a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C9398o c9398o;
        int i11;
        C9397n c9397n;
        ru.ozon.android.messenger.utils.i iVar;
        Pair pair;
        if (cVar instanceof C9398o) {
            c9398o = (C9398o) cVar;
            int i12 = c9398o.f89108h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c9398o.f89108h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c9398o.f89106f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c9398o.f89108h;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c9398o.f89104d = this;
                    c9398o.f89105e = bVar;
                    c9398o.f89108h = 1;
                    obj = this.f89102a.g(bVar, c9398o);
                    if (obj == aVar) {
                        return aVar;
                    }
                    c9397n = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = c9398o.f89105e;
                    c9397n = c9398o.f89104d;
                    Sc.s.b(obj);
                }
                iVar = (ru.ozon.android.messenger.utils.i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new Sc.o();
                }
                ru.ozon.android.messenger.framework.presentation.models.responses.h hVar = (ru.ozon.android.messenger.framework.presentation.models.responses.h) ((i.b) iVar).b();
                c9397n.getClass();
                int i13 = a.f89103a[bVar.e().ordinal()];
                if (i13 == 1) {
                    Boolean e11 = hVar.e();
                    Boolean d11 = hVar.d();
                    pair = new Pair(e11, Boolean.valueOf(d11 != null ? d11.booleanValue() : false));
                } else if (i13 == 2) {
                    Boolean e12 = hVar.e();
                    pair = new Pair(Boolean.valueOf(e12 != null ? e12.booleanValue() : false), hVar.d());
                } else {
                    if (i13 != 3) {
                        throw new Sc.o();
                    }
                    Boolean e13 = hVar.e();
                    Boolean valueOf = Boolean.valueOf(e13 != null ? e13.booleanValue() : false);
                    Boolean d12 = hVar.d();
                    pair = new Pair(valueOf, Boolean.valueOf(d12 != null ? d12.booleanValue() : false));
                }
                return new i.b(ru.ozon.android.messenger.framework.presentation.models.responses.h.a(hVar, (Boolean) pair.b(), (Boolean) pair.a()));
            }
        }
        c9398o = new C9398o(this, cVar);
        Object obj2 = c9398o.f89106f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c9398o.f89108h;
        if (i11 != 0) {
        }
        iVar = (ru.ozon.android.messenger.utils.i) obj2;
        if (iVar instanceof i.b) {
        }
    }
}
