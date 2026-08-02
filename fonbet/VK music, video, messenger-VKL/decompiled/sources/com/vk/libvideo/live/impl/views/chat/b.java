package com.vk.libvideo.live.impl.views.chat;

import com.vkontakte.android.R;
import xsna.cvk;

/* compiled from: ChatPresenter.java */
/* loaded from: classes3.dex */
public final class b extends io.reactivex.rxjava3.observers.a<Boolean> {
    @Override // io.reactivex.rxjava3.core.v
    public final void onComplete() {
        cvk.u(R.string.live_comment_group_removed, false);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final void onError(Throwable th) {
        cvk.u(R.string.live_comment_some_error, false);
    }

    @Override // io.reactivex.rxjava3.core.v
    public final /* bridge */ /* synthetic */ void onNext(Object obj) {
    }
}
