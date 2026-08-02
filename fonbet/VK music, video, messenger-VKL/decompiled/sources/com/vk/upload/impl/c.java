package com.vk.upload.impl;

import android.graphics.BitmapFactory;
import android.media.ExifInterface;
import android.net.Uri;
import android.text.TextUtils;
import com.vk.core.files.a;
import com.vk.dto.photo.Photo;
import com.vk.log.L;
import java.io.FileInputStream;
import java.io.IOException;
import xsna.dag0;
import xsna.e43;
import xsna.s4a0;
import xsna.ysg0;

/* compiled from: UploadUtils.java */
/* loaded from: classes6.dex */
public final class c {

    /* compiled from: UploadUtils.java */
    /* loaded from: classes11.dex */
    public interface a {
        void d(com.vk.upload.impl.b bVar, int i, int i2, boolean z);
    }

    /* compiled from: UploadUtils.java */
    public static class b {
        public static void a(Photo photo) {
            if (photo == null) {
                return;
            }
            ysg0<Object> ysg0Var = ysg0.b;
            ysg0.b.a(new s4a0(photo.d, photo));
        }
    }

    /* compiled from: UploadUtils.java */
    /* renamed from: com.vk.upload.impl.c$c, reason: collision with other inner class name */
    public static class C1938c {
        public final String a;
        public final String b;
        public final String c;

        public C1938c(String str, String str2, String str3) {
            this.a = str;
            this.b = str2;
            this.c = str3;
        }
    }

    /* JADX WARN: Can't wrap try/catch for region: R(8:0|1|(5:(2:3|(4:5|6|7|(8:11|12|13|14|16|17|18|19)))|16|17|18|19)|36|12|13|14|(2:(0)|(1:26))) */
    /* JADX WARN: Code restructure failed: missing block: B:31:0x0061, code lost:
    
        r6 = e;
     */
    /* JADX WARN: Code restructure failed: missing block: B:32:0x005f, code lost:
    
        r6 = th;
     */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public static boolean a(String str, BitmapFactory.Options options) throws Exception {
        boolean z;
        FileInputStream fileInputStream;
        FileInputStream createInputStream;
        int attributeInt;
        try {
            if (!str.startsWith("content:")) {
                String c = ((dag0) com.vk.core.files.a.h.getValue()).c(Uri.parse(str));
                if (!TextUtils.isEmpty(c)) {
                    try {
                        attributeInt = new ExifInterface(c).getAttributeInt("Orientation", 0);
                    } catch (IOException e) {
                        L.g("error on exif extract: ", e);
                    }
                    if (attributeInt == 8 || attributeInt == 6) {
                        z = true;
                        fileInputStream = null;
                        options.inJustDecodeBounds = true;
                        createInputStream = e43.a.getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r").createInputStream();
                        BitmapFactory.decodeStream(createInputStream, null, options);
                        a.c.a(createInputStream);
                        return z;
                    }
                }
            }
            BitmapFactory.decodeStream(createInputStream, null, options);
            a.c.a(createInputStream);
            return z;
        } catch (Exception e2) {
            e = e2;
            fileInputStream = createInputStream;
            L.E(e, new Object[0]);
            throw e;
        } catch (Throwable th) {
            th = th;
            fileInputStream = createInputStream;
            a.c.a(fileInputStream);
            throw th;
        }
        z = false;
        fileInputStream = null;
        options.inJustDecodeBounds = true;
        createInputStream = e43.a.getContentResolver().openAssetFileDescriptor(Uri.parse(str), "r").createInputStream();
    }
}
