package u9;

import android.view.MotionEvent;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e {

    /* renamed from: a, reason: collision with root package name */
    public final int f24085a;

    /* renamed from: b, reason: collision with root package name */
    public final float f24086b;

    /* renamed from: c, reason: collision with root package name */
    public final float f24087c;

    /* renamed from: d, reason: collision with root package name */
    public final long f24088d;

    public e(MotionEvent motionEvent, int i5, int i10, float f6, float f10) {
        this.f24085a = motionEvent.getPointerId(i5);
        this.f24086b = motionEvent.getHistoricalX(i5, i10) + f6;
        this.f24087c = motionEvent.getHistoricalY(i5, i10) + f10;
        this.f24088d = motionEvent.getHistoricalEventTime(i10);
    }
}
