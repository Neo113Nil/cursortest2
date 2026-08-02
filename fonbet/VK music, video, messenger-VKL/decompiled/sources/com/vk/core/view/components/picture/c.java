package com.vk.core.view.components.picture;

import xsna.cut0;
import xsna.dko;
import xsna.eko;
import xsna.gko;
import xsna.x7g;

/* compiled from: VkPictureContent.kt */
/* loaded from: classes17.dex */
public interface c {

    /* compiled from: VkPictureContent.kt */
    public static final class b implements c {
        public final dko a;

        public b(dko dkoVar) {
            this.a = dkoVar;
        }

        public final dko a() {
            return this.a;
        }
    }

    /* compiled from: VkPictureContent.kt */
    /* renamed from: com.vk.core.view.components.picture.c$c, reason: collision with other inner class name */
    public static final class C0853c implements c {
        public final String a;
        public final eko b;

        public C0853c(String str, eko ekoVar) {
            this.a = str;
            this.b = ekoVar;
        }

        public final dko a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }

    /* compiled from: VkPictureContent.kt */
    public static final class d implements c {
        public final String a;
        public final dko b;

        public d(String str, dko dkoVar) {
            this.a = str;
            this.b = dkoVar;
        }

        public final dko a() {
            return this.b;
        }

        public final String b() {
            return this.a;
        }
    }

    /* compiled from: VkPictureContent.kt */
    public static final class a implements c {
        public final dko a;
        public final cut0 b;

        public a(int i, int i2) {
            this(new gko(i), new x7g(i2));
        }

        public final dko a() {
            return this.a;
        }

        public final cut0 b() {
            return this.b;
        }

        public a(dko dkoVar, cut0 cut0Var) {
            this.a = dkoVar;
            this.b = cut0Var;
        }
    }
}
