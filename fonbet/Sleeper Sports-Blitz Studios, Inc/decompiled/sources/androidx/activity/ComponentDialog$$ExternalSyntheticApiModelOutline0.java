package androidx.activity;

import android.app.NotificationChannel;
import android.app.slice.Slice;
import android.app.slice.SliceItem;
import android.app.slice.SliceSpec;
import android.content.Context;
import android.graphics.RenderNode;
import android.hardware.camera2.params.DynamicRangeProfiles;
import android.hardware.camera2.params.MultiResolutionStreamInfo;
import android.hardware.camera2.params.OutputConfiguration;
import android.media.session.MediaSession;
import android.net.Uri;
import android.os.Bundle;
import android.util.Size;
import android.view.WindowInsetsAnimationControlListener;
import android.view.WindowInsetsAnimationController;
import android.view.inspector.InspectionCompanion;
import android.window.OnBackInvokedCallback;
import android.window.OnBackInvokedDispatcher;

/* compiled from: D8$$SyntheticClass */
/* loaded from: classes.dex */
public final /* synthetic */ class ComponentDialog$$ExternalSyntheticApiModelOutline0 {
    public static /* synthetic */ NotificationChannel m(String str, CharSequence charSequence, int i) {
        return new NotificationChannel(str, charSequence, i);
    }

    public static /* synthetic */ Slice.Builder m(Slice.Builder builder) {
        return new Slice.Builder(builder);
    }

    public static /* synthetic */ Slice.Builder m(Uri uri, SliceSpec sliceSpec) {
        return new Slice.Builder(uri, sliceSpec);
    }

    public static /* bridge */ /* synthetic */ SliceItem m(Object obj) {
        return (SliceItem) obj;
    }

    public static /* synthetic */ SliceSpec m(String str, int i) {
        return new SliceSpec(str, i);
    }

    public static /* synthetic */ RenderNode m(String str) {
        return new RenderNode(str);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ DynamicRangeProfiles m9m(Object obj) {
        return (DynamicRangeProfiles) obj;
    }

    public static /* synthetic */ MultiResolutionStreamInfo m(int i, int i2, String str) {
        return new MultiResolutionStreamInfo(i, i2, str);
    }

    public static /* synthetic */ OutputConfiguration m(Size size, Class cls) {
        return new OutputConfiguration(size, cls);
    }

    public static /* synthetic */ MediaSession m(Context context, String str, Bundle bundle) {
        return new MediaSession(context, str, bundle);
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimationControlListener m10m(Object obj) {
        return (WindowInsetsAnimationControlListener) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ WindowInsetsAnimationController m11m(Object obj) {
        return (WindowInsetsAnimationController) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ InspectionCompanion.UninitializedPropertyMapException m12m() {
        return new InspectionCompanion.UninitializedPropertyMapException();
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OnBackInvokedCallback m13m(Object obj) {
        return (OnBackInvokedCallback) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* bridge */ /* synthetic */ OnBackInvokedDispatcher m14m(Object obj) {
        return (OnBackInvokedDispatcher) obj;
    }

    /* renamed from: m, reason: collision with other method in class */
    public static /* synthetic */ void m21m() {
    }

    /* renamed from: m$1, reason: collision with other method in class */
    public static /* synthetic */ void m26m$1() {
    }
}
