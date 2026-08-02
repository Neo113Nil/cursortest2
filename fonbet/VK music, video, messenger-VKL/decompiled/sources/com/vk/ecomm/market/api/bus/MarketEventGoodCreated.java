package com.vk.ecomm.market.api.bus;

import com.huawei.hms.framework.network.grs.GrsBaseInfo;
import com.vk.dto.common.Good;
import com.vk.dto.common.id.UserId;
import xsna.asp;
import xsna.ay00;
import xsna.zrp;

/* compiled from: Events.kt */
/* loaded from: classes18.dex */
public final class MarketEventGoodCreated implements ay00 {
    public final Good a;
    public final Source b;
    public final UserId c;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: Events.kt */
    public static final class Source {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Source[] $VALUES;
        public static final Source CREATION_ONBOARDING_BLOCK;
        public static final a Companion;
        public static final Source UNKNOWN;
        private final String source;

        /* compiled from: Events.kt */
        public static final class a {
        }

        static {
            Source source = new Source("CREATION_ONBOARDING_BLOCK", 0, "creation_onboarding_block");
            CREATION_ONBOARDING_BLOCK = source;
            Source source2 = new Source(GrsBaseInfo.CountryCodeSource.UNKNOWN, 1, "unknown");
            UNKNOWN = source2;
            Source[] sourceArr = {source, source2};
            $VALUES = sourceArr;
            $ENTRIES = new asp(sourceArr);
            Companion = new a();
        }

        public Source(String str, int i, String str2) {
            this.source = str2;
        }

        public static zrp<Source> h() {
            return $ENTRIES;
        }

        public static Source valueOf(String str) {
            return (Source) Enum.valueOf(Source.class, str);
        }

        public static Source[] values() {
            return (Source[]) $VALUES.clone();
        }

        public final String i() {
            return this.source;
        }
    }

    public MarketEventGoodCreated(Good good, Source source) {
        this.a = good;
        this.b = source;
        this.c = good.c;
    }

    @Override // xsna.ay00
    public final UserId q() {
        return this.c;
    }
}
