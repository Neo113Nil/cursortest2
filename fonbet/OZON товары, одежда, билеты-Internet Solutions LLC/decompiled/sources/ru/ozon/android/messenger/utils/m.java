package ru.ozon.android.messenger.utils;

import android.view.Window;
import androidx.lifecycle.AbstractC5434v;
import androidx.lifecycle.G;
import androidx.lifecycle.J;
import kotlin.jvm.internal.Intrinsics;
import org.jetbrains.annotations.NotNull;

/* loaded from: classes10.dex */
public final class m implements G {

    /* renamed from: a, reason: collision with root package name */
    @NotNull
    private final a f91964a;

    /* renamed from: b, reason: collision with root package name */
    @NotNull
    private final Window f91965b;

    /* renamed from: c, reason: collision with root package name */
    private Integer f91966c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    public static final class a {
        private static final /* synthetic */ Xc.a $ENTRIES;
        private static final /* synthetic */ a[] $VALUES;
        public static final a ADJUST_PAN;
        public static final a ADJUST_RESIZE;

        /* renamed from: ru.ozon.android.messenger.utils.m$a$a, reason: collision with other inner class name */
        public /* synthetic */ class C1726a {

            /* renamed from: a, reason: collision with root package name */
            public static final /* synthetic */ int[] f91967a;

            static {
                int[] iArr = new int[a.values().length];
                try {
                    iArr[a.ADJUST_PAN.ordinal()] = 1;
                } catch (NoSuchFieldError unused) {
                }
                try {
                    iArr[a.ADJUST_RESIZE.ordinal()] = 2;
                } catch (NoSuchFieldError unused2) {
                }
                f91967a = iArr;
            }
        }

        static {
            a aVar = new a("ADJUST_PAN", 0);
            ADJUST_PAN = aVar;
            a aVar2 = new a("ADJUST_RESIZE", 1);
            ADJUST_RESIZE = aVar2;
            a[] aVarArr = {aVar, aVar2};
            $VALUES = aVarArr;
            $ENTRIES = Xc.b.a(aVarArr);
        }

        private a() {
            throw null;
        }

        public static a valueOf(String str) {
            return (a) Enum.valueOf(a.class, str);
        }

        public static a[] values() {
            return (a[]) $VALUES.clone();
        }
    }

    public /* synthetic */ class b {

        /* renamed from: a, reason: collision with root package name */
        public static final /* synthetic */ int[] f91968a;

        static {
            int[] iArr = new int[AbstractC5434v.a.values().length];
            try {
                iArr[AbstractC5434v.a.ON_START.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[AbstractC5434v.a.ON_STOP.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            f91968a = iArr;
        }
    }

    public m(@NotNull a softInputMode, @NotNull Window window) {
        Intrinsics.checkNotNullParameter(softInputMode, "softInputMode");
        Intrinsics.checkNotNullParameter(window, "window");
        this.f91964a = softInputMode;
        this.f91965b = window;
    }

    @Override // androidx.lifecycle.G
    public final void onStateChanged(@NotNull J source, @NotNull AbstractC5434v.a event) {
        int i11;
        Integer num;
        Intrinsics.checkNotNullParameter(source, "source");
        Intrinsics.checkNotNullParameter(event, "event");
        int i12 = b.f91968a[event.ordinal()];
        Window window = this.f91965b;
        if (i12 != 1) {
            if (i12 == 2 && (num = this.f91966c) != null) {
                window.setSoftInputMode(num.intValue());
                return;
            }
            return;
        }
        this.f91966c = Integer.valueOf(window.getAttributes().softInputMode);
        a aVar = this.f91964a;
        aVar.getClass();
        int i13 = a.C1726a.f91967a[aVar.ordinal()];
        if (i13 == 1) {
            i11 = 32;
        } else {
            if (i13 != 2) {
                throw new Sc.o();
            }
            i11 = 16;
        }
        window.setSoftInputMode(i11 | 4);
    }
}
