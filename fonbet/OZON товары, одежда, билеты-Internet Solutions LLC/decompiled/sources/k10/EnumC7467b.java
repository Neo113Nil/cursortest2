package k10;

import Sc.InterfaceC4008j;
import Sc.k;
import ci0.InterfaceC5837b;
import kotlin.jvm.functions.Function0;
import kotlin.text.h;
import org.jetbrains.annotations.NotNull;

/* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
/* JADX WARN: Unknown enum class pattern. Please report as an issue! */
/* renamed from: k10.b, reason: case insensitive filesystem */
/* loaded from: classes7.dex */
public class EnumC7467b implements InterfaceC5837b {
    private static final /* synthetic */ Xc.a $ENTRIES;
    private static final /* synthetic */ EnumC7467b[] $VALUES;
    public static final EnumC7467b ADDITIONAL_REQUEST_TIME_END;
    public static final EnumC7467b ADDITIONAL_REQUEST_TIME_START;
    public static final EnumC7467b CACHE_TIME;
    public static final EnumC7467b COMPOSER_REQUEST_PREPARE_TIME_END;
    public static final EnumC7467b COMPOSER_REQUEST_PREPARE_TIME_START;
    public static final EnumC7467b DECODING_TIME_END;
    public static final EnumC7467b DECODING_TIME_START;
    public static final EnumC7467b LAYOUT_TIME_END;
    public static final EnumC7467b LAYOUT_TIME_START;
    public static final EnumC7467b LOADER_TIME_END;
    public static final EnumC7467b LOADER_TIME_START;
    public static final EnumC7467b NETWORK_ADDITIONAL_REQUEST_TIME_END;
    public static final EnumC7467b NETWORK_ADDITIONAL_REQUEST_TIME_START;
    public static final EnumC7467b NETWORK_CALL_END;
    public static final EnumC7467b NETWORK_REQUEST_PREPARE_TIME_END;
    public static final EnumC7467b NETWORK_REQUEST_PREPARE_TIME_START;
    public static final EnumC7467b PREFETCH_TIME;
    public static final EnumC7467b PREPARE_PAGE_TIME;
    public static final EnumC7467b PREPARE_PRESENTATION_DATA_TIME_END;
    public static final EnumC7467b PREPARE_PRESENTATION_DATA_TIME_START;
    public static final EnumC7467b REDIRECT_TIME_END;
    public static final EnumC7467b REDIRECT_TIME_START;
    public static final EnumC7467b SCREEN_CREATE_TIME;
    public static final EnumC7467b TOTAL_TIME_END;
    public static final EnumC7467b TOTAL_TIME_START;
    private final boolean isInterval = true;

    @NotNull
    private final InterfaceC4008j metricName$delegate = k.b(new Function0() { // from class: k10.a
        @Override // kotlin.jvm.functions.Function0
        public final Object invoke() {
            EnumC7467b enumC7467b = EnumC7467b.this;
            boolean a11 = enumC7467b.a();
            String name = enumC7467b.name();
            return a11 ? h.U(h.U(name, "_END"), "_START") : name;
        }
    });

    /* renamed from: k10.b$a */
    static final class a extends EnumC7467b {
        private final boolean isInterval;

        @Override // k10.EnumC7467b
        public final boolean a() {
            return this.isInterval;
        }
    }

    /* renamed from: k10.b$b, reason: collision with other inner class name */
    static final class C1152b extends EnumC7467b {
        private final boolean isInterval;

        @Override // k10.EnumC7467b
        public final boolean a() {
            return this.isInterval;
        }
    }

    /* renamed from: k10.b$c */
    static final class c extends EnumC7467b {
        @Override // k10.EnumC7467b
        public final boolean a() {
            return false;
        }
    }

    /* renamed from: k10.b$d */
    static final class d extends EnumC7467b {
        @Override // k10.EnumC7467b
        public final boolean a() {
            return false;
        }
    }

