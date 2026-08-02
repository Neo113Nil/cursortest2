package i2;

import androidx.annotation.NonNull;

/* loaded from: classes8.dex */
public final class h extends C7000c {
    @NonNull
    public static h i(@NonNull String str) {
        h hVar = new h(str.toCharArray());
        hVar.f65756b = 0L;
        hVar.h(str.length() - 1);
        return hVar;
    }

    @Override // i2.C7000c
    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if ((obj instanceof h) && b().equals(((h) obj).b())) {
            return true;
        }
        return super.equals(obj);
    }
}
