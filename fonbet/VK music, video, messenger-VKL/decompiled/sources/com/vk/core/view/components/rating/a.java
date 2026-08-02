package com.vk.core.view.components.rating;

import xsna.an10;

/* compiled from: RatingBar.kt */
/* loaded from: classes17.dex */
public interface a {

    /* compiled from: RatingBar.kt */
    /* renamed from: com.vk.core.view.components.rating.a$a, reason: collision with other inner class name */
    public static final class C0861a implements a {
        @Override // com.vk.core.view.components.rating.a
        public final int a(float f, int i, int i2, int i3) {
            return an10.b((r0 * i3) + (i * r0) + ((f - ((int) f)) * (i - (i2 * 2))) + i2);
        }
    }

    /* compiled from: RatingBar.kt */
    public static final class b implements a {
        @Override // com.vk.core.view.components.rating.a
        public final int a(float f, int i, int i2, int i3) {
            int i4 = (int) f;
            return (i4 * i3) + (i * i4);
        }
    }

    int a(float f, int i, int i2, int i3);
}
