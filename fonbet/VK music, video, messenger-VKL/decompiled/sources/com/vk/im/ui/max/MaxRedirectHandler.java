package com.vk.im.ui.max;

import xsna.asp;
import xsna.zrp;

/* compiled from: MaxRedirectHandler.kt */
/* loaded from: classes2.dex */
public interface MaxRedirectHandler {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: MaxRedirectHandler.kt */
    public static final class Entrypoint {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Entrypoint[] $VALUES;
        public static final Entrypoint Calls;
        public static final Entrypoint Install;

        static {
            Entrypoint entrypoint = new Entrypoint("Install", 0);
            Install = entrypoint;
            Entrypoint entrypoint2 = new Entrypoint("Calls", 1);
            Calls = entrypoint2;
            Entrypoint[] entrypointArr = {entrypoint, entrypoint2};
            $VALUES = entrypointArr;
            $ENTRIES = new asp(entrypointArr);
        }

        public Entrypoint() {
            throw null;
        }

        public static Entrypoint valueOf(String str) {
            return (Entrypoint) Enum.valueOf(Entrypoint.class, str);
        }

        public static Entrypoint[] values() {
            return (Entrypoint[]) $VALUES.clone();
        }
    }

    void a(Entrypoint entrypoint);

    boolean b();

    boolean c();
}
