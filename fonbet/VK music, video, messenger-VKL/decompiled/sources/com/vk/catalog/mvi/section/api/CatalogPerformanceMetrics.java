package com.vk.catalog.mvi.section.api;

import xsna.asp;
import xsna.mri;
import xsna.zrp;

/* compiled from: CatalogPerformanceMetrics.kt */
/* loaded from: classes16.dex */
public interface CatalogPerformanceMetrics {

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogPerformanceMetrics.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode ACTOR_START_ACTOR_FINISH;
        public static final Mode ACTOR_START_REPO_FINISH;
        public static final Mode REPO_MANAGED;

        static {
            Mode mode = new Mode("ACTOR_START_ACTOR_FINISH", 0);
            ACTOR_START_ACTOR_FINISH = mode;
            Mode mode2 = new Mode("ACTOR_START_REPO_FINISH", 1);
            ACTOR_START_REPO_FINISH = mode2;
            Mode mode3 = new Mode("REPO_MANAGED", 2);
            REPO_MANAGED = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
            $VALUES = modeArr;
            $ENTRIES = new asp(modeArr);
        }

        public Mode() {
            throw null;
        }

        public static Mode valueOf(String str) {
            return (Mode) Enum.valueOf(Mode.class, str);
        }

        public static Mode[] values() {
            return (Mode[]) $VALUES.clone();
        }
    }

    void a();

    void b(Mode mode);

    void c();

    void d();

    void e();

    void f();

    void g(mri mriVar);

    void h();

    void i();
}
