package com.vk.clips.upload.ui.api.entities.cell;

import java.util.List;
import xsna.asp;
import xsna.dh5;
import xsna.f26;
import xsna.fna;
import xsna.jai;
import xsna.pdf;
import xsna.rkp;
import xsna.tlo0;
import xsna.zrp;

/* compiled from: ClipUploadItem.kt */
/* loaded from: classes17.dex */
public interface ClipUploadItem {

    /* compiled from: ClipUploadItem.kt */
    public interface Cell extends ClipUploadItem {

        /* compiled from: ClipUploadItem.kt */
        public interface Default extends Cell {

            /* compiled from: ClipUploadItem.kt */
            public static final class PostToWall implements Default {

                /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
                /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
                /* compiled from: ClipUploadItem.kt */
                public static final class Mode {
                    private static final /* synthetic */ zrp $ENTRIES;
                    private static final /* synthetic */ Mode[] $VALUES;
                    public static final Mode MAIN_TAB;
                    public static final Mode WALL;

                    static {
                        Mode mode = new Mode("WALL", 0);
                        WALL = mode;
                        Mode mode2 = new Mode("MAIN_TAB", 1);
                        MAIN_TAB = mode2;
                        Mode[] modeArr = {mode, mode2};
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
            }

            /* compiled from: ClipUploadItem.kt */
            public static final class a implements Default {
                public final boolean a;

                public a(boolean z) {
                    this.a = z;
                }
            }

            /* compiled from: ClipUploadItem.kt */
            public static final class b implements Default {
                public final boolean a;

                public b(boolean z) {
                    this.a = z;
                }
            }

            /* compiled from: ClipUploadItem.kt */
            public static final class c implements Default {
                public final boolean a;

                public c(boolean z) {
                    this.a = z;
                }
            }

            /* compiled from: ClipUploadItem.kt */
            public static final class d implements Default {
                public final boolean a;

                public d(boolean z) {
                    this.a = z;
                }
            }

            /* compiled from: ClipUploadItem.kt */
            public static final class e implements Default {
                public final Long a;
                public final boolean b;
                public final dh5 c;

                public e(Long l, boolean z, dh5 dh5Var) {
                    this.a = l;
                    this.b = z;
                    this.c = dh5Var;
                }
            }

            /* compiled from: ClipUploadItem.kt */
            public static final class f implements Default {
            }
        }

        /* compiled from: ClipUploadItem.kt */
        public interface a extends Cell {
            tlo0 a();

            String b();

            int c();

            rkp d();

            List<pdf> e();

            fna getIcon();

            tlo0 getTitle();

            tlo0 getTooltipText();

            boolean isEnabled();
        }
    }

    /* compiled from: ClipUploadItem.kt */
    public interface a extends ClipUploadItem {

        /* compiled from: ClipUploadItem.kt */
        /* renamed from: com.vk.clips.upload.ui.api.entities.cell.ClipUploadItem$a$a, reason: collision with other inner class name */
        public interface InterfaceC0698a extends a {
            tlo0 a();

            String b();

            int f();

            tlo0 g();

            f26 getIcon();

            tlo0 getTitle();
        }
    }

    /* compiled from: ClipUploadItem.kt */
    public static final class b implements ClipUploadItem {
        public final int a;
        public final boolean b;
        public final jai c;

        public b(int i, jai jaiVar, boolean z) {
            this.a = i;
            this.b = z;
            this.c = jaiVar;
        }
    }
}
