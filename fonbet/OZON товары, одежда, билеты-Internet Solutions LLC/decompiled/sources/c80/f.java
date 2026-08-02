package c80;

import androidx.lifecycle.x0;
import h3.C6788a;
import java.io.File;
import kotlin.Unit;
import kotlin.jvm.functions.Function0;
import xe.C10720e0;
import xe.C10727i;

/* loaded from: classes3.dex */
public final /* synthetic */ class f implements Function0 {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ i f56726a;

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ File f56727b;

    public /* synthetic */ f(i iVar, File file) {
        this.f56726a = iVar;
        this.f56727b = file;
    }

    @Override // kotlin.jvm.functions.Function0
    public final Object invoke() {
        File file = this.f56727b;
        i iVar = this.f56726a;
        iVar.getClass();
        C6788a a11 = x0.a(iVar);
        C10720e0 c10720e0 = C10720e0.f105451a;
        C10727i.c(a11, He.b.f10879b, null, new j(file, iVar, null), 2);
        return Unit.f71690a;
    }
}
