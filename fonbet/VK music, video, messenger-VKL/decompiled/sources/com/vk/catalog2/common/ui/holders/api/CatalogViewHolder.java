package com.vk.catalog2.common.ui.holders.api;

import android.graphics.Rect;
import android.os.Bundle;
import android.view.LayoutInflater;
import android.view.View;
import android.view.ViewGroup;
import com.vk.catalog2.common.dto.api.ui.UIBlock;
import com.vk.core.apps.BuildInfo;
import com.vk.core.ui.tracking.views.UiTracking$TrackableView;
import xsna.izs;
import xsna.m0q0;
import xsna.s3q0;

/* compiled from: CatalogViewHolder.kt */
/* loaded from: classes16.dex */
public interface CatalogViewHolder extends m0q0, UiTracking$TrackableView {
    void L();

    void N6(UIBlock uIBlock);

    default <T extends View> void Se(T t, String str, izs<? super T, s3q0> izsVar) {
        if (BuildInfo.h() && t == null) {
            throw new RuntimeException(str);
        }
        if (t != null) {
            izsVar.invoke(t);
        }
    }

    View k5(LayoutInflater layoutInflater, ViewGroup viewGroup, Bundle bundle);

    default void yh(int i, UIBlock uIBlock) {
        N6(uIBlock);
    }

    default boolean ze(Rect rect) {
        return false;
    }
}
