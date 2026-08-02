package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.ironsource.U3;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class xp3 implements ez7 {
    public final Uri a;
    public final xvd b;

    public xp3(Uri uri, xvd xvdVar) {
        this.a = uri;
        this.b = xvdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:36:0x00b0  */
    /* JADX WARN: Removed duplicated region for block: B:38:0x00b9  */
    /* JADX WARN: Removed duplicated region for block: B:40:0x00b5  */
    @Override // defpackage.ez7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(rq3 rq3Var) {
        InputStream openInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        xvd xvdVar = this.b;
        ContentResolver contentResolver = xvdVar.a.getContentResolver();
        Uri uri = this.a;
        if (Intrinsics.c(uri.getAuthority(), "com.android.contacts") && Intrinsics.c(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                vp2.b(uri, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.c(uri.getAuthority(), U3.i.I0) && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && Intrinsics.c(pathSegments.get(size - 3), "audio") && Intrinsics.c(pathSegments.get(size - 2), "albums")) {
            jjh jjhVar = xvdVar.c;
            s02 s02Var = jjhVar.a;
            u25 u25Var = s02Var instanceof u25 ? (u25) s02Var : null;
            if (u25Var != null) {
                int i = u25Var.j;
                s02 s02Var2 = jjhVar.b;
                u25 u25Var2 = s02Var2 instanceof u25 ? (u25) s02Var2 : null;
                if (u25Var2 != null) {
                    int i2 = u25Var2.j;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                    AssetFileDescriptor openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    openInputStream = openTypedAssetFile == null ? openTypedAssetFile.createInputStream() : null;
                    if (openInputStream == null) {
                        vp2.b(uri, "'.", "Unable to find a music thumbnail associated with '");
                        return null;
                    }
                }
            }
            bundle = null;
            AssetFileDescriptor openTypedAssetFile2 = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (openTypedAssetFile2 == null) {
            }
            if (openInputStream == null) {
            }
        } else {
            openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                vp2.b(uri, "'.", "Unable to open '");
                return null;
            }
        }
        return new nwh(new iwh(new lof(f6a.I(openInputStream)), new au9(xvdVar.a, 1), new ui0()), contentResolver.getType(uri), 3);
    }
}
