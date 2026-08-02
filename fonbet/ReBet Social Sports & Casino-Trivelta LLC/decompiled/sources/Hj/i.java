package Hj;

import android.media.AudioManager;
import kotlin.jvm.internal.DefaultConstructorMarker;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class i {

    /* renamed from: c, reason: collision with root package name */
    public static final a f5038c = new a(null);

    /* renamed from: a, reason: collision with root package name */
    public final Ej.j f5039a;

    /* renamed from: b, reason: collision with root package name */
    public final AudioManager f5040b;

    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public a() {
        }
    }

    public i(Ej.j coroutinesDispatchers, AudioManager audioManager) {
        Intrinsics.checkNotNullParameter(coroutinesDispatchers, "coroutinesDispatchers");
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        this.f5039a = coroutinesDispatchers;
        this.f5040b = audioManager;
    }
}
