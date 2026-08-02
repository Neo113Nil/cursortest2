package ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.collections.C7714v;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.messenger.blocks.chatGroups.grouplist.j;
import ru.ozon.android.messenger.framework.core.viewmapper.e;
import ru.ozon.android.messenger.framework.navigation.controller.d;

/* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.b, reason: case insensitive filesystem */
/* loaded from: classes10.dex */
public final class C9490b extends AbstractC9507t {

    /* renamed from: c, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.domain.usecases.B f90617c;

    /* renamed from: d, reason: collision with root package name */
    @NotNull
    private final ru.ozon.android.messenger.framework.data.repository.H f90618d;

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.b$a */
    static final class a extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90620c;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            super(1);
            this.f90620c = qVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.chatlist.f old = fVar;
            Intrinsics.checkNotNullParameter(old, "old");
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(old, ru.ozon.android.messenger.utils.b.f(old.k(), new C9489a(C9490b.this, this.f90620c)), null, null, null, null, null, null, null, null, 2046);
        }
    }

    /* renamed from: ru.ozon.android.messenger.framework.presentation.chatlist.viewmodel.b$b, reason: collision with other inner class name */
    static final class C1681b extends AbstractC7737t implements Function1<ru.ozon.android.messenger.framework.presentation.chatlist.f, ru.ozon.android.messenger.framework.presentation.chatlist.f> {

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.framework.presentation.models.q f90621b;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1681b(ru.ozon.android.messenger.framework.presentation.models.q qVar) {
            super(1);
            this.f90621b = qVar;
        }

        @Override // kotlin.jvm.functions.Function1
        public final ru.ozon.android.messenger.framework.presentation.chatlist.f invoke(ru.ozon.android.messenger.framework.presentation.chatlist.f fVar) {
            ru.ozon.android.messenger.framework.presentation.models.q qVar;
            Object obj;
            ru.ozon.android.messenger.framework.presentation.chatlist.f old = fVar;
            Intrinsics.checkNotNullParameter(old, "old");
            List<ru.ozon.android.messenger.framework.presentation.models.q> f7 = old.f();
            Iterator<T> it = f7.iterator();
            while (true) {
                boolean hasNext = it.hasNext();
                qVar = this.f90621b;
                if (!hasNext) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.r.d((ru.ozon.android.messenger.framework.presentation.models.q) obj), ru.ozon.android.messenger.framework.presentation.models.r.d(qVar))) {
                    break;
                }
            }
            if (obj == null) {
                f7 = C7714v.q0(qVar, f7);
            }
            return ru.ozon.android.messenger.framework.presentation.chatlist.f.a(old, null, f7, null, null, null, null, null, null, null, 2045);
        }
    }

    public C9490b(@NotNull ru.ozon.android.messenger.framework.domain.usecases.B mapBlockUpdateUseCase, @NotNull ru.ozon.android.messenger.framework.data.repository.H chatListPageModifier) {
        Intrinsics.checkNotNullParameter(mapBlockUpdateUseCase, "mapBlockUpdateUseCase");
        Intrinsics.checkNotNullParameter(chatListPageModifier, "chatListPageModifier");
        this.f90617c = mapBlockUpdateUseCase;
        this.f90618d = chatListPageModifier;
    }

    public static final /* synthetic */ void f(C9490b c9490b, List list, ru.ozon.android.messenger.framework.presentation.models.q qVar, Integer num) {
        c9490b.getClass();
        i(list, qVar, num);
    }

    private static void i(List list, ru.ozon.android.messenger.framework.presentation.models.q qVar, Integer num) {
        if (list.isEmpty()) {
            list.add(qVar);
            return;
        }
        Iterator it = list.iterator();
        int i11 = 0;
        while (true) {
            if (!it.hasNext()) {
                i11 = -1;
                break;
            } else if (((ru.ozon.android.messenger.framework.presentation.models.q) it.next()).c().c() <= qVar.c().c()) {
                break;
            } else {
                i11++;
            }
        }
        Integer valueOf = i11 == -1 ? null : Integer.valueOf(i11);
        if (valueOf == null) {
            int size = list.size();
            if (num == null || num.intValue() != size) {
                return;
            } else {
                valueOf = Integer.valueOf(list.size());
            }
        }
        list.add(valueOf.intValue(), qVar);
    }

    static /* synthetic */ void j(C9490b c9490b, List list, ru.ozon.android.messenger.framework.presentation.models.q qVar) {
        c9490b.getClass();
        i(list, qVar, null);
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final boolean k(String str) {
        ru.ozon.android.messenger.framework.presentation.chatlist.f b11 = b();
        List<ru.ozon.android.messenger.framework.presentation.models.q> f7 = b11.f();
        ArrayList arrayList = new ArrayList();
        Iterator<T> it = f7.iterator();
        while (it.hasNext()) {
            C7714v.p(((ru.ozon.android.messenger.framework.presentation.models.q) it.next()).b(), arrayList);
        }
        List<ru.ozon.android.messenger.framework.presentation.models.q> k11 = b11.k();
        ArrayList arrayList2 = new ArrayList();
        Iterator<T> it2 = k11.iterator();
        while (it2.hasNext()) {
            C7714v.p(((ru.ozon.android.messenger.framework.presentation.models.q) it2.next()).b(), arrayList2);
        }
        ArrayList p02 = C7714v.p0(arrayList2, arrayList);
        if (str == null || str.length() == 0 || p02.isEmpty()) {
            return false;
        }
        Iterator it3 = p02.iterator();
        while (it3.hasNext()) {
            if (Intrinsics.d(ru.ozon.android.messenger.framework.presentation.models.v.a((ru.ozon.android.messenger.framework.presentation.models.u) it3.next()).a(), str)) {
                return true;
            }
        }
        return false;
    }

    public final void h(@NotNull ru.ozon.android.messenger.framework.presentation.models.q updatedItem, @NotNull ru.ozon.android.messenger.framework.presentation.models.x place, String str, ru.ozon.android.messenger.framework.presentation.models.q qVar, @NotNull ru.ozon.android.messenger.blocks.input.b draftVO) {
        Intrinsics.checkNotNullParameter(updatedItem, "newItem");
        Intrinsics.checkNotNullParameter(place, "place");
        Intrinsics.checkNotNullParameter(draftVO, "draftVO");
        if (place == ru.ozon.android.messenger.framework.presentation.models.x.GROUP) {
            a().a(new C9491c(this.f90617c.b(new d.w(new j.a(updatedItem)), b().f())));
            return;
        }
        if (k(ru.ozon.android.messenger.framework.presentation.models.r.d(updatedItem))) {
            Intrinsics.checkNotNullParameter(updatedItem, "updatedItem");
            Intrinsics.checkNotNullParameter(draftVO, "draftVO");
            a().a(new C9496h(this, updatedItem, qVar, draftVO));
            return;
        }
        ru.ozon.android.messenger.framework.core.viewmapper.e d11 = updatedItem.d();
        if (!Intrinsics.d(d11, e.a.f87374a)) {
            if (!Intrinsics.d(d11, e.b.f87375a)) {
                throw new Sc.o();
            }
            a().a(new C1681b(updatedItem));
        } else if (Intrinsics.d(str, ru.ozon.android.messenger.framework.presentation.chatlist.i.b(b())) || ru.ozon.android.messenger.framework.presentation.chatlist.i.b(b()) == null) {
            a().a(new a(updatedItem));
        }
    }
}
