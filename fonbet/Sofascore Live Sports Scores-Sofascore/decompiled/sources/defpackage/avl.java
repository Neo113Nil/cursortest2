package defpackage;

import android.view.View;
import com.blaze.blazesdk.custom_views.BlazeExpandableAndScrollableTextView;
import com.blaze.blazesdk.shared.BlazeSDK;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class avl implements Runnable {
    public final /* synthetic */ BlazeExpandableAndScrollableTextView a;
    public final /* synthetic */ float b;

    public avl(View view, BlazeExpandableAndScrollableTextView blazeExpandableAndScrollableTextView, float f) {
        this.a = blazeExpandableAndScrollableTextView;
        this.b = f;
    }

    @Override // java.lang.Runnable
    public final void run() {
        BlazeExpandableAndScrollableTextView blazeExpandableAndScrollableTextView = this.a;
        try {
            if (blazeExpandableAndScrollableTextView.getLayout() == null) {
                return;
            }
            blazeExpandableAndScrollableTextView.scrollTo(0, (int) (Math.max(0, r1.getHeight() - blazeExpandableAndScrollableTextView.getHeight()) * this.b));
        } catch (Throwable th) {
            BlazeSDK.INSTANCE.getGlobalThrowableCatcher$blazesdk_release().invoke(th, null);
        }
    }
}
