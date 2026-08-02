package com.vk.newsfeed.posting.market_picker.presentation.base.view;

import android.util.SparseArray;
import com.vk.dto.photo.Photo;
import com.vk.newsfeed.posting.market_picker.presentation.base.view.e;
import com.vkontakte.android.attachments.PhotoAttachment;
import java.util.ArrayList;
import xsna.bd70;
import xsna.e43;
import xsna.gzs;
import xsna.izs;
import xsna.qz40;
import xsna.s3q0;
import xsna.zqp;

/* compiled from: PhotosChangeListener.kt */
/* loaded from: classes4.dex */
public final class j implements bd70<Photo> {
    public final ArrayList b;
    public final SparseArray<gzs<s3q0>> c = new SparseArray<>();

    public j(ArrayList arrayList) {
        this.b = arrayList;
    }

    public final void a(izs<? super PhotoAttachment, Boolean> izsVar) {
        gzs<s3q0> gzsVar;
        int i = 0;
        for (Object obj : this.b) {
            int i2 = i + 1;
            if (i < 0) {
                e43.t();
                throw null;
            }
            if (izsVar.invoke(((e.b) obj).b).booleanValue() && (gzsVar = this.c.get(i)) != null) {
                gzsVar.invoke();
            }
            i = i2;
        }
    }

    @Override // xsna.bd70
    public final void x0(int i, int i2, Photo photo) {
        Photo photo2 = photo;
        if (i == 130) {
            a(new zqp(2, photo2));
        } else {
            if (i != 131) {
                return;
            }
            a(new qz40(photo2, 9));
        }
    }
}
