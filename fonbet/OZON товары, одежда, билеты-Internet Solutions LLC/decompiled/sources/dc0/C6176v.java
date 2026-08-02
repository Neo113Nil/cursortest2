package dc0;

import androidx.recyclerview.widget.LinearLayoutManager;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* renamed from: dc0.v, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final class C6176v {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final C6178x f61586a;

    public C6176v(@NotNull C6178x currentUserRepository) {
        Intrinsics.checkNotNullParameter(currentUserRepository, "currentUserRepository");
        this.f61586a = currentUserRepository;
    }

    public final String a() {
        return this.f61586a.b().a();
    }

    public final String b() {
        return this.f61586a.b().f();
    }

    /* JADX WARN: Removed duplicated region for block: B:15:0x002f  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0021  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object c(@NotNull kotlin.coroutines.jvm.internal.c cVar) {
        C6175u c6175u;
        int i11;
        if (cVar instanceof C6175u) {
            c6175u = (C6175u) cVar;
            int i12 = c6175u.f61585f;
            if ((i12 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                c6175u.f61585f = i12 - LinearLayoutManager.INVALID_OFFSET;
                Object obj = c6175u.f61583d;
                Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
                i11 = c6175u.f61585f;
                if (i11 != 0) {
                    Sc.s.b(obj);
                    c6175u.f61585f = 1;
                    obj = this.f61586a.a(c6175u);
                    if (obj == aVar) {
                        return aVar;
                    }
                } else {
                    if (i11 != 1) {
                        throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                    Sc.s.b(obj);
                }
                return ((C6154S) obj).h();
            }
        }
        c6175u = new C6175u(this, cVar);
        Object obj2 = c6175u.f61583d;
        Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
        i11 = c6175u.f61585f;
        if (i11 != 0) {
        }
        return ((C6154S) obj2).h();
    }

    public final Long d() {
        return this.f61586a.b().h();
    }

    public final boolean e() {
        return this.f61586a.b().j();
    }
}
