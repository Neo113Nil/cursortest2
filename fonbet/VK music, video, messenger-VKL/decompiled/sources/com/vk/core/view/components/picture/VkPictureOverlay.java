package com.vk.core.view.components.picture;

import xsna.asp;
import xsna.cut0;
import xsna.dko;
import xsna.gko;
import xsna.x7g;
import xsna.zrp;

/* compiled from: VkPictureOverlay.kt */
/* loaded from: classes17.dex */
public final class VkPictureOverlay {
    public final gko a;
    public final x7g b;
    public final Tint c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: VkPictureOverlay.kt */
    public static final class Tint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Tint[] $VALUES;
        public static final Tint Dark;
        public static final Tint Light;
        public static final Tint MatchAppTheme;

        static {
            Tint tint = new Tint("Dark", 0);
            Dark = tint;
            Tint tint2 = new Tint("Light", 1);
            Light = tint2;
            Tint tint3 = new Tint("MatchAppTheme", 2);
            MatchAppTheme = tint3;
            Tint[] tintArr = {tint, tint2, tint3};
            $VALUES = tintArr;
            $ENTRIES = new asp(tintArr);
        }

        public Tint() {
            throw null;
        }

        public static Tint valueOf(String str) {
            return (Tint) Enum.valueOf(Tint.class, str);
        }

        public static Tint[] values() {
            return (Tint[]) $VALUES.clone();
        }
    }

    public VkPictureOverlay(int i, Integer num, Tint tint) {
        gko gkoVar = new gko(i);
        x7g x7gVar = num != null ? new x7g(num.intValue()) : null;
        this.a = gkoVar;
        this.b = x7gVar;
        this.c = tint;
    }

    public final dko a() {
        return this.a;
    }

    public final cut0 b() {
        return this.b;
    }

    public final Tint c() {
        return this.c;
    }
}
