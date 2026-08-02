package com.vk.catalog2.common.dto.api.search;

import com.vk.catalog2.common.dto.api.SearchRequestFactory;
import com.vk.catalog2.common.dto.api.search.CatalogGetSearchAll;
import io.reactivex.rxjava3.core.q;
import kotlin.NoWhenBranchMatchedException;
import xsna.asp;
import xsna.ozl;
import xsna.rsg0;
import xsna.wba;
import xsna.zrp;

/* compiled from: CatalogGetSearchAllRequestFactory.kt */
@ozl
/* loaded from: classes16.dex */
public final class CatalogGetSearchAllRequestFactory extends SearchRequestFactory {
    public final boolean p;
    public final Mode q;
    public final String r;
    public CatalogGetSearchAll.EntryMethod s;

    /* JADX WARN: Failed to restore enum class, 'enum' modifier and super class removed */
    /* JADX WARN: Unknown enum class pattern. Please report as an issue! */
    /* compiled from: CatalogGetSearchAllRequestFactory.kt */
    public static final class Mode {
        private static final /* synthetic */ zrp $ENTRIES;
        private static final /* synthetic */ Mode[] $VALUES;
        public static final Mode All;
        public static final Mode Clips;
        public static final Mode Videos;

        static {
            Mode mode = new Mode("All", 0);
            All = mode;
            Mode mode2 = new Mode("Videos", 1);
            Videos = mode2;
            Mode mode3 = new Mode("Clips", 2);
            Clips = mode3;
            Mode[] modeArr = {mode, mode2, mode3};
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

    /* compiled from: CatalogGetSearchAllRequestFactory.kt */
    public static final /* synthetic */ class a {
        public static final /* synthetic */ int[] $EnumSwitchMapping$0;

        static {
            int[] iArr = new int[Mode.values().length];
            try {
                iArr[Mode.All.ordinal()] = 1;
            } catch (NoSuchFieldError unused) {
            }
            try {
                iArr[Mode.Videos.ordinal()] = 2;
            } catch (NoSuchFieldError unused2) {
            }
            try {
                iArr[Mode.Clips.ordinal()] = 3;
            } catch (NoSuchFieldError unused3) {
            }
            $EnumSwitchMapping$0 = iArr;
        }
    }

    /* JADX WARN: 'super' call moved to the top of the method (can break code semantics) */
    public CatalogGetSearchAllRequestFactory(wba wbaVar, boolean z, String str) {
        super(wbaVar, (SearchRequestFactory.a) null, 6);
        Mode mode = Mode.All;
        this.p = z;
        this.q = mode;
        this.r = str;
        this.s = CatalogGetSearchAll.EntryMethod.Unknown;
    }

    @Override // com.vk.catalog2.common.dto.api.SearchRequestFactory
    public final q i(String str, boolean z) {
        int i = a.$EnumSwitchMapping$0[this.q.ordinal()];
        if (i == 1) {
            return rsg0.y0(new CatalogGetSearchAll(this.c, str, null, this.p, z, this.s, this.k, this.r), null, null, 3);
        }
        if (i == 2) {
            return rsg0.y0(new CatalogGetSearchAll(this.c, str, "video", this.p, z, this.k), null, null, 3);
        }
        if (i != 3) {
            throw new NoWhenBranchMatchedException();
        }
        return rsg0.y0(new CatalogGetSearchAll(this.c, str, "clips", this.p, z, this.k), null, null, 3);
    }
}
