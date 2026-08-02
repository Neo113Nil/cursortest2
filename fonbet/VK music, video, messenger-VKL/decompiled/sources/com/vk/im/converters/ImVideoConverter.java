package com.vk.im.converters;

import android.content.Context;
import android.net.Uri;
import android.util.Size;
import com.vk.log.L;
import com.vk.media.MediaUtils;
import com.vk.media.ext.VideoEncoderSettings;
import java.io.File;
import java.io.FileNotFoundException;
import kotlin.jvm.internal.Ref$ObjectRef;
import kotlin.text.Regex;
import xsna.abt0;
import xsna.bu0;
import xsna.e43;
import xsna.f8r;
import xsna.gzs;
import xsna.i6n0;
import xsna.oeq0;
import xsna.ph20;
import xsna.r9r;
import xsna.yjt;
import xsna.z2e0;

/* compiled from: ImVideoConverter.kt */
/* loaded from: classes2.dex */
public final class ImVideoConverter implements f8r {
    public final VideoEncoderSettings a;
    public final ph20.b b;

    /* compiled from: ImVideoConverter.kt */
    public static final class MediaConverterException extends Exception {
        private static final long serialVersionUID = 4018295681937205671L;
    }

    /* compiled from: ImVideoConverter.kt */
    public static final class MediaTranscodingException extends RuntimeException {
    }

    public ImVideoConverter(VideoEncoderSettings videoEncoderSettings, bu0 bu0Var, ph20.b bVar) {
        this.a = videoEncoderSettings;
        this.b = bVar;
    }

    @Override // xsna.f8r
    public final Uri a(Context context, Uri uri, File file, yjt yjtVar) {
        String b = r9r.b(context, uri);
        if (b == null) {
            throw new FileNotFoundException(i6n0.a(uri, "Source not exists: "));
        }
        File file2 = new File(b);
        if (!file2.canRead() && oeq0.e(uri)) {
            Context context2 = e43.a;
            if (context2 == null) {
                context2 = null;
            }
            Regex regex = com.vk.core.files.a.a;
            file2 = com.vk.core.files.a.h(context2, uri, System.currentTimeMillis() + "." + com.vk.core.files.a.E(uri));
        }
        try {
            return c(file2, file, yjtVar);
        } finally {
        }
    }

    @Override // xsna.f8r
    public final boolean b(Context context, Uri uri) {
        return Boolean.TRUE.booleanValue();
    }

    /* JADX WARN: Multi-variable type inference failed */
    /* JADX WARN: Type inference failed for: r1v0, types: [T, android.util.Size] */
    /* JADX WARN: Type inference failed for: r1v20 */
    /* JADX WARN: Type inference failed for: r1v21 */
    /* JADX WARN: Type inference failed for: r1v5, types: [T, android.util.Size] */
    public final Uri c(final File file, final File file2, z2e0 z2e0Var) {
        ?? r1;
        final Size size;
        if (z2e0Var != null) {
            z2e0Var.onProgress(0, 100);
        }
        MediaUtils.f d = MediaUtils.a.d(file.getAbsolutePath());
        final Ref$ObjectRef ref$ObjectRef = new Ref$ObjectRef();
        VideoEncoderSettings videoEncoderSettings = this.a;
        float f = videoEncoderSettings.b;
        this.b.invoke();
        ?? size2 = new Size((int) (Float.valueOf(0.5625f).floatValue() * f), videoEncoderSettings.b);
        ref$ObjectRef.element = size2;
        Size size3 = size2;
        if (d != null) {
            size3 = new Size(d.a, d.b);
        }
        final Size size4 = size3;
        if (size4.getWidth() > size4.getHeight()) {
            Size size5 = (Size) ref$ObjectRef.element;
            r1 = new Size(size5.getHeight(), size5.getWidth());
        } else {
            r1 = (Size) ref$ObjectRef.element;
        }
        ref$ObjectRef.element = r1;
        if (size4.getWidth() > r1.getWidth() || size4.getHeight() > r1.getHeight()) {
            size = (((double) size4.getWidth()) * 1.0d) / ((double) r1.getWidth()) >= (((double) size4.getHeight()) * 1.0d) / ((double) r1.getHeight()) ? new Size(r1.getWidth(), (int) (size4.getHeight() / ((size4.getWidth() * 1.0d) / r1.getWidth()))) : new Size((int) (size4.getWidth() / ((size4.getHeight() * 1.0d) / r1.getHeight())), r1.getHeight());
        } else {
            size = size4;
        }
        L.c("ImVideoConverter", new gzs() { // from class: xsna.jew
            /* JADX WARN: Multi-variable type inference failed */
            @Override // xsna.gzs
            public final Object invoke() {
                StringBuilder sb = new StringBuilder("compressVideo with params: inputFile.absolutePath: ");
                sb.append(file.getAbsolutePath());
                sb.append(", \noutputFile.absolutePath: ");
                sb.append(file2.getAbsolutePath());
                sb.append(" \ninputSize.width: ");
                Size size6 = size4;
                sb.append(size6.getWidth());
                sb.append(" \ninputSize.height: ");
                sb.append(size6.getHeight());
                sb.append(" \ntargetMaxSize.width: ");
                Ref$ObjectRef ref$ObjectRef2 = ref$ObjectRef;
                sb.append(((Size) ref$ObjectRef2.element).getWidth());
                sb.append(" \ntargetMaxSize.height: ");
                sb.append(((Size) ref$ObjectRef2.element).getHeight());
                sb.append(" \noutputSize.width: ");
                Size size7 = size;
                sb.append(size7.getWidth());
                sb.append(" \noutputSize.height: ");
                sb.append(size7.getHeight());
                sb.append(" \nencoderSettings.bitrate: ");
                return vu5.b(sb, this.a.c, '\n');
            }
        });
        abt0 abt0Var = new abt0(file.getAbsolutePath(), file2.getAbsolutePath(), size.getWidth(), size.getHeight(), videoEncoderSettings.c, new a(z2e0Var));
        abt0Var.a();
        abt0Var.b();
        if (z2e0Var != null) {
            z2e0Var.onProgress(100, 100);
        }
        File file3 = new File(file2.getAbsolutePath());
        if (!file3.exists() || file3.length() == 0) {
            throw new IllegalStateException("Result file is empty or not exists!");
        }
        return Uri.parse("file://" + file2.getAbsolutePath());
    }

    /* compiled from: ImVideoConverter.kt */
    public static final class a implements abt0.a {
        public final /* synthetic */ z2e0 a;

        public a(z2e0 z2e0Var) {
            this.a = z2e0Var;
        }

        @Override // xsna.abt0.a
        public final void onProgress(float f) {
            z2e0 z2e0Var = this.a;
            if (z2e0Var != null) {
                z2e0Var.onProgress((int) f, 100);
            }
        }

        @Override // xsna.abt0.a
        public final void onSuccess() {
            z2e0 z2e0Var = this.a;
            if (z2e0Var != null) {
                z2e0Var.onProgress(100, 100);
            }
        }

        @Override // xsna.abt0.a
        public final void onFailure(Throwable th) {
            throw th;
        }
    }
}
