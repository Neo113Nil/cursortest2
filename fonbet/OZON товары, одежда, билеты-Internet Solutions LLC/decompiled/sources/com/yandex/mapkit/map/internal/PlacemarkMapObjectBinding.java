package com.yandex.mapkit.map.internal;

import android.graphics.PointF;
import androidx.annotation.NonNull;
import com.yandex.mapkit.geometry.Point;
import com.yandex.mapkit.map.Callback;
import com.yandex.mapkit.map.CompositeIcon;
import com.yandex.mapkit.map.Icon;
import com.yandex.mapkit.map.IconStyle;
import com.yandex.mapkit.map.Model;
import com.yandex.mapkit.map.PlacemarkAnimation;
import com.yandex.mapkit.map.PlacemarkMapObject;
import com.yandex.mapkit.map.PlacemarkText;
import com.yandex.mapkit.map.PlacemarkView;
import com.yandex.mapkit.map.TextStyle;
import com.yandex.runtime.NativeObject;
import com.yandex.runtime.image.ImageProvider;
import com.yandex.runtime.ui_view.ViewProvider;
import java.util.List;

/* loaded from: classes9.dex */
public class PlacemarkMapObjectBinding extends MapObjectBinding implements PlacemarkMapObject {
    protected PlacemarkMapObjectBinding(NativeObject nativeObject) {
        super(nativeObject);
    }

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native float getDirection();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @NonNull
    public native Point getGeometry();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native float getOpacity();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @NonNull
    public native PlacemarkText getText();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setDirection(float f7);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setGeometry(@NonNull Point point);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIcon(@NonNull ImageProvider imageProvider);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIcon(@NonNull ImageProvider imageProvider, @NonNull Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIcon(@NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIcon(@NonNull ImageProvider imageProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setIconStyle(@NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setOpacity(float f7);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setScaleFunction(@NonNull List<PointF> list);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setText(@NonNull String str);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setText(@NonNull String str, @NonNull TextStyle textStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setTextStyle(@NonNull TextStyle textStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setView(@NonNull ViewProvider viewProvider);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setView(@NonNull ViewProvider viewProvider, @NonNull Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setView(@NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    public native void setView(@NonNull ViewProvider viewProvider, @NonNull IconStyle iconStyle, @NonNull Callback callback);

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @NonNull
    public native PlacemarkAnimation useAnimation();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @NonNull
    public native CompositeIcon useCompositeIcon();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @NonNull
    public native Icon useIcon();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @NonNull
    public native Model useModel();

    @Override // com.yandex.mapkit.map.PlacemarkMapObject
    @NonNull
    public native PlacemarkView useView();
}
