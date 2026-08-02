package com.vk.im.design.view.placeholder;

import com.vk.core.view.components.button.VkButton;
import xsna.gzs;
import xsna.s3q0;
import xsna.tlo0;

/* compiled from: ImPlaceholder.kt */
/* loaded from: classes2.dex */
public final class a {
    public final C1102a a;
    public final C1102a b;

    /* compiled from: ImPlaceholder.kt */
    /* renamed from: com.vk.im.design.view.placeholder.a$a, reason: collision with other inner class name */
    public static final class C1102a {
        public final tlo0 a;
        public final gzs<s3q0> b;
        public final VkButton.Size c;
        public final VkButton.Mode d;
        public final VkButton.Appearance e;

        public C1102a() {
            throw null;
        }

        public C1102a(tlo0 tlo0Var, gzs gzsVar, VkButton.Size size, VkButton.Mode mode, VkButton.Appearance appearance, int i) {
            size = (i & 32) != 0 ? VkButton.Size.Medium : size;
            mode = (i & 64) != 0 ? VkButton.Mode.Primary : mode;
            appearance = (i & 128) != 0 ? VkButton.Appearance.Accent : appearance;
            this.a = tlo0Var;
            this.b = gzsVar;
            this.c = size;
            this.d = mode;
            this.e = appearance;
        }
    }

    public a(C1102a c1102a, C1102a c1102a2, int i) {
        c1102a2 = (i & 2) != 0 ? null : c1102a2;
        this.a = c1102a;
        this.b = c1102a2;
    }
}
