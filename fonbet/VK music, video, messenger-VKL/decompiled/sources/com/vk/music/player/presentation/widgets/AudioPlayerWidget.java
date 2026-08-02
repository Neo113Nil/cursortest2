package com.vk.music.player.presentation.widgets;

import android.app.PendingIntent;
import android.appwidget.AppWidgetProvider;
import android.content.ComponentName;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.graphics.BitmapShader;
import android.graphics.Canvas;
import android.graphics.Matrix;
import android.graphics.Paint;
import android.graphics.RectF;
import android.graphics.Shader;
import android.graphics.drawable.Drawable;
import android.net.Uri;
import android.text.TextUtils;
import com.huawei.hms.support.api.entity.common.CommonConstant;
import com.unity3d.services.UnityAdsConstants;
import com.vk.dto.music.MusicTrack;
import com.vk.movika.sdk.base.utils.b;
import com.vkontakte.android.LinkRedirActivity;
import io.reactivex.rxjava3.core.q;
import java.util.WeakHashMap;
import java.util.concurrent.TimeUnit;
import xsna.a0a;
import xsna.baf0;
import xsna.bn40;
import xsna.e3m;
import xsna.fcc0;
import xsna.iah0;
import xsna.j6r0;
import xsna.k840;
import xsna.m33;
import xsna.mcr0;
import xsna.ms;
import xsna.o25;
import xsna.qa;
import xsna.t2i0;
import xsna.u2b0;
import xsna.u370;

/* compiled from: AudioPlayerWidget.kt */
/* loaded from: classes3.dex */
public abstract class AudioPlayerWidget extends AppWidgetProvider {
    public static int a;

    public static final q<Bitmap> a(MusicTrack musicTrack, float f) {
        String Kb = musicTrack.Kb(iah0.a(f));
        Bitmap k = mcr0.k(Kb);
        return k != null ? q.T(k) : TextUtils.isEmpty(Kb) ? q.H(new RuntimeException("Can't resolve image!")) : mcr0.h(Uri.parse(Kb)).L(new qa(new b(2), 2), false);
    }

    public static final PendingIntent b(Context context, String str) {
        Object obj = k840.b.a;
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://www." + a0a.d + "/popup?act=buy_music_subscription"));
        u370 u370Var = k840.f;
        if (u370Var == null) {
            u370Var = null;
        }
        u370Var.getClass();
        intent.setComponent(new ComponentName(context, (Class<?>) LinkRedirActivity.class));
        intent.putExtra("player_widget", str);
        return t2i0.a(context, 0, intent, 33554432);
    }

    public static final PendingIntent c(Context context, String str) {
        Object obj = k840.b.a;
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse("https://www." + a0a.d + "/audio"));
        u370 u370Var = k840.f;
        if (u370Var == null) {
            u370Var = null;
        }
        u370Var.getClass();
        intent.setComponent(new ComponentName(context, (Class<?>) LinkRedirActivity.class));
        intent.putExtra("player_widget", str);
        return t2i0.a(context, 0, intent, 33554432);
    }

    public static final PendingIntent d(Context context, String str) {
        Intent intent = new Intent(CommonConstant.ACTION.HWID_SCHEME_URL, Uri.parse(k840.b.a()));
        u370 u370Var = k840.f;
        if (u370Var == null) {
            u370Var = null;
        }
        u370Var.getClass();
        intent.setComponent(new ComponentName(context, (Class<?>) LinkRedirActivity.class));
        intent.putExtra("player_widget", str);
        return t2i0.a(context, 0, intent, 33554432);
    }

    public static final Bitmap e(int i, int i2, Context context) {
        e3m.a aVar = e3m.a;
        Drawable a2 = m33.a(i, context);
        baf0 baf0Var = new baf0(a2, i2);
        Bitmap createBitmap = Bitmap.createBitmap(a2.getIntrinsicWidth(), a2.getIntrinsicHeight(), Bitmap.Config.ARGB_8888);
        baf0Var.setBounds(0, 0, a2.getIntrinsicWidth(), a2.getIntrinsicHeight());
        baf0Var.draw(new Canvas(createBitmap));
        return createBitmap;
    }

    public static final boolean f(u2b0 u2b0Var) {
        long F0 = u2b0Var.F0();
        ms i = o25.a().i();
        if (k840.a.i.b() || F0 < TimeUnit.MINUTES.toMillis(i.E)) {
            return false;
        }
        MusicTrack b = u2b0Var.b();
        if (b == null) {
            return true;
        }
        return (b.Mb() || b.Vb()) ? false : true;
    }

    public static final Bitmap g(int i, int i2, Bitmap bitmap) {
        Bitmap createBitmap = Bitmap.createBitmap(i, i2, Bitmap.Config.ARGB_8888);
        Canvas canvas = new Canvas(createBitmap);
        Paint paint = new Paint(3);
        Shader.TileMode tileMode = Shader.TileMode.CLAMP;
        BitmapShader bitmapShader = new BitmapShader(bitmap, tileMode, tileMode);
        Matrix matrix = new Matrix();
        matrix.setRectToRect(new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, bitmap.getWidth(), bitmap.getHeight()), new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight()), Matrix.ScaleToFit.FILL);
        bitmapShader.setLocalMatrix(matrix);
        paint.setShader(bitmapShader);
        RectF rectF = new RectF(UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, UnityAdsConstants.SafeGuards.InitRequestRetryPolicy.MIN_JITTER_PCT, canvas.getWidth(), canvas.getHeight());
        WeakHashMap weakHashMap = j6r0.a;
        canvas.drawRoundRect(rectF, iah0.a(8.0f), iah0.a(8.0f), paint);
        return createBitmap;
    }

    public static final PendingIntent h(Context context, String str, Intent intent) {
        intent.putExtra("player_widget", str);
        int i = a;
        a = i + 1;
        PendingIntent c = t2i0.c(intent, context, false, new fcc0(context, i, intent, 1));
        if (c == null) {
            bn40.d("Unable to create pending intent due to system limits");
        }
        return c;
    }
}
