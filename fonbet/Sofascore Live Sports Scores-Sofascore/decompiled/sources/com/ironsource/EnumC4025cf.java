package com.ironsource;

import kotlin.jvm.internal.DefaultConstructorMarker;
import org.jetbrains.annotations.NotNull;

/* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
/* renamed from: com.ironsource.cf, reason: case insensitive filesystem */
/* loaded from: classes4.dex */
public enum EnumC4025cf {
    Off(0),
    CurrentlyLoadedAds(1),
    CurrentlyLoadedAdsAndFullHistory(2);


    @NotNull
    public static final a b = new a(null);
    private final int a;

    EnumC4025cf(int i) {
        this.a = i;
    }

    public final int b() {
        return this.a;
    }

    /* compiled from: r8-map-id-820aebbf04e3f76f83859749e000e999e94bc7aa15ea120a09e9f3ed9aa09d5a */
    /* renamed from: com.ironsource.cf$a */
    public static final class a {
        public /* synthetic */ a(DefaultConstructorMarker defaultConstructorMarker) {
            this();
        }

        @NotNull
        public final EnumC4025cf a(int i) {
            EnumC4025cf enumC4025cf;
            EnumC4025cf[] values = EnumC4025cf.values();
            int length = values.length;
            int i2 = 0;
            while (true) {
                if (i2 >= length) {
                    enumC4025cf = null;
                    break;
                }
                enumC4025cf = values[i2];
                if (enumC4025cf.a == i) {
                    break;
                }
                i2++;
            }
            return enumC4025cf == null ? EnumC4025cf.CurrentlyLoadedAds : enumC4025cf;
        }

        private a() {
        }
    }
}
