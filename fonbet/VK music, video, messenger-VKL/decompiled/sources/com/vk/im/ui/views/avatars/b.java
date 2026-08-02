package com.vk.im.ui.views.avatars;

import android.content.Context;
import android.graphics.drawable.Drawable;
import com.vk.dto.common.Peer;
import com.vk.im.engine.models.dialogs.ChatSettings;
import com.vk.im.engine.models.dialogs.DialogTheme;
import kotlin.jvm.internal.PropertyReference1Impl;
import xsna.bpn0;
import xsna.c4g0;
import xsna.fp;
import xsna.fpf0;
import xsna.g9e0;
import xsna.hd;
import xsna.j1;
import xsna.qcy;
import xsna.qtd0;
import xsna.yc;

/* compiled from: AvatarPlaceholderFactory.kt */
/* loaded from: classes2.dex */
public final class b {
    public static final /* synthetic */ qcy<Object>[] h = {new PropertyReference1Impl(b.class, "userPlaceholder", "getUserPlaceholder()Landroid/graphics/drawable/Drawable;", 0), fp.c(0, b.class, "groupPlaceholder", "getGroupPlaceholder()Landroid/graphics/drawable/Drawable;", fpf0.a)};
    public final Context a;
    public final boolean b;
    public final g9e0 c;
    public final g9e0 d;
    public final g9e0 e;
    public final g9e0 f;
    public final bpn0 g;

    /* compiled from: AvatarPlaceholderFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Peer.Type.values().length];
            try {
                iArr[Peer.Type.UNKNOWN.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Peer.Type.CONTACT.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Peer.Type.GROUP.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public b(Context context, boolean z) {
        this.a = context;
        this.b = z;
        g9e0 g9e0Var = new g9e0(new yc(this, 7));
        this.c = g9e0Var;
        this.d = g9e0Var;
        g9e0 g9e0Var2 = new g9e0(new j1(this, 8));
        this.e = g9e0Var2;
        this.f = g9e0Var2;
        this.g = new bpn0(new hd(this, 6));
    }

    public final Drawable a(Drawable drawable) {
        if (drawable.equals(f())) {
            this.c.d();
            return f();
        }
        if (!drawable.equals(b())) {
            return drawable;
        }
        this.e.d();
        return b();
    }

    public final Drawable b() {
        qcy<Object> qcyVar = h[1];
        return (Drawable) this.f.b();
    }

    public final Drawable c(ChatSettings chatSettings, long j, DialogTheme dialogTheme) {
        boolean isEmpty = chatSettings.c.b.isEmpty();
        String str = chatSettings.b;
        Integer valueOf = chatSettings.g ? Integer.valueOf(c4g0.t(dialogTheme)) : null;
        com.vk.im.ui.views.avatars.a aVar = this.b ? (com.vk.im.ui.views.avatars.a) this.g.getValue() : new com.vk.im.ui.views.avatars.a(this.a, null, 6);
        if (!isEmpty) {
            return f();
        }
        aVar.b(j, str, valueOf);
        return aVar;
    }

    public final Drawable d(qtd0 qtd0Var) {
        return e(qtd0Var.name(), qtd0Var.t8());
    }

    public final Drawable e(String str, Peer.Type type) {
        com.vk.im.ui.views.avatars.a aVar = this.b ? (com.vk.im.ui.views.avatars.a) this.g.getValue() : new com.vk.im.ui.views.avatars.a(this.a, null, 6);
        int i = a.$EnumSwitchMapping$0[type.ordinal()];
        if (i == 1) {
            aVar.c(str, type);
            return aVar;
        }
        if (i != 2) {
            return i != 3 ? f() : b();
        }
        aVar.c(str, type);
        return aVar;
    }

    public final Drawable f() {
        qcy<Object> qcyVar = h[0];
        return (Drawable) this.d.b();
    }
}
