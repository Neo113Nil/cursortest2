package Gj;

import android.media.AudioManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;
import kotlinx.coroutines.flow.E;
import kotlinx.coroutines.flow.x;

/* loaded from: classes5.dex */
public final class r implements q {

    /* renamed from: f, reason: collision with root package name */
    public static final a f4248f = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f4249a;

    /* renamed from: b, reason: collision with root package name */
    public final Hj.a f4250b;

    /* renamed from: c, reason: collision with root package name */
    public final Gj.a f4251c;

    /* renamed from: d, reason: collision with root package name */
    public final long f4252d;

    /* renamed from: e, reason: collision with root package name */
    public final x f4253e;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public r(AudioManager audioManager, Hj.a bluetoothDeviceManager, Gj.a audioDeviceComparator, long j10) {
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(bluetoothDeviceManager, "bluetoothDeviceManager");
        Intrinsics.checkNotNullParameter(audioDeviceComparator, "audioDeviceComparator");
        this.f4249a = audioManager;
        this.f4250b = bluetoothDeviceManager;
        this.f4251c = audioDeviceComparator;
        this.f4252d = j10;
        this.f4253e = E.b(1, 0, null, 6, null);
    }

    /* JADX WARN: 'this' call moved to the top of the method (can break code semantics) */
    public r(AudioManager audioManager, Hj.a bluetoothDeviceManager, Gj.a audioDeviceComparator) {
        this(audioManager, bluetoothDeviceManager, audioDeviceComparator, 100L);
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(bluetoothDeviceManager, "bluetoothDeviceManager");
        Intrinsics.checkNotNullParameter(audioDeviceComparator, "audioDeviceComparator");
    }
}
