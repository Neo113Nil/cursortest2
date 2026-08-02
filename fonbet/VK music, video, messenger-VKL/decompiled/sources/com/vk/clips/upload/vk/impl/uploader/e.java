package com.vk.clips.upload.vk.impl.uploader;

import android.util.SparseArray;
import com.vk.camera.clips.core.drafts.ClipsDraftVk;
import com.vk.clips.upload.model.ClipUploadData;
import com.vk.clips.upload.model.ClipUploadParams;
import com.vk.clips.upload.vk.impl.uploader.ClipsPersistentStore;
import com.vk.dto.clips.media.ClipsEncoderParameters;
import com.vk.dto.common.id.UserId;
import com.vk.instantjobs.exceptions.JobCauseException;
import com.vk.log.L;
import com.vk.upload.core.utils.UploadException;
import com.vk.upload.impl.UploadNotification;
import com.vkontakte.android.R;
import defpackage.i0;
import io.reactivex.rxjava3.internal.operators.single.v;
import java.util.Iterator;
import java.util.UUID;
import java.util.concurrent.Callable;
import java.util.concurrent.ConcurrentHashMap;
import kotlin.jvm.internal.FunctionReferenceImpl;
import ru.ok.android.utils.Logger;
import xsna.asu0;
import xsna.cp0;
import xsna.dh5;
import xsna.fkq0;
import xsna.hg1;
import xsna.izs;
import xsna.o25;
import xsna.s3q0;
import xsna.sp6;
import xsna.xdd;
import xsna.z6x;

/* compiled from: ClipsUploaderNew.kt */
/* loaded from: classes17.dex */
public final class e {
    public final io.reactivex.rxjava3.disposables.b a;
    public final ClipsPersistentStore b;
    public final SparseArray<xdd> c;

    /* compiled from: ClipsUploaderNew.kt */
    public static final /* synthetic */ class a extends FunctionReferenceImpl implements izs<Throwable, s3q0> {
        @Override // xsna.izs
        public final s3q0 invoke(Throwable th) {
            L.i(th);
            return s3q0.a;
        }
    }

    public e(io.reactivex.rxjava3.disposables.b bVar, ClipsPersistentStore clipsPersistentStore, SparseArray<xdd> sparseArray) {
        this.a = bVar;
        this.b = clipsPersistentStore;
        this.c = sparseArray;
    }

    public final void a(final ClipUploadData clipUploadData) {
        final ClipsPersistentStore.PersistedUpload persistedUpload = new ClipsPersistentStore.PersistedUpload(UUID.randomUUID().toString(), clipUploadData, null, null, null, null, null, 120, null);
        clipUploadData.d = ((sp6) persistedUpload.Fb()).d;
        hg1.e(this.a, new v(new Callable() { // from class: xsna.olf
            @Override // java.util.concurrent.Callable
            public final Object call() {
                com.vk.clips.upload.vk.impl.uploader.e eVar = com.vk.clips.upload.vk.impl.uploader.e.this;
                ClipsPersistentStore.PersistedUpload persistedUpload2 = persistedUpload;
                ClipUploadData clipUploadData2 = clipUploadData;
                ClipsPersistentStore clipsPersistentStore = eVar.b;
                synchronized (clipsPersistentStore) {
                    clipsPersistentStore.a.put(persistedUpload2.b, persistedUpload2);
                    clipsPersistentStore.a();
                    s3q0 s3q0Var = s3q0.a;
                }
                UploadNotification.a aVar = new UploadNotification.a(null, y8g0.e(R.string.clip_sent), null);
                Object Fb = persistedUpload2.Fb();
                com.vk.clips.upload.vk.impl.uploader.b bVar = (com.vk.clips.upload.vk.impl.uploader.b) Fb;
                bVar.K = false;
                clipUploadData2.Bb();
                bVar.o0(clipUploadData2);
                com.vk.upload.impl.a.g(bVar, aVar);
                com.vk.upload.impl.a.i((com.vk.clips.upload.vk.impl.uploader.b) Fb);
                if (clipUploadData2.b.Q) {
                    eVar.b(clipUploadData2, null);
                }
                L.e("ClipsUploaderNew", "start new clip upload, id=" + ((sp6) Fb).d);
                return s3q0.a;
            }
        }).q(asu0.a.c()).h(new i0(new dh5(11), 13)).subscribe());
    }

