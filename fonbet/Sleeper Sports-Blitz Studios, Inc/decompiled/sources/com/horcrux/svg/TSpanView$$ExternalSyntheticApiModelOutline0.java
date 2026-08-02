package com.horcrux.svg;

import android.app.NotificationChannel;
import android.app.PendingIntent;
import android.app.PictureInPictureParams;
import android.app.RemoteAction;
import android.content.res.AssetManager;
import android.graphics.BlendMode;
import android.graphics.BlendModeColorFilter;
import android.graphics.Typeface;
import android.graphics.drawable.Icon;
import android.os.VibratorManager;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes8.dex */
public final /* synthetic */ class TSpanView$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ NotificationChannel m(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ PictureInPictureParams.Builder m11353m() {
        return new PictureInPictureParams.Builder();
    }

    public static /* synthetic */ RemoteAction m(Icon icon, CharSequence charSequence, CharSequence charSequence2, PendingIntent pendingIntent) {
        return new RemoteAction(icon, charSequence, charSequence2, pendingIntent);
    }

    public static /* bridge */ /* synthetic */ BlendMode m(Object obj) {
        return (BlendMode) obj;
    }

    public static /* synthetic */ BlendModeColorFilter m(int i, BlendMode blendMode) {
        return new BlendModeColorFilter(i, blendMode);
    }

    public static /* synthetic */ Typeface.Builder m(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ VibratorManager m11358m(Object obj) {
        return (VibratorManager) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m11359m() {
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ boolean m11361m(Object obj) {
        return obj instanceof BlendMode;
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m11364m$1() {
    }

    /* renamed from: m$2, reason: collision with other method in class */
    public static /* synthetic */ void m11366m$2() {
    }

    /* renamed from: m$3, reason: collision with other method in class */
    public static /* synthetic */ void m11367m$3() {
    }
}
