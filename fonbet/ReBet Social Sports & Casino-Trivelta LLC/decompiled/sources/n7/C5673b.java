package n7;

import android.graphics.PointF;
import android.graphics.Rect;
import android.net.Uri;
import java.util.Map;
import kotlin.jvm.internal.Intrinsics;
import o7.InterfaceC5820b;

/* renamed from: n7.b, reason: case insensitive filesystem */
/* loaded from: classes2.dex */
public final class C5673b {

    /* renamed from: a, reason: collision with root package name */
    public static final C5673b f57075a = new C5673b();

    public static final InterfaceC5820b.a a(Map componentAttribution, Map shortcutAttribution, Map map, Map map2, Rect rect, String str, PointF pointF, Map map3, Object obj, boolean z10, Uri uri) {
        Intrinsics.checkNotNullParameter(componentAttribution, "componentAttribution");
        Intrinsics.checkNotNullParameter(shortcutAttribution, "shortcutAttribution");
        InterfaceC5820b.a aVar = new InterfaceC5820b.a();
        if (rect != null) {
            aVar.f59367h = rect.width();
            aVar.f59368i = rect.height();
        }
        aVar.f59369j = str;
        if (pointF != null) {
            aVar.f59370k = Float.valueOf(pointF.x);
            aVar.f59371l = Float.valueOf(pointF.y);
        }
        aVar.f59365f = obj;
        aVar.f59372m = z10;
        aVar.f59366g = uri;
        aVar.f59362c = map;
        aVar.f59363d = map3;
        aVar.f59361b = shortcutAttribution;
        aVar.f59360a = componentAttribution;
        aVar.f59364e = map2;
        return aVar;
    }
}
