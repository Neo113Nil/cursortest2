package com.vk.push.core.data.imageloader;

import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.support.v4.media.session.PlaybackStateCompat;
import com.vk.push.common.Logger;
import com.vk.push.common.logger.LoggerProvider;
import java.net.URL;
import java.net.URLConnection;
import kotlin.coroutines.intrinsics.CoroutineSingletons;
import kotlin.coroutines.jvm.internal.SuspendLambda;
import kotlin.jvm.internal.Lambda;
import xsna.b6l;
import xsna.bdn;
import xsna.bpn0;
import xsna.drm0;
import xsna.gzs;
import xsna.myc0;
import xsna.s3q0;
import xsna.spj;
import xsna.wgl;
import xsna.wzs;
import xsna.yvj;
import xsna.zcl;

/* compiled from: ImageDownloaderImpl.kt */
/* loaded from: classes5.dex */
public final class ImageDownloaderImpl implements ImageDownloader {
    public static final Companion Companion = new Companion(null);
    public final bpn0 a;

    /* compiled from: ImageDownloaderImpl.kt */
    public static final class Companion {
        public /* synthetic */ Companion(zcl zclVar) {
            this();
        }

        public Companion() {
        }
    }

    /* compiled from: ImageDownloaderImpl.kt */
    @b6l(c = "com.vk.push.core.data.imageloader.ImageDownloaderImpl$download$2", f = "ImageDownloaderImpl.kt", l = {}, m = "invokeSuspend")
    public static final class a extends SuspendLambda implements wzs<yvj, spj<? super Bitmap>, Object> {
        final /* synthetic */ String $url;
        int label;
        final /* synthetic */ ImageDownloaderImpl this$0;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public a(String str, ImageDownloaderImpl imageDownloaderImpl, spj<? super a> spjVar) {
            super(2, spjVar);
            this.$url = str;
            this.this$0 = imageDownloaderImpl;
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final spj<s3q0> create(Object obj, spj<?> spjVar) {
            return new a(this.$url, this.this$0, spjVar);
        }

        @Override // xsna.wzs
        public final Object invoke(yvj yvjVar, spj<? super Bitmap> spjVar) {
            return ((a) create(yvjVar, spjVar)).invokeSuspend(s3q0.a);
        }

        @Override // kotlin.coroutines.jvm.internal.BaseContinuationImpl
        public final Object invokeSuspend(Object obj) {
            CoroutineSingletons coroutineSingletons = CoroutineSingletons.COROUTINE_SUSPENDED;
            if (this.label != 0) {
                throw new IllegalStateException("call to 'resume' before 'invoke' with coroutine");
            }
            kotlin.a.a(obj);
            try {
                if (drm0.N(this.$url)) {
                    throw new IllegalArgumentException("You have to provide a valid URL");
                }
                URLConnection openConnection = new URL(this.$url).openConnection();
                if (openConnection.getContentLength() <= PlaybackStateCompat.ACTION_SET_CAPTIONING_ENABLED) {
                    return BitmapFactory.decodeStream(openConnection.getInputStream());
                }
                Logger.DefaultImpls.warn$default(ImageDownloaderImpl.access$getLogger(this.this$0), "Image size exceeds 1048576 bytes", null, 2, null);
                return null;
            } catch (Exception e) {
                ImageDownloaderImpl.access$getLogger(this.this$0).error("Could not download image", e);
                return null;
            }
        }
    }

    /* compiled from: ImageDownloaderImpl.kt */
    public static final class b extends Lambda implements gzs<Logger> {
        final /* synthetic */ LoggerProvider $loggerProvider;

        /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
        public b(LoggerProvider loggerProvider) {
            super(0);
            this.$loggerProvider = loggerProvider;
        }

        @Override // xsna.gzs
        public final Logger invoke() {
            return this.$loggerProvider.provideLogger().createLogger("ImageDownloader");
        }
    }

    public ImageDownloaderImpl(LoggerProvider loggerProvider) {
        this.a = new bpn0(new b(loggerProvider));
    }

    public static final Logger access$getLogger(ImageDownloaderImpl imageDownloaderImpl) {
        return (Logger) imageDownloaderImpl.a.getValue();
    }

    @Override // com.vk.push.core.data.imageloader.ImageDownloader
    public Object download(String str, spj<? super Bitmap> spjVar) {
        bdn bdnVar = bdn.a;
        return myc0.k(wgl.c, new a(str, this, null), spjVar);
    }
}
