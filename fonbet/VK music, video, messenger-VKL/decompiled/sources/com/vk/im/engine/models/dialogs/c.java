package com.vk.im.engine.models.dialogs;

import com.unity3d.ads.BuildConfig;
import java.util.Iterator;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.epx;
import xsna.ho8;

/* compiled from: DialogThemeName.kt */
/* loaded from: classes.dex */
public abstract class c {
    public static final CopyOnWriteArraySet b = new CopyOnWriteArraySet();
    public final String a;

    /* compiled from: DialogThemeName.kt */
    public static final class a {
        public static c a(String str) {
            Object obj;
            Iterator it = c.b.iterator();
            while (true) {
                if (!it.hasNext()) {
                    obj = null;
                    break;
                }
                obj = it.next();
                if (epx.f(((c) obj).a, str)) {
                    break;
                }
            }
            c cVar = (c) obj;
            return cVar == null ? str.length() == 0 ? C1124c.c : new b(str) : cVar;
        }
    }

    /* compiled from: DialogThemeName.kt */
    /* loaded from: classes2.dex */
    public static final class b extends c {
        public b(String str) {
            super(str);
        }

        @Override // com.vk.im.engine.models.dialogs.c
        public final String toString() {
            return ho8.a(new StringBuilder("DialogThemeId.Custom("), this.a, ')');
        }
    }

    /* compiled from: DialogThemeName.kt */
    /* renamed from: com.vk.im.engine.models.dialogs.c$c, reason: collision with other inner class name */
    public static final class C1124c extends c {
        public static final C1124c c = new C1124c(BuildConfig.FLAVOR);
    }

    /* compiled from: DialogThemeName.kt */
    public static final class d extends c {
        public static final /* synthetic */ int c = 0;

        static {
            new d("orange");
        }
    }

    /* compiled from: DialogThemeName.kt */
    public static final class e extends c {
        public static final /* synthetic */ int c = 0;

        static {
            new e("pink");
        }
    }

    /* compiled from: DialogThemeName.kt */
    public static final class f extends c {
        public static final /* synthetic */ int c = 0;

        static {
            new f("purple");
        }
    }

    /* compiled from: DialogThemeName.kt */
    public static final class g extends c {
        public static final g c = new g("mable");

        @Override // com.vk.im.engine.models.dialogs.c
        public final boolean a() {
            return true;
        }
    }

    /* compiled from: DialogThemeName.kt */
    public static final class h extends c {
        public static final h c = new h("custom");

        @Override // com.vk.im.engine.models.dialogs.c
        public final boolean a() {
            return true;
        }

        @Override // com.vk.im.engine.models.dialogs.c
        public final String toString() {
            return "DialogThemeId.UserDefined";
        }
    }

    static {
        g gVar = g.c;
        C1124c c1124c = C1124c.c;
        int i = f.c;
        int i2 = d.c;
        int i3 = e.c;
        h hVar = h.c;
    }

    public c(String str) {
        this.a = str;
        b.add(this);
    }

    public boolean a() {
        return this instanceof b;
    }

    public final boolean equals(Object obj) {
        c cVar = obj instanceof c ? (c) obj : null;
        if (cVar != null) {
            return epx.f(this.a, cVar.a);
        }
        return false;
    }

    public final int hashCode() {
        return this.a.hashCode();
    }

    public String toString() {
        return "ThemeId." + this.a;
    }
}
