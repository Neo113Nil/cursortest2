package ru.ozon.android.gallery.media.view;

import Ae.B0;
import Ae.InterfaceC2397i;
import Fi.d;
import Sc.C4005g;
import Sc.o;
import Sc.s;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.C5412d0;
import kotlin.Unit;
import kotlin.coroutines.d;
import kotlin.coroutines.jvm.internal.e;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import xe.M;

@e(c = "ru.ozon.android.gallery.media.view.GalleryActivity$observeHostCommands$1", f = "GalleryActivity.kt", l = {347}, m = "invokeSuspend")
/* loaded from: classes10.dex */
final class a extends j implements Function2<M, d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f83809d;

    /* renamed from: e, reason: collision with root package name */
    final /* synthetic */ GalleryActivity f83810e;

    @e(c = "ru.ozon.android.gallery.media.view.GalleryActivity$observeHostCommands$1$1", f = "GalleryActivity.kt", l = {348}, m = "invokeSuspend")
    /* renamed from: ru.ozon.android.gallery.media.view.a$a, reason: collision with other inner class name */
    static final class C1444a extends j implements Function2<M, d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        int f83811d;

        /* renamed from: e, reason: collision with root package name */
        final /* synthetic */ GalleryActivity f83812e;

        /* renamed from: ru.ozon.android.gallery.media.view.a$a$a, reason: collision with other inner class name */
        static final class C1445a<T> implements InterfaceC2397i {

            /* renamed from: a, reason: collision with root package name */
            final /* synthetic */ GalleryActivity f83813a;

            C1445a(GalleryActivity galleryActivity) {
                this.f83813a = galleryActivity;
            }

            @Override // Ae.InterfaceC2397i
            public final Object emit(Object obj, d dVar) {
                Fi.d dVar2 = (Fi.d) obj;
                boolean d11 = Intrinsics.d(dVar2, d.a.f9489a);
                GalleryActivity activity = this.f83813a;
                if (d11) {
                    activity.P();
                    Intrinsics.checkNotNullParameter(activity, "activity");
                    activity.finish();
                } else {
                    if (!(dVar2 instanceof d.b)) {
                        throw new o();
                    }
                    ((d.b) dVar2).getClass();
                    GalleryActivity.J(activity);
                }
                return Unit.f71690a;
            }
        }

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        C1444a(GalleryActivity galleryActivity, kotlin.coroutines.d<? super C1444a> dVar) {
            super(2, dVar);
            this.f83812e = galleryActivity;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new C1444a(this.f83812e, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((C1444a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            int i11 = this.f83811d;
            if (i11 == 0) {
                s.b(obj);
                B0 a11 = Fi.e.a();
                C1445a c1445a = new C1445a(this.f83812e);
                this.f83811d = 1;
                if (a11.collect(c1445a, this) == aVar) {
                    return aVar;
                }
            } else {
                if (i11 != 1) {
                    throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                }
                s.b(obj);
            }
            throw new C4005g();
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    a(GalleryActivity galleryActivity, kotlin.coroutines.d<? super a> dVar) {
        super(2, dVar);
        this.f83810e = galleryActivity;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        return new a(this.f83810e, dVar);
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
        return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f83809d;
        if (i11 == 0) {
            s.b(obj);
            AbstractC5434v.b bVar = AbstractC5434v.b.STARTED;
            GalleryActivity galleryActivity = this.f83810e;
            C1444a c1444a = new C1444a(galleryActivity, null);
            this.f83809d = 1;
            if (C5412d0.b(galleryActivity, bVar, c1444a, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            s.b(obj);
        }
        return Unit.f71690a;
    }
}
