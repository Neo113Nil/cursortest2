package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.graphics.Paint;
import android.graphics.Typeface;
import com.sofascore.model.database.DbPendingNotification;
import com.sofascore.model.notifications.NotificationData;
import com.sofascore.results.R;
import com.unity3d.services.UnityAdsConstants;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import kotlin.Unit;
import kotlin.collections.CollectionsKt;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes5.dex */
public final class vuh {
    public final yhd a;
    public final Context b;
    public final joa c;

    public vuh(yhd yhdVar, Context context) {
        yhdVar.getClass();
        this.a = yhdVar;
        this.b = context;
        this.c = ypa.a(ysa.c, new e6g(this, 28));
    }

    /* JADX WARN: Code restructure failed: missing block: B:28:0x0180, code lost:
    
        if (r12 == null) goto L39;
     */
    /* JADX WARN: Removed duplicated region for block: B:13:0x01ba  */
    /* JADX WARN: Removed duplicated region for block: B:16:0x01bd  */
    /* JADX WARN: Removed duplicated region for block: B:25:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:33:0x0172  */
    /* JADX WARN: Removed duplicated region for block: B:34:0x005b  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x002d  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(efd efdVar, NotificationData notificationData, sq3 sq3Var) {
        suh suhVar;
        int i;
        String rating;
        efd efdVar2;
        int i2;
        NotificationData notificationData2;
        Bitmap f;
        Paint paint;
        Typeface typeface;
        Paint paint2;
        String str;
        NotificationData notificationData3;
        efd efdVar3;
        Bitmap bitmap;
        vuh vuhVar = this;
        if (sq3Var instanceof suh) {
            suhVar = (suh) sq3Var;
            int i3 = suhVar.A;
            if ((i3 & Integer.MIN_VALUE) != 0) {
                suhVar.A = i3 - Integer.MIN_VALUE;
                Object obj = suhVar.y;
                lu3 lu3Var = lu3.a;
                i = suhVar.A;
                joa joaVar = vuhVar.c;
                Context context = vuhVar.b;
                if (i != 0) {
                    y6a.M(obj);
                    rating = notificationData.getRating();
                    if (rating == null) {
                        efdVar2 = efdVar;
                        i2 = 2;
                        notificationData2 = notificationData;
                        String M = pco.M(notificationData2.getPlayerId());
                        urh urhVar = new urh();
                        suhVar.r = efdVar2;
                        suhVar.s = notificationData2;
                        suhVar.t = vuhVar;
                        suhVar.u = null;
                        suhVar.v = null;
                        suhVar.w = null;
                        suhVar.x = null;
                        suhVar.A = i2;
                        obj = inb.t(context, M, urhVar, suhVar);
                        if (obj != lu3Var) {
                            notificationData3 = notificationData2;
                            efdVar3 = efdVar2;
                            Bitmap bitmap2 = (Bitmap) obj;
                            if (vuhVar.b(efdVar3, notificationData3) <= 1) {
                            }
                        }
                        return lu3Var;
                    }
                    f = ((uhd) joaVar.getValue()).f(notificationData);
                    if (f == null) {
                        paint = new Paint();
                        paint.setColor(kpg.v(context, rating));
                        Paint paint3 = new Paint();
                        paint3.setColor(context.getColor(R.color.surface_1));
                        try {
                            typeface = z1g.a(R.font.sofascore_sans_bold_condensed, context);
                        } catch (Exception unused) {
                            typeface = Typeface.DEFAULT;
                        }
                        paint3.setTypeface(typeface);
                        paint3.setTextAlign(Paint.Align.CENTER);
                        String M2 = pco.M(notificationData.getPlayerId());
                        urh urhVar2 = new urh();
                        efdVar2 = efdVar;
                        suhVar.r = efdVar2;
                        suhVar.s = notificationData;
                        suhVar.t = rating;
                        suhVar.u = rating;
                        suhVar.v = f;
                        suhVar.w = paint;
                        suhVar.x = paint3;
                        suhVar.A = 1;
                        Object t = inb.t(context, M2, urhVar2, suhVar);
                        if (t != lu3Var) {
                            notificationData2 = notificationData;
                            paint2 = paint3;
                            obj = t;
                            str = rating;
                        }
                        return lu3Var;
                    }
                    efdVar2 = efdVar;
                    i2 = 2;
                    notificationData2 = notificationData;
                    vuhVar.b(efdVar2, notificationData2);
                    efdVar2.f(f);
                } else {
                    if (i != 1) {
                        if (i != 2) {
                            a70.r("call to 'resume' before 'invoke' with coroutine");
                            return null;
                        }
                        vuhVar = (vuh) suhVar.t;
                        notificationData3 = suhVar.s;
                        efdVar3 = suhVar.r;
                        y6a.M(obj);
                        Bitmap bitmap22 = (Bitmap) obj;
                        if (vuhVar.b(efdVar3, notificationData3) <= 1) {
                            return Unit.a;
                        }
                        efdVar3.f(bitmap22);
                        return Unit.a;
                    }
                    paint2 = suhVar.x;
                    paint = suhVar.w;
                    f = suhVar.v;
                    rating = suhVar.u;
                    str = (String) suhVar.t;
                    notificationData2 = suhVar.s;
                    efdVar2 = suhVar.r;
                    y6a.M(obj);
                }
                Paint paint4 = paint;
                bitmap = (Bitmap) obj;
                if (bitmap == null) {
                    rating.getClass();
                    paint4.getClass();
                    paint2.getClass();
                    Bitmap z = oyn.z(bitmap, 150);
                    int width = z.getWidth() + 15;
                    int height = z.getHeight() + 15;
                    Bitmap.Config config = Bitmap.Config.ARGB_8888;
                    Bitmap createBitmap = Bitmap.createBitmap(width, height, config);
                    createBitmap.getClass();
                    Canvas canvas = new Canvas(createBitmap);
                    i2 = 2;
                    canvas.drawBitmap(z, 15.0f, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (Paint) null);
                    paint2.setTextSize(49.0f);
                    Bitmap createBitmap2 = Bitmap.createBitmap(82, 82, config);
                    Canvas canvas2 = new Canvas(createBitmap2);
                    canvas2.drawRoundRect(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, 82.0f, 82.0f, 15.0f, 15.0f, paint4);
                    canvas2.drawText(rating, canvas2.getWidth() / 2.0f, (canvas2.getHeight() / 2) - ((paint2.ascent() + paint2.descent()) / 2.0f), paint2);
                    createBitmap2.getClass();
                    canvas.drawBitmap(createBitmap2, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, (z.getHeight() + 15) - 82.0f, (Paint) null);
                    f = oyn.P(createBitmap, ao2.s(32, context));
                    uhd uhdVar = (uhd) joaVar.getValue();
                    uhdVar.getClass();
                    notificationData2.getClass();
                    uhdVar.e(f, uhd.g(notificationData2));
                } else {
                    i2 = 2;
                }
                rating = str;
                vuhVar.b(efdVar2, notificationData2);
                efdVar2.f(f);
            }
        }
        suhVar = new suh(vuhVar, sq3Var);
        Object obj2 = suhVar.y;
        lu3 lu3Var2 = lu3.a;
        i = suhVar.A;
        joa joaVar2 = vuhVar.c;
        Context context2 = vuhVar.b;
        if (i != 0) {
        }
        Paint paint42 = paint;
        bitmap = (Bitmap) obj2;
        if (bitmap == null) {
        }
        rating = str;
        vuhVar.b(efdVar2, notificationData2);
        efdVar2.f(f);
    }

    public final int b(efd efdVar, NotificationData notificationData) {
        List<DbPendingNotification> list = (List) gz8.S(this.a.a.a, true, false, new bvb(notificationData.getGroupKey(), 11));
        ArrayList arrayList = new ArrayList(k13.r(list, 10));
        for (DbPendingNotification dbPendingNotification : list) {
            arrayList.add(new NotificationData(dbPendingNotification.getTitle(), dbPendingNotification.getMessage(), "", 0, null, dbPendingNotification.getId(), 0, 0, 0, 0, null, 0, null, null, 0, dbPendingNotification.getUpdatableNotificationId(), null, 0, null, null, 0L, 2064344, null));
        }
        List B0 = CollectionsKt.B0(arrayList);
        String footer = notificationData.getFooter();
        if (B0.size() > 1) {
            efdVar.d(notificationData.getTitle());
            efdVar.f = efd.c(((NotificationData) B0.get(0)).getMessage());
            efdVar.v.icon = 2131231886;
            efdVar.i = B0.size();
            afd afdVar = new afd(1);
            afdVar.b = efd.c(notificationData.getTitle());
            Iterator it = B0.iterator();
            while (it.hasNext()) {
                String message = ((NotificationData) it.next()).getMessage();
                if (message != null) {
                    ((ArrayList) afdVar.d).add(efd.c(message));
                }
            }
            if (footer != null && footer.length() != 0) {
                ((ArrayList) afdVar.d).add(efd.c(footer));
            }
            efdVar.g(afdVar);
        } else if (B0.size() == 1) {
            NotificationData notificationData2 = (NotificationData) B0.get(0);
            efdVar.d(notificationData.getTitle());
            efdVar.f = efd.c(notificationData2.getMessage());
            if (footer == null || footer.length() == 0) {
                afd afdVar2 = new afd(0);
                afdVar2.d = efd.c(notificationData2.getMessage());
                efdVar.g(afdVar2);
            } else {
                efdVar.v.icon = 2131231886;
                efdVar.i = 1;
                afd afdVar3 = new afd(1);
                afdVar3.b = efd.c(notificationData.getTitle());
                String message2 = notificationData2.getMessage();
                if (message2 != null) {
                    ((ArrayList) afdVar3.d).add(efd.c(message2));
                }
                ((ArrayList) afdVar3.d).add(efd.c(footer));
                efdVar.g(afdVar3);
            }
        } else {
            afd afdVar4 = new afd(0);
            afdVar4.d = efd.c(notificationData.getMessage());
            efdVar.g(afdVar4);
            efdVar.d(notificationData.getTitle());
            efdVar.f = efd.c(notificationData.getMessage());
        }
        return B0.size();
    }
}
