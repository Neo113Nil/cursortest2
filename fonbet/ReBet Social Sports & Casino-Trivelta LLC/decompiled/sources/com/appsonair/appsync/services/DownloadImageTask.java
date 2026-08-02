package com.appsonair.appsync.services;

import Ph.AbstractC1459k;
import Ph.C1452g0;
import Ph.Q;
import android.graphics.Bitmap;
import android.graphics.BitmapFactory;
import android.widget.ImageView;
import com.twilio.voice.EventKeys;
import java.io.InputStream;
import java.net.URL;
import kotlin.Metadata;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

@Metadata(d1 = {"\u0000$\n\u0002\u0018\u0002\n\u0002\u0010\u0000\n\u0000\n\u0002\u0018\u0002\n\u0002\b\u0002\n\u0002\u0018\u0002\n\u0000\n\u0002\u0010\u000e\n\u0000\n\u0002\u0010\u0002\n\u0000\u0018\u00002\u00020\u0001B\r\u0012\u0006\u0010\u0002\u001a\u00020\u0003¢\u0006\u0002\u0010\u0004J\u0012\u0010\u0005\u001a\u0004\u0018\u00010\u00062\u0006\u0010\u0007\u001a\u00020\bH\u0002J\u000e\u0010\t\u001a\u00020\n2\u0006\u0010\u0007\u001a\u00020\bR\u000e\u0010\u0002\u001a\u00020\u0003X\u0082\u0004¢\u0006\u0002\n\u0000¨\u0006\u000b"}, d2 = {"Lcom/appsonair/appsync/services/DownloadImageTask;", "", "bmImage", "Landroid/widget/ImageView;", "(Landroid/widget/ImageView;)V", "downloadImage", "Landroid/graphics/Bitmap;", EventKeys.URL, "", "execute", "", "appSync_release"}, k = 1, mv = {1, 7, 1}, xi = 48)
/* loaded from: classes.dex */
public final class DownloadImageTask {

    @NotNull
    private final ImageView bmImage;

    public DownloadImageTask(@NotNull ImageView bmImage) {
        Intrinsics.checkNotNullParameter(bmImage, "bmImage");
        this.bmImage = bmImage;
    }

    /* JADX INFO: Access modifiers changed from: private */
    public final Bitmap downloadImage(String url) {
        try {
            InputStream openStream = new URL(url).openStream();
            Intrinsics.checkNotNullExpressionValue(openStream, "URL(url).openStream()");
            return BitmapFactory.decodeStream(openStream);
        } catch (Exception e10) {
            e10.printStackTrace();
            return null;
        }
    }

    public final void execute(@NotNull String url) {
        Intrinsics.checkNotNullParameter(url, "url");
        AbstractC1459k.d(Q.a(C1452g0.b()), null, null, new DownloadImageTask$execute$1(this, url, null), 3, null);
    }
}
