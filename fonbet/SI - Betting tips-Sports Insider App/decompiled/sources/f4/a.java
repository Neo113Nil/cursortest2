package f4;

import android.graphics.Bitmap;
import android.graphics.drawable.Drawable;
import android.media.MediaDataSource;
import c4.b0;
import c4.p;
import c4.v;
import com.sports.insider.data.repository.room.metric.EventsTable;
import java.nio.ByteBuffer;
import kotlin.collections.CollectionsKt;
import kotlin.jvm.internal.Intrinsics;
import q4.n;
import v4.r;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final class a implements g {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f9441a;

    public /* synthetic */ a(int i5) {
        this.f9441a = i5;
    }

    @Override // f4.g
    public final h a(Object obj, n nVar, v vVar) {
        int i5 = 0;
        int i10 = 1;
        int i11 = 2;
        switch (this.f9441a) {
            case 0:
                b0 b0Var = (b0) obj;
                Bitmap.Config[] configArr = r.f24431a;
                if (Intrinsics.areEqual(b0Var.f3571c, "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(p.h(b0Var)), "android_asset")) {
                    return new b(b0Var, nVar, i5);
                }
                return null;
            case 1:
                return new c((Bitmap) obj, nVar, i5);
            case 2:
                return new c((byte[]) obj, nVar, i10);
            case 3:
                return new c((ByteBuffer) obj, nVar, i11);
            case 4:
                b0 b0Var2 = (b0) obj;
                if (Intrinsics.areEqual(b0Var2.f3571c, EventsTable.contentColumn)) {
                    return new e(b0Var2, nVar);
                }
                return null;
            case 5:
                b0 b0Var3 = (b0) obj;
                if (Intrinsics.areEqual(b0Var3.f3571c, "data")) {
                    return new b(b0Var3, nVar, i10);
                }
                return null;
            case 6:
                return new c((Drawable) obj, nVar, 3);
            case 7:
                b0 b0Var4 = (b0) obj;
                String str = b0Var4.f3571c;
                if ((str != null && !Intrinsics.areEqual(str, "file")) || b0Var4.f3573e == null) {
                    return null;
                }
                Bitmap.Config[] configArr2 = r.f24431a;
                if (Intrinsics.areEqual(b0Var4.f3571c, "file") && Intrinsics.areEqual(CollectionsKt.firstOrNull(p.h(b0Var4)), "android_asset")) {
                    return null;
                }
                return new i(b0Var4, nVar);
            case 8:
                b0 b0Var5 = (b0) obj;
                if (Intrinsics.areEqual(b0Var5.f3571c, "jar:file")) {
                    return new k(b0Var5, nVar);
                }
                return null;
            case 9:
                b0 b0Var6 = (b0) obj;
                if (Intrinsics.areEqual(b0Var6.f3571c, "android.resource")) {
                    return new b(b0Var6, nVar, i11);
                }
                return null;
            default:
                return new c((MediaDataSource) obj, nVar, 4);
        }
    }
}
