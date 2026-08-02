package wc;

import Ec.AbstractC2965a;
import hg.InterfaceC6949b;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationEvent;
import ru.ozon.app.android.mediaupload.video.validation.VideoValidationWebSocket;
import sc.C9656b;
import tc.InterfaceC9799a;

/* loaded from: classes9.dex */
public final class x<T, U> extends AbstractC10480a<T, U> {

    /* renamed from: d, reason: collision with root package name */
    final AF.d f104070d;

    static final class a<T, U> extends AbstractC2965a<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final AF.d f104071f;

        a(InterfaceC9799a interfaceC9799a, AF.d dVar) {
            super(interfaceC9799a);
            this.f104071f = dVar;
        }

        @Override // tc.InterfaceC9799a
        public final boolean g(T t2) {
            VideoValidationEvent startValidation$lambda$2;
            if (this.f7804d) {
                return false;
            }
            try {
                startValidation$lambda$2 = VideoValidationWebSocket.startValidation$lambda$2(this.f104071f.f613b, t2);
                C9656b.c(startValidation$lambda$2, "The mapper function returned a null value.");
                return this.f7801a.g(startValidation$lambda$2);
            } catch (Throwable th2) {
                b(th2);
                return true;
            }
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            VideoValidationEvent startValidation$lambda$2;
            if (this.f7804d) {
                return;
            }
            int i11 = this.f7805e;
            InterfaceC6949b interfaceC6949b = this.f7801a;
            if (i11 != 0) {
                interfaceC6949b.onNext(null);
                return;
            }
            try {
                startValidation$lambda$2 = VideoValidationWebSocket.startValidation$lambda$2(this.f104071f.f613b, t2);
                C9656b.c(startValidation$lambda$2, "The mapper function returned a null value.");
                interfaceC6949b.onNext(startValidation$lambda$2);
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // tc.InterfaceC9808j
        public final U poll() throws Exception {
            Object startValidation$lambda$2;
            T poll = this.f7803c.poll();
            if (poll == null) {
                return null;
            }
            startValidation$lambda$2 = VideoValidationWebSocket.startValidation$lambda$2(this.f104071f.f613b, poll);
            U u11 = (U) startValidation$lambda$2;
            C9656b.c(u11, "The mapper function returned a null value.");
            return u11;
        }
    }

    static final class b<T, U> extends Ec.b<T, U> {

        /* renamed from: f, reason: collision with root package name */
        final AF.d f104072f;

        b(io.reactivex.j jVar, AF.d dVar) {
            super(jVar);
            this.f104072f = dVar;
        }

        @Override // hg.InterfaceC6949b
        public final void onNext(T t2) {
            VideoValidationEvent startValidation$lambda$2;
            if (this.f7809d) {
                return;
            }
            int i11 = this.f7810e;
            io.reactivex.j jVar = this.f7806a;
            if (i11 != 0) {
                jVar.onNext(null);
                return;
            }
            try {
                startValidation$lambda$2 = VideoValidationWebSocket.startValidation$lambda$2(this.f104072f.f613b, t2);
                C9656b.c(startValidation$lambda$2, "The mapper function returned a null value.");
                jVar.onNext(startValidation$lambda$2);
            } catch (Throwable th2) {
                b(th2);
            }
        }

        @Override // tc.InterfaceC9808j
        public final U poll() throws Exception {
            Object startValidation$lambda$2;
            T poll = this.f7808c.poll();
            if (poll == null) {
                return null;
            }
            startValidation$lambda$2 = VideoValidationWebSocket.startValidation$lambda$2(this.f104072f.f613b, poll);
            U u11 = (U) startValidation$lambda$2;
            C9656b.c(u11, "The mapper function returned a null value.");
            return u11;
        }
    }

    public x(io.reactivex.h hVar, AF.d dVar) {
        super(hVar);
        this.f104070d = dVar;
    }

    @Override // io.reactivex.h
    protected final void j(io.reactivex.j jVar) {
        boolean z11 = jVar instanceof InterfaceC9799a;
        AF.d dVar = this.f104070d;
        io.reactivex.h<T> hVar = this.f103914c;
        if (z11) {
            hVar.i(new a((InterfaceC9799a) jVar, dVar));
        } else {
            hVar.i(new b(jVar, dVar));
        }
    }
}
