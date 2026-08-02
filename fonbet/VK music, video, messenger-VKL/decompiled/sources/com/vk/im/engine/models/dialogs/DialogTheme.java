package com.vk.im.engine.models.dialogs;

import android.os.Parcelable;
import com.vk.core.serialize.Serializer;
import com.vk.core.ui.themes.VKTheme;
import com.vk.dto.common.DialogBackground;
import com.vk.im.engine.models.dialogs.c;
import io.reactivex.rxjava3.internal.operators.mixed.n;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import java.util.concurrent.CopyOnWriteArraySet;
import xsna.bpn0;
import xsna.epx;
import xsna.jgp;
import xsna.knf;
import xsna.uy2;
import xsna.v11;
import xsna.zcl;

/* compiled from: DialogTheme.kt */
/* loaded from: classes.dex */
public final class DialogTheme extends Serializer.StreamParcelableAdapter {
    public static uy2 f;
    public final c b;
    public final DialogBackground c;
    public final Map<VKTheme, DialogThemeImpl> d;
    public final String e;
    public static final bpn0 g = new bpn0(new knf(5));
    public static final Serializer.c<DialogTheme> CREATOR = new b();

    /* compiled from: DialogTheme.kt */
    public static final class a {
        public static DialogTheme a() {
            return (DialogTheme) DialogTheme.g.getValue();
        }
    }

    /* compiled from: Serializer.kt */
    public static final class b extends Serializer.c<DialogTheme> {
        @Override // com.vk.core.serialize.Serializer.c
        public final DialogTheme a(Serializer serializer) {
            Map map;
            CopyOnWriteArraySet copyOnWriteArraySet = c.b;
            c a = c.a.a(serializer.H());
            DialogBackground dialogBackground = (DialogBackground) serializer.A(DialogBackground.class.getClassLoader());
            if (dialogBackground == null) {
                dialogBackground = DialogBackground.e;
            }
            HashMap<ClassLoader, HashMap<String, Serializer.c<?>>> hashMap = Serializer.a;
            try {
                int u = serializer.u();
                if (u >= 0) {
                    map = new LinkedHashMap();
                    for (int i = 0; i < u; i++) {
                        VKTheme vKTheme = (VKTheme) serializer.G(VKTheme.class.getClassLoader());
                        DialogThemeImpl dialogThemeImpl = (DialogThemeImpl) serializer.G(DialogThemeImpl.class.getClassLoader());
                        if (vKTheme != null && dialogThemeImpl != null) {
                            map.put(vKTheme, dialogThemeImpl);
                        }
                    }
                } else {
                    map = jgp.b;
                }
                return new DialogTheme(a, dialogBackground, map, serializer.H());
            } finally {
            }
        }

        @Override // android.os.Parcelable.Creator
        public final Object[] newArray(int i) {
            return new DialogTheme[i];
        }
    }

    /* JADX WARN: Illegal instructions before constructor call */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
    */
    public DialogTheme(c cVar, DialogBackground dialogBackground, Map map, String str, int i, zcl zclVar) {
        this(cVar, dialogBackground, map, (i & 8) != 0 ? null : str);
        if ((i & 2) != 0) {
            Parcelable.Creator<DialogBackground> creator = DialogBackground.CREATOR;
            dialogBackground = DialogBackground.e;
        }
    }

    public static DialogTheme zb(DialogTheme dialogTheme, c cVar, DialogBackground dialogBackground, Map map, String str, int i) {
        if ((i & 1) != 0) {
            cVar = dialogTheme.b;
        }
        if ((i & 2) != 0) {
            dialogBackground = dialogTheme.c;
        }
        if ((i & 4) != 0) {
            map = dialogTheme.d;
        }
        if ((i & 8) != 0) {
            str = dialogTheme.e;
        }
        dialogTheme.getClass();
        return new DialogTheme(cVar, dialogBackground, map, str);
    }

    public final BubbleColors Ab(VKTheme vKTheme, long j, boolean z) {
        DialogThemeImpl dialogThemeImpl = this.d.get(vKTheme);
        if (dialogThemeImpl != null) {
            return dialogThemeImpl.Ab(j, z);
        }
        throw new IllegalArgumentException("Required value was null.");
    }

    @Override // com.vk.core.serialize.Serializer.StreamParcelable
    public final void O7(Serializer serializer) {
        serializer.j0(this.b.a);
        serializer.e0(this.c);
        Map<VKTheme, DialogThemeImpl> map = this.d;
        if (map == null) {
            serializer.S(-1);
        } else {
            Iterator c = n.c(serializer, map);
            while (c.hasNext()) {
                Map.Entry entry = (Map.Entry) c.next();
                serializer.i0((VKTheme) entry.getKey());
                serializer.i0((DialogThemeImpl) entry.getValue());
            }
        }
        serializer.j0(String.valueOf(this.e));
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (!(obj instanceof DialogTheme)) {
            return false;
        }
        DialogTheme dialogTheme = (DialogTheme) obj;
        return epx.f(this.b, dialogTheme.b) && epx.f(this.c, dialogTheme.c) && epx.f(this.d, dialogTheme.d) && epx.f(this.e, dialogTheme.e);
    }

    public final int hashCode() {
        int a2 = v11.a((this.c.hashCode() + (this.b.a.hashCode() * 31)) * 31, 31, this.d);
        String str = this.e;
        return a2 + (str == null ? 0 : str.hashCode());
    }

    public final String toString() {
        return "DialogTheme(" + this.b + ')';
    }

    public DialogTheme(c cVar, DialogBackground dialogBackground, Map<VKTheme, DialogThemeImpl> map, String str) {
        this.b = cVar;
        this.c = dialogBackground;
        this.d = map;
        this.e = str;
    }
}
