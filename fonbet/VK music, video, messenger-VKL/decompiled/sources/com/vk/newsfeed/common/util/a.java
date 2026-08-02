package com.vk.newsfeed.common.util;

import android.content.Context;
import android.graphics.Rect;
import android.view.View;
import com.vk.core.view.components.context.menu.VkContextMenu;
import xsna.z960;

/* compiled from: ActionsMenuBuilder.kt */
/* loaded from: classes4.dex */
public interface a {

    /* compiled from: ActionsMenuBuilder.kt */
    /* renamed from: com.vk.newsfeed.common.util.a$a, reason: collision with other inner class name */
    public static abstract class AbstractC1374a {

        /* compiled from: ActionsMenuBuilder.kt */
        /* renamed from: com.vk.newsfeed.common.util.a$a$a, reason: collision with other inner class name */
        public static final class C1375a extends AbstractC1374a {
            public final View a;
            public final Rect b;

            public C1375a(Rect rect, View view) {
                this.a = view;
                this.b = rect;
            }
        }

        /* compiled from: ActionsMenuBuilder.kt */
        /* renamed from: com.vk.newsfeed.common.util.a$a$b */
        public static final class b extends AbstractC1374a {
            public final View a;

            public b(View view) {
                this.a = view;
            }
        }
    }

    VkContextMenu a(Context context, AbstractC1374a abstractC1374a);

    a b(z960 z960Var);
}
