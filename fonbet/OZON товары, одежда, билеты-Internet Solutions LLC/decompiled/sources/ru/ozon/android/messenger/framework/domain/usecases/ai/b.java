package ru.ozon.android.messenger.framework.domain.usecases.ai;

import Sc.o;
import Sc.s;
import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.Pair;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.framework.data.requests.b;
import ru.ozon.android.messenger.framework.presentation.models.responses.h;
import ru.ozon.android.messenger.utils.i;

/* loaded from: classes10.dex */
public final class b {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.repository.b f89048a;

    public /* synthetic */ class a {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f89049a;

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
            f89049a = iArr;
        }
    }

    public b(@NotNull ru.ozon.android.messenger.framework.domain.repository.b repository) {
        Intrinsics.checkNotNullParameter(repository, "repository");
        this.f89048a = repository;
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x004c  */
    /* JADX WARN: Removed duplicated region for block: B:39:0x00db  */
    /* JADX WARN: Removed duplicated region for block: B:46:0x0033  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull ru.ozon.android.messenger.framework.data.requests.b bVar, @NotNull kotlin.coroutines.jvm.internal.c cVar) {
        c cVar2;
        int i11;
        b bVar2;
        i iVar;
        Pair pair;
        if (cVar instanceof c) {
            cVar2 = (c) cVar;
            int i12 = cVar2.f89054h;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                cVar2.f89054h = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = cVar2.f89052f;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = cVar2.f89054h;
                if (i11 != 0) {
                    s.b(obj);
                    cVar2.f89050d = this;
                    cVar2.f89051e = bVar;
                    cVar2.f89054h = 1;
                    obj = this.f89048a.s(bVar, cVar2);
                    if (obj == aVar) {
                        return aVar;
                    }
                    bVar2 = this;
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    bVar = cVar2.f89051e;
                    bVar2 = cVar2.f89050d;
                    s.b(obj);
                }
                iVar = (i) obj;
                if (iVar instanceof i.b) {
                    if (iVar instanceof i.a) {
                        return iVar;
                    }
                    throw new o();
                }
                h hVar = (h) ((i.b) iVar).b();
                bVar2.getClass();
                int i13 = a.f89049a[bVar.e().ordinal()];
                if (i13 == 1) {
                    Boolean e11 = hVar.e();
                    Boolean d11 = hVar.d();
                    pair = new Pair(e11, Boolean.valueOf(d11 != null ? d11.booleanValue() : false));
                } else if (i13 == 2) {
                    Boolean e12 = hVar.e();
                    pair = new Pair(Boolean.valueOf(e12 != null ? e12.booleanValue() : false), hVar.d());
                } else {
                    if (i13 != 3) {
                        throw new o();
                    }
                    Boolean e13 = hVar.e();
                    Boolean valueOf = Boolean.valueOf(e13 != null ? e13.booleanValue() : false);
                    Boolean d12 = hVar.d();
                    pair = new Pair(valueOf, Boolean.valueOf(d12 != null ? d12.booleanValue() : false));
                }
                return new i.b(h.a(hVar, (Boolean) pair.b(), (Boolean) pair.a()));
            }
        }
        cVar2 = new c(this, cVar);
        Object obj2 = cVar2.f89052f;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = cVar2.f89054h;
        if (i11 != 0) {
        }
        iVar = (i) obj2;
        if (iVar instanceof i.b) {
        }
    }
}