    static {
        EnumC7467b enumC7467b = new EnumC7467b("TOTAL_TIME_START", 0);
        TOTAL_TIME_START = enumC7467b;
        EnumC7467b enumC7467b2 = new EnumC7467b("TOTAL_TIME_END", 1);
        TOTAL_TIME_END = enumC7467b2;
        d dVar = new d("SCREEN_CREATE_TIME", 2);
        SCREEN_CREATE_TIME = dVar;
        c cVar = new c("PREPARE_PAGE_TIME", 3);
        PREPARE_PAGE_TIME = cVar;
        EnumC7467b enumC7467b3 = new EnumC7467b("REDIRECT_TIME_START", 4);
        REDIRECT_TIME_START = enumC7467b3;
        EnumC7467b enumC7467b4 = new EnumC7467b("REDIRECT_TIME_END", 5);
        REDIRECT_TIME_END = enumC7467b4;
        EnumC7467b enumC7467b5 = new EnumC7467b("ADDITIONAL_REQUEST_TIME_START", 6);
        ADDITIONAL_REQUEST_TIME_START = enumC7467b5;
        EnumC7467b enumC7467b6 = new EnumC7467b("ADDITIONAL_REQUEST_TIME_END", 7);
        ADDITIONAL_REQUEST_TIME_END = enumC7467b6;
        EnumC7467b enumC7467b7 = new EnumC7467b("COMPOSER_REQUEST_PREPARE_TIME_START", 8);
        COMPOSER_REQUEST_PREPARE_TIME_START = enumC7467b7;
        EnumC7467b enumC7467b8 = new EnumC7467b("COMPOSER_REQUEST_PREPARE_TIME_END", 9);
        COMPOSER_REQUEST_PREPARE_TIME_END = enumC7467b8;
        EnumC7467b enumC7467b9 = new EnumC7467b("DECODING_TIME_START", 10);
        DECODING_TIME_START = enumC7467b9;
        EnumC7467b enumC7467b10 = new EnumC7467b("DECODING_TIME_END", 11);
        DECODING_TIME_END = enumC7467b10;
        EnumC7467b enumC7467b11 = new EnumC7467b("PREPARE_PRESENTATION_DATA_TIME_START", 12);
        PREPARE_PRESENTATION_DATA_TIME_START = enumC7467b11;
        EnumC7467b enumC7467b12 = new EnumC7467b("PREPARE_PRESENTATION_DATA_TIME_END", 13);
        PREPARE_PRESENTATION_DATA_TIME_END = enumC7467b12;
        EnumC7467b enumC7467b13 = new EnumC7467b("LAYOUT_TIME_START", 14);
        LAYOUT_TIME_START = enumC7467b13;
        EnumC7467b enumC7467b14 = new EnumC7467b("LAYOUT_TIME_END", 15);
        LAYOUT_TIME_END = enumC7467b14;
        EnumC7467b enumC7467b15 = new EnumC7467b("LOADER_TIME_START", 16);
        LOADER_TIME_START = enumC7467b15;
        EnumC7467b enumC7467b16 = new EnumC7467b("LOADER_TIME_END", 17);
        LOADER_TIME_END = enumC7467b16;
        EnumC7467b enumC7467b17 = new EnumC7467b("NETWORK_CALL_END", 18);
        NETWORK_CALL_END = enumC7467b17;
        EnumC7467b enumC7467b18 = new EnumC7467b("NETWORK_REQUEST_PREPARE_TIME_START", 19);
        NETWORK_REQUEST_PREPARE_TIME_START = enumC7467b18;
        EnumC7467b enumC7467b19 = new EnumC7467b("NETWORK_REQUEST_PREPARE_TIME_END", 20);
        NETWORK_REQUEST_PREPARE_TIME_END = enumC7467b19;
        EnumC7467b enumC7467b20 = new EnumC7467b("NETWORK_ADDITIONAL_REQUEST_TIME_START", 21);
        NETWORK_ADDITIONAL_REQUEST_TIME_START = enumC7467b20;
        EnumC7467b enumC7467b21 = new EnumC7467b("NETWORK_ADDITIONAL_REQUEST_TIME_END", 22);
        NETWORK_ADDITIONAL_REQUEST_TIME_END = enumC7467b21;
        a aVar = new a("CACHE_TIME", 23);
        CACHE_TIME = aVar;
        C1152b c1152b = new C1152b("PREFETCH_TIME", 24);
        PREFETCH_TIME = c1152b;
        EnumC7467b[] enumC7467bArr = {enumC7467b, enumC7467b2, dVar, cVar, enumC7467b3, enumC7467b4, enumC7467b5, enumC7467b6, enumC7467b7, enumC7467b8, enumC7467b9, enumC7467b10, enumC7467b11, enumC7467b12, enumC7467b13, enumC7467b14, enumC7467b15, enumC7467b16, enumC7467b17, enumC7467b18, enumC7467b19, enumC7467b20, enumC7467b21, aVar, c1152b};
        $VALUES = enumC7467bArr;
        $ENTRIES = Xc.b.a(enumC7467bArr);
    }

    private EnumC7467b(String str, int i11) {
    }

    public static EnumC7467b valueOf(String str) {
        return (EnumC7467b) Enum.valueOf(EnumC7467b.class, str);
    }

    public static EnumC7467b[] values() {
        return (EnumC7467b[]) $VALUES.clone();
    }

    public boolean a() {
        return this.isInterval;
    }

    @Override // ci0.InterfaceC5837b
    public final /* bridge */ /* synthetic */ String getName() {
        return name();
    }
}
