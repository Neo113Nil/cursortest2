package com.yandex.mapkit.places.mrc;

import android.content.Context;
import android.util.AttributeSet;
import android.widget.RelativeLayout;
import com.yandex.mapkit.places.PlacesFactory;
import com.yandex.mapkit.places.mrc.internal.MrcPhotoPlayerBinding;
import com.yandex.runtime.view.PlatformView;
import com.yandex.runtime.view.PlatformViewFactory;

/* loaded from: classes9.dex */
public class MrcPhotoView extends RelativeLayout {
    private PlatformView platformView_;
    private MrcPhotoPlayerBinding player_;

    public MrcPhotoView(Context context) {
        this(context, null, 0);
    }

    public MrcPhotoPlayer getPlayer() {
        return this.player_;
    }

    public void onMemoryWarning() {
        this.platformView_.onMemoryWarning();
    }

    public void onStart() {
        this.platformView_.start();
        this.platformView_.resume();
    }

    public void onStop() {
        this.platformView_.pause();
        this.platformView_.stop();
    }

    public void setNoninteractive(boolean z11) {
        this.platformView_.setNoninteractive(z11);
    }

    public MrcPhotoView(Context context, AttributeSet attributeSet) {
        this(context, attributeSet, 0);
    }

    public MrcPhotoView(Context context, AttributeSet attributeSet, int i11) {
        super(context, attributeSet, i11);
        this.platformView_ = PlatformViewFactory.getPlatformView(context, PlatformViewFactory.convertAttributeSet(context, attributeSet));
        this.player_ = (MrcPhotoPlayerBinding) PlacesFactory.getInstance().createMrcPhotoPlayer(this.platformView_);
        addView(this.platformView_.getView(), new RelativeLayout.LayoutParams(-1, -1));
    }
}
