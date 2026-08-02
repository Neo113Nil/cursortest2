package com.vk.im.design.view.placeholder;

import com.vk.core.view.components.userstack.VkUserStack;
import java.util.ArrayList;
import xsna.dko;
import xsna.tlo0;
import xsna.x7g;

/* compiled from: ImPlaceholder.kt */
/* loaded from: classes2.dex */
public final class b {
    public final a a;
    public final C1104b b;

    /* compiled from: ImPlaceholder.kt */
    public static final class a {
        public final tlo0.h a;
        public final C1103a b;

        /* compiled from: ImPlaceholder.kt */
        /* renamed from: com.vk.im.design.view.placeholder.b$a$a, reason: collision with other inner class name */
        public static final class C1103a {
            public final dko a;
            public final x7g b;

            public C1103a(dko dkoVar, x7g x7gVar) {
                this.a = dkoVar;
                this.b = x7gVar;
            }
        }

        public a(tlo0.h hVar, C1103a c1103a) {
            this.a = hVar;
            this.b = c1103a;
        }
    }

    /* compiled from: ImPlaceholder.kt */
    /* renamed from: com.vk.im.design.view.placeholder.b$b, reason: collision with other inner class name */
    public static final class C1104b {
        public final ArrayList a;
        public final tlo0 b;
        public final VkUserStack.Size c;
        public final VkUserStack.AvatarsPosition d;

        public C1104b(ArrayList arrayList, tlo0 tlo0Var) {
            VkUserStack.Size size = VkUserStack.Size.Medium;
            VkUserStack.AvatarsPosition avatarsPosition = VkUserStack.AvatarsPosition.Left;
            this.a = arrayList;
            this.b = tlo0Var;
            this.c = size;
            this.d = avatarsPosition;
        }
    }

    public b(a aVar, C1104b c1104b) {
        this.a = aVar;
        this.b = c1104b;
    }
}
