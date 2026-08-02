package ru.ozon.app.android.geo.map.utils;

import Sc.r;
import Sc.s;
import android.graphics.Bitmap;
import android.graphics.Canvas;
import android.view.View;
import java.net.URLDecoder;
import java.nio.charset.StandardCharsets;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;
import ru.ozon.app.android.geo.map.presentation.AddressEditMapVO;
import we0.i;

@Metadata(d1 = {"\u0000 \n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0010\u000e\n\u0002\b\u0003\u001a\u0013\u0010\u0002\u001a\u00020\u0001*\u00020\u0000H\u0000¢\u0006\u0004\b\u0002\u0010\u0003\u001a\u0013\u0010\u0006\u001a\u00020\u0005*\u00020\u0004H\u0000¢\u0006\u0004\b\u0006\u0010\u0007\u001a\u0015\u0010\t\u001a\u0004\u0018\u00010\b*\u00020\bH\u0000¢\u0006\u0004\b\t\u0010\n¨\u0006\u000b"}, d2 = {"Landroid/view/View;", "Landroid/graphics/Bitmap;", "getBitmap", "(Landroid/view/View;)Landroid/graphics/Bitmap;", "Lwe0/i;", "Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "toViewPort", "(Lwe0/i;)Lru/ozon/app/android/geo/map/presentation/AddressEditMapVO$ViewPort;", "", "decodeLink", "(Ljava/lang/String;)Ljava/lang/String;", "geo_prodGoogleAllVendorsRelease"}, k = 2, mv = {2, 0, 0}, xi = 48)
/* loaded from: classes12.dex */
public final class UtilsKt {
    public static final String decodeLink(@NotNull String str) {
        Object a11;
        Intrinsics.checkNotNullParameter(str, "<this>");
        try {
            r.Companion companion = r.INSTANCE;
            a11 = URLDecoder.decode(str, StandardCharsets.UTF_8.name());
        } catch (Throwable th2) {
            r.Companion companion2 = r.INSTANCE;
            a11 = s.a(th2);
        }
        if (a11 instanceof r.b) {
            a11 = null;
        }
        return (String) a11;
    }

    @NotNull
    public static final Bitmap getBitmap(@NotNull View view) {
        Intrinsics.checkNotNullParameter(view, "<this>");
        view.measure(0, 0);
        Bitmap createBitmap = Bitmap.createBitmap(view.getMeasuredWidth(), view.getMeasuredHeight(), Bitmap.Config.ARGB_8888);
        Intrinsics.checkNotNullExpressionValue(createBitmap, "createBitmap(...)");
        Canvas canvas = new Canvas(createBitmap);
        view.layout(0, 0, view.getWidth(), view.getHeight());
        view.draw(canvas);
        return createBitmap;
    }

    @NotNull
    public static final AddressEditMapVO.ViewPort toViewPort(@NotNull i iVar) {
        Intrinsics.checkNotNullParameter(iVar, "<this>");
        return new AddressEditMapVO.ViewPort(new AddressEditMapVO.Coordinate(iVar.d().getLatitude(), iVar.d().getLongitude()), new AddressEditMapVO.Coordinate(iVar.g().getLatitude(), iVar.g().getLongitude()));
    }
}
