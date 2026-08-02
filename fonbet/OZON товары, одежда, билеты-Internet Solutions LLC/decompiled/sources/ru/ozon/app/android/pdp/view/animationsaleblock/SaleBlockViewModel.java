package ru.ozon.app.android.pdp.view.animationsaleblock;

import He.b;
import androidx.lifecycle.P;
import androidx.lifecycle.V;
import androidx.lifecycle.w0;
import androidx.lifecycle.x0;
import com.google.android.gms.measurement.api.AppMeasurementSdk;
import h3.C6788a;
import java.util.LinkedHashSet;
import java.util.Set;
import java.util.concurrent.atomic.AtomicBoolean;
import java.util.concurrent.atomic.AtomicInteger;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.cart.common.dynamicElement.DynamicElementDTO;
import xe.B0;
import xe.C10720e0;
import xe.C10727i;

@Metadata(d1 = {"\u0000X\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u0002\n\u0000\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\b\n\u0002\b\u0005\n\u0002\u0010\u000b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0006\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0010#\n\u0002\b\u0004\b\u0001\u0018\u00002\u00020\u0001B\u0007¢\u0006\u0004\b\u0002\u0010\u0003J\u000f\u0010\u0005\u001a\u00020\u0004H\u0002¢\u0006\u0004\b\u0005\u0010\u0003J\u001d\u0010\n\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u00062\u0006\u0010\t\u001a\u00020\b¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\f\u001a\u00020\u00042\u0006\u0010\u0007\u001a\u00020\u0006¢\u0006\u0004\b\f\u0010\rJ\u0015\u0010\u0010\u001a\u00020\u00042\u0006\u0010\u000f\u001a\u00020\u000e¢\u0006\u0004\b\u0010\u0010\u0011R\u0018\u0010\u0013\u001a\u0004\u0018\u00010\u00128\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0013\u0010\u0014R\u0016\u0010\u0016\u001a\u00020\u00158\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u0016\u0010\u0017R(\u0010\t\u001a\u0004\u0018\u00010\b2\b\u0010\u0018\u001a\u0004\u0018\u00010\b8\u0002@BX\u0082\u000e¢\u0006\f\n\u0004\b\t\u0010\u0019\"\u0004\b\u001a\u0010\u001bR\u0016\u0010\u001d\u001a\u00020\u001c8\u0002@\u0002X\u0082\u000e¢\u0006\u0006\n\u0004\b\u001d\u0010\u001eR\u001c\u0010 \u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\u001f8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b \u0010!R\u001f\u0010#\u001a\n\u0012\u0006\u0012\u0004\u0018\u00010\u00060\"8\u0006¢\u0006\f\n\u0004\b#\u0010$\u001a\u0004\b%\u0010&R\u001a\u0010(\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b(\u0010)R\u001a\u0010*\u001a\b\u0012\u0004\u0012\u00020\u00060'8\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b*\u0010)¨\u0006+"}, d2 = {"Lru/ozon/app/android/pdp/view/animationsaleblock/SaleBlockViewModel;", "Landroidx/lifecycle/w0;", "<init>", "()V", "", "startJob", "Lru/ozon/app/android/pdp/view/animationsaleblock/ObjectAnimation;", "objectAnimation", "", "delay", "appearedOnScreen", "(Lru/ozon/app/android/pdp/view/animationsaleblock/ObjectAnimation;I)V", "leftTheScreen", "(Lru/ozon/app/android/pdp/view/animationsaleblock/ObjectAnimation;)V", "", "inCart", "changeStateItemInCart", "(Z)V", "Lxe/B0;", "coroutineJob", "Lxe/B0;", "Ljava/util/concurrent/atomic/AtomicInteger;", DynamicElementDTO.TIMER, "Ljava/util/concurrent/atomic/AtomicInteger;", AppMeasurementSdk.ConditionalUserProperty.VALUE, "Ljava/lang/Integer;", "setDelay", "(Ljava/lang/Integer;)V", "Ljava/util/concurrent/atomic/AtomicBoolean;", "itemInCart", "Ljava/util/concurrent/atomic/AtomicBoolean;", "Landroidx/lifecycle/V;", "_events", "Landroidx/lifecycle/V;", "Landroidx/lifecycle/P;", "events", "Landroidx/lifecycle/P;", "getEvents", "()Landroidx/lifecycle/P;", "", "objects", "Ljava/util/Set;", "postObjects", "pdp_prodGoogleAllVendorsRelease"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes13.dex */
public final class SaleBlockViewModel extends w0 {

    @NotNull
    private final V<ObjectAnimation> _events;
    private B0 coroutineJob;
    private Integer delay;

    @NotNull
    private final P<ObjectAnimation> events;

    @NotNull
    private final Set<ObjectAnimation> objects;

    @NotNull
    private final Set<ObjectAnimation> postObjects;

    @NotNull
    private AtomicInteger timer = new AtomicInteger(-1);

    @NotNull
    private AtomicBoolean itemInCart = new AtomicBoolean(false);

    public SaleBlockViewModel() {
        V<ObjectAnimation> v11 = new V<>();
        this._events = v11;
        this.events = v11;
        this.objects = new LinkedHashSet();
        this.postObjects = new LinkedHashSet();
    }

    private final void setDelay(Integer num) {
        this.timer.set(num != null ? num.intValue() : -1);
        this.delay = num;
    }

    private final void startJob() {
        B0 b02 = this.coroutineJob;
        if (b02 == null || !b02.isActive()) {
            Integer num = this.delay;
            if (num != null) {
                this.timer.set(num.intValue());
            }
            C6788a a11 = x0.a(this);
            C10720e0 c10720e0 = C10720e0.f105451a;
            this.coroutineJob = C10727i.c(a11, b.f10879b, null, new SaleBlockViewModel$startJob$2(this, null), 2);
        }
    }

    public final void appearedOnScreen(@NotNull ObjectAnimation objectAnimation, int delay) {
        Intrinsics.checkNotNullParameter(objectAnimation, "objectAnimation");
        if (this.delay == null) {
            setDelay(Integer.valueOf(delay));
        }
        this.objects.add(objectAnimation);
        if (this.itemInCart.get()) {
            return;
        }
        startJob();
    }

    public final void changeStateItemInCart(boolean inCart) {
        this.itemInCart.set(inCart);
        if (inCart || this.objects.isEmpty()) {
            return;
        }
        startJob();
    }

    @NotNull
    public final P<ObjectAnimation> getEvents() {
        return this.events;
    }

    public final void leftTheScreen(@NotNull ObjectAnimation objectAnimation) {
        Intrinsics.checkNotNullParameter(objectAnimation, "objectAnimation");
        this.objects.remove(objectAnimation);
    }
}
