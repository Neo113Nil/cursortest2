package com.vk.ml;

import android.os.SystemClock;
import com.vk.core.apps.BuildInfo;
import com.vk.log.L;
import com.vk.ml.MLFeatures;
import java.io.File;
import java.util.Locale;
import java.util.UUID;
import kotlin.text.Regex;
import ru.ok.tracer.base.ucum.UcumUtils;
import xsna.brm0;
import xsna.emb;
import xsna.pjp;
import xsna.s3q0;
import xsna.vhk0;
import xsna.xa4;
import xsna.zb00;
import xsna.zr;

/* compiled from: ModelsAccessor.kt */
/* loaded from: classes3.dex */
public final class a {

    /* compiled from: ModelsAccessor.kt */
    /* renamed from: com.vk.ml.a$a, reason: collision with other inner class name */
    public interface InterfaceC1280a extends AutoCloseable {
        String B1();

        String I3();
    }

    /* compiled from: ModelsAccessor.kt */
    public static final class b implements InterfaceC1280a {
        public final String b;
        public final /* synthetic */ String c;
        public final /* synthetic */ MLFeatures.MLFeature d;
        public final /* synthetic */ File e;
        public final /* synthetic */ File f;
        public final /* synthetic */ com.vk.ml.b g;
        public final /* synthetic */ String h;

        public b(zb00 zb00Var, String str, MLFeatures.MLFeature mLFeature, File file, File file2, com.vk.ml.b bVar, String str2) {
            this.c = str;
            this.d = mLFeature;
            this.e = file;
            this.f = file2;
            this.g = bVar;
            this.h = str2;
            this.b = zb00Var.d;
        }

        @Override // com.vk.ml.a.InterfaceC1280a
        public final String B1() {
            return this.b;
        }

        @Override // com.vk.ml.a.InterfaceC1280a
        public final String I3() {
            return this.c;
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            File file = this.e;
            MLFeatures.MLFeature mLFeature = this.d;
            File file2 = this.f;
            com.vk.ml.b bVar = this.g;
            try {
                try {
                    String str = this.h;
                    if (BuildInfo.h()) {
                        long elapsedRealtime = SystemClock.elapsedRealtime();
                        bVar.getClass();
                        pjp.c(com.vk.ml.b.c(str), brm0.y(UUID.randomUUID().toString(), "-", "").substring(0, 32));
                        String c = com.vk.ml.b.c(str);
                        String a = pjp.a(c);
                        if (a == null) {
                            a = brm0.y(UUID.randomUUID().toString(), "-", "").substring(0, 32);
                            pjp.c(c, a);
                        }
                        xa4.o(file2, file, a.getBytes(emb.b));
                        s3q0 s3q0Var = s3q0.a;
                        L.e("[ModelsFileCrypt.encryptFile]: completed in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + UcumUtils.UCUM_MILLISECODS);
                    } else {
                        bVar.getClass();
                        pjp.c(com.vk.ml.b.c(str), brm0.y(UUID.randomUUID().toString(), "-", "").substring(0, 32));
                        String c2 = com.vk.ml.b.c(str);
                        String a2 = pjp.a(c2);
                        if (a2 == null) {
                            a2 = brm0.y(UUID.randomUUID().toString(), "-", "").substring(0, 32);
                            pjp.c(c2, a2);
                        }
                        xa4.o(file2, file, a2.getBytes(emb.b));
                    }
                    Regex regex = com.vk.core.files.a.a;
                } catch (Exception unused) {
                    L.G("recrypt failed for " + mLFeature + ", clearing out everything");
                    Regex regex2 = com.vk.core.files.a.a;
                    vhk0.d(file);
                    com.vk.ml.b bVar2 = MLFeatures.a;
                    MLFeatures.a(true);
                }
                vhk0.d(file2);
                bVar.k(mLFeature);
            } catch (Throwable th) {
                Regex regex3 = com.vk.core.files.a.a;
                vhk0.d(file2);
                bVar.k(mLFeature);
                throw th;
            }
        }
    }

    /* compiled from: ModelsAccessor.kt */
    public static final class c implements InterfaceC1280a {
        public final String b;
        public final /* synthetic */ File c;
        public final /* synthetic */ com.vk.ml.b d;
        public final /* synthetic */ MLFeatures.MLFeature e;

        public c(zb00 zb00Var, File file, com.vk.ml.b bVar, MLFeatures.MLFeature mLFeature) {
            this.c = file;
            this.d = bVar;
            this.e = mLFeature;
            this.b = zb00Var.d;
        }

        @Override // com.vk.ml.a.InterfaceC1280a
        public final String B1() {
            return this.b;
        }

        @Override // com.vk.ml.a.InterfaceC1280a
        public final String I3() {
            return this.c.getAbsolutePath();
        }

        @Override // java.lang.AutoCloseable
        public final void close() {
            this.d.k(this.e);
        }
    }

    public static InterfaceC1280a a(MLFeatures.MLFeature mLFeature) {
        MLFeatures.MLFeature mLFeature2;
        String c2;
        com.vk.ml.b bVar = MLFeatures.a;
        zb00 d = bVar.d(mLFeature);
        if (d == null) {
            throw new IllegalArgumentException("Model for feature " + mLFeature + " not found");
        }
        String str = d.b;
        File parentFile = new File(str).getParentFile();
        if (parentFile == null) {
            throw new IllegalArgumentException(zr.a("File ", str, " has no parent dir"));
        }
        String concat = mLFeature.name().toLowerCase(Locale.ROOT).concat(".tflite");
        File file = new File(parentFile, concat);
        bVar.i(mLFeature);
        if (!d.f) {
            return new c(d, file, bVar, mLFeature);
        }
        try {
            c2 = com.vk.ml.b.c(concat);
        } catch (Exception e) {
            e = e;
            mLFeature2 = mLFeature;
        }
        try {
            String a = pjp.a(c2);
            if (a == null) {
                a = brm0.y(UUID.randomUUID().toString(), "-", "").substring(0, 32);
                pjp.c(c2, a);
            }
            File file2 = new File(file.getAbsolutePath() + 'd');
            if (BuildInfo.h()) {
                long elapsedRealtime = SystemClock.elapsedRealtime();
                xa4.n(file, file2, a.getBytes(emb.b));
                s3q0 s3q0Var = s3q0.a;
                L.e("[ModelsFileCrypt.decryptFile]: completed in " + (SystemClock.elapsedRealtime() - elapsedRealtime) + UcumUtils.UCUM_MILLISECODS);
            } else {
                xa4.n(file, file2, a.getBytes(emb.b));
            }
            return new b(d, file2.getAbsolutePath(), mLFeature, file, file2, bVar, concat);
        } catch (Exception e2) {
            e = e2;
            mLFeature2 = mLFeature;
            L.G("decrypt failed for " + mLFeature2 + ", clearing out everything");
            Regex regex = com.vk.core.files.a.a;
            vhk0.d(file);
            MLFeatures.a(true);
            bVar.k(mLFeature2);
            throw e;
        }
    }
}
