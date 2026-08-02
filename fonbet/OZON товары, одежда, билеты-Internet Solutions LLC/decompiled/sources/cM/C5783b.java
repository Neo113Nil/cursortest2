package cM;

import android.location.Location;
import kotlin.jvm.functions.Function1;
import qc.g;
import qc.o;
import ru.ozon.app.android.checkoutgeo.location.MockLocationRepositoryImpl;

/* renamed from: cM.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public final /* synthetic */ class C5783b implements g, o {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ Function1 f56860a;

    public /* synthetic */ C5783b(Function1 function1) {
        this.f56860a = function1;
    }

    @Override // qc.g
    public void accept(Object obj) {
        this.f56860a.invoke(obj);
    }

    @Override // qc.o
    public Object apply(Object obj) {
        Location lastLocation$lambda$0;
        lastLocation$lambda$0 = MockLocationRepositoryImpl.getLastLocation$lambda$0(this.f56860a, obj);
        return lastLocation$lambda$0;
    }
}
