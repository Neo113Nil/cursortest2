package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.p9, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC4252p9 {
    NonBidder(1),
    Bidder(2),
    NotSupported(-1);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    EnumC4252p9(int i) {
        this.a = i;
    }

    public final boolean b(@NotNull EnumC4252p9 enumC4252p9) {
        enumC4252p9.getClass();
        return enumC4252p9.b() == this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.p9$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4252p9 a(int i) {
            EnumC4252p9 enumC4252p9;
            EnumC4252p9[] values = EnumC4252p9.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4252p9 = null;
                    break;
                }
                enumC4252p9 = values[i2];
                if (enumC4252p9.a == i) {
                    break;
                }
                i2++;
            }
            return enumC4252p9 == null ? EnumC4252p9.NotSupported : enumC4252p9;
        }

        private a() {
        }
    }

    public final int b() {
        return this.a;
    }
}
