package Fj;

import com.twilio.voice.Call;
import com.twilio.voice.CallException;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* loaded from: classes5.dex */
public final class r implements Call.Listener {

    /* renamed from: a, reason: collision with root package name */
    public final Gj.d f3760a;

    /* renamed from: b, reason: collision with root package name */
    public final Rh.j f3761b;

    public r(Gj.d audioFocusFacade) {
        Intrinsics.checkNotNullParameter(audioFocusFacade, "audioFocusFacade");
        this.f3760a = audioFocusFacade;
        this.f3761b = Rh.m.b(0, null, null, 7, null);
    }

    public final void a(Dj.d dVar) {
        this.f3761b.h(dVar);
    }

    public final Unit b(CallException callException) {
        if (callException == null) {
            return null;
        }
        Tj.a.b(callException);
        return Unit.INSTANCE;
    }

    @Override // com.twilio.voice.Call.Listener
    public void onConnectFailure(Call call, CallException callException) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callException, "callException");
        b(callException);
        a(Dj.d.f2822d);
    }

    @Override // com.twilio.voice.Call.Listener
    public void onConnected(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a(Dj.d.f2819a);
        this.f3760a.b();
    }

    @Override // com.twilio.voice.Call.Listener
    public void onDisconnected(Call call, CallException callException) {
        Intrinsics.checkNotNullParameter(call, "call");
        this.f3760a.a();
        b(callException);
        if (callException == null || callException.getErrorCode() != 31530) {
            a(Dj.d.f2820b);
        } else {
            a(Dj.d.f2821c);
        }
    }

    @Override // com.twilio.voice.Call.Listener
    public void onReconnected(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
        a(Dj.d.f2824f);
    }

    @Override // com.twilio.voice.Call.Listener
    public void onReconnecting(Call call, CallException callException) {
        Intrinsics.checkNotNullParameter(call, "call");
        Intrinsics.checkNotNullParameter(callException, "callException");
        b(callException);
        a(Dj.d.f2823e);
    }

    @Override // com.twilio.voice.Call.Listener
    public void onRinging(Call call) {
        Intrinsics.checkNotNullParameter(call, "call");
    }
}
