package p5;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import java.io.InputStream;
import java.util.List;
import kotlin.jvm.internal.Intrinsics;
import n5.C8443c;
import n5.EnumC8444d;
import n5.q;
import org.jetbrains.annotations.NotNull;
import p5.h;
import sf.z;
import v5.C10239m;
import w5.AbstractC10429a;

/* renamed from: p5.d, reason: case insensitive filesystem */
/* loaded from: classes8.dex */
public final class C8859d implements h {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final Uri f80218a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final C10239m f80219b;

    /* renamed from: p5.d$a */
    public static final class a implements h.a<Uri> {
        @Override // p5.h.a
        public final h a(Object obj, C10239m c10239m) {
            Uri uri = (Uri) obj;
            if (Intrinsics.d(uri.getScheme(), "content")) {
                return new C8859d(uri, c10239m);
            }
            return null;
        }
    }

    public C8859d(@NotNull Uri uri, @NotNull C10239m c10239m) {
        this.f80218a = uri;
        this.f80219b = c10239m;
    }

    /* JADX WARN: Removed duplicated region for block: B:35:0x00cd  */
    /* JADX WARN: Removed duplicated region for block: B:37:0x00d4  */
    @Override // p5.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(@NotNull kotlin.coroutines.d<? super g> dVar) {
        InputStream openInputStream;
        List<String> pathSegments;
        int size;
        Bundle bundle;
        AssetFileDescriptor openTypedAssetFile;
        C10239m c10239m = this.f80219b;
        ContentResolver contentResolver = c10239m.f().getContentResolver();
        Uri uri = this.f80218a;
        if (Intrinsics.d(uri.getAuthority(), "com.android.contacts") && Intrinsics.d(uri.getLastPathSegment(), "display_photo")) {
            AssetFileDescriptor openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(uri, "r");
            openInputStream = openAssetFileDescriptor != null ? openAssetFileDescriptor.createInputStream() : null;
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + uri + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.d(uri.getAuthority(), "media") && (size = (pathSegments = uri.getPathSegments()).size()) >= 3 && Intrinsics.d(pathSegments.get(size - 3), "audio") && Intrinsics.d(pathSegments.get(size - 2), "albums")) {
            AbstractC10429a d11 = c10239m.n().d();
            AbstractC10429a.C2245a c2245a = d11 instanceof AbstractC10429a.C2245a ? (AbstractC10429a.C2245a) d11 : null;
            if (c2245a != null) {
                AbstractC10429a c11 = c10239m.n().c();
                AbstractC10429a.C2245a c2245a2 = c11 instanceof AbstractC10429a.C2245a ? (AbstractC10429a.C2245a) c11 : null;
                if (c2245a2 != null) {
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(c2245a.f103575a, c2245a2.f103575a));
                    openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
                    openInputStream = openTypedAssetFile != null ? openTypedAssetFile.createInputStream() : null;
                    if (openInputStream == null) {
                        throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + uri + "'.").toString());
                    }
                }
            }
            bundle = null;
            openTypedAssetFile = contentResolver.openTypedAssetFile(uri, "image/*", bundle, null);
            if (openTypedAssetFile != null) {
            }
            if (openInputStream == null) {
            }
        } else {
            openInputStream = contentResolver.openInputStream(uri);
            if (openInputStream == null) {
                throw new IllegalStateException(("Unable to open '" + uri + "'.").toString());
            }
        }
        return new m(q.b(z.d(z.k(openInputStream)), c10239m.f(), new C8443c()), contentResolver.getType(uri), EnumC8444d.DISK);
    }
}
