package com.dylanvann.fastimage;

import android.content.Context;
import android.content.res.Resources;
import android.net.Uri;
import android.text.TextUtils;
import com.facebook.react.views.imagehelper.ImageSource;
import com.twilio.voice.EventKeys;

/* loaded from: classes2.dex */
public class f extends ImageSource {

    /* renamed from: a, reason: collision with root package name */
    public final B4.i f30200a;

    /* renamed from: b, reason: collision with root package name */
    public Uri f30201b;

    public f(Context context, String str, B4.i iVar) {
        this(context, str, 0.0d, 0.0d, iVar);
    }

    public static boolean e(Uri uri) {
        return EventKeys.DATA.equals(uri.getScheme());
    }

    public static boolean g(Uri uri) {
        return "content".equals(uri.getScheme());
    }

    public static boolean i(Uri uri) {
        return "file".equals(uri.getScheme());
    }

    public static boolean j(Uri uri) {
        return "res".equals(uri.getScheme());
    }

    public static boolean k(Uri uri) {
        return "android.resource".equals(uri.getScheme());
    }

    public B4.h a() {
        return new B4.h(getUri().toString(), b());
    }

    public B4.i b() {
        return this.f30200a;
    }

    public Object c() {
        return f() ? getSource() : d() ? getSource() : get_isResource() ? getUri() : h() ? getUri().toString() : a();
    }

    public boolean d() {
        Uri uri = this.f30201b;
        return uri != null && e(uri);
    }

    public boolean f() {
        Uri uri = this.f30201b;
        return uri != null && g(uri);
    }

    @Override // com.facebook.react.views.imagehelper.ImageSource
    public Uri getUri() {
        return this.f30201b;
    }

    public boolean h() {
        Uri uri = this.f30201b;
        return uri != null && i(uri);
    }

    @Override // com.facebook.react.views.imagehelper.ImageSource
    /* renamed from: isResource */
    public boolean get_isResource() {
        Uri uri = this.f30201b;
        return uri != null && k(uri);
    }

    public f(Context context, String str, double d10, double d11, B4.i iVar) {
        super(context, str, d10, d11);
        this.f30200a = iVar == null ? B4.i.f731b : iVar;
        this.f30201b = super.getUri();
        if (get_isResource() && TextUtils.isEmpty(this.f30201b.toString())) {
            throw new Resources.NotFoundException("Local Resource Not Found. Resource: '" + getSource() + "'.");
        }
        if (j(this.f30201b)) {
            this.f30201b = Uri.parse(this.f30201b.toString().replace("res:/", "android.resource://" + context.getPackageName() + "/"));
        }
    }
}
