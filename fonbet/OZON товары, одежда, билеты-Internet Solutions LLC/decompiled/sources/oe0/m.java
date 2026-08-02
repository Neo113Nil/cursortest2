package oe0;

import Ae.InterfaceC2395h;
import Ae.InterfaceC2397i;
import android.location.Location;
import androidx.recyclerview.widget.LinearLayoutManager;
import java.util.List;
import kotlin.Unit;
import kotlin.jvm.functions.Function2;
import org.jetbrains.annotations.NotNull;
import ru.ozon.mapsdk.common.clustercontroller.corecluster.SphericalUtil;
import te0.C9867b;
import ue0.InterfaceC10046c;

@kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.LocationFilter$filterUserLocations$$inlined$transform$1", f = "LocationFilter.kt", l = {40}, m = "invokeSuspend")
/* loaded from: classes3.dex */
public final class m extends kotlin.coroutines.jvm.internal.j implements Function2<InterfaceC2397i<? super Location>, kotlin.coroutines.d<? super Unit>, Object> {

    /* renamed from: d, reason: collision with root package name */
    int f78204d;

    /* renamed from: e, reason: collision with root package name */
    private /* synthetic */ Object f78205e;

    /* renamed from: f, reason: collision with root package name */
    final /* synthetic */ InterfaceC2395h f78206f;

    /* renamed from: g, reason: collision with root package name */
    final /* synthetic */ we0.o f78207g;

    /* renamed from: h, reason: collision with root package name */
    final /* synthetic */ kotlin.jvm.internal.K f78208h;

    /* renamed from: i, reason: collision with root package name */
    final /* synthetic */ n f78209i;

    public static final class a<T> implements InterfaceC2397i {

        /* renamed from: a, reason: collision with root package name */
        final /* synthetic */ InterfaceC2397i<Location> f78210a;

        /* renamed from: b, reason: collision with root package name */
        final /* synthetic */ we0.o f78211b;

        /* renamed from: c, reason: collision with root package name */
        final /* synthetic */ kotlin.jvm.internal.K f78212c;

        /* renamed from: d, reason: collision with root package name */
        final /* synthetic */ n f78213d;

        @kotlin.coroutines.jvm.internal.e(c = "ru.ozon.mapsdk.common.locationcontroller.locationProvider.LocationFilter$filterUserLocations$$inlined$transform$1$1", f = "LocationFilter.kt", l = {225, 229, 242, 286, 291, 302, 305}, m = "emit")
        /* renamed from: oe0.m$a$a, reason: collision with other inner class name */
        public static final class C1324a extends kotlin.coroutines.jvm.internal.c {

            /* renamed from: d, reason: collision with root package name */
            /* synthetic */ Object f78214d;

            /* renamed from: e, reason: collision with root package name */
            int f78215e;

            /* renamed from: g, reason: collision with root package name */
            a f78217g;

            /* renamed from: h, reason: collision with root package name */
            Location f78218h;

            /* renamed from: i, reason: collision with root package name */
            InterfaceC2397i f78219i;

            /* renamed from: j, reason: collision with root package name */
            Location f78220j;

            public C1324a(kotlin.coroutines.d dVar) {
                super(dVar);
            }

            @Override // kotlin.coroutines.jvm.internal.a
            public final Object invokeSuspend(@NotNull Object obj) {
                this.f78214d = obj;
                this.f78215e |= LinearLayoutManager.INVALID_OFFSET;
                return a.this.emit(null, this);
            }
        }

        public a(InterfaceC2397i interfaceC2397i, we0.o oVar, kotlin.jvm.internal.K k11, n nVar) {
            this.f78211b = oVar;
            this.f78212c = k11;
            this.f78213d = nVar;
            this.f78210a = interfaceC2397i;
        }

