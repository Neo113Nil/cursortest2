package com.vk.photos.root.common;

import android.content.Context;
import android.content.Intent;
import com.ironsource.X3;
import com.vk.dto.common.id.UserId;
import com.vk.inappreview.InAppReviewConditionKey;
import com.vk.photos.root.common.PhotoUploadInteractor;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import java.util.ArrayList;
import java.util.Collections;
import java.util.Iterator;
import java.util.List;
import xsna.b25;
import xsna.c5g;
import xsna.ev6;
import xsna.fsk;
import xsna.izs;
import xsna.j5g;
import xsna.jgp;
import xsna.k990;
import xsna.yva;

/* compiled from: PhotoUploadInteractorImpl.kt */
/* loaded from: classes4.dex */
public final class a implements PhotoUploadInteractor {
    public final Context a;
    public final izs<String, com.vk.upload.impl.b<?>> b;

    /* compiled from: PhotoUploadInteractorImpl.kt */
    /* renamed from: com.vk.photos.root.common.a$a, reason: collision with other inner class name */
    public static final class C1500a implements PhotoUploadInteractor.a {
        public final Context a;
        public final b25 b;

        public C1500a(Context context, b25 b25Var) {
            this.a = context;
            this.b = b25Var;
        }

        @Override // com.vk.photos.root.common.PhotoUploadInteractor.a
        public final a a(int i, UserId userId) {
            return new a(this.a, i == -183 ? new k990(3) : new yva(this.b.c(), i, userId, 1));
        }
    }

    /* JADX WARN: Multi-variable type inference failed */
    public a(Context context, izs<? super String, ? extends com.vk.upload.impl.b<?>> izsVar) {
        this.a = context;
        this.b = izsVar;
    }

    @Override // com.vk.photos.root.common.PhotoUploadInteractor
    public final Integer a(int i, int i2, Intent intent, io.reactivex.rxjava3.disposables.b bVar) {
        if (i == 23 && i2 == -1 && intent != null) {
            Iterable stringArrayListExtra = intent.hasExtra("files") ? intent.getStringArrayListExtra("files") : Collections.singletonList(intent.getStringExtra(X3.i.b));
            List<String> V = stringArrayListExtra != null ? j5g.V(stringArrayListExtra) : null;
            if (V != null) {
                return Integer.valueOf(b(V, bVar));
            }
        }
        return null;
    }

    public final int b(List<String> list, io.reactivex.rxjava3.disposables.b bVar) {
        List<String> list2 = list;
        ArrayList arrayList = new ArrayList(c5g.u(list2, 10));
        Iterator<T> it = list2.iterator();
        while (it.hasNext()) {
            arrayList.add(this.b.invoke((String) it.next()));
        }
        ev6 ev6Var = new ev6(arrayList, this.a.getString(R.string.uploading_photo));
        com.vk.upload.impl.a.g(ev6Var, new UploadNotification.a(null, this.a.getString(R.string.photos_upload_ok), this.a.getString(R.string.photos_upload_ok_long)));
        ev6Var.m = new PhotoUploadInteractor.UploadTaskExtraParams(list);
        if (list.size() >= 3) {
            bVar.b(fsk.c.b(InAppReviewConditionKey.LOAD_3_MORE_PHOTOS, jgp.b).subscribe());
        }
        return com.vk.upload.impl.a.i(ev6Var);
    }
}
