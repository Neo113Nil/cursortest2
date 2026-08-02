package defpackage;

import android.graphics.PointF;
import android.graphics.RectF;
import android.os.Parcelable;
import com.sofascore.model.mvvm.model.Point2D;
import com.unity3d.services.UnityAdsConstants;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class a08 {
    public boolean a;
    public boolean b;
    public Parcelable c;
    public Object d;

    public static void a(a08 a08Var, Point2D point2D, PointF pointF, float f, int i) {
        if ((i & 8) != 0) {
            f = 0.0f;
        }
        RectF rectF = (RectF) a08Var.d;
        point2D.getClass();
        pointF.getClass();
        pointF.set(((rectF.width() * (a08Var.a ? 100.0f - point2D.getX() : point2D.getX())) / 100.0f) + rectF.left + UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, ((rectF.height() * (a08Var.b ? 100.0f - point2D.getY() : point2D.getY())) / 100.0f) + rectF.top + f);
    }
}
