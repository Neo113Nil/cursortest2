package x30;

import Sc.s;
import android.content.ContentResolver;
import android.database.ContentObserver;
import android.net.Uri;
import android.os.Handler;
import android.os.Looper;
import android.provider.MediaStore;
import androidx.fragment.app.r;
import java.lang.ref.WeakReference;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import kotlin.jvm.functions.Function2;
import ze.u;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.fintech.antifraud.internal.domain.screen.ScreenshotManager$createContentObserverFlow$1", f = "ScreenshotManager.kt", l = {102}, m = "invokeSuspend")
/* loaded from: classes3.dex */
final class i extends kotlin.coroutines.jvm.internal.j implements Function2<u<? super Uri>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f104991d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f104992e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ j f104993f;

    public static final class a extends ContentObserver {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ u<Uri> f104994a;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        /* JADX WARN: Multi-variable type inference failed */
        a(u<? super Uri> uVar, Handler handler) {
            super(handler);
            this.f104994a = uVar;
        }

        @Override // android.database.ContentObserver
        public final void onChange(boolean z11, Uri uri) {
            if (uri != null) {
                this.f104994a.b(uri);
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    i(j jVar, kotlin.coroutines.d<? super i> dVar) {
        super(2, dVar);
        this.f104993f = jVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final kotlin.coroutines.d<Unit> create(Object obj, kotlin.coroutines.d<?> dVar) {
        i iVar = new i(this.f104993f, dVar);
        iVar.f104992e = obj;
        return iVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(u<? super Uri> uVar, kotlin.coroutines.d<? super Unit> dVar) {
        return ((i) create(uVar, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(Object obj) {
        WeakReference weakReference;
        r rVar;
        ContentResolver contentResolver;
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f104991d;
        if (i11 == 0) {
            s.b(obj);
            u uVar = (u) this.f104992e;
            final a aVar2 = new a(uVar, new Handler(Looper.getMainLooper()));
            final j jVar = this.f104993f;
            weakReference = jVar.f104996b;
            if (weakReference != null && (rVar = (r) weakReference.get()) != null && (contentResolver = rVar.getContentResolver()) != null) {
                contentResolver.registerContentObserver(MediaStore.Images.Media.EXTERNAL_CONTENT_URI, true, aVar2);
            }
            Function0 function0 = new Function0() { // from class: x30.h
                @Override // kotlin.jvm.functions.Function0
                public final Object invoke() {
                    WeakReference weakReference2;
                    r rVar2;
                    ContentResolver contentResolver2;
                    weakReference2 = j.this.f104996b;
                    if (weakReference2 != null && (rVar2 = (r) weakReference2.get()) != null && (contentResolver2 = rVar2.getContentResolver()) != null) {
                        contentResolver2.unregisterContentObserver(aVar2);
                    }
                    return Unit.f71690a;
                }
            };
            this.f104991d = 1;
            if (ze.s.a(uVar, function0, this) == aVar) {
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
