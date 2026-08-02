package fi;

import kotlin.jvm.JvmField;
import kotlin.jvm.internal.ByteCompanionObject;
import kotlin.text.Typography;
import org.jetbrains.annotations.NotNull;

/* renamed from: fi.m, reason: case insensitive filesystem */
/* loaded from: classes5.dex */
public final class C4297m {

    @JvmField
    @NotNull
    public static final byte[] CHAR_TO_TOKEN;

    @JvmField
    @NotNull
    public static final char[] ESCAPE_2_CHAR;

    /* renamed from: a, reason: collision with root package name */
    public static final C4297m f46777a;

    static {
        C4297m c4297m = new C4297m();
        f46777a = c4297m;
        ESCAPE_2_CHAR = new char[117];
        CHAR_TO_TOKEN = new byte[126];
        c4297m.f();
        c4297m.e();
    }

    public final void a(char c10, char c11) {
        b(c10, c11);
    }

    public final void b(int i10, char c10) {
        if (c10 != 'u') {
            ESCAPE_2_CHAR[c10] = (char) i10;
        }
    }

    public final void c(char c10, byte b10) {
        d(c10, b10);
    }

    public final void d(int i10, byte b10) {
        CHAR_TO_TOKEN[i10] = b10;
    }

    public final void e() {
        for (int i10 = 0; i10 < 33; i10++) {
            d(i10, ByteCompanionObject.MAX_VALUE);
        }
        d(9, (byte) 3);
        d(10, (byte) 3);
        d(13, (byte) 3);
        d(32, (byte) 3);
        c(',', (byte) 4);
        c(':', (byte) 5);
        c('{', (byte) 6);
        c('}', (byte) 7);
        c('[', (byte) 8);
        c(']', (byte) 9);
        c(Typography.quote, (byte) 1);
        c('\\', (byte) 2);
    }

    public final void f() {
        for (int i10 = 0; i10 < 32; i10++) {
            b(i10, 'u');
        }
        b(8, 'b');
        b(9, 't');
        b(10, 'n');
        b(12, 'f');
        b(13, 'r');
        a('/', '/');
        a(Typography.quote, Typography.quote);
        a('\\', '\\');
    }
}
