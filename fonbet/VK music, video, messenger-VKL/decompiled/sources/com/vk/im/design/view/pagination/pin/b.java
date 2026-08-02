package com.vk.im.design.view.pagination.pin;

import android.view.View;
import android.widget.ImageView;
import java.util.List;
import xsna.bcr0;

/* compiled from: ImMultiPinViewApi.kt */
/* loaded from: classes2.dex */
public interface b {

    /* compiled from: ImMultiPinViewApi.kt */
    public interface a {
        void a(int i);
    }

    View getView();

    void setClickListener(a aVar);

    void setCurrentItem(int i);

    void setImageControllerFactory(bcr0<? extends ImageView> bcr0Var);

    void setIndicatorColor(int i);

    void setItemList(List<? extends ImPinItem> list);
}
