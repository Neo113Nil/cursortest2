package ru.ozon.android.messenger.utils.file;

import Sc.s;
import We.InterfaceC4865g;
import We.InterfaceC4866h;
import We.L;
import android.os.Environment;
import androidx.lifecycle.B;
import java.io.File;
import java.io.IOException;
import kotlin.Unit;
import kotlin.coroutines.jvm.internal.j;
import kotlin.jvm.functions.Function2;
import kotlin.jvm.internal.Intrinsics;
import ru.ozon.android.messenger.utils.file.a;
import sf.F;
import sf.InterfaceC9683i;
import sf.z;
import xe.C10720e0;
import xe.C10727i;
import xe.M;

/* loaded from: classes10.dex */
public final class b implements InterfaceC4866h {

    /* renamed from: a, reason: collision with root package name */
    final /* synthetic */ ru.ozon.android.messenger.utils.file.a f91936a;

    @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.android.messenger.utils.file.FileDownloaderApi$initiateDownload$1$1$onResponse$2", f = "FileDownloaderApi.kt", l = {}, m = "invokeSuspend")
    static final class a extends j implements Function2<M, kotlin.coroutines.d<? super Unit>, Object> {

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ ru.ozon.android.messenger.utils.file.a f91937d;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        a(ru.ozon.android.messenger.utils.file.a aVar, kotlin.coroutines.d<? super a> dVar) {
            super(2, dVar);
            this.f91937d = aVar;
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
            return new a(this.f91937d, dVar);
        }

        @Override // kotlin.jvm.functions.Function2
        public final Object invoke(M m11, kotlin.coroutines.d<? super Unit> dVar) {
            return ((a) create(m11, dVar)).invokeSuspend(Unit.f71690a);
        }

        @Override // kotlin.coroutines.jvm.internal.a
        public final Object invokeSuspend(Object obj) {
            e eVar;
            Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
            s.b(obj);
            eVar = this.f91937d.f91927c;
            eVar.d();
            return Unit.f71690a;
        }
    }

    b(ru.ozon.android.messenger.utils.file.a aVar) {
        this.f91936a = aVar;
    }

    @Override // We.InterfaceC4866h
    public final void onFailure(InterfaceC4865g call, IOException e11) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(e11, "e");
    }

    @Override // We.InterfaceC4866h
    public final void onResponse(InterfaceC4865g call, L response) {
        a.C1723a c1723a;
        a.C1723a c1723a2;
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(response, "response");
        We.M c11 = response.c();
        ru.ozon.android.messenger.utils.file.a aVar = this.f91936a;
        c1723a = aVar.f91925a;
        File externalStoragePublicDirectory = Environment.getExternalStoragePublicDirectory(c1723a.d());
        c1723a2 = aVar.f91925a;
        File file = new File(externalStoragePublicDirectory, c1723a2.f());
        if (!file.exists()) {
            file.createNewFile();
        }
        F c12 = z.c(z.h(file));
        InterfaceC9683i source = c11 != null ? c11.source() : null;
        if (source != null) {
            try {
                try {
                    c12.y0(source);
                } finally {
                }
            } finally {
            }
        }
        Unit unit = Unit.f71690a;
        c12.close();
        Vd0.b.a(source, null);
        B c13 = ru.ozon.android.messenger.utils.file.a.c(aVar);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(c13, De.s.f6650a, null, new a(aVar, null), 2);
    }
}
