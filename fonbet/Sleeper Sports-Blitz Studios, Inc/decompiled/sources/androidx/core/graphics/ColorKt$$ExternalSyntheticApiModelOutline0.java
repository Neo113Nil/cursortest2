package androidx.core.graphics;

import android.app.Notification;
import android.app.NotificationChannel;
import android.app.NotificationChannelGroup;
import android.app.Person;
import android.app.job.JobWorkItem;
import android.content.Intent;
import android.content.res.AssetManager;
import android.graphics.Point;
import android.graphics.Rect;
import android.graphics.Typeface;
import android.graphics.fonts.FontVariationAxis;
import android.graphics.text.LineBreakConfig;
import android.os.flagging.AconfigPackage;
import android.text.BoringLayout;
import android.text.GraphemeClusterSegmentFinder;
import android.text.Layout;
import android.text.SegmentFinder;
import android.text.TextPaint;
import android.text.TextUtils;
import android.view.ScrollCaptureCallback;
import android.view.ScrollCaptureSession;
import android.view.ScrollCaptureTarget;
import android.view.View;
import android.view.autofill.AutofillId;
import android.view.contentcapture.ContentCaptureSession;
import java.io.File;
import java.io.FileDescriptor;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes4.dex */
public final /* synthetic */ class ColorKt$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ Notification.ProgressStyle m() {
        return new Notification.ProgressStyle();
    }

    public static /* bridge */ /* synthetic */ NotificationChannel m(Object obj) {
        return (NotificationChannel) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ NotificationChannelGroup m9068m(Object obj) {
        return (NotificationChannelGroup) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Person m9069m(Object obj) {
        return (Person) obj;
    }

    public static /* synthetic */ JobWorkItem m(Intent intent) {
        return new JobWorkItem(intent);
    }

    public static /* synthetic */ Typeface.Builder m(AssetManager assetManager, String str) {
        return new Typeface.Builder(assetManager, str);
    }

    public static /* synthetic */ Typeface.Builder m(File file) {
        return new Typeface.Builder(file);
    }

    public static /* synthetic */ Typeface.Builder m(FileDescriptor fileDescriptor) {
        return new Typeface.Builder(fileDescriptor);
    }

    public static /* synthetic */ FontVariationAxis m(String str, float f) {
        return new FontVariationAxis(str, f);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ LineBreakConfig.Builder m9071m() {
        return new LineBreakConfig.Builder();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AconfigPackage m9072m(Object obj) {
        return (AconfigPackage) obj;
    }

    public static /* synthetic */ BoringLayout m(CharSequence charSequence, TextPaint textPaint, int i, Layout.Alignment alignment, float f, float f2, BoringLayout.Metrics metrics, boolean z, TextUtils.TruncateAt truncateAt, int i2, boolean z2) {
        return new BoringLayout(charSequence, textPaint, i, alignment, f, f2, metrics, z, truncateAt, i2, z2);
    }

    public static /* synthetic */ GraphemeClusterSegmentFinder m(CharSequence charSequence, TextPaint textPaint) {
        return new GraphemeClusterSegmentFinder(charSequence, textPaint);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ SegmentFinder m9073m(Object obj) {
        return (SegmentFinder) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ScrollCaptureCallback m9074m(Object obj) {
        return (ScrollCaptureCallback) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ScrollCaptureSession m9075m(Object obj) {
        return (ScrollCaptureSession) obj;
    }

    public static /* synthetic */ ScrollCaptureTarget m(View view, Rect rect, Point point, ScrollCaptureCallback scrollCaptureCallback) {
        return new ScrollCaptureTarget(view, rect, point, scrollCaptureCallback);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ AutofillId m9076m(Object obj) {
        return (AutofillId) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ ContentCaptureSession m9077m(Object obj) {
        return (ContentCaptureSession) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ Class m9078m() {
        return Notification.ProgressStyle.class;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m9079m() {
    }

    public static /* synthetic */ void m$1() {
    }

    public static /* synthetic */ void m$2() {
    }
}
