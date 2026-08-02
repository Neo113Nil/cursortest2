package o7;

import android.util.Log;
import java.util.ArrayList;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import o7.InterfaceC5820b;

/* renamed from: o7.d, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public class C5822d extends C5819a {

    /* renamed from: d, reason: collision with root package name */
    public static final a f59373d = new a(null);

    /* renamed from: c, reason: collision with root package name */
    public final List f59374c = new ArrayList(2);

    /* renamed from: o7.d$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void B(String id2, InterfaceC5820b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f59374c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5820b) this.f59374c.get(i10)).B(id2, aVar);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onRelease", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void J(String id2) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f59374c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5820b) this.f59374c.get(i10)).J(id2);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageFailed", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void d(String id2, Object obj, InterfaceC5820b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f59374c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5820b) this.f59374c.get(i10)).d(id2, obj, aVar);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onSubmit", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void k(String id2, Object obj, InterfaceC5820b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f59374c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5820b) this.f59374c.get(i10)).k(id2, obj, aVar);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFinalImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void onIntermediateImageSet(String id2, Object obj) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f59374c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5820b) this.f59374c.get(i10)).onIntermediateImageSet(id2, obj);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onIntermediateImageSet", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    @Override // o7.C5819a, o7.InterfaceC5820b
    public void r(String id2, Throwable th2, InterfaceC5820b.a aVar) {
        Intrinsics.checkNotNullParameter(id2, "id");
        int size = this.f59374c.size();
        for (int i10 = 0; i10 < size; i10++) {
            try {
                try {
                    ((InterfaceC5820b) this.f59374c.get(i10)).r(id2, th2, aVar);
                    Unit unit = Unit.INSTANCE;
                } catch (Exception e10) {
                    Log.e("FwdControllerListener2", "InternalListener exception in onFailure", e10);
                }
            } catch (IndexOutOfBoundsException unused) {
                return;
            }
        }
    }

    public final synchronized void w0(InterfaceC5820b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f59374c.add(listener);
    }

    public final synchronized void z0(InterfaceC5820b listener) {
        Intrinsics.checkNotNullParameter(listener, "listener");
        this.f59374c.remove(listener);
    }
}
