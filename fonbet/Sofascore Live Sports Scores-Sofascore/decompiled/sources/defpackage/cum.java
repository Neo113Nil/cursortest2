package defpackage;

import android.view.MotionEvent;
import androidx.recyclerview.widget.RecyclerView;
import com.unity3d.services.UnityAdsConstants;
import defpackage.rgm;
import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.Nullable;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes2.dex */
public final class cum extends rgm {
    public /* synthetic */ cum(opl oplVar, float f, float f2, float f3, int i, DefaultConstructorMarker defaultConstructorMarker) {
        this(oplVar, (i & 2) != 0 ? 3.0f : f, (i & 4) != 0 ? 1.0f : f2, (i & 8) != 0 ? -2.0f : f3);
    }

    @Override // defpackage.rgm
    public final rgm.a a() {
        return new mrm();
    }

    @Override // defpackage.rgm
    public final void b(RecyclerView recyclerView, float f) {
        if (recyclerView != null) {
            recyclerView.setTranslationY(f);
        }
    }

    @Override // defpackage.rgm
    public final void c(RecyclerView recyclerView, float f, MotionEvent motionEvent) {
        if (recyclerView != null) {
            recyclerView.setTranslationY(f);
        }
        motionEvent.offsetLocation(f - motionEvent.getY(0), UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT);
    }

    @Override // defpackage.rgm
    public final rgm.e d() {
        return new usm();
    }

    public cum(@Nullable opl oplVar, float f) {
        this(oplVar, f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 12, null);
    }

    public cum(@Nullable opl oplVar, float f, float f2) {
        this(oplVar, f, f2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 8, null);
    }

    public cum(@Nullable opl oplVar) {
        this(oplVar, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 14, null);
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public cum(@Nullable opl oplVar, float f, float f2, float f3) {
        super(oplVar, f3, f, f2);
        oplVar.getClass();
    }
}