    public final void b(final ClipUploadData clipUploadData, final ClipsDraftVk clipsDraftVk) {
        final ClipsEncoderParameters clipsEncoderParameters = clipUploadData.c;
        ClipUploadParams clipUploadParams = clipUploadData.b;
        final UserId c = !fkq0.c(clipUploadParams.f) ? o25.a().c() : fkq0.e(clipUploadParams.f);
        hg1.e(this.a, new v(new Callable() { // from class: xsna.plf
            /* JADX WARN: Multi-variable type inference failed */
            @Override // java.util.concurrent.Callable
            public final Object call() {
                Object obj;
                ClipsPersistentStore.PersistedUpload persistedUpload;
                com.vk.clips.upload.vk.impl.uploader.e eVar = com.vk.clips.upload.vk.impl.uploader.e.this;
                ClipUploadData clipUploadData2 = clipUploadData;
                UserId userId = c;
                ClipsDraftVk clipsDraftVk2 = clipsDraftVk;
                ClipsEncoderParameters clipsEncoderParameters2 = clipsEncoderParameters;
                ClipsPersistentStore clipsPersistentStore = eVar.b;
                int i = clipUploadData2.d;
                synchronized (clipsPersistentStore) {
                    try {
                        Iterator<T> it = clipsPersistentStore.a.values().iterator();
                        while (true) {
                            if (!it.hasNext()) {
                                obj = null;
                                break;
                            }
                            obj = it.next();
                            if (i == ((sp6) ((ClipsPersistentStore.PersistedUpload) obj).Fb()).d) {
                                break;
                            }
                        }
                        persistedUpload = (ClipsPersistentStore.PersistedUpload) obj;
                    } catch (Throwable th) {
                        throw th;
                    }
                }
                if (persistedUpload == null) {
                    throw new UploadException(h5s.c(clipUploadData2.d, ", upload=null", new StringBuilder("failed to update clip upload ")));
                }
                kmv Fb = persistedUpload.Fb();
                ClipsPersistentStore clipsPersistentStore2 = eVar.b;
                synchronized (clipsPersistentStore2) {
                    persistedUpload.h = userId;
                    ((com.vk.clips.upload.vk.impl.uploader.b) persistedUpload.Fb()).E = userId;
                    persistedUpload.c = clipUploadData2;
                    persistedUpload.zb().h = userId;
                    persistedUpload.d = clipsDraftVk2;
                    clipsPersistentStore2.a();
                    s3q0 s3q0Var = s3q0.a;
                }
                com.vk.clips.upload.vk.impl.uploader.c.a.getClass();
                com.vk.clips.upload.vk.impl.uploader.c.l(Fb, clipUploadData2, userId);
                clipUploadData2.Bb();
                com.vk.clips.upload.vk.impl.uploader.b bVar = (com.vk.clips.upload.vk.impl.uploader.b) Fb;
                bVar.o0(clipUploadData2);
                sp6 sp6Var = (sp6) Fb;
                xdd xddVar = eVar.c.get(sp6Var.d);
                if (xddVar == null) {
                    xddVar = persistedUpload.zb();
                }
                xddVar.c = new had(clipsEncoderParameters2.f, 0);
                xddVar.j = clipUploadData2.b.m;
                ysg0<Object> ysg0Var = ysg0.b;
                ysg0Var.a(new med(xddVar));
                L.e("ClipsController", "update clip upload with new data, id=" + sp6Var.d);
                if (xddVar.f || xddVar.e) {
                    com.vk.clips.upload.vk.impl.uploader.c.i(xddVar);
                }
                L.e("ClipsController", "clip upload is ready to go to server, releasing lock, id=" + sp6Var.d);
                jed b = com.vk.clips.upload.vk.impl.uploader.c.b(sp6Var.d);
                if (b != null) {
                    b.d = true;
                    ysg0Var.a(b);
                }
                bVar.p0(true);
                ConcurrentHashMap<Integer, UploadNotification.a> concurrentHashMap = com.vk.upload.impl.a.a;
                rgl rglVar = z6x.a.a;
                if (rglVar == null) {
                    rglVar = null;
                }
                y6x y6xVar = (y6x) rglVar.c();
                c7x c7xVar = y6xVar.a;
                JobCauseException h = y6xVar.h("InstantJobManager#update", null);
                c7xVar.c();
                c7xVar.j(new bfb(c7xVar, h, bVar, 3));
                return s3q0.a;
            }
        }).q(asu0.a.c()).h(new cp0(new a(1, L.a, L.class, Logger.METHOD_E, "e(Ljava/lang/Throwable;)V", 0), 13)).subscribe());
    }
}