        /* JADX WARN: Code restructure failed: missing block: B:61:0x022e, code lost:
        
            if (oe0.n.b(r1, r4, r7, r11, r2) == r3) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:64:0x0241, code lost:
        
            if (oe0.n.b(r1, r4, r7, r11, r2) == r3) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:69:0x025b, code lost:
        
            if (oe0.n.b(r1, r4, r7, r11, r2) == r3) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:71:0x0275, code lost:
        
            if (oe0.n.b(r1, r4, r7, r11, r2) == r3) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:80:0x006c, code lost:
        
            if (r10.emit(r11, r2) == r3) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:84:0x0080, code lost:
        
            if (oe0.n.b(r10, r1, r12, r11, r2) == r3) goto L97;
         */
        /* JADX WARN: Code restructure failed: missing block: B:92:0x00bc, code lost:
        
            if (oe0.n.b(r10, r1, r12, r11, r2) == r3) goto L97;
         */
        /* JADX WARN: Multi-variable type inference failed */
        /* JADX WARN: Removed duplicated region for block: B:11:0x0032  */
        /* JADX WARN: Removed duplicated region for block: B:15:0x0037  */
        /* JADX WARN: Removed duplicated region for block: B:17:0x003c  */
        /* JADX WARN: Removed duplicated region for block: B:20:0x00d0  */
        /* JADX WARN: Removed duplicated region for block: B:21:0x00de  */
        /* JADX WARN: Removed duplicated region for block: B:74:0x0049  */
        /* JADX WARN: Removed duplicated region for block: B:76:0x004d  */
        /* JADX WARN: Removed duplicated region for block: B:77:0x0052  */
        /* JADX WARN: Removed duplicated region for block: B:8:0x002a  */
        @Override // Ae.InterfaceC2397i
        /*
            Code decompiled incorrectly, please refer to instructions dump.
        */
        public final Object emit(T t2, @NotNull kotlin.coroutines.d<? super Unit> dVar) {
            C1324a c1324a;
            Location location;
            InterfaceC2397i<Location> interfaceC2397i;
            Location location2;
            a<T> aVar;
            Long l11;
            if (dVar instanceof C1324a) {
                c1324a = (C1324a) dVar;
                int i11 = c1324a.f78215e;
                if ((i11 & LinearLayoutManager.INVALID_OFFSET) != 0) {
                    c1324a.f78215e = i11 - LinearLayoutManager.INVALID_OFFSET;
                    Object obj = c1324a.f78214d;
                    Wc.a aVar2 = Wc.a.COROUTINE_SUSPENDED;
                    InterfaceC10046c.a aVar3 = null;
                    switch (c1324a.f78215e) {
                        case 0:
                            Sc.s.b(obj);
                            location = (Location) t2;
                            we0.o oVar = this.f78211b;
                            boolean d11 = oVar.d();
                            interfaceC2397i = this.f78210a;
                            if (!d11) {
                                location2 = (Location) oVar.e();
                                kotlin.jvm.internal.K k11 = this.f78212c;
                                if (location2 != null) {
                                    if (location.getTime() < location2.getTime() || location.getTime() <= 0) {
                                        C9867b.g("Received location is old or time == 0", null, 6);
                                        return Unit.f71690a;
                                    }
                                    if (k11.f71785a >= 3) {
                                        C9867b.g("Stacked 3 skips, proceeding", null, 6);
                                        c1324a.f78217g = this;
                                        c1324a.f78218h = location;
                                        c1324a.f78219i = interfaceC2397i;
                                        c1324a.f78220j = location2;
                                        c1324a.f78215e = 3;
                                        break;
                                    }
                                    aVar = this;
                                    if (location.getAccuracy() / location2.getAccuracy() <= 2.0f) {
                                        C9867b.g("the accuracy is worse by more than 2 times, skip", null, 6);
                                        aVar.f78212c.f71785a++;
                                    } else {
                                        we0.m d12 = n.d(aVar.f78213d, location2);
                                        n nVar = aVar.f78213d;
                                        double computeDistanceBetween = SphericalUtil.computeDistanceBetween(d12, n.d(nVar, location));
                                        InterfaceC2397i<Location> interfaceC2397i2 = interfaceC2397i;
                                        long time = location.getTime() - location2.getTime();
                                        kotlin.jvm.internal.K k12 = aVar.f78212c;
                                        if (computeDistanceBetween > 30.0d && n.c(nVar, location2) && n.c(nVar, location)) {
                                            k12.f71785a++;
                                            C9867b.g("dont have speed, dist > 30m, skip", null, 6);
                                        } else {
                                            double d13 = time / 1000.0d;
                                            Double valueOf = d13 <= 0.0d ? null : Double.valueOf((computeDistanceBetween / d13) * 3.6d);
                                            if (valueOf == null || valueOf.doubleValue() >= 500.0d) {
                                                k12.f71785a++;
                                                C9867b.g("speed more than 500 km/h, skip", null, 6);
                                            } else if (!n.c(nVar, location2) || !n.c(nVar, location)) {
                                                if (computeDistanceBetween > 0.0d) {
                                                    if (computeDistanceBetween <= location.getSpeed() * time) {
                                                        k12.f71785a++;
                                                        C9867b.g("Cant move to new point with this speed, skip", null, 6);
                                                    }
                                                }
                                                we0.o oVar2 = aVar.f78211b;
                                                if (oVar2.h() < 2) {
                                                    c1324a.f78217g = null;
                                                    c1324a.f78218h = null;
                                                    c1324a.f78219i = null;
                                                    c1324a.f78220j = null;
                                                    c1324a.f78215e = 7;
                                                    break;
                                                } else {
                                                    Double a11 = n.a(nVar, oVar2);
                                                    if (a11 == null) {
                                                        aVar3 = null;
                                                        c1324a.f78217g = null;
                                                        c1324a.f78218h = null;
                                                        c1324a.f78219i = null;
                                                        c1324a.f78220j = null;
                                                        c1324a.f78215e = 4;
                                                        break;
                                                    } else {
                                                        double doubleValue = a11.doubleValue();
                                                        try {
                                                            if (oVar2.h() == 3) {
                                                                List<T> f7 = oVar2.f();
                                                                l11 = Long.valueOf(((((Location) f7.get(2)).getTime() - ((Location) f7.get(1)).getTime()) + (((Location) f7.get(1)).getTime() - ((Location) f7.get(0)).getTime())) / 2);
                                                            } else {
                                                                List<T> f11 = oVar2.f();
                                                                l11 = Long.valueOf(((Location) f11.get(2)).getTime() - ((Location) f11.get(1)).getTime());
                                                            }
                                                        } catch (Exception unused) {
                                                            l11 = null;
                                                        }
                                                        if (l11 == null) {
                                                            aVar3 = null;
                                                            c1324a.f78217g = null;
                                                            c1324a.f78218h = null;
                                                            c1324a.f78219i = null;
                                                            c1324a.f78220j = null;
                                                            c1324a.f78215e = 5;
                                                            break;
                                                        } else {
                                                            long longValue = l11.longValue();
                                                            if (computeDistanceBetween / doubleValue < 2.0d || longValue / time < 2) {
                                                                c1324a.f78217g = null;
                                                                c1324a.f78218h = null;
                                                                c1324a.f78219i = null;
                                                                c1324a.f78220j = null;
                                                                c1324a.f78215e = 6;
                                                                break;
                                                            } else {
                                                                C9867b.g("we covered more than 2 times the average distance while spending 2 or more times less time, skip", null, 6);
                                                                k12.f71785a++;
                                                            }
                                                        }
                                                    }
                                                }
                                            } else {
                                                k12.f71785a++;
                                                C9867b.g("Old and new locations dont have speed info, skip", null, 6);
                                            }
                                        }
                                    }
                                    return Unit.f71690a;
                                }
                                c1324a.f78215e = 2;
                                break;
                                return aVar2;
                            }
                            oVar.b(location);
                            c1324a.f78215e = 1;
                            break;
                            break;
                        case 1:
                        case 6:
                        case 7:
                            Sc.s.b(obj);
                            return Unit.f71690a;
                        case 2:
                            Sc.s.b(obj);
                            C9867b.g("Empty history, proceed", null, 6);
                            return Unit.f71690a;
                        case 3:
                            location2 = c1324a.f78220j;
                            interfaceC2397i = c1324a.f78219i;
                            location = c1324a.f78218h;
                            aVar = c1324a.f78217g;
                            Sc.s.b(obj);
                            if (location.getAccuracy() / location2.getAccuracy() <= 2.0f) {
                            }
                            return Unit.f71690a;
                        case 4:
                            Sc.s.b(obj);
                            C9867b.g("cant calc avg dis, proceed", aVar3, 6);
                            return Unit.f71690a;
                        case 5:
                            Sc.s.b(obj);
                            C9867b.g("cant calc avg time, proceed", aVar3, 6);
                            return Unit.f71690a;
                        default:
                            throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
                    }
                }
            }
            c1324a = new C1324a(dVar);
            Object obj2 = c1324a.f78214d;
            Wc.a aVar22 = Wc.a.COROUTINE_SUSPENDED;
            InterfaceC10046c.a aVar32 = null;
            switch (c1324a.f78215e) {
            }
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public m(InterfaceC2395h interfaceC2395h, kotlin.coroutines.d dVar, we0.o oVar, kotlin.jvm.internal.K k11, n nVar) {
        super(2, dVar);
        this.f78206f = interfaceC2395h;
        this.f78207g = oVar;
        this.f78208h = k11;
        this.f78209i = nVar;
    }

    @Override // kotlin.coroutines.jvm.internal.a
    @NotNull
    public final kotlin.coroutines.d<Unit> create(Object obj, @NotNull kotlin.coroutines.d<?> dVar) {
        m mVar = new m(this.f78206f, dVar, this.f78207g, this.f78208h, this.f78209i);
        mVar.f78205e = obj;
        return mVar;
    }

    @Override // kotlin.jvm.functions.Function2
    public final Object invoke(InterfaceC2397i<? super Location> interfaceC2397i, kotlin.coroutines.d<? super Unit> dVar) {
        return ((m) create(interfaceC2397i, dVar)).invokeSuspend(Unit.f71690a);
    }

    @Override // kotlin.coroutines.jvm.internal.a
    public final Object invokeSuspend(@NotNull Object obj) {
        Wc.a aVar = Wc.a.COROUTINE_SUSPENDED;
        int i11 = this.f78204d;
        if (i11 == 0) {
            Sc.s.b(obj);
            a aVar2 = new a((InterfaceC2397i) this.f78205e, this.f78207g, this.f78208h, this.f78209i);
            this.f78204d = 1;
            if (this.f78206f.collect(aVar2, this) == aVar) {
                return aVar;
            }
        } else {
            if (i11 != 1) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            Sc.s.b(obj);
        }
        return Unit.f71690a;
    }
}
