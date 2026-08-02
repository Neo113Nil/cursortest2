package com.google.android.material.color.utilities;

import io.sentry.i1;
import java.io.File;
import java.util.Comparator;

/* compiled from: r8-map-id-1007347d93e945b62163496d2b3d545e4cec50eb5f7054b93987970dfadb4b15 */
/* loaded from: classes.dex */
public final /* synthetic */ class h implements Comparator {

    /* renamed from: a, reason: collision with root package name */
    public final /* synthetic */ int f5898a;

    public /* synthetic */ h(int i5) {
        this.f5898a = i5;
    }

    @Override // java.util.Comparator
    public final int compare(Object obj, Object obj2) {
        switch (this.f5898a) {
            case 0:
                return ((Double) obj).compareTo((Double) obj2);
            case 1:
                i1 i1Var = (i1) obj;
                i1 i1Var2 = (i1) obj2;
                if (i1Var == i1Var2) {
                    return 0;
                }
                int compareTo = i1Var.z().compareTo(i1Var2.z());
                return compareTo != 0 ? compareTo : i1Var.v().f16668b.toString().compareTo(i1Var2.v().f16668b.toString());
            case 2:
                return Long.compare(((File) obj).lastModified(), ((File) obj2).lastModified());
            case 3:
                byte[] bArr = (byte[]) obj;
                byte[] bArr2 = (byte[]) obj2;
                if (bArr.length != bArr2.length) {
                    return bArr.length - bArr2.length;
                }
                for (int i5 = 0; i5 < bArr.length; i5++) {
                    byte b10 = bArr[i5];
                    byte b11 = bArr2[i5];
                    if (b10 != b11) {
                        return b10 - b11;
                    }
                }
                return 0;
            default:
                y9.a aVar = (y9.a) obj;
                y9.a aVar2 = (y9.a) obj2;
                int compare = Long.compare(aVar.f25735a.f6459p, aVar2.f25735a.f6459p);
                return compare != 0 ? compare : Integer.compare(aVar.f25736b, aVar2.f25736b);
        }
    }
}
