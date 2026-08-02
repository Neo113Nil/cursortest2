package com.vk.newsfeed.common.util;

import com.vk.newsfeed.common.util.NewsfeedViewPostCache;
import xsna.izs;
import xsna.s3q0;

/* compiled from: R8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class i implements izs {
    @Override // xsna.izs
    public final Object invoke(Object obj) {
        NewsfeedViewPostCache.SetWrapper setWrapper = (NewsfeedViewPostCache.SetWrapper) obj;
        NewsfeedViewPostCache.SetWrapper setWrapper2 = NewsfeedViewPostCache.a;
        if (setWrapper2.b.isEmpty()) {
            setWrapper2.b.addAll(setWrapper.b);
        }
        return s3q0.a;
    }
}
