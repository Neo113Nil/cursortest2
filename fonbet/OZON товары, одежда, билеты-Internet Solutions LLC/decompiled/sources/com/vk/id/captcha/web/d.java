package com.vk.id.captcha.web;

import android.content.ActivityNotFoundException;
import android.content.Intent;
import android.net.Uri;
import android.view.View;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes9.dex */
public final class d {

    /* renamed from: a, reason: collision with root package name */
    private final boolean f60596a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final String f60597b;

    public d(boolean z11, @NotNull String str) {
        Intrinsics.checkNotNullParameter(str, "");
        this.f60596a = z11;
        this.f60597b = str;
    }

    /* JADX WARN: Code restructure failed: missing block: B:6:0x001c, code lost:
    
        if (kotlin.text.h.e0(r2, kotlin.text.h.m0(r5.f60597b, "?"), false) != false) goto L17;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final boolean a(View view, Uri uri) {
        if (uri != null && this.f60596a) {
            String uri2 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri2, "");
        }
        if (uri != null && view != null) {
            a aVar = new a();
            String uri3 = uri.toString();
            Intrinsics.checkNotNullExpressionValue(uri3, "");
            if (aVar.a(uri3)) {
                Intent data = new Intent("android.intent.action.VIEW").setData(uri);
                Intrinsics.checkNotNullExpressionValue(data, "");
                try {
                    view.getContext().startActivity(data);
                    return true;
                } catch (ActivityNotFoundException unused) {
                    return false;
                }
            }
        }
        return true;
    }
}
