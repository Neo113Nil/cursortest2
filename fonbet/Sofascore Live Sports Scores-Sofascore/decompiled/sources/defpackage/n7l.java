package defpackage;

import android.content.Context;
import android.graphics.Bitmap;
import android.util.LruCache;
import com.sofascore.model.mvvm.model.Category;
import com.sofascore.model.mvvm.model.Stage;
import com.sofascore.model.mvvm.model.StageSeason;
import com.sofascore.model.mvvm.model.UniqueStage;
import kotlin.Unit;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes6.dex */
public final class n7l {
    public static final n7l a = new n7l();
    public static final LruCache b = new LruCache(128);

    public static Bitmap a(String str) {
        LruCache lruCache = b;
        Bitmap bitmap = (Bitmap) lruCache.get(str);
        if (bitmap != null) {
            return bitmap;
        }
        ia0 ia0Var = ia0.q;
        Bitmap c = ((mw1) ok3.p().m.getValue()).c(str);
        if (c == null) {
            return null;
        }
        lruCache.put(str, c);
        return c;
    }

    public static l7l c(Stage stage) {
        UniqueStage uniqueStage;
        Category category;
        StageSeason stageSeason = stage.getStageSeason();
        if (stageSeason == null || (uniqueStage = stageSeason.getUniqueStage()) == null || (category = uniqueStage.getCategory()) == null) {
            return null;
        }
        int id = category.getId();
        return new l7l(ljg.j(id, "stage_"), vxd.j(id, (Intrinsics.c(uaa.c, "api.sofascore.com/") ? "https://img.sofascore.com/" : dmi.q("https://", uaa.c)).concat("api/v1/"), "category/", "/image"));
    }

    /* JADX WARN: Removed duplicated region for block: B:12:0x006b  */
    /* JADX WARN: Removed duplicated region for block: B:15:0x0074  */
    /* JADX WARN: Removed duplicated region for block: B:21:0x0032  */
    /* JADX WARN: Removed duplicated region for block: B:8:0x0022  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object b(Context context, l7l l7lVar, sq3 sq3Var) {
        m7l m7lVar;
        int i;
        Bitmap c;
        Object u;
        mw1 mw1Var;
        Bitmap bitmap;
        if (sq3Var instanceof m7l) {
            m7lVar = (m7l) sq3Var;
            int i2 = m7lVar.v;
            if ((i2 & Integer.MIN_VALUE) != 0) {
                m7lVar.v = i2 - Integer.MIN_VALUE;
                Object obj = m7lVar.t;
                lu3 lu3Var = lu3.a;
                i = m7lVar.v;
                Bitmap bitmap2 = null;
                if (i != 0) {
                    y6a.M(obj);
                    ia0 ia0Var = ia0.q;
                    mw1 mw1Var2 = (mw1) ok3.p().m.getValue();
                    c = mw1Var2.c(l7lVar.a);
                    if (c == null) {
                        int s = ao2.s(16, context);
                        String str = l7lVar.b;
                        kjh g = aba.g(s, s);
                        m7lVar.r = l7lVar;
                        m7lVar.s = mw1Var2;
                        m7lVar.v = 1;
                        u = inb.g.u(context, str, g, Bitmap.Config.ARGB_8888, m7lVar);
                        if (u == lu3Var) {
                            return lu3Var;
                        }
                        mw1Var = mw1Var2;
                        obj = u;
                    }
                    if (c != null) {
                    }
                    return Unit.a;
                }
                if (i != 1) {
                    a70.r("call to 'resume' before 'invoke' with coroutine");
                    return null;
                }
                mw1Var = m7lVar.s;
                l7lVar = m7lVar.r;
                y6a.M(obj);
                bitmap = (Bitmap) obj;
                if (bitmap != null) {
                    mw1Var.e(bitmap, l7lVar.a);
                    bitmap2 = bitmap;
                }
                c = bitmap2;
                if (c != null) {
                }
                return Unit.a;
            }
        }
        m7lVar = new m7l(this, sq3Var);
        Object obj2 = m7lVar.t;
        lu3 lu3Var2 = lu3.a;
        i = m7lVar.v;
        Bitmap bitmap22 = null;
        if (i != 0) {
        }
        bitmap = (Bitmap) obj2;
        if (bitmap != null) {
        }
        c = bitmap22;
        if (c != null) {
        }
        return Unit.a;
    }
}
