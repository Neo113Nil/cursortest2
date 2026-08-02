package com.ironsource;

import xsna.zcl;

/* renamed from: com.ironsource.ef, reason: case insensitive filesystem */
/* loaded from: classes13.dex */
public enum EnumC4302ef {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);

    public static final a b = new a(null);
    private final int a;

    /* renamed from: com.ironsource.ef$a */
    public static final class a {
        public /* synthetic */ a(zcl zclVar) {
            this();
        }

        public final EnumC4302ef a(int i) {
            EnumC4302ef enumC4302ef;
            EnumC4302ef[] values = EnumC4302ef.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4302ef = null;
                    break;
                }
                enumC4302ef = values[i2];
                if (enumC4302ef.a == i) {
                    break;
                }
                i2++;
            }
            return enumC4302ef == null ? EnumC4302ef.CurrentlyLoadedAds : enumC4302ef;
        }

        private a() {
        }
    }

    EnumC4302ef(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }
}
