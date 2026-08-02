package Gj;

import android.media.AudioManager;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    public final AudioManager f4225a;

    /* renamed from: b, reason: collision with root package name */
    public final f f4226b;

    /* renamed from: c, reason: collision with root package name */
    public Integer f4227c;

    /* renamed from: d, reason: collision with root package name */
    public boolean f4228d;

    public d(AudioManager audioManager, f audioFocusManager) {
        Intrinsics.checkNotNullParameter(audioManager, "audioManager");
        Intrinsics.checkNotNullParameter(audioFocusManager, "audioFocusManager");
        this.f4225a = audioManager;
        this.f4226b = audioFocusManager;
    }

    public final void a() {
        this.f4226b.b();
        Integer num = this.f4227c;
        if (num != null) {
            c(num.intValue());
        }
        this.f4225a.setSpeakerphoneOn(this.f4228d);
    }

    public final void b() {
        this.f4227c = Integer.valueOf(this.f4225a.getMode());
        this.f4228d = this.f4225a.isSpeakerphoneOn();
        this.f4226b.a();
        c(3);
    }

    public final void c(int i10) {
        try {
            this.f4225a.setMode(i10);
        } catch (Exception e10) {
            Tj.a.b(e10);
        }
    }
}
