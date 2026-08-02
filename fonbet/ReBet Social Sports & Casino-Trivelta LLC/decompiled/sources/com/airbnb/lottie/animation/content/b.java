package com.airbnb.lottie.animation.content;

import android.graphics.Path;
import com.airbnb.lottie.utils.z;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    /* renamed from: a, reason: collision with root package name */
    public final List f28545a = new ArrayList();

    public void a(u uVar) {
        this.f28545a.add(uVar);
    }

    public void b(Path path) {
        for (int size = this.f28545a.size() - 1; size >= 0; size--) {
            z.b(path, (u) this.f28545a.get(size));
        }
    }
}
