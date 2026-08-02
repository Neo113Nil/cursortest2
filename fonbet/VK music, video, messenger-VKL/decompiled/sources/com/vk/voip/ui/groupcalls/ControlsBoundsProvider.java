package com.vk.voip.ui.groupcalls;

import xsna.asp;
import xsna.zrp;

/* compiled from: ControlsBoundsProvider.kt */
/* loaded from: classes7.dex */
public interface ControlsBoundsProvider {
    public static final a c7 = a.a;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: ControlsBoundsProvider.kt */
    public static final class Gravity {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Gravity[] $VALUES;
        public static final Gravity CENTER;
        public static final Gravity LEFT;

        static {
            Gravity gravity = new Gravity("CENTER", 0);
            CENTER = gravity;
            Gravity gravity2 = new Gravity("LEFT", 1);
            LEFT = gravity2;
            Gravity[] gravityArr = {gravity, gravity2};
            $VALUES = gravityArr;
            $ENTRIES = new asp(gravityArr);
        }

        public Gravity() {
            throw null;
        }

        public static Gravity valueOf(String str) {
            return (Gravity) Enum.valueOf(Gravity.class, str);
        }

        public static Gravity[] values() {
            return (Gravity[]) $VALUES.clone();
        }
    }

    /* compiled from: ControlsBoundsProvider.kt */
    public static final class a {
        public static final /* synthetic */ a a = new a();
        public static final C2052a b = new C2052a();

        /* compiled from: ControlsBoundsProvider.kt */
        /* renamed from: com.vk.voip.ui.groupcalls.ControlsBoundsProvider$a$a, reason: collision with other inner class name */
        public static final class C2052a implements ControlsBoundsProvider {
            @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
            public final int getBottomOffset() {
                return 0;
            }

            @Override // com.vk.voip.ui.groupcalls.ControlsBoundsProvider
            public final int getTopOffset() {
                return 0;
            }
        }
    }

    int getBottomOffset();

    int getTopOffset();
}
