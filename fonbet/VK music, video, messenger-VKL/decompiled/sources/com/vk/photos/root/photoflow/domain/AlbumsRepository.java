package com.vk.photos.root.photoflow.domain;

import com.vk.dto.common.data.VKList;
import com.vk.dto.common.id.UserId;
import com.vk.dto.photo.PhotoAlbum;
import defpackage.q0;
import io.reactivex.rxjava3.core.q;
import io.reactivex.rxjava3.internal.operators.completable.w;
import io.reactivex.rxjava3.internal.operators.observable.b1;
import io.reactivex.rxjava3.internal.operators.observable.j1;
import xsna.epx;

/* compiled from: AlbumsRepository.kt */
/* loaded from: classes4.dex */
public interface AlbumsRepository {

    /* compiled from: AlbumsRepository.kt */
    public static final class PermissionException extends RuntimeException {
    }

    /* compiled from: AlbumsRepository.kt */
    public static final class a {
        public final VKList<PhotoAlbum> a;
        public final boolean b;

        public a(VKList<PhotoAlbum> vKList, boolean z) {
            this.a = vKList;
            this.b = z;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof a)) {
                return false;
            }
            a aVar = (a) obj;
            return epx.f(this.a, aVar.a) && this.b == aVar.b;
        }

        public final int hashCode() {
            return Boolean.hashCode(this.b) + (this.a.hashCode() * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("AllAlbumsLoadResult(albums=");
            sb.append(this.a);
            sb.append(", endOfList=");
            return q0.a(sb, this.b, ')');
        }
    }

    j1 a(int i, UserId userId);

    b1 b(int i, UserId userId, Integer num, Integer num2);

    q c(int i, int i2, UserId userId, boolean z);

    w d(int i, UserId userId);

    void e();

    q f(int i, int i2, UserId userId, boolean z);

    q<VKList<PhotoAlbum>> h(UserId userId, boolean z);
}
