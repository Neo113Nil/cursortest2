package defpackage;

import android.content.ContentResolver;
import android.content.res.AssetFileDescriptor;
import android.graphics.Point;
import android.net.Uri;
import android.os.Build;
import android.os.Bundle;
import com.ironsource.U3;
import java.util.List;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class wp3 implements dz7 {
    public final eek a;
    public final tvd b;

    public wp3(eek eekVar, tvd tvdVar) {
        this.a = eekVar;
        this.b = tvdVar;
    }

    /* JADX WARN: Removed duplicated region for block: B:33:0x00ac  */
    @Override // defpackage.dz7
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public final Object a(zn5 zn5Var) {
        AssetFileDescriptor openAssetFileDescriptor;
        List E;
        int size;
        Bundle bundle;
        eek eekVar = this.a;
        Uri parse = Uri.parse(eekVar.a);
        tvd tvdVar = this.b;
        ContentResolver contentResolver = tvdVar.a.getContentResolver();
        String str = eekVar.d;
        if (Intrinsics.c(str, "com.android.contacts") && Intrinsics.c(CollectionsKt.j0(nq8.E(eekVar)), "display_photo")) {
            openAssetFileDescriptor = contentResolver.openAssetFileDescriptor(parse, "r");
            if (openAssetFileDescriptor == null) {
                vp2.b(parse, "'.", "Unable to find a contact photo associated with '");
                return null;
            }
        } else if (Build.VERSION.SDK_INT >= 29 && Intrinsics.c(str, U3.i.I0) && (size = (E = nq8.E(eekVar)).size()) >= 3 && Intrinsics.c(E.get(size - 3), "audio") && Intrinsics.c(E.get(size - 2), "albums")) {
            kjh kjhVar = tvdVar.b;
            a35 a35Var = kjhVar.a;
            t25 t25Var = a35Var instanceof t25 ? (t25) a35Var : null;
            if (t25Var != null) {
                int i = t25Var.a;
                a35 a35Var2 = kjhVar.b;
                t25 t25Var2 = a35Var2 instanceof t25 ? (t25) a35Var2 : null;
                if (t25Var2 != null) {
                    int i2 = t25Var2.a;
                    bundle = new Bundle(1);
                    bundle.putParcelable("android.content.extra.SIZE", new Point(i, i2));
                    openAssetFileDescriptor = contentResolver.openTypedAssetFile(parse, "image/*", bundle, null);
                    if (openAssetFileDescriptor == null) {
                        vp2.b(parse, "'.", "Unable to find a music thumbnail associated with '");
                        return null;
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
                vp2.b(parse, "'.", "Unable to open '");
                return null;
            }
        }
        return new fwh(new hwh(new lof(f6a.I(openAssetFileDescriptor.createInputStream())), tvdVar.f, new dp3(openAssetFileDescriptor)), contentResolver.getType(parse), pe4.c);
    }
}
