package com.vk.photos.root.photoflow.domain;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.Photo;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.core.x;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import java.util.ArrayList;
import java.util.List;
import xsna.f8a0;
import xsna.i0r;
import xsna.qw80;
import xsna.x7a0;

/* compiled from: PhotoFlowInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class a implements x7a0 {
    public final f8a0 a;
    public final AlbumsRepository b;

    public a(f8a0 f8a0Var, AlbumsRepository albumsRepository) {
        this.a = f8a0Var;
        this.b = albumsRepository;
    }

    @Override // xsna.x7a0
    public final x a(UserId userId, List list) {
        return this.a.a(userId, list);
    }

    @Override // xsna.x7a0
    public final io.reactivex.rxjava3.core.a b(Photo photo, UserId userId) {
        return this.a.b(photo, userId);
    }

    @Override // xsna.x7a0
    public final x c(ArrayList arrayList, int i, UserId userId) {
        return this.a.c(arrayList, i, userId);
    }

    @Override // xsna.x7a0
    public final q<VKList<Photo>> d(UserId userId, String str) {
        return f8a0.g(this.a, userId, str, null, 26);
    }

    @Override // xsna.x7a0
    public final io.reactivex.rxjava3.core.a e(Photo photo) {
        return this.a.i(photo);
    }

    @Override // xsna.x7a0
    public final io.reactivex.rxjava3.core.a f(Photo photo) {
        return this.a.h(photo);
    }

    @Override // xsna.x7a0
    public final j1 g(UserId userId) {
        return this.b.f(30, 0, userId, false).U(new qw80(new i0r(12), 1));
    }
}
