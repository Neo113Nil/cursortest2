package defpackage;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import com.ironsource.U3;
import com.unity3d.ads.core.domain.HandleInvocationsFromAdViewer;
import java.nio.ByteBuffer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* loaded from: classes.dex */
public final class vi0 implements bz7 {
    public final /* synthetic */ int a;

    public /* synthetic */ vi0(int i) {
        this.a = i;
    }

    @Override // defpackage.bz7
    public final dz7 a(Object obj, tvd tvdVar, apf apfVar) {
        int i = 0;
        int i2 = 1;
        int i3 = 2;
        switch (this.a) {
            case 0:
                eek eekVar = (eek) obj;
                Bitmap.Config[] configArr = gjk.a;
                if (Intrinsics.c(eekVar.c, U3.i.b) && Intrinsics.c(CollectionsKt.firstOrNull(nq8.E(eekVar)), "android_asset")) {
                    return new xi0(eekVar, tvdVar, i);
                }
                return null;
            case 1:
                return new yw1((Bitmap) obj);
            case 2:
                return new p92((byte[]) obj, tvdVar, i);
            case 3:
                return new p92((ByteBuffer) obj, tvdVar, i2);
            case 4:
                eek eekVar2 = (eek) obj;
                if (Intrinsics.c(eekVar2.c, HandleInvocationsFromAdViewer.KEY_PRIVACY_UPDATE_CONTENT)) {
                    return new wp3(eekVar2, tvdVar);
                }
                return null;
            case 5:
                eek eekVar3 = (eek) obj;
                if (Intrinsics.c(eekVar3.c, "data")) {
                    return new xi0(eekVar3, tvdVar, i2);
                }
                return null;
            case 6:
                return new p92((Drawable) obj, tvdVar, i3);
            case 7:
                eek eekVar4 = (eek) obj;
                String str = eekVar4.c;
                if ((str != null && !str.equals(U3.i.b)) || eekVar4.e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = gjk.a;
                if (Intrinsics.c(eekVar4.c, U3.i.b) && Intrinsics.c(CollectionsKt.firstOrNull(nq8.E(eekVar4)), "android_asset")) {
                    return null;
                }
                return new xi0(eekVar4, tvdVar, i3);
            case 8:
                eek eekVar5 = (eek) obj;
                if (Intrinsics.c(eekVar5.c, "jar:file")) {
                    return new xi0(eekVar5, tvdVar, 3);
                }
                return null;
            default:
                eek eekVar6 = (eek) obj;
                if (Intrinsics.c(eekVar6.c, "android.resource")) {
                    return new xi0(eekVar6, tvdVar, 4);
                }
                return null;
        }
    }
}
