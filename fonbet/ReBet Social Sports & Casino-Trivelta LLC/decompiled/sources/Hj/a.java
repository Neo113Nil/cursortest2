package Hj;

import android.bluetooth.BluetoothManager;
import android.content.Context;
import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class a {

    /* renamed from: a, reason: collision with root package name */
    public final g f5014a;

    /* renamed from: b, reason: collision with root package name */
    public final c f5015b;

    /* renamed from: c, reason: collision with root package name */
    public final k f5016c;

    /* renamed from: d, reason: collision with root package name */
    public final e f5017d;

    /* renamed from: e, reason: collision with root package name */
    public final i f5018e;

    /* renamed from: f, reason: collision with root package name */
    public final AudioManager f5019f;

    /* renamed from: g, reason: collision with root package name */
    public final Ej.j f5020g;

    /* renamed from: h, reason: collision with root package name */
    public final BluetoothManager f5021h;

    /* renamed from: i, reason: collision with root package name */
    public final Context f5022i;

    public a(g changeEventsProvider, c bluetoothHeadsetProvider, k bluetoothEventExistingProvider, e bluetoothShutdownEventProvider, i enableScoJob, AudioManager audioManager, Ej.j coroutinesDispatchers, BluetoothManager bluetoothManager, Context context) {
        Intrinsics.checkNotNullParameter(changeEventsProvider, "changeEventsProvider");
        Intrinsics.checkNotNullParameter(bluetoothHeadsetProvider, "bluetoothHeadsetProvider");
        Intrinsics.checkNotNullParameter(bluetoothEventExistingProvider, "bluetoothEventExistingProvider");
        Intrinsics.checkNotNullParameter(bluetoothShutdownEventProvider, "bluetoothShutdownEventProvider");
        Intrinsics.checkNotNullParameter(enableScoJob, "enableScoJob");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(coroutinesDispatchers, "coroutinesDispatchers");
        Intrinsics.checkNotNullParameter(context, "context");
        this.f5014a = changeEventsProvider;
        this.f5015b = bluetoothHeadsetProvider;
        this.f5016c = bluetoothEventExistingProvider;
        this.f5017d = bluetoothShutdownEventProvider;
        this.f5018e = enableScoJob;
        this.f5019f = audioManager;
        this.f5020g = coroutinesDispatchers;
        this.f5021h = bluetoothManager;
        this.f5022i = context;
    }
}
