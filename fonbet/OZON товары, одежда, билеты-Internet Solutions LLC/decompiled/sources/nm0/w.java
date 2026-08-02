package nm0;

import Ve.C4400l0;
import Ve.W8;
import android.os.Handler;
import android.os.Looper;
import kotlin.Unit;
import kotlin.jvm.functions.Function1;
import kotlin.jvm.internal.AbstractC7737t;
import kotlin.jvm.internal.Intrinsics;
import spay.sdk.view.otpTextView.SpayOtpTextView;

/* loaded from: classes4.dex */
public final class w extends AbstractC7737t implements Function1 {

    /* renamed from: b, reason: collision with root package name */
    public final /* synthetic */ int f77426b;

    /* renamed from: c, reason: collision with root package name */
    public final /* synthetic */ Object f77427c;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public /* synthetic */ w(Object obj, int i11) {
        super(1);
        this.f77426b = i11;
        this.f77427c = obj;
    }

    @Override // kotlin.jvm.functions.Function1
    public final Object invoke(Object obj) {
        SpayOtpTextView spayOtpTextView;
        W8 view;
        switch (this.f77426b) {
            case 0:
                wl0.c error = (wl0.c) obj;
                Intrinsics.checkNotNullParameter(error, "error");
                ((lm0.e) this.f77427c).a(error);
                break;
            case 1:
                wl0.c error2 = (wl0.c) obj;
                Intrinsics.checkNotNullParameter(error2, "error");
                ((lm0.e) this.f77427c).a(error2);
                break;
            default:
                if (Intrinsics.d((Boolean) obj, Boolean.TRUE) && (view = (spayOtpTextView = ((C4400l0) this.f77427c).f31486d).f98899b) != null) {
                    view.requestFocus();
                    Intrinsics.checkNotNullParameter(spayOtpTextView, "<this>");
                    Intrinsics.checkNotNullParameter(view, "view");
                    Intrinsics.checkNotNullParameter(spayOtpTextView, "<this>");
                    Intrinsics.checkNotNullParameter(view, "view");
                    new Handler(Looper.getMainLooper()).postDelayed(new Nu.a(2, spayOtpTextView, view), 100);
                }
                break;
        }
        return Unit.f71690a;
    }
}
