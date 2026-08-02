package f4;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import c4.b0;
import c4.p;
import d4.t;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.coroutines.Continuation;
import kotlin.jvm.internal.Intrinsics;
import okio.Okio;
import q4.n;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class e implements h {

    /* renamed from: a, reason: collision with root package name */
    public final b0 f9450a;

    /* renamed from: b, reason: collision with root package name */
    public final n f9451b;

    public e(b0 b0Var, n nVar) {
        this.f9450a = b0Var;
        this.f9451b = nVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00c2  */
    @Override // f4.h
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(Continuation continuation) {
        AssetFileDescriptor openAssetFileDescriptor;
        List h10;
        int size;
        Bundle bundle;
        b0 b0Var = this.f9450a;
        Uri parse = Uri.parse(b0Var.f3569a);
        n nVar = this.f9451b;
        ContentResolver contentResolver = nVar.f22007a.getContentResolver();
        String str = b0Var.f3572d;
        if (Intrinsics.areEqual(str, "com.android.contacts") && Intrinsics.areEqual(CollectionsKt.L(p.h(b0Var)), "display_photo")) {
            openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
            if (openAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to find a contact photo associated with '" + parse + "'.").toString());
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.areEqual(str, "media") && (size = (h10 = p.h(b0Var)).size()) >= 3 && Intrinsics.areEqual(h10.get(size - 3), "audio") && Intrinsics.areEqual(h10.get(size - 2), "albums")) {
            r4.i iVar = nVar.f22008b;
            r4.c cVar = iVar.f22307a;
            r4.a aVar = cVar instanceof r4.a ? (r4.a) cVar : null;
            if (aVar != null) {
                int i5 = aVar.f22291a;
                r4.c cVar2 = iVar.f22308b;
                r4.a aVar2 = cVar2 instanceof r4.a ? (r4.a) cVar2 : null;
                if (aVar2 != null) {
                    int i10 = aVar2.f22291a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i5, i10));
                    openAssetFileDescriptor = contentResolver.openTypedAssetFile(parse, "image/*", bundle, null);
                    if (openAssetFileDescriptor == null) {
                        throw new IllegalStateException(("Unable to find a music thumbnail associated with '" + parse + "'.").toString());
                    }
                }
            }
            bundle = null;
            openAssetFileDescriptor = contentResolver.openTypedAssetFile(parse, "image/*", bundle, null);
            if (openAssetFileDescriptor == null) {
            }
        } else {
            openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
            if (openAssetFileDescriptor == null) {
                throw new IllegalStateException(("Unable to open '" + parse + "'.").toString());
            }
        }
        return new l(new t(Okio.buffer(Okio.source(openAssetFileDescriptor.createInputStream())), nVar.f22012f, new d4.g(b0Var, openAssetFileDescriptor)), contentResolver.getType(parse), d4.h.f8130c);
    }
}
