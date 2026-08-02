package ru.ozon.app.android.pikazon.glide.loaders;

import Ae.M0;
import He.b;
import Sc.r;
import Sc.s;
import Ud0.a;
import We.C4864f;
import We.G;
import androidx.lifecycle.D;
import androidx.lifecycle.K;
import androidx.lifecycle.ProcessLifecycleOwner;
import kotlin.Metadata;
import kotlin.Unit;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.pikazon.Pikazon;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u00002\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0018\u0002\n\u0002\u0010\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0004\bÀ\u0002\u0018\u00002\u00020\u0001B\t\b\u0002¢\u0006\u0004\b\u0002\u0010\u0003J\u001d\u0010\n\u001a\b\u0012\u0004\u0012\u00020\u00070\u00062\u0006\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\b\u0010\tJ\u001d\u0010\u000e\u001a\u00020\u00072\u000e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b¢\u0006\u0004\b\u000e\u0010\u000fJ\r\u0010\u0010\u001a\u00020\u0007¢\u0006\u0004\b\u0010\u0010\u0003R\u0018\u0010\u0012\u001a\u0004\u0018\u00010\u00118\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0012\u0010\u0013R\u001e\u0010\r\u001a\n\u0012\u0004\u0012\u00020\f\u0018\u00010\u000b8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\r\u0010\u0014¨\u0006\u0015"}, d2 = {"Lru/ozon/app/android/pikazon/glide/loaders/PikazonImageWarmUpper;", "", "<init>", "()V", "LUd0/a$b;", "warmUpData", "LSc/r;", "", "warmUp-IoAF18A", "(LUd0/a$b;)Ljava/lang/Object;", "warmUp", "LAe/M0;", "LUd0/a;", "configFlow", "initialize", "(LAe/M0;)V", "startConfigUpdateListening", "Lxe/B0;", "job", "Lxe/B0;", "LAe/M0;", "lib_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes7.dex */
public final class PikazonImageWarmUpper {

    @NotNull
    public static final PikazonImageWarmUpper INSTANCE = new PikazonImageWarmUpper();
    private static M0<? extends a> configFlow;
    private static B0 job;

    private PikazonImageWarmUpper() {
    }

    /* JADX INFO: Access modifiers changed from: private */
    /* renamed from: warmUp-IoAF18A, reason: not valid java name */
    public final Object m900warmUpIoAF18A(a.b warmUpData) {
        try {
            r.Companion companion = r.INSTANCE;
            G.a aVar = new G.a();
            aVar.k(warmUpData.a());
            aVar.c(C4864f.f33717n);
            Pikazon.INSTANCE.getInstance().getOkHttpClient().a(aVar.b()).execute().close();
            return Unit.f71690a;
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            return s.a(th2);
        }
    }

    public final void initialize(M0<? extends a> configFlow2) {
        configFlow = configFlow2;
    }

    public final void startConfigUpdateListening() {
        ProcessLifecycleOwner processLifecycleOwner;
        B0 b02 = job;
        if (b02 != null) {
            b02.j(null);
        }
        processLifecycleOwner = ProcessLifecycleOwner.f43230i;
        D a11 = K.a(processLifecycleOwner);
        C10720e0 c10720e0 = C10720e0.f105451a;
        job = C10727i.c(a11, b.f10879b, null, new PikazonImageWarmUpper$startConfigUpdateListening$1(null), 2);
    }
}
