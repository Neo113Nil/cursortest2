package f50;

import androidx.lifecycle.x0;
import h3.C6788a;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes3.dex */
public final /* synthetic */ class c implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ f f62849a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f62850b;

    public /* synthetic */ c(f fVar, File file) {
        this.f62849a = fVar;
        this.f62850b = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File file = this.f62850b;
        f fVar = this.f62849a;
        fVar.getClass();
        C6788a a11 = x0.a(fVar);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new g(file, fVar, null), 2);
        return Unit.f71690a;
    }
}
