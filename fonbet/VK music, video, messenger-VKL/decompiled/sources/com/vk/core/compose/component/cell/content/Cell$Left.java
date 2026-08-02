package com.vk.core.compose.component.cell.content;

import androidx.compose.runtime.a;
import xsna.asp;
import xsna.jai;
import xsna.q630;
import xsna.spg0;
import xsna.zak0;
import xsna.zrp;

/* compiled from: Cell.kt */
/* loaded from: classes17.dex */
public interface Cell$Left {

    /* compiled from: Cell.kt */
    public interface Main extends Cell$Left {

        /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
        /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
        /* compiled from: Cell.kt */
        public static final class Size {
            private static final /* synthetic */ zrp $ENTRIES;
            private static final /* synthetic */ Size[] $VALUES;
            public static final Size Large;
            public static final Size Medium;
            public static final Size Small;

            static {
                Size size = new Size("Small", 0);
                Small = size;
                Size size2 = new Size("Medium", 1);
                Medium = size2;
                Size size3 = new Size("Large", 2);
                Large = size3;
                Size[] sizeArr = {size, size2, size3};
                $VALUES = sizeArr;
                $ENTRIES = new asp(sizeArr);
            }

            public Size() {
                throw null;
            }

            public static Size valueOf(String str) {
                return (Size) Enum.valueOf(Size.class, str);
            }

            public static Size[] values() {
                return (Size[]) $VALUES.clone();
            }
        }

        /* compiled from: Cell.kt */
        public interface a extends Main {

            /* compiled from: Cell.kt */
            /* renamed from: com.vk.core.compose.component.cell.content.Cell$Left$Main$a$a, reason: collision with other inner class name */
            public static final class C0731a {
                public static j0 a(jai jaiVar, androidx.compose.runtime.a aVar) {
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(494490720, 54, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Main.Custom.Companion.invoke (Cell.kt:233)");
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.f(-1458446961, 54, -1, "com.vk.core.compose.component.cell.content.remember (LeftMainCustomImpl.kt:26)");
                    }
                    Object x = aVar.x();
                    if (x == a.C0011a.a) {
                        x = new j0(jaiVar);
                        aVar.R(x);
                    }
                    j0 j0Var = (j0) x;
                    ((zak0) j0Var.a).setValue(jaiVar);
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    if (androidx.compose.runtime.b.d()) {
                        androidx.compose.runtime.b.e();
                    }
                    return j0Var;
                }
            }
        }
    }

    /* compiled from: Cell.kt */
    public static final class a {
        public static i0 a(Main main, b bVar, androidx.compose.runtime.a aVar, int i) {
            if ((i & 2) != 0) {
                bVar = null;
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(-1629653990, 384, -1, "com.vk.core.compose.component.cell.content.Cell.Left.Companion.invoke (Cell.kt:48)");
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.f(926137193, 6, -1, "com.vk.core.compose.component.cell.content.remember (LeftImpl.kt:41)");
            }
            Object x = aVar.x();
            if (x == a.C0011a.a) {
                x = new i0(main, bVar);
                aVar.R(x);
            }
            i0 i0Var = (i0) x;
            ((zak0) i0Var.a).setValue(main);
            ((zak0) i0Var.b).setValue(bVar);
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            if (androidx.compose.runtime.b.d()) {
                androidx.compose.runtime.b.e();
            }
            return i0Var;
        }
    }

    /* compiled from: Cell.kt */
    public interface b {
        void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
    }

    void a(spg0 spg0Var, q630 q630Var, androidx.compose.runtime.a aVar, int i);
}
