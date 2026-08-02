package defpackage;

import android.graphics.Bitmap;
import android.graphics.Paint;
import com.sofascore.model.notifications.NotificationData;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class suh extends sq3 {
    public int A;
    public efd r;
    public NotificationData s;
    public Object t;
    public String u;
    public Bitmap v;
    public Paint w;
    public Paint x;
    public /* synthetic */ Object y;
    public final /* synthetic */ vuh z;

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public suh(vuh vuhVar, sq3 sq3Var) {
        super(sq3Var);
        this.z = vuhVar;
    }

    @Override // defpackage.h21
    public final Object invokeSuspend(Object obj) {
        this.y = obj;
        this.A |= Integer.MIN_VALUE;
        return this.z.a(null, null, this);
    }
}
