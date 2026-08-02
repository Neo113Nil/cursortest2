package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;

/* renamed from: com.ironsource.ef, reason: case insensitive filesystem */
/* loaded from: classes6.dex */
public enum EnumC2406ef {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);

    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.ef$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        public final EnumC2406ef a(int i) {
            EnumC2406ef enumC2406ef;
            EnumC2406ef[] values = EnumC2406ef.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC2406ef = null;
                    break;
                }
                enumC2406ef = values[i2];
                if (enumC2406ef.a == i) {
                    break;
                }
                i2++;
            }
            return enumC2406ef == null ? EnumC2406ef.CurrentlyLoadedAds : enumC2406ef;
        }

        private a() {
        }
    }

    EnumC2406ef(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
