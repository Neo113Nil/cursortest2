package com.vk.catalog.mvi.block.impl;

import com.vk.catalog.mvi.block.impl.PlaceholderView;
import kotlin.jvm.internal.PropertyReference1Impl;

/* compiled from: PlaceholderView.kt */
/* loaded from: classes.dex */
public final /* synthetic */ class z extends PropertyReference1Impl {
    public static final z b = new z(PlaceholderView.State.class, "viewState", "getViewState()Lcom/vk/catalog/mvi/block/impl/PlaceholderView$ViewState;", 0);

    @Override // kotlin.jvm.internal.PropertyReference1Impl, xsna.scy
    public final Object get(Object obj) {
        return ((PlaceholderView.State) obj).d;
    }
}
