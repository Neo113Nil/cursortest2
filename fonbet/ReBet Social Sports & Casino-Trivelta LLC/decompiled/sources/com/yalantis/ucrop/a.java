package com.yalantis.ucrop;

import android.app.Activity;
import android.content.Context;
import android.content.Intent;
import android.graphics.Bitmap;
import android.net.Uri;
import android.os.Bundle;

/* loaded from: classes4.dex */
public class a {

    /* renamed from: a, reason: collision with root package name */
    public Intent f42276a = new Intent();

    /* renamed from: b, reason: collision with root package name */
    public Bundle f42277b;

    /* renamed from: com.yalantis.ucrop.a$a, reason: collision with other inner class name */
    public static class C0602a {

        /* renamed from: a, reason: collision with root package name */
        public final Bundle f42278a = new Bundle();

        public Bundle a() {
            return this.f42278a;
        }

        public void b(int i10) {
            this.f42278a.putInt("com.yalantis.ucrop.UcropColorControlsWidgetActive", i10);
        }

        public void c(int i10, int i11, int i12) {
            this.f42278a.putIntArray("com.yalantis.ucrop.AllowedGestures", new int[]{i10, i11, i12});
        }

        public void d(boolean z10) {
            this.f42278a.putBoolean("com.yalantis.ucrop.CircleDimmedLayer", z10);
        }

        public void e(Bitmap.CompressFormat compressFormat) {
            this.f42278a.putString("com.yalantis.ucrop.CompressionFormatName", compressFormat.name());
        }

        public void f(int i10) {
            this.f42278a.putInt("com.yalantis.ucrop.CompressionQuality", i10);
        }

        public void g(boolean z10) {
            this.f42278a.putBoolean("com.yalantis.ucrop.FreeStyleCrop", z10);
        }

        public void h(boolean z10) {
            this.f42278a.putBoolean("com.yalantis.ucrop.HideBottomControls", z10);
        }

        public void i(boolean z10) {
            this.f42278a.putBoolean("com.yalantis.ucrop.ShowCropFrame", z10);
        }

        public void j(boolean z10) {
            this.f42278a.putBoolean("com.yalantis.ucrop.ShowCropGrid", z10);
        }

        public void k(int i10) {
            this.f42278a.putInt("com.yalantis.ucrop.StatusBarColor", i10);
        }

        public void l(int i10) {
            this.f42278a.putInt("com.yalantis.ucrop.ToolbarColor", i10);
        }

        public void m(String str) {
            this.f42278a.putString("com.yalantis.ucrop.UcropToolbarTitleText", str);
        }

        public void n(int i10) {
            this.f42278a.putInt("com.yalantis.ucrop.UcropToolbarWidgetColor", i10);
        }
    }

    public a(Uri uri, Uri uri2) {
        Bundle bundle = new Bundle();
        this.f42277b = bundle;
        bundle.putParcelable("com.yalantis.ucrop.InputUri", uri);
        this.f42277b.putParcelable("com.yalantis.ucrop.OutputUri", uri2);
    }

    public static Uri b(Intent intent) {
        return (Uri) intent.getParcelableExtra("com.yalantis.ucrop.OutputUri");
    }

    public static a c(Uri uri, Uri uri2) {
        return new a(uri, uri2);
    }

    public Intent a(Context context) {
        this.f42276a.setClass(context, UCropActivity.class);
        this.f42276a.putExtras(this.f42277b);
        return this.f42276a;
    }

    public void d(Activity activity) {
        e(activity, 69);
    }

    public void e(Activity activity, int i10) {
        activity.startActivityForResult(a(activity), i10);
    }

    public a f(float f10, float f11) {
        this.f42277b.putFloat("com.yalantis.ucrop.AspectRatioX", f10);
        this.f42277b.putFloat("com.yalantis.ucrop.AspectRatioY", f11);
        return this;
    }

    public a g(C0602a c0602a) {
        this.f42277b.putAll(c0602a.a());
        return this;
    }
}
