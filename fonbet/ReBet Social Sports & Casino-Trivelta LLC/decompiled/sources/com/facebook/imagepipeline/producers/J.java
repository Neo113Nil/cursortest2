package com.facebook.imagepipeline.producers;

import android.content.ContentResolver;
import android.database.Cursor;
import android.graphics.Rect;
import android.media.ExifInterface;
import android.net.Uri;
import android.provider.MediaStore;
import com.facebook.imageutils.JfifUtil;
import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.concurrent.Executor;

/* loaded from: classes2.dex */
public class J extends L implements u0 {

    /* renamed from: c, reason: collision with root package name */
    public final ContentResolver f30657c;

    /* renamed from: d, reason: collision with root package name */
    public static final Class f30654d = J.class;
    private static final String[] PROJECTION = {"_id", "_data"};
    private static final String[] THUMBNAIL_PROJECTION = {"_data"};

    /* renamed from: e, reason: collision with root package name */
    public static final Rect f30655e = new Rect(0, 0, 512, 384);

    /* renamed from: f, reason: collision with root package name */
    public static final Rect f30656f = new Rect(0, 0, 96, 96);

    public J(Executor executor, G6.i iVar, ContentResolver contentResolver) {
        super(executor, iVar);
        this.f30657c = contentResolver;
    }

    public static int h(String str) {
        if (str == null) {
            return -1;
        }
        return (int) new File(str).length();
    }

    public static int i(String str) {
        if (str == null) {
            return 0;
        }
        try {
            return JfifUtil.getAutoRotateAngleFromOrientation(new ExifInterface(str).getAttributeInt("Orientation", 1));
        } catch (IOException e10) {
            E6.a.l(f30654d, e10, "Unable to retrieve thumbnail rotation for %s", str);
            return 0;
        }
    }

    public static int k(B7.g gVar) {
        Rect rect = f30656f;
        if (v0.b(rect.width(), rect.height(), gVar)) {
            return 3;
        }
        Rect rect2 = f30655e;
        return v0.b(rect2.width(), rect2.height(), gVar) ? 1 : 0;
    }

    @Override // com.facebook.imagepipeline.producers.u0
    public boolean a(B7.g gVar) {
        Rect rect = f30655e;
        return v0.b(rect.width(), rect.height(), gVar);
    }

    @Override // com.facebook.imagepipeline.producers.L
    public H7.k d(com.facebook.imagepipeline.request.b bVar) {
        Uri sourceUri = bVar.getSourceUri();
        if (com.facebook.common.util.f.k(sourceUri)) {
            return g(sourceUri, bVar.getResizeOptions());
        }
        return null;
    }

    @Override // com.facebook.imagepipeline.producers.L
    public String f() {
        return "LocalContentUriThumbnailFetchProducer";
    }

    public final H7.k g(Uri uri, B7.g gVar) {
        Cursor query;
        H7.k j10;
        if (gVar == null || (query = this.f30657c.query(uri, PROJECTION, null, null, null)) == null) {
            return null;
        }
        try {
            if (!query.moveToFirst() || (j10 = j(gVar, query.getLong(query.getColumnIndex("_id")))) == null) {
                query.close();
                return null;
            }
            int columnIndex = query.getColumnIndex("_data");
            if (columnIndex >= 0) {
                j10.k2(i(query.getString(columnIndex)));
            }
            query.close();
            return j10;
        } catch (Throwable th2) {
            query.close();
            throw th2;
        }
    }

    public final H7.k j(B7.g gVar, long j10) {
        Cursor queryMiniThumbnail;
        int columnIndex;
        int k10 = k(gVar);
        if (k10 == 0 || (queryMiniThumbnail = MediaStore.Images.Thumbnails.queryMiniThumbnail(this.f30657c, j10, k10, THUMBNAIL_PROJECTION)) == null) {
            return null;
        }
        try {
            if (queryMiniThumbnail.moveToFirst() && (columnIndex = queryMiniThumbnail.getColumnIndex("_data")) >= 0) {
                String str = (String) D6.k.g(queryMiniThumbnail.getString(columnIndex));
                if (new File(str).exists()) {
                    return e(new FileInputStream(str), h(str));
                }
            }
            return null;
        } finally {
            queryMiniThumbnail.close();
        }
    }
}
