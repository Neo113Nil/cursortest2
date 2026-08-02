package com.vk.libvideo.tooltips;

import android.graphics.Rect;
import android.view.View;
import com.vk.dto.hints.Hint;
import com.vk.dto.hints.HintId;
import java.util.Collection;
import java.util.Iterator;
import java.util.List;
import xsna.alj0;
import xsna.asp;
import xsna.bwt0;
import xsna.dhr0;
import xsna.epx;
import xsna.h7v;
import xsna.o7j0;
import xsna.pla;
import xsna.vkt0;
import xsna.vu5;
import xsna.zrp;
import xsna.zzs;

/* compiled from: VideoTooltip.kt */
/* loaded from: classes3.dex */
public final class VideoTooltip {
    public final View a;
    public final io.reactivex.rxjava3.disposables.b b = new io.reactivex.rxjava3.disposables.b();
    public final h7v c = pla.e().b();

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VideoTooltip.kt */
    public static final class Type {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Type[] $VALUES;
        public static final Type NOT_SCROLLABLE;
        public static final Type SCROLLABLE;

        static {
            Type type = new Type("SCROLLABLE", 0);
            SCROLLABLE = type;
            Type type2 = new Type("NOT_SCROLLABLE", 1);
            NOT_SCROLLABLE = type2;
            Type[] typeArr = {type, type2};
            $VALUES = typeArr;
            $ENTRIES = new asp(typeArr);
        }

        public Type() {
            throw null;
        }

        public static Type valueOf(String str) {
            return (Type) Enum.valueOf(Type.class, str);
        }

        public static Type[] values() {
            return (Type[]) $VALUES.clone();
        }
    }

    /* compiled from: VideoTooltip.kt */
    public static final class b {
        public final long a;
        public final Integer b;
        public final boolean c;
        public final c d;
        public final boolean e;
        public final Type f;
        public final zzs<Integer, Integer, Integer, Integer, Rect> g;

        public b(long j, Integer num, c cVar, Type type, zzs zzsVar, int i) {
            j = (i & 1) != 0 ? 350L : j;
            cVar = (i & 8) != 0 ? null : cVar;
            boolean z = (i & 16) != 0;
            type = (i & 32) != 0 ? Type.SCROLLABLE : type;
            zzsVar = (i & 64) != 0 ? null : zzsVar;
            this.a = j;
            this.b = num;
            this.c = true;
            this.d = cVar;
            this.e = z;
            this.f = type;
            this.g = zzsVar;
        }
    }

    /* compiled from: VideoTooltip.kt */
    public static final class c {
        public final int a;
        public final int b;

        public c(int i, int i2) {
            this.a = i;
            this.b = i2;
        }

        public final boolean equals(Object obj) {
            if (this == obj) {
                return true;
            }
            if (!(obj instanceof c)) {
                return false;
            }
            c cVar = (c) obj;
            return this.a == cVar.a && this.b == cVar.b;
        }

        public final int hashCode() {
            return Integer.hashCode(this.b) + (Integer.hashCode(this.a) * 31);
        }

        public final String toString() {
            StringBuilder sb = new StringBuilder("PointerMargins(leftMargin=");
            sb.append(this.a);
            sb.append(", topMargin=");
            return vu5.b(sb, this.b, ')');
        }
    }

    /* compiled from: VideoTooltip.kt */
    public static final /* synthetic */ class d {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Type.values().length];
            try {
                iArr[Type.SCROLLABLE.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Type.NOT_SCROLLABLE.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    public VideoTooltip(View view) {
        this.a = view;
    }

    public static Rect a(View view, b bVar) {
        Rect invoke;
        Rect C = bwt0.C(view);
        zzs<Integer, Integer, Integer, Integer, Rect> zzsVar = bVar.g;
        if (zzsVar != null && (invoke = zzsVar.invoke(Integer.valueOf(C.left), Integer.valueOf(C.right), Integer.valueOf(C.top), Integer.valueOf(C.bottom))) != null) {
            C = invoke;
        }
        c cVar = bVar.d;
        return new Rect(C.left, C.top, C.right + (cVar != null ? cVar.a : 0), C.bottom + (cVar != null ? cVar.b : 0));
    }

    public static void b(VideoTooltip videoTooltip, HintId hintId, a aVar, b bVar) {
        o7j0 o7j0Var = new o7j0(15);
        boolean c2 = dhr0.a.c(videoTooltip.a.getContext());
        View view = videoTooltip.a;
        List<Hint> g = videoTooltip.c.g();
        if (!(g instanceof Collection) || !g.isEmpty()) {
            Iterator<T> it = g.iterator();
            while (it.hasNext()) {
                if (epx.f(((Hint) it.next()).b, hintId.getId())) {
                    return;
                }
            }
        }
        if (view.getVisibility() == 0) {
            long j = bVar.a;
            vkt0 vkt0Var = new vkt0(videoTooltip, hintId, bVar, o7j0Var, c2, aVar);
            if (j == 0) {
                vkt0Var.invoke();
            } else {
                bwt0.i(view, j, new alj0(vkt0Var, 26), null);
            }
        }
    }

    /* compiled from: VideoTooltip.kt */
    public interface a {
        default void a() {
        }

        default void onClick() {
        }
    }
}
