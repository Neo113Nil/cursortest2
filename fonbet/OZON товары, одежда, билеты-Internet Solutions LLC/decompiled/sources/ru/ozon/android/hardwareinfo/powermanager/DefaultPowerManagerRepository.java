package ru.ozon.android.hardwareinfo.powermanager;

import Ae.C2399j;
import Ae.InterfaceC2395h;
import Ae.x0;
import Sc.InterfaceC4008j;
import Sc.k;
import android.annotation.SuppressLint;
import android.content.Context;
import android.content.IntentFilter;
import android.os.BatteryManager;
import android.os.Build;
import android.os.PowerManager;
import java.util.concurrent.atomic.AtomicBoolean;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.android.hardwareinfo.powermanager.DefaultPowerManagerRepository$powerModeReceiver$2;

@Metadata(d1 = {"\u0000g\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000b\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\u0010\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\b\n\u0002\b\u0003\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0005\n\u0002\u0018\u0002\n\u0002\b\u0004\n\u0002\u0018\u0002\n\u0002\b\u0003\n\u0002\b\u0006*\u0001/\b\u0010\u0018\u00002\u00020\u0001B\u000f\u0012\u0006\u0010\u0003\u001a\u00020\u0002¢\u0006\u0004\b\u0004\u0010\u0005J\u000f\u0010\u0007\u001a\u00020\u0006H\u0016¢\u0006\u0004\b\u0007\u0010\bJ\u000f\u0010\n\u001a\u00020\tH\u0016¢\u0006\u0004\b\n\u0010\u000bJ\u0015\u0010\r\u001a\b\u0012\u0004\u0012\u00020\t0\fH\u0016¢\u0006\u0004\b\r\u0010\u000eJ\u000f\u0010\u000f\u001a\u00020\tH\u0014¢\u0006\u0004\b\u000f\u0010\u000bJ\u000f\u0010\u0011\u001a\u00020\u0010H\u0017¢\u0006\u0004\b\u0011\u0010\u0012J\u000f\u0010\u0014\u001a\u00020\u0013H\u0016¢\u0006\u0004\b\u0014\u0010\u0015J\u000f\u0010\u0017\u001a\u00020\u0016H\u0016¢\u0006\u0004\b\u0017\u0010\u0018R\u0014\u0010\u0003\u001a\u00020\u00028\u0002X\u0082\u0004¢\u0006\u0006\n\u0004\b\u0003\u0010\u0019R!\u0010\u001f\u001a\b\u0012\u0004\u0012\u00020\t0\u001a8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\u001b\u0010\u001c\u001a\u0004\b\u001d\u0010\u001eR#\u0010%\u001a\n !*\u0004\u0018\u00010 0 8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b\"\u0010\u001c\u001a\u0004\b#\u0010$R#\u0010*\u001a\n !*\u0004\u0018\u00010&0&8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b'\u0010\u001c\u001a\u0004\b(\u0010)R\u001b\u0010-\u001a\u00020+8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b,\u0010\u001c\u001a\u0004\b-\u0010.R\u001b\u00103\u001a\u00020/8BX\u0082\u0084\u0002¢\u0006\f\n\u0004\b0\u0010\u001c\u001a\u0004\b1\u00102¨\u00064"}, d2 = {"Lru/ozon/android/hardwareinfo/powermanager/DefaultPowerManagerRepository;", "Lru/ozon/android/hardwareinfo/powermanager/PowerManagerRepository;", "Landroid/content/Context;", "context", "<init>", "(Landroid/content/Context;)V", "Landroid/content/IntentFilter;", "getIntentFiler", "()Landroid/content/IntentFilter;", "", "isPowerSaveMode", "()Z", "LAe/h;", "powerSaveModeFlow", "()LAe/h;", "readPowerSaveMode", "", "registerPowerManagerReceiver", "()V", "Lru/ozon/android/hardwareinfo/powermanager/PowerSaveState;", "powerSaveState", "()Lru/ozon/android/hardwareinfo/powermanager/PowerSaveState;", "", "getBatteryCharge", "()I", "Landroid/content/Context;", "LAe/x0;", "powerModeFlow$delegate", "LSc/j;", "getPowerModeFlow", "()LAe/x0;", "powerModeFlow", "Landroid/os/PowerManager;", "kotlin.jvm.PlatformType", "powerManager$delegate", "getPowerManager", "()Landroid/os/PowerManager;", "powerManager", "Landroid/os/BatteryManager;", "batteryManager$delegate", "getBatteryManager", "()Landroid/os/BatteryManager;", "batteryManager", "Ljava/util/concurrent/atomic/AtomicBoolean;", "isReceiverRegistered$delegate", "isReceiverRegistered", "()Ljava/util/concurrent/atomic/AtomicBoolean;", "ru/ozon/android/hardwareinfo/powermanager/DefaultPowerManagerRepository$powerModeReceiver$2$1", "powerModeReceiver$delegate", "getPowerModeReceiver", "()Lru/ozon/android/hardwareinfo/powermanager/DefaultPowerManagerRepository$powerModeReceiver$2$1;", "powerModeReceiver", "hardware-info_release"}, k = 1, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes6.dex */
public class DefaultPowerManagerRepository implements PowerManagerRepository {

    /* renamed from: batteryManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j batteryManager;

    @NotNull
    private final Context context;

    /* renamed from: isReceiverRegistered$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j isReceiverRegistered;

    /* renamed from: powerManager$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j powerManager;

    /* renamed from: powerModeFlow$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j powerModeFlow;

    /* renamed from: powerModeReceiver$delegate, reason: from kotlin metadata */
    @NotNull
    private final InterfaceC4008j powerModeReceiver;

    public DefaultPowerManagerRepository(@NotNull Context context) {
        Intrinsics.checkNotNullParameter(context, "context");
        this.context = context;
        this.powerModeFlow = k.b(new DefaultPowerManagerRepository$powerModeFlow$2(this));
        this.powerManager = k.b(new DefaultPowerManagerRepository$powerManager$2(this));
        this.batteryManager = k.b(new DefaultPowerManagerRepository$batteryManager$2(this));
        this.isReceiverRegistered = k.b(DefaultPowerManagerRepository$isReceiverRegistered$2.INSTANCE);
        this.powerModeReceiver = k.b(new DefaultPowerManagerRepository$powerModeReceiver$2(this));
    }

    private final BatteryManager getBatteryManager() {
        return (BatteryManager) this.batteryManager.getValue();
    }

    private final PowerManager getPowerManager() {
        return (PowerManager) this.powerManager.getValue();
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final x0<Boolean> getPowerModeFlow() {
        return (x0) this.powerModeFlow.getValue();
    }

    private final DefaultPowerManagerRepository$powerModeReceiver$2.AnonymousClass1 getPowerModeReceiver() {
        return (DefaultPowerManagerRepository$powerModeReceiver$2.AnonymousClass1) this.powerModeReceiver.getValue();
    }

    private final AtomicBoolean isReceiverRegistered() {
        return (AtomicBoolean) this.isReceiverRegistered.getValue();
    }

    @Override // ru.ozon.android.hardwareinfo.battery.BatteryRepository
    public int getBatteryCharge() {
        return getBatteryManager().getIntProperty(4);
    }

    @NotNull
    public IntentFilter getIntentFiler() {
        return new IntentFilter("android.os.action.POWER_SAVE_MODE_CHANGED");
    }

    @Override // ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository
    public boolean isPowerSaveMode() {
        return getPowerModeFlow().getValue().booleanValue();
    }

    @Override // ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository
    @NotNull
    public InterfaceC2395h<Boolean> powerSaveModeFlow() {
        registerPowerManagerReceiver();
        return C2399j.b(getPowerModeFlow());
    }

    @Override // ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository
    @NotNull
    public PowerSaveState powerSaveState() {
        return PowerSaveState.UNKNOWN;
    }

    protected boolean readPowerSaveMode() {
        return getPowerManager().isPowerSaveMode();
    }

    @Override // ru.ozon.android.hardwareinfo.powermanager.PowerManagerRepository
    @SuppressLint({"UnspecifiedRegisterReceiverFlag"})
    public void registerPowerManagerReceiver() {
        if (isReceiverRegistered().getAndSet(true)) {
            return;
        }
        IntentFilter intentFiler = getIntentFiler();
        if (Build.VERSION.SDK_INT >= 33) {
            this.context.registerReceiver(getPowerModeReceiver(), intentFiler, 2);
        } else {
            this.context.registerReceiver(getPowerModeReceiver(), intentFiler);
        }
    }
}
