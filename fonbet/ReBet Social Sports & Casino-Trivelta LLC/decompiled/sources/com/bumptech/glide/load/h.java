package com.bumptech.glide.load;

import android.content.Context;
import com.bumptech.glide.load.engine.v;
import java.security.MessageDigest;
import java.util.Arrays;
import java.util.Collection;
import java.util.Iterator;

/* loaded from: classes2.dex */
public class h implements n {

    /* renamed from: b, reason: collision with root package name */
    public final Collection f29963b;

    public h(n... nVarArr) {
        if (nVarArr.length == 0) {
            throw new IllegalArgumentException("MultiTransformation must contain at least one Transformation");
        }
        this.f29963b = Arrays.asList(nVarArr);
    }

    @Override // com.bumptech.glide.load.n
    public v a(Context context, v vVar, int i10, int i11) {
        Iterator it = this.f29963b.iterator();
        v vVar2 = vVar;
        while (it.hasNext()) {
            v a10 = ((n) it.next()).a(context, vVar2, i10, i11);
            if (vVar2 != null && !vVar2.equals(vVar) && !vVar2.equals(a10)) {
                vVar2.recycle();
            }
            vVar2 = a10;
        }
        return vVar2;
    }

    @Override // com.bumptech.glide.load.g
    public void b(MessageDigest messageDigest) {
        Iterator it = this.f29963b.iterator();
        while (it.hasNext()) {
            ((n) it.next()).b(messageDigest);
        }
    }

    @Override // com.bumptech.glide.load.g
    public boolean equals(Object obj) {
        if (obj instanceof h) {
            return this.f29963b.equals(((h) obj).f29963b);
        }
        return false;
    }

    @Override // com.bumptech.glide.load.g
    public int hashCode() {
        return this.f29963b.hashCode();
    }
}
